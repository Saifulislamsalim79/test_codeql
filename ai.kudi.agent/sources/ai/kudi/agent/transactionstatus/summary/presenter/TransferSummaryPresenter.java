package ai.kudi.agent.transactionstatus.summary.presenter;

import ai.kudi.agent.bills.domain.usecases.SubmitTransferRequest;
import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.usecases.LogUserEventUseCase;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import ai.kudi.agent.transactions.TransactionStatus;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactionstatus.summary.view.TransferSummaryView;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.users.domain.package_1.TransferRequest;
import ai.kudi.agent.users.domain.package_1.TransferResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankResponse;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.TransferToBank;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.domain.usecase.CreateVoucher;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
import retrofit2.HttpException;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransferSummaryPresenter.kt */
@Metadata(m10422d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010\t\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020 H\u0016J\u0016\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\u0016\u0010)\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\u000e\u0010*\u001a\u00020 2\u0006\u0010%\u001a\u00020&J\u0006\u0010+\u001a\u00020 J \u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u00010.J \u00101\u001a\u00020 2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u00010.J\u000e\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020.J(\u00104\u001a\u00020 2\u0006\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u00010.2\n\b\u0002\u00108\u001a\u0004\u0018\u00010.H\u0002J\u000e\u00109\u001a\u00020 2\u0006\u0010%\u001a\u00020&J\u0006\u0010:\u001a\u00020 J\u000e\u0010;\u001a\u00020 2\u0006\u00100\u001a\u00020.J\u0006\u0010<\u001a\u00020 J\u000e\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020?R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006@"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/presenter/TransferSummaryPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactionstatus/summary/view/TransferSummaryView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "transferToBank", "Lai/kudi/agent/users/domain/usecases/TransferToBank;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "createVoucher", "Lai/kudi/agent/voucher/cashin/domain/usecase/CreateVoucher;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "submitTransferRequest", "Lai/kudi/agent/bills/domain/usecases/SubmitTransferRequest;", "logUserEventUseCase", "Lai/kudi/agent/core/usecases/LogUserEventUseCase;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/domain/usecases/TransferToBank;Lai/kudi/agent/voucher/cashin/view/MainTransferView;Lai/kudi/agent/voucher/cashin/domain/usecase/CreateVoucher;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/bills/domain/usecases/SubmitTransferRequest;Lai/kudi/agent/core/usecases/LogUserEventUseCase;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getMainTransferView", "()Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "destroy", "editAccountDetailsPage", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "isFromSummaryPage", "", "editAmountPage", "editCustomerDetailsPage", "hideLoading", "logEventUponPinVerification", "phoneNumber", "", "isSuccessful", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "logEventUponVoucherCreation", "logUserEvent", MetricTracker.Object.MESSAGE, "navigateToTransactionStatusPage", TransactionField.STATUS, "Lai/kudi/agent/transactions/TransactionStatus;", "transactionReference", "errorMessage", "performTransfer", "showAuthDialog", "showError", "showLoading", "withdrawToBankAccount", "withdrawToBankRequest", "Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferSummaryPresenter extends C9410b<TransferSummaryView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final CreateVoucher createVoucher;
    private final FetchCurrentUser fetchCurrentUser;
    private final LogUserEventUseCase logUserEventUseCase;
    private final MainTransferView mainTransferView;
    private final SubmitTransferRequest submitTransferRequest;
    private final TransferToBank transferToBank;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferSummaryPresenter(FetchCurrentUser fetchCurrentUser, TransferToBank transferToBank, MainTransferView mainTransferView, CreateVoucher createVoucher, Analytics analytics, SubmitTransferRequest submitTransferRequest, LogUserEventUseCase logUserEventUseCase) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(transferToBank, "transferToBank");
        Log_OC.getArray(mainTransferView, "mainTransferView");
        Log_OC.getArray(createVoucher, "createVoucher");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(submitTransferRequest, "submitTransferRequest");
        Log_OC.getArray(logUserEventUseCase, "logUserEventUseCase");
        this.fetchCurrentUser = fetchCurrentUser;
        this.transferToBank = transferToBank;
        this.mainTransferView = mainTransferView;
        this.createVoucher = createVoucher;
        this.analytics = analytics;
        this.submitTransferRequest = submitTransferRequest;
        this.logUserEventUseCase = logUserEventUseCase;
        C11280b $r8 = new C11280b();
        this.compositeDisposable = $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createVoucher$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m41281createVoucher$lambda5(TransferSummaryPresenter transferSummaryPresenter, VoucherCashInRequest voucherCashInRequest, User user) {
        Log_OC.getArray(transferSummaryPresenter, "this$0");
        Log_OC.getArray(voucherCashInRequest, "$request");
        Log_OC.getArray(user, "it");
        transferSummaryPresenter.setUser(user);
        CreateVoucher $r3 = transferSummaryPresenter.createVoucher;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, voucherCashInRequest);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createVoucher$lambda-6  reason: not valid java name */
    public static final void m41282createVoucher$lambda6(TransferSummaryPresenter transferSummaryPresenter, VoucherCashInRequest voucherCashInRequest, Boolean bool) {
        Log_OC.getArray(transferSummaryPresenter, "this$0");
        Log_OC.getArray(voucherCashInRequest, "$request");
        transferSummaryPresenter.hideLoading();
        String $r3 = voucherCashInRequest.getSenderPhoneNumber();
        String $r4 = $r3;
        if ($r3 == null) {
            $r4 = "";
        }
        transferSummaryPresenter.logEventUponVoucherCreation($r4, true, null);
        Log_OC.loadImage(bool, TransactionField.STATUS);
        boolean $z0 = bool.booleanValue();
        TransactionStatus $r5 = $z0 ? TransactionStatus.SUCCESSFUL : TransactionStatus.FAILED;
        navigateToTransactionStatusPage$default(transferSummaryPresenter, $r5, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createVoucher$lambda-7  reason: not valid java name */
    public static final void m41283createVoucher$lambda7(TransferSummaryPresenter transferSummaryPresenter, VoucherCashInRequest voucherCashInRequest, Throwable th) {
        Log_OC.getArray(transferSummaryPresenter, "this$0");
        Log_OC.getArray(voucherCashInRequest, "$request");
        transferSummaryPresenter.hideLoading();
        th.printStackTrace();
        String $r4 = voucherCashInRequest.getSenderPhoneNumber();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        transferSummaryPresenter.logEventUponVoucherCreation($r5, false, th.getMessage());
        TransactionStatus $r1 = TransactionStatus.FAILED;
        navigateToTransactionStatusPage$default(transferSummaryPresenter, $r1, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideLoading$lambda-1  reason: not valid java name */
    public static final void m41284hideLoading$lambda1(TransferSummaryView transferSummaryView) {
        Log_OC.getArray(transferSummaryView, "view");
        transferSummaryView.hideLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToTransactionStatusPage(final TransactionStatus transactionStatus, final String str, final String str2) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                TransactionStatus $r1 = TransactionStatus.this;
                String $r2 = str;
                String $r3 = str2;
                TransferSummaryView $r5 = (TransferSummaryView) obj;
                TransferSummaryPresenter.m41285navigateToTransactionStatusPage$lambda2($r1, $r2, $r3, $r5);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void navigateToTransactionStatusPage$default(TransferSummaryPresenter transferSummaryPresenter, TransactionStatus transactionStatus, String $r2, String $r3, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $r2 = null;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r3 = null;
        }
        transferSummaryPresenter.navigateToTransactionStatusPage(transactionStatus, $r2, $r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToTransactionStatusPage$lambda-2  reason: not valid java name */
    public static final void m41285navigateToTransactionStatusPage$lambda2(TransactionStatus transactionStatus, String str, String str2, TransferSummaryView transferSummaryView) {
        Log_OC.getArray(transactionStatus, "$status");
        Log_OC.getArray(transferSummaryView, "view");
        transferSummaryView.navigateToTransactionStatusPage(transactionStatus, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performTransfer$lambda-10  reason: not valid java name */
    public static final void m41286performTransfer$lambda10(TransferSummaryPresenter transferSummaryPresenter, C11812w c11812w, Throwable th) {
        Log_OC.getArray(transferSummaryPresenter, "this$0");
        Log_OC.getArray(c11812w, "$phoneNumber");
        Log_OC.getArray(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        transferSummaryPresenter.hideLoading();
        CrashlyticsReport.logException(th);
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            HttpException $r3 = (HttpException) th;
            int $i0 = $r3.m352a();
            if ($i0 == 424) {
                TransactionStatus $r4 = TransactionStatus.FAILED;
                navigateToTransactionStatusPage$default(transferSummaryPresenter, $r4, null, "Reason: Insufficient Funds", 2, null);
            } else {
                TransactionStatus $r42 = TransactionStatus.FAILED;
                InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
                Object $r6 = $r5.invoke(th);
                String $r7 = (String) $r6;
                navigateToTransactionStatusPage$default(transferSummaryPresenter, $r42, null, $r7, 2, null);
            }
        } else {
            TransactionStatus $r43 = TransactionStatus.PENDING;
            navigateToTransactionStatusPage$default(transferSummaryPresenter, $r43, null, "Transaction is processing. PLEASE, DO NOT RETRY", 2, null);
        }
        Analytics $r8 = transferSummaryPresenter.analytics;
        Object $r62 = c11812w.f26499c;
        String $r72 = (String) $r62;
        String $r9 = th.getMessage();
        $r8.onFinalTransferPerformed($r72, false, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object, java.lang.String] */
    /* renamed from: performTransfer$lambda-8  reason: not valid java name */
    public static final InterfaceC11692s m41287performTransfer$lambda8(C11812w c11812w, TransferSummaryPresenter transferSummaryPresenter, TransferRequest transferRequest, User user) {
        Log_OC.getArray(c11812w, "$phoneNumber");
        Log_OC.getArray(transferSummaryPresenter, "this$0");
        Log_OC.getArray(transferRequest, "$request");
        Log_OC.getArray(user, "it");
        ?? phoneNumber = user.getPhoneNumber();
        Log_OC.loadImage(phoneNumber, "it.phoneNumber");
        c11812w.f26499c = phoneNumber;
        SubmitTransferRequest $r5 = transferSummaryPresenter.submitTransferRequest;
        AbstractC11688p $r6 = $r5.execute(transferRequest);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performTransfer$lambda-9  reason: not valid java name */
    public static final void m41288performTransfer$lambda9(TransferSummaryPresenter transferSummaryPresenter, C11812w c11812w, TransferResponse transferResponse) {
        Log_OC.getArray(transferSummaryPresenter, "this$0");
        Log_OC.getArray(c11812w, "$phoneNumber");
        transferSummaryPresenter.hideLoading();
        String $r3 = transferResponse.getStatus();
        if ($r3 == null) {
            NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw $r8;
        }
        Locale $r4 = Locale.ROOT;
        String $r32 = $r3.toLowerCase($r4);
        Log_OC.loadImage($r32, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        boolean $z0 = Log_OC.append($r32, "success");
        if ($z0) {
            TransactionStatus $r5 = TransactionStatus.SUCCESSFUL;
            navigateToTransactionStatusPage$default(transferSummaryPresenter, $r5, transferResponse.getReference(), null, 4, null);
            Analytics $r6 = transferSummaryPresenter.analytics;
            Object $r7 = c11812w.f26499c;
            TransferToBankAnalytics.DefaultImpls.onFinalTransferPerformed$default($r6, (String) $r7, true, null, 4, null);
            return;
        }
        boolean $z02 = Log_OC.append($r32, "biller_purchase_failed");
        if ($z02) {
            TransactionStatus $r52 = TransactionStatus.PENDING;
            navigateToTransactionStatusPage$default(transferSummaryPresenter, $r52, null, "Transaction is processing. PLEASE, DO NOT RETRY", 2, null);
            Analytics $r62 = transferSummaryPresenter.analytics;
            Object $r72 = c11812w.f26499c;
            TransferToBankAnalytics.DefaultImpls.onFinalTransferPerformed$default($r62, (String) $r72, true, null, 4, null);
            return;
        }
        TransactionStatus $r53 = TransactionStatus.PENDING;
        navigateToTransactionStatusPage$default(transferSummaryPresenter, $r53, null, "Transaction is processing. PLEASE, DO NOT RETRY", 2, null);
        Analytics $r63 = transferSummaryPresenter.analytics;
        Object $r73 = c11812w.f26499c;
        TransferToBankAnalytics.DefaultImpls.onFinalTransferPerformed$default($r63, (String) $r73, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAuthDialog$lambda-4  reason: not valid java name */
    public static final void m41289showAuthDialog$lambda4(TransferSummaryView transferSummaryView) {
        Log_OC.getArray(transferSummaryView, "view");
        transferSummaryView.pinConfirmationDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-3  reason: not valid java name */
    public static final void m41290showError$lambda3(String str, TransferSummaryView transferSummaryView) {
        Log_OC.getArray(str, "$error");
        Log_OC.getArray(transferSummaryView, "view");
        transferSummaryView.showError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoading$lambda-0  reason: not valid java name */
    public static final void m41291showLoading$lambda0(TransferSummaryView transferSummaryView) {
        Log_OC.getArray(transferSummaryView, "view");
        transferSummaryView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawToBankAccount$lambda-11  reason: not valid java name */
    public static final void m41292withdrawToBankAccount$lambda11(TransferSummaryPresenter transferSummaryPresenter, WithdrawToBankResponse withdrawToBankResponse) {
        Log_OC.getArray(transferSummaryPresenter, "this$0");
        transferSummaryPresenter.hideLoading();
        TransactionStatus $r1 = TransactionStatus.SUCCESSFUL;
        navigateToTransactionStatusPage$default(transferSummaryPresenter, $r1, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawToBankAccount$lambda-12  reason: not valid java name */
    public static final void m41293withdrawToBankAccount$lambda12(TransferSummaryPresenter transferSummaryPresenter, Throwable th) {
        Log_OC.getArray(transferSummaryPresenter, "this$0");
        transferSummaryPresenter.hideLoading();
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
        TransactionStatus $r2 = TransactionStatus.FAILED;
        navigateToTransactionStatusPage$default(transferSummaryPresenter, $r2, null, null, 6, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createVoucher(final VoucherCashInRequest voucherCashInRequest) {
        Log_OC.getArray(voucherCashInRequest, TransactionRequest.TYPE_REQUEST);
        showLoading();
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransferSummaryPresenter $r1 = TransferSummaryPresenter.this;
                VoucherCashInRequest $r22 = voucherCashInRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = TransferSummaryPresenter.m41281createVoucher$lambda5($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.FileChooser
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferSummaryPresenter $r1 = TransferSummaryPresenter.this;
                VoucherCashInRequest $r22 = voucherCashInRequest;
                Boolean $r4 = (Boolean) obj;
                TransferSummaryPresenter.m41282createVoucher$lambda6($r1, $r22, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferSummaryPresenter $r1 = TransferSummaryPresenter.this;
                VoucherCashInRequest $r22 = voucherCashInRequest;
                Throwable $r4 = (Throwable) obj;
                TransferSummaryPresenter.m41283createVoucher$lambda7($r1, $r22, $r4);
            }
        });
        C11280b $r9 = this.compositeDisposable;
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editAccountDetailsPage(TransferToBankPayload transferToBankPayload, boolean z) {
        Log_OC.getArray(transferToBankPayload, "payload");
        Analytics $r2 = this.analytics;
        $r2.onEditAccountDetailsClicked();
        MainTransferView $r3 = this.mainTransferView;
        $r3.navigateToAccountDetailsPage(transferToBankPayload, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editAmountPage(TransferToBankPayload transferToBankPayload, boolean z) {
        Log_OC.getArray(transferToBankPayload, "payload");
        Analytics $r3 = this.analytics;
        $r3.onEditAmountClicked();
        MainTransferView $r2 = this.mainTransferView;
        MainTransferView.DefaultImpls.navigateToBankTransferAmountPage$default($r2, transferToBankPayload, z, false, 4, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editCustomerDetailsPage(TransferToBankPayload transferToBankPayload) {
        Log_OC.getArray(transferToBankPayload, "payload");
        Analytics $r2 = this.analytics;
        $r2.onEditCustomerInfoClicked();
        MainTransferView $r3 = this.mainTransferView;
        MainTransferView.DefaultImpls.navigateToCustomersInformationPage$default($r3, transferToBankPayload, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11280b getCompositeDisposable() {
        C11280b r1 = this.compositeDisposable;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MainTransferView getMainTransferView() {
        MainTransferView r1 = this.mainTransferView;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoading() {
        C0642c $r1 = C0642c.f1774d;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logEventUponPinVerification(String str, boolean z, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Analytics $r4 = this.analytics;
        User $r3 = this.user;
        $r4.onVoucherPinCashInPinVerification(str, z, str2, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logEventUponVoucherCreation(String str, boolean z, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Analytics $r4 = this.analytics;
        User $r3 = this.user;
        $r4.onVoucherCashInCreationButtonClicked(str, z, str2, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logUserEvent(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Object[] $r2 = new Object[0];
        Timber.wtf(str, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performTransfer(TransferToBankPayload transferToBankPayload) {
        Log_OC.getArray(transferToBankPayload, "payload");
        showLoading();
        MPOSPaymentMethod.Companion $r2 = MPOSPaymentMethod.Companion;
        MPOSPaymentMethod $r3 = $r2.empty();
        String $r5 = transferToBankPayload.getAccountNumber();
        Log_OC.append($r5);
        String $r6 = transferToBankPayload.getBankCode();
        Log_OC.append($r6);
        Integer $r7 = transferToBankPayload.getAmount();
        Log_OC.append($r7);
        int $i0 = $r7.intValue();
        String $r8 = transferToBankPayload.getAccountName();
        Log_OC.append($r8);
        String $r9 = transferToBankPayload.getPhoneNumber();
        Log_OC.append($r9);
        String $r10 = transferToBankPayload.getSendersPhone();
        Log_OC.append($r10);
        String $r11 = transferToBankPayload.getReason();
        if ($r11 == null) {
            $r11 = "";
        }
        Meta $r12 = transferToBankPayload.getMeta();
        Log_OC.append($r12);
        final TransferRequest $r4 = new TransferRequest($r5, $r6, $i0, $r8, $r9, false, $r3, $r10, $r11, $r12);
        final C11812w $r13 = new C11812w();
        $r13.f26499c = "";
        FetchCurrentUser $r14 = this.fetchCurrentUser;
        AbstractC11696w $r15 = FetchCurrentUser.execute$default($r14, null, null, 3, null);
        AbstractC11688p $r17 = $r15.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r1 = C11812w.this;
                TransferSummaryPresenter $r22 = this;
                TransferRequest $r32 = $r4;
                User $r62 = (User) obj;
                InterfaceC11692s $r42 = TransferSummaryPresenter.m41287performTransfer$lambda8($r1, $r22, $r32, $r62);
                return $r42;
            }
        });
        FavoritesArrayAdapter $r20 = $r17.e0(new Object() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.StandardShowcaseDrawer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferSummaryPresenter $r1 = TransferSummaryPresenter.this;
                C11812w $r22 = $r13;
                TransferResponse $r42 = (TransferResponse) obj;
                TransferSummaryPresenter.m41288performTransfer$lambda9($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferSummaryPresenter $r1 = TransferSummaryPresenter.this;
                C11812w $r22 = $r13;
                Throwable $r42 = (Throwable) obj;
                TransferSummaryPresenter.m41286performTransfer$lambda10($r1, $r22, $r42);
            }
        });
        C11280b $r21 = this.compositeDisposable;
        $r21.b($r20);
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showAuthDialog() {
        Format $r1 = Format.THREAD;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.Game
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void play(Object obj) {
                String $r1 = str;
                TransferSummaryView $r3 = (TransferSummaryView) obj;
                TransferSummaryPresenter.m41290showError$lambda3($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading() {
        Image $r1 = Image.image;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void withdrawToBankAccount(WithdrawToBankRequest withdrawToBankRequest) {
        Log_OC.getArray(withdrawToBankRequest, "withdrawToBankRequest");
        showLoading();
        TransferToBank $r3 = this.transferToBank;
        AbstractC11688p $r4 = $r3.execute(withdrawToBankRequest);
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.NameFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferSummaryPresenter $r1 = TransferSummaryPresenter.this;
                WithdrawToBankResponse $r32 = (WithdrawToBankResponse) obj;
                TransferSummaryPresenter.m41292withdrawToBankAccount$lambda11($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferSummaryPresenter $r1 = TransferSummaryPresenter.this;
                Throwable $r32 = (Throwable) obj;
                TransferSummaryPresenter.m41293withdrawToBankAccount$lambda12($r1, $r32);
            }
        });
        C11280b $r7 = this.compositeDisposable;
        $r7.b($r6);
    }
}
