package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchIncompleteTransactionUseCaseInput;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchIncompleteTransactions;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator;
import ai.kudi.agent.transactionhistory.presentation.viewstate.IncompleteTransactionsViewState;
import ai.kudi.agent.transactions.domain.usecases.FetchTransactionRequest;
import ai.kudi.agent.transactions.domain.usecases.FetchTransactions;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: IncompleteTransactionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0!H\u0002J\u0016\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/presentation/IncompleteTransactionsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/IncompleteTransactionsViewState;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchTransactions", "Lai/kudi/agent/transactionhistory/domain/usecases/FetchIncompleteTransactions;", "transactionDataToUiMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "pref", "Lai/kudi/agent/core/util/Pref;", "incompleteTransactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/IncompleteTransactionsNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/transactionhistory/domain/usecases/FetchIncompleteTransactions;Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;Lai/kudi/agent/core/util/Pref;Lai/kudi/agent/transactionhistory/navigator/IncompleteTransactionsNavigator;)V", "currentPage", "", "existingDays", "", "", "filter", "Lai/kudi/agent/transactions/domain/usecases/FetchTransactionRequest;", "isAllPagesExhausted", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "initialData", "loadPendingTransactions", "", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "mapTransactions", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "transactionsData", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "onLoadData", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "onLoadMore", "onTransactionItemClicked", "transactionItemUiModel", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IncompleteTransactionsViewModel extends BaseViewModel<IncompleteTransactionsViewState> {
    private int currentPage;
    private final Set<String> existingDays;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchIncompleteTransactions fetchTransactions;
    private FetchTransactionRequest filter;
    private final IncompleteTransactionsNavigator incompleteTransactionsNavigator;
    private boolean isAllPagesExhausted;
    private final Pref pref;
    private final ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper;
    private final TransactionDataToUiMapper transactionDataToUiMapper;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IncompleteTransactionsViewModel(FetchCurrentUser fetchCurrentUser, FetchIncompleteTransactions fetchIncompleteTransactions, TransactionDataToUiMapper transactionDataToUiMapper, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, Pref pref, IncompleteTransactionsNavigator incompleteTransactionsNavigator) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(fetchIncompleteTransactions, "fetchTransactions");
        Log_OC.getArray(transactionDataToUiMapper, "transactionDataToUiMapper");
        Log_OC.getArray(serverTimeToTransactionDayMapper, "serverTimeToTransactionDayMapper");
        Log_OC.getArray(pref, "pref");
        Log_OC.getArray(incompleteTransactionsNavigator, "incompleteTransactionsNavigator");
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchTransactions = fetchIncompleteTransactions;
        this.transactionDataToUiMapper = transactionDataToUiMapper;
        this.serverTimeToTransactionDayMapper = serverTimeToTransactionDayMapper;
        this.pref = pref;
        this.incompleteTransactionsNavigator = incompleteTransactionsNavigator;
        LinkedHashSet $r7 = new LinkedHashSet();
        this.existingDays = $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadPendingTransactions(TransactionHistoryScope transactionHistoryScope) {
        FetchTransactionRequest $r2 = this.filter;
        if ($r2 == null) {
            Log_OC.LogError("filter");
            NullPointerException r14 = new NullPointerException("Null throw statement replaced by Soot");
            throw r14;
        }
        int $i0 = this.currentPage;
        String $r3 = transactionHistoryScope.scopeId();
        this.filter = FetchTransactionRequest.copy$default($r2, 0, $i0, null, null, null, null, null, $r3, 125, null);
        ViewData $r4 = getState();
        IncompleteTransactionsViewState incompleteTransactionsViewState = (IncompleteTransactionsViewState) $r4;
        int $i02 = this.currentPage;
        boolean z = $i02 == 0;
        int $i03 = this.currentPage;
        IncompleteTransactionsViewState $r5 = IncompleteTransactionsViewState.copy$default(incompleteTransactionsViewState, z, $i03 > 0, false, null, 8, null);
        publish($r5);
        C11280b $r6 = getCompositeDisposable();
        FetchIncompleteTransactions $r7 = this.fetchTransactions;
        User $r9 = this.user;
        if ($r9 == null) {
            Log_OC.LogError("user");
            NullPointerException r142 = new NullPointerException("Null throw statement replaced by Soot");
            throw r142;
        }
        FetchTransactionRequest $r22 = this.filter;
        if ($r22 == null) {
            Log_OC.LogError("filter");
            NullPointerException r143 = new NullPointerException("Null throw statement replaced by Soot");
            throw r143;
        }
        FetchIncompleteTransactionUseCaseInput $r8 = new FetchIncompleteTransactionUseCaseInput($r9, $r22);
        AbstractC11688p $r10 = $r7.execute($r8);
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IncompleteTransactionsViewModel $r1 = IncompleteTransactionsViewModel.this;
                List $r32 = (List) obj;
                IncompleteTransactionsViewModel.m41043loadPendingTransactions$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IncompleteTransactionsViewModel $r1 = IncompleteTransactionsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                IncompleteTransactionsViewModel.m41044loadPendingTransactions$lambda3($r1, $r32);
            }
        });
        $r6.b($r13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadPendingTransactions$lambda-2  reason: not valid java name */
    public static final void m41043loadPendingTransactions$lambda2(IncompleteTransactionsViewModel incompleteTransactionsViewModel, List list) {
        Log_OC.getArray(incompleteTransactionsViewModel, "this$0");
        Log_OC.loadImage(list, "it");
        List $r1 = incompleteTransactionsViewModel.mapTransactions(list);
        boolean $z0 = $r1.isEmpty();
        ViewData $r2 = incompleteTransactionsViewModel.getState();
        IncompleteTransactionsViewState $r3 = (IncompleteTransactionsViewState) $r2;
        incompleteTransactionsViewModel.publish($r3.copy(false, false, $z0, $r1));
        Pref $r4 = incompleteTransactionsViewModel.pref;
        $r4.setIncompleteTransactionCount(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadPendingTransactions$lambda-3  reason: not valid java name */
    public static final void m41044loadPendingTransactions$lambda3(IncompleteTransactionsViewModel incompleteTransactionsViewModel, Throwable th) {
        Log_OC.getArray(incompleteTransactionsViewModel, "this$0");
        Timber.reorder(th);
        ViewData $r2 = incompleteTransactionsViewModel.getState();
        IncompleteTransactionsViewState $r3 = (IncompleteTransactionsViewState) $r2;
        incompleteTransactionsViewModel.publish(IncompleteTransactionsViewState.copy$default($r3, false, false, false, null, 12, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0030 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List mapTransactions(java.util.List r31) {
        /*
            r30 = this;
            r0 = r30
            int r3 = r0.currentPage
            if (r3 != 0) goto L14
            r0 = r30
            java.util.Set<java.lang.String> r4 = r0.existingDays
            r4.clear()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = r5
            r5.<init>()
            goto L26
        L14:
            r0 = r30
            ai.kudi.agent.core.mvvm.ViewData r7 = r0.getState()
            r9 = r7
            ai.kudi.agent.transactionhistory.presentation.viewstate.IncompleteTransactionsViewState r9 = (ai.kudi.agent.transactionhistory.presentation.viewstate.IncompleteTransactionsViewState) r9
            r8 = r9
            java.util.List r10 = r8.getTransactions()
            java.util.List r6 = kotlin.p557z.C13722p.m3970D0(r10)
        L26:
            r0 = r31
            java.util.Iterator r11 = r0.iterator()
        L2c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L8f
            java.lang.Object r13 = r11.next()
            r15 = r13
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r15 = (ai.kudi.agent.transactionhistory.data.model.TransactionDataModel) r15
            r14 = r15
            r0 = r30
            ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper r0 = r0.serverTimeToTransactionDayMapper
            r16 = r0
            java.util.Date r17 = r14.getDate()
            r0 = r16
            r1 = r17
            java.lang.String r18 = r0.formatDate(r1)
            r0 = r30
            java.util.Set<java.lang.String> r4 = r0.existingDays
            r0 = r18
            boolean r12 = r4.contains(r0)
            if (r12 != 0) goto L77
            ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel$TransactionDate r19 = new ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel$TransactionDate
            r0 = r19
            r1 = r18
            r0.<init>(r1)
            r20 = r6
            java.util.List r20 = (java.util.List) r20
            r31 = r20
            r0 = r31
            r1 = r19
            r0.add(r1)
            r0 = r30
            java.util.Set<java.lang.String> r4 = r0.existingDays
            r0 = r18
            r4.add(r0)
        L77:
            r0 = r30
            ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper r0 = r0.transactionDataToUiMapper
            r21 = r0
            ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel$Transaction r22 = r0.getPlaylist(r14)
            r23 = r6
            java.util.List r23 = (java.util.List) r23
            r31 = r23
            r0 = r31
            r1 = r22
            r0.add(r1)
            goto L2c
        L8f:
            r24 = r6
            java.util.List r24 = (java.util.List) r24
            r31 = r24
            r0 = r31
            boolean r12 = r0.isEmpty()
            r0 = r30
            ai.kudi.agent.core.mvvm.ViewData r7 = r0.getState()
            r25 = r7
            ai.kudi.agent.transactionhistory.presentation.viewstate.IncompleteTransactionsViewState r25 = (ai.kudi.agent.transactionhistory.presentation.viewstate.IncompleteTransactionsViewState) r25
            r8 = r25
            r26 = r6
            java.util.List r26 = (java.util.List) r26
            r31 = r26
            r27 = 0
            r28 = 0
            r0 = r27
            r1 = r28
            r2 = r31
            ai.kudi.agent.transactionhistory.presentation.viewstate.IncompleteTransactionsViewState r8 = r8.copy(r0, r1, r12, r2)
            r0 = r30
            r0.publish(r8)
            r29 = r6
            java.util.List r29 = (java.util.List) r29
            r31 = r29
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.presentation.IncompleteTransactionsViewModel.mapTransactions(java.util.List):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLoadData$lambda-0  reason: not valid java name */
    public static final void m41045onLoadData$lambda0(IncompleteTransactionsViewModel incompleteTransactionsViewModel, TransactionHistoryScope transactionHistoryScope, User user) {
        Log_OC.getArray(incompleteTransactionsViewModel, "this$0");
        Log_OC.getArray(transactionHistoryScope, "$transactionHistoryScope");
        Log_OC.loadImage(user, "it");
        incompleteTransactionsViewModel.user = user;
        incompleteTransactionsViewModel.loadPendingTransactions(transactionHistoryScope);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        IncompleteTransactionsViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public IncompleteTransactionsViewState initialData() {
        IncompleteTransactionsViewState $r1 = new IncompleteTransactionsViewState(false, false, false, null, 15, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadData(FilteredDate filteredDate, final TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        Date $r3 = filteredDate.getFrom();
        String $r4 = DateExtKt.convertDateToGivenFormat($r3, "yyyy-MM-dd HH:mm:ss");
        Date $r32 = filteredDate.getTo();
        String $r5 = DateExtKt.convertDateToGivenFormat($r32, "yyyy-MM-dd HH:mm:ss");
        FetchTransactions.Companion $r7 = FetchTransactions.Companion;
        int $i0 = $r7.getPENDING();
        String $r8 = transactionHistoryScope.scopeId();
        FetchTransactionRequest $r6 = new FetchTransactionRequest($i0, 0, null, null, $r4, $r5, null, $r8, 76, null);
        this.filter = $r6;
        C11280b $r9 = getCompositeDisposable();
        FetchCurrentUser $r10 = this.fetchCurrentUser;
        AbstractC11696w $r11 = FetchCurrentUser.execute$default($r10, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IncompleteTransactionsViewModel $r1 = IncompleteTransactionsViewModel.this;
                TransactionHistoryScope $r2 = transactionHistoryScope;
                User $r42 = (User) obj;
                IncompleteTransactionsViewModel.m41045onLoadData$lambda0($r1, $r2, $r42);
            }
        };
        Function $r13 = Function.SUBTOTAL;
        FavoritesArrayAdapter $r14 = $r11.s(object, $r13);
        $r9.b($r14);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadMore(TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        boolean $z0 = this.isAllPagesExhausted;
        if ($z0) {
            return;
        }
        ViewData $r2 = getState();
        IncompleteTransactionsViewState $r3 = (IncompleteTransactionsViewState) $r2;
        boolean $z02 = $r3.isLoadingMore();
        if ($z02) {
            return;
        }
        ViewData $r22 = getState();
        IncompleteTransactionsViewState $r32 = (IncompleteTransactionsViewState) $r22;
        boolean $z03 = $r32.isLoadingTransactions();
        if ($z03) {
            return;
        }
        int $i0 = this.currentPage;
        this.currentPage = $i0 + 1;
        loadPendingTransactions(transactionHistoryScope);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onTransactionItemClicked(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "transactionItemUiModel");
        IncompleteTransactionsNavigator $r2 = this.incompleteTransactionsNavigator;
        $r2.onIncompleteTransactionDetails(transaction);
    }
}
