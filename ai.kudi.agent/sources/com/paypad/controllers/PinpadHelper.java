package com.paypad.controllers;

import android.os.SystemClock;
import com.datecs.pinpad.C2396b;
import com.datecs.pinpad.PinpadException;
import com.paypad.exceptions.TransactionAbortedException;
import com.paypad.exceptions.TransactionCanceledException;
import com.paypad.exceptions.TransactionException;
import com.paypad.utils.StringUtils;
import java.io.IOException;
/* loaded from: classes2.dex */
public class PinpadHelper {
    public static final int CARD_MS = 1;
    public static final int CARD_NOT_PRESENT = 0;
    public static final int CARD_SC = 2;

    public static void beepAttention(C2396b c2396b) throws PinpadException, IOException {
        c2396b.m33070D0(2000, 250, 50);
        SystemClock.sleep(250L);
    }

    public static void beepFailure(C2396b c2396b) throws PinpadException, IOException {
        c2396b.m33070D0(2000, 100, 100);
        SystemClock.sleep(20L);
        c2396b.m33070D0(2000, 100, 100);
        SystemClock.sleep(20L);
        c2396b.m33070D0(2000, 100, 100);
        SystemClock.sleep(20L);
        c2396b.m33070D0(2000, 100, 100);
        SystemClock.sleep(20L);
        c2396b.m33070D0(2000, 100, 100);
        SystemClock.sleep(20L);
    }

    public static void beepSuccess(C2396b c2396b) throws PinpadException, IOException {
        c2396b.m33070D0(5300, 500, 50);
        SystemClock.sleep(500L);
    }

    public static final void clearScreen(C2396b c2396b) throws PinpadException, IOException {
        c2396b.m33064G0(false);
        c2396b.m33040S0(-1);
        c2396b.m33050N0(0);
    }

    public static final boolean confirm(C2396b c2396b, String str) throws PinpadException, IOException {
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001" + str);
        while (true) {
            int readKey = readKey(c2396b);
            if (readKey == 65) {
                return true;
            }
            if (readKey == 67) {
                return false;
            }
            SystemClock.sleep(100L);
        }
    }

    public static final void enterPin(C2396b c2396b, String str) throws PinpadException, IOException, TransactionCanceledException, TransactionAbortedException {
        final int[] iArr = {0};
        c2396b.m33056K0(0, 1, 20, '*', "AMT: N" + str + "\nEnter PIN:", new C2396b.InterfaceC2403f() { // from class: com.paypad.controllers.PinpadHelper.1
            @Override // com.datecs.pinpad.C2396b.InterfaceC2403f
            public void onPINEntryComplete(int i) {
                int[] iArr2 = iArr;
                iArr2[0] = i;
                synchronized (iArr2) {
                    iArr.notify();
                }
            }
        });
        synchronized (iArr) {
            try {
                iArr.wait();
            } catch (InterruptedException unused) {
            }
        }
        if (iArr[0] != 0) {
            int i = iArr[0];
            if (i == 9) {
                throw new TransactionCanceledException("PIN timeout");
            }
            if (i != 18) {
                throw new PinpadException(iArr[0]);
            }
            throw new TransactionCanceledException("PIN canceled");
        }
    }

    public static final void initScreen(C2396b c2396b) throws IOException, PinpadException {
        c2396b.m33048O0();
        c2396b.m33046P0(false);
        if (c2396b.m33026b0() > 32) {
            c2396b.m33044Q0(0, 0, 16, 4, 1, 0);
        } else {
            c2396b.m33044Q0(0, 0, 16, 2, 1, 0);
        }
    }

    public static final void invalidPIN(C2396b c2396b) throws PinpadException, IOException {
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001   INVALID PIN");
        beepFailure(c2396b);
        SystemClock.sleep(1000L);
        initScreen(c2396b);
    }

    public static final void invalidPINRetry(C2396b c2396b, String str) throws PinpadException, IOException, TransactionCanceledException, TransactionAbortedException {
        for (int i = 0; i < 2; i++) {
            clearScreen(c2396b);
            c2396b.m33060I0("\u0001  INVALID PIN");
            beepFailure(c2396b);
            SystemClock.sleep(1000L);
            enterPin(c2396b, str);
            showBusy(c2396b);
        }
    }

    public static final boolean isCardAvailable(C2396b c2396b) throws PinpadException, IOException {
        try {
            c2396b.m32982x0(0);
            return true;
        } catch (PinpadException e) {
            if (e.m33091a() == 8) {
                return false;
            }
            throw e;
        }
    }

