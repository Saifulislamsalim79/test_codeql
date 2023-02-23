package io.grpc.p384h1;

import com.google.common.base.C5051n;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GzipInflatingBuffer.java */
/* renamed from: io.grpc.h1.s0 */
/* loaded from: classes2.dex */
public class C9775s0 implements Closeable {

    /* renamed from: B */
    private int f22953B;

    /* renamed from: C */
    private int f22954C;

    /* renamed from: D */
    private long f22955D;

    /* renamed from: w */
    private int f22963w;

    /* renamed from: x */
    private int f22964x;

    /* renamed from: y */
    private Inflater f22965y;

    /* renamed from: c */
    private final C9784u f22959c = new C9784u();

    /* renamed from: d */
    private final CRC32 f22960d = new CRC32();

    /* renamed from: e */
    private final C9777b f22961e = new C9777b(this, null);

    /* renamed from: f */
    private final byte[] f22962f = new byte[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];

    /* renamed from: z */
    private EnumC9778c f22966z = EnumC9778c.HEADER;

    /* renamed from: A */
    private boolean f22952A = false;

    /* renamed from: E */
    private int f22956E = 0;

    /* renamed from: F */
    private int f22957F = 0;

    /* renamed from: G */
    private boolean f22958G = true;

    /* compiled from: GzipInflatingBuffer.java */
    /* renamed from: io.grpc.h1.s0$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C9776a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22967a;

        static {
            int[] iArr = new int[EnumC9778c.values().length];
            f22967a = iArr;
            try {
                iArr[EnumC9778c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22967a[EnumC9778c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22967a[EnumC9778c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22967a[EnumC9778c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22967a[EnumC9778c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22967a[EnumC9778c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22967a[EnumC9778c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22967a[EnumC9778c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22967a[EnumC9778c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22967a[EnumC9778c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GzipInflatingBuffer.java */
    /* renamed from: io.grpc.h1.s0$b */
    /* loaded from: classes2.dex */
    public class C9777b {
        private C9777b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public boolean m14000g() {
            while (m13996k() > 0) {
                if (m13999h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public int m13999h() {
            int readUnsignedByte;
            if (C9775s0.this.f22964x - C9775s0.this.f22963w > 0) {
                readUnsignedByte = C9775s0.this.f22962f[C9775s0.this.f22963w] & 255;
                C9775s0.m14012m(C9775s0.this, 1);
            } else {
                readUnsignedByte = C9775s0.this.f22959c.readUnsignedByte();
            }
            C9775s0.this.f22960d.update(readUnsignedByte);
            C9775s0.m14024O(C9775s0.this, 1);
            return readUnsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public long m13998i() {
            return m13997j() | (m13997j() << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public int m13997j() {
            return m13999h() | (m13999h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public int m13996k() {
            return (C9775s0.this.f22964x - C9775s0.this.f22963w) + C9775s0.this.f22959c.mo13566h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m13995l(int i) {
            int i2;
            int i3 = C9775s0.this.f22964x - C9775s0.this.f22963w;
            if (i3 > 0) {
                int min = Math.min(i3, i);
                C9775s0.this.f22960d.update(C9775s0.this.f22962f, C9775s0.this.f22963w, min);
                C9775s0.m14012m(C9775s0.this, min);
                i2 = i - min;
            } else {
                i2 = i;
            }
            if (i2 > 0) {
                byte[] bArr = new byte[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];
                int i4 = 0;
                while (i4 < i2) {
                    int min2 = Math.min(i2 - i4, (int) IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
                    C9775s0.this.f22959c.mo13565n0(bArr, 0, min2);
                    C9775s0.this.f22960d.update(bArr, 0, min2);
                    i4 += min2;
                }
            }
            C9775s0.m14024O(C9775s0.this, i);
        }

        /* synthetic */ C9777b(C9775s0 c9775s0, C9776a c9776a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GzipInflatingBuffer.java */
    /* renamed from: io.grpc.h1.s0$c */
    /* loaded from: classes2.dex */
    public enum EnumC9778c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    /* renamed from: A0 */
    private boolean m14029A0() {
        if ((this.f22953B & 8) == 8) {
            if (this.f22961e.m14000g()) {
                this.f22966z = EnumC9778c.HEADER_COMMENT;
                return true;
            }
            return false;
        }
        this.f22966z = EnumC9778c.HEADER_COMMENT;
        return true;
    }

    /* renamed from: C0 */
    private boolean m14028C0() throws ZipException {
        if (this.f22965y != null && this.f22961e.m13996k() <= 18) {
            this.f22965y.end();
            this.f22965y = null;
        }
        if (this.f22961e.m13996k() < 8) {
            return false;
        }
        if (this.f22960d.getValue() == this.f22961e.m13998i() && this.f22955D == this.f22961e.m13998i()) {
            this.f22960d.reset();
            this.f22966z = EnumC9778c.HEADER;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    /* renamed from: O */
    static /* synthetic */ int m14024O(C9775s0 c9775s0, int i) {
        int i2 = c9775s0.f22956E + i;
        c9775s0.f22956E = i2;
        return i2;
    }

    /* renamed from: V */
    private boolean m14022V() {
        C5051n.m25773u(this.f22965y != null, "inflater is null");
        C5051n.m25773u(this.f22963w == this.f22964x, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f22959c.mo13566h(), (int) IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        if (min == 0) {
            return false;
        }
        this.f22963w = 0;
        this.f22964x = min;
        this.f22959c.mo13565n0(this.f22962f, 0, min);
        this.f22965y.setInput(this.f22962f, this.f22963w, min);
        this.f22966z = EnumC9778c.INFLATING;
        return true;
    }

    /* renamed from: f0 */
    private int m14017f0(byte[] bArr, int i, int i2) throws DataFormatException, ZipException {
        C5051n.m25773u(this.f22965y != null, "inflater is null");
        try {
            int totalIn = this.f22965y.getTotalIn();
            int inflate = this.f22965y.inflate(bArr, i, i2);
            int totalIn2 = this.f22965y.getTotalIn() - totalIn;
            this.f22956E += totalIn2;
            this.f22957F += totalIn2;
            this.f22963w += totalIn2;
            this.f22960d.update(bArr, i, inflate);
            if (this.f22965y.finished()) {
                this.f22955D = this.f22965y.getBytesWritten() & 4294967295L;
                this.f22966z = EnumC9778c.TRAILER;
            } else if (this.f22965y.needsInput()) {
                this.f22966z = EnumC9778c.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (DataFormatException e) {
            throw new DataFormatException("Inflater data format exception: " + e.getMessage());
        }
    }

    /* renamed from: i0 */
    private boolean m14014i0() {
        Inflater inflater = this.f22965y;
        if (inflater == null) {
            this.f22965y = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f22960d.reset();
        int i = this.f22964x;
        int i2 = this.f22963w;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f22965y.setInput(this.f22962f, i2, i3);
            this.f22966z = EnumC9778c.INFLATING;
        } else {
            this.f22966z = EnumC9778c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    /* renamed from: m */
    static /* synthetic */ int m14012m(C9775s0 c9775s0, int i) {
        int i2 = c9775s0.f22963w + i;
        c9775s0.f22963w = i2;
        return i2;
    }

    /* renamed from: o0 */
    private boolean m14011o0() throws ZipException {
        if (this.f22961e.m13996k() < 10) {
            return false;
        }
        if (this.f22961e.m13997j() == 35615) {
            if (this.f22961e.m13999h() == 8) {
                this.f22953B = this.f22961e.m13999h();
                this.f22961e.m13995l(6);
                this.f22966z = EnumC9778c.HEADER_EXTRA_LEN;
                return true;
            }
            throw new ZipException("Unsupported compression method");
        }
        throw new ZipException("Not in GZIP format");
    }

    /* renamed from: u0 */
    private boolean m14010u0() {
        if ((this.f22953B & 16) == 16) {
            if (this.f22961e.m14000g()) {
                this.f22966z = EnumC9778c.HEADER_CRC;
                return true;
            }
            return false;
        }
        this.f22966z = EnumC9778c.HEADER_CRC;
        return true;
    }

    /* renamed from: w0 */
    private boolean m14009w0() throws ZipException {
        if ((this.f22953B & 2) == 2) {
            if (this.f22961e.m13996k() < 2) {
                return false;
            }
            if ((65535 & ((int) this.f22960d.getValue())) == this.f22961e.m13997j()) {
                this.f22966z = EnumC9778c.INITIALIZE_INFLATER;
                return true;
            }
            throw new ZipException("Corrupt GZIP header");
        }
        this.f22966z = EnumC9778c.INITIALIZE_INFLATER;
        return true;
    }

    /* renamed from: x0 */
    private boolean m14008x0() {
        int m13996k = this.f22961e.m13996k();
        int i = this.f22954C;
        if (m13996k < i) {
            return false;
        }
        this.f22961e.m13995l(i);
        this.f22966z = EnumC9778c.HEADER_NAME;
        return true;
    }

    /* renamed from: z0 */
    private boolean m14007z0() {
        if ((this.f22953B & 4) == 4) {
            if (this.f22961e.m13996k() < 2) {
                return false;
            }
            this.f22954C = this.f22961e.m13997j();
            this.f22966z = EnumC9778c.HEADER_EXTRA;
            return true;
        }
        this.f22966z = EnumC9778c.HEADER_NAME;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m14023P(InterfaceC9802v1 interfaceC9802v1) {
        C5051n.m25773u(!this.f22952A, "GzipInflatingBuffer is closed");
        this.f22959c.m13982g(interfaceC9802v1);
        this.f22958G = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public int m14021X() {
        int i = this.f22956E;
        this.f22956E = 0;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public int m14020Z() {
        int i = this.f22957F;
        this.f22957F = 0;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean m14019b0() {
        C5051n.m25773u(!this.f22952A, "GzipInflatingBuffer is closed");
        return (this.f22961e.m13996k() == 0 && this.f22966z == EnumC9778c.HEADER) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f22952A) {
            return;
        }
        this.f22952A = true;
        this.f22959c.close();
        Inflater inflater = this.f22965y;
        if (inflater != null) {
            inflater.end();
            this.f22965y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public int m14015g0(byte[] bArr, int i, int i2) throws DataFormatException, ZipException {
        boolean z = true;
        C5051n.m25773u(!this.f22952A, "GzipInflatingBuffer is closed");
        boolean z2 = true;
        int i3 = 0;
        while (z2) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                switch (C9776a.f22967a[this.f22966z.ordinal()]) {
                    case 1:
                        z2 = m14011o0();
                        break;
                    case 2:
                        z2 = m14007z0();
                        break;
                    case 3:
                        z2 = m14008x0();
                        break;
                    case 4:
                        z2 = m14029A0();
                        break;
                    case 5:
                        z2 = m14010u0();
                        break;
                    case 6:
                        z2 = m14009w0();
                        break;
                    case 7:
                        z2 = m14014i0();
                        break;
                    case 8:
                        i3 += m14017f0(bArr, i + i3, i4);
                        if (this.f22966z != EnumC9778c.TRAILER) {
                            z2 = true;
                            break;
                        } else {
                            z2 = m14028C0();
                            break;
                        }
                    case 9:
                        z2 = m14022V();
                        break;
                    case 10:
                        z2 = m14028C0();
                        break;
                    default:
                        throw new AssertionError("Invalid state: " + this.f22966z);
                }
            } else {
                if (z2 && (this.f22966z != EnumC9778c.HEADER || this.f22961e.m13996k() >= 10)) {
                    z = false;
                }
                this.f22958G = z;
                return i3;
            }
        }
        if (z2) {
            z = false;
        }
        this.f22958G = z;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public boolean m14013k0() {
        C5051n.m25773u(!this.f22952A, "GzipInflatingBuffer is closed");
        return this.f22958G;
    }
}
