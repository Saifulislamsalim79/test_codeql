package ai.kudi.agent.referral.domain.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.referral.AgentReferralModel;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.referral.domain.usecase.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0412c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0412c f962d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0412c $r0 = new C0412c();
        f962d = $r0;
    }

    private /* synthetic */ C0412c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        AgentReferralModel $r1 = BuzzReferredAgent.m40238execute$lambda2$lambda0($r3);
        return $r1;
    }
}
