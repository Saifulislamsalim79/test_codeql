package ai.kudi.agent.transactionhistory.data.source;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.dashboard.domain.fht.DashboardSummaryDto;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.transactionhistory.data.source.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0583c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0583c f1576d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0583c $r0 = new C0583c();
        f1576d = $r0;
    }

    private /* synthetic */ C0583c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        DashboardSummaryDto $r1 = TransactionsRemoteDataSource.m41002outletDashboardSummary$lambda15($r3);
        return $r1;
    }
}
