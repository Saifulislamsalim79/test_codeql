package ai.kudi.agent.core.internal.components;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.BaseApplication_MembersInjector;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.banks.domain.BanksLocalSource;
import ai.kudi.agent.banks.domain.BanksRemoteSource;
import ai.kudi.agent.banks.domain.BanksRepository;
import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.banks.p001ui.BanksFragment_MembersInjector;
import ai.kudi.agent.banks.p001ui.BanksViewModel;
import ai.kudi.agent.banks.useCases.FetchBanks;
import ai.kudi.agent.bills.data.AnnouncementRepository;
import ai.kudi.agent.bills.data.remote.BillsService;
import ai.kudi.agent.bills.data.source.AnnouncementsDataSource;
import ai.kudi.agent.bills.domain.usecases.FetchFrequentlyUsedBills;
import ai.kudi.agent.bills.domain.usecases.PerformBillerLookup;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.bills.domain.usecases.SubmitBillRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitMultipleTransferRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitTransferRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitWithdrawalRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitWithdrawalUpdate;
import ai.kudi.agent.bills.p002ui.HomeFragment;
import ai.kudi.agent.bills.p002ui.HomeFragment_MembersInjector;
import ai.kudi.agent.bills.p002ui.PerformPaymentActivity;
import ai.kudi.agent.bills.p002ui.PerformPaymentActivity_MembersInjector;
import ai.kudi.agent.bills.viewmodels.PerformPaymentViewModel;
import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment_MembersInjector;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.AnalyticsModule;
import ai.kudi.agent.core.analytics.AnalyticsModule_ProvidesAnalyticsImplFactory;
import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.data.remote.CoreApiService;
import ai.kudi.agent.core.di.modules.ActivityInjectionModule_InjectAirtimeTopUpFragment;
import ai.kudi.agent.core.di.modules.ActivityInjectionModule_InjectHomeActivity;
import ai.kudi.agent.core.di.modules.ActivityInjectionModule_InjectIssueActivity;
import ai.kudi.agent.core.di.modules.ActivityInjectionModule_InjectKshockActivity;
import ai.kudi.agent.core.di.modules.ActivityInjectionModule_InjectSavingsActivity;
import ai.kudi.agent.core.di.modules.FragmentInjectionModule_InjectBanksFragment;
import ai.kudi.agent.core.di.modules.FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment;
import ai.kudi.agent.core.di.modules.FragmentInjectionModule_InjectKudiPinV2;
import ai.kudi.agent.core.di.modules.FragmentInjectionModule_InjectReceiptTerminalConfirmationFragment;
import ai.kudi.agent.core.di.modules.HomeActivityModule_InjectBvnVerificationFragment;
import ai.kudi.agent.core.di.modules.HomeActivityModule_InjectDashboardFragment;
import ai.kudi.agent.core.di.modules.HomeActivityModule_InjectFilterTransactionsFragment;
import ai.kudi.agent.core.di.modules.HomeActivityModule_InjectHomeFragment;
import ai.kudi.agent.core.di.modules.HomeActivityModule_InjectIssueHistoryFragment;
import ai.kudi.agent.core.di.modules.HomeActivityModule_InjectIssueResolutionHostFragment;
import ai.kudi.agent.core.di.modules.HomeActivityModule_InjectTransactionsContainerFragment;
import ai.kudi.agent.core.di.modules.HomeActivityModule_InjectWithdrawCashFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectContactUsFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectCustomerDetailsIssueFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectDelayedKTAtopUpFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectDisputeIssueFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectIssueDetailFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectIssueHistoryFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectIssueResolutionFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectIssueSummaryFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectIssueTypeFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectIssueTypeFragmentNew;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectKYCformIssueFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectPosIssueFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectPosTerminalIssuesFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectRatingDialog;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectSubmitWithdrawalIssueFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectSupportIssueFragment;
import ai.kudi.agent.core.di.modules.IssueActivityModule_InjectTransactionListFragment;
import ai.kudi.agent.core.di.modules.IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesApplyForLoanFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesApplyForLoanReviewFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesExistingLoanerFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesKshockAvailableFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesKshockLoansListFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesKshockNotAvailableFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesKshockNotAvailableInLocationFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesKshockOverdueLoansListFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesLoanApplicationSubmittedFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesLoanHistoryFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesLoanStatusFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesOtpVerificationFragment;
import ai.kudi.agent.core.di.modules.KshockActivityModule_ProvidesPendingLoansListFragment;
import ai.kudi.agent.core.di.modules.PicturePickerFragmentModule_InjectPicturePickerFragment;
import ai.kudi.agent.core.di.modules.ProductActivityModule_InjectAirtimeAmountFragment;
import ai.kudi.agent.core.di.modules.ProductActivityModule_InjectAirtimeTopUpFragment;
import ai.kudi.agent.core.di.modules.ProductActivityModule_InjectAmountFragment;
import ai.kudi.agent.core.di.modules.ProductActivityModule_InjectBillPaymentCustomerDetailsFragment;
import ai.kudi.agent.core.di.modules.ProductActivityModule_InjectBillPaymentStepOneFragment;
import ai.kudi.agent.core.di.modules.ProductActivityModule_InjectPayBillsFragment;
import ai.kudi.agent.core.di.modules.ProductActivityModule_InjectProductSummaryFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvideCreateSavingsFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvideGetStartedFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvideSavingsDetailFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvideSavingsFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvideSavingsPlanFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvideSavingsReviewFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvideSavingsTermsAndConditionFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvidesConfirmOtpFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvidesCreateSavingPinFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvidesDetailAndTransactionAdapter;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvidesPerformActionBottomSheet;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvidesSavingHistoryFragment;
import ai.kudi.agent.core.di.modules.SavingsModule_ProvidesWithdrawSavingsFragment;
import ai.kudi.agent.core.di.modules.TransactionsContainerFragmentModule_InjectIncompleteTransactionsFragment;
import ai.kudi.agent.core.di.modules.TransactionsContainerFragmentModule_InjectTransactionsFragment;
import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.fcm.FCMListenerService;
import ai.kudi.agent.core.fcm.FCMListenerService_MembersInjector;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.internal.modules.AbstractC0189x8054ad7c;
import ai.kudi.agent.core.internal.modules.AbstractC0191x52067c16;
import ai.kudi.agent.core.internal.modules.AbstractC0192x847dd2ab;
import ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectAirtimeTopUpFragment;
import ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectHomeActivity;
import ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectIssueActivity;
import ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectKshockActivity;
import ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectSavingsActivity;
import ai.kudi.agent.core.internal.modules.ApplicationModule;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvideAppContextFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvideFirebaseConfigFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvideFirebaseCrashlyticsFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidePFSecurityUtilsFactoryFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidePayPadFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvideSharedPrefsNameFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesCoreAppDatabaseFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesDeviceInfoFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesDeviceSecuritySharedPrefsFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesFirebaseAuthenticationFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesFirebaseDbFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesFrequentlyUsedSharedPrefsFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesGlobalNavigatorFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesPinRepoFactory;
import ai.kudi.agent.core.internal.modules.ApplicationModule_ProvidesSharedPrefsFactory;
import ai.kudi.agent.core.internal.modules.C0190x54dbc472;
import ai.kudi.agent.core.internal.modules.CacheModule;
import ai.kudi.agent.core.internal.modules.CacheModule_ProvideCacheImplFactory;
import ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectBanksFragment;
import ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment;
import ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectKudiPinV2;
import ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectBvnVerificationFragment;
import ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectDashboardFragment;
import ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectFilterTransactionsFragment;
import ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectHomeFragment;
import ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectIssueHistoryFragment;
import ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectIssueResolutionHostFragment;
import ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectTransactionsContainerFragment;
import ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectWithdrawCashFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectContactUsFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectCustomerDetailsIssueFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectDelayedKTAtopUpFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectDisputeIssueFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueDetailFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueHistoryFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueResolutionFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueSummaryFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueTypeFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueTypeFragmentNew;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectKYCformIssueFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectPosIssueFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectPosTerminalIssuesFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectRatingDialog;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectSubmitWithdrawalIssueFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectSupportIssueFragment;
import ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectTransactionListFragment;
import ai.kudi.agent.core.internal.modules.IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesApplyForLoanFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesApplyForLoanReviewFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesExistingLoanerFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockAvailableFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockLoansListFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockNotAvailableFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockOverdueLoansListFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanApplicationSubmittedFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanHistoryFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanStatusFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesOtpVerificationFragment;
import ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesPendingLoansListFragment;
import ai.kudi.agent.core.internal.modules.MultiPartFileHandlingModule;
import ai.kudi.agent.core.internal.modules.MultiPartFileHandlingModule_ProvidesMultiPartFileHandlingFactory;
import ai.kudi.agent.core.internal.modules.NetworkServicesModule;
import ai.kudi.agent.core.internal.modules.NetworkServicesModule_ProvidesBillsServiceFactory;
import ai.kudi.agent.core.internal.modules.NetworkServicesModule_ProvidesCoreApiServiceFactory;
import ai.kudi.agent.core.internal.modules.NetworkServicesModule_ProvidesIssuesApiServiceFactory;
import ai.kudi.agent.core.internal.modules.NetworkServicesModule_ProvidesSavingApiFactory;
import ai.kudi.agent.core.internal.modules.NetworkServicesModule_ProvidesUserServiceFactory;
import ai.kudi.agent.core.internal.modules.PicturePickerFragmentModule_InjectPicturePickerFragment;
import ai.kudi.agent.core.internal.modules.PictureUploadModule;
import ai.kudi.agent.core.internal.modules.PictureUploadModule_ProvidesCheckCameraPermissionFactory;
import ai.kudi.agent.core.internal.modules.PictureUploadModule_ProvidesCheckStoragePermissionFactory;
import ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAirtimeAmountFragment;
import ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAirtimeTopUpFragment;
import ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAmountFragment;
import ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectBillPaymentCustomerDetailsFragment;
import ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectBillPaymentStepOneFragment;
import ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectPayBillsFragment;
import ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectProductSummaryFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvideCreateSavingsFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvideGetStartedFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsDetailFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsPlanFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsReviewFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsTermsAndConditionFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesConfirmOtpFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesCreateSavingPinFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesDetailAndTransactionAdapter;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesPerformActionBottomSheet;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesSavingHistoryFragment;
import ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesWithdrawSavingsFragment;
import ai.kudi.agent.core.internal.modules.TransactionsContainerFragmentModule_InjectTransactionsFragment;
import ai.kudi.agent.core.internal.viewmodels.ViewModelFactoryModule;
import ai.kudi.agent.core.internal.viewmodels.ViewModelFactoryModule_ViewModelFactoryFactory;
import ai.kudi.agent.core.navigation.GlobalNavigator;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.schedulers.RxSchedulers_Factory;
import ai.kudi.agent.core.usecases.CheckPermission;
import ai.kudi.agent.core.usecases.LogUserEventUseCase;
import ai.kudi.agent.core.usecases.MultiPartFileHandling;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.dashboard.domain.usecases.DashboardSummary;
import ai.kudi.agent.dashboard.domain.usecases.TransactionBreakDownSummary;
import ai.kudi.agent.dashboard.mods.DashboardFragment;
import ai.kudi.agent.dashboard.mods.DashboardFragment_MembersInjector;
import ai.kudi.agent.dashboard.mods.TransactionBreakDownActivity;
import ai.kudi.agent.dashboard.mods.TransactionBreakDownActivity_MembersInjector;
import ai.kudi.agent.dashboard.presenter.DashboardPresenter;
import ai.kudi.agent.dashboard.presenter.TransactionBreakDownPresenter;
import ai.kudi.agent.faceverification.FaceVerificationFragment;
import ai.kudi.agent.faceverification.FaceVerificationFragment_MembersInjector;
import ai.kudi.agent.faceverification.FaceVerificationViewModel;
import ai.kudi.agent.help.p006ui.HelpActivity;
import ai.kudi.agent.help.p006ui.HelpActivity_MembersInjector;
import ai.kudi.agent.help.presenter.HelpPresenter;
import ai.kudi.agent.help.scalar.usecase.FetchPhoneNumbers;
import ai.kudi.agent.home.BvnHomeUpdateFragment;
import ai.kudi.agent.home.BvnHomeUpdateFragment_MembersInjector;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.home.HomeActivity_MembersInjector;
import ai.kudi.agent.home.HomePresenter;
import ai.kudi.agent.inbox.game.components.InboxSubComponent;
import ai.kudi.agent.inbox.navigators.InboxNavigator;
import ai.kudi.agent.inbox.p007ui.InboxActivity;
import ai.kudi.agent.inbox.p007ui.InboxActivity_MembersInjector;
import ai.kudi.agent.inbox.p007ui.InboxIssueListFragment;
import ai.kudi.agent.inbox.p007ui.InboxIssueListFragment_MembersInjector;
import ai.kudi.agent.inbox.presenters.InboxContainerPresenter;
import ai.kudi.agent.inbox.presenters.InboxListPresenter;
import ai.kudi.agent.issues.data.remote.IssuesApiService;
import ai.kudi.agent.issues.domain.AttachImage;
import ai.kudi.agent.issues.domain.CreateTicket;
import ai.kudi.agent.issues.domain.FetchCategoryByLabel;
import ai.kudi.agent.issues.domain.FetchIssueCategories;
import ai.kudi.agent.issues.domain.FetchIssueType;
import ai.kudi.agent.issues.domain.FetchTicket;
import ai.kudi.agent.issues.domain.FetchTickets;
import ai.kudi.agent.issues.domain.RateIssue;
import ai.kudi.agent.issues.domain.dataSource.ApiDataSource;
import ai.kudi.agent.issues.domain.dataSource.LocalDataSource;
import ai.kudi.agent.issues.domain.repositories.IssueRepository;
import ai.kudi.agent.issues.game.components.IssueModule;
import ai.kudi.agent.issues.game.components.IssueModule_ProvidesIssueRepositoryFactory;
import ai.kudi.agent.issues.p008ui.ContactUsFragment;
import ai.kudi.agent.issues.p008ui.ContactUsFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.CustomerDetailsIssueFragment;
import ai.kudi.agent.issues.p008ui.CustomerDetailsIssueFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.DelayedKTAtopUpFragment;
import ai.kudi.agent.issues.p008ui.DelayedKTAtopUpFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.DisputeIssueFragment;
import ai.kudi.agent.issues.p008ui.DisputeIssueFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.issues.p008ui.IssueActivity_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssueDetailFragment;
import ai.kudi.agent.issues.p008ui.IssueDetailFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssueHistoryFragment;
import ai.kudi.agent.issues.p008ui.IssueHistoryFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssueResolutionFragment;
import ai.kudi.agent.issues.p008ui.IssueResolutionFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssueResolutionHostFragment;
import ai.kudi.agent.issues.p008ui.IssueResolutionHostFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssueSummaryFragment;
import ai.kudi.agent.issues.p008ui.IssueSummaryFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssueTypeFragment;
import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssueTypeFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment;
import ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.KYCformIssueFragment;
import ai.kudi.agent.issues.p008ui.KYCformIssueFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.PosIssueFragment;
import ai.kudi.agent.issues.p008ui.PosIssueFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.PosTerminalIssuesFragment;
import ai.kudi.agent.issues.p008ui.PosTerminalIssuesFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.RatingDialog;
import ai.kudi.agent.issues.p008ui.RatingDialog_MembersInjector;
import ai.kudi.agent.issues.p008ui.SubmitWithdrawalIssueFragment;
import ai.kudi.agent.issues.p008ui.SubmitWithdrawalIssueFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.SupportIssueFragment;
import ai.kudi.agent.issues.p008ui.SupportIssueFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.TransactionListFragment;
import ai.kudi.agent.issues.p008ui.TransactionListFragment_MembersInjector;
import ai.kudi.agent.issues.p008ui.viewModels.ContactUsViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.CustomerDetailsIssueViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.DelayedKTAViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.IssueTypeViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.PosTerminalIssuesViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.RatingViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.SubmitWidthrawalIssueViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.TermsAndAndConditionsViewModel;
import ai.kudi.agent.issues.presenters.DisputePresenter;
import ai.kudi.agent.issues.presenters.IssueContainerPresenter;
import ai.kudi.agent.issues.presenters.IssueHistoryPresenter;
import ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter;
import ai.kudi.agent.issues.presenters.PosIssuePresenter;
import ai.kudi.agent.issues.presenters.SubmitIssuePresenter;
import ai.kudi.agent.issues.presenters.SupportIssuePresenter;
import ai.kudi.agent.issues.presenters.TransactionListPresenter;
import ai.kudi.agent.kcash.KCashActivity;
import ai.kudi.agent.kcash.KCashActivity_MembersInjector;
import ai.kudi.agent.kcash.viewmodels.KCashViewModel;
import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import ai.kudi.agent.kshock.labs.KShockModule;
import ai.kudi.agent.kshock.labs.KShockModule_ProvidesKShockApiFactory;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.p009ui.KShockActivity_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanFragment;
import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanReviewFragment;
import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanReviewFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.KShockAvailableFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockAvailableFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.KShockEligibilityCriteriaFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockEligibilityCriteriaFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.KShockNotAvailableFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockNotAvailableInLocationFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockExistingLoanerFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockExistingLoanerFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.KshockLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockLoansListFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansListFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.LoanApplicationSubmittedFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanHistoryFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanHistoryFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.LoanStatusFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanStatusFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.OtpVerificationFragment;
import ai.kudi.agent.kshock.p009ui.views.OtpVerificationFragment_MembersInjector;
import ai.kudi.agent.kshock.p009ui.views.OtpVerificationViewModel;
import ai.kudi.agent.kshock.presentation.ApplyForLoanReviewViewModel;
import ai.kudi.agent.kshock.presentation.ApplyForLoanViewModel;
import ai.kudi.agent.kshock.presentation.KShockEligibilityCriteriaViewModel;
import ai.kudi.agent.kshock.presentation.KShockViewModel;
import ai.kudi.agent.kshock.presentation.KshockExistingLoanerViewModel;
import ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel;
import ai.kudi.agent.kshock.presentation.LoanHistoryViewModel;
import ai.kudi.agent.kshock.presentation.LoanHistoryViewModel_Factory;
import ai.kudi.agent.kshock.presentation.LoanStatusViewModel;
import ai.kudi.agent.kshock.repositories.KshockExistingLoanerRepository;
import ai.kudi.agent.kshock.usecases.CancelLoanRequest;
import ai.kudi.agent.kshock.usecases.FetchExistingLoaner;
import ai.kudi.agent.kshock.usecases.FetchKshockAvailabilty;
import ai.kudi.agent.kshock.usecases.FetchLoanHistory;
import ai.kudi.agent.kshock.usecases.FetchLoanInterest;
import ai.kudi.agent.kshock.usecases.FetchNewKshockEligibility;
import ai.kudi.agent.kshock.usecases.FetchOverdueLoanHistory;
import ai.kudi.agent.kshock.usecases.FetchPaginatedLoanHistory;
import ai.kudi.agent.kshock.usecases.FetchPaginatedLoanHistory_Factory;
import ai.kudi.agent.kshock.usecases.FetchPendingLoan;
import ai.kudi.agent.kshock.usecases.GetWalletUseCase;
import ai.kudi.agent.kshock.usecases.OtpStatusCheck;
import ai.kudi.agent.kshock.usecases.PaybackLoan;
import ai.kudi.agent.kshock.usecases.PaybackOverdueLoan;
import ai.kudi.agent.kshock.usecases.PerformLoanRequest;
import ai.kudi.agent.kshock.usecases.SubmitTransactionRequest;
import ai.kudi.agent.kshock.usecases.VerifyOtp;
import ai.kudi.agent.login.domain.usecases.CreateTempAgent;
import ai.kudi.agent.login.domain.usecases.RequestOtp;
import ai.kudi.agent.login.domain.usecases.ResendOTP;
import ai.kudi.agent.login.domain.usecases.SetNewPin;
import ai.kudi.agent.login.domain.usecases.ValidateNewPhoneNumber;
import ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent;
import ai.kudi.agent.login.game.components.EnableFingerPrintSubComponent;
import ai.kudi.agent.login.game.components.ForgotPasswordSubComponent;
import ai.kudi.agent.login.game.components.LoginSubComponent;
import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import ai.kudi.agent.login.navigators.PhoneVerificationNavigator;
import ai.kudi.agent.login.p011ui.EnableFingerPrintActivity;
import ai.kudi.agent.login.p011ui.LoginActivity;
import ai.kudi.agent.login.p011ui.LoginActivity_MembersInjector;
import ai.kudi.agent.login.p011ui.NonAgentSignOnFragment;
import ai.kudi.agent.login.p011ui.NonAgentSignOnFragment_MembersInjector;
import ai.kudi.agent.login.p011ui.p012v2.EnterPhoneNoFragment;
import ai.kudi.agent.login.p011ui.p012v2.EnterPhoneNoFragment_MembersInjector;
import ai.kudi.agent.login.p011ui.p012v2.ForgotPasswordActivity;
import ai.kudi.agent.login.p011ui.p012v2.ForgotPasswordActivity_MembersInjector;
import ai.kudi.agent.login.p011ui.p012v2.ResetPinFragment;
import ai.kudi.agent.login.p011ui.p012v2.ResetPinFragment_MembersInjector;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.EnterPhoneNoViewModel;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.ForgotPasswordViewModel;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.ResetPinViewModel;
import ai.kudi.agent.login.presenters.LoginPresenter;
import ai.kudi.agent.login.setup.domain.AddDevice;
import ai.kudi.agent.login.setup.domain.SendOtpForDeviceVerification;
import ai.kudi.agent.login.setup.domain.UpdateBvnUseCase;
import ai.kudi.agent.login.setup.domain.VerifyFaceForLogin;
import ai.kudi.agent.login.setup.domain.VerifyFaceWithDob;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity_MembersInjector;
import ai.kudi.agent.login.setup.p010ui.BvnUpdateFragment;
import ai.kudi.agent.login.setup.p010ui.BvnUpdateFragment_MembersInjector;
import ai.kudi.agent.login.setup.p010ui.EnforceBvnVerificationFragment;
import ai.kudi.agent.login.setup.p010ui.EnforceBvnVerificationFragment_MembersInjector;
import ai.kudi.agent.login.setup.p010ui.NewDeviceVerificationOptionFragment;
import ai.kudi.agent.login.setup.p010ui.NewDeviceVerificationOptionFragment_MembersInjector;
import ai.kudi.agent.login.setup.p010ui.SetupAgentAccountActivity;
import ai.kudi.agent.login.setup.p010ui.SetupAgentAccountActivity_MembersInjector;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceDobFragment;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceDobFragment_MembersInjector;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceFaceVerificationFragment;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceFaceVerificationFragment_MembersInjector;
import ai.kudi.agent.login.setup.presenters.AccountVerificationPresenter;
import ai.kudi.agent.login.setup.presenters.EnforceBvnVerificationViewModel;
import ai.kudi.agent.login.setup.presenters.SecureAccountPresenter;
import ai.kudi.agent.login.setup.presenters.UnknownDeviceFaceVerificationViewModel;
import ai.kudi.agent.login.setup.viewModels.NewDeviceVerificationViewModel;
import ai.kudi.agent.login.setup.viewModels.UnknownDeviceDobViewModel;
import ai.kudi.agent.network.mods.NetworkModule;
import ai.kudi.agent.network.mods.NetworkModule_ProvidesAuthInterceptorFactory;
import ai.kudi.agent.network.mods.NetworkModule_ProvidesLoginInterceptorFactory;
import ai.kudi.agent.network.mods.NetworkModule_ProvidesMediaServiceFactory;
import ai.kudi.agent.network.mods.NetworkModule_ProvidesVersionInterceptorFactory;
import ai.kudi.agent.network.mods.ServiceModule;
import ai.kudi.agent.network.mods.ServiceModule_ProvidesRetrofitFactory;
import ai.kudi.agent.notification.domain.FetchNotificationActivities;
import ai.kudi.agent.notification.domain.FetchNotificationCount;
import ai.kudi.agent.notification.domain.UpdateNotificationReadStatus;
import ai.kudi.agent.notification.p013ui.NotificationActivity;
import ai.kudi.agent.notification.p013ui.NotificationActivity_MembersInjector;
import ai.kudi.agent.notification.p013ui.NotificationDetailsActivity;
import ai.kudi.agent.notification.p013ui.NotificationDetailsActivity_MembersInjector;
import ai.kudi.agent.notification.presenters.NotificationDetailsPresenter;
import ai.kudi.agent.notification.presenters.NotificationPresenter;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtAcceptDeclineActivity;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtAcceptDeclineActivity_MembersInjector;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity_MembersInjector;
import ai.kudi.agent.outlet_mgt.activities.OutletTopUpActivity;
import ai.kudi.agent.outlet_mgt.activities.OutletTopUpActivity_MembersInjector;
import ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity;
import ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity_MembersInjector;
import ai.kudi.agent.outlet_mgt.domain.repositories.ChildOutletInformationRepository;
import ai.kudi.agent.outlet_mgt.fragments.CreateOutletFragment;
import ai.kudi.agent.outlet_mgt.fragments.CreateOutletFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.ManageOutletFragment;
import ai.kudi.agent.outlet_mgt.fragments.ManageOutletFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletLinkingBuzzAgentFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletLinkingBuzzAgentFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletLinkingFormFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletLinkingFormFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtAcctFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtAcctFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtCreateAcctOptionsFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtCreateAcctOptionsFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtCreatePinFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtCreatePinFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtPersonalFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtPersonalFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtResetPinFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtResetPinFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtSecurityFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtSecurityFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletTopUpAmountFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletTopUpAmountFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.fragments.OutletsListingFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletsListingFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.outlet_mgt.presenters.OutletMgtPresenter;
import ai.kudi.agent.outlet_mgt.presenters.OutletTopUpPresenter;
import ai.kudi.agent.outlet_mgt.useCases.AcceptOrDeclineLinkingRequest;
import ai.kudi.agent.outlet_mgt.useCases.BuzzPendingOutlet;
import ai.kudi.agent.outlet_mgt.useCases.CreateOutlet;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletDetails;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletForHq;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletParent;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletTransactions;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletWalletHistory;
import ai.kudi.agent.outlet_mgt.useCases.PerformOutletTopUp;
import ai.kudi.agent.outlet_mgt.useCases.ResetOutletPin;
import ai.kudi.agent.outlet_mgt.useCases.SubmitLinkingRequest;
import ai.kudi.agent.outlet_mgt.useCases.SuspendOutlet;
import ai.kudi.agent.outlet_mgt.useCases.UnsuspendOutlet;
import ai.kudi.agent.outlet_mgt.viewmodels.CreateOutletViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.ManageOutletViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingBuzzAgentViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingFormViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletMgtAcceptDeclineVm;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletMgtCreatePinViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletResetPinViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletSecurityViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletTopUpAmtViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.ChildOutletInformationViewModel;
import ai.kudi.agent.p2p.fragments.P2pEnterAmtFragment;
import ai.kudi.agent.p2p.fragments.P2pEnterAmtFragment_MembersInjector;
import ai.kudi.agent.p2p.fragments.P2pNameAndPhoneNoFragment;
import ai.kudi.agent.p2p.fragments.P2pNameAndPhoneNoFragment_MembersInjector;
import ai.kudi.agent.p2p.fragments.P2pSummaryFragment;
import ai.kudi.agent.p2p.fragments.P2pSummaryFragment_MembersInjector;
import ai.kudi.agent.p2p.viewmodels.P2pEnterAmtViewModel;
import ai.kudi.agent.p2p.viewmodels.P2pNameAndPhoneViewModel;
import ai.kudi.agent.p2p.viewmodels.P2pSummaryViewModel;
import ai.kudi.agent.payments.data.repositories.PaymentMethodRepository;
import ai.kudi.agent.payments.domain.usecases.FetchPaymentMethods;
import ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment;
import ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment_MembersInjector;
import ai.kudi.agent.picture_picker.presenters.PicturePickerPresenter;
import ai.kudi.agent.pictureupload.labs.PictureUploadSubComponent;
import ai.kudi.agent.pictureupload.p015ui.PictureUploadFragment;
import ai.kudi.agent.pictureupload.p015ui.PictureUploadFragment_MembersInjector;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.pin.KudiPin_MembersInjector;
import ai.kudi.agent.pin.viewModel.KudiPinViewModel;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.p016ui.LeasePosTermsOfAgreementFragment;
import ai.kudi.agent.pos.p016ui.LeasePosTermsOfAgreementFragment_MembersInjector;
import ai.kudi.agent.pos.p016ui.OrderDetailsFragment;
import ai.kudi.agent.pos.p016ui.OrderDetailsFragment_MembersInjector;
import ai.kudi.agent.pos.p016ui.PosActivity;
import ai.kudi.agent.pos.p016ui.PosActivity_MembersInjector;
import ai.kudi.agent.pos.p016ui.PosDeliveryAddressFragment;
import ai.kudi.agent.pos.p016ui.PosDeliveryAddressFragment_MembersInjector;
import ai.kudi.agent.pos.p016ui.PosEligibilityFragment;
import ai.kudi.agent.pos.p016ui.PosEligibilityFragment_MembersInjector;
import ai.kudi.agent.pos.p016ui.PosOrderDetailFragment;
import ai.kudi.agent.pos.p016ui.PosOrderDetailFragment_MembersInjector;
import ai.kudi.agent.pos.p016ui.PosOrderHistoryFragment;
import ai.kudi.agent.pos.p016ui.PosOrderHistoryFragment_MembersInjector;
import ai.kudi.agent.pos.p016ui.SelectPosFragment;
import ai.kudi.agent.pos.p016ui.SelectPosFragment_MembersInjector;
import ai.kudi.agent.pos.p016ui.viewModels.LeasePosAgreementVm;
import ai.kudi.agent.pos.p016ui.viewModels.OrderDetailsViewModel;
import ai.kudi.agent.pos.p016ui.viewModels.PosDeliveryAddressViewModel;
import ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel;
import ai.kudi.agent.pos.p016ui.viewModels.SelectPosViewModel;
import ai.kudi.agent.pos.presentation.PosOrderDetailViewModel;
import ai.kudi.agent.pos.presentation.PosOrderHistoryViewModel;
import ai.kudi.agent.pos.presentation.mapper.PosOrderDataToUiMapper;
import ai.kudi.agent.pos.usecases.CheckPosEligibility;
import ai.kudi.agent.pos.usecases.GetIsSuperAgentOrAggregator;
import ai.kudi.agent.pos.usecases.GetPosDeviceInfo;
import ai.kudi.agent.pos.usecases.GetPosDiscount;
import ai.kudi.agent.pos.usecases.GetPosRequestsDetailUseCase;
import ai.kudi.agent.pos.usecases.GetPosRequestsHistoryUseCase;
import ai.kudi.agent.pos.usecases.GetPosRequestsSummaryUseCase;
import ai.kudi.agent.pos.usecases.PosOrderRequest;
import ai.kudi.agent.pos.usecases.PriceLookupRequest;
import ai.kudi.agent.pos.usecases.TrackPosRequest;
import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import ai.kudi.agent.postRegistrationSetUp.fragments.UpgradeAccountFragmentSetUp;
import ai.kudi.agent.postRegistrationSetUp.fragments.UpgradeAccountFragmentSetUp_MembersInjector;
import ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent;
import ai.kudi.agent.postRegistrationSetUp.usecases.FetchTodo;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeAmountFragment;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeAmountFragment_MembersInjector;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment_MembersInjector;
import ai.kudi.agent.product.airtime_data.presenter.AirtimeAndDataPresenter;
import ai.kudi.agent.product.other_bills.p018ui.AmountFragment;
import ai.kudi.agent.product.other_bills.p018ui.AmountFragment_MembersInjector;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment_MembersInjector;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment_MembersInjector;
import ai.kudi.agent.product.other_bills.p018ui.PayBillsFragment;
import ai.kudi.agent.product.other_bills.p018ui.PayBillsFragment_MembersInjector;
import ai.kudi.agent.product.other_bills.presenter.AmountPresenter;
import ai.kudi.agent.product.other_bills.presenter.BillPaymentStepOnePresenter;
import ai.kudi.agent.product.other_bills.presenter.BillPaymentStepTwoPresenter;
import ai.kudi.agent.product.other_bills.presenter.BillsListPresenter;
import ai.kudi.agent.product.p019ui.ProductActivity;
import ai.kudi.agent.product.p019ui.ProductActivity_MembersInjector;
import ai.kudi.agent.product.p019ui.ProductSummaryFragment;
import ai.kudi.agent.product.p019ui.ProductSummaryFragment_MembersInjector;
import ai.kudi.agent.product.presenter.ProductSummaryPresenter;
import ai.kudi.agent.product.presenter.ProductsActivityPresenter;
import ai.kudi.agent.product.repository.BillerRepository;
import ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl;
import ai.kudi.agent.referral.domain.usecase.BuzzReferredAgent;
import ai.kudi.agent.referral.domain.usecase.CreateAgentReferral;
import ai.kudi.agent.referral.domain.usecase.FetchAgentSummary;
import ai.kudi.agent.referral.domain.usecase.FetchReferrals;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.referral.p020ui.AgentReferralActivity;
import ai.kudi.agent.referral.p020ui.AgentReferralActivity_MembersInjector;
import ai.kudi.agent.referral.p020ui.AgentReferralInfoFragment;
import ai.kudi.agent.referral.p020ui.AgentReferralInfoFragment_MembersInjector;
import ai.kudi.agent.referral.p020ui.AgentReferralSummaryFragment;
import ai.kudi.agent.referral.p020ui.AgentReferralSummaryFragment_MembersInjector;
import ai.kudi.agent.referral.p020ui.AgentReferredInvitationFragment;
import ai.kudi.agent.referral.p020ui.AgentReferredInvitationFragment_MembersInjector;
import ai.kudi.agent.referral.p020ui.AgentReferredListFragment;
import ai.kudi.agent.referral.p020ui.AgentReferredListFragment_MembersInjector;
import ai.kudi.agent.referral.presenters.AgentReferralInfoPresenter;
import ai.kudi.agent.referral.presenters.AgentReferralInvitePresenter;
import ai.kudi.agent.referral.presenters.AgentReferralListPresenter;
import ai.kudi.agent.referral.presenters.AgentReferralPresenter;
import ai.kudi.agent.referral.presenters.AgentReferralSummaryPresenter;
import ai.kudi.agent.referral.xmpp.components.ReferralSubComponent;
import ai.kudi.agent.register.PinRepositoryImpl;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.register.domain.usecases.BvnLookup;
import ai.kudi.agent.register.domain.usecases.CheckIfBvnExists;
import ai.kudi.agent.register.domain.usecases.FetchBusinessCategories;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.register.domain.usecases.OnboardMerchant;
import ai.kudi.agent.register.domain.usecases.RegisterNewAgent;
import ai.kudi.agent.register.domain.usecases.RegisterNewUser;
import ai.kudi.agent.register.domain.usecases.ResendOtp;
import ai.kudi.agent.register.domain.usecases.SaveImage;
import ai.kudi.agent.register.domain.usecases.ValidateOtp;
import ai.kudi.agent.register.domain.usecases.VerifyBvn;
import ai.kudi.agent.register.domain.usecases.VerifyId;
import ai.kudi.agent.register.domain.usecases.VerifySecondaryDetails;
import ai.kudi.agent.register.navigators.EmailVerificationNavigator;
import ai.kudi.agent.register.navigators.ImageSelectorNavigator;
import ai.kudi.agent.register.navigators.PendingKycNavigator;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.AccountTypeFragment;
import ai.kudi.agent.register.p021ui.AccountTypeFragment_MembersInjector;
import ai.kudi.agent.register.p021ui.BusinessInfoFragment;
import ai.kudi.agent.register.p021ui.BusinessInfoFragment_MembersInjector;
import ai.kudi.agent.register.p021ui.CreatePinFragment;
import ai.kudi.agent.register.p021ui.CreatePinFragment_MembersInjector;
import ai.kudi.agent.register.p021ui.PersonalInfoFragment;
import ai.kudi.agent.register.p021ui.PersonalInfoFragment_MembersInjector;
import ai.kudi.agent.register.p021ui.viewmodels.BusinessInfoViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.ContainerViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.CreatePinViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.PersonalInfoViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.PictureUploadViewModel;
import ai.kudi.agent.register.p022v2.p023ui.BvnNinFragment;
import ai.kudi.agent.register.p022v2.p023ui.BvnNinFragment_MembersInjector;
import ai.kudi.agent.register.p022v2.p023ui.EmailVerificationFragment;
import ai.kudi.agent.register.p022v2.p023ui.EmailVerificationFragment_MembersInjector;
import ai.kudi.agent.register.p022v2.p023ui.EnableFingerPrintFragment;
import ai.kudi.agent.register.p022v2.p023ui.EnableFingerPrintFragment_MembersInjector;
import ai.kudi.agent.register.p022v2.p023ui.OtpFragment;
import ai.kudi.agent.register.p022v2.p023ui.OtpFragment_MembersInjector;
import ai.kudi.agent.register.p022v2.p023ui.PendingKycActivity;
import ai.kudi.agent.register.p022v2.p023ui.PendingKycFormFragment;
import ai.kudi.agent.register.p022v2.p023ui.PendingKycFormFragment_MembersInjector;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment_MembersInjector;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity_MembersInjector;
import ai.kudi.agent.register.p022v2.p023ui.WelcomeFragment;
import ai.kudi.agent.register.p022v2.p023ui.WelcomeFragment_MembersInjector;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.EmailVerificationViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.EnableFingerPrintViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.OtpViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.PendingKycViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.PhoneAndBvnViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.WelcomeViewModel;
import ai.kudi.agent.register.verifybvn.VerifyBvnPictureFragment;
import ai.kudi.agent.register.verifybvn.VerifyBvnPictureFragment_MembersInjector;
import ai.kudi.agent.register.verifybvn.VerifyBvnPictureViewModel;
import ai.kudi.agent.register.xmpp.components.PendingKycSubComponent;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.savings.data.api.SavingsApi;
import ai.kudi.agent.savings.data.repository.ConfirmOtpRepository;
import ai.kudi.agent.savings.data.repository.SavingsRepository;
import ai.kudi.agent.savings.p024ui.ConfirmOtpFragment;
import ai.kudi.agent.savings.p024ui.ConfirmOtpFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.CreateSavingPinFragment;
import ai.kudi.agent.savings.p024ui.CreateSavingPinFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.CreateSavingsFragment;
import ai.kudi.agent.savings.p024ui.CreateSavingsFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.DetailAndTransactionFragment;
import ai.kudi.agent.savings.p024ui.DetailAndTransactionFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.GetStartedFragment;
import ai.kudi.agent.savings.p024ui.GetStartedFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.PerformActionBottomSheet;
import ai.kudi.agent.savings.p024ui.PerformActionBottomSheet_MembersInjector;
import ai.kudi.agent.savings.p024ui.SavingHistoryFragment;
import ai.kudi.agent.savings.p024ui.SavingHistoryFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.SavingsActivity;
import ai.kudi.agent.savings.p024ui.SavingsActivity_MembersInjector;
import ai.kudi.agent.savings.p024ui.SavingsDetailFragment;
import ai.kudi.agent.savings.p024ui.SavingsDetailFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.SavingsFragment;
import ai.kudi.agent.savings.p024ui.SavingsFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.SavingsPlanFragment;
import ai.kudi.agent.savings.p024ui.SavingsPlanFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.SavingsReviewFragment;
import ai.kudi.agent.savings.p024ui.SavingsReviewFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.SavingsTermsAndConditionFragment;
import ai.kudi.agent.savings.p024ui.SavingsTermsAndConditionFragment_MembersInjector;
import ai.kudi.agent.savings.p024ui.WithdrawSavingsFragment;
import ai.kudi.agent.savings.p024ui.WithdrawSavingsFragment_MembersInjector;
import ai.kudi.agent.savings.usecase.ConfirmOtp;
import ai.kudi.agent.savings.usecase.CreateSavingPin;
import ai.kudi.agent.savings.usecase.CreateSavings;
import ai.kudi.agent.savings.usecase.DeactivateSaving;
import ai.kudi.agent.savings.usecase.PlanDuration;
import ai.kudi.agent.savings.usecase.RenewSaving;
import ai.kudi.agent.savings.usecase.SavingsPlan;
import ai.kudi.agent.savings.usecase.Withdraw;
import ai.kudi.agent.savings.viewmodel.ConfirmOtpViewModel;
import ai.kudi.agent.savings.viewmodel.CreateSavingPinViewModel;
import ai.kudi.agent.savings.viewmodel.CreateSavingsViewModel;
import ai.kudi.agent.savings.viewmodel.GetStartedViewModel;
import ai.kudi.agent.savings.viewmodel.SavingDetailViewModel;
import ai.kudi.agent.savings.viewmodel.SavingHistoryViewModel;
import ai.kudi.agent.savings.viewmodel.SavingsPlanViewModel;
import ai.kudi.agent.savings.viewmodel.SavingsReviewViewModel;
import ai.kudi.agent.savings.viewmodel.SavingsTermsAndConditionViewModel;
import ai.kudi.agent.savings.viewmodel.SavingsViewModel;
import ai.kudi.agent.savings.viewmodel.WithdrawSavingsViewModel;
import ai.kudi.agent.settings.account.p025ui.activity.BankAccountActivity;
import ai.kudi.agent.settings.account.p025ui.activity.BankAccountActivity_MembersInjector;
import ai.kudi.agent.settings.account.p025ui.fragment.AccountsFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.AccountsFragment_MembersInjector;
import ai.kudi.agent.settings.account.p025ui.fragment.ActivatePosFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.ActivatePosFragment_MembersInjector;
import ai.kudi.agent.settings.account.p025ui.fragment.AddBankAccountFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.AddBankAccountFragment_MembersInjector;
import ai.kudi.agent.settings.account.p025ui.fragment.BankAccountFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.BankAccountFragment_MembersInjector;
import ai.kudi.agent.settings.account.p025ui.fragment.InsuranceSignUpFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.InsuranceSignUpFragment_MembersInjector;
import ai.kudi.agent.settings.account.p025ui.fragment.PosActivationNotificationReceiverFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.PosActivationNotificationReceiverFragment_MembersInjector;
import ai.kudi.agent.settings.account.p025ui.viewModel.ActivatePosViewModel;
import ai.kudi.agent.settings.account.p025ui.viewModel.AddBankAccountViewModel;
import ai.kudi.agent.settings.account.p025ui.viewModel.BankAccountViewModel;
import ai.kudi.agent.settings.account.p025ui.viewModel.InsuranceSignupViewModel;
import ai.kudi.agent.settings.account.presenters.AccountPresenter;
import ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent;
import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import ai.kudi.agent.settings.dataSource.KycLevelsLocalDataSource;
import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.settings.domain.repositories.IdtypeRepository;
import ai.kudi.agent.settings.domain.repositories.KycLevelRepository;
import ai.kudi.agent.settings.domain.repositories.RelationshipManagerRepository;
import ai.kudi.agent.settings.domain.useCases.ActivatePos;
import ai.kudi.agent.settings.domain.useCases.AddBankAccount;
import ai.kudi.agent.settings.domain.useCases.ChangePin;
import ai.kudi.agent.settings.domain.useCases.DeleteDevice;
import ai.kudi.agent.settings.domain.useCases.EditProfile;
import ai.kudi.agent.settings.domain.useCases.FetchCurrentUserBanks;
import ai.kudi.agent.settings.domain.useCases.FetchRelationshipMgr;
import ai.kudi.agent.settings.domain.useCases.GetDevices;
import ai.kudi.agent.settings.domain.useCases.GetMonthlyKycLevels;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.settings.domain.useCases.Profile;
import ai.kudi.agent.settings.domain.useCases.RequestPinResetOtp;
import ai.kudi.agent.settings.domain.useCases.ResetSavingsPin;
import ai.kudi.agent.settings.domain.useCases.UpgradeUserKyc;
import ai.kudi.agent.settings.insurance.domain.DeactivateInsuranceUseCase;
import ai.kudi.agent.settings.insurance.domain.GetInsuranceDetailsUseCase;
import ai.kudi.agent.settings.insurance.domain.SwitchCustomerType;
import ai.kudi.agent.settings.insurance.navigator.CashInsuranceFragmentNavigator;
import ai.kudi.agent.settings.insurance.p026ui.CashInsuranceFragment;
import ai.kudi.agent.settings.insurance.p026ui.CashInsuranceFragment_MembersInjector;
import ai.kudi.agent.settings.insurance.p026ui.InsuranceDeactivationReasonsFragment;
import ai.kudi.agent.settings.insurance.p026ui.InsuranceDeactivationReasonsFragment_MembersInjector;
import ai.kudi.agent.settings.insurance.presentation.CashInsuranceViewModel;
import ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewModel;
import ai.kudi.agent.settings.insurance.xpp3.CashInsuranceActivitySubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.p029ui.AccountAndSettingsOptionsFragment;
import ai.kudi.agent.settings.p029ui.AccountAndSettingsOptionsFragment_MembersInjector;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity_MembersInjector;
import ai.kudi.agent.settings.p029ui.OpenSourceFragment;
import ai.kudi.agent.settings.p029ui.OpenSourceFragment_MembersInjector;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.p029ui.SettingsActivity_MembersInjector;
import ai.kudi.agent.settings.p029ui.SwitchAccountFragment;
import ai.kudi.agent.settings.p029ui.SwitchAccountFragment_MembersInjector;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import ai.kudi.agent.settings.p029ui.viewModels.AccountAndSettingsOptionsViewModel;
import ai.kudi.agent.settings.p029ui.viewModels.OpenSourceViewModel;
import ai.kudi.agent.settings.p029ui.viewModels.SettingsDetailsViewModel;
import ai.kudi.agent.settings.p029ui.viewModels.SwitchAccountViewModel;
import ai.kudi.agent.settings.personal.p027ui.AboutKycFragment;
import ai.kudi.agent.settings.personal.p027ui.AboutKycFragment_MembersInjector;
import ai.kudi.agent.settings.personal.p027ui.CameraFragment;
import ai.kudi.agent.settings.personal.p027ui.EditProfileFragment;
import ai.kudi.agent.settings.personal.p027ui.EditProfileFragment_MembersInjector;
import ai.kudi.agent.settings.personal.p027ui.EditUserProfileFragment;
import ai.kudi.agent.settings.personal.p027ui.EditUserProfileFragment_MembersInjector;
import ai.kudi.agent.settings.personal.p027ui.IdtypesFragment;
import ai.kudi.agent.settings.personal.p027ui.IdtypesFragment_MembersInjector;
import ai.kudi.agent.settings.personal.p027ui.PersonalFragment;
import ai.kudi.agent.settings.personal.p027ui.PersonalFragment_MembersInjector;
import ai.kudi.agent.settings.personal.p027ui.RelationshipManagerFragment;
import ai.kudi.agent.settings.personal.p027ui.RelationshipManagerFragment_MembersInjector;
import ai.kudi.agent.settings.personal.p027ui.UpgradeAccountFragment;
import ai.kudi.agent.settings.personal.p027ui.UpgradeAccountFragment_MembersInjector;
import ai.kudi.agent.settings.personal.p027ui.UpgradeResultFragment;
import ai.kudi.agent.settings.personal.p027ui.UpgradeResultFragment_MembersInjector;
import ai.kudi.agent.settings.personal.p027ui.viewModels.AboutKycViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.EditProfileViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.IdTypesViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.PersonalViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.RelationshipMgrViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.UpgradeViewModel;
import ai.kudi.agent.settings.security.p028ui.MyDevicesFragment;
import ai.kudi.agent.settings.security.p028ui.MyDevicesFragment_MembersInjector;
import ai.kudi.agent.settings.security.p028ui.ResetSavingPinFragment;
import ai.kudi.agent.settings.security.p028ui.ResetSavingPinFragment_MembersInjector;
import ai.kudi.agent.settings.security.p028ui.SecurityFragment;
import ai.kudi.agent.settings.security.p028ui.SecurityFragment_MembersInjector;
import ai.kudi.agent.settings.security.p028ui.viewModels.ChangePinViewModel;
import ai.kudi.agent.settings.security.p028ui.viewModels.MyDevicesViewModel;
import ai.kudi.agent.settings.security.p028ui.viewModels.ResetSavingPinViewModel;
import ai.kudi.agent.settings.security.p028ui.viewModels.SecurityViewModel;
import ai.kudi.agent.settings.tandc.DisplayTermsFragment;
import ai.kudi.agent.settings.tandc.DisplayTermsFragment_MembersInjector;
import ai.kudi.agent.settings.tandc.TermsAndConditionFragment;
import ai.kudi.agent.start.SplashActivity;
import ai.kudi.agent.start.SplashActivity_MembersInjector;
import ai.kudi.agent.start.UnauthorizedInstallationActivity;
import ai.kudi.agent.start.UnauthorizedInstallationActivity_MembersInjector;
import ai.kudi.agent.start.intro.OnBoardingActivity;
import ai.kudi.agent.start.intro.OnBoardingActivity_MembersInjector;
import ai.kudi.agent.transactioncommissions.domain.GetCommissionCashoutSummaryUseCase;
import ai.kudi.agent.transactioncommissions.domain.LoanProviderUseCase;
import ai.kudi.agent.transactioncommissions.domain.RequestCommissionsCashoutUseCase;
import ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent;
import ai.kudi.agent.transactioncommissions.navigator.TransactionCommissionsNavigator;
import ai.kudi.agent.transactioncommissions.p030ui.CommissionsCashoutStatusFragment;
import ai.kudi.agent.transactioncommissions.p030ui.FilterCommissionsFragment;
import ai.kudi.agent.transactioncommissions.p030ui.FilterCommissionsFragment_MembersInjector;
import ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsActivity;
import ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsActivity_MembersInjector;
import ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsFragment;
import ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsFragment_MembersInjector;
import ai.kudi.agent.transactioncommissions.presentation.FilterCommissionsViewModel;
import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsActivityViewModel;
import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsViewModel;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import ai.kudi.agent.transactionhistory.data.source.TransactionsLocalSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsSummaryLocalSource;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchIncompleteTransactions;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.domain.usecases.GetTransactionHistoryUseCase;
import ai.kudi.agent.transactionhistory.domain.usecases.SearchTransactionsUseCase;
import ai.kudi.agent.transactionhistory.labs.IncompleteTransactionsSubComponent;
import ai.kudi.agent.transactionhistory.mapper.IncompleteTransactionApiToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.SearchWalletActivityResponseToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionApiToDataMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionKindMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionTypeMapper;
import ai.kudi.agent.transactionhistory.mapper.WalletActivityApiToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionDatabaseToDataMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionKindDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionKindDatabaseToDataMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionSummaryDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionSummaryDatabaseToDataMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionSummaryTypeDatabaseToUiMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionSummaryTypeUiToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionTypeDataToDatabaseMapper;
import ai.kudi.agent.transactionhistory.mapper.database.TransactionTypeDatabaseToDataMapper;
import ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator;
import ai.kudi.agent.transactionhistory.navigator.PendingTransactionsNavigator;
import ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator;
import ai.kudi.agent.transactionhistory.p031ui.view.FilterTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.FilterTransactionsFragment_MembersInjector;
import ai.kudi.agent.transactionhistory.p031ui.view.IncompleteTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.IncompleteTransactionsFragment_MembersInjector;
import ai.kudi.agent.transactionhistory.p031ui.view.PendingFraudCheckTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.PendingFraudCheckTransactionsFragment_MembersInjector;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsContainerFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsContainerFragment_MembersInjector;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsFragment_MembersInjector;
import ai.kudi.agent.transactionhistory.presentation.FilterTransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.IncompleteTransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.PendingFraudCheckTransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.TransactionsViewModel;
import ai.kudi.agent.transactions.data.repositories.TransactionRepository;
import ai.kudi.agent.transactions.data.worker.VerificationSubComponent;
import ai.kudi.agent.transactions.domain.usecases.CreateCustomerRequest;
import ai.kudi.agent.transactions.domain.usecases.FetchTransaction;
import ai.kudi.agent.transactions.domain.usecases.FetchTransactions;
import ai.kudi.agent.transactions.domain.usecases.GetAllWalletsUseCase;
import ai.kudi.agent.transactions.domain.usecases.GetOutletTransactionSummaryUseCase;
import ai.kudi.agent.transactions.domain.usecases.GetTransactionSummaryUseCase;
import ai.kudi.agent.transactions.domain.usecases.InitializeTerminalRequest;
import ai.kudi.agent.transactions.domain.usecases.RequestStatement;
import ai.kudi.agent.transactions.domain.usecases.SendReceiptToTerminal;
import ai.kudi.agent.transactions.domain.usecases.SendTransactionToMail;
import ai.kudi.agent.transactions.domain.usecases.VerifyPendingTransactionRequest;
import ai.kudi.agent.transactions.domain.usecases.VerifyTerminalConnection;
import ai.kudi.agent.transactions.p032ui.CreateCustomerFragment;
import ai.kudi.agent.transactions.p032ui.CreateCustomerFragment_MembersInjector;
import ai.kudi.agent.transactions.p032ui.EmailTransactionReportActivity;
import ai.kudi.agent.transactions.p032ui.EmailTransactionReportActivity_MembersInjector;
import ai.kudi.agent.transactions.p032ui.PendingVerificationActivity;
import ai.kudi.agent.transactions.p032ui.PendingVerificationActivity_MembersInjector;
import ai.kudi.agent.transactions.p032ui.PendingVerificationCustomerDetailInputFragment;
import ai.kudi.agent.transactions.p032ui.PendingVerificationCustomerDetailInputFragment_MembersInjector;
import ai.kudi.agent.transactions.p032ui.PendingVerificationImageCaptureFragment;
import ai.kudi.agent.transactions.p032ui.PendingVerificationImageCaptureFragment_MembersInjector;
import ai.kudi.agent.transactions.p032ui.RequestStatementActivity;
import ai.kudi.agent.transactions.p032ui.RequestStatementActivity_MembersInjector;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActionActivity;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActionActivity_MembersInjector;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity_MembersInjector;
import ai.kudi.agent.transactions.p032ui.TransactionIssueFragment;
import ai.kudi.agent.transactions.p032ui.TransactionIssueFragment_MembersInjector;
import ai.kudi.agent.transactions.p032ui.VerificationNavigator;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet_MembersInjector;
import ai.kudi.agent.transactions.presenters.CreateCustomerPresenter;
import ai.kudi.agent.transactions.presenters.EmailTransactionReportPresenter;
import ai.kudi.agent.transactions.presenters.PendingVerificationImageCapturePresenter;
import ai.kudi.agent.transactions.presenters.PendingVerificationPresenter;
import ai.kudi.agent.transactions.presenters.RequestStatementPresenter;
import ai.kudi.agent.transactions.presenters.TransactionDetailsPresenter;
import ai.kudi.agent.transactions.presenters.TransactionIssuePresenter;
import ai.kudi.agent.transactions.viewmodels.PendingVerificationCustomerDetailInputPresenter;
import ai.kudi.agent.transactions.viewmodels.SendReceiptToTerminalViewModel;
import ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment;
import ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment_MembersInjector;
import ai.kudi.agent.transactionstatus.summary.p033ui.WithdrawalSummaryFragment;
import ai.kudi.agent.transactionstatus.summary.p033ui.WithdrawalSummaryFragment_MembersInjector;
import ai.kudi.agent.transactionstatus.summary.presenter.TransferSummaryPresenter;
import ai.kudi.agent.transactionstatus.summary.presenter.WithdrawalSummaryPresenter;
import ai.kudi.agent.transfer.domain.repositories.DefaultTransactionLookUpRepository;
import ai.kudi.agent.transfer.domain.repositories.TransactionLookUpRepository;
import ai.kudi.agent.transfer.domain.sources.remote.TransactionLookUpRemoteSource;
import ai.kudi.agent.transfer.domain.usecases.TransactionLookUpUsecase;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.transfer.p034ui.TransferActivity_MembersInjector;
import ai.kudi.agent.transfer.p034ui.TransferToBankAmountFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankAmountFragment_MembersInjector;
import ai.kudi.agent.transfer.p034ui.TransferToBankCustomersFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankCustomersFragment_MembersInjector;
import ai.kudi.agent.transfer.p034ui.TransferToBankFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankFragment_MembersInjector;
import ai.kudi.agent.transfer.p034ui.TransferToMultipleBankFragment;
import ai.kudi.agent.transfer.p034ui.TransferToMultipleBankFragment_MembersInjector;
import ai.kudi.agent.transfer.presenter.MainTransferPresenter;
import ai.kudi.agent.transfer.presenter.TransferToBankAmountPresenter;
import ai.kudi.agent.transfer.presenter.TransferToBankCustomerPresenter;
import ai.kudi.agent.transfer.presenter.TransferToBankPresenter;
import ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewModel;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.Authorize;
import ai.kudi.agent.users.domain.usecases.AuthorizeSavings;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser_Factory;
import ai.kudi.agent.users.domain.usecases.FetchKCash;
import ai.kudi.agent.users.domain.usecases.FetchWallet;
import ai.kudi.agent.users.domain.usecases.HandleOrPhoneLookUp;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import ai.kudi.agent.users.domain.usecases.RegisterFcm;
import ai.kudi.agent.users.domain.usecases.TransferToBank;
import ai.kudi.agent.users.domain.usecases.UpdateUser;
import ai.kudi.agent.users.navigators.ProcessTopupNavigator;
import ai.kudi.agent.users.navigators.TopupKCashNavigator;
import ai.kudi.agent.users.p035ui.AuthDialog;
import ai.kudi.agent.users.p035ui.AuthDialog_Factory;
import ai.kudi.agent.users.p035ui.AuthDialog_MembersInjector;
import ai.kudi.agent.users.p035ui.CashoutActivity;
import ai.kudi.agent.users.p035ui.CashoutActivity_MembersInjector;
import ai.kudi.agent.users.p035ui.CashoutFeesDialog;
import ai.kudi.agent.users.p035ui.KCashTopupActivity;
import ai.kudi.agent.users.p035ui.KCashTopupActivity_MembersInjector;
import ai.kudi.agent.users.presenters.CashoutPresenter;
import ai.kudi.agent.users.viewmodels.KCashTopupViewModel;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvideAnnouncementDataSourceFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvideAnnouncementRepoFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvideBillerLocalSourceFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvideBillerRemoteSourceFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvideBillerRepoFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvideDefaultTransactionRepositoryFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvideTransactionLookUpRepositoryFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvidesPaymentMethodRepositoryFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvidesTransactionRemoteDataSourceFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvidesTransactionsLocalSourceFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvidesTransactionsRemoteSourceFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvidesTransactionsSummaryLocalSourceFactory;
import ai.kudi.agent.users.xmpp.modules.RepositoryModule_ProvidesUserRepositoryFactory;
import ai.kudi.agent.voucher.cashin.domain.usecase.CreateVoucher;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherAmountInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherAmountInfoFragment_MembersInjector;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherRecipientInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherRecipientInfoFragment_MembersInjector;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherSenderInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherSenderInfoFragment_MembersInjector;
import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherAmountPresenter;
import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherRecipientPresenter;
import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherSenderPresenter;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import ai.kudi.agent.voucher.cashout.domain.usecase.CashOutVoucherVerification;
import ai.kudi.agent.voucher.cashout.domain.usecase.RedeemVoucher;
import ai.kudi.agent.voucher.cashout.domain.usecase.ValidateRecipientPhone;
import ai.kudi.agent.voucher.cashout.p039ui.VoucherCashOutPhoneVerificationActivity;
import ai.kudi.agent.voucher.cashout.p039ui.VoucherCashOutPhoneVerificationActivity_MembersInjector;
import ai.kudi.agent.voucher.cashout.p039ui.VoucherCodeInputFragment;
import ai.kudi.agent.voucher.cashout.p039ui.VoucherCodeInputFragment_MembersInjector;
import ai.kudi.agent.voucher.cashout.presenter.VoucherPhoneVerificationPresenter;
import ai.kudi.agent.voucher.cashout.presenter.VoucherVerificationPresenter;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.wallettopup.WalletTopUpActivity_MembersInjector;
import ai.kudi.agent.wallettopup.data.FetchBanksWithMethods;
import ai.kudi.agent.wallettopup.data.FetchMiniMonnifyDetails;
import ai.kudi.agent.wallettopup.fragments.BankTransferFragment;
import ai.kudi.agent.wallettopup.fragments.BankTransferFragment_MembersInjector;
import ai.kudi.agent.wallettopup.fragments.CardPaymentFragment;
import ai.kudi.agent.wallettopup.fragments.CardPaymentFragment_MembersInjector;
import ai.kudi.agent.wallettopup.fragments.CardTopUpAmountFragment;
import ai.kudi.agent.wallettopup.fragments.CardTopUpAmountFragment_MembersInjector;
import ai.kudi.agent.wallettopup.fragments.CashDepositFragment;
import ai.kudi.agent.wallettopup.fragments.CashDepositFragment_MembersInjector;
import ai.kudi.agent.wallettopup.fragments.UssdTopUpBottomSheetFragment;
import ai.kudi.agent.wallettopup.fragments.UssdTopUpBottomSheetFragment_MembersInjector;
import ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent;
import ai.kudi.agent.wallettopup.navigators.WalletTopupNavigator;
import ai.kudi.agent.wallettopup.presenters.WalletTopupPresenter;
import ai.kudi.agent.wallettopup.viewmodels.CardPaymentViewModel;
import ai.kudi.agent.wallettopup.viewmodels.CardTopUpAmtViewModel;
import ai.kudi.agent.wallettopup.viewmodels.PaymentMethodViewModel;
import ai.kudi.agent.withdraw_cash.domain.repositories.CardlessWithdrawalRepository;
import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import ai.kudi.agent.withdraw_cash.domain.usecases.CardlessWithdrawalUsecase;
import ai.kudi.agent.withdraw_cash.domain.usecases.CheckUssdWithdrawalTransactionStatus;
import ai.kudi.agent.withdraw_cash.domain.usecases.FetchUssdWithdrawalProviderListUsecase;
import ai.kudi.agent.withdraw_cash.domain.usecases.GenerateUssdWithdrawalCode;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity_MembersInjector;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionPresenter;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.home.WithdrawCashFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.home.WithdrawCashFragment_MembersInjector;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.card_withdrawal.CardWithdrawalAmountFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos.MPosActivationFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos.MPosActivationFragment_MembersInjector;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos.MPosAmountInputFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos.MPosAmountInputFragment_MembersInjector;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceFragment_MembersInjector;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputFragment_MembersInjector;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment_MembersInjector;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.card_withdrawal.CardWithdrawalAmountViewModel;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos.MPosActivationViewModel;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos.MPosAmountInputViewModel;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewModel;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceViewModel;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewModel;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewModel;
import ai.kudi.agent.withdrawal.p041ui.OthersWithdrawalFragment;
import ai.kudi.agent.withdrawal.p041ui.OthersWithdrawalFragment_MembersInjector;
import ai.kudi.agent.withdrawal.p041ui.WithdrawActivity;
import ai.kudi.agent.withdrawal.p041ui.WithdrawActivity_MembersInjector;
import ai.kudi.agent.withdrawal.presenter.MainWithdrawalPresenter;
import ai.kudi.agent.withdrawal.presenter.OthersWithdrawalPresenter;
import ai.kudi.agent.withdrawal.view.MainWithdrawalView;
import ai.kudi.agent.withdrawal.xmpp.components.WithdrawalSubComponent;
import ai.kudi.mediaservice.DrakeClient;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.d0;
import com.google.common.collect.AbstractC5077j;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.crashlytics.C5325g;
import com.google.firebase.database.C5615f;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import com.paypad.impl.Paypad;
import dagger.android.C7428c;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import java.util.Map;
import p382i.p383b.C9467c;
import p382i.p383b.C9469e;
import p382i.p383b.C9470f;
import p382i.p383b.C9473g;
import p382i.p383b.C9474h;
import p472k.p473a.InterfaceC11700a;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class DaggerApplicationComponent implements ApplicationComponent {
    private final AnalyticsModule analyticsModule;
    private final Application application;
    private final ApplicationModule applicationModule;
    private InterfaceC11700a<Application> applicationProvider;
    private InterfaceC11700a<FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent.Factory> banksFragmentSubcomponentFactoryProvider;
    private final CacheModule cacheModule;
    private InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private InterfaceC11700a<ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent.Factory> homeActivitySubcomponentFactoryProvider;
    private InterfaceC11700a<ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent.Factory> issueActivitySubcomponentFactoryProvider;
    private final IssueModule issueModule;
    private InterfaceC11700a<FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent.Factory> issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
    private InterfaceC11700a<ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent.Factory> kShockActivitySubcomponentFactoryProvider;
    private final KShockModule kShockModule;
    private InterfaceC11700a<FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent.Factory> kudiPinSubcomponentFactoryProvider;
    private final MultiPartFileHandlingModule multiPartFileHandlingModule;
    private final NetworkModule networkModule;
    private InterfaceC11700a<PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent.Factory> picturePickerFragmentSubcomponentFactoryProvider;
    private final PictureUploadModule pictureUploadModule;
    private InterfaceC11700a<ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent.Factory> productActivitySubcomponentFactoryProvider;
    private InterfaceC11700a<Context> provideAppContextProvider;
    private InterfaceC11700a<k> provideFirebaseConfigProvider;
    private InterfaceC11700a<C5325g> provideFirebaseCrashlyticsProvider;
    private InterfaceC11700a<IPFSecurityUtils> providePFSecurityUtilsFactoryProvider;
    private InterfaceC11700a<Paypad> providePayPadProvider;
    private InterfaceC11700a<String> provideSharedPrefsNameProvider;
    private InterfaceC11700a<InterfaceC14233u> providesAuthInterceptorProvider;
    private InterfaceC11700a<BillsService> providesBillsServiceProvider;
    private InterfaceC11700a<CoreApiService> providesCoreApiServiceProvider;
    private InterfaceC11700a<CoreAppDatabase> providesCoreAppDatabaseProvider;
    private InterfaceC11700a<DeviceInformation> providesDeviceInfoProvider;
    private InterfaceC11700a<SharedPreferences> providesDeviceSecuritySharedPrefsProvider;
    private InterfaceC11700a<SharedPreferences> providesFrequentlyUsedSharedPrefsProvider;
    private InterfaceC11700a<GlobalNavigator> providesGlobalNavigatorProvider;
    private InterfaceC11700a<IssuesApiService> providesIssuesApiServiceProvider;
    private InterfaceC11700a<KshockApi> providesKShockApiProvider;
    private InterfaceC11700a<C14207a> providesLoginInterceptorProvider;
    private InterfaceC11700a<C14841m> providesRetrofitProvider;
    private InterfaceC11700a<SavingsApi> providesSavingApiProvider;
    private InterfaceC11700a<SharedPreferences> providesSharedPrefsProvider;
    private InterfaceC11700a<UserRepository> providesUserRepositoryProvider;
    private InterfaceC11700a<UserService> providesUserServiceProvider;
    private InterfaceC11700a<InterfaceC14233u> providesVersionInterceptorProvider;
    private final RepositoryModule repositoryModule;
    private InterfaceC11700a<ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent.Factory> savingsActivitySubcomponentFactoryProvider;

    /* renamed from: sendReceiptToTerminalConfirmationBottomSheetSubcomponentFactoryProvider */
    private InterfaceC11700a<FragmentInjectionModule_InjectReceiptTerminalConfirmationFragment.SendReceiptToTerminalConfirmationBottomSheetSubcomponent.Factory> f201x23c522c6;
    private final ServiceModule serviceModule;
    private final ViewModelFactoryModule viewModelFactoryModule;

    /* loaded from: classes.dex */
    final class BankAccountSubcomponentFactory implements BankAccountSubcomponent.Factory {
        private BankAccountSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent.Factory
        public BankAccountSubcomponent create() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            BankAccountSubcomponentImpl $r1 = new BankAccountSubcomponentImpl();
            return $r1;
        }
    }

    /* loaded from: classes.dex */
    final class BankAccountSubcomponentImpl implements BankAccountSubcomponent {
        private BankAccountSubcomponentImpl() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AddBankAccountViewModel addBankAccountViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            AccountLookup $r3 = $r2.accountLookup();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            AccountRepository $r4 = $r22.accountRepository();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r23.fetchCurrentUser();
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            Analytics $r6 = $r24.analytics();
            AddBankAccountViewModel $r1 = new AddBankAccountViewModel($r3, $r4, $r5, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BankAccountViewModel bankAccountViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            AccountRepository $r4 = $r22.accountRepository();
            BankAccountViewModel $r1 = new BankAccountViewModel($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AddBankAccountFragment injectAddBankAccountFragment(AddBankAccountFragment addBankAccountFragment) {
            AddBankAccountViewModel $r2 = addBankAccountViewModel();
            AddBankAccountFragment_MembersInjector.injectAddBankAcctViewModel(addBankAccountFragment, $r2);
            return addBankAccountFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BankAccountActivity injectBankAccountActivity(BankAccountActivity bankAccountActivity) {
            BankAccountViewModel $r2 = bankAccountViewModel();
            BankAccountActivity_MembersInjector.injectScreenViewModel(bankAccountActivity, $r2);
            return bankAccountActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BankAccountFragment injectBankAccountFragment(BankAccountFragment bankAccountFragment) {
            BankAccountViewModel $r2 = bankAccountViewModel();
            BankAccountFragment_MembersInjector.injectScreenViewModel(bankAccountFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.provideFirebaseConfigProvider;
            Object $r5 = $r4.get();
            Frame $r6 = (Frame) $r5;
            BankAccountFragment_MembersInjector.injectRemoteConfig(bankAccountFragment, $r6);
            return bankAccountFragment;
        }

        @Override // ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent
        public void inject(BankAccountActivity bankAccountActivity) {
            injectBankAccountActivity(bankAccountActivity);
        }

        @Override // ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent
        public void inject(AddBankAccountFragment addBankAccountFragment) {
            injectAddBankAccountFragment(addBankAccountFragment);
        }

        @Override // ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent
        public void inject(BankAccountFragment bankAccountFragment) {
            injectBankAccountFragment(bankAccountFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class BanksFragmentSubcomponentFactory implements FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent.Factory {
        private BanksFragmentSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent create(BanksFragment banksFragment) {
            C9473g.m14650b(banksFragment);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            BanksFragmentSubcomponentImpl $r2 = new BanksFragmentSubcomponentImpl(banksFragment);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            BanksFragment $r3 = (BanksFragment) obj;
            FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class BanksFragmentSubcomponentImpl implements FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent {
        private BanksFragmentSubcomponentImpl(BanksFragment banksFragment) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BanksFragment injectBanksFragment(BanksFragment banksFragment) {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            BanksViewModel $r2 = $r3.banksViewModel();
            BanksFragment_MembersInjector.injectBanksViewModel(banksFragment, $r2);
            return banksFragment;
        }

        public void inject(BanksFragment banksFragment) {
            injectBanksFragment(banksFragment);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            BanksFragment $r2 = (BanksFragment) obj;
            inject($r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class Builder implements ApplicationComponent.Builder {
        private Application application;

        private Builder() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.components.ApplicationComponent.Builder
        public /* bridge */ /* synthetic */ ApplicationComponent.Builder application(Application application) {
            Builder $r0 = application(application);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.components.ApplicationComponent.Builder
        public Builder application(Application application) {
            C9473g.m14650b(application);
            Application $r1 = application;
            this.application = $r1;
            return this;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.components.ApplicationComponent.Builder
        public ApplicationComponent build() {
            Application $r13 = this.application;
            C9473g.m14651a($r13, Application.class);
            ApplicationModule $r1 = new ApplicationModule();
            NetworkModule $r2 = new NetworkModule();
            ServiceModule $r3 = new ServiceModule();
            NetworkServicesModule $r4 = new NetworkServicesModule();
            RepositoryModule $r5 = new RepositoryModule();
            AnalyticsModule $r6 = new AnalyticsModule();
            CacheModule $r7 = new CacheModule();
            MultiPartFileHandlingModule $r8 = new MultiPartFileHandlingModule();
            PictureUploadModule $r9 = new PictureUploadModule();
            IssueModule $r10 = new IssueModule();
            KShockModule $r11 = new KShockModule();
            ViewModelFactoryModule $r12 = new ViewModelFactoryModule();
            Application $r132 = this.application;
            DaggerApplicationComponent $r14 = new DaggerApplicationComponent($r1, $r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12, $r132);
            return $r14;
        }
    }

    /* loaded from: classes.dex */
    final class BvnVerificationSubcomponentFactory implements BvnVerificationSubcomponent.Factory {
        private BvnVerificationSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent.Factory
        public BvnVerificationSubcomponent create(RegisterNavigator registerNavigator) {
            C9473g.m14650b(registerNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            BvnVerificationSubcomponentImpl $r2 = new BvnVerificationSubcomponentImpl(registerNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class BvnVerificationSubcomponentImpl implements BvnVerificationSubcomponent {
        private final RegisterNavigator registerV2Navigator;

        private BvnVerificationSubcomponentImpl(RegisterNavigator registerNavigator) {
            this.registerV2Navigator = registerNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BusinessInfoViewModel businessInfoViewModel() {
            RegisterNavigator $r1 = this.registerV2Navigator;
            FetchLocation $r3 = fetchLocation();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            Analytics $r5 = $r4.analytics();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            FetchCurrentUser $r6 = $r42.fetchCurrentUser();
            UpdateUser $r7 = updateUser();
            FetchBusinessCategories $r8 = fetchBusinessCategories();
            EditProfile $r9 = editProfile();
            BusinessInfoViewModel $r2 = new BusinessInfoViewModel($r1, $r3, $r5, $r6, $r7, $r8, $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BvnLookup bvnLookup() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            BvnLookup $r1 = new BvnLookup($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CheckIfBvnExists checkIfBvnExists() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            CheckIfBvnExists $r1 = new CheckIfBvnExists($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ContainerViewModel containerViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            BaseOtpUtil $r6 = $r33.baseOtpUtil();
            RegisterNavigator $r2 = this.registerV2Navigator;
            ContainerViewModel $r1 = new ContainerViewModel($r4, $r5, $r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreatePinViewModel createPinViewModel() {
            SetNewPin $r3 = setNewPin();
            RegisterNewAgent $r4 = registerNewAgent();
            RegisterNewUser $r5 = registerNewUser();
            OnboardMerchant $r6 = onboardMerchant();
            DaggerApplicationComponent $r7 = DaggerApplicationComponent.this;
            LoginUser $r8 = $r7.loginUser();
            RegisterNavigator $r1 = this.registerV2Navigator;
            DaggerApplicationComponent $r72 = DaggerApplicationComponent.this;
            Analytics $r9 = $r72.analytics();
            DaggerApplicationComponent $r73 = DaggerApplicationComponent.this;
            InterfaceC11700a $r10 = $r73.providesSharedPrefsProvider;
            Object $r11 = $r10.get();
            SharedPreferences sharedPreferences = (SharedPreferences) $r11;
            DaggerApplicationComponent $r74 = DaggerApplicationComponent.this;
            InterfaceC11700a $r102 = $r74.providesDeviceSecuritySharedPrefsProvider;
            Object $r112 = $r102.get();
            SharedPreferences sharedPreferences2 = (SharedPreferences) $r112;
            DaggerApplicationComponent $r75 = DaggerApplicationComponent.this;
            PinRepositoryImpl $r14 = $r75.pinRepositoryImpl();
            DaggerApplicationComponent $r76 = DaggerApplicationComponent.this;
            Application $r15 = $r76.application;
            DaggerApplicationComponent $r77 = DaggerApplicationComponent.this;
            InterfaceC11700a $r103 = $r77.providePFSecurityUtilsFactoryProvider;
            Object $r113 = $r103.get();
            IPFSecurityUtils $r16 = (IPFSecurityUtils) $r113;
            CreatePinViewModel $r2 = new CreatePinViewModel($r3, $r4, $r5, $r6, $r8, $r1, $r9, sharedPreferences, sharedPreferences2, $r14, $r15, $r16);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateTempAgent createTempAgent() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            CreateTempAgent $r1 = new CreateTempAgent($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EditProfile editProfile() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            EditProfile $r1 = new EditProfile($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchBusinessCategories fetchBusinessCategories() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchBusinessCategories $r1 = new FetchBusinessCategories($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchLocation fetchLocation() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesUserServiceProvider;
            Object $r4 = $r3.get();
            UserService $r5 = (UserService) $r4;
            FetchLocation $r1 = new FetchLocation($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AccountTypeFragment injectAccountTypeFragment(AccountTypeFragment accountTypeFragment) {
            VerifyBvnPictureViewModel $r2 = verifyBvnPictureViewModel();
            AccountTypeFragment_MembersInjector.injectVm(accountTypeFragment, $r2);
            return accountTypeFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BusinessInfoFragment injectBusinessInfoFragment(BusinessInfoFragment businessInfoFragment) {
            BusinessInfoViewModel $r2 = businessInfoViewModel();
            BusinessInfoFragment_MembersInjector.injectVm(businessInfoFragment, $r2);
            return businessInfoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BvnExistingAgentActivity injectBvnExistingAgentActivity(BvnExistingAgentActivity bvnExistingAgentActivity) {
            ContainerViewModel $r2 = containerViewModel();
            BvnExistingAgentActivity_MembersInjector.injectContainerViewModel(bvnExistingAgentActivity, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            BvnExistingAgentActivity_MembersInjector.injectSharedPref(bvnExistingAgentActivity, $r6);
            return bvnExistingAgentActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BvnNinFragment injectBvnNinFragment(BvnNinFragment bvnNinFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesDeviceSecuritySharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            BvnNinFragment_MembersInjector.injectSharedPrefs(bvnNinFragment, $r5);
            PhoneAndBvnViewModel $r6 = phoneAndBvnViewModel();
            BvnNinFragment_MembersInjector.injectVm(bvnNinFragment, $r6);
            return bvnNinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreatePinFragment injectCreatePinFragment(CreatePinFragment createPinFragment) {
            CreatePinViewModel $r2 = createPinViewModel();
            CreatePinFragment_MembersInjector.injectVm(createPinFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.provideFirebaseConfigProvider;
            Object $r5 = $r4.get();
            Frame $r6 = (Frame) $r5;
            CreatePinFragment_MembersInjector.injectRemoteConfig(createPinFragment, $r6);
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            InterfaceC11700a $r42 = $r32.providesSharedPrefsProvider;
            Object $r52 = $r42.get();
            SharedPreferences $r7 = (SharedPreferences) $r52;
            CreatePinFragment_MembersInjector.injectSharedPreferences(createPinFragment, $r7);
            return createPinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private NonAgentSignOnFragment injectNonAgentSignOnFragment(NonAgentSignOnFragment nonAgentSignOnFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideFirebaseConfigProvider;
            Object $r4 = $r3.get();
            Frame $r5 = (Frame) $r4;
            NonAgentSignOnFragment_MembersInjector.injectRemoteConfig(nonAgentSignOnFragment, $r5);
            PhoneAndBvnViewModel $r6 = phoneAndBvnViewModel();
            NonAgentSignOnFragment_MembersInjector.injectPhoneAndBvnViewModel(nonAgentSignOnFragment, $r6);
            return nonAgentSignOnFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PersonalInfoFragment injectPersonalInfoFragment(PersonalInfoFragment personalInfoFragment) {
            PersonalInfoViewModel $r2 = personalInfoViewModel();
            PersonalInfoFragment_MembersInjector.injectVm(personalInfoFragment, $r2);
            return personalInfoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PhoneFragment injectPhoneFragment(PhoneFragment phoneFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesDeviceSecuritySharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            PhoneFragment_MembersInjector.injectSharedPrefs(phoneFragment, $r5);
            PhoneAndBvnViewModel $r6 = phoneAndBvnViewModel();
            PhoneFragment_MembersInjector.injectVm(phoneFragment, $r6);
            SmartLookAnalytics $r7 = new SmartLookAnalytics();
            PhoneFragment_MembersInjector.injectSmartLookAnalytics(phoneFragment, $r7);
            return phoneFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyBvnPictureFragment injectVerifyBvnPictureFragment(VerifyBvnPictureFragment verifyBvnPictureFragment) {
            VerifyBvnPictureViewModel $r2 = verifyBvnPictureViewModel();
            VerifyBvnPictureFragment_MembersInjector.injectViewModel(verifyBvnPictureFragment, $r2);
            return verifyBvnPictureFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WelcomeFragment injectWelcomeFragment(WelcomeFragment welcomeFragment) {
            WelcomeViewModel $r2 = welcomeViewModel();
            WelcomeFragment_MembersInjector.injectVm(welcomeFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            WelcomeFragment_MembersInjector.injectSharedPrefs(welcomeFragment, $r6);
            return welcomeFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OnboardMerchant onboardMerchant() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            OnboardMerchant $r1 = new OnboardMerchant($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PersonalInfoViewModel personalInfoViewModel() {
            RegisterNavigator $r1 = this.registerV2Navigator;
            FetchLocation $r3 = fetchLocation();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            Analytics $r5 = $r4.analytics();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            FetchCurrentUser $r6 = $r42.fetchCurrentUser();
            UpdateUser $r7 = updateUser();
            EditProfile $r8 = editProfile();
            PersonalInfoViewModel $r2 = new PersonalInfoViewModel($r1, $r3, $r5, $r6, $r7, $r8);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PhoneAndBvnViewModel phoneAndBvnViewModel() {
            CreateTempAgent $r3 = createTempAgent();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            Analytics $r5 = $r4.analytics();
            BvnLookup $r6 = bvnLookup();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            BaseOtpUtil $r7 = $r42.baseOtpUtil();
            RegisterNavigator $r1 = this.registerV2Navigator;
            CheckIfBvnExists $r8 = checkIfBvnExists();
            DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
            FetchCurrentUser $r9 = $r43.fetchCurrentUser();
            PhoneAndBvnViewModel $r2 = new PhoneAndBvnViewModel($r3, $r5, $r6, $r7, $r1, $r8, $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RegisterNewAgent registerNewAgent() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            RegisterNewAgent $r1 = new RegisterNewAgent($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RegisterNewUser registerNewUser() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            RegisterNewUser $r1 = new RegisterNewUser($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SetNewPin setNewPin() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            SetNewPin $r1 = new SetNewPin($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpdateUser updateUser() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            UserRepository $r3 = $r4.userRepository();
            RxSchedulers $r2 = new RxSchedulers();
            UpdateUser $r1 = new UpdateUser($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyBvn verifyBvn() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            VerifyBvn $r1 = new VerifyBvn($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyBvnPictureViewModel verifyBvnPictureViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            VerifyBvn $r5 = verifyBvn();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r6 = $r32.analytics();
            RegisterNavigator $r2 = this.registerV2Navigator;
            VerifyBvnPictureViewModel $r1 = new VerifyBvnPictureViewModel($r4, $r5, $r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WelcomeViewModel welcomeViewModel() {
            RegisterNavigator $r2 = this.registerV2Navigator;
            WelcomeViewModel $r1 = new WelcomeViewModel($r2);
            return $r1;
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(NonAgentSignOnFragment nonAgentSignOnFragment) {
            injectNonAgentSignOnFragment(nonAgentSignOnFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(AccountTypeFragment accountTypeFragment) {
            injectAccountTypeFragment(accountTypeFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(BusinessInfoFragment businessInfoFragment) {
            injectBusinessInfoFragment(businessInfoFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(CreatePinFragment createPinFragment) {
            injectCreatePinFragment(createPinFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(PersonalInfoFragment personalInfoFragment) {
            injectPersonalInfoFragment(personalInfoFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(BvnNinFragment bvnNinFragment) {
            injectBvnNinFragment(bvnNinFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(PhoneFragment phoneFragment) {
            injectPhoneFragment(phoneFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(WelcomeFragment welcomeFragment) {
            injectWelcomeFragment(welcomeFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(VerifyBvnPictureFragment verifyBvnPictureFragment) {
            injectVerifyBvnPictureFragment(verifyBvnPictureFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent
        public void inject(BvnExistingAgentActivity bvnExistingAgentActivity) {
            injectBvnExistingAgentActivity(bvnExistingAgentActivity);
        }
    }

    /* loaded from: classes.dex */
    final class CashInsuranceActivitySubComponentFactory implements CashInsuranceActivitySubComponent.Factory {
        private CashInsuranceActivitySubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.settings.insurance.xpp3.CashInsuranceActivitySubComponent.Factory
        public CashInsuranceActivitySubComponent create(CashInsuranceFragmentNavigator cashInsuranceFragmentNavigator) {
            C9473g.m14650b(cashInsuranceFragmentNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            CashInsuranceActivitySubComponentImpl $r2 = new CashInsuranceActivitySubComponentImpl(cashInsuranceFragmentNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class CashInsuranceActivitySubComponentImpl implements CashInsuranceActivitySubComponent {
        private final CashInsuranceFragmentNavigator navigator;

        private CashInsuranceActivitySubComponentImpl(CashInsuranceFragmentNavigator cashInsuranceFragmentNavigator) {
            this.navigator = cashInsuranceFragmentNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CashInsuranceViewModel cashInsuranceViewModel() {
            DeactivateInsuranceUseCase $r3 = deactivateInsuranceUseCase();
            GetInsuranceDetailsUseCase $r4 = getInsuranceDetailsUseCase();
            ResourceDelegate $r5 = resourceDelegate();
            CashInsuranceFragmentNavigator $r2 = this.navigator;
            CashInsuranceViewModel $r1 = new CashInsuranceViewModel($r3, $r4, $r5, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DeactivateInsuranceUseCase deactivateInsuranceUseCase() {
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            UserRepository $r4 = $r3.userRepository();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r32.networkService();
            DeactivateInsuranceUseCase $r1 = new DeactivateInsuranceUseCase($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetInsuranceDetailsUseCase getInsuranceDetailsUseCase() {
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            UserRepository $r4 = $r3.userRepository();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r32.networkService();
            GetInsuranceDetailsUseCase $r1 = new GetInsuranceDetailsUseCase($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CashInsuranceFragment injectCashInsuranceFragment(CashInsuranceFragment cashInsuranceFragment) {
            CashInsuranceViewModel $r2 = cashInsuranceViewModel();
            CashInsuranceFragment_MembersInjector.injectViewModel(cashInsuranceFragment, $r2);
            ServerTimeToTransactionDayMapper $r3 = serverTimeToTransactionDayMapper();
            CashInsuranceFragment_MembersInjector.injectServerTimeToTransactionDayMapper(cashInsuranceFragment, $r3);
            return cashInsuranceFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private InsuranceDeactivationReasonsFragment injectInsuranceDeactivationReasonsFragment(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment) {
            InsuranceDeactivationReasonViewModel $r2 = insuranceDeactivationReasonViewModel();
            InsuranceDeactivationReasonsFragment_MembersInjector.injectViewModel(insuranceDeactivationReasonsFragment, $r2);
            return insuranceDeactivationReasonsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private InsuranceDeactivationReasonViewModel insuranceDeactivationReasonViewModel() {
            ResourceDelegate $r2 = resourceDelegate();
            InsuranceDeactivationReasonViewModel $r1 = new InsuranceDeactivationReasonViewModel($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper() {
            ResourceDelegate $r2 = resourceDelegate();
            ServerTimeToTransactionDayMapper $r1 = new ServerTimeToTransactionDayMapper($r2);
            return $r1;
        }

        @Override // ai.kudi.agent.settings.insurance.xpp3.CashInsuranceActivitySubComponent
        public void inject(CashInsuranceFragment cashInsuranceFragment) {
            injectCashInsuranceFragment(cashInsuranceFragment);
        }

        @Override // ai.kudi.agent.settings.insurance.xpp3.CashInsuranceActivitySubComponent
        public void inject(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment) {
            injectInsuranceDeactivationReasonsFragment(insuranceDeactivationReasonsFragment);
        }
    }

    /* loaded from: classes.dex */
    final class CashWithdrawalOptionComponentFactory implements CashWithdrawalOptionComponent.Factory {
        private CashWithdrawalOptionComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent.Factory
        public CashWithdrawalOptionComponent create() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            CashWithdrawalOptionComponentImpl $r1 = new CashWithdrawalOptionComponentImpl();
            return $r1;
        }
    }

    /* loaded from: classes.dex */
    final class CashWithdrawalOptionComponentImpl implements CashWithdrawalOptionComponent {
        private CashWithdrawalOptionComponentImpl() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardWithdrawalAmountViewModel cardWithdrawalAmountViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            PerformServiceFeeLookup $r2 = $r3.performServiceFeeLookup();
            CardWithdrawalAmountViewModel $r1 = new CardWithdrawalAmountViewModel($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardlessWithdrawalRepository cardlessWithdrawalRepository() {
            CardlessWithdrawalRepository.LocalSource $r2 = localSource();
            CardlessWithdrawalRepository.RemoteSource $r3 = remoteSource();
            CardlessWithdrawalRepository $r1 = new CardlessWithdrawalRepository($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardlessWithdrawalUsecase cardlessWithdrawalUsecase() {
            CardlessWithdrawalRepository $r2 = cardlessWithdrawalRepository();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            PerformServiceFeeLookup $r4 = $r3.performServiceFeeLookup();
            CardlessWithdrawalUsecase $r1 = new CardlessWithdrawalUsecase($r2, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CashWithdrawalOptionPresenter cashWithdrawalOptionPresenter() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            Analytics $r3 = $r2.analytics();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            CashWithdrawalOptionPresenter $r1 = new CashWithdrawalOptionPresenter($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CheckUssdWithdrawalTransactionStatus checkUssdWithdrawalTransactionStatus() {
            UssdWithdrawalRepository $r2 = ussdWithdrawalRepository();
            CheckUssdWithdrawalTransactionStatus $r1 = new CheckUssdWithdrawalTransactionStatus($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchUssdWithdrawalProviderListUsecase fetchUssdWithdrawalProviderListUsecase() {
            UssdWithdrawalRepository $r2 = ussdWithdrawalRepository();
            FetchUssdWithdrawalProviderListUsecase $r1 = new FetchUssdWithdrawalProviderListUsecase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GenerateUssdWithdrawalCode generateUssdWithdrawalCode() {
            UssdWithdrawalRepository $r2 = ussdWithdrawalRepository();
            GenerateUssdWithdrawalCode $r1 = new GenerateUssdWithdrawalCode($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardWithdrawalAmountFragment injectCardWithdrawalAmountFragment(CardWithdrawalAmountFragment cardWithdrawalAmountFragment) {
            CardWithdrawalAmountViewModel $r2 = cardWithdrawalAmountViewModel();
            BaseAmountInputFragment_MembersInjector.injectScreenViewModel(cardWithdrawalAmountFragment, $r2);
            return cardWithdrawalAmountFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CashWithdrawalOptionActivity injectCashWithdrawalOptionActivity(CashWithdrawalOptionActivity cashWithdrawalOptionActivity) {
            CashWithdrawalOptionPresenter $r2 = cashWithdrawalOptionPresenter();
            CashWithdrawalOptionActivity_MembersInjector.injectThisPresenter(cashWithdrawalOptionActivity, $r2);
            return cashWithdrawalOptionActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MPosActivationFragment injectMPosActivationFragment(MPosActivationFragment mPosActivationFragment) {
            MPosActivationViewModel $r2 = mPosActivationViewModel();
            MPosActivationFragment_MembersInjector.injectScreenViewModel(mPosActivationFragment, $r2);
            return mPosActivationFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MPosAmountInputFragment injectMPosAmountInputFragment(MPosAmountInputFragment mPosAmountInputFragment) {
            MPosAmountInputViewModel $r2 = mPosAmountInputViewModel();
            BaseAmountInputFragment_MembersInjector.injectScreenViewModel(mPosAmountInputFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            CacheModule $r4 = $r3.cacheModule;
            Pref $r5 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r4);
            MPosAmountInputFragment_MembersInjector.injectPref(mPosAmountInputFragment, $r5);
            return mPosAmountInputFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OthersWithdrawalFragment injectOthersWithdrawalFragment(OthersWithdrawalFragment othersWithdrawalFragment) {
            OthersWithdrawalPresenter $r2 = othersWithdrawalPresenter();
            OthersWithdrawalFragment_MembersInjector.injectThisPresenter(othersWithdrawalFragment, $r2);
            return othersWithdrawalFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalAmountInputFragment injectUssdWithdrawalAmountInputFragment(UssdWithdrawalAmountInputFragment ussdWithdrawalAmountInputFragment) {
            UssdWithdrawalAmountInputViewModel $r2 = ussdWithdrawalAmountInputViewModel();
            BaseAmountInputFragment_MembersInjector.injectScreenViewModel(ussdWithdrawalAmountInputFragment, $r2);
            return ussdWithdrawalAmountInputFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalCodeReferenceFragment injectUssdWithdrawalCodeReferenceFragment(UssdWithdrawalCodeReferenceFragment ussdWithdrawalCodeReferenceFragment) {
            UssdWithdrawalCodeReferenceViewModel $r2 = ussdWithdrawalCodeReferenceViewModel();
            UssdWithdrawalCodeReferenceFragment_MembersInjector.injectScreenViewModel(ussdWithdrawalCodeReferenceFragment, $r2);
            return ussdWithdrawalCodeReferenceFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalVoucherInputFragment injectUssdWithdrawalVoucherInputFragment(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment) {
            UssdWithdrawalVoucherInputViewModel $r2 = ussdWithdrawalVoucherInputViewModel();
            UssdWithdrawalVoucherInputFragment_MembersInjector.injectScreenViewModel(ussdWithdrawalVoucherInputFragment, $r2);
            return ussdWithdrawalVoucherInputFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalVoucherSummaryFragment injectUssdWithdrawalVoucherSummaryFragment(UssdWithdrawalVoucherSummaryFragment ussdWithdrawalVoucherSummaryFragment) {
            UssdWithdrawalVoucherSummaryViewModel $r2 = ussdWithdrawalVoucherSummaryViewModel();
            UssdWithdrawalVoucherSummaryFragment_MembersInjector.injectScreenViewModel(ussdWithdrawalVoucherSummaryFragment, $r2);
            return ussdWithdrawalVoucherSummaryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardlessWithdrawalRepository.LocalSource localSource() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r2 = $r3.fetchCurrentUser();
            CardlessWithdrawalRepository.LocalSource $r1 = new CardlessWithdrawalRepository.LocalSource($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalRepository.LocalSource localSource2() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesCoreAppDatabaseProvider;
            Object $r4 = $r3.get();
            CoreAppDatabase $r5 = (CoreAppDatabase) $r4;
            UssdWithdrawalRepository.LocalSource $r1 = new UssdWithdrawalRepository.LocalSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MPosActivationViewModel mPosActivationViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providePayPadProvider;
            Object $r4 = $r3.get();
            Paypad $r5 = (Paypad) $r4;
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            CacheModule $r6 = $r22.cacheModule;
            Pref $r7 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r6);
            MPosActivationViewModel $r1 = new MPosActivationViewModel($r5, $r7);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MPosAmountInputViewModel mPosAmountInputViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            CacheModule $r3 = $r2.cacheModule;
            Pref $r4 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r3);
            MPosAmountInputViewModel $r1 = new MPosAmountInputViewModel($r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OthersWithdrawalPresenter othersWithdrawalPresenter() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            PerformServiceFeeLookup $r3 = $r2.performServiceFeeLookup();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            Analytics $r5 = $r23.analytics();
            OthersWithdrawalPresenter $r1 = new OthersWithdrawalPresenter($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardlessWithdrawalRepository.RemoteSource remoteSource() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            CardlessWithdrawalRepository.RemoteSource $r1 = new CardlessWithdrawalRepository.RemoteSource($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalRepository.RemoteSource remoteSource2() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            ApplicationModule $r4 = $r22.applicationModule;
            C5615f $r5 = ApplicationModule_ProvidesFirebaseDbFactory.providesFirebaseDb($r4);
            UssdWithdrawalRepository.RemoteSource $r1 = new UssdWithdrawalRepository.RemoteSource($r3, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalAmountInputViewModel ussdWithdrawalAmountInputViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            PerformServiceFeeLookup $r4 = $r22.performServiceFeeLookup();
            GenerateUssdWithdrawalCode $r5 = generateUssdWithdrawalCode();
            UssdWithdrawalAmountInputViewModel $r1 = new UssdWithdrawalAmountInputViewModel($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalCodeReferenceViewModel ussdWithdrawalCodeReferenceViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            CheckUssdWithdrawalTransactionStatus $r4 = checkUssdWithdrawalTransactionStatus();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            Analytics $r5 = $r22.analytics();
            UssdWithdrawalCodeReferenceViewModel $r1 = new UssdWithdrawalCodeReferenceViewModel($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalRepository ussdWithdrawalRepository() {
            UssdWithdrawalRepository.LocalSource $r2 = localSource2();
            UssdWithdrawalRepository.RemoteSource $r3 = remoteSource2();
            UssdWithdrawalRepository $r1 = new UssdWithdrawalRepository($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel() {
            ResourceDelegate $r2 = resourceDelegate();
            CardlessWithdrawalUsecase $r3 = cardlessWithdrawalUsecase();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            Analytics $r6 = $r42.analytics();
            FetchUssdWithdrawalProviderListUsecase $r7 = fetchUssdWithdrawalProviderListUsecase();
            UssdWithdrawalVoucherInputViewModel $r1 = new UssdWithdrawalVoucherInputViewModel($r2, $r3, $r5, $r6, $r7);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdWithdrawalVoucherSummaryViewModel ussdWithdrawalVoucherSummaryViewModel() {
            CardlessWithdrawalUsecase $r2 = cardlessWithdrawalUsecase();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            UssdWithdrawalVoucherSummaryViewModel $r1 = new UssdWithdrawalVoucherSummaryViewModel($r2, $r4, $r5);
            return $r1;
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(CashWithdrawalOptionActivity cashWithdrawalOptionActivity) {
            injectCashWithdrawalOptionActivity(cashWithdrawalOptionActivity);
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(CardWithdrawalAmountFragment cardWithdrawalAmountFragment) {
            injectCardWithdrawalAmountFragment(cardWithdrawalAmountFragment);
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(MPosActivationFragment mPosActivationFragment) {
            injectMPosActivationFragment(mPosActivationFragment);
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(MPosAmountInputFragment mPosAmountInputFragment) {
            injectMPosAmountInputFragment(mPosAmountInputFragment);
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(UssdWithdrawalAmountInputFragment ussdWithdrawalAmountInputFragment) {
            injectUssdWithdrawalAmountInputFragment(ussdWithdrawalAmountInputFragment);
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(UssdWithdrawalCodeReferenceFragment ussdWithdrawalCodeReferenceFragment) {
            injectUssdWithdrawalCodeReferenceFragment(ussdWithdrawalCodeReferenceFragment);
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(UssdWithdrawalVoucherInputFragment ussdWithdrawalVoucherInputFragment) {
            injectUssdWithdrawalVoucherInputFragment(ussdWithdrawalVoucherInputFragment);
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(UssdWithdrawalVoucherSummaryFragment ussdWithdrawalVoucherSummaryFragment) {
            injectUssdWithdrawalVoucherSummaryFragment(ussdWithdrawalVoucherSummaryFragment);
        }

        @Override // ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent
        public void inject(OthersWithdrawalFragment othersWithdrawalFragment) {
            injectOthersWithdrawalFragment(othersWithdrawalFragment);
        }
    }

    /* loaded from: classes.dex */
    final class DeviceVerificationSubcomponentFactory implements DeviceVerificationSubcomponent.Factory {
        private DeviceVerificationSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent.Factory
        public DeviceVerificationSubcomponent create(PhoneVerificationNavigator phoneVerificationNavigator) {
            C9473g.m14650b(phoneVerificationNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            DeviceVerificationSubcomponentImpl $r2 = new DeviceVerificationSubcomponentImpl(phoneVerificationNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class DeviceVerificationSubcomponentImpl implements DeviceVerificationSubcomponent {
        private final PhoneVerificationNavigator phoneVerificationNavigator;

        private DeviceVerificationSubcomponentImpl(PhoneVerificationNavigator phoneVerificationNavigator) {
            this.phoneVerificationNavigator = phoneVerificationNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AccountVerificationHolderActivity injectAccountVerificationHolderActivity(AccountVerificationHolderActivity accountVerificationHolderActivity) {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            AccountVerificationPresenter $r2 = $r3.accountVerificationPresenter();
            AccountVerificationHolderActivity_MembersInjector.injectThisPresenter(accountVerificationHolderActivity, $r2);
            return accountVerificationHolderActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BvnUpdateFragment injectBvnUpdateFragment(BvnUpdateFragment bvnUpdateFragment) {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            EnforceBvnVerificationViewModel $r2 = $r3.enforceBvnVerificationViewModel();
            BvnUpdateFragment_MembersInjector.injectViewModel(bvnUpdateFragment, $r2);
            return bvnUpdateFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EnforceBvnVerificationFragment injectEnforceBvnVerificationFragment(EnforceBvnVerificationFragment enforceBvnVerificationFragment) {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            EnforceBvnVerificationViewModel $r2 = $r3.enforceBvnVerificationViewModel();
            EnforceBvnVerificationFragment_MembersInjector.injectViewModel(enforceBvnVerificationFragment, $r2);
            return enforceBvnVerificationFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private NewDeviceVerificationOptionFragment injectNewDeviceVerificationOptionFragment(NewDeviceVerificationOptionFragment newDeviceVerificationOptionFragment) {
            NewDeviceVerificationViewModel $r2 = newDeviceVerificationViewModel();
            NewDeviceVerificationOptionFragment_MembersInjector.injectNewDeviceVerificationViewModel(newDeviceVerificationOptionFragment, $r2);
            return newDeviceVerificationOptionFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UnknownDeviceDobFragment injectUnknownDeviceDobFragment(UnknownDeviceDobFragment unknownDeviceDobFragment) {
            UnknownDeviceDobViewModel $r2 = unknownDeviceDobViewModel();
            UnknownDeviceDobFragment_MembersInjector.injectUnknownDeviceDobViewModel(unknownDeviceDobFragment, $r2);
            return unknownDeviceDobFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UnknownDeviceFaceVerificationFragment injectUnknownDeviceFaceVerificationFragment(UnknownDeviceFaceVerificationFragment unknownDeviceFaceVerificationFragment) {
            UnknownDeviceFaceVerificationViewModel $r2 = unknownDeviceFaceVerificationViewModel();
            UnknownDeviceFaceVerificationFragment_MembersInjector.injectViewModel(unknownDeviceFaceVerificationFragment, $r2);
            return unknownDeviceFaceVerificationFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private NewDeviceVerificationViewModel newDeviceVerificationViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            BaseOtpUtil $r4 = $r3.baseOtpUtil();
            PhoneVerificationNavigator $r2 = this.phoneVerificationNavigator;
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            NewDeviceVerificationViewModel $r1 = new NewDeviceVerificationViewModel($r4, $r2, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UnknownDeviceDobViewModel unknownDeviceDobViewModel() {
            VerifyFaceWithDob $r2 = verifyFaceWithDob();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            LoginUser $r4 = $r3.loginUser();
            UnknownDeviceDobViewModel $r1 = new UnknownDeviceDobViewModel($r2, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UnknownDeviceFaceVerificationViewModel unknownDeviceFaceVerificationViewModel() {
            VerifyFaceForLogin $r3 = verifyFaceForLogin();
            PhoneVerificationNavigator $r2 = this.phoneVerificationNavigator;
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            Analytics $r5 = $r4.analytics();
            UnknownDeviceFaceVerificationViewModel $r1 = new UnknownDeviceFaceVerificationViewModel($r3, $r2, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyFaceForLogin verifyFaceForLogin() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            VerifyFaceForLogin $r1 = new VerifyFaceForLogin($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyFaceWithDob verifyFaceWithDob() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            VerifyFaceWithDob $r1 = new VerifyFaceWithDob($r3, $r2);
            return $r1;
        }

        @Override // ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent
        public void inject(AccountVerificationHolderActivity accountVerificationHolderActivity) {
            injectAccountVerificationHolderActivity(accountVerificationHolderActivity);
        }

        @Override // ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent
        public void inject(BvnUpdateFragment bvnUpdateFragment) {
            injectBvnUpdateFragment(bvnUpdateFragment);
        }

        @Override // ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent
        public void inject(EnforceBvnVerificationFragment enforceBvnVerificationFragment) {
            injectEnforceBvnVerificationFragment(enforceBvnVerificationFragment);
        }

        @Override // ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent
        public void inject(NewDeviceVerificationOptionFragment newDeviceVerificationOptionFragment) {
            injectNewDeviceVerificationOptionFragment(newDeviceVerificationOptionFragment);
        }

        @Override // ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent
        public void inject(UnknownDeviceDobFragment unknownDeviceDobFragment) {
            injectUnknownDeviceDobFragment(unknownDeviceDobFragment);
        }

        @Override // ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent
        public void inject(UnknownDeviceFaceVerificationFragment unknownDeviceFaceVerificationFragment) {
            injectUnknownDeviceFaceVerificationFragment(unknownDeviceFaceVerificationFragment);
        }
    }

    /* loaded from: classes.dex */
    final class EnableFingerPrintSubComponentFactory implements EnableFingerPrintSubComponent.Factory {
        private EnableFingerPrintSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.game.components.EnableFingerPrintSubComponent.Factory
        public EnableFingerPrintSubComponent create() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            EnableFingerPrintSubComponentImpl $r1 = new EnableFingerPrintSubComponentImpl();
            return $r1;
        }
    }

    /* loaded from: classes.dex */
    final class EnableFingerPrintSubComponentImpl implements EnableFingerPrintSubComponent {
        private EnableFingerPrintSubComponentImpl() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EnableFingerPrintFragment injectEnableFingerPrintFragment(EnableFingerPrintFragment enableFingerPrintFragment) {
            EnableFingerPrintViewModel $r2 = new EnableFingerPrintViewModel();
            EnableFingerPrintFragment_MembersInjector.injectVm(enableFingerPrintFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            EnableFingerPrintFragment_MembersInjector.injectSharedPreferences(enableFingerPrintFragment, $r6);
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r7 = $r32.analytics();
            EnableFingerPrintFragment_MembersInjector.injectAnalytics(enableFingerPrintFragment, $r7);
            return enableFingerPrintFragment;
        }

        @Override // ai.kudi.agent.login.game.components.EnableFingerPrintSubComponent
        public void inject(EnableFingerPrintActivity enableFingerPrintActivity) {
        }

        @Override // ai.kudi.agent.login.game.components.EnableFingerPrintSubComponent
        public void inject(EnableFingerPrintFragment enableFingerPrintFragment) {
            injectEnableFingerPrintFragment(enableFingerPrintFragment);
        }
    }

    /* loaded from: classes.dex */
    final class ForgotPasswordSubComponentFactory implements ForgotPasswordSubComponent.Factory {
        private ForgotPasswordSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.game.components.ForgotPasswordSubComponent.Factory
        public ForgotPasswordSubComponent create(ForgotPasswordNavigator forgotPasswordNavigator) {
            C9473g.m14650b(forgotPasswordNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            ForgotPasswordSubComponentImpl $r2 = new ForgotPasswordSubComponentImpl(forgotPasswordNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class ForgotPasswordSubComponentImpl implements ForgotPasswordSubComponent {
        private final ForgotPasswordNavigator forgotPasswordNavigator;

        private ForgotPasswordSubComponentImpl(ForgotPasswordNavigator forgotPasswordNavigator) {
            this.forgotPasswordNavigator = forgotPasswordNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EnterPhoneNoViewModel enterPhoneNoViewModel() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            RequestOtp $r3 = $r4.requestOtp();
            ForgotPasswordNavigator $r2 = this.forgotPasswordNavigator;
            EnterPhoneNoViewModel $r1 = new EnterPhoneNoViewModel($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ForgotPasswordViewModel forgotPasswordViewModel() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            BaseOtpUtil $r3 = $r4.baseOtpUtil();
            ForgotPasswordNavigator $r2 = this.forgotPasswordNavigator;
            ForgotPasswordViewModel $r1 = new ForgotPasswordViewModel($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EnterPhoneNoFragment injectEnterPhoneNoFragment(EnterPhoneNoFragment enterPhoneNoFragment) {
            EnterPhoneNoViewModel $r2 = enterPhoneNoViewModel();
            EnterPhoneNoFragment_MembersInjector.injectVm(enterPhoneNoFragment, $r2);
            return enterPhoneNoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ForgotPasswordActivity injectForgotPasswordActivity(ForgotPasswordActivity forgotPasswordActivity) {
            ForgotPasswordViewModel $r2 = forgotPasswordViewModel();
            ForgotPasswordActivity_MembersInjector.injectForgotPasswordViewModel(forgotPasswordActivity, $r2);
            return forgotPasswordActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResetPinFragment injectResetPinFragment(ResetPinFragment resetPinFragment) {
            ResetPinViewModel $r2 = resetPinViewModel();
            ResetPinFragment_MembersInjector.injectVm(resetPinFragment, $r2);
            return resetPinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResetPinViewModel resetPinViewModel() {
            SetNewPin $r3 = setNewPin();
            ForgotPasswordNavigator $r2 = this.forgotPasswordNavigator;
            ResetPinViewModel $r1 = new ResetPinViewModel($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SetNewPin setNewPin() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            SetNewPin $r1 = new SetNewPin($r2);
            return $r1;
        }

        @Override // ai.kudi.agent.login.game.components.ForgotPasswordSubComponent
        public void inject(EnterPhoneNoFragment enterPhoneNoFragment) {
            injectEnterPhoneNoFragment(enterPhoneNoFragment);
        }

        @Override // ai.kudi.agent.login.game.components.ForgotPasswordSubComponent
        public void inject(ForgotPasswordActivity forgotPasswordActivity) {
            injectForgotPasswordActivity(forgotPasswordActivity);
        }

        @Override // ai.kudi.agent.login.game.components.ForgotPasswordSubComponent
        public void inject(ResetPinFragment resetPinFragment) {
            injectResetPinFragment(resetPinFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class HomeActivitySubcomponentFactory implements ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent.Factory {
        private HomeActivitySubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent create(HomeActivity homeActivity) {
            C9473g.m14650b(homeActivity);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            HomeActivitySubcomponentImpl $r2 = new HomeActivitySubcomponentImpl(homeActivity);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            HomeActivity $r3 = (HomeActivity) obj;
            ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class HomeActivitySubcomponentImpl implements ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent {
        private final HomeActivity arg0;
        private InterfaceC11700a<HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent.Factory> bvnHomeUpdateFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent.Factory> dashboardFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent.Factory> filterTransactionsFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent.Factory> homeFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory> issueHistoryFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent.Factory> issueResolutionHostFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent.Factory> transactionsContainerFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent.Factory> withdrawCashFragmentSubcomponentFactoryProvider;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class BvnHomeUpdateFragmentSubcomponentFactory implements HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent.Factory {
            private BvnHomeUpdateFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent create(BvnHomeUpdateFragment bvnHomeUpdateFragment) {
                C9473g.m14650b(bvnHomeUpdateFragment);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                BvnHomeUpdateFragmentSubcomponentImpl $r2 = new BvnHomeUpdateFragmentSubcomponentImpl(bvnHomeUpdateFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                BvnHomeUpdateFragment $r3 = (BvnHomeUpdateFragment) obj;
                HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class BvnHomeUpdateFragmentSubcomponentImpl implements HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent {
            private BvnHomeUpdateFragmentSubcomponentImpl(BvnHomeUpdateFragment bvnHomeUpdateFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private BvnHomeUpdateFragment injectBvnHomeUpdateFragment(BvnHomeUpdateFragment bvnHomeUpdateFragment) {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                HomePresenter $r2 = $r3.homePresenter();
                BvnHomeUpdateFragment_MembersInjector.injectThisPresenter(bvnHomeUpdateFragment, $r2);
                return bvnHomeUpdateFragment;
            }

            public void inject(BvnHomeUpdateFragment bvnHomeUpdateFragment) {
                injectBvnHomeUpdateFragment(bvnHomeUpdateFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                BvnHomeUpdateFragment $r2 = (BvnHomeUpdateFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class DashboardFragmentSubcomponentFactory implements HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent.Factory {
            private DashboardFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent create(DashboardFragment dashboardFragment) {
                C9473g.m14650b(dashboardFragment);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DashboardFragmentSubcomponentImpl $r2 = new DashboardFragmentSubcomponentImpl(dashboardFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                DashboardFragment $r3 = (DashboardFragment) obj;
                HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class DashboardFragmentSubcomponentImpl implements HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent {
            private DashboardFragmentSubcomponentImpl(DashboardFragment dashboardFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DashboardPresenter dashboardPresenter() {
                HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                DashboardSummary $r5 = dashboardSummary();
                HomeActivitySubcomponentImpl $r22 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                Analytics $r6 = $r32.analytics();
                DashboardPresenter $r1 = new DashboardPresenter($r4, $r5, $r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DashboardSummary dashboardSummary() {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                NetworkService $r2 = $r4.networkService();
                DashboardSummary $r1 = new DashboardSummary($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DashboardFragment injectDashboardFragment(DashboardFragment dashboardFragment) {
                DashboardPresenter $r2 = dashboardPresenter();
                DashboardFragment_MembersInjector.injectThisPresenter(dashboardFragment, $r2);
                return dashboardFragment;
            }

            public void inject(DashboardFragment dashboardFragment) {
                injectDashboardFragment(dashboardFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                DashboardFragment $r2 = (DashboardFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class FilterTransactionsFragmentSubcomponentFactory implements HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent.Factory {
            private FilterTransactionsFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent create(FilterTransactionsFragment filterTransactionsFragment) {
                C9473g.m14650b(filterTransactionsFragment);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                FilterTransactionsFragmentSubcomponentImpl $r2 = new FilterTransactionsFragmentSubcomponentImpl(filterTransactionsFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                FilterTransactionsFragment $r3 = (FilterTransactionsFragment) obj;
                HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class FilterTransactionsFragmentSubcomponentImpl implements HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent {
            private FilterTransactionsFragmentSubcomponentImpl(FilterTransactionsFragment filterTransactionsFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchOutletWalletHistory fetchOutletWalletHistory() {
                TransactionsRepository $r2 = transactionsRepository();
                FetchOutletWalletHistory $r1 = new FetchOutletWalletHistory($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchWalletActivities fetchWalletActivities() {
                TransactionsRepository $r3 = transactionsRepository();
                RxSchedulers $r2 = new RxSchedulers();
                FetchWalletActivities $r1 = new FetchWalletActivities($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FilterTransactionsViewModel filterTransactionsViewModel() {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                FetchWalletActivities $r6 = fetchWalletActivities();
                SearchTransactionsUseCase $r7 = searchTransactionsUseCase();
                ServerTimeToTransactionDayMapper $r8 = serverTimeToTransactionDayMapper();
                TransactionDataToUiMapper $r1 = new TransactionDataToUiMapper();
                FetchOutletWalletHistory $r9 = fetchOutletWalletHistory();
                HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                CacheModule $r10 = $r42.cacheModule;
                Pref $r11 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r10);
                ResourceDelegate $r12 = resourceDelegate();
                FilterTransactionsViewModel $r2 = new FilterTransactionsViewModel($r5, $r6, $r7, $r8, $r1, $r9, $r11, $r12);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FilterTransactionsFragment injectFilterTransactionsFragment(FilterTransactionsFragment filterTransactionsFragment) {
                FilterTransactionsViewModel $r2 = filterTransactionsViewModel();
                FilterTransactionsFragment_MembersInjector.injectViewModel(filterTransactionsFragment, $r2);
                return filterTransactionsFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ResourceDelegate resourceDelegate() {
                HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.provideAppContextProvider;
                Object $r5 = $r4.get();
                Context $r6 = (Context) $r5;
                ResourceDelegate $r1 = new ResourceDelegate($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SearchTransactionsUseCase searchTransactionsUseCase() {
                RxSchedulers $r2 = new RxSchedulers();
                TransactionsRepository $r3 = transactionsRepository();
                SearchTransactionsUseCase $r1 = new SearchTransactionsUseCase($r2, $r3);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper() {
                ResourceDelegate $r2 = resourceDelegate();
                ServerTimeToTransactionDayMapper $r1 = new ServerTimeToTransactionDayMapper($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private TransactionsRepository transactionsRepository() {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                TransactionsRemoteSource $r5 = $r4.transactionsRemoteSource();
                HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                TransactionsLocalSource $r6 = $r42.transactionsLocalSource();
                HomeActivitySubcomponentImpl $r33 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                TransactionsSummaryLocalSource $r7 = $r43.transactionsSummaryLocalSource();
                RxSchedulers $r2 = new RxSchedulers();
                TransactionsRepository $r1 = new TransactionsRepository($r5, $r6, $r7, $r2);
                return $r1;
            }

            public void inject(FilterTransactionsFragment filterTransactionsFragment) {
                injectFilterTransactionsFragment(filterTransactionsFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                FilterTransactionsFragment $r2 = (FilterTransactionsFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class HAM_IIHF_IssueHistoryFragmentSubcomponentFactory implements HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory {
            private HAM_IIHF_IssueHistoryFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent create(IssueHistoryFragment issueHistoryFragment) {
                C9473g.m14650b(issueHistoryFragment);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                HAM_IIHF_IssueHistoryFragmentSubcomponentImpl $r2 = new HAM_IIHF_IssueHistoryFragmentSubcomponentImpl(issueHistoryFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                IssueHistoryFragment $r3 = (IssueHistoryFragment) obj;
                HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class HAM_IIHF_IssueHistoryFragmentSubcomponentImpl implements HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent {
            private HAM_IIHF_IssueHistoryFragmentSubcomponentImpl(IssueHistoryFragment issueHistoryFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchTickets fetchTickets() {
                HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesIssuesApiServiceProvider;
                Object $r5 = $r4.get();
                IssuesApiService $r6 = (IssuesApiService) $r5;
                FetchTickets $r1 = new FetchTickets($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueHistoryFragment injectIssueHistoryFragment(IssueHistoryFragment issueHistoryFragment) {
                IssueHistoryPresenter $r2 = issueHistoryPresenter();
                IssueHistoryFragment_MembersInjector.injectIssueHistoryPresenter(issueHistoryFragment, $r2);
                return issueHistoryFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueHistoryPresenter issueHistoryPresenter() {
                HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                FetchTickets $r5 = fetchTickets();
                HomeActivitySubcomponentImpl $r22 = HomeActivitySubcomponentImpl.this;
                HomeActivity $r6 = $r22.arg0;
                HomeActivitySubcomponentImpl $r23 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                Analytics $r7 = $r32.analytics();
                IssueHistoryPresenter $r1 = new IssueHistoryPresenter($r4, $r5, $r6, $r7);
                return $r1;
            }

            public void inject(IssueHistoryFragment issueHistoryFragment) {
                injectIssueHistoryFragment(issueHistoryFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                IssueHistoryFragment $r2 = (IssueHistoryFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class HomeFragmentSubcomponentFactory implements HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent.Factory {
            private HomeFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent create(HomeFragment homeFragment) {
                C9473g.m14650b(homeFragment);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                HomeFragmentSubcomponentImpl $r2 = new HomeFragmentSubcomponentImpl(homeFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                HomeFragment $r3 = (HomeFragment) obj;
                HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class HomeFragmentSubcomponentImpl implements HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent {
            private HomeFragmentSubcomponentImpl(HomeFragment homeFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchFrequentlyUsedBills fetchFrequentlyUsedBills() {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                NetworkService $r5 = $r4.networkService();
                HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                BillerRepository $r6 = $r42.billerRepository();
                RxSchedulers $r2 = new RxSchedulers();
                FetchFrequentlyUsedBills $r1 = new FetchFrequentlyUsedBills($r5, $r6, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchKshockAvailabilty fetchKshockAvailabilty() {
                HomeActivitySubcomponentImpl $r4 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchKshockAvailabilty $r1 = new FetchKshockAvailabilty($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ai.kudi.agent.bills.presenters.HomePresenter homePresenter() {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                BillerRepository $r6 = $r42.billerRepository();
                FetchFrequentlyUsedBills $r7 = fetchFrequentlyUsedBills();
                HomeActivitySubcomponentImpl $r33 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                AnnouncementRepository $r8 = $r43.announcementRepository();
                HomeActivitySubcomponentImpl $r34 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r44 = DaggerApplicationComponent.this;
                Analytics $r9 = $r44.analytics();
                HomeActivitySubcomponentImpl $r35 = HomeActivitySubcomponentImpl.this;
                FetchTodo $r10 = $r35.fetchTodo();
                FetchKshockAvailabilty $r11 = fetchKshockAvailabilty();
                SavingsRepository $r12 = savingsRepository();
                RxSchedulers $r1 = new RxSchedulers();
                ai.kudi.agent.bills.presenters.HomePresenter $r2 = new ai.kudi.agent.bills.presenters.HomePresenter($r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12, $r1);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private HomeFragment injectHomeFragment(HomeFragment homeFragment) {
                ai.kudi.agent.bills.presenters.HomePresenter $r2 = homePresenter();
                HomeFragment_MembersInjector.injectThisPresenter(homeFragment, $r2);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                InterfaceC11700a $r5 = $r4.providesFrequentlyUsedSharedPrefsProvider;
                Object $r6 = $r5.get();
                SharedPreferences $r7 = (SharedPreferences) $r6;
                HomeFragment_MembersInjector.injectSharedPreferences(homeFragment, $r7);
                HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                RemoteBillerRepositoryImpl $r8 = $r42.remoteBillerRepositoryImpl();
                HomeFragment_MembersInjector.injectRemotedb(homeFragment, $r8);
                HomeActivitySubcomponentImpl $r33 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                Analytics $r9 = $r43.analytics();
                HomeFragment_MembersInjector.injectAnalytics(homeFragment, $r9);
                SmartLookAnalytics $r10 = new SmartLookAnalytics();
                HomeFragment_MembersInjector.injectSmartLookAnalytics(homeFragment, $r10);
                return homeFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsRepository savingsRepository() {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                SavingsRepository $r1 = new SavingsRepository($r5, $r8, $r2);
                return $r1;
            }

            public void inject(HomeFragment homeFragment) {
                injectHomeFragment(homeFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                HomeFragment $r2 = (HomeFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueResolutionHostFragmentSubcomponentFactory implements HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent.Factory {
            private IssueResolutionHostFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent create(IssueResolutionHostFragment issueResolutionHostFragment) {
                C9473g.m14650b(issueResolutionHostFragment);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                IssueResolutionHostFragmentSubcomponentImpl $r2 = new IssueResolutionHostFragmentSubcomponentImpl(issueResolutionHostFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                IssueResolutionHostFragment $r3 = (IssueResolutionHostFragment) obj;
                HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueResolutionHostFragmentSubcomponentImpl implements HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent {
            private InterfaceC11700a<IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory> issueTypeFragmentNewSubcomponentFactoryProvider;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public final class IRHFM_IITFN_IssueTypeFragmentNewSubcomponentFactory implements IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory {
                private IRHFM_IITFN_IssueTypeFragmentNewSubcomponentFactory() {
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                public IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent create(IssueTypeFragmentNew issueTypeFragmentNew) {
                    C9473g.m14650b(issueTypeFragmentNew);
                    IssueResolutionHostFragmentSubcomponentImpl $r3 = IssueResolutionHostFragmentSubcomponentImpl.this;
                    IRHFM_IITFN_IssueTypeFragmentNewSubcomponentI $r2 = new IRHFM_IITFN_IssueTypeFragmentNewSubcomponentI(issueTypeFragmentNew);
                    return $r2;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.core.internal.modules.IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory
                public /* bridge */ /* synthetic */ Registry create(Object obj) {
                    IssueTypeFragmentNew $r3 = (IssueTypeFragmentNew) obj;
                    IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent $r1 = create($r3);
                    return $r1;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public final class IRHFM_IITFN_IssueTypeFragmentNewSubcomponentI implements IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent {
                private IRHFM_IITFN_IssueTypeFragmentNewSubcomponentI(IssueTypeFragmentNew issueTypeFragmentNew) {
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                private FetchIssueCategories fetchIssueCategories() {
                    IssueResolutionHostFragmentSubcomponentImpl $r3 = IssueResolutionHostFragmentSubcomponentImpl.this;
                    HomeActivitySubcomponentImpl $r4 = HomeActivitySubcomponentImpl.this;
                    DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                    IssueRepository $r2 = $r5.issueRepository();
                    FetchIssueCategories $r1 = new FetchIssueCategories($r2);
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                private IssueTypeFragmentNew injectIssueTypeFragmentNew(IssueTypeFragmentNew issueTypeFragmentNew) {
                    IssueTypeViewModel $r2 = issueTypeViewModel();
                    IssueTypeFragmentNew_MembersInjector.injectIssueTypeViewModel(issueTypeFragmentNew, $r2);
                    IssueResolutionHostFragmentSubcomponentImpl $r3 = IssueResolutionHostFragmentSubcomponentImpl.this;
                    HomeActivitySubcomponentImpl $r4 = HomeActivitySubcomponentImpl.this;
                    DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                    InterfaceC11700a $r6 = $r5.providesFrequentlyUsedSharedPrefsProvider;
                    Object $r7 = $r6.get();
                    SharedPreferences $r8 = (SharedPreferences) $r7;
                    IssueTypeFragmentNew_MembersInjector.injectSharedPreferences(issueTypeFragmentNew, $r8);
                    return issueTypeFragmentNew;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                private IssueTypeViewModel issueTypeViewModel() {
                    IssueResolutionHostFragmentSubcomponentImpl $r2 = IssueResolutionHostFragmentSubcomponentImpl.this;
                    HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                    HomeActivity $r4 = $r3.arg0;
                    FetchIssueCategories $r5 = fetchIssueCategories();
                    IssueResolutionHostFragmentSubcomponentImpl $r22 = IssueResolutionHostFragmentSubcomponentImpl.this;
                    HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                    DaggerApplicationComponent $r6 = DaggerApplicationComponent.this;
                    FetchCurrentUser $r7 = $r6.fetchCurrentUser();
                    IssueResolutionHostFragmentSubcomponentImpl $r23 = IssueResolutionHostFragmentSubcomponentImpl.this;
                    HomeActivitySubcomponentImpl $r33 = HomeActivitySubcomponentImpl.this;
                    DaggerApplicationComponent $r62 = DaggerApplicationComponent.this;
                    Analytics $r8 = $r62.analytics();
                    IssueTypeViewModel $r1 = new IssueTypeViewModel($r4, $r5, $r7, $r8);
                    return $r1;
                }

                public void inject(IssueTypeFragmentNew issueTypeFragmentNew) {
                    injectIssueTypeFragmentNew(issueTypeFragmentNew);
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.core.internal.modules.IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent
                public /* bridge */ /* synthetic */ void inject(Object obj) {
                    IssueTypeFragmentNew $r2 = (IssueTypeFragmentNew) obj;
                    inject($r2);
                }
            }

            private IssueResolutionHostFragmentSubcomponentImpl(IssueResolutionHostFragment issueResolutionHostFragment) {
                initialize(issueResolutionHostFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DispatchingAndroidInjector dispatchingAndroidInjectorOfObject() {
                Map $r1 = mapOfClassOfAndProviderOfAndroidInjectorFactoryOf();
                Map $r2 = AbstractC5077j.m25724l();
                Map r4 = $r2;
                DispatchingAndroidInjector $r3 = C7428c.m18754a($r1, r4);
                return $r3;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private void initialize(IssueResolutionHostFragment issueResolutionHostFragment) {
                this.issueTypeFragmentNewSubcomponentFactoryProvider = new InterfaceC11700a<IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.IssueResolutionHostFragmentSubcomponentImpl.1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p472k.p473a.InterfaceC11700a
                    public IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory get() {
                        IssueResolutionHostFragmentSubcomponentImpl $r2 = IssueResolutionHostFragmentSubcomponentImpl.this;
                        IRHFM_IITFN_IssueTypeFragmentNewSubcomponentFactory $r1 = new IRHFM_IITFN_IssueTypeFragmentNewSubcomponentFactory();
                        return $r1;
                    }

                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p472k.p473a.InterfaceC11700a
                    /* renamed from: get  reason: avoid collision after fix types in other method */
                    public /* bridge */ /* synthetic */ IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory get2() {
                        IssueResolutionHostFragmentModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory $r1 = get();
                        return $r1;
                    }
                };
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueResolutionHostFragment injectIssueResolutionHostFragment(IssueResolutionHostFragment issueResolutionHostFragment) {
                DispatchingAndroidInjector $r2 = dispatchingAndroidInjectorOfObject();
                IssueResolutionHostFragment_MembersInjector.injectAndroidInjector(issueResolutionHostFragment, $r2);
                SmartLookAnalytics $r3 = new SmartLookAnalytics();
                IssueResolutionHostFragment_MembersInjector.injectSmartLookAnalytics(issueResolutionHostFragment, $r3);
                return issueResolutionHostFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private Map mapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
                AbstractC5077j.C5078a $r1 = AbstractC5077j.m25729a(19);
                HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.productActivitySubcomponentFactoryProvider;
                $r1.m25720c(ProductActivity.class, $r4);
                HomeActivitySubcomponentImpl $r22 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                InterfaceC11700a $r42 = $r32.issueActivitySubcomponentFactoryProvider;
                $r1.m25720c(IssueActivity.class, $r42);
                HomeActivitySubcomponentImpl $r23 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
                InterfaceC11700a $r43 = $r33.homeActivitySubcomponentFactoryProvider;
                $r1.m25720c(HomeActivity.class, $r43);
                HomeActivitySubcomponentImpl $r24 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
                InterfaceC11700a $r44 = $r34.kShockActivitySubcomponentFactoryProvider;
                $r1.m25720c(KShockActivity.class, $r44);
                HomeActivitySubcomponentImpl $r25 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r35 = DaggerApplicationComponent.this;
                InterfaceC11700a $r45 = $r35.savingsActivitySubcomponentFactoryProvider;
                $r1.m25720c(SavingsActivity.class, $r45);
                HomeActivitySubcomponentImpl $r26 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r36 = DaggerApplicationComponent.this;
                InterfaceC11700a $r46 = $r36.banksFragmentSubcomponentFactoryProvider;
                $r1.m25720c(BanksFragment.class, $r46);
                HomeActivitySubcomponentImpl $r27 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r37 = DaggerApplicationComponent.this;
                InterfaceC11700a $r47 = $r37.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
                $r1.m25720c(IssuesTermsAndConditionsFragment.class, $r47);
                HomeActivitySubcomponentImpl $r28 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r38 = DaggerApplicationComponent.this;
                InterfaceC11700a $r48 = $r38.kudiPinSubcomponentFactoryProvider;
                $r1.m25720c(KudiPin.class, $r48);
                HomeActivitySubcomponentImpl $r29 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r39 = DaggerApplicationComponent.this;
                InterfaceC11700a $r49 = $r39.f201x23c522c6;
                $r1.m25720c(SendReceiptToTerminalConfirmationBottomSheet.class, $r49);
                HomeActivitySubcomponentImpl $r210 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r310 = DaggerApplicationComponent.this;
                InterfaceC11700a $r410 = $r310.picturePickerFragmentSubcomponentFactoryProvider;
                $r1.m25720c(PicturePickerFragment.class, $r410);
                HomeActivitySubcomponentImpl $r211 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r411 = $r211.homeFragmentSubcomponentFactoryProvider;
                $r1.m25720c(HomeFragment.class, $r411);
                HomeActivitySubcomponentImpl $r212 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r412 = $r212.filterTransactionsFragmentSubcomponentFactoryProvider;
                $r1.m25720c(FilterTransactionsFragment.class, $r412);
                HomeActivitySubcomponentImpl $r213 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r413 = $r213.dashboardFragmentSubcomponentFactoryProvider;
                $r1.m25720c(ai.kudi.agent.dashboard.ui.DashboardFragment.class, $r413);
                HomeActivitySubcomponentImpl $r214 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r414 = $r214.withdrawCashFragmentSubcomponentFactoryProvider;
                $r1.m25720c(WithdrawCashFragment.class, $r414);
                HomeActivitySubcomponentImpl $r215 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r415 = $r215.issueResolutionHostFragmentSubcomponentFactoryProvider;
                $r1.m25720c(IssueResolutionHostFragment.class, $r415);
                HomeActivitySubcomponentImpl $r216 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r416 = $r216.issueHistoryFragmentSubcomponentFactoryProvider;
                $r1.m25720c(IssueHistoryFragment.class, $r416);
                HomeActivitySubcomponentImpl $r217 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r417 = $r217.transactionsContainerFragmentSubcomponentFactoryProvider;
                $r1.m25720c(TransactionsContainerFragment.class, $r417);
                HomeActivitySubcomponentImpl $r218 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r418 = $r218.bvnHomeUpdateFragmentSubcomponentFactoryProvider;
                $r1.m25720c(BvnHomeUpdateFragment.class, $r418);
                InterfaceC11700a $r419 = this.issueTypeFragmentNewSubcomponentFactoryProvider;
                $r1.m25720c(IssueTypeFragmentNew.class, $r419);
                Map $r5 = $r1.m25722a();
                Map r6 = $r5;
                return r6;
            }

            public void inject(IssueResolutionHostFragment issueResolutionHostFragment) {
                injectIssueResolutionHostFragment(issueResolutionHostFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                IssueResolutionHostFragment $r2 = (IssueResolutionHostFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class TransactionsContainerFragmentSubcomponentFactory implements HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent.Factory {
            private TransactionsContainerFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent create(TransactionsContainerFragment transactionsContainerFragment) {
                C9473g.m14650b(transactionsContainerFragment);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                TransactionsContainerFragmentSubcomponentImpl $r2 = new TransactionsContainerFragmentSubcomponentImpl(transactionsContainerFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                TransactionsContainerFragment $r3 = (TransactionsContainerFragment) obj;
                HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class TransactionsContainerFragmentSubcomponentImpl implements HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent {
            private InterfaceC11700a<TransactionsContainerFragmentModule_InjectIncompleteTransactionsFragment.IncompleteTransactionsFragmentSubcomponent.Factory> incompleteTransactionsFragmentSubcomponentFactoryProvider;
            private InterfaceC11700a<TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent.Factory> transactionsFragmentSubcomponentFactoryProvider;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public final class IncompleteTransactionsFragmentSubcomponentFactory implements AbstractC0192x847dd2ab.IncompleteTransactionsFragmentSubcomponent.Factory {
                private IncompleteTransactionsFragmentSubcomponentFactory() {
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                public AbstractC0192x847dd2ab.IncompleteTransactionsFragmentSubcomponent create(IncompleteTransactionsFragment incompleteTransactionsFragment) {
                    C9473g.m14650b(incompleteTransactionsFragment);
                    TransactionsContainerFragmentSubcomponentImpl $r3 = TransactionsContainerFragmentSubcomponentImpl.this;
                    IncompleteTransactionsFragmentSubcomponentI $r2 = new IncompleteTransactionsFragmentSubcomponentI(incompleteTransactionsFragment);
                    return $r2;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.core.internal.modules.AbstractC0192x847dd2ab.IncompleteTransactionsFragmentSubcomponent.Factory
                public /* bridge */ /* synthetic */ Registry create(Object obj) {
                    IncompleteTransactionsFragment $r3 = (IncompleteTransactionsFragment) obj;
                    AbstractC0192x847dd2ab.IncompleteTransactionsFragmentSubcomponent $r1 = create($r3);
                    return $r1;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public final class IncompleteTransactionsFragmentSubcomponentI implements AbstractC0192x847dd2ab.IncompleteTransactionsFragmentSubcomponent {
                private IncompleteTransactionsFragmentSubcomponentI(IncompleteTransactionsFragment incompleteTransactionsFragment) {
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                private FetchIncompleteTransactions fetchIncompleteTransactions() {
                    RxSchedulers $r2 = new RxSchedulers();
                    TransactionsContainerFragmentSubcomponentImpl $r4 = TransactionsContainerFragmentSubcomponentImpl.this;
                    TransactionsRepository $r3 = $r4.transactionsRepository();
                    FetchIncompleteTransactions $r1 = new FetchIncompleteTransactions($r2, $r3);
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                private IncompleteTransactionsViewModel incompleteTransactionsViewModel() {
                    TransactionsContainerFragmentSubcomponentImpl $r3 = TransactionsContainerFragmentSubcomponentImpl.this;
                    HomeActivitySubcomponentImpl $r4 = HomeActivitySubcomponentImpl.this;
                    DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                    FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                    FetchIncompleteTransactions $r7 = fetchIncompleteTransactions();
                    TransactionDataToUiMapper $r1 = new TransactionDataToUiMapper();
                    TransactionsContainerFragmentSubcomponentImpl $r32 = TransactionsContainerFragmentSubcomponentImpl.this;
                    ServerTimeToTransactionDayMapper $r8 = $r32.serverTimeToTransactionDayMapper();
                    TransactionsContainerFragmentSubcomponentImpl $r33 = TransactionsContainerFragmentSubcomponentImpl.this;
                    HomeActivitySubcomponentImpl $r42 = HomeActivitySubcomponentImpl.this;
                    DaggerApplicationComponent $r52 = DaggerApplicationComponent.this;
                    CacheModule $r9 = $r52.cacheModule;
                    Pref $r10 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r9);
                    TransactionsContainerFragmentSubcomponentImpl $r34 = TransactionsContainerFragmentSubcomponentImpl.this;
                    HomeActivitySubcomponentImpl $r43 = HomeActivitySubcomponentImpl.this;
                    HomeActivity $r11 = $r43.arg0;
                    IncompleteTransactionsViewModel $r2 = new IncompleteTransactionsViewModel($r6, $r7, $r1, $r8, $r10, $r11);
                    return $r2;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                private IncompleteTransactionsFragment injectIncompleteTransactionsFragment(IncompleteTransactionsFragment incompleteTransactionsFragment) {
                    IncompleteTransactionsViewModel $r2 = incompleteTransactionsViewModel();
                    IncompleteTransactionsFragment_MembersInjector.injectViewModel(incompleteTransactionsFragment, $r2);
                    return incompleteTransactionsFragment;
                }

                public void inject(IncompleteTransactionsFragment incompleteTransactionsFragment) {
                    injectIncompleteTransactionsFragment(incompleteTransactionsFragment);
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.core.internal.modules.AbstractC0192x847dd2ab.IncompleteTransactionsFragmentSubcomponent
                public /* bridge */ /* synthetic */ void inject(Object obj) {
                    IncompleteTransactionsFragment $r2 = (IncompleteTransactionsFragment) obj;
                    inject($r2);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public final class TransactionsFragmentSubcomponentFactory implements TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent.Factory {
                private TransactionsFragmentSubcomponentFactory() {
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                public TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent create(TransactionsFragment transactionsFragment) {
                    C9473g.m14650b(transactionsFragment);
                    TransactionsContainerFragmentSubcomponentImpl $r3 = TransactionsContainerFragmentSubcomponentImpl.this;
                    TransactionsFragmentSubcomponentI $r2 = new TransactionsFragmentSubcomponentI(transactionsFragment);
                    return $r2;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.core.internal.modules.TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent.Factory
                public /* bridge */ /* synthetic */ Registry create(Object obj) {
                    TransactionsFragment $r3 = (TransactionsFragment) obj;
                    TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent $r1 = create($r3);
                    return $r1;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public final class TransactionsFragmentSubcomponentI implements TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent {
                private TransactionsFragmentSubcomponentI(TransactionsFragment transactionsFragment) {
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                private TransactionsFragment injectTransactionsFragment(TransactionsFragment transactionsFragment) {
                    TransactionsContainerFragmentSubcomponentImpl $r3 = TransactionsContainerFragmentSubcomponentImpl.this;
                    TransactionsViewModel $r2 = $r3.transactionsViewModel();
                    TransactionsFragment_MembersInjector.injectViewModel(transactionsFragment, $r2);
                    return transactionsFragment;
                }

                public void inject(TransactionsFragment transactionsFragment) {
                    injectTransactionsFragment(transactionsFragment);
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.core.internal.modules.TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent
                public /* bridge */ /* synthetic */ void inject(Object obj) {
                    TransactionsFragment $r2 = (TransactionsFragment) obj;
                    inject($r2);
                }
            }

            private TransactionsContainerFragmentSubcomponentImpl(TransactionsContainerFragment transactionsContainerFragment) {
                initialize(transactionsContainerFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DispatchingAndroidInjector dispatchingAndroidInjectorOfObject() {
                Map $r1 = mapOfClassOfAndProviderOfAndroidInjectorFactoryOf();
                Map $r2 = AbstractC5077j.m25724l();
                Map r4 = $r2;
                DispatchingAndroidInjector $r3 = C7428c.m18754a($r1, r4);
                return $r3;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchOutletWalletHistory fetchOutletWalletHistory() {
                TransactionsRepository $r2 = transactionsRepository();
                FetchOutletWalletHistory $r1 = new FetchOutletWalletHistory($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchWalletActivities fetchWalletActivities() {
                TransactionsRepository $r3 = transactionsRepository();
                RxSchedulers $r2 = new RxSchedulers();
                FetchWalletActivities $r1 = new FetchWalletActivities($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private GetOutletTransactionSummaryUseCase getOutletTransactionSummaryUseCase() {
                TransactionsRepository $r2 = transactionsRepository();
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                GetOutletTransactionSummaryUseCase $r1 = new GetOutletTransactionSummaryUseCase($r2, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private GetTransactionSummaryUseCase getTransactionSummaryUseCase() {
                TransactionsRepository $r2 = transactionsRepository();
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                GetTransactionSummaryUseCase $r1 = new GetTransactionSummaryUseCase($r2, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private void initialize(TransactionsContainerFragment transactionsContainerFragment) {
                this.transactionsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.TransactionsContainerFragmentSubcomponentImpl.1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p472k.p473a.InterfaceC11700a
                    public TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent.Factory get() {
                        TransactionsContainerFragmentSubcomponentImpl $r2 = TransactionsContainerFragmentSubcomponentImpl.this;
                        TransactionsFragmentSubcomponentFactory $r1 = new TransactionsFragmentSubcomponentFactory();
                        return $r1;
                    }

                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p472k.p473a.InterfaceC11700a
                    /* renamed from: get  reason: avoid collision after fix types in other method */
                    public /* bridge */ /* synthetic */ TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent.Factory get2() {
                        TransactionsContainerFragmentModule_InjectTransactionsFragment.TransactionsFragmentSubcomponent.Factory $r1 = get();
                        return $r1;
                    }
                };
                this.incompleteTransactionsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<TransactionsContainerFragmentModule_InjectIncompleteTransactionsFragment.IncompleteTransactionsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.TransactionsContainerFragmentSubcomponentImpl.2
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p472k.p473a.InterfaceC11700a
                    public TransactionsContainerFragmentModule_InjectIncompleteTransactionsFragment.IncompleteTransactionsFragmentSubcomponent.Factory get() {
                        TransactionsContainerFragmentSubcomponentImpl $r2 = TransactionsContainerFragmentSubcomponentImpl.this;
                        IncompleteTransactionsFragmentSubcomponentFactory $r1 = new IncompleteTransactionsFragmentSubcomponentFactory();
                        return $r1;
                    }

                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p472k.p473a.InterfaceC11700a
                    /* renamed from: get  reason: avoid collision after fix types in other method */
                    public /* bridge */ /* synthetic */ TransactionsContainerFragmentModule_InjectIncompleteTransactionsFragment.IncompleteTransactionsFragmentSubcomponent.Factory get2() {
                        AbstractC0192x847dd2ab.IncompleteTransactionsFragmentSubcomponent.Factory $r1 = get();
                        return $r1;
                    }
                };
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private TransactionsContainerFragment injectTransactionsContainerFragment(TransactionsContainerFragment transactionsContainerFragment) {
                DispatchingAndroidInjector $r2 = dispatchingAndroidInjectorOfObject();
                TransactionsContainerFragment_MembersInjector.injectAndroidInjector(transactionsContainerFragment, $r2);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                InterfaceC11700a $r5 = $r4.providesFrequentlyUsedSharedPrefsProvider;
                Object $r6 = $r5.get();
                SharedPreferences $r7 = (SharedPreferences) $r6;
                TransactionsContainerFragment_MembersInjector.injectSharedPreferences(transactionsContainerFragment, $r7);
                TransactionsViewModel $r8 = transactionsViewModel();
                TransactionsContainerFragment_MembersInjector.injectViewModel(transactionsContainerFragment, $r8);
                return transactionsContainerFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private Map mapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
                AbstractC5077j.C5078a $r1 = AbstractC5077j.m25729a(20);
                HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.productActivitySubcomponentFactoryProvider;
                $r1.m25720c(ProductActivity.class, $r4);
                HomeActivitySubcomponentImpl $r22 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                InterfaceC11700a $r42 = $r32.issueActivitySubcomponentFactoryProvider;
                $r1.m25720c(IssueActivity.class, $r42);
                HomeActivitySubcomponentImpl $r23 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
                InterfaceC11700a $r43 = $r33.homeActivitySubcomponentFactoryProvider;
                $r1.m25720c(HomeActivity.class, $r43);
                HomeActivitySubcomponentImpl $r24 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
                InterfaceC11700a $r44 = $r34.kShockActivitySubcomponentFactoryProvider;
                $r1.m25720c(KShockActivity.class, $r44);
                HomeActivitySubcomponentImpl $r25 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r35 = DaggerApplicationComponent.this;
                InterfaceC11700a $r45 = $r35.savingsActivitySubcomponentFactoryProvider;
                $r1.m25720c(SavingsActivity.class, $r45);
                HomeActivitySubcomponentImpl $r26 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r36 = DaggerApplicationComponent.this;
                InterfaceC11700a $r46 = $r36.banksFragmentSubcomponentFactoryProvider;
                $r1.m25720c(BanksFragment.class, $r46);
                HomeActivitySubcomponentImpl $r27 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r37 = DaggerApplicationComponent.this;
                InterfaceC11700a $r47 = $r37.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
                $r1.m25720c(IssuesTermsAndConditionsFragment.class, $r47);
                HomeActivitySubcomponentImpl $r28 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r38 = DaggerApplicationComponent.this;
                InterfaceC11700a $r48 = $r38.kudiPinSubcomponentFactoryProvider;
                $r1.m25720c(KudiPin.class, $r48);
                HomeActivitySubcomponentImpl $r29 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r39 = DaggerApplicationComponent.this;
                InterfaceC11700a $r49 = $r39.f201x23c522c6;
                $r1.m25720c(SendReceiptToTerminalConfirmationBottomSheet.class, $r49);
                HomeActivitySubcomponentImpl $r210 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r310 = DaggerApplicationComponent.this;
                InterfaceC11700a $r410 = $r310.picturePickerFragmentSubcomponentFactoryProvider;
                $r1.m25720c(PicturePickerFragment.class, $r410);
                HomeActivitySubcomponentImpl $r211 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r411 = $r211.homeFragmentSubcomponentFactoryProvider;
                $r1.m25720c(HomeFragment.class, $r411);
                HomeActivitySubcomponentImpl $r212 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r412 = $r212.filterTransactionsFragmentSubcomponentFactoryProvider;
                $r1.m25720c(FilterTransactionsFragment.class, $r412);
                HomeActivitySubcomponentImpl $r213 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r413 = $r213.dashboardFragmentSubcomponentFactoryProvider;
                $r1.m25720c(ai.kudi.agent.dashboard.ui.DashboardFragment.class, $r413);
                HomeActivitySubcomponentImpl $r214 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r414 = $r214.withdrawCashFragmentSubcomponentFactoryProvider;
                $r1.m25720c(WithdrawCashFragment.class, $r414);
                HomeActivitySubcomponentImpl $r215 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r415 = $r215.issueResolutionHostFragmentSubcomponentFactoryProvider;
                $r1.m25720c(IssueResolutionHostFragment.class, $r415);
                HomeActivitySubcomponentImpl $r216 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r416 = $r216.issueHistoryFragmentSubcomponentFactoryProvider;
                $r1.m25720c(IssueHistoryFragment.class, $r416);
                HomeActivitySubcomponentImpl $r217 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r417 = $r217.transactionsContainerFragmentSubcomponentFactoryProvider;
                $r1.m25720c(TransactionsContainerFragment.class, $r417);
                HomeActivitySubcomponentImpl $r218 = HomeActivitySubcomponentImpl.this;
                InterfaceC11700a $r418 = $r218.bvnHomeUpdateFragmentSubcomponentFactoryProvider;
                $r1.m25720c(BvnHomeUpdateFragment.class, $r418);
                InterfaceC11700a $r419 = this.transactionsFragmentSubcomponentFactoryProvider;
                $r1.m25720c(TransactionsFragment.class, $r419);
                InterfaceC11700a $r420 = this.incompleteTransactionsFragmentSubcomponentFactoryProvider;
                $r1.m25720c(IncompleteTransactionsFragment.class, $r420);
                Map $r5 = $r1.m25722a();
                Map r6 = $r5;
                return r6;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ResourceDelegate resourceDelegate() {
                HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.provideAppContextProvider;
                Object $r5 = $r4.get();
                Context $r6 = (Context) $r5;
                ResourceDelegate $r1 = new ResourceDelegate($r6);
                return $r1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper() {
                ResourceDelegate $r2 = resourceDelegate();
                ServerTimeToTransactionDayMapper $r1 = new ServerTimeToTransactionDayMapper($r2);
                return $r1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public TransactionsRepository transactionsRepository() {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                TransactionsRemoteSource $r5 = $r4.transactionsRemoteSource();
                HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                TransactionsLocalSource $r6 = $r42.transactionsLocalSource();
                HomeActivitySubcomponentImpl $r33 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                TransactionsSummaryLocalSource $r7 = $r43.transactionsSummaryLocalSource();
                RxSchedulers $r2 = new RxSchedulers();
                TransactionsRepository $r1 = new TransactionsRepository($r5, $r6, $r7, $r2);
                return $r1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public TransactionsViewModel transactionsViewModel() {
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                HomeActivitySubcomponentImpl $r32 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                Analytics $r6 = $r42.analytics();
                HomeActivitySubcomponentImpl $r33 = HomeActivitySubcomponentImpl.this;
                TransactionsNavigator $r7 = $r33.transactionsNavigator();
                FetchWalletActivities $r8 = fetchWalletActivities();
                GetTransactionSummaryUseCase $r9 = getTransactionSummaryUseCase();
                GetOutletTransactionSummaryUseCase $r10 = getOutletTransactionSummaryUseCase();
                ServerTimeToTransactionDayMapper $r11 = serverTimeToTransactionDayMapper();
                TransactionDataToUiMapper $r1 = new TransactionDataToUiMapper();
                FetchOutletWalletHistory $r12 = fetchOutletWalletHistory();
                HomeActivitySubcomponentImpl $r34 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                CacheModule $r13 = $r43.cacheModule;
                Pref $r14 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r13);
                ResourceDelegate $r15 = resourceDelegate();
                TransactionsViewModel $r2 = new TransactionsViewModel($r5, $r6, $r7, $r8, $r9, $r10, $r11, $r1, $r12, $r14, $r15);
                return $r2;
            }

            public void inject(TransactionsContainerFragment transactionsContainerFragment) {
                injectTransactionsContainerFragment(transactionsContainerFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                TransactionsContainerFragment $r2 = (TransactionsContainerFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class WithdrawCashFragmentSubcomponentFactory implements HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent.Factory {
            private WithdrawCashFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent create(WithdrawCashFragment withdrawCashFragment) {
                C9473g.m14650b(withdrawCashFragment);
                HomeActivitySubcomponentImpl $r3 = HomeActivitySubcomponentImpl.this;
                WithdrawCashFragmentSubcomponentImpl $r2 = new WithdrawCashFragmentSubcomponentImpl(withdrawCashFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                WithdrawCashFragment $r3 = (WithdrawCashFragment) obj;
                HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class WithdrawCashFragmentSubcomponentImpl implements HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent {
            private WithdrawCashFragmentSubcomponentImpl(WithdrawCashFragment withdrawCashFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private WithdrawCashFragment injectWithdrawCashFragment(WithdrawCashFragment withdrawCashFragment) {
                HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesFrequentlyUsedSharedPrefsProvider;
                Object $r5 = $r4.get();
                SharedPreferences $r6 = (SharedPreferences) $r5;
                WithdrawCashFragment_MembersInjector.injectSharedPreferences(withdrawCashFragment, $r6);
                return withdrawCashFragment;
            }

            public void inject(WithdrawCashFragment withdrawCashFragment) {
                injectWithdrawCashFragment(withdrawCashFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                WithdrawCashFragment $r2 = (WithdrawCashFragment) obj;
                inject($r2);
            }
        }

        private HomeActivitySubcomponentImpl(HomeActivity homeActivity) {
            this.arg0 = homeActivity;
            initialize(homeActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DispatchingAndroidInjector dispatchingAndroidInjectorOfObject() {
            Map $r1 = mapOfClassOfAndProviderOfAndroidInjectorFactoryOf();
            Map $r2 = AbstractC5077j.m25724l();
            Map r4 = $r2;
            DispatchingAndroidInjector $r3 = C7428c.m18754a($r1, r4);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchMiniMonnifyDetails fetchMiniMonnifyDetails() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            FetchMiniMonnifyDetails $r1 = new FetchMiniMonnifyDetails($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchNotificationCount fetchNotificationCount() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchNotificationCount $r1 = new FetchNotificationCount($r2);
            return $r1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public FetchTodo fetchTodo() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchTodo $r1 = new FetchTodo($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchWallet fetchWallet() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchWallet $r1 = new FetchWallet($r2);
            return $r1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public HomePresenter homePresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            FetchMiniMonnifyDetails $r5 = fetchMiniMonnifyDetails();
            FetchNotificationCount $r6 = fetchNotificationCount();
            FetchWallet $r7 = fetchWallet();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r8 = $r32.analytics();
            FetchTodo $r9 = fetchTodo();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            RegisterFcm $r10 = $r33.registerFcm();
            VerifyId $r11 = verifyId();
            SmartLookAnalytics $r1 = new SmartLookAnalytics();
            DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
            InsuranceRequests $r12 = $r34.insuranceRequests();
            DaggerApplicationComponent $r35 = DaggerApplicationComponent.this;
            UserRepository $r13 = $r35.userRepository();
            UpdateUser $r14 = updateUser();
            DaggerApplicationComponent $r36 = DaggerApplicationComponent.this;
            InterfaceC11700a $r15 = $r36.providesFrequentlyUsedSharedPrefsProvider;
            Object $r16 = $r15.get();
            SharedPreferences $r17 = (SharedPreferences) $r16;
            HomePresenter $r2 = new HomePresenter($r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r1, $r12, $r13, $r14, $r17);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private void initialize(HomeActivity homeActivity) {
            this.homeFragmentSubcomponentFactoryProvider = new InterfaceC11700a<HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent.Factory get() {
                    HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                    HomeFragmentSubcomponentFactory $r1 = new HomeFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent.Factory get2() {
                    HomeActivityModule_InjectHomeFragment.HomeFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.filterTransactionsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent.Factory get() {
                    HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                    FilterTransactionsFragmentSubcomponentFactory $r1 = new FilterTransactionsFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent.Factory get2() {
                    HomeActivityModule_InjectFilterTransactionsFragment.FilterTransactionsFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.dashboardFragmentSubcomponentFactoryProvider = new InterfaceC11700a<HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent.Factory get() {
                    HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                    DashboardFragmentSubcomponentFactory $r1 = new DashboardFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent.Factory get2() {
                    HomeActivityModule_InjectDashboardFragment.DashboardFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.withdrawCashFragmentSubcomponentFactoryProvider = new InterfaceC11700a<HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent.Factory get() {
                    HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                    WithdrawCashFragmentSubcomponentFactory $r1 = new WithdrawCashFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent.Factory get2() {
                    HomeActivityModule_InjectWithdrawCashFragment.WithdrawCashFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.issueResolutionHostFragmentSubcomponentFactoryProvider = new InterfaceC11700a<HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent.Factory get() {
                    HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                    IssueResolutionHostFragmentSubcomponentFactory $r1 = new IssueResolutionHostFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent.Factory get2() {
                    HomeActivityModule_InjectIssueResolutionHostFragment.IssueResolutionHostFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.issueHistoryFragmentSubcomponentFactoryProvider = new InterfaceC11700a<HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.6
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory get() {
                    HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                    HAM_IIHF_IssueHistoryFragmentSubcomponentFactory $r1 = new HAM_IIHF_IssueHistoryFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory get2() {
                    HomeActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.transactionsContainerFragmentSubcomponentFactoryProvider = new InterfaceC11700a<HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.7
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent.Factory get() {
                    HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                    TransactionsContainerFragmentSubcomponentFactory $r1 = new TransactionsContainerFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent.Factory get2() {
                    HomeActivityModule_InjectTransactionsContainerFragment.TransactionsContainerFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.bvnHomeUpdateFragmentSubcomponentFactoryProvider = new InterfaceC11700a<HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.HomeActivitySubcomponentImpl.8
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent.Factory get() {
                    HomeActivitySubcomponentImpl $r2 = HomeActivitySubcomponentImpl.this;
                    BvnHomeUpdateFragmentSubcomponentFactory $r1 = new BvnHomeUpdateFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent.Factory get2() {
                    HomeActivityModule_InjectBvnVerificationFragment.BvnHomeUpdateFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private HomeActivity injectHomeActivity(HomeActivity homeActivity) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesSharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            HomeActivity_MembersInjector.injectSharedPref(homeActivity, $r5);
            HomePresenter $r6 = homePresenter();
            HomeActivity_MembersInjector.injectThisPresenter(homeActivity, $r6);
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            CacheModule $r7 = $r22.cacheModule;
            Pref $r8 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r7);
            HomeActivity_MembersInjector.injectPref(homeActivity, $r8);
            DispatchingAndroidInjector $r9 = dispatchingAndroidInjectorOfObject();
            HomeActivity_MembersInjector.injectAndroidInjector(homeActivity, $r9);
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            InterfaceC11700a $r32 = $r23.providesFrequentlyUsedSharedPrefsProvider;
            Object $r42 = $r32.get();
            SharedPreferences $r52 = (SharedPreferences) $r42;
            HomeActivity_MembersInjector.injectSharedPreferences(homeActivity, $r52);
            SmartLookAnalytics $r10 = new SmartLookAnalytics();
            HomeActivity_MembersInjector.injectSmartLookAnalytics(homeActivity, $r10);
            return homeActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private Map mapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
            AbstractC5077j.C5078a $r1 = AbstractC5077j.m25729a(18);
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.productActivitySubcomponentFactoryProvider;
            $r1.m25720c(ProductActivity.class, $r3);
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            InterfaceC11700a $r32 = $r22.issueActivitySubcomponentFactoryProvider;
            $r1.m25720c(IssueActivity.class, $r32);
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            InterfaceC11700a $r33 = $r23.homeActivitySubcomponentFactoryProvider;
            $r1.m25720c(HomeActivity.class, $r33);
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            InterfaceC11700a $r34 = $r24.kShockActivitySubcomponentFactoryProvider;
            $r1.m25720c(KShockActivity.class, $r34);
            DaggerApplicationComponent $r25 = DaggerApplicationComponent.this;
            InterfaceC11700a $r35 = $r25.savingsActivitySubcomponentFactoryProvider;
            $r1.m25720c(SavingsActivity.class, $r35);
            DaggerApplicationComponent $r26 = DaggerApplicationComponent.this;
            InterfaceC11700a $r36 = $r26.banksFragmentSubcomponentFactoryProvider;
            $r1.m25720c(BanksFragment.class, $r36);
            DaggerApplicationComponent $r27 = DaggerApplicationComponent.this;
            InterfaceC11700a $r37 = $r27.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssuesTermsAndConditionsFragment.class, $r37);
            DaggerApplicationComponent $r28 = DaggerApplicationComponent.this;
            InterfaceC11700a $r38 = $r28.kudiPinSubcomponentFactoryProvider;
            $r1.m25720c(KudiPin.class, $r38);
            DaggerApplicationComponent $r29 = DaggerApplicationComponent.this;
            InterfaceC11700a $r39 = $r29.f201x23c522c6;
            $r1.m25720c(SendReceiptToTerminalConfirmationBottomSheet.class, $r39);
            DaggerApplicationComponent $r210 = DaggerApplicationComponent.this;
            InterfaceC11700a $r310 = $r210.picturePickerFragmentSubcomponentFactoryProvider;
            $r1.m25720c(PicturePickerFragment.class, $r310);
            InterfaceC11700a $r311 = this.homeFragmentSubcomponentFactoryProvider;
            $r1.m25720c(HomeFragment.class, $r311);
            InterfaceC11700a $r312 = this.filterTransactionsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(FilterTransactionsFragment.class, $r312);
            InterfaceC11700a $r313 = this.dashboardFragmentSubcomponentFactoryProvider;
            $r1.m25720c(ai.kudi.agent.dashboard.ui.DashboardFragment.class, $r313);
            InterfaceC11700a $r314 = this.withdrawCashFragmentSubcomponentFactoryProvider;
            $r1.m25720c(WithdrawCashFragment.class, $r314);
            InterfaceC11700a $r315 = this.issueResolutionHostFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssueResolutionHostFragment.class, $r315);
            InterfaceC11700a $r316 = this.issueHistoryFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssueHistoryFragment.class, $r316);
            InterfaceC11700a $r317 = this.transactionsContainerFragmentSubcomponentFactoryProvider;
            $r1.m25720c(TransactionsContainerFragment.class, $r317);
            InterfaceC11700a $r318 = this.bvnHomeUpdateFragmentSubcomponentFactoryProvider;
            $r1.m25720c(BvnHomeUpdateFragment.class, $r318);
            Map $r4 = $r1.m25722a();
            Map r5 = $r4;
            return r5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public TransactionsNavigator transactionsNavigator() {
            HomeActivity $r2 = this.arg0;
            TransactionsNavigator $r1 = C0190x54dbc472.providesTransactionsNavigator($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpdateUser updateUser() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            UserRepository $r3 = $r4.userRepository();
            RxSchedulers $r2 = new RxSchedulers();
            UpdateUser $r1 = new UpdateUser($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyId verifyId() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            VerifyId $r1 = new VerifyId($r2);
            return $r1;
        }

        public void inject(HomeActivity homeActivity) {
            injectHomeActivity(homeActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            HomeActivity $r2 = (HomeActivity) obj;
            inject($r2);
        }
    }

    /* loaded from: classes.dex */
    final class InboxSubComponentFactory implements InboxSubComponent.Factory {
        private InboxSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.inbox.game.components.InboxSubComponent.Factory
        public InboxSubComponent create(InboxNavigator inboxNavigator) {
            C9473g.m14650b(inboxNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InboxSubComponentImpl $r2 = new InboxSubComponentImpl(inboxNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class InboxSubComponentImpl implements InboxSubComponent {
        private final InboxNavigator inboxNavigator;

        private InboxSubComponentImpl(InboxNavigator inboxNavigator) {
            this.inboxNavigator = inboxNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DisputePresenter disputePresenter() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchTransaction $r3 = $r2.fetchTransaction();
            FetchTicket $r4 = fetchTicket();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r22.fetchCurrentUser();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            Analytics $r6 = $r23.analytics();
            DisputePresenter $r1 = new DisputePresenter($r3, $r4, $r5, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchTicket fetchTicket() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesIssuesApiServiceProvider;
            Object $r4 = $r3.get();
            IssuesApiService $r5 = (IssuesApiService) $r4;
            FetchTicket $r1 = new FetchTicket($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchTickets fetchTickets() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesIssuesApiServiceProvider;
            Object $r4 = $r3.get();
            IssuesApiService $r5 = (IssuesApiService) $r4;
            FetchTickets $r1 = new FetchTickets($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private InboxListPresenter inboxListPresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            FetchTickets $r5 = fetchTickets();
            InboxNavigator $r2 = this.inboxNavigator;
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r6 = $r32.analytics();
            InboxListPresenter $r1 = new InboxListPresenter($r4, $r5, $r2, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DisputeIssueFragment injectDisputeIssueFragment(DisputeIssueFragment disputeIssueFragment) {
            DisputePresenter $r2 = disputePresenter();
            DisputeIssueFragment_MembersInjector.injectThisPresenter(disputeIssueFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesGlobalNavigatorProvider;
            Object $r5 = $r4.get();
            GlobalNavigator $r6 = (GlobalNavigator) $r5;
            DisputeIssueFragment_MembersInjector.injectGlobalNavigator(disputeIssueFragment, $r6);
            return disputeIssueFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private InboxActivity injectInboxActivity(InboxActivity inboxActivity) {
            InboxContainerPresenter $r2 = new InboxContainerPresenter();
            InboxActivity_MembersInjector.injectThisPresenter(inboxActivity, $r2);
            return inboxActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private InboxIssueListFragment injectInboxIssueListFragment(InboxIssueListFragment inboxIssueListFragment) {
            InboxListPresenter $r2 = inboxListPresenter();
            InboxIssueListFragment_MembersInjector.injectThisPresenter(inboxIssueListFragment, $r2);
            return inboxIssueListFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RatingDialog injectRatingDialog(RatingDialog ratingDialog) {
            RatingViewModel $r2 = ratingViewModel();
            RatingDialog_MembersInjector.injectIssueRatingViewModel(ratingDialog, $r2);
            return ratingDialog;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RateIssue rateIssue() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesIssuesApiServiceProvider;
            Object $r4 = $r3.get();
            IssuesApiService $r5 = (IssuesApiService) $r4;
            RateIssue $r1 = new RateIssue($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RatingViewModel ratingViewModel() {
            RateIssue $r2 = rateIssue();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            RatingViewModel $r1 = new RatingViewModel($r2, $r4, $r5);
            return $r1;
        }

        @Override // ai.kudi.agent.inbox.game.components.InboxSubComponent
        public void inject(InboxActivity inboxActivity) {
            injectInboxActivity(inboxActivity);
        }

        @Override // ai.kudi.agent.inbox.game.components.InboxSubComponent
        public void inject(InboxIssueListFragment inboxIssueListFragment) {
            injectInboxIssueListFragment(inboxIssueListFragment);
        }

        @Override // ai.kudi.agent.inbox.game.components.InboxSubComponent
        public void inject(DisputeIssueFragment disputeIssueFragment) {
            injectDisputeIssueFragment(disputeIssueFragment);
        }

        @Override // ai.kudi.agent.inbox.game.components.InboxSubComponent
        public void inject(RatingDialog ratingDialog) {
            injectRatingDialog(ratingDialog);
        }
    }

    /* loaded from: classes.dex */
    final class IncompleteTransactionsSubComponentFactory implements IncompleteTransactionsSubComponent.Factory {
        private IncompleteTransactionsSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.transactionhistory.labs.IncompleteTransactionsSubComponent.Factory
        public IncompleteTransactionsSubComponent create(PendingTransactionsNavigator pendingTransactionsNavigator) {
            C9473g.m14650b(pendingTransactionsNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            IncompleteTransactionsSubComponentImpl $r2 = new IncompleteTransactionsSubComponentImpl(pendingTransactionsNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class IncompleteTransactionsSubComponentImpl implements IncompleteTransactionsSubComponent {
        private final PendingTransactionsNavigator pendingTransactionsNavigator;

        private IncompleteTransactionsSubComponentImpl(PendingTransactionsNavigator pendingTransactionsNavigator) {
            this.pendingTransactionsNavigator = pendingTransactionsNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchOutletTransactions fetchOutletTransactions() {
            TransactionsRepository $r2 = transactionsRepository();
            FetchOutletTransactions $r1 = new FetchOutletTransactions($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetTransactionHistoryUseCase getTransactionHistoryUseCase() {
            TransactionsRepository $r3 = transactionsRepository();
            RxSchedulers $r2 = new RxSchedulers();
            GetTransactionHistoryUseCase $r1 = new GetTransactionHistoryUseCase($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingFraudCheckTransactionsFragment injectPendingFraudCheckTransactionsFragment(PendingFraudCheckTransactionsFragment pendingFraudCheckTransactionsFragment) {
            PendingFraudCheckTransactionsViewModel $r2 = pendingFraudCheckTransactionsViewModel();
            PendingFraudCheckTransactionsFragment_MembersInjector.injectViewModel(pendingFraudCheckTransactionsFragment, $r2);
            return pendingFraudCheckTransactionsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingFraudCheckTransactionsViewModel pendingFraudCheckTransactionsViewModel() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            GetTransactionHistoryUseCase $r6 = getTransactionHistoryUseCase();
            FetchOutletTransactions $r7 = fetchOutletTransactions();
            TransactionDataToUiMapper $r1 = new TransactionDataToUiMapper();
            ServerTimeToTransactionDayMapper $r8 = serverTimeToTransactionDayMapper();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            CacheModule $r9 = $r42.cacheModule;
            Pref $r10 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r9);
            PendingTransactionsNavigator $r2 = this.pendingTransactionsNavigator;
            PendingFraudCheckTransactionsViewModel $r3 = new PendingFraudCheckTransactionsViewModel($r5, $r6, $r7, $r1, $r8, $r10, $r2);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper() {
            ResourceDelegate $r2 = resourceDelegate();
            ServerTimeToTransactionDayMapper $r1 = new ServerTimeToTransactionDayMapper($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionsRepository transactionsRepository() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            TransactionsRemoteSource $r4 = $r3.transactionsRemoteSource();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            TransactionsLocalSource $r5 = $r32.transactionsLocalSource();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            TransactionsSummaryLocalSource $r6 = $r33.transactionsSummaryLocalSource();
            RxSchedulers $r2 = new RxSchedulers();
            TransactionsRepository $r1 = new TransactionsRepository($r4, $r5, $r6, $r2);
            return $r1;
        }

        @Override // ai.kudi.agent.transactionhistory.labs.IncompleteTransactionsSubComponent
        public void inject(PendingFraudCheckTransactionsFragment pendingFraudCheckTransactionsFragment) {
            injectPendingFraudCheckTransactionsFragment(pendingFraudCheckTransactionsFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class IssueActivitySubcomponentFactory implements ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent.Factory {
        private IssueActivitySubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent create(IssueActivity issueActivity) {
            C9473g.m14650b(issueActivity);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            IssueActivitySubcomponentImpl $r2 = new IssueActivitySubcomponentImpl(issueActivity);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            IssueActivity $r3 = (IssueActivity) obj;
            ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class IssueActivitySubcomponentImpl implements ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent {
        private final IssueActivity arg0;
        private InterfaceC11700a<IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent.Factory> contactUsFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent.Factory> customerDetailsIssueFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent.Factory> delayedKTAtopUpFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent.Factory> disputeIssueFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent.Factory> issueDetailFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory> issueHistoryFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent.Factory> issueResolutionFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent.Factory> issueSummaryFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory> issueTypeFragmentNewSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent.Factory> issueTypeFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent.Factory> kYCformIssueFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent.Factory> posIssueFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent.Factory> posTerminalIssuesFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent.Factory> ratingDialogSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent.Factory> submitWithdrawalIssueFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent.Factory> supportIssueFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent.Factory> transactionListFragmentSubcomponentFactoryProvider;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ContactUsFragmentSubcomponentFactory implements IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent.Factory {
            private ContactUsFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent create(ContactUsFragment contactUsFragment) {
                C9473g.m14650b(contactUsFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                ContactUsFragmentSubcomponentImpl $r2 = new ContactUsFragmentSubcomponentImpl(contactUsFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                ContactUsFragment $r3 = (ContactUsFragment) obj;
                IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ContactUsFragmentSubcomponentImpl implements IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent {
            private ContactUsFragmentSubcomponentImpl(ContactUsFragment contactUsFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ContactUsViewModel contactUsViewModel() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                Analytics $r5 = $r32.analytics();
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r6 = $r23.arg0;
                ContactUsViewModel $r1 = new ContactUsViewModel($r4, $r5, $r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ContactUsFragment injectContactUsFragment(ContactUsFragment contactUsFragment) {
                ContactUsViewModel $r2 = contactUsViewModel();
                ContactUsFragment_MembersInjector.injectScreenViewModel(contactUsFragment, $r2);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                InterfaceC11700a $r5 = $r4.provideFirebaseConfigProvider;
                Object $r6 = $r5.get();
                Frame $r7 = (Frame) $r6;
                ContactUsFragment_MembersInjector.injectRemoteConfig(contactUsFragment, $r7);
                return contactUsFragment;
            }

            public void inject(ContactUsFragment contactUsFragment) {
                injectContactUsFragment(contactUsFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                ContactUsFragment $r2 = (ContactUsFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class CustomerDetailsIssueFragmentSubcomponentFactory implements IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent.Factory {
            private CustomerDetailsIssueFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent create(CustomerDetailsIssueFragment customerDetailsIssueFragment) {
                C9473g.m14650b(customerDetailsIssueFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                CustomerDetailsIssueFragmentSubcomponentImpl $r2 = new CustomerDetailsIssueFragmentSubcomponentImpl(customerDetailsIssueFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                CustomerDetailsIssueFragment $r3 = (CustomerDetailsIssueFragment) obj;
                IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class CustomerDetailsIssueFragmentSubcomponentImpl implements IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent {
            private CustomerDetailsIssueFragmentSubcomponentImpl(CustomerDetailsIssueFragment customerDetailsIssueFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CustomerDetailsIssueViewModel customerDetailsIssueViewModel() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r3 = $r2.arg0;
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                AccountLookup $r5 = $r4.accountLookup();
                CustomerDetailsIssueViewModel $r1 = new CustomerDetailsIssueViewModel($r3, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CustomerDetailsIssueFragment injectCustomerDetailsIssueFragment(CustomerDetailsIssueFragment customerDetailsIssueFragment) {
                CustomerDetailsIssueViewModel $r2 = customerDetailsIssueViewModel();
                CustomerDetailsIssueFragment_MembersInjector.injectCustomerDetailsIssueViewModel(customerDetailsIssueFragment, $r2);
                return customerDetailsIssueFragment;
            }

            public void inject(CustomerDetailsIssueFragment customerDetailsIssueFragment) {
                injectCustomerDetailsIssueFragment(customerDetailsIssueFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                CustomerDetailsIssueFragment $r2 = (CustomerDetailsIssueFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class DelayedKTAtopUpFragmentSubcomponentFactory implements IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent.Factory {
            private DelayedKTAtopUpFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent create(DelayedKTAtopUpFragment delayedKTAtopUpFragment) {
                C9473g.m14650b(delayedKTAtopUpFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DelayedKTAtopUpFragmentSubcomponentImpl $r2 = new DelayedKTAtopUpFragmentSubcomponentImpl(delayedKTAtopUpFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                DelayedKTAtopUpFragment $r3 = (DelayedKTAtopUpFragment) obj;
                IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class DelayedKTAtopUpFragmentSubcomponentImpl implements IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent {
            private DelayedKTAtopUpFragmentSubcomponentImpl(DelayedKTAtopUpFragment delayedKTAtopUpFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DelayedKTAViewModel delayedKTAViewModel() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                CheckPermission $r4 = $r3.namedCheckPermission();
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r5 = $r22.arg0;
                DelayedKTAViewModel $r1 = new DelayedKTAViewModel($r4, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DelayedKTAtopUpFragment injectDelayedKTAtopUpFragment(DelayedKTAtopUpFragment delayedKTAtopUpFragment) {
                DelayedKTAViewModel $r2 = delayedKTAViewModel();
                DelayedKTAtopUpFragment_MembersInjector.injectDelayedKTAViewModel(delayedKTAtopUpFragment, $r2);
                return delayedKTAtopUpFragment;
            }

            public void inject(DelayedKTAtopUpFragment delayedKTAtopUpFragment) {
                injectDelayedKTAtopUpFragment(delayedKTAtopUpFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                DelayedKTAtopUpFragment $r2 = (DelayedKTAtopUpFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class DisputeIssueFragmentSubcomponentFactory implements IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent.Factory {
            private DisputeIssueFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent create(DisputeIssueFragment disputeIssueFragment) {
                C9473g.m14650b(disputeIssueFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DisputeIssueFragmentSubcomponentImpl $r2 = new DisputeIssueFragmentSubcomponentImpl(disputeIssueFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                DisputeIssueFragment $r3 = (DisputeIssueFragment) obj;
                IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class DisputeIssueFragmentSubcomponentImpl implements IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent {
            private DisputeIssueFragmentSubcomponentImpl(DisputeIssueFragment disputeIssueFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DisputePresenter disputePresenter() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchTransaction $r4 = $r3.fetchTransaction();
                FetchTicket $r5 = fetchTicket();
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r32.fetchCurrentUser();
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
                Analytics $r7 = $r33.analytics();
                DisputePresenter $r1 = new DisputePresenter($r4, $r5, $r6, $r7);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchTicket fetchTicket() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesIssuesApiServiceProvider;
                Object $r5 = $r4.get();
                IssuesApiService $r6 = (IssuesApiService) $r5;
                FetchTicket $r1 = new FetchTicket($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DisputeIssueFragment injectDisputeIssueFragment(DisputeIssueFragment disputeIssueFragment) {
                DisputePresenter $r2 = disputePresenter();
                DisputeIssueFragment_MembersInjector.injectThisPresenter(disputeIssueFragment, $r2);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                InterfaceC11700a $r5 = $r4.providesGlobalNavigatorProvider;
                Object $r6 = $r5.get();
                GlobalNavigator $r7 = (GlobalNavigator) $r6;
                DisputeIssueFragment_MembersInjector.injectGlobalNavigator(disputeIssueFragment, $r7);
                return disputeIssueFragment;
            }

            public void inject(DisputeIssueFragment disputeIssueFragment) {
                injectDisputeIssueFragment(disputeIssueFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                DisputeIssueFragment $r2 = (DisputeIssueFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IAM_IIHF_IssueHistoryFragmentSubcomponentFactory implements IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory {
            private IAM_IIHF_IssueHistoryFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent create(IssueHistoryFragment issueHistoryFragment) {
                C9473g.m14650b(issueHistoryFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                IAM_IIHF_IssueHistoryFragmentSubcomponentImpl $r2 = new IAM_IIHF_IssueHistoryFragmentSubcomponentImpl(issueHistoryFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                IssueHistoryFragment $r3 = (IssueHistoryFragment) obj;
                IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IAM_IIHF_IssueHistoryFragmentSubcomponentImpl implements IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent {
            private IAM_IIHF_IssueHistoryFragmentSubcomponentImpl(IssueHistoryFragment issueHistoryFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchTickets fetchTickets() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesIssuesApiServiceProvider;
                Object $r5 = $r4.get();
                IssuesApiService $r6 = (IssuesApiService) $r5;
                FetchTickets $r1 = new FetchTickets($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueHistoryFragment injectIssueHistoryFragment(IssueHistoryFragment issueHistoryFragment) {
                IssueHistoryPresenter $r2 = issueHistoryPresenter();
                IssueHistoryFragment_MembersInjector.injectIssueHistoryPresenter(issueHistoryFragment, $r2);
                return issueHistoryFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueHistoryPresenter issueHistoryPresenter() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                FetchTickets $r5 = fetchTickets();
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r6 = $r22.arg0;
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                Analytics $r7 = $r32.analytics();
                IssueHistoryPresenter $r1 = new IssueHistoryPresenter($r4, $r5, $r6, $r7);
                return $r1;
            }

            public void inject(IssueHistoryFragment issueHistoryFragment) {
                injectIssueHistoryFragment(issueHistoryFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                IssueHistoryFragment $r2 = (IssueHistoryFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IAM_IITFN_IssueTypeFragmentNewSubcomponentFactory implements IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory {
            private IAM_IITFN_IssueTypeFragmentNewSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent create(IssueTypeFragmentNew issueTypeFragmentNew) {
                C9473g.m14650b(issueTypeFragmentNew);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                IAM_IITFN_IssueTypeFragmentNewSubcomponentImpl $r2 = new IAM_IITFN_IssueTypeFragmentNewSubcomponentImpl(issueTypeFragmentNew);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                IssueTypeFragmentNew $r3 = (IssueTypeFragmentNew) obj;
                IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IAM_IITFN_IssueTypeFragmentNewSubcomponentImpl implements IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent {
            private IAM_IITFN_IssueTypeFragmentNewSubcomponentImpl(IssueTypeFragmentNew issueTypeFragmentNew) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchIssueCategories fetchIssueCategories() {
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                IssueRepository $r2 = $r4.issueRepository();
                FetchIssueCategories $r1 = new FetchIssueCategories($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueTypeFragmentNew injectIssueTypeFragmentNew(IssueTypeFragmentNew issueTypeFragmentNew) {
                IssueTypeViewModel $r2 = issueTypeViewModel();
                IssueTypeFragmentNew_MembersInjector.injectIssueTypeViewModel(issueTypeFragmentNew, $r2);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                InterfaceC11700a $r5 = $r4.providesFrequentlyUsedSharedPrefsProvider;
                Object $r6 = $r5.get();
                SharedPreferences $r7 = (SharedPreferences) $r6;
                IssueTypeFragmentNew_MembersInjector.injectSharedPreferences(issueTypeFragmentNew, $r7);
                return issueTypeFragmentNew;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueTypeViewModel issueTypeViewModel() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r3 = $r2.arg0;
                FetchIssueCategories $r4 = fetchIssueCategories();
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r52 = DaggerApplicationComponent.this;
                Analytics $r7 = $r52.analytics();
                IssueTypeViewModel $r1 = new IssueTypeViewModel($r3, $r4, $r6, $r7);
                return $r1;
            }

            public void inject(IssueTypeFragmentNew issueTypeFragmentNew) {
                injectIssueTypeFragmentNew(issueTypeFragmentNew);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                IssueTypeFragmentNew $r2 = (IssueTypeFragmentNew) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueDetailFragmentSubcomponentFactory implements IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent.Factory {
            private IssueDetailFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent create(IssueDetailFragment issueDetailFragment) {
                C9473g.m14650b(issueDetailFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                IssueDetailFragmentSubcomponentImpl $r2 = new IssueDetailFragmentSubcomponentImpl(issueDetailFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                IssueDetailFragment $r3 = (IssueDetailFragment) obj;
                IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueDetailFragmentSubcomponentImpl implements IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent {
            private IssueDetailFragmentSubcomponentImpl(IssueDetailFragment issueDetailFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchIssueCategories fetchIssueCategories() {
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                IssueRepository $r2 = $r4.issueRepository();
                FetchIssueCategories $r1 = new FetchIssueCategories($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueDetailFragment injectIssueDetailFragment(IssueDetailFragment issueDetailFragment) {
                IssueDetailsViewModel $r2 = issueDetailsViewModel();
                IssueDetailFragment_MembersInjector.injectIssueDetailsViewModel(issueDetailFragment, $r2);
                return issueDetailFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueDetailsViewModel issueDetailsViewModel() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r3 = $r2.arg0;
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r5 = $r4.analytics();
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r42.fetchCurrentUser();
                FetchIssueCategories $r7 = fetchIssueCategories();
                IssueActivitySubcomponentImpl $r24 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                InterfaceC11700a $r8 = $r43.provideFirebaseConfigProvider;
                Object $r9 = $r8.get();
                IssueDetailsViewModel $r1 = new IssueDetailsViewModel($r3, $r5, $r6, $r7, (Frame) $r9);
                return $r1;
            }

            public void inject(IssueDetailFragment issueDetailFragment) {
                injectIssueDetailFragment(issueDetailFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                IssueDetailFragment $r2 = (IssueDetailFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueResolutionFragmentSubcomponentFactory implements IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent.Factory {
            private IssueResolutionFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent create(IssueResolutionFragment issueResolutionFragment) {
                C9473g.m14650b(issueResolutionFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                IssueResolutionFragmentSubcomponentImpl $r2 = new IssueResolutionFragmentSubcomponentImpl(issueResolutionFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                IssueResolutionFragment $r3 = (IssueResolutionFragment) obj;
                IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueResolutionFragmentSubcomponentImpl implements IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent {
            private IssueResolutionFragmentSubcomponentImpl(IssueResolutionFragment issueResolutionFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueResolutionFragment injectIssueResolutionFragment(IssueResolutionFragment issueResolutionFragment) {
                IssueResolutionFragmentPresenter $r2 = issueResolutionFragmentPresenter();
                IssueResolutionFragment_MembersInjector.injectThisPresenter(issueResolutionFragment, $r2);
                return issueResolutionFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueResolutionFragmentPresenter issueResolutionFragmentPresenter() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                CheckPermission $r4 = $r3.namedCheckPermission();
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r32.fetchCurrentUser();
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
                Analytics $r6 = $r33.analytics();
                IssueActivitySubcomponentImpl $r24 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r7 = $r24.arg0;
                IssueResolutionFragmentPresenter $r1 = new IssueResolutionFragmentPresenter($r4, $r5, $r6, $r7);
                return $r1;
            }

            public void inject(IssueResolutionFragment issueResolutionFragment) {
                injectIssueResolutionFragment(issueResolutionFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                IssueResolutionFragment $r2 = (IssueResolutionFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueSummaryFragmentSubcomponentFactory implements IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent.Factory {
            private IssueSummaryFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent create(IssueSummaryFragment issueSummaryFragment) {
                C9473g.m14650b(issueSummaryFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                IssueSummaryFragmentSubcomponentImpl $r2 = new IssueSummaryFragmentSubcomponentImpl(issueSummaryFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                IssueSummaryFragment $r3 = (IssueSummaryFragment) obj;
                IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueSummaryFragmentSubcomponentImpl implements IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent {
            private IssueSummaryFragmentSubcomponentImpl(IssueSummaryFragment issueSummaryFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private AttachImage attachImage() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesCoreApiServiceProvider;
                Object $r5 = $r4.get();
                CoreApiService $r6 = (CoreApiService) $r5;
                AttachImage $r1 = new AttachImage($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateTicket createTicket() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesIssuesApiServiceProvider;
                Object $r5 = $r4.get();
                IssuesApiService $r6 = (IssuesApiService) $r5;
                CreateTicket $r1 = new CreateTicket($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueSummaryFragment injectIssueSummaryFragment(IssueSummaryFragment issueSummaryFragment) {
                SubmitIssuePresenter $r2 = submitIssuePresenter();
                IssueSummaryFragment_MembersInjector.injectSubmitIssuePresenter(issueSummaryFragment, $r2);
                return issueSummaryFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SubmitIssuePresenter submitIssuePresenter() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r3 = $r2.arg0;
                CreateTicket $r4 = createTicket();
                AttachImage $r5 = attachImage();
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r6 = DaggerApplicationComponent.this;
                FetchCurrentUser $r7 = $r6.fetchCurrentUser();
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r62 = DaggerApplicationComponent.this;
                MultiPartFileHandlingModule $r8 = $r62.multiPartFileHandlingModule;
                MultiPartFileHandling $r9 = MultiPartFileHandlingModule_ProvidesMultiPartFileHandlingFactory.providesMultiPartFileHandling($r8);
                IssueActivitySubcomponentImpl $r24 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r63 = DaggerApplicationComponent.this;
                Analytics $r10 = $r63.analytics();
                SubmitIssuePresenter $r1 = new SubmitIssuePresenter($r3, $r4, $r5, $r7, $r9, $r10);
                return $r1;
            }

            public void inject(IssueSummaryFragment issueSummaryFragment) {
                injectIssueSummaryFragment(issueSummaryFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                IssueSummaryFragment $r2 = (IssueSummaryFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueTypeFragmentSubcomponentFactory implements IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent.Factory {
            private IssueTypeFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent create(IssueTypeFragment issueTypeFragment) {
                C9473g.m14650b(issueTypeFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                IssueTypeFragmentSubcomponentImpl $r2 = new IssueTypeFragmentSubcomponentImpl(issueTypeFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                IssueTypeFragment $r3 = (IssueTypeFragment) obj;
                IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class IssueTypeFragmentSubcomponentImpl implements IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent {
            private IssueTypeFragmentSubcomponentImpl(IssueTypeFragment issueTypeFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private IssueTypeFragment injectIssueTypeFragment(IssueTypeFragment issueTypeFragment) {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesGlobalNavigatorProvider;
                Object $r5 = $r4.get();
                GlobalNavigator $r6 = (GlobalNavigator) $r5;
                IssueTypeFragment_MembersInjector.injectGlobalNavigator(issueTypeFragment, $r6);
                return issueTypeFragment;
            }

            public void inject(IssueTypeFragment issueTypeFragment) {
                injectIssueTypeFragment(issueTypeFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                IssueTypeFragment $r2 = (IssueTypeFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KYCformIssueFragmentSubcomponentFactory implements IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent.Factory {
            private KYCformIssueFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent create(KYCformIssueFragment kYCformIssueFragment) {
                C9473g.m14650b(kYCformIssueFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                KYCformIssueFragmentSubcomponentImpl $r2 = new KYCformIssueFragmentSubcomponentImpl(kYCformIssueFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KYCformIssueFragment $r3 = (KYCformIssueFragment) obj;
                IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KYCformIssueFragmentSubcomponentImpl implements IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent {
            private KYCformIssueFragmentSubcomponentImpl(KYCformIssueFragment kYCformIssueFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KYCformIssueFragment injectKYCformIssueFragment(KYCformIssueFragment kYCformIssueFragment) {
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r2 = $r4.analytics();
                KYCformIssueFragment_MembersInjector.injectAnalytics(kYCformIssueFragment, $r2);
                return kYCformIssueFragment;
            }

            public void inject(KYCformIssueFragment kYCformIssueFragment) {
                injectKYCformIssueFragment(kYCformIssueFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KYCformIssueFragment $r2 = (KYCformIssueFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class PosIssueFragmentSubcomponentFactory implements IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent.Factory {
            private PosIssueFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent create(PosIssueFragment posIssueFragment) {
                C9473g.m14650b(posIssueFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                PosIssueFragmentSubcomponentImpl $r2 = new PosIssueFragmentSubcomponentImpl(posIssueFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                PosIssueFragment $r3 = (PosIssueFragment) obj;
                IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class PosIssueFragmentSubcomponentImpl implements IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent {
            private PosIssueFragmentSubcomponentImpl(PosIssueFragment posIssueFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PosIssueFragment injectPosIssueFragment(PosIssueFragment posIssueFragment) {
                PosIssuePresenter $r2 = posIssuePresenter();
                PosIssueFragment_MembersInjector.injectPosIssuePresenter(posIssueFragment, $r2);
                return posIssueFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PosIssuePresenter posIssuePresenter() {
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchIssueType $r2 = $r4.fetchIssueType();
                PosIssuePresenter $r1 = new PosIssuePresenter($r2);
                return $r1;
            }

            public void inject(PosIssueFragment posIssueFragment) {
                injectPosIssueFragment(posIssueFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                PosIssueFragment $r2 = (PosIssueFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class PosTerminalIssuesFragmentSubcomponentFactory implements IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent.Factory {
            private PosTerminalIssuesFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent create(PosTerminalIssuesFragment posTerminalIssuesFragment) {
                C9473g.m14650b(posTerminalIssuesFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                PosTerminalIssuesFragmentSubcomponentImpl $r2 = new PosTerminalIssuesFragmentSubcomponentImpl(posTerminalIssuesFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                PosTerminalIssuesFragment $r3 = (PosTerminalIssuesFragment) obj;
                IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class PosTerminalIssuesFragmentSubcomponentImpl implements IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent {
            private PosTerminalIssuesFragmentSubcomponentImpl(PosTerminalIssuesFragment posTerminalIssuesFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateTicket createTicket() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesIssuesApiServiceProvider;
                Object $r5 = $r4.get();
                IssuesApiService $r6 = (IssuesApiService) $r5;
                CreateTicket $r1 = new CreateTicket($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PosTerminalIssuesFragment injectPosTerminalIssuesFragment(PosTerminalIssuesFragment posTerminalIssuesFragment) {
                PosTerminalIssuesViewModel $r2 = posTerminalIssuesViewModel();
                PosTerminalIssuesFragment_MembersInjector.injectPosTerminalIssuesViewModel(posTerminalIssuesFragment, $r2);
                return posTerminalIssuesFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PosTerminalIssuesViewModel posTerminalIssuesViewModel() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                CreateTicket $r5 = createTicket();
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                Analytics $r6 = $r32.analytics();
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r7 = $r23.arg0;
                PosTerminalIssuesViewModel $r1 = new PosTerminalIssuesViewModel($r4, $r5, $r6, $r7);
                return $r1;
            }

            public void inject(PosTerminalIssuesFragment posTerminalIssuesFragment) {
                injectPosTerminalIssuesFragment(posTerminalIssuesFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                PosTerminalIssuesFragment $r2 = (PosTerminalIssuesFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class RatingDialogSubcomponentFactory implements IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent.Factory {
            private RatingDialogSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent create(RatingDialog ratingDialog) {
                C9473g.m14650b(ratingDialog);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                RatingDialogSubcomponentImpl $r2 = new RatingDialogSubcomponentImpl(ratingDialog);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                RatingDialog $r3 = (RatingDialog) obj;
                IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class RatingDialogSubcomponentImpl implements IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent {
            private RatingDialogSubcomponentImpl(RatingDialog ratingDialog) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private RatingDialog injectRatingDialog(RatingDialog ratingDialog) {
                RatingViewModel $r2 = ratingViewModel();
                RatingDialog_MembersInjector.injectIssueRatingViewModel(ratingDialog, $r2);
                return ratingDialog;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private RateIssue rateIssue() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesIssuesApiServiceProvider;
                Object $r5 = $r4.get();
                IssuesApiService $r6 = (IssuesApiService) $r5;
                RateIssue $r1 = new RateIssue($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private RatingViewModel ratingViewModel() {
                RateIssue $r2 = rateIssue();
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                IssueActivitySubcomponentImpl $r32 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                Analytics $r6 = $r42.analytics();
                RatingViewModel $r1 = new RatingViewModel($r2, $r5, $r6);
                return $r1;
            }

            public void inject(RatingDialog ratingDialog) {
                injectRatingDialog(ratingDialog);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                RatingDialog $r2 = (RatingDialog) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SubmitWithdrawalIssueFragmentSubcomponentFactory implements IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent.Factory {
            private SubmitWithdrawalIssueFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent create(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment) {
                C9473g.m14650b(submitWithdrawalIssueFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                SubmitWithdrawalIssueFragmentSubcomponentImpl $r2 = new SubmitWithdrawalIssueFragmentSubcomponentImpl(submitWithdrawalIssueFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                SubmitWithdrawalIssueFragment $r3 = (SubmitWithdrawalIssueFragment) obj;
                IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SubmitWithdrawalIssueFragmentSubcomponentImpl implements IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent {
            private SubmitWithdrawalIssueFragmentSubcomponentImpl(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateTicket createTicket() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesIssuesApiServiceProvider;
                Object $r5 = $r4.get();
                IssuesApiService $r6 = (IssuesApiService) $r5;
                CreateTicket $r1 = new CreateTicket($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SubmitWithdrawalIssueFragment injectSubmitWithdrawalIssueFragment(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment) {
                SubmitWidthrawalIssueViewModel $r2 = submitWidthrawalIssueViewModel();
                SubmitWithdrawalIssueFragment_MembersInjector.injectSubmitWidthrawalIssueViewModel(submitWithdrawalIssueFragment, $r2);
                return submitWithdrawalIssueFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SubmitWidthrawalIssueViewModel submitWidthrawalIssueViewModel() {
                CreateTicket $r2 = createTicket();
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                IssueActivitySubcomponentImpl $r32 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r6 = $r32.arg0;
                SubmitWidthrawalIssueViewModel $r1 = new SubmitWidthrawalIssueViewModel($r2, $r5, $r6);
                return $r1;
            }

            public void inject(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment) {
                injectSubmitWithdrawalIssueFragment(submitWithdrawalIssueFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                SubmitWithdrawalIssueFragment $r2 = (SubmitWithdrawalIssueFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SupportIssueFragmentSubcomponentFactory implements IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent.Factory {
            private SupportIssueFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent create(SupportIssueFragment supportIssueFragment) {
                C9473g.m14650b(supportIssueFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                SupportIssueFragmentSubcomponentImpl $r2 = new SupportIssueFragmentSubcomponentImpl(supportIssueFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                SupportIssueFragment $r3 = (SupportIssueFragment) obj;
                IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SupportIssueFragmentSubcomponentImpl implements IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent {
            private SupportIssueFragmentSubcomponentImpl(SupportIssueFragment supportIssueFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SupportIssueFragment injectSupportIssueFragment(SupportIssueFragment supportIssueFragment) {
                SupportIssuePresenter $r2 = supportIssuePresenter();
                SupportIssueFragment_MembersInjector.injectThisPresenter(supportIssueFragment, $r2);
                return supportIssueFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SupportIssuePresenter supportIssuePresenter() {
                IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                IssueActivity $r3 = $r2.arg0;
                IssueActivitySubcomponentImpl $r22 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r5 = $r4.analytics();
                IssueActivitySubcomponentImpl $r23 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r42.fetchCurrentUser();
                SupportIssuePresenter $r1 = new SupportIssuePresenter($r3, $r5, $r6);
                return $r1;
            }

            public void inject(SupportIssueFragment supportIssueFragment) {
                injectSupportIssueFragment(supportIssueFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                SupportIssueFragment $r2 = (SupportIssueFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class TransactionListFragmentSubcomponentFactory implements IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent.Factory {
            private TransactionListFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent create(TransactionListFragment transactionListFragment) {
                C9473g.m14650b(transactionListFragment);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                TransactionListFragmentSubcomponentImpl $r2 = new TransactionListFragmentSubcomponentImpl(transactionListFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                TransactionListFragment $r3 = (TransactionListFragment) obj;
                IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class TransactionListFragmentSubcomponentImpl implements IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent {
            private TransactionListFragmentSubcomponentImpl(TransactionListFragment transactionListFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchTransactions fetchTransactions() {
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                TransactionRepository $r2 = $r4.transactionRepository();
                FetchTransactions $r1 = new FetchTransactions($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private TransactionListFragment injectTransactionListFragment(TransactionListFragment transactionListFragment) {
                TransactionListPresenter $r2 = transactionListPresenter();
                TransactionListFragment_MembersInjector.injectThisPresenter(transactionListFragment, $r2);
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                InterfaceC11700a $r5 = $r4.providesGlobalNavigatorProvider;
                Object $r6 = $r5.get();
                GlobalNavigator $r7 = (GlobalNavigator) $r6;
                TransactionListFragment_MembersInjector.injectGlobalNavigator(transactionListFragment, $r7);
                return transactionListFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private TransactionListPresenter transactionListPresenter() {
                FetchTransactions $r2 = fetchTransactions();
                IssueActivitySubcomponentImpl $r3 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                IssueActivitySubcomponentImpl $r32 = IssueActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                Analytics $r6 = $r42.analytics();
                TransactionListPresenter $r1 = new TransactionListPresenter($r2, $r5, $r6);
                return $r1;
            }

            public void inject(TransactionListFragment transactionListFragment) {
                injectTransactionListFragment(transactionListFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                TransactionListFragment $r2 = (TransactionListFragment) obj;
                inject($r2);
            }
        }

        private IssueActivitySubcomponentImpl(IssueActivity issueActivity) {
            this.arg0 = issueActivity;
            initialize(issueActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DispatchingAndroidInjector dispatchingAndroidInjectorOfObject() {
            Map $r1 = mapOfClassOfAndProviderOfAndroidInjectorFactoryOf();
            Map $r2 = AbstractC5077j.m25724l();
            Map r4 = $r2;
            DispatchingAndroidInjector $r3 = C7428c.m18754a($r1, r4);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private void initialize(IssueActivity issueActivity) {
            this.disputeIssueFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    DisputeIssueFragmentSubcomponentFactory $r1 = new DisputeIssueFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectDisputeIssueFragment.DisputeIssueFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.posIssueFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    PosIssueFragmentSubcomponentFactory $r1 = new PosIssueFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectPosIssueFragment.PosIssueFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.issueTypeFragmentNewSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    IAM_IITFN_IssueTypeFragmentNewSubcomponentFactory $r1 = new IAM_IITFN_IssueTypeFragmentNewSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory get2() {
                    IssueActivityModule_InjectIssueTypeFragmentNew.IssueTypeFragmentNewSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.issueDetailFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    IssueDetailFragmentSubcomponentFactory $r1 = new IssueDetailFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectIssueDetailFragment.IssueDetailFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.transactionListFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    TransactionListFragmentSubcomponentFactory $r1 = new TransactionListFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectTransactionListFragment.TransactionListFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.issueResolutionFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.6
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    IssueResolutionFragmentSubcomponentFactory $r1 = new IssueResolutionFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectIssueResolutionFragment.IssueResolutionFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.issueSummaryFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.7
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    IssueSummaryFragmentSubcomponentFactory $r1 = new IssueSummaryFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectIssueSummaryFragment.IssueSummaryFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kYCformIssueFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.8
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    KYCformIssueFragmentSubcomponentFactory $r1 = new KYCformIssueFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectKYCformIssueFragment.KYCformIssueFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.delayedKTAtopUpFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.9
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    DelayedKTAtopUpFragmentSubcomponentFactory $r1 = new DelayedKTAtopUpFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectDelayedKTAtopUpFragment.DelayedKTAtopUpFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.posTerminalIssuesFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.10
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    PosTerminalIssuesFragmentSubcomponentFactory $r1 = new PosTerminalIssuesFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectPosTerminalIssuesFragment.PosTerminalIssuesFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.supportIssueFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.11
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    SupportIssueFragmentSubcomponentFactory $r1 = new SupportIssueFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectSupportIssueFragment.SupportIssueFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.contactUsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.12
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    ContactUsFragmentSubcomponentFactory $r1 = new ContactUsFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectContactUsFragment.ContactUsFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.issueHistoryFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.13
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    IAM_IIHF_IssueHistoryFragmentSubcomponentFactory $r1 = new IAM_IIHF_IssueHistoryFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectIssueHistoryFragment.IssueHistoryFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.ratingDialogSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.14
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    RatingDialogSubcomponentFactory $r1 = new RatingDialogSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent.Factory get2() {
                    IssueActivityModule_InjectRatingDialog.RatingDialogSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.customerDetailsIssueFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.15
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    CustomerDetailsIssueFragmentSubcomponentFactory $r1 = new CustomerDetailsIssueFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectCustomerDetailsIssueFragment.CustomerDetailsIssueFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.submitWithdrawalIssueFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.16
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    SubmitWithdrawalIssueFragmentSubcomponentFactory $r1 = new SubmitWithdrawalIssueFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectSubmitWithdrawalIssueFragment.SubmitWithdrawalIssueFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.issueTypeFragmentSubcomponentFactoryProvider = new InterfaceC11700a<IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.IssueActivitySubcomponentImpl.17
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent.Factory get() {
                    IssueActivitySubcomponentImpl $r2 = IssueActivitySubcomponentImpl.this;
                    IssueTypeFragmentSubcomponentFactory $r1 = new IssueTypeFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent.Factory get2() {
                    IssueActivityModule_InjectIssueTypeFragment.IssueTypeFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IssueActivity injectIssueActivity(IssueActivity issueActivity) {
            IssueContainerPresenter $r2 = issueContainerPresenter();
            IssueActivity_MembersInjector.injectThisPresenter(issueActivity, $r2);
            DispatchingAndroidInjector $r3 = dispatchingAndroidInjectorOfObject();
            IssueActivity_MembersInjector.injectAndroidInjector(issueActivity, $r3);
            return issueActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IssueContainerPresenter issueContainerPresenter() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            UpdateNotificationReadStatus $r3 = $r2.updateNotificationReadStatus();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            Analytics $r4 = $r22.analytics();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r23.fetchCurrentUser();
            IssueContainerPresenter $r1 = new IssueContainerPresenter($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private Map mapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
            AbstractC5077j.C5078a $r1 = AbstractC5077j.m25729a(27);
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.productActivitySubcomponentFactoryProvider;
            $r1.m25720c(ProductActivity.class, $r3);
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            InterfaceC11700a $r32 = $r22.issueActivitySubcomponentFactoryProvider;
            $r1.m25720c(IssueActivity.class, $r32);
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            InterfaceC11700a $r33 = $r23.homeActivitySubcomponentFactoryProvider;
            $r1.m25720c(HomeActivity.class, $r33);
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            InterfaceC11700a $r34 = $r24.kShockActivitySubcomponentFactoryProvider;
            $r1.m25720c(KShockActivity.class, $r34);
            DaggerApplicationComponent $r25 = DaggerApplicationComponent.this;
            InterfaceC11700a $r35 = $r25.savingsActivitySubcomponentFactoryProvider;
            $r1.m25720c(SavingsActivity.class, $r35);
            DaggerApplicationComponent $r26 = DaggerApplicationComponent.this;
            InterfaceC11700a $r36 = $r26.banksFragmentSubcomponentFactoryProvider;
            $r1.m25720c(BanksFragment.class, $r36);
            DaggerApplicationComponent $r27 = DaggerApplicationComponent.this;
            InterfaceC11700a $r37 = $r27.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssuesTermsAndConditionsFragment.class, $r37);
            DaggerApplicationComponent $r28 = DaggerApplicationComponent.this;
            InterfaceC11700a $r38 = $r28.kudiPinSubcomponentFactoryProvider;
            $r1.m25720c(KudiPin.class, $r38);
            DaggerApplicationComponent $r29 = DaggerApplicationComponent.this;
            InterfaceC11700a $r39 = $r29.f201x23c522c6;
            $r1.m25720c(SendReceiptToTerminalConfirmationBottomSheet.class, $r39);
            DaggerApplicationComponent $r210 = DaggerApplicationComponent.this;
            InterfaceC11700a $r310 = $r210.picturePickerFragmentSubcomponentFactoryProvider;
            $r1.m25720c(PicturePickerFragment.class, $r310);
            InterfaceC11700a $r311 = this.disputeIssueFragmentSubcomponentFactoryProvider;
            $r1.m25720c(DisputeIssueFragment.class, $r311);
            InterfaceC11700a $r312 = this.posIssueFragmentSubcomponentFactoryProvider;
            $r1.m25720c(PosIssueFragment.class, $r312);
            InterfaceC11700a $r313 = this.issueTypeFragmentNewSubcomponentFactoryProvider;
            $r1.m25720c(IssueTypeFragmentNew.class, $r313);
            InterfaceC11700a $r314 = this.issueDetailFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssueDetailFragment.class, $r314);
            InterfaceC11700a $r315 = this.transactionListFragmentSubcomponentFactoryProvider;
            $r1.m25720c(TransactionListFragment.class, $r315);
            InterfaceC11700a $r316 = this.issueResolutionFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssueResolutionFragment.class, $r316);
            InterfaceC11700a $r317 = this.issueSummaryFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssueSummaryFragment.class, $r317);
            InterfaceC11700a $r318 = this.kYCformIssueFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KYCformIssueFragment.class, $r318);
            InterfaceC11700a $r319 = this.delayedKTAtopUpFragmentSubcomponentFactoryProvider;
            $r1.m25720c(DelayedKTAtopUpFragment.class, $r319);
            InterfaceC11700a $r320 = this.posTerminalIssuesFragmentSubcomponentFactoryProvider;
            $r1.m25720c(PosTerminalIssuesFragment.class, $r320);
            InterfaceC11700a $r321 = this.supportIssueFragmentSubcomponentFactoryProvider;
            $r1.m25720c(SupportIssueFragment.class, $r321);
            InterfaceC11700a $r322 = this.contactUsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(ContactUsFragment.class, $r322);
            InterfaceC11700a $r323 = this.issueHistoryFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssueHistoryFragment.class, $r323);
            InterfaceC11700a $r324 = this.ratingDialogSubcomponentFactoryProvider;
            $r1.m25720c(RatingDialog.class, $r324);
            InterfaceC11700a $r325 = this.customerDetailsIssueFragmentSubcomponentFactoryProvider;
            $r1.m25720c(CustomerDetailsIssueFragment.class, $r325);
            InterfaceC11700a $r326 = this.submitWithdrawalIssueFragmentSubcomponentFactoryProvider;
            $r1.m25720c(SubmitWithdrawalIssueFragment.class, $r326);
            InterfaceC11700a $r327 = this.issueTypeFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssueTypeFragment.class, $r327);
            Map $r4 = $r1.m25722a();
            Map r5 = $r4;
            return r5;
        }

        public void inject(IssueActivity issueActivity) {
            injectIssueActivity(issueActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            IssueActivity $r2 = (IssueActivity) obj;
            inject($r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class IssuesTermsAndConditionsFragmentSubcomponentFactory implements FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent.Factory {
        private IssuesTermsAndConditionsFragmentSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent create(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment) {
            C9473g.m14650b(issuesTermsAndConditionsFragment);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            IssuesTermsAndConditionsFragmentSubcomponentImpl $r2 = new IssuesTermsAndConditionsFragmentSubcomponentImpl(issuesTermsAndConditionsFragment);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            IssuesTermsAndConditionsFragment $r3 = (IssuesTermsAndConditionsFragment) obj;
            FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class IssuesTermsAndConditionsFragmentSubcomponentImpl implements FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent {
        private IssuesTermsAndConditionsFragmentSubcomponentImpl(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IssuesTermsAndConditionsFragment injectIssuesTermsAndConditionsFragment(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment) {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            TermsAndAndConditionsViewModel $r2 = $r3.termsAndAndConditionsViewModel();
            IssuesTermsAndConditionsFragment_MembersInjector.injectTermsAndAndConditionsViewModel(issuesTermsAndConditionsFragment, $r2);
            return issuesTermsAndConditionsFragment;
        }

        public void inject(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment) {
            injectIssuesTermsAndConditionsFragment(issuesTermsAndConditionsFragment);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            IssuesTermsAndConditionsFragment $r2 = (IssuesTermsAndConditionsFragment) obj;
            inject($r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class KShockActivitySubcomponentFactory implements ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent.Factory {
        private KShockActivitySubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent create(KShockActivity kShockActivity) {
            C9473g.m14650b(kShockActivity);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            KShockActivitySubcomponentImpl $r2 = new KShockActivitySubcomponentImpl(kShockActivity);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            KShockActivity $r3 = (KShockActivity) obj;
            ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class KShockActivitySubcomponentImpl implements ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent {
        private InterfaceC11700a<KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent.Factory> applyForLoanFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent.Factory> applyForLoanReviewFragmentSubcomponentFactoryProvider;
        private final KShockActivity arg0;
        private InterfaceC11700a<KShockActivity> arg0Provider;
        private InterfaceC11700a<KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent.Factory> kShockAvailableFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent.Factory> kShockEligibilityCriteriaFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent.Factory> kShockNotAvailableFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesKshockNotAvailableInLocationFragment.KShockNotAvailableInLocationFragmentSubcomponent.Factory> kShockNotAvailableInLocationFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent.Factory> kshockExistingLoanerFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent.Factory> kshockLoansListFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent.Factory> kshockOverdueLoansDetailFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent.Factory> kshockOverdueLoansListFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent.Factory> kshockPendingLoansListFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent.Factory> loanApplicationSubmittedFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent.Factory> loanHistoryFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent.Factory> loanStatusFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent.Factory> otpVerificationFragmentSubcomponentFactoryProvider;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ApplyForLoanFragmentSubcomponentFactory implements KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent.Factory {
            private ApplyForLoanFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent create(ApplyForLoanFragment applyForLoanFragment) {
                C9473g.m14650b(applyForLoanFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                ApplyForLoanFragmentSubcomponentImpl $r2 = new ApplyForLoanFragmentSubcomponentImpl(applyForLoanFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                ApplyForLoanFragment $r3 = (ApplyForLoanFragment) obj;
                KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ApplyForLoanFragmentSubcomponentImpl implements KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent {
            private ApplyForLoanFragmentSubcomponentImpl(ApplyForLoanFragment applyForLoanFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ApplyForLoanViewModel applyForLoanViewModel() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r3 = $r2.arg0;
                FetchLoanInterest $r4 = fetchLoanInterest();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r23 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r52 = DaggerApplicationComponent.this;
                Application $r7 = $r52.application;
                KShockActivitySubcomponentImpl $r24 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r53 = DaggerApplicationComponent.this;
                Analytics $r8 = $r53.analytics();
                ApplyForLoanViewModel $r1 = new ApplyForLoanViewModel($r3, $r4, $r6, $r7, $r8);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchLoanInterest fetchLoanInterest() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchLoanInterest $r1 = new FetchLoanInterest($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ApplyForLoanFragment injectApplyForLoanFragment(ApplyForLoanFragment applyForLoanFragment) {
                ApplyForLoanViewModel $r2 = applyForLoanViewModel();
                ApplyForLoanFragment_MembersInjector.injectViewModel(applyForLoanFragment, $r2);
                return applyForLoanFragment;
            }

            public void inject(ApplyForLoanFragment applyForLoanFragment) {
                injectApplyForLoanFragment(applyForLoanFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                ApplyForLoanFragment $r2 = (ApplyForLoanFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ApplyForLoanReviewFragmentSubcomponentFactory implements KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent.Factory {
            private ApplyForLoanReviewFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent create(ApplyForLoanReviewFragment applyForLoanReviewFragment) {
                C9473g.m14650b(applyForLoanReviewFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                ApplyForLoanReviewFragmentSubcomponentImpl $r2 = new ApplyForLoanReviewFragmentSubcomponentImpl(applyForLoanReviewFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                ApplyForLoanReviewFragment $r3 = (ApplyForLoanReviewFragment) obj;
                KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ApplyForLoanReviewFragmentSubcomponentImpl implements KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent {
            private ApplyForLoanReviewFragmentSubcomponentImpl(ApplyForLoanReviewFragment applyForLoanReviewFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ApplyForLoanReviewViewModel applyForLoanReviewViewModel() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r3 = $r2.arg0;
                PerformLoanRequest $r4 = performLoanRequest();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r23 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r52 = DaggerApplicationComponent.this;
                Application $r7 = $r52.application;
                KShockActivitySubcomponentImpl $r24 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r53 = DaggerApplicationComponent.this;
                Analytics $r8 = $r53.analytics();
                OtpStatusCheck $r9 = otpStatusCheck();
                ApplyForLoanReviewViewModel $r1 = new ApplyForLoanReviewViewModel($r3, $r4, $r6, $r7, $r8, $r9);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ApplyForLoanReviewFragment injectApplyForLoanReviewFragment(ApplyForLoanReviewFragment applyForLoanReviewFragment) {
                ApplyForLoanReviewViewModel $r2 = applyForLoanReviewViewModel();
                ApplyForLoanReviewFragment_MembersInjector.injectViewModel(applyForLoanReviewFragment, $r2);
                return applyForLoanReviewFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private OtpStatusCheck otpStatusCheck() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r32 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesDeviceInfoProvider;
                Object $r7 = $r6.get();
                DeviceInformation $r8 = (DeviceInformation) $r7;
                KShockActivitySubcomponentImpl $r33 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r9 = $r43.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                OtpStatusCheck $r1 = new OtpStatusCheck($r5, $r8, $r9, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PerformLoanRequest performLoanRequest() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r5 = $r4.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                KShockActivitySubcomponentImpl $r32 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesDeviceInfoProvider;
                Object $r7 = $r6.get();
                DeviceInformation $r8 = (DeviceInformation) $r7;
                PerformLoanRequest $r1 = new PerformLoanRequest($r5, $r2, $r8);
                return $r1;
            }

            public void inject(ApplyForLoanReviewFragment applyForLoanReviewFragment) {
                injectApplyForLoanReviewFragment(applyForLoanReviewFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                ApplyForLoanReviewFragment $r2 = (ApplyForLoanReviewFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KShockAvailableFragmentSubcomponentFactory implements KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent.Factory {
            private KShockAvailableFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent create(KShockAvailableFragment kShockAvailableFragment) {
                C9473g.m14650b(kShockAvailableFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KShockAvailableFragmentSubcomponentImpl $r2 = new KShockAvailableFragmentSubcomponentImpl(kShockAvailableFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KShockAvailableFragment $r3 = (KShockAvailableFragment) obj;
                KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KShockAvailableFragmentSubcomponentImpl implements KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent {
            private KShockAvailableFragmentSubcomponentImpl(KShockAvailableFragment kShockAvailableFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KShockAvailableFragment injectKShockAvailableFragment(KShockAvailableFragment kShockAvailableFragment) {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KShockViewModel $r2 = $r3.kShockViewModel();
                KShockAvailableFragment_MembersInjector.injectViewModel(kShockAvailableFragment, $r2);
                return kShockAvailableFragment;
            }

            public void inject(KShockAvailableFragment kShockAvailableFragment) {
                injectKShockAvailableFragment(kShockAvailableFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KShockAvailableFragment $r2 = (KShockAvailableFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KShockEligibilityCriteriaFragmentSubcomponentFactory implements KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent.Factory {
            private KShockEligibilityCriteriaFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent create(KShockEligibilityCriteriaFragment kShockEligibilityCriteriaFragment) {
                C9473g.m14650b(kShockEligibilityCriteriaFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KShockEligibilityCriteriaFragmentSubcomponentImpl $r2 = new KShockEligibilityCriteriaFragmentSubcomponentImpl(kShockEligibilityCriteriaFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KShockEligibilityCriteriaFragment $r3 = (KShockEligibilityCriteriaFragment) obj;
                KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KShockEligibilityCriteriaFragmentSubcomponentImpl implements KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent {
            private KShockEligibilityCriteriaFragmentSubcomponentImpl(KShockEligibilityCriteriaFragment kShockEligibilityCriteriaFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchNewKshockEligibility fetchNewKshockEligibility() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchNewKshockEligibility $r1 = new FetchNewKshockEligibility($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KShockEligibilityCriteriaFragment injectKShockEligibilityCriteriaFragment(KShockEligibilityCriteriaFragment kShockEligibilityCriteriaFragment) {
                KShockEligibilityCriteriaViewModel $r2 = kShockEligibilityCriteriaViewModel();
                KShockEligibilityCriteriaFragment_MembersInjector.injectViewModel(kShockEligibilityCriteriaFragment, $r2);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r4 = $r3.arg0;
                KShockEligibilityCriteriaFragment_MembersInjector.injectNavigator(kShockEligibilityCriteriaFragment, $r4);
                return kShockEligibilityCriteriaFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KShockEligibilityCriteriaViewModel kShockEligibilityCriteriaViewModel() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                FetchNewKshockEligibility $r5 = fetchNewKshockEligibility();
                KShockEligibilityCriteriaViewModel $r1 = new KShockEligibilityCriteriaViewModel($r4, $r5);
                return $r1;
            }

            public void inject(KShockEligibilityCriteriaFragment kShockEligibilityCriteriaFragment) {
                injectKShockEligibilityCriteriaFragment(kShockEligibilityCriteriaFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KShockEligibilityCriteriaFragment $r2 = (KShockEligibilityCriteriaFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KShockNotAvailableFragmentSubcomponentFactory implements KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent.Factory {
            private KShockNotAvailableFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent create(KShockNotAvailableFragment kShockNotAvailableFragment) {
                C9473g.m14650b(kShockNotAvailableFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KShockNotAvailableFragmentSubcomponentImpl $r2 = new KShockNotAvailableFragmentSubcomponentImpl(kShockNotAvailableFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KShockNotAvailableFragment $r3 = (KShockNotAvailableFragment) obj;
                KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KShockNotAvailableFragmentSubcomponentImpl implements KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent {
            private KShockNotAvailableFragmentSubcomponentImpl(KShockNotAvailableFragment kShockNotAvailableFragment) {
            }

            public void inject(KShockNotAvailableFragment kShockNotAvailableFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KShockNotAvailableFragment $r2 = (KShockNotAvailableFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KShockNotAvailableInLocationFragmentSubcomponentFactory implements AbstractC0191x52067c16.KShockNotAvailableInLocationFragmentSubcomponent.Factory {
            private KShockNotAvailableInLocationFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public AbstractC0191x52067c16.KShockNotAvailableInLocationFragmentSubcomponent create(KShockNotAvailableInLocationFragment kShockNotAvailableInLocationFragment) {
                C9473g.m14650b(kShockNotAvailableInLocationFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KShockNotAvailableInLocationFragmentSubcomponentImpl $r2 = new KShockNotAvailableInLocationFragmentSubcomponentImpl(kShockNotAvailableInLocationFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.AbstractC0191x52067c16.KShockNotAvailableInLocationFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KShockNotAvailableInLocationFragment $r3 = (KShockNotAvailableInLocationFragment) obj;
                AbstractC0191x52067c16.KShockNotAvailableInLocationFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KShockNotAvailableInLocationFragmentSubcomponentImpl implements AbstractC0191x52067c16.KShockNotAvailableInLocationFragmentSubcomponent {
            private KShockNotAvailableInLocationFragmentSubcomponentImpl(KShockNotAvailableInLocationFragment kShockNotAvailableInLocationFragment) {
            }

            public void inject(KShockNotAvailableInLocationFragment kShockNotAvailableInLocationFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.AbstractC0191x52067c16.KShockNotAvailableInLocationFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KShockNotAvailableInLocationFragment $r2 = (KShockNotAvailableInLocationFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockExistingLoanerFragmentSubcomponentFactory implements KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent.Factory {
            private KshockExistingLoanerFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent create(KshockExistingLoanerFragment kshockExistingLoanerFragment) {
                C9473g.m14650b(kshockExistingLoanerFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KshockExistingLoanerFragmentSubcomponentImpl $r2 = new KshockExistingLoanerFragmentSubcomponentImpl(kshockExistingLoanerFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KshockExistingLoanerFragment $r3 = (KshockExistingLoanerFragment) obj;
                KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockExistingLoanerFragmentSubcomponentImpl implements KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent {
            private KshockExistingLoanerFragmentSubcomponentImpl(KshockExistingLoanerFragment kshockExistingLoanerFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchExistingLoaner fetchExistingLoaner() {
                KshockExistingLoanerRepository $r3 = kshockExistingLoanerRepository();
                RxSchedulers $r2 = new RxSchedulers();
                FetchExistingLoaner $r1 = new FetchExistingLoaner($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockExistingLoanerFragment injectKshockExistingLoanerFragment(KshockExistingLoanerFragment kshockExistingLoanerFragment) {
                KshockExistingLoanerViewModel $r2 = kshockExistingLoanerViewModel();
                KshockExistingLoanerFragment_MembersInjector.injectKshockExistingLoanerViewModel(kshockExistingLoanerFragment, $r2);
                return kshockExistingLoanerFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockExistingLoanerRepository kshockExistingLoanerRepository() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r5 = $r4.kshockApi();
                KShockActivitySubcomponentImpl $r32 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesCoreAppDatabaseProvider;
                Object $r7 = $r6.get();
                CoreAppDatabase $r8 = (CoreAppDatabase) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                KshockExistingLoanerRepository $r1 = new KshockExistingLoanerRepository($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockExistingLoanerViewModel kshockExistingLoanerViewModel() {
                FetchExistingLoaner $r2 = fetchExistingLoaner();
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r4 = $r3.arg0;
                KShockActivitySubcomponentImpl $r32 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                KshockExistingLoanerViewModel $r1 = new KshockExistingLoanerViewModel($r2, $r4, $r6);
                return $r1;
            }

            public void inject(KshockExistingLoanerFragment kshockExistingLoanerFragment) {
                injectKshockExistingLoanerFragment(kshockExistingLoanerFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KshockExistingLoanerFragment $r2 = (KshockExistingLoanerFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockLoansListFragmentSubcomponentFactory implements KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent.Factory {
            private KshockLoansListFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent create(KshockLoansListFragment kshockLoansListFragment) {
                C9473g.m14650b(kshockLoansListFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KshockLoansListFragmentSubcomponentImpl $r2 = new KshockLoansListFragmentSubcomponentImpl(kshockLoansListFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KshockLoansListFragment $r3 = (KshockLoansListFragment) obj;
                KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockLoansListFragmentSubcomponentImpl implements KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent {
            private KshockLoansListFragmentSubcomponentImpl(KshockLoansListFragment kshockLoansListFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchLoanHistory fetchLoanHistory() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchLoanHistory $r1 = new FetchLoanHistory($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchOverdueLoanHistory fetchOverdueLoanHistory() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchOverdueLoanHistory $r1 = new FetchOverdueLoanHistory($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private GetWalletUseCase getWalletUseCase() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = $r3.kshockApi();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r32.fetchCurrentUser();
                GetWalletUseCase $r1 = new GetWalletUseCase($r4, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockLoansListFragment injectKshockLoansListFragment(KshockLoansListFragment kshockLoansListFragment) {
                KshockPendingLoansListViewModel $r2 = kshockPendingLoansListViewModel();
                KshockLoansListFragment_MembersInjector.injectKshockPendingLoansListViewModel(kshockLoansListFragment, $r2);
                return kshockLoansListFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockPendingLoansListViewModel kshockPendingLoansListViewModel() {
                FetchLoanHistory $r2 = fetchLoanHistory();
                FetchOverdueLoanHistory $r3 = fetchOverdueLoanHistory();
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r42 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r7 = $r42.arg0;
                PaybackLoan $r8 = paybackLoan();
                GetWalletUseCase $r9 = getWalletUseCase();
                PaybackOverdueLoan $r10 = paybackOverdueLoan();
                SubmitTransactionRequest $r11 = submitTransactionRequest();
                KshockPendingLoansListViewModel $r1 = new KshockPendingLoansListViewModel($r2, $r3, $r6, $r7, $r8, $r9, $r10, $r11);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackLoan paybackLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackLoan $r1 = new PaybackLoan($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackOverdueLoan paybackOverdueLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackOverdueLoan $r1 = new PaybackOverdueLoan($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SubmitTransactionRequest submitTransactionRequest() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = $r3.kshockApi();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                UserRepository $r5 = $r32.userRepository();
                SubmitTransactionRequest $r1 = new SubmitTransactionRequest($r4, $r5);
                return $r1;
            }

            public void inject(KshockLoansListFragment kshockLoansListFragment) {
                injectKshockLoansListFragment(kshockLoansListFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KshockLoansListFragment $r2 = (KshockLoansListFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockOverdueLoansDetailFragmentSubcomponentFactory implements KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent.Factory {
            private KshockOverdueLoansDetailFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent create(KshockOverdueLoansDetailFragment kshockOverdueLoansDetailFragment) {
                C9473g.m14650b(kshockOverdueLoansDetailFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KshockOverdueLoansDetailFragmentSubcomponentImpl $r2 = new KshockOverdueLoansDetailFragmentSubcomponentImpl(kshockOverdueLoansDetailFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KshockOverdueLoansDetailFragment $r3 = (KshockOverdueLoansDetailFragment) obj;
                KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockOverdueLoansDetailFragmentSubcomponentImpl implements KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent {
            private KshockOverdueLoansDetailFragmentSubcomponentImpl(KshockOverdueLoansDetailFragment kshockOverdueLoansDetailFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchLoanHistory fetchLoanHistory() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchLoanHistory $r1 = new FetchLoanHistory($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchOverdueLoanHistory fetchOverdueLoanHistory() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchOverdueLoanHistory $r1 = new FetchOverdueLoanHistory($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private GetWalletUseCase getWalletUseCase() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = $r3.kshockApi();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r32.fetchCurrentUser();
                GetWalletUseCase $r1 = new GetWalletUseCase($r4, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockOverdueLoansDetailFragment injectKshockOverdueLoansDetailFragment(KshockOverdueLoansDetailFragment kshockOverdueLoansDetailFragment) {
                KshockPendingLoansListViewModel $r2 = kshockPendingLoansListViewModel();
                KshockOverdueLoansDetailFragment_MembersInjector.injectKshockPendingLoansListViewModel(kshockOverdueLoansDetailFragment, $r2);
                return kshockOverdueLoansDetailFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockPendingLoansListViewModel kshockPendingLoansListViewModel() {
                FetchLoanHistory $r2 = fetchLoanHistory();
                FetchOverdueLoanHistory $r3 = fetchOverdueLoanHistory();
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r42 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r7 = $r42.arg0;
                PaybackLoan $r8 = paybackLoan();
                GetWalletUseCase $r9 = getWalletUseCase();
                PaybackOverdueLoan $r10 = paybackOverdueLoan();
                SubmitTransactionRequest $r11 = submitTransactionRequest();
                KshockPendingLoansListViewModel $r1 = new KshockPendingLoansListViewModel($r2, $r3, $r6, $r7, $r8, $r9, $r10, $r11);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackLoan paybackLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackLoan $r1 = new PaybackLoan($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackOverdueLoan paybackOverdueLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackOverdueLoan $r1 = new PaybackOverdueLoan($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SubmitTransactionRequest submitTransactionRequest() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = $r3.kshockApi();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                UserRepository $r5 = $r32.userRepository();
                SubmitTransactionRequest $r1 = new SubmitTransactionRequest($r4, $r5);
                return $r1;
            }

            public void inject(KshockOverdueLoansDetailFragment kshockOverdueLoansDetailFragment) {
                injectKshockOverdueLoansDetailFragment(kshockOverdueLoansDetailFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KshockOverdueLoansDetailFragment $r2 = (KshockOverdueLoansDetailFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockOverdueLoansListFragmentSubcomponentFactory implements KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent.Factory {
            private KshockOverdueLoansListFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent create(KshockOverdueLoansListFragment kshockOverdueLoansListFragment) {
                C9473g.m14650b(kshockOverdueLoansListFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KshockOverdueLoansListFragmentSubcomponentImpl $r2 = new KshockOverdueLoansListFragmentSubcomponentImpl(kshockOverdueLoansListFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KshockOverdueLoansListFragment $r3 = (KshockOverdueLoansListFragment) obj;
                KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockOverdueLoansListFragmentSubcomponentImpl implements KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent {
            private KshockOverdueLoansListFragmentSubcomponentImpl(KshockOverdueLoansListFragment kshockOverdueLoansListFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchLoanHistory fetchLoanHistory() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchLoanHistory $r1 = new FetchLoanHistory($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchOverdueLoanHistory fetchOverdueLoanHistory() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchOverdueLoanHistory $r1 = new FetchOverdueLoanHistory($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private GetWalletUseCase getWalletUseCase() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = $r3.kshockApi();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r32.fetchCurrentUser();
                GetWalletUseCase $r1 = new GetWalletUseCase($r4, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockOverdueLoansListFragment injectKshockOverdueLoansListFragment(KshockOverdueLoansListFragment kshockOverdueLoansListFragment) {
                KshockPendingLoansListViewModel $r2 = kshockPendingLoansListViewModel();
                KshockOverdueLoansListFragment_MembersInjector.injectKshockPendingLoansListViewModel(kshockOverdueLoansListFragment, $r2);
                return kshockOverdueLoansListFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockPendingLoansListViewModel kshockPendingLoansListViewModel() {
                FetchLoanHistory $r2 = fetchLoanHistory();
                FetchOverdueLoanHistory $r3 = fetchOverdueLoanHistory();
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r42 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r7 = $r42.arg0;
                PaybackLoan $r8 = paybackLoan();
                GetWalletUseCase $r9 = getWalletUseCase();
                PaybackOverdueLoan $r10 = paybackOverdueLoan();
                SubmitTransactionRequest $r11 = submitTransactionRequest();
                KshockPendingLoansListViewModel $r1 = new KshockPendingLoansListViewModel($r2, $r3, $r6, $r7, $r8, $r9, $r10, $r11);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackLoan paybackLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackLoan $r1 = new PaybackLoan($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackOverdueLoan paybackOverdueLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackOverdueLoan $r1 = new PaybackOverdueLoan($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SubmitTransactionRequest submitTransactionRequest() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = $r3.kshockApi();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                UserRepository $r5 = $r32.userRepository();
                SubmitTransactionRequest $r1 = new SubmitTransactionRequest($r4, $r5);
                return $r1;
            }

            public void inject(KshockOverdueLoansListFragment kshockOverdueLoansListFragment) {
                injectKshockOverdueLoansListFragment(kshockOverdueLoansListFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KshockOverdueLoansListFragment $r2 = (KshockOverdueLoansListFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockPendingLoansListFragmentSubcomponentFactory implements KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent.Factory {
            private KshockPendingLoansListFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent create(KshockPendingLoansListFragment kshockPendingLoansListFragment) {
                C9473g.m14650b(kshockPendingLoansListFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                KshockPendingLoansListFragmentSubcomponentImpl $r2 = new KshockPendingLoansListFragmentSubcomponentImpl(kshockPendingLoansListFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                KshockPendingLoansListFragment $r3 = (KshockPendingLoansListFragment) obj;
                KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class KshockPendingLoansListFragmentSubcomponentImpl implements KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent {
            private KshockPendingLoansListFragmentSubcomponentImpl(KshockPendingLoansListFragment kshockPendingLoansListFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchLoanHistory fetchLoanHistory() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchLoanHistory $r1 = new FetchLoanHistory($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private FetchOverdueLoanHistory fetchOverdueLoanHistory() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                FetchOverdueLoanHistory $r1 = new FetchOverdueLoanHistory($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private GetWalletUseCase getWalletUseCase() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = $r3.kshockApi();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r32.fetchCurrentUser();
                GetWalletUseCase $r1 = new GetWalletUseCase($r4, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockPendingLoansListFragment injectKshockPendingLoansListFragment(KshockPendingLoansListFragment kshockPendingLoansListFragment) {
                KshockPendingLoansListViewModel $r2 = kshockPendingLoansListViewModel();
                KshockPendingLoansListFragment_MembersInjector.injectKshockPendingLoansListViewModel(kshockPendingLoansListFragment, $r2);
                return kshockPendingLoansListFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private KshockPendingLoansListViewModel kshockPendingLoansListViewModel() {
                FetchLoanHistory $r2 = fetchLoanHistory();
                FetchOverdueLoanHistory $r3 = fetchOverdueLoanHistory();
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r42 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r7 = $r42.arg0;
                PaybackLoan $r8 = paybackLoan();
                GetWalletUseCase $r9 = getWalletUseCase();
                PaybackOverdueLoan $r10 = paybackOverdueLoan();
                SubmitTransactionRequest $r11 = submitTransactionRequest();
                KshockPendingLoansListViewModel $r1 = new KshockPendingLoansListViewModel($r2, $r3, $r6, $r7, $r8, $r9, $r10, $r11);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackLoan paybackLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackLoan $r1 = new PaybackLoan($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackOverdueLoan paybackOverdueLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackOverdueLoan $r1 = new PaybackOverdueLoan($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SubmitTransactionRequest submitTransactionRequest() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r4 = $r3.kshockApi();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                UserRepository $r5 = $r32.userRepository();
                SubmitTransactionRequest $r1 = new SubmitTransactionRequest($r4, $r5);
                return $r1;
            }

            public void inject(KshockPendingLoansListFragment kshockPendingLoansListFragment) {
                injectKshockPendingLoansListFragment(kshockPendingLoansListFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                KshockPendingLoansListFragment $r2 = (KshockPendingLoansListFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class LoanApplicationSubmittedFragmentSubcomponentFactory implements KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent.Factory {
            private LoanApplicationSubmittedFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent create(LoanApplicationSubmittedFragment loanApplicationSubmittedFragment) {
                C9473g.m14650b(loanApplicationSubmittedFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                LoanApplicationSubmittedFragmentSubcomponentImpl $r2 = new LoanApplicationSubmittedFragmentSubcomponentImpl(loanApplicationSubmittedFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                LoanApplicationSubmittedFragment $r3 = (LoanApplicationSubmittedFragment) obj;
                KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class LoanApplicationSubmittedFragmentSubcomponentImpl implements KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent {
            private LoanApplicationSubmittedFragmentSubcomponentImpl(LoanApplicationSubmittedFragment loanApplicationSubmittedFragment) {
            }

            public void inject(LoanApplicationSubmittedFragment loanApplicationSubmittedFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                LoanApplicationSubmittedFragment $r2 = (LoanApplicationSubmittedFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class LoanHistoryFragmentSubcomponentFactory implements KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent.Factory {
            private LoanHistoryFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent create(LoanHistoryFragment loanHistoryFragment) {
                C9473g.m14650b(loanHistoryFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                LoanHistoryFragmentSubcomponentImpl $r2 = new LoanHistoryFragmentSubcomponentImpl(loanHistoryFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                LoanHistoryFragment $r3 = (LoanHistoryFragment) obj;
                KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class LoanHistoryFragmentSubcomponentImpl implements KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent {
            private InterfaceC11700a<FetchPaginatedLoanHistory> fetchPaginatedLoanHistoryProvider;
            private InterfaceC11700a<LoanHistoryViewModel> loanHistoryViewModelProvider;
            private InterfaceC11700a<Map<Class<? extends d0>, InterfaceC11700a<d0>>> mapOfClassOfAndProviderOfViewModelProvider;
            private InterfaceC11700a<C1556g0.InterfaceC1559b> viewModelFactoryProvider;

            private LoanHistoryFragmentSubcomponentImpl(LoanHistoryFragment loanHistoryFragment) {
                initialize(loanHistoryFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private void initialize(LoanHistoryFragment loanHistoryFragment) {
                InterfaceC11700a $r2 = RxSchedulers_Factory.create();
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                InterfaceC11700a $r5 = $r4.providesKShockApiProvider;
                InterfaceC11700a $r7 = $r2;
                InterfaceC11700a $r6 = FetchPaginatedLoanHistory_Factory.create($r7, $r5);
                InterfaceC11700a $r52 = $r6;
                this.fetchPaginatedLoanHistoryProvider = $r52;
                KShockActivitySubcomponentImpl $r32 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r53 = $r42.applicationProvider;
                InterfaceC11700a $r72 = this.fetchPaginatedLoanHistoryProvider;
                KShockActivitySubcomponentImpl $r33 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                InterfaceC11700a $r8 = $r43.fetchCurrentUserProvider;
                KShockActivitySubcomponentImpl $r34 = KShockActivitySubcomponentImpl.this;
                InterfaceC11700a $r9 = $r34.arg0Provider;
                InterfaceC11700a $r10 = LoanHistoryViewModel_Factory.create($r53, $r72, $r8, $r9);
                InterfaceC11700a $r54 = $r10;
                this.loanHistoryViewModelProvider = $r54;
                C9470f.C9472b $r11 = C9470f.m14655b(1);
                InterfaceC11700a $r55 = this.loanHistoryViewModelProvider;
                $r11.m14652c(LoanHistoryViewModel.class, $r55);
                InterfaceC11700a $r12 = $r11.m14653b();
                InterfaceC11700a $r56 = $r12;
                this.mapOfClassOfAndProviderOfViewModelProvider = $r56;
                KShockActivitySubcomponentImpl $r35 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r44 = DaggerApplicationComponent.this;
                ViewModelFactoryModule $r13 = $r44.viewModelFactoryModule;
                InterfaceC11700a $r57 = this.mapOfClassOfAndProviderOfViewModelProvider;
                InterfaceC11700a $r14 = ViewModelFactoryModule_ViewModelFactoryFactory.create($r13, $r57);
                InterfaceC11700a $r58 = $r14;
                this.viewModelFactoryProvider = C9474h.m14646a($r58);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private LoanHistoryFragment injectLoanHistoryFragment(LoanHistoryFragment loanHistoryFragment) {
                InterfaceC11700a $r3 = this.viewModelFactoryProvider;
                Object $r2 = $r3.get();
                C1556g0.InterfaceC1559b $r4 = (C1556g0.InterfaceC1559b) $r2;
                LoanHistoryFragment_MembersInjector.injectViewModelFactory(loanHistoryFragment, $r4);
                return loanHistoryFragment;
            }

            public void inject(LoanHistoryFragment loanHistoryFragment) {
                injectLoanHistoryFragment(loanHistoryFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                LoanHistoryFragment $r2 = (LoanHistoryFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class LoanStatusFragmentSubcomponentFactory implements KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent.Factory {
            private LoanStatusFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent create(LoanStatusFragment loanStatusFragment) {
                C9473g.m14650b(loanStatusFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                LoanStatusFragmentSubcomponentImpl $r2 = new LoanStatusFragmentSubcomponentImpl(loanStatusFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                LoanStatusFragment $r3 = (LoanStatusFragment) obj;
                KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class LoanStatusFragmentSubcomponentImpl implements KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent {
            private LoanStatusFragmentSubcomponentImpl(LoanStatusFragment loanStatusFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CancelLoanRequest cancelLoanRequest() {
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r5.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                CancelLoanRequest $r1 = new CancelLoanRequest($r3, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private LoanStatusFragment injectLoanStatusFragment(LoanStatusFragment loanStatusFragment) {
                LoanStatusViewModel $r2 = loanStatusViewModel();
                LoanStatusFragment_MembersInjector.injectLoanStatusViewModel(loanStatusFragment, $r2);
                return loanStatusFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private LoanStatusViewModel loanStatusViewModel() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                CancelLoanRequest $r5 = cancelLoanRequest();
                PaybackLoan $r6 = paybackLoan();
                KShockActivitySubcomponentImpl $r22 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                Analytics $r7 = $r32.analytics();
                LoanStatusViewModel $r1 = new LoanStatusViewModel($r4, $r5, $r6, $r7);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PaybackLoan paybackLoan() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r2 = $r4.kshockApi();
                PaybackLoan $r1 = new PaybackLoan($r2);
                return $r1;
            }

            public void inject(LoanStatusFragment loanStatusFragment) {
                injectLoanStatusFragment(loanStatusFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                LoanStatusFragment $r2 = (LoanStatusFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class OtpVerificationFragmentSubcomponentFactory implements KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent.Factory {
            private OtpVerificationFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent create(OtpVerificationFragment otpVerificationFragment) {
                C9473g.m14650b(otpVerificationFragment);
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                OtpVerificationFragmentSubcomponentImpl $r2 = new OtpVerificationFragmentSubcomponentImpl(otpVerificationFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                OtpVerificationFragment $r3 = (OtpVerificationFragment) obj;
                KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class OtpVerificationFragmentSubcomponentImpl implements KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent {
            private OtpVerificationFragmentSubcomponentImpl(OtpVerificationFragment otpVerificationFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private OtpVerificationFragment injectOtpVerificationFragment(OtpVerificationFragment otpVerificationFragment) {
                OtpVerificationViewModel $r2 = otpVerificationViewModel();
                OtpVerificationFragment_MembersInjector.injectViewModel(otpVerificationFragment, $r2);
                return otpVerificationFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private OtpStatusCheck otpStatusCheck() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r32 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesDeviceInfoProvider;
                Object $r7 = $r6.get();
                DeviceInformation $r8 = (DeviceInformation) $r7;
                KShockActivitySubcomponentImpl $r33 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r9 = $r43.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                OtpStatusCheck $r1 = new OtpStatusCheck($r5, $r8, $r9, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private OtpVerificationViewModel otpVerificationViewModel() {
                VerifyOtp $r2 = verifyOtp();
                OtpStatusCheck $r3 = otpStatusCheck();
                KShockActivitySubcomponentImpl $r4 = KShockActivitySubcomponentImpl.this;
                KShockActivity $r5 = $r4.arg0;
                PerformLoanRequest $r6 = performLoanRequest();
                KShockActivitySubcomponentImpl $r42 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r7 = DaggerApplicationComponent.this;
                FetchCurrentUser $r8 = $r7.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r43 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r72 = DaggerApplicationComponent.this;
                Analytics $r9 = $r72.analytics();
                ResourceDelegate $r10 = resourceDelegate();
                OtpVerificationViewModel $r1 = new OtpVerificationViewModel($r2, $r3, $r5, $r6, $r8, $r9, $r10);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PerformLoanRequest performLoanRequest() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r5 = $r4.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                KShockActivitySubcomponentImpl $r32 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesDeviceInfoProvider;
                Object $r7 = $r6.get();
                DeviceInformation $r8 = (DeviceInformation) $r7;
                PerformLoanRequest $r1 = new PerformLoanRequest($r5, $r2, $r8);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ResourceDelegate resourceDelegate() {
                KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.provideAppContextProvider;
                Object $r5 = $r4.get();
                Context $r6 = (Context) $r5;
                ResourceDelegate $r1 = new ResourceDelegate($r6);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private VerifyOtp verifyOtp() {
                KShockActivitySubcomponentImpl $r3 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                KShockActivitySubcomponentImpl $r32 = KShockActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                ai.kudi.agent.kshock.data.domain.attention.KshockApi $r6 = $r42.kshockApi();
                RxSchedulers $r2 = new RxSchedulers();
                VerifyOtp $r1 = new VerifyOtp($r5, $r6, $r2);
                return $r1;
            }

            public void inject(OtpVerificationFragment otpVerificationFragment) {
                injectOtpVerificationFragment(otpVerificationFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                OtpVerificationFragment $r2 = (OtpVerificationFragment) obj;
                inject($r2);
            }
        }

        private KShockActivitySubcomponentImpl(KShockActivity kShockActivity) {
            this.arg0 = kShockActivity;
            initialize(kShockActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DispatchingAndroidInjector dispatchingAndroidInjectorOfObject() {
            Map $r1 = mapOfClassOfAndProviderOfAndroidInjectorFactoryOf();
            Map $r2 = AbstractC5077j.m25724l();
            Map r4 = $r2;
            DispatchingAndroidInjector $r3 = C7428c.m18754a($r1, r4);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchKshockAvailabilty fetchKshockAvailabilty() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r4.kshockApi();
            RxSchedulers $r2 = new RxSchedulers();
            FetchKshockAvailabilty $r1 = new FetchKshockAvailabilty($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchPendingLoan fetchPendingLoan() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r4.kshockApi();
            RxSchedulers $r2 = new RxSchedulers();
            FetchPendingLoan $r1 = new FetchPendingLoan($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private void initialize(KShockActivity kShockActivity) {
            this.applyForLoanFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    ApplyForLoanFragmentSubcomponentFactory $r1 = new ApplyForLoanFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesApplyForLoanFragment.ApplyForLoanFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.applyForLoanReviewFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    ApplyForLoanReviewFragmentSubcomponentFactory $r1 = new ApplyForLoanReviewFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesApplyForLoanReviewFragment.ApplyForLoanReviewFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kShockEligibilityCriteriaFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KShockEligibilityCriteriaFragmentSubcomponentFactory $r1 = new KShockEligibilityCriteriaFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment.KShockEligibilityCriteriaFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kShockNotAvailableFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KShockNotAvailableFragmentSubcomponentFactory $r1 = new KShockNotAvailableFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesKshockNotAvailableFragment.KShockNotAvailableFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kShockNotAvailableInLocationFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesKshockNotAvailableInLocationFragment.KShockNotAvailableInLocationFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesKshockNotAvailableInLocationFragment.KShockNotAvailableInLocationFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KShockNotAvailableInLocationFragmentSubcomponentFactory $r1 = new KShockNotAvailableInLocationFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesKshockNotAvailableInLocationFragment.KShockNotAvailableInLocationFragmentSubcomponent.Factory get2() {
                    AbstractC0191x52067c16.KShockNotAvailableInLocationFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.loanApplicationSubmittedFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.6
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    LoanApplicationSubmittedFragmentSubcomponentFactory $r1 = new LoanApplicationSubmittedFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesLoanApplicationSubmittedFragment.LoanApplicationSubmittedFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.loanHistoryFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.7
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    LoanHistoryFragmentSubcomponentFactory $r1 = new LoanHistoryFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesLoanHistoryFragment.LoanHistoryFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.loanStatusFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.8
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    LoanStatusFragmentSubcomponentFactory $r1 = new LoanStatusFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesLoanStatusFragment.LoanStatusFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kShockAvailableFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.9
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KShockAvailableFragmentSubcomponentFactory $r1 = new KShockAvailableFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesKshockAvailableFragment.KShockAvailableFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kshockExistingLoanerFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.10
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KshockExistingLoanerFragmentSubcomponentFactory $r1 = new KshockExistingLoanerFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesExistingLoanerFragment.KshockExistingLoanerFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kshockPendingLoansListFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.11
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KshockPendingLoansListFragmentSubcomponentFactory $r1 = new KshockPendingLoansListFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesPendingLoansListFragment.KshockPendingLoansListFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kshockLoansListFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.12
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KshockLoansListFragmentSubcomponentFactory $r1 = new KshockLoansListFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesKshockLoansListFragment.KshockLoansListFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kshockOverdueLoansListFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.13
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KshockOverdueLoansListFragmentSubcomponentFactory $r1 = new KshockOverdueLoansListFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesKshockOverdueLoansListFragment.KshockOverdueLoansListFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.kshockOverdueLoansDetailFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.14
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    KshockOverdueLoansDetailFragmentSubcomponentFactory $r1 = new KshockOverdueLoansDetailFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment.KshockOverdueLoansDetailFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.otpVerificationFragmentSubcomponentFactoryProvider = new InterfaceC11700a<KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.KShockActivitySubcomponentImpl.15
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent.Factory get() {
                    KShockActivitySubcomponentImpl $r2 = KShockActivitySubcomponentImpl.this;
                    OtpVerificationFragmentSubcomponentFactory $r1 = new OtpVerificationFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent.Factory get2() {
                    KshockActivityModule_ProvidesOtpVerificationFragment.OtpVerificationFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            InterfaceC11700a $r1 = C9469e.m14656a(kShockActivity);
            InterfaceC11700a r33 = $r1;
            this.arg0Provider = r33;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KShockActivity injectKShockActivity(KShockActivity kShockActivity) {
            KShockViewModel $r2 = kShockViewModel();
            KShockActivity_MembersInjector.injectViewModel(kShockActivity, $r2);
            SmartLookAnalytics $r3 = new SmartLookAnalytics();
            KShockActivity_MembersInjector.injectSmartLookAnalytics(kShockActivity, $r3);
            DispatchingAndroidInjector $r4 = dispatchingAndroidInjectorOfObject();
            KShockActivity_MembersInjector.injectAndroidInjector(kShockActivity, $r4);
            return kShockActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public KShockViewModel kShockViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            KShockActivity $r1 = this.arg0;
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            FetchPendingLoan $r6 = fetchPendingLoan();
            FetchKshockAvailabilty $r7 = fetchKshockAvailabilty();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            InterfaceC11700a $r8 = $r33.providesSharedPrefsProvider;
            Object $r9 = $r8.get();
            KShockViewModel $r2 = new KShockViewModel($r4, $r1, $r5, $r6, $r7, (SharedPreferences) $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private Map mapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
            AbstractC5077j.C5078a $r1 = AbstractC5077j.m25729a(25);
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.productActivitySubcomponentFactoryProvider;
            $r1.m25720c(ProductActivity.class, $r3);
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            InterfaceC11700a $r32 = $r22.issueActivitySubcomponentFactoryProvider;
            $r1.m25720c(IssueActivity.class, $r32);
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            InterfaceC11700a $r33 = $r23.homeActivitySubcomponentFactoryProvider;
            $r1.m25720c(HomeActivity.class, $r33);
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            InterfaceC11700a $r34 = $r24.kShockActivitySubcomponentFactoryProvider;
            $r1.m25720c(KShockActivity.class, $r34);
            DaggerApplicationComponent $r25 = DaggerApplicationComponent.this;
            InterfaceC11700a $r35 = $r25.savingsActivitySubcomponentFactoryProvider;
            $r1.m25720c(SavingsActivity.class, $r35);
            DaggerApplicationComponent $r26 = DaggerApplicationComponent.this;
            InterfaceC11700a $r36 = $r26.banksFragmentSubcomponentFactoryProvider;
            $r1.m25720c(BanksFragment.class, $r36);
            DaggerApplicationComponent $r27 = DaggerApplicationComponent.this;
            InterfaceC11700a $r37 = $r27.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssuesTermsAndConditionsFragment.class, $r37);
            DaggerApplicationComponent $r28 = DaggerApplicationComponent.this;
            InterfaceC11700a $r38 = $r28.kudiPinSubcomponentFactoryProvider;
            $r1.m25720c(KudiPin.class, $r38);
            DaggerApplicationComponent $r29 = DaggerApplicationComponent.this;
            InterfaceC11700a $r39 = $r29.f201x23c522c6;
            $r1.m25720c(SendReceiptToTerminalConfirmationBottomSheet.class, $r39);
            DaggerApplicationComponent $r210 = DaggerApplicationComponent.this;
            InterfaceC11700a $r310 = $r210.picturePickerFragmentSubcomponentFactoryProvider;
            $r1.m25720c(PicturePickerFragment.class, $r310);
            InterfaceC11700a $r311 = this.applyForLoanFragmentSubcomponentFactoryProvider;
            $r1.m25720c(ApplyForLoanFragment.class, $r311);
            InterfaceC11700a $r312 = this.applyForLoanReviewFragmentSubcomponentFactoryProvider;
            $r1.m25720c(ApplyForLoanReviewFragment.class, $r312);
            InterfaceC11700a $r313 = this.kShockEligibilityCriteriaFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KShockEligibilityCriteriaFragment.class, $r313);
            InterfaceC11700a $r314 = this.kShockNotAvailableFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KShockNotAvailableFragment.class, $r314);
            InterfaceC11700a $r315 = this.kShockNotAvailableInLocationFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KShockNotAvailableInLocationFragment.class, $r315);
            InterfaceC11700a $r316 = this.loanApplicationSubmittedFragmentSubcomponentFactoryProvider;
            $r1.m25720c(LoanApplicationSubmittedFragment.class, $r316);
            InterfaceC11700a $r317 = this.loanHistoryFragmentSubcomponentFactoryProvider;
            $r1.m25720c(LoanHistoryFragment.class, $r317);
            InterfaceC11700a $r318 = this.loanStatusFragmentSubcomponentFactoryProvider;
            $r1.m25720c(LoanStatusFragment.class, $r318);
            InterfaceC11700a $r319 = this.kShockAvailableFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KShockAvailableFragment.class, $r319);
            InterfaceC11700a $r320 = this.kshockExistingLoanerFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KshockExistingLoanerFragment.class, $r320);
            InterfaceC11700a $r321 = this.kshockPendingLoansListFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KshockPendingLoansListFragment.class, $r321);
            InterfaceC11700a $r322 = this.kshockLoansListFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KshockLoansListFragment.class, $r322);
            InterfaceC11700a $r323 = this.kshockOverdueLoansListFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KshockOverdueLoansListFragment.class, $r323);
            InterfaceC11700a $r324 = this.kshockOverdueLoansDetailFragmentSubcomponentFactoryProvider;
            $r1.m25720c(KshockOverdueLoansDetailFragment.class, $r324);
            InterfaceC11700a $r325 = this.otpVerificationFragmentSubcomponentFactoryProvider;
            $r1.m25720c(OtpVerificationFragment.class, $r325);
            Map $r4 = $r1.m25722a();
            Map r5 = $r4;
            return r5;
        }

        public void inject(KShockActivity kShockActivity) {
            injectKShockActivity(kShockActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            KShockActivity $r2 = (KShockActivity) obj;
            inject($r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class KudiPinSubcomponentFactory implements FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent.Factory {
        private KudiPinSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent create(KudiPin kudiPin) {
            C9473g.m14650b(kudiPin);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            KudiPinSubcomponentImpl $r2 = new KudiPinSubcomponentImpl(kudiPin);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            KudiPin $r3 = (KudiPin) obj;
            FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class KudiPinSubcomponentImpl implements FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent {
        private KudiPinSubcomponentImpl(KudiPin kudiPin) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AuthorizeSavings authorizeSavings() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            InterfaceC11700a $r5 = $r32.providesUserServiceProvider;
            Object $r6 = $r5.get();
            UserService $r7 = (UserService) $r6;
            AuthorizeSavings $r1 = new AuthorizeSavings($r4, $r2, $r7);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KudiPin injectKudiPin(KudiPin kudiPin) {
            KudiPinViewModel $r2 = kudiPinViewModel();
            KudiPin_MembersInjector.injectKudiPinViewModel(kudiPin, $r2);
            return kudiPin;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KudiPinViewModel kudiPinViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            Authorize $r4 = $r22.authorize();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            InterfaceC11700a $r5 = $r23.providesDeviceInfoProvider;
            Object $r6 = $r5.get();
            DeviceInformation $r7 = (DeviceInformation) $r6;
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            Analytics $r8 = $r24.analytics();
            AuthorizeSavings $r9 = authorizeSavings();
            KudiPinViewModel $r1 = new KudiPinViewModel($r3, $r4, $r7, $r8, $r9);
            return $r1;
        }

        public void inject(KudiPin kudiPin) {
            injectKudiPin(kudiPin);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            KudiPin $r2 = (KudiPin) obj;
            inject($r2);
        }
    }

    /* loaded from: classes.dex */
    final class LoginSubComponentFactory implements LoginSubComponent.Factory {
        private LoginSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.game.components.LoginSubComponent.Factory
        public LoginSubComponent create() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            LoginSubComponentImpl $r1 = new LoginSubComponentImpl();
            return $r1;
        }
    }

    /* loaded from: classes.dex */
    final class LoginSubComponentImpl implements LoginSubComponent {
        private LoginSubComponentImpl() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EnableFingerPrintFragment injectEnableFingerPrintFragment(EnableFingerPrintFragment enableFingerPrintFragment) {
            EnableFingerPrintViewModel $r2 = new EnableFingerPrintViewModel();
            EnableFingerPrintFragment_MembersInjector.injectVm(enableFingerPrintFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            EnableFingerPrintFragment_MembersInjector.injectSharedPreferences(enableFingerPrintFragment, $r6);
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r7 = $r32.analytics();
            EnableFingerPrintFragment_MembersInjector.injectAnalytics(enableFingerPrintFragment, $r7);
            return enableFingerPrintFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LoginActivity injectLoginActivity(LoginActivity loginActivity) {
            LoginPresenter $r2 = loginPresenter();
            LoginActivity_MembersInjector.injectThisPresenter(loginActivity, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            CacheModule $r4 = $r3.cacheModule;
            Pref $r5 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r4);
            LoginActivity_MembersInjector.injectPref(loginActivity, $r5);
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            InterfaceC11700a $r6 = $r32.providePFSecurityUtilsFactoryProvider;
            Object $r7 = $r6.get();
            IPFSecurityUtils $r8 = (IPFSecurityUtils) $r7;
            LoginActivity_MembersInjector.injectFac(loginActivity, $r8);
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            InterfaceC11700a $r62 = $r33.providesSharedPrefsProvider;
            Object $r72 = $r62.get();
            SharedPreferences $r9 = (SharedPreferences) $r72;
            LoginActivity_MembersInjector.injectSharedPrefs(loginActivity, $r9);
            DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
            InterfaceC11700a $r63 = $r34.provideFirebaseConfigProvider;
            Object $r73 = $r63.get();
            Frame $r10 = (Frame) $r73;
            LoginActivity_MembersInjector.injectRemoteConfig(loginActivity, $r10);
            DaggerApplicationComponent $r35 = DaggerApplicationComponent.this;
            InterfaceC11700a $r64 = $r35.providesDeviceSecuritySharedPrefsProvider;
            Object $r74 = $r64.get();
            SharedPreferences $r92 = (SharedPreferences) $r74;
            LoginActivity_MembersInjector.injectDevicePrefs(loginActivity, $r92);
            DaggerApplicationComponent $r36 = DaggerApplicationComponent.this;
            Analytics $r11 = $r36.analytics();
            LoginActivity_MembersInjector.injectAnalytics(loginActivity, $r11);
            SmartLookAnalytics $r12 = new SmartLookAnalytics();
            LoginActivity_MembersInjector.injectSmartLookAnalytics(loginActivity, $r12);
            return loginActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LoginPresenter loginPresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            LoginUser $r4 = $r3.loginUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            Analytics $r6 = $r33.analytics();
            DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
            ApplicationModule $r7 = $r34.applicationModule;
            C5615f $r8 = ApplicationModule_ProvidesFirebaseDbFactory.providesFirebaseDb($r7);
            DaggerApplicationComponent $r35 = DaggerApplicationComponent.this;
            PinRepositoryImpl $r9 = $r35.pinRepositoryImpl();
            DaggerApplicationComponent $r36 = DaggerApplicationComponent.this;
            CacheModule $r10 = $r36.cacheModule;
            Pref $r11 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r10);
            SmartLookAnalytics $r1 = new SmartLookAnalytics();
            ResourceDelegate $r12 = resourceDelegate();
            LoginPresenter $r2 = new LoginPresenter($r4, $r5, $r6, $r8, $r9, $r11, $r1, $r12);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        @Override // ai.kudi.agent.login.game.components.LoginSubComponent
        public void inject(LoginActivity loginActivity) {
            injectLoginActivity(loginActivity);
        }

        @Override // ai.kudi.agent.login.game.components.LoginSubComponent
        public void inject(EnableFingerPrintFragment enableFingerPrintFragment) {
            injectEnableFingerPrintFragment(enableFingerPrintFragment);
        }
    }

    /* loaded from: classes.dex */
    final class MainTransferSubComponentFactory implements MainTransferSubComponent.Factory {
        private MainTransferSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent.Factory
        public MainTransferSubComponent create(MainTransferView mainTransferView) {
            C9473g.m14650b(mainTransferView);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            MainTransferSubComponentImpl $r2 = new MainTransferSubComponentImpl(mainTransferView);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class MainTransferSubComponentImpl implements MainTransferSubComponent {
        private final MainTransferView mainTransferView;

        private MainTransferSubComponentImpl(MainTransferView mainTransferView) {
            this.mainTransferView = mainTransferView;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateVoucher createVoucher() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            CreateVoucher $r1 = new CreateVoucher($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateVoucherAmountPresenter createVoucherAmountPresenter() {
            MainTransferView $r2 = this.mainTransferView;
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            Analytics $r4 = $r3.analytics();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            CreateVoucherAmountPresenter $r1 = new CreateVoucherAmountPresenter($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateVoucherRecipientPresenter createVoucherRecipientPresenter() {
            MainTransferView $r2 = this.mainTransferView;
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            Analytics $r4 = $r3.analytics();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            CreateVoucherRecipientPresenter $r1 = new CreateVoucherRecipientPresenter($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateVoucherSenderPresenter createVoucherSenderPresenter() {
            MainTransferView $r2 = this.mainTransferView;
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            Analytics $r4 = $r3.analytics();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            CreateVoucherSenderPresenter $r1 = new CreateVoucherSenderPresenter($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private HandleOrPhoneLookUp handleOrPhoneLookUp() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            HandleOrPhoneLookUp $r1 = new HandleOrPhoneLookUp($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateVoucherAmountInfoFragment injectCreateVoucherAmountInfoFragment(CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment) {
            CreateVoucherAmountPresenter $r2 = createVoucherAmountPresenter();
            CreateVoucherAmountInfoFragment_MembersInjector.injectThisPresenter(createVoucherAmountInfoFragment, $r2);
            return createVoucherAmountInfoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateVoucherRecipientInfoFragment injectCreateVoucherRecipientInfoFragment(CreateVoucherRecipientInfoFragment createVoucherRecipientInfoFragment) {
            CreateVoucherRecipientPresenter $r2 = createVoucherRecipientPresenter();
            CreateVoucherRecipientInfoFragment_MembersInjector.injectThisPresenter(createVoucherRecipientInfoFragment, $r2);
            return createVoucherRecipientInfoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateVoucherSenderInfoFragment injectCreateVoucherSenderInfoFragment(CreateVoucherSenderInfoFragment createVoucherSenderInfoFragment) {
            CreateVoucherSenderPresenter $r2 = createVoucherSenderPresenter();
            CreateVoucherSenderInfoFragment_MembersInjector.injectThisPresenter(createVoucherSenderInfoFragment, $r2);
            return createVoucherSenderInfoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private P2pEnterAmtFragment injectP2pEnterAmtFragment(P2pEnterAmtFragment p2pEnterAmtFragment) {
            P2pEnterAmtViewModel $r2 = new P2pEnterAmtViewModel();
            BaseAmountInputFragment_MembersInjector.injectScreenViewModel(p2pEnterAmtFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesFrequentlyUsedSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            P2pEnterAmtFragment_MembersInjector.injectSharedPreferences(p2pEnterAmtFragment, $r6);
            return p2pEnterAmtFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private P2pNameAndPhoneNoFragment injectP2pNameAndPhoneNoFragment(P2pNameAndPhoneNoFragment p2pNameAndPhoneNoFragment) {
            P2pNameAndPhoneViewModel $r2 = p2pNameAndPhoneViewModel();
            P2pNameAndPhoneNoFragment_MembersInjector.injectP2pNameAndPhoneViewModel(p2pNameAndPhoneNoFragment, $r2);
            return p2pNameAndPhoneNoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private P2pSummaryFragment injectP2pSummaryFragment(P2pSummaryFragment p2pSummaryFragment) {
            P2pSummaryViewModel $r2 = p2pSummaryViewModel();
            P2pSummaryFragment_MembersInjector.injectP2pSummaryViewModel(p2pSummaryFragment, $r2);
            return p2pSummaryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferActivity injectTransferActivity(TransferActivity transferActivity) {
            MainTransferPresenter $r2 = new MainTransferPresenter();
            TransferActivity_MembersInjector.injectThisPresenter(transferActivity, $r2);
            SmartLookAnalytics $r3 = new SmartLookAnalytics();
            TransferActivity_MembersInjector.injectSmartLookAnalytics(transferActivity, $r3);
            return transferActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferSummaryFragment injectTransferSummaryFragment(TransferSummaryFragment transferSummaryFragment) {
            TransferSummaryPresenter $r2 = transferSummaryPresenter();
            TransferSummaryFragment_MembersInjector.injectThisPresenter(transferSummaryFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesFrequentlyUsedSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            TransferSummaryFragment_MembersInjector.injectSharedPreferences(transferSummaryFragment, $r6);
            return transferSummaryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferToBankAmountFragment injectTransferToBankAmountFragment(TransferToBankAmountFragment transferToBankAmountFragment) {
            TransferToBankAmountPresenter $r2 = transferToBankAmountPresenter();
            TransferToBankAmountFragment_MembersInjector.injectThisPresenter(transferToBankAmountFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesFrequentlyUsedSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            TransferToBankAmountFragment_MembersInjector.injectSharedPreferences(transferToBankAmountFragment, $r6);
            return transferToBankAmountFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferToBankCustomersFragment injectTransferToBankCustomersFragment(TransferToBankCustomersFragment transferToBankCustomersFragment) {
            TransferToBankCustomerPresenter $r2 = transferToBankCustomerPresenter();
            TransferToBankCustomersFragment_MembersInjector.injectThisPresenter(transferToBankCustomersFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesFrequentlyUsedSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            TransferToBankCustomersFragment_MembersInjector.injectSharedPreferences(transferToBankCustomersFragment, $r6);
            return transferToBankCustomersFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferToBankFragment injectTransferToBankFragment(TransferToBankFragment transferToBankFragment) {
            TransferToBankPresenter $r2 = transferToBankPresenter();
            TransferToBankFragment_MembersInjector.injectThisPresenter(transferToBankFragment, $r2);
            return transferToBankFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferToMultipleBankFragment injectTransferToMultipleBankFragment(TransferToMultipleBankFragment transferToMultipleBankFragment) {
            TransferToMultipleViewModel $r2 = transferToMultipleViewModel();
            TransferToMultipleBankFragment_MembersInjector.injectViewModel(transferToMultipleBankFragment, $r2);
            MainTransferView $r3 = this.mainTransferView;
            TransferToMultipleBankFragment_MembersInjector.injectMainTransferView(transferToMultipleBankFragment, $r3);
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            InterfaceC11700a $r5 = $r4.providesFrequentlyUsedSharedPrefsProvider;
            Object $r6 = $r5.get();
            SharedPreferences $r7 = (SharedPreferences) $r6;
            TransferToMultipleBankFragment_MembersInjector.injectSharedPreferences(transferToMultipleBankFragment, $r7);
            return transferToMultipleBankFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LogUserEventUseCase logUserEventUseCase() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            LogUserEventUseCase $r1 = new LogUserEventUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private P2pNameAndPhoneViewModel p2pNameAndPhoneViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            Application $r3 = $r2.application;
            HandleOrPhoneLookUp $r4 = handleOrPhoneLookUp();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r22.fetchCurrentUser();
            P2pNameAndPhoneViewModel $r1 = new P2pNameAndPhoneViewModel($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private P2pSummaryViewModel p2pSummaryViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest $r2 = $r3.submitTransactionRequest();
            P2pSummaryViewModel $r1 = new P2pSummaryViewModel($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SubmitMultipleTransferRequest submitMultipleTransferRequest() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r4 = $r3.networkService();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            UserRepository $r5 = $r32.userRepository();
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            InterfaceC11700a $r6 = $r33.providesDeviceInfoProvider;
            Object $r7 = $r6.get();
            DeviceInformation $r8 = (DeviceInformation) $r7;
            SubmitMultipleTransferRequest $r1 = new SubmitMultipleTransferRequest($r4, $r5, $r2, $r8);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionLookUpUsecase transactionLookUpUsecase() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            TransactionLookUpRepository $r2 = $r3.transactionLookUpRepository();
            TransactionLookUpUsecase $r1 = new TransactionLookUpUsecase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferSummaryPresenter transferSummaryPresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            TransferToBank $r5 = $r32.transferToBank();
            MainTransferView $r1 = this.mainTransferView;
            CreateVoucher $r6 = createVoucher();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            Analytics $r7 = $r33.analytics();
            DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
            SubmitTransferRequest $r8 = $r34.submitTransferRequest();
            LogUserEventUseCase $r9 = logUserEventUseCase();
            TransferSummaryPresenter $r2 = new TransferSummaryPresenter($r4, $r5, $r1, $r6, $r7, $r8, $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferToBankAmountPresenter transferToBankAmountPresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            PerformServiceFeeLookup $r5 = $r32.performServiceFeeLookup();
            MainTransferView $r1 = this.mainTransferView;
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            Analytics $r6 = $r33.analytics();
            DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
            InterfaceC11700a $r7 = $r34.providesFrequentlyUsedSharedPrefsProvider;
            Object $r8 = $r7.get();
            SharedPreferences $r9 = (SharedPreferences) $r8;
            TransferToBankAmountPresenter $r2 = new TransferToBankAmountPresenter($r4, $r5, $r1, $r6, $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferToBankCustomerPresenter transferToBankCustomerPresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            PerformServiceFeeLookup $r5 = $r32.performServiceFeeLookup();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            Analytics $r6 = $r33.analytics();
            MainTransferView $r2 = this.mainTransferView;
            TransferToBankCustomerPresenter $r1 = new TransferToBankCustomerPresenter($r4, $r5, $r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferToBankPresenter transferToBankPresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            CacheModule $r4 = $r3.cacheModule;
            Pref $r5 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r4);
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            AccountRepository $r6 = $r32.accountRepository();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            AccountLookup $r7 = $r33.accountLookup();
            DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
            FetchCurrentUser $r8 = $r34.fetchCurrentUser();
            MainTransferView $r1 = this.mainTransferView;
            DaggerApplicationComponent $r35 = DaggerApplicationComponent.this;
            Analytics $r9 = $r35.analytics();
            TransactionLookUpUsecase $r10 = transactionLookUpUsecase();
            TransferToBankPresenter $r2 = new TransferToBankPresenter($r5, $r6, $r7, $r8, $r1, $r9, $r10);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransferToMultipleViewModel transferToMultipleViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            Application $r3 = $r2.application;
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            AccountLookup $r5 = $r23.accountLookup();
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            Analytics $r6 = $r24.analytics();
            SubmitMultipleTransferRequest $r7 = submitMultipleTransferRequest();
            DaggerApplicationComponent $r25 = DaggerApplicationComponent.this;
            InterfaceC11700a $r8 = $r25.providesFrequentlyUsedSharedPrefsProvider;
            Object $r9 = $r8.get();
            TransferToMultipleViewModel $r1 = new TransferToMultipleViewModel($r3, $r4, $r5, $r6, $r7, (SharedPreferences) $r9);
            return $r1;
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(P2pEnterAmtFragment p2pEnterAmtFragment) {
            injectP2pEnterAmtFragment(p2pEnterAmtFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(P2pNameAndPhoneNoFragment p2pNameAndPhoneNoFragment) {
            injectP2pNameAndPhoneNoFragment(p2pNameAndPhoneNoFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(P2pSummaryFragment p2pSummaryFragment) {
            injectP2pSummaryFragment(p2pSummaryFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(TransferSummaryFragment transferSummaryFragment) {
            injectTransferSummaryFragment(transferSummaryFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(TransferActivity transferActivity) {
            injectTransferActivity(transferActivity);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(TransferToBankAmountFragment transferToBankAmountFragment) {
            injectTransferToBankAmountFragment(transferToBankAmountFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(TransferToBankCustomersFragment transferToBankCustomersFragment) {
            injectTransferToBankCustomersFragment(transferToBankCustomersFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(TransferToBankFragment transferToBankFragment) {
            injectTransferToBankFragment(transferToBankFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(TransferToMultipleBankFragment transferToMultipleBankFragment) {
            injectTransferToMultipleBankFragment(transferToMultipleBankFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment) {
            injectCreateVoucherAmountInfoFragment(createVoucherAmountInfoFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(CreateVoucherRecipientInfoFragment createVoucherRecipientInfoFragment) {
            injectCreateVoucherRecipientInfoFragment(createVoucherRecipientInfoFragment);
        }

        @Override // ai.kudi.agent.transfer.generation.components.MainTransferSubComponent
        public void inject(CreateVoucherSenderInfoFragment createVoucherSenderInfoFragment) {
            injectCreateVoucherSenderInfoFragment(createVoucherSenderInfoFragment);
        }
    }

    /* loaded from: classes.dex */
    final class OutletMgtFeaturesSubcomponentsFactory implements OutletMgtFeaturesSubcomponents.Factory {
        private OutletMgtFeaturesSubcomponentsFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents.Factory
        public OutletMgtFeaturesSubcomponents create() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            OutletMgtFeaturesSubcomponentsImpl $r1 = new OutletMgtFeaturesSubcomponentsImpl();
            return $r1;
        }
    }

    /* loaded from: classes.dex */
    final class OutletMgtFeaturesSubcomponentsImpl implements OutletMgtFeaturesSubcomponents {
        private OutletMgtFeaturesSubcomponentsImpl() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AcceptOrDeclineLinkingRequest acceptOrDeclineLinkingRequest() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            AcceptOrDeclineLinkingRequest $r1 = new AcceptOrDeclineLinkingRequest($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ChildOutletInformationRepository childOutletInformationRepository() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            FetchLocation $r4 = fetchLocation();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r22.networkService();
            ChildOutletInformationRepository $r1 = new ChildOutletInformationRepository($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ChildOutletInformationViewModel childOutletInformationViewModel() {
            ChildOutletInformationRepository $r2 = childOutletInformationRepository();
            FetchOutletDetails $r3 = fetchOutletDetails();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            ChildOutletInformationViewModel $r1 = new ChildOutletInformationViewModel($r2, $r3, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchLocation fetchLocation() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesUserServiceProvider;
            Object $r4 = $r3.get();
            UserService $r5 = (UserService) $r4;
            FetchLocation $r1 = new FetchLocation($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchOutletDetails fetchOutletDetails() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchOutletDetails $r1 = new FetchOutletDetails($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ChildOutletInformationActivity injectChildOutletInformationActivity(ChildOutletInformationActivity childOutletInformationActivity) {
            ChildOutletInformationViewModel $r2 = childOutletInformationViewModel();
            ChildOutletInformationActivity_MembersInjector.injectScreenViewModel(childOutletInformationActivity, $r2);
            return childOutletInformationActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtAcceptDeclineActivity injectOutletMgtAcceptDeclineActivity(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity) {
            OutletMgtAcceptDeclineVm $r2 = outletMgtAcceptDeclineVm();
            OutletMgtAcceptDeclineActivity_MembersInjector.injectOutletMgtAcceptDeclineVm(outletMgtAcceptDeclineActivity, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesFrequentlyUsedSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            OutletMgtAcceptDeclineActivity_MembersInjector.injectSharedPreferences(outletMgtAcceptDeclineActivity, $r6);
            return outletMgtAcceptDeclineActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletTopUpActivity injectOutletTopUpActivity(OutletTopUpActivity outletTopUpActivity) {
            OutletTopUpPresenter $r2 = new OutletTopUpPresenter();
            OutletTopUpActivity_MembersInjector.injectScreenPresenter(outletTopUpActivity, $r2);
            return outletTopUpActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletTopUpAmountFragment injectOutletTopUpAmountFragment(OutletTopUpAmountFragment outletTopUpAmountFragment) {
            OutletTopUpAmtViewModel $r2 = outletTopUpAmtViewModel();
            BaseAmountInputFragment_MembersInjector.injectScreenViewModel(outletTopUpAmountFragment, $r2);
            OutletTopUpAmtViewModel $r22 = outletTopUpAmtViewModel();
            OutletTopUpAmountFragment_MembersInjector.injectOutletTopUpAmtViewModel(outletTopUpAmountFragment, $r22);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesFrequentlyUsedSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            OutletTopUpAmountFragment_MembersInjector.injectSharedPreferences(outletTopUpAmountFragment, $r6);
            return outletTopUpAmountFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtAcceptDeclineVm outletMgtAcceptDeclineVm() {
            AcceptOrDeclineLinkingRequest $r2 = acceptOrDeclineLinkingRequest();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            OutletMgtAcceptDeclineVm $r1 = new OutletMgtAcceptDeclineVm($r2, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletTopUpAmtViewModel outletTopUpAmtViewModel() {
            PerformOutletTopUp $r2 = performOutletTopUp();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            OutletTopUpAmtViewModel $r1 = new OutletTopUpAmtViewModel($r2, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PerformOutletTopUp performOutletTopUp() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            PerformOutletTopUp $r1 = new PerformOutletTopUp($r2);
            return $r1;
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents
        public void inject(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity) {
            injectOutletMgtAcceptDeclineActivity(outletMgtAcceptDeclineActivity);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents
        public void inject(OutletTopUpActivity outletTopUpActivity) {
            injectOutletTopUpActivity(outletTopUpActivity);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents
        public void inject(ChildOutletInformationActivity childOutletInformationActivity) {
            injectChildOutletInformationActivity(childOutletInformationActivity);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents
        public void inject(OutletTopUpAmountFragment outletTopUpAmountFragment) {
            injectOutletTopUpAmountFragment(outletTopUpAmountFragment);
        }
    }

    /* loaded from: classes.dex */
    final class OutletMgtSubComponentFactory implements OutletMgtSubComponent.Factory {
        private OutletMgtSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent.Factory
        public OutletMgtSubComponent create(OutletMgtNavigator outletMgtNavigator, TransactionsNavigator transactionsNavigator, IncompleteTransactionsNavigator incompleteTransactionsNavigator) {
            C9473g.m14650b(outletMgtNavigator);
            C9473g.m14650b(transactionsNavigator);
            C9473g.m14650b(incompleteTransactionsNavigator);
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            OutletMgtSubComponentImpl $r5 = new OutletMgtSubComponentImpl(outletMgtNavigator, transactionsNavigator, incompleteTransactionsNavigator);
            return $r5;
        }
    }

    /* loaded from: classes.dex */
    final class OutletMgtSubComponentImpl implements OutletMgtSubComponent {
        private final IncompleteTransactionsNavigator incompleteTransactionsNavigator;
        private final OutletMgtNavigator outletMgtNavigator;
        private final TransactionsNavigator transactionsNavigator;

        private OutletMgtSubComponentImpl(OutletMgtNavigator outletMgtNavigator, TransactionsNavigator transactionsNavigator, IncompleteTransactionsNavigator incompleteTransactionsNavigator) {
            this.outletMgtNavigator = outletMgtNavigator;
            this.transactionsNavigator = transactionsNavigator;
            this.incompleteTransactionsNavigator = incompleteTransactionsNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BuzzPendingOutlet buzzPendingOutlet() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            BuzzPendingOutlet $r1 = new BuzzPendingOutlet($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ChildOutletInformationRepository childOutletInformationRepository() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            FetchLocation $r4 = fetchLocation();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r22.networkService();
            ChildOutletInformationRepository $r1 = new ChildOutletInformationRepository($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateOutlet createOutlet() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            CreateOutlet $r1 = new CreateOutlet($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateOutletViewModel createOutletViewModel() {
            ChildOutletInformationRepository $r3 = childOutletInformationRepository();
            OutletMgtNavigator $r1 = this.outletMgtNavigator;
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            ResendOtp $r6 = $r42.resendOtp();
            DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
            Analytics $r7 = $r43.analytics();
            CreateOutletViewModel $r2 = new CreateOutletViewModel($r3, $r1, $r5, $r6, $r7);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchIncompleteTransactions fetchIncompleteTransactions() {
            RxSchedulers $r2 = new RxSchedulers();
            TransactionsRepository $r3 = transactionsRepository();
            FetchIncompleteTransactions $r1 = new FetchIncompleteTransactions($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchLocation fetchLocation() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesUserServiceProvider;
            Object $r4 = $r3.get();
            UserService $r5 = (UserService) $r4;
            FetchLocation $r1 = new FetchLocation($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchOutletDetails fetchOutletDetails() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchOutletDetails $r1 = new FetchOutletDetails($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchOutletForHq fetchOutletForHq() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchOutletForHq $r1 = new FetchOutletForHq($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchOutletWalletHistory fetchOutletWalletHistory() {
            TransactionsRepository $r2 = transactionsRepository();
            FetchOutletWalletHistory $r1 = new FetchOutletWalletHistory($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchWalletActivities fetchWalletActivities() {
            TransactionsRepository $r3 = transactionsRepository();
            RxSchedulers $r2 = new RxSchedulers();
            FetchWalletActivities $r1 = new FetchWalletActivities($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FilterTransactionsViewModel filterTransactionsViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            FetchWalletActivities $r5 = fetchWalletActivities();
            SearchTransactionsUseCase $r6 = searchTransactionsUseCase();
            ServerTimeToTransactionDayMapper $r7 = serverTimeToTransactionDayMapper();
            TransactionDataToUiMapper $r1 = new TransactionDataToUiMapper();
            FetchOutletWalletHistory $r8 = fetchOutletWalletHistory();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            CacheModule $r9 = $r32.cacheModule;
            Pref $r10 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r9);
            ResourceDelegate $r11 = resourceDelegate();
            FilterTransactionsViewModel $r2 = new FilterTransactionsViewModel($r4, $r5, $r6, $r7, $r1, $r8, $r10, $r11);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetOutletTransactionSummaryUseCase getOutletTransactionSummaryUseCase() {
            TransactionsRepository $r2 = transactionsRepository();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            GetOutletTransactionSummaryUseCase $r1 = new GetOutletTransactionSummaryUseCase($r2, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetTransactionSummaryUseCase getTransactionSummaryUseCase() {
            TransactionsRepository $r2 = transactionsRepository();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            GetTransactionSummaryUseCase $r1 = new GetTransactionSummaryUseCase($r2, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IncompleteTransactionsViewModel incompleteTransactionsViewModel() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            FetchIncompleteTransactions $r6 = fetchIncompleteTransactions();
            TransactionDataToUiMapper $r1 = new TransactionDataToUiMapper();
            ServerTimeToTransactionDayMapper $r7 = serverTimeToTransactionDayMapper();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            CacheModule $r8 = $r42.cacheModule;
            Pref $r9 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r8);
            IncompleteTransactionsNavigator $r2 = this.incompleteTransactionsNavigator;
            IncompleteTransactionsViewModel $r3 = new IncompleteTransactionsViewModel($r5, $r6, $r1, $r7, $r9, $r2);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateOutletFragment injectCreateOutletFragment(CreateOutletFragment createOutletFragment) {
            CreateOutletViewModel $r2 = createOutletViewModel();
            CreateOutletFragment_MembersInjector.injectCreateOutletViewModel(createOutletFragment, $r2);
            return createOutletFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FilterTransactionsFragment injectFilterTransactionsFragment(FilterTransactionsFragment filterTransactionsFragment) {
            FilterTransactionsViewModel $r2 = filterTransactionsViewModel();
            FilterTransactionsFragment_MembersInjector.injectViewModel(filterTransactionsFragment, $r2);
            return filterTransactionsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IncompleteTransactionsFragment injectIncompleteTransactionsFragment(IncompleteTransactionsFragment incompleteTransactionsFragment) {
            IncompleteTransactionsViewModel $r2 = incompleteTransactionsViewModel();
            IncompleteTransactionsFragment_MembersInjector.injectViewModel(incompleteTransactionsFragment, $r2);
            return incompleteTransactionsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ManageOutletFragment injectManageOutletFragment(ManageOutletFragment manageOutletFragment) {
            ManageOutletViewModel $r2 = manageOutletViewModel();
            ManageOutletFragment_MembersInjector.injectManageOutletViewModel(manageOutletFragment, $r2);
            return manageOutletFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletLinkingBuzzAgentFragment injectOutletLinkingBuzzAgentFragment(OutletLinkingBuzzAgentFragment outletLinkingBuzzAgentFragment) {
            OutletLinkingBuzzAgentViewModel $r2 = outletLinkingBuzzAgentViewModel();
            OutletLinkingBuzzAgentFragment_MembersInjector.injectScreenViewModel(outletLinkingBuzzAgentFragment, $r2);
            return outletLinkingBuzzAgentFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletLinkingFormFragment injectOutletLinkingFormFragment(OutletLinkingFormFragment outletLinkingFormFragment) {
            OutletLinkingFormViewModel $r2 = outletLinkingFormViewModel();
            OutletLinkingFormFragment_MembersInjector.injectScreenViewModel(outletLinkingFormFragment, $r2);
            return outletLinkingFormFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtAcctFragment injectOutletMgtAcctFragment(OutletMgtAcctFragment outletMgtAcctFragment) {
            ManageOutletViewModel $r2 = manageOutletViewModel();
            OutletMgtAcctFragment_MembersInjector.injectManageOutletVieModel(outletMgtAcctFragment, $r2);
            return outletMgtAcctFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtActivity injectOutletMgtActivity(OutletMgtActivity outletMgtActivity) {
            OutletMgtPresenter $r2 = outletMgtPresenter();
            OutletMgtActivity_MembersInjector.injectScreenPresenter(outletMgtActivity, $r2);
            return outletMgtActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtCreateAcctOptionsFragment injectOutletMgtCreateAcctOptionsFragment(OutletMgtCreateAcctOptionsFragment outletMgtCreateAcctOptionsFragment) {
            OutletsListingViewModel $r2 = outletsListingViewModel();
            OutletMgtCreateAcctOptionsFragment_MembersInjector.injectViewModel(outletMgtCreateAcctOptionsFragment, $r2);
            return outletMgtCreateAcctOptionsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtCreatePinFragment injectOutletMgtCreatePinFragment(OutletMgtCreatePinFragment outletMgtCreatePinFragment) {
            OutletMgtCreatePinViewModel $r2 = outletMgtCreatePinViewModel();
            OutletMgtCreatePinFragment_MembersInjector.injectOutletMgtCreatePinViewModel(outletMgtCreatePinFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.provideFirebaseConfigProvider;
            Object $r5 = $r4.get();
            Frame $r6 = (Frame) $r5;
            OutletMgtCreatePinFragment_MembersInjector.injectRemoteConfig(outletMgtCreatePinFragment, $r6);
            return outletMgtCreatePinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtPersonalFragment injectOutletMgtPersonalFragment(OutletMgtPersonalFragment outletMgtPersonalFragment) {
            ManageOutletViewModel $r2 = manageOutletViewModel();
            OutletMgtPersonalFragment_MembersInjector.injectManageOutletViewModel(outletMgtPersonalFragment, $r2);
            return outletMgtPersonalFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtResetPinFragment injectOutletMgtResetPinFragment(OutletMgtResetPinFragment outletMgtResetPinFragment) {
            OutletResetPinViewModel $r2 = outletResetPinViewModel();
            OutletMgtResetPinFragment_MembersInjector.injectOutletResetPinViewModel(outletMgtResetPinFragment, $r2);
            return outletMgtResetPinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtSecurityFragment injectOutletMgtSecurityFragment(OutletMgtSecurityFragment outletMgtSecurityFragment) {
            OutletSecurityViewModel $r2 = outletSecurityViewModel();
            OutletMgtSecurityFragment_MembersInjector.injectOutletMgtSecurityViewModel(outletMgtSecurityFragment, $r2);
            return outletMgtSecurityFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletsListingFragment injectOutletsListingFragment(OutletsListingFragment outletsListingFragment) {
            OutletsListingViewModel $r2 = outletsListingViewModel();
            OutletsListingFragment_MembersInjector.injectScreenViewModel(outletsListingFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            OutletsListingFragment_MembersInjector.injectSharedPreferences(outletsListingFragment, $r6);
            return outletsListingFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionsContainerFragment injectTransactionsContainerFragment(TransactionsContainerFragment transactionsContainerFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            DispatchingAndroidInjector $r3 = $r2.dispatchingAndroidInjectorOfObject();
            TransactionsContainerFragment_MembersInjector.injectAndroidInjector(transactionsContainerFragment, $r3);
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r22.providesFrequentlyUsedSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            TransactionsContainerFragment_MembersInjector.injectSharedPreferences(transactionsContainerFragment, $r6);
            TransactionsViewModel $r7 = transactionsViewModel();
            TransactionsContainerFragment_MembersInjector.injectViewModel(transactionsContainerFragment, $r7);
            return transactionsContainerFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionsFragment injectTransactionsFragment(TransactionsFragment transactionsFragment) {
            TransactionsViewModel $r2 = transactionsViewModel();
            TransactionsFragment_MembersInjector.injectViewModel(transactionsFragment, $r2);
            return transactionsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ManageOutletViewModel manageOutletViewModel() {
            FetchOutletDetails $r2 = fetchOutletDetails();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            ManageOutletViewModel $r1 = new ManageOutletViewModel($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletLinkingBuzzAgentViewModel outletLinkingBuzzAgentViewModel() {
            BuzzPendingOutlet $r2 = buzzPendingOutlet();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            OutletLinkingBuzzAgentViewModel $r1 = new OutletLinkingBuzzAgentViewModel($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletLinkingFormViewModel outletLinkingFormViewModel() {
            SubmitLinkingRequest $r2 = submitLinkingRequest();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            OutletLinkingFormViewModel $r1 = new OutletLinkingFormViewModel($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtCreatePinViewModel outletMgtCreatePinViewModel() {
            OutletMgtNavigator $r2 = this.outletMgtNavigator;
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            CreateOutlet $r5 = createOutlet();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r6 = $r32.analytics();
            OutletMgtCreatePinViewModel $r1 = new OutletMgtCreatePinViewModel($r2, $r4, $r5, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletMgtPresenter outletMgtPresenter() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            BaseOtpUtil $r3 = $r4.baseOtpUtil();
            OutletMgtNavigator $r2 = this.outletMgtNavigator;
            OutletMgtPresenter $r1 = new OutletMgtPresenter($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletResetPinViewModel outletResetPinViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r2 = $r3.fetchCurrentUser();
            OutletResetPinViewModel $r1 = new OutletResetPinViewModel($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletSecurityViewModel outletSecurityViewModel() {
            SuspendOutlet $r2 = suspendOutlet();
            UnsuspendOutlet $r3 = unsuspendOutlet();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            ResetOutletPin $r6 = resetOutletPin();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            Analytics $r7 = $r42.analytics();
            OutletSecurityViewModel $r1 = new OutletSecurityViewModel($r2, $r3, $r5, $r6, $r7);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OutletsListingViewModel outletsListingViewModel() {
            FetchOutletForHq $r2 = fetchOutletForHq();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            OutletsListingViewModel $r1 = new OutletsListingViewModel($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResetOutletPin resetOutletPin() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            ResetOutletPin $r1 = new ResetOutletPin($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SearchTransactionsUseCase searchTransactionsUseCase() {
            RxSchedulers $r2 = new RxSchedulers();
            TransactionsRepository $r3 = transactionsRepository();
            SearchTransactionsUseCase $r1 = new SearchTransactionsUseCase($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper() {
            ResourceDelegate $r2 = resourceDelegate();
            ServerTimeToTransactionDayMapper $r1 = new ServerTimeToTransactionDayMapper($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SubmitLinkingRequest submitLinkingRequest() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            SubmitLinkingRequest $r1 = new SubmitLinkingRequest($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SuspendOutlet suspendOutlet() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            SuspendOutlet $r1 = new SuspendOutlet($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionsRepository transactionsRepository() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            TransactionsRemoteSource $r4 = $r3.transactionsRemoteSource();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            TransactionsLocalSource $r5 = $r32.transactionsLocalSource();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            TransactionsSummaryLocalSource $r6 = $r33.transactionsSummaryLocalSource();
            RxSchedulers $r2 = new RxSchedulers();
            TransactionsRepository $r1 = new TransactionsRepository($r4, $r5, $r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionsViewModel transactionsViewModel() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            Analytics $r6 = $r42.analytics();
            TransactionsNavigator $r1 = this.transactionsNavigator;
            FetchWalletActivities $r7 = fetchWalletActivities();
            GetTransactionSummaryUseCase $r8 = getTransactionSummaryUseCase();
            GetOutletTransactionSummaryUseCase $r9 = getOutletTransactionSummaryUseCase();
            ServerTimeToTransactionDayMapper $r10 = serverTimeToTransactionDayMapper();
            TransactionDataToUiMapper $r2 = new TransactionDataToUiMapper();
            FetchOutletWalletHistory $r11 = fetchOutletWalletHistory();
            DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
            CacheModule $r12 = $r43.cacheModule;
            Pref $r13 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r12);
            ResourceDelegate $r14 = resourceDelegate();
            TransactionsViewModel $r3 = new TransactionsViewModel($r5, $r6, $r1, $r7, $r8, $r9, $r10, $r2, $r11, $r13, $r14);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UnsuspendOutlet unsuspendOutlet() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            UnsuspendOutlet $r1 = new UnsuspendOutlet($r2);
            return $r1;
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletMgtActivity outletMgtActivity) {
            injectOutletMgtActivity(outletMgtActivity);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(CreateOutletFragment createOutletFragment) {
            injectCreateOutletFragment(createOutletFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(ManageOutletFragment manageOutletFragment) {
            injectManageOutletFragment(manageOutletFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletLinkingBuzzAgentFragment outletLinkingBuzzAgentFragment) {
            injectOutletLinkingBuzzAgentFragment(outletLinkingBuzzAgentFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletLinkingFormFragment outletLinkingFormFragment) {
            injectOutletLinkingFormFragment(outletLinkingFormFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletMgtAcctFragment outletMgtAcctFragment) {
            injectOutletMgtAcctFragment(outletMgtAcctFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletMgtCreateAcctOptionsFragment outletMgtCreateAcctOptionsFragment) {
            injectOutletMgtCreateAcctOptionsFragment(outletMgtCreateAcctOptionsFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletMgtCreatePinFragment outletMgtCreatePinFragment) {
            injectOutletMgtCreatePinFragment(outletMgtCreatePinFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletMgtPersonalFragment outletMgtPersonalFragment) {
            injectOutletMgtPersonalFragment(outletMgtPersonalFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletMgtResetPinFragment outletMgtResetPinFragment) {
            injectOutletMgtResetPinFragment(outletMgtResetPinFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletMgtSecurityFragment outletMgtSecurityFragment) {
            injectOutletMgtSecurityFragment(outletMgtSecurityFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(OutletsListingFragment outletsListingFragment) {
            injectOutletsListingFragment(outletsListingFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(FilterTransactionsFragment filterTransactionsFragment) {
            injectFilterTransactionsFragment(filterTransactionsFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(IncompleteTransactionsFragment incompleteTransactionsFragment) {
            injectIncompleteTransactionsFragment(incompleteTransactionsFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(TransactionsContainerFragment transactionsContainerFragment) {
            injectTransactionsContainerFragment(transactionsContainerFragment);
        }

        @Override // ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent
        public void inject(TransactionsFragment transactionsFragment) {
            injectTransactionsFragment(transactionsFragment);
        }
    }

    /* loaded from: classes.dex */
    final class PendingKycSubComponentFactory implements PendingKycSubComponent.Factory {
        private PendingKycSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.register.xmpp.components.PendingKycSubComponent.Factory
        public PendingKycSubComponent create(PendingKycNavigator pendingKycNavigator) {
            C9473g.m14650b(pendingKycNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            PendingKycSubComponentImpl $r2 = new PendingKycSubComponentImpl(pendingKycNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class PendingKycSubComponentImpl implements PendingKycSubComponent {
        private final PendingKycNavigator registerV2Navigator;

        private PendingKycSubComponentImpl(PendingKycNavigator pendingKycNavigator) {
            this.registerV2Navigator = pendingKycNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IdTypesViewModel idTypesViewModel() {
            IdtypeRepository $r2 = idtypeRepository();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            ApplicationModule $r4 = $r3.applicationModule;
            C5615f $r5 = ApplicationModule_ProvidesFirebaseDbFactory.providesFirebaseDb($r4);
            IdTypesViewModel $r1 = new IdTypesViewModel($r2, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IdtypeRepository idtypeRepository() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesCoreAppDatabaseProvider;
            Object $r4 = $r3.get();
            CoreAppDatabase $r5 = (CoreAppDatabase) $r4;
            IdtypeRepository $r1 = new IdtypeRepository($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IdtypesFragment injectIdtypesFragment(IdtypesFragment idtypesFragment) {
            IdTypesViewModel $r2 = idTypesViewModel();
            IdtypesFragment_MembersInjector.injectIdTypesViewModel(idtypesFragment, $r2);
            return idtypesFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingKycFormFragment injectPendingKycFormFragment(PendingKycFormFragment pendingKycFormFragment) {
            PendingKycViewModel $r2 = pendingKycViewModel();
            PendingKycFormFragment_MembersInjector.injectPendingKycViewModel(pendingKycFormFragment, $r2);
            return pendingKycFormFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingKycViewModel pendingKycViewModel() {
            VerifyId $r3 = verifyId();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            LoginUser $r5 = $r4.loginUser();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            InterfaceC11700a $r6 = $r42.providesDeviceSecuritySharedPrefsProvider;
            Object $r7 = $r6.get();
            SharedPreferences $r8 = (SharedPreferences) $r7;
            PendingKycNavigator $r1 = this.registerV2Navigator;
            DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
            Analytics $r9 = $r43.analytics();
            PendingKycViewModel $r2 = new PendingKycViewModel($r3, $r5, $r8, $r1, $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyId verifyId() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            VerifyId $r1 = new VerifyId($r2);
            return $r1;
        }

        @Override // ai.kudi.agent.register.xmpp.components.PendingKycSubComponent
        public void inject(PendingKycActivity pendingKycActivity) {
        }

        @Override // ai.kudi.agent.register.xmpp.components.PendingKycSubComponent
        public void inject(PendingKycFormFragment pendingKycFormFragment) {
            injectPendingKycFormFragment(pendingKycFormFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.PendingKycSubComponent
        public void inject(IdtypesFragment idtypesFragment) {
            injectIdtypesFragment(idtypesFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class PicturePickerFragmentSubcomponentFactory implements PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent.Factory {
        private PicturePickerFragmentSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent create(PicturePickerFragment picturePickerFragment) {
            C9473g.m14650b(picturePickerFragment);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            PicturePickerFragmentSubcomponentImpl $r2 = new PicturePickerFragmentSubcomponentImpl(picturePickerFragment);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            PicturePickerFragment $r3 = (PicturePickerFragment) obj;
            PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class PicturePickerFragmentSubcomponentImpl implements PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent {
        private PicturePickerFragmentSubcomponentImpl(PicturePickerFragment picturePickerFragment) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PicturePickerFragment injectPicturePickerFragment(PicturePickerFragment picturePickerFragment) {
            PicturePickerPresenter $r2 = picturePickerPresenter();
            PicturePickerFragment_MembersInjector.injectScreenPresenter(picturePickerFragment, $r2);
            return picturePickerFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PicturePickerPresenter picturePickerPresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            SaveImage $r2 = $r3.saveImage();
            PicturePickerPresenter $r1 = new PicturePickerPresenter($r2);
            return $r1;
        }

        public void inject(PicturePickerFragment picturePickerFragment) {
            injectPicturePickerFragment(picturePickerFragment);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            PicturePickerFragment $r2 = (PicturePickerFragment) obj;
            inject($r2);
        }
    }

    /* loaded from: classes.dex */
    final class PictureUploadSubComponentFactory implements PictureUploadSubComponent.Factory {
        private PictureUploadSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.pictureupload.labs.PictureUploadSubComponent.Factory
        public PictureUploadSubComponent create(ImageSelectorNavigator imageSelectorNavigator) {
            C9473g.m14650b(imageSelectorNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            PictureUploadSubComponentImpl $r2 = new PictureUploadSubComponentImpl(imageSelectorNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class PictureUploadSubComponentImpl implements PictureUploadSubComponent {
        private final ImageSelectorNavigator navigator;

        private PictureUploadSubComponentImpl(ImageSelectorNavigator imageSelectorNavigator) {
            this.navigator = imageSelectorNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PictureUploadFragment injectPictureUploadFragment(PictureUploadFragment pictureUploadFragment) {
            PictureUploadViewModel $r2 = pictureUploadViewModel();
            PictureUploadFragment_MembersInjector.injectVm(pictureUploadFragment, $r2);
            return pictureUploadFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PictureUploadViewModel pictureUploadViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            SaveImage $r4 = $r3.saveImage();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            CheckPermission $r5 = $r32.namedCheckPermission();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            CheckPermission $r6 = $r33.namedCheckPermission2();
            ImageSelectorNavigator $r2 = this.navigator;
            PictureUploadViewModel $r1 = new PictureUploadViewModel($r4, $r5, $r6, $r2);
            return $r1;
        }

        @Override // ai.kudi.agent.pictureupload.labs.PictureUploadSubComponent
        public void inject(PictureUploadFragment pictureUploadFragment) {
            injectPictureUploadFragment(pictureUploadFragment);
        }
    }

    /* loaded from: classes.dex */
    final class PosSubComponentFactory implements PosSubComponent.Factory {
        private PosSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.pos.game.components.PosSubComponent.Factory
        public PosSubComponent create(TerminalRequestNavigator terminalRequestNavigator) {
            C9473g.m14650b(terminalRequestNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            PosSubComponentImpl $r2 = new PosSubComponentImpl(terminalRequestNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class PosSubComponentImpl implements PosSubComponent {
        private final TerminalRequestNavigator terminalRequestNavigator;

        private PosSubComponentImpl(TerminalRequestNavigator terminalRequestNavigator) {
            this.terminalRequestNavigator = terminalRequestNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ActivatePos activatePos() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            UserRepository $r5 = $r23.userRepository();
            ActivatePos $r1 = new ActivatePos($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ActivatePosViewModel activatePosViewModel() {
            ActivatePos $r2 = activatePos();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            ActivatePosViewModel $r1 = new ActivatePosViewModel($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CheckPosEligibility checkPosEligibility() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            CheckPosEligibility $r1 = new CheckPosEligibility($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchLocation fetchLocation() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesUserServiceProvider;
            Object $r4 = $r3.get();
            UserService $r5 = (UserService) $r4;
            FetchLocation $r1 = new FetchLocation($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchWallet fetchWallet() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchWallet $r1 = new FetchWallet($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesSharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            GetIsSuperAgentOrAggregator $r1 = new GetIsSuperAgentOrAggregator($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetPosDeviceInfo getPosDeviceInfo() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r4.fetchCurrentUser();
            RxSchedulers $r2 = new RxSchedulers();
            GetPosDeviceInfo $r1 = new GetPosDeviceInfo($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetPosDiscount getPosDiscount() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            GetPosDiscount $r1 = new GetPosDiscount($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetPosRequestsDetailUseCase getPosRequestsDetailUseCase() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r4 = $r3.networkService();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            RxSchedulers $r2 = new RxSchedulers();
            GetPosRequestsDetailUseCase $r1 = new GetPosRequestsDetailUseCase($r4, $r5, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetPosRequestsHistoryUseCase getPosRequestsHistoryUseCase() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r4 = $r3.networkService();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            RxSchedulers $r2 = new RxSchedulers();
            GetPosRequestsHistoryUseCase $r1 = new GetPosRequestsHistoryUseCase($r4, $r5, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetPosRequestsSummaryUseCase getPosRequestsSummaryUseCase() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            GetPosRequestsSummaryUseCase $r1 = new GetPosRequestsSummaryUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ActivatePosFragment injectActivatePosFragment(ActivatePosFragment activatePosFragment) {
            ActivatePosViewModel $r2 = activatePosViewModel();
            ActivatePosFragment_MembersInjector.injectActivatePosVm(activatePosFragment, $r2);
            return activatePosFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LeasePosTermsOfAgreementFragment injectLeasePosTermsOfAgreementFragment(LeasePosTermsOfAgreementFragment leasePosTermsOfAgreementFragment) {
            LeasePosAgreementVm $r2 = leasePosAgreementVm();
            LeasePosTermsOfAgreementFragment_MembersInjector.injectLeasePosAgreementVm(leasePosTermsOfAgreementFragment, $r2);
            return leasePosTermsOfAgreementFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OrderDetailsFragment injectOrderDetailsFragment(OrderDetailsFragment orderDetailsFragment) {
            OrderDetailsViewModel $r2 = orderDetailsViewModel();
            OrderDetailsFragment_MembersInjector.injectVm(orderDetailsFragment, $r2);
            GetIsSuperAgentOrAggregator $r3 = getIsSuperAgentOrAggregator();
            OrderDetailsFragment_MembersInjector.injectGetIsSuperAgentOrAggregator(orderDetailsFragment, $r3);
            return orderDetailsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosActivity injectPosActivity(PosActivity posActivity) {
            SmartLookAnalytics $r2 = new SmartLookAnalytics();
            PosActivity_MembersInjector.injectSmartLookAnalytics(posActivity, $r2);
            return posActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosDeliveryAddressFragment injectPosDeliveryAddressFragment(PosDeliveryAddressFragment posDeliveryAddressFragment) {
            PosDeliveryAddressViewModel $r2 = posDeliveryAddressViewModel();
            PosDeliveryAddressFragment_MembersInjector.injectPosDeliveryAddressViewModel(posDeliveryAddressFragment, $r2);
            return posDeliveryAddressFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosEligibilityFragment injectPosEligibilityFragment(PosEligibilityFragment posEligibilityFragment) {
            PosEligibilityViewModel $r2 = posEligibilityViewModel();
            PosEligibilityFragment_MembersInjector.injectPosEligibilityViewModel(posEligibilityFragment, $r2);
            TwoColumnTableAdapter $r3 = new TwoColumnTableAdapter();
            PosEligibilityFragment_MembersInjector.injectTwoColumnAdapter(posEligibilityFragment, $r3);
            return posEligibilityFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosOrderDetailFragment injectPosOrderDetailFragment(PosOrderDetailFragment posOrderDetailFragment) {
            PosOrderDetailViewModel $r2 = posOrderDetailViewModel();
            PosOrderDetailFragment_MembersInjector.injectViewModel(posOrderDetailFragment, $r2);
            return posOrderDetailFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosOrderHistoryFragment injectPosOrderHistoryFragment(PosOrderHistoryFragment posOrderHistoryFragment) {
            PosOrderHistoryViewModel $r2 = posOrderHistoryViewModel();
            PosOrderHistoryFragment_MembersInjector.injectViewModel(posOrderHistoryFragment, $r2);
            return posOrderHistoryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SelectPosFragment injectSelectPosFragment(SelectPosFragment selectPosFragment) {
            SelectPosViewModel $r2 = selectPosViewModel();
            SelectPosFragment_MembersInjector.injectViewModel(selectPosFragment, $r2);
            return selectPosFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LeasePosAgreementVm leasePosAgreementVm() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
            ResourceDelegate $r5 = resourceDelegate();
            LeasePosAgreementVm $r1 = new LeasePosAgreementVm($r4, $r2, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OrderDetailsViewModel orderDetailsViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            FetchWallet $r5 = fetchWallet();
            PosOrderRequest $r6 = posOrderRequest();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            InterfaceC11700a $r7 = $r32.providesSharedPrefsProvider;
            Object $r8 = $r7.get();
            SharedPreferences $r9 = (SharedPreferences) $r8;
            TerminalRequestNavigator $r1 = this.terminalRequestNavigator;
            OrderDetailsViewModel $r2 = new OrderDetailsViewModel($r4, $r5, $r6, $r9, $r1);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosDeliveryAddressViewModel posDeliveryAddressViewModel() {
            TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
            FetchLocation $r3 = fetchLocation();
            PosDeliveryAddressViewModel $r1 = new PosDeliveryAddressViewModel($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosEligibilityViewModel posEligibilityViewModel() {
            CheckPosEligibility $r3 = checkPosEligibility();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            GetPosDiscount $r6 = getPosDiscount();
            TerminalRequestNavigator $r1 = this.terminalRequestNavigator;
            PriceLookupRequest $r7 = priceLookupRequest();
            GetPosDeviceInfo $r8 = getPosDeviceInfo();
            TrackPosRequest $r9 = trackPosRequest();
            GetPosRequestsSummaryUseCase $r10 = getPosRequestsSummaryUseCase();
            GetIsSuperAgentOrAggregator $r11 = getIsSuperAgentOrAggregator();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            InterfaceC11700a $r12 = $r42.providesSharedPrefsProvider;
            Object $r13 = $r12.get();
            PosEligibilityViewModel $r2 = new PosEligibilityViewModel($r3, $r5, $r6, $r1, $r7, $r8, $r9, $r10, $r11, (SharedPreferences) $r13);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosOrderDetailViewModel posOrderDetailViewModel() {
            GetPosRequestsDetailUseCase $r2 = getPosRequestsDetailUseCase();
            ResourceDelegate $r3 = resourceDelegate();
            PosOrderDetailViewModel $r1 = new PosOrderDetailViewModel($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosOrderHistoryViewModel posOrderHistoryViewModel() {
            GetPosRequestsHistoryUseCase $r4 = getPosRequestsHistoryUseCase();
            ServerTimeToTransactionDayMapper $r5 = serverTimeToTransactionDayMapper();
            PosOrderDataToUiMapper $r1 = new PosOrderDataToUiMapper();
            TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
            ResourceDelegate $r6 = resourceDelegate();
            PosOrderHistoryViewModel $r3 = new PosOrderHistoryViewModel($r4, $r5, $r1, $r2, $r6);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosOrderRequest posOrderRequest() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            UserRepository $r4 = $r22.userRepository();
            PosOrderRequest $r1 = new PosOrderRequest($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PriceLookupRequest priceLookupRequest() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            PriceLookupRequest $r1 = new PriceLookupRequest($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SelectPosViewModel selectPosViewModel() {
            TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
            SelectPosViewModel $r1 = new SelectPosViewModel($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper() {
            ResourceDelegate $r2 = resourceDelegate();
            ServerTimeToTransactionDayMapper $r1 = new ServerTimeToTransactionDayMapper($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TrackPosRequest trackPosRequest() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            UserRepository $r4 = $r22.userRepository();
            TrackPosRequest $r1 = new TrackPosRequest($r3, $r4);
            return $r1;
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(LeasePosTermsOfAgreementFragment leasePosTermsOfAgreementFragment) {
            injectLeasePosTermsOfAgreementFragment(leasePosTermsOfAgreementFragment);
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(OrderDetailsFragment orderDetailsFragment) {
            injectOrderDetailsFragment(orderDetailsFragment);
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(PosActivity posActivity) {
            injectPosActivity(posActivity);
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(PosDeliveryAddressFragment posDeliveryAddressFragment) {
            injectPosDeliveryAddressFragment(posDeliveryAddressFragment);
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(PosEligibilityFragment posEligibilityFragment) {
            injectPosEligibilityFragment(posEligibilityFragment);
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(PosOrderDetailFragment posOrderDetailFragment) {
            injectPosOrderDetailFragment(posOrderDetailFragment);
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(PosOrderHistoryFragment posOrderHistoryFragment) {
            injectPosOrderHistoryFragment(posOrderHistoryFragment);
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(SelectPosFragment selectPosFragment) {
            injectSelectPosFragment(selectPosFragment);
        }

        @Override // ai.kudi.agent.pos.game.components.PosSubComponent
        public void inject(ActivatePosFragment activatePosFragment) {
            injectActivatePosFragment(activatePosFragment);
        }
    }

    /* loaded from: classes.dex */
    final class PostRegSetUpSubComponentFactory implements PostRegSetUpSubComponent.Factory {
        private PostRegSetUpSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent.Factory
        public PostRegSetUpSubComponent create() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            PostRegSetUpSubComponentImpl $r1 = new PostRegSetUpSubComponentImpl();
            return $r1;
        }
    }

    /* loaded from: classes.dex */
    final class PostRegSetUpSubComponentImpl implements PostRegSetUpSubComponent {
        private PostRegSetUpSubComponentImpl() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BankAccountViewModel bankAccountViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            AccountRepository $r4 = $r22.accountRepository();
            BankAccountViewModel $r1 = new BankAccountViewModel($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchOutletParent fetchOutletParent() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchOutletParent $r1 = new FetchOutletParent($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetMonthlyKycLevels getMonthlyKycLevels() {
            KycLevelRepository $r3 = kycLevelRepository();
            RxSchedulers $r2 = new RxSchedulers();
            GetMonthlyKycLevels $r1 = new GetMonthlyKycLevels($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BankAccountFragment injectBankAccountFragment(BankAccountFragment bankAccountFragment) {
            BankAccountViewModel $r2 = bankAccountViewModel();
            BankAccountFragment_MembersInjector.injectScreenViewModel(bankAccountFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.provideFirebaseConfigProvider;
            Object $r5 = $r4.get();
            Frame $r6 = (Frame) $r5;
            BankAccountFragment_MembersInjector.injectRemoteConfig(bankAccountFragment, $r6);
            return bankAccountFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpgradeAccountFragmentSetUp injectUpgradeAccountFragmentSetUp(UpgradeAccountFragmentSetUp upgradeAccountFragmentSetUp) {
            PersonalViewModel $r2 = personalViewModel();
            UpgradeAccountFragmentSetUp_MembersInjector.injectPersonalViewModel(upgradeAccountFragmentSetUp, $r2);
            return upgradeAccountFragmentSetUp;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KycLevelRemoteDataSource kycLevelRemoteDataSource() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            KycLevelRemoteDataSource $r1 = new KycLevelRemoteDataSource($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KycLevelRepository kycLevelRepository() {
            KycLevelRemoteDataSource $r2 = kycLevelRemoteDataSource();
            KycLevelsLocalDataSource $r3 = kycLevelsLocalDataSource();
            KycLevelRepository $r1 = new KycLevelRepository($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KycLevelsLocalDataSource kycLevelsLocalDataSource() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesCoreAppDatabaseProvider;
            Object $r5 = $r4.get();
            CoreAppDatabase $r6 = (CoreAppDatabase) $r5;
            RxSchedulers $r2 = new RxSchedulers();
            KycLevelsLocalDataSource $r1 = new KycLevelsLocalDataSource($r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PersonalViewModel personalViewModel() {
            Profile $r2 = profile();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            FetchOutletParent $r5 = fetchOutletParent();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            CacheModule $r6 = $r32.cacheModule;
            Pref $r7 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r6);
            GetMonthlyKycLevels $r8 = getMonthlyKycLevels();
            PersonalViewModel $r1 = new PersonalViewModel($r2, $r4, $r5, $r7, $r8);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private Profile profile() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            UserRepository $r2 = $r3.userRepository();
            Profile $r1 = new Profile($r2);
            return $r1;
        }

        @Override // ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent
        public void inject(PostRegistrationActivity postRegistrationActivity) {
        }

        @Override // ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent
        public void inject(UpgradeAccountFragmentSetUp upgradeAccountFragmentSetUp) {
            injectUpgradeAccountFragmentSetUp(upgradeAccountFragmentSetUp);
        }

        @Override // ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent
        public void inject(BankAccountFragment bankAccountFragment) {
            injectBankAccountFragment(bankAccountFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class ProductActivitySubcomponentFactory implements ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent.Factory {
        private ProductActivitySubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent create(ProductActivity productActivity) {
            C9473g.m14650b(productActivity);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            ProductActivitySubcomponentImpl $r2 = new ProductActivitySubcomponentImpl(productActivity);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            ProductActivity $r3 = (ProductActivity) obj;
            ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class ProductActivitySubcomponentImpl implements ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent {
        private InterfaceC11700a<ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent.Factory> airtimeAmountFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent.Factory> airtimeTopUpFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent.Factory> amountFragmentSubcomponentFactoryProvider;
        private final ProductActivity arg0;
        private InterfaceC11700a<ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent.Factory> billPaymentCustomerDetailsFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent.Factory> billPaymentStepOneFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent.Factory> payBillsFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent.Factory> productSummaryFragmentSubcomponentFactoryProvider;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class AirtimeAmountFragmentSubcomponentFactory implements ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent.Factory {
            private AirtimeAmountFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent create(AirtimeAmountFragment airtimeAmountFragment) {
                C9473g.m14650b(airtimeAmountFragment);
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                AirtimeAmountFragmentSubcomponentImpl $r2 = new AirtimeAmountFragmentSubcomponentImpl(airtimeAmountFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                AirtimeAmountFragment $r3 = (AirtimeAmountFragment) obj;
                ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class AirtimeAmountFragmentSubcomponentImpl implements ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent {
            private AirtimeAmountFragmentSubcomponentImpl(AirtimeAmountFragment airtimeAmountFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private AirtimeAndDataPresenter airtimeAndDataPresenter() {
                ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                ProductActivity $r3 = $r2.arg0;
                ProductActivitySubcomponentImpl $r22 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                ProductActivitySubcomponentImpl $r23 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                PerformServiceFeeLookup $r6 = $r42.performServiceFeeLookup();
                ProductActivitySubcomponentImpl $r24 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                Analytics $r7 = $r43.analytics();
                ProductActivitySubcomponentImpl $r25 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r44 = DaggerApplicationComponent.this;
                InterfaceC11700a $r8 = $r44.providesFrequentlyUsedSharedPrefsProvider;
                Object $r9 = $r8.get();
                ProductActivitySubcomponentImpl $r26 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r45 = DaggerApplicationComponent.this;
                BillerRepository $r11 = $r45.billerRepository();
                AirtimeAndDataPresenter $r1 = new AirtimeAndDataPresenter($r3, $r5, $r6, $r7, (SharedPreferences) $r9, $r11);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private AirtimeAmountFragment injectAirtimeAmountFragment(AirtimeAmountFragment airtimeAmountFragment) {
                AirtimeAndDataPresenter $r2 = airtimeAndDataPresenter();
                AirtimeAmountFragment_MembersInjector.injectThisPresenter(airtimeAmountFragment, $r2);
                return airtimeAmountFragment;
            }

            public void inject(AirtimeAmountFragment airtimeAmountFragment) {
                injectAirtimeAmountFragment(airtimeAmountFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                AirtimeAmountFragment $r2 = (AirtimeAmountFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class AirtimeTopUpFragmentSubcomponentFactory implements ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent.Factory {
            private AirtimeTopUpFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent create(AirtimeTopUpFragment airtimeTopUpFragment) {
                C9473g.m14650b(airtimeTopUpFragment);
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                AirtimeTopUpFragmentSubcomponentImpl $r2 = new AirtimeTopUpFragmentSubcomponentImpl(airtimeTopUpFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                AirtimeTopUpFragment $r3 = (AirtimeTopUpFragment) obj;
                ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class AirtimeTopUpFragmentSubcomponentImpl implements ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent {
            private AirtimeTopUpFragmentSubcomponentImpl(AirtimeTopUpFragment airtimeTopUpFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private AirtimeAndDataPresenter airtimeAndDataPresenter() {
                ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                ProductActivity $r3 = $r2.arg0;
                ProductActivitySubcomponentImpl $r22 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                ProductActivitySubcomponentImpl $r23 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                PerformServiceFeeLookup $r6 = $r42.performServiceFeeLookup();
                ProductActivitySubcomponentImpl $r24 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
                Analytics $r7 = $r43.analytics();
                ProductActivitySubcomponentImpl $r25 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r44 = DaggerApplicationComponent.this;
                InterfaceC11700a $r8 = $r44.providesFrequentlyUsedSharedPrefsProvider;
                Object $r9 = $r8.get();
                ProductActivitySubcomponentImpl $r26 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r45 = DaggerApplicationComponent.this;
                BillerRepository $r11 = $r45.billerRepository();
                AirtimeAndDataPresenter $r1 = new AirtimeAndDataPresenter($r3, $r5, $r6, $r7, (SharedPreferences) $r9, $r11);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private AirtimeTopUpFragment injectAirtimeTopUpFragment(AirtimeTopUpFragment airtimeTopUpFragment) {
                AirtimeAndDataPresenter $r2 = airtimeAndDataPresenter();
                AirtimeTopUpFragment_MembersInjector.injectThisPresenter(airtimeTopUpFragment, $r2);
                SmartLookAnalytics $r3 = new SmartLookAnalytics();
                AirtimeTopUpFragment_MembersInjector.injectSmartLookAnalytics(airtimeTopUpFragment, $r3);
                return airtimeTopUpFragment;
            }

            public void inject(AirtimeTopUpFragment airtimeTopUpFragment) {
                injectAirtimeTopUpFragment(airtimeTopUpFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                AirtimeTopUpFragment $r2 = (AirtimeTopUpFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class AmountFragmentSubcomponentFactory implements ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent.Factory {
            private AmountFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent create(AmountFragment amountFragment) {
                C9473g.m14650b(amountFragment);
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                AmountFragmentSubcomponentImpl $r2 = new AmountFragmentSubcomponentImpl(amountFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                AmountFragment $r3 = (AmountFragment) obj;
                ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class AmountFragmentSubcomponentImpl implements ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent {
            private AmountFragmentSubcomponentImpl(AmountFragment amountFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private AmountFragment injectAmountFragment(AmountFragment amountFragment) {
                AmountPresenter $r2 = new AmountPresenter();
                AmountFragment_MembersInjector.injectThisPresenter(amountFragment, $r2);
                return amountFragment;
            }

            public void inject(AmountFragment amountFragment) {
                injectAmountFragment(amountFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                AmountFragment $r2 = (AmountFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class BillPaymentCustomerDetailsFragmentSubcomponentFactory implements ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent.Factory {
            private BillPaymentCustomerDetailsFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent create(BillPaymentCustomerDetailsFragment billPaymentCustomerDetailsFragment) {
                C9473g.m14650b(billPaymentCustomerDetailsFragment);
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                BillPaymentCustomerDetailsFragmentSubcomponentImpl $r2 = new BillPaymentCustomerDetailsFragmentSubcomponentImpl(billPaymentCustomerDetailsFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                BillPaymentCustomerDetailsFragment $r3 = (BillPaymentCustomerDetailsFragment) obj;
                ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class BillPaymentCustomerDetailsFragmentSubcomponentImpl implements ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent {
            private BillPaymentCustomerDetailsFragmentSubcomponentImpl(BillPaymentCustomerDetailsFragment billPaymentCustomerDetailsFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private BillPaymentStepTwoPresenter billPaymentStepTwoPresenter() {
                ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                PerformServiceFeeLookup $r4 = $r3.performServiceFeeLookup();
                ProductActivitySubcomponentImpl $r22 = ProductActivitySubcomponentImpl.this;
                ProductActivity $r5 = $r22.arg0;
                BillPaymentStepTwoPresenter $r1 = new BillPaymentStepTwoPresenter($r4, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private BillPaymentCustomerDetailsFragment injectBillPaymentCustomerDetailsFragment(BillPaymentCustomerDetailsFragment billPaymentCustomerDetailsFragment) {
                BillPaymentStepTwoPresenter $r2 = billPaymentStepTwoPresenter();
                BillPaymentCustomerDetailsFragment_MembersInjector.injectStepTwoPresenter(billPaymentCustomerDetailsFragment, $r2);
                return billPaymentCustomerDetailsFragment;
            }

            public void inject(BillPaymentCustomerDetailsFragment billPaymentCustomerDetailsFragment) {
                injectBillPaymentCustomerDetailsFragment(billPaymentCustomerDetailsFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                BillPaymentCustomerDetailsFragment $r2 = (BillPaymentCustomerDetailsFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class BillPaymentStepOneFragmentSubcomponentFactory implements ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent.Factory {
            private BillPaymentStepOneFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent create(BillPaymentStepOneFragment billPaymentStepOneFragment) {
                C9473g.m14650b(billPaymentStepOneFragment);
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                BillPaymentStepOneFragmentSubcomponentImpl $r2 = new BillPaymentStepOneFragmentSubcomponentImpl(billPaymentStepOneFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                BillPaymentStepOneFragment $r3 = (BillPaymentStepOneFragment) obj;
                ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class BillPaymentStepOneFragmentSubcomponentImpl implements ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent {
            private BillPaymentStepOneFragmentSubcomponentImpl(BillPaymentStepOneFragment billPaymentStepOneFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private BillPaymentStepOnePresenter billPaymentStepOnePresenter() {
                PerformBillerLookup $r2 = performBillerLookup();
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                BillerRepository $r5 = $r4.billerRepository();
                BillPaymentStepOnePresenter $r1 = new BillPaymentStepOnePresenter($r2, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private BillPaymentStepOneFragment injectBillPaymentStepOneFragment(BillPaymentStepOneFragment billPaymentStepOneFragment) {
                BillPaymentStepOnePresenter $r2 = billPaymentStepOnePresenter();
                BillPaymentStepOneFragment_MembersInjector.injectThisPresenter(billPaymentStepOneFragment, $r2);
                return billPaymentStepOneFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PerformBillerLookup performBillerLookup() {
                ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                InterfaceC11700a $r4 = $r3.providesCoreApiServiceProvider;
                Object $r5 = $r4.get();
                CoreApiService $r6 = (CoreApiService) $r5;
                ProductActivitySubcomponentImpl $r22 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                UserRepository $r7 = $r32.userRepository();
                PerformBillerLookup $r1 = new PerformBillerLookup($r6, $r7);
                return $r1;
            }

            public void inject(BillPaymentStepOneFragment billPaymentStepOneFragment) {
                injectBillPaymentStepOneFragment(billPaymentStepOneFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                BillPaymentStepOneFragment $r2 = (BillPaymentStepOneFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class PayBillsFragmentSubcomponentFactory implements ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent.Factory {
            private PayBillsFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent create(PayBillsFragment payBillsFragment) {
                C9473g.m14650b(payBillsFragment);
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                PayBillsFragmentSubcomponentImpl $r2 = new PayBillsFragmentSubcomponentImpl(payBillsFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                PayBillsFragment $r3 = (PayBillsFragment) obj;
                ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class PayBillsFragmentSubcomponentImpl implements ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent {
            private PayBillsFragmentSubcomponentImpl(PayBillsFragment payBillsFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private BillsListPresenter billsListPresenter() {
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                BillerRepository $r2 = $r4.billerRepository();
                BillsListPresenter $r1 = new BillsListPresenter($r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PayBillsFragment injectPayBillsFragment(PayBillsFragment payBillsFragment) {
                BillsListPresenter $r2 = billsListPresenter();
                PayBillsFragment_MembersInjector.injectThisPresenter(payBillsFragment, $r2);
                return payBillsFragment;
            }

            public void inject(PayBillsFragment payBillsFragment) {
                injectPayBillsFragment(payBillsFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                PayBillsFragment $r2 = (PayBillsFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ProductSummaryFragmentSubcomponentFactory implements ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent.Factory {
            private ProductSummaryFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent create(ProductSummaryFragment productSummaryFragment) {
                C9473g.m14650b(productSummaryFragment);
                ProductActivitySubcomponentImpl $r3 = ProductActivitySubcomponentImpl.this;
                ProductSummaryFragmentSubcomponentImpl $r2 = new ProductSummaryFragmentSubcomponentImpl(productSummaryFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                ProductSummaryFragment $r3 = (ProductSummaryFragment) obj;
                ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ProductSummaryFragmentSubcomponentImpl implements ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent {
            private ProductSummaryFragmentSubcomponentImpl(ProductSummaryFragment productSummaryFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ProductSummaryFragment injectProductSummaryFragment(ProductSummaryFragment productSummaryFragment) {
                ProductSummaryPresenter $r2 = productSummaryPresenter();
                ProductSummaryFragment_MembersInjector.injectThisPresenter(productSummaryFragment, $r2);
                return productSummaryFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ProductSummaryPresenter productSummaryPresenter() {
                ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                ProductActivitySubcomponentImpl $r22 = ProductActivitySubcomponentImpl.this;
                ProductActivity $r5 = $r22.arg0;
                ProductActivitySubcomponentImpl $r23 = ProductActivitySubcomponentImpl.this;
                ProductActivity $r6 = $r23.arg0;
                ProductActivitySubcomponentImpl $r24 = ProductActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                SubmitBillRequest $r7 = $r32.submitBillRequest();
                ProductSummaryPresenter $r1 = new ProductSummaryPresenter($r4, $r5, $r6, $r7);
                return $r1;
            }

            public void inject(ProductSummaryFragment productSummaryFragment) {
                injectProductSummaryFragment(productSummaryFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                ProductSummaryFragment $r2 = (ProductSummaryFragment) obj;
                inject($r2);
            }
        }

        private ProductActivitySubcomponentImpl(ProductActivity productActivity) {
            this.arg0 = productActivity;
            initialize(productActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DispatchingAndroidInjector dispatchingAndroidInjectorOfObject() {
            Map $r1 = mapOfClassOfAndProviderOfAndroidInjectorFactoryOf();
            Map $r2 = AbstractC5077j.m25724l();
            Map r4 = $r2;
            DispatchingAndroidInjector $r3 = C7428c.m18754a($r1, r4);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private void initialize(ProductActivity productActivity) {
            this.airtimeTopUpFragmentSubcomponentFactoryProvider = new InterfaceC11700a<ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.ProductActivitySubcomponentImpl.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent.Factory get() {
                    ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                    AirtimeTopUpFragmentSubcomponentFactory $r1 = new AirtimeTopUpFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent.Factory get2() {
                    ProductActivityModule_InjectAirtimeTopUpFragment.AirtimeTopUpFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.airtimeAmountFragmentSubcomponentFactoryProvider = new InterfaceC11700a<ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.ProductActivitySubcomponentImpl.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent.Factory get() {
                    ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                    AirtimeAmountFragmentSubcomponentFactory $r1 = new AirtimeAmountFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent.Factory get2() {
                    ProductActivityModule_InjectAirtimeAmountFragment.AirtimeAmountFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.productSummaryFragmentSubcomponentFactoryProvider = new InterfaceC11700a<ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.ProductActivitySubcomponentImpl.3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent.Factory get() {
                    ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                    ProductSummaryFragmentSubcomponentFactory $r1 = new ProductSummaryFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent.Factory get2() {
                    ProductActivityModule_InjectProductSummaryFragment.ProductSummaryFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.billPaymentStepOneFragmentSubcomponentFactoryProvider = new InterfaceC11700a<ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.ProductActivitySubcomponentImpl.4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent.Factory get() {
                    ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                    BillPaymentStepOneFragmentSubcomponentFactory $r1 = new BillPaymentStepOneFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent.Factory get2() {
                    ProductActivityModule_InjectBillPaymentStepOneFragment.BillPaymentStepOneFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.payBillsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.ProductActivitySubcomponentImpl.5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent.Factory get() {
                    ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                    PayBillsFragmentSubcomponentFactory $r1 = new PayBillsFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent.Factory get2() {
                    ProductActivityModule_InjectPayBillsFragment.PayBillsFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.billPaymentCustomerDetailsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.ProductActivitySubcomponentImpl.6
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent.Factory get() {
                    ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                    BillPaymentCustomerDetailsFragmentSubcomponentFactory $r1 = new BillPaymentCustomerDetailsFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent.Factory get2() {
                    ProductActivityModule_InjectBillPaymentCustomerDetailsFragment.BillPaymentCustomerDetailsFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.amountFragmentSubcomponentFactoryProvider = new InterfaceC11700a<ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.ProductActivitySubcomponentImpl.7
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent.Factory get() {
                    ProductActivitySubcomponentImpl $r2 = ProductActivitySubcomponentImpl.this;
                    AmountFragmentSubcomponentFactory $r1 = new AmountFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent.Factory get2() {
                    ProductActivityModule_InjectAmountFragment.AmountFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductActivity injectProductActivity(ProductActivity productActivity) {
            ProductsActivityPresenter $r2 = productsActivityPresenter();
            ProductActivity_MembersInjector.injectThisPresenter(productActivity, $r2);
            DispatchingAndroidInjector $r3 = dispatchingAndroidInjectorOfObject();
            ProductActivity_MembersInjector.injectAndroidInjector(productActivity, $r3);
            return productActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private Map mapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
            AbstractC5077j.C5078a $r1 = AbstractC5077j.m25729a(17);
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.productActivitySubcomponentFactoryProvider;
            $r1.m25720c(ProductActivity.class, $r3);
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            InterfaceC11700a $r32 = $r22.issueActivitySubcomponentFactoryProvider;
            $r1.m25720c(IssueActivity.class, $r32);
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            InterfaceC11700a $r33 = $r23.homeActivitySubcomponentFactoryProvider;
            $r1.m25720c(HomeActivity.class, $r33);
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            InterfaceC11700a $r34 = $r24.kShockActivitySubcomponentFactoryProvider;
            $r1.m25720c(KShockActivity.class, $r34);
            DaggerApplicationComponent $r25 = DaggerApplicationComponent.this;
            InterfaceC11700a $r35 = $r25.savingsActivitySubcomponentFactoryProvider;
            $r1.m25720c(SavingsActivity.class, $r35);
            DaggerApplicationComponent $r26 = DaggerApplicationComponent.this;
            InterfaceC11700a $r36 = $r26.banksFragmentSubcomponentFactoryProvider;
            $r1.m25720c(BanksFragment.class, $r36);
            DaggerApplicationComponent $r27 = DaggerApplicationComponent.this;
            InterfaceC11700a $r37 = $r27.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssuesTermsAndConditionsFragment.class, $r37);
            DaggerApplicationComponent $r28 = DaggerApplicationComponent.this;
            InterfaceC11700a $r38 = $r28.kudiPinSubcomponentFactoryProvider;
            $r1.m25720c(KudiPin.class, $r38);
            DaggerApplicationComponent $r29 = DaggerApplicationComponent.this;
            InterfaceC11700a $r39 = $r29.f201x23c522c6;
            $r1.m25720c(SendReceiptToTerminalConfirmationBottomSheet.class, $r39);
            DaggerApplicationComponent $r210 = DaggerApplicationComponent.this;
            InterfaceC11700a $r310 = $r210.picturePickerFragmentSubcomponentFactoryProvider;
            $r1.m25720c(PicturePickerFragment.class, $r310);
            InterfaceC11700a $r311 = this.airtimeTopUpFragmentSubcomponentFactoryProvider;
            $r1.m25720c(AirtimeTopUpFragment.class, $r311);
            InterfaceC11700a $r312 = this.airtimeAmountFragmentSubcomponentFactoryProvider;
            $r1.m25720c(AirtimeAmountFragment.class, $r312);
            InterfaceC11700a $r313 = this.productSummaryFragmentSubcomponentFactoryProvider;
            $r1.m25720c(ProductSummaryFragment.class, $r313);
            InterfaceC11700a $r314 = this.billPaymentStepOneFragmentSubcomponentFactoryProvider;
            $r1.m25720c(BillPaymentStepOneFragment.class, $r314);
            InterfaceC11700a $r315 = this.payBillsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(PayBillsFragment.class, $r315);
            InterfaceC11700a $r316 = this.billPaymentCustomerDetailsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(BillPaymentCustomerDetailsFragment.class, $r316);
            InterfaceC11700a $r317 = this.amountFragmentSubcomponentFactoryProvider;
            $r1.m25720c(AmountFragment.class, $r317);
            Map $r4 = $r1.m25722a();
            Map r5 = $r4;
            return r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductsActivityPresenter productsActivityPresenter() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            Analytics $r4 = $r22.analytics();
            ProductsActivityPresenter $r1 = new ProductsActivityPresenter($r3, $r4);
            return $r1;
        }

        public void inject(ProductActivity productActivity) {
            injectProductActivity(productActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            ProductActivity $r2 = (ProductActivity) obj;
            inject($r2);
        }
    }

    /* loaded from: classes.dex */
    final class ReferralSubComponentFactory implements ReferralSubComponent.Factory {
        private ReferralSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.referral.xmpp.components.ReferralSubComponent.Factory
        public ReferralSubComponent create(ReferralNavigator referralNavigator) {
            C9473g.m14650b(referralNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            ReferralSubComponentImpl $r2 = new ReferralSubComponentImpl(referralNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class ReferralSubComponentImpl implements ReferralSubComponent {
        private final ReferralNavigator referralNavigator;

        private ReferralSubComponentImpl(ReferralNavigator referralNavigator) {
            this.referralNavigator = referralNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferralInfoPresenter agentReferralInfoPresenter() {
            ReferralNavigator $r2 = this.referralNavigator;
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            AgentReferralInfoPresenter $r1 = new AgentReferralInfoPresenter($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferralInvitePresenter agentReferralInvitePresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            CreateAgentReferral $r5 = createAgentReferral();
            ReferralNavigator $r2 = this.referralNavigator;
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r6 = $r32.analytics();
            AgentReferralInvitePresenter $r1 = new AgentReferralInvitePresenter($r4, $r5, $r2, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferralListPresenter agentReferralListPresenter() {
            FetchReferrals $r3 = fetchReferrals();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            BuzzReferredAgent $r6 = buzzReferredAgent();
            ReferralNavigator $r1 = this.referralNavigator;
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            Analytics $r7 = $r42.analytics();
            AgentReferralListPresenter $r2 = new AgentReferralListPresenter($r3, $r5, $r6, $r1, $r7);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferralSummaryPresenter agentReferralSummaryPresenter() {
            FetchAgentSummary $r2 = fetchAgentSummary();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            AgentReferralSummaryPresenter $r1 = new AgentReferralSummaryPresenter($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BuzzReferredAgent buzzReferredAgent() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            NetworkService $r4 = $r22.networkService();
            BuzzReferredAgent $r1 = new BuzzReferredAgent($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateAgentReferral createAgentReferral() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            CreateAgentReferral $r1 = new CreateAgentReferral($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchAgentSummary fetchAgentSummary() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchAgentSummary $r1 = new FetchAgentSummary($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchReferrals fetchReferrals() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchReferrals $r1 = new FetchReferrals($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferralActivity injectAgentReferralActivity(AgentReferralActivity agentReferralActivity) {
            AgentReferralPresenter $r2 = new AgentReferralPresenter();
            AgentReferralActivity_MembersInjector.injectAgentReferralPresenter(agentReferralActivity, $r2);
            SmartLookAnalytics $r3 = new SmartLookAnalytics();
            AgentReferralActivity_MembersInjector.injectSmartLookAnalytics(agentReferralActivity, $r3);
            return agentReferralActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferralInfoFragment injectAgentReferralInfoFragment(AgentReferralInfoFragment agentReferralInfoFragment) {
            AgentReferralInfoPresenter $r2 = agentReferralInfoPresenter();
            AgentReferralInfoFragment_MembersInjector.injectAgentReferralInfoPresenter(agentReferralInfoFragment, $r2);
            return agentReferralInfoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferralSummaryFragment injectAgentReferralSummaryFragment(AgentReferralSummaryFragment agentReferralSummaryFragment) {
            AgentReferralSummaryPresenter $r2 = agentReferralSummaryPresenter();
            AgentReferralSummaryFragment_MembersInjector.injectThisPresenter(agentReferralSummaryFragment, $r2);
            return agentReferralSummaryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferredInvitationFragment injectAgentReferredInvitationFragment(AgentReferredInvitationFragment agentReferredInvitationFragment) {
            AgentReferralInvitePresenter $r2 = agentReferralInvitePresenter();
            AgentReferredInvitationFragment_MembersInjector.injectAgentListPresenter(agentReferredInvitationFragment, $r2);
            return agentReferredInvitationFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AgentReferredListFragment injectAgentReferredListFragment(AgentReferredListFragment agentReferredListFragment) {
            AgentReferralListPresenter $r2 = agentReferralListPresenter();
            AgentReferredListFragment_MembersInjector.injectAgentListPresenter(agentReferredListFragment, $r2);
            return agentReferredListFragment;
        }

        @Override // ai.kudi.agent.referral.xmpp.components.ReferralSubComponent
        public void inject(AgentReferralActivity agentReferralActivity) {
            injectAgentReferralActivity(agentReferralActivity);
        }

        @Override // ai.kudi.agent.referral.xmpp.components.ReferralSubComponent
        public void inject(AgentReferralInfoFragment agentReferralInfoFragment) {
            injectAgentReferralInfoFragment(agentReferralInfoFragment);
        }

        @Override // ai.kudi.agent.referral.xmpp.components.ReferralSubComponent
        public void inject(AgentReferralSummaryFragment agentReferralSummaryFragment) {
            injectAgentReferralSummaryFragment(agentReferralSummaryFragment);
        }

        @Override // ai.kudi.agent.referral.xmpp.components.ReferralSubComponent
        public void inject(AgentReferredInvitationFragment agentReferredInvitationFragment) {
            injectAgentReferredInvitationFragment(agentReferredInvitationFragment);
        }

        @Override // ai.kudi.agent.referral.xmpp.components.ReferralSubComponent
        public void inject(AgentReferredListFragment agentReferredListFragment) {
            injectAgentReferredListFragment(agentReferredListFragment);
        }
    }

    /* loaded from: classes.dex */
    final class RegistrationSubComponentFactory implements RegistrationSubComponent.Factory {
        private RegistrationSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent.Factory
        public RegistrationSubComponent create(RegisterNavigator registerNavigator, EmailVerificationNavigator emailVerificationNavigator) {
            C9473g.m14650b(registerNavigator);
            C9473g.m14650b(emailVerificationNavigator);
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            RegistrationSubComponentImpl $r3 = new RegistrationSubComponentImpl(registerNavigator, emailVerificationNavigator);
            return $r3;
        }
    }

    /* loaded from: classes.dex */
    final class RegistrationSubComponentImpl implements RegistrationSubComponent {
        private final EmailVerificationNavigator emailVerificationNavigator;
        private final RegisterNavigator registerV2Navigator;

        private RegistrationSubComponentImpl(RegisterNavigator registerNavigator, EmailVerificationNavigator emailVerificationNavigator) {
            this.registerV2Navigator = registerNavigator;
            this.emailVerificationNavigator = emailVerificationNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BusinessInfoViewModel businessInfoViewModel() {
            RegisterNavigator $r1 = this.registerV2Navigator;
            FetchLocation $r3 = fetchLocation();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            Analytics $r5 = $r4.analytics();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            FetchCurrentUser $r6 = $r42.fetchCurrentUser();
            UpdateUser $r7 = updateUser();
            FetchBusinessCategories $r8 = fetchBusinessCategories();
            EditProfile $r9 = editProfile();
            BusinessInfoViewModel $r2 = new BusinessInfoViewModel($r1, $r3, $r5, $r6, $r7, $r8, $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BvnLookup bvnLookup() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            BvnLookup $r1 = new BvnLookup($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CheckIfBvnExists checkIfBvnExists() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            CheckIfBvnExists $r1 = new CheckIfBvnExists($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ContainerViewModel containerViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            BaseOtpUtil $r6 = $r33.baseOtpUtil();
            RegisterNavigator $r2 = this.registerV2Navigator;
            ContainerViewModel $r1 = new ContainerViewModel($r4, $r5, $r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreatePinViewModel createPinViewModel() {
            SetNewPin $r3 = setNewPin();
            RegisterNewAgent $r4 = registerNewAgent();
            RegisterNewUser $r5 = registerNewUser();
            OnboardMerchant $r6 = onboardMerchant();
            DaggerApplicationComponent $r7 = DaggerApplicationComponent.this;
            LoginUser $r8 = $r7.loginUser();
            RegisterNavigator $r1 = this.registerV2Navigator;
            DaggerApplicationComponent $r72 = DaggerApplicationComponent.this;
            Analytics $r9 = $r72.analytics();
            DaggerApplicationComponent $r73 = DaggerApplicationComponent.this;
            InterfaceC11700a $r10 = $r73.providesSharedPrefsProvider;
            Object $r11 = $r10.get();
            SharedPreferences sharedPreferences = (SharedPreferences) $r11;
            DaggerApplicationComponent $r74 = DaggerApplicationComponent.this;
            InterfaceC11700a $r102 = $r74.providesDeviceSecuritySharedPrefsProvider;
            Object $r112 = $r102.get();
            SharedPreferences sharedPreferences2 = (SharedPreferences) $r112;
            DaggerApplicationComponent $r75 = DaggerApplicationComponent.this;
            PinRepositoryImpl $r14 = $r75.pinRepositoryImpl();
            DaggerApplicationComponent $r76 = DaggerApplicationComponent.this;
            Application $r15 = $r76.application;
            DaggerApplicationComponent $r77 = DaggerApplicationComponent.this;
            InterfaceC11700a $r103 = $r77.providePFSecurityUtilsFactoryProvider;
            Object $r113 = $r103.get();
            IPFSecurityUtils $r16 = (IPFSecurityUtils) $r113;
            CreatePinViewModel $r2 = new CreatePinViewModel($r3, $r4, $r5, $r6, $r8, $r1, $r9, sharedPreferences, sharedPreferences2, $r14, $r15, $r16);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreateTempAgent createTempAgent() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            CreateTempAgent $r1 = new CreateTempAgent($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EditProfile editProfile() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            EditProfile $r1 = new EditProfile($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EmailVerificationViewModel emailVerificationViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            ResendOtp $r4 = $r3.resendOtp();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            Analytics $r6 = $r33.analytics();
            EmailVerificationNavigator $r2 = this.emailVerificationNavigator;
            EmailVerificationViewModel $r1 = new EmailVerificationViewModel($r4, $r5, $r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchBusinessCategories fetchBusinessCategories() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchBusinessCategories $r1 = new FetchBusinessCategories($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchLocation fetchLocation() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesUserServiceProvider;
            Object $r4 = $r3.get();
            UserService $r5 = (UserService) $r4;
            FetchLocation $r1 = new FetchLocation($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AccountTypeFragment injectAccountTypeFragment(AccountTypeFragment accountTypeFragment) {
            VerifyBvnPictureViewModel $r2 = verifyBvnPictureViewModel();
            AccountTypeFragment_MembersInjector.injectVm(accountTypeFragment, $r2);
            return accountTypeFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BusinessInfoFragment injectBusinessInfoFragment(BusinessInfoFragment businessInfoFragment) {
            BusinessInfoViewModel $r2 = businessInfoViewModel();
            BusinessInfoFragment_MembersInjector.injectVm(businessInfoFragment, $r2);
            return businessInfoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BvnNinFragment injectBvnNinFragment(BvnNinFragment bvnNinFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesDeviceSecuritySharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            BvnNinFragment_MembersInjector.injectSharedPrefs(bvnNinFragment, $r5);
            PhoneAndBvnViewModel $r6 = phoneAndBvnViewModel();
            BvnNinFragment_MembersInjector.injectVm(bvnNinFragment, $r6);
            return bvnNinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CreatePinFragment injectCreatePinFragment(CreatePinFragment createPinFragment) {
            CreatePinViewModel $r2 = createPinViewModel();
            CreatePinFragment_MembersInjector.injectVm(createPinFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.provideFirebaseConfigProvider;
            Object $r5 = $r4.get();
            Frame $r6 = (Frame) $r5;
            CreatePinFragment_MembersInjector.injectRemoteConfig(createPinFragment, $r6);
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            InterfaceC11700a $r42 = $r32.providesSharedPrefsProvider;
            Object $r52 = $r42.get();
            SharedPreferences $r7 = (SharedPreferences) $r52;
            CreatePinFragment_MembersInjector.injectSharedPreferences(createPinFragment, $r7);
            return createPinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EmailVerificationFragment injectEmailVerificationFragment(EmailVerificationFragment emailVerificationFragment) {
            EmailVerificationViewModel $r2 = emailVerificationViewModel();
            EmailVerificationFragment_MembersInjector.injectEmailVerificationViewModel(emailVerificationFragment, $r2);
            return emailVerificationFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EnableFingerPrintFragment injectEnableFingerPrintFragment(EnableFingerPrintFragment enableFingerPrintFragment) {
            EnableFingerPrintViewModel $r2 = new EnableFingerPrintViewModel();
            EnableFingerPrintFragment_MembersInjector.injectVm(enableFingerPrintFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            EnableFingerPrintFragment_MembersInjector.injectSharedPreferences(enableFingerPrintFragment, $r6);
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r7 = $r32.analytics();
            EnableFingerPrintFragment_MembersInjector.injectAnalytics(enableFingerPrintFragment, $r7);
            return enableFingerPrintFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private NonAgentSignOnFragment injectNonAgentSignOnFragment(NonAgentSignOnFragment nonAgentSignOnFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideFirebaseConfigProvider;
            Object $r4 = $r3.get();
            Frame $r5 = (Frame) $r4;
            NonAgentSignOnFragment_MembersInjector.injectRemoteConfig(nonAgentSignOnFragment, $r5);
            PhoneAndBvnViewModel $r6 = phoneAndBvnViewModel();
            NonAgentSignOnFragment_MembersInjector.injectPhoneAndBvnViewModel(nonAgentSignOnFragment, $r6);
            return nonAgentSignOnFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PersonalInfoFragment injectPersonalInfoFragment(PersonalInfoFragment personalInfoFragment) {
            PersonalInfoViewModel $r2 = personalInfoViewModel();
            PersonalInfoFragment_MembersInjector.injectVm(personalInfoFragment, $r2);
            return personalInfoFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PhoneFragment injectPhoneFragment(PhoneFragment phoneFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesDeviceSecuritySharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            PhoneFragment_MembersInjector.injectSharedPrefs(phoneFragment, $r5);
            PhoneAndBvnViewModel $r6 = phoneAndBvnViewModel();
            PhoneFragment_MembersInjector.injectVm(phoneFragment, $r6);
            SmartLookAnalytics $r7 = new SmartLookAnalytics();
            PhoneFragment_MembersInjector.injectSmartLookAnalytics(phoneFragment, $r7);
            return phoneFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RegisterActivity injectRegisterActivity(RegisterActivity registerActivity) {
            ContainerViewModel $r2 = containerViewModel();
            RegisterActivity_MembersInjector.injectViewModel(registerActivity, $r2);
            return registerActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyBvnPictureFragment injectVerifyBvnPictureFragment(VerifyBvnPictureFragment verifyBvnPictureFragment) {
            VerifyBvnPictureViewModel $r2 = verifyBvnPictureViewModel();
            VerifyBvnPictureFragment_MembersInjector.injectViewModel(verifyBvnPictureFragment, $r2);
            return verifyBvnPictureFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WelcomeFragment injectWelcomeFragment(WelcomeFragment welcomeFragment) {
            WelcomeViewModel $r2 = welcomeViewModel();
            WelcomeFragment_MembersInjector.injectVm(welcomeFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            WelcomeFragment_MembersInjector.injectSharedPrefs(welcomeFragment, $r6);
            return welcomeFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OnboardMerchant onboardMerchant() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            OnboardMerchant $r1 = new OnboardMerchant($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PersonalInfoViewModel personalInfoViewModel() {
            RegisterNavigator $r1 = this.registerV2Navigator;
            FetchLocation $r3 = fetchLocation();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            Analytics $r5 = $r4.analytics();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            FetchCurrentUser $r6 = $r42.fetchCurrentUser();
            UpdateUser $r7 = updateUser();
            EditProfile $r8 = editProfile();
            PersonalInfoViewModel $r2 = new PersonalInfoViewModel($r1, $r3, $r5, $r6, $r7, $r8);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PhoneAndBvnViewModel phoneAndBvnViewModel() {
            CreateTempAgent $r3 = createTempAgent();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            Analytics $r5 = $r4.analytics();
            BvnLookup $r6 = bvnLookup();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            BaseOtpUtil $r7 = $r42.baseOtpUtil();
            RegisterNavigator $r1 = this.registerV2Navigator;
            CheckIfBvnExists $r8 = checkIfBvnExists();
            DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
            FetchCurrentUser $r9 = $r43.fetchCurrentUser();
            PhoneAndBvnViewModel $r2 = new PhoneAndBvnViewModel($r3, $r5, $r6, $r7, $r1, $r8, $r9);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RegisterNewAgent registerNewAgent() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            RegisterNewAgent $r1 = new RegisterNewAgent($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RegisterNewUser registerNewUser() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            RegisterNewUser $r1 = new RegisterNewUser($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SetNewPin setNewPin() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            SetNewPin $r1 = new SetNewPin($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpdateUser updateUser() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            UserRepository $r3 = $r4.userRepository();
            RxSchedulers $r2 = new RxSchedulers();
            UpdateUser $r1 = new UpdateUser($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyBvn verifyBvn() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            VerifyBvn $r1 = new VerifyBvn($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyBvnPictureViewModel verifyBvnPictureViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            VerifyBvn $r5 = verifyBvn();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r6 = $r32.analytics();
            RegisterNavigator $r2 = this.registerV2Navigator;
            VerifyBvnPictureViewModel $r1 = new VerifyBvnPictureViewModel($r4, $r5, $r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WelcomeViewModel welcomeViewModel() {
            RegisterNavigator $r2 = this.registerV2Navigator;
            WelcomeViewModel $r1 = new WelcomeViewModel($r2);
            return $r1;
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(NonAgentSignOnFragment nonAgentSignOnFragment) {
            injectNonAgentSignOnFragment(nonAgentSignOnFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(AccountTypeFragment accountTypeFragment) {
            injectAccountTypeFragment(accountTypeFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(BusinessInfoFragment businessInfoFragment) {
            injectBusinessInfoFragment(businessInfoFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(CreatePinFragment createPinFragment) {
            injectCreatePinFragment(createPinFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(PersonalInfoFragment personalInfoFragment) {
            injectPersonalInfoFragment(personalInfoFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(BvnNinFragment bvnNinFragment) {
            injectBvnNinFragment(bvnNinFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(EmailVerificationFragment emailVerificationFragment) {
            injectEmailVerificationFragment(emailVerificationFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(EnableFingerPrintFragment enableFingerPrintFragment) {
            injectEnableFingerPrintFragment(enableFingerPrintFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(PhoneFragment phoneFragment) {
            injectPhoneFragment(phoneFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(RegisterActivity registerActivity) {
            injectRegisterActivity(registerActivity);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(WelcomeFragment welcomeFragment) {
            injectWelcomeFragment(welcomeFragment);
        }

        @Override // ai.kudi.agent.register.xmpp.components.RegistrationSubComponent
        public void inject(VerifyBvnPictureFragment verifyBvnPictureFragment) {
            injectVerifyBvnPictureFragment(verifyBvnPictureFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class SavingsActivitySubcomponentFactory implements ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent.Factory {
        private SavingsActivitySubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent create(SavingsActivity savingsActivity) {
            C9473g.m14650b(savingsActivity);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            SavingsActivitySubcomponentImpl $r2 = new SavingsActivitySubcomponentImpl(savingsActivity);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            SavingsActivity $r3 = (SavingsActivity) obj;
            ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class SavingsActivitySubcomponentImpl implements ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent {
        private final SavingsActivity arg0;
        private InterfaceC11700a<SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent.Factory> confirmOtpFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent.Factory> createSavingPinFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent.Factory> createSavingsFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent.Factory> detailAndTransactionFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent.Factory> getStartedFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent.Factory> performActionBottomSheetSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent.Factory> savingHistoryFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent.Factory> savingsDetailFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent.Factory> savingsFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent.Factory> savingsPlanFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent.Factory> savingsReviewFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent.Factory> savingsTermsAndConditionFragmentSubcomponentFactoryProvider;
        private InterfaceC11700a<SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent.Factory> withdrawSavingsFragmentSubcomponentFactoryProvider;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ConfirmOtpFragmentSubcomponentFactory implements SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent.Factory {
            private ConfirmOtpFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent create(ConfirmOtpFragment confirmOtpFragment) {
                C9473g.m14650b(confirmOtpFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                ConfirmOtpFragmentSubcomponentImpl $r2 = new ConfirmOtpFragmentSubcomponentImpl(confirmOtpFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                ConfirmOtpFragment $r3 = (ConfirmOtpFragment) obj;
                SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class ConfirmOtpFragmentSubcomponentImpl implements SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent {
            private ConfirmOtpFragmentSubcomponentImpl(ConfirmOtpFragment confirmOtpFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ConfirmOtpRepository confirmOtpRepository() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                ConfirmOtpRepository $r1 = new ConfirmOtpRepository($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ConfirmOtpViewModel confirmOtpViewModel() {
                SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r3 = $r2.arg0;
                ConfirmOtpRepository $r4 = confirmOtpRepository();
                CreateSavings $r5 = createSavings();
                Withdraw $r6 = withdraw();
                SavingsActivitySubcomponentImpl $r22 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r7 = DaggerApplicationComponent.this;
                Analytics $r8 = $r7.analytics();
                DeactivateSaving $r9 = deactivateSaving();
                SavingsActivitySubcomponentImpl $r23 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r72 = DaggerApplicationComponent.this;
                FetchCurrentUser $r10 = $r72.fetchCurrentUser();
                ConfirmOtpViewModel $r1 = new ConfirmOtpViewModel($r3, $r4, $r5, $r6, $r8, $r9, $r10);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateSavings createSavings() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                CreateSavings $r1 = new CreateSavings($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DeactivateSaving deactivateSaving() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                DeactivateSaving $r1 = new DeactivateSaving($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ConfirmOtpFragment injectConfirmOtpFragment(ConfirmOtpFragment confirmOtpFragment) {
                ConfirmOtpViewModel $r2 = confirmOtpViewModel();
                ConfirmOtpFragment_MembersInjector.injectViewModel(confirmOtpFragment, $r2);
                return confirmOtpFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private Withdraw withdraw() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                Withdraw $r1 = new Withdraw($r5, $r8, $r2);
                return $r1;
            }

            public void inject(ConfirmOtpFragment confirmOtpFragment) {
                injectConfirmOtpFragment(confirmOtpFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                ConfirmOtpFragment $r2 = (ConfirmOtpFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class CreateSavingPinFragmentSubcomponentFactory implements SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent.Factory {
            private CreateSavingPinFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent create(CreateSavingPinFragment createSavingPinFragment) {
                C9473g.m14650b(createSavingPinFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                CreateSavingPinFragmentSubcomponentImpl $r2 = new CreateSavingPinFragmentSubcomponentImpl(createSavingPinFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                CreateSavingPinFragment $r3 = (CreateSavingPinFragment) obj;
                SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class CreateSavingPinFragmentSubcomponentImpl implements SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent {
            private CreateSavingPinFragmentSubcomponentImpl(CreateSavingPinFragment createSavingPinFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private ConfirmOtp confirmOtp() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                RxSchedulers $r2 = new RxSchedulers();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                ConfirmOtp $r1 = new ConfirmOtp($r5, $r2, $r8);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateSavingPin createSavingPin() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                CreateSavingPin $r1 = new CreateSavingPin($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateSavingPinViewModel createSavingPinViewModel() {
                SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
                FetchCurrentUser $r4 = $r3.fetchCurrentUser();
                CreateSavingPin $r5 = createSavingPin();
                ConfirmOtp $r6 = confirmOtp();
                SavingsActivitySubcomponentImpl $r22 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r7 = $r22.arg0;
                CreateSavings $r8 = createSavings();
                SavingsActivitySubcomponentImpl $r23 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
                UserRepository $r9 = $r32.userRepository();
                CreateSavingPinViewModel $r1 = new CreateSavingPinViewModel($r4, $r5, $r6, $r7, $r8, $r9);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateSavings createSavings() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                CreateSavings $r1 = new CreateSavings($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateSavingPinFragment injectCreateSavingPinFragment(CreateSavingPinFragment createSavingPinFragment) {
                CreateSavingPinViewModel $r2 = createSavingPinViewModel();
                CreateSavingPinFragment_MembersInjector.injectViewModel(createSavingPinFragment, $r2);
                return createSavingPinFragment;
            }

            public void inject(CreateSavingPinFragment createSavingPinFragment) {
                injectCreateSavingPinFragment(createSavingPinFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                CreateSavingPinFragment $r2 = (CreateSavingPinFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class CreateSavingsFragmentSubcomponentFactory implements SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent.Factory {
            private CreateSavingsFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent create(CreateSavingsFragment createSavingsFragment) {
                C9473g.m14650b(createSavingsFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                CreateSavingsFragmentSubcomponentImpl $r2 = new CreateSavingsFragmentSubcomponentImpl(createSavingsFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                CreateSavingsFragment $r3 = (CreateSavingsFragment) obj;
                SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class CreateSavingsFragmentSubcomponentImpl implements SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent {
            private CreateSavingsFragmentSubcomponentImpl(CreateSavingsFragment createSavingsFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateSavingsViewModel createSavingsViewModel() {
                SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r3 = $r2.arg0;
                SavingsActivitySubcomponentImpl $r22 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r5 = $r4.analytics();
                PlanDuration $r6 = planDuration();
                SavingsActivitySubcomponentImpl $r23 = SavingsActivitySubcomponentImpl.this;
                ResourceDelegate $r7 = $r23.resourceDelegate();
                CreateSavingsViewModel $r1 = new CreateSavingsViewModel($r3, $r5, $r6, $r7);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateSavingsFragment injectCreateSavingsFragment(CreateSavingsFragment createSavingsFragment) {
                CreateSavingsViewModel $r2 = createSavingsViewModel();
                CreateSavingsFragment_MembersInjector.injectViewModel(createSavingsFragment, $r2);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r5 = $r4.analytics();
                CreateSavingsFragment_MembersInjector.injectAnalytics(createSavingsFragment, $r5);
                return createSavingsFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PlanDuration planDuration() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                PlanDuration $r1 = new PlanDuration($r5, $r8, $r2);
                return $r1;
            }

            public void inject(CreateSavingsFragment createSavingsFragment) {
                injectCreateSavingsFragment(createSavingsFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                CreateSavingsFragment $r2 = (CreateSavingsFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class DetailAndTransactionFragmentSubcomponentFactory implements SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent.Factory {
            private DetailAndTransactionFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent create(DetailAndTransactionFragment detailAndTransactionFragment) {
                C9473g.m14650b(detailAndTransactionFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DetailAndTransactionFragmentSubcomponentImpl $r2 = new DetailAndTransactionFragmentSubcomponentImpl(detailAndTransactionFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                DetailAndTransactionFragment $r3 = (DetailAndTransactionFragment) obj;
                SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class DetailAndTransactionFragmentSubcomponentImpl implements SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent {
            private DetailAndTransactionFragmentSubcomponentImpl(DetailAndTransactionFragment detailAndTransactionFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DetailAndTransactionFragment injectDetailAndTransactionFragment(DetailAndTransactionFragment detailAndTransactionFragment) {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DispatchingAndroidInjector $r2 = $r3.dispatchingAndroidInjectorOfObject();
                DetailAndTransactionFragment_MembersInjector.injectAndroidInjector(detailAndTransactionFragment, $r2);
                return detailAndTransactionFragment;
            }

            public void inject(DetailAndTransactionFragment detailAndTransactionFragment) {
                injectDetailAndTransactionFragment(detailAndTransactionFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                DetailAndTransactionFragment $r2 = (DetailAndTransactionFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class GetStartedFragmentSubcomponentFactory implements SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent.Factory {
            private GetStartedFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent create(GetStartedFragment getStartedFragment) {
                C9473g.m14650b(getStartedFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                GetStartedFragmentSubcomponentImpl $r2 = new GetStartedFragmentSubcomponentImpl(getStartedFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                GetStartedFragment $r3 = (GetStartedFragment) obj;
                SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class GetStartedFragmentSubcomponentImpl implements SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent {
            private GetStartedFragmentSubcomponentImpl(GetStartedFragment getStartedFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private GetStartedViewModel getStartedViewModel() {
                SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r3 = $r2.arg0;
                SavingsActivitySubcomponentImpl $r22 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r5 = $r4.analytics();
                GetStartedViewModel $r1 = new GetStartedViewModel($r3, $r5);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private GetStartedFragment injectGetStartedFragment(GetStartedFragment getStartedFragment) {
                GetStartedViewModel $r2 = getStartedViewModel();
                GetStartedFragment_MembersInjector.injectViewModel(getStartedFragment, $r2);
                return getStartedFragment;
            }

            public void inject(GetStartedFragment getStartedFragment) {
                injectGetStartedFragment(getStartedFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                GetStartedFragment $r2 = (GetStartedFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class PerformActionBottomSheetSubcomponentFactory implements SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent.Factory {
            private PerformActionBottomSheetSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent create(PerformActionBottomSheet performActionBottomSheet) {
                C9473g.m14650b(performActionBottomSheet);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                PerformActionBottomSheetSubcomponentImpl $r2 = new PerformActionBottomSheetSubcomponentImpl(performActionBottomSheet);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                PerformActionBottomSheet $r3 = (PerformActionBottomSheet) obj;
                SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class PerformActionBottomSheetSubcomponentImpl implements SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent {
            private PerformActionBottomSheetSubcomponentImpl(PerformActionBottomSheet performActionBottomSheet) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private PerformActionBottomSheet injectPerformActionBottomSheet(PerformActionBottomSheet performActionBottomSheet) {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r2 = $r4.analytics();
                PerformActionBottomSheet_MembersInjector.injectAnalytics(performActionBottomSheet, $r2);
                return performActionBottomSheet;
            }

            public void inject(PerformActionBottomSheet performActionBottomSheet) {
                injectPerformActionBottomSheet(performActionBottomSheet);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                PerformActionBottomSheet $r2 = (PerformActionBottomSheet) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingHistoryFragmentSubcomponentFactory implements SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent.Factory {
            private SavingHistoryFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent create(SavingHistoryFragment savingHistoryFragment) {
                C9473g.m14650b(savingHistoryFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingHistoryFragmentSubcomponentImpl $r2 = new SavingHistoryFragmentSubcomponentImpl(savingHistoryFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                SavingHistoryFragment $r3 = (SavingHistoryFragment) obj;
                SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingHistoryFragmentSubcomponentImpl implements SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent {
            private SavingHistoryFragmentSubcomponentImpl(SavingHistoryFragment savingHistoryFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingHistoryFragment injectSavingHistoryFragment(SavingHistoryFragment savingHistoryFragment) {
                SavingHistoryViewModel $r2 = savingHistoryViewModel();
                SavingHistoryFragment_MembersInjector.injectViewModel(savingHistoryFragment, $r2);
                return savingHistoryFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingHistoryViewModel savingHistoryViewModel() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r2 = $r3.arg0;
                SavingHistoryViewModel $r1 = new SavingHistoryViewModel($r2);
                return $r1;
            }

            public void inject(SavingHistoryFragment savingHistoryFragment) {
                injectSavingHistoryFragment(savingHistoryFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                SavingHistoryFragment $r2 = (SavingHistoryFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsDetailFragmentSubcomponentFactory implements SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent.Factory {
            private SavingsDetailFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent create(SavingsDetailFragment savingsDetailFragment) {
                C9473g.m14650b(savingsDetailFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsDetailFragmentSubcomponentImpl $r2 = new SavingsDetailFragmentSubcomponentImpl(savingsDetailFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                SavingsDetailFragment $r3 = (SavingsDetailFragment) obj;
                SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsDetailFragmentSubcomponentImpl implements SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent {
            private SavingsDetailFragmentSubcomponentImpl(SavingsDetailFragment savingsDetailFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private DeactivateSaving deactivateSaving() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                DeactivateSaving $r1 = new DeactivateSaving($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsDetailFragment injectSavingsDetailFragment(SavingsDetailFragment savingsDetailFragment) {
                SavingDetailViewModel $r2 = savingDetailViewModel();
                SavingsDetailFragment_MembersInjector.injectViewModel(savingsDetailFragment, $r2);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r5 = $r4.analytics();
                SavingsDetailFragment_MembersInjector.injectAnalytics(savingsDetailFragment, $r5);
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSharedPrefsProvider;
                Object $r7 = $r6.get();
                SharedPreferences $r8 = (SharedPreferences) $r7;
                SavingsDetailFragment_MembersInjector.injectSharedPreferences(savingsDetailFragment, $r8);
                return savingsDetailFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private RenewSaving renewSaving() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                InterfaceC11700a $r5 = $r4.providesSavingApiProvider;
                Object $r6 = $r5.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r7 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r6;
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                FetchCurrentUser $r8 = $r42.fetchCurrentUser();
                RxSchedulers $r2 = new RxSchedulers();
                RenewSaving $r1 = new RenewSaving($r7, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingDetailViewModel savingDetailViewModel() {
                DeactivateSaving $r2 = deactivateSaving();
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r4 = $r3.arg0;
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r33 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r52 = DaggerApplicationComponent.this;
                Analytics $r7 = $r52.analytics();
                RenewSaving $r8 = renewSaving();
                SavingDetailViewModel $r1 = new SavingDetailViewModel($r2, $r4, $r6, $r7, $r8);
                return $r1;
            }

            public void inject(SavingsDetailFragment savingsDetailFragment) {
                injectSavingsDetailFragment(savingsDetailFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                SavingsDetailFragment $r2 = (SavingsDetailFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsFragmentSubcomponentFactory implements SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent.Factory {
            private SavingsFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent create(SavingsFragment savingsFragment) {
                C9473g.m14650b(savingsFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsFragmentSubcomponentImpl $r2 = new SavingsFragmentSubcomponentImpl(savingsFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                SavingsFragment $r3 = (SavingsFragment) obj;
                SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsFragmentSubcomponentImpl implements SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent {
            private SavingsFragmentSubcomponentImpl(SavingsFragment savingsFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsFragment injectSavingsFragment(SavingsFragment savingsFragment) {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsViewModel $r2 = $r3.savingsViewModel();
                SavingsFragment_MembersInjector.injectViewModel(savingsFragment, $r2);
                return savingsFragment;
            }

            public void inject(SavingsFragment savingsFragment) {
                injectSavingsFragment(savingsFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                SavingsFragment $r2 = (SavingsFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsPlanFragmentSubcomponentFactory implements SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent.Factory {
            private SavingsPlanFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent create(SavingsPlanFragment savingsPlanFragment) {
                C9473g.m14650b(savingsPlanFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsPlanFragmentSubcomponentImpl $r2 = new SavingsPlanFragmentSubcomponentImpl(savingsPlanFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                SavingsPlanFragment $r3 = (SavingsPlanFragment) obj;
                SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsPlanFragmentSubcomponentImpl implements SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent {
            private SavingsPlanFragmentSubcomponentImpl(SavingsPlanFragment savingsPlanFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsPlanFragment injectSavingsPlanFragment(SavingsPlanFragment savingsPlanFragment) {
                SavingsPlanViewModel $r2 = savingsPlanViewModel();
                SavingsPlanFragment_MembersInjector.injectViewModel(savingsPlanFragment, $r2);
                return savingsPlanFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsPlan savingsPlan() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                SavingsPlan $r1 = new SavingsPlan($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsPlanViewModel savingsPlanViewModel() {
                SavingsPlan $r2 = savingsPlan();
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r4 = $r3.arg0;
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                Analytics $r6 = $r5.analytics();
                SavingsPlanViewModel $r1 = new SavingsPlanViewModel($r2, $r4, $r6);
                return $r1;
            }

            public void inject(SavingsPlanFragment savingsPlanFragment) {
                injectSavingsPlanFragment(savingsPlanFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                SavingsPlanFragment $r2 = (SavingsPlanFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsReviewFragmentSubcomponentFactory implements SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent.Factory {
            private SavingsReviewFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent create(SavingsReviewFragment savingsReviewFragment) {
                C9473g.m14650b(savingsReviewFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsReviewFragmentSubcomponentImpl $r2 = new SavingsReviewFragmentSubcomponentImpl(savingsReviewFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                SavingsReviewFragment $r3 = (SavingsReviewFragment) obj;
                SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsReviewFragmentSubcomponentImpl implements SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent {
            private SavingsReviewFragmentSubcomponentImpl(SavingsReviewFragment savingsReviewFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private CreateSavings createSavings() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                CreateSavings $r1 = new CreateSavings($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsReviewFragment injectSavingsReviewFragment(SavingsReviewFragment savingsReviewFragment) {
                SavingsReviewViewModel $r2 = savingsReviewViewModel();
                SavingsReviewFragment_MembersInjector.injectViewModel(savingsReviewFragment, $r2);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r5 = $r4.analytics();
                SavingsReviewFragment_MembersInjector.injectAnalytics(savingsReviewFragment, $r5);
                return savingsReviewFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsReviewViewModel savingsReviewViewModel() {
                CreateSavings $r2 = createSavings();
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r4 = $r3.arg0;
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                FetchCurrentUser $r6 = $r5.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r33 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r52 = DaggerApplicationComponent.this;
                Analytics $r7 = $r52.analytics();
                SavingsActivitySubcomponentImpl $r34 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r53 = DaggerApplicationComponent.this;
                InterfaceC11700a $r8 = $r53.providesSharedPrefsProvider;
                Object $r9 = $r8.get();
                SavingsReviewViewModel $r1 = new SavingsReviewViewModel($r2, $r4, $r6, $r7, (SharedPreferences) $r9);
                return $r1;
            }

            public void inject(SavingsReviewFragment savingsReviewFragment) {
                injectSavingsReviewFragment(savingsReviewFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                SavingsReviewFragment $r2 = (SavingsReviewFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsTermsAndConditionFragmentSubcomponentFactory implements SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent.Factory {
            private SavingsTermsAndConditionFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent create(SavingsTermsAndConditionFragment savingsTermsAndConditionFragment) {
                C9473g.m14650b(savingsTermsAndConditionFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsTermsAndConditionFragmentSubcomponentImpl $r2 = new SavingsTermsAndConditionFragmentSubcomponentImpl(savingsTermsAndConditionFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                SavingsTermsAndConditionFragment $r3 = (SavingsTermsAndConditionFragment) obj;
                SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class SavingsTermsAndConditionFragmentSubcomponentImpl implements SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent {
            private SavingsTermsAndConditionFragmentSubcomponentImpl(SavingsTermsAndConditionFragment savingsTermsAndConditionFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsTermsAndConditionFragment injectSavingsTermsAndConditionFragment(SavingsTermsAndConditionFragment savingsTermsAndConditionFragment) {
                SavingsTermsAndConditionViewModel $r2 = savingsTermsAndConditionViewModel();
                SavingsTermsAndConditionFragment_MembersInjector.injectViewModel(savingsTermsAndConditionFragment, $r2);
                return savingsTermsAndConditionFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private SavingsTermsAndConditionViewModel savingsTermsAndConditionViewModel() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r2 = $r3.arg0;
                SavingsTermsAndConditionViewModel $r1 = new SavingsTermsAndConditionViewModel($r2);
                return $r1;
            }

            public void inject(SavingsTermsAndConditionFragment savingsTermsAndConditionFragment) {
                injectSavingsTermsAndConditionFragment(savingsTermsAndConditionFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                SavingsTermsAndConditionFragment $r2 = (SavingsTermsAndConditionFragment) obj;
                inject($r2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class WithdrawSavingsFragmentSubcomponentFactory implements SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent.Factory {
            private WithdrawSavingsFragmentSubcomponentFactory() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent create(WithdrawSavingsFragment withdrawSavingsFragment) {
                C9473g.m14650b(withdrawSavingsFragment);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                WithdrawSavingsFragmentSubcomponentImpl $r2 = new WithdrawSavingsFragmentSubcomponentImpl(withdrawSavingsFragment);
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent.Factory
            public /* bridge */ /* synthetic */ Registry create(Object obj) {
                WithdrawSavingsFragment $r3 = (WithdrawSavingsFragment) obj;
                SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent $r1 = create($r3);
                return $r1;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class WithdrawSavingsFragmentSubcomponentImpl implements SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent {
            private WithdrawSavingsFragmentSubcomponentImpl(WithdrawSavingsFragment withdrawSavingsFragment) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private WithdrawSavingsFragment injectWithdrawSavingsFragment(WithdrawSavingsFragment withdrawSavingsFragment) {
                WithdrawSavingsViewModel $r2 = withdrawSavingsViewModel();
                WithdrawSavingsFragment_MembersInjector.injectViewModel(withdrawSavingsFragment, $r2);
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                Analytics $r5 = $r4.analytics();
                WithdrawSavingsFragment_MembersInjector.injectAnalytics(withdrawSavingsFragment, $r5);
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSharedPrefsProvider;
                Object $r7 = $r6.get();
                SharedPreferences $r8 = (SharedPreferences) $r7;
                WithdrawSavingsFragment_MembersInjector.injectSharedPreferences(withdrawSavingsFragment, $r8);
                return withdrawSavingsFragment;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private Withdraw withdraw() {
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
                FetchCurrentUser $r5 = $r4.fetchCurrentUser();
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
                InterfaceC11700a $r6 = $r42.providesSavingApiProvider;
                Object $r7 = $r6.get();
                ai.kudi.agent.savings.data.worker.SavingsApi $r8 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r7;
                RxSchedulers $r2 = new RxSchedulers();
                Withdraw $r1 = new Withdraw($r5, $r8, $r2);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private WithdrawSavingsViewModel withdrawSavingsViewModel() {
                Withdraw $r2 = withdraw();
                SavingsActivitySubcomponentImpl $r3 = SavingsActivitySubcomponentImpl.this;
                SavingsActivity $r4 = $r3.arg0;
                SavingsActivitySubcomponentImpl $r32 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
                Analytics $r6 = $r5.analytics();
                SavingsActivitySubcomponentImpl $r33 = SavingsActivitySubcomponentImpl.this;
                DaggerApplicationComponent $r52 = DaggerApplicationComponent.this;
                FetchCurrentUser $r7 = $r52.fetchCurrentUser();
                WithdrawSavingsViewModel $r1 = new WithdrawSavingsViewModel($r2, $r4, $r6, $r7);
                return $r1;
            }

            public void inject(WithdrawSavingsFragment withdrawSavingsFragment) {
                injectWithdrawSavingsFragment(withdrawSavingsFragment);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.internal.modules.SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent
            public /* bridge */ /* synthetic */ void inject(Object obj) {
                WithdrawSavingsFragment $r2 = (WithdrawSavingsFragment) obj;
                inject($r2);
            }
        }

        private SavingsActivitySubcomponentImpl(SavingsActivity savingsActivity) {
            this.arg0 = savingsActivity;
            initialize(savingsActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public DispatchingAndroidInjector dispatchingAndroidInjectorOfObject() {
            Map $r1 = mapOfClassOfAndProviderOfAndroidInjectorFactoryOf();
            Map $r2 = AbstractC5077j.m25724l();
            Map r4 = $r2;
            DispatchingAndroidInjector $r3 = C7428c.m18754a($r1, r4);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private void initialize(SavingsActivity savingsActivity) {
            this.getStartedFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    GetStartedFragmentSubcomponentFactory $r1 = new GetStartedFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvideGetStartedFragment.GetStartedFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.createSavingsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    CreateSavingsFragmentSubcomponentFactory $r1 = new CreateSavingsFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvideCreateSavingsFragment.CreateSavingsFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.savingsDetailFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    SavingsDetailFragmentSubcomponentFactory $r1 = new SavingsDetailFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvideSavingsDetailFragment.SavingsDetailFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.savingsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    SavingsFragmentSubcomponentFactory $r1 = new SavingsFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvideSavingsFragment.SavingsFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.savingsPlanFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    SavingsPlanFragmentSubcomponentFactory $r1 = new SavingsPlanFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvideSavingsPlanFragment.SavingsPlanFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.savingsReviewFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.6
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    SavingsReviewFragmentSubcomponentFactory $r1 = new SavingsReviewFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvideSavingsReviewFragment.SavingsReviewFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.savingsTermsAndConditionFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.7
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    SavingsTermsAndConditionFragmentSubcomponentFactory $r1 = new SavingsTermsAndConditionFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvideSavingsTermsAndConditionFragment.SavingsTermsAndConditionFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.withdrawSavingsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.8
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    WithdrawSavingsFragmentSubcomponentFactory $r1 = new WithdrawSavingsFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvidesWithdrawSavingsFragment.WithdrawSavingsFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.performActionBottomSheetSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.9
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    PerformActionBottomSheetSubcomponentFactory $r1 = new PerformActionBottomSheetSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent.Factory get2() {
                    SavingsModule_ProvidesPerformActionBottomSheet.PerformActionBottomSheetSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.createSavingPinFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.10
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    CreateSavingPinFragmentSubcomponentFactory $r1 = new CreateSavingPinFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvidesCreateSavingPinFragment.CreateSavingPinFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.confirmOtpFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.11
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    ConfirmOtpFragmentSubcomponentFactory $r1 = new ConfirmOtpFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvidesConfirmOtpFragment.ConfirmOtpFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.detailAndTransactionFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.12
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    DetailAndTransactionFragmentSubcomponentFactory $r1 = new DetailAndTransactionFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvidesDetailAndTransactionAdapter.DetailAndTransactionFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
            this.savingHistoryFragmentSubcomponentFactoryProvider = new InterfaceC11700a<SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.SavingsActivitySubcomponentImpl.13
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                public SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent.Factory get() {
                    SavingsActivitySubcomponentImpl $r2 = SavingsActivitySubcomponentImpl.this;
                    SavingHistoryFragmentSubcomponentFactory $r1 = new SavingHistoryFragmentSubcomponentFactory();
                    return $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p472k.p473a.InterfaceC11700a
                /* renamed from: get  reason: avoid collision after fix types in other method */
                public /* bridge */ /* synthetic */ SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent.Factory get2() {
                    SavingsModule_ProvidesSavingHistoryFragment.SavingHistoryFragmentSubcomponent.Factory $r1 = get();
                    return $r1;
                }
            };
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SavingsActivity injectSavingsActivity(SavingsActivity savingsActivity) {
            SavingsViewModel $r2 = savingsViewModel();
            SavingsActivity_MembersInjector.injectViewModel(savingsActivity, $r2);
            DispatchingAndroidInjector $r3 = dispatchingAndroidInjectorOfObject();
            SavingsActivity_MembersInjector.injectAndroidInjector(savingsActivity, $r3);
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            Analytics $r5 = $r4.analytics();
            SavingsActivity_MembersInjector.injectAnalytics(savingsActivity, $r5);
            return savingsActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private Map mapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
            AbstractC5077j.C5078a $r1 = AbstractC5077j.m25729a(23);
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.productActivitySubcomponentFactoryProvider;
            $r1.m25720c(ProductActivity.class, $r3);
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            InterfaceC11700a $r32 = $r22.issueActivitySubcomponentFactoryProvider;
            $r1.m25720c(IssueActivity.class, $r32);
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            InterfaceC11700a $r33 = $r23.homeActivitySubcomponentFactoryProvider;
            $r1.m25720c(HomeActivity.class, $r33);
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            InterfaceC11700a $r34 = $r24.kShockActivitySubcomponentFactoryProvider;
            $r1.m25720c(KShockActivity.class, $r34);
            DaggerApplicationComponent $r25 = DaggerApplicationComponent.this;
            InterfaceC11700a $r35 = $r25.savingsActivitySubcomponentFactoryProvider;
            $r1.m25720c(SavingsActivity.class, $r35);
            DaggerApplicationComponent $r26 = DaggerApplicationComponent.this;
            InterfaceC11700a $r36 = $r26.banksFragmentSubcomponentFactoryProvider;
            $r1.m25720c(BanksFragment.class, $r36);
            DaggerApplicationComponent $r27 = DaggerApplicationComponent.this;
            InterfaceC11700a $r37 = $r27.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(IssuesTermsAndConditionsFragment.class, $r37);
            DaggerApplicationComponent $r28 = DaggerApplicationComponent.this;
            InterfaceC11700a $r38 = $r28.kudiPinSubcomponentFactoryProvider;
            $r1.m25720c(KudiPin.class, $r38);
            DaggerApplicationComponent $r29 = DaggerApplicationComponent.this;
            InterfaceC11700a $r39 = $r29.f201x23c522c6;
            $r1.m25720c(SendReceiptToTerminalConfirmationBottomSheet.class, $r39);
            DaggerApplicationComponent $r210 = DaggerApplicationComponent.this;
            InterfaceC11700a $r310 = $r210.picturePickerFragmentSubcomponentFactoryProvider;
            $r1.m25720c(PicturePickerFragment.class, $r310);
            InterfaceC11700a $r311 = this.getStartedFragmentSubcomponentFactoryProvider;
            $r1.m25720c(GetStartedFragment.class, $r311);
            InterfaceC11700a $r312 = this.createSavingsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(CreateSavingsFragment.class, $r312);
            InterfaceC11700a $r313 = this.savingsDetailFragmentSubcomponentFactoryProvider;
            $r1.m25720c(SavingsDetailFragment.class, $r313);
            InterfaceC11700a $r314 = this.savingsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(SavingsFragment.class, $r314);
            InterfaceC11700a $r315 = this.savingsPlanFragmentSubcomponentFactoryProvider;
            $r1.m25720c(SavingsPlanFragment.class, $r315);
            InterfaceC11700a $r316 = this.savingsReviewFragmentSubcomponentFactoryProvider;
            $r1.m25720c(SavingsReviewFragment.class, $r316);
            InterfaceC11700a $r317 = this.savingsTermsAndConditionFragmentSubcomponentFactoryProvider;
            $r1.m25720c(SavingsTermsAndConditionFragment.class, $r317);
            InterfaceC11700a $r318 = this.withdrawSavingsFragmentSubcomponentFactoryProvider;
            $r1.m25720c(WithdrawSavingsFragment.class, $r318);
            InterfaceC11700a $r319 = this.performActionBottomSheetSubcomponentFactoryProvider;
            $r1.m25720c(PerformActionBottomSheet.class, $r319);
            InterfaceC11700a $r320 = this.createSavingPinFragmentSubcomponentFactoryProvider;
            $r1.m25720c(CreateSavingPinFragment.class, $r320);
            InterfaceC11700a $r321 = this.confirmOtpFragmentSubcomponentFactoryProvider;
            $r1.m25720c(ConfirmOtpFragment.class, $r321);
            InterfaceC11700a $r322 = this.detailAndTransactionFragmentSubcomponentFactoryProvider;
            $r1.m25720c(DetailAndTransactionFragment.class, $r322);
            InterfaceC11700a $r323 = this.savingHistoryFragmentSubcomponentFactoryProvider;
            $r1.m25720c(SavingHistoryFragment.class, $r323);
            Map $r4 = $r1.m25722a();
            Map r5 = $r4;
            return r5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SavingsRepository savingsRepository() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            InterfaceC11700a $r5 = $r32.providesSavingApiProvider;
            Object $r6 = $r5.get();
            ai.kudi.agent.savings.data.worker.SavingsApi $r7 = (ai.kudi.agent.savings.data.worker.SavingsApi) $r6;
            RxSchedulers $r2 = new RxSchedulers();
            SavingsRepository $r1 = new SavingsRepository($r4, $r7, $r2);
            return $r1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public SavingsViewModel savingsViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            SavingsRepository $r5 = savingsRepository();
            ResourceDelegate $r6 = resourceDelegate();
            SavingsActivity $r2 = this.arg0;
            SavingsViewModel $r1 = new SavingsViewModel($r4, $r5, $r6, $r2);
            return $r1;
        }

        public void inject(SavingsActivity savingsActivity) {
            injectSavingsActivity(savingsActivity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            SavingsActivity $r2 = (SavingsActivity) obj;
            inject($r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class SendReceiptToTerminalConfirmationBottomSheetSubcomponentFactory implements AbstractC0189x8054ad7c.SendReceiptToTerminalConfirmationBottomSheetSubcomponent.Factory {
        private SendReceiptToTerminalConfirmationBottomSheetSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public AbstractC0189x8054ad7c.SendReceiptToTerminalConfirmationBottomSheetSubcomponent create(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet) {
            C9473g.m14650b(sendReceiptToTerminalConfirmationBottomSheet);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            SendReceiptToTerminalConfirmationBottomSheetSubcomponentImpl $r2 = new SendReceiptToTerminalConfirmationBottomSheetSubcomponentImpl(sendReceiptToTerminalConfirmationBottomSheet);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.AbstractC0189x8054ad7c.SendReceiptToTerminalConfirmationBottomSheetSubcomponent.Factory
        public /* bridge */ /* synthetic */ Registry create(Object obj) {
            SendReceiptToTerminalConfirmationBottomSheet $r3 = (SendReceiptToTerminalConfirmationBottomSheet) obj;
            AbstractC0189x8054ad7c.SendReceiptToTerminalConfirmationBottomSheetSubcomponent $r1 = create($r3);
            return $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class SendReceiptToTerminalConfirmationBottomSheetSubcomponentImpl implements AbstractC0189x8054ad7c.SendReceiptToTerminalConfirmationBottomSheetSubcomponent {
        private SendReceiptToTerminalConfirmationBottomSheetSubcomponentImpl(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SendReceiptToTerminalConfirmationBottomSheet injectSendReceiptToTerminalConfirmationBottomSheet(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet) {
            SendReceiptToTerminalViewModel $r2 = sendReceiptToTerminalViewModel();
            SendReceiptToTerminalConfirmationBottomSheet_MembersInjector.injectSendReceiptToTerminalViewModel(sendReceiptToTerminalConfirmationBottomSheet, $r2);
            return sendReceiptToTerminalConfirmationBottomSheet;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SendReceiptToTerminal sendReceiptToTerminal() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            SendReceiptToTerminal $r1 = new SendReceiptToTerminal($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel() {
            SendReceiptToTerminal $r2 = sendReceiptToTerminal();
            VerifyTerminalConnection $r3 = verifyTerminalConnection();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            ResourceDelegate $r6 = resourceDelegate();
            SendReceiptToTerminalViewModel $r1 = new SendReceiptToTerminalViewModel($r2, $r3, $r5, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyTerminalConnection verifyTerminalConnection() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            VerifyTerminalConnection $r1 = new VerifyTerminalConnection($r3, $r2);
            return $r1;
        }

        public void inject(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet) {
            injectSendReceiptToTerminalConfirmationBottomSheet(sendReceiptToTerminalConfirmationBottomSheet);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.internal.modules.AbstractC0189x8054ad7c.SendReceiptToTerminalConfirmationBottomSheetSubcomponent
        public /* bridge */ /* synthetic */ void inject(Object obj) {
            SendReceiptToTerminalConfirmationBottomSheet $r2 = (SendReceiptToTerminalConfirmationBottomSheet) obj;
            inject($r2);
        }
    }

    /* loaded from: classes.dex */
    final class SettingsSubComponentFactory implements SettingsSubComponent.Factory {
        private SettingsSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent.Factory
        public SettingsSubComponent create(SettingsNavigator settingsNavigator, EmailVerificationNavigator emailVerificationNavigator) {
            C9473g.m14650b(settingsNavigator);
            C9473g.m14650b(emailVerificationNavigator);
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            SettingsSubComponentImpl $r3 = new SettingsSubComponentImpl(settingsNavigator, emailVerificationNavigator);
            return $r3;
        }
    }

    /* loaded from: classes.dex */
    final class SettingsSubComponentImpl implements SettingsSubComponent {
        private final EmailVerificationNavigator emailVerificationNavigator;
        private final SettingsNavigator settingsNavigator;

        private SettingsSubComponentImpl(SettingsNavigator settingsNavigator, EmailVerificationNavigator emailVerificationNavigator) {
            this.settingsNavigator = settingsNavigator;
            this.emailVerificationNavigator = emailVerificationNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AboutKycViewModel aboutKycViewModel() {
            GetMonthlyKycLevels $r2 = getMonthlyKycLevels();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            AboutKycViewModel $r1 = new AboutKycViewModel($r2, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AccountAndSettingsOptionsViewModel accountAndSettingsOptionsViewModel() {
            SettingsNavigator $r2 = this.settingsNavigator;
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r4.fetchCurrentUser();
            AccountAndSettingsOptionsViewModel $r1 = new AccountAndSettingsOptionsViewModel($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AccountPresenter accountPresenter() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            Profile $r5 = profile();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            InsuranceRequests $r6 = $r32.insuranceRequests();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            Analytics $r7 = $r33.analytics();
            SettingsNavigator $r1 = this.settingsNavigator;
            GetIsSuperAgentOrAggregator $r8 = getIsSuperAgentOrAggregator();
            DaggerApplicationComponent $r34 = DaggerApplicationComponent.this;
            InterfaceC11700a $r9 = $r34.providesFrequentlyUsedSharedPrefsProvider;
            Object $r10 = $r9.get();
            AccountPresenter $r2 = new AccountPresenter($r4, $r5, $r6, $r7, $r1, $r8, (SharedPreferences) $r10);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ActivatePos activatePos() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            UserRepository $r5 = $r23.userRepository();
            ActivatePos $r1 = new ActivatePos($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ActivatePosViewModel activatePosViewModel() {
            ActivatePos $r2 = activatePos();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            Analytics $r5 = $r32.analytics();
            ActivatePosViewModel $r1 = new ActivatePosViewModel($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ChangePin changePin() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            ChangePin $r1 = new ChangePin($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ChangePinViewModel changePinViewModel() {
            ChangePin $r3 = changePin();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            SettingsNavigator $r1 = this.settingsNavigator;
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            InterfaceC11700a $r6 = $r42.providesSharedPrefsProvider;
            Object $r7 = $r6.get();
            SharedPreferences $r8 = (SharedPreferences) $r7;
            DaggerApplicationComponent $r43 = DaggerApplicationComponent.this;
            Analytics $r9 = $r43.analytics();
            DaggerApplicationComponent $r44 = DaggerApplicationComponent.this;
            PinRepositoryImpl $r10 = $r44.pinRepositoryImpl();
            ChangePinViewModel $r2 = new ChangePinViewModel($r3, $r5, $r1, $r8, $r9, $r10);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ai.kudi.agent.settings.security.p028ui.viewModels.ConfirmOtpViewModel confirmOtpViewModel() {
            SettingsNavigator $r2 = this.settingsNavigator;
            ResetSavingsPin $r3 = resetSavingsPin();
            ai.kudi.agent.settings.domain.useCases.ResendOtp $r4 = resendOtp();
            ai.kudi.agent.settings.security.p028ui.viewModels.ConfirmOtpViewModel $r1 = new ai.kudi.agent.settings.security.p028ui.viewModels.ConfirmOtpViewModel($r2, $r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DeleteDevice deleteDevice() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            DeleteDevice $r1 = new DeleteDevice($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EditProfile editProfile() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            EditProfile $r1 = new EditProfile($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EditProfileViewModel editProfileViewModel() {
            EditProfile $r3 = editProfile();
            UpdateUser $r4 = updateUser();
            DaggerApplicationComponent $r5 = DaggerApplicationComponent.this;
            FetchCurrentUser $r6 = $r5.fetchCurrentUser();
            FetchLocation $r7 = fetchLocation();
            SettingsNavigator $r1 = this.settingsNavigator;
            DaggerApplicationComponent $r52 = DaggerApplicationComponent.this;
            Analytics $r8 = $r52.analytics();
            EditProfileViewModel $r2 = new EditProfileViewModel($r3, $r4, $r6, $r7, $r1, $r8);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EmailVerificationViewModel emailVerificationViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            ResendOtp $r4 = $r3.resendOtp();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            Analytics $r6 = $r33.analytics();
            EmailVerificationNavigator $r2 = this.emailVerificationNavigator;
            EmailVerificationViewModel $r1 = new EmailVerificationViewModel($r4, $r5, $r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchBusinessCategories fetchBusinessCategories() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchBusinessCategories $r1 = new FetchBusinessCategories($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchLocation fetchLocation() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesUserServiceProvider;
            Object $r4 = $r3.get();
            UserService $r5 = (UserService) $r4;
            FetchLocation $r1 = new FetchLocation($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchOutletParent fetchOutletParent() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchOutletParent $r1 = new FetchOutletParent($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchRelationshipMgr fetchRelationshipMgr() {
            RelationshipManagerRepository $r2 = relationshipManagerRepository();
            FetchRelationshipMgr $r1 = new FetchRelationshipMgr($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetDevices getDevices() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            GetDevices $r1 = new GetDevices($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesSharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            GetIsSuperAgentOrAggregator $r1 = new GetIsSuperAgentOrAggregator($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetMonthlyKycLevels getMonthlyKycLevels() {
            KycLevelRepository $r3 = kycLevelRepository();
            RxSchedulers $r2 = new RxSchedulers();
            GetMonthlyKycLevels $r1 = new GetMonthlyKycLevels($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IdTypesViewModel idTypesViewModel() {
            IdtypeRepository $r2 = idtypeRepository();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            ApplicationModule $r4 = $r3.applicationModule;
            C5615f $r5 = ApplicationModule_ProvidesFirebaseDbFactory.providesFirebaseDb($r4);
            IdTypesViewModel $r1 = new IdTypesViewModel($r2, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IdtypeRepository idtypeRepository() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesCoreAppDatabaseProvider;
            Object $r4 = $r3.get();
            CoreAppDatabase $r5 = (CoreAppDatabase) $r4;
            IdtypeRepository $r1 = new IdtypeRepository($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AboutKycFragment injectAboutKycFragment(AboutKycFragment aboutKycFragment) {
            AboutKycViewModel $r2 = aboutKycViewModel();
            AboutKycFragment_MembersInjector.injectAboutKycViewModel(aboutKycFragment, $r2);
            return aboutKycFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AccountAndSettingsOptionsFragment injectAccountAndSettingsOptionsFragment(AccountAndSettingsOptionsFragment accountAndSettingsOptionsFragment) {
            AccountAndSettingsOptionsViewModel $r2 = accountAndSettingsOptionsViewModel();
            AccountAndSettingsOptionsFragment_MembersInjector.injectAccountAndSettingsOptionsViewModel(accountAndSettingsOptionsFragment, $r2);
            return accountAndSettingsOptionsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AccountsFragment injectAccountsFragment(AccountsFragment accountsFragment) {
            AccountPresenter $r2 = accountPresenter();
            AccountsFragment_MembersInjector.injectThisPresenter(accountsFragment, $r2);
            return accountsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ActivatePosFragment injectActivatePosFragment(ActivatePosFragment activatePosFragment) {
            ActivatePosViewModel $r2 = activatePosViewModel();
            ActivatePosFragment_MembersInjector.injectActivatePosVm(activatePosFragment, $r2);
            return activatePosFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ai.kudi.agent.settings.security.p028ui.ConfirmOtpFragment injectConfirmOtpFragment(ai.kudi.agent.settings.security.p028ui.ConfirmOtpFragment confirmOtpFragment) {
            ai.kudi.agent.settings.security.p028ui.viewModels.ConfirmOtpViewModel $r2 = confirmOtpViewModel();
            ai.kudi.agent.settings.security.p028ui.ConfirmOtpFragment_MembersInjector.injectViewModel(confirmOtpFragment, $r2);
            return confirmOtpFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private DisplayTermsFragment injectDisplayTermsFragment(DisplayTermsFragment displayTermsFragment) {
            SettingsNavigator $r2 = this.settingsNavigator;
            DisplayTermsFragment_MembersInjector.injectSettingsNavigator(displayTermsFragment, $r2);
            return displayTermsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EditProfileFragment injectEditProfileFragment(EditProfileFragment editProfileFragment) {
            EditProfileViewModel $r2 = editProfileViewModel();
            EditProfileFragment_MembersInjector.injectEditProfileViewModel(editProfileFragment, $r2);
            return editProfileFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EditUserProfileFragment injectEditUserProfileFragment(EditUserProfileFragment editUserProfileFragment) {
            EditProfileViewModel $r2 = editProfileViewModel();
            EditUserProfileFragment_MembersInjector.injectEditProfileViewModel(editUserProfileFragment, $r2);
            return editUserProfileFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private EmailVerificationFragment injectEmailVerificationFragment(EmailVerificationFragment emailVerificationFragment) {
            EmailVerificationViewModel $r2 = emailVerificationViewModel();
            EmailVerificationFragment_MembersInjector.injectEmailVerificationViewModel(emailVerificationFragment, $r2);
            return emailVerificationFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private IdtypesFragment injectIdtypesFragment(IdtypesFragment idtypesFragment) {
            IdTypesViewModel $r2 = idTypesViewModel();
            IdtypesFragment_MembersInjector.injectIdTypesViewModel(idtypesFragment, $r2);
            return idtypesFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private InsuranceSignUpFragment injectInsuranceSignUpFragment(InsuranceSignUpFragment insuranceSignUpFragment) {
            InsuranceSignupViewModel $r2 = insuranceSignupViewModel();
            InsuranceSignUpFragment_MembersInjector.injectInsuranceViewModel(insuranceSignUpFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.provideFirebaseConfigProvider;
            Object $r5 = $r4.get();
            Frame $r6 = (Frame) $r5;
            InsuranceSignUpFragment_MembersInjector.injectRemoteConfig(insuranceSignUpFragment, $r6);
            return insuranceSignUpFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MyDevicesFragment injectMyDevicesFragment(MyDevicesFragment myDevicesFragment) {
            MyDevicesViewModel $r2 = myDevicesViewModel();
            MyDevicesFragment_MembersInjector.injectMyDevicesViewModel(myDevicesFragment, $r2);
            return myDevicesFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OpenSourceFragment injectOpenSourceFragment(OpenSourceFragment openSourceFragment) {
            OpenSourceViewModel $r2 = openSourceViewModel();
            OpenSourceFragment_MembersInjector.injectOpenSourceViewModel(openSourceFragment, $r2);
            return openSourceFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PersonalFragment injectPersonalFragment(PersonalFragment personalFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesFrequentlyUsedSharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            PersonalFragment_MembersInjector.injectSharedPreferences(personalFragment, $r5);
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            Analytics $r6 = $r22.analytics();
            PersonalFragment_MembersInjector.injectAnalytics(personalFragment, $r6);
            PersonalViewModel $r7 = personalViewModel();
            PersonalFragment_MembersInjector.injectVm(personalFragment, $r7);
            SettingsNavigator $r8 = this.settingsNavigator;
            PersonalFragment_MembersInjector.injectSettingsNavigator(personalFragment, $r8);
            return personalFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PosActivationNotificationReceiverFragment injectPosActivationNotificationReceiverFragment(PosActivationNotificationReceiverFragment posActivationNotificationReceiverFragment) {
            SettingsNavigator $r2 = this.settingsNavigator;
            PosActivationNotificationReceiverFragment_MembersInjector.injectSettingsNavigator(posActivationNotificationReceiverFragment, $r2);
            return posActivationNotificationReceiverFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RelationshipManagerFragment injectRelationshipManagerFragment(RelationshipManagerFragment relationshipManagerFragment) {
            RelationshipMgrViewModel $r2 = relationshipMgrViewModel();
            RelationshipManagerFragment_MembersInjector.injectRelationshipMgrViewModel(relationshipManagerFragment, $r2);
            return relationshipManagerFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ai.kudi.agent.settings.security.p028ui.ResetPinFragment injectResetPinFragment(ai.kudi.agent.settings.security.p028ui.ResetPinFragment resetPinFragment) {
            ChangePinViewModel $r2 = changePinViewModel();
            ai.kudi.agent.settings.security.p028ui.ResetPinFragment_MembersInjector.injectVm(resetPinFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providePFSecurityUtilsFactoryProvider;
            Object $r5 = $r4.get();
            IPFSecurityUtils $r6 = (IPFSecurityUtils) $r5;
            ai.kudi.agent.settings.security.p028ui.ResetPinFragment_MembersInjector.injectFac(resetPinFragment, $r6);
            return resetPinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResetSavingPinFragment injectResetSavingPinFragment(ResetSavingPinFragment resetSavingPinFragment) {
            ResetSavingPinViewModel $r2 = resetSavingPinViewModel();
            ResetSavingPinFragment_MembersInjector.injectResetSavingPinViewModel(resetSavingPinFragment, $r2);
            return resetSavingPinFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SecurityFragment injectSecurityFragment(SecurityFragment securityFragment) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesSharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            SecurityFragment_MembersInjector.injectSharedPreferences(securityFragment, $r5);
            SettingsNavigator $r6 = this.settingsNavigator;
            SecurityFragment_MembersInjector.injectSettingsNavigator(securityFragment, $r6);
            SecurityViewModel $r7 = securityViewModel();
            SecurityFragment_MembersInjector.injectSecurityViewModel(securityFragment, $r7);
            return securityFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SettingsActivity injectSettingsActivity(SettingsActivity settingsActivity) {
            SettingsDetailsViewModel $r2 = settingsDetailsViewModel();
            SettingsActivity_MembersInjector.injectSettingsDetailsViewModel(settingsActivity, $r2);
            SmartLookAnalytics $r3 = new SmartLookAnalytics();
            SettingsActivity_MembersInjector.injectSmartLookAnalytics(settingsActivity, $r3);
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            InterfaceC11700a $r5 = $r4.providesFrequentlyUsedSharedPrefsProvider;
            Object $r6 = $r5.get();
            SharedPreferences $r7 = (SharedPreferences) $r6;
            SettingsActivity_MembersInjector.injectSharedPreferences(settingsActivity, $r7);
            return settingsActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SwitchAccountFragment injectSwitchAccountFragment(SwitchAccountFragment switchAccountFragment) {
            SwitchAccountViewModel $r2 = switchAccountViewModel();
            SwitchAccountFragment_MembersInjector.injectSwitchAccountViewModel(switchAccountFragment, $r2);
            return switchAccountFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpgradeAccountFragment injectUpgradeAccountFragment(UpgradeAccountFragment upgradeAccountFragment) {
            UpgradeViewModel $r2 = upgradeViewModel();
            UpgradeAccountFragment_MembersInjector.injectUpgradeViewModel(upgradeAccountFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            UpgradeAccountFragment_MembersInjector.injectSharedPref(upgradeAccountFragment, $r6);
            return upgradeAccountFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpgradeResultFragment injectUpgradeResultFragment(UpgradeResultFragment upgradeResultFragment) {
            UpgradeViewModel $r2 = upgradeViewModel();
            UpgradeResultFragment_MembersInjector.injectUpgradeViewModel(upgradeResultFragment, $r2);
            return upgradeResultFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private InsuranceSignupViewModel insuranceSignupViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            Analytics $r3 = $r2.analytics();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            InsuranceRequests $r5 = $r23.insuranceRequests();
            DaggerApplicationComponent $r24 = DaggerApplicationComponent.this;
            Application $r6 = $r24.application;
            InsuranceSignupViewModel $r1 = new InsuranceSignupViewModel($r3, $r4, $r5, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KycLevelRemoteDataSource kycLevelRemoteDataSource() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            KycLevelRemoteDataSource $r1 = new KycLevelRemoteDataSource($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KycLevelRepository kycLevelRepository() {
            KycLevelRemoteDataSource $r2 = kycLevelRemoteDataSource();
            KycLevelsLocalDataSource $r3 = kycLevelsLocalDataSource();
            KycLevelRepository $r1 = new KycLevelRepository($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private KycLevelsLocalDataSource kycLevelsLocalDataSource() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesCoreAppDatabaseProvider;
            Object $r5 = $r4.get();
            CoreAppDatabase $r6 = (CoreAppDatabase) $r5;
            RxSchedulers $r2 = new RxSchedulers();
            KycLevelsLocalDataSource $r1 = new KycLevelsLocalDataSource($r6, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MyDevicesViewModel myDevicesViewModel() {
            GetDevices $r2 = getDevices();
            DeleteDevice $r3 = deleteDevice();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            MyDevicesViewModel $r1 = new MyDevicesViewModel($r2, $r3, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OpenSourceViewModel openSourceViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            Application $r2 = $r3.application;
            OpenSourceViewModel $r1 = new OpenSourceViewModel($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PersonalViewModel personalViewModel() {
            Profile $r2 = profile();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            FetchOutletParent $r5 = fetchOutletParent();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            CacheModule $r6 = $r32.cacheModule;
            Pref $r7 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r6);
            GetMonthlyKycLevels $r8 = getMonthlyKycLevels();
            PersonalViewModel $r1 = new PersonalViewModel($r2, $r4, $r5, $r7, $r8);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private Profile profile() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            UserRepository $r2 = $r3.userRepository();
            Profile $r1 = new Profile($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RelationshipManagerRepository relationshipManagerRepository() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r22.providesCoreAppDatabaseProvider;
            Object $r5 = $r4.get();
            CoreAppDatabase $r6 = (CoreAppDatabase) $r5;
            RelationshipManagerRepository $r1 = new RelationshipManagerRepository($r3, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RelationshipMgrViewModel relationshipMgrViewModel() {
            FetchRelationshipMgr $r2 = fetchRelationshipMgr();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            RelationshipMgrViewModel $r1 = new RelationshipMgrViewModel($r2, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RequestPinResetOtp requestPinResetOtp() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r32.networkService();
            RequestPinResetOtp $r1 = new RequestPinResetOtp($r4, $r2, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ai.kudi.agent.settings.domain.useCases.ResendOtp resendOtp() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r32.networkService();
            ai.kudi.agent.settings.domain.useCases.ResendOtp $r1 = new ai.kudi.agent.settings.domain.useCases.ResendOtp($r4, $r2, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResetSavingPinViewModel resetSavingPinViewModel() {
            RequestPinResetOtp $r3 = requestPinResetOtp();
            SettingsNavigator $r2 = this.settingsNavigator;
            ResetSavingPinViewModel $r1 = new ResetSavingPinViewModel($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResetSavingsPin resetSavingsPin() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r32.networkService();
            ResetSavingsPin $r1 = new ResetSavingsPin($r4, $r2, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SecurityViewModel securityViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            Analytics $r4 = $r22.analytics();
            SecurityViewModel $r1 = new SecurityViewModel($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SettingsDetailsViewModel settingsDetailsViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            Analytics $r3 = $r2.analytics();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            BaseOtpUtil $r4 = $r22.baseOtpUtil();
            SettingsDetailsViewModel $r1 = new SettingsDetailsViewModel($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SwitchAccountViewModel switchAccountViewModel() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r3.fetchCurrentUser();
            SwitchCustomerType $r5 = switchCustomerType();
            UpdateUser $r6 = updateUser();
            EditProfile $r7 = editProfile();
            SettingsNavigator $r1 = this.settingsNavigator;
            FetchBusinessCategories $r8 = fetchBusinessCategories();
            SwitchAccountViewModel $r2 = new SwitchAccountViewModel($r4, $r5, $r6, $r7, $r1, $r8);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private SwitchCustomerType switchCustomerType() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r4.networkService();
            RxSchedulers $r2 = new RxSchedulers();
            SwitchCustomerType $r1 = new SwitchCustomerType($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpdateUser updateUser() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            UserRepository $r3 = $r4.userRepository();
            RxSchedulers $r2 = new RxSchedulers();
            UpdateUser $r1 = new UpdateUser($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpgradeUserKyc upgradeUserKyc() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            UpgradeUserKyc $r1 = new UpgradeUserKyc($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UpgradeViewModel upgradeViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            Application $r3 = $r2.application;
            UpgradeUserKyc $r4 = upgradeUserKyc();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r22.fetchCurrentUser();
            UpdateUser $r6 = updateUser();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            Analytics $r7 = $r23.analytics();
            UpgradeViewModel $r1 = new UpgradeViewModel($r3, $r4, $r5, $r6, $r7);
            return $r1;
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(EmailVerificationFragment emailVerificationFragment) {
            injectEmailVerificationFragment(emailVerificationFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(AccountsFragment accountsFragment) {
            injectAccountsFragment(accountsFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(ActivatePosFragment activatePosFragment) {
            injectActivatePosFragment(activatePosFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(InsuranceSignUpFragment insuranceSignUpFragment) {
            injectInsuranceSignUpFragment(insuranceSignUpFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(PosActivationNotificationReceiverFragment posActivationNotificationReceiverFragment) {
            injectPosActivationNotificationReceiverFragment(posActivationNotificationReceiverFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(AboutKycFragment aboutKycFragment) {
            injectAboutKycFragment(aboutKycFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(CameraFragment cameraFragment) {
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(EditProfileFragment editProfileFragment) {
            injectEditProfileFragment(editProfileFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(EditUserProfileFragment editUserProfileFragment) {
            injectEditUserProfileFragment(editUserProfileFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(IdtypesFragment idtypesFragment) {
            injectIdtypesFragment(idtypesFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(PersonalFragment personalFragment) {
            injectPersonalFragment(personalFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(RelationshipManagerFragment relationshipManagerFragment) {
            injectRelationshipManagerFragment(relationshipManagerFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(UpgradeAccountFragment upgradeAccountFragment) {
            injectUpgradeAccountFragment(upgradeAccountFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(UpgradeResultFragment upgradeResultFragment) {
            injectUpgradeResultFragment(upgradeResultFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(ai.kudi.agent.settings.security.p028ui.ConfirmOtpFragment confirmOtpFragment) {
            injectConfirmOtpFragment(confirmOtpFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(MyDevicesFragment myDevicesFragment) {
            injectMyDevicesFragment(myDevicesFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(ai.kudi.agent.settings.security.p028ui.ResetPinFragment resetPinFragment) {
            injectResetPinFragment(resetPinFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(ResetSavingPinFragment resetSavingPinFragment) {
            injectResetSavingPinFragment(resetSavingPinFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(SecurityFragment securityFragment) {
            injectSecurityFragment(securityFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(DisplayTermsFragment displayTermsFragment) {
            injectDisplayTermsFragment(displayTermsFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(TermsAndConditionFragment termsAndConditionFragment) {
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(AccountAndSettingsOptionsFragment accountAndSettingsOptionsFragment) {
            injectAccountAndSettingsOptionsFragment(accountAndSettingsOptionsFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(OpenSourceFragment openSourceFragment) {
            injectOpenSourceFragment(openSourceFragment);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(SettingsActivity settingsActivity) {
            injectSettingsActivity(settingsActivity);
        }

        @Override // ai.kudi.agent.settings.mcc.components.SettingsSubComponent
        public void inject(SwitchAccountFragment switchAccountFragment) {
            injectSwitchAccountFragment(switchAccountFragment);
        }
    }

    /* loaded from: classes.dex */
    final class TransactionCommissionsSubComponentFactory implements TransactionCommissionsSubComponent.Factory {
        private TransactionCommissionsSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent.Factory
        public TransactionCommissionsSubComponent create(TransactionCommissionsNavigator transactionCommissionsNavigator) {
            C9473g.m14650b(transactionCommissionsNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            TransactionCommissionsSubComponentImpl $r2 = new TransactionCommissionsSubComponentImpl(transactionCommissionsNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class TransactionCommissionsSubComponentImpl implements TransactionCommissionsSubComponent {
        private final TransactionCommissionsNavigator transactionsNavigator;

        private TransactionCommissionsSubComponentImpl(TransactionCommissionsNavigator transactionCommissionsNavigator) {
            this.transactionsNavigator = transactionCommissionsNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchWalletActivities fetchWalletActivities() {
            TransactionsRepository $r3 = transactionsRepository();
            RxSchedulers $r2 = new RxSchedulers();
            FetchWalletActivities $r1 = new FetchWalletActivities($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FilterCommissionsViewModel filterCommissionsViewModel() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            TransactionCommissionsNavigator $r1 = this.transactionsNavigator;
            FetchWalletActivities $r6 = fetchWalletActivities();
            ResourceDelegate $r7 = resourceDelegate();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            Analytics $r8 = $r42.analytics();
            ServerTimeToTransactionDayMapper $r9 = serverTimeToTransactionDayMapper();
            TransactionDataToUiMapper $r2 = new TransactionDataToUiMapper();
            FilterCommissionsViewModel $r3 = new FilterCommissionsViewModel($r5, $r1, $r6, $r7, $r8, $r9, $r2);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetAllWalletsUseCase getAllWalletsUseCase() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            GetAllWalletsUseCase $r1 = new GetAllWalletsUseCase($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private GetCommissionCashoutSummaryUseCase getCommissionCashoutSummaryUseCase() {
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            UserRepository $r4 = $r3.userRepository();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r32.networkService();
            GetCommissionCashoutSummaryUseCase $r1 = new GetCommissionCashoutSummaryUseCase($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FilterCommissionsFragment injectFilterCommissionsFragment(FilterCommissionsFragment filterCommissionsFragment) {
            FilterCommissionsViewModel $r2 = filterCommissionsViewModel();
            FilterCommissionsFragment_MembersInjector.injectViewModel(filterCommissionsFragment, $r2);
            return filterCommissionsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionCommissionsActivity injectTransactionCommissionsActivity(TransactionCommissionsActivity transactionCommissionsActivity) {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.providesSharedPrefsProvider;
            Object $r4 = $r3.get();
            SharedPreferences $r5 = (SharedPreferences) $r4;
            TransactionCommissionsActivity_MembersInjector.injectPreferences(transactionCommissionsActivity, $r5);
            TransactionCommissionsActivityViewModel $r6 = transactionCommissionsActivityViewModel();
            TransactionCommissionsActivity_MembersInjector.injectViewModel(transactionCommissionsActivity, $r6);
            return transactionCommissionsActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionCommissionsFragment injectTransactionCommissionsFragment(TransactionCommissionsFragment transactionCommissionsFragment) {
            TransactionCommissionsViewModel $r2 = transactionCommissionsViewModel();
            TransactionCommissionsFragment_MembersInjector.injectViewModel(transactionCommissionsFragment, $r2);
            return transactionCommissionsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LoanProviderUseCase loanProviderUseCase() {
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = $r4.kshockApi();
            LoanProviderUseCase $r1 = new LoanProviderUseCase($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RequestCommissionsCashoutUseCase requestCommissionsCashoutUseCase() {
            RxSchedulers $r2 = new RxSchedulers();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            UserRepository $r4 = $r3.userRepository();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            NetworkService $r5 = $r32.networkService();
            RequestCommissionsCashoutUseCase $r1 = new RequestCommissionsCashoutUseCase($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ResourceDelegate resourceDelegate() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ResourceDelegate $r1 = new ResourceDelegate($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper() {
            ResourceDelegate $r2 = resourceDelegate();
            ServerTimeToTransactionDayMapper $r1 = new ServerTimeToTransactionDayMapper($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel() {
            ResourceDelegate $r2 = resourceDelegate();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            Analytics $r4 = $r3.analytics();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            RequestCommissionsCashoutUseCase $r6 = requestCommissionsCashoutUseCase();
            GetAllWalletsUseCase $r7 = getAllWalletsUseCase();
            LoanProviderUseCase $r8 = loanProviderUseCase();
            TransactionCommissionsActivityViewModel $r1 = new TransactionCommissionsActivityViewModel($r2, $r4, $r5, $r6, $r7, $r8);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionCommissionsViewModel transactionCommissionsViewModel() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r4.fetchCurrentUser();
            DaggerApplicationComponent $r42 = DaggerApplicationComponent.this;
            Analytics $r6 = $r42.analytics();
            TransactionCommissionsNavigator $r1 = this.transactionsNavigator;
            FetchWalletActivities $r7 = fetchWalletActivities();
            ResourceDelegate $r8 = resourceDelegate();
            GetAllWalletsUseCase $r9 = getAllWalletsUseCase();
            GetCommissionCashoutSummaryUseCase $r10 = getCommissionCashoutSummaryUseCase();
            ServerTimeToTransactionDayMapper $r11 = serverTimeToTransactionDayMapper();
            TransactionDataToUiMapper $r2 = new TransactionDataToUiMapper();
            TransactionCommissionsViewModel $r3 = new TransactionCommissionsViewModel($r5, $r6, $r1, $r7, $r8, $r9, $r10, $r11, $r2);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TransactionsRepository transactionsRepository() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            TransactionsRemoteSource $r4 = $r3.transactionsRemoteSource();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            TransactionsLocalSource $r5 = $r32.transactionsLocalSource();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            TransactionsSummaryLocalSource $r6 = $r33.transactionsSummaryLocalSource();
            RxSchedulers $r2 = new RxSchedulers();
            TransactionsRepository $r1 = new TransactionsRepository($r4, $r5, $r6, $r2);
            return $r1;
        }

        @Override // ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent
        public void inject(CommissionsCashoutStatusFragment commissionsCashoutStatusFragment) {
        }

        @Override // ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent
        public void inject(FilterCommissionsFragment filterCommissionsFragment) {
            injectFilterCommissionsFragment(filterCommissionsFragment);
        }

        @Override // ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent
        public void inject(TransactionCommissionsActivity transactionCommissionsActivity) {
            injectTransactionCommissionsActivity(transactionCommissionsActivity);
        }

        @Override // ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent
        public void inject(TransactionCommissionsFragment transactionCommissionsFragment) {
            injectTransactionCommissionsFragment(transactionCommissionsFragment);
        }
    }

    /* loaded from: classes.dex */
    final class VerificationSubComponentFactory implements VerificationSubComponent.Factory {
        private VerificationSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.transactions.data.worker.VerificationSubComponent.Factory
        public VerificationSubComponent create(VerificationNavigator verificationNavigator) {
            C9473g.m14650b(verificationNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            VerificationSubComponentImpl $r2 = new VerificationSubComponentImpl(verificationNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class VerificationSubComponentImpl implements VerificationSubComponent {
        private final VerificationNavigator verificationNavigator;

        private VerificationSubComponentImpl(VerificationNavigator verificationNavigator) {
            this.verificationNavigator = verificationNavigator;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingVerificationActivity injectPendingVerificationActivity(PendingVerificationActivity pendingVerificationActivity) {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            PendingVerificationPresenter $r2 = $r3.pendingVerificationPresenter();
            PendingVerificationActivity_MembersInjector.injectThisPresenter(pendingVerificationActivity, $r2);
            return pendingVerificationActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingVerificationCustomerDetailInputFragment injectPendingVerificationCustomerDetailInputFragment(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment) {
            PendingVerificationCustomerDetailInputPresenter $r2 = pendingVerificationCustomerDetailInputPresenter();
            PendingVerificationCustomerDetailInputFragment_MembersInjector.injectThisPresenter(pendingVerificationCustomerDetailInputFragment, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.provideFirebaseConfigProvider;
            Object $r5 = $r4.get();
            Frame $r6 = (Frame) $r5;
            PendingVerificationCustomerDetailInputFragment_MembersInjector.injectFirebaseRemoteConfig(pendingVerificationCustomerDetailInputFragment, $r6);
            return pendingVerificationCustomerDetailInputFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingVerificationImageCaptureFragment injectPendingVerificationImageCaptureFragment(PendingVerificationImageCaptureFragment pendingVerificationImageCaptureFragment) {
            PendingVerificationImageCapturePresenter $r2 = pendingVerificationImageCapturePresenter();
            PendingVerificationImageCaptureFragment_MembersInjector.injectThisPresenter(pendingVerificationImageCaptureFragment, $r2);
            return pendingVerificationImageCaptureFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingVerificationCustomerDetailInputPresenter pendingVerificationCustomerDetailInputPresenter() {
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r4.fetchCurrentUser();
            VerificationNavigator $r2 = this.verificationNavigator;
            PendingVerificationCustomerDetailInputPresenter $r1 = new PendingVerificationCustomerDetailInputPresenter($r3, $r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PendingVerificationImageCapturePresenter pendingVerificationImageCapturePresenter() {
            VerificationNavigator $r2 = this.verificationNavigator;
            VerifyPendingTransactionRequest $r3 = verifyPendingTransactionRequest();
            DaggerApplicationComponent $r4 = DaggerApplicationComponent.this;
            CacheModule $r5 = $r4.cacheModule;
            Pref $r6 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r5);
            PendingVerificationImageCapturePresenter $r1 = new PendingVerificationImageCapturePresenter($r2, $r3, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyPendingTransactionRequest verifyPendingTransactionRequest() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            NetworkService $r3 = $r2.networkService();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            UserRepository $r4 = $r22.userRepository();
            VerifyPendingTransactionRequest $r1 = new VerifyPendingTransactionRequest($r3, $r4);
            return $r1;
        }

        @Override // ai.kudi.agent.transactions.data.worker.VerificationSubComponent
        public void inject(PendingVerificationActivity pendingVerificationActivity) {
            injectPendingVerificationActivity(pendingVerificationActivity);
        }

        @Override // ai.kudi.agent.transactions.data.worker.VerificationSubComponent
        public void inject(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment) {
            injectPendingVerificationCustomerDetailInputFragment(pendingVerificationCustomerDetailInputFragment);
        }

        @Override // ai.kudi.agent.transactions.data.worker.VerificationSubComponent
        public void inject(PendingVerificationImageCaptureFragment pendingVerificationImageCaptureFragment) {
            injectPendingVerificationImageCaptureFragment(pendingVerificationImageCaptureFragment);
        }
    }

    /* loaded from: classes.dex */
    final class WalletTopupSubcomponentFactory implements WalletTopupSubcomponent.Factory {
        private WalletTopupSubcomponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent.Factory
        public WalletTopupSubcomponent create(WalletTopupNavigator walletTopupNavigator) {
            C9473g.m14650b(walletTopupNavigator);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            WalletTopupSubcomponentImpl $r2 = new WalletTopupSubcomponentImpl(walletTopupNavigator);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class WalletTopupSubcomponentImpl implements WalletTopupSubcomponent {
        private WalletTopupSubcomponentImpl(WalletTopupNavigator walletTopupNavigator) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardPaymentViewModel cardPaymentViewModel() {
            FetchPaymentMethods $r2 = fetchPaymentMethods();
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            Analytics $r4 = $r3.analytics();
            DaggerApplicationComponent $r32 = DaggerApplicationComponent.this;
            FetchCurrentUser $r5 = $r32.fetchCurrentUser();
            DaggerApplicationComponent $r33 = DaggerApplicationComponent.this;
            Application $r6 = $r33.application;
            CardPaymentViewModel $r1 = new CardPaymentViewModel($r2, $r4, $r5, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchBanksWithMethods fetchBanksWithMethods() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            FetchBanksWithMethods $r1 = new FetchBanksWithMethods($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchPaymentMethods fetchPaymentMethods() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            PaymentMethodRepository $r3 = $r2.paymentMethodRepository();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            UserRepository $r4 = $r22.userRepository();
            FetchPaymentMethods $r1 = new FetchPaymentMethods($r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private BankTransferFragment injectBankTransferFragment(BankTransferFragment bankTransferFragment) {
            PaymentMethodViewModel $r2 = paymentMethodViewModel();
            BankTransferFragment_MembersInjector.injectViewModel(bankTransferFragment, $r2);
            return bankTransferFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardPaymentFragment injectCardPaymentFragment(CardPaymentFragment cardPaymentFragment) {
            CardPaymentViewModel $r2 = cardPaymentViewModel();
            CardPaymentFragment_MembersInjector.injectViewModel(cardPaymentFragment, $r2);
            return cardPaymentFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CardTopUpAmountFragment injectCardTopUpAmountFragment(CardTopUpAmountFragment cardTopUpAmountFragment) {
            CardTopUpAmtViewModel $r2 = new CardTopUpAmtViewModel();
            BaseAmountInputFragment_MembersInjector.injectScreenViewModel(cardTopUpAmountFragment, $r2);
            CardTopUpAmtViewModel $r22 = new CardTopUpAmtViewModel();
            CardTopUpAmountFragment_MembersInjector.injectCardTopUpAmtViewModel(cardTopUpAmountFragment, $r22);
            return cardTopUpAmountFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CashDepositFragment injectCashDepositFragment(CashDepositFragment cashDepositFragment) {
            PaymentMethodViewModel $r2 = paymentMethodViewModel();
            CashDepositFragment_MembersInjector.injectViewModel(cashDepositFragment, $r2);
            return cashDepositFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private UssdTopUpBottomSheetFragment injectUssdTopUpBottomSheetFragment(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment) {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            Analytics $r2 = $r3.analytics();
            UssdTopUpBottomSheetFragment_MembersInjector.injectAnalytics(ussdTopUpBottomSheetFragment, $r2);
            return ussdTopUpBottomSheetFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WalletTopUpActivity injectWalletTopUpActivity(WalletTopUpActivity walletTopUpActivity) {
            WalletTopupPresenter $r2 = walletTopupPresenter();
            WalletTopUpActivity_MembersInjector.injectWalletTopupPresenter(walletTopUpActivity, $r2);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            InterfaceC11700a $r4 = $r3.providesFrequentlyUsedSharedPrefsProvider;
            Object $r5 = $r4.get();
            SharedPreferences $r6 = (SharedPreferences) $r5;
            WalletTopUpActivity_MembersInjector.injectSharedPreferences(walletTopUpActivity, $r6);
            SmartLookAnalytics $r7 = new SmartLookAnalytics();
            WalletTopUpActivity_MembersInjector.injectSmartLookAnalytics(walletTopUpActivity, $r7);
            return walletTopUpActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private PaymentMethodViewModel paymentMethodViewModel() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            FetchBanksWithMethods $r4 = fetchBanksWithMethods();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            Analytics $r5 = $r22.analytics();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            Application $r6 = $r23.application;
            PaymentMethodViewModel $r1 = new PaymentMethodViewModel($r3, $r4, $r5, $r6);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProcessTopupNavigator processTopupNavigator() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            ProcessTopupNavigator $r1 = new ProcessTopupNavigator($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private TopupKCashNavigator topupKCashNavigator() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            InterfaceC11700a $r3 = $r2.provideAppContextProvider;
            Object $r4 = $r3.get();
            Context $r5 = (Context) $r4;
            TopupKCashNavigator $r1 = new TopupKCashNavigator($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WalletTopupPresenter walletTopupPresenter() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            ProcessTopupNavigator $r4 = processTopupNavigator();
            TopupKCashNavigator $r5 = topupKCashNavigator();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest $r6 = $r22.submitTransactionRequest();
            WalletTopupPresenter $r1 = new WalletTopupPresenter($r3, $r4, $r5, $r6);
            return $r1;
        }

        @Override // ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent
        public void inject(WalletTopUpActivity walletTopUpActivity) {
            injectWalletTopUpActivity(walletTopUpActivity);
        }

        @Override // ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent
        public void inject(BankTransferFragment bankTransferFragment) {
            injectBankTransferFragment(bankTransferFragment);
        }

        @Override // ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent
        public void inject(CardPaymentFragment cardPaymentFragment) {
            injectCardPaymentFragment(cardPaymentFragment);
        }

        @Override // ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent
        public void inject(CardTopUpAmountFragment cardTopUpAmountFragment) {
            injectCardTopUpAmountFragment(cardTopUpAmountFragment);
        }

        @Override // ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent
        public void inject(CashDepositFragment cashDepositFragment) {
            injectCashDepositFragment(cashDepositFragment);
        }

        @Override // ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent
        public void inject(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment) {
            injectUssdTopUpBottomSheetFragment(ussdTopUpBottomSheetFragment);
        }
    }

    /* loaded from: classes.dex */
    final class WithdrawalSubComponentFactory implements WithdrawalSubComponent.Factory {
        private WithdrawalSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.withdrawal.xmpp.components.WithdrawalSubComponent.Factory
        public WithdrawalSubComponent create(MainWithdrawalView mainWithdrawalView) {
            C9473g.m14650b(mainWithdrawalView);
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            WithdrawalSubComponentImpl $r2 = new WithdrawalSubComponentImpl(mainWithdrawalView);
            return $r2;
        }
    }

    /* loaded from: classes.dex */
    final class WithdrawalSubComponentImpl implements WithdrawalSubComponent {
        private WithdrawalSubComponentImpl(MainWithdrawalView mainWithdrawalView) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OthersWithdrawalFragment injectOthersWithdrawalFragment(OthersWithdrawalFragment othersWithdrawalFragment) {
            OthersWithdrawalPresenter $r2 = othersWithdrawalPresenter();
            OthersWithdrawalFragment_MembersInjector.injectThisPresenter(othersWithdrawalFragment, $r2);
            return othersWithdrawalFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WithdrawActivity injectWithdrawActivity(WithdrawActivity withdrawActivity) {
            MainWithdrawalPresenter $r2 = new MainWithdrawalPresenter();
            WithdrawActivity_MembersInjector.injectThisPresenter(withdrawActivity, $r2);
            SmartLookAnalytics $r3 = new SmartLookAnalytics();
            WithdrawActivity_MembersInjector.injectSmartLookAnalytics(withdrawActivity, $r3);
            return withdrawActivity;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WithdrawalSummaryFragment injectWithdrawalSummaryFragment(WithdrawalSummaryFragment withdrawalSummaryFragment) {
            WithdrawalSummaryPresenter $r2 = withdrawalSummaryPresenter();
            WithdrawalSummaryFragment_MembersInjector.injectThisPresenter(withdrawalSummaryFragment, $r2);
            return withdrawalSummaryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private OthersWithdrawalPresenter othersWithdrawalPresenter() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            PerformServiceFeeLookup $r3 = $r2.performServiceFeeLookup();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            FetchCurrentUser $r4 = $r22.fetchCurrentUser();
            DaggerApplicationComponent $r23 = DaggerApplicationComponent.this;
            Analytics $r5 = $r23.analytics();
            OthersWithdrawalPresenter $r1 = new OthersWithdrawalPresenter($r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RedeemVoucher redeemVoucher() {
            DaggerApplicationComponent $r3 = DaggerApplicationComponent.this;
            NetworkService $r2 = $r3.networkService();
            RedeemVoucher $r1 = new RedeemVoucher($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private WithdrawalSummaryPresenter withdrawalSummaryPresenter() {
            DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
            FetchCurrentUser $r3 = $r2.fetchCurrentUser();
            RedeemVoucher $r4 = redeemVoucher();
            DaggerApplicationComponent $r22 = DaggerApplicationComponent.this;
            Analytics $r5 = $r22.analytics();
            WithdrawalSummaryPresenter $r1 = new WithdrawalSummaryPresenter($r3, $r4, $r5);
            return $r1;
        }

        @Override // ai.kudi.agent.withdrawal.xmpp.components.WithdrawalSubComponent
        public void inject(WithdrawalSummaryFragment withdrawalSummaryFragment) {
            injectWithdrawalSummaryFragment(withdrawalSummaryFragment);
        }

        @Override // ai.kudi.agent.withdrawal.xmpp.components.WithdrawalSubComponent
        public void inject(OthersWithdrawalFragment othersWithdrawalFragment) {
            injectOthersWithdrawalFragment(othersWithdrawalFragment);
        }

        @Override // ai.kudi.agent.withdrawal.xmpp.components.WithdrawalSubComponent
        public void inject(WithdrawActivity withdrawActivity) {
            injectWithdrawActivity(withdrawActivity);
        }
    }

    private DaggerApplicationComponent(ApplicationModule applicationModule, NetworkModule networkModule, ServiceModule serviceModule, NetworkServicesModule networkServicesModule, RepositoryModule repositoryModule, AnalyticsModule analyticsModule, CacheModule cacheModule, MultiPartFileHandlingModule multiPartFileHandlingModule, PictureUploadModule pictureUploadModule, IssueModule issueModule, KShockModule kShockModule, ViewModelFactoryModule viewModelFactoryModule, Application application) {
        this.analyticsModule = analyticsModule;
        this.repositoryModule = repositoryModule;
        this.serviceModule = serviceModule;
        this.networkModule = networkModule;
        this.cacheModule = cacheModule;
        this.applicationModule = applicationModule;
        this.issueModule = issueModule;
        this.pictureUploadModule = pictureUploadModule;
        this.multiPartFileHandlingModule = multiPartFileHandlingModule;
        this.kShockModule = kShockModule;
        this.application = application;
        this.viewModelFactoryModule = viewModelFactoryModule;
        initialize(applicationModule, networkModule, serviceModule, networkServicesModule, repositoryModule, analyticsModule, cacheModule, multiPartFileHandlingModule, pictureUploadModule, issueModule, kShockModule, viewModelFactoryModule, application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountLookup accountLookup() {
        InterfaceC11700a $r4 = this.providesCoreApiServiceProvider;
        Object $r3 = $r4.get();
        CoreApiService $r5 = (CoreApiService) $r3;
        RxSchedulers $r2 = new RxSchedulers();
        AccountLookup $r1 = new AccountLookup($r5, $r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountRepository accountRepository() {
        AddBankAccount $r3 = addBankAccount();
        InterfaceC11700a $r4 = this.providesCoreAppDatabaseProvider;
        Object $r5 = $r4.get();
        CoreAppDatabase $r6 = (CoreAppDatabase) $r5;
        FetchCurrentUserBanks $r7 = fetchCurrentUserBanks();
        InsuranceRequests $r8 = insuranceRequests();
        FetchCurrentUser $r9 = fetchCurrentUser();
        RxSchedulers $r1 = new RxSchedulers();
        AccountRepository $r2 = new AccountRepository($r3, $r6, $r7, $r8, $r9, $r1);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountVerificationPresenter accountVerificationPresenter() {
        BaseOtpUtil $r2 = baseOtpUtil();
        LoginUser $r3 = loginUser();
        AccountVerificationPresenter $r1 = new AccountVerificationPresenter($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private AddBankAccount addBankAccount() {
        NetworkService $r2 = networkService();
        AddBankAccount $r1 = new AddBankAccount($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private AddDevice addDevice() {
        NetworkService $r2 = networkService();
        AddDevice $r1 = new AddDevice($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Analytics analytics() {
        AnalyticsModule $r1 = this.analyticsModule;
        InterfaceC11700a $r2 = this.provideAppContextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        Analytics $r5 = AnalyticsModule_ProvidesAnalyticsImplFactory.providesAnalyticsImpl($r1, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AnnouncementRepository announcementRepository() {
        RepositoryModule $r1 = this.repositoryModule;
        AnnouncementsDataSource $r2 = announcementsDataSource();
        ApplicationModule $r3 = this.applicationModule;
        C5615f $r4 = ApplicationModule_ProvidesFirebaseDbFactory.providesFirebaseDb($r3);
        AnnouncementRepository $r5 = RepositoryModule_ProvideAnnouncementRepoFactory.provideAnnouncementRepo($r1, $r2, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private AnnouncementsDataSource announcementsDataSource() {
        RepositoryModule $r1 = this.repositoryModule;
        InterfaceC11700a $r2 = this.providesCoreAppDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        AnnouncementsDataSource $r5 = RepositoryModule_ProvideAnnouncementDataSourceFactory.provideAnnouncementDataSource($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ApiDataSource apiDataSource() {
        InterfaceC11700a $r3 = this.providesIssuesApiServiceProvider;
        Object $r2 = $r3.get();
        IssuesApiService $r4 = (IssuesApiService) $r2;
        ApiDataSource $r1 = new ApiDataSource($r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private AuthDialog authDialog() {
        FetchCurrentUser $r1 = fetchCurrentUser();
        Authorize $r2 = authorize();
        Analytics $r3 = analytics();
        AuthDialog $r4 = AuthDialog_Factory.newInstance($r1, $r2, $r3);
        return injectAuthDialog($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Authorize authorize() {
        InterfaceC11700a $r3 = this.providesUserServiceProvider;
        Object $r2 = $r3.get();
        UserService $r4 = (UserService) $r2;
        Authorize $r1 = new Authorize($r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private BanksLocalSource banksLocalSource() {
        InterfaceC11700a $r3 = this.providesCoreAppDatabaseProvider;
        Object $r2 = $r3.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r2;
        BanksLocalSource $r1 = new BanksLocalSource($r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private BanksRemoteSource banksRemoteSource() {
        ApplicationModule $r3 = this.applicationModule;
        C5615f $r2 = ApplicationModule_ProvidesFirebaseDbFactory.providesFirebaseDb($r3);
        BanksRemoteSource $r1 = new BanksRemoteSource($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private BanksRepository banksRepository() {
        BanksLocalSource $r2 = banksLocalSource();
        BanksRemoteSource $r3 = banksRemoteSource();
        BanksRepository $r1 = new BanksRepository($r2, $r3);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BanksViewModel banksViewModel() {
        FetchBanks $r2 = fetchBanks();
        BanksViewModel $r1 = new BanksViewModel($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseOtpUtil baseOtpUtil() {
        ai.kudi.agent.login.domain.usecases.VerifyOtp $r2 = verifyOtp();
        RequestOtp $r3 = requestOtp();
        ValidateNewPhoneNumber $r4 = validateNewPhoneNumber();
        ResendOTP $r5 = resendOTP();
        ResendOtp $r6 = resendOtp();
        SendOtpForDeviceVerification $r7 = sendOtpForDeviceVerification();
        VerifySecondaryDetails $r8 = verifySecondaryDetails();
        ValidateOtp $r9 = validateOtp();
        FetchCurrentUser $r10 = fetchCurrentUser();
        BaseOtpUtil $r1 = new BaseOtpUtil($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillerRepository billerRepository() {
        RepositoryModule $r1 = this.repositoryModule;
        BillerRepository $r2 = namedBillerRepository();
        InterfaceC11700a $r3 = this.providesFrequentlyUsedSharedPrefsProvider;
        Object $r4 = $r3.get();
        SharedPreferences $r5 = (SharedPreferences) $r4;
        RemoteBillerRepositoryImpl $r6 = remoteBillerRepositoryImpl();
        return RepositoryModule_ProvideBillerRepoFactory.provideBillerRepo($r1, $r2, $r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationComponent.Builder builder() {
        Builder $r0 = new Builder();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private CashOutVoucherVerification cashOutVoucherVerification() {
        NetworkService $r2 = networkService();
        CashOutVoucherVerification $r1 = new CashOutVoucherVerification($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private CashoutFeesDialog cashoutFeesDialog() {
        PerformServiceFeeLookup $r2 = performServiceFeeLookup();
        CashoutFeesDialog $r1 = new CashoutFeesDialog($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private CashoutPresenter cashoutPresenter() {
        AccountLookup $r2 = accountLookup();
        FetchCurrentUser $r3 = fetchCurrentUser();
        Analytics $r4 = analytics();
        CashoutPresenter $r1 = new CashoutPresenter($r2, $r3, $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private CreateCustomerPresenter createCustomerPresenter() {
        CreateCustomerRequest $r2 = createCustomerRequest();
        CreateCustomerPresenter $r1 = new CreateCustomerPresenter($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private CreateCustomerRequest createCustomerRequest() {
        NetworkService $r2 = networkService();
        UserRepository $r3 = userRepository();
        CreateCustomerRequest $r1 = new CreateCustomerRequest($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private DefaultTransactionLookUpRepository defaultTransactionLookUpRepository() {
        TransactionLookUpRemoteSource $r2 = transactionLookUpRemoteSource();
        DefaultTransactionLookUpRepository $r1 = new DefaultTransactionLookUpRepository($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DispatchingAndroidInjector dispatchingAndroidInjectorOfObject() {
        Map $r1 = mapOfClassOfAndProviderOfAndroidInjectorFactoryOf();
        Map $r2 = AbstractC5077j.m25724l();
        Map r4 = $r2;
        DispatchingAndroidInjector $r3 = C7428c.m18754a($r1, r4);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private EmailTransactionReportPresenter emailTransactionReportPresenter() {
        SendTransactionToMail $r2 = sendTransactionToMail();
        FetchCurrentUser $r3 = fetchCurrentUser();
        EmailTransactionReportPresenter $r1 = new EmailTransactionReportPresenter($r2, $r3);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public EnforceBvnVerificationViewModel enforceBvnVerificationViewModel() {
        UpdateBvnUseCase $r2 = updateBvnUseCase();
        FetchCurrentUser $r3 = fetchCurrentUser();
        EnforceBvnVerificationViewModel $r1 = new EnforceBvnVerificationViewModel($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FaceVerificationViewModel faceVerificationViewModel() {
        SaveImage $r2 = saveImage();
        FaceVerificationViewModel $r1 = new FaceVerificationViewModel($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FetchBanks fetchBanks() {
        BanksRepository $r2 = banksRepository();
        FetchBanks $r1 = new FetchBanks($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FetchCategoryByLabel fetchCategoryByLabel() {
        IssueRepository $r3 = issueRepository();
        RxSchedulers $r2 = new RxSchedulers();
        FetchCategoryByLabel $r1 = new FetchCategoryByLabel($r3, $r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchCurrentUser fetchCurrentUser() {
        UserRepository $r2 = userRepository();
        FetchCurrentUser $r1 = new FetchCurrentUser($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FetchCurrentUserBanks fetchCurrentUserBanks() {
        NetworkService $r2 = networkService();
        FetchCurrentUserBanks $r1 = new FetchCurrentUserBanks($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchIssueType fetchIssueType() {
        InterfaceC11700a $r3 = this.providesIssuesApiServiceProvider;
        Object $r2 = $r3.get();
        IssuesApiService $r4 = (IssuesApiService) $r2;
        FetchIssueType $r1 = new FetchIssueType($r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FetchKCash fetchKCash() {
        NetworkService $r2 = networkService();
        FetchKCash $r1 = new FetchKCash($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FetchNotificationActivities fetchNotificationActivities() {
        NetworkService $r2 = networkService();
        FetchNotificationActivities $r1 = new FetchNotificationActivities($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FetchPhoneNumbers fetchPhoneNumbers() {
        NetworkService $r2 = networkService();
        FetchPhoneNumbers $r1 = new FetchPhoneNumbers($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchTransaction fetchTransaction() {
        TransactionRepository $r2 = transactionRepository();
        FetchTransaction $r1 = new FetchTransaction($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private HelpPresenter helpPresenter() {
        FetchPhoneNumbers $r2 = fetchPhoneNumbers();
        FetchCurrentUser $r3 = fetchCurrentUser();
        Analytics $r4 = analytics();
        HelpPresenter $r1 = new HelpPresenter($r2, $r3, $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private IncompleteTransactionApiToTransactionDataMapper incompleteTransactionApiToTransactionDataMapper() {
        TransactionTypeMapper $r2 = new TransactionTypeMapper();
        IncompleteTransactionApiToTransactionDataMapper $r1 = new IncompleteTransactionApiToTransactionDataMapper($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void initialize(ApplicationModule applicationModule, NetworkModule networkModule, ServiceModule serviceModule, NetworkServicesModule networkServicesModule, RepositoryModule repositoryModule, AnalyticsModule analyticsModule, CacheModule cacheModule, MultiPartFileHandlingModule multiPartFileHandlingModule, PictureUploadModule pictureUploadModule, IssueModule issueModule, KShockModule kShockModule, ViewModelFactoryModule viewModelFactoryModule, Application application) {
        this.productActivitySubcomponentFactoryProvider = new InterfaceC11700a<ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                ProductActivitySubcomponentFactory $r1 = new ProductActivitySubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent.Factory get2() {
                ActivityInjectionModule_InjectAirtimeTopUpFragment.ProductActivitySubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.issueActivitySubcomponentFactoryProvider = new InterfaceC11700a<ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                IssueActivitySubcomponentFactory $r1 = new IssueActivitySubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent.Factory get2() {
                ActivityInjectionModule_InjectIssueActivity.IssueActivitySubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.homeActivitySubcomponentFactoryProvider = new InterfaceC11700a<ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                HomeActivitySubcomponentFactory $r1 = new HomeActivitySubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent.Factory get2() {
                ActivityInjectionModule_InjectHomeActivity.HomeActivitySubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.kShockActivitySubcomponentFactoryProvider = new InterfaceC11700a<ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                KShockActivitySubcomponentFactory $r1 = new KShockActivitySubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent.Factory get2() {
                ActivityInjectionModule_InjectKshockActivity.KShockActivitySubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.savingsActivitySubcomponentFactoryProvider = new InterfaceC11700a<ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                SavingsActivitySubcomponentFactory $r1 = new SavingsActivitySubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent.Factory get2() {
                ActivityInjectionModule_InjectSavingsActivity.SavingsActivitySubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.banksFragmentSubcomponentFactoryProvider = new InterfaceC11700a<FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                BanksFragmentSubcomponentFactory $r1 = new BanksFragmentSubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent.Factory get2() {
                FragmentInjectionModule_InjectBanksFragment.BanksFragmentSubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider = new InterfaceC11700a<FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                IssuesTermsAndConditionsFragmentSubcomponentFactory $r1 = new IssuesTermsAndConditionsFragmentSubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent.Factory get2() {
                FragmentInjectionModule_InjectIssuesTermsAndConditionsFragment.IssuesTermsAndConditionsFragmentSubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.kudiPinSubcomponentFactoryProvider = new InterfaceC11700a<FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.8
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                KudiPinSubcomponentFactory $r1 = new KudiPinSubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent.Factory get2() {
                FragmentInjectionModule_InjectKudiPinV2.KudiPinSubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.f201x23c522c6 = new InterfaceC11700a<FragmentInjectionModule_InjectReceiptTerminalConfirmationFragment.SendReceiptToTerminalConfirmationBottomSheetSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.9
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public FragmentInjectionModule_InjectReceiptTerminalConfirmationFragment.SendReceiptToTerminalConfirmationBottomSheetSubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                SendReceiptToTerminalConfirmationBottomSheetSubcomponentFactory $r1 = new SendReceiptToTerminalConfirmationBottomSheetSubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ FragmentInjectionModule_InjectReceiptTerminalConfirmationFragment.SendReceiptToTerminalConfirmationBottomSheetSubcomponent.Factory get2() {
                AbstractC0189x8054ad7c.SendReceiptToTerminalConfirmationBottomSheetSubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        this.picturePickerFragmentSubcomponentFactoryProvider = new InterfaceC11700a<PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent.Factory>() { // from class: ai.kudi.agent.core.internal.components.DaggerApplicationComponent.10
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            public PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent.Factory get() {
                DaggerApplicationComponent $r2 = DaggerApplicationComponent.this;
                PicturePickerFragmentSubcomponentFactory $r1 = new PicturePickerFragmentSubcomponentFactory();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p472k.p473a.InterfaceC11700a
            /* renamed from: get  reason: avoid collision after fix types in other method */
            public /* bridge */ /* synthetic */ PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent.Factory get2() {
                PicturePickerFragmentModule_InjectPicturePickerFragment.PicturePickerFragmentSubcomponent.Factory $r1 = get();
                return $r1;
            }
        };
        InterfaceC11700a $r24 = C9469e.m14656a(application);
        InterfaceC11700a $r26 = $r24;
        this.applicationProvider = $r26;
        InterfaceC11700a $r262 = $r24;
        InterfaceC11700a $r25 = ApplicationModule_ProvideAppContextFactory.create(applicationModule, $r262);
        InterfaceC11700a $r263 = $r25;
        InterfaceC11700a $r264 = C9467c.m14658a($r263);
        this.provideAppContextProvider = $r264;
        InterfaceC11700a $r27 = ApplicationModule_ProvideSharedPrefsNameFactory.create(applicationModule, $r264);
        InterfaceC11700a $r265 = $r27;
        this.provideSharedPrefsNameProvider = $r265;
        InterfaceC11700a $r266 = this.provideAppContextProvider;
        InterfaceC11700a $r32 = $r27;
        InterfaceC11700a $r28 = ApplicationModule_ProvidesSharedPrefsFactory.create(applicationModule, $r32, $r266);
        InterfaceC11700a $r267 = $r28;
        this.providesSharedPrefsProvider = C9467c.m14658a($r267);
        InterfaceC11700a $r29 = NetworkModule_ProvidesAuthInterceptorFactory.create(networkModule);
        InterfaceC11700a $r268 = $r29;
        this.providesAuthInterceptorProvider = $r268;
        InterfaceC11700a $r30 = NetworkModule_ProvidesVersionInterceptorFactory.create(networkModule);
        InterfaceC11700a $r269 = $r30;
        this.providesVersionInterceptorProvider = $r269;
        InterfaceC11700a $r31 = NetworkModule_ProvidesLoginInterceptorFactory.create(networkModule);
        InterfaceC11700a $r2610 = $r31;
        this.providesLoginInterceptorProvider = $r2610;
        InterfaceC11700a $r2611 = this.provideAppContextProvider;
        InterfaceC11700a $r322 = this.providesAuthInterceptorProvider;
        InterfaceC11700a $r33 = this.providesVersionInterceptorProvider;
        InterfaceC11700a r62 = $r31;
        InterfaceC11700a $r34 = ServiceModule_ProvidesRetrofitFactory.create(serviceModule, $r2611, $r322, $r33, r62);
        InterfaceC11700a $r2612 = $r34;
        this.providesRetrofitProvider = $r2612;
        InterfaceC11700a $r2613 = $r34;
        InterfaceC11700a $r35 = NetworkServicesModule_ProvidesBillsServiceFactory.create(networkServicesModule, $r2613);
        InterfaceC11700a $r2614 = $r35;
        this.providesBillsServiceProvider = C9467c.m14658a($r2614);
        InterfaceC11700a $r2615 = this.provideAppContextProvider;
        InterfaceC11700a $r36 = ApplicationModule_ProvidesCoreAppDatabaseFactory.create(applicationModule, $r2615);
        InterfaceC11700a $r2616 = $r36;
        this.providesCoreAppDatabaseProvider = C9467c.m14658a($r2616);
        InterfaceC11700a $r2617 = this.providesRetrofitProvider;
        InterfaceC11700a $r37 = NetworkServicesModule_ProvidesUserServiceFactory.create(networkServicesModule, $r2617);
        InterfaceC11700a $r2618 = $r37;
        this.providesUserServiceProvider = C9467c.m14658a($r2618);
        InterfaceC11700a $r2619 = this.provideAppContextProvider;
        InterfaceC11700a $r38 = ApplicationModule_ProvidesDeviceSecuritySharedPrefsFactory.create(applicationModule, $r2619);
        InterfaceC11700a $r2620 = $r38;
        InterfaceC11700a $r2621 = C9467c.m14658a($r2620);
        this.providesDeviceSecuritySharedPrefsProvider = $r2621;
        InterfaceC11700a $r39 = ApplicationModule_ProvidesDeviceInfoFactory.create(applicationModule, $r2621);
        InterfaceC11700a $r2622 = $r39;
        this.providesDeviceInfoProvider = C9467c.m14658a($r2622);
        InterfaceC11700a $r2623 = this.providesRetrofitProvider;
        InterfaceC11700a $r40 = NetworkServicesModule_ProvidesCoreApiServiceFactory.create(networkServicesModule, $r2623);
        InterfaceC11700a $r2624 = $r40;
        this.providesCoreApiServiceProvider = C9467c.m14658a($r2624);
        InterfaceC11700a $r2625 = this.provideAppContextProvider;
        InterfaceC11700a $r41 = ApplicationModule_ProvidesFrequentlyUsedSharedPrefsFactory.create(applicationModule, $r2625);
        InterfaceC11700a $r2626 = $r41;
        this.providesFrequentlyUsedSharedPrefsProvider = C9467c.m14658a($r2626);
        InterfaceC11700a $r2627 = this.providesRetrofitProvider;
        InterfaceC11700a $r42 = NetworkServicesModule_ProvidesIssuesApiServiceFactory.create(networkServicesModule, $r2627);
        InterfaceC11700a $r2628 = $r42;
        this.providesIssuesApiServiceProvider = C9467c.m14658a($r2628);
        InterfaceC11700a $r43 = ApplicationModule_ProvideFirebaseConfigFactory.create(applicationModule);
        InterfaceC11700a $r2629 = $r43;
        this.provideFirebaseConfigProvider = C9467c.m14658a($r2629);
        InterfaceC11700a $r2630 = this.provideAppContextProvider;
        InterfaceC11700a $r44 = ApplicationModule_ProvidesGlobalNavigatorFactory.create(applicationModule, $r2630);
        InterfaceC11700a $r2631 = $r44;
        this.providesGlobalNavigatorProvider = C9467c.m14658a($r2631);
        InterfaceC11700a $r2632 = this.providesRetrofitProvider;
        InterfaceC11700a $r45 = NetworkServicesModule_ProvidesSavingApiFactory.create(networkServicesModule, $r2632);
        InterfaceC11700a $r2633 = $r45;
        this.providesSavingApiProvider = C9467c.m14658a($r2633);
        InterfaceC11700a $r2634 = this.providesRetrofitProvider;
        InterfaceC11700a $r46 = KShockModule_ProvidesKShockApiFactory.create(kShockModule, $r2634);
        InterfaceC11700a $r2635 = $r46;
        this.providesKShockApiProvider = $r2635;
        InterfaceC11700a $r2636 = this.providesCoreAppDatabaseProvider;
        InterfaceC11700a $r323 = this.providesUserServiceProvider;
        InterfaceC11700a $r47 = RepositoryModule_ProvidesUserRepositoryFactory.create(repositoryModule, $r2636, $r323);
        InterfaceC11700a $r2637 = $r47;
        this.providesUserRepositoryProvider = $r2637;
        InterfaceC11700a $r2638 = $r47;
        InterfaceC11700a $r48 = FetchCurrentUser_Factory.create($r2638);
        InterfaceC11700a $r2639 = $r48;
        this.fetchCurrentUserProvider = $r2639;
        InterfaceC11700a $r49 = ApplicationModule_ProvideFirebaseCrashlyticsFactory.create(applicationModule);
        InterfaceC11700a $r2640 = $r49;
        InterfaceC11700a $r2641 = C9467c.m14658a($r2640);
        this.provideFirebaseCrashlyticsProvider = $r2641;
        InterfaceC11700a $r50 = ApplicationModule_ProvidePFSecurityUtilsFactoryFactory.create(applicationModule, $r2641);
        InterfaceC11700a $r2642 = $r50;
        this.providePFSecurityUtilsFactoryProvider = C9467c.m14658a($r2642);
        InterfaceC11700a $r2643 = this.provideAppContextProvider;
        InterfaceC11700a $r51 = ApplicationModule_ProvidePayPadFactory.create(applicationModule, $r2643);
        InterfaceC11700a $r2644 = $r51;
        this.providePayPadProvider = C9467c.m14658a($r2644);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private InitializeTerminalRequest initializeTerminalRequest() {
        NetworkService $r3 = networkService();
        RxSchedulers $r2 = new RxSchedulers();
        InitializeTerminalRequest $r1 = new InitializeTerminalRequest($r3, $r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private AccountVerificationHolderActivity injectAccountVerificationHolderActivity(AccountVerificationHolderActivity accountVerificationHolderActivity) {
        AccountVerificationPresenter $r2 = accountVerificationPresenter();
        AccountVerificationHolderActivity_MembersInjector.injectThisPresenter(accountVerificationHolderActivity, $r2);
        return accountVerificationHolderActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private AuthDialog injectAuthDialog(AuthDialog authDialog) {
        InterfaceC11700a $r3 = this.providesDeviceSecuritySharedPrefsProvider;
        Object $r2 = $r3.get();
        SharedPreferences $r4 = (SharedPreferences) $r2;
        AuthDialog_MembersInjector.injectSharedPreferences(authDialog, $r4);
        return authDialog;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private BanksFragment injectBanksFragment(BanksFragment banksFragment) {
        BanksViewModel $r2 = banksViewModel();
        BanksFragment_MembersInjector.injectBanksViewModel(banksFragment, $r2);
        return banksFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private BaseApplication injectBaseApplication(BaseApplication baseApplication) {
        DispatchingAndroidInjector $r2 = dispatchingAndroidInjectorOfObject();
        BaseApplication_MembersInjector.injectDispatchingAndroidInjector(baseApplication, $r2);
        SmartLookAnalytics $r3 = new SmartLookAnalytics();
        BaseApplication_MembersInjector.injectSmartLookAnalytics(baseApplication, $r3);
        return baseApplication;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private CashoutActivity injectCashoutActivity(CashoutActivity cashoutActivity) {
        CashoutPresenter $r2 = cashoutPresenter();
        CashoutActivity_MembersInjector.injectThisPresenter(cashoutActivity, $r2);
        CashoutFeesDialog $r3 = cashoutFeesDialog();
        CashoutActivity_MembersInjector.injectFeesDialog(cashoutActivity, $r3);
        return cashoutActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private CreateCustomerFragment injectCreateCustomerFragment(CreateCustomerFragment createCustomerFragment) {
        CreateCustomerPresenter $r2 = createCustomerPresenter();
        CreateCustomerFragment_MembersInjector.injectThisPresenter(createCustomerFragment, $r2);
        return createCustomerFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private EmailTransactionReportActivity injectEmailTransactionReportActivity(EmailTransactionReportActivity emailTransactionReportActivity) {
        EmailTransactionReportPresenter $r2 = emailTransactionReportPresenter();
        EmailTransactionReportActivity_MembersInjector.injectThisPresenter(emailTransactionReportActivity, $r2);
        return emailTransactionReportActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private EnforceBvnVerificationFragment injectEnforceBvnVerificationFragment(EnforceBvnVerificationFragment enforceBvnVerificationFragment) {
        EnforceBvnVerificationViewModel $r2 = enforceBvnVerificationViewModel();
        EnforceBvnVerificationFragment_MembersInjector.injectViewModel(enforceBvnVerificationFragment, $r2);
        return enforceBvnVerificationFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FCMListenerService injectFCMListenerService(FCMListenerService fCMListenerService) {
        RegisterFcm $r2 = registerFcm();
        FCMListenerService_MembersInjector.injectRegisterFcm(fCMListenerService, $r2);
        FetchCurrentUser $r3 = fetchCurrentUser();
        FCMListenerService_MembersInjector.injectFetchUser(fCMListenerService, $r3);
        InterfaceC11700a $r4 = this.providesFrequentlyUsedSharedPrefsProvider;
        Object $r5 = $r4.get();
        SharedPreferences $r6 = (SharedPreferences) $r5;
        FCMListenerService_MembersInjector.injectSharedPreferences(fCMListenerService, $r6);
        CacheModule $r7 = this.cacheModule;
        Pref $r8 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r7);
        FCMListenerService_MembersInjector.injectPref(fCMListenerService, $r8);
        return fCMListenerService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FaceVerificationFragment injectFaceVerificationFragment(FaceVerificationFragment faceVerificationFragment) {
        FaceVerificationViewModel $r2 = faceVerificationViewModel();
        FaceVerificationFragment_MembersInjector.injectViewModel(faceVerificationFragment, $r2);
        return faceVerificationFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private HelpActivity injectHelpActivity(HelpActivity helpActivity) {
        HelpPresenter $r2 = helpPresenter();
        HelpActivity_MembersInjector.injectThisPresenter(helpActivity, $r2);
        return helpActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private IssuesTermsAndConditionsFragment injectIssuesTermsAndConditionsFragment(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment) {
        TermsAndAndConditionsViewModel $r2 = termsAndAndConditionsViewModel();
        IssuesTermsAndConditionsFragment_MembersInjector.injectTermsAndAndConditionsViewModel(issuesTermsAndConditionsFragment, $r2);
        return issuesTermsAndConditionsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private KCashActivity injectKCashActivity(KCashActivity kCashActivity) {
        KCashViewModel $r2 = kCashViewModel();
        KCashActivity_MembersInjector.injectVm(kCashActivity, $r2);
        return kCashActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private KCashTopupActivity injectKCashTopupActivity(KCashTopupActivity kCashTopupActivity) {
        KCashTopupViewModel $r2 = kCashTopupViewModel();
        KCashTopupActivity_MembersInjector.injectViewModel(kCashTopupActivity, $r2);
        return kCashTopupActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private NotificationActivity injectNotificationActivity(NotificationActivity notificationActivity) {
        NotificationPresenter $r2 = notificationPresenter();
        NotificationActivity_MembersInjector.injectThisPresenter(notificationActivity, $r2);
        InterfaceC11700a $r3 = this.providesFrequentlyUsedSharedPrefsProvider;
        Object $r4 = $r3.get();
        SharedPreferences $r5 = (SharedPreferences) $r4;
        NotificationActivity_MembersInjector.injectSharedPreferences(notificationActivity, $r5);
        return notificationActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private NotificationDetailsActivity injectNotificationDetailsActivity(NotificationDetailsActivity notificationDetailsActivity) {
        NotificationDetailsPresenter $r2 = notificationDetailsPresenter();
        NotificationDetailsActivity_MembersInjector.injectThisPresenter(notificationDetailsActivity, $r2);
        return notificationDetailsActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private OnBoardingActivity injectOnBoardingActivity(OnBoardingActivity onBoardingActivity) {
        Analytics $r2 = analytics();
        OnBoardingActivity_MembersInjector.injectAnalytics(onBoardingActivity, $r2);
        SmartLookAnalytics $r3 = new SmartLookAnalytics();
        OnBoardingActivity_MembersInjector.injectSmartLookAnalytics(onBoardingActivity, $r3);
        return onBoardingActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private OtpFragment injectOtpFragment(OtpFragment otpFragment) {
        InterfaceC11700a $r3 = this.provideFirebaseConfigProvider;
        Object $r2 = $r3.get();
        Frame $r4 = (Frame) $r2;
        OtpFragment_MembersInjector.injectRemoteConfig(otpFragment, $r4);
        OtpViewModel $r5 = new OtpViewModel();
        OtpFragment_MembersInjector.injectOtpViewModel(otpFragment, $r5);
        return otpFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private PerformPaymentActivity injectPerformPaymentActivity(PerformPaymentActivity performPaymentActivity) {
        PerformPaymentViewModel $r2 = performPaymentViewModel();
        PerformPaymentActivity_MembersInjector.injectViewModel(performPaymentActivity, $r2);
        AuthDialog $r3 = authDialog();
        PerformPaymentActivity_MembersInjector.injectAuthDialog(performPaymentActivity, $r3);
        return performPaymentActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private RequestStatementActivity injectRequestStatementActivity(RequestStatementActivity requestStatementActivity) {
        RequestStatementPresenter $r2 = requestStatementPresenter();
        RequestStatementActivity_MembersInjector.injectThisPresenter(requestStatementActivity, $r2);
        SmartLookAnalytics $r3 = new SmartLookAnalytics();
        RequestStatementActivity_MembersInjector.injectSmartLookAnalytics(requestStatementActivity, $r3);
        return requestStatementActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private SetupAgentAccountActivity injectSetupAgentAccountActivity(SetupAgentAccountActivity setupAgentAccountActivity) {
        SecureAccountPresenter $r2 = secureAccountPresenter();
        SetupAgentAccountActivity_MembersInjector.injectThisPresenter(setupAgentAccountActivity, $r2);
        return setupAgentAccountActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private SplashActivity injectSplashActivity(SplashActivity splashActivity) {
        InterfaceC11700a $r2 = this.providesSharedPrefsProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        SplashActivity_MembersInjector.injectSharedPrefs(splashActivity, $r4);
        Analytics $r5 = analytics();
        SplashActivity_MembersInjector.injectAnalytics(splashActivity, $r5);
        return splashActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionBreakDownActivity injectTransactionBreakDownActivity(TransactionBreakDownActivity transactionBreakDownActivity) {
        TransactionBreakDownPresenter $r2 = transactionBreakDownPresenter();
        TransactionBreakDownActivity_MembersInjector.injectThisPresenter(transactionBreakDownActivity, $r2);
        return transactionBreakDownActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionDetailsActionActivity injectTransactionDetailsActionActivity(TransactionDetailsActionActivity transactionDetailsActionActivity) {
        PendingVerificationPresenter $r2 = pendingVerificationPresenter();
        TransactionDetailsActionActivity_MembersInjector.injectThisPresenter(transactionDetailsActionActivity, $r2);
        return transactionDetailsActionActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionDetailsActivity injectTransactionDetailsActivity(TransactionDetailsActivity transactionDetailsActivity) {
        TransactionDetailsPresenter $r2 = transactionDetailsPresenter();
        TransactionDetailsActivity_MembersInjector.injectThisPresenter(transactionDetailsActivity, $r2);
        InterfaceC11700a $r3 = this.provideFirebaseConfigProvider;
        Object $r4 = $r3.get();
        Frame $r5 = (Frame) $r4;
        TransactionDetailsActivity_MembersInjector.injectRemoteConfig(transactionDetailsActivity, $r5);
        TransactionTypeMapper $r6 = new TransactionTypeMapper();
        TransactionDetailsActivity_MembersInjector.injectTransactionTypeMapper(transactionDetailsActivity, $r6);
        CacheModule $r7 = this.cacheModule;
        Pref $r8 = CacheModule_ProvideCacheImplFactory.provideCacheImpl($r7);
        TransactionDetailsActivity_MembersInjector.injectPref(transactionDetailsActivity, $r8);
        FetchBanks $r9 = fetchBanks();
        TransactionDetailsActivity_MembersInjector.injectFetchBanks(transactionDetailsActivity, $r9);
        return transactionDetailsActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionIssueFragment injectTransactionIssueFragment(TransactionIssueFragment transactionIssueFragment) {
        TransactionIssuePresenter $r2 = transactionIssuePresenter();
        TransactionIssueFragment_MembersInjector.injectThisPresenter(transactionIssueFragment, $r2);
        return transactionIssueFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private UnauthorizedInstallationActivity injectUnauthorizedInstallationActivity(UnauthorizedInstallationActivity unauthorizedInstallationActivity) {
        Analytics $r2 = analytics();
        UnauthorizedInstallationActivity_MembersInjector.injectAnalyticsImpl(unauthorizedInstallationActivity, $r2);
        return unauthorizedInstallationActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private VoucherCashOutPhoneVerificationActivity injectVoucherCashOutPhoneVerificationActivity(VoucherCashOutPhoneVerificationActivity voucherCashOutPhoneVerificationActivity) {
        VoucherPhoneVerificationPresenter $r2 = voucherPhoneVerificationPresenter();
        VoucherCashOutPhoneVerificationActivity_MembersInjector.injectThisPresenter(voucherCashOutPhoneVerificationActivity, $r2);
        return voucherCashOutPhoneVerificationActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private VoucherCodeInputFragment injectVoucherCodeInputFragment(VoucherCodeInputFragment voucherCodeInputFragment) {
        VoucherVerificationPresenter $r2 = voucherVerificationPresenter();
        VoucherCodeInputFragment_MembersInjector.injectThisPresenter(voucherCodeInputFragment, $r2);
        return voucherCodeInputFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InsuranceRequests insuranceRequests() {
        NetworkService $r3 = networkService();
        RxSchedulers $r2 = new RxSchedulers();
        InsuranceRequests $r1 = new InsuranceRequests($r3, $r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueRepository issueRepository() {
        IssueModule $r1 = this.issueModule;
        LocalDataSource $r2 = localDataSource();
        ApiDataSource $r3 = apiDataSource();
        InterfaceC11700a $r4 = this.providesSharedPrefsProvider;
        Object $r5 = $r4.get();
        SharedPreferences $r6 = (SharedPreferences) $r5;
        IssueRepository $r7 = IssueModule_ProvidesIssueRepositoryFactory.providesIssueRepository($r1, $r2, $r3, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private KCashTopupViewModel kCashTopupViewModel() {
        FetchKCash $r2 = fetchKCash();
        KCashTopupViewModel $r1 = new KCashTopupViewModel($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private KCashViewModel kCashViewModel() {
        FetchCurrentUser $r2 = fetchCurrentUser();
        KCashViewModel $r1 = new KCashViewModel($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi() {
        KShockModule $r1 = this.kShockModule;
        C14841m $r2 = kudiRetrofitRetrofit();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = KShockModule_ProvidesKShockApiFactory.providesKShockApi($r1, $r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private C14841m kudiRetrofitRetrofit() {
        ServiceModule $r1 = this.serviceModule;
        InterfaceC11700a $r2 = this.provideAppContextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        NetworkModule $r5 = this.networkModule;
        InterfaceC14233u $r6 = NetworkModule_ProvidesAuthInterceptorFactory.providesAuthInterceptor($r5);
        NetworkModule $r52 = this.networkModule;
        InterfaceC14233u $r7 = NetworkModule_ProvidesVersionInterceptorFactory.providesVersionInterceptor($r52);
        NetworkModule $r53 = this.networkModule;
        C14207a $r8 = NetworkModule_ProvidesLoginInterceptorFactory.providesLoginInterceptor($r53);
        C14841m $r9 = ServiceModule_ProvidesRetrofitFactory.providesRetrofit($r1, $r4, $r6, $r7, $r8);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private LocalDataSource localDataSource() {
        InterfaceC11700a $r3 = this.providesCoreAppDatabaseProvider;
        Object $r2 = $r3.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r2;
        LocalDataSource $r1 = new LocalDataSource($r4);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoginUser loginUser() {
        InterfaceC11700a $r2 = this.providesUserServiceProvider;
        Object $r3 = $r2.get();
        UserService $r4 = (UserService) $r3;
        UserRepository $r5 = userRepository();
        ApplicationModule $r6 = this.applicationModule;
        FirebaseAuth $r7 = ApplicationModule_ProvidesFirebaseAuthenticationFactory.providesFirebaseAuthentication($r6);
        AccountRepository $r8 = accountRepository();
        InterfaceC11700a $r22 = this.providesSharedPrefsProvider;
        Object $r32 = $r22.get();
        LoginUser $r1 = new LoginUser($r4, $r5, $r7, $r8, (SharedPreferences) $r32);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Map mapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
        AbstractC5077j.C5078a $r1 = AbstractC5077j.m25729a(10);
        InterfaceC11700a $r2 = this.productActivitySubcomponentFactoryProvider;
        $r1.m25720c(ProductActivity.class, $r2);
        InterfaceC11700a $r22 = this.issueActivitySubcomponentFactoryProvider;
        $r1.m25720c(IssueActivity.class, $r22);
        InterfaceC11700a $r23 = this.homeActivitySubcomponentFactoryProvider;
        $r1.m25720c(HomeActivity.class, $r23);
        InterfaceC11700a $r24 = this.kShockActivitySubcomponentFactoryProvider;
        $r1.m25720c(KShockActivity.class, $r24);
        InterfaceC11700a $r25 = this.savingsActivitySubcomponentFactoryProvider;
        $r1.m25720c(SavingsActivity.class, $r25);
        InterfaceC11700a $r26 = this.banksFragmentSubcomponentFactoryProvider;
        $r1.m25720c(BanksFragment.class, $r26);
        InterfaceC11700a $r27 = this.issuesTermsAndConditionsFragmentSubcomponentFactoryProvider;
        $r1.m25720c(IssuesTermsAndConditionsFragment.class, $r27);
        InterfaceC11700a $r28 = this.kudiPinSubcomponentFactoryProvider;
        $r1.m25720c(KudiPin.class, $r28);
        InterfaceC11700a $r29 = this.f201x23c522c6;
        $r1.m25720c(SendReceiptToTerminalConfirmationBottomSheet.class, $r29);
        InterfaceC11700a $r210 = this.picturePickerFragmentSubcomponentFactoryProvider;
        $r1.m25720c(PicturePickerFragment.class, $r210);
        Map $r3 = $r1.m25722a();
        Map r4 = $r3;
        return r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private BillerRepository namedBillerRepository() {
        RepositoryModule $r1 = this.repositoryModule;
        InterfaceC11700a $r2 = this.providesCoreAppDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        BillerRepository $r5 = RepositoryModule_ProvideBillerLocalSourceFactory.provideBillerLocalSource($r1, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CheckPermission namedCheckPermission() {
        PictureUploadModule $r1 = this.pictureUploadModule;
        InterfaceC11700a $r2 = this.provideAppContextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        CheckPermission $r5 = PictureUploadModule_ProvidesCheckStoragePermissionFactory.providesCheckStoragePermission($r1, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CheckPermission namedCheckPermission2() {
        PictureUploadModule $r1 = this.pictureUploadModule;
        InterfaceC11700a $r2 = this.provideAppContextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        CheckPermission $r5 = PictureUploadModule_ProvidesCheckCameraPermissionFactory.providesCheckCameraPermission($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionRepository namedTransactionRepository() {
        RepositoryModule $r1 = this.repositoryModule;
        UserRepository $r2 = userRepository();
        NetworkService $r3 = networkService();
        TransactionRepository $r4 = RepositoryModule_ProvidesTransactionRemoteDataSourceFactory.providesTransactionRemoteDataSource($r1, $r2, $r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NetworkService networkService() {
        C14841m $r2 = kudiRetrofitRetrofit();
        NetworkService $r1 = new NetworkService($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private NotificationDetailsPresenter notificationDetailsPresenter() {
        UpdateNotificationReadStatus $r2 = updateNotificationReadStatus();
        NotificationDetailsPresenter $r1 = new NotificationDetailsPresenter($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private NotificationPresenter notificationPresenter() {
        FetchCurrentUser $r2 = fetchCurrentUser();
        FetchNotificationActivities $r3 = fetchNotificationActivities();
        NotificationPresenter $r1 = new NotificationPresenter($r2, $r3);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PaymentMethodRepository paymentMethodRepository() {
        RepositoryModule $r1 = this.repositoryModule;
        NetworkService $r2 = networkService();
        InterfaceC11700a $r3 = this.providesCoreAppDatabaseProvider;
        Object $r4 = $r3.get();
        CoreAppDatabase $r5 = (CoreAppDatabase) $r4;
        PaymentMethodRepository $r6 = RepositoryModule_ProvidesPaymentMethodRepositoryFactory.providesPaymentMethodRepository($r1, $r2, $r5);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingVerificationPresenter pendingVerificationPresenter() {
        FetchCurrentUser $r2 = fetchCurrentUser();
        Analytics $r3 = analytics();
        PendingVerificationPresenter $r1 = new PendingVerificationPresenter($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private PerformPaymentViewModel performPaymentViewModel() {
        SubmitBillRequest $r2 = submitBillRequest();
        ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest $r3 = submitTransactionRequest();
        SubmitTransferRequest $r4 = submitTransferRequest();
        SubmitWithdrawalRequest $r5 = submitWithdrawalRequest();
        SubmitWithdrawalUpdate $r6 = submitWithdrawalUpdate();
        TransferToBank $r7 = transferToBank();
        PerformServiceFeeLookup $r8 = performServiceFeeLookup();
        FetchTransaction $r9 = fetchTransaction();
        PerformPaymentViewModel $r1 = new PerformPaymentViewModel($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PerformServiceFeeLookup performServiceFeeLookup() {
        InterfaceC11700a $r2 = this.providesCoreApiServiceProvider;
        Object $r3 = $r2.get();
        CoreApiService $r4 = (CoreApiService) $r3;
        UserRepository $r5 = userRepository();
        PerformServiceFeeLookup $r1 = new PerformServiceFeeLookup($r4, $r5);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PinRepositoryImpl pinRepositoryImpl() {
        ApplicationModule $r1 = this.applicationModule;
        InterfaceC11700a $r2 = this.providesCoreAppDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        PinRepositoryImpl $r5 = ApplicationModule_ProvidesPinRepoFactory.providesPinRepo($r1, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RegisterFcm registerFcm() {
        UserRepository $r2 = userRepository();
        RegisterFcm $r1 = new RegisterFcm($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RemoteBillerRepositoryImpl remoteBillerRepositoryImpl() {
        RepositoryModule $r1 = this.repositoryModule;
        ApplicationModule $r2 = this.applicationModule;
        C5615f $r3 = ApplicationModule_ProvidesFirebaseDbFactory.providesFirebaseDb($r2);
        RemoteBillerRepositoryImpl $r4 = RepositoryModule_ProvideBillerRemoteSourceFactory.provideBillerRemoteSource($r1, $r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RequestOtp requestOtp() {
        NetworkService $r2 = networkService();
        RequestOtp $r1 = new RequestOtp($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private RequestStatement requestStatement() {
        NetworkService $r2 = networkService();
        RequestStatement $r1 = new RequestStatement($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private RequestStatementPresenter requestStatementPresenter() {
        FetchCurrentUser $r2 = fetchCurrentUser();
        RequestStatement $r3 = requestStatement();
        RequestStatementPresenter $r1 = new RequestStatementPresenter($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ResendOTP resendOTP() {
        NetworkService $r2 = networkService();
        ResendOTP $r1 = new ResendOTP($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ResendOtp resendOtp() {
        NetworkService $r2 = networkService();
        ResendOtp $r1 = new ResendOtp($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SaveImage saveImage() {
        NetworkModule $r3 = this.networkModule;
        DrakeClient $r2 = NetworkModule_ProvidesMediaServiceFactory.providesMediaService($r3);
        SaveImage $r1 = new SaveImage($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private SearchWalletActivityResponseToTransactionDataMapper searchWalletActivityResponseToTransactionDataMapper() {
        TransactionTypeMapper $r2 = new TransactionTypeMapper();
        SearchWalletActivityResponseToTransactionDataMapper $r1 = new SearchWalletActivityResponseToTransactionDataMapper($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private SecureAccountPresenter secureAccountPresenter() {
        AddDevice $r2 = addDevice();
        FetchCurrentUser $r3 = fetchCurrentUser();
        SecureAccountPresenter $r1 = new SecureAccountPresenter($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private SendOtpForDeviceVerification sendOtpForDeviceVerification() {
        NetworkService $r2 = networkService();
        SendOtpForDeviceVerification $r1 = new SendOtpForDeviceVerification($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private SendTransactionToMail sendTransactionToMail() {
        NetworkService $r2 = networkService();
        SendTransactionToMail $r1 = new SendTransactionToMail($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitBillRequest submitBillRequest() {
        InterfaceC11700a $r2 = this.providesBillsServiceProvider;
        Object $r3 = $r2.get();
        BillsService $r4 = (BillsService) $r3;
        UserRepository $r5 = userRepository();
        SubmitBillRequest $r1 = new SubmitBillRequest($r4, $r5);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest submitTransactionRequest() {
        NetworkService $r2 = networkService();
        UserRepository $r3 = userRepository();
        ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest $r1 = new ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest($r2, $r3);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitTransferRequest submitTransferRequest() {
        NetworkService $r2 = networkService();
        UserRepository $r3 = userRepository();
        InterfaceC11700a $r4 = this.providesDeviceInfoProvider;
        Object $r5 = $r4.get();
        DeviceInformation $r6 = (DeviceInformation) $r5;
        SubmitTransferRequest $r1 = new SubmitTransferRequest($r2, $r3, $r6);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private SubmitWithdrawalRequest submitWithdrawalRequest() {
        NetworkService $r2 = networkService();
        UserRepository $r3 = userRepository();
        SubmitWithdrawalRequest $r1 = new SubmitWithdrawalRequest($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private SubmitWithdrawalUpdate submitWithdrawalUpdate() {
        NetworkService $r2 = networkService();
        UserRepository $r3 = userRepository();
        SubmitWithdrawalUpdate $r1 = new SubmitWithdrawalUpdate($r2, $r3);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TermsAndAndConditionsViewModel termsAndAndConditionsViewModel() {
        FetchCurrentUser $r2 = fetchCurrentUser();
        TermsAndAndConditionsViewModel $r1 = new TermsAndAndConditionsViewModel($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionApiToDataMapper transactionApiToDataMapper() {
        TransactionTypeMapper $r2 = new TransactionTypeMapper();
        TransactionApiToDataMapper $r1 = new TransactionApiToDataMapper($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionBreakDownPresenter transactionBreakDownPresenter() {
        FetchCurrentUser $r2 = fetchCurrentUser();
        TransactionBreakDownSummary $r3 = transactionBreakDownSummary();
        TransactionBreakDownPresenter $r1 = new TransactionBreakDownPresenter($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionBreakDownSummary transactionBreakDownSummary() {
        NetworkService $r2 = networkService();
        TransactionBreakDownSummary $r1 = new TransactionBreakDownSummary($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionDataToDatabaseMapper transactionDataToDatabaseMapper() {
        TransactionTypeDataToDatabaseMapper $r2 = new TransactionTypeDataToDatabaseMapper();
        TransactionKindDataToDatabaseMapper $r3 = new TransactionKindDataToDatabaseMapper();
        TransactionDataToDatabaseMapper $r1 = new TransactionDataToDatabaseMapper($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionDatabaseToDataMapper transactionDatabaseToDataMapper() {
        TransactionTypeDatabaseToDataMapper $r2 = new TransactionTypeDatabaseToDataMapper();
        TransactionKindDatabaseToDataMapper $r3 = new TransactionKindDatabaseToDataMapper();
        TransactionDatabaseToDataMapper $r1 = new TransactionDatabaseToDataMapper($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionDetailsPresenter transactionDetailsPresenter() {
        FetchTransaction $r2 = fetchTransaction();
        FetchCurrentUser $r3 = fetchCurrentUser();
        UpdateNotificationReadStatus $r4 = updateNotificationReadStatus();
        Analytics $r5 = analytics();
        ApplicationModule $r6 = this.applicationModule;
        C5615f $r7 = ApplicationModule_ProvidesFirebaseDbFactory.providesFirebaseDb($r6);
        FetchCategoryByLabel $r8 = fetchCategoryByLabel();
        InitializeTerminalRequest $r9 = initializeTerminalRequest();
        TransactionDetailsPresenter $r1 = new TransactionDetailsPresenter($r2, $r3, $r4, $r5, $r7, $r8, $r9);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionIssuePresenter transactionIssuePresenter() {
        FetchIssueType $r2 = fetchIssueType();
        FetchCurrentUser $r3 = fetchCurrentUser();
        TransactionIssuePresenter $r1 = new TransactionIssuePresenter($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionLookUpRemoteSource transactionLookUpRemoteSource() {
        NetworkService $r2 = networkService();
        TransactionLookUpRemoteSource $r1 = new TransactionLookUpRemoteSource($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionLookUpRepository transactionLookUpRepository() {
        RepositoryModule $r1 = this.repositoryModule;
        DefaultTransactionLookUpRepository $r2 = defaultTransactionLookUpRepository();
        TransactionLookUpRepository $r3 = RepositoryModule_ProvideTransactionLookUpRepositoryFactory.provideTransactionLookUpRepository($r1, $r2);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionRepository transactionRepository() {
        RepositoryModule $r1 = this.repositoryModule;
        TransactionRepository $r2 = namedTransactionRepository();
        return RepositoryModule_ProvideDefaultTransactionRepositoryFactory.provideDefaultTransactionRepository($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionSummaryDataToDatabaseMapper transactionSummaryDataToDatabaseMapper() {
        TransactionSummaryTypeUiToDatabaseMapper $r2 = new TransactionSummaryTypeUiToDatabaseMapper();
        TransactionSummaryDataToDatabaseMapper $r1 = new TransactionSummaryDataToDatabaseMapper($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TransactionSummaryDatabaseToDataMapper transactionSummaryDatabaseToDataMapper() {
        TransactionSummaryTypeDatabaseToUiMapper $r2 = new TransactionSummaryTypeDatabaseToUiMapper();
        TransactionSummaryDatabaseToDataMapper $r1 = new TransactionSummaryDatabaseToDataMapper($r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsLocalSource transactionsLocalSource() {
        RepositoryModule $r1 = this.repositoryModule;
        InterfaceC11700a $r2 = this.providesCoreAppDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        TransactionDataToDatabaseMapper $r5 = transactionDataToDatabaseMapper();
        TransactionDatabaseToDataMapper $r6 = transactionDatabaseToDataMapper();
        TransactionsLocalSource $r7 = RepositoryModule_ProvidesTransactionsLocalSourceFactory.providesTransactionsLocalSource($r1, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsRemoteSource transactionsRemoteSource() {
        RepositoryModule $r1 = this.repositoryModule;
        NetworkService $r2 = networkService();
        IncompleteTransactionApiToTransactionDataMapper $r3 = incompleteTransactionApiToTransactionDataMapper();
        WalletActivityApiToTransactionDataMapper $r4 = walletActivityApiToTransactionDataMapper();
        SearchWalletActivityResponseToTransactionDataMapper $r5 = searchWalletActivityResponseToTransactionDataMapper();
        TransactionApiToDataMapper $r6 = transactionApiToDataMapper();
        TransactionsRemoteSource $r7 = RepositoryModule_ProvidesTransactionsRemoteSourceFactory.providesTransactionsRemoteSource($r1, $r2, $r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsSummaryLocalSource transactionsSummaryLocalSource() {
        RepositoryModule $r1 = this.repositoryModule;
        InterfaceC11700a $r2 = this.providesCoreAppDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        TransactionSummaryDataToDatabaseMapper $r5 = transactionSummaryDataToDatabaseMapper();
        TransactionSummaryDatabaseToDataMapper $r6 = transactionSummaryDatabaseToDataMapper();
        TransactionsSummaryLocalSource $r7 = RepositoryModule_ProvidesTransactionsSummaryLocalSourceFactory.providesTransactionsSummaryLocalSource($r1, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferToBank transferToBank() {
        NetworkService $r3 = networkService();
        UserRepository $r4 = userRepository();
        InterfaceC11700a $r5 = this.providesDeviceInfoProvider;
        Object $r6 = $r5.get();
        DeviceInformation $r7 = (DeviceInformation) $r6;
        RxSchedulers $r2 = new RxSchedulers();
        TransferToBank $r1 = new TransferToBank($r3, $r4, $r7, $r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private UpdateBvnUseCase updateBvnUseCase() {
        NetworkService $r3 = networkService();
        RxSchedulers $r2 = new RxSchedulers();
        UpdateBvnUseCase $r1 = new UpdateBvnUseCase($r3, $r2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UpdateNotificationReadStatus updateNotificationReadStatus() {
        InterfaceC11700a $r3 = this.providesCoreApiServiceProvider;
        Object $r2 = $r3.get();
        CoreApiService $r4 = (CoreApiService) $r2;
        UpdateNotificationReadStatus $r1 = new UpdateNotificationReadStatus($r4);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UserRepository userRepository() {
        RepositoryModule $r1 = this.repositoryModule;
        InterfaceC11700a $r2 = this.providesCoreAppDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        InterfaceC11700a $r22 = this.providesUserServiceProvider;
        Object $r32 = $r22.get();
        UserService $r5 = (UserService) $r32;
        UserRepository $r6 = RepositoryModule_ProvidesUserRepositoryFactory.providesUserRepository($r1, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ValidateNewPhoneNumber validateNewPhoneNumber() {
        NetworkService $r2 = networkService();
        ValidateNewPhoneNumber $r1 = new ValidateNewPhoneNumber($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ValidateOtp validateOtp() {
        NetworkService $r2 = networkService();
        ValidateOtp $r1 = new ValidateOtp($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ValidateRecipientPhone validateRecipientPhone() {
        NetworkService $r2 = networkService();
        ValidateRecipientPhone $r1 = new ValidateRecipientPhone($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ai.kudi.agent.login.domain.usecases.VerifyOtp verifyOtp() {
        NetworkService $r2 = networkService();
        ai.kudi.agent.login.domain.usecases.VerifyOtp $r1 = new ai.kudi.agent.login.domain.usecases.VerifyOtp($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private VerifySecondaryDetails verifySecondaryDetails() {
        NetworkService $r2 = networkService();
        VerifySecondaryDetails $r1 = new VerifySecondaryDetails($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter() {
        FetchCurrentUser $r2 = fetchCurrentUser();
        CashOutVoucherVerification $r3 = cashOutVoucherVerification();
        ValidateRecipientPhone $r4 = validateRecipientPhone();
        Analytics $r5 = analytics();
        VoucherPhoneVerificationPresenter $r1 = new VoucherPhoneVerificationPresenter($r2, $r3, $r4, $r5);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private VoucherVerificationPresenter voucherVerificationPresenter() {
        CashOutVoucherVerification $r2 = cashOutVoucherVerification();
        FetchCurrentUser $r3 = fetchCurrentUser();
        Analytics $r4 = analytics();
        VoucherVerificationPresenter $r1 = new VoucherVerificationPresenter($r2, $r3, $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private WalletActivityApiToTransactionDataMapper walletActivityApiToTransactionDataMapper() {
        TransactionTypeMapper $r2 = new TransactionTypeMapper();
        TransactionKindMapper $r3 = new TransactionKindMapper();
        WalletActivityApiToTransactionDataMapper $r1 = new WalletActivityApiToTransactionDataMapper($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public BankAccountSubcomponent.Factory bankAccountSubcomponent() {
        BankAccountSubcomponentFactory $r1 = new BankAccountSubcomponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public BvnVerificationSubcomponent.Factory bvnVerificationSubComponent() {
        BvnVerificationSubcomponentFactory $r1 = new BvnVerificationSubcomponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public CashInsuranceActivitySubComponent.Factory cashInsuranceActivitySubComponent() {
        CashInsuranceActivitySubComponentFactory $r1 = new CashInsuranceActivitySubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public CashWithdrawalOptionComponent.Factory cashWithdrawalOptionsSubcomponent() {
        CashWithdrawalOptionComponentFactory $r1 = new CashWithdrawalOptionComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public DeviceVerificationSubcomponent.Factory devciceVerificationSubcomponent() {
        DeviceVerificationSubcomponentFactory $r1 = new DeviceVerificationSubcomponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public EnableFingerPrintSubComponent.Factory enableFingerSubComponent() {
        EnableFingerPrintSubComponentFactory $r1 = new EnableFingerPrintSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public ForgotPasswordSubComponent.Factory forgotPasswordV2SubComponemt() {
        ForgotPasswordSubComponentFactory $r1 = new ForgotPasswordSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public InboxSubComponent.Factory inboxSubComponent() {
        InboxSubComponentFactory $r1 = new InboxSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public IncompleteTransactionsSubComponent.Factory incompleteTransactionsSubComponent() {
        IncompleteTransactionsSubComponentFactory $r1 = new IncompleteTransactionsSubComponentFactory();
        return $r1;
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(BaseApplication baseApplication) {
        injectBaseApplication(baseApplication);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(BanksFragment banksFragment) {
        injectBanksFragment(banksFragment);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(PerformPaymentActivity performPaymentActivity) {
        injectPerformPaymentActivity(performPaymentActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(FCMListenerService fCMListenerService) {
        injectFCMListenerService(fCMListenerService);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(TransactionBreakDownActivity transactionBreakDownActivity) {
        injectTransactionBreakDownActivity(transactionBreakDownActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(FaceVerificationFragment faceVerificationFragment) {
        injectFaceVerificationFragment(faceVerificationFragment);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(HelpActivity helpActivity) {
        injectHelpActivity(helpActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment) {
        injectIssuesTermsAndConditionsFragment(issuesTermsAndConditionsFragment);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(KCashActivity kCashActivity) {
        injectKCashActivity(kCashActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(AccountVerificationHolderActivity accountVerificationHolderActivity) {
        injectAccountVerificationHolderActivity(accountVerificationHolderActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(EnforceBvnVerificationFragment enforceBvnVerificationFragment) {
        injectEnforceBvnVerificationFragment(enforceBvnVerificationFragment);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(SetupAgentAccountActivity setupAgentAccountActivity) {
        injectSetupAgentAccountActivity(setupAgentAccountActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(NotificationActivity notificationActivity) {
        injectNotificationActivity(notificationActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(NotificationDetailsActivity notificationDetailsActivity) {
        injectNotificationDetailsActivity(notificationDetailsActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(OtpFragment otpFragment) {
        injectOtpFragment(otpFragment);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(SplashActivity splashActivity) {
        injectSplashActivity(splashActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(UnauthorizedInstallationActivity unauthorizedInstallationActivity) {
        injectUnauthorizedInstallationActivity(unauthorizedInstallationActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(OnBoardingActivity onBoardingActivity) {
        injectOnBoardingActivity(onBoardingActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(CreateCustomerFragment createCustomerFragment) {
        injectCreateCustomerFragment(createCustomerFragment);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(EmailTransactionReportActivity emailTransactionReportActivity) {
        injectEmailTransactionReportActivity(emailTransactionReportActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(RequestStatementActivity requestStatementActivity) {
        injectRequestStatementActivity(requestStatementActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(TransactionDetailsActionActivity transactionDetailsActionActivity) {
        injectTransactionDetailsActionActivity(transactionDetailsActionActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(TransactionDetailsActivity transactionDetailsActivity) {
        injectTransactionDetailsActivity(transactionDetailsActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(TransactionIssueFragment transactionIssueFragment) {
        injectTransactionIssueFragment(transactionIssueFragment);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(CashoutActivity cashoutActivity) {
        injectCashoutActivity(cashoutActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(KCashTopupActivity kCashTopupActivity) {
        injectKCashTopupActivity(kCashTopupActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(VoucherCashOutPhoneVerificationActivity voucherCashOutPhoneVerificationActivity) {
        injectVoucherCashOutPhoneVerificationActivity(voucherCashOutPhoneVerificationActivity);
    }

    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public void inject(VoucherCodeInputFragment voucherCodeInputFragment) {
        injectVoucherCodeInputFragment(voucherCodeInputFragment);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public LoginSubComponent.Factory loginSubComponent() {
        LoginSubComponentFactory $r1 = new LoginSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public MainTransferSubComponent.Factory mainTransferSubComponent() {
        MainTransferSubComponentFactory $r1 = new MainTransferSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public OutletMgtFeaturesSubcomponents.Factory outletMgtFeaturesSubComponent() {
        OutletMgtFeaturesSubcomponentsFactory $r1 = new OutletMgtFeaturesSubcomponentsFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public OutletMgtSubComponent.Factory outletMgtSubComponent() {
        OutletMgtSubComponentFactory $r1 = new OutletMgtSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public PendingKycSubComponent.Factory pendingKycSubCpomponent() {
        PendingKycSubComponentFactory $r1 = new PendingKycSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public PictureUploadSubComponent.Factory pictureUploadSubComponent() {
        PictureUploadSubComponentFactory $r1 = new PictureUploadSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public PosSubComponent.Factory pos2SubComponent() {
        PosSubComponentFactory $r1 = new PosSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public PostRegSetUpSubComponent.Factory postRegistrationSubComponent() {
        PostRegSetUpSubComponentFactory $r1 = new PostRegSetUpSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public ReferralSubComponent.Factory referralSubComponent() {
        ReferralSubComponentFactory $r1 = new ReferralSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public RegistrationSubComponent.Factory registrationV2SubComponent() {
        RegistrationSubComponentFactory $r1 = new RegistrationSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public SettingsSubComponent.Factory settingsSubComponent() {
        SettingsSubComponentFactory $r1 = new SettingsSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public TransactionCommissionsSubComponent.Factory transactionCommissionsSubComponent() {
        TransactionCommissionsSubComponentFactory $r1 = new TransactionCommissionsSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public VerificationSubComponent.Factory verificationSubComponent() {
        VerificationSubComponentFactory $r1 = new VerificationSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public WalletTopupSubcomponent.Factory walletTopUpSubComponent() {
        WalletTopupSubcomponentFactory $r1 = new WalletTopupSubcomponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.internal.components.ApplicationComponent
    public WithdrawalSubComponent.Factory withdrawalSubComponent() {
        WithdrawalSubComponentFactory $r1 = new WithdrawalSubComponentFactory();
        return $r1;
    }
}
