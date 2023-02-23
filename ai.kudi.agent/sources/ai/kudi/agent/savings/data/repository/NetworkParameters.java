package ai.kudi.agent.savings.data.repository;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.savings.data.model.SavingsBalance;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class NetworkParameters implements InterfaceC11291f {
    public static final /* synthetic */ NetworkParameters MAX_MONEY;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        NetworkParameters $r0 = new NetworkParameters();
        MAX_MONEY = $r0;
    }

    private /* synthetic */ NetworkParameters() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        SavingsBalance $r1 = SavingsRepository.m40517getBalance$lambda1($r3);
        return $r1;
    }
}
