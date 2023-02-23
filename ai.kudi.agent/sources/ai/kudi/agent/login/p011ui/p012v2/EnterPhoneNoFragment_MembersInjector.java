package ai.kudi.agent.login.p011ui.p012v2;

import ai.kudi.agent.login.p011ui.p012v2.viewModels.EnterPhoneNoViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.ui.v2.EnterPhoneNoFragment_MembersInjector */
/* loaded from: classes.dex */
public final class EnterPhoneNoFragment_MembersInjector implements InterfaceC9463a<EnterPhoneNoFragment> {
    private final InterfaceC11700a<EnterPhoneNoViewModel> vmProvider;

    public EnterPhoneNoFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.vmProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        EnterPhoneNoFragment_MembersInjector $r1 = new EnterPhoneNoFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectVm(EnterPhoneNoFragment enterPhoneNoFragment, EnterPhoneNoViewModel enterPhoneNoViewModel) {
        enterPhoneNoFragment.srv = enterPhoneNoViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(EnterPhoneNoFragment enterPhoneNoFragment) {
        InterfaceC11700a $r3 = this.vmProvider;
        Object $r2 = $r3.get();
        EnterPhoneNoViewModel $r4 = (EnterPhoneNoViewModel) $r2;
        injectVm(enterPhoneNoFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        EnterPhoneNoFragment $r2 = (EnterPhoneNoFragment) obj;
        injectMembers($r2);
    }
}
