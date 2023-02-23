package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.bills.presenters.HomePresenter;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.bills.ui.HomeFragment_MembersInjector */
/* loaded from: classes.dex */
public final class HomeFragment_MembersInjector implements InterfaceC9463a<HomeFragment> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<RemoteBillerRepositoryImpl> remotedbProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<HomePresenter> thisPresenterProvider;

    public HomeFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.thisPresenterProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
        this.remotedbProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.smartLookAnalyticsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        HomeFragment_MembersInjector $r5 = new HomeFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    public static void injectAnalytics(HomeFragment homeFragment, Analytics analytics) {
        homeFragment.analytics = analytics;
    }

    public static void injectRemotedb(HomeFragment homeFragment, RemoteBillerRepositoryImpl remoteBillerRepositoryImpl) {
        homeFragment.remotedb = remoteBillerRepositoryImpl;
    }

    public static void injectSharedPreferences(HomeFragment homeFragment, SharedPreferences sharedPreferences) {
        homeFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectSmartLookAnalytics(HomeFragment homeFragment, SmartLookAnalytics smartLookAnalytics) {
        homeFragment.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectThisPresenter(HomeFragment homeFragment, HomePresenter homePresenter) {
        homeFragment.thisPresenter = homePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(HomeFragment homeFragment) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        HomePresenter $r4 = (HomePresenter) $r3;
        injectThisPresenter(homeFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(homeFragment, $r5);
        InterfaceC11700a $r23 = this.remotedbProvider;
        Object $r33 = $r23.get();
        RemoteBillerRepositoryImpl $r6 = (RemoteBillerRepositoryImpl) $r33;
        injectRemotedb(homeFragment, $r6);
        InterfaceC11700a $r24 = this.analyticsProvider;
        Object $r34 = $r24.get();
        Analytics $r7 = (Analytics) $r34;
        injectAnalytics(homeFragment, $r7);
        InterfaceC11700a $r25 = this.smartLookAnalyticsProvider;
        Object $r35 = $r25.get();
        SmartLookAnalytics $r8 = (SmartLookAnalytics) $r35;
        injectSmartLookAnalytics(homeFragment, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        HomeFragment $r2 = (HomeFragment) obj;
        injectMembers($r2);
    }
}
