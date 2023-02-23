package ai.kudi.agent.start;

import ai.kudi.agent.core.analytics.Analytics;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SplashActivity_MembersInjector implements InterfaceC9463a<SplashActivity> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPrefsProvider;

    public SplashActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.sharedPrefsProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        SplashActivity_MembersInjector $r2 = new SplashActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAnalytics(SplashActivity splashActivity, Analytics analytics) {
        splashActivity.analytics = analytics;
    }

    public static void injectSharedPrefs(SplashActivity splashActivity, SharedPreferences sharedPreferences) {
        splashActivity.sharedPrefs = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SplashActivity splashActivity) {
        InterfaceC11700a $r2 = this.sharedPrefsProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        injectSharedPrefs(splashActivity, $r4);
        InterfaceC11700a $r22 = this.analyticsProvider;
        Object $r32 = $r22.get();
        Analytics $r5 = (Analytics) $r32;
        injectAnalytics(splashActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SplashActivity $r2 = (SplashActivity) obj;
        injectMembers($r2);
    }
}
