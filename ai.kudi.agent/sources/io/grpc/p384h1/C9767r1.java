package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10020n0;
import io.grpc.C10041r;
import io.grpc.C10090y;
import io.grpc.C9497c1;
import io.grpc.EnumC10039q;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PickFirstLoadBalancer.java */
/* renamed from: io.grpc.h1.r1 */
/* loaded from: classes2.dex */
final class C9767r1 extends AbstractC10020n0 {

    /* renamed from: b */
    private final AbstractC10020n0.AbstractC10025d f22942b;

    /* renamed from: c */
    private AbstractC10020n0.AbstractC10030h f22943c;

    /* compiled from: PickFirstLoadBalancer.java */
    /* renamed from: io.grpc.h1.r1$a */
    /* loaded from: classes2.dex */
    class C9768a implements AbstractC10020n0.InterfaceC10032j {

        /* renamed from: a */
        final /* synthetic */ AbstractC10020n0.AbstractC10030h f22944a;

        C9768a(AbstractC10020n0.AbstractC10030h abstractC10030h) {
            this.f22944a = abstractC10030h;
        }

        @Override // io.grpc.AbstractC10020n0.InterfaceC10032j
        /* renamed from: a */
        public void mo13259a(C10041r c10041r) {
            C9767r1.this.m14033g(this.f22944a, c10041r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PickFirstLoadBalancer.java */
    /* renamed from: io.grpc.h1.r1$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C9769b {

        /* renamed from: a */
        static final /* synthetic */ int[] f22946a;

        static {
            int[] iArr = new int[EnumC10039q.values().length];
            f22946a = iArr;
            try {
                iArr[EnumC10039q.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22946a[EnumC10039q.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22946a[EnumC10039q.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22946a[EnumC10039q.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PickFirstLoadBalancer.java */
    /* renamed from: io.grpc.h1.r1$c */
    /* loaded from: classes2.dex */
    public static final class C9770c extends AbstractC10020n0.AbstractC10031i {

        /* renamed from: a */
        private final AbstractC10020n0.C10026e f22947a;

        C9770c(AbstractC10020n0.C10026e c10026e) {
            C5051n.m25779o(c10026e, "result");
            this.f22947a = c10026e;
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10031i
        /* renamed from: a */
        public AbstractC10020n0.C10026e mo13260a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            return this.f22947a;
        }

        public String toString() {
            C5042j.C5044b m25813b = C5042j.m25813b(C9770c.class);
            m25813b.m25808d("result", this.f22947a);
            return m25813b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PickFirstLoadBalancer.java */
    /* renamed from: io.grpc.h1.r1$d */
    /* loaded from: classes2.dex */
    public final class C9771d extends AbstractC10020n0.AbstractC10031i {

        /* renamed from: a */
        private final AbstractC10020n0.AbstractC10030h f22948a;

        /* renamed from: b */
        private final AtomicBoolean f22949b = new AtomicBoolean(false);

        /* compiled from: PickFirstLoadBalancer.java */
        /* renamed from: io.grpc.h1.r1$d$a */
        /* loaded from: classes2.dex */
        class RunnableC9772a implements Runnable {
            RunnableC9772a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9771d.this.f22948a.mo13264e();
            }
        }

        C9771d(AbstractC10020n0.AbstractC10030h abstractC10030h) {
            C5051n.m25779o(abstractC10030h, "subchannel");
            this.f22948a = abstractC10030h;
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10031i
        /* renamed from: a */
        public AbstractC10020n0.C10026e mo13260a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            if (this.f22949b.compareAndSet(false, true)) {
                C9767r1.this.f22942b.mo13291c().execute(new RunnableC9772a());
            }
            return AbstractC10020n0.C10026e.m13282g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9767r1(AbstractC10020n0.AbstractC10025d abstractC10025d) {
        C5051n.m25779o(abstractC10025d, "helper");
        this.f22942b = abstractC10025d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m14033g(AbstractC10020n0.AbstractC10030h abstractC10030h, C10041r c10041r) {
        AbstractC10020n0.AbstractC10031i c9771d;
        AbstractC10020n0.AbstractC10031i abstractC10031i;
        EnumC10039q m13242c = c10041r.m13242c();
        if (m13242c == EnumC10039q.SHUTDOWN) {
            return;
        }
        if (c10041r.m13242c() == EnumC10039q.TRANSIENT_FAILURE || c10041r.m13242c() == EnumC10039q.IDLE) {
            this.f22942b.mo13290d();
        }
        int i = C9769b.f22946a[m13242c.ordinal()];
        if (i == 1) {
            c9771d = new C9771d(abstractC10030h);
        } else {
            if (i == 2) {
                abstractC10031i = new C9770c(AbstractC10020n0.C10026e.m13282g());
            } else if (i == 3) {
                c9771d = new C9770c(AbstractC10020n0.C10026e.m13281h(abstractC10030h));
            } else if (i == 4) {
                abstractC10031i = new C9770c(AbstractC10020n0.C10026e.m13283f(c10041r.m13241d()));
            } else {
                throw new IllegalArgumentException("Unsupported state:" + m13242c);
            }
            this.f22942b.mo13289e(m13242c, abstractC10031i);
        }
        abstractC10031i = c9771d;
        this.f22942b.mo13289e(m13242c, abstractC10031i);
    }

    @Override // io.grpc.AbstractC10020n0
    /* renamed from: b */
    public void mo13307b(C9497c1 c9497c1) {
        AbstractC10020n0.AbstractC10030h abstractC10030h = this.f22943c;
        if (abstractC10030h != null) {
            abstractC10030h.mo13263f();
            this.f22943c = null;
        }
        this.f22942b.mo13289e(EnumC10039q.TRANSIENT_FAILURE, new C9770c(AbstractC10020n0.C10026e.m13283f(c9497c1)));
    }

    @Override // io.grpc.AbstractC10020n0
    /* renamed from: c */
    public void mo13306c(AbstractC10020n0.C10028g c10028g) {
        List<C10090y> m13276a = c10028g.m13276a();
        AbstractC10020n0.AbstractC10030h abstractC10030h = this.f22943c;
        if (abstractC10030h == null) {
            AbstractC10020n0.AbstractC10025d abstractC10025d = this.f22942b;
            AbstractC10020n0.C10022b.C10023a m13302c = AbstractC10020n0.C10022b.m13302c();
            m13302c.m13296e(m13276a);
            AbstractC10020n0.AbstractC10030h mo13293a = abstractC10025d.mo13293a(m13302c.m13299b());
            mo13293a.mo13262g(new C9768a(mo13293a));
            this.f22943c = mo13293a;
            this.f22942b.mo13289e(EnumC10039q.CONNECTING, new C9770c(AbstractC10020n0.C10026e.m13281h(mo13293a)));
            mo13293a.mo13264e();
            return;
        }
        abstractC10030h.mo13261h(m13276a);
    }

    @Override // io.grpc.AbstractC10020n0
    /* renamed from: d */
    public void mo13305d() {
        AbstractC10020n0.AbstractC10030h abstractC10030h = this.f22943c;
        if (abstractC10030h != null) {
            abstractC10030h.mo13263f();
        }
    }
}
