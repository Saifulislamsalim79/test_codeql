package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.viewmodel.SavingDetailViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.SavingsDetailFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SavingsDetailFragment_MembersInjector implements InterfaceC9463a<SavingsDetailFragment> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<SavingDetailViewModel> viewModelProvider;

    public SavingsDetailFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.viewModelProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.sharedPreferencesProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SavingsDetailFragment_MembersInjector $r3 = new SavingsDetailFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectAnalytics(SavingsDetailFragment savingsDetailFragment, Analytics analytics) {
        savingsDetailFragment.analytics = analytics;
    }

    public static void injectSharedPreferences(SavingsDetailFragment savingsDetailFragment, SharedPreferences sharedPreferences) {
        savingsDetailFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectViewModel(SavingsDetailFragment savingsDetailFragment, SavingDetailViewModel savingDetailViewModel) {
        savingsDetailFragment.viewModel = savingDetailViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SavingsDetailFragment savingsDetailFragment) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        SavingDetailViewModel $r4 = (SavingDetailViewModel) $r3;
        injectViewModel(savingsDetailFragment, $r4);
        InterfaceC11700a $r22 = this.analyticsProvider;
        Object $r32 = $r22.get();
        Analytics $r5 = (Analytics) $r32;
        injectAnalytics(savingsDetailFragment, $r5);
        InterfaceC11700a $r23 = this.sharedPreferencesProvider;
        Object $r33 = $r23.get();
        SharedPreferences $r6 = (SharedPreferences) $r33;
        injectSharedPreferences(savingsDetailFragment, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SavingsDetailFragment $r2 = (SavingsDetailFragment) obj;
        injectMembers($r2);
    }
}
