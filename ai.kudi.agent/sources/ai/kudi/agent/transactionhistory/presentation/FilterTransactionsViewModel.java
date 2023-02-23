package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletWalletHistory;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.domain.usecases.SearchTransactionsUseCase;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: FilterTransactionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012JT\u0010\u0013\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 \u0017*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u0015 \u0017*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 \u0017*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u0015\u0018\u00010\u00140\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002JL\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020'H\u0002J\u0016\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010+\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bJ4\u0010,\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/presentation/FilterTransactionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/BaseTransactionsViewModel;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchWalletActivities", "Lai/kudi/agent/transactionhistory/domain/usecases/FetchWalletActivities;", "searchWalletActivities", "Lai/kudi/agent/transactionhistory/domain/usecases/SearchTransactionsUseCase;", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "transactionDataToUiMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;", "loadOutletWalletActivities", "Lai/kudi/agent/outlet_mgt/useCases/FetchOutletWalletHistory;", "pref", "Lai/kudi/agent/core/util/Pref;", "resourceDelegate", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/transactionhistory/domain/usecases/FetchWalletActivities;Lai/kudi/agent/transactionhistory/domain/usecases/SearchTransactionsUseCase;Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;Lai/kudi/agent/outlet_mgt/useCases/FetchOutletWalletHistory;Lai/kudi/agent/core/util/Pref;Lai/kudi/agent/core/util/ResourceDelegate;)V", "generateRequestUsecase", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "kotlin.jvm.PlatformType", "newRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "initialData", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "loadTransactions", "", "transactionStatus", "", "transactionType", "searchKeyword", "fromDate", "toDate", "forceRefresh", "", "onLoadData", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "onLoadMore", "onSearch", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FilterTransactionsViewModel extends BaseTransactionsViewModel {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchWalletActivities fetchWalletActivities;
    private final FetchOutletWalletHistory loadOutletWalletActivities;
    private final Pref pref;
    private final ResourceDelegate resourceDelegate;
    private final SearchTransactionsUseCase searchWalletActivities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterTransactionsViewModel(FetchCurrentUser fetchCurrentUser, FetchWalletActivities fetchWalletActivities, SearchTransactionsUseCase searchTransactionsUseCase, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper, FetchOutletWalletHistory fetchOutletWalletHistory, Pref pref, ResourceDelegate resourceDelegate) {
        super(serverTimeToTransactionDayMapper, transactionDataToUiMapper);
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(fetchWalletActivities, "fetchWalletActivities");
        Log_OC.getArray(searchTransactionsUseCase, "searchWalletActivities");
        Log_OC.getArray(serverTimeToTransactionDayMapper, "serverTimeToTransactionDayMapper");
        Log_OC.getArray(transactionDataToUiMapper, "transactionDataToUiMapper");
        Log_OC.getArray(fetchOutletWalletHistory, "loadOutletWalletActivities");
        Log_OC.getArray(pref, "pref");
        Log_OC.getArray(resourceDelegate, "resourceDelegate");
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchWalletActivities = fetchWalletActivities;
        this.searchWalletActivities = searchTransactionsUseCase;
        this.loadOutletWalletActivities = fetchOutletWalletHistory;
        this.pref = pref;
        this.resourceDelegate = resourceDelegate;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final p425j.p444e.AbstractC11688p generateRequestUsecase(ai.kudi.agent.transactions.data.repositories.dto.FetchRequest r26, ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope r27) {
        /*
            r25 = this;
            r0 = r26
            java.util.Map r7 = r0.getParams()
            java.lang.String r9 = "value"
            boolean r8 = r7.containsKey(r9)
            if (r8 == 0) goto L81
            r0 = r26
            java.lang.String r10 = r0.getValue()
            if (r10 == 0) goto L1f
            boolean r8 = kotlin.p549l0.C13265j.m5470u(r10)
            if (r8 == 0) goto L1d
            goto L1f
        L1d:
            r8 = 0
            goto L20
        L1f:
            r8 = 1
        L20:
            if (r8 == 0) goto L81
            r0 = r27
            boolean r8 = r0 instanceof ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope.OutletTransactions
            if (r8 == 0) goto L44
            r0 = r25
            ai.kudi.agent.outlet_mgt.useCases.FetchOutletWalletHistory r11 = r0.loadOutletWalletActivities
            r0 = r25
            ai.kudi.agent.users.domain.package_1.User r12 = r0.getUser()
            r0 = r27
            java.lang.String r10 = r0.scopeId()
            ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest r13 = new ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest
            r0 = r26
            r13.<init>(r12, r10, r0)
            j.e.p r14 = r11.execute(r13)
            goto L71
        L44:
            r0 = r25
            ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities r15 = r0.fetchWalletActivities
            r0 = r25
            ai.kudi.agent.users.domain.package_1.User r12 = r0.getUser()
            r0 = r25
            ai.kudi.agent.users.domain.package_1.User r16 = r0.getUser()
            if (r16 != 0) goto L58
            r10 = 0
            goto L5e
        L58:
            r0 = r16
            java.lang.String r10 = r0.getId()
        L5e:
            ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest r17 = new ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest
            r18 = 0
            r0 = r17
            r1 = r26
            r2 = r18
            r0.<init>(r12, r1, r10, r2)
            r0 = r17
            j.e.p r14 = r15.execute(r0)
        L71:
            ai.kudi.agent.transactionhistory.presentation.b r19 = new ai.kudi.agent.transactionhistory.presentation.b
            r0 = r19
            r1 = r25
            r0.<init>()
            r0 = r19
            j.e.p r14 = r14.m10531O(r0)
            return r14
        L81:
            r0 = r27
            java.lang.String r10 = r0.scopeId()
            r0 = r26
            r0.setAgentUid(r10)
            r0 = r25
            ai.kudi.agent.transactionhistory.domain.usecases.SearchTransactionsUseCase r0 = r0.searchWalletActivities
            r20 = r0
            ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest r17 = new ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest
            r0 = r25
            ai.kudi.agent.users.domain.package_1.User r12 = r0.getUser()
            r21 = 0
            r18 = 0
            r22 = 12
            r23 = 0
            r0 = r17
            r1 = r12
            r2 = r26
            r3 = r21
            r4 = r18
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r20
            r1 = r17
            j.e.p r14 = r0.execute(r1)
            ai.kudi.agent.transactionhistory.presentation.c r24 = new ai.kudi.agent.transactionhistory.presentation.c
            r0 = r24
            r1 = r25
            r0.<init>()
            r0 = r24
            j.e.p r14 = r14.m10531O(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.presentation.FilterTransactionsViewModel.generateRequestUsecase(ai.kudi.agent.transactions.data.repositories.dto.FetchRequest, ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope):j.e.p");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: generateRequestUsecase$lambda-5  reason: not valid java name */
    public static final List m41036generateRequestUsecase$lambda5(FilterTransactionsViewModel filterTransactionsViewModel, List list) {
        Log_OC.getArray(filterTransactionsViewModel, "this$0");
        Log_OC.getArray(list, "it");
        boolean $z0 = list.isEmpty();
        filterTransactionsViewModel.setAllPagesExhausted($z0);
        List $r0 = filterTransactionsViewModel.mapTransactionsData(list);
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: generateRequestUsecase$lambda-6  reason: not valid java name */
    public static final List m41037generateRequestUsecase$lambda6(FilterTransactionsViewModel filterTransactionsViewModel, List list) {
        Log_OC.getArray(filterTransactionsViewModel, "this$0");
        Log_OC.getArray(list, "it");
        boolean $z0 = list.isEmpty();
        filterTransactionsViewModel.setAllPagesExhausted($z0);
        List $r0 = filterTransactionsViewModel.mapTransactionsData(list);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadTransactions(final FetchRequest fetchRequest, TransactionHistoryScope transactionHistoryScope) {
        int $i0 = getCurrentPage();
        boolean $z0 = $i0 > 0;
        int $i02 = getCurrentPage();
        boolean $z1 = $i02 == 0;
        ViewData $r3 = getState();
        TransactionsViewState $r4 = TransactionsViewState.copy$default((TransactionsViewState) $r3, false, $z1, $z0, false, false, null, null, 0, null, null, 1009, null);
        publish($r4);
        AbstractC11688p $r5 = generateRequestUsecase(fetchRequest, transactionHistoryScope);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FilterTransactionsViewModel $r1 = FilterTransactionsViewModel.this;
                FetchRequest $r2 = fetchRequest;
                List $r42 = (List) obj;
                FilterTransactionsViewModel.m41038loadTransactions$lambda3($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FilterTransactionsViewModel $r1 = FilterTransactionsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                FilterTransactionsViewModel.m41039loadTransactions$lambda4($r1, $r32);
            }
        });
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadTransactions(String str, String str2, String str3, String str4, String str5, TransactionHistoryScope transactionHistoryScope, boolean z) {
        ViewData $r7 = getState();
        TransactionsViewState $r8 = (TransactionsViewState) $r7;
        boolean $z1 = $r8.isLoadingTransactions();
        if ($z1) {
            return;
        }
        ViewData $r72 = getState();
        TransactionsViewState $r82 = (TransactionsViewState) $r72;
        boolean $z12 = $r82.isLoadingMore();
        if ($z12) {
            return;
        }
        boolean $z13 = isAllPagesExhausted();
        if ($z13) {
            return;
        }
        FetchRequest $r9 = new FetchRequest(null, 1, null);
        int $i0 = getCurrentPage();
        String $r10 = String.valueOf($i0);
        $r9.setPage($r10);
        $r9.setStatus(str);
        $r9.setProduct_type(str2);
        $r9.setTo(str5);
        $r9.setFrom(str4);
        $r9.setValue(str3);
        $r9.setWalletId("");
        FetchRequest $r11 = getRequest();
        boolean $z14 = Log_OC.append($r11, $r9);
        if (!$z14 || z) {
            loadTransactions($r9, transactionHistoryScope);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void loadTransactions$default(FilterTransactionsViewModel filterTransactionsViewModel, String $r1, String $r2, String $r3, String $r4, String $r5, TransactionHistoryScope transactionHistoryScope, boolean $z0, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = "";
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = "";
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r3 = "";
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r4 = "";
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r5 = "";
        }
        int $i0 = i & 64;
        if ($i0 != 0) {
            $z0 = false;
        }
        filterTransactionsViewModel.loadTransactions($r1, $r2, $r3, $r4, $r5, transactionHistoryScope, $z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-3  reason: not valid java name */
    public static final void m41038loadTransactions$lambda3(FilterTransactionsViewModel filterTransactionsViewModel, FetchRequest fetchRequest, List list) {
        Log_OC.getArray(filterTransactionsViewModel, "this$0");
        Log_OC.getArray(fetchRequest, "$newRequest");
        filterTransactionsViewModel.setRequest(fetchRequest);
        boolean $z0 = list.isEmpty();
        Pref $r3 = filterTransactionsViewModel.pref;
        int $i0 = $r3.getIncompleteTransactionCount();
        ViewData $r4 = filterTransactionsViewModel.getState();
        Log_OC.loadImage(list, "transactions");
        TransactionsViewState $r5 = TransactionsViewState.copy$default((TransactionsViewState) $r4, false, false, false, $z0, false, list, null, $i0, null, null, 849, null);
        filterTransactionsViewModel.publish($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-4  reason: not valid java name */
    public static final void m41039loadTransactions$lambda4(FilterTransactionsViewModel filterTransactionsViewModel, Throwable th) {
        List $r5;
        Log_OC.getArray(filterTransactionsViewModel, "this$0");
        C11680b $r2 = filterTransactionsViewModel.getToastMessage();
        ResourceDelegate $r3 = filterTransactionsViewModel.resourceDelegate;
        String $r4 = $r3.getString(C0001R.string.error_loading_transactions);
        $r2.mo331f($r4);
        Timber.wtf(th);
        int $i0 = filterTransactionsViewModel.getCurrentPage();
        if ($i0 == 0) {
            $r5 = C13726r.m3891e();
        } else {
            ViewData $r6 = filterTransactionsViewModel.getState();
            $r5 = ((TransactionsViewState) $r6).getTransactions();
        }
        ViewData $r62 = filterTransactionsViewModel.getState();
        TransactionsViewState $r7 = TransactionsViewState.copy$default((TransactionsViewState) $r62, false, false, false, false, false, $r5, null, 0, null, null, 985, null);
        filterTransactionsViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onLoadData$lambda-0  reason: not valid java name */
    public static final void m41040onLoadData$lambda0(FilterTransactionsViewModel filterTransactionsViewModel, FilteredDate filteredDate, TransactionHistoryScope transactionHistoryScope, User user) {
        Log_OC.getArray(filterTransactionsViewModel, "this$0");
        Log_OC.getArray(filteredDate, "$filteredDate");
        Log_OC.getArray(transactionHistoryScope, "$transactionHistoryScope");
        filterTransactionsViewModel.setUser(user);
        Date $r4 = filteredDate.getFrom();
        String $r5 = DateExtKt.convertDateToGivenFormat($r4, "yyyy-MM-dd HH:mm:ss");
        Date $r42 = filteredDate.getTo();
        String $r6 = DateExtKt.convertDateToGivenFormat($r42, "yyyy-MM-dd HH:mm:ss");
        loadTransactions$default(filterTransactionsViewModel, null, null, null, $r5, $r6, transactionHistoryScope, true, 7, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void onSearch$default(FilterTransactionsViewModel filterTransactionsViewModel, FilteredDate filteredDate, String $r5, String $r2, String $r3, TransactionHistoryScope transactionHistoryScope, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $r5 = "";
        }
        int $i12 = i & 4;
        if ($i12 != 0) {
            $r2 = "";
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r3 = "";
        }
        filterTransactionsViewModel.onSearch(filteredDate, $r5, $r2, $r3, transactionHistoryScope);
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
    public final void onLoadData(final FilteredDate filteredDate, final TransactionHistoryScope transactionHistoryScope) {
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
        Object object = new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FilterTransactionsViewModel $r1 = FilterTransactionsViewModel.this;
                FilteredDate $r2 = filteredDate;
                TransactionHistoryScope $r32 = transactionHistoryScope;
                User $r52 = (User) obj;
                FilterTransactionsViewModel.m41040onLoadData$lambda0($r1, $r2, $r32, $r52);
            }
        };
        Token $r8 = Token.FUNCTION;
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
        loadTransactions($r52, transactionHistoryScope);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onSearch(FilteredDate filteredDate, String str, String str2, String str3, TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(str, "transactionStatus");
        Log_OC.getArray(str2, "transactionType");
        Log_OC.getArray(str3, "searchKeyword");
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        Date $r6 = filteredDate.getFrom();
        String $r7 = DateExtKt.convertDateToGivenFormat($r6, "yyyy-MM-dd HH:mm:ss");
        Date $r62 = filteredDate.getTo();
        String $r8 = DateExtKt.convertDateToGivenFormat($r62, "yyyy-MM-dd HH:mm:ss");
        setCurrentPage(0);
        setAllPagesExhausted(false);
        Set $r9 = getExistingDays();
        $r9.clear();
        loadTransactions$default(this, str, str2, str3, $r7, $r8, transactionHistoryScope, false, 64, null);
    }
}
