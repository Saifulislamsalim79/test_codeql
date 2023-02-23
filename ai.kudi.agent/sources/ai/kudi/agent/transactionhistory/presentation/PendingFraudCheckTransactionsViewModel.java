package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletTransactions;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.domain.usecases.GetTransactionHistoryUseCase;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.navigator.PendingTransactionsNavigator;
import ai.kudi.agent.transactionhistory.presentation.viewstate.PendingFraudCheckTransactionsViewState;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
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
/* compiled from: PendingFraudCheckTransactionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0#H\u0002J\u0016\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010 \u001a\u00020!J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000¨\u0006."}, m10421d2 = {"Lai/kudi/agent/transactionhistory/presentation/PendingFraudCheckTransactionsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/PendingFraudCheckTransactionsViewState;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getTransactionHistoryUseCase", "Lai/kudi/agent/transactionhistory/domain/usecases/GetTransactionHistoryUseCase;", "fetchOutletTransactions", "Lai/kudi/agent/outlet_mgt/useCases/FetchOutletTransactions;", "transactionDataToUiMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "pref", "Lai/kudi/agent/core/util/Pref;", "incompleteTransactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/PendingTransactionsNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/transactionhistory/domain/usecases/GetTransactionHistoryUseCase;Lai/kudi/agent/outlet_mgt/useCases/FetchOutletTransactions;Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;Lai/kudi/agent/core/util/Pref;Lai/kudi/agent/transactionhistory/navigator/PendingTransactionsNavigator;)V", "currentPage", "", "existingDays", "", "", "filter", "Lai/kudi/agent/transactions/domain/usecases/FetchTransactionRequest;", "isAllPagesExhausted", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "initialData", "loadPendingFraudCheckTransactions", "", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "mapTransactions", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "transactionsData", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "onLoadData", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "onLoadMore", "onTransactionItemClicked", "transactionItemUiModel", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PendingFraudCheckTransactionsViewModel extends BaseViewModel<PendingFraudCheckTransactionsViewState> {
    private int currentPage;
    private final Set<String> existingDays;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchOutletTransactions fetchOutletTransactions;
    private FetchTransactionRequest filter;
    private final GetTransactionHistoryUseCase getTransactionHistoryUseCase;
    private final PendingTransactionsNavigator incompleteTransactionsNavigator;
    private boolean isAllPagesExhausted;
    private final Pref pref;
    private final ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper;
    private final TransactionDataToUiMapper transactionDataToUiMapper;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingFraudCheckTransactionsViewModel(FetchCurrentUser fetchCurrentUser, GetTransactionHistoryUseCase getTransactionHistoryUseCase, FetchOutletTransactions fetchOutletTransactions, TransactionDataToUiMapper transactionDataToUiMapper, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, Pref pref, PendingTransactionsNavigator pendingTransactionsNavigator) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(getTransactionHistoryUseCase, "getTransactionHistoryUseCase");
        Log_OC.getArray(fetchOutletTransactions, "fetchOutletTransactions");
        Log_OC.getArray(transactionDataToUiMapper, "transactionDataToUiMapper");
        Log_OC.getArray(serverTimeToTransactionDayMapper, "serverTimeToTransactionDayMapper");
        Log_OC.getArray(pref, "pref");
        Log_OC.getArray(pendingTransactionsNavigator, "incompleteTransactionsNavigator");
        this.fetchCurrentUser = fetchCurrentUser;
        this.getTransactionHistoryUseCase = getTransactionHistoryUseCase;
        this.fetchOutletTransactions = fetchOutletTransactions;
        this.transactionDataToUiMapper = transactionDataToUiMapper;
        this.serverTimeToTransactionDayMapper = serverTimeToTransactionDayMapper;
        this.pref = pref;
        this.incompleteTransactionsNavigator = pendingTransactionsNavigator;
        LinkedHashSet $r8 = new LinkedHashSet();
        this.existingDays = $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadPendingFraudCheckTransactions(TransactionHistoryScope transactionHistoryScope) {
        AbstractC11688p $r10;
        ViewData $r2 = getState();
        PendingFraudCheckTransactionsViewState $r3 = (PendingFraudCheckTransactionsViewState) $r2;
        int $i0 = this.currentPage;
        boolean $z0 = $i0 == 0;
        int $i02 = this.currentPage;
        boolean $z1 = $i02 > 0;
        publish(PendingFraudCheckTransactionsViewState.copy$default($r3, $z0, $z1, false, null, 8, null));
        FetchRequest $r4 = new FetchRequest(null, 1, null);
        FetchTransactionRequest $r5 = this.filter;
        if ($r5 == null) {
            Log_OC.LogError("filter");
            NullPointerException r17 = new NullPointerException("Null throw statement replaced by Soot");
            throw r17;
        }
        int $i03 = $r5.getPage();
        String $r6 = String.valueOf($i03);
        $r4.setPage($r6);
        FetchTransactionRequest $r52 = this.filter;
        if ($r52 == null) {
            Log_OC.LogError("filter");
            NullPointerException r172 = new NullPointerException("Null throw statement replaced by Soot");
            throw r172;
        }
        String $r62 = $r52.getStatus();
        $r4.setStatus($r62);
        FetchTransactionRequest $r53 = this.filter;
        if ($r53 == null) {
            Log_OC.LogError("filter");
            NullPointerException r173 = new NullPointerException("Null throw statement replaced by Soot");
            throw r173;
        }
        String $r63 = $r53.getFrom();
        $r4.setFrom($r63);
        FetchTransactionRequest $r54 = this.filter;
        if ($r54 == null) {
            Log_OC.LogError("filter");
            NullPointerException r174 = new NullPointerException("Null throw statement replaced by Soot");
            throw r174;
        }
        String $r64 = $r54.getTo();
        $r4.setTo($r64);
        FetchTransactionRequest $r55 = this.filter;
        if ($r55 == null) {
            Log_OC.LogError("filter");
            NullPointerException r175 = new NullPointerException("Null throw statement replaced by Soot");
            throw r175;
        }
        String $r65 = $r55.getType();
        $r4.setType($r65);
        FetchTransactionRequest $r56 = this.filter;
        if ($r56 == null) {
            Log_OC.LogError("filter");
            NullPointerException r176 = new NullPointerException("Null throw statement replaced by Soot");
            throw r176;
        }
        String $r66 = $r56.getLimit();
        $r4.setLimit($r66);
        boolean $z02 = transactionHistoryScope instanceof TransactionHistoryScope.OutletTransactions;
        if ($z02) {
            FetchOutletTransactions $r7 = this.fetchOutletTransactions;
            User $r9 = this.user;
            if ($r9 == null) {
                Log_OC.LogError("user");
                NullPointerException r177 = new NullPointerException("Null throw statement replaced by Soot");
                throw r177;
            }
            String $r67 = transactionHistoryScope.scopeId();
            GetOutletWalletActivitiesRequest $r8 = new GetOutletWalletActivitiesRequest($r9, $r67, $r4);
            $r10 = $r7.execute($r8);
        } else {
            GetTransactionHistoryUseCase $r11 = this.getTransactionHistoryUseCase;
            User $r92 = this.user;
            if ($r92 == null) {
                Log_OC.LogError("user");
                NullPointerException r178 = new NullPointerException("Null throw statement replaced by Soot");
                throw r178;
            }
            GetWalletActivitiesRequest $r12 = new GetWalletActivitiesRequest($r92, $r4, null, false, 12, null);
            $r10 = $r11.execute($r12);
        }
        C11280b $r13 = getCompositeDisposable();
        FavoritesArrayAdapter $r16 = $r10.e0(new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PendingFraudCheckTransactionsViewModel $r1 = PendingFraudCheckTransactionsViewModel.this;
                List $r32 = (List) obj;
                PendingFraudCheckTransactionsViewModel.m41048loadPendingFraudCheckTransactions$lambda3($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PendingFraudCheckTransactionsViewModel $r1 = PendingFraudCheckTransactionsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PendingFraudCheckTransactionsViewModel.m41049loadPendingFraudCheckTransactions$lambda4($r1, $r32);
            }
        });
        $r13.b($r16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadPendingFraudCheckTransactions$lambda-3  reason: not valid java name */
    public static final void m41048loadPendingFraudCheckTransactions$lambda3(PendingFraudCheckTransactionsViewModel pendingFraudCheckTransactionsViewModel, List list) {
        Log_OC.getArray(pendingFraudCheckTransactionsViewModel, "this$0");
        Log_OC.loadImage(list, "it");
        List $r1 = pendingFraudCheckTransactionsViewModel.mapTransactions(list);
        boolean $z0 = $r1.isEmpty();
        ViewData $r2 = pendingFraudCheckTransactionsViewModel.getState();
        PendingFraudCheckTransactionsViewState $r3 = (PendingFraudCheckTransactionsViewState) $r2;
        pendingFraudCheckTransactionsViewModel.publish($r3.copy(false, false, $z0, $r1));
        Pref $r4 = pendingFraudCheckTransactionsViewModel.pref;
        $r4.setIncompleteTransactionCount(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadPendingFraudCheckTransactions$lambda-4  reason: not valid java name */
    public static final void m41049loadPendingFraudCheckTransactions$lambda4(PendingFraudCheckTransactionsViewModel pendingFraudCheckTransactionsViewModel, Throwable th) {
        Log_OC.getArray(pendingFraudCheckTransactionsViewModel, "this$0");
        Timber.reorder(th);
        ViewData $r2 = pendingFraudCheckTransactionsViewModel.getState();
        PendingFraudCheckTransactionsViewState $r3 = (PendingFraudCheckTransactionsViewState) $r2;
        pendingFraudCheckTransactionsViewModel.publish(PendingFraudCheckTransactionsViewState.copy$default($r3, false, false, false, null, 12, null));
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
            ai.kudi.agent.transactionhistory.presentation.viewstate.PendingFraudCheckTransactionsViewState r9 = (ai.kudi.agent.transactionhistory.presentation.viewstate.PendingFraudCheckTransactionsViewState) r9
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
            ai.kudi.agent.transactionhistory.presentation.viewstate.PendingFraudCheckTransactionsViewState r25 = (ai.kudi.agent.transactionhistory.presentation.viewstate.PendingFraudCheckTransactionsViewState) r25
            r8 = r25
            r26 = r6
            java.util.List r26 = (java.util.List) r26
            r31 = r26
            r27 = 0
            r28 = 0
            r0 = r27
            r1 = r28
            r2 = r31
            ai.kudi.agent.transactionhistory.presentation.viewstate.PendingFraudCheckTransactionsViewState r8 = r8.copy(r0, r1, r12, r2)
            r0 = r30
            r0.publish(r8)
            r29 = r6
            java.util.List r29 = (java.util.List) r29
            r31 = r29
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.presentation.PendingFraudCheckTransactionsViewModel.mapTransactions(java.util.List):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLoadData$lambda-0  reason: not valid java name */
    public static final void m41050onLoadData$lambda0(PendingFraudCheckTransactionsViewModel pendingFraudCheckTransactionsViewModel, TransactionHistoryScope transactionHistoryScope, User user) {
        Log_OC.getArray(pendingFraudCheckTransactionsViewModel, "this$0");
        Log_OC.getArray(transactionHistoryScope, "$transactionHistoryScope");
        Log_OC.loadImage(user, "it");
        pendingFraudCheckTransactionsViewModel.user = user;
        pendingFraudCheckTransactionsViewModel.loadPendingFraudCheckTransactions(transactionHistoryScope);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PendingFraudCheckTransactionsViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PendingFraudCheckTransactionsViewState initialData() {
        PendingFraudCheckTransactionsViewState $r1 = new PendingFraudCheckTransactionsViewState(false, false, false, null, 15, null);
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
        FetchTransactions.Companion $r6 = FetchTransactions.Companion;
        int $i0 = $r6.getPENDING();
        FetchTransactionRequest $r7 = new FetchTransactionRequest($i0, 0, null, "PENDING_FRAUD_CHECK", $r4, $r5, null, null, 196, null);
        this.filter = $r7;
        C11280b $r8 = getCompositeDisposable();
        FetchCurrentUser $r9 = this.fetchCurrentUser;
        AbstractC11696w $r10 = FetchCurrentUser.execute$default($r9, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactionhistory.presentation.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PendingFraudCheckTransactionsViewModel $r1 = PendingFraudCheckTransactionsViewModel.this;
                TransactionHistoryScope $r2 = transactionHistoryScope;
                User $r42 = (User) obj;
                PendingFraudCheckTransactionsViewModel.m41050onLoadData$lambda0($r1, $r2, $r42);
            }
        };
        Chunk $r12 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r13 = $r10.s(object, $r12);
        $r8.b($r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadMore(TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        boolean $z0 = this.isAllPagesExhausted;
        if (!$z0) {
            ViewData $r3 = getState();
            PendingFraudCheckTransactionsViewState $r4 = (PendingFraudCheckTransactionsViewState) $r3;
            boolean $z02 = $r4.isLoadingMore();
            if (!$z02) {
                ViewData $r32 = getState();
                PendingFraudCheckTransactionsViewState $r42 = (PendingFraudCheckTransactionsViewState) $r32;
                boolean $z03 = $r42.isLoadingTransactions();
                if (!$z03) {
                    int $i0 = this.currentPage;
                    this.currentPage = $i0 + 1;
                    loadPendingFraudCheckTransactions(transactionHistoryScope);
                }
            }
        }
        FetchTransactionRequest $r1 = this.filter;
        if ($r1 != null) {
            int $i02 = this.currentPage;
            this.filter = FetchTransactionRequest.copy$default($r1, 0, $i02, null, null, null, null, null, null, 253, null);
            return;
        }
        Log_OC.LogError("filter");
        NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
        throw r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onTransactionItemClicked(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "transactionItemUiModel");
        PendingTransactionsNavigator $r2 = this.incompleteTransactionsNavigator;
        $r2.onPendingTransactionDetails(transaction);
    }
}
