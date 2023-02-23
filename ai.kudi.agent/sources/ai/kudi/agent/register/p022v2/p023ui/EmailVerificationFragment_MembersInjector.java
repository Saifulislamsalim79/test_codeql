package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.register.p022v2.p023ui.viewModels.EmailVerificationViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.EmailVerificationFragment_MembersInjector */
/* loaded from: classes.dex */
public final class EmailVerificationFragment_MembersInjector implements InterfaceC9463a<EmailVerificationFragment> {
    private final InterfaceC11700a<EmailVerificationViewModel> emailVerificationViewModelProvider;

    public EmailVerificationFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.emailVerificationViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        EmailVerificationFragment_MembersInjector $r1 = new EmailVerificationFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectEmailVerificationViewModel(EmailVerificationFragment emailVerificationFragment, EmailVerificationViewModel emailVerificationViewModel) {
        emailVerificationFragment.emailVerificationViewModel = emailVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(EmailVerificationFragment emailVerificationFragment) {
        InterfaceC11700a $r3 = this.emailVerificationViewModelProvider;
        Object $r2 = $r3.get();
        EmailVerificationViewModel $r4 = (EmailVerificationViewModel) $r2;
        injectEmailVerificationViewModel(emailVerificationFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        EmailVerificationFragment $r2 = (EmailVerificationFragment) obj;
        injectMembers($r2);
    }
}
