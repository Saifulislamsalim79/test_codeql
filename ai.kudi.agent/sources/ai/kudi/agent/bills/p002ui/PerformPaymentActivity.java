package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.domain.wiki.BillRequest;
import ai.kudi.agent.bills.viewmodels.PerformPaymentViewModel;
import ai.kudi.agent.bills.viewmodels.viewdata.PaymentViewData;
import ai.kudi.agent.bills.views.PerformPaymentView;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ActivityPerformPaymentBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.mpos.MPOSActivity;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.PaymentWebViewActivity;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.TransferRequest;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest;
import ai.kudi.agent.users.navigators.WebViewNavigator;
import ai.kudi.agent.users.p035ui.AuthDialog;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PerformPaymentActivity.kt */
@Metadata(m10422d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 ^2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001^B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0003H\u0014J\b\u0010=\u001a\u00020\u0002H\u0014J\u0010\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0002J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020BH\u0014J\b\u0010C\u001a\u00020;H\u0016J\u0012\u0010D\u001a\u00020;2\b\u0010E\u001a\u0004\u0018\u00010\u0018H\u0016J\"\u0010F\u001a\u00020;2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010@H\u0014J\u0012\u0010K\u001a\u00020;2\b\u0010L\u001a\u0004\u0018\u00010MH\u0014J\u0012\u0010N\u001a\u00020;2\b\u0010?\u001a\u0004\u0018\u00010@H\u0014J\u0006\u0010O\u001a\u00020;J\u0018\u0010P\u001a\u00020;2\u0006\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u00020\u0018H\u0016J\u0016\u0010S\u001a\u00020;2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020;0UH\u0002J\b\u0010V\u001a\u00020;H\u0002J\b\u0010W\u001a\u00020;H\u0016J\u0010\u0010X\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010Y\u001a\u00020;2\u0006\u0010Z\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0018H\u0016R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006_"}, m10421d2 = {"Lai/kudi/agent/bills/ui/PerformPaymentActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/bills/viewmodels/PerformPaymentViewModel;", "Lai/kudi/agent/bills/viewmodels/viewdata/PaymentViewData;", "Lai/kudi/agent/databinding/ActivityPerformPaymentBinding;", "Lai/kudi/agent/bills/views/PerformPaymentView;", "Lai/kudi/agent/users/navigators/WebViewNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityPerformPaymentBinding;", "authDialog", "Lai/kudi/agent/users/ui/AuthDialog;", "getAuthDialog", "()Lai/kudi/agent/users/ui/AuthDialog;", "setAuthDialog", "(Lai/kudi/agent/users/ui/AuthDialog;)V", "billRequest", "Lai/kudi/agent/bills/domain/dto/BillRequest;", "getBillRequest", "()Lai/kudi/agent/bills/domain/dto/BillRequest;", "setBillRequest", "(Lai/kudi/agent/bills/domain/dto/BillRequest;)V", "reason", "", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "transactionRequest", "Lai/kudi/agent/transactions/domain/dto/TransactionRequest;", "getTransactionRequest", "()Lai/kudi/agent/transactions/domain/dto/TransactionRequest;", "setTransactionRequest", "(Lai/kudi/agent/transactions/domain/dto/TransactionRequest;)V", "transferRequest", "Lai/kudi/agent/users/domain/dto/TransferRequest;", "getTransferRequest", "()Lai/kudi/agent/users/domain/dto/TransferRequest;", "setTransferRequest", "(Lai/kudi/agent/users/domain/dto/TransferRequest;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/bills/viewmodels/PerformPaymentViewModel;", "setViewModel", "(Lai/kudi/agent/bills/viewmodels/PerformPaymentViewModel;)V", "withdrawToBankRequest", "Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;", "getWithdrawToBankRequest", "()Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;", "setWithdrawToBankRequest", "(Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;)V", "withdrawalRequest", "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "getWithdrawalRequest", "()Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "setWithdrawalRequest", "(Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;)V", "applyViewData", "", "viewData", "createViewModel", "executeTransaction", "intent", "Landroid/content/Intent;", "getVMType", "Ljava/lang/Class;", "hideLoading", "navigate", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "onNextClicked", "openMPOSView", TransactionField.AMOUNT, "reference", "performAuthorization", "onAuthSuccess", "Lkotlin/Function0;", "setDrawableColor", "showLoading", "showPaymentFailed", "showPaymentSuccess", MetricTracker.Object.MESSAGE, "shouldOverride", "", "overrideMessage", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.bills.ui.PerformPaymentActivity */
/* loaded from: classes.dex */
public final class PerformPaymentActivity extends BaseMVVMActivity<PerformPaymentViewModel, PaymentViewData, ActivityPerformPaymentBinding> implements PerformPaymentView, WebViewNavigator {
    public static final Companion Companion;
    public static final String EXTRA_COMPLETED = "payment_extra_name";
    public static final String EXTRA_REASON = "payment_extra_reason";
    public static final String EXTRA_SUCCESSFUL = "payment_extra_successful";
    public static final String MPOS_CALLBACK_URL = "https://app-service.kudi.ai/callbacks/paypad/%s";
    public static final int MPOS_REQUEST_CODE = 1;
    public AuthDialog authDialog;
    private BillRequest billRequest;
    private String reason;
    private TransactionRequest transactionRequest;
    private TransferRequest transferRequest;
    public PerformPaymentViewModel viewModel;
    private WithdrawToBankRequest withdrawToBankRequest;
    private WithdrawalRequest withdrawalRequest;

    /* compiled from: PerformPaymentActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/bills/ui/PerformPaymentActivity$Companion;", "", "()V", "EXTRA_COMPLETED", "", "EXTRA_REASON", "EXTRA_SUCCESSFUL", "MPOS_CALLBACK_URL", "MPOS_REQUEST_CODE", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.bills.ui.PerformPaymentActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013c, code lost:
        if (r22 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void executeTransaction(android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.p002ui.PerformPaymentActivity.executeTransaction(android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39102onCreate$lambda0(PerformPaymentActivity performPaymentActivity, View view) {
        Log_OC.getArray(performPaymentActivity, "this$0");
        performPaymentActivity.onNextClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m39103onCreate$lambda1(PerformPaymentActivity performPaymentActivity, View view) {
        Log_OC.getArray(performPaymentActivity, "this$0");
        performPaymentActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void performAuthorization(final InterfaceC11756a interfaceC11756a) {
        FragmentManager $r3 = getSupportFragmentManager();
        $r3.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, this, new InterfaceC1523w() { // from class: ai.kudi.agent.bills.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38964c(String str, Bundle bundle) {
                InterfaceC11756a $r32 = InterfaceC11756a.this;
                PerformPaymentActivity.m39104performAuthorization$lambda2($r32, str, bundle);
            }
        });
        FragmentManager $r32 = getSupportFragmentManager();
        $r32.p1(KudiPin.CLOSE_DIALOG_KEY, this, new InterfaceC1523w() { // from class: ai.kudi.agent.bills.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38965b(String str, Bundle bundle) {
                PerformPaymentActivity $r33 = PerformPaymentActivity.this;
                PerformPaymentActivity.m39105performAuthorization$lambda3($r33, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r6 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        FragmentManager $r33 = getSupportFragmentManager();
        ((Chapter) $r6).show($r33, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performAuthorization$lambda-2  reason: not valid java name */
    public static final void m39104performAuthorization$lambda2(InterfaceC11756a interfaceC11756a, String str, Bundle bundle) {
        Log_OC.getArray(interfaceC11756a, "$onAuthSuccess");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        interfaceC11756a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: performAuthorization$lambda-3  reason: not valid java name */
    public static final void m39105performAuthorization$lambda3(PerformPaymentActivity performPaymentActivity, String str, Bundle bundle) {
        Log_OC.getArray(performPaymentActivity, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "bundle");
        boolean $z0 = bundle.getBoolean(KudiPin.IS_AUTHORIZED_KEY);
        if ($z0) {
            return;
        }
        performPaymentActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void setDrawableColor() {
        Drawable $r1 = C1335a.m36322f(this, C0001R.C0002drawable.ic_cancel);
        Log_OC.append($r1);
        Log_OC.loadImage($r1, "getDrawable(this, R.drawable.ic_cancel)!!");
        int $i0 = C1335a.m36324d(this, C0001R.color.grey);
        C1365a.m36188n($r1, $i0);
        InterfaceC8209a $r2 = getBinding();
        ActivityPerformPaymentBinding $r3 = (ActivityPerformPaymentBinding) $r2;
        ImageView $r4 = $r3.cancelImageView;
        $r4.setImageDrawable($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    protected void applyViewData(PaymentViewData paymentViewData) {
        Log_OC.getArray(paymentViewData, "viewData");
        long $l0 = paymentViewData.getPaymentState();
        if ($l0 == 0) {
            showLoading();
        } else if ($l0 == 1) {
            hideLoading();
            String $r3 = paymentViewData.getMessage();
            String $r4 = $r3;
            if ($r3 == null) {
                $r4 = "";
            }
            boolean $z0 = paymentViewData.getShouldOverride();
            String $r32 = paymentViewData.getOverrideTitle();
            showPaymentSuccess($r4, $z0, $r32);
        } else if ($l0 == -1) {
            hideLoading();
            String $r42 = paymentViewData.getMessage();
            String $r33 = $r42;
            if ($r42 == null) {
                $r33 = "";
            }
            showPaymentFailed($r33);
        }
        boolean $z02 = paymentViewData.getDisplayMPOSView();
        if ($z02) {
            int $i2 = paymentViewData.getAmount();
            String $r43 = paymentViewData.getReference();
            String $r2 = $r43 != null ? $r43 : "";
            openMPOSView($i2, $r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PaymentViewData $r2 = (PaymentViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected PerformPaymentViewModel createViewModel() {
        PerformPaymentViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PerformPaymentViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityPerformPaymentBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityPerformPaymentBinding $r2 = ActivityPerformPaymentBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityPerformPaymentBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final AuthDialog getAuthDialog() {
        AuthDialog $r1 = this.authDialog;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("authDialog");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final BillRequest getBillRequest() {
        BillRequest r1 = this.billRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getReason() {
        String r1 = this.reason;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final TransactionRequest getTransactionRequest() {
        TransactionRequest r1 = this.transactionRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final TransferRequest getTransferRequest() {
        TransferRequest r1 = this.transferRequest;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return PerformPaymentViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public final PerformPaymentViewModel getViewModel() {
        PerformPaymentViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final WithdrawToBankRequest getWithdrawToBankRequest() {
        WithdrawToBankRequest r1 = this.withdrawToBankRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final WithdrawalRequest getWithdrawalRequest() {
        WithdrawalRequest r1 = this.withdrawalRequest;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.bills.views.PerformPaymentView
    public void hideLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityPerformPaymentBinding $r2 = (ActivityPerformPaymentBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.users.navigators.WebViewNavigator
    public void navigate(String str) {
        Intent $r2 = new Intent(this, PaymentWebViewActivity.class);
        $r2.putExtra(PaymentWebViewActivity.URL_EXTRA, str);
        startActivity($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1 && i2 != 1) {
                MPOSPaymentMethod $r2 = new MPOSPaymentMethod("failed", "", "", "", "", "CONNECTION_ERROR", "Error Connecting.", "");
                BaseViewModel $r3 = getViewModel();
                PerformPaymentViewModel $r4 = (PerformPaymentViewModel) $r3;
                $r4.completeRequest($r2);
                return;
            }
            Log_OC.append(intent);
            String $r5 = intent.getStringExtra(MPOSActivity.EXTRA_CARD_HOLDER);
            if ($r5 == null) {
                $r5 = "";
            }
            String $r6 = intent.getStringExtra(MPOSActivity.EXTRA_CARD_NO);
            if ($r6 == null) {
                $r6 = "";
            }
            String $r7 = intent.getStringExtra(MPOSActivity.EXTRA_TERMINAL_ID);
            if ($r7 == null) {
                $r7 = "";
            }
            String $r8 = intent.getStringExtra(MPOSActivity.EXTRA_TRANSACTION_ID);
            if ($r8 == null) {
                $r8 = "";
            }
            String $r9 = intent.getStringExtra(MPOSActivity.EXTRA_RESPONSE);
            if ($r9 == null) {
                $r9 = "";
            }
            String $r10 = intent.getStringExtra(MPOSActivity.EXTRA_RESPONSE_CODE);
            if ($r10 == null) {
                $r10 = "";
            }
            String $r11 = intent.getStringExtra(MPOSActivity.EXTRA_RRN);
            if ($r11 == null) {
                $r11 = "";
            }
            String $r12 = i2 == 1 ? "success" : "failed";
            MPOSPaymentMethod $r22 = new MPOSPaymentMethod($r12, $r5, $r6, $r7, $r8, $r10, $r9, $r11);
            BaseViewModel $r32 = getViewModel();
            PerformPaymentViewModel $r42 = (PerformPaymentViewModel) $r32;
            $r42.completeRequest($r22);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException r18 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r18;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        MvpActivity.Companion $r5 = MvpActivity.Companion;
        $r5.stopDisconnectTimer();
        setDrawableColor();
        if (bundle == null) {
            boolean $z0 = getIntent().hasExtra(TransactionRequest.PARCEL_NAME);
            if (!$z0) {
                boolean $z02 = getIntent().getBooleanExtra(EXTRA_COMPLETED, false);
                if (!$z02) {
                    PerformPaymentActivity$onCreate$1 r15 = new PerformPaymentActivity$onCreate$1(this);
                    performAuthorization(r15);
                }
            }
            Intent $r6 = getIntent();
            Log_OC.loadImage($r6, "intent");
            executeTransaction($r6);
        }
        InterfaceC8209a $r8 = getBinding();
        ActivityPerformPaymentBinding $r9 = (ActivityPerformPaymentBinding) $r8;
        ViewGroup $r10 = $r9.nextButton;
        ViewGroup r19 = $r10;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PerformPaymentActivity $r22 = PerformPaymentActivity.this;
                PerformPaymentActivity.m39102onCreate$lambda0($r22, view);
            }
        });
        InterfaceC8209a $r82 = getBinding();
        ActivityPerformPaymentBinding $r92 = (ActivityPerformPaymentBinding) $r82;
        ImageView $r12 = $r92.cancelImageView;
        $r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PerformPaymentActivity $r22 = PerformPaymentActivity.this;
                PerformPaymentActivity.m39103onCreate$lambda1($r22, view);
            }
        });
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        executeTransaction(intent);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void onNextClicked() {
        Intent $r1 = new Intent(this, HomeActivity.class);
        $r1.setFlags(268468224);
        startActivity($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.bills.views.PerformPaymentView
    public void openMPOSView(int i, String str) {
        Log_OC.getArray(str, "reference");
        Intent $r2 = new Intent(this, MPOSActivity.class);
        $r2.putExtra(MPOSActivity.EXTRA_AMOUNT, i);
        C11780a0 c11780a0 = C11780a0.f26475a;
        Object[] $r4 = {str};
        String $r1 = String.format(MPOS_CALLBACK_URL, Arrays.copyOf($r4, 1));
        Log_OC.loadImage($r1, "java.lang.String.format(format, *args)");
        $r2.putExtra(MPOSActivity.EXTRA_CALLBACK_URL, $r1);
        startActivityForResult($r2, 1);
    }

    public final void setAuthDialog(AuthDialog authDialog) {
        Log_OC.getArray(authDialog, "<set-?>");
        this.authDialog = authDialog;
    }

    public final void setBillRequest(BillRequest billRequest) {
        this.billRequest = billRequest;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setTransactionRequest(TransactionRequest transactionRequest) {
        this.transactionRequest = transactionRequest;
    }

    public final void setTransferRequest(TransferRequest transferRequest) {
        this.transferRequest = transferRequest;
    }

    public final void setViewModel(PerformPaymentViewModel performPaymentViewModel) {
        Log_OC.getArray(performPaymentViewModel, "<set-?>");
        this.viewModel = performPaymentViewModel;
    }

    public final void setWithdrawToBankRequest(WithdrawToBankRequest withdrawToBankRequest) {
        this.withdrawToBankRequest = withdrawToBankRequest;
    }

    public final void setWithdrawalRequest(WithdrawalRequest withdrawalRequest) {
        this.withdrawalRequest = withdrawalRequest;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.bills.views.PerformPaymentView
    public void showLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityPerformPaymentBinding $r2 = (ActivityPerformPaymentBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r7 = $r4;
        ViewExtKt.show(r7);
        InterfaceC8209a $r12 = getBinding();
        ActivityPerformPaymentBinding $r22 = (ActivityPerformPaymentBinding) $r12;
        TextView $r5 = $r22.statusTextView;
        Log_OC.loadImage($r5, "binding.statusTextView");
        ViewExtKt.show($r5);
        InterfaceC8209a $r13 = getBinding();
        ActivityPerformPaymentBinding $r23 = (ActivityPerformPaymentBinding) $r13;
        TextView $r52 = $r23.statusTextView;
        String $r6 = getString(C0001R.string.processing_payment);
        $r52.setText($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.bills.views.PerformPaymentView
    public void showPaymentFailed(String str) {
        Log_OC.getArray(str, "reason");
        hideLoading();
        InterfaceC8209a $r2 = getBinding();
        ActivityPerformPaymentBinding $r3 = (ActivityPerformPaymentBinding) $r2;
        ImageView $r4 = $r3.statusImageView;
        $r4.setVisibility(0);
        InterfaceC8209a $r22 = getBinding();
        ActivityPerformPaymentBinding $r32 = (ActivityPerformPaymentBinding) $r22;
        View $r5 = $r32.nextButton;
        Log_OC.loadImage($r5, "binding.nextButton");
        View r8 = $r5;
        ViewExtKt.show(r8);
        InterfaceC8209a $r23 = getBinding();
        ActivityPerformPaymentBinding $r33 = (ActivityPerformPaymentBinding) $r23;
        ImageView $r42 = $r33.statusImageView;
        Drawable $r6 = C1335a.m36322f(this, C0001R.C0002drawable.ic_failed_transaction_status);
        $r42.setImageDrawable($r6);
        InterfaceC8209a $r24 = getBinding();
        ActivityPerformPaymentBinding $r34 = (ActivityPerformPaymentBinding) $r24;
        TextView $r7 = $r34.statusTextView;
        String $r1 = getString(C0001R.string.payment_failed);
        $r7.setText($r1);
        InterfaceC8209a $r25 = getBinding();
        ActivityPerformPaymentBinding $r35 = (ActivityPerformPaymentBinding) $r25;
        ViewGroup r9 = $r35.nextButton;
        r9.setVisibility(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.bills.views.PerformPaymentView
    public void showPaymentSuccess(String str, boolean z, String str2) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Log_OC.getArray(str2, "overrideMessage");
        hideLoading();
        InterfaceC8209a $r3 = getBinding();
        ActivityPerformPaymentBinding $r4 = (ActivityPerformPaymentBinding) $r3;
        ImageView $r5 = $r4.statusImageView;
        $r5.setVisibility(0);
        InterfaceC8209a $r32 = getBinding();
        ActivityPerformPaymentBinding $r42 = (ActivityPerformPaymentBinding) $r32;
        ImageView $r52 = $r42.statusImageView;
        Drawable $r6 = C1335a.m36322f(this, C0001R.C0002drawable.ic_successful_transaction_status);
        $r52.setImageDrawable($r6);
        InterfaceC8209a $r33 = getBinding();
        ActivityPerformPaymentBinding $r43 = (ActivityPerformPaymentBinding) $r33;
        View $r7 = $r43.nextButton;
        Log_OC.loadImage($r7, "binding.nextButton");
        View r9 = $r7;
        ViewExtKt.show(r9);
        if (z) {
            InterfaceC8209a $r34 = getBinding();
            ActivityPerformPaymentBinding $r44 = (ActivityPerformPaymentBinding) $r34;
            TextView $r8 = $r44.statusTextView;
            $r8.setText(str2);
        } else {
            InterfaceC8209a $r35 = getBinding();
            ActivityPerformPaymentBinding $r45 = (ActivityPerformPaymentBinding) $r35;
            TextView $r82 = $r45.statusTextView;
            String $r2 = getString(C0001R.string.payment_successful);
            $r82.setText($r2);
        }
        InterfaceC8209a $r36 = getBinding();
        ActivityPerformPaymentBinding $r46 = (ActivityPerformPaymentBinding) $r36;
        ViewGroup r10 = $r46.nextButton;
        r10.setVisibility(0);
    }
}
