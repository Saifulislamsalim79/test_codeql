package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.settings.security.p028ui.viewModels.ConfirmOtpViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.ConfirmOtpFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ConfirmOtpFragment_MembersInjector implements InterfaceC9463a<ConfirmOtpFragment> {
    private final InterfaceC11700a<ConfirmOtpViewModel> viewModelProvider;

    public ConfirmOtpFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ConfirmOtpFragment_MembersInjector $r1 = new ConfirmOtpFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(ConfirmOtpFragment confirmOtpFragment, ConfirmOtpViewModel confirmOtpViewModel) {
        confirmOtpFragment.viewModel = confirmOtpViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ConfirmOtpFragment confirmOtpFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        ConfirmOtpViewModel $r4 = (ConfirmOtpViewModel) $r2;
        injectViewModel(confirmOtpFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ConfirmOtpFragment $r2 = (ConfirmOtpFragment) obj;
        injectMembers($r2);
    }
}
