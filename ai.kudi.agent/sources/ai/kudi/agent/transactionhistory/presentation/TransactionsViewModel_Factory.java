package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletWalletHistory;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator;
import ai.kudi.agent.transactions.domain.usecases.GetOutletTransactionSummaryUseCase;
import ai.kudi.agent.transactions.domain.usecases.GetTransactionSummaryUseCase;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionsViewModel_Factory implements InterfaceC9468d<TransactionsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchWalletActivities> fetchWalletActivitiesProvider;
    private final InterfaceC11700a<GetOutletTransactionSummaryUseCase> getOutletTransactionSummaryUseCaseProvider;
    private final InterfaceC11700a<GetTransactionSummaryUseCase> getTransactionSummaryUseCaseProvider;
    private final InterfaceC11700a<FetchOutletWalletHistory> loadOutletWalletActivitiesProvider;
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceDelegateProvider;
    private final InterfaceC11700a<ServerTimeToTransactionDayMapper> serverTimeToTransactionDayMapperProvider;
    private final InterfaceC11700a<TransactionDataToUiMapper> transactionDataToUiMapperProvider;
    private final InterfaceC11700a<TransactionsNavigator> transactionsNavigatorProvider;

    public TransactionsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9, InterfaceC11700a interfaceC11700a10, InterfaceC11700a interfaceC11700a11) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.transactionsNavigatorProvider = interfaceC11700a3;
        this.fetchWalletActivitiesProvider = interfaceC11700a4;
        this.getTransactionSummaryUseCaseProvider = interfaceC11700a5;
        this.getOutletTransactionSummaryUseCaseProvider = interfaceC11700a6;
        this.serverTimeToTransactionDayMapperProvider = interfaceC11700a7;
        this.transactionDataToUiMapperProvider = interfaceC11700a8;
        this.loadOutletWalletActivitiesProvider = interfaceC11700a9;
        this.prefProvider = interfaceC11700a10;
        this.resourceDelegateProvider = interfaceC11700a11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9, InterfaceC11700a interfaceC11700a10, InterfaceC11700a interfaceC11700a11) {
        TransactionsViewModel_Factory $r11 = new TransactionsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9, interfaceC11700a10, interfaceC11700a11);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionsViewModel newInstance(FetchCurrentUser fetchCurrentUser, Analytics analytics, TransactionsNavigator transactionsNavigator, FetchWalletActivities fetchWalletActivities, GetTransactionSummaryUseCase getTransactionSummaryUseCase, GetOutletTransactionSummaryUseCase getOutletTransactionSummaryUseCase, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper, FetchOutletWalletHistory fetchOutletWalletHistory, Pref pref, ResourceDelegate resourceDelegate) {
        TransactionsViewModel $r11 = new TransactionsViewModel(fetchCurrentUser, analytics, transactionsNavigator, fetchWalletActivities, getTransactionSummaryUseCase, getOutletTransactionSummaryUseCase, serverTimeToTransactionDayMapper, transactionDataToUiMapper, fetchOutletWalletHistory, pref, resourceDelegate);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics analytics = (Analytics) $r22;
        InterfaceC11700a $r13 = this.transactionsNavigatorProvider;
        Object $r23 = $r13.get();
        TransactionsNavigator transactionsNavigator = (TransactionsNavigator) $r23;
        InterfaceC11700a $r14 = this.fetchWalletActivitiesProvider;
        Object $r24 = $r14.get();
        FetchWalletActivities fetchWalletActivities = (FetchWalletActivities) $r24;
        InterfaceC11700a $r15 = this.getTransactionSummaryUseCaseProvider;
        Object $r25 = $r15.get();
        GetTransactionSummaryUseCase getTransactionSummaryUseCase = (GetTransactionSummaryUseCase) $r25;
        InterfaceC11700a $r16 = this.getOutletTransactionSummaryUseCaseProvider;
        Object $r26 = $r16.get();
        GetOutletTransactionSummaryUseCase getOutletTransactionSummaryUseCase = (GetOutletTransactionSummaryUseCase) $r26;
        InterfaceC11700a $r17 = this.serverTimeToTransactionDayMapperProvider;
        Object $r27 = $r17.get();
        ServerTimeToTransactionDayMapper $r9 = (ServerTimeToTransactionDayMapper) $r27;
        InterfaceC11700a $r18 = this.transactionDataToUiMapperProvider;
        Object $r28 = $r18.get();
        TransactionDataToUiMapper $r10 = (TransactionDataToUiMapper) $r28;
        InterfaceC11700a $r19 = this.loadOutletWalletActivitiesProvider;
        Object $r29 = $r19.get();
        FetchOutletWalletHistory $r11 = (FetchOutletWalletHistory) $r29;
        InterfaceC11700a $r110 = this.prefProvider;
        Object $r210 = $r110.get();
        Pref $r122 = (Pref) $r210;
        InterfaceC11700a $r111 = this.resourceDelegateProvider;
        Object $r211 = $r111.get();
        ResourceDelegate $r132 = (ResourceDelegate) $r211;
        TransactionsViewModel $r142 = newInstance($r3, analytics, transactionsNavigator, fetchWalletActivities, getTransactionSummaryUseCase, getOutletTransactionSummaryUseCase, $r9, $r10, $r11, $r122, $r132);
        return $r142;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41060multiply() {
        TransactionsViewModel $r1 = multiply();
        return $r1;
    }
}
