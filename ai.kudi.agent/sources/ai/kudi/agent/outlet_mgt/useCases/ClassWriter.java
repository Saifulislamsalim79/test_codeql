package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.outlet_mgt.data.OutletTransactionBreakdown;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ClassWriter implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ ClassWriter f724b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f724b = $r0;
    }

    private /* synthetic */ ClassWriter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        OutletTransactionBreakdown $r1 = FetchOutletTransactionBreakDown.m39905execute$lambda0($r3);
        return $r1;
    }
}
