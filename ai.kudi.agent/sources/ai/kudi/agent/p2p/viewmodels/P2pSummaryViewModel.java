package ai.kudi.agent.p2p.viewmodels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.data.domain.fht.TransactionResponse;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p2p.data.P2pData;
import ai.kudi.agent.transactions.domain.dto.Method;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: P2pSummaryViewModel.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/p2p/viewmodels/P2pSummaryViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/p2p/viewmodels/P2pSummaryViewData;", "submitRequest", "Lai/kudi/agent/transactions/domain/usecases/SubmitTransactionRequest;", "(Lai/kudi/agent/transactions/domain/usecases/SubmitTransactionRequest;)V", "fireP2pTransaction", "", "p2pData", "Lai/kudi/agent/p2p/data/P2pData;", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class P2pSummaryViewModel extends BaseViewModel<P2pSummaryViewData> {
    private final SubmitTransactionRequest submitRequest;

    public P2pSummaryViewModel(SubmitTransactionRequest submitTransactionRequest) {
        Log_OC.getArray(submitTransactionRequest, "submitRequest");
        this.submitRequest = submitTransactionRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fireP2pTransaction$lambda-0  reason: not valid java name */
    public static final void m40000fireP2pTransaction$lambda0(P2pSummaryViewModel p2pSummaryViewModel, TransactionResponse transactionResponse) {
        Log_OC.getArray(p2pSummaryViewModel, "this$0");
        ViewData $r2 = p2pSummaryViewModel.getState();
        P2pSummaryViewData $r3 = (P2pSummaryViewData) $r2;
        p2pSummaryViewModel.publish(P2pSummaryViewData.copy$default($r3, false, false, transactionResponse, null, 9, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fireP2pTransaction$lambda-1  reason: not valid java name */
    public static final void m40001fireP2pTransaction$lambda1(P2pSummaryViewModel p2pSummaryViewModel, Throwable th) {
        Log_OC.getArray(p2pSummaryViewModel, "this$0");
        ViewData $r2 = p2pSummaryViewModel.getState();
        P2pSummaryViewData $r3 = (P2pSummaryViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        p2pSummaryViewModel.publish(P2pSummaryViewData.copy$default($r3, false, false, null, (String) $r5, 5, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fireP2pTransaction(P2pData p2pData) {
        Log_OC.getArray(p2pData, "p2pData");
        ViewData $r2 = getState();
        P2pSummaryViewData $r3 = (P2pSummaryViewData) $r2;
        publish(P2pSummaryViewData.copy$default($r3, false, true, null, null, 5, null));
        SubmitTransactionRequest $r4 = this.submitRequest;
        String $r5 = p2pData.getPhoneNumber();
        Log_OC.append($r5);
        String $r6 = p2pData.getRemark();
        Integer $r7 = p2pData.getAmount();
        Log_OC.append($r7);
        int $i0 = $r7.intValue();
        String $r8 = p2pData.getPin();
        Log_OC.append($r8);
        Method.Companion $r9 = Method.Companion;
        Method $r10 = $r9.wallet();
        TransactionRequest $r11 = new TransactionRequest($r5, $r6, $i0, $r8, TransactionRequest.TYPE_PAYMENT, $r10, 0, 64, null);
        AbstractC11688p $r12 = $r4.execute($r11);
        FavoritesArrayAdapter $r15 = $r12.e0(new Object() { // from class: ai.kudi.agent.p2p.viewmodels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                P2pSummaryViewModel $r1 = P2pSummaryViewModel.this;
                TransactionResponse $r32 = (TransactionResponse) obj;
                P2pSummaryViewModel.m40000fireP2pTransaction$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.p2p.viewmodels.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                P2pSummaryViewModel $r1 = P2pSummaryViewModel.this;
                Throwable $r32 = (Throwable) obj;
                P2pSummaryViewModel.m40001fireP2pTransaction$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r15, "submitRequest.execute(\n            TransactionRequest(\n                target = p2pData.phoneNumber!!,\n                description = p2pData.remark,\n                amount = p2pData.amount!!,\n                type = TransactionRequest.TYPE_PAYMENT,\n                pin = p2pData.pin!!,\n                paymentMethod = Method.wallet()\n            )\n        ).subscribe(\n            {\n                publish(state.copy(isSending = false, transactionResponse = it))\n            },\n            {\n                publish(\n                    state.copy(\n                        isSending = false,\n                        error = parseHttpError2(\"Something went wrong\")(it)\n                    )\n                )\n            }\n        )");
        C11280b $r16 = getCompositeDisposable();
        RxExtKt.addTo($r15, $r16);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        P2pSummaryViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public P2pSummaryViewData initialData() {
        P2pSummaryViewData $r1 = new P2pSummaryViewData(false, false, null, null, 15, null);
        return $r1;
    }
}
