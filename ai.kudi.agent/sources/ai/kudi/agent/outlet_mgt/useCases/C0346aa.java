package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.outlet_mgt.useCases.aa */
/* loaded from: classes.dex */
public final /* synthetic */ class C0346aa implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ C0346aa f728b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0346aa $r0 = new C0346aa();
        f728b = $r0;
    }

    private /* synthetic */ C0346aa() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        Outlet $r1 = SuspendOutlet.m39915execute$lambda0($r3);
        return $r1;
    }
}
