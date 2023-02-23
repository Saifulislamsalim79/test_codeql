package ai.kudi.agent.start.intro;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.analytics.Analytics;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OnBoardingActivity_MembersInjector implements InterfaceC9463a<OnBoardingActivity> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;

    public OnBoardingActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.analyticsProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OnBoardingActivity_MembersInjector $r2 = new OnBoardingActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAnalytics(OnBoardingActivity onBoardingActivity, Analytics analytics) {
        onBoardingActivity.analytics = analytics;
    }

    public static void injectSmartLookAnalytics(OnBoardingActivity onBoardingActivity, SmartLookAnalytics smartLookAnalytics) {
        onBoardingActivity.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OnBoardingActivity onBoardingActivity) {
        InterfaceC11700a $r2 = this.analyticsProvider;
        Object $r3 = $r2.get();
        Analytics $r4 = (Analytics) $r3;
        injectAnalytics(onBoardingActivity, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(onBoardingActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OnBoardingActivity $r2 = (OnBoardingActivity) obj;
        injectMembers($r2);
    }
}
