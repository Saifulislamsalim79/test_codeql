package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.OutletLinkingResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.outlet_mgt.useCases.DD */
/* loaded from: classes.dex */
public final /* synthetic */ class C0345DD implements InterfaceC11291f {
    public static final /* synthetic */ C0345DD ONE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0345DD $r0 = new C0345DD();
        ONE = $r0;
    }

    private /* synthetic */ C0345DD() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        OutletLinkingResponse $r1 = SubmitLinkingRequest.m39913execute$lambda0($r3);
        return $r1;
    }
}
