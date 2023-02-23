package ai.kudi.agent.dashboard.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.dashboard.domain.usecases.DashboardSummary;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class DashboardPresenter_Factory implements InterfaceC9468d<DashboardPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<DashboardSummary> dashboardSummaryProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public DashboardPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.dashboardSummaryProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DashboardPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        DashboardPresenter_Factory $r3 = new DashboardPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DashboardPresenter newInstance(FetchCurrentUser fetchCurrentUser, DashboardSummary dashboardSummary, Analytics analytics) {
        DashboardPresenter $r3 = new DashboardPresenter(fetchCurrentUser, dashboardSummary, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DashboardPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.dashboardSummaryProvider;
        Object $r22 = $r12.get();
        DashboardSummary $r4 = (DashboardSummary) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        DashboardPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39220multiply() {
        DashboardPresenter $r1 = multiply();
        return $r1;
    }
}
