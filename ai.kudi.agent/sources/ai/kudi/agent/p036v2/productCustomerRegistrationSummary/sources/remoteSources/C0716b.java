package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.streaming.CustomerOnboardingResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.sources.remoteSources.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0716b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0716b f1945e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0716b $r0 = new C0716b();
        f1945e = $r0;
    }

    private /* synthetic */ C0716b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        Throwable $r3 = (Throwable) obj;
        CustomerOnboardingResponse $r1 = RegisterCustomerRemoteSource.m41603registerCustomer$lambda2($r3);
        return $r1;
    }
}
