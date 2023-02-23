package ai.kudi.agent.dashboard.mods;

import ai.kudi.agent.dashboard.presenter.DashboardPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class DashboardFragment_MembersInjector implements InterfaceC9463a<ai.kudi.agent.dashboard.ui.DashboardFragment> {
    private final InterfaceC11700a<DashboardPresenter> thisPresenterProvider;

    public DashboardFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        DashboardFragment_MembersInjector $r1 = new DashboardFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(DashboardFragment dashboardFragment, DashboardPresenter dashboardPresenter) {
        dashboardFragment.thisPresenter = dashboardPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(DashboardFragment dashboardFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        DashboardPresenter $r4 = (DashboardPresenter) $r2;
        injectThisPresenter(dashboardFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        DashboardFragment $r2 = (DashboardFragment) obj;
        injectMembers($r2);
    }
}
