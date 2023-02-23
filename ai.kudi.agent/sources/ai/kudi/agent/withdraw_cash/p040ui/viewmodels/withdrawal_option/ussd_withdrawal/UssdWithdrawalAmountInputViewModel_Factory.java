package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.usecases.GenerateUssdWithdrawalCode;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewModel_Factory */
/* loaded from: classes.dex */
public final class UssdWithdrawalAmountInputViewModel_Factory implements InterfaceC9468d<UssdWithdrawalAmountInputViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<PerformServiceFeeLookup> feeLookupProvider;
    private final InterfaceC11700a<GenerateUssdWithdrawalCode> generateUssdWithdrawalCodeProvider;

    public UssdWithdrawalAmountInputViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.currentUserProvider = interfaceC11700a;
        this.feeLookupProvider = interfaceC11700a2;
        this.generateUssdWithdrawalCodeProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalAmountInputViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        UssdWithdrawalAmountInputViewModel_Factory $r3 = new UssdWithdrawalAmountInputViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalAmountInputViewModel newInstance(FetchCurrentUser fetchCurrentUser, PerformServiceFeeLookup performServiceFeeLookup, GenerateUssdWithdrawalCode generateUssdWithdrawalCode) {
        UssdWithdrawalAmountInputViewModel $r3 = new UssdWithdrawalAmountInputViewModel(fetchCurrentUser, performServiceFeeLookup, generateUssdWithdrawalCode);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UssdWithdrawalAmountInputViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.feeLookupProvider;
        Object $r22 = $r12.get();
        PerformServiceFeeLookup $r4 = (PerformServiceFeeLookup) $r22;
        InterfaceC11700a $r13 = this.generateUssdWithdrawalCodeProvider;
        Object $r23 = $r13.get();
        GenerateUssdWithdrawalCode $r5 = (GenerateUssdWithdrawalCode) $r23;
        UssdWithdrawalAmountInputViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41832multiply() {
        UssdWithdrawalAmountInputViewModel $r1 = multiply();
        return $r1;
    }
}
