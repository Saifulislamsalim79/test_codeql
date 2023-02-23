package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransferToBankAnalytics.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001:\u0001\u0015J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J,\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J,\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J$\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/TransferToBankAnalytics;", "", "onAmountEntered", "", AttributeType.PHONE, "", TransactionField.STATUS, "", "errorMessage", "onCustomerInfoEntered", "transactionNote", "onEditAccountDetailsClicked", "onEditAmountClicked", "onEditCustomerInfoClicked", "onFinalTransferPerformed", "onPerformAccountNameLookup", BanksWithMethods.BANK_NAME, "onPerformServiceFeeLookup", "onPinEnteredClicked", "onSendAmountClicked", "onSubmitAccountDetails", "EventType", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransferToBankAnalytics {

    /* compiled from: TransferToBankAnalytics.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
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
        public static /* synthetic */ void onAmountEntered$default(TransferToBankAnalytics transferToBankAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAmountEntered");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            transferToBankAnalytics.onAmountEntered(str, z, $r3);
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
        public static /* synthetic */ void onCustomerInfoEntered$default(TransferToBankAnalytics transferToBankAnalytics, String str, String str2, boolean z, String $r4, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCustomerInfoEntered");
                throw $r5;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = null;
            }
            transferToBankAnalytics.onCustomerInfoEntered(str, str2, z, $r4);
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
        public static /* synthetic */ void onFinalTransferPerformed$default(TransferToBankAnalytics transferToBankAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFinalTransferPerformed");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            transferToBankAnalytics.onFinalTransferPerformed(str, z, $r3);
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
        public static /* synthetic */ void onPerformAccountNameLookup$default(TransferToBankAnalytics transferToBankAnalytics, String str, String str2, boolean z, String $r4, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPerformAccountNameLookup");
                throw $r5;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = null;
            }
            transferToBankAnalytics.onPerformAccountNameLookup(str, str2, z, $r4);
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
        public static /* synthetic */ void onPerformServiceFeeLookup$default(TransferToBankAnalytics transferToBankAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPerformServiceFeeLookup");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            transferToBankAnalytics.onPerformServiceFeeLookup(str, z, $r3);
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
        public static /* synthetic */ void onPinEnteredClicked$default(TransferToBankAnalytics transferToBankAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPinEnteredClicked");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            transferToBankAnalytics.onPinEnteredClicked(str, z, $r3);
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
        public static /* synthetic */ void onSendAmountClicked$default(TransferToBankAnalytics transferToBankAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSendAmountClicked");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            transferToBankAnalytics.onSendAmountClicked(str, z, $r3);
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
        public static /* synthetic */ void onSubmitAccountDetails$default(TransferToBankAnalytics transferToBankAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSubmitAccountDetails");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            transferToBankAnalytics.onSubmitAccountDetails(str, z, $r3);
        }
    }

    /* compiled from: TransferToBankAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/TransferToBankAnalytics$EventType;", "", "()V", "TransferFlowEvents", "TransferParameters", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class EventType {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TransferToBankAnalytics.kt */
        @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/TransferToBankAnalytics$EventType$TransferFlowEvents;", "", "(Ljava/lang/String;I)V", "toString", "", "PERFORM_ACCOUNT_LOOKUP", "SUBMIT_ACCOUNT_DETAILS", "EDIT_ACCOUNT_DETAILS", "SUBMIT_AMOUNT", "SUBMIT_CUSTOMER_INFO", "EDIT_AMOUNT", "EDIT_CUSTOMER_INFO", "CONFIRM_TRANSFER_SUMMARY", "SUBMIT_KUDI_PIN", "PERFORM_FINAL_TRANSFER", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class TransferFlowEvents {
            private static final /* synthetic */ TransferFlowEvents[] $VALUES;
            public static final TransferFlowEvents CONFIRM_TRANSFER_SUMMARY;
            public static final TransferFlowEvents EDIT_ACCOUNT_DETAILS;
            public static final TransferFlowEvents EDIT_AMOUNT;
            public static final TransferFlowEvents EDIT_CUSTOMER_INFO;
            public static final TransferFlowEvents PERFORM_ACCOUNT_LOOKUP;
            public static final TransferFlowEvents PERFORM_FINAL_TRANSFER;
            public static final TransferFlowEvents SUBMIT_ACCOUNT_DETAILS;
            public static final TransferFlowEvents SUBMIT_AMOUNT;
            public static final TransferFlowEvents SUBMIT_CUSTOMER_INFO;
            public static final TransferFlowEvents SUBMIT_KUDI_PIN;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            private static final /* synthetic */ TransferFlowEvents[] $values() {
                TransferFlowEvents $r1 = PERFORM_ACCOUNT_LOOKUP;
                TransferFlowEvents $r12 = SUBMIT_ACCOUNT_DETAILS;
                TransferFlowEvents $r13 = EDIT_ACCOUNT_DETAILS;
                TransferFlowEvents $r14 = SUBMIT_AMOUNT;
                TransferFlowEvents $r15 = SUBMIT_CUSTOMER_INFO;
                TransferFlowEvents $r16 = EDIT_AMOUNT;
                TransferFlowEvents $r17 = EDIT_CUSTOMER_INFO;
                TransferFlowEvents $r18 = CONFIRM_TRANSFER_SUMMARY;
                TransferFlowEvents $r19 = SUBMIT_KUDI_PIN;
                TransferFlowEvents $r110 = PERFORM_FINAL_TRANSFER;
                TransferFlowEvents[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110};
                return $r0;
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
                TransferFlowEvents $r1 = new TransferFlowEvents("PERFORM_ACCOUNT_LOOKUP", 0);
                PERFORM_ACCOUNT_LOOKUP = $r1;
                TransferFlowEvents $r12 = new TransferFlowEvents("SUBMIT_ACCOUNT_DETAILS", 1);
                SUBMIT_ACCOUNT_DETAILS = $r12;
                TransferFlowEvents $r13 = new TransferFlowEvents("EDIT_ACCOUNT_DETAILS", 2);
                EDIT_ACCOUNT_DETAILS = $r13;
                TransferFlowEvents $r14 = new TransferFlowEvents("SUBMIT_AMOUNT", 3);
                SUBMIT_AMOUNT = $r14;
                TransferFlowEvents $r15 = new TransferFlowEvents("SUBMIT_CUSTOMER_INFO", 4);
                SUBMIT_CUSTOMER_INFO = $r15;
                TransferFlowEvents $r16 = new TransferFlowEvents("EDIT_AMOUNT", 5);
                EDIT_AMOUNT = $r16;
                TransferFlowEvents $r17 = new TransferFlowEvents("EDIT_CUSTOMER_INFO", 6);
                EDIT_CUSTOMER_INFO = $r17;
                TransferFlowEvents $r18 = new TransferFlowEvents("CONFIRM_TRANSFER_SUMMARY", 7);
                CONFIRM_TRANSFER_SUMMARY = $r18;
                TransferFlowEvents $r19 = new TransferFlowEvents("SUBMIT_KUDI_PIN", 8);
                SUBMIT_KUDI_PIN = $r19;
                TransferFlowEvents $r110 = new TransferFlowEvents("PERFORM_FINAL_TRANSFER", 9);
                PERFORM_FINAL_TRANSFER = $r110;
                TransferFlowEvents[] $r0 = $values();
                $VALUES = $r0;
            }

            private TransferFlowEvents(String str, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            public static TransferFlowEvents valueOf(String str) {
                Enum $r0 = Enum.valueOf(TransferFlowEvents.class, str);
                TransferFlowEvents $r2 = (TransferFlowEvents) $r0;
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
            public static TransferFlowEvents[] values() {
                TransferFlowEvents[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                TransferFlowEvents[] $r12 = (TransferFlowEvents[]) $r0;
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // java.lang.Enum
            public String toString() {
                String $r1 = name();
                if ($r1 == null) {
                    NullPointerException $r2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    throw $r2;
                }
                String $r12 = $r1.toLowerCase();
                Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase()");
                return $r12;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TransferToBankAnalytics.kt */
        @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/TransferToBankAnalytics$EventType$TransferParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE_NUMBER", "TRANSACTION_NOTE", "BANK_NAME", "STATUS", "ERROR_MESSAGE", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class TransferParameters {
            private static final /* synthetic */ TransferParameters[] $VALUES;
            public static final TransferParameters BANK_NAME;
            public static final TransferParameters ERROR_MESSAGE;
            public static final TransferParameters PHONE_NUMBER;
            public static final TransferParameters STATUS;
            public static final TransferParameters TRANSACTION_NOTE;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            private static final /* synthetic */ TransferParameters[] $values() {
                TransferParameters $r1 = PHONE_NUMBER;
                TransferParameters $r12 = TRANSACTION_NOTE;
                TransferParameters $r13 = BANK_NAME;
                TransferParameters $r14 = STATUS;
                TransferParameters $r15 = ERROR_MESSAGE;
                TransferParameters[] $r0 = {$r1, $r12, $r13, $r14, $r15};
                return $r0;
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
                TransferParameters $r1 = new TransferParameters("PHONE_NUMBER", 0);
                PHONE_NUMBER = $r1;
                TransferParameters $r12 = new TransferParameters("TRANSACTION_NOTE", 1);
                TRANSACTION_NOTE = $r12;
                TransferParameters $r13 = new TransferParameters("BANK_NAME", 2);
                BANK_NAME = $r13;
                TransferParameters $r14 = new TransferParameters("STATUS", 3);
                STATUS = $r14;
                TransferParameters $r15 = new TransferParameters("ERROR_MESSAGE", 4);
                ERROR_MESSAGE = $r15;
                TransferParameters[] $r0 = $values();
                $VALUES = $r0;
            }

            private TransferParameters(String str, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            public static TransferParameters valueOf(String str) {
                Enum $r0 = Enum.valueOf(TransferParameters.class, str);
                TransferParameters $r2 = (TransferParameters) $r0;
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
            public static TransferParameters[] values() {
                TransferParameters[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                TransferParameters[] $r12 = (TransferParameters[]) $r0;
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // java.lang.Enum
            public String toString() {
                String $r1 = name();
                if ($r1 == null) {
                    NullPointerException $r2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    throw $r2;
                }
                String $r12 = $r1.toLowerCase();
                Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase()");
                return $r12;
            }
        }
    }

    void onAmountEntered(String str, boolean z, String str2);

    void onCustomerInfoEntered(String str, String str2, boolean z, String str3);

    void onEditAccountDetailsClicked();

    void onEditAmountClicked();

    void onEditCustomerInfoClicked();

    void onFinalTransferPerformed(String str, boolean z, String str2);

    void onPerformAccountNameLookup(String str, String str2, boolean z, String str3);

    void onPerformServiceFeeLookup(String str, boolean z, String str2);

    void onPinEnteredClicked(String str, boolean z, String str2);

    void onSendAmountClicked(String str, boolean z, String str2);

    void onSubmitAccountDetails(String str, boolean z, String str2);
}
