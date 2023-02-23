package io.grpc.p384h1;

import io.grpc.AbstractC10001l;
import io.grpc.AbstractC9507d1;
import io.grpc.C10049s0;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: StatsTraceContext.java */
/* renamed from: io.grpc.h1.i2 */
/* loaded from: classes2.dex */
public final class C9676i2 {

    /* renamed from: a */
    private final AbstractC9507d1[] f22727a;

    /* renamed from: b */
    private final AtomicBoolean f22728b = new AtomicBoolean(false);

    static {
        new C9676i2(new AbstractC9507d1[0]);
    }

    C9676i2(AbstractC9507d1[] abstractC9507d1Arr) {
        this.f22727a = abstractC9507d1Arr;
    }

    /* renamed from: h */
    public static C9676i2 m14212h(AbstractC10001l[] abstractC10001lArr, C9477a c9477a, C10049s0 c10049s0) {
        C9676i2 c9676i2 = new C9676i2(abstractC10001lArr);
        for (AbstractC10001l abstractC10001l : abstractC10001lArr) {
            abstractC10001l.mo13333m(c9477a, c10049s0);
        }
        return c9676i2;
    }

    /* renamed from: a */
    public void m14219a() {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            ((AbstractC10001l) abstractC9507d1).mo13336j();
        }
    }

    /* renamed from: b */
    public void m14218b(C10049s0 c10049s0) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            ((AbstractC10001l) abstractC9507d1).mo13335k(c10049s0);
        }
    }

    /* renamed from: c */
    public void m14217c() {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            ((AbstractC10001l) abstractC9507d1).mo13334l();
        }
    }

    /* renamed from: d */
    public void m14216d(int i) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            abstractC9507d1.mo14196a(i);
        }
    }

    /* renamed from: e */
    public void m14215e(int i, long j, long j2) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            abstractC9507d1.mo14195b(i, j, j2);
        }
    }

    /* renamed from: f */
    public void m14214f(long j) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            abstractC9507d1.mo14194c(j);
        }
    }

    /* renamed from: g */
    public void m14213g(long j) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            abstractC9507d1.mo14193d(j);
        }
    }

    /* renamed from: i */
    public void m14211i(int i) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            abstractC9507d1.mo14192e(i);
        }
    }

    /* renamed from: j */
    public void m14210j(int i, long j, long j2) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            abstractC9507d1.mo14191f(i, j, j2);
        }
    }

    /* renamed from: k */
    public void m14209k(long j) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            abstractC9507d1.mo14190g(j);
        }
    }

    /* renamed from: l */
    public void m14208l(long j) {
        for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
            abstractC9507d1.mo13759h(j);
        }
    }

    /* renamed from: m */
    public void m14207m(C9497c1 c9497c1) {
        if (this.f22728b.compareAndSet(false, true)) {
            for (AbstractC9507d1 abstractC9507d1 : this.f22727a) {
                abstractC9507d1.mo14047i(c9497c1);
            }
        }
    }
}
