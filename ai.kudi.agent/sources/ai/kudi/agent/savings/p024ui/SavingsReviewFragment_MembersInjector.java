package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.viewmodel.SavingsReviewViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.SavingsReviewFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SavingsReviewFragment_MembersInjector implements InterfaceC9463a<SavingsReviewFragment> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<SavingsReviewViewModel> viewModelProvider;

    public SavingsReviewFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.viewModelProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        SavingsReviewFragment_MembersInjector $r2 = new SavingsReviewFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAnalytics(SavingsReviewFragment savingsReviewFragment, Analytics analytics) {
        savingsReviewFragment.analytics = analytics;
    }

    public static void injectViewModel(SavingsReviewFragment savingsReviewFragment, SavingsReviewViewModel savingsReviewViewModel) {
        savingsReviewFragment.viewModel = savingsReviewViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SavingsReviewFragment savingsReviewFragment) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        SavingsReviewViewModel $r4 = (SavingsReviewViewModel) $r3;
        injectViewModel(savingsReviewFragment, $r4);
        InterfaceC11700a $r22 = this.analyticsProvider;
        Object $r32 = $r22.get();
        Analytics $r5 = (Analytics) $r32;
        injectAnalytics(savingsReviewFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SavingsReviewFragment $r2 = (SavingsReviewFragment) obj;
        injectMembers($r2);
    }
}
