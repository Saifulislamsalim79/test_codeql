package ai.kudi.agent.home;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.util.Pref;
import android.content.SharedPreferences;
import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class HomeActivity_MembersInjector implements InterfaceC9463a<HomeActivity> {
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPrefProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<HomePresenter> thisPresenterProvider;

    public HomeActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.sharedPrefProvider = interfaceC11700a;
        this.thisPresenterProvider = interfaceC11700a2;
        this.prefProvider = interfaceC11700a3;
        this.androidInjectorProvider = interfaceC11700a4;
        this.sharedPreferencesProvider = interfaceC11700a5;
        this.smartLookAnalyticsProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        HomeActivity_MembersInjector $r6 = new HomeActivity_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    public static void injectAndroidInjector(HomeActivity homeActivity, DispatchingAndroidInjector dispatchingAndroidInjector) {
        homeActivity.androidInjector = dispatchingAndroidInjector;
    }

    public static void injectPref(HomeActivity homeActivity, Pref pref) {
        homeActivity.pref = pref;
    }

    public static void injectSharedPref(HomeActivity homeActivity, SharedPreferences sharedPreferences) {
        homeActivity.sharedPref = sharedPreferences;
    }

    public static void injectSharedPreferences(HomeActivity homeActivity, SharedPreferences sharedPreferences) {
        homeActivity.sharedPreferences = sharedPreferences;
    }

    public static void injectSmartLookAnalytics(HomeActivity homeActivity, SmartLookAnalytics smartLookAnalytics) {
        homeActivity.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectThisPresenter(HomeActivity homeActivity, HomePresenter homePresenter) {
        homeActivity.thisPresenter = homePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(HomeActivity homeActivity) {
        InterfaceC11700a $r2 = this.sharedPrefProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        injectSharedPref(homeActivity, $r4);
        InterfaceC11700a $r22 = this.thisPresenterProvider;
        Object $r32 = $r22.get();
        HomePresenter $r5 = (HomePresenter) $r32;
        injectThisPresenter(homeActivity, $r5);
        InterfaceC11700a $r23 = this.prefProvider;
        Object $r33 = $r23.get();
        Pref $r6 = (Pref) $r33;
        injectPref(homeActivity, $r6);
        InterfaceC11700a $r24 = this.androidInjectorProvider;
        Object $r34 = $r24.get();
        DispatchingAndroidInjector $r7 = (DispatchingAndroidInjector) $r34;
        injectAndroidInjector(homeActivity, $r7);
        InterfaceC11700a $r25 = this.sharedPreferencesProvider;
        Object $r35 = $r25.get();
        SharedPreferences $r42 = (SharedPreferences) $r35;
        injectSharedPreferences(homeActivity, $r42);
        InterfaceC11700a $r26 = this.smartLookAnalyticsProvider;
        Object $r36 = $r26.get();
        SmartLookAnalytics $r8 = (SmartLookAnalytics) $r36;
        injectSmartLookAnalytics(homeActivity, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        HomeActivity $r2 = (HomeActivity) obj;
        injectMembers($r2);
    }
}
