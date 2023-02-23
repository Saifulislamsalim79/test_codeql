package com.paypad.facade;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.datecs.pinpad.C2395a;
import com.datecs.pinpad.C2396b;
import com.datecs.pinpad.PinpadException;
import com.paypad.controllers.PinpadHelper;
import com.paypad.controllers.PinpadManager;
import com.paypad.emv.AccountType;
import com.paypad.emv.EmvRequest;
import com.paypad.emv.EmvTerminalDecision;
import com.paypad.emv.EmvTransactionType;
import com.paypad.emv.OnlinePinMode;
import com.paypad.emv._0200Type;
import com.paypad.emv.controllers.EmvTransactionProcesssor;
import com.paypad.exceptions.TransactionAbortedException;
import com.paypad.exceptions.TransactionCanceledException;
import com.paypad.exceptions.TransactionDeniedException;
import com.paypad.exceptions.TransactionException;
import com.paypad.models.messaging.nibss.Globals;
import com.paypad.models.messaging.nibss.HSMClient;
import com.paypad.utils.HexUtil;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import p272h.p273a.p274a.C8211a;
/* loaded from: classes2.dex */
public class PayPadManager {
    public static int KEY_PIN_INDEX = 12;
    public static final int REQUEST_DEVICE = 2;
    public static final int REQUEST_ENABLE_BT = 1;
    Context Context;
    private BluetoothAdapter mBtAdapter;
    Context mContext;
    private PinpadManager mPinpadManager;
    private int KEY_IPEK_INDEX = 0;
    private int KEY_DATA_INDEX = 11;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface MethodInvoker {
        void invoke(C2396b c2396b) throws PinpadException, IOException, TransactionException;
    }

