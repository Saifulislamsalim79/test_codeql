package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletWalletHistory;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.domain.usecases.SearchTransactionsUseCase;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FilterTransactionsViewModel_Factory implements InterfaceC9468d<FilterTransactionsViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchWalletActivities> fetchWalletActivitiesProvider;
    private final InterfaceC11700a<FetchOutletWalletHistory> loadOutletWalletActivitiesProvider;
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceDelegateProvider;
    private final InterfaceC11700a<SearchTransactionsUseCase> searchWalletActivitiesProvider;
    private final InterfaceC11700a<ServerTimeToTransactionDayMapper> serverTimeToTransactionDayMapperProvider;
    private final InterfaceC11700a<TransactionDataToUiMapper> transactionDataToUiMapperProvider;

    public FilterTransactionsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.fetchWalletActivitiesProvider = interfaceC11700a2;
        this.searchWalletActivitiesProvider = interfaceC11700a3;
        this.serverTimeToTransactionDayMapperProvider = interfaceC11700a4;
        this.transactionDataToUiMapperProvider = interfaceC11700a5;
        this.loadOutletWalletActivitiesProvider = interfaceC11700a6;
        this.prefProvider = interfaceC11700a7;
        this.resourceDelegateProvider = interfaceC11700a8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FilterTransactionsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        FilterTransactionsViewModel_Factory $r8 = new FilterTransactionsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FilterTransactionsViewModel newInstance(FetchCurrentUser fetchCurrentUser, FetchWalletActivities fetchWalletActivities, SearchTransactionsUseCase searchTransactionsUseCase, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper, FetchOutletWalletHistory fetchOutletWalletHistory, Pref pref, ResourceDelegate resourceDelegate) {
        FilterTransactionsViewModel $r8 = new FilterTransactionsViewModel(fetchCurrentUser, fetchWalletActivities, searchTransactionsUseCase, serverTimeToTransactionDayMapper, transactionDataToUiMapper, fetchOutletWalletHistory, pref, resourceDelegate);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FilterTransactionsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchWalletActivitiesProvider;
        Object $r22 = $r12.get();
        FetchWalletActivities $r4 = (FetchWalletActivities) $r22;
        InterfaceC11700a $r13 = this.searchWalletActivitiesProvider;
        Object $r23 = $r13.get();
        SearchTransactionsUseCase $r5 = (SearchTransactionsUseCase) $r23;
        InterfaceC11700a $r14 = this.serverTimeToTransactionDayMapperProvider;
        Object $r24 = $r14.get();
        ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper = (ServerTimeToTransactionDayMapper) $r24;
        InterfaceC11700a $r15 = this.transactionDataToUiMapperProvider;
        Object $r25 = $r15.get();
        TransactionDataToUiMapper transactionDataToUiMapper = (TransactionDataToUiMapper) $r25;
        InterfaceC11700a $r16 = this.loadOutletWalletActivitiesProvider;
        Object $r26 = $r16.get();
        FetchOutletWalletHistory fetchOutletWalletHistory = (FetchOutletWalletHistory) $r26;
        InterfaceC11700a $r17 = this.prefProvider;
        Object $r27 = $r17.get();
        Pref $r9 = (Pref) $r27;
        InterfaceC11700a $r18 = this.resourceDelegateProvider;
        Object $r28 = $r18.get();
        ResourceDelegate $r10 = (ResourceDelegate) $r28;
        FilterTransactionsViewModel $r11 = newInstance($r3, $r4, $r5, serverTimeToTransactionDayMapper, transactionDataToUiMapper, fetchOutletWalletHistory, $r9, $r10);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41042multiply() {
        FilterTransactionsViewModel $r1 = multiply();
        return $r1;
    }
}
