package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.PosEligibilityFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PosEligibilityFragment_MembersInjector implements InterfaceC9463a<PosEligibilityFragment> {
    private final InterfaceC11700a<PosEligibilityViewModel> posEligibilityViewModelProvider;
    private final InterfaceC11700a<TwoColumnTableAdapter> twoColumnAdapterProvider;

    public PosEligibilityFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.posEligibilityViewModelProvider = interfaceC11700a;
        this.twoColumnAdapterProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        PosEligibilityFragment_MembersInjector $r2 = new PosEligibilityFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectPosEligibilityViewModel(PosEligibilityFragment posEligibilityFragment, PosEligibilityViewModel posEligibilityViewModel) {
        posEligibilityFragment.posEligibilityViewModel = posEligibilityViewModel;
    }

    public static void injectTwoColumnAdapter(PosEligibilityFragment posEligibilityFragment, TwoColumnTableAdapter twoColumnTableAdapter) {
        posEligibilityFragment.twoColumnAdapter = twoColumnTableAdapter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PosEligibilityFragment posEligibilityFragment) {
        InterfaceC11700a $r2 = this.posEligibilityViewModelProvider;
        Object $r3 = $r2.get();
        PosEligibilityViewModel $r4 = (PosEligibilityViewModel) $r3;
        injectPosEligibilityViewModel(posEligibilityFragment, $r4);
        InterfaceC11700a $r22 = this.twoColumnAdapterProvider;
        Object $r32 = $r22.get();
        TwoColumnTableAdapter $r5 = (TwoColumnTableAdapter) $r32;
        injectTwoColumnAdapter(posEligibilityFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PosEligibilityFragment $r2 = (PosEligibilityFragment) obj;
        injectMembers($r2);
    }
}
