package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ReferralAnalytics.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0014J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H&J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H&J,\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H&J,\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/ReferralAnalytics;", "", "buzzReferredAgentClicked", "", "phoneNumber", "", "referredPhoneNumber", TransactionField.STATUS, "", "errorMessage", "listOfReferredAgentsClicked", "onAgentReferralCreation", "onAgentReferralInfoEvent", "user", "Lai/kudi/agent/users/domain/dto/User;", "viewEarningsClicked", "viewReferredAgentSummaryClicked", "withdrawAvailableFundsClicked", TransactionField.AMOUNT, "", "EventType", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ReferralAnalytics {

    /* compiled from: ReferralAnalytics.kt */
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
        public static /* synthetic */ void buzzReferredAgentClicked$default(ReferralAnalytics referralAnalytics, String str, String str2, boolean z, String $r4, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buzzReferredAgentClicked");
                throw $r5;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = null;
            }
            referralAnalytics.buzzReferredAgentClicked(str, str2, z, $r4);
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
        public static /* synthetic */ void listOfReferredAgentsClicked$default(ReferralAnalytics referralAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listOfReferredAgentsClicked");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            referralAnalytics.listOfReferredAgentsClicked(str, z, $r3);
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
        public static /* synthetic */ void onAgentReferralCreation$default(ReferralAnalytics referralAnalytics, String str, String str2, boolean z, String $r4, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAgentReferralCreation");
                throw $r5;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = null;
            }
            referralAnalytics.onAgentReferralCreation(str, str2, z, $r4);
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
        public static /* synthetic */ void viewEarningsClicked$default(ReferralAnalytics referralAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: viewEarningsClicked");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            referralAnalytics.viewEarningsClicked(str, z, $r3);
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
        public static /* synthetic */ void viewReferredAgentSummaryClicked$default(ReferralAnalytics referralAnalytics, String str, String str2, boolean z, String $r4, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: viewReferredAgentSummaryClicked");
                throw $r5;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = null;
            }
            referralAnalytics.viewReferredAgentSummaryClicked(str, str2, z, $r4);
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
        public static /* synthetic */ void withdrawAvailableFundsClicked$default(ReferralAnalytics referralAnalytics, String str, double d, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withdrawAvailableFundsClicked");
                throw $r4;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r3 = null;
            }
            referralAnalytics.withdrawAvailableFundsClicked(str, d, z, $r3);
        }
    }

    /* compiled from: ReferralAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/ReferralAnalytics$EventType;", "", "()V", "AgentReferralParameters", "AgentReferralType", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class EventType {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ReferralAnalytics.kt */
        @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/ReferralAnalytics$EventType$AgentReferralParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE_NUMBER", "REFERRED_PHONE_NUMBER", "STATUS", PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, "ERROR_MESSAGE", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class AgentReferralParameters {
            private static final /* synthetic */ AgentReferralParameters[] $VALUES;
            public static final AgentReferralParameters AMOUNT;
            public static final AgentReferralParameters ERROR_MESSAGE;
            public static final AgentReferralParameters PHONE_NUMBER;
            public static final AgentReferralParameters REFERRED_PHONE_NUMBER;
            public static final AgentReferralParameters STATUS;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            private static final /* synthetic */ AgentReferralParameters[] $values() {
                AgentReferralParameters $r1 = PHONE_NUMBER;
                AgentReferralParameters $r12 = REFERRED_PHONE_NUMBER;
                AgentReferralParameters $r13 = STATUS;
                AgentReferralParameters $r14 = AMOUNT;
                AgentReferralParameters $r15 = ERROR_MESSAGE;
                AgentReferralParameters[] $r0 = {$r1, $r12, $r13, $r14, $r15};
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
                AgentReferralParameters $r1 = new AgentReferralParameters("PHONE_NUMBER", 0);
                PHONE_NUMBER = $r1;
                AgentReferralParameters $r12 = new AgentReferralParameters("REFERRED_PHONE_NUMBER", 1);
                REFERRED_PHONE_NUMBER = $r12;
                AgentReferralParameters $r13 = new AgentReferralParameters("STATUS", 2);
                STATUS = $r13;
                AgentReferralParameters $r14 = new AgentReferralParameters(PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, 3);
                AMOUNT = $r14;
                AgentReferralParameters $r15 = new AgentReferralParameters("ERROR_MESSAGE", 4);
                ERROR_MESSAGE = $r15;
                AgentReferralParameters[] $r0 = $values();
                $VALUES = $r0;
            }

            private AgentReferralParameters(String str, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            public static AgentReferralParameters valueOf(String str) {
                Enum $r0 = Enum.valueOf(AgentReferralParameters.class, str);
                AgentReferralParameters $r2 = (AgentReferralParameters) $r0;
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
            public static AgentReferralParameters[] values() {
                AgentReferralParameters[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                AgentReferralParameters[] $r12 = (AgentReferralParameters[]) $r0;
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
        /* compiled from: ReferralAnalytics.kt */
        @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/ReferralAnalytics$EventType$AgentReferralType;", "", "(Ljava/lang/String;I)V", "toString", "", "START_AGENT_REFERRAL", "REFER_AGENT_CLICKED", "LIST_OF_REFERRED_AGENT_CLICKED", "VIEW_EARNINGS_CLICKED", "WITHDRAW_AVAILABLE_FUNDS_CLICKED", "BUZZ_REFERRED_AGENT_CLICKED", "VIEW_REFERRED_AGENT_SUMMARY_CLICKED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class AgentReferralType {
            private static final /* synthetic */ AgentReferralType[] $VALUES;
            public static final AgentReferralType BUZZ_REFERRED_AGENT_CLICKED;
            public static final AgentReferralType LIST_OF_REFERRED_AGENT_CLICKED;
            public static final AgentReferralType REFER_AGENT_CLICKED;
            public static final AgentReferralType START_AGENT_REFERRAL;
            public static final AgentReferralType VIEW_EARNINGS_CLICKED;
            public static final AgentReferralType VIEW_REFERRED_AGENT_SUMMARY_CLICKED;
            public static final AgentReferralType WITHDRAW_AVAILABLE_FUNDS_CLICKED;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            private static final /* synthetic */ AgentReferralType[] $values() {
                AgentReferralType $r1 = START_AGENT_REFERRAL;
                AgentReferralType $r12 = REFER_AGENT_CLICKED;
                AgentReferralType $r13 = LIST_OF_REFERRED_AGENT_CLICKED;
                AgentReferralType $r14 = VIEW_EARNINGS_CLICKED;
                AgentReferralType $r15 = WITHDRAW_AVAILABLE_FUNDS_CLICKED;
                AgentReferralType $r16 = BUZZ_REFERRED_AGENT_CLICKED;
                AgentReferralType $r17 = VIEW_REFERRED_AGENT_SUMMARY_CLICKED;
                AgentReferralType[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17};
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
                AgentReferralType $r1 = new AgentReferralType("START_AGENT_REFERRAL", 0);
                START_AGENT_REFERRAL = $r1;
                AgentReferralType $r12 = new AgentReferralType("REFER_AGENT_CLICKED", 1);
                REFER_AGENT_CLICKED = $r12;
                AgentReferralType $r13 = new AgentReferralType("LIST_OF_REFERRED_AGENT_CLICKED", 2);
                LIST_OF_REFERRED_AGENT_CLICKED = $r13;
                AgentReferralType $r14 = new AgentReferralType("VIEW_EARNINGS_CLICKED", 3);
                VIEW_EARNINGS_CLICKED = $r14;
                AgentReferralType $r15 = new AgentReferralType("WITHDRAW_AVAILABLE_FUNDS_CLICKED", 4);
                WITHDRAW_AVAILABLE_FUNDS_CLICKED = $r15;
                AgentReferralType $r16 = new AgentReferralType("BUZZ_REFERRED_AGENT_CLICKED", 5);
                BUZZ_REFERRED_AGENT_CLICKED = $r16;
                AgentReferralType $r17 = new AgentReferralType("VIEW_REFERRED_AGENT_SUMMARY_CLICKED", 6);
                VIEW_REFERRED_AGENT_SUMMARY_CLICKED = $r17;
                AgentReferralType[] $r0 = $values();
                $VALUES = $r0;
            }

            private AgentReferralType(String str, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            public static AgentReferralType valueOf(String str) {
                Enum $r0 = Enum.valueOf(AgentReferralType.class, str);
                AgentReferralType $r2 = (AgentReferralType) $r0;
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
            public static AgentReferralType[] values() {
                AgentReferralType[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                AgentReferralType[] $r12 = (AgentReferralType[]) $r0;
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

    void buzzReferredAgentClicked(String str, String str2, boolean z, String str3);

    void listOfReferredAgentsClicked(String str, boolean z, String str2);

    void onAgentReferralCreation(String str, String str2, boolean z, String str3);

    void onAgentReferralInfoEvent(User user);

    void viewEarningsClicked(String str, boolean z, String str2);

    void viewReferredAgentSummaryClicked(String str, String str2, boolean z, String str3);

    void withdrawAvailableFundsClicked(String str, double d, boolean z, String str2);
}