    public static final int presentCard(C2396b c2396b) throws PinpadException, IOException, TransactionException {
        removeCard(c2396b);
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001 PLEASE INSERT\n      CARD");
        c2396b.m32980y0(0, 5, 0);
        c2396b.m33012i0();
        final int[] iArr = {0};
        c2396b.m33076A0(new C2396b.InterfaceC2402e() { // from class: com.paypad.controllers.PinpadHelper.2
            @Override // com.datecs.pinpad.C2396b.InterfaceC2402e
            public void onMagstripeRead() {
                System.out.println("Magstripe card is read");
                synchronized (iArr) {
                    int[] iArr2 = iArr;
                    iArr2[0] = iArr2[0] + 1;
                    iArr.notify();
                }
            }
        });
        c2396b.m33072C0(new C2396b.InterfaceC2406i() { // from class: com.paypad.controllers.PinpadHelper.3
            @Override // com.datecs.pinpad.C2396b.InterfaceC2406i
            public void onSmartCardInserted() {
                System.out.println("Smart card is inserted");
                synchronized (iArr) {
                    int[] iArr2 = iArr;
                    iArr2[0] = iArr2[0] + 2;
                    iArr.notify();
                }
            }

            @Override // com.datecs.pinpad.C2396b.InterfaceC2406i
            public void onSmartCardRemoved() {
                System.out.println("Smart card is removed");
            }
        });
        while (readKey(c2396b) != 67) {
            synchronized (iArr) {
                try {
                    iArr.wait(100L);
                } catch (InterruptedException unused) {
                }
            }
            if ((iArr[0] & 1) != 0) {
                synchronized (iArr) {
                    try {
                        iArr.wait(200L);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            if (iArr[0] != 0) {
                c2396b.m33076A0(null);
                c2396b.m33072C0(null);
                return iArr[0];
            }
        }
        throw new TransactionCanceledException("Transaction is canceled by user");
    }

    public static final int readKey(C2396b c2396b) throws PinpadException, IOException {
        c2396b.m33046P0(true);
        try {
            return c2396b.m33042R0();
        } catch (PinpadException e) {
            if (e.m33091a() == 8) {
                return 0;
            }
            throw e;
        }
    }

    public static final void removeCard(C2396b c2396b) throws PinpadException, IOException {
        c2396b.m32980y0(0, 5, 0);
        if (isCardAvailable(c2396b)) {
            clearScreen(c2396b);
            c2396b.m33060I0("\u0001 PLEASE REMOVE\n      CARD");
            do {
                beepAttention(c2396b);
            } while (isCardAvailable(c2396b));
        }
    }

    public static final int select(C2396b c2396b, String[] strArr) throws PinpadException, IOException, TransactionAbortedException {
        int i = c2396b.m33026b0() > 32 ? 3 : 1;
        c2396b.m33064G0(false);
        c2396b.m33040S0(-1);
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (z) {
                String str = new String("\u0001\u000b   SELECT APP   \f");
                for (int i4 = i2; i4 < i2 + i && i4 < strArr.length; i4++) {
                    if (i4 == i3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(StringUtils.padRight(">" + strArr[i4], 16, ' ').substring(0, 16));
                        str = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(StringUtils.padRight(" " + strArr[i4], 16, ' ').substring(0, 16));
                        str = sb2.toString();
                    }
                }
                c2396b.m33050N0(0);
                c2396b.m33060I0(str);
                z = false;
            }
            int readKey = readKey(c2396b);
            if (readKey == 65) {
                return i3;
            }
            if (readKey == 67) {
                throw new TransactionAbortedException("Selection is canceled by user");
            }
            if (readKey == 97) {
                if (i3 > 0) {
                    i3--;
                }
                if (i2 > i3) {
                    i2--;
                }
            } else if (readKey != 98) {
                SystemClock.sleep(100L);
            } else {
                if (i3 < strArr.length - 1) {
                    i3++;
                }
                if (i3 - i2 >= i) {
                    i2++;
                }
            }
            z = true;
        }
    }

    public static final void showAborted(C2396b c2396b) throws PinpadException, IOException {
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001  TRANSACTION\n    ABORTED");
        beepFailure(c2396b);
        SystemClock.sleep(1000L);
        initScreen(c2396b);
    }

    public static final void showBusy(C2396b c2396b) throws PinpadException, IOException {
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001   PLEASE WAIT");
    }

    public static final void showCanceled(C2396b c2396b) throws PinpadException, IOException {
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001  TRANSACTION\n   CANCELLED");
        beepFailure(c2396b);
        SystemClock.sleep(1000L);
        initScreen(c2396b);
    }

    public static final void showDenied(C2396b c2396b) throws PinpadException, IOException {
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001  TRANSACTION\n    DENIED");
        beepFailure(c2396b);
        SystemClock.sleep(1000L);
        initScreen(c2396b);
    }

    public static final void showMessage(C2396b c2396b, String str) throws PinpadException, IOException {
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001  " + str);
        beepSuccess(c2396b);
        SystemClock.sleep(1000L);
        initScreen(c2396b);
    }

    public static final void showSuccessful(C2396b c2396b) throws PinpadException, IOException {
        clearScreen(c2396b);
        c2396b.m33060I0("\u0001  TRANSACTION\n   SUCCESSFUL");
        beepSuccess(c2396b);
        SystemClock.sleep(1000L);
        initScreen(c2396b);
    }

    public static final void validPIN(C2396b c2396b) throws PinpadException, IOException {
        c2396b.m33060I0("\u0001  VALID PIN");
        SystemClock.sleep(1000L);
        showBusy(c2396b);
    }
}
