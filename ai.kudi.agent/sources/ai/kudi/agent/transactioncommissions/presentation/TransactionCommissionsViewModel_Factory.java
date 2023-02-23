package ai.kudi.agent.transactioncommissions.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.transactioncommissions.domain.GetCommissionCashoutSummaryUseCase;
import ai.kudi.agent.transactioncommissions.navigator.TransactionCommissionsNavigator;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactions.domain.usecases.GetAllWalletsUseCase;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionCommissionsViewModel_Factory implements InterfaceC9468d<TransactionCommissionsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchWalletActivities> fetchWalletActivitiesProvider;
    private final InterfaceC11700a<GetAllWalletsUseCase> getAllWalletsUseCaseProvider;
    private final InterfaceC11700a<GetCommissionCashoutSummaryUseCase> getCommissionCashoutSummaryUseCaseProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceDelegateProvider;
    private final InterfaceC11700a<ServerTimeToTransactionDayMapper> serverTimeToTransactionDayMapperProvider;
    private final InterfaceC11700a<TransactionDataToUiMapper> transactionDataToUiMapperProvider;
    private final InterfaceC11700a<TransactionCommissionsNavigator> transactionsNavigatorProvider;

    public TransactionCommissionsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.transactionsNavigatorProvider = interfaceC11700a3;
        this.fetchWalletActivitiesProvider = interfaceC11700a4;
        this.resourceDelegateProvider = interfaceC11700a5;
        this.getAllWalletsUseCaseProvider = interfaceC11700a6;
        this.getCommissionCashoutSummaryUseCaseProvider = interfaceC11700a7;
        this.serverTimeToTransactionDayMapperProvider = interfaceC11700a8;
        this.transactionDataToUiMapperProvider = interfaceC11700a9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionCommissionsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9) {
        TransactionCommissionsViewModel_Factory $r9 = new TransactionCommissionsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionCommissionsViewModel newInstance(FetchCurrentUser fetchCurrentUser, Analytics analytics, TransactionCommissionsNavigator transactionCommissionsNavigator, FetchWalletActivities fetchWalletActivities, ResourceDelegate resourceDelegate, GetAllWalletsUseCase getAllWalletsUseCase, GetCommissionCashoutSummaryUseCase getCommissionCashoutSummaryUseCase, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper) {
        TransactionCommissionsViewModel $r9 = new TransactionCommissionsViewModel(fetchCurrentUser, analytics, transactionCommissionsNavigator, fetchWalletActivities, resourceDelegate, getAllWalletsUseCase, getCommissionCashoutSummaryUseCase, serverTimeToTransactionDayMapper, transactionDataToUiMapper);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionCommissionsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.transactionsNavigatorProvider;
        Object $r23 = $r13.get();
        TransactionCommissionsNavigator transactionCommissionsNavigator = (TransactionCommissionsNavigator) $r23;
        InterfaceC11700a $r14 = this.fetchWalletActivitiesProvider;
        Object $r24 = $r14.get();
        FetchWalletActivities fetchWalletActivities = (FetchWalletActivities) $r24;
        InterfaceC11700a $r15 = this.resourceDelegateProvider;
        Object $r25 = $r15.get();
        ResourceDelegate resourceDelegate = (ResourceDelegate) $r25;
        InterfaceC11700a $r16 = this.getAllWalletsUseCaseProvider;
        Object $r26 = $r16.get();
        GetAllWalletsUseCase getAllWalletsUseCase = (GetAllWalletsUseCase) $r26;
        InterfaceC11700a $r17 = this.getCommissionCashoutSummaryUseCaseProvider;
        Object $r27 = $r17.get();
        GetCommissionCashoutSummaryUseCase $r9 = (GetCommissionCashoutSummaryUseCase) $r27;
        InterfaceC11700a $r18 = this.serverTimeToTransactionDayMapperProvider;
        Object $r28 = $r18.get();
        ServerTimeToTransactionDayMapper $r10 = (ServerTimeToTransactionDayMapper) $r28;
        InterfaceC11700a $r19 = this.transactionDataToUiMapperProvider;
        Object $r29 = $r19.get();
        TransactionDataToUiMapper $r11 = (TransactionDataToUiMapper) $r29;
        TransactionCommissionsViewModel $r122 = newInstance($r3, $r4, transactionCommissionsNavigator, fetchWalletActivities, resourceDelegate, getAllWalletsUseCase, $r9, $r10, $r11);
        return $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40977multiply() {
        TransactionCommissionsViewModel $r1 = multiply();
        return $r1;
    }
}
