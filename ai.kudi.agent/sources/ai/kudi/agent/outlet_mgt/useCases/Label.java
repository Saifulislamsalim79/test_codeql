package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.OutletMgtAcceptDeclineResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Label implements InterfaceC11291f {

    /* renamed from: k */
    public static final /* synthetic */ Label f727k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Label $r0 = new Label();
        f727k = $r0;
    }

    private /* synthetic */ Label() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        OutletMgtAcceptDeclineResponse $r1 = AcceptOrDeclineLinkingRequest.m39894execute$lambda0($r3);
        return $r1;
    }
}
