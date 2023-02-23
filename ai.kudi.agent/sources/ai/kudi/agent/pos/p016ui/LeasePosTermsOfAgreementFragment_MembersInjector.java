package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.viewModels.LeasePosAgreementVm;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.LeasePosTermsOfAgreementFragment_MembersInjector */
/* loaded from: classes.dex */
public final class LeasePosTermsOfAgreementFragment_MembersInjector implements InterfaceC9463a<LeasePosTermsOfAgreementFragment> {
    private final InterfaceC11700a<LeasePosAgreementVm> leasePosAgreementVmProvider;

    public LeasePosTermsOfAgreementFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.leasePosAgreementVmProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        LeasePosTermsOfAgreementFragment_MembersInjector $r1 = new LeasePosTermsOfAgreementFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectLeasePosAgreementVm(LeasePosTermsOfAgreementFragment leasePosTermsOfAgreementFragment, LeasePosAgreementVm leasePosAgreementVm) {
        leasePosTermsOfAgreementFragment.leasePosAgreementVm = leasePosAgreementVm;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(LeasePosTermsOfAgreementFragment leasePosTermsOfAgreementFragment) {
        InterfaceC11700a $r3 = this.leasePosAgreementVmProvider;
        Object $r2 = $r3.get();
        LeasePosAgreementVm $r4 = (LeasePosAgreementVm) $r2;
        injectLeasePosAgreementVm(leasePosTermsOfAgreementFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        LeasePosTermsOfAgreementFragment $r2 = (LeasePosTermsOfAgreementFragment) obj;
        injectMembers($r2);
    }
}
