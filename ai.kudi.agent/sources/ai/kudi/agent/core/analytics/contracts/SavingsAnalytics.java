package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingsAnalytics.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/SavingsAnalytics;", "", "()V", "Actions", "Events", "Parameters", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsAnalytics {

    /* compiled from: SavingsAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0007H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H&¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/SavingsAnalytics$Actions;", "", "launchCreateSavingScreen", "", "launchWithdrawScreen", "lockOptionSelected", "lock", "", "onConfirmWithdraw", TransactionField.STATUS, "", "phoneNumber", "onCreateSavingsClicked", "onDeactivateSavingsClicked", "onSavingsGetStartedClicked", "onSavingsGoalEntered", "goalName", "onSavingsMenuItemClicked", "onSavingsPinEntered", "onSavingsReviewed", "onTermsAndConditionAccepted", "onWithdrawAmountEntered", TransactionField.AMOUNT, "onWithdrawSuccessScreenLaunch", "savingsDateSelected", AttributeType.DATE, "savingsDurationSelected", "duration", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Actions {

        /* compiled from: SavingsAnalytics.kt */
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
            public static /* synthetic */ void onConfirmWithdraw$default(Actions actions, boolean z, String $r2, int i, Object obj) {
                if (obj != null) {
                    UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConfirmWithdraw");
                    throw $r3;
                }
                int $i0 = i & 2;
                if ($i0 != 0) {
                    $r2 = null;
                }
                actions.onConfirmWithdraw(z, $r2);
            }
        }

        void launchCreateSavingScreen();

        void launchWithdrawScreen();

        void lockOptionSelected(String str);

        void onConfirmWithdraw(boolean z, String str);

        void onCreateSavingsClicked(String str);

        void onDeactivateSavingsClicked(String str);

        void onSavingsGetStartedClicked();

        void onSavingsGoalEntered(String str);

        void onSavingsMenuItemClicked();

        void onSavingsPinEntered();

        void onSavingsReviewed();

        void onTermsAndConditionAccepted();

        void onWithdrawAmountEntered(String str);

        void onWithdrawSuccessScreenLaunch();

        void savingsDateSelected(String str);

        void savingsDurationSelected(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SavingsAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/SavingsAnalytics$Events;", "", "(Ljava/lang/String;I)V", "toString", "", "SAVINGS_MENU_CLICKED", "GET_STARTED", "TERMS_AND_CONDITION_ACCEPTED", "CREATE_SAVINGS_SCREEN_LAUNCH", "SAVINGS_GOAL_ENTERED", "SAVINGS_DURATION_SELECTED", "SAVINGS_DATE_SELECTED", "LOCK_OPTIONS", "SAVINGS_OVERVIEW_COMPLETE", "CREATE_SAVINGS_CLICKED", "SAVINGS_PIN_ENTERED", "WITHDRAW_SAVINGS_SCREEN_LAUNCH", "AMOUNT_ENTERED", "WITHDRAWAL_CONFIRMATION_CLICKED", "WITHDRAW_SUCCESS_SCREEN_DISPLAYED", "DEACTIVATE_SAVINGS_CLICKED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Events {
        private static final /* synthetic */ Events[] $VALUES;
        public static final Events AMOUNT_ENTERED;
        public static final Events CREATE_SAVINGS_CLICKED;
        public static final Events CREATE_SAVINGS_SCREEN_LAUNCH;
        public static final Events DEACTIVATE_SAVINGS_CLICKED;
        public static final Events GET_STARTED;
        public static final Events LOCK_OPTIONS;
        public static final Events SAVINGS_DATE_SELECTED;
        public static final Events SAVINGS_DURATION_SELECTED;
        public static final Events SAVINGS_GOAL_ENTERED;
        public static final Events SAVINGS_MENU_CLICKED;
        public static final Events SAVINGS_OVERVIEW_COMPLETE;
        public static final Events SAVINGS_PIN_ENTERED;
        public static final Events TERMS_AND_CONDITION_ACCEPTED;
        public static final Events WITHDRAWAL_CONFIRMATION_CLICKED;
        public static final Events WITHDRAW_SAVINGS_SCREEN_LAUNCH;
        public static final Events WITHDRAW_SUCCESS_SCREEN_DISPLAYED;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Events[] $values() {
            Events $r1 = SAVINGS_MENU_CLICKED;
            Events $r12 = GET_STARTED;
            Events $r13 = TERMS_AND_CONDITION_ACCEPTED;
            Events $r14 = CREATE_SAVINGS_SCREEN_LAUNCH;
            Events $r15 = SAVINGS_GOAL_ENTERED;
            Events $r16 = SAVINGS_DURATION_SELECTED;
            Events $r17 = SAVINGS_DATE_SELECTED;
            Events $r18 = LOCK_OPTIONS;
            Events $r19 = SAVINGS_OVERVIEW_COMPLETE;
            Events $r110 = CREATE_SAVINGS_CLICKED;
            Events $r111 = SAVINGS_PIN_ENTERED;
            Events $r112 = WITHDRAW_SAVINGS_SCREEN_LAUNCH;
            Events $r113 = AMOUNT_ENTERED;
            Events $r114 = WITHDRAWAL_CONFIRMATION_CLICKED;
            Events $r115 = WITHDRAW_SUCCESS_SCREEN_DISPLAYED;
            Events $r116 = DEACTIVATE_SAVINGS_CLICKED;
            Events[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116};
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
            Events $r1 = new Events("SAVINGS_MENU_CLICKED", 0);
            SAVINGS_MENU_CLICKED = $r1;
            Events $r12 = new Events("GET_STARTED", 1);
            GET_STARTED = $r12;
            Events $r13 = new Events("TERMS_AND_CONDITION_ACCEPTED", 2);
            TERMS_AND_CONDITION_ACCEPTED = $r13;
            Events $r14 = new Events("CREATE_SAVINGS_SCREEN_LAUNCH", 3);
            CREATE_SAVINGS_SCREEN_LAUNCH = $r14;
            Events $r15 = new Events("SAVINGS_GOAL_ENTERED", 4);
            SAVINGS_GOAL_ENTERED = $r15;
            Events $r16 = new Events("SAVINGS_DURATION_SELECTED", 5);
            SAVINGS_DURATION_SELECTED = $r16;
            Events $r17 = new Events("SAVINGS_DATE_SELECTED", 6);
            SAVINGS_DATE_SELECTED = $r17;
            Events $r18 = new Events("LOCK_OPTIONS", 7);
            LOCK_OPTIONS = $r18;
            Events $r19 = new Events("SAVINGS_OVERVIEW_COMPLETE", 8);
            SAVINGS_OVERVIEW_COMPLETE = $r19;
            Events $r110 = new Events("CREATE_SAVINGS_CLICKED", 9);
            CREATE_SAVINGS_CLICKED = $r110;
            Events $r111 = new Events("SAVINGS_PIN_ENTERED", 10);
            SAVINGS_PIN_ENTERED = $r111;
            Events $r112 = new Events("WITHDRAW_SAVINGS_SCREEN_LAUNCH", 11);
            WITHDRAW_SAVINGS_SCREEN_LAUNCH = $r112;
            Events $r113 = new Events("AMOUNT_ENTERED", 12);
            AMOUNT_ENTERED = $r113;
            Events $r114 = new Events("WITHDRAWAL_CONFIRMATION_CLICKED", 13);
            WITHDRAWAL_CONFIRMATION_CLICKED = $r114;
            Events $r115 = new Events("WITHDRAW_SUCCESS_SCREEN_DISPLAYED", 14);
            WITHDRAW_SUCCESS_SCREEN_DISPLAYED = $r115;
            Events $r116 = new Events("DEACTIVATE_SAVINGS_CLICKED", 15);
            DEACTIVATE_SAVINGS_CLICKED = $r116;
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
    /* compiled from: SavingsAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/SavingsAnalytics$Parameters;", "", "(Ljava/lang/String;I)V", "toString", "", "GOAL_NAME", "SAVING_DURATION", "SAVING_DATE", "LOCK_SAVING", "WITHDRAW_CONFIRMED", "PHONE_NUMBER", "AMOUNT_TO_WITHDRAW", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Parameters {
        private static final /* synthetic */ Parameters[] $VALUES;
        public static final Parameters AMOUNT_TO_WITHDRAW;
        public static final Parameters GOAL_NAME;
        public static final Parameters LOCK_SAVING;
        public static final Parameters PHONE_NUMBER;
        public static final Parameters SAVING_DATE;
        public static final Parameters SAVING_DURATION;
        public static final Parameters WITHDRAW_CONFIRMED;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Parameters[] $values() {
            Parameters $r1 = GOAL_NAME;
            Parameters $r12 = SAVING_DURATION;
            Parameters $r13 = SAVING_DATE;
            Parameters $r14 = LOCK_SAVING;
            Parameters $r15 = WITHDRAW_CONFIRMED;
            Parameters $r16 = PHONE_NUMBER;
            Parameters $r17 = AMOUNT_TO_WITHDRAW;
            Parameters[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17};
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
            Parameters $r1 = new Parameters("GOAL_NAME", 0);
            GOAL_NAME = $r1;
            Parameters $r12 = new Parameters("SAVING_DURATION", 1);
            SAVING_DURATION = $r12;
            Parameters $r13 = new Parameters("SAVING_DATE", 2);
            SAVING_DATE = $r13;
            Parameters $r14 = new Parameters("LOCK_SAVING", 3);
            LOCK_SAVING = $r14;
            Parameters $r15 = new Parameters("WITHDRAW_CONFIRMED", 4);
            WITHDRAW_CONFIRMED = $r15;
            Parameters $r16 = new Parameters("PHONE_NUMBER", 5);
            PHONE_NUMBER = $r16;
            Parameters $r17 = new Parameters("AMOUNT_TO_WITHDRAW", 6);
            AMOUNT_TO_WITHDRAW = $r17;
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
