package ai.kudi.agent.core.internal.components;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.bills.p002ui.PerformPaymentActivity;
import ai.kudi.agent.core.fcm.FCMListenerService;
import ai.kudi.agent.dashboard.mods.TransactionBreakDownActivity;
import ai.kudi.agent.faceverification.FaceVerificationFragment;
import ai.kudi.agent.help.p006ui.HelpActivity;
import ai.kudi.agent.inbox.game.components.InboxSubComponent;
import ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment;
import ai.kudi.agent.kcash.KCashActivity;
import ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent;
import ai.kudi.agent.login.game.components.EnableFingerPrintSubComponent;
import ai.kudi.agent.login.game.components.ForgotPasswordSubComponent;
import ai.kudi.agent.login.game.components.LoginSubComponent;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.login.setup.p010ui.EnforceBvnVerificationFragment;
import ai.kudi.agent.login.setup.p010ui.SetupAgentAccountActivity;
import ai.kudi.agent.notification.p013ui.NotificationActivity;
import ai.kudi.agent.notification.p013ui.NotificationDetailsActivity;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.pictureupload.labs.PictureUploadSubComponent;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent;
import ai.kudi.agent.referral.xmpp.components.ReferralSubComponent;
import ai.kudi.agent.register.p022v2.p023ui.OtpFragment;
import ai.kudi.agent.register.xmpp.components.PendingKycSubComponent;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent;
import ai.kudi.agent.settings.insurance.xpp3.CashInsuranceActivitySubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.start.SplashActivity;
import ai.kudi.agent.start.UnauthorizedInstallationActivity;
import ai.kudi.agent.start.intro.OnBoardingActivity;
import ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent;
import ai.kudi.agent.transactionhistory.labs.IncompleteTransactionsSubComponent;
import ai.kudi.agent.transactions.data.worker.VerificationSubComponent;
import ai.kudi.agent.transactions.p032ui.CreateCustomerFragment;
import ai.kudi.agent.transactions.p032ui.EmailTransactionReportActivity;
import ai.kudi.agent.transactions.p032ui.RequestStatementActivity;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActionActivity;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import ai.kudi.agent.transactions.p032ui.TransactionIssueFragment;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.users.p035ui.CashoutActivity;
import ai.kudi.agent.users.p035ui.KCashTopupActivity;
import ai.kudi.agent.voucher.cashout.p039ui.VoucherCashOutPhoneVerificationActivity;
import ai.kudi.agent.voucher.cashout.p039ui.VoucherCodeInputFragment;
import ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdrawal.xmpp.components.WithdrawalSubComponent;
import android.app.Application;
import kotlin.Metadata;
/* compiled from: ApplicationComponent.kt */
@Metadata(m10422d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001dJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020$H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020)H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u000200H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u000201H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u000202H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u000203H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u00104\u001a\u000205H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u00106\u001a\u000207H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u00108\u001a\u000209H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010:\u001a\u00020;H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010<\u001a\u00020=H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020>H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010?\u001a\u00020@H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010A\u001a\u00020BH&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010C\u001a\u00020DH&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020EH&J\b\u0010F\u001a\u00020GH&J\b\u0010H\u001a\u00020IH&J\b\u0010J\u001a\u00020KH&J\b\u0010L\u001a\u00020MH&J\b\u0010N\u001a\u00020OH&J\b\u0010P\u001a\u00020QH&J\b\u0010R\u001a\u00020SH&J\b\u0010T\u001a\u00020UH&J\b\u0010V\u001a\u00020WH&J\b\u0010X\u001a\u00020YH&J\b\u0010Z\u001a\u00020[H&J\b\u0010\\\u001a\u00020]H&J\b\u0010^\u001a\u00020_H&J\b\u0010`\u001a\u00020aH&J\b\u0010b\u001a\u00020cH&¨\u0006e"}, m10421d2 = {"Lai/kudi/agent/core/di/components/ApplicationComponent;", "", "bankAccountSubcomponent", "Lai/kudi/agent/settings/account/di/BankAccountSubcomponent$Factory;", "bvnVerificationSubComponent", "Lai/kudi/agent/settings/di/components/BvnVerificationSubcomponent$Factory;", "cashInsuranceActivitySubComponent", "Lai/kudi/agent/settings/insurance/di/CashInsuranceActivitySubComponent$Factory;", "cashWithdrawalOptionsSubcomponent", "Lai/kudi/agent/withdraw_cash/di/components/CashWithdrawalOptionComponent$Factory;", "devciceVerificationSubcomponent", "Lai/kudi/agent/login/di/components/DeviceVerificationSubcomponent$Factory;", "enableFingerSubComponent", "Lai/kudi/agent/login/di/components/EnableFingerPrintSubComponent$Factory;", "forgotPasswordV2SubComponemt", "Lai/kudi/agent/login/di/components/ForgotPasswordSubComponent$Factory;", "inboxSubComponent", "Lai/kudi/agent/inbox/di/components/InboxSubComponent$Factory;", "incompleteTransactionsSubComponent", "Lai/kudi/agent/transactionhistory/di/IncompleteTransactionsSubComponent$Factory;", "inject", "", "app", "Lai/kudi/agent/BaseApplication;", "fragment", "Lai/kudi/agent/banks/ui/BanksFragment;", "performPaymentActivity", "Lai/kudi/agent/bills/ui/PerformPaymentActivity;", "service", "Lai/kudi/agent/core/fcm/FCMListenerService;", "transactionBreakDownActivity", "Lai/kudi/agent/dashboard/ui/TransactionBreakDownActivity;", "faceVerificationFragment", "Lai/kudi/agent/faceverification/FaceVerificationFragment;", "helpActivity", "Lai/kudi/agent/help/ui/HelpActivity;", "Lai/kudi/agent/issues/ui/IssuesTermsAndConditionsFragment;", "kCashActivity", "Lai/kudi/agent/kcash/KCashActivity;", "accountHolderVerificationActivity", "Lai/kudi/agent/login/setup/ui/AccountVerificationHolderActivity;", "Lai/kudi/agent/login/setup/ui/EnforceBvnVerificationFragment;", "activity", "Lai/kudi/agent/login/setup/ui/SetupAgentAccountActivity;", "notificationActivity", "Lai/kudi/agent/notification/ui/NotificationActivity;", "notificationDetailsActivity", "Lai/kudi/agent/notification/ui/NotificationDetailsActivity;", "Lai/kudi/agent/register/v2/ui/OtpFragment;", "Lai/kudi/agent/start/SplashActivity;", "Lai/kudi/agent/start/UnauthorizedInstallationActivity;", "Lai/kudi/agent/start/intro/OnBoardingActivity;", "createCustomerFragment", "Lai/kudi/agent/transactions/ui/CreateCustomerFragment;", "transactionFilterActivity", "Lai/kudi/agent/transactions/ui/EmailTransactionReportActivity;", "displayFilteredTransactionActivity", "Lai/kudi/agent/transactions/ui/RequestStatementActivity;", "transactionDetailsActionActivity", "Lai/kudi/agent/transactions/ui/TransactionDetailsActionActivity;", "transactionDetailsActivity", "Lai/kudi/agent/transactions/ui/TransactionDetailsActivity;", "Lai/kudi/agent/transactions/ui/TransactionIssueFragment;", "cashoutActivity", "Lai/kudi/agent/users/ui/CashoutActivity;", "kCashTopupActivity", "Lai/kudi/agent/users/ui/KCashTopupActivity;", "voucherCashOutPhoneVerificationActivity", "Lai/kudi/agent/voucher/cashout/ui/VoucherCashOutPhoneVerificationActivity;", "Lai/kudi/agent/voucher/cashout/ui/VoucherCodeInputFragment;", "loginSubComponent", "Lai/kudi/agent/login/di/components/LoginSubComponent$Factory;", "mainTransferSubComponent", "Lai/kudi/agent/transfer/di/components/MainTransferSubComponent$Factory;", "outletMgtFeaturesSubComponent", "Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents$Factory;", "outletMgtSubComponent", "Lai/kudi/agent/outlet_mgt/di/components/OutletMgtSubComponent$Factory;", "pendingKycSubCpomponent", "Lai/kudi/agent/register/di/components/PendingKycSubComponent$Factory;", "pictureUploadSubComponent", "Lai/kudi/agent/pictureupload/di/PictureUploadSubComponent$Factory;", "pos2SubComponent", "Lai/kudi/agent/pos/di/components/PosSubComponent$Factory;", "postRegistrationSubComponent", "Lai/kudi/agent/postRegistrationSetUp/di/PostRegSetUpSubComponent$Factory;", "referralSubComponent", "Lai/kudi/agent/referral/di/components/ReferralSubComponent$Factory;", "registrationV2SubComponent", "Lai/kudi/agent/register/di/components/RegistrationSubComponent$Factory;", "settingsSubComponent", "Lai/kudi/agent/settings/di/components/SettingsSubComponent$Factory;", "transactionCommissionsSubComponent", "Lai/kudi/agent/transactioncommissions/di/TransactionCommissionsSubComponent$Factory;", "verificationSubComponent", "Lai/kudi/agent/transactions/data/di/VerificationSubComponent$Factory;", "walletTopUpSubComponent", "Lai/kudi/agent/wallettopup/di/WalletTopupSubcomponent$Factory;", "withdrawalSubComponent", "Lai/kudi/agent/withdrawal/di/components/WithdrawalSubComponent$Factory;", "Builder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ApplicationComponent {

    /* compiled from: ApplicationComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/di/components/ApplicationComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lai/kudi/agent/core/di/components/ApplicationComponent;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Builder {
        Builder application(Application application);

        ApplicationComponent build();
    }

    BankAccountSubcomponent.Factory bankAccountSubcomponent();

    BvnVerificationSubcomponent.Factory bvnVerificationSubComponent();

    CashInsuranceActivitySubComponent.Factory cashInsuranceActivitySubComponent();

    CashWithdrawalOptionComponent.Factory cashWithdrawalOptionsSubcomponent();

    DeviceVerificationSubcomponent.Factory devciceVerificationSubcomponent();

    EnableFingerPrintSubComponent.Factory enableFingerSubComponent();

    ForgotPasswordSubComponent.Factory forgotPasswordV2SubComponemt();

    InboxSubComponent.Factory inboxSubComponent();

    IncompleteTransactionsSubComponent.Factory incompleteTransactionsSubComponent();

    void inject(BaseApplication baseApplication);

    void inject(BanksFragment banksFragment);

    void inject(PerformPaymentActivity performPaymentActivity);

    void inject(FCMListenerService fCMListenerService);

    void inject(TransactionBreakDownActivity transactionBreakDownActivity);

    void inject(FaceVerificationFragment faceVerificationFragment);

    void inject(HelpActivity helpActivity);

    void inject(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment);

    void inject(KCashActivity kCashActivity);

    void inject(AccountVerificationHolderActivity accountVerificationHolderActivity);

    void inject(EnforceBvnVerificationFragment enforceBvnVerificationFragment);

    void inject(SetupAgentAccountActivity setupAgentAccountActivity);

    void inject(NotificationActivity notificationActivity);

    void inject(NotificationDetailsActivity notificationDetailsActivity);

    void inject(OtpFragment otpFragment);

    void inject(SplashActivity splashActivity);

    void inject(UnauthorizedInstallationActivity unauthorizedInstallationActivity);

    void inject(OnBoardingActivity onBoardingActivity);

    void inject(CreateCustomerFragment createCustomerFragment);

    void inject(EmailTransactionReportActivity emailTransactionReportActivity);

    void inject(RequestStatementActivity requestStatementActivity);

    void inject(TransactionDetailsActionActivity transactionDetailsActionActivity);

    void inject(TransactionDetailsActivity transactionDetailsActivity);

    void inject(TransactionIssueFragment transactionIssueFragment);

    void inject(CashoutActivity cashoutActivity);

    void inject(KCashTopupActivity kCashTopupActivity);

    void inject(VoucherCashOutPhoneVerificationActivity voucherCashOutPhoneVerificationActivity);

    void inject(VoucherCodeInputFragment voucherCodeInputFragment);

    LoginSubComponent.Factory loginSubComponent();

    MainTransferSubComponent.Factory mainTransferSubComponent();

    OutletMgtFeaturesSubcomponents.Factory outletMgtFeaturesSubComponent();

    OutletMgtSubComponent.Factory outletMgtSubComponent();

    PendingKycSubComponent.Factory pendingKycSubCpomponent();

    PictureUploadSubComponent.Factory pictureUploadSubComponent();

    PosSubComponent.Factory pos2SubComponent();

    PostRegSetUpSubComponent.Factory postRegistrationSubComponent();

    ReferralSubComponent.Factory referralSubComponent();

    RegistrationSubComponent.Factory registrationV2SubComponent();

    SettingsSubComponent.Factory settingsSubComponent();

    TransactionCommissionsSubComponent.Factory transactionCommissionsSubComponent();

    VerificationSubComponent.Factory verificationSubComponent();

    WalletTopupSubcomponent.Factory walletTopUpSubComponent();

    WithdrawalSubComponent.Factory withdrawalSubComponent();
}
