package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.settings.security.p028ui.viewModels.ResetSavingPinViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.ResetSavingPinFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ResetSavingPinFragment_MembersInjector implements InterfaceC9463a<ResetSavingPinFragment> {
    private final InterfaceC11700a<ResetSavingPinViewModel> resetSavingPinViewModelProvider;

    public ResetSavingPinFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.resetSavingPinViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ResetSavingPinFragment_MembersInjector $r1 = new ResetSavingPinFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectResetSavingPinViewModel(ResetSavingPinFragment resetSavingPinFragment, ResetSavingPinViewModel resetSavingPinViewModel) {
        resetSavingPinFragment.resetSavingPinViewModel = resetSavingPinViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ResetSavingPinFragment resetSavingPinFragment) {
        InterfaceC11700a $r3 = this.resetSavingPinViewModelProvider;
        Object $r2 = $r3.get();
        ResetSavingPinViewModel $r4 = (ResetSavingPinViewModel) $r2;
        injectResetSavingPinViewModel(resetSavingPinFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ResetSavingPinFragment $r2 = (ResetSavingPinFragment) obj;
        injectMembers($r2);
    }
}
