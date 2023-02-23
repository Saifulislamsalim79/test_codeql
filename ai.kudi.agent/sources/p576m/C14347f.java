package p576m;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* compiled from: ByteString.java */
/* renamed from: m.f */
/* loaded from: classes3.dex */
public class C14347f implements Serializable, Comparable<C14347f> {

    /* renamed from: f */
    static final char[] f31622f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: w */
    public static final C14347f f31623w = m2034r(new byte[0]);

    /* renamed from: c */
    final byte[] f31624c;

    /* renamed from: d */
    transient int f31625d;

    /* renamed from: e */
    transient String f31626e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14347f(byte[] bArr) {
        this.f31624c = bArr;
    }

    /* renamed from: b */
    static int m2041b(String str, int i) {
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
    public static C14347f m2039g(String str) {
        if (str != null) {
            byte[] m2078a = C14341b.m2078a(str);
            if (m2078a != null) {
                return new C14347f(m2078a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: h */
    public static C14347f m2038h(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((m2037i(str.charAt(i2)) << 4) + m2037i(str.charAt(i2 + 1)));
                }
                return m2034r(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        throw new IllegalArgumentException("hex == null");
    }

    /* renamed from: i */
    private static int m2037i(char c) {
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
    private C14347f m2036j(String str) {
        try {
            return m2034r(MessageDigest.getInstance(str).digest(this.f31624c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: m */
    public static C14347f m2035m(String str) {
        if (str != null) {
            C14347f c14347f = new C14347f(str.getBytes(C14368u.f31667a));
            c14347f.f31626e = str;
            return c14347f;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: r */
    public static C14347f m2034r(byte... bArr) {
        if (bArr != null) {
            return new C14347f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: A */
    public int mo1969A() {
        return this.f31624c.length;
    }

    /* renamed from: C */
    public final boolean m2042C(C14347f c14347f) {
        return mo1957v(0, c14347f, 0, c14347f.mo1969A());
    }

    /* renamed from: F */
    public C14347f mo1968F(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f31624c;
            if (i2 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f31624c.length + ")");
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(this.f31624c, i, bArr2, 0, i3);
                return new C14347f(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    /* renamed from: I */
    public C14347f mo1967I() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f31624c;
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
                return new C14347f(bArr2);
            }
            i++;
        }
    }

    /* renamed from: J */
    public byte[] mo1966J() {
        return (byte[]) this.f31624c.clone();
    }

    /* renamed from: M */
    public String mo1965M() {
        String str = this.f31626e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f31624c, C14368u.f31667a);
        this.f31626e = str2;
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo1964O(C14342c c14342c) {
        byte[] bArr = this.f31624c;
        c14342c.m2062X0(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public String mo1961a() {
        return C14341b.m2077b(this.f31624c);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(C14347f c14347f) {
        int mo1969A = mo1969A();
        int mo1969A2 = c14347f.mo1969A();
        int min = Math.min(mo1969A, mo1969A2);
        for (int i = 0; i < min; i++) {
            int mo1960n = mo1960n(i) & 255;
            int mo1960n2 = c14347f.mo1960n(i) & 255;
            if (mo1960n != mo1960n2) {
                return mo1960n < mo1960n2 ? -1 : 1;
            }
        }
        if (mo1969A == mo1969A2) {
            return 0;
        }
        return mo1969A < mo1969A2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14347f) {
            C14347f c14347f = (C14347f) obj;
            int mo1969A = c14347f.mo1969A();
            byte[] bArr = this.f31624c;
            if (mo1969A == bArr.length && c14347f.mo1956w(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f31625d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f31624c);
        this.f31625d = hashCode;
        return hashCode;
    }

    /* renamed from: n */
    public byte mo1960n(int i) {
        return this.f31624c[i];
    }

    /* renamed from: p */
    public String mo1959p() {
        byte[] bArr = this.f31624c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f31622f;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: q */
    public C14347f mo1958q() {
        return m2036j("MD5");
    }

    public String toString() {
        if (this.f31624c.length == 0) {
            return "[size=0]";
        }
        String mo1965M = mo1965M();
        int m2041b = m2041b(mo1965M, 64);
        if (m2041b == -1) {
            if (this.f31624c.length <= 64) {
                return "[hex=" + mo1959p() + "]";
            }
            return "[size=" + this.f31624c.length + " hex=" + mo1968F(0, 64).mo1959p() + "…]";
        }
        String replace = mo1965M.substring(0, m2041b).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (m2041b < mo1965M.length()) {
            return "[size=" + this.f31624c.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
    }

    /* renamed from: v */
    public boolean mo1957v(int i, C14347f c14347f, int i2, int i3) {
        return c14347f.mo1956w(i2, this.f31624c, i, i3);
    }

    /* renamed from: w */
    public boolean mo1956w(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f31624c;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C14368u.m1945a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public C14347f mo1955y() {
        return m2036j("SHA-1");
    }

    /* renamed from: z */
    public C14347f mo1954z() {
        return m2036j("SHA-256");
    }
}
