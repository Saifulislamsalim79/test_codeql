package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletTransactions;
import ai.kudi.agent.transactionhistory.domain.usecases.GetTransactionHistoryUseCase;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.navigator.PendingTransactionsNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PendingFraudCheckTransactionsViewModel_Factory implements InterfaceC9468d<PendingFraudCheckTransactionsViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchOutletTransactions> fetchOutletTransactionsProvider;
    private final InterfaceC11700a<GetTransactionHistoryUseCase> getTransactionHistoryUseCaseProvider;
    private final InterfaceC11700a<PendingTransactionsNavigator> incompleteTransactionsNavigatorProvider;
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<ServerTimeToTransactionDayMapper> serverTimeToTransactionDayMapperProvider;
    private final InterfaceC11700a<TransactionDataToUiMapper> transactionDataToUiMapperProvider;

    public PendingFraudCheckTransactionsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.getTransactionHistoryUseCaseProvider = interfaceC11700a2;
        this.fetchOutletTransactionsProvider = interfaceC11700a3;
        this.transactionDataToUiMapperProvider = interfaceC11700a4;
        this.serverTimeToTransactionDayMapperProvider = interfaceC11700a5;
        this.prefProvider = interfaceC11700a6;
        this.incompleteTransactionsNavigatorProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingFraudCheckTransactionsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        PendingFraudCheckTransactionsViewModel_Factory $r7 = new PendingFraudCheckTransactionsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingFraudCheckTransactionsViewModel newInstance(FetchCurrentUser fetchCurrentUser, GetTransactionHistoryUseCase getTransactionHistoryUseCase, FetchOutletTransactions fetchOutletTransactions, TransactionDataToUiMapper transactionDataToUiMapper, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, Pref pref, PendingTransactionsNavigator pendingTransactionsNavigator) {
        PendingFraudCheckTransactionsViewModel $r7 = new PendingFraudCheckTransactionsViewModel(fetchCurrentUser, getTransactionHistoryUseCase, fetchOutletTransactions, transactionDataToUiMapper, serverTimeToTransactionDayMapper, pref, pendingTransactionsNavigator);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingFraudCheckTransactionsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.getTransactionHistoryUseCaseProvider;
        Object $r22 = $r12.get();
        GetTransactionHistoryUseCase $r4 = (GetTransactionHistoryUseCase) $r22;
        InterfaceC11700a $r13 = this.fetchOutletTransactionsProvider;
        Object $r23 = $r13.get();
        FetchOutletTransactions $r5 = (FetchOutletTransactions) $r23;
        InterfaceC11700a $r14 = this.transactionDataToUiMapperProvider;
        Object $r24 = $r14.get();
        TransactionDataToUiMapper transactionDataToUiMapper = (TransactionDataToUiMapper) $r24;
        InterfaceC11700a $r15 = this.serverTimeToTransactionDayMapperProvider;
        Object $r25 = $r15.get();
        ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper = (ServerTimeToTransactionDayMapper) $r25;
        InterfaceC11700a $r16 = this.prefProvider;
        Object $r26 = $r16.get();
        Pref pref = (Pref) $r26;
        InterfaceC11700a $r17 = this.incompleteTransactionsNavigatorProvider;
        Object $r27 = $r17.get();
        PendingTransactionsNavigator $r9 = (PendingTransactionsNavigator) $r27;
        PendingFraudCheckTransactionsViewModel $r10 = newInstance($r3, $r4, $r5, transactionDataToUiMapper, serverTimeToTransactionDayMapper, pref, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41052multiply() {
        PendingFraudCheckTransactionsViewModel $r1 = multiply();
        return $r1;
    }
}
