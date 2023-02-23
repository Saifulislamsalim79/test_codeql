package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
/* compiled from: JsonWriter.java */
/* renamed from: com.google.gson.stream.c */
/* loaded from: classes2.dex */
public class C6914c implements Closeable, Flushable {

    /* renamed from: B */
    private static final String[] f16585B = new String[128];

    /* renamed from: C */
    private static final String[] f16586C;

    /* renamed from: A */
    private boolean f16587A;

    /* renamed from: c */
    private final Writer f16588c;

    /* renamed from: d */
    private int[] f16589d = new int[32];

    /* renamed from: e */
    private int f16590e = 0;

    /* renamed from: f */
    private String f16591f;

    /* renamed from: w */
    private String f16592w;

    /* renamed from: x */
    private boolean f16593x;

    /* renamed from: y */
    private boolean f16594y;

    /* renamed from: z */
    private String f16595z;

    static {
        for (int i = 0; i <= 31; i++) {
            f16585B[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f16585B;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f16586C = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C6914c(Writer writer) {
        m20470k0(6);
        this.f16592w = ":";
        this.f16587A = true;
        if (writer != null) {
            this.f16588c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m20491A0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f16594y
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.C6914c.f16586C
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.C6914c.f16585B
        L9:
            java.io.Writer r1 = r8.f16588c
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f16588c
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f16588c
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f16588c
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f16588c
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C6914c.m20491A0(java.lang.String):void");
    }

    /* renamed from: I */
    private C6914c m20484I(int i, int i2, char c) throws IOException {
        int m20471i0 = m20471i0();
        if (m20471i0 != i2 && m20471i0 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f16595z == null) {
            this.f16590e--;
            if (m20471i0 == i2) {
                m20476b0();
            }
            this.f16588c.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f16595z);
    }

    /* renamed from: J0 */
    private void m20482J0() throws IOException {
        if (this.f16595z != null) {
            m20475c();
            m20491A0(this.f16595z);
            this.f16595z = null;
        }
    }

    /* renamed from: b0 */
    private void m20476b0() throws IOException {
        if (this.f16591f == null) {
            return;
        }
        this.f16588c.write(10);
        int i = this.f16590e;
        for (int i2 = 1; i2 < i; i2++) {
            this.f16588c.write(this.f16591f);
        }
    }

    /* renamed from: c */
    private void m20475c() throws IOException {
        int m20471i0 = m20471i0();
        if (m20471i0 == 5) {
            this.f16588c.write(44);
        } else if (m20471i0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m20476b0();
        m20468o0(4);
    }

    /* renamed from: g */
    private void m20473g() throws IOException {
        int m20471i0 = m20471i0();
        if (m20471i0 == 1) {
            m20468o0(2);
            m20476b0();
        } else if (m20471i0 == 2) {
            this.f16588c.append(',');
            m20476b0();
        } else if (m20471i0 != 4) {
            if (m20471i0 != 6) {
                if (m20471i0 == 7) {
                    if (!this.f16593x) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            m20468o0(7);
        } else {
            this.f16588c.append((CharSequence) this.f16592w);
            m20468o0(5);
        }
    }

    /* renamed from: g0 */
    private C6914c m20472g0(int i, char c) throws IOException {
        m20473g();
        m20470k0(i);
        this.f16588c.write(c);
        return this;
    }

    /* renamed from: i0 */
    private int m20471i0() {
        int i = this.f16590e;
        if (i != 0) {
            return this.f16589d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: k0 */
    private void m20470k0(int i) {
        int i2 = this.f16590e;
        int[] iArr = this.f16589d;
        if (i2 == iArr.length) {
            this.f16589d = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f16589d;
        int i3 = this.f16590e;
        this.f16590e = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: o0 */
    private void m20468o0(int i) {
        this.f16589d[this.f16590e - 1] = i;
    }

    /* renamed from: C0 */
    public C6914c mo20490C0(long j) throws IOException {
        m20482J0();
        m20473g();
        this.f16588c.write(Long.toString(j));
        return this;
    }

    /* renamed from: D0 */
    public C6914c mo20489D0(Boolean bool) throws IOException {
        if (bool == null) {
            return mo20474f0();
        }
        m20482J0();
        m20473g();
        this.f16588c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: E0 */
    public C6914c mo20488E0(Number number) throws IOException {
        if (number == null) {
            return mo20474f0();
        }
        m20482J0();
        String obj = number.toString();
        if (!this.f16593x && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m20473g();
        this.f16588c.append((CharSequence) obj);
        return this;
    }

    /* renamed from: F */
    public C6914c mo20487F() throws IOException {
        m20482J0();
        m20472g0(3, '{');
        return this;
    }

    /* renamed from: F0 */
    public C6914c mo20486F0(String str) throws IOException {
        if (str == null) {
            return mo20474f0();
        }
        m20482J0();
        m20473g();
        m20491A0(str);
        return this;
    }

    /* renamed from: H0 */
    public C6914c mo20485H0(boolean z) throws IOException {
        m20482J0();
        m20473g();
        this.f16588c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: J */
    public C6914c mo20483J() throws IOException {
        m20484I(1, 2, ']');
        return this;
    }

    /* renamed from: O */
    public C6914c mo20481O() throws IOException {
        m20484I(3, 5, '}');
        return this;
    }

    /* renamed from: P */
    public final boolean m20480P() {
        return this.f16587A;
    }

    /* renamed from: V */
    public final boolean m20479V() {
        return this.f16594y;
    }

    /* renamed from: X */
    public boolean m20478X() {
        return this.f16593x;
    }

    /* renamed from: Z */
    public C6914c mo20477Z(String str) throws IOException {
        if (str != null) {
            if (this.f16595z == null) {
                if (this.f16590e != 0) {
                    this.f16595z = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16588c.close();
        int i = this.f16590e;
        if (i <= 1 && (i != 1 || this.f16589d[i - 1] == 7)) {
            this.f16590e = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: f0 */
    public C6914c mo20474f0() throws IOException {
        if (this.f16595z != null) {
            if (this.f16587A) {
                m20482J0();
            } else {
                this.f16595z = null;
                return this;
            }
        }
        m20473g();
        this.f16588c.write("null");
        return this;
    }

    public void flush() throws IOException {
        if (this.f16590e != 0) {
            this.f16588c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: m */
    public C6914c mo20469m() throws IOException {
        m20482J0();
        m20472g0(1, '[');
        return this;
    }

    /* renamed from: u0 */
    public final void m20467u0(boolean z) {
        this.f16594y = z;
    }

    /* renamed from: w0 */
    public final void m20466w0(String str) {
        if (str.length() == 0) {
            this.f16591f = null;
            this.f16592w = ":";
            return;
        }
        this.f16591f = str;
        this.f16592w = ": ";
    }

    /* renamed from: x0 */
    public final void m20465x0(boolean z) {
        this.f16593x = z;
    }

    /* renamed from: z0 */
    public final void m20464z0(boolean z) {
        this.f16587A = z;
    }
}
