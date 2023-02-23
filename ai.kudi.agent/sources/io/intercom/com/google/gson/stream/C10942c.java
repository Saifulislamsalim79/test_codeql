package io.intercom.com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
/* compiled from: JsonWriter.java */
/* renamed from: io.intercom.com.google.gson.stream.c */
/* loaded from: classes3.dex */
public class C10942c implements Closeable, Flushable {

    /* renamed from: B */
    private static final String[] f24927B = new String[128];

    /* renamed from: C */
    private static final String[] f24928C;

    /* renamed from: A */
    private boolean f24929A;

    /* renamed from: c */
    private final Writer f24930c;

    /* renamed from: d */
    private int[] f24931d = new int[32];

    /* renamed from: e */
    private int f24932e = 0;

    /* renamed from: f */
    private String f24933f;

    /* renamed from: w */
    private String f24934w;

    /* renamed from: x */
    private boolean f24935x;

    /* renamed from: y */
    private boolean f24936y;

    /* renamed from: z */
    private String f24937z;

    static {
        for (int i = 0; i <= 31; i++) {
            f24927B[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f24927B;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f24928C = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C10942c(Writer writer) {
        m11875k0(6);
        this.f24934w = ":";
        this.f24929A = true;
        if (writer != null) {
            this.f24930c = writer;
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
    private void m11886A0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f24936y
            if (r0 == 0) goto L7
            java.lang.String[] r0 = io.intercom.com.google.gson.stream.C10942c.f24928C
            goto L9
        L7:
            java.lang.String[] r0 = io.intercom.com.google.gson.stream.C10942c.f24927B
        L9:
            java.io.Writer r1 = r8.f24930c
            java.lang.String r2 = "\""
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
            java.io.Writer r6 = r8.f24930c
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f24930c
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f24930c
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f24930c
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.com.google.gson.stream.C10942c.m11886A0(java.lang.String):void");
    }

    /* renamed from: I */
    private C10942c m11885I(int i, int i2, String str) throws IOException {
        int m11876i0 = m11876i0();
        if (m11876i0 != i2 && m11876i0 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f24937z == null) {
            this.f24932e--;
            if (m11876i0 == i2) {
                m11880b0();
            }
            this.f24930c.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f24937z);
    }

    /* renamed from: J0 */
    private void m11884J0() throws IOException {
        if (this.f24937z != null) {
            m11879c();
            m11886A0(this.f24937z);
            this.f24937z = null;
        }
    }

    /* renamed from: b0 */
    private void m11880b0() throws IOException {
        if (this.f24933f == null) {
            return;
        }
        this.f24930c.write("\n");
        int i = this.f24932e;
        for (int i2 = 1; i2 < i; i2++) {
            this.f24930c.write(this.f24933f);
        }
    }

    /* renamed from: c */
    private void m11879c() throws IOException {
        int m11876i0 = m11876i0();
        if (m11876i0 == 5) {
            this.f24930c.write(44);
        } else if (m11876i0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m11880b0();
        m11874o0(4);
    }

    /* renamed from: g */
    private void m11878g() throws IOException {
        int m11876i0 = m11876i0();
        if (m11876i0 == 1) {
            m11874o0(2);
            m11880b0();
        } else if (m11876i0 == 2) {
            this.f24930c.append(',');
            m11880b0();
        } else if (m11876i0 != 4) {
            if (m11876i0 != 6) {
                if (m11876i0 == 7) {
                    if (!this.f24935x) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            m11874o0(7);
        } else {
            this.f24930c.append((CharSequence) this.f24934w);
            m11874o0(5);
        }
    }

    /* renamed from: g0 */
    private C10942c m11877g0(int i, String str) throws IOException {
        m11878g();
        m11875k0(i);
        this.f24930c.write(str);
        return this;
    }

    /* renamed from: i0 */
    private int m11876i0() {
        int i = this.f24932e;
        if (i != 0) {
            return this.f24931d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: k0 */
    private void m11875k0(int i) {
        int i2 = this.f24932e;
        int[] iArr = this.f24931d;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f24931d = iArr2;
        }
        int[] iArr3 = this.f24931d;
        int i3 = this.f24932e;
        this.f24932e = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: o0 */
    private void m11874o0(int i) {
        this.f24931d[this.f24932e - 1] = i;
    }

    /* renamed from: C0 */
    public C10942c mo11769C0(long j) throws IOException {
        m11884J0();
        m11878g();
        this.f24930c.write(Long.toString(j));
        return this;
    }

    /* renamed from: D0 */
    public C10942c mo11768D0(Boolean bool) throws IOException {
        if (bool == null) {
            return mo11757f0();
        }
        m11884J0();
        m11878g();
        this.f24930c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: E0 */
    public C10942c mo11767E0(Number number) throws IOException {
        if (number == null) {
            return mo11757f0();
        }
        m11884J0();
        String obj = number.toString();
        if (!this.f24935x && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m11878g();
        this.f24930c.append((CharSequence) obj);
        return this;
    }

    /* renamed from: F */
    public C10942c mo11766F() throws IOException {
        m11884J0();
        m11877g0(3, "{");
        return this;
    }

    /* renamed from: F0 */
    public C10942c mo11765F0(String str) throws IOException {
        if (str == null) {
            return mo11757f0();
        }
        m11884J0();
        m11878g();
        m11886A0(str);
        return this;
    }

    /* renamed from: H0 */
    public C10942c mo11764H0(boolean z) throws IOException {
        m11884J0();
        m11878g();
        this.f24930c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: J */
    public C10942c mo11763J() throws IOException {
        m11885I(1, 2, "]");
        return this;
    }

    /* renamed from: O */
    public C10942c mo11760O() throws IOException {
        m11885I(3, 5, "}");
        return this;
    }

    /* renamed from: P */
    public final boolean m11883P() {
        return this.f24929A;
    }

    /* renamed from: V */
    public final boolean m11882V() {
        return this.f24936y;
    }

    /* renamed from: X */
    public boolean m11881X() {
        return this.f24935x;
    }

    /* renamed from: Z */
    public C10942c mo11758Z(String str) throws IOException {
        if (str != null) {
            if (this.f24937z == null) {
                if (this.f24932e != 0) {
                    this.f24937z = str;
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
        this.f24930c.close();
        int i = this.f24932e;
        if (i <= 1 && (i != 1 || this.f24931d[i - 1] == 7)) {
            this.f24932e = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: f0 */
    public C10942c mo11757f0() throws IOException {
        if (this.f24937z != null) {
            if (this.f24929A) {
                m11884J0();
            } else {
                this.f24937z = null;
                return this;
            }
        }
        m11878g();
        this.f24930c.write("null");
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f24932e != 0) {
            this.f24930c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: m */
    public C10942c mo11756m() throws IOException {
        m11884J0();
        m11877g0(1, "[");
        return this;
    }

    /* renamed from: u0 */
    public final void m11873u0(boolean z) {
        this.f24936y = z;
    }

    /* renamed from: w0 */
    public final void m11872w0(String str) {
        if (str.length() == 0) {
            this.f24933f = null;
            this.f24934w = ":";
            return;
        }
        this.f24933f = str;
        this.f24934w = ": ";
    }

    /* renamed from: x0 */
    public final void m11871x0(boolean z) {
        this.f24935x = z;
    }

    /* renamed from: z0 */
    public final void m11870z0(boolean z) {
        this.f24929A = z;
    }
}
