package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.OutletWalletBalanceResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Frame implements InterfaceC11291f {

    /* renamed from: h */
    public static final /* synthetic */ Frame f725h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Frame $r0 = new Frame();
        f725h = $r0;
    }

    private /* synthetic */ Frame() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        OutletWalletBalanceResponse $r1 = FetchOutletWalletBalance.m39908execute$lambda0($r3);
        return $r1;
    }
}
