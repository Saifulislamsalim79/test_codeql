package com.google.gson.internal.bind;

import com.google.gson.AbstractC6900l;
import com.google.gson.C6793i;
import com.google.gson.C6901m;
import com.google.gson.C6902n;
import com.google.gson.C6903o;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* compiled from: JsonTreeReader.java */
/* renamed from: com.google.gson.internal.bind.a */
/* loaded from: classes2.dex */
public final class C6852a extends C6911a {

    /* renamed from: M */
    private static final Reader f16488M = new C6853a();

    /* renamed from: N */
    private static final Object f16489N = new Object();

    /* renamed from: I */
    private Object[] f16490I;

    /* renamed from: J */
    private int f16491J;

    /* renamed from: K */
    private String[] f16492K;

    /* renamed from: L */
    private int[] f16493L;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.internal.bind.a$a */
    /* loaded from: classes2.dex */
    class C6853a extends Reader {
        C6853a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public C6852a(AbstractC6900l abstractC6900l) {
        super(f16488M);
        this.f16490I = new Object[32];
        this.f16491J = 0;
        this.f16492K = new String[32];
        this.f16493L = new int[32];
        m20602e1(abstractC6900l);
    }

    /* renamed from: Z0 */
    private void m20607Z0(EnumC6913b enumC6913b) throws IOException {
        if (mo20525C0() == enumC6913b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC6913b + " but was " + mo20525C0() + m20606b0());
    }

    /* renamed from: b0 */
    private String m20606b0() {
        return " at path " + getPath();
    }

    /* renamed from: b1 */
    private Object m20605b1() {
        return this.f16490I[this.f16491J - 1];
    }

