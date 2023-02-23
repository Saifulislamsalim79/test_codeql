package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.login.setup.presenters.UnknownDeviceFaceVerificationViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.setup.ui.UnknownDeviceFaceVerificationFragment_MembersInjector */
/* loaded from: classes.dex */
public final class UnknownDeviceFaceVerificationFragment_MembersInjector implements InterfaceC9463a<UnknownDeviceFaceVerificationFragment> {
    private final InterfaceC11700a<UnknownDeviceFaceVerificationViewModel> viewModelProvider;

    public UnknownDeviceFaceVerificationFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UnknownDeviceFaceVerificationFragment_MembersInjector $r1 = new UnknownDeviceFaceVerificationFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(UnknownDeviceFaceVerificationFragment unknownDeviceFaceVerificationFragment, UnknownDeviceFaceVerificationViewModel unknownDeviceFaceVerificationViewModel) {
        unknownDeviceFaceVerificationFragment.viewModel = unknownDeviceFaceVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UnknownDeviceFaceVerificationFragment unknownDeviceFaceVerificationFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        UnknownDeviceFaceVerificationViewModel $r4 = (UnknownDeviceFaceVerificationViewModel) $r2;
        injectViewModel(unknownDeviceFaceVerificationFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UnknownDeviceFaceVerificationFragment $r2 = (UnknownDeviceFaceVerificationFragment) obj;
        injectMembers($r2);
    }
}
