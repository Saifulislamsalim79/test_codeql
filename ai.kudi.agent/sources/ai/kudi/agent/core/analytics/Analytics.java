package ai.kudi.agent.core.analytics;

import ai.kudi.agent.core.analytics.contracts.AnnouncementAnalytics;
import ai.kudi.agent.core.analytics.contracts.HomeAnalytics;
import ai.kudi.agent.core.analytics.contracts.InsuranceAnalytics;
import ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics;
import ai.kudi.agent.core.analytics.contracts.KShockAnalytics;
import ai.kudi.agent.core.analytics.contracts.LoginAnalytics;
import ai.kudi.agent.core.analytics.contracts.MarketplaceAnalytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics;
import ai.kudi.agent.core.analytics.contracts.ReferralAnalytics;
import ai.kudi.agent.core.analytics.contracts.SavingsAnalytics;
import ai.kudi.agent.core.analytics.contracts.SettingsAnalytics;
import ai.kudi.agent.core.analytics.contracts.TransactionsCommissionsAnalytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics;
import ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics;
import ai.kudi.agent.core.analytics.contracts.WithdrawalAnalytics;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
/* compiled from: Analytics.kt */
@Metadata(m10422d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0012\bf\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u0012:\u0001JJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H&JD\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J\"\u0010#\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J\u001c\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0016H&J\u0012\u0010'\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H&J\b\u0010(\u001a\u00020\u0014H&J\u0012\u0010)\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H&J\b\u0010*\u001a\u00020\u0014H&J\u001a\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J,\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J,\u00100\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J*\u00101\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J2\u00104\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J\u001a\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u0002092\b\u0010!\u001a\u0004\u0018\u00010\"H&J\u001a\u0010:\u001a\u00020\u00142\u0006\u00108\u001a\u0002092\b\u0010!\u001a\u0004\u0018\u00010\"H&J*\u0010;\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J\u0012\u0010<\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H&J\b\u0010=\u001a\u00020\u0014H&J\u0012\u0010>\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H&J:\u0010?\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J\u0012\u0010B\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H&J*\u0010C\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\u0006\u0010D\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J:\u0010F\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J:\u0010G\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J:\u0010H\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&J\u001a\u0010I\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H&¨\u0006K"}, m10421d2 = {"Lai/kudi/agent/core/analytics/Analytics;", "Lai/kudi/agent/core/analytics/contracts/ReferralAnalytics;", "Lai/kudi/agent/core/analytics/VoucherAnalytics;", "Lai/kudi/agent/core/analytics/contracts/TransferToBankAnalytics;", "Lai/kudi/agent/core/analytics/contracts/WalletTopUpAnalytics;", "Lai/kudi/agent/core/analytics/contracts/OnboardingAnalytics;", "Lai/kudi/agent/core/analytics/contracts/SettingsAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/WithdrawalAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/HomeAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/IssueResolutionAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/LoginAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/OutletMgtAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/TransferToMultipleBanksAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/KShockAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/TransactionsCommissionsAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/AnnouncementAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/MarketplaceAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/SavingsAnalytics$Actions;", "Lai/kudi/agent/core/analytics/contracts/InsuranceAnalytics$Actions;", "logKYCFormWasNotHelpfulClicked", "", "issueType", "", "issueDescription", "logKYcFormWasHelpfulClicked", "loginEvent", "isSuccessful", "", "deviceName", "deviceId", "phoneNumber", "errorMessage", "appVersionName", "user", "Lai/kudi/agent/users/domain/dto/User;", "onAgentCreation", "name", "onCallSupportClicked", "screen", "onCallUsEvent", "onClickExitApp", "onClickFAQ", "onClickGoToPlaystore", "onDashboardEvent", "type", "onHelpNosButtonClickedEvent", "option", TransactionField.AMOUNT, "onHelpYesButtonClickedEvent", "onIssueSubmitButtonClickedEvent", "comment", "issueTitle", "onNeedHelpedClickedEvent", "kycLevel", "reference", "onNotificationIconClickedEvent", "numberOfUnreadNotification", "", "onNotificationMenuClickedEvent", "onPrinterButtonClickedEvent", "onSendAMessageEvent", "onShowUnAuthorizedInstalledScreen", "onTransactionAuthEvent", "onTransactionCreationEvent", "productId", "fee", "onTransactionFilterIconClickedEvent", "onTransactionFilterSubmitButtonClickedEvent", "timeFrom", "timeTo", "onTransactionLookUpEvent", "onTransactionPriceFetchEvent", "onTransactionRefreshedClickedEvent", "onTransactionTypeSelectedEvent", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface Analytics extends ReferralAnalytics, VoucherAnalytics, TransferToBankAnalytics, WalletTopUpAnalytics, OnboardingAnalytics, SettingsAnalytics.Actions, WithdrawalAnalytics.Actions, HomeAnalytics.Actions, IssueResolutionAnalytics.Actions, LoginAnalytics.Actions, OutletMgtAnalytics.Actions, TransferToMultipleBanksAnalytics.Actions, KShockAnalytics.Actions, TransactionsCommissionsAnalytics.Actions, AnnouncementAnalytics.Actions, MarketplaceAnalytics.Actions, SavingsAnalytics.Actions, InsuranceAnalytics.Actions {
    public static final String CALL_SUPPORT_CLICKED = "call_support_clicked";
    public static final Companion Companion;
    public static final String PHONE_NUMBER = "phone_number";
    public static final String SCREEN = "screen";
    public static final String SCREEN_BVN_VERIFICATION = "bvn_verification";
    public static final String SCREEN_CONTACT_US = "contact_us";
    public static final String SCREEN_HOME = "home";
    public static final String SCREEN_LOGIN = "login";
    public static final String SCREEN_ONBOARDING = "onboarding";

    /* compiled from: Analytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/analytics/Analytics$Companion;", "", "()V", "CALL_SUPPORT_CLICKED", "", "PHONE_NUMBER", "SCREEN", "SCREEN_BVN_VERIFICATION", "SCREEN_CONTACT_US", "SCREEN_HOME", "SCREEN_LOGIN", "SCREEN_ONBOARDING", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE;
        public static final String CALL_SUPPORT_CLICKED = "call_support_clicked";
        public static final String PHONE_NUMBER = "phone_number";
        public static final String SCREEN = "screen";
        public static final String SCREEN_BVN_VERIFICATION = "bvn_verification";
        public static final String SCREEN_CONTACT_US = "contact_us";
        public static final String SCREEN_HOME = "home";
        public static final String SCREEN_LOGIN = "login";
        public static final String SCREEN_ONBOARDING = "onboarding";

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Companion $r0 = new Companion();
            $$INSTANCE = $r0;
        }

        private Companion() {
        }
    }

    /* compiled from: Analytics.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void onCallSupportClicked$default(Analytics analytics, String str, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCallSupportClicked");
                throw $r4;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r3 = null;
            }
            analytics.onCallSupportClicked(str, $r3);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void onHelpNosButtonClickedEvent$default(Analytics analytics, String str, String $r5, String str2, User user, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r6 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onHelpNosButtonClickedEvent");
                throw $r6;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r5 = "No, I did not";
            }
            analytics.onHelpNosButtonClickedEvent(str, $r5, str2, user);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void onHelpYesButtonClickedEvent$default(Analytics analytics, String str, String $r5, String str2, User user, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r6 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onHelpYesButtonClickedEvent");
                throw $r6;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r5 = "Yes, I did";
            }
            analytics.onHelpYesButtonClickedEvent(str, $r5, str2, user);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = Companion.$$INSTANCE;
        Companion = $r0;
    }

    void logKYCFormWasNotHelpfulClicked(String str, String str2);

    void logKYcFormWasHelpfulClicked(String str, String str2);

    void loginEvent(boolean z, String str, String str2, String str3, String str4, String str5, User user);

    void onAgentCreation(String str, String str2, User user);

    void onCallSupportClicked(String str, String str2);

    void onCallUsEvent(User user);

    void onClickExitApp();

    void onClickFAQ(User user);

    void onClickGoToPlaystore();

    void onDashboardEvent(String str, User user);

    void onHelpNosButtonClickedEvent(String str, String str2, String str3, User user);

    void onHelpYesButtonClickedEvent(String str, String str2, String str3, User user);

    void onIssueSubmitButtonClickedEvent(String str, String str2, String str3, User user);

    void onNeedHelpedClickedEvent(String str, String str2, String str3, String str4, User user);

    void onNotificationIconClickedEvent(int i, User user);

    void onNotificationMenuClickedEvent(int i, User user);

    void onPrinterButtonClickedEvent(String str, String str2, String str3, User user);

    void onSendAMessageEvent(User user);

    void onShowUnAuthorizedInstalledScreen();

    void onTransactionAuthEvent(User user);

    void onTransactionCreationEvent(String str, String str2, String str3, String str4, String str5, User user);

    void onTransactionFilterIconClickedEvent(User user);

    void onTransactionFilterSubmitButtonClickedEvent(String str, String str2, String str3, User user);

    void onTransactionLookUpEvent(String str, String str2, String str3, String str4, String str5, User user);

    void onTransactionPriceFetchEvent(String str, String str2, String str3, String str4, String str5, User user);

    void onTransactionRefreshedClickedEvent(String str, String str2, String str3, String str4, String str5, User user);

    void onTransactionTypeSelectedEvent(String str, User user);
}
