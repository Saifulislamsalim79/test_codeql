package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: WalletTopUpAnalytics.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/WalletTopUpAnalytics;", "", "onAmountEntered", "", "phoneNumber", "", KshockPendingLoansListFragment.KEY_MAX_LOAN_AMT, "onBankSelected", TransactionField.STATUS, "", "onCardPageVisited", "onFundWalletClicked", "onKtaPageVisited", "onNewCardAdded", "onUssdCodeCopied", "onUssdCodeDialed", "EventType", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface WalletTopUpAnalytics {

    /* compiled from: WalletTopUpAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/WalletTopUpAnalytics$EventType;", "", "()V", "WalletTopUpEvents", "WalletTopUpParams", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class EventType {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WalletTopUpAnalytics.kt */
        @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/WalletTopUpAnalytics$EventType$WalletTopUpEvents;", "", "(Ljava/lang/String;I)V", "toString", "", "CLICKED_FUND_WALLET", "ENTER_AMOUNT", "VISIT_KTA_PAGE", "SELECT_BANK", "DIAL_USSD_CODE", "COPY_USSD_CODE", "VISIT_CARD_PAGE", "ADD_NEW_CARD", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class WalletTopUpEvents {
            private static final /* synthetic */ WalletTopUpEvents[] $VALUES;
            public static final WalletTopUpEvents ADD_NEW_CARD;
            public static final WalletTopUpEvents CLICKED_FUND_WALLET;
            public static final WalletTopUpEvents COPY_USSD_CODE;
            public static final WalletTopUpEvents DIAL_USSD_CODE;
            public static final WalletTopUpEvents ENTER_AMOUNT;
            public static final WalletTopUpEvents SELECT_BANK;
            public static final WalletTopUpEvents VISIT_CARD_PAGE;
            public static final WalletTopUpEvents VISIT_KTA_PAGE;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            private static final /* synthetic */ WalletTopUpEvents[] $values() {
                WalletTopUpEvents $r1 = CLICKED_FUND_WALLET;
                WalletTopUpEvents $r12 = ENTER_AMOUNT;
                WalletTopUpEvents $r13 = VISIT_KTA_PAGE;
                WalletTopUpEvents $r14 = SELECT_BANK;
                WalletTopUpEvents $r15 = DIAL_USSD_CODE;
                WalletTopUpEvents $r16 = COPY_USSD_CODE;
                WalletTopUpEvents $r17 = VISIT_CARD_PAGE;
                WalletTopUpEvents $r18 = ADD_NEW_CARD;
                WalletTopUpEvents[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18};
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
                WalletTopUpEvents $r1 = new WalletTopUpEvents("CLICKED_FUND_WALLET", 0);
                CLICKED_FUND_WALLET = $r1;
                WalletTopUpEvents $r12 = new WalletTopUpEvents("ENTER_AMOUNT", 1);
                ENTER_AMOUNT = $r12;
                WalletTopUpEvents $r13 = new WalletTopUpEvents("VISIT_KTA_PAGE", 2);
                VISIT_KTA_PAGE = $r13;
                WalletTopUpEvents $r14 = new WalletTopUpEvents("SELECT_BANK", 3);
                SELECT_BANK = $r14;
                WalletTopUpEvents $r15 = new WalletTopUpEvents("DIAL_USSD_CODE", 4);
                DIAL_USSD_CODE = $r15;
                WalletTopUpEvents $r16 = new WalletTopUpEvents("COPY_USSD_CODE", 5);
                COPY_USSD_CODE = $r16;
                WalletTopUpEvents $r17 = new WalletTopUpEvents("VISIT_CARD_PAGE", 6);
                VISIT_CARD_PAGE = $r17;
                WalletTopUpEvents $r18 = new WalletTopUpEvents("ADD_NEW_CARD", 7);
                ADD_NEW_CARD = $r18;
                WalletTopUpEvents[] $r0 = $values();
                $VALUES = $r0;
            }

            private WalletTopUpEvents(String str, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            public static WalletTopUpEvents valueOf(String str) {
                Enum $r0 = Enum.valueOf(WalletTopUpEvents.class, str);
                WalletTopUpEvents $r2 = (WalletTopUpEvents) $r0;
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
            public static WalletTopUpEvents[] values() {
                WalletTopUpEvents[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                WalletTopUpEvents[] $r12 = (WalletTopUpEvents[]) $r0;
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
        /* compiled from: WalletTopUpAnalytics.kt */
        @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/WalletTopUpAnalytics$EventType$WalletTopUpParams;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE_NUMBER", PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, "STATUS", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class WalletTopUpParams {
            private static final /* synthetic */ WalletTopUpParams[] $VALUES;
            public static final WalletTopUpParams AMOUNT;
            public static final WalletTopUpParams PHONE_NUMBER;
            public static final WalletTopUpParams STATUS;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            private static final /* synthetic */ WalletTopUpParams[] $values() {
                WalletTopUpParams $r1 = PHONE_NUMBER;
                WalletTopUpParams $r12 = AMOUNT;
                WalletTopUpParams $r13 = STATUS;
                WalletTopUpParams[] $r0 = {$r1, $r12, $r13};
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
                WalletTopUpParams $r1 = new WalletTopUpParams("PHONE_NUMBER", 0);
                PHONE_NUMBER = $r1;
                WalletTopUpParams $r12 = new WalletTopUpParams(PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, 1);
                AMOUNT = $r12;
                WalletTopUpParams $r13 = new WalletTopUpParams("STATUS", 2);
                STATUS = $r13;
                WalletTopUpParams[] $r0 = $values();
                $VALUES = $r0;
            }

            private WalletTopUpParams(String str, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            public static WalletTopUpParams valueOf(String str) {
                Enum $r0 = Enum.valueOf(WalletTopUpParams.class, str);
                WalletTopUpParams $r2 = (WalletTopUpParams) $r0;
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
            public static WalletTopUpParams[] values() {
                WalletTopUpParams[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                WalletTopUpParams[] $r12 = (WalletTopUpParams[]) $r0;
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

    void onAmountEntered(String str, String str2);

    void onBankSelected(String str, boolean z);

    void onCardPageVisited(String str);

    void onFundWalletClicked(String str);

    void onKtaPageVisited(String str);

    void onNewCardAdded();

    void onUssdCodeCopied(String str, boolean z);

    void onUssdCodeDialed(String str, boolean z);
}
