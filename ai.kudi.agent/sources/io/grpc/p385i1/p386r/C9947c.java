package io.grpc.p385i1.p386r;

import javax.security.auth.x500.X500Principal;
/* compiled from: DistinguishedNameParser.java */
/* renamed from: io.grpc.i1.r.c */
/* loaded from: classes2.dex */
final class C9947c {

    /* renamed from: a */
    private final String f23559a;

    /* renamed from: b */
    private final int f23560b;

    /* renamed from: c */
    private int f23561c;

    /* renamed from: d */
    private int f23562d;

    /* renamed from: e */
    private int f23563e;

    /* renamed from: f */
    private int f23564f;

    /* renamed from: g */
    private char[] f23565g;

    public C9947c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f23559a = name;
        this.f23560b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
        return new java.lang.String(r1, r2, r8.f23564f - r2);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m13510a() {
        /*
            r8 = this;
            int r0 = r8.f23561c
            r8.f23562d = r0
            r8.f23563e = r0
        L6:
            int r0 = r8.f23561c
            int r1 = r8.f23560b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f23565g
            int r2 = r8.f23562d
            int r3 = r8.f23563e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f23565g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L60
            if (r2 == r5) goto L53
            r5 = 92
            if (r2 == r5) goto L40
            if (r2 == r4) goto L53
            if (r2 == r3) goto L53
            int r2 = r8.f23563e
            int r3 = r2 + 1
            r8.f23563e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.f23561c = r0
            goto L6
        L40:
            int r0 = r8.f23563e
            int r2 = r0 + 1
            r8.f23563e = r2
            char r2 = r8.m13507d()
            r1[r0] = r2
            int r0 = r8.f23561c
            int r0 = r0 + 1
            r8.f23561c = r0
            goto L6
        L53:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f23565g
            int r2 = r8.f23562d
            int r3 = r8.f23563e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L60:
            int r2 = r8.f23563e
            r8.f23564f = r2
            int r0 = r0 + 1
            r8.f23561c = r0
            int r0 = r2 + 1
            r8.f23563e = r0
            r1[r2] = r6
        L6e:
            int r0 = r8.f23561c
            int r1 = r8.f23560b
            if (r0 >= r1) goto L87
            char[] r1 = r8.f23565g
            char r2 = r1[r0]
            if (r2 != r6) goto L87
            int r2 = r8.f23563e
            int r7 = r2 + 1
            r8.f23563e = r7
            r1[r2] = r6
            int r0 = r0 + 1
            r8.f23561c = r0
            goto L6e
        L87:
            int r0 = r8.f23561c
            int r1 = r8.f23560b
            if (r0 == r1) goto L9b
            char[] r1 = r8.f23565g
            char r2 = r1[r0]
            if (r2 == r3) goto L9b
            char r2 = r1[r0]
            if (r2 == r4) goto L9b
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L9b:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f23565g
            int r2 = r8.f23562d
            int r3 = r8.f23564f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.p385i1.p386r.C9947c.m13510a():java.lang.String");
    }

    /* renamed from: c */
    private int m13508c(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f23560b) {
            char c = this.f23565g[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f23559a);
            } else {
                i2 = c - '7';
            }
            char c2 = this.f23565g[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f23559a);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f23559a);
    }

    /* renamed from: d */
    private char m13507d() {
        int i = this.f23561c + 1;
        this.f23561c = i;
        if (i != this.f23560b) {
            char c = this.f23565g[i];
            if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return m13506e();
                        }
                }
            }
            return this.f23565g[this.f23561c];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f23559a);
    }

    /* renamed from: e */
    private char m13506e() {
        int i;
        int i2;
        int m13508c = m13508c(this.f23561c);
        this.f23561c++;
        if (m13508c < 128) {
            return (char) m13508c;
        }
        if (m13508c < 192 || m13508c > 247) {
            return '?';
        }
        if (m13508c <= 223) {
            i2 = m13508c & 31;
            i = 1;
        } else if (m13508c <= 239) {
            i = 2;
            i2 = m13508c & 15;
        } else {
            i = 3;
            i2 = m13508c & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f23561c + 1;
            this.f23561c = i4;
            if (i4 == this.f23560b || this.f23565g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f23561c = i5;
            int m13508c2 = m13508c(i5);
            this.f23561c++;
            if ((m13508c2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (m13508c2 & 63);
        }
        return (char) i2;
    }

    /* renamed from: f */
    private String m13505f() {
        int i = this.f23561c;
        if (i + 4 < this.f23560b) {
            this.f23562d = i;
            this.f23561c = i + 1;
            while (true) {
                int i2 = this.f23561c;
                if (i2 == this.f23560b) {
                    break;
                }
                char[] cArr = this.f23565g;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.f23563e = i2;
                    this.f23561c = i2 + 1;
                    while (true) {
                        int i3 = this.f23561c;
                        if (i3 >= this.f23560b || this.f23565g[i3] != ' ') {
                            break;
                        }
                        this.f23561c = i3 + 1;
                    }
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    this.f23561c++;
                }
            }
            this.f23563e = this.f23561c;
            int i4 = this.f23563e;
            int i5 = this.f23562d;
            int i6 = i4 - i5;
            if (i6 >= 5 && (i6 & 1) != 0) {
                int i7 = i6 / 2;
                byte[] bArr = new byte[i7];
                int i8 = i5 + 1;
                for (int i9 = 0; i9 < i7; i9++) {
                    bArr[i9] = (byte) m13508c(i8);
                    i8 += 2;
                }
                return new String(this.f23565g, this.f23562d, i6);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.f23559a);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f23559a);
    }

    /* renamed from: g */
    private String m13504g() {
        while (true) {
            int i = this.f23561c;
            if (i >= this.f23560b || this.f23565g[i] != ' ') {
                break;
            }
            this.f23561c = i + 1;
        }
        int i2 = this.f23561c;
        if (i2 == this.f23560b) {
            return null;
        }
        this.f23562d = i2;
        this.f23561c = i2 + 1;
        while (true) {
            int i3 = this.f23561c;
            if (i3 >= this.f23560b) {
                break;
            }
            char[] cArr = this.f23565g;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.f23561c = i3 + 1;
        }
        int i4 = this.f23561c;
        if (i4 < this.f23560b) {
            this.f23563e = i4;
            if (this.f23565g[i4] == ' ') {
                while (true) {
                    int i5 = this.f23561c;
                    if (i5 >= this.f23560b) {
                        break;
                    }
                    char[] cArr2 = this.f23565g;
                    if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                        break;
                    }
                    this.f23561c = i5 + 1;
                }
                char[] cArr3 = this.f23565g;
                int i6 = this.f23561c;
                if (cArr3[i6] != '=' || i6 == this.f23560b) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f23559a);
                }
            }
            this.f23561c++;
            while (true) {
                int i7 = this.f23561c;
                if (i7 >= this.f23560b || this.f23565g[i7] != ' ') {
                    break;
                }
                this.f23561c = i7 + 1;
            }
            int i8 = this.f23563e;
            int i9 = this.f23562d;
            if (i8 - i9 > 4) {
                char[] cArr4 = this.f23565g;
                if (cArr4[i9 + 3] == '.' && (cArr4[i9] == 'O' || cArr4[i9] == 'o')) {
                    char[] cArr5 = this.f23565g;
                    int i10 = this.f23562d;
                    if (cArr5[i10 + 1] == 'I' || cArr5[i10 + 1] == 'i') {
                        char[] cArr6 = this.f23565g;
                        int i11 = this.f23562d;
                        if (cArr6[i11 + 2] == 'D' || cArr6[i11 + 2] == 'd') {
                            this.f23562d += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.f23565g;
            int i12 = this.f23562d;
            return new String(cArr7, i12, this.f23563e - i12);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f23559a);
    }

    /* renamed from: h */
    private String m13503h() {
        int i = this.f23561c + 1;
        this.f23561c = i;
        this.f23562d = i;
        this.f23563e = i;
        while (true) {
            int i2 = this.f23561c;
            if (i2 != this.f23560b) {
                char[] cArr = this.f23565g;
                if (cArr[i2] == '\"') {
                    this.f23561c = i2 + 1;
                    while (true) {
                        int i3 = this.f23561c;
                        if (i3 >= this.f23560b || this.f23565g[i3] != ' ') {
                            break;
                        }
                        this.f23561c = i3 + 1;
                    }
                    char[] cArr2 = this.f23565g;
                    int i4 = this.f23562d;
                    return new String(cArr2, i4, this.f23563e - i4);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.f23563e] = m13507d();
                } else {
                    cArr[this.f23563e] = cArr[i2];
                }
                this.f23561c++;
                this.f23563e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f23559a);
            }
        }
    }

    /* renamed from: b */
    public String m13509b(String str) {
        String m13503h;
        this.f23561c = 0;
        this.f23562d = 0;
        this.f23563e = 0;
        this.f23564f = 0;
        this.f23565g = this.f23559a.toCharArray();
        String m13504g = m13504g();
        if (m13504g == null) {
            return null;
        }
        do {
            int i = this.f23561c;
            if (i == this.f23560b) {
                return null;
            }
            char c = this.f23565g[i];
            if (c == '\"') {
                m13503h = m13503h();
            } else if (c != '#') {
                m13503h = (c == '+' || c == ',' || c == ';') ? "" : m13510a();
            } else {
                m13503h = m13505f();
            }
            if (str.equalsIgnoreCase(m13504g)) {
                return m13503h;
            }
            int i2 = this.f23561c;
            if (i2 >= this.f23560b) {
                return null;
            }
            char[] cArr = this.f23565g;
            if (cArr[i2] != ',' && cArr[i2] != ';' && cArr[i2] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f23559a);
            }
            this.f23561c++;
            m13504g = m13504g();
        } while (m13504g != null);
        throw new IllegalStateException("Malformed DN: " + this.f23559a);
    }
}
