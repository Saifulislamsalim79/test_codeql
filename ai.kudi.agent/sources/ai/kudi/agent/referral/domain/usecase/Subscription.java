package ai.kudi.agent.referral.domain.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.referral.AgentWithdrawalResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Subscription implements InterfaceC11291f {
    public static final /* synthetic */ Subscription subscribed;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Subscription $r0 = new Subscription();
        subscribed = $r0;
    }

    private /* synthetic */ Subscription() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        AgentWithdrawalResponse $r1 = WithdrawFunds.m40250execute$lambda1$lambda0($r3);
        return $r1;
    }
}
