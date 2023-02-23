package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.savings.viewmodel.CreateSavingsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.CreateSavingsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CreateSavingsFragment_MembersInjector implements InterfaceC9463a<CreateSavingsFragment> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CreateSavingsViewModel> viewModelProvider;

    public CreateSavingsFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.viewModelProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        CreateSavingsFragment_MembersInjector $r2 = new CreateSavingsFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAnalytics(CreateSavingsFragment createSavingsFragment, Analytics analytics) {
        createSavingsFragment.analytics = analytics;
    }

    public static void injectViewModel(CreateSavingsFragment createSavingsFragment, CreateSavingsViewModel createSavingsViewModel) {
        createSavingsFragment.viewModel = createSavingsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CreateSavingsFragment createSavingsFragment) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        CreateSavingsViewModel $r4 = (CreateSavingsViewModel) $r3;
        injectViewModel(createSavingsFragment, $r4);
        InterfaceC11700a $r22 = this.analyticsProvider;
        Object $r32 = $r22.get();
        Analytics $r5 = (Analytics) $r32;
        injectAnalytics(createSavingsFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CreateSavingsFragment $r2 = (CreateSavingsFragment) obj;
        injectMembers($r2);
    }
}
