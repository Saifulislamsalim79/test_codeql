package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.savings.data.model.SavingsBalance;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Coin implements InterfaceC11291f {
    public static final /* synthetic */ Coin ZERO;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Coin $r0 = new Coin();
        ZERO = $r0;
    }

    private /* synthetic */ Coin() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        SavingsBalance $r1 = SavingsPlan.m40584getBalance$lambda5($r3);
        return $r1;
    }
}
