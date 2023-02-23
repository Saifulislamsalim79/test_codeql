package io.intercom.com.google.gson.stream;

import io.intercom.com.google.gson.p418t.AbstractC10966f;
import io.intercom.com.google.gson.p418t.p419n.C10994e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
/* compiled from: JsonReader.java */
/* renamed from: io.intercom.com.google.gson.stream.a */
/* loaded from: classes3.dex */
public class C10939a implements Closeable {

    /* renamed from: H */
    private static final char[] f24900H = ")]}'\n".toCharArray();

    /* renamed from: A */
    private long f24901A;

    /* renamed from: B */
    private int f24902B;

    /* renamed from: C */
    private String f24903C;

    /* renamed from: D */
    private int[] f24904D;

    /* renamed from: E */
    private int f24905E;

    /* renamed from: F */
    private String[] f24906F;

    /* renamed from: G */
    private int[] f24907G;

    /* renamed from: c */
    private final Reader f24908c;

    /* renamed from: d */
    private boolean f24909d = false;

    /* renamed from: e */
    private final char[] f24910e = new char[1024];

    /* renamed from: f */
    private int f24911f = 0;

    /* renamed from: w */
    private int f24912w = 0;

    /* renamed from: x */
    private int f24913x = 0;

    /* renamed from: y */
    private int f24914y = 0;

    /* renamed from: z */
    int f24915z = 0;

    /* compiled from: JsonReader.java */
    /* renamed from: io.intercom.com.google.gson.stream.a$a */
    /* loaded from: classes3.dex */
    static class C10940a extends AbstractC10966f {
        C10940a() {
        }

