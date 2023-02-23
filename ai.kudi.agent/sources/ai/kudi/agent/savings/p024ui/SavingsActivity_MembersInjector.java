package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.viewmodel.SavingsViewModel;
import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.SavingsActivity_MembersInjector */
/* loaded from: classes.dex */
public final class SavingsActivity_MembersInjector implements InterfaceC9463a<SavingsActivity> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final InterfaceC11700a<SavingsViewModel> viewModelProvider;

    public SavingsActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.viewModelProvider = interfaceC11700a;
        this.androidInjectorProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SavingsActivity_MembersInjector $r3 = new SavingsActivity_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectAnalytics(SavingsActivity savingsActivity, Analytics analytics) {
        savingsActivity.analytics = analytics;
    }

    public static void injectAndroidInjector(SavingsActivity savingsActivity, DispatchingAndroidInjector dispatchingAndroidInjector) {
        savingsActivity.androidInjector = dispatchingAndroidInjector;
    }

    public static void injectViewModel(SavingsActivity savingsActivity, SavingsViewModel savingsViewModel) {
        savingsActivity.viewModel = savingsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SavingsActivity savingsActivity) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        SavingsViewModel $r4 = (SavingsViewModel) $r3;
        injectViewModel(savingsActivity, $r4);
        InterfaceC11700a $r22 = this.androidInjectorProvider;
        Object $r32 = $r22.get();
        DispatchingAndroidInjector $r5 = (DispatchingAndroidInjector) $r32;
        injectAndroidInjector(savingsActivity, $r5);
        InterfaceC11700a $r23 = this.analyticsProvider;
        Object $r33 = $r23.get();
        Analytics $r6 = (Analytics) $r33;
        injectAnalytics(savingsActivity, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SavingsActivity $r2 = (SavingsActivity) obj;
        injectMembers($r2);
    }
}
