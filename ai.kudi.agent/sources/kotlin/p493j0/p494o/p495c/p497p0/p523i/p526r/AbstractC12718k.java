package kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: constantValues.kt */
/* renamed from: kotlin.j0.o.c.p0.i.r.k */
/* loaded from: classes3.dex */
public abstract class AbstractC12718k extends AbstractC12712g<C13666w> {

    /* renamed from: b */
    public static final C12719a f28578b = new C12719a(null);

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.k$a */
    /* loaded from: classes3.dex */
    public static final class C12719a {
        private C12719a() {
        }

        public /* synthetic */ C12719a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final AbstractC12718k m6903a(String str) {
            l.f(str, MetricTracker.Object.MESSAGE);
            return new C12720b(str);
        }
    }

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.r.k$b */
    /* loaded from: classes3.dex */
    public static final class C12720b extends AbstractC12718k {

        /* renamed from: c */
        private final String f28579c;

        public C12720b(String str) {
            l.f(str, MetricTracker.Object.MESSAGE);
            this.f28579c = str;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
        /* renamed from: d */
        public AbstractC13010i0 mo6871a(InterfaceC13305c0 interfaceC13305c0) {
            l.f(interfaceC13305c0, "module");
            AbstractC13010i0 m5811j = C13118t.m5811j(this.f28579c);
            l.e(m5811j, "createErrorType(message)");
            return m5811j;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
        public String toString() {
            return this.f28579c;
        }
    }

    public AbstractC12718k() {
        super(C13666w.f30112a);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C13666w mo6905b() {
        m6904c();
        throw null;
    }

    /* renamed from: c */
    public C13666w m6904c() {
        throw new UnsupportedOperationException();
    }
}
