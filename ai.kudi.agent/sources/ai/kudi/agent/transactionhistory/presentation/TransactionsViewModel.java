package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletWalletHistory;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.domain.usecases.GetOutletTransactionSummaryUseCase;
import ai.kudi.agent.transactions.domain.usecases.GetTransactionSummaryUseCase;
import ai.kudi.agent.transactions.domain.usecases.GetTransactionSummaryUseCaseInput;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11678a;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: TransactionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J,\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0016J \u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J \u0010)\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J \u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"J\u000e\u0010+\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010,\u001a\u00020&J\u000e\u0010-\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010.\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010/\u001a\u00020&J\u0016\u00100\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u00020&J\u000e\u00104\u001a\u00020&2\u0006\u00105\u001a\u000206J.\u00107\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/presentation/TransactionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/BaseTransactionsViewModel;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "transactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/TransactionsNavigator;", "fetchWalletActivities", "Lai/kudi/agent/transactionhistory/domain/usecases/FetchWalletActivities;", "getTransactionSummaryUseCase", "Lai/kudi/agent/transactions/domain/usecases/GetTransactionSummaryUseCase;", "getOutletTransactionSummaryUseCase", "Lai/kudi/agent/transactions/domain/usecases/GetOutletTransactionSummaryUseCase;", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "transactionDataToUiMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;", "loadOutletWalletActivities", "Lai/kudi/agent/outlet_mgt/useCases/FetchOutletWalletHistory;", "pref", "Lai/kudi/agent/core/util/Pref;", "resourceDelegate", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/transactionhistory/navigator/TransactionsNavigator;Lai/kudi/agent/transactionhistory/domain/usecases/FetchWalletActivities;Lai/kudi/agent/transactions/domain/usecases/GetTransactionSummaryUseCase;Lai/kudi/agent/transactions/domain/usecases/GetOutletTransactionSummaryUseCase;Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;Lai/kudi/agent/outlet_mgt/useCases/FetchOutletWalletHistory;Lai/kudi/agent/core/util/Pref;Lai/kudi/agent/core/util/ResourceDelegate;)V", "generateRequestUsecase", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "newRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "forceRefresh", "", "initialData", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "loadSummary", "", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "loadTransactions", "onLoadData", "onLoadMore", "onOpenEmailTransactionReport", "onOpenFundWalletScreen", "onOpenIncompleteTransactions", "onOpenRequestStatement", "onOpenTransactionBreakDownPage", "type", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItemType;", "onOpenTransactionCommissionsScreen", "openOutletManagement", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "prepareTransactionsLoadingRequest", "fromDate", "", "toDate", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionsViewModel extends BaseTransactionsViewModel {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchWalletActivities fetchWalletActivities;
    private final GetOutletTransactionSummaryUseCase getOutletTransactionSummaryUseCase;
    private final GetTransactionSummaryUseCase getTransactionSummaryUseCase;
    private final FetchOutletWalletHistory loadOutletWalletActivities;
    private final Pref pref;
    private final ResourceDelegate resourceDelegate;
    private final TransactionsNavigator transactionsNavigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsViewModel(FetchCurrentUser fetchCurrentUser, Analytics analytics, TransactionsNavigator transactionsNavigator, FetchWalletActivities fetchWalletActivities, GetTransactionSummaryUseCase getTransactionSummaryUseCase, GetOutletTransactionSummaryUseCase getOutletTransactionSummaryUseCase, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper, FetchOutletWalletHistory fetchOutletWalletHistory, Pref pref, ResourceDelegate resourceDelegate) {
        super(serverTimeToTransactionDayMapper, transactionDataToUiMapper);
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(transactionsNavigator, "transactionsNavigator");
        Log_OC.getArray(fetchWalletActivities, "fetchWalletActivities");
        Log_OC.getArray(getTransactionSummaryUseCase, "getTransactionSummaryUseCase");
        Log_OC.getArray(getOutletTransactionSummaryUseCase, "getOutletTransactionSummaryUseCase");
        Log_OC.getArray(serverTimeToTransactionDayMapper, "serverTimeToTransactionDayMapper");
        Log_OC.getArray(transactionDataToUiMapper, "transactionDataToUiMapper");
        Log_OC.getArray(fetchOutletWalletHistory, "loadOutletWalletActivities");
        Log_OC.getArray(pref, "pref");
        Log_OC.getArray(resourceDelegate, "resourceDelegate");
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.transactionsNavigator = transactionsNavigator;
        this.fetchWalletActivities = fetchWalletActivities;
        this.getTransactionSummaryUseCase = getTransactionSummaryUseCase;
        this.getOutletTransactionSummaryUseCase = getOutletTransactionSummaryUseCase;
        this.loadOutletWalletActivities = fetchOutletWalletHistory;
        this.pref = pref;
        this.resourceDelegate = resourceDelegate;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p generateRequestUsecase(FetchRequest fetchRequest, TransactionHistoryScope transactionHistoryScope, boolean z) {
        AbstractC11688p $r8;
        boolean $z1 = transactionHistoryScope instanceof TransactionHistoryScope.OutletTransactions;
        if ($z1) {
            FetchOutletWalletHistory $r4 = this.loadOutletWalletActivities;
            User $r5 = getUser();
            String $r6 = transactionHistoryScope.scopeId();
            GetOutletWalletActivitiesRequest $r7 = new GetOutletWalletActivitiesRequest($r5, $r6, fetchRequest);
            $r8 = $r4.execute($r7);
        } else {
            FetchWalletActivities $r9 = this.fetchWalletActivities;
            User $r52 = getUser();
            User $r10 = getUser();
            String $r62 = $r10 == null ? null : $r10.getId();
            boolean $z0 = !z;
            GetWalletActivitiesRequest $r1 = new GetWalletActivitiesRequest($r52, fetchRequest, $r62, $z0);
            $r8 = $r9.execute($r1);
        }
        AbstractC11688p $r82 = $r8.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.presentation.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsViewModel $r12 = TransactionsViewModel.this;
                List $r2 = (List) obj;
                return TransactionsViewModel.m41053generateRequestUsecase$lambda5($r12, $r2);
            }
        });
        Log_OC.loadImage($r82, "fetchAll.map {\n            isAllPagesExhausted = it.isEmpty()\n            mapTransactionsData(it)\n        }");
        return $r82;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: generateRequestUsecase$lambda-5  reason: not valid java name */
    public static final List m41053generateRequestUsecase$lambda5(TransactionsViewModel transactionsViewModel, List list) {
        Log_OC.getArray(transactionsViewModel, "this$0");
        Log_OC.getArray(list, "it");
        boolean $z0 = list.isEmpty();
        transactionsViewModel.setAllPagesExhausted($z0);
        List $r0 = transactionsViewModel.mapTransactionsData(list);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadSummary(FilteredDate filteredDate, TransactionHistoryScope transactionHistoryScope, boolean $z0) {
        AbstractC11688p $r7;
        ViewData $r3 = getState();
        TransactionsViewState $r4 = (TransactionsViewState) $r3;
        publish(TransactionsViewState.copy$default($r4, true, false, false, false, false, null, null, 0, null, null, 1022, null));
        boolean $z1 = transactionHistoryScope instanceof TransactionHistoryScope.OutletTransactions;
        if ($z1) {
            GetOutletTransactionSummaryUseCase $r5 = this.getOutletTransactionSummaryUseCase;
            String $r6 = transactionHistoryScope.scopeId();
            $r7 = $r5.execute($r6);
        } else {
            GetTransactionSummaryUseCase $r8 = this.getTransactionSummaryUseCase;
            GetTransactionSummaryUseCaseInput $r9 = new GetTransactionSummaryUseCaseInput(filteredDate, !$z0);
            $r7 = $r8.execute($r9);
        }
        FavoritesArrayAdapter $r12 = $r7.e0(new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionsViewModel $r1 = TransactionsViewModel.this;
                List $r32 = (List) obj;
                TransactionsViewModel.m41054loadSummary$lambda6($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionsViewModel $r1 = TransactionsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                TransactionsViewModel.m41055loadSummary$lambda7($r1, $r32);
            }
        });
        C11280b $r13 = getCompositeDisposable();
        $r13.b($r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSummary$lambda-6  reason: not valid java name */
    public static final void m41054loadSummary$lambda6(TransactionsViewModel transactionsViewModel, List list) {
        Log_OC.getArray(transactionsViewModel, "this$0");
        ViewData $r2 = transactionsViewModel.getState();
        Log_OC.loadImage(list, "summary");
        TransactionsViewState $r3 = TransactionsViewState.copy$default((TransactionsViewState) $r2, false, false, false, false, false, null, list, 0, null, null, 942, null);
        transactionsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSummary$lambda-7  reason: not valid java name */
    public static final void m41055loadSummary$lambda7(TransactionsViewModel transactionsViewModel, Throwable th) {
        Log_OC.getArray(transactionsViewModel, "this$0");
        ViewData $r2 = transactionsViewModel.getState();
        TransactionsViewState $r3 = TransactionsViewState.copy$default((TransactionsViewState) $r2, false, false, false, false, false, null, null, 0, null, null, 1022, null);
        transactionsViewModel.publish($r3);
        Timber.reorder(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadTransactions(final FetchRequest fetchRequest, TransactionHistoryScope transactionHistoryScope, boolean z) {
        int $i0 = getCurrentPage();
        boolean $z1 = $i0 > 0;
        int $i02 = getCurrentPage();
        boolean $z2 = $i02 == 0;
        ViewData $r3 = getState();
        TransactionsViewState $r4 = TransactionsViewState.copy$default((TransactionsViewState) $r3, false, $z2, $z1, false, false, null, null, 0, null, null, 1009, null);
        publish($r4);
        AbstractC11688p $r5 = generateRequestUsecase(fetchRequest, transactionHistoryScope, z);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionsViewModel $r1 = TransactionsViewModel.this;
                FetchRequest $r2 = fetchRequest;
                List $r42 = (List) obj;
                TransactionsViewModel.m41056loadTransactions$lambda3($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionsViewModel $r1 = TransactionsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                TransactionsViewModel.m41057loadTransactions$lambda4($r1, $r32);
            }
        });
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-3  reason: not valid java name */
    public static final void m41056loadTransactions$lambda3(TransactionsViewModel transactionsViewModel, FetchRequest fetchRequest, List list) {
        Log_OC.getArray(transactionsViewModel, "this$0");
        Log_OC.getArray(fetchRequest, "$newRequest");
        String $r3 = Log_OC.m10359a("TransactionsResponse: ", list);
        Object[] $r4 = new Object[0];
        Timber.wtf($r3, $r4);
        transactionsViewModel.setRequest(fetchRequest);
        boolean $z0 = list.isEmpty();
        Pref $r5 = transactionsViewModel.pref;
        int $i0 = $r5.getIncompleteTransactionCount();
        ViewData $r6 = transactionsViewModel.getState();
        Log_OC.loadImage(list, "transactions");
        TransactionsViewState $r7 = TransactionsViewState.copy$default((TransactionsViewState) $r6, false, false, false, $z0, false, list, null, $i0, null, null, 849, null);
        transactionsViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-4  reason: not valid java name */
    public static final void m41057loadTransactions$lambda4(TransactionsViewModel transactionsViewModel, Throwable th) {
        Log_OC.getArray(transactionsViewModel, "this$0");
        C11680b $r2 = transactionsViewModel.getToastMessage();
        ResourceDelegate $r3 = transactionsViewModel.resourceDelegate;
        String $r4 = $r3.getString(C0001R.string.error_loading_transactions);
        $r2.mo331f($r4);
        ViewData $r5 = transactionsViewModel.getState();
        TransactionsViewState $r6 = TransactionsViewState.copy$default((TransactionsViewState) $r5, false, false, false, false, false, null, null, 0, null, null, 1017, null);
        transactionsViewModel.publish($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void onLoadData$default(TransactionsViewModel transactionsViewModel, FilteredDate filteredDate, TransactionHistoryScope transactionHistoryScope, boolean $z0, int i, Object obj) {
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z0 = false;
        }
        transactionsViewModel.onLoadData(filteredDate, transactionHistoryScope, $z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onLoadData$lambda-0  reason: not valid java name */
    public static final void m41058onLoadData$lambda0(TransactionsViewModel transactionsViewModel, FilteredDate filteredDate, TransactionHistoryScope transactionHistoryScope, boolean z, User user) {
        Log_OC.getArray(transactionsViewModel, "this$0");
        Log_OC.getArray(filteredDate, "$filteredDate");
        Log_OC.getArray(transactionHistoryScope, "$transactionHistoryScope");
        transactionsViewModel.setUser(user);
        Date $r4 = filteredDate.getFrom();
        String $r5 = DateExtKt.convertDateToGivenFormat($r4, "yyyy-MM-dd HH:mm:ss");
        Date $r42 = filteredDate.getTo();
        String $r6 = DateExtKt.convertDateToGivenFormat($r42, "yyyy-MM-dd HH:mm:ss");
        transactionsViewModel.prepareTransactionsLoadingRequest($r5, $r6, transactionHistoryScope, z);
        transactionsViewModel.loadSummary(filteredDate, transactionHistoryScope, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void prepareTransactionsLoadingRequest(String str, String str2, TransactionHistoryScope transactionHistoryScope, boolean z) {
        ViewData $r4 = getState();
        TransactionsViewState $r5 = (TransactionsViewState) $r4;
        boolean $z1 = $r5.isLoadingTransactions();
        if ($z1) {
            return;
        }
        ViewData $r42 = getState();
        TransactionsViewState $r52 = (TransactionsViewState) $r42;
        boolean $z12 = $r52.isLoadingMore();
        if ($z12) {
            return;
        }
        boolean $z13 = isAllPagesExhausted();
        if ($z13) {
            return;
        }
        FetchRequest $r6 = new FetchRequest(null, 1, null);
        int $i0 = getCurrentPage();
        String $r7 = String.valueOf($i0);
        $r6.setPage($r7);
        $r6.setTo(str2);
        $r6.setFrom(str);
        $r6.setWalletId("");
        FetchRequest $r8 = getRequest();
        boolean $z14 = Log_OC.append($r8, $r6);
        if (!$z14 || z) {
            loadTransactions($r6, transactionHistoryScope, z);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void prepareTransactionsLoadingRequest$default(TransactionsViewModel transactionsViewModel, String $r2, String $r3, TransactionHistoryScope transactionHistoryScope, boolean $z0, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = "";
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r3 = "";
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $z0 = false;
        }
        transactionsViewModel.prepareTransactionsLoadingRequest($r2, $r3, transactionHistoryScope, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.presentation.BaseTransactionsViewModel, ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        TransactionsViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.presentation.BaseTransactionsViewModel, ai.kudi.agent.core.mvvm.BaseViewModel
    public TransactionsViewState initialData() {
        TransactionsViewState $r1 = new TransactionsViewState(false, false, false, false, false, null, null, 0, null, null, 1023, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadData(final FilteredDate filteredDate, final TransactionHistoryScope transactionHistoryScope, final boolean z) {
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        setFilteredDate(filteredDate);
        setCurrentPage(0);
        setAllPagesExhausted(false);
        Set $r3 = getExistingDays();
        $r3.clear();
        C11280b $r4 = getCompositeDisposable();
        FetchCurrentUser $r5 = this.fetchCurrentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.Variable
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionsViewModel $r1 = TransactionsViewModel.this;
                FilteredDate $r2 = filteredDate;
                TransactionHistoryScope $r32 = transactionHistoryScope;
                boolean $z0 = z;
                User $r52 = (User) obj;
                TransactionsViewModel.m41058onLoadData$lambda0($r1, $r2, $r32, $z0, $r52);
            }
        };
        Subscription $r8 = Subscription.subscribed;
        FavoritesArrayAdapter $r9 = $r6.s(object, $r8);
        $r4.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadMore(TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        User $r2 = getUser();
        if ($r2 == null) {
            return;
        }
        ViewData $r3 = getState();
        TransactionsViewState $r4 = (TransactionsViewState) $r3;
        boolean $z0 = $r4.isLoadingTransactions();
        if ($z0) {
            return;
        }
        ViewData $r32 = getState();
        TransactionsViewState $r42 = (TransactionsViewState) $r32;
        boolean $z02 = $r42.isLoadingMore();
        if ($z02) {
            return;
        }
        boolean $z03 = isAllPagesExhausted();
        if ($z03) {
            return;
        }
        int $i0 = getCurrentPage();
        setCurrentPage($i0 + 1);
        FetchRequest $r5 = getRequest();
        int $i02 = getCurrentPage();
        String $r6 = String.valueOf($i02);
        $r5.setPage($r6);
        FetchRequest $r52 = getRequest();
        loadTransactions($r52, transactionHistoryScope, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onOpenEmailTransactionReport() {
        TransactionsNavigator $r1 = this.transactionsNavigator;
        $r1.openTransactionReportScreen();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onOpenFundWalletScreen(TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        TransactionsNavigator $r2 = this.transactionsNavigator;
        $r2.openFundWalletScreen(transactionHistoryScope);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onOpenIncompleteTransactions(TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        TransactionsNavigator $r2 = this.transactionsNavigator;
        $r2.openIncompleteTransactions(transactionHistoryScope);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onOpenRequestStatement() {
        Analytics $r2 = this.analytics;
        User $r1 = getUser();
        $r2.onTransactionFilterIconClickedEvent($r1);
        TransactionsNavigator $r3 = this.transactionsNavigator;
        $r3.openRequestStatementsScreen();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onOpenTransactionBreakDownPage(FilteredDate filteredDate, TransactionSummaryItemType transactionSummaryItemType) {
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(transactionSummaryItemType, "type");
        TransactionsNavigator $r3 = this.transactionsNavigator;
        $r3.openTransactionBreakDownScreen(filteredDate, transactionSummaryItemType);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onOpenTransactionCommissionsScreen() {
        C11678a $r2 = getViewData();
        Object $r3 = $r2.m10574w0();
        TransactionsViewState $r4 = (TransactionsViewState) $r3;
        List $r5 = $r4 == null ? null : $r4.getCommissionWallets();
        if ($r5 == null) {
            return;
        }
        TransactionsNavigator $r1 = this.transactionsNavigator;
        $r1.onOpenTransactionCommissionsScreen($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void openOutletManagement(Outlet outlet) {
        Log_OC.getArray(outlet, "outlet");
        TransactionsNavigator $r2 = this.transactionsNavigator;
        $r2.openOutletManagement(outlet);
    }
}
