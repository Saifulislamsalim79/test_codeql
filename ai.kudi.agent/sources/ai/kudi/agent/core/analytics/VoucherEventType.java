package ai.kudi.agent.core.analytics;

import ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: VoucherAnalytics.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/VoucherEventType;", "", "()V", "CashIn", "CashOut", "VoucherEventParameters", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VoucherEventType {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoucherAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/analytics/VoucherEventType$CashIn;", "", "(Ljava/lang/String;I)V", "toString", "", "VOUCHER_CASH_IN_RECIPIENT_INFO_ENTRY", "VOUCHER_AMOUNT_ENTERED", "VOUCHER_CASH_IN_SENDER_INFO_ENTRY", "PIN_VERIFICATION_ON_VOUHCER_CASH_IN", "VOUCHER_CASH_BUTTON_CLICKED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CashIn {
        private static final /* synthetic */ CashIn[] $VALUES;
        public static final CashIn PIN_VERIFICATION_ON_VOUHCER_CASH_IN;
        public static final CashIn VOUCHER_AMOUNT_ENTERED;
        public static final CashIn VOUCHER_CASH_BUTTON_CLICKED;
        public static final CashIn VOUCHER_CASH_IN_RECIPIENT_INFO_ENTRY;
        public static final CashIn VOUCHER_CASH_IN_SENDER_INFO_ENTRY;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ CashIn[] $values() {
            CashIn $r1 = VOUCHER_CASH_IN_RECIPIENT_INFO_ENTRY;
            CashIn $r12 = VOUCHER_AMOUNT_ENTERED;
            CashIn $r13 = VOUCHER_CASH_IN_SENDER_INFO_ENTRY;
            CashIn $r14 = PIN_VERIFICATION_ON_VOUHCER_CASH_IN;
            CashIn $r15 = VOUCHER_CASH_BUTTON_CLICKED;
            CashIn[] $r0 = {$r1, $r12, $r13, $r14, $r15};
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
            CashIn $r1 = new CashIn("VOUCHER_CASH_IN_RECIPIENT_INFO_ENTRY", 0);
            VOUCHER_CASH_IN_RECIPIENT_INFO_ENTRY = $r1;
            CashIn $r12 = new CashIn("VOUCHER_AMOUNT_ENTERED", 1);
            VOUCHER_AMOUNT_ENTERED = $r12;
            CashIn $r13 = new CashIn("VOUCHER_CASH_IN_SENDER_INFO_ENTRY", 2);
            VOUCHER_CASH_IN_SENDER_INFO_ENTRY = $r13;
            CashIn $r14 = new CashIn("PIN_VERIFICATION_ON_VOUHCER_CASH_IN", 3);
            PIN_VERIFICATION_ON_VOUHCER_CASH_IN = $r14;
            CashIn $r15 = new CashIn("VOUCHER_CASH_BUTTON_CLICKED", 4);
            VOUCHER_CASH_BUTTON_CLICKED = $r15;
            CashIn[] $r0 = $values();
            $VALUES = $r0;
        }

        private CashIn(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static CashIn valueOf(String str) {
            Enum $r0 = Enum.valueOf(CashIn.class, str);
            CashIn $r2 = (CashIn) $r0;
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
        public static CashIn[] values() {
            CashIn[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            CashIn[] $r12 = (CashIn[]) $r0;
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
    /* compiled from: VoucherAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/core/analytics/VoucherEventType$CashOut;", "", "(Ljava/lang/String;I)V", "toString", "", "VOUCHER_CODE_LOOKUP", "VOUCHER_RECIPIENT_PHONE_VERIFICATION", "PIN_VERIFICATION_ON_VOUCHER_CASHOUT", "VOUCHER_CASH_OUT_BUTTON_CLICKED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CashOut {
        private static final /* synthetic */ CashOut[] $VALUES;
        public static final CashOut PIN_VERIFICATION_ON_VOUCHER_CASHOUT;
        public static final CashOut VOUCHER_CASH_OUT_BUTTON_CLICKED;
        public static final CashOut VOUCHER_CODE_LOOKUP;
        public static final CashOut VOUCHER_RECIPIENT_PHONE_VERIFICATION;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ CashOut[] $values() {
            CashOut $r1 = VOUCHER_CODE_LOOKUP;
            CashOut $r12 = VOUCHER_RECIPIENT_PHONE_VERIFICATION;
            CashOut $r13 = PIN_VERIFICATION_ON_VOUCHER_CASHOUT;
            CashOut $r14 = VOUCHER_CASH_OUT_BUTTON_CLICKED;
            CashOut[] $r0 = {$r1, $r12, $r13, $r14};
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
            CashOut $r1 = new CashOut("VOUCHER_CODE_LOOKUP", 0);
            VOUCHER_CODE_LOOKUP = $r1;
            CashOut $r12 = new CashOut("VOUCHER_RECIPIENT_PHONE_VERIFICATION", 1);
            VOUCHER_RECIPIENT_PHONE_VERIFICATION = $r12;
            CashOut $r13 = new CashOut("PIN_VERIFICATION_ON_VOUCHER_CASHOUT", 2);
            PIN_VERIFICATION_ON_VOUCHER_CASHOUT = $r13;
            CashOut $r14 = new CashOut("VOUCHER_CASH_OUT_BUTTON_CLICKED", 3);
            VOUCHER_CASH_OUT_BUTTON_CLICKED = $r14;
            CashOut[] $r0 = $values();
            $VALUES = $r0;
        }

        private CashOut(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static CashOut valueOf(String str) {
            Enum $r0 = Enum.valueOf(CashOut.class, str);
            CashOut $r2 = (CashOut) $r0;
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
        public static CashOut[] values() {
            CashOut[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            CashOut[] $r12 = (CashOut[]) $r0;
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
    /* compiled from: VoucherAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/analytics/VoucherEventType$VoucherEventParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "IS_SUCCESSFUL", "PHONE_NUMBER", "RECIPIENT_NAME_OR_PHONE", "NAME", "ERROR", PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, "REFERENCE", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class VoucherEventParameters {
        private static final /* synthetic */ VoucherEventParameters[] $VALUES;
        public static final VoucherEventParameters AMOUNT;
        public static final VoucherEventParameters ERROR;
        public static final VoucherEventParameters IS_SUCCESSFUL;
        public static final VoucherEventParameters NAME;
        public static final VoucherEventParameters PHONE_NUMBER;
        public static final VoucherEventParameters RECIPIENT_NAME_OR_PHONE;
        public static final VoucherEventParameters REFERENCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ VoucherEventParameters[] $values() {
            VoucherEventParameters $r1 = IS_SUCCESSFUL;
            VoucherEventParameters $r12 = PHONE_NUMBER;
            VoucherEventParameters $r13 = RECIPIENT_NAME_OR_PHONE;
            VoucherEventParameters $r14 = NAME;
            VoucherEventParameters $r15 = ERROR;
            VoucherEventParameters $r16 = AMOUNT;
            VoucherEventParameters $r17 = REFERENCE;
            VoucherEventParameters[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17};
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
            VoucherEventParameters $r1 = new VoucherEventParameters("IS_SUCCESSFUL", 0);
            IS_SUCCESSFUL = $r1;
            VoucherEventParameters $r12 = new VoucherEventParameters("PHONE_NUMBER", 1);
            PHONE_NUMBER = $r12;
            VoucherEventParameters $r13 = new VoucherEventParameters("RECIPIENT_NAME_OR_PHONE", 2);
            RECIPIENT_NAME_OR_PHONE = $r13;
            VoucherEventParameters $r14 = new VoucherEventParameters("NAME", 3);
            NAME = $r14;
            VoucherEventParameters $r15 = new VoucherEventParameters("ERROR", 4);
            ERROR = $r15;
            VoucherEventParameters $r16 = new VoucherEventParameters(PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, 5);
            AMOUNT = $r16;
            VoucherEventParameters $r17 = new VoucherEventParameters("REFERENCE", 6);
            REFERENCE = $r17;
            VoucherEventParameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private VoucherEventParameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static VoucherEventParameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(VoucherEventParameters.class, str);
            VoucherEventParameters $r2 = (VoucherEventParameters) $r0;
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
        public static VoucherEventParameters[] values() {
            VoucherEventParameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            VoucherEventParameters[] $r12 = (VoucherEventParameters[]) $r0;
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
