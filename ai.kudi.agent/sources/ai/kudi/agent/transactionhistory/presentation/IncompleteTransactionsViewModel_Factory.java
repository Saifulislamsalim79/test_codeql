package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchIncompleteTransactions;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class IncompleteTransactionsViewModel_Factory implements InterfaceC9468d<IncompleteTransactionsViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchIncompleteTransactions> fetchTransactionsProvider;
    private final InterfaceC11700a<IncompleteTransactionsNavigator> incompleteTransactionsNavigatorProvider;
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<ServerTimeToTransactionDayMapper> serverTimeToTransactionDayMapperProvider;
    private final InterfaceC11700a<TransactionDataToUiMapper> transactionDataToUiMapperProvider;

    public IncompleteTransactionsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.fetchTransactionsProvider = interfaceC11700a2;
        this.transactionDataToUiMapperProvider = interfaceC11700a3;
        this.serverTimeToTransactionDayMapperProvider = interfaceC11700a4;
        this.prefProvider = interfaceC11700a5;
        this.incompleteTransactionsNavigatorProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IncompleteTransactionsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        IncompleteTransactionsViewModel_Factory $r6 = new IncompleteTransactionsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IncompleteTransactionsViewModel newInstance(FetchCurrentUser fetchCurrentUser, FetchIncompleteTransactions fetchIncompleteTransactions, TransactionDataToUiMapper transactionDataToUiMapper, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, Pref pref, IncompleteTransactionsNavigator incompleteTransactionsNavigator) {
        IncompleteTransactionsViewModel $r6 = new IncompleteTransactionsViewModel(fetchCurrentUser, fetchIncompleteTransactions, transactionDataToUiMapper, serverTimeToTransactionDayMapper, pref, incompleteTransactionsNavigator);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IncompleteTransactionsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchTransactionsProvider;
        Object $r22 = $r12.get();
        FetchIncompleteTransactions $r4 = (FetchIncompleteTransactions) $r22;
        InterfaceC11700a $r13 = this.transactionDataToUiMapperProvider;
        Object $r23 = $r13.get();
        TransactionDataToUiMapper $r5 = (TransactionDataToUiMapper) $r23;
        InterfaceC11700a $r14 = this.serverTimeToTransactionDayMapperProvider;
        Object $r24 = $r14.get();
        ServerTimeToTransactionDayMapper $r6 = (ServerTimeToTransactionDayMapper) $r24;
        InterfaceC11700a $r15 = this.prefProvider;
        Object $r25 = $r15.get();
        Pref pref = (Pref) $r25;
        InterfaceC11700a $r16 = this.incompleteTransactionsNavigatorProvider;
        Object $r26 = $r16.get();
        IncompleteTransactionsViewModel $r9 = newInstance($r3, $r4, $r5, $r6, pref, (IncompleteTransactionsNavigator) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41047multiply() {
        IncompleteTransactionsViewModel $r1 = multiply();
        return $r1;
    }
}
