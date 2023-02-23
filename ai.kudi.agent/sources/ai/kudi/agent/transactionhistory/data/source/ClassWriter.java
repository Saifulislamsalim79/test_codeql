package ai.kudi.agent.transactionhistory.data.source;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.dashboard.domain.fht.DashboardSummaryDto;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ClassWriter implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ ClassWriter f1565b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f1565b = $r0;
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
        DashboardSummaryDto $r1 = TransactionsRemoteDataSource.m41000dashboardSummary$lambda17($r3);
        return $r1;
    }
}
