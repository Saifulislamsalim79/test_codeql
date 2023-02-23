package ai.kudi.agent.transactioncommissions.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.transactioncommissions.navigator.TransactionCommissionsNavigator;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FilterCommissionsViewModel_Factory implements InterfaceC9468d<FilterCommissionsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchWalletActivities> fetchWalletActivitiesProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceDelegateProvider;
    private final InterfaceC11700a<ServerTimeToTransactionDayMapper> serverTimeToTransactionDayMapperProvider;
    private final InterfaceC11700a<TransactionDataToUiMapper> transactionDataToUiMapperProvider;
    private final InterfaceC11700a<TransactionCommissionsNavigator> transactionsNavigatorProvider;

    public FilterCommissionsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.transactionsNavigatorProvider = interfaceC11700a2;
        this.fetchWalletActivitiesProvider = interfaceC11700a3;
        this.resourceDelegateProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
        this.serverTimeToTransactionDayMapperProvider = interfaceC11700a6;
        this.transactionDataToUiMapperProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FilterCommissionsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        FilterCommissionsViewModel_Factory $r7 = new FilterCommissionsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FilterCommissionsViewModel newInstance(FetchCurrentUser fetchCurrentUser, TransactionCommissionsNavigator transactionCommissionsNavigator, FetchWalletActivities fetchWalletActivities, ResourceDelegate resourceDelegate, Analytics analytics, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper) {
        FilterCommissionsViewModel $r7 = new FilterCommissionsViewModel(fetchCurrentUser, transactionCommissionsNavigator, fetchWalletActivities, resourceDelegate, analytics, serverTimeToTransactionDayMapper, transactionDataToUiMapper);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FilterCommissionsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.transactionsNavigatorProvider;
        Object $r22 = $r12.get();
        TransactionCommissionsNavigator $r4 = (TransactionCommissionsNavigator) $r22;
        InterfaceC11700a $r13 = this.fetchWalletActivitiesProvider;
        Object $r23 = $r13.get();
        FetchWalletActivities $r5 = (FetchWalletActivities) $r23;
        InterfaceC11700a $r14 = this.resourceDelegateProvider;
        Object $r24 = $r14.get();
        ResourceDelegate resourceDelegate = (ResourceDelegate) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics analytics = (Analytics) $r25;
        InterfaceC11700a $r16 = this.serverTimeToTransactionDayMapperProvider;
        Object $r26 = $r16.get();
        ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper = (ServerTimeToTransactionDayMapper) $r26;
        InterfaceC11700a $r17 = this.transactionDataToUiMapperProvider;
        Object $r27 = $r17.get();
        TransactionDataToUiMapper $r9 = (TransactionDataToUiMapper) $r27;
        FilterCommissionsViewModel $r10 = newInstance($r3, $r4, $r5, resourceDelegate, analytics, serverTimeToTransactionDayMapper, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40959multiply() {
        FilterCommissionsViewModel $r1 = multiply();
        return $r1;
    }
}
