package com.google.gson.stream;

import com.google.gson.internal.AbstractC6874e;
import com.google.gson.internal.bind.C6852a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/* compiled from: JsonReader.java */
/* renamed from: com.google.gson.stream.a */
/* loaded from: classes2.dex */
public class C6911a implements Closeable {

    /* renamed from: H */
    private static final char[] f16558H = ")]}'\n".toCharArray();

    /* renamed from: A */
    private long f16559A;

    /* renamed from: B */
    private int f16560B;

    /* renamed from: C */
    private String f16561C;

    /* renamed from: D */
    private int[] f16562D;

    /* renamed from: E */
    private int f16563E;

    /* renamed from: F */
    private String[] f16564F;

    /* renamed from: G */
    private int[] f16565G;

    /* renamed from: c */
    private final Reader f16566c;

    /* renamed from: d */
    private boolean f16567d = false;

    /* renamed from: e */
    private final char[] f16568e = new char[1024];

    /* renamed from: f */
    private int f16569f = 0;

    /* renamed from: w */
    private int f16570w = 0;

    /* renamed from: x */
    private int f16571x = 0;

    /* renamed from: y */
    private int f16572y = 0;

    /* renamed from: z */
    int f16573z = 0;

    /* compiled from: JsonReader.java */
    /* renamed from: com.google.gson.stream.a$a */
    /* loaded from: classes2.dex */
    class C6912a extends AbstractC6874e {
        C6912a() {
        }

