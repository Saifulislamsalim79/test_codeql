package com.datecs.pinpad;

import com.datecs.pinpad.p088c.C2407a;
import com.datecs.pinpad.p088c.C2408b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
/* compiled from: Pinpad.java */
/* renamed from: com.datecs.pinpad.b */
/* loaded from: classes2.dex */
public class C2396b {

    /* renamed from: r */
    private static boolean f6890r = true;

    /* renamed from: a */
    private final InputStream f6891a;

    /* renamed from: b */
    private final OutputStream f6892b;

    /* renamed from: c */
    private C2405h f6893c;

    /* renamed from: d */
    private byte[] f6894d;

    /* renamed from: e */
    private int f6895e;

    /* renamed from: f */
    private int f6896f;

    /* renamed from: g */
    private IOException f6897g;

    /* renamed from: h */
    private boolean f6898h;

    /* renamed from: i */
    private Thread f6899i;

    /* renamed from: j */
    private int f6900j;

    /* renamed from: k */
    private int f6901k;

    /* renamed from: l */
    private InterfaceC2404g f6902l;

    /* renamed from: m */
    private InterfaceC2406i f6903m;

    /* renamed from: n */
    private InterfaceC2400c f6904n;

    /* renamed from: o */
    private InterfaceC2402e f6905o;

    /* renamed from: p */
    private InterfaceC2401d f6906p;

    /* renamed from: q */
    private int f6907q = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$a */
    /* loaded from: classes2.dex */
    public class RunnableC2397a implements Runnable {

        /* renamed from: d */
        private final /* synthetic */ int f6909d;

        /* renamed from: e */
        private final /* synthetic */ byte[] f6910e;

        RunnableC2397a(int i, byte[] bArr) {
            this.f6909d = i;
            this.f6910e = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f6909d;
            if (i == 5) {
                C2396b.this.m33008k0();
            } else if (i == 6) {
                C2396b.this.m33000o0();
            } else if (i == 7) {
                C2396b.this.m32996q0();
            } else if (i == 8) {
                C2396b.this.m32994r0();
            } else if (i != 11) {
            } else {
                C2396b.this.m33062H0(this.f6910e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$b */
    /* loaded from: classes2.dex */
    public class RunnableC2398b implements Runnable {

        /* renamed from: d */
        private final /* synthetic */ InterfaceC2403f f6912d;

        /* compiled from: Pinpad.java */
        /* renamed from: com.datecs.pinpad.b$b$a */
        /* loaded from: classes2.dex */
        class RunnableC2399a implements Runnable {

            /* renamed from: c */
            private final /* synthetic */ InterfaceC2403f f6913c;

            /* renamed from: d */
            private final /* synthetic */ int f6914d;

            RunnableC2399a(RunnableC2398b runnableC2398b, InterfaceC2403f interfaceC2403f, int i) {
                this.f6913c = interfaceC2403f;
                this.f6914d = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6913c.onPINEntryComplete(this.f6914d);
            }
        }

        RunnableC2398b(InterfaceC2403f interfaceC2403f) {
            this.f6912d = interfaceC2403f;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(33);
                    while (true) {
                        if (!C2396b.this.f6898h) {
                            i = 18;
                            break;
                        }
                        try {
                            C2396b.this.m33032X(53, byteArrayOutputStream.toByteArray());
                            i = 0;
                            break;
                        } catch (PinpadException e) {
                            if (e.m33091a() == 8) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                throw e;
                            }
                        }
                    }
                    if (!C2396b.this.f6898h) {
                        byteArrayOutputStream.reset();
                        byteArrayOutputStream.write(34);
                        C2396b.this.m33032X(53, byteArrayOutputStream.toByteArray());
                    }
                } catch (PinpadException e2) {
                    i = e2.m33091a();
                }
            } catch (IOException unused2) {
                i = -1;
            }
            new Thread(new RunnableC2399a(this, this.f6912d, i)).start();
        }
    }

    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC2400c {
        /* renamed from: a */
        void m32977a();
    }

    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC2401d {
        /* renamed from: a */
        void m32976a(byte[] bArr);

        /* renamed from: b */
        void m32975b(byte[] bArr);

        /* renamed from: c */
        void m32974c(int i, int i2, int i3);
    }

    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC2402e {
        void onMagstripeRead();
    }

    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC2403f {
        void onPINEntryComplete(int i);
    }

    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC2404g {
        void onPinpadRelease();
    }

    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$h */
    /* loaded from: classes2.dex */
    private class C2405h extends Thread {
        private C2405h() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int m32992s0;
            int i;
            byte[] bArr = new byte[2056];
            int i2 = 0;
            while (C2396b.this.f6897g == null) {
                if (i2 < 6) {
                    try {
                        m32992s0 = C2396b.this.m32992s0(bArr, i2, 2056 - i2);
                        i2 += m32992s0;
                    } catch (Exception e) {
                        if (C2396b.this.f6897g == null) {
                            if (C2396b.f6890r) {
                                e.printStackTrace();
                            }
                            C2396b.this.f6897g = new IOException(e.getMessage());
                        }
                    }
                } else {
                    int i3 = (bArr[3] & 255) + (bArr[4] & 255) + 6;
                    if (i2 < i3) {
                        m32992s0 = C2396b.this.m32992s0(bArr, i2, 2056 - i2);
                        i2 += m32992s0;
                    } else {
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            i = i3 - 1;
                            if (i4 >= i) {
                                break;
                            }
                            i5 ^= bArr[i4] & 255;
                            i4++;
                        }
                        if (i5 == (bArr[i] & 255)) {
                            int i6 = bArr[1] & 255;
                            if (i6 == 0) {
                                if (C2396b.f6890r) {
                                    System.out.println("packet(" + i3 + "): " + C2396b.m32995r(bArr, 0, i3));
                                }
                                synchronized (C2396b.this.f6894d) {
                                    System.arraycopy(bArr, 0, C2396b.this.f6894d, 0, i3);
                                    C2396b.this.f6895e = i3;
                                    C2396b.this.f6894d.notify();
                                }
                            } else {
                                int i7 = i3 - 6;
                                byte[] bArr2 = new byte[i7];
                                System.arraycopy(bArr, 5, bArr2, 0, i7);
                                if (C2396b.f6890r) {
                                    System.out.println("event " + i6 + "(" + i7 + "): " + C2396b.m32995r(bArr2, 0, i7));
                                }
                                C2396b.this.m33010j0(i6, bArr2);
                            }
                            int i8 = i2 - i3;
                            System.arraycopy(bArr, i3, bArr, 0, i8);
                            i2 = i8;
                        } else {
                            throw new IOException("Invalid packet CRC");
                            break;
                        }
                    }
                }
            }
            C2396b.this.m32998p0();
        }

