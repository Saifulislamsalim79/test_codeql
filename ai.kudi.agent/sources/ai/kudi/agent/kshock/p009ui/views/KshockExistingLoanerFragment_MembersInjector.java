package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.presentation.KshockExistingLoanerViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockExistingLoanerFragment_MembersInjector */
/* loaded from: classes.dex */
public final class KshockExistingLoanerFragment_MembersInjector implements InterfaceC9463a<KshockExistingLoanerFragment> {
    private final InterfaceC11700a<KshockExistingLoanerViewModel> kshockExistingLoanerViewModelProvider;

    public KshockExistingLoanerFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.kshockExistingLoanerViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        KshockExistingLoanerFragment_MembersInjector $r1 = new KshockExistingLoanerFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectKshockExistingLoanerViewModel(KshockExistingLoanerFragment kshockExistingLoanerFragment, KshockExistingLoanerViewModel kshockExistingLoanerViewModel) {
        kshockExistingLoanerFragment.kshockExistingLoanerViewModel = kshockExistingLoanerViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KshockExistingLoanerFragment kshockExistingLoanerFragment) {
        InterfaceC11700a $r3 = this.kshockExistingLoanerViewModelProvider;
        Object $r2 = $r3.get();
        KshockExistingLoanerViewModel $r4 = (KshockExistingLoanerViewModel) $r2;
        injectKshockExistingLoanerViewModel(kshockExistingLoanerFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KshockExistingLoanerFragment $r2 = (KshockExistingLoanerFragment) obj;
        injectMembers($r2);
    }
}
