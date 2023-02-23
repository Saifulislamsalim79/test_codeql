package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.com.google.gson.AbstractC10927j;
import io.intercom.com.google.gson.C10924g;
import io.intercom.com.google.gson.C10928k;
import io.intercom.com.google.gson.C10929l;
import io.intercom.com.google.gson.C10930m;
import io.intercom.com.google.gson.stream.C10942c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: JsonTreeWriter.java */
/* renamed from: io.intercom.com.google.gson.t.n.f */
/* loaded from: classes3.dex */
public final class C10996f extends C10942c {

    /* renamed from: G */
    private static final Writer f25017G = new C10997a();

    /* renamed from: H */
    private static final C10930m f25018H = new C10930m(MetricTracker.Action.CLOSED);

    /* renamed from: D */
    private final List<AbstractC10927j> f25019D;

    /* renamed from: E */
    private String f25020E;

    /* renamed from: F */
    private AbstractC10927j f25021F;

    /* compiled from: JsonTreeWriter.java */
    /* renamed from: io.intercom.com.google.gson.t.n.f$a */
    /* loaded from: classes3.dex */
    static class C10997a extends Writer {
        C10997a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C10996f() {
        super(f25017G);
        this.f25019D = new ArrayList();
        this.f25021F = C10928k.f24892a;
    }

    /* renamed from: L0 */
    private AbstractC10927j m11761L0() {
        List<AbstractC10927j> list = this.f25019D;
        return list.get(list.size() - 1);
    }

    /* renamed from: P0 */
    private void m11759P0(AbstractC10927j abstractC10927j) {
        if (this.f25020E != null) {
            if (!abstractC10927j.m11927k() || m11883P()) {
                ((C10929l) m11761L0()).m11924s(this.f25020E, abstractC10927j);
            }
            this.f25020E = null;
        } else if (this.f25019D.isEmpty()) {
            this.f25021F = abstractC10927j;
        } else {
            AbstractC10927j m11761L0 = m11761L0();
            if (m11761L0 instanceof C10924g) {
                ((C10924g) m11761L0).m11933s(abstractC10927j);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: C0 */
    public C10942c mo11769C0(long j) throws IOException {
        m11759P0(new C10930m(Long.valueOf(j)));
        return this;
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: D0 */
    public C10942c mo11768D0(Boolean bool) throws IOException {
        if (bool == null) {
            mo11757f0();
            return this;
        }
        m11759P0(new C10930m(bool));
        return this;
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: E0 */
    public C10942c mo11767E0(Number number) throws IOException {
        if (number == null) {
            mo11757f0();
            return this;
        }
        if (!m11881X()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m11759P0(new C10930m(number));
        return this;
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: F */
    public C10942c mo11766F() throws IOException {
        C10929l c10929l = new C10929l();
        m11759P0(c10929l);
        this.f25019D.add(c10929l);
        return this;
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: F0 */
    public C10942c mo11765F0(String str) throws IOException {
        if (str == null) {
            mo11757f0();
            return this;
        }
        m11759P0(new C10930m(str));
        return this;
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: H0 */
    public C10942c mo11764H0(boolean z) throws IOException {
        m11759P0(new C10930m(Boolean.valueOf(z)));
        return this;
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: J */
    public C10942c mo11763J() throws IOException {
        if (!this.f25019D.isEmpty() && this.f25020E == null) {
            if (m11761L0() instanceof C10924g) {
                List<AbstractC10927j> list = this.f25019D;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* renamed from: K0 */
    public AbstractC10927j m11762K0() {
        if (this.f25019D.isEmpty()) {
            return this.f25021F;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f25019D);
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: O */
    public C10942c mo11760O() throws IOException {
        if (!this.f25019D.isEmpty() && this.f25020E == null) {
            if (m11761L0() instanceof C10929l) {
                List<AbstractC10927j> list = this.f25019D;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: Z */
    public C10942c mo11758Z(String str) throws IOException {
        if (!this.f25019D.isEmpty() && this.f25020E == null) {
            if (m11761L0() instanceof C10929l) {
                this.f25020E = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // io.intercom.com.google.gson.stream.C10942c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f25019D.isEmpty()) {
            this.f25019D.add(f25018H);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: f0 */
    public C10942c mo11757f0() throws IOException {
        m11759P0(C10928k.f24892a);
        return this;
    }

    @Override // io.intercom.com.google.gson.stream.C10942c, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // io.intercom.com.google.gson.stream.C10942c
    /* renamed from: m */
    public C10942c mo11756m() throws IOException {
        C10924g c10924g = new C10924g();
        m11759P0(c10924g);
        this.f25019D.add(c10924g);
        return this;
    }
}
