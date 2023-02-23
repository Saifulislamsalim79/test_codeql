package p272h.p286c.p355d.p356a.p357a.p358a.p359e;

import io.grpc.AbstractC9508e;
import io.grpc.C10060t0;
import io.grpc.C9502d;
import io.grpc.p388j1.p389a.C9983b;
import io.grpc.p390k1.AbstractC9988a;
import io.grpc.p390k1.AbstractC9989b;
import io.grpc.p390k1.C9991c;
/* compiled from: InAppMessagingSdkServingGrpc.java */
/* renamed from: h.c.d.a.a.a.e.g */
/* loaded from: classes2.dex */
public final class C9392g {

    /* renamed from: a */
    private static volatile C10060t0<C9385d, C9388e> f22001a;

    /* compiled from: InAppMessagingSdkServingGrpc.java */
    /* renamed from: h.c.d.a.a.a.e.g$a */
    /* loaded from: classes2.dex */
    class C9393a implements AbstractC9989b.InterfaceC9990a<C9394b> {
        C9393a() {
        }

        @Override // io.grpc.p390k1.AbstractC9989b.InterfaceC9990a
        /* renamed from: b */
        public C9394b mo13358a(AbstractC9508e abstractC9508e, C9502d c9502d) {
            return new C9394b(abstractC9508e, c9502d, null);
        }
    }

    /* compiled from: InAppMessagingSdkServingGrpc.java */
    /* renamed from: h.c.d.a.a.a.e.g$b */
    /* loaded from: classes2.dex */
    public static final class C9394b extends AbstractC9988a<C9394b> {
        /* synthetic */ C9394b(AbstractC9508e abstractC9508e, C9502d c9502d, C9391f c9391f) {
            this(abstractC9508e, c9502d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.p390k1.AbstractC9989b
        /* renamed from: g */
        public C9394b mo13362a(AbstractC9508e abstractC9508e, C9502d c9502d) {
            return new C9394b(abstractC9508e, c9502d);
        }

        /* renamed from: h */
        public C9388e m14860h(C9385d c9385d) {
            return (C9388e) C9991c.m13356b(m13360c(), C9392g.m14864a(), m13361b(), c9385d);
        }

        private C9394b(AbstractC9508e abstractC9508e, C9502d c9502d) {
            super(abstractC9508e, c9502d);
        }
    }

    private C9392g() {
    }

    /* renamed from: a */
    public static C10060t0<C9385d, C9388e> m14864a() {
        C10060t0<C9385d, C9388e> c10060t0 = f22001a;
        if (c10060t0 == null) {
            synchronized (C9392g.class) {
                c10060t0 = f22001a;
                if (c10060t0 == null) {
                    C10060t0.C10062b m13164g = C10060t0.m13164g();
                    m13164g.m13155f(C10060t0.EnumC10064d.UNARY);
                    m13164g.m13159b(C10060t0.m13169b("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns"));
                    m13164g.m13156e(true);
                    m13164g.m13158c(C9983b.m13374b(C9385d.m14883Y()));
                    m13164g.m13157d(C9983b.m13374b(C9388e.m14871T()));
                    c10060t0 = m13164g.m13160a();
                    f22001a = c10060t0;
                }
            }
        }
        return c10060t0;
    }

    /* renamed from: b */
    public static C9394b m14863b(AbstractC9508e abstractC9508e) {
        return (C9394b) AbstractC9988a.m13364e(new C9393a(), abstractC9508e);
    }
}
