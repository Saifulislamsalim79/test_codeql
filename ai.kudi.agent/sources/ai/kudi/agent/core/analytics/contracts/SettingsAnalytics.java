package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SettingsAnalytics.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/SettingsAnalytics;", "", "()V", "Actions", "Events", "Parameters", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsAnalytics {

    /* compiled from: SettingsAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J0\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&JP\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J@\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/SettingsAnalytics$Actions;", "", "onAboutKycLevelClick", "", AttributeType.PHONE, "", "onAccountPageOpen", "onActivateTerminalButtonClick", "terminalDetails", "onAddNewAccountButtonClick", "acctNumber", "acctName", "bank", "purpose", "onBiometricsOptionToggle", SendReceiptToTerminalConfirmationBottomSheet.STATE, "onBuyPosButtonClick", TransactionField.STATUS, "onEditButtonClick", PhoneFragment.ARG_BVN, "businessName", "businessAddress", "lga", "email", "dob", "homeAddress", "closestLandmark", "onResetPinButtonClick", "onSaveAccountNumberClick", "onSaveProfileButtonClick", "onSettingsMenuClick", "onUpgradeAccountButtonClick", "idType", "idNumber", "nokName", "nokNumber", "utilityBill", "kycLevel", "onVerifyAccountButtonClick", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Actions {
        void onAboutKycLevelClick(String str);

        void onAccountPageOpen(String str);

        void onActivateTerminalButtonClick(String str, String str2);

        void onAddNewAccountButtonClick(String str, String str2, String str3, String str4, String str5);

        void onBiometricsOptionToggle(String str, String str2);

        void onBuyPosButtonClick(String str, String str2);

        void onEditButtonClick(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9);

        void onResetPinButtonClick(String str, String str2);

        void onSaveAccountNumberClick(String str, String str2);

        void onSaveProfileButtonClick(String str, String str2);

        void onSettingsMenuClick(String str);

        void onUpgradeAccountButtonClick(String str, String str2, String str3, String str4, String str5, String str6, String str7);

        void onVerifyAccountButtonClick(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SettingsAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/SettingsAnalytics$Events;", "", "(Ljava/lang/String;I)V", "toString", "", "SETTINGS_CLICKED_ON_SIDEBAR", "EDIT_PROFILE_BUTTON_CLICKED_ON_PROFILE_PAGE", "ABOUT_KYC_PAGE_CLICKED_ON_KYC_LEVEL_CARD", "SAVE_PROFILE_CLICKED_ON_EDIT_PROFILE_PAGE", "ACCOUNT_SCREEN_OPENED_ON_SETTINGS_PAGE", "BUY_POS_BUTTON_CLICKED_ON_ACCOUNT_SECTION", "ADD_NEW_ACCOUNT_NUMBER_CLICKED_ON_ACCOUNT_PAGE", "SAVE_ACCOUNT_NUMBER_CLICKED", "RESET_PIN_CLICKED_ON_SECURITY_PAGE", "BIOMETRICS_TOGGLE_ON_SECURITY_PAGE", "VERIFY_ACCOUNT_BUTTON_CLICKED_ON_SETTINGS_PAGE", "UPGRADE_ACCOUNT_BUTTON_CLICKED_ON_PROFILE_PAGE", "ACTIVATE_TERMINAL_CLICKED", "INSURANCE_SIGNUP_CLICKED", "INSURANCE_EMPLOYEE_ADDED", "INSURANCE_PHONE_NUMBER_CHANGED", "INSURANCE_SUBMIT_BUTTON_CLICKED", "INSURANCE_DETAILS_SUBMITTED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Events {
        private static final /* synthetic */ Events[] $VALUES;
        public static final Events ABOUT_KYC_PAGE_CLICKED_ON_KYC_LEVEL_CARD;
        public static final Events ACCOUNT_SCREEN_OPENED_ON_SETTINGS_PAGE;
        public static final Events ACTIVATE_TERMINAL_CLICKED;
        public static final Events ADD_NEW_ACCOUNT_NUMBER_CLICKED_ON_ACCOUNT_PAGE;
        public static final Events BIOMETRICS_TOGGLE_ON_SECURITY_PAGE;
        public static final Events BUY_POS_BUTTON_CLICKED_ON_ACCOUNT_SECTION;
        public static final Events EDIT_PROFILE_BUTTON_CLICKED_ON_PROFILE_PAGE;
        public static final Events INSURANCE_DETAILS_SUBMITTED;
        public static final Events INSURANCE_EMPLOYEE_ADDED;
        public static final Events INSURANCE_PHONE_NUMBER_CHANGED;
        public static final Events INSURANCE_SIGNUP_CLICKED;
        public static final Events INSURANCE_SUBMIT_BUTTON_CLICKED;
        public static final Events RESET_PIN_CLICKED_ON_SECURITY_PAGE;
        public static final Events SAVE_ACCOUNT_NUMBER_CLICKED;
        public static final Events SAVE_PROFILE_CLICKED_ON_EDIT_PROFILE_PAGE;
        public static final Events SETTINGS_CLICKED_ON_SIDEBAR;
        public static final Events UPGRADE_ACCOUNT_BUTTON_CLICKED_ON_PROFILE_PAGE;
        public static final Events VERIFY_ACCOUNT_BUTTON_CLICKED_ON_SETTINGS_PAGE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Events[] $values() {
            Events $r1 = SETTINGS_CLICKED_ON_SIDEBAR;
            Events $r12 = EDIT_PROFILE_BUTTON_CLICKED_ON_PROFILE_PAGE;
            Events $r13 = ABOUT_KYC_PAGE_CLICKED_ON_KYC_LEVEL_CARD;
            Events $r14 = SAVE_PROFILE_CLICKED_ON_EDIT_PROFILE_PAGE;
            Events $r15 = ACCOUNT_SCREEN_OPENED_ON_SETTINGS_PAGE;
            Events $r16 = BUY_POS_BUTTON_CLICKED_ON_ACCOUNT_SECTION;
            Events $r17 = ADD_NEW_ACCOUNT_NUMBER_CLICKED_ON_ACCOUNT_PAGE;
            Events $r18 = SAVE_ACCOUNT_NUMBER_CLICKED;
            Events $r19 = RESET_PIN_CLICKED_ON_SECURITY_PAGE;
            Events $r110 = BIOMETRICS_TOGGLE_ON_SECURITY_PAGE;
            Events $r111 = VERIFY_ACCOUNT_BUTTON_CLICKED_ON_SETTINGS_PAGE;
            Events $r112 = UPGRADE_ACCOUNT_BUTTON_CLICKED_ON_PROFILE_PAGE;
            Events $r113 = ACTIVATE_TERMINAL_CLICKED;
            Events $r114 = INSURANCE_SIGNUP_CLICKED;
            Events $r115 = INSURANCE_EMPLOYEE_ADDED;
            Events $r116 = INSURANCE_PHONE_NUMBER_CHANGED;
            Events $r117 = INSURANCE_SUBMIT_BUTTON_CLICKED;
            Events $r118 = INSURANCE_DETAILS_SUBMITTED;
            Events[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116, $r117, $r118};
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
            Events $r1 = new Events("SETTINGS_CLICKED_ON_SIDEBAR", 0);
            SETTINGS_CLICKED_ON_SIDEBAR = $r1;
            Events $r12 = new Events("EDIT_PROFILE_BUTTON_CLICKED_ON_PROFILE_PAGE", 1);
            EDIT_PROFILE_BUTTON_CLICKED_ON_PROFILE_PAGE = $r12;
            Events $r13 = new Events("ABOUT_KYC_PAGE_CLICKED_ON_KYC_LEVEL_CARD", 2);
            ABOUT_KYC_PAGE_CLICKED_ON_KYC_LEVEL_CARD = $r13;
            Events $r14 = new Events("SAVE_PROFILE_CLICKED_ON_EDIT_PROFILE_PAGE", 3);
            SAVE_PROFILE_CLICKED_ON_EDIT_PROFILE_PAGE = $r14;
            Events $r15 = new Events("ACCOUNT_SCREEN_OPENED_ON_SETTINGS_PAGE", 4);
            ACCOUNT_SCREEN_OPENED_ON_SETTINGS_PAGE = $r15;
            Events $r16 = new Events("BUY_POS_BUTTON_CLICKED_ON_ACCOUNT_SECTION", 5);
            BUY_POS_BUTTON_CLICKED_ON_ACCOUNT_SECTION = $r16;
            Events $r17 = new Events("ADD_NEW_ACCOUNT_NUMBER_CLICKED_ON_ACCOUNT_PAGE", 6);
            ADD_NEW_ACCOUNT_NUMBER_CLICKED_ON_ACCOUNT_PAGE = $r17;
            Events $r18 = new Events("SAVE_ACCOUNT_NUMBER_CLICKED", 7);
            SAVE_ACCOUNT_NUMBER_CLICKED = $r18;
            Events $r19 = new Events("RESET_PIN_CLICKED_ON_SECURITY_PAGE", 8);
            RESET_PIN_CLICKED_ON_SECURITY_PAGE = $r19;
            Events $r110 = new Events("BIOMETRICS_TOGGLE_ON_SECURITY_PAGE", 9);
            BIOMETRICS_TOGGLE_ON_SECURITY_PAGE = $r110;
            Events $r111 = new Events("VERIFY_ACCOUNT_BUTTON_CLICKED_ON_SETTINGS_PAGE", 10);
            VERIFY_ACCOUNT_BUTTON_CLICKED_ON_SETTINGS_PAGE = $r111;
            Events $r112 = new Events("UPGRADE_ACCOUNT_BUTTON_CLICKED_ON_PROFILE_PAGE", 11);
            UPGRADE_ACCOUNT_BUTTON_CLICKED_ON_PROFILE_PAGE = $r112;
            Events $r113 = new Events("ACTIVATE_TERMINAL_CLICKED", 12);
            ACTIVATE_TERMINAL_CLICKED = $r113;
            Events $r114 = new Events("INSURANCE_SIGNUP_CLICKED", 13);
            INSURANCE_SIGNUP_CLICKED = $r114;
            Events $r115 = new Events("INSURANCE_EMPLOYEE_ADDED", 14);
            INSURANCE_EMPLOYEE_ADDED = $r115;
            Events $r116 = new Events("INSURANCE_PHONE_NUMBER_CHANGED", 15);
            INSURANCE_PHONE_NUMBER_CHANGED = $r116;
            Events $r117 = new Events("INSURANCE_SUBMIT_BUTTON_CLICKED", 16);
            INSURANCE_SUBMIT_BUTTON_CLICKED = $r117;
            Events $r118 = new Events("INSURANCE_DETAILS_SUBMITTED", 17);
            INSURANCE_DETAILS_SUBMITTED = $r118;
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
    /* compiled from: SettingsAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/SettingsAnalytics$Parameters;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE_NUMBER", Constants.IS_BVN_VERIFIED, "BUSINESS_NAME", "HOME_ADDRESS", "CLOSEST_LANDMARK", "BUSINESS_ADDRESS", "STATE", "LGA", "EMAIL", "DOB", "GENDER", "ACCOUNT_NUMBER", "ACCOUNT_NAME", "BANK", "NOK_NAME", "NOK_NUMBER", "INITIAL_KYC_LEVEL", "UTILITY_BILL", "ID_TYPE", "ID_NUMBER", "STATUS", "TERMINAL_DETAILS", "ERROR_MESSAGE", "PURPOSE", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Parameters {
        private static final /* synthetic */ Parameters[] $VALUES;
        public static final Parameters ACCOUNT_NAME;
        public static final Parameters ACCOUNT_NUMBER;
        public static final Parameters BANK;
        public static final Parameters BUSINESS_ADDRESS;
        public static final Parameters BUSINESS_NAME;
        public static final Parameters CLOSEST_LANDMARK;
        public static final Parameters COMPONENT;
        public static final Parameters EMAIL;
        public static final Parameters ERROR_MESSAGE;
        public static final Parameters GENDER;
        public static final Parameters HOME_ADDRESS;
        public static final Parameters ID_NUMBER;
        public static final Parameters ID_TYPE;
        public static final Parameters INITIAL_KYC_LEVEL;
        public static final Parameters NAME;
        public static final Parameters NOK_NAME;
        public static final Parameters NOK_NUMBER;
        public static final Parameters OTHER;
        public static final Parameters PHONE_NUMBER;
        public static final Parameters PURPOSE;
        public static final Parameters STATE;
        public static final Parameters STATUS;
        public static final Parameters TERMINAL_DETAILS;
        public static final Parameters UTILITY_BILL;

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
            Parameters $r12 = COMPONENT;
            Parameters $r13 = BUSINESS_NAME;
            Parameters $r14 = HOME_ADDRESS;
            Parameters $r15 = CLOSEST_LANDMARK;
            Parameters $r16 = BUSINESS_ADDRESS;
            Parameters $r17 = STATE;
            Parameters $r18 = NAME;
            Parameters $r19 = EMAIL;
            Parameters $r110 = OTHER;
            Parameters $r111 = GENDER;
            Parameters $r112 = ACCOUNT_NUMBER;
            Parameters $r113 = ACCOUNT_NAME;
            Parameters $r114 = BANK;
            Parameters $r115 = NOK_NAME;
            Parameters $r116 = NOK_NUMBER;
            Parameters $r117 = INITIAL_KYC_LEVEL;
            Parameters $r118 = UTILITY_BILL;
            Parameters $r119 = ID_TYPE;
            Parameters $r120 = ID_NUMBER;
            Parameters $r121 = STATUS;
            Parameters $r122 = TERMINAL_DETAILS;
            Parameters $r123 = ERROR_MESSAGE;
            Parameters $r124 = PURPOSE;
            Parameters[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116, $r117, $r118, $r119, $r120, $r121, $r122, $r123, $r124};
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
            Parameters $r12 = new Parameters(Constants.IS_BVN_VERIFIED, 1);
            COMPONENT = $r12;
            Parameters $r13 = new Parameters("BUSINESS_NAME", 2);
            BUSINESS_NAME = $r13;
            Parameters $r14 = new Parameters("HOME_ADDRESS", 3);
            HOME_ADDRESS = $r14;
            Parameters $r15 = new Parameters("CLOSEST_LANDMARK", 4);
            CLOSEST_LANDMARK = $r15;
            Parameters $r16 = new Parameters("BUSINESS_ADDRESS", 5);
            BUSINESS_ADDRESS = $r16;
            Parameters $r17 = new Parameters("STATE", 6);
            STATE = $r17;
            Parameters $r18 = new Parameters("LGA", 7);
            NAME = $r18;
            Parameters $r19 = new Parameters("EMAIL", 8);
            EMAIL = $r19;
            Parameters $r110 = new Parameters("DOB", 9);
            OTHER = $r110;
            Parameters $r111 = new Parameters("GENDER", 10);
            GENDER = $r111;
            Parameters $r112 = new Parameters("ACCOUNT_NUMBER", 11);
            ACCOUNT_NUMBER = $r112;
            Parameters $r113 = new Parameters("ACCOUNT_NAME", 12);
            ACCOUNT_NAME = $r113;
            Parameters $r114 = new Parameters("BANK", 13);
            BANK = $r114;
            Parameters $r115 = new Parameters("NOK_NAME", 14);
            NOK_NAME = $r115;
            Parameters $r116 = new Parameters("NOK_NUMBER", 15);
            NOK_NUMBER = $r116;
            Parameters $r117 = new Parameters("INITIAL_KYC_LEVEL", 16);
            INITIAL_KYC_LEVEL = $r117;
            Parameters $r118 = new Parameters("UTILITY_BILL", 17);
            UTILITY_BILL = $r118;
            Parameters $r119 = new Parameters("ID_TYPE", 18);
            ID_TYPE = $r119;
            Parameters $r120 = new Parameters("ID_NUMBER", 19);
            ID_NUMBER = $r120;
            Parameters $r121 = new Parameters("STATUS", 20);
            STATUS = $r121;
            Parameters $r122 = new Parameters("TERMINAL_DETAILS", 21);
            TERMINAL_DETAILS = $r122;
            Parameters $r123 = new Parameters("ERROR_MESSAGE", 22);
            ERROR_MESSAGE = $r123;
            Parameters $r124 = new Parameters("PURPOSE", 23);
            PURPOSE = $r124;
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
