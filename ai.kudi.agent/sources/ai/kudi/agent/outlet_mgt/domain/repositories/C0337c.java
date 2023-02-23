package ai.kudi.agent.outlet_mgt.domain.repositories;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.outlet_mgt.domain.repositories.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0337c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0337c f712d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0337c $r0 = new C0337c();
        f712d = $r0;
    }

    private /* synthetic */ C0337c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        Outlet $r1 = ChildOutletInformationRepository.m39869submitOutletInfo$lambda4$lambda3($r3);
        return $r1;
    }
}
