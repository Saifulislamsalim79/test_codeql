package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.usecases.CardlessWithdrawalUsecase;
import ai.kudi.agent.withdraw_cash.domain.usecases.FetchUssdWithdrawalProviderListUsecase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewModel_Factory */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherInputViewModel_Factory implements InterfaceC9468d<UssdWithdrawalVoucherInputViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<ResourceDelegate> contextProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchUssdWithdrawalProviderListUsecase> fetchProvidersListProvider;
    private final InterfaceC11700a<CardlessWithdrawalUsecase> usecaseProvider;

    public UssdWithdrawalVoucherInputViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.contextProvider = interfaceC11700a;
        this.usecaseProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.fetchProvidersListProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalVoucherInputViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        UssdWithdrawalVoucherInputViewModel_Factory $r5 = new UssdWithdrawalVoucherInputViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalVoucherInputViewModel newInstance(ResourceDelegate resourceDelegate, CardlessWithdrawalUsecase cardlessWithdrawalUsecase, FetchCurrentUser fetchCurrentUser, Analytics analytics, FetchUssdWithdrawalProviderListUsecase fetchUssdWithdrawalProviderListUsecase) {
        UssdWithdrawalVoucherInputViewModel $r5 = new UssdWithdrawalVoucherInputViewModel(resourceDelegate, cardlessWithdrawalUsecase, fetchCurrentUser, analytics, fetchUssdWithdrawalProviderListUsecase);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UssdWithdrawalVoucherInputViewModel multiply() {
        InterfaceC11700a $r1 = this.contextProvider;
        Object $r2 = $r1.get();
        ResourceDelegate $r3 = (ResourceDelegate) $r2;
        InterfaceC11700a $r12 = this.usecaseProvider;
        Object $r22 = $r12.get();
        CardlessWithdrawalUsecase $r4 = (CardlessWithdrawalUsecase) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InterfaceC11700a $r15 = this.fetchProvidersListProvider;
        Object $r25 = $r15.get();
        FetchUssdWithdrawalProviderListUsecase $r7 = (FetchUssdWithdrawalProviderListUsecase) $r25;
        UssdWithdrawalVoucherInputViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41849multiply() {
        UssdWithdrawalVoucherInputViewModel $r1 = multiply();
        return $r1;
    }
}
