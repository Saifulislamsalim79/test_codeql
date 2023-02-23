package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.usecases.CardlessWithdrawalUsecase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewModel_Factory */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherSummaryViewModel_Factory implements InterfaceC9468d<UssdWithdrawalVoucherSummaryViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<CardlessWithdrawalUsecase> usecaseProvider;

    public UssdWithdrawalVoucherSummaryViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.usecaseProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalVoucherSummaryViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        UssdWithdrawalVoucherSummaryViewModel_Factory $r3 = new UssdWithdrawalVoucherSummaryViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalVoucherSummaryViewModel newInstance(CardlessWithdrawalUsecase cardlessWithdrawalUsecase, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        UssdWithdrawalVoucherSummaryViewModel $r3 = new UssdWithdrawalVoucherSummaryViewModel(cardlessWithdrawalUsecase, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UssdWithdrawalVoucherSummaryViewModel multiply() {
        InterfaceC11700a $r1 = this.usecaseProvider;
        Object $r2 = $r1.get();
        CardlessWithdrawalUsecase $r3 = (CardlessWithdrawalUsecase) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        UssdWithdrawalVoucherSummaryViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41854multiply() {
        UssdWithdrawalVoucherSummaryViewModel $r1 = multiply();
        return $r1;
    }
}
