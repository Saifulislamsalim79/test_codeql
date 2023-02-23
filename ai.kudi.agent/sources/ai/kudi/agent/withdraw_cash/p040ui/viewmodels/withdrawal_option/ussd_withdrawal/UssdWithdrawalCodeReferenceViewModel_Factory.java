package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.usecases.CheckUssdWithdrawalTransactionStatus;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceViewModel_Factory */
/* loaded from: classes.dex */
public final class UssdWithdrawalCodeReferenceViewModel_Factory implements InterfaceC9468d<UssdWithdrawalCodeReferenceViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CheckUssdWithdrawalTransactionStatus> checkStatusProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public UssdWithdrawalCodeReferenceViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.checkStatusProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalCodeReferenceViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        UssdWithdrawalCodeReferenceViewModel_Factory $r3 = new UssdWithdrawalCodeReferenceViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalCodeReferenceViewModel newInstance(FetchCurrentUser fetchCurrentUser, CheckUssdWithdrawalTransactionStatus checkUssdWithdrawalTransactionStatus, Analytics analytics) {
        UssdWithdrawalCodeReferenceViewModel $r3 = new UssdWithdrawalCodeReferenceViewModel(fetchCurrentUser, checkUssdWithdrawalTransactionStatus, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UssdWithdrawalCodeReferenceViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.checkStatusProvider;
        Object $r22 = $r12.get();
        CheckUssdWithdrawalTransactionStatus $r4 = (CheckUssdWithdrawalTransactionStatus) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        UssdWithdrawalCodeReferenceViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41838multiply() {
        UssdWithdrawalCodeReferenceViewModel $r1 = multiply();
        return $r1;
    }
}
