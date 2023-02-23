package ai.kudi.agent.bills.viewmodels;

import ai.kudi.agent.bills.domain.usecases.BillResponse;
import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.bills.domain.usecases.SubmitBillRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitTransferRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitWithdrawalRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitWithdrawalUpdate;
import ai.kudi.agent.bills.domain.usecases.WithdrawalUpdateRequest;
import ai.kudi.agent.bills.domain.wiki.BillRequest;
import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.bills.viewmodels.viewdata.PaymentViewData;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.kshock.data.domain.fht.TransactionResponse;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import ai.kudi.agent.payments.domain.wiki.PaymentVendors;
import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.domain.usecases.FetchTransaction;
import ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.TransferRequest;
import ai.kudi.agent.users.domain.package_1.TransferResponse;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankResponse;
import ai.kudi.agent.users.domain.usecases.TransferToBank;
import ai.kudi.agent.users.navigators.WebViewNavigator;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalResponse;
import android.util.Log;
import com.hwangjr.rxbus.Bus;
import com.hwangjr.rxbus.RxBus;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11678a;
import p590o.p591a.Timber;
/* compiled from: PerformPaymentViewModel.kt */
@Metadata(m10422d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020 0$2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u0002H\u0016J \u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001eH\u0002J\u0012\u0010/\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u00010'H\u0002J \u00101\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0002J\b\u00102\u001a\u00020 H\u0014J\u001a\u00103\u001a\u00020 2\u0006\u00104\u001a\u0002052\b\b\u0002\u00100\u001a\u00020'H\u0002J\u0010\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020'H\u0002J\b\u00108\u001a\u00020 H\u0002J\u0010\u00109\u001a\u00020 2\u0006\u00107\u001a\u00020'H\u0002J \u00109\u001a\u00020 2\u0006\u00107\u001a\u00020'2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020'H\u0002J\u0014\u0010=\u001a\u00020 2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010?\u001a\u00020 2\b\b\u0002\u00107\u001a\u00020'H\u0002J\u000e\u0010@\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0015J\u000e\u0010@\u001a\u00020 2\u0006\u0010*\u001a\u00020AJ\u000e\u0010@\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001aJ\u000e\u0010@\u001a\u00020 2\u0006\u0010B\u001a\u00020CJ\u0016\u0010@\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-J\u0018\u0010@\u001a\u00020 2\u0006\u0010D\u001a\u00020;2\b\u0010E\u001a\u0004\u0018\u00010'J\u0012\u0010F\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010G\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010\u000b\u001a\u00020 2\u0006\u0010*\u001a\u00020\u001cH\u0002J\u0010\u0010H\u001a\u00020 2\u0006\u00107\u001a\u00020IH\u0007R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m10421d2 = {"Lai/kudi/agent/bills/viewmodels/PerformPaymentViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/bills/viewmodels/viewdata/PaymentViewData;", "submitRequest", "Lai/kudi/agent/bills/domain/usecases/SubmitBillRequest;", "submitTransactionRequest", "Lai/kudi/agent/transactions/domain/usecases/SubmitTransactionRequest;", "submitTransferRequest", "Lai/kudi/agent/bills/domain/usecases/SubmitTransferRequest;", "submitWithdrawalRequest", "Lai/kudi/agent/bills/domain/usecases/SubmitWithdrawalRequest;", "submitWithdrawalUpdate", "Lai/kudi/agent/bills/domain/usecases/SubmitWithdrawalUpdate;", "transferToBank", "Lai/kudi/agent/users/domain/usecases/TransferToBank;", "feeLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "fetchTransaction", "Lai/kudi/agent/transactions/domain/usecases/FetchTransaction;", "(Lai/kudi/agent/bills/domain/usecases/SubmitBillRequest;Lai/kudi/agent/transactions/domain/usecases/SubmitTransactionRequest;Lai/kudi/agent/bills/domain/usecases/SubmitTransferRequest;Lai/kudi/agent/bills/domain/usecases/SubmitWithdrawalRequest;Lai/kudi/agent/bills/domain/usecases/SubmitWithdrawalUpdate;Lai/kudi/agent/users/domain/usecases/TransferToBank;Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;Lai/kudi/agent/transactions/domain/usecases/FetchTransaction;)V", "billRequest", "Lai/kudi/agent/bills/domain/dto/BillRequest;", "currentState", "requeryDisposable", "Lio/reactivex/disposables/Disposable;", "transferRequest", "Lai/kudi/agent/users/domain/dto/TransferRequest;", "withdrawalRequest", "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "withdrawalResponse", "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalResponse;", "completeRequest", "", "mpos", "Lai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;", "handleRequestError", "Lkotlin/Function1;", "", "genericResponse", "", "initialData", "initiateDebitCardPayment", TransactionRequest.TYPE_REQUEST, "response", "webViewNavigator", "Lai/kudi/agent/users/navigators/WebViewNavigator;", "initiatePaypadPayment", "initiateRequery", "reference", "initiateWithdrawalPayment", "onCleared", "publishOpenMPOS", TransactionField.AMOUNT, "", "publishPaymentFailed", MetricTracker.Object.MESSAGE, "publishPaymentPending", "publishPaymentSuccessful", "shouldOverride", "", "overrideTitle", "publishState", SendReceiptToTerminalConfirmationBottomSheet.STATE, "showPaymentSuccess", OpsMetricTracker.START, "Lai/kudi/agent/transactions/domain/dto/TransactionRequest;", "withdrawToBankRequest", "Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;", "isSuccessful", "reason", "submitBillingRequest", "submitWithdrawal", "updateViewWithIncomingMessage", "Lai/kudi/agent/transactions/domain/dto/IncomingMessage;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PerformPaymentViewModel extends BaseViewModel<PaymentViewData> {
    private BillRequest billRequest;
    private PaymentViewData currentState;
    private final PerformServiceFeeLookup feeLookup;
    private final FetchTransaction fetchTransaction;
    private FavoritesArrayAdapter requeryDisposable;
    private final SubmitBillRequest submitRequest;
    private final SubmitTransactionRequest submitTransactionRequest;
    private final SubmitTransferRequest submitTransferRequest;
    private final SubmitWithdrawalRequest submitWithdrawalRequest;
    private final SubmitWithdrawalUpdate submitWithdrawalUpdate;
    private TransferRequest transferRequest;
    private final TransferToBank transferToBank;
    private WithdrawalRequest withdrawalRequest;
    private WithdrawalResponse withdrawalResponse;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PerformPaymentViewModel(SubmitBillRequest submitBillRequest, SubmitTransactionRequest submitTransactionRequest, SubmitTransferRequest submitTransferRequest, SubmitWithdrawalRequest submitWithdrawalRequest, SubmitWithdrawalUpdate submitWithdrawalUpdate, TransferToBank transferToBank, PerformServiceFeeLookup performServiceFeeLookup, FetchTransaction fetchTransaction) {
        Log_OC.getArray(submitBillRequest, "submitRequest");
        Log_OC.getArray(submitTransactionRequest, "submitTransactionRequest");
        Log_OC.getArray(submitTransferRequest, "submitTransferRequest");
        Log_OC.getArray(submitWithdrawalRequest, "submitWithdrawalRequest");
        Log_OC.getArray(submitWithdrawalUpdate, "submitWithdrawalUpdate");
        Log_OC.getArray(transferToBank, "transferToBank");
        Log_OC.getArray(performServiceFeeLookup, "feeLookup");
        Log_OC.getArray(fetchTransaction, "fetchTransaction");
        this.submitRequest = submitBillRequest;
        this.submitTransactionRequest = submitTransactionRequest;
        this.submitTransferRequest = submitTransferRequest;
        this.submitWithdrawalRequest = submitWithdrawalRequest;
        this.submitWithdrawalUpdate = submitWithdrawalUpdate;
        this.transferToBank = transferToBank;
        this.feeLookup = performServiceFeeLookup;
        this.fetchTransaction = fetchTransaction;
        PaymentViewData $r9 = initialData();
        this.currentState = $r9;
        Bus $r10 = RxBus.getBus();
        $r10.register(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final InterfaceC11767l handleRequestError(String str) {
        PerformPaymentViewModel$handleRequestError$1 $r2 = new PerformPaymentViewModel$handleRequestError$1(this, str);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initiateDebitCardPayment(WithdrawalRequest withdrawalRequest, WithdrawalResponse withdrawalResponse, WebViewNavigator webViewNavigator) {
        boolean $z1;
        Log.d("PerformPayment", "Initiating Debit Card Payment");
        String $r4 = withdrawalResponse.getRedirectUrl();
        boolean $z0 = false;
        if ($r4 != null) {
            $z1 = C13276s.m5440u($r4);
            if (!$z1) {
                $z0 = true;
            }
        }
        if ($z0) {
            webViewNavigator.navigate(withdrawalResponse.getRedirectUrl());
        } else {
            publishPaymentFailed("Something went wrong. Try debit card withdrawal later.");
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initiatePaypadPayment(final WithdrawalRequest withdrawalRequest, WithdrawalResponse withdrawalResponse) {
        final String $r4 = withdrawalResponse.getReference();
        MPOSPaymentMethod $r5 = withdrawalRequest.getMposPaymentMethod();
        boolean $z0 = $r5.isRequired();
        if ($z0) {
            boolean $z02 = withdrawalRequest.getServiceFeeIncluded();
            if (!$z02) {
                int $i0 = withdrawalRequest.getAmount();
                publishOpenMPOS($i0, $r4);
                return;
            }
            PerformServiceFeeLookup $r6 = this.feeLookup;
            int $i02 = withdrawalRequest.getAmount();
            String $r7 = String.valueOf($i02);
            FeesLookupRequest $r1 = new FeesLookupRequest(TransactionBreakDownItemType.WITHDRAWAL, $r7, null, 4, null);
            AbstractC11688p $r8 = $r6.execute($r1);
            FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.bills.viewmodels.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PerformPaymentViewModel $r12 = PerformPaymentViewModel.this;
                    WithdrawalRequest $r2 = withdrawalRequest;
                    String $r3 = $r4;
                    FeesLookupResponse $r52 = (FeesLookupResponse) obj;
                    PerformPaymentViewModel.m39107initiatePaypadPayment$lambda21($r12, $r2, $r3, $r52);
                }
            }, new Object() { // from class: ai.kudi.agent.bills.viewmodels.FromMatchesFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PerformPaymentViewModel $r12 = PerformPaymentViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    PerformPaymentViewModel.m39108initiatePaypadPayment$lambda22($r12, $r3);
                }
            });
            Log_OC.loadImage($r11, "feeLookup.execute(FeesLookupRequest(\"withdrawal\", request.amount.toString()))\n                    .subscribe(\n                        {\n                            publishOpenMPOS(request.amount + it.serviceFee.toInt(), reference)\n                        },\n                        {\n                            publishPaymentFailed(\"Sorry, we couldn't lookup the fee. \" + \"Please go back and perform the request again.\")\n                        }\n                    )");
            C11280b $r12 = getCompositeDisposable();
            RxExtKt.addTo($r11, $r12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: initiatePaypadPayment$lambda-21  reason: not valid java name */
    public static final void m39107initiatePaypadPayment$lambda21(PerformPaymentViewModel performPaymentViewModel, WithdrawalRequest withdrawalRequest, String str, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        Log_OC.getArray(withdrawalRequest, "$request");
        Log_OC.getArray(str, "$reference");
        int $i0 = withdrawalRequest.getAmount();
        String $r4 = feesLookupResponse.getServiceFee();
        int $i1 = Integer.parseInt($r4);
        performPaymentViewModel.publishOpenMPOS($i0 + $i1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initiatePaypadPayment$lambda-22  reason: not valid java name */
    public static final void m39108initiatePaypadPayment$lambda22(PerformPaymentViewModel performPaymentViewModel, Throwable th) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        performPaymentViewModel.publishPaymentFailed("Sorry, we couldn't lookup the fee. Please go back and perform the request again.");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initiateRequery(String str) {
        if (str == null) {
            return;
        }
        final AtomicBoolean $r2 = new AtomicBoolean(false);
        FavoritesArrayAdapter $r3 = this.requeryDisposable;
        if ($r3 != null) {
            $r3.backup();
        }
        FetchTransaction $r4 = this.fetchTransaction;
        AbstractC11688p $r5 = $r4.execute(str);
        AbstractC11688p $r52 = $r5.m10524V(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.viewmodels.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AtomicBoolean $r1 = $r2;
                long $l0 = r2;
                AbstractC11688p $r42 = (AbstractC11688p) obj;
                InterfaceC11692s $r22 = PerformPaymentViewModel.m39109initiateRequery$lambda24($r1, $l0, $r42);
                return $r22;
            }
        });
        Object object = new Object() { // from class: ai.kudi.agent.bills.viewmodels.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AtomicBoolean $r1 = $r2;
                PerformPaymentViewModel $r22 = this;
                HashMap $r42 = (HashMap) obj;
                PerformPaymentViewModel.m39111initiateRequery$lambda25($r1, $r22, $r42);
            }
        };
        Function $r8 = Function.LEN;
        this.requeryDisposable = $r52.e0(object, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: initiateRequery$lambda-24  reason: not valid java name */
    public static final InterfaceC11692s m39109initiateRequery$lambda24(final AtomicBoolean atomicBoolean, final long j, AbstractC11688p abstractC11688p) {
        Log_OC.getArray(atomicBoolean, "$requerySuccessful");
        Log_OC.getArray(abstractC11688p, MetricTracker.Action.COMPLETED);
        AbstractC11688p $r0 = abstractC11688p.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.viewmodels.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AtomicBoolean $r1 = atomicBoolean;
                long $l0 = j;
                InterfaceC11692s $r2 = PerformPaymentViewModel.m39110initiateRequery$lambda24$lambda23($r1, $l0, obj);
                return $r2;
            }
        });
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: initiateRequery$lambda-24$lambda-23  reason: not valid java name */
    public static final InterfaceC11692s m39110initiateRequery$lambda24$lambda23(AtomicBoolean atomicBoolean, long j, Object obj) {
        Log_OC.getArray(atomicBoolean, "$requerySuccessful");
        Log_OC.getArray(obj, "it");
        boolean $z0 = atomicBoolean.get();
        if ($z0) {
            AbstractC11688p $r2 = AbstractC11688p.m10483y();
            return $r2;
        }
        TimeUnit $r3 = TimeUnit.MILLISECONDS;
        AbstractC11688p $r22 = AbstractC11688p.m10501m0(j, $r3);
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: initiateRequery$lambda-25  reason: not valid java name */
    public static final void m39111initiateRequery$lambda25(AtomicBoolean atomicBoolean, PerformPaymentViewModel performPaymentViewModel, HashMap hashMap) {
        String $r4;
        Log_OC.getArray(atomicBoolean, "$requerySuccessful");
        Log_OC.getArray(performPaymentViewModel, "this$0");
        Object $r3 = hashMap.get(TransactionField.STATUS);
        String $r42 = (String) $r3;
        if ($r42 == null) {
            $r4 = null;
        } else {
            String $r5 = $r42.toLowerCase();
            $r4 = $r5;
            Log_OC.loadImage($r5, "(this as java.lang.String).toLowerCase()");
        }
        boolean $z0 = Log_OC.append($r4, "success");
        if ($z0) {
            atomicBoolean.set(true);
            performPaymentViewModel.showPaymentSuccess("Transaction successful");
            return;
        }
        boolean $z02 = Log_OC.append($r4, "biller_purchase_failed");
        if ($z02) {
            atomicBoolean.set(true);
            performPaymentViewModel.showPaymentSuccess("Transaction will be processed. PLEASE, DO NOT RETRY");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initiateRequery$lambda-26  reason: not valid java name */
    public static final void m39112initiateRequery$lambda26(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initiateWithdrawalPayment(WithdrawalRequest withdrawalRequest, WithdrawalResponse withdrawalResponse, WebViewNavigator webViewNavigator) {
        String $r4 = withdrawalRequest.getPaymentVendor();
        boolean $z0 = Log_OC.append($r4, PaymentVendors.POS_PAYPAD);
        if ($z0) {
            initiatePaypadPayment(withdrawalRequest, withdrawalResponse);
            return;
        }
        boolean $z02 = Log_OC.append($r4, PaymentVendors.DEBIT_CARD);
        if ($z02) {
            initiateDebitCardPayment(withdrawalRequest, withdrawalResponse, webViewNavigator);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void publishOpenMPOS(int i, String str) {
        PaymentViewData $r2 = this.currentState;
        publishState(PaymentViewData.copy$default($r2, 0L, null, true, i, str, false, null, false, 227, null));
        PaymentViewData $r22 = this.currentState;
        publishState(PaymentViewData.copy$default($r22, 0L, null, false, i, str, false, null, false, 227, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void publishOpenMPOS$default(PerformPaymentViewModel performPaymentViewModel, int i, String $r2, int i2, Object obj) {
        int $i1 = i2 & 2;
        if ($i1 != 0) {
            $r2 = "";
        }
        performPaymentViewModel.publishOpenMPOS(i, $r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void publishPaymentFailed(String str) {
        PaymentViewData $r1 = this.currentState;
        publishState(PaymentViewData.copy$default($r1, -1L, str, false, 0, null, false, null, false, 124, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void publishPaymentPending() {
        PaymentViewData $r1 = this.currentState;
        publishState(PaymentViewData.copy$default($r1, 0L, null, false, 0, null, false, null, false, 254, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void publishPaymentSuccessful(String str) {
        PaymentViewData $r1 = this.currentState;
        publishState(PaymentViewData.copy$default($r1, 1L, str, false, 0, null, false, null, false, 252, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void publishPaymentSuccessful(String str, boolean z, String str2) {
        PaymentViewData $r2 = this.currentState;
        publishState(PaymentViewData.copy$default($r2, 1L, str, false, 0, null, z, str2, false, 156, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void publishState(PaymentViewData paymentViewData) {
        if (paymentViewData != null) {
            this.currentState = paymentViewData;
        }
        C11678a $r2 = getViewData();
        PaymentViewData $r1 = this.currentState;
        $r2.mo331f($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void publishState$default(PerformPaymentViewModel performPaymentViewModel, PaymentViewData $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        performPaymentViewModel.publishState($r2);
    }

    private final void showPaymentSuccess(String str) {
        publishPaymentSuccessful(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void showPaymentSuccess$default(PerformPaymentViewModel performPaymentViewModel, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "";
        }
        performPaymentViewModel.showPaymentSuccess($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-1  reason: not valid java name */
    public static final void m39113start$lambda1(PerformPaymentViewModel performPaymentViewModel, BillRequest billRequest, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        Log_OC.getArray(billRequest, "$request");
        int $i0 = billRequest.getAmount();
        String $r3 = feesLookupResponse.getServiceFee();
        int $i1 = Integer.parseInt($r3);
        publishOpenMPOS$default(performPaymentViewModel, $i0 + $i1, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-10  reason: not valid java name */
    public static final void m39114start$lambda10(PerformPaymentViewModel performPaymentViewModel, TransferRequest transferRequest, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        Log_OC.getArray(transferRequest, "$request");
        int $i0 = transferRequest.getAmount();
        String $r3 = feesLookupResponse.getServiceFee();
        int $i1 = Integer.parseInt($r3);
        publishOpenMPOS$default(performPaymentViewModel, $i0 + $i1, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-11  reason: not valid java name */
    public static final void m39115start$lambda11(PerformPaymentViewModel performPaymentViewModel, Throwable th) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        performPaymentViewModel.publishPaymentFailed("Sorry, we couldn't lookup the fee. Please go back and perform the request again.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-12  reason: not valid java name */
    public static final void m39116start$lambda12(PerformPaymentViewModel performPaymentViewModel, TransferResponse transferResponse) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        String $r1 = transferResponse.getReference();
        performPaymentViewModel.initiateRequery($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-13  reason: not valid java name */
    public static final void m39117start$lambda13(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$tmp0");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-14  reason: not valid java name */
    public static final void m39118start$lambda14(PerformPaymentViewModel performPaymentViewModel, WithdrawToBankRequest withdrawToBankRequest, WithdrawToBankResponse withdrawToBankResponse) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        Log_OC.getArray(withdrawToBankRequest, "$withdrawToBankRequest");
        StringBuilder $r3 = new StringBuilder();
        $r3.append("Your withdrawal of NGN");
        int $i0 = withdrawToBankRequest.getAmount();
        $r3.append($i0);
        $r3.append(" is being processed.");
        String $r4 = $r3.toString();
        performPaymentViewModel.publishPaymentSuccessful($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-15  reason: not valid java name */
    public static final void m39119start$lambda15(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$tmp0");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-2  reason: not valid java name */
    public static final void m39120start$lambda2(PerformPaymentViewModel performPaymentViewModel, Throwable th) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        performPaymentViewModel.publishPaymentFailed("Sorry, we couldn't lookup the fee. Please go back and perform the request again.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-8  reason: not valid java name */
    public static final void m39121start$lambda8(PerformPaymentViewModel performPaymentViewModel, TransactionResponse transactionResponse) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        performPaymentViewModel.publishPaymentSuccessful("Your transaction is in progress. This should only take a moment", true, "Transaction request received");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-9  reason: not valid java name */
    public static final void m39122start$lambda9(PerformPaymentViewModel performPaymentViewModel, Throwable th) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        String $r1 = th.getMessage();
        String $r3 = $r1;
        if ($r1 == null) {
            $r3 = "Try again later.";
        }
        performPaymentViewModel.publishPaymentFailed($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void submitBillingRequest(BillRequest billRequest) {
        SubmitBillRequest $r3 = this.submitRequest;
        Log_OC.append(billRequest);
        AbstractC11688p $r4 = $r3.execute(billRequest);
        Object object = new Object() { // from class: ai.kudi.agent.bills.viewmodels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r1 = PerformPaymentViewModel.this;
                BillResponse $r32 = (BillResponse) obj;
                PerformPaymentViewModel.m39123submitBillingRequest$lambda6($r1, $r32);
            }
        };
        final InterfaceC11767l $r6 = handleRequestError("Transaction failed.");
        FavoritesArrayAdapter $r7 = $r4.e0(object, new Object() { // from class: ai.kudi.agent.bills.viewmodels.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r32 = (Throwable) obj;
                PerformPaymentViewModel.m39124submitBillingRequest$lambda7($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "submitRequest.execute(request!!)\n            .subscribe(\n                {\n                    initiateRequery(it.reference)\n                },\n                handleRequestError(\"Transaction failed.\")\n            )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitBillingRequest$lambda-6  reason: not valid java name */
    public static final void m39123submitBillingRequest$lambda6(PerformPaymentViewModel performPaymentViewModel, BillResponse billResponse) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        String $r1 = billResponse.getReference();
        performPaymentViewModel.initiateRequery($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitBillingRequest$lambda-7  reason: not valid java name */
    public static final void m39124submitBillingRequest$lambda7(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$tmp0");
        interfaceC11767l.invoke(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void submitWithdrawal(final WithdrawalRequest withdrawalRequest, final WebViewNavigator webViewNavigator) {
        SubmitWithdrawalRequest $r4 = this.submitWithdrawalRequest;
        AbstractC11688p $r5 = $r4.execute(withdrawalRequest);
        Object object = new Object() { // from class: ai.kudi.agent.bills.viewmodels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r1 = PerformPaymentViewModel.this;
                WithdrawalRequest $r2 = withdrawalRequest;
                WebViewNavigator $r3 = webViewNavigator;
                WithdrawalResponse $r52 = (WithdrawalResponse) obj;
                PerformPaymentViewModel.m39125submitWithdrawal$lambda19($r1, $r2, $r3, $r52);
            }
        };
        final InterfaceC11767l $r6 = handleRequestError("Transaction failed");
        FavoritesArrayAdapter $r8 = $r5.e0(object, new Object() { // from class: ai.kudi.agent.bills.viewmodels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                PerformPaymentViewModel.m39126submitWithdrawal$lambda20($r1, $r3);
            }
        });
        Log_OC.loadImage($r8, "submitWithdrawalRequest.execute(request)\n            .subscribe(\n                {\n                    withdrawalResponse = it\n                    withdrawalRequest = request\n                    initiateWithdrawalPayment(request, it, webViewNavigator)\n                },\n                handleRequestError(\"Transaction failed\")\n            )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitWithdrawal$lambda-19  reason: not valid java name */
    public static final void m39125submitWithdrawal$lambda19(PerformPaymentViewModel performPaymentViewModel, WithdrawalRequest withdrawalRequest, WebViewNavigator webViewNavigator, WithdrawalResponse withdrawalResponse) {
        Log_OC.getArray(performPaymentViewModel, "this$0");
        Log_OC.getArray(withdrawalRequest, "$request");
        Log_OC.getArray(webViewNavigator, "$webViewNavigator");
        performPaymentViewModel.withdrawalResponse = withdrawalResponse;
        performPaymentViewModel.withdrawalRequest = withdrawalRequest;
        Log_OC.loadImage(withdrawalResponse, "it");
        performPaymentViewModel.initiateWithdrawalPayment(withdrawalRequest, withdrawalResponse, webViewNavigator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitWithdrawal$lambda-20  reason: not valid java name */
    public static final void m39126submitWithdrawal$lambda20(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$tmp0");
        interfaceC11767l.invoke(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void submitWithdrawalUpdate(final WithdrawalRequest withdrawalRequest) {
        WithdrawalResponse $r2 = this.withdrawalResponse;
        if ($r2 == null) {
            return;
        }
        SubmitWithdrawalUpdate $r3 = this.submitWithdrawalUpdate;
        String $r5 = $r2.getReference();
        WithdrawalUpdateRequest $r4 = new WithdrawalUpdateRequest($r5, withdrawalRequest);
        AbstractC11688p $r6 = $r3.execute($r4);
        Object object = new Object() { // from class: ai.kudi.agent.bills.viewmodels.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                WithdrawalRequest $r1 = WithdrawalRequest.this;
                PerformPaymentViewModel $r22 = this;
                WithdrawalResponse $r42 = (WithdrawalResponse) obj;
                PerformPaymentViewModel.m39127submitWithdrawalUpdate$lambda18$lambda16($r1, $r22, $r42);
            }
        };
        final InterfaceC11767l $r8 = handleRequestError("Transaction failed");
        FavoritesArrayAdapter $r10 = $r6.e0(object, new Object() { // from class: ai.kudi.agent.bills.viewmodels.ReplaySubject$BoundedState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r32 = (Throwable) obj;
                PerformPaymentViewModel.m39128submitWithdrawalUpdate$lambda18$lambda17($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "submitWithdrawalUpdate.execute(WithdrawalUpdateRequest(it.reference, request))\n                .subscribe(\n                    {\n                        if (request.mposPaymentMethod.isFailed) {\n                            publishPaymentFailed(\"\")\n                        } else if (request.mposPaymentMethod.isSuccess) {\n                            showPaymentSuccess(\"Withdrawal successful. Give customer money.\")\n                        }\n                    },\n                    handleRequestError(\"Transaction failed\")\n                )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitWithdrawalUpdate$lambda-18$lambda-16  reason: not valid java name */
    public static final void m39127submitWithdrawalUpdate$lambda18$lambda16(WithdrawalRequest withdrawalRequest, PerformPaymentViewModel performPaymentViewModel, WithdrawalResponse withdrawalResponse) {
        Log_OC.getArray(withdrawalRequest, "$request");
        Log_OC.getArray(performPaymentViewModel, "this$0");
        MPOSPaymentMethod $r3 = withdrawalRequest.getMposPaymentMethod();
        boolean $z0 = $r3.isFailed();
        if ($z0) {
            performPaymentViewModel.publishPaymentFailed("");
            return;
        }
        MPOSPaymentMethod $r32 = withdrawalRequest.getMposPaymentMethod();
        boolean $z02 = $r32.isSuccess();
        if ($z02) {
            performPaymentViewModel.showPaymentSuccess("Withdrawal successful. Give customer money.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitWithdrawalUpdate$lambda-18$lambda-17  reason: not valid java name */
    public static final void m39128submitWithdrawalUpdate$lambda18$lambda17(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$tmp0");
        interfaceC11767l.invoke(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void completeRequest(MPOSPaymentMethod mPOSPaymentMethod) {
        Log_OC.getArray(mPOSPaymentMethod, "mpos");
        PaymentViewData $r2 = this.currentState;
        publishState(PaymentViewData.copy$default($r2, 0L, null, false, 0, null, false, null, false, 250, null));
        BillRequest $r3 = this.billRequest;
        if ($r3 != null) {
            submitBillingRequest(BillRequest.copy$default($r3, null, null, null, 0, null, null, mPOSPaymentMethod, 63, null));
        }
        TransferRequest $r4 = this.transferRequest;
        if ($r4 != null) {
            start(TransferRequest.copy$default($r4, null, null, 0, null, null, false, mPOSPaymentMethod, null, null, null, 959, null));
        }
        WithdrawalRequest $r5 = this.withdrawalRequest;
        if ($r5 == null) {
            return;
        }
        boolean $z0 = mPOSPaymentMethod.isFailed();
        if ($z0) {
            String $r6 = mPOSPaymentMethod.getResponse();
            publishPaymentFailed($r6);
            return;
        }
        boolean $z02 = mPOSPaymentMethod.isSuccess();
        if ($z02) {
            showPaymentSuccess("Withdrawal successful. Give customer money.");
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PaymentViewData initialData() {
        PaymentViewData $r1 = new PaymentViewData(0L, null, false, 0, null, false, "", false, 128, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PaymentViewData $r1 = initialData();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        FavoritesArrayAdapter $r2 = this.requeryDisposable;
        if ($r2 != null) {
            $r2.backup();
        }
        Bus $r1 = RxBus.getBus();
        $r1.unregister(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(final BillRequest billRequest) {
        Log_OC.getArray(billRequest, TransactionRequest.TYPE_REQUEST);
        MPOSPaymentMethod $r3 = billRequest.getMposPaymentMethod();
        boolean $z0 = $r3.isRequired();
        if (!$z0) {
            submitBillingRequest(billRequest);
            return;
        }
        this.billRequest = billRequest;
        Meta $r4 = billRequest.getMeta();
        boolean $z02 = $r4.getService_fee_included();
        if (!$z02) {
            int $i0 = billRequest.getAmount();
            publishOpenMPOS$default(this, $i0, null, 2, null);
            return;
        }
        PerformServiceFeeLookup $r5 = this.feeLookup;
        String $r6 = billRequest.getType();
        int $i02 = billRequest.getAmount();
        String $r7 = String.valueOf($i02);
        FeesLookupRequest $r1 = new FeesLookupRequest($r6, $r7, null, 4, null);
        AbstractC11688p $r8 = $r5.execute($r1);
        FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.bills.viewmodels.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r12 = PerformPaymentViewModel.this;
                BillRequest $r2 = billRequest;
                FeesLookupResponse $r42 = (FeesLookupResponse) obj;
                PerformPaymentViewModel.m39113start$lambda1($r12, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.bills.viewmodels.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r12 = PerformPaymentViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PerformPaymentViewModel.m39120start$lambda2($r12, $r32);
            }
        });
        Log_OC.loadImage($r11, "feeLookup.execute(FeesLookupRequest(request.type, request.amount.toString()))\n                    .subscribe(\n                        {\n                            publishOpenMPOS(request.amount + it.serviceFee.toInt())\n                        },\n                        {\n                            publishPaymentFailed(\"Sorry, we couldn't lookup the fee. \" + \"Please go back and perform the request again.\")\n                        }\n                    )");
        C11280b $r12 = getCompositeDisposable();
        RxExtKt.addTo($r11, $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(TransactionRequest transactionRequest) {
        Log_OC.getArray(transactionRequest, TransactionRequest.TYPE_REQUEST);
        publishPaymentPending();
        SubmitTransactionRequest $r3 = this.submitTransactionRequest;
        AbstractC11688p $r4 = $r3.execute(transactionRequest);
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.bills.viewmodels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r1 = PerformPaymentViewModel.this;
                TransactionResponse $r32 = (TransactionResponse) obj;
                PerformPaymentViewModel.m39121start$lambda8($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.bills.viewmodels.Comment
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r1 = PerformPaymentViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PerformPaymentViewModel.m39122start$lambda9($r1, $r32);
            }
        });
        Log_OC.loadImage($r6, "submitTransactionRequest.execute(request)\n            .subscribe(\n                {\n                    // TODO:  wait for fcm callback for deposit\n                    // temporary fix\n                    publishPaymentSuccessful(\n                        \"Your transaction is in progress. This should only take a moment\",\n                        true, \"Transaction request received\"\n                    )\n                },\n                {\n                    publishPaymentFailed(it.message ?: \"Try again later.\")\n                }\n            )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(final TransferRequest transferRequest) {
        Log_OC.getArray(transferRequest, TransactionRequest.TYPE_REQUEST);
        publishPaymentPending();
        MPOSPaymentMethod $r3 = transferRequest.getMposPaymentMethod();
        boolean $z0 = $r3.isRequired();
        if (!$z0) {
            SubmitTransferRequest $r11 = this.submitTransferRequest;
            AbstractC11688p $r6 = $r11.execute(transferRequest);
            Object object = new Object() { // from class: ai.kudi.agent.bills.viewmodels.Main
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PerformPaymentViewModel $r1 = PerformPaymentViewModel.this;
                    TransferResponse $r32 = (TransferResponse) obj;
                    PerformPaymentViewModel.m39116start$lambda12($r1, $r32);
                }
            };
            final InterfaceC11767l $r13 = handleRequestError("Transfer failed. Try again");
            FavoritesArrayAdapter $r9 = $r6.e0(object, new Object() { // from class: ai.kudi.agent.bills.viewmodels.Event
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    InterfaceC11767l $r1 = InterfaceC11767l.this;
                    Throwable $r32 = (Throwable) obj;
                    PerformPaymentViewModel.m39117start$lambda13($r1, $r32);
                }
            });
            Log_OC.loadImage($r9, "submitTransferRequest.execute(request)\n                .subscribe(\n                    {\n                        initiateRequery(it.reference)\n                    },\n                    handleRequestError(\"Transfer failed. Try again\")\n                )");
            C11280b $r10 = getCompositeDisposable();
            RxExtKt.addTo($r9, $r10);
            return;
        }
        this.transferRequest = transferRequest;
        boolean $z02 = transferRequest.getServiceFeeIncluded();
        if (!$z02) {
            int $i0 = transferRequest.getAmount();
            publishOpenMPOS$default(this, $i0, null, 2, null);
            return;
        }
        PerformServiceFeeLookup $r4 = this.feeLookup;
        int $i02 = transferRequest.getAmount();
        String $r5 = String.valueOf($i02);
        FeesLookupRequest $r1 = new FeesLookupRequest("transfer", $r5, null, 4, null);
        AbstractC11688p $r62 = $r4.execute($r1);
        FavoritesArrayAdapter $r92 = $r62.e0(new Object() { // from class: ai.kudi.agent.bills.viewmodels.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r12 = PerformPaymentViewModel.this;
                TransferRequest $r2 = transferRequest;
                FeesLookupResponse $r42 = (FeesLookupResponse) obj;
                PerformPaymentViewModel.m39114start$lambda10($r12, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.bills.viewmodels.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r12 = PerformPaymentViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PerformPaymentViewModel.m39115start$lambda11($r12, $r32);
            }
        });
        Log_OC.loadImage($r92, "feeLookup.execute(FeesLookupRequest(\"transfer\", request.amount.toString()))\n                    .subscribe(\n                        {\n                            publishOpenMPOS(request.amount + it.serviceFee.toInt())\n                        },\n                        {\n                            publishPaymentFailed(\"Sorry, we couldn't lookup the fee. \" + \"Please go back and perform the request again.\")\n                        }\n                    )");
        C11280b $r102 = getCompositeDisposable();
        RxExtKt.addTo($r92, $r102);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(final WithdrawToBankRequest withdrawToBankRequest) {
        Log_OC.getArray(withdrawToBankRequest, "withdrawToBankRequest");
        publishPaymentPending();
        TransferToBank $r4 = this.transferToBank;
        AbstractC11688p $r5 = $r4.execute(withdrawToBankRequest);
        Object object = new Object() { // from class: ai.kudi.agent.bills.viewmodels.Widget
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PerformPaymentViewModel $r1 = PerformPaymentViewModel.this;
                WithdrawToBankRequest $r2 = withdrawToBankRequest;
                WithdrawToBankResponse $r42 = (WithdrawToBankResponse) obj;
                PerformPaymentViewModel.m39118start$lambda14($r1, $r2, $r42);
            }
        };
        final InterfaceC11767l $r6 = handleRequestError("Withdrawal not allowed at the moment. Try again later.");
        FavoritesArrayAdapter $r7 = $r5.e0(object, new Object() { // from class: ai.kudi.agent.bills.viewmodels.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                PerformPaymentViewModel.m39119start$lambda15($r1, $r3);
            }
        });
        Log_OC.loadImage($r7, "transferToBank.execute(withdrawToBankRequest)\n            .subscribe(\n                {\n                    publishPaymentSuccessful(\"Your withdrawal of NGN${withdrawToBankRequest.amount} is being processed.\")\n                },\n                handleRequestError(\"Withdrawal not allowed at the moment. Try again later.\")\n            )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(WithdrawalRequest withdrawalRequest, WebViewNavigator webViewNavigator) {
        Log_OC.getArray(withdrawalRequest, TransactionRequest.TYPE_REQUEST);
        Log_OC.getArray(webViewNavigator, "webViewNavigator");
        publishPaymentPending();
        String $r3 = withdrawalRequest.getPaymentVendor();
        boolean $z0 = Log_OC.append($r3, PaymentVendors.DEBIT_CARD);
        if ($z0) {
            submitWithdrawal(withdrawalRequest, webViewNavigator);
            return;
        }
        MPOSPaymentMethod $r4 = withdrawalRequest.getMposPaymentMethod();
        boolean $z02 = $r4.isFailed();
        if (!$z02) {
            MPOSPaymentMethod $r42 = withdrawalRequest.getMposPaymentMethod();
            boolean $z03 = $r42.isSuccess();
            if (!$z03) {
                submitWithdrawal(withdrawalRequest, webViewNavigator);
                return;
            }
        }
        submitWithdrawalUpdate(withdrawalRequest);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(boolean z, String $r1) {
        publishPaymentPending();
        if (z) {
            if ($r1 == null) {
                $r1 = "";
            }
            publishPaymentSuccessful($r1);
            return;
        }
        if ($r1 == null) {
            $r1 = "It failed.";
        }
        publishPaymentFailed($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateViewWithIncomingMessage(IncomingMessage incomingMessage) {
        String $r2;
        boolean $z0;
        Log_OC.getArray(incomingMessage, MetricTracker.Object.MESSAGE);
        Object[] $r3 = new Object[0];
        Timber.wtf(Log_OC.m10359a("Incoming ", (Object) incomingMessage.getStatus()), $r3);
        String $r22 = incomingMessage.getStatus();
        if ($r22 != null) {
            int $i0 = $r22.hashCode();
            if ($i0 == -1157937410) {
                boolean $z02 = $r22.equals("BILLING_SUCCESSFUL");
                if ($z02) {
                    String $r23 = incomingMessage.getMessage();
                    Log_OC.loadImage($r23, "message.message");
                    showPaymentSuccess($r23);
                    return;
                }
            } else if ($i0 == 1695445092) {
                boolean $z03 = $r22.equals("WITHDRAWAL_SUCCESSFUL");
                if ($z03) {
                    String $r24 = incomingMessage.getMessage();
                    Log_OC.loadImage($r24, "message.message");
                    showPaymentSuccess($r24);
                    return;
                }
            } else if ($i0 == 2135143278) {
                boolean $z04 = $r22.equals("TRANSFER_SUCCESSFUL");
                if ($z04) {
                    showPaymentSuccess$default(this, null, 1, null);
                    return;
                }
            }
        }
        if (incomingMessage.getMessage() != null) {
            String $r25 = incomingMessage.getMessage();
            Log_OC.loadImage($r25, "message.message");
            $z0 = C13276s.m5440u($r25);
            if (!$z0) {
                $r2 = incomingMessage.getMessage();
                Log_OC.loadImage($r2, "failureMessage");
                publishPaymentFailed($r2);
            }
        }
        $r2 = "";
        Log_OC.loadImage($r2, "failureMessage");
        publishPaymentFailed($r2);
    }
}
