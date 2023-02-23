package ai.kudi.agent.settings.account.p025ui.activity;

import ai.kudi.agent.settings.account.p025ui.viewModel.BankAccountViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.activity.BankAccountActivity_MembersInjector */
/* loaded from: classes.dex */
public final class BankAccountActivity_MembersInjector implements InterfaceC9463a<BankAccountActivity> {
    private final InterfaceC11700a<BankAccountViewModel> screenViewModelProvider;

    public BankAccountActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        BankAccountActivity_MembersInjector $r1 = new BankAccountActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenViewModel(BankAccountActivity bankAccountActivity, BankAccountViewModel bankAccountViewModel) {
        bankAccountActivity.screenViewModel = bankAccountViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BankAccountActivity bankAccountActivity) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        BankAccountViewModel $r4 = (BankAccountViewModel) $r2;
        injectScreenViewModel(bankAccountActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BankAccountActivity $r2 = (BankAccountActivity) obj;
        injectMembers($r2);
    }
}
