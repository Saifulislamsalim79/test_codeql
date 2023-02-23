package com.google.gson.internal.bind;

import com.google.gson.AbstractC6900l;
import com.google.gson.C6793i;
import com.google.gson.C6901m;
import com.google.gson.C6902n;
import com.google.gson.C6903o;
import com.google.gson.stream.C6914c;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: JsonTreeWriter.java */
/* renamed from: com.google.gson.internal.bind.b */
/* loaded from: classes2.dex */
public final class C6854b extends C6914c {

    /* renamed from: G */
    private static final Writer f16494G = new C6855a();

    /* renamed from: H */
    private static final C6903o f16495H = new C6903o(MetricTracker.Action.CLOSED);

    /* renamed from: D */
    private final List<AbstractC6900l> f16496D;

    /* renamed from: E */
    private String f16497E;

    /* renamed from: F */
    private AbstractC6900l f16498F;

    /* compiled from: JsonTreeWriter.java */
    /* renamed from: com.google.gson.internal.bind.b$a */
    /* loaded from: classes2.dex */
    class C6855a extends Writer {
        C6855a() {
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

    public C6854b() {
        super(f16494G);
        this.f16496D = new ArrayList();
        this.f16498F = C6901m.f16551a;
    }

    /* renamed from: L0 */
    private AbstractC6900l m20600L0() {
        List<AbstractC6900l> list = this.f16496D;
        return list.get(list.size() - 1);
    }

    /* renamed from: P0 */
    private void m20599P0(AbstractC6900l abstractC6900l) {
        if (this.f16497E != null) {
            if (!abstractC6900l.m20546k() || m20480P()) {
                ((C6902n) m20600L0()).m20543s(this.f16497E, abstractC6900l);
            }
            this.f16497E = null;
        } else if (this.f16496D.isEmpty()) {
            this.f16498F = abstractC6900l;
        } else {
            AbstractC6900l m20600L0 = m20600L0();
            if (m20600L0 instanceof C6793i) {
                ((C6793i) m20600L0).m20730s(abstractC6900l);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: C0 */
    public C6914c mo20490C0(long j) throws IOException {
        m20599P0(new C6903o(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: D0 */
    public C6914c mo20489D0(Boolean bool) throws IOException {
        if (bool == null) {
            mo20474f0();
            return this;
        }
        m20599P0(new C6903o(bool));
        return this;
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: E0 */
    public C6914c mo20488E0(Number number) throws IOException {
        if (number == null) {
            mo20474f0();
            return this;
        }
        if (!m20478X()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m20599P0(new C6903o(number));
        return this;
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: F */
    public C6914c mo20487F() throws IOException {
        C6902n c6902n = new C6902n();
        m20599P0(c6902n);
        this.f16496D.add(c6902n);
        return this;
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: F0 */
    public C6914c mo20486F0(String str) throws IOException {
        if (str == null) {
            mo20474f0();
            return this;
        }
        m20599P0(new C6903o(str));
        return this;
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: H0 */
    public C6914c mo20485H0(boolean z) throws IOException {
        m20599P0(new C6903o(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: J */
    public C6914c mo20483J() throws IOException {
        if (!this.f16496D.isEmpty() && this.f16497E == null) {
            if (m20600L0() instanceof C6793i) {
                List<AbstractC6900l> list = this.f16496D;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* renamed from: K0 */
    public AbstractC6900l m20601K0() {
        if (this.f16496D.isEmpty()) {
            return this.f16498F;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f16496D);
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: O */
    public C6914c mo20481O() throws IOException {
        if (!this.f16496D.isEmpty() && this.f16497E == null) {
            if (m20600L0() instanceof C6902n) {
                List<AbstractC6900l> list = this.f16496D;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: Z */
    public C6914c mo20477Z(String str) throws IOException {
        if (!this.f16496D.isEmpty() && this.f16497E == null) {
            if (m20600L0() instanceof C6902n) {
                this.f16497E = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.C6914c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f16496D.isEmpty()) {
            this.f16496D.add(f16495H);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: f0 */
    public C6914c mo20474f0() throws IOException {
        m20599P0(C6901m.f16551a);
        return this;
    }

    @Override // com.google.gson.stream.C6914c, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.C6914c
    /* renamed from: m */
    public C6914c mo20469m() throws IOException {
        C6793i c6793i = new C6793i();
        m20599P0(c6793i);
        this.f16496D.add(c6793i);
        return this;
    }
}
