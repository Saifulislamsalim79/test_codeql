package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.register.verifybvn.VerifyBvnPictureViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.ui.AccountTypeFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AccountTypeFragment_MembersInjector implements InterfaceC9463a<AccountTypeFragment> {
    private final InterfaceC11700a<VerifyBvnPictureViewModel> vmProvider;

    public AccountTypeFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.vmProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AccountTypeFragment_MembersInjector $r1 = new AccountTypeFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectVm(AccountTypeFragment accountTypeFragment, VerifyBvnPictureViewModel verifyBvnPictureViewModel) {
        accountTypeFragment.srv = verifyBvnPictureViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AccountTypeFragment accountTypeFragment) {
        InterfaceC11700a $r3 = this.vmProvider;
        Object $r2 = $r3.get();
        VerifyBvnPictureViewModel $r4 = (VerifyBvnPictureViewModel) $r2;
        injectVm(accountTypeFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AccountTypeFragment $r2 = (AccountTypeFragment) obj;
        injectMembers($r2);
    }
}
