package ai.kudi.agent.kshock.p009ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.kshock.presentation.KShockViewModel;
import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.KShockActivity_MembersInjector */
/* loaded from: classes.dex */
public final class KShockActivity_MembersInjector implements InterfaceC9463a<KShockActivity> {
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<KShockViewModel> viewModelProvider;

    public KShockActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.viewModelProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
        this.androidInjectorProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        KShockActivity_MembersInjector $r3 = new KShockActivity_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectAndroidInjector(KShockActivity kShockActivity, DispatchingAndroidInjector dispatchingAndroidInjector) {
        kShockActivity.androidInjector = dispatchingAndroidInjector;
    }

    public static void injectSmartLookAnalytics(KShockActivity kShockActivity, SmartLookAnalytics smartLookAnalytics) {
        kShockActivity.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectViewModel(KShockActivity kShockActivity, KShockViewModel kShockViewModel) {
        kShockActivity.viewModel = kShockViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KShockActivity kShockActivity) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        KShockViewModel $r4 = (KShockViewModel) $r3;
        injectViewModel(kShockActivity, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(kShockActivity, $r5);
        InterfaceC11700a $r23 = this.androidInjectorProvider;
        Object $r33 = $r23.get();
        DispatchingAndroidInjector $r6 = (DispatchingAndroidInjector) $r33;
        injectAndroidInjector(kShockActivity, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KShockActivity $r2 = (KShockActivity) obj;
        injectMembers($r2);
    }
}
