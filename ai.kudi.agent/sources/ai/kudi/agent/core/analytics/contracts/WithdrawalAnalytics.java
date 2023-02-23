package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: WithdrawalAnalytics.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/WithdrawalAnalytics;", "", "()V", "Actions", "Events", "Parameters", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WithdrawalAnalytics {

    /* compiled from: WithdrawalAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/WithdrawalAnalytics$Actions;", "", "onUssdInfoCopied", "", AttributeType.PHONE, "", "onUssdProviderSelected", "onUssdTransactionCompleted", TransactionField.STATUS, "onUssdVoucherCodeValidated", "onUssdWithdrawalOptionClicked", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Actions {
        void onUssdInfoCopied(String str);

        void onUssdProviderSelected(String str);

        void onUssdTransactionCompleted(String str, String str2);

        void onUssdVoucherCodeValidated(String str, String str2);

        void onUssdWithdrawalOptionClicked(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WithdrawalAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/WithdrawalAnalytics$Events;", "", "(Ljava/lang/String;I)V", "toString", "", "SELECT_USSD_WITHDRAWAL", "SELECT_PROVIDER", "COPY_USSD_INFO", "VALIDATE_CODE", "COMPLETE_TRANSACTION", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Events {
        private static final /* synthetic */ Events[] $VALUES;
        public static final Events COMPLETE_TRANSACTION;
        public static final Events COPY_USSD_INFO;
        public static final Events SELECT_PROVIDER;
        public static final Events SELECT_USSD_WITHDRAWAL;
        public static final Events VALIDATE_CODE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Events[] $values() {
            Events $r1 = SELECT_USSD_WITHDRAWAL;
            Events $r12 = SELECT_PROVIDER;
            Events $r13 = COPY_USSD_INFO;
            Events $r14 = VALIDATE_CODE;
            Events $r15 = COMPLETE_TRANSACTION;
            Events[] $r0 = {$r1, $r12, $r13, $r14, $r15};
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
            Events $r1 = new Events("SELECT_USSD_WITHDRAWAL", 0);
            SELECT_USSD_WITHDRAWAL = $r1;
            Events $r12 = new Events("SELECT_PROVIDER", 1);
            SELECT_PROVIDER = $r12;
            Events $r13 = new Events("COPY_USSD_INFO", 2);
            COPY_USSD_INFO = $r13;
            Events $r14 = new Events("VALIDATE_CODE", 3);
            VALIDATE_CODE = $r14;
            Events $r15 = new Events("COMPLETE_TRANSACTION", 4);
            COMPLETE_TRANSACTION = $r15;
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
    /* compiled from: WithdrawalAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/WithdrawalAnalytics$Parameters;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE_NUMBER", "STATUS", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Parameters {
        private static final /* synthetic */ Parameters[] $VALUES;
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
            Parameters $r12 = STATUS;
            Parameters[] $r0 = {$r1, $r12};
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
            Parameters $r12 = new Parameters("STATUS", 1);
            STATUS = $r12;
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
