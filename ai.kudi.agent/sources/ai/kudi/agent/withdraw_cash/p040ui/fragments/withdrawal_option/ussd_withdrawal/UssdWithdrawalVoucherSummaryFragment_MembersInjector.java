package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherSummaryFragment_MembersInjector implements InterfaceC9463a<UssdWithdrawalVoucherSummaryFragment> {
    private final InterfaceC11700a<UssdWithdrawalVoucherSummaryViewModel> screenViewModelProvider;

    public UssdWithdrawalVoucherSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UssdWithdrawalVoucherSummaryFragment_MembersInjector $r1 = new UssdWithdrawalVoucherSummaryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenViewModel(UssdWithdrawalVoucherSummaryFragment ussdWithdrawalVoucherSummaryFragment, UssdWithdrawalVoucherSummaryViewModel ussdWithdrawalVoucherSummaryViewModel) {
        ussdWithdrawalVoucherSummaryFragment.screenViewModel = ussdWithdrawalVoucherSummaryViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UssdWithdrawalVoucherSummaryFragment ussdWithdrawalVoucherSummaryFragment) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        UssdWithdrawalVoucherSummaryViewModel $r4 = (UssdWithdrawalVoucherSummaryViewModel) $r2;
        injectScreenViewModel(ussdWithdrawalVoucherSummaryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UssdWithdrawalVoucherSummaryFragment $r2 = (UssdWithdrawalVoucherSummaryFragment) obj;
        injectMembers($r2);
    }
}
