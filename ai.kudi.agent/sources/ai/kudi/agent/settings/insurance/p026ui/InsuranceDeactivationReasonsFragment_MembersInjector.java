package ai.kudi.agent.settings.insurance.p026ui;

import ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.insurance.ui.InsuranceDeactivationReasonsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class InsuranceDeactivationReasonsFragment_MembersInjector implements InterfaceC9463a<InsuranceDeactivationReasonsFragment> {
    private final InterfaceC11700a<InsuranceDeactivationReasonViewModel> viewModelProvider;

    public InsuranceDeactivationReasonsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        InsuranceDeactivationReasonsFragment_MembersInjector $r1 = new InsuranceDeactivationReasonsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment, InsuranceDeactivationReasonViewModel insuranceDeactivationReasonViewModel) {
        insuranceDeactivationReasonsFragment.viewModel = insuranceDeactivationReasonViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        InsuranceDeactivationReasonViewModel $r4 = (InsuranceDeactivationReasonViewModel) $r2;
        injectViewModel(insuranceDeactivationReasonsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        InsuranceDeactivationReasonsFragment $r2 = (InsuranceDeactivationReasonsFragment) obj;
        injectMembers($r2);
    }
}
