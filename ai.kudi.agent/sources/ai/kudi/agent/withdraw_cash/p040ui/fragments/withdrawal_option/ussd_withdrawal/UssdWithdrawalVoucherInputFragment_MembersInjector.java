package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputFragment_MembersInjector */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherInputFragment_MembersInjector implements InterfaceC9463a<UssdWithdrawalVoucherInputFragment> {
    private final InterfaceC11700a<UssdWithdrawalVoucherInputViewModel> screenViewModelProvider;

    public UssdWithdrawalVoucherInputFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UssdWithdrawalVoucherInputFragment_MembersInjector $r1 = new UssdWithdrawalVoucherInputFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenViewModel(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment, UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel) {
        ussdWithdrawalVoucherInputFragment.screenViewModel = ussdWithdrawalVoucherInputViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        UssdWithdrawalVoucherInputViewModel $r4 = (UssdWithdrawalVoucherInputViewModel) $r2;
        injectScreenViewModel(ussdWithdrawalVoucherInputFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UssdWithdrawalVoucherInputFragment $r2 = (UssdWithdrawalVoucherInputFragment) obj;
        injectMembers($r2);
    }
}