        @Override // io.intercom.com.google.gson.p418t.AbstractC10966f
        /* renamed from: a */
        public void mo11824a(C10939a c10939a) throws IOException {
            if (c10939a instanceof C10994e) {
                ((C10994e) c10939a).m11779d1();
                return;
            }
            int i = c10939a.f24915z;
            if (i == 0) {
                i = c10939a.m11900I();
            }
            if (i == 13) {
                c10939a.f24915z = 9;
            } else if (i == 12) {
                c10939a.f24915z = 8;
            } else if (i == 14) {
                c10939a.f24915z = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + c10939a.mo11789C0() + c10939a.m11890b0());
            }
        }
    }

    static {
        AbstractC10966f.f24970a = new C10940a();
    }

    public C10939a(Reader reader) {
        int[] iArr = new int[32];
        this.f24904D = iArr;
        this.f24905E = 0;
        this.f24905E = 0 + 1;
        iArr[0] = 6;
        this.f24906F = new String[32];
        this.f24907G = new int[32];
        if (reader != null) {
            this.f24908c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m11889m();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m11906A0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f24911f
            int r4 = r3 + r2
            int r5 = r6.f24912w
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f24910e
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m11889m()
            goto L5c
        L4e:
            char[] r3 = r6.f24910e
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m11896P(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f24910e
            int r4 = r6.f24911f
            r1.append(r3, r4, r2)
            int r3 = r6.f24911f
            int r3 = r3 + r2
            r6.f24911f = r3
            r2 = 1
            boolean r2 = r6.m11896P(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f24910e
            int r3 = r6.f24911f
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f24910e
            int r3 = r6.f24911f
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f24911f
            int r2 = r2 + r0
            r6.f24911f = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.com.google.gson.stream.C10939a.m11906A0():java.lang.String");
    }

    /* renamed from: D0 */
    private int m11905D0() throws IOException {
        int i;
        String str;
        String str2;
        char c = this.f24910e[this.f24911f];
        if (c == 't' || c == 'T') {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f24911f + i2 >= this.f24912w && !m11896P(i2 + 1)) {
                return 0;
            }
            char c2 = this.f24910e[this.f24911f + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f24911f + length < this.f24912w || m11896P(length + 1)) && m11891Z(this.f24910e[this.f24911f + length])) {
            return 0;
        }
        this.f24911f += length;
        this.f24915z = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        if (m11891Z(r14) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
        r18.f24901A = r11;
        r18.f24911f += r8;
        r18.f24915z = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c3, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c6, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c8, code lost:
        r18.f24902B = r8;
        r18.f24915z = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ce, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cf, code lost:
        return 0;
     */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m11904E0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.com.google.gson.stream.C10939a.m11904E0():int");
    }

    /* renamed from: F */
    private void m11903F() throws IOException {
        m11888u0(true);
        int i = this.f24911f - 1;
        this.f24911f = i;
        char[] cArr = f24900H;
        if (i + cArr.length > this.f24912w && !m11896P(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = f24900H;
            if (i2 < cArr2.length) {
                if (this.f24910e[this.f24911f + i2] != cArr2[i2]) {
                    return;
                }
                i2++;
            } else {
                this.f24911f += cArr2.length;
                return;
            }
        }
    }

    /* renamed from: F0 */
    private void m11902F0(int i) {
        int i2 = this.f24905E;
        int[] iArr = this.f24904D;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            int[] iArr3 = new int[i2 * 2];
            String[] strArr = new String[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f24907G, 0, iArr3, 0, this.f24905E);
            System.arraycopy(this.f24906F, 0, strArr, 0, this.f24905E);
            this.f24904D = iArr2;
            this.f24907G = iArr3;
            this.f24906F = strArr;
        }
        int[] iArr4 = this.f24904D;
        int i3 = this.f24905E;
        this.f24905E = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: H0 */
    private char m11901H0() throws IOException {
        int i;
        int i2;
        if (this.f24911f == this.f24912w && !m11896P(1)) {
            m11892X0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f24910e;
        int i3 = this.f24911f;
        int i4 = i3 + 1;
        this.f24911f = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.f24913x++;
            this.f24914y = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c != 'b') {
                if (c != 'f') {
                    if (c != 'n') {
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i4 + 4 > this.f24912w && !m11896P(4)) {
                                        m11892X0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    char c2 = 0;
                                    int i5 = this.f24911f;
                                    int i6 = i5 + 4;
                                    while (i5 < i6) {
                                        char c3 = this.f24910e[i5];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 < '0' || c3 > '9') {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 < 'A' || c3 > 'F') {
                                                throw new NumberFormatException("\\u" + new String(this.f24910e, this.f24911f, 4));
                                            } else {
                                                i = c3 - 'A';
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = c3 - '0';
                                        }
                                        c2 = (char) (c4 + i2);
                                        i5++;
                                    }
                                    this.f24911f += 4;
                                    return c2;
                                }
                                m11892X0("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c;
    }

    /* renamed from: K0 */
    private void m11898K0(char c) throws IOException {
        char[] cArr = this.f24910e;
        do {
            int i = this.f24911f;
            int i2 = this.f24912w;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f24911f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f24911f = i3;
                    m11901H0();
                    i = this.f24911f;
                    i2 = this.f24912w;
                } else {
                    if (c2 == '\n') {
                        this.f24913x++;
                        this.f24914y = i3;
                    }
                    i = i3;
                }
            }
            this.f24911f = i;
        } while (m11896P(1));
        m11892X0("Unterminated string");
        throw null;
    }

    /* renamed from: L0 */
    private boolean m11897L0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f24911f + length > this.f24912w && !m11896P(length)) {
                return false;
            }
            char[] cArr = this.f24910e;
            int i = this.f24911f;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f24910e[this.f24911f + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.f24913x++;
            this.f24914y = i + 1;
            this.f24911f++;
        }
    }

    /* renamed from: P */
    private boolean m11896P(int i) throws IOException {
        int i2;
        char[] cArr = this.f24910e;
        int i3 = this.f24914y;
        int i4 = this.f24911f;
        this.f24914y = i3 - i4;
        int i5 = this.f24912w;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f24912w = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f24912w = 0;
        }
        this.f24911f = 0;
        do {
            Reader reader = this.f24908c;
            int i7 = this.f24912w;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            int i8 = this.f24912w + read;
            this.f24912w = i8;
            if (this.f24913x == 0 && (i2 = this.f24914y) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f24911f++;
                this.f24914y = i2 + 1;
                i++;
            }
        } while (this.f24912w < i);
        return true;
    }

    /* renamed from: P0 */
    private void m11895P0() throws IOException {
        char c;
        do {
            if (this.f24911f >= this.f24912w && !m11896P(1)) {
                return;
            }
            char[] cArr = this.f24910e;
            int i = this.f24911f;
            int i2 = i + 1;
            this.f24911f = i2;
            c = cArr[i];
            if (c == '\n') {
                this.f24913x++;
                this.f24914y = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        m11889m();
     */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m11894Q0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f24911f
            int r2 = r1 + r0
            int r3 = r4.f24912w
            if (r2 >= r3) goto L51
            char[] r2 = r4.f24910e
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m11889m()
        L4b:
            int r1 = r4.f24911f
            int r1 = r1 + r0
            r4.f24911f = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f24911f = r1
            r0 = 1
            boolean r0 = r4.m11896P(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.com.google.gson.stream.C10939a.m11894Q0():void");
    }

    /* renamed from: X0 */
    private IOException m11892X0(String str) throws IOException {
        throw new MalformedJsonException(str + m11890b0());
    }

    /* renamed from: Z */
    private boolean m11891Z(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m11889m();
        return false;
    }

    /* renamed from: m */
    private void m11889m() throws IOException {
        if (this.f24909d) {
            return;
        }
        m11892X0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* renamed from: u0 */
    private int m11888u0(boolean z) throws IOException {
        char[] cArr = this.f24910e;
        int i = this.f24911f;
        int i2 = this.f24912w;
        while (true) {
            if (i == i2) {
                this.f24911f = i;
                if (!m11896P(1)) {
                    if (z) {
                        throw new EOFException("End of input" + m11890b0());
                    }
                    return -1;
                }
                i = this.f24911f;
                i2 = this.f24912w;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f24913x++;
                this.f24914y = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f24911f = i3;
                    if (i3 == i2) {
                        this.f24911f = i3 - 1;
                        boolean m11896P = m11896P(2);
                        this.f24911f++;
                        if (!m11896P) {
                            return c;
                        }
                    }
                    m11889m();
                    int i4 = this.f24911f;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f24911f = i4 + 1;
                        if (m11897L0("*/")) {
                            i = this.f24911f + 2;
                            i2 = this.f24912w;
                        } else {
                            m11892X0("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f24911f = i4 + 1;
                        m11895P0();
                        i = this.f24911f;
                        i2 = this.f24912w;
                    }
                } else if (c == '#') {
                    this.f24911f = i3;
                    m11889m();
                    m11895P0();
                    i = this.f24911f;
                    i2 = this.f24912w;
                } else {
                    this.f24911f = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r2.append(r0, r4, r3 - r4);
        r10.f24911f = r3;
     */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m11887x0(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f24910e
            r1 = 0
            r2 = r1
        L4:
            int r3 = r10.f24911f
            int r4 = r10.f24912w
        L8:
            r5 = r4
            r4 = r3
        La:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L5d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L29
            r10.f24911f = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L21:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L29:
            r9 = 92
            if (r3 != r9) goto L50
            r10.f24911f = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L41
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L41:
            r2.append(r0, r4, r8)
            char r3 = r10.m11901H0()
            r2.append(r3)
            int r3 = r10.f24911f
            int r4 = r10.f24912w
            goto L8
        L50:
            r6 = 10
            if (r3 != r6) goto L5b
            int r3 = r10.f24913x
            int r3 = r3 + r7
            r10.f24913x = r3
            r10.f24914y = r8
        L5b:
            r3 = r8
            goto La
        L5d:
            if (r2 != 0) goto L6d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L6d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f24911f = r3
            boolean r3 = r10.m11896P(r7)
            if (r3 == 0) goto L7b
            goto L4
        L7b:
            java.lang.String r11 = "Unterminated string"
            r10.m11892X0(r11)
            goto L82
        L81:
            throw r1
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.com.google.gson.stream.C10939a.m11887x0(char):java.lang.String");
    }

    /* renamed from: C0 */
    public EnumC10941b mo11789C0() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        switch (i) {
            case 1:
                return EnumC10941b.BEGIN_OBJECT;
            case 2:
                return EnumC10941b.END_OBJECT;
            case 3:
                return EnumC10941b.BEGIN_ARRAY;
            case 4:
                return EnumC10941b.END_ARRAY;
            case 5:
            case 6:
                return EnumC10941b.BOOLEAN;
            case 7:
                return EnumC10941b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC10941b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC10941b.NAME;
            case 15:
            case 16:
                return EnumC10941b.NUMBER;
            case 17:
                return EnumC10941b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: I */
    int m11900I() throws IOException {
        int m11888u0;
        int[] iArr = this.f24904D;
        int i = this.f24905E;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m11888u02 = m11888u0(true);
            if (m11888u02 != 44) {
                if (m11888u02 != 59) {
                    if (m11888u02 == 93) {
                        this.f24915z = 4;
                        return 4;
                    }
                    m11892X0("Unterminated array");
                    throw null;
                }
                m11889m();
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f24904D[this.f24905E - 1] = 4;
            if (i2 == 5 && (m11888u0 = m11888u0(true)) != 44) {
                if (m11888u0 != 59) {
                    if (m11888u0 == 125) {
                        this.f24915z = 2;
                        return 2;
                    }
                    m11892X0("Unterminated object");
                    throw null;
                }
                m11889m();
            }
            int m11888u03 = m11888u0(true);
            if (m11888u03 == 34) {
                this.f24915z = 13;
                return 13;
            } else if (m11888u03 == 39) {
                m11889m();
                this.f24915z = 12;
                return 12;
            } else if (m11888u03 == 125) {
                if (i2 != 5) {
                    this.f24915z = 2;
                    return 2;
                }
                m11892X0("Expected name");
                throw null;
            } else {
                m11889m();
                this.f24911f--;
                if (m11891Z((char) m11888u03)) {
                    this.f24915z = 14;
                    return 14;
                }
                m11892X0("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int m11888u04 = m11888u0(true);
            if (m11888u04 != 58) {
                if (m11888u04 == 61) {
                    m11889m();
                    if (this.f24911f < this.f24912w || m11896P(1)) {
                        char[] cArr = this.f24910e;
                        int i3 = this.f24911f;
                        if (cArr[i3] == '>') {
                            this.f24911f = i3 + 1;
                        }
                    }
                } else {
                    m11892X0("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            if (this.f24909d) {
                m11903F();
            }
            this.f24904D[this.f24905E - 1] = 7;
        } else if (i2 == 7) {
            if (m11888u0(false) == -1) {
                this.f24915z = 17;
                return 17;
            }
            m11889m();
            this.f24911f--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int m11888u05 = m11888u0(true);
        if (m11888u05 == 34) {
            this.f24915z = 9;
            return 9;
        } else if (m11888u05 == 39) {
            m11889m();
            this.f24915z = 8;
            return 8;
        } else {
            if (m11888u05 != 44 && m11888u05 != 59) {
                if (m11888u05 == 91) {
                    this.f24915z = 3;
                    return 3;
                } else if (m11888u05 != 93) {
                    if (m11888u05 != 123) {
                        this.f24911f--;
                        int m11905D0 = m11905D0();
                        if (m11905D0 != 0) {
                            return m11905D0;
                        }
                        int m11904E0 = m11904E0();
                        if (m11904E0 != 0) {
                            return m11904E0;
                        }
                        if (m11891Z(this.f24910e[this.f24911f])) {
                            m11889m();
                            this.f24915z = 10;
                            return 10;
                        }
                        m11892X0("Expected value");
                        throw null;
                    }
                    this.f24915z = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f24915z = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                m11892X0("Unexpected value");
                throw null;
            }
            m11889m();
            this.f24911f--;
            this.f24915z = 7;
            return 7;
        }
    }

    /* renamed from: J */
    public void mo11788J() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 4) {
            int i2 = this.f24905E - 1;
            this.f24905E = i2;
            int[] iArr = this.f24907G;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f24915z = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo11789C0() + m11890b0());
    }

    /* renamed from: J0 */
    public final void m11899J0(boolean z) {
        this.f24909d = z;
    }

    /* renamed from: O */
    public void mo11787O() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 2) {
            int i2 = this.f24905E - 1;
            this.f24905E = i2;
            this.f24906F[i2] = null;
            int[] iArr = this.f24907G;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f24915z = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo11789C0() + m11890b0());
    }

    /* renamed from: U0 */
    public void mo11786U0() throws IOException {
        int i = 0;
        do {
            int i2 = this.f24915z;
            if (i2 == 0) {
                i2 = m11900I();
            }
            if (i2 == 3) {
                m11902F0(1);
            } else if (i2 == 1) {
                m11902F0(3);
            } else {
                if (i2 == 4) {
                    this.f24905E--;
                } else if (i2 == 2) {
                    this.f24905E--;
                } else {
                    if (i2 == 14 || i2 == 10) {
                        m11894Q0();
                    } else if (i2 == 8 || i2 == 12) {
                        m11898K0('\'');
                    } else if (i2 == 9 || i2 == 13) {
                        m11898K0('\"');
                    } else if (i2 == 16) {
                        this.f24911f += this.f24902B;
                    }
                    this.f24915z = 0;
                }
                i--;
                this.f24915z = 0;
            }
            i++;
            this.f24915z = 0;
        } while (i != 0);
        int[] iArr = this.f24907G;
        int i3 = this.f24905E;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f24906F[i3 - 1] = "null";
    }

    /* renamed from: V */
    public boolean mo11785V() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: X */
    public final boolean m11893X() {
        return this.f24909d;
    }

    /* renamed from: b0 */
    String m11890b0() {
        return " at line " + (this.f24913x + 1) + " column " + ((this.f24911f - this.f24914y) + 1) + " path " + getPath();
    }

    /* renamed from: c */
    public void mo11781c() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 3) {
            m11902F0(1);
            this.f24907G[this.f24905E - 1] = 0;
            this.f24915z = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo11789C0() + m11890b0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f24915z = 0;
        this.f24904D[0] = 8;
        this.f24905E = 1;
        this.f24908c.close();
    }

    /* renamed from: f0 */
    public boolean mo11777f0() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 5) {
            this.f24915z = 0;
            int[] iArr = this.f24907G;
            int i2 = this.f24905E - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f24915z = 0;
            int[] iArr2 = this.f24907G;
            int i3 = this.f24905E - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo11789C0() + m11890b0());
        }
    }

    /* renamed from: g */
    public void mo11776g() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 1) {
            m11902F0(3);
            this.f24915z = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo11789C0() + m11890b0());
    }

    /* renamed from: g0 */
    public double mo11775g0() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 15) {
            this.f24915z = 0;
            int[] iArr = this.f24907G;
            int i2 = this.f24905E - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f24901A;
        }
        if (i == 16) {
            this.f24903C = new String(this.f24910e, this.f24911f, this.f24902B);
            this.f24911f += this.f24902B;
        } else if (i == 8 || i == 9) {
            this.f24903C = m11887x0(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f24903C = m11906A0();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + mo11789C0() + m11890b0());
        }
        this.f24915z = 11;
        double parseDouble = Double.parseDouble(this.f24903C);
        if (!this.f24909d && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + m11890b0());
        }
        this.f24903C = null;
        this.f24915z = 0;
        int[] iArr2 = this.f24907G;
        int i3 = this.f24905E - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f24905E;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f24904D[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f24907G[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f24906F;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: i0 */
    public int mo11774i0() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 15) {
            long j = this.f24901A;
            int i2 = (int) j;
            if (j == i2) {
                this.f24915z = 0;
                int[] iArr = this.f24907G;
                int i3 = this.f24905E - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f24901A + m11890b0());
        }
        if (i == 16) {
            this.f24903C = new String(this.f24910e, this.f24911f, this.f24902B);
            this.f24911f += this.f24902B;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + mo11789C0() + m11890b0());
        } else {
            if (i == 10) {
                this.f24903C = m11906A0();
            } else {
                this.f24903C = m11887x0(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f24903C);
                this.f24915z = 0;
                int[] iArr2 = this.f24907G;
                int i4 = this.f24905E - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f24915z = 11;
        double parseDouble = Double.parseDouble(this.f24903C);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.f24903C = null;
            this.f24915z = 0;
            int[] iArr3 = this.f24907G;
            int i6 = this.f24905E - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f24903C + m11890b0());
    }

    /* renamed from: k0 */
    public long mo11773k0() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 15) {
            this.f24915z = 0;
            int[] iArr = this.f24907G;
            int i2 = this.f24905E - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f24901A;
        }
        if (i == 16) {
            this.f24903C = new String(this.f24910e, this.f24911f, this.f24902B);
            this.f24911f += this.f24902B;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + mo11789C0() + m11890b0());
        } else {
            if (i == 10) {
                this.f24903C = m11906A0();
            } else {
                this.f24903C = m11887x0(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f24903C);
                this.f24915z = 0;
                int[] iArr2 = this.f24907G;
                int i3 = this.f24905E - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f24915z = 11;
        double parseDouble = Double.parseDouble(this.f24903C);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.f24903C = null;
            this.f24915z = 0;
            int[] iArr3 = this.f24907G;
            int i4 = this.f24905E - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f24903C + m11890b0());
    }

    /* renamed from: o0 */
    public String mo11772o0() throws IOException {
        String m11887x0;
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 14) {
            m11887x0 = m11906A0();
        } else if (i == 12) {
            m11887x0 = m11887x0('\'');
        } else if (i == 13) {
            m11887x0 = m11887x0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo11789C0() + m11890b0());
        }
        this.f24915z = 0;
        this.f24906F[this.f24905E - 1] = m11887x0;
        return m11887x0;
    }

    public String toString() {
        return getClass().getSimpleName() + m11890b0();
    }

    /* renamed from: w0 */
    public void mo11771w0() throws IOException {
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 7) {
            this.f24915z = 0;
            int[] iArr = this.f24907G;
            int i2 = this.f24905E - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo11789C0() + m11890b0());
    }

    /* renamed from: z0 */
    public String mo11770z0() throws IOException {
        String str;
        int i = this.f24915z;
        if (i == 0) {
            i = m11900I();
        }
        if (i == 10) {
            str = m11906A0();
        } else if (i == 8) {
            str = m11887x0('\'');
        } else if (i == 9) {
            str = m11887x0('\"');
        } else if (i == 11) {
            str = this.f24903C;
            this.f24903C = null;
        } else if (i == 15) {
            str = Long.toString(this.f24901A);
        } else if (i == 16) {
            str = new String(this.f24910e, this.f24911f, this.f24902B);
            this.f24911f += this.f24902B;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo11789C0() + m11890b0());
        }
        this.f24915z = 0;
        int[] iArr = this.f24907G;
        int i2 = this.f24905E - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }
}
