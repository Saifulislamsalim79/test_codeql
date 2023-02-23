package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.C10924g;
import io.intercom.com.google.gson.C10928k;
import io.intercom.com.google.gson.C10929l;
import io.intercom.com.google.gson.C10930m;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
/* compiled from: JsonTreeReader.java */
/* renamed from: io.intercom.com.google.gson.t.n.e */
/* loaded from: classes3.dex */
public final class C10994e extends C10939a {

    /* renamed from: M */
    private static final Object f25012M;

    /* renamed from: I */
    private Object[] f25013I;

    /* renamed from: J */
    private int f25014J;

    /* renamed from: K */
    private String[] f25015K;

    /* renamed from: L */
    private int[] f25016L;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: io.intercom.com.google.gson.t.n.e$a */
    /* loaded from: classes3.dex */
    static class C10995a extends Reader {
        C10995a() {
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

    static {
        new C10995a();
        f25012M = new Object();
    }

    /* renamed from: Z0 */
    private void m11784Z0(EnumC10941b enumC10941b) throws IOException {
        if (mo11789C0() == enumC10941b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC10941b + " but was " + mo11789C0() + m11783b0());
    }

    /* renamed from: b0 */
    private String m11783b0() {
        return " at path " + getPath();
    }

    /* renamed from: b1 */
    private Object m11782b1() {
        return this.f25013I[this.f25014J - 1];
    }

    /* renamed from: c1 */
    private Object m11780c1() {
        Object[] objArr = this.f25013I;
        int i = this.f25014J - 1;
        this.f25014J = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: e1 */
    private void m11778e1(Object obj) {
        int i = this.f25014J;
        Object[] objArr = this.f25013I;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            int[] iArr = new int[i * 2];
            String[] strArr = new String[i * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f25016L, 0, iArr, 0, this.f25014J);
            System.arraycopy(this.f25015K, 0, strArr, 0, this.f25014J);
            this.f25013I = objArr2;
            this.f25016L = iArr;
            this.f25015K = strArr;
        }
        Object[] objArr3 = this.f25013I;
        int i2 = this.f25014J;
        this.f25014J = i2 + 1;
        objArr3[i2] = obj;
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: C0 */
    public EnumC10941b mo11789C0() throws IOException {
        if (this.f25014J == 0) {
            return EnumC10941b.END_DOCUMENT;
        }
        Object m11782b1 = m11782b1();
        if (m11782b1 instanceof Iterator) {
            boolean z = this.f25013I[this.f25014J - 2] instanceof C10929l;
            Iterator it = (Iterator) m11782b1;
            if (!it.hasNext()) {
                return z ? EnumC10941b.END_OBJECT : EnumC10941b.END_ARRAY;
            } else if (z) {
                return EnumC10941b.NAME;
            } else {
                m11778e1(it.next());
                return mo11789C0();
            }
        } else if (m11782b1 instanceof C10929l) {
            return EnumC10941b.BEGIN_OBJECT;
        } else {
            if (m11782b1 instanceof C10924g) {
                return EnumC10941b.BEGIN_ARRAY;
            }
            if (m11782b1 instanceof C10930m) {
                C10930m c10930m = (C10930m) m11782b1;
                if (c10930m.m11913b0()) {
                    return EnumC10941b.STRING;
                }
                if (c10930m.m11917P()) {
                    return EnumC10941b.BOOLEAN;
                }
                if (c10930m.m11915X()) {
                    return EnumC10941b.NUMBER;
                }
                throw new AssertionError();
            } else if (m11782b1 instanceof C10928k) {
                return EnumC10941b.NULL;
            } else {
                if (m11782b1 == f25012M) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: J */
    public void mo11788J() throws IOException {
        m11784Z0(EnumC10941b.END_ARRAY);
        m11780c1();
        m11780c1();
        int i = this.f25014J;
        if (i > 0) {
            int[] iArr = this.f25016L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: O */
    public void mo11787O() throws IOException {
        m11784Z0(EnumC10941b.END_OBJECT);
        m11780c1();
        m11780c1();
        int i = this.f25014J;
        if (i > 0) {
            int[] iArr = this.f25016L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: U0 */
    public void mo11786U0() throws IOException {
        if (mo11789C0() == EnumC10941b.NAME) {
            mo11772o0();
            this.f25015K[this.f25014J - 2] = "null";
        } else {
            m11780c1();
            int i = this.f25014J;
            if (i > 0) {
                this.f25015K[i - 1] = "null";
            }
        }
        int i2 = this.f25014J;
        if (i2 > 0) {
            int[] iArr = this.f25016L;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: V */
    public boolean mo11785V() throws IOException {
        EnumC10941b mo11789C0 = mo11789C0();
        return (mo11789C0 == EnumC10941b.END_OBJECT || mo11789C0 == EnumC10941b.END_ARRAY) ? false : true;
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: c */
    public void mo11781c() throws IOException {
        m11784Z0(EnumC10941b.BEGIN_ARRAY);
        m11778e1(((C10924g) m11782b1()).iterator());
        this.f25016L[this.f25014J - 1] = 0;
    }

    @Override // io.intercom.com.google.gson.stream.C10939a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25013I = new Object[]{f25012M};
        this.f25014J = 1;
    }

    /* renamed from: d1 */
    public void m11779d1() throws IOException {
        m11784Z0(EnumC10941b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m11782b1()).next();
        m11778e1(entry.getValue());
        m11778e1(new C10930m((String) entry.getKey()));
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: f0 */
    public boolean mo11777f0() throws IOException {
        m11784Z0(EnumC10941b.BOOLEAN);
        boolean m11911s = ((C10930m) m11780c1()).m11911s();
        int i = this.f25014J;
        if (i > 0) {
            int[] iArr = this.f25016L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m11911s;
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: g */
    public void mo11776g() throws IOException {
        m11784Z0(EnumC10941b.BEGIN_OBJECT);
        m11778e1(((C10929l) m11782b1()).m11923u().iterator());
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: g0 */
    public double mo11775g0() throws IOException {
        EnumC10941b mo11789C0 = mo11789C0();
        if (mo11789C0 != EnumC10941b.NUMBER && mo11789C0 != EnumC10941b.STRING) {
            throw new IllegalStateException("Expected " + EnumC10941b.NUMBER + " but was " + mo11789C0 + m11783b0());
        }
        double m11922E = ((C10930m) m11782b1()).m11922E();
        if (!m11893X() && (Double.isNaN(m11922E) || Double.isInfinite(m11922E))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + m11922E);
        }
        m11780c1();
        int i = this.f25014J;
        if (i > 0) {
            int[] iArr = this.f25016L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m11922E;
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f25014J) {
            Object[] objArr = this.f25013I;
            if (objArr[i] instanceof C10924g) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f25016L[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C10929l) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f25015K;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: i0 */
    public int mo11774i0() throws IOException {
        EnumC10941b mo11789C0 = mo11789C0();
        if (mo11789C0 != EnumC10941b.NUMBER && mo11789C0 != EnumC10941b.STRING) {
            throw new IllegalStateException("Expected " + EnumC10941b.NUMBER + " but was " + mo11789C0 + m11783b0());
        }
        int m11921F = ((C10930m) m11782b1()).m11921F();
        m11780c1();
        int i = this.f25014J;
        if (i > 0) {
            int[] iArr = this.f25016L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m11921F;
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: k0 */
    public long mo11773k0() throws IOException {
        EnumC10941b mo11789C0 = mo11789C0();
        if (mo11789C0 != EnumC10941b.NUMBER && mo11789C0 != EnumC10941b.STRING) {
            throw new IllegalStateException("Expected " + EnumC10941b.NUMBER + " but was " + mo11789C0 + m11783b0());
        }
        long m11920I = ((C10930m) m11782b1()).m11920I();
        m11780c1();
        int i = this.f25014J;
        if (i > 0) {
            int[] iArr = this.f25016L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m11920I;
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: o0 */
    public String mo11772o0() throws IOException {
        m11784Z0(EnumC10941b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m11782b1()).next();
        String str = (String) entry.getKey();
        this.f25015K[this.f25014J - 1] = str;
        m11778e1(entry.getValue());
        return str;
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    public String toString() {
        return C10994e.class.getSimpleName();
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: w0 */
    public void mo11771w0() throws IOException {
        m11784Z0(EnumC10941b.NULL);
        m11780c1();
        int i = this.f25014J;
        if (i > 0) {
            int[] iArr = this.f25016L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // io.intercom.com.google.gson.stream.C10939a
    /* renamed from: z0 */
    public String mo11770z0() throws IOException {
        EnumC10941b mo11789C0 = mo11789C0();
        if (mo11789C0 != EnumC10941b.STRING && mo11789C0 != EnumC10941b.NUMBER) {
            throw new IllegalStateException("Expected " + EnumC10941b.STRING + " but was " + mo11789C0 + m11783b0());
        }
        String m11918O = ((C10930m) m11780c1()).m11918O();
        int i = this.f25014J;
        if (i > 0) {
            int[] iArr = this.f25016L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m11918O;
    }
}
