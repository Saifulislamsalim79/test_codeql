package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OutletMgtAnalytics.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/OutletMgtAnalytics;", "", "()V", "Actions", "Events", "Parameters", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtAnalytics {

    /* compiled from: OutletMgtAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/OutletMgtAnalytics$Actions;", "", "onAddOutletClicked", "", "phoneNumber", "", TransactionField.STATUS, "", "onAddOutletFormClicked", "userPhoneNumber", "outletPhoneNumber", "onBuzzAgentClicked", "outletId", "onClickOutletPinReset", "onClickOutletSecurity", "onCreateOutletClicked", "onOutletFilterClicked", "onOutletManagerButtonClicked", "onOutletTypeClicked", "outletType", "onPinEnteredForCreateOutletClicked", "onSelectOutletItem", "onSuspendOutlet", "onViewOutletAccount", "onViewOutletProfile", "onViewOutletTransaction", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Actions {
        void onAddOutletClicked(String str, boolean z);

        void onAddOutletFormClicked(String str, String str2, boolean z);

        void onBuzzAgentClicked(String str, String str2);

        void onClickOutletPinReset(String str);

        void onClickOutletSecurity(String str);

        void onCreateOutletClicked(String str, String str2, boolean z);

        void onOutletFilterClicked(String str, boolean z);

        void onOutletManagerButtonClicked();

        void onOutletTypeClicked(String str, String str2);

        void onPinEnteredForCreateOutletClicked(String str, String str2, boolean z);

        void onSelectOutletItem(String str, String str2);

        void onSuspendOutlet(String str, boolean z);

        void onViewOutletAccount(String str, String str2);

        void onViewOutletProfile(String str, String str2);

        void onViewOutletTransaction(String str, String str2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OutletMgtAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/OutletMgtAnalytics$Events;", "", "(Ljava/lang/String;I)V", "toString", "", "CLICK_OUTLET_MGR_BUTTON", "CLICK_FILTER", "CLICK_ADD_OUTLET", "CLICK_OUTLET_TYPE", "CLICK_CREATE_OUTLET", "CLICK_PIN_ENTERED", "CLICK_BUZZ_AGENT", "CLICK_ADD_OUTLET_FORM", "VIEW_OUTLET_TRANSACTION", "VIEW_OUTLET_PROFILE", "VIEW_OUTLET_ACCOUNT", "SELECT_OUTLET_ITEM", "CLICK_SUSPEND_OUTLET", "CLICK_OUTLET_RESET_PIN", "CLICK_OUTLET_SECURITY", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Events {
        private static final /* synthetic */ Events[] $VALUES;
        public static final Events CLICK_ADD_OUTLET;
        public static final Events CLICK_ADD_OUTLET_FORM;
        public static final Events CLICK_BUZZ_AGENT;
        public static final Events CLICK_CREATE_OUTLET;
        public static final Events CLICK_FILTER;
        public static final Events CLICK_OUTLET_MGR_BUTTON;
        public static final Events CLICK_OUTLET_RESET_PIN;
        public static final Events CLICK_OUTLET_SECURITY;
        public static final Events CLICK_OUTLET_TYPE;
        public static final Events CLICK_PIN_ENTERED;
        public static final Events CLICK_SUSPEND_OUTLET;
        public static final Events SELECT_OUTLET_ITEM;
        public static final Events VIEW_OUTLET_ACCOUNT;
        public static final Events VIEW_OUTLET_PROFILE;
        public static final Events VIEW_OUTLET_TRANSACTION;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Events[] $values() {
            Events $r1 = CLICK_OUTLET_MGR_BUTTON;
            Events $r12 = CLICK_FILTER;
            Events $r13 = CLICK_ADD_OUTLET;
            Events $r14 = CLICK_OUTLET_TYPE;
            Events $r15 = CLICK_CREATE_OUTLET;
            Events $r16 = CLICK_PIN_ENTERED;
            Events $r17 = CLICK_BUZZ_AGENT;
            Events $r18 = CLICK_ADD_OUTLET_FORM;
            Events $r19 = VIEW_OUTLET_TRANSACTION;
            Events $r110 = VIEW_OUTLET_PROFILE;
            Events $r111 = VIEW_OUTLET_ACCOUNT;
            Events $r112 = SELECT_OUTLET_ITEM;
            Events $r113 = CLICK_SUSPEND_OUTLET;
            Events $r114 = CLICK_OUTLET_RESET_PIN;
            Events $r115 = CLICK_OUTLET_SECURITY;
            Events[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115};
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
            Events $r1 = new Events("CLICK_OUTLET_MGR_BUTTON", 0);
            CLICK_OUTLET_MGR_BUTTON = $r1;
            Events $r12 = new Events("CLICK_FILTER", 1);
            CLICK_FILTER = $r12;
            Events $r13 = new Events("CLICK_ADD_OUTLET", 2);
            CLICK_ADD_OUTLET = $r13;
            Events $r14 = new Events("CLICK_OUTLET_TYPE", 3);
            CLICK_OUTLET_TYPE = $r14;
            Events $r15 = new Events("CLICK_CREATE_OUTLET", 4);
            CLICK_CREATE_OUTLET = $r15;
            Events $r16 = new Events("CLICK_PIN_ENTERED", 5);
            CLICK_PIN_ENTERED = $r16;
            Events $r17 = new Events("CLICK_BUZZ_AGENT", 6);
            CLICK_BUZZ_AGENT = $r17;
            Events $r18 = new Events("CLICK_ADD_OUTLET_FORM", 7);
            CLICK_ADD_OUTLET_FORM = $r18;
            Events $r19 = new Events("VIEW_OUTLET_TRANSACTION", 8);
            VIEW_OUTLET_TRANSACTION = $r19;
            Events $r110 = new Events("VIEW_OUTLET_PROFILE", 9);
            VIEW_OUTLET_PROFILE = $r110;
            Events $r111 = new Events("VIEW_OUTLET_ACCOUNT", 10);
            VIEW_OUTLET_ACCOUNT = $r111;
            Events $r112 = new Events("SELECT_OUTLET_ITEM", 11);
            SELECT_OUTLET_ITEM = $r112;
            Events $r113 = new Events("CLICK_SUSPEND_OUTLET", 12);
            CLICK_SUSPEND_OUTLET = $r113;
            Events $r114 = new Events("CLICK_OUTLET_RESET_PIN", 13);
            CLICK_OUTLET_RESET_PIN = $r114;
            Events $r115 = new Events("CLICK_OUTLET_SECURITY", 14);
            CLICK_OUTLET_SECURITY = $r115;
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
    /* compiled from: OutletMgtAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/OutletMgtAnalytics$Parameters;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE_NUMBER", "OUTLET_PHONE_NUMBER", "OUTLET_TYPE", "OUTLET_ID", "STATUS", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Parameters {
        private static final /* synthetic */ Parameters[] $VALUES;
        public static final Parameters OUTLET_ID;
        public static final Parameters OUTLET_PHONE_NUMBER;
        public static final Parameters OUTLET_TYPE;
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
            Parameters $r12 = OUTLET_PHONE_NUMBER;
            Parameters $r13 = OUTLET_TYPE;
            Parameters $r14 = OUTLET_ID;
            Parameters $r15 = STATUS;
            Parameters[] $r0 = {$r1, $r12, $r13, $r14, $r15};
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
            Parameters $r12 = new Parameters("OUTLET_PHONE_NUMBER", 1);
            OUTLET_PHONE_NUMBER = $r12;
            Parameters $r13 = new Parameters("OUTLET_TYPE", 2);
            OUTLET_TYPE = $r13;
            Parameters $r14 = new Parameters("OUTLET_ID", 3);
            OUTLET_ID = $r14;
            Parameters $r15 = new Parameters("STATUS", 4);
            STATUS = $r15;
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