    /* renamed from: c1 */
    private Object m20604c1() {
        Object[] objArr = this.f16490I;
        int i = this.f16491J - 1;
        this.f16491J = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: e1 */
    private void m20602e1(Object obj) {
        int i = this.f16491J;
        Object[] objArr = this.f16490I;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f16490I = Arrays.copyOf(objArr, i2);
            this.f16493L = Arrays.copyOf(this.f16493L, i2);
            this.f16492K = (String[]) Arrays.copyOf(this.f16492K, i2);
        }
        Object[] objArr2 = this.f16490I;
        int i3 = this.f16491J;
        this.f16491J = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: C0 */
    public EnumC6913b mo20525C0() throws IOException {
        if (this.f16491J == 0) {
            return EnumC6913b.END_DOCUMENT;
        }
        Object m20605b1 = m20605b1();
        if (m20605b1 instanceof Iterator) {
            boolean z = this.f16490I[this.f16491J - 2] instanceof C6902n;
            Iterator it = (Iterator) m20605b1;
            if (!it.hasNext()) {
                return z ? EnumC6913b.END_OBJECT : EnumC6913b.END_ARRAY;
            } else if (z) {
                return EnumC6913b.NAME;
            } else {
                m20602e1(it.next());
                return mo20525C0();
            }
        } else if (m20605b1 instanceof C6902n) {
            return EnumC6913b.BEGIN_OBJECT;
        } else {
            if (m20605b1 instanceof C6793i) {
                return EnumC6913b.BEGIN_ARRAY;
            }
            if (m20605b1 instanceof C6903o) {
                C6903o c6903o = (C6903o) m20605b1;
                if (c6903o.m20534X()) {
                    return EnumC6913b.STRING;
                }
                if (c6903o.m20537O()) {
                    return EnumC6913b.BOOLEAN;
                }
                if (c6903o.m20535V()) {
                    return EnumC6913b.NUMBER;
                }
                throw new AssertionError();
            } else if (m20605b1 instanceof C6901m) {
                return EnumC6913b.NULL;
            } else {
                if (m20605b1 == f16489N) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: J */
    public void mo20518J() throws IOException {
        m20607Z0(EnumC6913b.END_ARRAY);
        m20604c1();
        m20604c1();
        int i = this.f16491J;
        if (i > 0) {
            int[] iArr = this.f16493L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: O */
    public void mo20514O() throws IOException {
        m20607Z0(EnumC6913b.END_OBJECT);
        m20604c1();
        m20604c1();
        int i = this.f16491J;
        if (i > 0) {
            int[] iArr = this.f16493L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: U0 */
    public void mo20510U0() throws IOException {
        if (mo20525C0() == EnumC6913b.NAME) {
            mo20497o0();
            this.f16492K[this.f16491J - 2] = "null";
        } else {
            m20604c1();
            int i = this.f16491J;
            if (i > 0) {
                this.f16492K[i - 1] = "null";
            }
        }
        int i2 = this.f16491J;
        if (i2 > 0) {
            int[] iArr = this.f16493L;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: V */
    public boolean mo20509V() throws IOException {
        EnumC6913b mo20525C0 = mo20525C0();
        return (mo20525C0 == EnumC6913b.END_OBJECT || mo20525C0 == EnumC6913b.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: c */
    public void mo20504c() throws IOException {
        m20607Z0(EnumC6913b.BEGIN_ARRAY);
        m20602e1(((C6793i) m20605b1()).iterator());
        this.f16493L[this.f16491J - 1] = 0;
    }

    @Override // com.google.gson.stream.C6911a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16490I = new Object[]{f16489N};
        this.f16491J = 1;
    }

    /* renamed from: d1 */
    public void m20603d1() throws IOException {
        m20607Z0(EnumC6913b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m20605b1()).next();
        m20602e1(entry.getValue());
        m20602e1(new C6903o((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: f0 */
    public boolean mo20503f0() throws IOException {
        m20607Z0(EnumC6913b.BOOLEAN);
        boolean m20533s = ((C6903o) m20604c1()).m20533s();
        int i = this.f16491J;
        if (i > 0) {
            int[] iArr = this.f16493L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m20533s;
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: g */
    public void mo20502g() throws IOException {
        m20607Z0(EnumC6913b.BEGIN_OBJECT);
        m20602e1(((C6902n) m20605b1()).m20542u().iterator());
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: g0 */
    public double mo20501g0() throws IOException {
        EnumC6913b mo20525C0 = mo20525C0();
        if (mo20525C0 != EnumC6913b.NUMBER && mo20525C0 != EnumC6913b.STRING) {
            throw new IllegalStateException("Expected " + EnumC6913b.NUMBER + " but was " + mo20525C0 + m20606b0());
        }
        double m20532u = ((C6903o) m20605b1()).m20532u();
        if (!m20508X() && (Double.isNaN(m20532u) || Double.isInfinite(m20532u))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + m20532u);
        }
        m20604c1();
        int i = this.f16491J;
        if (i > 0) {
            int[] iArr = this.f16493L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m20532u;
    }

    @Override // com.google.gson.stream.C6911a
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f16491J) {
            Object[] objArr = this.f16490I;
            if (objArr[i] instanceof C6793i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f16493L[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C6902n) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f16492K;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: i0 */
    public int mo20500i0() throws IOException {
        EnumC6913b mo20525C0 = mo20525C0();
        if (mo20525C0 != EnumC6913b.NUMBER && mo20525C0 != EnumC6913b.STRING) {
            throw new IllegalStateException("Expected " + EnumC6913b.NUMBER + " but was " + mo20525C0 + m20606b0());
        }
        int m20541E = ((C6903o) m20605b1()).m20541E();
        m20604c1();
        int i = this.f16491J;
        if (i > 0) {
            int[] iArr = this.f16493L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m20541E;
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: k0 */
    public long mo20499k0() throws IOException {
        EnumC6913b mo20525C0 = mo20525C0();
        if (mo20525C0 != EnumC6913b.NUMBER && mo20525C0 != EnumC6913b.STRING) {
            throw new IllegalStateException("Expected " + EnumC6913b.NUMBER + " but was " + mo20525C0 + m20606b0());
        }
        long m20540F = ((C6903o) m20605b1()).m20540F();
        m20604c1();
        int i = this.f16491J;
        if (i > 0) {
            int[] iArr = this.f16493L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m20540F;
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: o0 */
    public String mo20497o0() throws IOException {
        m20607Z0(EnumC6913b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m20605b1()).next();
        String str = (String) entry.getKey();
        this.f16492K[this.f16491J - 1] = str;
        m20602e1(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.C6911a
    public String toString() {
        return C6852a.class.getSimpleName();
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: w0 */
    public void mo20495w0() throws IOException {
        m20607Z0(EnumC6913b.NULL);
        m20604c1();
        int i = this.f16491J;
        if (i > 0) {
            int[] iArr = this.f16493L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.C6911a
    /* renamed from: z0 */
    public String mo20493z0() throws IOException {
        EnumC6913b mo20525C0 = mo20525C0();
        if (mo20525C0 != EnumC6913b.STRING && mo20525C0 != EnumC6913b.NUMBER) {
            throw new IllegalStateException("Expected " + EnumC6913b.STRING + " but was " + mo20525C0 + m20606b0());
        }
        String m20538J = ((C6903o) m20604c1()).m20538J();
        int i = this.f16491J;
        if (i > 0) {
            int[] iArr = this.f16493L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m20538J;
    }
}
