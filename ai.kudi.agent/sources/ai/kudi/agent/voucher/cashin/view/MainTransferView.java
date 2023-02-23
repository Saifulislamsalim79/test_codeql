package ai.kudi.agent.voucher.cashin.view;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: MainTransferView.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&J\u0014\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\tH&J8\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019H&¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "navigateToAccountDetailsPage", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "isFromSummaryPage", "", "navigateToAmountPage", "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "navigateToBankTransferAmountPage", "isCashOutFlow", "navigateToBankTransferSummaryPage", "navigateToCustomersInformationPage", "navigateToMultipleBankTransferPage", "navigateToRecipientPage", "navigateToSenderPage", "navigateToSummaryPage", "showAlertDialog", MetricTracker.Object.MESSAGE, "", "buttonText", "upperCaseText", "cancelable", "buttonAction", "Lkotlin/Function0;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface MainTransferView extends LoginListener {

    /* compiled from: MainTransferView.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void navigateToAccountDetailsPage$default(MainTransferView mainTransferView, TransferToBankPayload transferToBankPayload, boolean $z0, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToAccountDetailsPage");
                throw $r3;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            mainTransferView.navigateToAccountDetailsPage(transferToBankPayload, $z0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void navigateToAmountPage$default(MainTransferView mainTransferView, VoucherCashInRequest voucherCashInRequest, boolean $z0, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToAmountPage");
                throw $r3;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            mainTransferView.navigateToAmountPage(voucherCashInRequest, $z0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void navigateToBankTransferAmountPage$default(MainTransferView mainTransferView, TransferToBankPayload transferToBankPayload, boolean $z0, boolean $z1, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToBankTransferAmountPage");
                throw $r3;
            }
            int $i1 = i & 2;
            if ($i1 != 0) {
                $z0 = false;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $z1 = false;
            }
            mainTransferView.navigateToBankTransferAmountPage(transferToBankPayload, $z0, $z1);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void navigateToBankTransferSummaryPage$default(MainTransferView mainTransferView, TransferToBankPayload transferToBankPayload, boolean $z0, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToBankTransferSummaryPage");
                throw $r3;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            mainTransferView.navigateToBankTransferSummaryPage(transferToBankPayload, $z0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void navigateToCustomersInformationPage$default(MainTransferView mainTransferView, TransferToBankPayload transferToBankPayload, boolean $z0, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToCustomersInformationPage");
                throw $r3;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            mainTransferView.navigateToCustomersInformationPage(transferToBankPayload, $z0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void navigateToMultipleBankTransferPage$default(MainTransferView mainTransferView, TransferToBankPayload $r2, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToMultipleBankTransferPage");
                throw $r3;
            }
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = null;
            }
            mainTransferView.navigateToMultipleBankTransferPage($r2);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void navigateToRecipientPage$default(MainTransferView mainTransferView, VoucherCashInRequest voucherCashInRequest, boolean $z0, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToRecipientPage");
                throw $r3;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            mainTransferView.navigateToRecipientPage(voucherCashInRequest, $z0);
        }
    }

    void navigateToAccountDetailsPage(TransferToBankPayload transferToBankPayload, boolean z);

    void navigateToAmountPage(VoucherCashInRequest voucherCashInRequest, boolean z);

    void navigateToBankTransferAmountPage(TransferToBankPayload transferToBankPayload, boolean z, boolean z2);

    void navigateToBankTransferSummaryPage(TransferToBankPayload transferToBankPayload, boolean z);

    void navigateToCustomersInformationPage(TransferToBankPayload transferToBankPayload, boolean z);

    void navigateToMultipleBankTransferPage(TransferToBankPayload transferToBankPayload);

    void navigateToRecipientPage(VoucherCashInRequest voucherCashInRequest, boolean z);

    void navigateToSenderPage(VoucherCashInRequest voucherCashInRequest);

    void navigateToSummaryPage(VoucherCashInRequest voucherCashInRequest);

    void showAlertDialog(String str, String str2, boolean z, boolean z2, InterfaceC11756a interfaceC11756a);
}
