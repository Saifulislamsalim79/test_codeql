package ai.kudi.agent.pos.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import ai.kudi.agent.pos.presentation.mapper.PosOrderDataToUiMapper;
import ai.kudi.agent.pos.presentation.viewstate.PosOrderHistoryViewState;
import ai.kudi.agent.pos.usecases.GetPosRequestsHistoryRequest;
import ai.kudi.agent.pos.usecases.GetPosRequestsHistoryUseCase;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: PosOrderHistoryViewModel.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012H\u0002J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0002J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0012J\u001e\u0010(\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012J\u001e\u0010)\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/pos/presentation/PosOrderHistoryViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/pos/presentation/viewstate/PosOrderHistoryViewState;", "getPosRequestsHistoryUseCase", "Lai/kudi/agent/pos/usecases/GetPosRequestsHistoryUseCase;", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "posOrderDataToUiMapper", "Lai/kudi/agent/pos/presentation/mapper/PosOrderDataToUiMapper;", "terminalRequestNavigator", "Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/pos/usecases/GetPosRequestsHistoryUseCase;Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;Lai/kudi/agent/pos/presentation/mapper/PosOrderDataToUiMapper;Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;Lai/kudi/agent/core/util/ResourceDelegate;)V", "currentPage", "", "existingDays", "", "", "isAllPagesExhausted", "", "toastMessage", "Lio/reactivex/subjects/PublishSubject;", "getToastMessage", "()Lio/reactivex/subjects/PublishSubject;", "initialData", "loadOrderHistory", "", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "filterType", "Lai/kudi/agent/pos/ui/model/PosFilterType;", "phoneNumber", "mapPosOrders", "", "Lai/kudi/agent/pos/ui/model/PosOrderUiModel;", "walletActivities", "Lai/kudi/agent/pos/data/PosOrder;", "navigateToPosOrderDetails", "orderId", "onLoadData", "onLoadNext", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PosOrderHistoryViewModel extends BaseViewModel<PosOrderHistoryViewState> {
    private int currentPage;
    private final Set<String> existingDays;
    private final GetPosRequestsHistoryUseCase getPosRequestsHistoryUseCase;
    private boolean isAllPagesExhausted;
    private final PosOrderDataToUiMapper posOrderDataToUiMapper;
    private final ResourceDelegate resource;
    private final ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper;
    private final TerminalRequestNavigator terminalRequestNavigator;
    private final C11680b<String> toastMessage;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosOrderHistoryViewModel(GetPosRequestsHistoryUseCase getPosRequestsHistoryUseCase, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, PosOrderDataToUiMapper posOrderDataToUiMapper, TerminalRequestNavigator terminalRequestNavigator, ResourceDelegate resourceDelegate) {
        Log_OC.getArray(getPosRequestsHistoryUseCase, "getPosRequestsHistoryUseCase");
        Log_OC.getArray(serverTimeToTransactionDayMapper, "serverTimeToTransactionDayMapper");
        Log_OC.getArray(posOrderDataToUiMapper, "posOrderDataToUiMapper");
        Log_OC.getArray(terminalRequestNavigator, "terminalRequestNavigator");
        Log_OC.getArray(resourceDelegate, "resource");
        this.getPosRequestsHistoryUseCase = getPosRequestsHistoryUseCase;
        this.serverTimeToTransactionDayMapper = serverTimeToTransactionDayMapper;
        this.posOrderDataToUiMapper = posOrderDataToUiMapper;
        this.terminalRequestNavigator = terminalRequestNavigator;
        this.resource = resourceDelegate;
        LinkedHashSet $r7 = new LinkedHashSet();
        this.existingDays = $r7;
        C11680b $r4 = C11680b.m10564v0();
        Log_OC.loadImage($r4, "create()");
        this.toastMessage = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadOrderHistory(FilteredDate filteredDate, PosFilterType posFilterType, String str) {
        Date $r5 = filteredDate.getFrom();
        String $r6 = DateExtKt.convertDateToGivenFormat($r5, "yyyy-MM-dd");
        Date $r52 = filteredDate.getTo();
        String $r7 = DateExtKt.convertDateToGivenFormat($r52, "yyyy-MM-dd");
        int $i0 = this.currentPage;
        GetPosRequestsHistoryRequest $r4 = new GetPosRequestsHistoryRequest($r6, $r7, posFilterType, str, $i0);
        ViewData $r8 = getState();
        PosOrderHistoryViewState $r9 = (PosOrderHistoryViewState) $r8;
        int $i02 = this.currentPage;
        boolean z = $i02 == 0;
        int $i03 = this.currentPage;
        publish(PosOrderHistoryViewState.copy$default($r9, z, $i03 > 0, false, null, 8, null));
        GetPosRequestsHistoryUseCase $r10 = this.getPosRequestsHistoryUseCase;
        AbstractC11688p $r11 = $r10.execute($r4);
        FavoritesArrayAdapter $r14 = $r11.e0(new Object() { // from class: ai.kudi.agent.pos.presentation.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosOrderHistoryViewModel $r1 = PosOrderHistoryViewModel.this;
                List $r3 = (List) obj;
                PosOrderHistoryViewModel.m40033loadOrderHistory$lambda0($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.pos.presentation.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosOrderHistoryViewModel $r1 = PosOrderHistoryViewModel.this;
                Throwable $r3 = (Throwable) obj;
                PosOrderHistoryViewModel.m40034loadOrderHistory$lambda1($r1, $r3);
            }
        });
        Log_OC.loadImage($r14, "getPosRequestsHistoryUseCase.execute(request)\n            .subscribe(\n                {\n                    val orders = mapPosOrders(it)\n                    val state = state.copy(\n                        isLoadingOrders = false,\n                        isLoadingMore = false,\n                        showEmptyListView = orders.isEmpty(),\n                        orders = orders,\n                    )\n                    publish(state)\n                },\n                {\n                    publish(\n                        state.copy(\n                            isLoadingOrders = false,\n                            isLoadingMore = false,\n                        )\n                    )\n                    toastMessage.onNext(resource.getString(R.string.error_loading_orders_message))\n                    Timber.e(it)\n                }\n            )");
        C11280b $r15 = getCompositeDisposable();
        RxExtKt.addTo($r14, $r15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadOrderHistory$lambda-0  reason: not valid java name */
    public static final void m40033loadOrderHistory$lambda0(PosOrderHistoryViewModel posOrderHistoryViewModel, List list) {
        Log_OC.getArray(posOrderHistoryViewModel, "this$0");
        Log_OC.loadImage(list, "it");
        List $r1 = posOrderHistoryViewModel.mapPosOrders(list);
        ViewData $r2 = posOrderHistoryViewModel.getState();
        PosOrderHistoryViewState $r3 = (PosOrderHistoryViewState) $r2;
        boolean $z0 = $r1.isEmpty();
        posOrderHistoryViewModel.publish($r3.copy(false, false, $z0, $r1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadOrderHistory$lambda-1  reason: not valid java name */
    public static final void m40034loadOrderHistory$lambda1(PosOrderHistoryViewModel posOrderHistoryViewModel, Throwable th) {
        Log_OC.getArray(posOrderHistoryViewModel, "this$0");
        ViewData $r2 = posOrderHistoryViewModel.getState();
        PosOrderHistoryViewState $r3 = (PosOrderHistoryViewState) $r2;
        posOrderHistoryViewModel.publish(PosOrderHistoryViewState.copy$default($r3, false, false, false, null, 12, null));
        C11680b $r4 = posOrderHistoryViewModel.getToastMessage();
        ResourceDelegate $r5 = posOrderHistoryViewModel.resource;
        String $r6 = $r5.getString(C0001R.string.error_loading_orders_message);
        $r4.mo331f($r6);
        Timber.reorder(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0030 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List mapPosOrders(java.util.List r26) {
        /*
            r25 = this;
            r0 = r25
            int r2 = r0.currentPage
            if (r2 != 0) goto L14
            r0 = r25
            java.util.Set<java.lang.String> r3 = r0.existingDays
            r3.clear()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = r4
            r4.<init>()
            goto L26
        L14:
            r0 = r25
            ai.kudi.agent.core.mvvm.ViewData r6 = r0.getState()
            r8 = r6
            ai.kudi.agent.pos.presentation.viewstate.PosOrderHistoryViewState r8 = (ai.kudi.agent.pos.presentation.viewstate.PosOrderHistoryViewState) r8
            r7 = r8
            java.util.List r9 = r7.getOrders()
            java.util.List r5 = kotlin.p557z.C13722p.m3970D0(r9)
        L26:
            r0 = r26
            java.util.Iterator r10 = r0.iterator()
        L2c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L98
            java.lang.Object r12 = r10.next()
            r14 = r12
            ai.kudi.agent.pos.data.PosOrder r14 = (ai.kudi.agent.pos.data.PosOrder) r14
            r13 = r14
            java.lang.String r15 = r13.getTimeCreated()
            java.util.Date r16 = ai.kudi.agent.core.util.StringExtKt.formatKudiDateAlt5(r15)
            r0 = r25
            ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper r0 = r0.serverTimeToTransactionDayMapper
            r17 = r0
            r1 = r16
            java.lang.String r15 = r0.formatDate(r1)
            r0 = r25
            java.util.Set<java.lang.String> r3 = r0.existingDays
            boolean r11 = r3.contains(r15)
            if (r11 != 0) goto L73
            ai.kudi.agent.pos.ui.model.PosOrderUiModel$OrderDate r18 = new ai.kudi.agent.pos.ui.model.PosOrderUiModel$OrderDate
            r0 = r18
            r0.<init>(r15)
            r19 = r5
            java.util.List r19 = (java.util.List) r19
            r26 = r19
            r0 = r26
            r1 = r18
            r0.add(r1)
            r0 = r25
            java.util.Set<java.lang.String> r3 = r0.existingDays
            r3.add(r15)
        L73:
            r0 = r25
            ai.kudi.agent.pos.presentation.mapper.PosOrderDataToUiMapper r0 = r0.posOrderDataToUiMapper
            r20 = r0
            ai.kudi.agent.pos.presentation.mapper.PosOrderMapperInput r21 = new ai.kudi.agent.pos.presentation.mapper.PosOrderMapperInput
            r0 = r21
            r1 = r16
            r0.<init>(r13, r1)
            r0 = r20
            r1 = r21
            ai.kudi.agent.pos.ui.model.PosOrderUiModel$Order r22 = r0.getShares(r1)
            r23 = r5
            java.util.List r23 = (java.util.List) r23
            r26 = r23
            r0 = r26
            r1 = r22
            r0.add(r1)
            goto L2c
        L98:
            r24 = r5
            java.util.List r24 = (java.util.List) r24
            r26 = r24
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.presentation.PosOrderHistoryViewModel.mapPosOrders(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getToastMessage() {
        C11680b r1 = this.toastMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PosOrderHistoryViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PosOrderHistoryViewState initialData() {
        PosOrderHistoryViewState $r1 = new PosOrderHistoryViewState(false, false, false, null, 15, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToPosOrderDetails(String str) {
        Log_OC.getArray(str, "orderId");
        TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
        $r2.navigateToOrderDetailsFragment(str);
    }

    public final void onLoadData(FilteredDate filteredDate, PosFilterType posFilterType, String str) {
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(posFilterType, "filterType");
        Log_OC.getArray(str, "phoneNumber");
        this.currentPage = 0;
        this.isAllPagesExhausted = false;
        loadOrderHistory(filteredDate, posFilterType, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadNext(FilteredDate filteredDate, PosFilterType posFilterType, String str) {
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(posFilterType, "filterType");
        Log_OC.getArray(str, "phoneNumber");
        int $i0 = this.currentPage;
        this.currentPage = $i0 + 1;
        loadOrderHistory(filteredDate, posFilterType, str);
    }
}
