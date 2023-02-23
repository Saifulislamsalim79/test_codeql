package ai.kudi.agent;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BaseApplication_MembersInjector implements InterfaceC9463a<BaseApplication> {
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;

    public BaseApplication_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.dispatchingAndroidInjectorProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BaseApplication_MembersInjector $r2 = new BaseApplication_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectDispatchingAndroidInjector(BaseApplication baseApplication, DispatchingAndroidInjector dispatchingAndroidInjector) {
        baseApplication.dispatchingAndroidInjector = dispatchingAndroidInjector;
    }

    public static void injectSmartLookAnalytics(BaseApplication baseApplication, SmartLookAnalytics smartLookAnalytics) {
        baseApplication.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BaseApplication baseApplication) {
        InterfaceC11700a $r2 = this.dispatchingAndroidInjectorProvider;
        Object $r3 = $r2.get();
        DispatchingAndroidInjector $r4 = (DispatchingAndroidInjector) $r3;
        injectDispatchingAndroidInjector(baseApplication, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(baseApplication, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BaseApplication $r2 = (BaseApplication) obj;
        injectMembers($r2);
    }
}
