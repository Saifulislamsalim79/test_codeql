package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.usecases.FetchLoanHistory;
import ai.kudi.agent.kshock.usecases.FetchOverdueLoanHistory;
import ai.kudi.agent.kshock.usecases.GetWalletUseCase;
import ai.kudi.agent.kshock.usecases.PaybackLoan;
import ai.kudi.agent.kshock.usecases.PaybackOverdueLoan;
import ai.kudi.agent.kshock.usecases.SubmitTransactionRequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KshockPendingLoansListViewModel_Factory implements InterfaceC9468d<KshockPendingLoansListViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchLoanHistory> fetchLoanHistoryProvider;
    private final InterfaceC11700a<FetchOverdueLoanHistory> fetchOverdueLoanHistoryProvider;
    private final InterfaceC11700a<GetWalletUseCase> getWalletProvider;
    private final InterfaceC11700a<KShockNavigator> kShockNavigatorProvider;
    private final InterfaceC11700a<PaybackLoan> paybackLoanProvider;
    private final InterfaceC11700a<PaybackOverdueLoan> paybackOverdueLoanProvider;
    private final InterfaceC11700a<SubmitTransactionRequest> submitRequestProvider;

    public KshockPendingLoansListViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        this.fetchLoanHistoryProvider = interfaceC11700a;
        this.fetchOverdueLoanHistoryProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.kShockNavigatorProvider = interfaceC11700a4;
        this.paybackLoanProvider = interfaceC11700a5;
        this.getWalletProvider = interfaceC11700a6;
        this.paybackOverdueLoanProvider = interfaceC11700a7;
        this.submitRequestProvider = interfaceC11700a8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockPendingLoansListViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        KshockPendingLoansListViewModel_Factory $r8 = new KshockPendingLoansListViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockPendingLoansListViewModel newInstance(FetchLoanHistory fetchLoanHistory, FetchOverdueLoanHistory fetchOverdueLoanHistory, FetchCurrentUser fetchCurrentUser, KShockNavigator kShockNavigator, PaybackLoan paybackLoan, GetWalletUseCase getWalletUseCase, PaybackOverdueLoan paybackOverdueLoan, SubmitTransactionRequest submitTransactionRequest) {
        KshockPendingLoansListViewModel $r8 = new KshockPendingLoansListViewModel(fetchLoanHistory, fetchOverdueLoanHistory, fetchCurrentUser, kShockNavigator, paybackLoan, getWalletUseCase, paybackOverdueLoan, submitTransactionRequest);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KshockPendingLoansListViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchLoanHistoryProvider;
        Object $r2 = $r1.get();
        FetchLoanHistory $r3 = (FetchLoanHistory) $r2;
        InterfaceC11700a $r12 = this.fetchOverdueLoanHistoryProvider;
        Object $r22 = $r12.get();
        FetchOverdueLoanHistory $r4 = (FetchOverdueLoanHistory) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.kShockNavigatorProvider;
        Object $r24 = $r14.get();
        KShockNavigator kShockNavigator = (KShockNavigator) $r24;
        InterfaceC11700a $r15 = this.paybackLoanProvider;
        Object $r25 = $r15.get();
        PaybackLoan paybackLoan = (PaybackLoan) $r25;
        InterfaceC11700a $r16 = this.getWalletProvider;
        Object $r26 = $r16.get();
        GetWalletUseCase getWalletUseCase = (GetWalletUseCase) $r26;
        InterfaceC11700a $r17 = this.paybackOverdueLoanProvider;
        Object $r27 = $r17.get();
        PaybackOverdueLoan $r9 = (PaybackOverdueLoan) $r27;
        InterfaceC11700a $r18 = this.submitRequestProvider;
        Object $r28 = $r18.get();
        SubmitTransactionRequest $r10 = (SubmitTransactionRequest) $r28;
        KshockPendingLoansListViewModel $r11 = newInstance($r3, $r4, $r5, kShockNavigator, paybackLoan, getWalletUseCase, $r9, $r10);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39612multiply() {
        KshockPendingLoansListViewModel $r1 = multiply();
        return $r1;
    }
}
