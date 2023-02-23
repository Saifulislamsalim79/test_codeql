package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import ai.kudi.agent.settings.security.p028ui.viewModels.ChangePinViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.ResetPinFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ResetPinFragment_MembersInjector implements InterfaceC9463a<ResetPinFragment> {
    private final InterfaceC11700a<IPFSecurityUtils> facProvider;
    private final InterfaceC11700a<ChangePinViewModel> vmProvider;

    public ResetPinFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.vmProvider = interfaceC11700a;
        this.facProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ResetPinFragment_MembersInjector $r2 = new ResetPinFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectFac(ResetPinFragment resetPinFragment, IPFSecurityUtils iPFSecurityUtils) {
        resetPinFragment.srv = iPFSecurityUtils;
    }

    public static void injectVm(ResetPinFragment resetPinFragment, ChangePinViewModel changePinViewModel) {
        resetPinFragment.errorReason = changePinViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ResetPinFragment resetPinFragment) {
        InterfaceC11700a $r2 = this.vmProvider;
        Object $r3 = $r2.get();
        ChangePinViewModel $r4 = (ChangePinViewModel) $r3;
        injectVm(resetPinFragment, $r4);
        InterfaceC11700a $r22 = this.facProvider;
        Object $r32 = $r22.get();
        IPFSecurityUtils $r5 = (IPFSecurityUtils) $r32;
        injectFac(resetPinFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ResetPinFragment $r2 = (ResetPinFragment) obj;
        injectMembers($r2);
    }
}
