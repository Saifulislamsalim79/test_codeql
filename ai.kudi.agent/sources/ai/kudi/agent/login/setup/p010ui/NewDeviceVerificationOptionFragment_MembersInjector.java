package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.login.setup.viewModels.NewDeviceVerificationViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.setup.ui.NewDeviceVerificationOptionFragment_MembersInjector */
/* loaded from: classes.dex */
public final class NewDeviceVerificationOptionFragment_MembersInjector implements InterfaceC9463a<NewDeviceVerificationOptionFragment> {
    private final InterfaceC11700a<NewDeviceVerificationViewModel> newDeviceVerificationViewModelProvider;

    public NewDeviceVerificationOptionFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.newDeviceVerificationViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        NewDeviceVerificationOptionFragment_MembersInjector $r1 = new NewDeviceVerificationOptionFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectNewDeviceVerificationViewModel(NewDeviceVerificationOptionFragment newDeviceVerificationOptionFragment, NewDeviceVerificationViewModel newDeviceVerificationViewModel) {
        newDeviceVerificationOptionFragment.newDeviceVerificationViewModel = newDeviceVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(NewDeviceVerificationOptionFragment newDeviceVerificationOptionFragment) {
        InterfaceC11700a $r3 = this.newDeviceVerificationViewModelProvider;
        Object $r2 = $r3.get();
        NewDeviceVerificationViewModel $r4 = (NewDeviceVerificationViewModel) $r2;
        injectNewDeviceVerificationViewModel(newDeviceVerificationOptionFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        NewDeviceVerificationOptionFragment $r2 = (NewDeviceVerificationOptionFragment) obj;
        injectMembers($r2);
    }
}
