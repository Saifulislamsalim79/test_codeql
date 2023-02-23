package ai.kudi.agent.login.p011ui.p012v2;

import ai.kudi.agent.login.p011ui.p012v2.viewModels.ResetPinViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.ui.v2.ResetPinFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ResetPinFragment_MembersInjector implements InterfaceC9463a<ResetPinFragment> {
    private final InterfaceC11700a<ResetPinViewModel> vmProvider;

    public ResetPinFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.vmProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ResetPinFragment_MembersInjector $r1 = new ResetPinFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectVm(ResetPinFragment resetPinFragment, ResetPinViewModel resetPinViewModel) {
        resetPinFragment.srv = resetPinViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ResetPinFragment resetPinFragment) {
        InterfaceC11700a $r3 = this.vmProvider;
        Object $r2 = $r3.get();
        ResetPinViewModel $r4 = (ResetPinViewModel) $r2;
        injectVm(resetPinFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ResetPinFragment $r2 = (ResetPinFragment) obj;
        injectMembers($r2);
    }
}
