package p425j.p429b.p433b;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* compiled from: ByteString.java */
/* renamed from: j.b.b.f */
/* loaded from: classes3.dex */
public class C11152f implements Serializable, Comparable<C11152f> {

    /* renamed from: f */
    static final char[] f25216f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: w */
    public static final C11152f f25217w = m11538w(new byte[0]);

    /* renamed from: c */
    final byte[] f25218c;

    /* renamed from: d */
    transient int f25219d;

    /* renamed from: e */
    transient String f25220e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11152f(byte[] bArr) {
        this.f25218c = bArr;
    }

    /* renamed from: b */
    static int m11546b(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: g */
    public static C11152f m11544g(String str) {
        if (str != null) {
            byte[] m11588a = C11145b.m11588a(str);
            if (m11588a != null) {
                return new C11152f(m11588a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: h */
    public static C11152f m11543h(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((m11542i(str.charAt(i2)) << 4) + m11542i(str.charAt(i2 + 1)));
                }
                return m11538w(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        throw new IllegalArgumentException("hex == null");
    }

    /* renamed from: i */
    private static int m11542i(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c);
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    /* renamed from: j */
    private C11152f m11541j(String str) {
        try {
            return m11538w(MessageDigest.getInstance(str).digest(this.f25218c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: m */
    public static C11152f m11540m(String str, Charset charset) {
        if (str != null) {
            if (charset != null) {
                return new C11152f(str.getBytes(charset));
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: n */
    public static C11152f m11539n(String str) {
        if (str != null) {
            C11152f c11152f = new C11152f(str.getBytes(C11173u.f25255a));
            c11152f.f25220e = str;
            return c11152f;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: w */
    public static C11152f m11538w(byte... bArr) {
        if (bArr != null) {
            return new C11152f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: A */
    public C11152f mo11472A() {
        return m11541j("SHA-1");
    }

    /* renamed from: C */
    public C11152f mo11471C() {
        return m11541j("SHA-256");
    }

    /* renamed from: F */
    public int mo11470F() {
        return this.f25218c.length;
    }

    /* renamed from: I */
    public final boolean m11547I(C11152f c11152f) {
        return mo11457y(0, c11152f, 0, c11152f.mo11470F());
    }

    /* renamed from: J */
    public C11152f mo11469J(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f25218c;
            if (i2 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f25218c.length + ")");
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(this.f25218c, i, bArr2, 0, i3);
                return new C11152f(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    /* renamed from: M */
    public C11152f mo11468M() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f25218c;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C11152f(bArr2);
            }
            i++;
        }
    }

    /* renamed from: O */
    public byte[] mo11467O() {
        return (byte[]) this.f25218c.clone();
    }

    /* renamed from: P */
    public String mo11466P() {
        String str = this.f25220e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f25218c, C11173u.f25255a);
        this.f25220e = str2;
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo11465Q(C11146c c11146c) {
        byte[] bArr = this.f25218c;
        c11146c.m11569b1(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public String mo11462a() {
        return C11145b.m11587b(this.f25218c);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(C11152f c11152f) {
        int mo11470F = mo11470F();
        int mo11470F2 = c11152f.mo11470F();
        int min = Math.min(mo11470F, mo11470F2);
        for (int i = 0; i < min; i++) {
            int mo11461p = mo11461p(i) & 255;
            int mo11461p2 = c11152f.mo11461p(i) & 255;
            if (mo11461p != mo11461p2) {
                return mo11461p < mo11461p2 ? -1 : 1;
            }
        }
        if (mo11470F == mo11470F2) {
            return 0;
        }
        return mo11470F < mo11470F2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11152f) {
            C11152f c11152f = (C11152f) obj;
            int mo11470F = c11152f.mo11470F();
            byte[] bArr = this.f25218c;
            if (mo11470F == bArr.length && c11152f.mo11456z(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f25219d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f25218c);
        this.f25219d = hashCode;
        return hashCode;
    }

    /* renamed from: p */
    public byte mo11461p(int i) {
        return this.f25218c[i];
    }

    /* renamed from: q */
    public String mo11460q() {
        byte[] bArr = this.f25218c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f25216f;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public byte[] mo11459r() {
        return this.f25218c;
    }

    public String toString() {
        if (this.f25218c.length == 0) {
            return "[size=0]";
        }
        String mo11466P = mo11466P();
        int m11546b = m11546b(mo11466P, 64);
        if (m11546b == -1) {
            if (this.f25218c.length <= 64) {
                return "[hex=" + mo11460q() + "]";
            }
            return "[size=" + this.f25218c.length + " hex=" + mo11469J(0, 64).mo11460q() + "…]";
        }
        String replace = mo11466P.substring(0, m11546b).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (m11546b < mo11466P.length()) {
            return "[size=" + this.f25218c.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
    }

    /* renamed from: v */
    public C11152f mo11458v() {
        return m11541j("MD5");
    }

    /* renamed from: y */
    public boolean mo11457y(int i, C11152f c11152f, int i2, int i3) {
        return c11152f.mo11456z(i2, this.f25218c, i, i3);
    }

    /* renamed from: z */
    public boolean mo11456z(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f25218c;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C11173u.m11455a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }
}