        @Override // com.google.gson.internal.AbstractC6874e
        /* renamed from: a */
        public void mo20492a(C6911a c6911a) throws IOException {
            if (c6911a instanceof C6852a) {
                ((C6852a) c6911a).m20603d1();
                return;
            }
            int i = c6911a.f16573z;
            if (i == 0) {
                i = c6911a.m20519I();
            }
            if (i == 13) {
                c6911a.f16573z = 9;
            } else if (i == 12) {
                c6911a.f16573z = 8;
            } else if (i == 14) {
                c6911a.f16573z = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + c6911a.mo20525C0() + c6911a.m20505b0());
            }
        }
    }

    static {
        AbstractC6874e.f16515a = new C6912a();
    }

    public C6911a(Reader reader) {
        int[] iArr = new int[32];
        this.f16562D = iArr;
        this.f16563E = 0;
        this.f16563E = 0 + 1;
        iArr[0] = 6;
        this.f16564F = new String[32];
        this.f16565G = new int[32];
        if (reader != null) {
            this.f16566c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m20498m();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m20526A0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f16569f
            int r4 = r3 + r2
            int r5 = r6.f16570w
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f16568e
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
            r6.m20498m()
            goto L5c
        L4e:
            char[] r3 = r6.f16568e
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m20513P(r3)
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
            char[] r3 = r6.f16568e
            int r4 = r6.f16569f
            r1.append(r3, r4, r2)
            int r3 = r6.f16569f
            int r3 = r3 + r2
            r6.f16569f = r3
            r2 = 1
            boolean r2 = r6.m20513P(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f16568e
            int r3 = r6.f16569f
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f16568e
            int r3 = r6.f16569f
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f16569f
            int r2 = r2 + r0
            r6.f16569f = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C6911a.m20526A0():java.lang.String");
    }

    /* renamed from: D0 */
    private int m20524D0() throws IOException {
        int i;
        String str;
        String str2;
        char c = this.f16568e[this.f16569f];
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
            if (this.f16569f + i2 >= this.f16570w && !m20513P(i2 + 1)) {
                return 0;
            }
            char c2 = this.f16568e[this.f16569f + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f16569f + length < this.f16570w || m20513P(length + 1)) && m20506Z(this.f16568e[this.f16569f + length])) {
            return 0;
        }
        this.f16569f += length;
        this.f16573z = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        if (m20506Z(r14) != false) goto L77;
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
        r18.f16559A = r11;
        r18.f16569f += r8;
        r18.f16573z = 15;
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
        r18.f16560B = r8;
        r18.f16573z = 16;
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
    private int m20523E0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C6911a.m20523E0():int");
    }

    /* renamed from: F */
    private void m20522F() throws IOException {
        m20496u0(true);
        int i = this.f16569f - 1;
        this.f16569f = i;
        char[] cArr = f16558H;
        if (i + cArr.length > this.f16570w && !m20513P(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = f16558H;
            if (i2 < cArr2.length) {
                if (this.f16568e[this.f16569f + i2] != cArr2[i2]) {
                    return;
                }
                i2++;
            } else {
                this.f16569f += cArr2.length;
                return;
            }
        }
    }

    /* renamed from: F0 */
    private void m20521F0(int i) {
        int i2 = this.f16563E;
        int[] iArr = this.f16562D;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f16562D = Arrays.copyOf(iArr, i3);
            this.f16565G = Arrays.copyOf(this.f16565G, i3);
            this.f16564F = (String[]) Arrays.copyOf(this.f16564F, i3);
        }
        int[] iArr2 = this.f16562D;
        int i4 = this.f16563E;
        this.f16563E = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: H0 */
    private char m20520H0() throws IOException {
        int i;
        int i2;
        if (this.f16569f == this.f16570w && !m20513P(1)) {
            m20507X0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f16568e;
        int i3 = this.f16569f;
        int i4 = i3 + 1;
        this.f16569f = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.f16571x++;
            this.f16572y = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c != 'b') {
                if (c != 'f') {
                    if (c != 'n') {
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i4 + 4 > this.f16570w && !m20513P(4)) {
                                        m20507X0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    char c2 = 0;
                                    int i5 = this.f16569f;
                                    int i6 = i5 + 4;
                                    while (i5 < i6) {
                                        char c3 = this.f16568e[i5];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 < '0' || c3 > '9') {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 < 'A' || c3 > 'F') {
                                                throw new NumberFormatException("\\u" + new String(this.f16568e, this.f16569f, 4));
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
                                    this.f16569f += 4;
                                    return c2;
                                }
                                m20507X0("Invalid escape sequence");
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
    private void m20516K0(char c) throws IOException {
        char[] cArr = this.f16568e;
        do {
            int i = this.f16569f;
            int i2 = this.f16570w;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f16569f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f16569f = i3;
                    m20520H0();
                    i = this.f16569f;
                    i2 = this.f16570w;
                } else {
                    if (c2 == '\n') {
                        this.f16571x++;
                        this.f16572y = i3;
                    }
                    i = i3;
                }
            }
            this.f16569f = i;
        } while (m20513P(1));
        m20507X0("Unterminated string");
        throw null;
    }

    /* renamed from: L0 */
    private boolean m20515L0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f16569f + length > this.f16570w && !m20513P(length)) {
                return false;
            }
            char[] cArr = this.f16568e;
            int i = this.f16569f;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f16568e[this.f16569f + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.f16571x++;
            this.f16572y = i + 1;
            this.f16569f++;
        }
    }

    /* renamed from: P */
    private boolean m20513P(int i) throws IOException {
        int i2;
        char[] cArr = this.f16568e;
        int i3 = this.f16572y;
        int i4 = this.f16569f;
        this.f16572y = i3 - i4;
        int i5 = this.f16570w;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f16570w = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f16570w = 0;
        }
        this.f16569f = 0;
        do {
            Reader reader = this.f16566c;
            int i7 = this.f16570w;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            int i8 = this.f16570w + read;
            this.f16570w = i8;
            if (this.f16571x == 0 && (i2 = this.f16572y) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f16569f++;
                this.f16572y = i2 + 1;
                i++;
            }
        } while (this.f16570w < i);
        return true;
    }

    /* renamed from: P0 */
    private void m20512P0() throws IOException {
        char c;
        do {
            if (this.f16569f >= this.f16570w && !m20513P(1)) {
                return;
            }
            char[] cArr = this.f16568e;
            int i = this.f16569f;
            int i2 = i + 1;
            this.f16569f = i2;
            c = cArr[i];
            if (c == '\n') {
                this.f16571x++;
                this.f16572y = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        m20498m();
     */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m20511Q0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f16569f
            int r2 = r1 + r0
            int r3 = r4.f16570w
            if (r2 >= r3) goto L51
            char[] r2 = r4.f16568e
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
            r4.m20498m()
        L4b:
            int r1 = r4.f16569f
            int r1 = r1 + r0
            r4.f16569f = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f16569f = r1
            r0 = 1
            boolean r0 = r4.m20513P(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C6911a.m20511Q0():void");
    }

    /* renamed from: X0 */
    private IOException m20507X0(String str) throws IOException {
        throw new MalformedJsonException(str + m20505b0());
    }

    /* renamed from: Z */
    private boolean m20506Z(char c) throws IOException {
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
        m20498m();
        return false;
    }

    /* renamed from: m */
    private void m20498m() throws IOException {
        if (this.f16567d) {
            return;
        }
        m20507X0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* renamed from: u0 */
    private int m20496u0(boolean z) throws IOException {
        char[] cArr = this.f16568e;
        int i = this.f16569f;
        int i2 = this.f16570w;
        while (true) {
            if (i == i2) {
                this.f16569f = i;
                if (!m20513P(1)) {
                    if (z) {
                        throw new EOFException("End of input" + m20505b0());
                    }
                    return -1;
                }
                i = this.f16569f;
                i2 = this.f16570w;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f16571x++;
                this.f16572y = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f16569f = i3;
                    if (i3 == i2) {
                        this.f16569f = i3 - 1;
                        boolean m20513P = m20513P(2);
                        this.f16569f++;
                        if (!m20513P) {
                            return c;
                        }
                    }
                    m20498m();
                    int i4 = this.f16569f;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f16569f = i4 + 1;
                        if (m20515L0("*/")) {
                            i = this.f16569f + 2;
                            i2 = this.f16570w;
                        } else {
                            m20507X0("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f16569f = i4 + 1;
                        m20512P0();
                        i = this.f16569f;
                        i2 = this.f16570w;
                    }
                } else if (c == '#') {
                    this.f16569f = i3;
                    m20498m();
                    m20512P0();
                    i = this.f16569f;
                    i2 = this.f16570w;
                } else {
                    this.f16569f = i3;
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
        r10.f16569f = r3;
     */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m20494x0(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f16568e
            r1 = 0
            r2 = r1
        L4:
            int r3 = r10.f16569f
            int r4 = r10.f16570w
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
            r10.f16569f = r8
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
            r10.f16569f = r8
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
            char r3 = r10.m20520H0()
            r2.append(r3)
            int r3 = r10.f16569f
            int r4 = r10.f16570w
            goto L8
        L50:
            r6 = 10
            if (r3 != r6) goto L5b
            int r3 = r10.f16571x
            int r3 = r3 + r7
            r10.f16571x = r3
            r10.f16572y = r8
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
            r10.f16569f = r3
            boolean r3 = r10.m20513P(r7)
            if (r3 == 0) goto L7b
            goto L4
        L7b:
            java.lang.String r11 = "Unterminated string"
            r10.m20507X0(r11)
            goto L82
        L81:
            throw r1
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C6911a.m20494x0(char):java.lang.String");
    }

    /* renamed from: C0 */
    public EnumC6913b mo20525C0() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        switch (i) {
            case 1:
                return EnumC6913b.BEGIN_OBJECT;
            case 2:
                return EnumC6913b.END_OBJECT;
            case 3:
                return EnumC6913b.BEGIN_ARRAY;
            case 4:
                return EnumC6913b.END_ARRAY;
            case 5:
            case 6:
                return EnumC6913b.BOOLEAN;
            case 7:
                return EnumC6913b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC6913b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC6913b.NAME;
            case 15:
            case 16:
                return EnumC6913b.NUMBER;
            case 17:
                return EnumC6913b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: I */
    int m20519I() throws IOException {
        int m20496u0;
        int[] iArr = this.f16562D;
        int i = this.f16563E;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m20496u02 = m20496u0(true);
            if (m20496u02 != 44) {
                if (m20496u02 != 59) {
                    if (m20496u02 == 93) {
                        this.f16573z = 4;
                        return 4;
                    }
                    m20507X0("Unterminated array");
                    throw null;
                }
                m20498m();
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f16562D[this.f16563E - 1] = 4;
            if (i2 == 5 && (m20496u0 = m20496u0(true)) != 44) {
                if (m20496u0 != 59) {
                    if (m20496u0 == 125) {
                        this.f16573z = 2;
                        return 2;
                    }
                    m20507X0("Unterminated object");
                    throw null;
                }
                m20498m();
            }
            int m20496u03 = m20496u0(true);
            if (m20496u03 == 34) {
                this.f16573z = 13;
                return 13;
            } else if (m20496u03 == 39) {
                m20498m();
                this.f16573z = 12;
                return 12;
            } else if (m20496u03 == 125) {
                if (i2 != 5) {
                    this.f16573z = 2;
                    return 2;
                }
                m20507X0("Expected name");
                throw null;
            } else {
                m20498m();
                this.f16569f--;
                if (m20506Z((char) m20496u03)) {
                    this.f16573z = 14;
                    return 14;
                }
                m20507X0("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int m20496u04 = m20496u0(true);
            if (m20496u04 != 58) {
                if (m20496u04 == 61) {
                    m20498m();
                    if (this.f16569f < this.f16570w || m20513P(1)) {
                        char[] cArr = this.f16568e;
                        int i3 = this.f16569f;
                        if (cArr[i3] == '>') {
                            this.f16569f = i3 + 1;
                        }
                    }
                } else {
                    m20507X0("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            if (this.f16567d) {
                m20522F();
            }
            this.f16562D[this.f16563E - 1] = 7;
        } else if (i2 == 7) {
            if (m20496u0(false) == -1) {
                this.f16573z = 17;
                return 17;
            }
            m20498m();
            this.f16569f--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int m20496u05 = m20496u0(true);
        if (m20496u05 == 34) {
            this.f16573z = 9;
            return 9;
        } else if (m20496u05 == 39) {
            m20498m();
            this.f16573z = 8;
            return 8;
        } else {
            if (m20496u05 != 44 && m20496u05 != 59) {
                if (m20496u05 == 91) {
                    this.f16573z = 3;
                    return 3;
                } else if (m20496u05 != 93) {
                    if (m20496u05 != 123) {
                        this.f16569f--;
                        int m20524D0 = m20524D0();
                        if (m20524D0 != 0) {
                            return m20524D0;
                        }
                        int m20523E0 = m20523E0();
                        if (m20523E0 != 0) {
                            return m20523E0;
                        }
                        if (m20506Z(this.f16568e[this.f16569f])) {
                            m20498m();
                            this.f16573z = 10;
                            return 10;
                        }
                        m20507X0("Expected value");
                        throw null;
                    }
                    this.f16573z = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f16573z = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                m20507X0("Unexpected value");
                throw null;
            }
            m20498m();
            this.f16569f--;
            this.f16573z = 7;
            return 7;
        }
    }

    /* renamed from: J */
    public void mo20518J() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 4) {
            int i2 = this.f16563E - 1;
            this.f16563E = i2;
            int[] iArr = this.f16565G;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f16573z = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo20525C0() + m20505b0());
    }

    /* renamed from: J0 */
    public final void m20517J0(boolean z) {
        this.f16567d = z;
    }

    /* renamed from: O */
    public void mo20514O() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 2) {
            int i2 = this.f16563E - 1;
            this.f16563E = i2;
            this.f16564F[i2] = null;
            int[] iArr = this.f16565G;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f16573z = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo20525C0() + m20505b0());
    }

    /* renamed from: U0 */
    public void mo20510U0() throws IOException {
        int i = 0;
        do {
            int i2 = this.f16573z;
            if (i2 == 0) {
                i2 = m20519I();
            }
            if (i2 == 3) {
                m20521F0(1);
            } else if (i2 == 1) {
                m20521F0(3);
            } else {
                if (i2 == 4) {
                    this.f16563E--;
                } else if (i2 == 2) {
                    this.f16563E--;
                } else {
                    if (i2 == 14 || i2 == 10) {
                        m20511Q0();
                    } else if (i2 == 8 || i2 == 12) {
                        m20516K0('\'');
                    } else if (i2 == 9 || i2 == 13) {
                        m20516K0('\"');
                    } else if (i2 == 16) {
                        this.f16569f += this.f16560B;
                    }
                    this.f16573z = 0;
                }
                i--;
                this.f16573z = 0;
            }
            i++;
            this.f16573z = 0;
        } while (i != 0);
        int[] iArr = this.f16565G;
        int i3 = this.f16563E;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f16564F[i3 - 1] = "null";
    }

    /* renamed from: V */
    public boolean mo20509V() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: X */
    public final boolean m20508X() {
        return this.f16567d;
    }

    /* renamed from: b0 */
    String m20505b0() {
        return " at line " + (this.f16571x + 1) + " column " + ((this.f16569f - this.f16572y) + 1) + " path " + getPath();
    }

    /* renamed from: c */
    public void mo20504c() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 3) {
            m20521F0(1);
            this.f16565G[this.f16563E - 1] = 0;
            this.f16573z = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo20525C0() + m20505b0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16573z = 0;
        this.f16562D[0] = 8;
        this.f16563E = 1;
        this.f16566c.close();
    }

    /* renamed from: f0 */
    public boolean mo20503f0() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 5) {
            this.f16573z = 0;
            int[] iArr = this.f16565G;
            int i2 = this.f16563E - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f16573z = 0;
            int[] iArr2 = this.f16565G;
            int i3 = this.f16563E - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo20525C0() + m20505b0());
        }
    }

    /* renamed from: g */
    public void mo20502g() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 1) {
            m20521F0(3);
            this.f16573z = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo20525C0() + m20505b0());
    }

    /* renamed from: g0 */
    public double mo20501g0() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 15) {
            this.f16573z = 0;
            int[] iArr = this.f16565G;
            int i2 = this.f16563E - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f16559A;
        }
        if (i == 16) {
            this.f16561C = new String(this.f16568e, this.f16569f, this.f16560B);
            this.f16569f += this.f16560B;
        } else if (i == 8 || i == 9) {
            this.f16561C = m20494x0(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f16561C = m20526A0();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + mo20525C0() + m20505b0());
        }
        this.f16573z = 11;
        double parseDouble = Double.parseDouble(this.f16561C);
        if (!this.f16567d && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + m20505b0());
        }
        this.f16561C = null;
        this.f16573z = 0;
        int[] iArr2 = this.f16565G;
        int i3 = this.f16563E - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f16563E;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f16562D[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f16565G[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f16564F;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: i0 */
    public int mo20500i0() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 15) {
            long j = this.f16559A;
            int i2 = (int) j;
            if (j == i2) {
                this.f16573z = 0;
                int[] iArr = this.f16565G;
                int i3 = this.f16563E - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f16559A + m20505b0());
        }
        if (i == 16) {
            this.f16561C = new String(this.f16568e, this.f16569f, this.f16560B);
            this.f16569f += this.f16560B;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + mo20525C0() + m20505b0());
        } else {
            if (i == 10) {
                this.f16561C = m20526A0();
            } else {
                this.f16561C = m20494x0(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f16561C);
                this.f16573z = 0;
                int[] iArr2 = this.f16565G;
                int i4 = this.f16563E - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f16573z = 11;
        double parseDouble = Double.parseDouble(this.f16561C);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.f16561C = null;
            this.f16573z = 0;
            int[] iArr3 = this.f16565G;
            int i6 = this.f16563E - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f16561C + m20505b0());
    }

    /* renamed from: k0 */
    public long mo20499k0() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 15) {
            this.f16573z = 0;
            int[] iArr = this.f16565G;
            int i2 = this.f16563E - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f16559A;
        }
        if (i == 16) {
            this.f16561C = new String(this.f16568e, this.f16569f, this.f16560B);
            this.f16569f += this.f16560B;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + mo20525C0() + m20505b0());
        } else {
            if (i == 10) {
                this.f16561C = m20526A0();
            } else {
                this.f16561C = m20494x0(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f16561C);
                this.f16573z = 0;
                int[] iArr2 = this.f16565G;
                int i3 = this.f16563E - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f16573z = 11;
        double parseDouble = Double.parseDouble(this.f16561C);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.f16561C = null;
            this.f16573z = 0;
            int[] iArr3 = this.f16565G;
            int i4 = this.f16563E - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f16561C + m20505b0());
    }

    /* renamed from: o0 */
    public String mo20497o0() throws IOException {
        String m20494x0;
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 14) {
            m20494x0 = m20526A0();
        } else if (i == 12) {
            m20494x0 = m20494x0('\'');
        } else if (i == 13) {
            m20494x0 = m20494x0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo20525C0() + m20505b0());
        }
        this.f16573z = 0;
        this.f16564F[this.f16563E - 1] = m20494x0;
        return m20494x0;
    }

    public String toString() {
        return getClass().getSimpleName() + m20505b0();
    }

    /* renamed from: w0 */
    public void mo20495w0() throws IOException {
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 7) {
            this.f16573z = 0;
            int[] iArr = this.f16565G;
            int i2 = this.f16563E - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo20525C0() + m20505b0());
    }

    /* renamed from: z0 */
    public String mo20493z0() throws IOException {
        String str;
        int i = this.f16573z;
        if (i == 0) {
            i = m20519I();
        }
        if (i == 10) {
            str = m20526A0();
        } else if (i == 8) {
            str = m20494x0('\'');
        } else if (i == 9) {
            str = m20494x0('\"');
        } else if (i == 11) {
            str = this.f16561C;
            this.f16561C = null;
        } else if (i == 15) {
            str = Long.toString(this.f16559A);
        } else if (i == 16) {
            str = new String(this.f16568e, this.f16569f, this.f16560B);
            this.f16569f += this.f16560B;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo20525C0() + m20505b0());
        }
        this.f16573z = 0;
        int[] iArr = this.f16565G;
        int i2 = this.f16563E - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }
}