        /* synthetic */ C2405h(C2396b c2396b, C2405h c2405h) {
            this();
        }
    }

    /* compiled from: Pinpad.java */
    /* renamed from: com.datecs.pinpad.b$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC2406i {
        void onSmartCardInserted();

        void onSmartCardRemoved();
    }

    public C2396b(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("The argument 'in' is null");
        }
        if (outputStream != null) {
            this.f6891a = inputStream;
            this.f6892b = outputStream;
            this.f6896f = 5000;
            this.f6894d = new byte[2056];
            this.f6895e = 0;
            C2405h c2405h = new C2405h(this, null);
            this.f6893c = c2405h;
            c2405h.start();
            try {
                m33020e0();
                return;
            } catch (IOException unused) {
                return;
            }
        }
        throw new IllegalArgumentException("The argument 'out' is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public void m33062H0(byte[] bArr) {
        if (bArr.length < 2) {
            return;
        }
        int i = bArr[0] & 255;
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        PrintStream printStream = System.out;
        printStream.println("Translate event: " + i);
        switch (i) {
            case 129:
                m33006l0(bArr2);
                return;
            case 130:
                m33002n0(length >= 2 ? (bArr2[1] & 255) + ((bArr2[0] & 255) << 8) : 0, length >= 3 ? bArr2[2] & 255 : -1, length >= 5 ? (bArr2[4] & 255) + ((bArr2[3] & 255) << 8) : -1);
                return;
            case 131:
                m33004m0(bArr2);
                return;
            default:
                return;
        }
    }

    /* renamed from: U0 */
    private void m33036U0(byte[] bArr) throws IOException {
        this.f6892b.write(bArr);
        this.f6892b.flush();
        if (f6890r) {
            PrintStream printStream = System.out;
            printStream.println("write(" + bArr.length + "): " + m32997q(bArr));
        }
    }

    /* renamed from: V0 */
    private void m33034V0(int i, byte[] bArr, int i2, int i3) throws IOException {
        byte[] bArr2 = new byte[i3 + 5 + 1];
        bArr2[0] = 62;
        bArr2[1] = (byte) i;
        bArr2[2] = 0;
        bArr2[3] = (byte) (i3 >> 8);
        bArr2[4] = (byte) i3;
        int i4 = 5;
        if (bArr != null && i3 > 0) {
            System.arraycopy(bArr, i2, bArr2, 5, i3);
            i4 = 5 + i3;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 ^= bArr2[i6] & 255;
        }
        bArr2[i4] = (byte) (i5 & 255);
        m33036U0(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public byte[] m33032X(int i, byte[] bArr) throws PinpadException, IOException {
        return m33031Y(i, bArr, this.f6896f);
    }

    /* renamed from: Y */
    private byte[] m33031Y(int i, byte[] bArr, int i2) throws PinpadException, IOException {
        return m33030Z(i, bArr, 0, bArr.length, i2);
    }

    /* renamed from: Z */
    private synchronized byte[] m33030Z(int i, byte[] bArr, int i2, int i3, int i4) throws PinpadException, IOException {
        m32989u();
        m33034V0(i, bArr, i2, i3);
        return m32990t0(i4);
    }

    /* renamed from: a0 */
    private byte[] m33028a0(byte[] bArr) throws PinpadException, IOException {
        byte[] m33032X = m33032X(55, bArr);
        if (m33032X.length >= 2) {
            this.f6907q = (m33032X[0] & 255) + ((m33032X[1] & 255) >> 8);
            int length = m33032X.length - 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(m33032X, 2, bArr2, 0, length);
            return bArr2;
        }
        throw new PinpadException(1);
    }

    /* renamed from: e0 */
    private void m33020e0() throws IOException {
        C2395a m33022d0 = m33022d0();
        this.f6900j = 128;
        this.f6901k = 64;
        if (m33022d0.m33082h() != 2) {
            return;
        }
        this.f6901k = 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m33010j0(int i, byte[] bArr) {
        new Thread(new RunnableC2397a(i, bArr)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public void m33008k0() {
        InterfaceC2400c interfaceC2400c = this.f6904n;
        if (interfaceC2400c != null) {
            interfaceC2400c.m32977a();
        }
    }

    /* renamed from: l0 */
    private void m33006l0(byte[] bArr) {
        InterfaceC2401d interfaceC2401d = this.f6906p;
        if (interfaceC2401d != null) {
            interfaceC2401d.m32976a(bArr);
        }
    }

    /* renamed from: m0 */
    private void m33004m0(byte[] bArr) {
        InterfaceC2401d interfaceC2401d = this.f6906p;
        if (interfaceC2401d != null) {
            interfaceC2401d.m32975b(bArr);
        }
    }

    /* renamed from: n0 */
    private void m33002n0(int i, int i2, int i3) {
        InterfaceC2401d interfaceC2401d = this.f6906p;
        if (interfaceC2401d != null) {
            interfaceC2401d.m32974c(i, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m33000o0() {
        InterfaceC2402e interfaceC2402e = this.f6905o;
        if (interfaceC2402e != null) {
            interfaceC2402e.onMagstripeRead();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public void m32998p0() {
        InterfaceC2404g interfaceC2404g = this.f6902l;
        if (interfaceC2404g != null) {
            interfaceC2404g.onPinpadRelease();
        }
    }

    /* renamed from: q */
    private static final String m32997q(byte[] bArr) {
        return m32995r(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public void m32996q0() {
        InterfaceC2406i interfaceC2406i = this.f6903m;
        if (interfaceC2406i != null) {
            interfaceC2406i.onSmartCardInserted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final String m32995r(byte[] bArr, int i, int i2) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[i2 * 3];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 1;
            int i6 = i + i3;
            cArr2[i4] = cArr[(bArr[i6] >> 4) & 15];
            int i7 = i5 + 1;
            cArr2[i5] = cArr[(bArr[i6] >> 0) & 15];
            cArr2[i7] = ' ';
            i3++;
            i4 = i7 + 1;
        }
        return new String(cArr2, 0, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public void m32994r0() {
        InterfaceC2406i interfaceC2406i = this.f6903m;
        if (interfaceC2406i != null) {
            interfaceC2406i.onSmartCardRemoved();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public int m32992s0(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f6891a.read(bArr, i, i2);
        if (read >= 0) {
            if (f6890r) {
                PrintStream printStream = System.out;
                printStream.println("read(" + read + "): " + m32995r(bArr, i, read));
            }
            return read;
        }
        throw new IOException("The end of stream has been reached.");
    }

    /* renamed from: t0 */
    private byte[] m32990t0(long j) throws PinpadException, IOException {
        byte[] bArr;
        long currentTimeMillis = System.currentTimeMillis() + j;
        while (this.f6895e == 0) {
            if (currentTimeMillis >= System.currentTimeMillis()) {
                synchronized (this.f6894d) {
                    try {
                        this.f6894d.wait(10L);
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                throw new IOException("Operation timeout expired");
            }
        }
        synchronized (this.f6894d) {
            int i = this.f6894d[2] & 255;
            if (i != 0) {
                PinpadException pinpadException = new PinpadException(i);
                if (f6890r) {
                    PrintStream printStream = System.out;
                    printStream.println("throw PinpadException('" + pinpadException.getMessage() + "')");
                }
                throw pinpadException;
            }
            int i2 = (this.f6894d[3] & 255) + (this.f6894d[4] & 255);
            bArr = new byte[i2];
            System.arraycopy(this.f6894d, 5, bArr, 0, i2);
            this.f6895e = 0;
        }
        return bArr;
    }

    /* renamed from: u */
    private void m32989u() {
        synchronized (this.f6894d) {
            this.f6895e = 0;
        }
    }

    /* renamed from: z0 */
    public static void m32978z0(boolean z) {
        f6890r = z;
    }

    /* renamed from: A */
    public void m33077A() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(18);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: A0 */
    public void m33076A0(InterfaceC2402e interfaceC2402e) {
        this.f6905o = interfaceC2402e;
    }

    /* renamed from: B */
    public void m33075B(boolean z) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(9);
        byteArrayOutputStream.write(z ? 1 : 0);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: B0 */
    public void m33074B0(InterfaceC2404g interfaceC2404g) {
        this.f6902l = interfaceC2404g;
    }

    /* renamed from: C */
    public void m33073C() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: C0 */
    public void m33072C0(InterfaceC2406i interfaceC2406i) {
        this.f6903m = interfaceC2406i;
    }

    /* renamed from: D */
    public void m33071D(int i, int i2) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(15);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: D0 */
    public void m33070D0(int i, int i2, int i3) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i >> 8);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(i2 >> 8);
        byteArrayOutputStream.write(i3 / 2);
        m33032X(54, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: E */
    public void m33069E() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(12);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: E0 */
    public void m33068E0(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(16);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i >> 8);
        byteArrayOutputStream.write(i >> 16);
        byteArrayOutputStream.write(i >> 24);
        m33032X(54, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: F */
    public C2408b m33067F() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byte[] m33028a0 = m33028a0(byteArrayOutputStream.toByteArray());
        int i = this.f6907q;
        int i2 = 2;
        if ((i == 1 || i == 2) && m33028a0.length >= 2) {
            boolean z = m33028a0[0] != 0;
            ArrayList arrayList = new ArrayList();
            while (i2 + 2 < m33028a0.length) {
                int i3 = m33028a0[i2] & 255;
                int i4 = i2 + 1;
                byte[] bArr = new byte[i3];
                System.arraycopy(m33028a0, i4, bArr, 0, i3);
                int i5 = i4 + i3;
                int i6 = m33028a0[i5] & 255;
                int i7 = i5 + 1;
                byte[] bArr2 = new byte[i6];
                System.arraycopy(m33028a0, i7, bArr2, 0, i6);
                i2 = i7 + i6;
                arrayList.add(new C2407a(bArr, bArr2, 0));
            }
            C2407a[] c2407aArr = new C2407a[arrayList.size()];
            arrayList.toArray(c2407aArr);
            return new C2408b(z, c2407aArr);
        }
        return null;
    }

    /* renamed from: F0 */
    public void m33066F0(Calendar calendar) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(calendar.get(1) - 2000);
        byteArrayOutputStream.write(calendar.get(2) + 1);
        byteArrayOutputStream.write(calendar.get(5));
        byteArrayOutputStream.write(calendar.get(11));
        byteArrayOutputStream.write(calendar.get(12));
        byteArrayOutputStream.write(calendar.get(13));
        m33032X(54, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: G */
    public byte[] m33065G(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(28);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i >> 8);
        byte[] m33028a0 = m33028a0(byteArrayOutputStream.toByteArray());
        if (this.f6907q != 0) {
            return null;
        }
        return m33028a0;
    }

    /* renamed from: G0 */
    public void m33064G0(boolean z) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(5);
        byteArrayOutputStream.write(z ? 1 : 0);
        m33032X(54, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: H */
    public String m33063H(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(29);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i >> 8);
        byte[] m33028a0 = m33028a0(byteArrayOutputStream.toByteArray());
        if (this.f6907q != 0) {
            return null;
        }
        return new String(m33028a0);
    }

    /* renamed from: I */
    public int m33061I() {
        return this.f6907q;
    }

    /* renamed from: I0 */
    public void m33060I0(String str) throws PinpadException, IOException {
        m33058J0(str.getBytes());
    }

    /* renamed from: J */
    public byte[] m33059J(int i, int i2, byte[] bArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(130);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2 >> 24);
        byteArrayOutputStream.write(i2 >> 16);
        byteArrayOutputStream.write(i2 >> 8);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(bArr);
        return m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: J0 */
    public void m33058J0(byte[] bArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(bArr);
        m33032X(53, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: K */
    public void m33057K() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: K0 */
    public void m33056K0(int i, int i2, int i3, char c, String str, InterfaceC2403f interfaceC2403f) throws PinpadException, IOException {
        m33054L0(i, i2, i3, c, str.getBytes(), interfaceC2403f);
    }

    /* renamed from: L */
    public void m33055L(byte[] bArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(7);
        byteArrayOutputStream.write(bArr);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: L0 */
    public void m33054L0(int i, int i2, int i3, char c, byte[] bArr, InterfaceC2403f interfaceC2403f) throws PinpadException, IOException {
        if (interfaceC2403f != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(32);
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(i3);
            byteArrayOutputStream.write(c);
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(0);
            m33032X(53, byteArrayOutputStream.toByteArray());
            this.f6898h = true;
            Thread thread = new Thread(new RunnableC2398b(interfaceC2403f));
            this.f6899i = thread;
            thread.start();
            return;
        }
        throw new NullPointerException("The parameter 'l' is null");
    }

    /* renamed from: M */
    public void m33053M(int i, boolean z, C2407a[] c2407aArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(5);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(z ? 1 : 0);
        byteArrayOutputStream.write(c2407aArr.length);
        for (C2407a c2407a : c2407aArr) {
            byteArrayOutputStream.write(c2407a.m32973a().length);
            byteArrayOutputStream.write(c2407a.m32973a());
            byteArrayOutputStream.write(c2407a.m32970d());
            byteArrayOutputStream.write(c2407a.m32972b());
            byteArrayOutputStream.write(0);
        }
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: M0 */
    public void m33052M0(int i, int i2, int i3, int i4, int i5) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(11);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(i3);
        byteArrayOutputStream.write(i4);
        byteArrayOutputStream.write(i5);
        m33032X(53, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: N */
    public void m33051N() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(16);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: N0 */
    public void m33050N0(int i) throws PinpadException, IOException {
        m33052M0(0, 0, m33024c0(), m33026b0(), i);
    }

    /* renamed from: O */
    public void m33049O() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(10);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: O0 */
    public void m33048O0() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(35);
        m33032X(53, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: P */
    public void m33047P(int[] iArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(8);
        byteArrayOutputStream.write(0);
        for (int i : iArr) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >> 8);
        }
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: P0 */
    public void m33046P0(boolean z) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(z ? 1 : 0);
        m33032X(53, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: Q */
    public void m33045Q(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(19);
        byteArrayOutputStream.write(i);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: Q0 */
    public void m33044Q0(int i, int i2, int i3, int i4, int i5, int i6) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(5);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(i3);
        byteArrayOutputStream.write(i4);
        byteArrayOutputStream.write(i5);
        byteArrayOutputStream.write(i6);
        m33032X(53, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: R */
    public void m33043R(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(13);
        byteArrayOutputStream.write(i);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: R0 */
    public int m33042R0() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        return m33032X(53, byteArrayOutputStream.toByteArray())[0] & 255;
    }

    /* renamed from: S */
    public void m33041S(int i, byte[] bArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(26);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i >> 8);
        byteArrayOutputStream.write(bArr);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: S0 */
    public void m33040S0(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(16);
        if (i == -1) {
            byteArrayOutputStream.write(3);
        } else {
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        m33032X(53, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: T */
    public void m33039T(int i, String str) throws PinpadException, IOException {
        m33037U(i, str.getBytes());
    }

    /* renamed from: T0 */
    public byte[] m33038T0(int i, int i2, byte[] bArr, int i3, byte[] bArr2) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(10);
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(i3);
        if (i2 == 5) {
            byteArrayOutputStream.write("0000000000000".getBytes());
        } else if (bArr2 != null) {
            byteArrayOutputStream.write(bArr2);
        }
        return m33032X(53, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: U */
    public void m33037U(int i, byte[] bArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(27);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i >> 8);
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(0);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: V */
    public void m33035V(boolean z) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(11);
        byteArrayOutputStream.write(z ? 1 : 0);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: W */
    public void m33033W() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(14);
        m33028a0(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: b0 */
    public int m33026b0() {
        return this.f6901k;
    }

    /* renamed from: c0 */
    public int m33024c0() {
        return this.f6900j;
    }

    /* renamed from: d0 */
    public C2395a m33022d0() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(9);
        return C2395a.m33078l(m33032X(54, byteArrayOutputStream.toByteArray()));
    }

    /* renamed from: f0 */
    public byte[] m33018f0(int i, int i2) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(10);
        byteArrayOutputStream.write(135);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2 >> 24);
        byteArrayOutputStream.write(i2 >> 16);
        byteArrayOutputStream.write(i2 >> 8);
        byteArrayOutputStream.write(i2);
        return m33032X(52, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: g0 */
    public String m33016g0() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(13);
        return new String(m33032X(52, byteArrayOutputStream.toByteArray()));
    }

    /* renamed from: h0 */
    public byte[] m33014h0(int i, int i2, int i3) throws PinpadException, IOException {
        if (i < 0 || i > 6) {
            throw new IllegalArgumentException("The argument 'unmaskedDigitsAtStart' must be between 0 and 6");
        }
        if (i2 < 0 || i2 > 4) {
            throw new IllegalArgumentException("The argument 'unmaskedDigitsAtEnd' must be between 0 and 4");
        }
        if (i3 >= 0 && i3 <= 7) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(11);
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(i3);
            return m33032X(52, byteArrayOutputStream.toByteArray());
        }
        throw new IllegalArgumentException("The argument 'unmaskedDigitsAfter' must be between 0 and 7");
    }

    /* renamed from: i0 */
    public void m33012i0() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        m33032X(52, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: s */
    public void m32993s(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(bArr2.length);
        byteArrayOutputStream.write(bArr3.length);
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        m33032X(50, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: t */
    public void m32991t() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        m33032X(50, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: u0 */
    public synchronized void m32988u0() {
        this.f6897g = new IOException("The object is released");
        try {
            this.f6891a.close();
        } catch (IOException unused) {
        }
        try {
            this.f6892b.close();
        } catch (IOException unused2) {
        }
    }

    /* renamed from: v */
    public void m32987v(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(9);
        byteArrayOutputStream.write(i);
        m33032X(49, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: v0 */
    public void m32986v0(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(i);
        m33032X(51, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: w */
    public byte[] m32985w(int i, int i2, int i3, int i4, byte[] bArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(13);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(i3);
        if (i3 == 0) {
            i4 = 0;
        }
        byteArrayOutputStream.write(i4);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(bArr);
        return m33032X(49, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: w0 */
    public byte[] m32984w0(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(i);
        return m33032X(51, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: x */
    public void m32983x() throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(5);
        m33032X(49, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: x0 */
    public void m32982x0(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(4);
        byteArrayOutputStream.write(i);
        m33032X(51, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: y */
    public byte[] m32981y(int i) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(i);
        return m33032X(50, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: y0 */
    public void m32980y0(int i, int i2, int i3) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(i3);
        m33032X(51, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: z */
    public void m32979z(boolean z, byte[] bArr) throws PinpadException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(4);
        byteArrayOutputStream.write(z ? 1 : 0);
        byteArrayOutputStream.write(bArr);
        m33028a0(byteArrayOutputStream.toByteArray());
    }
}
