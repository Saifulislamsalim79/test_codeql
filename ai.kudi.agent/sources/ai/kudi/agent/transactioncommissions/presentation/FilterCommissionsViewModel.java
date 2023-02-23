package ai.kudi.agent.transactioncommissions.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactioncommissions.navigator.TransactionCommissionsNavigator;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.presentation.BaseTransactionsViewModel;
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
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: FilterCommissionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J&\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0018J\u0006\u0010&\u001a\u00020\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/presentation/FilterCommissionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/BaseTransactionsViewModel;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "transactionsNavigator", "Lai/kudi/agent/transactioncommissions/navigator/TransactionCommissionsNavigator;", "fetchWalletActivities", "Lai/kudi/agent/transactionhistory/domain/usecases/FetchWalletActivities;", "resourceDelegate", "Lai/kudi/agent/core/util/ResourceDelegate;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "transactionDataToUiMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/transactioncommissions/navigator/TransactionCommissionsNavigator;Lai/kudi/agent/transactionhistory/domain/usecases/FetchWalletActivities;Lai/kudi/agent/core/util/ResourceDelegate;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;)V", "initialData", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "loadTransactions", "", "newRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "commissionWalletId", "", "fromDate", "toDate", "filterType", "forceRefresh", "", "onCommissionItemClicked", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "onLoadData", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "walletId", "appVersionCode", "onLoadMore", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FilterCommissionsViewModel extends BaseTransactionsViewModel {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchWalletActivities fetchWalletActivities;
    private final ResourceDelegate resourceDelegate;
    private final TransactionCommissionsNavigator transactionsNavigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterCommissionsViewModel(FetchCurrentUser fetchCurrentUser, TransactionCommissionsNavigator transactionCommissionsNavigator, FetchWalletActivities fetchWalletActivities, ResourceDelegate resourceDelegate, Analytics analytics, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper) {
        super(serverTimeToTransactionDayMapper, transactionDataToUiMapper);
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(transactionCommissionsNavigator, "transactionsNavigator");
        Log_OC.getArray(fetchWalletActivities, "fetchWalletActivities");
        Log_OC.getArray(resourceDelegate, "resourceDelegate");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(serverTimeToTransactionDayMapper, "serverTimeToTransactionDayMapper");
        Log_OC.getArray(transactionDataToUiMapper, "transactionDataToUiMapper");
        this.fetchCurrentUser = fetchCurrentUser;
        this.transactionsNavigator = transactionCommissionsNavigator;
        this.fetchWalletActivities = fetchWalletActivities;
        this.resourceDelegate = resourceDelegate;
        this.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadTransactions(final FetchRequest fetchRequest) {
        ViewData $r2 = getState();
        TransactionsViewState $r3 = (TransactionsViewState) $r2;
        boolean $z0 = $r3.isLoadingTransactions();
        if ($z0) {
            return;
        }
        ViewData $r22 = getState();
        TransactionsViewState $r32 = (TransactionsViewState) $r22;
        boolean $z02 = $r32.isLoadingMore();
        if ($z02) {
            return;
        }
        boolean $z03 = isAllPagesExhausted();
        if ($z03) {
            return;
        }
        int $i0 = getCurrentPage();
        boolean $z04 = $i0 > 0;
        int $i02 = getCurrentPage();
        boolean z = $i02 == 0;
        ViewData $r23 = getState();
        TransactionsViewState $r33 = (TransactionsViewState) $r23;
        publish(TransactionsViewState.copy$default($r33, false, z, $z04, false, false, null, null, 0, null, null, 1009, null));
        FetchWalletActivities $r4 = this.fetchWalletActivities;
        User $r6 = getUser();
        GetWalletActivitiesRequest $r5 = new GetWalletActivitiesRequest($r6, fetchRequest, null, false, 12, null);
        AbstractC11688p $r7 = $r4.execute($r5);
        FavoritesArrayAdapter $r11 = $r7.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactioncommissions.presentation.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                FilterCommissionsViewModel $r1 = FilterCommissionsViewModel.this;
                List $r24 = (List) obj;
                return FilterCommissionsViewModel.m40954loadTransactions$lambda3($r1, $r24);
            }
        }).e0(new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.Point
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FilterCommissionsViewModel $r1 = FilterCommissionsViewModel.this;
                FetchRequest $r24 = fetchRequest;
                List $r42 = (List) obj;
                FilterCommissionsViewModel.m40955loadTransactions$lambda4($r1, $r24, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FilterCommissionsViewModel $r1 = FilterCommissionsViewModel.this;
                Throwable $r34 = (Throwable) obj;
                FilterCommissionsViewModel.m40956loadTransactions$lambda5($r1, $r34);
            }
        });
        C11280b $r12 = getCompositeDisposable();
        $r12.b($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadTransactions(String str, String str2, String str3, String str4, boolean z) {
        FetchRequest $r4 = new FetchRequest(null, 1, null);
        int $i0 = getCurrentPage();
        String $r6 = String.valueOf($i0);
        $r4.setPage($r6);
        $r4.setTo(str3);
        $r4.setFrom(str2);
        $r4.setWalletId(str);
        $r4.setType(str4);
        FetchRequest $r7 = getRequest();
        boolean $z1 = Log_OC.append($r7, $r4);
        if (!$z1 || z) {
            loadTransactions($r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void loadTransactions$default(FilterCommissionsViewModel filterCommissionsViewModel, String str, String $r4, String $r2, String $r3, boolean $z0, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $r4 = "";
        }
        int $i12 = i & 4;
        if ($i12 != 0) {
            $r2 = "";
        }
        int $i13 = i & 8;
        if ($i13 != 0) {
            $r3 = "";
        }
        int $i0 = i & 16;
        if ($i0 != 0) {
            $z0 = false;
        }
        filterCommissionsViewModel.loadTransactions(str, $r4, $r2, $r3, $z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-3  reason: not valid java name */
    public static final List m40954loadTransactions$lambda3(FilterCommissionsViewModel filterCommissionsViewModel, List list) {
        Log_OC.getArray(filterCommissionsViewModel, "this$0");
        Log_OC.getArray(list, "it");
        boolean $z0 = list.isEmpty();
        filterCommissionsViewModel.setAllPagesExhausted($z0);
        List $r0 = filterCommissionsViewModel.mapTransactionsData(list);
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-4  reason: not valid java name */
    public static final void m40955loadTransactions$lambda4(FilterCommissionsViewModel filterCommissionsViewModel, FetchRequest fetchRequest, List list) {
        Log_OC.getArray(filterCommissionsViewModel, "this$0");
        Log_OC.getArray(fetchRequest, "$newRequest");
        filterCommissionsViewModel.setRequest(fetchRequest);
        boolean $z0 = list.isEmpty();
        ViewData $r3 = filterCommissionsViewModel.getState();
        Log_OC.loadImage(list, "transactions");
        TransactionsViewState $r4 = TransactionsViewState.copy$default((TransactionsViewState) $r3, false, false, false, $z0, false, list, null, 0, null, null, 977, null);
        filterCommissionsViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-5  reason: not valid java name */
    public static final void m40956loadTransactions$lambda5(FilterCommissionsViewModel filterCommissionsViewModel, Throwable th) {
        List $r5;
        Log_OC.getArray(filterCommissionsViewModel, "this$0");
        C11680b $r2 = filterCommissionsViewModel.getToastMessage();
        ResourceDelegate $r3 = filterCommissionsViewModel.resourceDelegate;
        String $r4 = $r3.getString(C0001R.string.error_loading_transactions);
        $r2.mo331f($r4);
        Timber.reorder(th);
        int $i0 = filterCommissionsViewModel.getCurrentPage();
        if ($i0 == 0) {
            $r5 = C13726r.m3891e();
        } else {
            ViewData $r6 = filterCommissionsViewModel.getState();
            $r5 = ((TransactionsViewState) $r6).getTransactions();
        }
        ViewData $r62 = filterCommissionsViewModel.getState();
        TransactionsViewState $r7 = TransactionsViewState.copy$default((TransactionsViewState) $r62, false, false, false, false, false, $r5, null, 0, null, null, 985, null);
        filterCommissionsViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onLoadData$lambda-0  reason: not valid java name */
    public static final void m40957onLoadData$lambda0(FilterCommissionsViewModel filterCommissionsViewModel, FilteredDate filteredDate, String str, String str2, User user) {
        Log_OC.getArray(filterCommissionsViewModel, "this$0");
        Log_OC.getArray(filteredDate, "$filteredDate");
        Log_OC.getArray(str, "$walletId");
        Log_OC.getArray(str2, "$filterType");
        filterCommissionsViewModel.setUser(user);
        Date $r5 = filteredDate.getFrom();
        String $r6 = DateExtKt.convertDateToGivenFormat($r5, "yyyy-MM-dd HH:mm:ss");
        Date $r52 = filteredDate.getTo();
        String $r7 = DateExtKt.convertDateToGivenFormat($r52, "yyyy-MM-dd HH:mm:ss");
        filterCommissionsViewModel.loadTransactions(str, $r6, $r7, str2, true);
        Analytics $r8 = filterCommissionsViewModel.analytics;
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        String $r3 = "From: " + $r6 + ", To: " + $r7;
        $r8.onFilterCommissions($r2, $r3);
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
        TransactionsViewState $r1 = new TransactionsViewState(false, false, false, false, true, null, null, 0, null, null, 1007, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCommissionItemClicked(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "transaction");
        TransactionCommissionsNavigator $r2 = this.transactionsNavigator;
        $r2.onTransactionCommissionDetails(transaction);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadData(final FilteredDate filteredDate, final String str, final String str2, String str3) {
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(str, "filterType");
        Log_OC.getArray(str2, "walletId");
        Log_OC.getArray(str3, "appVersionCode");
        setFilteredDate(filteredDate);
        setCurrentPage(0);
        setAllPagesExhausted(false);
        Set $r5 = getExistingDays();
        $r5.clear();
        C11280b $r6 = getCompositeDisposable();
        FetchCurrentUser $r7 = this.fetchCurrentUser;
        AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FilterCommissionsViewModel $r1 = FilterCommissionsViewModel.this;
                FilteredDate $r2 = filteredDate;
                String $r3 = str2;
                String $r4 = str;
                User $r62 = (User) obj;
                FilterCommissionsViewModel.m40957onLoadData$lambda0($r1, $r2, $r3, $r4, $r62);
            }
        };
        Token $r10 = Token.FUNCTION;
        FavoritesArrayAdapter $r11 = $r8.s(object, $r10);
        $r6.b($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadMore() {
        User $r1 = getUser();
        if ($r1 == null) {
            return;
        }
        int $i0 = getCurrentPage();
        setCurrentPage($i0 + 1);
        FetchRequest $r2 = getRequest();
        int $i02 = getCurrentPage();
        String $r3 = String.valueOf($i02);
        $r2.setPage($r3);
        FetchRequest $r22 = getRequest();
        loadTransactions($r22);
    }
}
