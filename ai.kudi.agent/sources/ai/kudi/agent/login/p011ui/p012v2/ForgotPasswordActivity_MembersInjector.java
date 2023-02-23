package ai.kudi.agent.login.p011ui.p012v2;

import ai.kudi.agent.login.p011ui.p012v2.viewModels.ForgotPasswordViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.ui.v2.ForgotPasswordActivity_MembersInjector */
/* loaded from: classes.dex */
public final class ForgotPasswordActivity_MembersInjector implements InterfaceC9463a<ForgotPasswordActivity> {
    private final InterfaceC11700a<ForgotPasswordViewModel> forgotPasswordViewModelProvider;

    public ForgotPasswordActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.forgotPasswordViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ForgotPasswordActivity_MembersInjector $r1 = new ForgotPasswordActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectForgotPasswordViewModel(ForgotPasswordActivity forgotPasswordActivity, ForgotPasswordViewModel forgotPasswordViewModel) {
        forgotPasswordActivity.forgotPasswordViewModel = forgotPasswordViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ForgotPasswordActivity forgotPasswordActivity) {
        InterfaceC11700a $r3 = this.forgotPasswordViewModelProvider;
        Object $r2 = $r3.get();
        ForgotPasswordViewModel $r4 = (ForgotPasswordViewModel) $r2;
        injectForgotPasswordViewModel(forgotPasswordActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ForgotPasswordActivity $r2 = (ForgotPasswordActivity) obj;
        injectMembers($r2);
    }
}
