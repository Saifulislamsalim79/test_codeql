package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceFragment_MembersInjector */
/* loaded from: classes.dex */
public final class UssdWithdrawalCodeReferenceFragment_MembersInjector implements InterfaceC9463a<UssdWithdrawalCodeReferenceFragment> {
    private final InterfaceC11700a<UssdWithdrawalCodeReferenceViewModel> screenViewModelProvider;

    public UssdWithdrawalCodeReferenceFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UssdWithdrawalCodeReferenceFragment_MembersInjector $r1 = new UssdWithdrawalCodeReferenceFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenViewModel(UssdWithdrawalCodeReferenceFragment ussdWithdrawalCodeReferenceFragment, UssdWithdrawalCodeReferenceViewModel ussdWithdrawalCodeReferenceViewModel) {
        ussdWithdrawalCodeReferenceFragment.screenViewModel = ussdWithdrawalCodeReferenceViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UssdWithdrawalCodeReferenceFragment ussdWithdrawalCodeReferenceFragment) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        UssdWithdrawalCodeReferenceViewModel $r4 = (UssdWithdrawalCodeReferenceViewModel) $r2;
        injectScreenViewModel(ussdWithdrawalCodeReferenceFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UssdWithdrawalCodeReferenceFragment $r2 = (UssdWithdrawalCodeReferenceFragment) obj;
        injectMembers($r2);
    }
}
