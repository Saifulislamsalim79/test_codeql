package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.presentation.KShockEligibilityCriteriaViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.KShockEligibilityCriteriaFragment_MembersInjector */
/* loaded from: classes.dex */
public final class KShockEligibilityCriteriaFragment_MembersInjector implements InterfaceC9463a<KShockEligibilityCriteriaFragment> {
    private final InterfaceC11700a<KShockNavigator> navigatorProvider;
    private final InterfaceC11700a<KShockEligibilityCriteriaViewModel> viewModelProvider;

    public KShockEligibilityCriteriaFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.viewModelProvider = interfaceC11700a;
        this.navigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        KShockEligibilityCriteriaFragment_MembersInjector $r2 = new KShockEligibilityCriteriaFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectNavigator(KShockEligibilityCriteriaFragment kShockEligibilityCriteriaFragment, KShockNavigator kShockNavigator) {
        kShockEligibilityCriteriaFragment.navigator = kShockNavigator;
    }

    public static void injectViewModel(KShockEligibilityCriteriaFragment kShockEligibilityCriteriaFragment, KShockEligibilityCriteriaViewModel kShockEligibilityCriteriaViewModel) {
        kShockEligibilityCriteriaFragment.viewModel = kShockEligibilityCriteriaViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KShockEligibilityCriteriaFragment kShockEligibilityCriteriaFragment) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        KShockEligibilityCriteriaViewModel $r4 = (KShockEligibilityCriteriaViewModel) $r3;
        injectViewModel(kShockEligibilityCriteriaFragment, $r4);
        InterfaceC11700a $r22 = this.navigatorProvider;
        Object $r32 = $r22.get();
        KShockNavigator $r5 = (KShockNavigator) $r32;
        injectNavigator(kShockEligibilityCriteriaFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KShockEligibilityCriteriaFragment $r2 = (KShockEligibilityCriteriaFragment) obj;
        injectMembers($r2);
    }
}