    public PayPadManager(Context context) {
        this.Context = context;
        PinpadManager pinpadManager = PinpadManager.getInstance(context);
        this.mPinpadManager = pinpadManager;
        pinpadManager.setOnConnectionClosedListener(new PinpadManager.OnConnectionClosedListener() { // from class: com.paypad.facade.PayPadManager.1
            @Override // com.paypad.controllers.PinpadManager.OnConnectionClosedListener
            public void OnConnectionClosed() {
                Globals.isPinpadConnected = false;
                Intent intent = new Intent();
                intent.setAction("com.esl.paypadlib");
                intent.putExtra("connectionStatus", false);
                PayPadManager.this.Context.sendBroadcast(intent);
            }
        });
        this.mPinpadManager.setOnConnectionEstablishedListener(new PinpadManager.OnConnectionEstablishedListener() { // from class: com.paypad.facade.PayPadManager.2
            @Override // com.paypad.controllers.PinpadManager.OnConnectionEstablishedListener
            public void OnConnectionEstablished() {
                Globals.isPinpadConnected = true;
                Intent intent = new Intent();
                intent.setAction("com.esl.paypadlib");
                intent.putExtra("connectionStatus", true);
                PayPadManager.this.Context.sendBroadcast(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] decode(String str) {
        return HexUtil.hexStringToByteArray(str, ' ');
    }

    private void enableBluetooth() {
        ((Activity) this.Context).startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    private void invokeHelper(final MethodInvoker methodInvoker) {
        final C2396b pinpad = this.mPinpadManager.getPinpad();
        new Thread(new Runnable() { // from class: com.paypad.facade.PayPadManager.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        methodInvoker.invoke(pinpad);
                    } catch (IOException e) {
                        e.printStackTrace();
                        PayPadManager.this.mPinpadManager.disconnect();
                        Log.i("PAYPADMANAGER", e.getMessage());
                        PayPadManager.this.waitForDevice(Globals.deviceActivityClass);
                    }
                } catch (PinpadException e2) {
                    e2.printStackTrace();
                    StringWriter stringWriter = new StringWriter();
                    e2.printStackTrace(new PrintWriter(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    Log.i("PAYPADMANAGER", "\nPINPAD ERROR: " + stringWriter2 + "\n\n");
                } catch (TransactionException e3) {
                    e3.printStackTrace();
                    Log.i("PAYPADMANAGER", "\nTRANSACTION ERROR: " + e3.getMessage() + "\n\n");
                }
            }
        }).start();
    }

    private void loadKeys() {
        Log.i("PayPadManager", "*** Load keys ***\n");
        invokeHelper(new MethodInvoker() { // from class: com.paypad.facade.PayPadManager.5
            @Override // com.paypad.facade.PayPadManager.MethodInvoker
            public void invoke(C2396b c2396b) throws PinpadException, IOException, TransactionException {
                PinpadHelper.showBusy(c2396b);
                for (int i = 2; i < 49; i++) {
                    c2396b.m32987v(i);
                }
                c2396b.m32985w(1, PayPadManager.this.KEY_IPEK_INDEX, 0, 0, Globals.TR31dupktKey);
                c2396b.m32985w(1, PayPadManager.this.KEY_DATA_INDEX, 0, 0, Globals.TR31dataKey);
                c2396b.m32985w(1, PayPadManager.KEY_PIN_INDEX, 0, 0, Globals.TR31tmkKey);
                Log.i("PayPadManager", "» Save keys to NVRAM\n");
                c2396b.m32983x();
                Log.i("PayPadManager", "» Load CA keys\n");
                c2396b.m32993s(0, PayPadManager.this.decode("A0 00 00 00 03 92"), PayPadManager.this.decode("03 01"), PayPadManager.this.decode("B0 99 6A F5 6F 56 91 87 D0 92 93 C1 48 10 45 0E D8 EE 33 57 39 7B 18 A2 45 8E FA A9 2D A3 B6 DF 65 14 EC 06 01 95 31 8F D4 3B E9 B8 F0 CC 66 9E 3F 84 40 57 CB DD F8 BD A1 91 BB 64 47 3B C8 DC 9A 73 0D B8 F6 B4 ED E3 92 41 86 FF D9 B8 C7 73 57 89 C2 3A 36 BA 0B 8A F6 53 72 EB 57 EA 5D 89 E7 D1 4E 9C 7B 6B 55 74 60 F1 08 85 DA 16 AC 92 3F 15 AF 37 58 F0 F0 3E BD 3C 5C 2C 94 9C BA 30 6D B4 4E 6A 2C 07 6C 5F 67 E2 81 D7 EF 56 78 5D C4 D7 59 45 E4 91 F0 19 18 80 0A 9E 2D C6 6F 60 08 05 66 CE 0D AF 8D 17 EA D4 6A D8 E3 0A 24 7C 9F"));
                c2396b.m32993s(1, PayPadManager.this.decode("A0 00 00 00 03 94"), PayPadManager.this.decode("03 01"), PayPadManager.this.decode("F8 AC D2 B1 23 02 EE 64 4F 3F 83 5A BD 1F C7 A6 F6 2C CE 48 FF EC 62 2A A8 EF 06 2B EF 6F B8 BA 8B C6 8B BF 6A B5 87 0E ED 57 9B C3 97 3E 12 13 03 D3 48 41 A7 96 D6 DC BC 41 DB F9 E5 2C 46 09 79 5C 0C CF 7E E8 6F A1 D5 CB 04 10 71 ED 2C 51 D2 20 2F 63 F1 15 6C 58 A9 2D 38 BC 60 BD F4 24 E1 77 6E 2B C9 64 80 78 A0 3B 36 FB 55 43 75 FC 53 D5 7C 73 F5 16 0E A5 9F 3A FC 53 98 EC 7B 67 75 8D 65 C9 BF F7 82 8B 6B 82 D4 BE 12 4A 41 6A B7 30 19 14 31 1E A4 62 C1 9F 77 1F 31 B3 B5 73 36 00 0D FF 73 2D 3B 83 DE 07 05 2D 73 03 54 D2 97 BE C7 28 71 DC CF 0E 19 3F 17 1A BA 27 EE 46 4C FA 11 76 04 64 78 FD 62 FE C4 52 D5 CA 39 32 96 53 0A A3 F4 19 27 AD FE 43 4A 2D F2 AE 30 54 F8 84 06 57 A2 6E 0F C6 17"));
                c2396b.m32993s(2, PayPadManager.this.decode("A0 00 00 00 03 95"), PayPadManager.this.decode("03 01"), PayPadManager.this.decode("90 BE 9E 1F A5 E9 A8 03 85 29 99 C4 AB 43 2D B2 86 00 DC D9 DA B7 6D FA AA 47 35 5A 0F E3 7B 15 08 AC 6B F3 88 60 D3 C6 C2 E5 B1 2A 3C AA F2 A7 00 5A 72 41 EB AA 77 71 11 2C 74 CF 9A 06 34 65 2F BC A0 E5 98 0C 54 A6 47 61 EA 10 1A 11 4E 0F 0B 55 72 AD D5 7D 01 0B 7C 9C 88 7E 10 4C A4 EE 12 72 DA 66 D9 97 B9 A9 0B 5A 6D 62 4A B6 C5 7E 73 C8 F9 19 00 0E B5 F6 84 89 8E F8 C3 DB EF B3 30 C6 26 60 BE D8 8E A7 8E 90 9A FF 05 F6 DA 62 7B"));
                c2396b.m32993s(3, PayPadManager.this.decode("A0 00 00 00 03 97"), PayPadManager.this.decode("03 01"), PayPadManager.this.decode("60 AF 07 54 EA ED 97 70 43 AB 6F 41 D6 31 2A B1 E2 2A 68 09 17 5B EB 28 E7 0D 5F 99 B2 DF 18 CA E7 35 19 34 1B BB D3 27 D0 B8 BE 9D 4D 0E 15 F0 7D 36 EA 3E 3A 05 C8 92 F5 B1 9A 3E 9D 34 13 B0 D9 7E 7A D1 0A 5F 5D E8 E3 88 60 C0 AD 00 4B 1E 06 F4 04 0C 29 5A CB 45 7A 78 85 51 B6 12 7C 0B 29"));
                c2396b.m32993s(4, PayPadManager.this.decode("A0 00 00 00 03 98"), PayPadManager.this.decode("03 01"), PayPadManager.this.decode("70 CA 02 6E 52 A6 95 E7 2B D3 0A F9 28 19 6E ED C9 FA F4 A6 19 F2 49 2E 3F B3 11 69 78 9C 27 6F FB B7 D4 31 16 64 7B A9 E0 D1 06 A3 54 2E 39 65 29 2C F7 78 23 DD 34 CA 8E EC 7D E3 67 E0 80 70 89 50 77 C7 EF AD 93 99 24 CB 18 70 67 DB F9 2C B1 E7 85 91 7B D3 8B AC E0 C1 94 CA 12 DF 0C E5 B7 A5 02 75 AC 61 BE 7C 3B 43 68 87 CA 98 C9 FD 39"));
                c2396b.m32993s(5, PayPadManager.this.decode("A0 00 00 00 03 99"), PayPadManager.this.decode("03 01"), PayPadManager.this.decode("80 AB 79 FC C9 52 08 96 96 7E 77 6E 64 44 4E 5D CD D6 E1 36 11 87 4F 39 85 72 25 20 42 52 95 EE A4 BD 0C 27 81 DE 7F 31 CD 3D 04 1F 56 5F 74 73 06 EE D6 29 54 B1 7E DA BA 3A 6C 5B 85 A1 DE 1B EB 9A 34 14 1A F3 8F CF 82 79 C9 DE A0 D5 A6 71 0D 08 DB 41 24 F0 41 94 55 87 E2 03 59 BA B4 7B 75 75 AD 94 26 2D 4B 25 F2 64 AF 33 DE DC F2 8E 09 61 5E 93 7D E3 2E DC 03 C5 44 45 FE 7E 38 27 77"));
                c2396b.m32993s(6, PayPadManager.this.decode("A0 00 00 00 03 07"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A8 9F 25 A5 6F A6 DA 25 8C 8C A8 B4 04 27 D9 27 B4 A1 EB 4D 7E A3 26 BB B1 2F 97 DE D7 0A E5 E4 48 0F C9 C5 E8 A9 72 17 71 10 A1 CC 31 8D 06 D2 F8 F5 C4 84 4A C5 FA 79 A4 DC 47 0B B1 1E D6 35 69 9C 17 08 1B 90 F1 B9 84 F1 2E 92 C1 C5 29 27 6D 8A F8 EC 7F 28 49 20 97 D8 CD 5B EC EA 16 FE 40 88 F6 CF AB 4A 1B 42 32 8A 1B 99 6F 92 78 B0 B7 E3 31 1C A5 EF 85 6C 2F 88 84 74 B8 36 12 A8 2E 4E 00 D0 CD 40 69 A6 78 31 40 43 3D 50 72 5F"));
                c2396b.m32993s(7, PayPadManager.this.decode("A0 00 00 00 03 08"), PayPadManager.this.decode("03"), PayPadManager.this.decode("D9 FD 6E D7 5D 51 D0 E3 06 64 BD 15 70 23 EA A1 FF A8 71 E4 DA 65 67 2B 86 3D 25 5E 81 E1 37 A5 1D E4 F7 2B CC 9E 44 AC E1 21 27 F8 7E 26 3D 3A F9 DD 9C F3 5C A4 A7 B0 1E 90 70 00 BA 85 D2 49 54 C2 FC A3 07 48 25 DD D4 C0 C8 F1 86 CB 02 0F 68 3E 02 F2 DE AD 39 69 13 3F 06 F7 84 51 66 AC EB 57 CA 0F C2 60 34 45 46 98 11 D2 93 BF EF BA FA B5 76 31 B3 DD 91 E7 96 BF 85 0A 25 01 2F 1A E3 8F 05 AA 5C 4D 6D 03 B1 DC 2E 56 86 12 78 59 38 BB C9 B3 CD 3A 91 0C 1D A5 5A 5A 92 18 AC E0 F7 A2 12 87 75 26 82 F1 58 32 A6 78 D6 E1 ED 0B"));
                c2396b.m32993s(8, PayPadManager.this.decode("A0 00 00 00 03 09"), PayPadManager.this.decode("03"), PayPadManager.this.decode("9D 91 22 48 DE 0A 4E 39 C1 A7 DD E3 F6 D2 58 89 92 C1 A4 09 5A FB D1 82 4D 1B A7 48 47 F2 BC 49 26 D2 EF D9 04 B4 B5 49 54 CD 18 9A 54 C5 D1 17 96 54 F8 F9 B0 D2 AB 5F 03 57 EB 64 2F ED A9 5D 39 12 C6 57 69 45 FA B8 97 E7 06 2C AA 44 A4 AA 06 B8 FE 6E 3D BA 18 AF 6A E3 73 8E 30 42 9E E9 BE 03 42 7C 9D 64 F6 95 FA 8C AB 4B FE 37 68 53 EA 34 AD 1D 76 BF CA D1 59 08 C0 77 FF E6 DC 55 21 EC EF 5D 27 8A 96 E2 6F 57 35 9F FA ED A1 94 34 B9 37 F1 AD 99 9D C5 C4 1E B1 19 35 B4 4C 18 10 0E 85 7F 43 1A 4A 5A 6B B6 51 14 F1 74 C2 D7 B5 9F DF 23 7D 6B B1 DD 09 16 E6 44 D7 09 DE D5 64 81 47 7C 75 D9 5C DD 68 25 46 15 F7 74 0E C0 7F 33 0A C5 D6 7B CD 75 BF 23 D2 8A 14 08 26 C0 26 DB DE 97 1A 37 CD 3E F9 B8 DF 64 4A C3 85 01 05 01 EF C6 50 9D 7A 41"));
                c2396b.m32993s(9, PayPadManager.this.decode("A0 00 00 00 03 95"), PayPadManager.this.decode("03"), PayPadManager.this.decode("BE 9E 1F A5 E9 A8 03 85 29 99 C4 AB 43 2D B2 86 00 DC D9 DA B7 6D FA AA 47 35 5A 0F E3 7B 15 08 AC 6B F3 88 60 D3 C6 C2 E5 B1 2A 3C AA F2 A7 00 5A 72 41 EB AA 77 71 11 2C 74 CF 9A 06 34 65 2F BC A0 E5 98 0C 54 A6 47 61 EA 10 1A 11 4E 0F 0B 55 72 AD D5 7D 01 0B 7C 9C 88 7E 10 4C A4 EE 12 72 DA 66 D9 97 B9 A9 0B 5A 6D 62 4A B6 C5 7E 73 C8 F9 19 00 0E B5 F6 84 89 8E F8 C3 DB EF B3 30 C6 26 60 BE D8 8E A7 8E 90 9A FF 05 F6 DA 62 7B"));
                c2396b.m32993s(10, PayPadManager.this.decode("A0 00 00 00 03 92"), PayPadManager.this.decode("03"), PayPadManager.this.decode("99 6A F5 6F 56 91 87 D0 92 93 C1 48 10 45 0E D8 EE 33 57 39 7B 18 A2 45 8E FA A9 2D A3 B6 DF 65 14 EC 06 01 95 31 8F D4 3B E9 B8 F0 CC 66 9E 3F 84 40 57 CB DD F8 BD A1 91 BB 64 47 3B C8 DC 9A 73 0D B8 F6 B4 ED E3 92 41 86 FF D9 B8 C7 73 57 89 C2 3A 36 BA 0B 8A F6 53 72 EB 57 EA 5D 89 E7 D1 4E 9C 7B 6B 55 74 60 F1 08 85 DA 16 AC 92 3F 15 AF 37 58 F0 F0 3E BD 3C 5C 2C 94 9C BA 30 6D B4 4E 6A 2C 07 6C 5F 67 E2 81 D7 EF 56 78 5D C4 D7 59 45 E4 91 F0 19 18 80 0A 9E 2D C6 6F 60 08 05 66 CE 0D AF 8D 17 EA D4 6A D8 E3 0A 24 7C 9F"));
                c2396b.m32993s(11, PayPadManager.this.decode("A0 00 00 00 03 94"), PayPadManager.this.decode("03"), PayPadManager.this.decode("AC D2 B1 23 02 EE 64 4F 3F 83 5A BD 1F C7 A6 F6 2C CE 48 FF EC 62 2A A8 EF 06 2B EF 6F B8 BA 8B C6 8B BF 6A B5 87 0E ED 57 9B C3 97 3E 12 13 03 D3 48 41 A7 96 D6 DC BC 41 DBF9 E5 2C 46 09 79 5C 0C CF 7E E8 6F A1 D5 CB04 10 71 ED 2C 51 D2 20 2F 63 F1 15 6C 58 A9 2D 38 BC 60 BD F4 24 E1 77 6E 2B C9 64 80 78 A0 3B 36 FB 55 43 75 FC 53 D5 7C 73 F5 16 0E A5 9F 3A FC 53 98 EC 7B 67 75 8D 65 C9 BF F7 82 8B 6B 82 D4 BE 12 4A 41 6A B7 30 19 14 31 1E A4 62 C1 9F 77 1F 31 B3 B5 73 36 00 0D FF 73 2D 3B 83 DE 07 05 2D 73 03 54 D2 97 BE C7 28 71 DC CF 0E 19 3F 17 1A BA 27 EE 46 4C 6A 97 69 09 43 D5 9B DA BB 2A 27 EB 71 CE EB DA FA 11 76 04 64 78 FD 62 FE C4 52 D5 CA 39 32 96 53 0A A3 F4 19 27 AD FE 43 4A 2D F2 AE 30 54 F8 84 06 57 A2 6E 0F C6 17"));
                c2396b.m32993s(12, PayPadManager.this.decode("A0 00 00 00 04 00"), PayPadManager.this.decode("03"), PayPadManager.this.decode("9C 6B E5 AD B1 0B 4B E3 DC E2 09 9B 4B 21 06 72 B8 96 56 EB A0 91 20 4F 61 3E CC 62 3B ED C9 C6 D7 7B 66 0E 8B AE EA 7F 7C E3 0F 1B 15 38 79 A4 E3 64 59 34 3D 1F E4 7A CD BD 41 FC D7 10 03 0C 2B A1 D9 46 15 97 98 2C 6E 1B DD 08 55 4B 72 6F 5E FF 79 13 CE 59 E7 9E 35 72 95 C3 21 E2 6D 0B 8B E2 70 A9 44 23 45 C7 53 E2 AA 2A CF C9 D3 08 50 60 2F E6 CA C0 0C 6D DF 6B 8D 9D 9B 48 79 B2 82 6B 04 2A 07 F0 E5 AE 52 6A 3D 3C 4D 22 C7 2B 9E AA 52 EE D8 89 38 66 F8 66 38 7A C0 5A 13 99"));
                c2396b.m32993s(13, PayPadManager.this.decode("A0 00 00 00 04 02"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A9 9A 6D 3E 07 18 89 ED 9E 3A 0C 39 1C 69 B0 B8 04 FC 16 0B 2B 4B DD 57 0C 92 DD 5A 0F 45 F5 3E 86 21 F7 C9 6C 40 22 42 66 73 5E 1E E1 B3 C0 62 38 AE 35 04 63 20 FD 8E 81 F8 CE B3 F8 B4 C9 7B 94 09 30 A3 AC 5E 79 00 86 DA D4 1A 6A 4F 51 17 BA 1C E2 43 8A 51 AC 05 3E B0 02 AE D8 66 D2 C4 58 FD 73 35 90 21 A1 20 29 A0 C0 43 04 5C 11 66 4F E0 21 9E C6 3C 10 BF 21 55 BB 27 84 60 9A 10 64 21 D4 51 63 79 97 38 C1 C3 09 09 BB 6C 6F E5 2B BB 76 39 7B 97 40 CE 06 4A 61 3F F8 41 11 85 F0 88 42 A4 23 EA D2 0E DF FB FF 1C D6 C3 FE 0C 98 21 47 91 99 C2 6D 85 72 CC 8A FF F0 87 A9 C3"));
                c2396b.m32993s(14, PayPadManager.this.decode("A0 00 00 00 04 05"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A1 F5 E1 C9 BD 86 50 BD 43 AB 6E E5 6B 89 1E F7 45 9C 0A 24 FA 84 F9 12 7D 1A 6C 79 D4 93 0F 6D B1 85 2E 25 10 F1 8B 61 CD 35 4D B8 3A 35 6B D1 90 B8 8A B8 DF 04 28 4D 02 A4 20 4A 7B 6C B7 C5 55 19 77 A9 B3 63 79 CA 3D E1 A0 8E 69 F3 01 C9 5C C1 C2 05 06 95 92 75 F4 17 23 DD 5D 29 25 29 05 79 E5 A9 5B 0D F6 32 3F C8 E9 27 3D 6F 84 91 98 C4 99 62 09 16 6D 9B FC 97 3C 36 1C C8 26 E1"));
                c2396b.m32993s(15, PayPadManager.this.decode("A0 00 00 00 04 EF"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A1 91 CB 87 47 3F 29 34 9B 5D 60 A8 8B 3E AE E0 97 3A A6 F1 A0 82 F3 58 D8 49 FD DF F9 C0 91 F8 99 ED A9 79 2C AF 09 EF 28 F5 D2 24 04 B8 8A 22 93 EE BB C1 94 9C 43 BE A4 D6 0C FD 87 9A 15 39 54 4E 09 E0 F0 9F 60 F0 65 B2 BF 2A 13 EC C7 05 F3 D4 68 B9 D3 3A E7 7A D9 D3 F1 9C A4 0F 23 DC F5 EB 7C 04 DC 8F 69 EB A5 65 B1 EB CB 46 86 CD 27 47 85 53 0F F6 F6 E9 EE 43 AA 43 FD B0 2C E0 0D AE C1 5C 7B 8F D6 A9 B3 94 BA BA 41 9D 3F 6D C8 5E 16 56 9B E8 E7 69 89 68 8E FE A2 DF 22 FF 7D 35 C0 43 33 8D EA A9 82 A0 2B 86 6D E5 32 85 19 EB BC D6 F0 3C DD 68 66 73 84 7F 84 DB 65 1A B8 6C 28 CF 14 62 56 2C 57 7B 85 35 64 A2 90 C8 55 6D 81 85 31 26 8D 25 CC 98 A4 CC 6A 0B DF FF DA 2D CC A3 A9 4C 99 85 59 E3 07 FD DF 91 50 06 D9 A9 87 B0 7D DA EB 3B"));
                c2396b.m32993s(16, PayPadManager.this.decode("A0 00 00 00 04 F1"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A0 DC F4 BD E1 9C 35 46 B4 B6 F0 41 4D 17 4D DE 29 4A AB BB 82 8C 5A 83 4D 73 AA E2 7C 99 B0 B0 53 A9 02 78 00 72 39 B6 45 9F F0 BB CD 7B 4B 9C 6C 50 AC 02 CE 91 36 8D A1 BD 21 AA EA DB C6 53 47 33 7D 89 B6 8F 5C 99 A0 9D 05 BE 02 DD 1F 8C 5B A2 0E 2F 13 FB 2A 27 C4 1D 3F 85 CA D5 CF 66 68 E7 58 51 EC 66 ED BF 98 85 1F D4 E4 2C 44 C1 D5 9F 59 84 70 3B 27 D5 B9 F2 1B 8F A0 D9 32 79 FB BF 69 E0 90 64 29 09 C9 EA 27 F8 98 95 95 41 AA 67 57 F5 F6 24 10 4F 6E 1D 3A 95 32 F2 A6 E5 15 15 AE AD 1B 43 B3 D7 83 50 88 A2 FA FA 7B E7"));
                c2396b.m32993s(17, PayPadManager.this.decode("A0 00 00 00 04 F3"), PayPadManager.this.decode("03"), PayPadManager.this.decode("98 F0 C7 70 F2 38 64 C2 E7 66 DF 02 D1 E8 33 DF F4 FF E9 2D 69 6E 16 42 F0 A8 8C 56 94 C6 47 9D 16 DB 15 37 BF E2 9E 4F DC 6E 6E 8A FD 1B 0E B7 EA 01 24 72 3C 33 31 79 BF 19 E9 3F 10 65 8B 2F 77 6E 82 9E 87 DA ED A9 C9 4A 8B 33 82 19 9A 35 0C 07 79 77 C9 7A FF 08 FD 11 31 0A C9 50 A7 2C 3C A5 00 2E F5 13 FC CC 28 6E 64 6E 3C 53 87 53 5D 50 95 14 B3 B3 26 E1 23 4F 9C B4 8C 36 DD D4 4B 41 6D 23 65 40 34 A6 6F 40 3B A5 11 C5 EF A3"));
                c2396b.m32993s(18, PayPadManager.this.decode("A0 00 00 00 04 F5"), PayPadManager.this.decode("01 00 01"), PayPadManager.this.decode("A6 E6 FB 72 17 95 06 F8 60 CC CA 8C 27 F9 9C EC D9 4C 7D 4F 31 91 D3 03 BB EE 37 48 1C 7A A1 5F 23 3B A7 55 E9 E4 37 63 45 A9 A6 7E 79 94 BD C1 C6 80 BB 35 22 D8 C9 3E B0 CC C9 1A D3 1A D4 50 DA 30 D3 37 66 2D 19 AC 03 E2 B4 EF 5F 6E C1 82 82 D4 91 E1 97 67 D7 B2 45 42 DF DE FF 6F 62 18 55 03 53 20 69 BB B3 69 E3 BB 9F B1 9A C6 F1 C3 0B 97 D2 49 EE E7 64 E0 BA C9 7F 25 C8 73 D9 73 95 3E 51 53 A4 20 64 BB FA BF D0 6A 4B B4 86 86 0B F6 63 74 06 C9 FC 36 81 3A 4A 75 F7 5C 31 CC A9 F6 9F 8D E5 9A DE CE F6 BD E7 E0 78 00 FC BE 03 5D 31 76 AF 84 73 E2 3E 9A A3 DF EE 22 11 96 D1 14 83 02 67 7C 72 0C FE 25 44 A0 3D B5 53 E7 F1 B8 42 7B A1 CC 72 B0 F2 9B 12 DF EF 4C 08 1D 07 6D 35 3E 71 88 0A AD FF 38 63 52 AF 0A B7 B2 8E D4 9E 1E 67 2D 11 F9"));
                c2396b.m32993s(19, PayPadManager.this.decode("A0 00 00 00 04 F6"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A2 5A 6B D7 83 A5 EF 6B 8F B6 F8 30 55 C2 60 F5 F9 9E A1 66 78 F3 B9 05 3E 0F 64 98 E8 2C 3F 5D 1E 8C 38 F1 35 88 01 7E 2B 12 B3 D8 FF 6F 50 16 7F 46 44 29 10 72 9E 9E 4D 1B 37 39 E5 06 7C 0A C7 A1 F4 48 7E 35 F6 75 BC 16 E2 33 31 51 65 CB 14 2B FD B2 5E 30 1A 63 2A 54 A3 37 1E BA B6 57 2D EE BA F3 70 F3 37 F0 57 EE 73 B4 AE 46 D1 A8 BC 4D A8 53 EC 3C C1 2C 8C BC 2D A1 83 22 D6 85 30 C7 0B 22 BD AC 35 1D D3 60 68 AE 32 1E 11 AB F2 64 F4 D3 56 9B B7 12 14 54 50 05 55 8D E2 60 83 C7 35 DB 77 63 68 17 2F E8 C2 F5 C8 5E 8B 5B 89 0C C6 82 91 1D 2D E7 1F A6 26 B8 81 7F CC C0 89 22 B7 03 86 9F 3B AE AC 14 59 D7 7C D8 53 76 BC 36 18 2F 42 38 31 4D 6C 42 12 FB DD 7F 23 D3"));
                c2396b.m32993s(20, PayPadManager.this.decode("A0 00 00 00 04 F7"), PayPadManager.this.decode("01 00 01"), PayPadManager.this.decode("94 EA 62 F6 D5 83 20 E3 54 C0 22 AD DC F0 55 9D 8C F2 06 CD 92 E8 69 56 49 05 CE 21 D7 20 F9 71 B7 AE A3 74 83 0E BE 17 57 11 5A 85 E0 88 D4 1C 6B 77 CF 5E C8 21 F3 0B 1D 89 04 17 BF 2F A3 1E 59 08 DE D5 FA 67 7F 8C 7B 18 4A D0 90 28 FD DE 96 B6 A6 10 98 50 AA 80 01 75 EA BC DB BB 68 4A 96 C2 EB 63 79 DF EA 08 D3 2F E2 33 1F E1 03 23 3A D5 8D CD B1 E6 E0 77 CB 9F 24 EA EC 5C 25 AF"));
                c2396b.m32993s(21, PayPadManager.this.decode("A0 00 00 00 04 F8"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A1 F5 E1 C9 BD 86 50 BD 43 AB 6E E5 6B 89 1E F7 45 9C 0A 24 FA 84 F9 12 7D 1A 6C 79 D4 93 0F 6D B1 85 2E 25 10 F1 8B 61 CD 35 4D B8 3A 35 6B D1 90 B8 8A B8 DF 04 28 4D 02 A4 20 4A 7B 6C B7 C5 55 19 77 A9 B3 63 79 CA 3D E1 A0 8E 69 F3 01 C9 5C C1 C2 05 06 95 92 75 F4 17 23 DD 5D 29 25 29 05 79 E5 A9 5B 0D F6 32 3F C8 E9 27 3D 6F 84 91 98 C4 99 62 09 16 6D 9B FC 97 3C 36 1C C8 26 E1"));
                c2396b.m32993s(22, PayPadManager.this.decode("A0 00 00 00 04 F9"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A9 9A 6D 3E 07 18 89 ED 9E 3A 0C 39 1C 69 B0 B8 04 FC 16 0B 2B 4B DD 57 0C 92 DD 5A 0F 45 F5 3E 86 21 F7 C9 6C 40 22 42 66 73 5E 1E E1 B3 C0 62 38 AE 35 04 63 20 FD 8E 81 F8 CE B3 F8 B4 C9 7B 94 09 30 A3 AC 5E 79 00 86 DA D4 1A 6A 4F 51 17 BA 1C E2 43 8A 51 AC 05 3E B0 02 AE D8 66 D2 C4 58 FD 73 35 90 21 A1 20 29 A0 C0 43 04 5C 11 66 4F E0 21 9E C6 3C 10 BF 21 55 BB 27 84 60 9A 10 64 21 D4 51 63 79 97 38 C1 C3 09 09 BB 6C 6F E5 2B BB 76 39 7B 97 40 CE 06 4A 61 3F F8 41 11 85 F0 88 42 A4 23 EA D2 0E DF FB FF 1C D6 C3 FE 0C 98 21 47 91 99 C2 6D 85 72 CC 8A FF F0 87 A9 C3"));
                c2396b.m32993s(23, PayPadManager.this.decode("A0 00 00 00 04 FA"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A9 0F CD 55 AA 2D 5D 99 63 E3 5E D0 F4 40 17 76 99 83 2F 49 C6 BA B1 5C DA E5 79 4B E9 3F 93 4D 44 62 D5 D1 27 62 E4 8C 38 BA 83 D8 44 5D EA A7 41 95 A3 01 A1 02 B2 F1 14 EA DA 0D 18 0E E5 E7 A5 C7 3E 0C 4E 11 F6 7A 43 DD AB 5D 55 68 3B 14 74 CC 06 27 F4 4B 8D 30 88 A4 92 FF AA DA D4 F4 24 22 D0 E7 01 35 36 C3 C4 9A D3 D0 FA E9 64 59 B0 F6 B1 B6 05 65 38 A3 D6 D4 46 40 F9 44 67 B1 08 86 7D EC 40 FA AE CD 74 0C 00 E2 B7 A8 85 2D"));
                c2396b.m32993s(24, PayPadManager.this.decode("A0 00 00 00 04 04"), PayPadManager.this.decode("03"), PayPadManager.this.decode("A6 DA 42 83 87 A5 02 D7 DD FB 7A 74 D3 F4 12 BE 76 26 27 19 7B 25 43 5B 7A 81 71 6A 70 01 57 DD D0 6F 7C C9 9D 6C A2 8C 24 70 52 7E 2C 03 61 6B 9C 59 21 73 57 C2 67 4F 58 3B 3B A5 C7 DC F2 83 86 92 D0 23 E3 56 24 20 B4 61 5C 43 9C A9 7C 44 DC 9A 24 9C FC E7 B3 BF B2 2F 68 22 8C 3A F1 33 29 AA 4A 61 3C F8 DD 85 35 02 37 3D 62 E4 9A B2 56 D2 BC 17 12 0E 54 AE DC ED 6D 96 A4 28 7A CC 5C 04 67 7D 4A 5A 32 0D B8 BE E2 F7 75 E5 FE C5"));
                c2396b.m32993s(25, PayPadManager.this.decode("A0 00 00 03 71 03"), PayPadManager.this.decode("03"), PayPadManager.this.decode("D0 62 38 B8 56 CF 2C 88 90 A7 F6 68 CA 17 C1 92 47 49 8D 19 3A 7C 11 E7 10 5D ED EE E6 A8 73 E8 18 9E 50 49 3E 9B 17 54 7C 42 EA 4F A8 8B BE F3 0B B6 BC 24 09 24 6C CC 95 F3 66 22 A7 F4 D9 2D 46 44 4F 20 B1 B2 4B F6 3C 5B 28 39 5D 8E F1 8C 23 20 5C 21 19 DF E5 FB A2 FB FC 31 1B 2F E8 A6 A7 5B 35 A7 DA B7 2D 42 17 92 A5 00 CD FD 81 33 B8 A9 7D 84 A4 9C 0B D2 2D 52 D0 6E A5 E0 EF 3E 47 1D 47 D8 37 0C 37 AA 48 B5 64 68 9D 00 35 D9"));
                c2396b.m32993s(26, PayPadManager.this.decode("A0 00 00 03 71 04"), PayPadManager.this.decode("03"), PayPadManager.this.decode("D1 3C D5 E1 B9 21 E4 E0 F0 D4 0E 2D E1 4C CE 73 E3 A3 4E D2 DC FA 82 65 31 D8 19 56 41 09 1E 37 C8 47 4D 19 B6 86 E8 24 3F 08 9A 69 F7 B1 8D 2D 34 CB 48 24 F2 28 F7 75 0F 96 D1 EF BD FF 88 1F 25 9A 8C 04 DE 64 91 5A 3A 3D 7C B8 46 13 5F 40 83 C9 3C DE 75 5B C8 08 88 6F 60 05 42 DF F0 85 55 8D 5E A7 F4 5C B1 5E C8 35 06 4A A8 56 D6 02 A0 A4 4C D0 21 F5 4C F8 EC 0C C6 80 B5 4B 36 65 AB E7 4A 7C 43 D0 28 97 FF 84 BB 4C B9 8B C9 1D"));
                Log.i("PayPadManager", "» Save CA keys to NVRAM\n");
                c2396b.m32991t();
                Log.i("PayPadManager", "\n");
                PinpadHelper.initScreen(c2396b);
                Intent intent = new Intent();
                intent.setAction("com.esl.paypadlib");
                intent.putExtra("response", "Initializecomplete");
                PayPadManager.this.Context.sendBroadcast(intent);
                Globals.initializing = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitForDevice(Class cls) {
        ((Activity) this.Context).startActivityForResult(new Intent(this.Context, cls), 2);
    }

    public void connect() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.mBtAdapter = defaultAdapter;
            if (defaultAdapter != null) {
                if (defaultAdapter.isEnabled()) {
                    waitForDevice(Globals.deviceActivityClass);
                } else {
                    enableBluetooth();
                }
            } else {
                Toast.makeText(this.Context, "Bluetooth not supported", 0).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean doCashadvance(String str) {
        EmvTransactionProcesssor emvTransactionProcesssor = new EmvTransactionProcesssor(this.mPinpadManager, _0200Type.cashadvance, this.Context);
        EmvRequest emvRequest = new EmvRequest();
        emvRequest.setAccountType(AccountType.Savings);
        emvRequest.setCurrencyCode("0566");
        emvRequest.setMinorAmount(Long.valueOf(Long.parseLong(str.replace(".", ""))).longValue());
        emvRequest.setOtherAmount(Long.valueOf(C8211a.f19749g));
        emvRequest.setTerminalDecision(EmvTerminalDecision.EmvTerminalNoDecision);
        emvRequest.setTransactionCategoryCode("00");
        emvRequest.setTransactionCurrencyCode("0556");
        emvRequest.setTransactionDate(new Date());
        emvRequest.setTransType(EmvTransactionType.EmvGoods);
        try {
            try {
                emvTransactionProcesssor.doEmv(emvRequest);
            } catch (PinpadException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            } catch (InterruptedException e3) {
                e3.printStackTrace();
                return false;
            }
        } catch (TransactionAbortedException e4) {
            e4.printStackTrace();
        } catch (TransactionCanceledException e5) {
            e5.printStackTrace();
        } catch (TransactionDeniedException e6) {
            e6.printStackTrace();
        } catch (TransactionException e7) {
            e7.printStackTrace();
        }
        return false;
    }

    public boolean doCashback(String str) {
        EmvTransactionProcesssor emvTransactionProcesssor = new EmvTransactionProcesssor(this.mPinpadManager, _0200Type.cashback, this.Context);
        EmvRequest emvRequest = new EmvRequest();
        emvRequest.setAccountType(AccountType.Savings);
        emvRequest.setCurrencyCode("0566");
        emvRequest.setMinorAmount(Long.valueOf(Long.parseLong(str.replace(".", ""))).longValue());
        emvRequest.setOtherAmount(Long.valueOf(C8211a.f19749g));
        emvRequest.setTerminalDecision(EmvTerminalDecision.EmvTerminalNoDecision);
        emvRequest.setTransactionCategoryCode("00");
        emvRequest.setTransactionCurrencyCode("0556");
        emvRequest.setTransactionDate(new Date());
        emvRequest.setTransType(EmvTransactionType.EmvGoods);
        try {
            try {
                emvTransactionProcesssor.doEmv(emvRequest);
            } catch (PinpadException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            } catch (InterruptedException e3) {
                e3.printStackTrace();
                return false;
            }
        } catch (TransactionAbortedException e4) {
            e4.printStackTrace();
        } catch (TransactionCanceledException e5) {
            e5.printStackTrace();
        } catch (TransactionDeniedException e6) {
            e6.printStackTrace();
        } catch (TransactionException e7) {
            e7.printStackTrace();
        }
        return false;
    }

    public void doKeyLoad() {
        loadKeys();
    }

    public void getSerialNumber() {
        initPinpad();
    }

    public void initPinpad() {
        Log.i("PAYPADMANAGER", "*** Init Pinpad ***\n");
        invokeHelper(new MethodInvoker() { // from class: com.paypad.facade.PayPadManager.4
            @Override // com.paypad.facade.PayPadManager.MethodInvoker
            public void invoke(C2396b c2396b) throws PinpadException, IOException, TransactionException {
                Log.i("PAYPADMANAGER", "» Connection established\n");
                Log.i("PAYPADMANAGER", "  Bluetooth name: " + PayPadManager.this.mPinpadManager.getBluetoothName() + "\n");
                Log.i("PAYPADMANAGER", "  Bluetooth addr: " + PayPadManager.this.mPinpadManager.getBluetoothAddress() + "\n");
                Log.i("PAYPADMANAGER", "» Get device information\n");
                C2395a m33022d0 = c2396b.m33022d0();
                Globals.POSSerialNumber = m33022d0.m33083g();
                Log.i("PAYPADMANAGER", "  Serial number: " + m33022d0.m33083g() + "\n");
                Log.i("PAYPADMANAGER", "  Firmware name: " + m33022d0.m33081i() + "\n");
                Log.i("PAYPADMANAGER", "  Application name: " + m33022d0.m33086d() + "\n");
                Log.i("PAYPADMANAGER", "  Application version: " + m33022d0.m33085e() + "\n");
                Log.i("PAYPADMANAGER", "» Init display\n");
                PinpadHelper.initScreen(c2396b);
                Log.i("PAYPADMANAGER", "» Set time\n");
                c2396b.m33066F0(Calendar.getInstance());
                Log.i("PAYPADMANAGER", "» Enable events\n");
                c2396b.m33068E0(448);
                Log.i("PAYPADMANAGER", "» Pinpad is ready.\n\n");
                Intent intent = new Intent();
                intent.setAction("com.esl.paypadlib");
                intent.putExtra("response", "connected");
                PayPadManager.this.Context.sendBroadcast(intent);
                if (Globals.initializing) {
                    String m33084f = c2396b.m33022d0().m33084f();
                    Globals.srn = m33084f;
                    Log.i("BT: ", m33084f);
                    PrintStream printStream = System.out;
                    printStream.println("BT SRN: " + Globals.srn);
                    Intent intent2 = new Intent();
                    intent2.setAction("com.esl.paypadlib");
                    intent2.putExtra("response", "startInitializeprogress");
                    PayPadManager.this.Context.sendBroadcast(intent2);
                    HSMClient.downloadKeys(PayPadManager.this.Context);
                }
            }
        });
    }

    public boolean makepayment(String str, Context context) {
        EmvTransactionProcesssor emvTransactionProcesssor = new EmvTransactionProcesssor(this.mPinpadManager, _0200Type.purchase, context);
        EmvRequest emvRequest = new EmvRequest();
        emvRequest.setAccountType(AccountType.Savings);
        emvRequest.setCurrencyCode("0566");
        emvRequest.setMinorAmount(Long.valueOf(Long.parseLong(str.replace(".", ""))).longValue());
        emvRequest.setOtherAmount(Long.valueOf(C8211a.f19749g));
        emvRequest.setPinMode(OnlinePinMode.Ms);
        emvRequest.setTerminalDecision(EmvTerminalDecision.EmvTerminalNoDecision);
        emvRequest.setTransactionCategoryCode("00");
        emvRequest.setTransactionCurrencyCode("0556");
        emvRequest.setTransactionDate(new Date());
        emvRequest.setTransType(EmvTransactionType.EmvGoods);
        try {
            try {
                emvTransactionProcesssor.doEmv(emvRequest);
            } catch (PinpadException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            } catch (InterruptedException e3) {
                e3.printStackTrace();
                return false;
            }
        } catch (TransactionAbortedException e4) {
            e4.printStackTrace();
        } catch (TransactionCanceledException e5) {
            e5.printStackTrace();
        } catch (TransactionDeniedException e6) {
            e6.printStackTrace();
        } catch (TransactionException e7) {
            e7.printStackTrace();
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 2 && i2 == -1) {
                initPinpad();
            }
        } else if (i2 == -1) {
            waitForDevice(Globals.deviceActivityClass);
        } else {
            ((Activity) this.Context).finish();
        }
    }

    public void setContext(Context context) {
        this.Context = context;
    }
}
