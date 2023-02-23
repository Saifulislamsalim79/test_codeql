package ai.kudi.agent.kshock;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: KShockAnalytics.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/kshock/KShockAnalytics;", "", "()V", "Actions", "Events", "Parameters", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KShockAnalytics {

    /* compiled from: KShockAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/kshock/KShockAnalytics$Actions;", "", "onKShockLanding", "", AttributeType.PHONE, "", "onKShockPinEntered", "onKShockTermsAndCondition", TransactionField.STATUS, "", "onLoanAmountEntered", TransactionField.AMOUNT, "", "onLoanApplicationSubmitted", "onLoanStatus", "loanStatus", "onLoanSummary", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Actions {
        void onKShockLanding(String str);

        void onKShockPinEntered(String str);

        void onKShockTermsAndCondition(String str, boolean z);

        void onLoanAmountEntered(String str, double d);

        void onLoanApplicationSubmitted(String str);

        void onLoanStatus(String str, String str2);

        void onLoanSummary(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KShockAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/kshock/KShockAnalytics$Events;", "", "(Ljava/lang/String;I)V", "toString", "", "KSHOCK_LANDING", "TERMS_AND_CONDITION", "LOAN_AMOUNT", "LOAN_SUMMARY", "ENTER_PIN", "SUCCESS_PAGE", "LOAN_STATUS_PAGE", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Events {
        private static final /* synthetic */ Events[] $VALUES;
        public static final Events ENTER_PIN;
        public static final Events KSHOCK_LANDING;
        public static final Events LOAN_AMOUNT;
        public static final Events LOAN_STATUS_PAGE;
        public static final Events LOAN_SUMMARY;
        public static final Events SUCCESS_PAGE;
        public static final Events TERMS_AND_CONDITION;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Events[] $values() {
            Events $r1 = KSHOCK_LANDING;
            Events $r12 = TERMS_AND_CONDITION;
            Events $r13 = LOAN_AMOUNT;
            Events $r14 = LOAN_SUMMARY;
            Events $r15 = ENTER_PIN;
            Events $r16 = SUCCESS_PAGE;
            Events $r17 = LOAN_STATUS_PAGE;
            Events[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17};
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
            Events $r1 = new Events("KSHOCK_LANDING", 0);
            KSHOCK_LANDING = $r1;
            Events $r12 = new Events("TERMS_AND_CONDITION", 1);
            TERMS_AND_CONDITION = $r12;
            Events $r13 = new Events("LOAN_AMOUNT", 2);
            LOAN_AMOUNT = $r13;
            Events $r14 = new Events("LOAN_SUMMARY", 3);
            LOAN_SUMMARY = $r14;
            Events $r15 = new Events("ENTER_PIN", 4);
            ENTER_PIN = $r15;
            Events $r16 = new Events("SUCCESS_PAGE", 5);
            SUCCESS_PAGE = $r16;
            Events $r17 = new Events("LOAN_STATUS_PAGE", 6);
            LOAN_STATUS_PAGE = $r17;
            Events[] $r0 = $values();
            $VALUES = $r0;
        }

        private Events(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static Events valueOf(String str) {
            Enum $r0 = Enum.valueOf(Events.class, str);
            Events $r2 = (Events) $r0;
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
        public static Events[] values() {
            Events[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            Events[] $r12 = (Events[]) $r0;
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
            Locale $r2 = Locale.getDefault();
            Log_OC.loadImage($r2, "getDefault()");
            if ($r1 == null) {
                NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw $r3;
            }
            String $r12 = $r1.toLowerCase($r2);
            Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase(locale)");
            return $r12;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KShockAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/kshock/KShockAnalytics$Parameters;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE_NUMBER", "LOAN_AMOUNT", "STATUS", "LOAN_STATUS", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Parameters {
        private static final /* synthetic */ Parameters[] $VALUES;
        public static final Parameters LOAN_AMOUNT;
        public static final Parameters LOAN_STATUS;
        public static final Parameters PHONE_NUMBER;
        public static final Parameters STATUS;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Parameters[] $values() {
            Parameters $r1 = PHONE_NUMBER;
            Parameters $r12 = LOAN_AMOUNT;
            Parameters $r13 = STATUS;
            Parameters $r14 = LOAN_STATUS;
            Parameters[] $r0 = {$r1, $r12, $r13, $r14};
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
            Parameters $r1 = new Parameters("PHONE_NUMBER", 0);
            PHONE_NUMBER = $r1;
            Parameters $r12 = new Parameters("LOAN_AMOUNT", 1);
            LOAN_AMOUNT = $r12;
            Parameters $r13 = new Parameters("STATUS", 2);
            STATUS = $r13;
            Parameters $r14 = new Parameters("LOAN_STATUS", 3);
            LOAN_STATUS = $r14;
            Parameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private Parameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static Parameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(Parameters.class, str);
            Parameters $r2 = (Parameters) $r0;
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
        public static Parameters[] values() {
            Parameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            Parameters[] $r12 = (Parameters[]) $r0;
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
            Locale $r2 = Locale.getDefault();
            Log_OC.loadImage($r2, "getDefault()");
            if ($r1 == null) {
                NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw $r3;
            }
            String $r12 = $r1.toLowerCase($r2);
            Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase(locale)");
            return $r12;
        }
    }
}
