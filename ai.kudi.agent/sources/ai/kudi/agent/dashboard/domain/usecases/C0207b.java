package ai.kudi.agent.dashboard.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.dashboard.domain.usecases.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0207b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0207b f232e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0207b $r0 = new C0207b();
        f232e = $r0;
    }

    private /* synthetic */ C0207b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = TransactionBreakDownSummary.m39195execute$lambda0($r3);
        return $r1;
    }
}
