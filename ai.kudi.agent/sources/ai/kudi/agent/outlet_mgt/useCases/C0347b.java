package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.outlet_mgt.useCases.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0347b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0347b f729e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0347b $r0 = new C0347b();
        f729e = $r0;
    }

    private /* synthetic */ C0347b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        Outlet $r1 = BuzzPendingOutlet.m39896execute$lambda0($r3);
        return $r1;
    }
}
