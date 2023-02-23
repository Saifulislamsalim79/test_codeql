package ai.kudi.agent;

import ai.kudi.agent.MarketplaceComponent;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.network.mods.MarketplaceNetworkModule;
import ai.kudi.agent.network.mods.MarketplaceNetworkModule_ProvideDashboardRetrofitFactory;
import ai.kudi.agent.network.mods.MarketplaceServiceModule;
import ai.kudi.agent.network.mods.MarketplaceServiceModule_AuthInterceptorFactory;
import ai.kudi.agent.network.mods.MarketplaceServiceModule_LoggingterceptorFactory;
import ai.kudi.agent.network.mods.MarketplaceServiceModule_ProvidesMediaServiceFactory;
import ai.kudi.agent.network.mods.MarketplaceServiceModule_VersionInterceptorFactory;
import ai.kudi.agent.network.mods.NetworkModule;
import ai.kudi.agent.network.mods.NetworkModule_ProvidesAuthInterceptorFactory;
import ai.kudi.agent.network.mods.NetworkModule_ProvidesLoginInterceptorFactory;
import ai.kudi.agent.network.mods.NetworkModule_ProvidesVersionInterceptorFactory;
import ai.kudi.agent.network.mods.ServiceModule;
import ai.kudi.agent.network.mods.ServiceModule_ProvidesRetrofitFactory;
import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent;
import ai.kudi.agent.p036v2.common.bitmaps.modules.AnalyticModule;
import ai.kudi.agent.p036v2.common.bitmaps.modules.AnalyticModule_ProvidesAnalyticsImplFactory;
import ai.kudi.agent.p036v2.common.bitmaps.modules.C0681xd3901349;
import ai.kudi.agent.p036v2.common.bitmaps.modules.MarketplaceProductDataSourceModule;
import ai.kudi.agent.p036v2.common.bitmaps.modules.MarketplaceProductDataSourceModule_ProvideMarketPlaceApiFactory;
import ai.kudi.agent.p036v2.common.bitmaps.modules.MarketplaceProductDataSourceModule_ProvideUserServiceFactory;
import ai.kudi.agent.p036v2.common.bitmaps.modules.MarketplaceProductModule;
import ai.kudi.agent.p036v2.common.bitmaps.modules.MarketplaceProductModule_ProvideSharedPrefsNameFactory;
import ai.kudi.agent.p036v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesSharedPrefsFactory;
import ai.kudi.agent.p036v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesUserRepositoryFactory;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.repositories.AssociatedFieldRepository;
import ai.kudi.agent.p036v2.common.domain.repositories.MarketplaceBestCommissionRepository;
import ai.kudi.agent.p036v2.common.domain.repositories.MarketplaceTopPickRepository;
import ai.kudi.agent.p036v2.common.domain.repositories.ProductFieldsRepository;
import ai.kudi.agent.p036v2.common.domain.repositories.ProductListRepository;
import ai.kudi.agent.p036v2.common.domain.repositories.ProductSectorRepository;
import ai.kudi.agent.p036v2.common.domain.sources.localSources.ProductSectorLocalSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.AssociatedFieldsRemoteSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.MarketplaceBestCommissionRemoteSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.MarketplaceTopPickRemoteSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductFieldsRemoteSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductListRemoteSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductSectorRemoteSource;
import ai.kudi.agent.p036v2.common.domain.usecases.AssociatedField;
import ai.kudi.agent.p036v2.common.domain.usecases.FileUpload;
import ai.kudi.agent.p036v2.common.domain.usecases.ProductBusinessSectorUseCase;
import ai.kudi.agent.p036v2.common.view.fragment.ImagePickerFragment;
import ai.kudi.agent.p036v2.common.view.fragment.ImagePickerFragment_MembersInjector;
import ai.kudi.agent.p036v2.common.view.viewModels.MediaUploadViewModel;
import ai.kudi.agent.p036v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment;
import ai.kudi.agent.p036v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment_MembersInjector;
import ai.kudi.agent.p036v2.productAllCollectionFields.viewModel.ProductAllCollectionFieldsViewModel;
import ai.kudi.agent.p036v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment;
import ai.kudi.agent.p036v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment_MembersInjector;
import ai.kudi.agent.p036v2.productCollectionSummary.repositories.CollectionTransactionRepository;
import ai.kudi.agent.p036v2.productCollectionSummary.sources.remoteSources.CollectionTransactionRemoteSource;
import ai.kudi.agent.p036v2.productCollectionSummary.useCases.CollectionTransactionUseCase;
import ai.kudi.agent.p036v2.productCollectionSummary.viewModel.ProductCollectionSummaryViewModel;
import ai.kudi.agent.p036v2.productCustomerRegistration.fragment.MarketplaceCustomerRegistrationFragment;
import ai.kudi.agent.p036v2.productCustomerRegistration.fragment.MarketplaceCustomerRegistrationFragment_MembersInjector;
import ai.kudi.agent.p036v2.productCustomerRegistration.viewModel.MarketplaceCustomerRegistrationViewModel;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment_MembersInjector;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.repositories.CustomerRegistrationRepository;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.repositories.CustomerVerificationRepository;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources.RegisterCustomerRemoteSource;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources.VerifyCustomerRemoteSource;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases.CustomerRegistrationUseCase;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases.CustomerVerificationUseCase;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewModel.ProductCustomerRegistrationSummaryViewModel;
import ai.kudi.agent.p036v2.productDetails.domain.usecases.ProductFieldsUseCase;
import ai.kudi.agent.p036v2.productDetails.fragment.ProductDetailsFragment;
import ai.kudi.agent.p036v2.productDetails.fragment.ProductDetailsFragment_MembersInjector;
import ai.kudi.agent.p036v2.productDetails.viewModel.ProductDetailsViewModel;
import ai.kudi.agent.p036v2.productHome.fragment.ProductHomeFragment;
import ai.kudi.agent.p036v2.productHome.fragment.ProductHomeFragment_MembersInjector;
import ai.kudi.agent.p036v2.productHome.useCases.MarketplaceBestCommissionUseCase;
import ai.kudi.agent.p036v2.productHome.useCases.MarketplaceTopPickUseCase;
import ai.kudi.agent.p036v2.productHome.viewModel.ProductHomeViewModel;
import ai.kudi.agent.p036v2.productList.domain.usecases.FetchProductListUseCase;
import ai.kudi.agent.p036v2.productList.fragment.ProductListFragment;
import ai.kudi.agent.p036v2.productList.fragment.ProductListFragment_MembersInjector;
import ai.kudi.agent.p036v2.productList.viewModel.ProductListViewModel;
import ai.kudi.agent.p036v2.productLookup.fragment.ProductLookupFragment;
import ai.kudi.agent.p036v2.productLookup.fragment.ProductLookupFragment_MembersInjector;
import ai.kudi.agent.p036v2.productLookup.repositories.LookupCustomerRepository;
import ai.kudi.agent.p036v2.productLookup.sources.remoteSources.LookupCustomerRemoteSource;
import ai.kudi.agent.p036v2.productLookup.useCases.LookupCustomerUseCase;
import ai.kudi.agent.p036v2.productLookup.viewModel.MarketplaceProductLookupViewModel;
import ai.kudi.agent.p036v2.productLookupDetails.ProductLookupDetailsViewModel;
import ai.kudi.agent.p036v2.productLookupDetails.fragment.ProductLookupDetailsFragment;
import ai.kudi.agent.p036v2.productLookupDetails.fragment.ProductLookupDetailsFragment_MembersInjector;
import ai.kudi.agent.p036v2.productSearch.fragment.ProductSearchFragment;
import ai.kudi.agent.p036v2.productSearch.fragment.ProductSearchFragment_MembersInjector;
import ai.kudi.agent.p036v2.productSearch.viewModel.ProductSearchViewModel;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.mediaservice.marketplaceCollection.FileStorageClient;
import android.content.Context;
import android.content.SharedPreferences;
import p382i.p383b.C9467c;
import p382i.p383b.C9469e;
import p382i.p383b.C9473g;
import p472k.p473a.InterfaceC11700a;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
import retrofit2.C14841m;
/* loaded from: classes.dex */
public final class DaggerMarketplaceComponent implements MarketplaceComponent {
    private final AnalyticModule analyticModule;
    private InterfaceC11700a<InterfaceC14233u> authInterceptorProvider;
    private final Context context;
    private InterfaceC11700a<Context> contextProvider;
    private InterfaceC11700a<C14207a> loggingterceptorProvider;
    private final MarketplaceProductModule marketplaceProductModule;
    private final MarketplaceServiceModule marketplaceServiceModule;
    private InterfaceC11700a<C14841m> provideDashboardRetrofitProvider;
    private InterfaceC11700a<MarketPlaceApi> provideMarketPlaceApiProvider;
    private InterfaceC11700a<String> provideSharedPrefsNameProvider;
    private InterfaceC11700a<UserService> provideUserServiceProvider;
    private InterfaceC11700a<InterfaceC14233u> providesAuthInterceptorProvider;
    private InterfaceC11700a<CoreAppDatabase> providesCoreAppDatabaseProvider;
    private InterfaceC11700a<C14207a> providesLoginInterceptorProvider;
    private InterfaceC11700a<C14841m> providesRetrofitProvider;
    private InterfaceC11700a<SharedPreferences> providesSharedPrefsProvider;
    private InterfaceC11700a<InterfaceC14233u> providesVersionInterceptorProvider;
    private InterfaceC11700a<InterfaceC14233u> versionInterceptorProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Factory implements MarketplaceComponent.Factory {
        private Factory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.MarketplaceComponent.Factory
        public MarketplaceComponent create(Context context) {
            C9473g.m14650b(context);
            MarketplaceNetworkModule $r2 = new MarketplaceNetworkModule();
            MarketplaceServiceModule $r3 = new MarketplaceServiceModule();
            MarketplaceProductDataSourceModule $r4 = new MarketplaceProductDataSourceModule();
            MarketplaceProductModule $r5 = new MarketplaceProductModule();
            NetworkModule $r6 = new NetworkModule();
            ServiceModule $r7 = new ServiceModule();
            AnalyticModule $r8 = new AnalyticModule();
            DaggerMarketplaceComponent $r9 = new DaggerMarketplaceComponent($r2, $r3, $r4, $r5, $r6, $r7, $r8, context);
            return $r9;
        }
    }

    /* loaded from: classes.dex */
    private final class MarketplaceProductLookupSubComponentFactory implements MarketplaceProductLookupSubComponent.Factory {
        private MarketplaceProductLookupSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent.Factory
        public MarketplaceProductLookupSubComponent create() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            MarketplaceProductLookupSubComponentImpl $r1 = new MarketplaceProductLookupSubComponentImpl();
            return $r1;
        }
    }

    /* loaded from: classes.dex */
    private final class MarketplaceProductLookupSubComponentImpl implements MarketplaceProductLookupSubComponent {
        private MarketplaceProductLookupSubComponentImpl() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AssociatedField associatedField() {
            AssociatedFieldRepository $r2 = associatedFieldRepository();
            AssociatedField $r1 = new AssociatedField($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AssociatedFieldRepository associatedFieldRepository() {
            AssociatedFieldsRemoteSource $r2 = associatedFieldsRemoteSource();
            AssociatedFieldRepository $r1 = new AssociatedFieldRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private AssociatedFieldsRemoteSource associatedFieldsRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            AssociatedFieldsRemoteSource $r1 = new AssociatedFieldsRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CollectionTransactionRemoteSource collectionTransactionRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            CollectionTransactionRemoteSource $r1 = new CollectionTransactionRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CollectionTransactionRepository collectionTransactionRepository() {
            CollectionTransactionRemoteSource $r2 = collectionTransactionRemoteSource();
            CollectionTransactionRepository $r1 = new CollectionTransactionRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CollectionTransactionUseCase collectionTransactionUseCase() {
            CollectionTransactionRepository $r2 = collectionTransactionRepository();
            CollectionTransactionUseCase $r1 = new CollectionTransactionUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CustomerRegistrationRepository customerRegistrationRepository() {
            RegisterCustomerRemoteSource $r2 = registerCustomerRemoteSource();
            CustomerRegistrationRepository $r1 = new CustomerRegistrationRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CustomerRegistrationUseCase customerRegistrationUseCase() {
            CustomerRegistrationRepository $r2 = customerRegistrationRepository();
            CustomerRegistrationUseCase $r1 = new CustomerRegistrationUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CustomerVerificationRepository customerVerificationRepository() {
            VerifyCustomerRemoteSource $r2 = verifyCustomerRemoteSource();
            CustomerVerificationRepository $r1 = new CustomerVerificationRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private CustomerVerificationUseCase customerVerificationUseCase() {
            CustomerVerificationRepository $r2 = customerVerificationRepository();
            CustomerVerificationUseCase $r1 = new CustomerVerificationUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchCurrentUser fetchCurrentUser() {
            DaggerMarketplaceComponent $r3 = DaggerMarketplaceComponent.this;
            UserRepository $r2 = $r3.userRepository();
            FetchCurrentUser $r1 = new FetchCurrentUser($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchLocation fetchLocation() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideUserServiceProvider;
            Object $r4 = $r3.get();
            UserService $r5 = (UserService) $r4;
            FetchLocation $r1 = new FetchLocation($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FileUpload fileUpload() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            MarketplaceServiceModule $r3 = $r2.marketplaceServiceModule;
            FileStorageClient $r4 = MarketplaceServiceModule_ProvidesMediaServiceFactory.providesMediaService($r3);
            FileUpload $r1 = new FileUpload($r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ImagePickerFragment injectImagePickerFragment(ImagePickerFragment imagePickerFragment) {
            MediaUploadViewModel $r2 = mediaUploadViewModel();
            ImagePickerFragment_MembersInjector.injectMediaUploadViewModel(imagePickerFragment, $r2);
            return imagePickerFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceCustomerRegistrationFragment injectMarketplaceCustomerRegistrationFragment(MarketplaceCustomerRegistrationFragment marketplaceCustomerRegistrationFragment) {
            MarketplaceCustomerRegistrationViewModel $r2 = marketplaceCustomerRegistrationViewModel();
            MarketplaceCustomerRegistrationFragment_MembersInjector.injectMarketplaceCustomerRegistrationViewModel(marketplaceCustomerRegistrationFragment, $r2);
            return marketplaceCustomerRegistrationFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductAllCollectionFieldsFragment injectProductAllCollectionFieldsFragment(ProductAllCollectionFieldsFragment productAllCollectionFieldsFragment) {
            ProductAllCollectionFieldsViewModel $r2 = productAllCollectionFieldsViewModel();
            ProductAllCollectionFieldsFragment_MembersInjector.injectProductAllCollectionFieldsViewModel(productAllCollectionFieldsFragment, $r2);
            return productAllCollectionFieldsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductCollectionSummaryFragment injectProductCollectionSummaryFragment(ProductCollectionSummaryFragment productCollectionSummaryFragment) {
            ProductCollectionSummaryViewModel $r2 = productCollectionSummaryViewModel();
            ProductCollectionSummaryFragment_MembersInjector.injectMarketplaceCollectionSummaryViewModel(productCollectionSummaryFragment, $r2);
            return productCollectionSummaryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductCustomerRegistrationSummaryFragment injectProductCustomerRegistrationSummaryFragment(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment) {
            ProductCustomerRegistrationSummaryViewModel $r2 = productCustomerRegistrationSummaryViewModel();
            ProductCustomerRegistrationSummaryFragment_MembersInjector.injectProductCustomerRegistrationSummaryViewModel(productCustomerRegistrationSummaryFragment, $r2);
            return productCustomerRegistrationSummaryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductLookupDetailsFragment injectProductLookupDetailsFragment(ProductLookupDetailsFragment productLookupDetailsFragment) {
            ProductLookupDetailsViewModel $r2 = new ProductLookupDetailsViewModel();
            ProductLookupDetailsFragment_MembersInjector.injectProductLookupDetailsViewModel(productLookupDetailsFragment, $r2);
            return productLookupDetailsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductLookupFragment injectProductLookupFragment(ProductLookupFragment productLookupFragment) {
            MarketplaceProductLookupViewModel $r2 = marketplaceProductLookupViewModel();
            ProductLookupFragment_MembersInjector.injectMarketplaceLookupViewModel(productLookupFragment, $r2);
            return productLookupFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LookupCustomerRemoteSource lookupCustomerRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            LookupCustomerRemoteSource $r1 = new LookupCustomerRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LookupCustomerRepository lookupCustomerRepository() {
            LookupCustomerRemoteSource $r2 = lookupCustomerRemoteSource();
            LookupCustomerRepository $r1 = new LookupCustomerRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private LookupCustomerUseCase lookupCustomerUseCase() {
            LookupCustomerRepository $r2 = lookupCustomerRepository();
            LookupCustomerUseCase $r1 = new LookupCustomerUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel() {
            ProductFieldsUseCase $r2 = productFieldsUseCase();
            FetchLocation $r3 = fetchLocation();
            FileUpload $r4 = fileUpload();
            AssociatedField $r5 = associatedField();
            MarketplaceCustomerRegistrationViewModel $r1 = new MarketplaceCustomerRegistrationViewModel($r2, $r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceProductLookupViewModel marketplaceProductLookupViewModel() {
            ProductFieldsUseCase $r2 = productFieldsUseCase();
            FileUpload $r3 = fileUpload();
            FetchLocation $r4 = fetchLocation();
            LookupCustomerUseCase $r5 = lookupCustomerUseCase();
            DaggerMarketplaceComponent $r6 = DaggerMarketplaceComponent.this;
            Analytics $r7 = $r6.analytics();
            FetchCurrentUser $r8 = fetchCurrentUser();
            AssociatedField $r9 = associatedField();
            MarketplaceProductLookupViewModel $r1 = new MarketplaceProductLookupViewModel($r2, $r3, $r4, $r5, $r7, $r8, $r9);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MediaUploadViewModel mediaUploadViewModel() {
            FileUpload $r2 = fileUpload();
            MediaUploadViewModel $r1 = new MediaUploadViewModel($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel() {
            ProductFieldsUseCase $r2 = productFieldsUseCase();
            FetchLocation $r3 = fetchLocation();
            FileUpload $r4 = fileUpload();
            AssociatedField $r5 = associatedField();
            ProductAllCollectionFieldsViewModel $r1 = new ProductAllCollectionFieldsViewModel($r2, $r3, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductCollectionSummaryViewModel productCollectionSummaryViewModel() {
            CollectionTransactionUseCase $r2 = collectionTransactionUseCase();
            FetchCurrentUser $r3 = fetchCurrentUser();
            DaggerMarketplaceComponent $r4 = DaggerMarketplaceComponent.this;
            Analytics $r5 = $r4.analytics();
            ProductCollectionSummaryViewModel $r1 = new ProductCollectionSummaryViewModel($r2, $r3, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel() {
            CustomerRegistrationUseCase $r2 = customerRegistrationUseCase();
            CustomerVerificationUseCase $r3 = customerVerificationUseCase();
            FetchCurrentUser $r4 = fetchCurrentUser();
            ProductCustomerRegistrationSummaryViewModel $r1 = new ProductCustomerRegistrationSummaryViewModel($r2, $r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductFieldsRemoteSource productFieldsRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            ProductFieldsRemoteSource $r1 = new ProductFieldsRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductFieldsRepository productFieldsRepository() {
            ProductFieldsRemoteSource $r2 = productFieldsRemoteSource();
            ProductFieldsRepository $r1 = new ProductFieldsRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductFieldsUseCase productFieldsUseCase() {
            ProductFieldsRepository $r2 = productFieldsRepository();
            ProductFieldsUseCase $r1 = new ProductFieldsUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private RegisterCustomerRemoteSource registerCustomerRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            RegisterCustomerRemoteSource $r1 = new RegisterCustomerRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private VerifyCustomerRemoteSource verifyCustomerRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            VerifyCustomerRemoteSource $r1 = new VerifyCustomerRemoteSource($r5);
            return $r1;
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent
        public void inject(ImagePickerFragment imagePickerFragment) {
            injectImagePickerFragment(imagePickerFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent
        public void inject(ProductAllCollectionFieldsFragment productAllCollectionFieldsFragment) {
            injectProductAllCollectionFieldsFragment(productAllCollectionFieldsFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent
        public void inject(ProductCollectionSummaryFragment productCollectionSummaryFragment) {
            injectProductCollectionSummaryFragment(productCollectionSummaryFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent
        public void inject(MarketplaceCustomerRegistrationFragment marketplaceCustomerRegistrationFragment) {
            injectMarketplaceCustomerRegistrationFragment(marketplaceCustomerRegistrationFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent
        public void inject(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment) {
            injectProductCustomerRegistrationSummaryFragment(productCustomerRegistrationSummaryFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent
        public void inject(ProductLookupFragment productLookupFragment) {
            injectProductLookupFragment(productLookupFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent
        public void inject(ProductLookupDetailsFragment productLookupDetailsFragment) {
            injectProductLookupDetailsFragment(productLookupDetailsFragment);
        }
    }

    /* loaded from: classes.dex */
    private final class MarketplaceProductSubComponentFactory implements MarketplaceProductSubComponent.Factory {
        private MarketplaceProductSubComponentFactory() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent.Factory
        public MarketplaceProductSubComponent create() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            MarketplaceProductSubComponentImpl $r1 = new MarketplaceProductSubComponentImpl();
            return $r1;
        }
    }

    /* loaded from: classes.dex */
    private final class MarketplaceProductSubComponentImpl implements MarketplaceProductSubComponent {
        private MarketplaceProductSubComponentImpl() {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchCurrentUser fetchCurrentUser() {
            DaggerMarketplaceComponent $r3 = DaggerMarketplaceComponent.this;
            UserRepository $r2 = $r3.userRepository();
            FetchCurrentUser $r1 = new FetchCurrentUser($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private FetchProductListUseCase fetchProductListUseCase() {
            ProductListRepository $r2 = productListRepository();
            FetchProductListUseCase $r1 = new FetchProductListUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductDetailsFragment injectProductDetailsFragment(ProductDetailsFragment productDetailsFragment) {
            ProductDetailsViewModel $r2 = productDetailsViewModel();
            ProductDetailsFragment_MembersInjector.injectProductDetailsViewModel(productDetailsFragment, $r2);
            return productDetailsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductHomeFragment injectProductHomeFragment(ProductHomeFragment productHomeFragment) {
            ProductHomeViewModel $r2 = productHomeViewModel();
            ProductHomeFragment_MembersInjector.injectProductHomeViewModel(productHomeFragment, $r2);
            SmartLookAnalytics $r3 = new SmartLookAnalytics();
            ProductHomeFragment_MembersInjector.injectSmartLookAnalytics(productHomeFragment, $r3);
            return productHomeFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductListFragment injectProductListFragment(ProductListFragment productListFragment) {
            ProductListViewModel $r2 = productListViewModel();
            ProductListFragment_MembersInjector.injectProductListViewModel(productListFragment, $r2);
            return productListFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductSearchFragment injectProductSearchFragment(ProductSearchFragment productSearchFragment) {
            ProductSearchViewModel $r2 = productSearchViewModel();
            ProductSearchFragment_MembersInjector.injectProductSearchViewModel(productSearchFragment, $r2);
            return productSearchFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceBestCommissionRemoteSource marketplaceBestCommissionRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            MarketplaceBestCommissionRemoteSource $r1 = new MarketplaceBestCommissionRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceBestCommissionRepository marketplaceBestCommissionRepository() {
            MarketplaceBestCommissionRemoteSource $r2 = marketplaceBestCommissionRemoteSource();
            MarketplaceBestCommissionRepository $r1 = new MarketplaceBestCommissionRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceBestCommissionUseCase marketplaceBestCommissionUseCase() {
            MarketplaceBestCommissionRepository $r2 = marketplaceBestCommissionRepository();
            MarketplaceBestCommissionUseCase $r1 = new MarketplaceBestCommissionUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceTopPickRemoteSource marketplaceTopPickRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            MarketplaceTopPickRemoteSource $r1 = new MarketplaceTopPickRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceTopPickRepository marketplaceTopPickRepository() {
            MarketplaceTopPickRemoteSource $r2 = marketplaceTopPickRemoteSource();
            MarketplaceTopPickRepository $r1 = new MarketplaceTopPickRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private MarketplaceTopPickUseCase marketplaceTopPickUseCase() {
            MarketplaceTopPickRepository $r2 = marketplaceTopPickRepository();
            MarketplaceTopPickUseCase $r1 = new MarketplaceTopPickUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductBusinessSectorUseCase productBusinessSectorUseCase() {
            ProductSectorRepository $r2 = productSectorRepository();
            ProductBusinessSectorUseCase $r1 = new ProductBusinessSectorUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductDetailsViewModel productDetailsViewModel() {
            ProductFieldsUseCase $r2 = productFieldsUseCase();
            DaggerMarketplaceComponent $r3 = DaggerMarketplaceComponent.this;
            Analytics $r4 = $r3.analytics();
            FetchCurrentUser $r5 = fetchCurrentUser();
            ProductDetailsViewModel $r1 = new ProductDetailsViewModel($r2, $r4, $r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductFieldsRemoteSource productFieldsRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            ProductFieldsRemoteSource $r1 = new ProductFieldsRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductFieldsRepository productFieldsRepository() {
            ProductFieldsRemoteSource $r2 = productFieldsRemoteSource();
            ProductFieldsRepository $r1 = new ProductFieldsRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductFieldsUseCase productFieldsUseCase() {
            ProductFieldsRepository $r2 = productFieldsRepository();
            ProductFieldsUseCase $r1 = new ProductFieldsUseCase($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductHomeViewModel productHomeViewModel() {
            ProductBusinessSectorUseCase $r2 = productBusinessSectorUseCase();
            MarketplaceTopPickUseCase $r3 = marketplaceTopPickUseCase();
            MarketplaceBestCommissionUseCase $r4 = marketplaceBestCommissionUseCase();
            DaggerMarketplaceComponent $r5 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r6 = $r5.providesSharedPrefsProvider;
            Object $r7 = $r6.get();
            SharedPreferences $r8 = (SharedPreferences) $r7;
            ProductHomeViewModel $r1 = new ProductHomeViewModel($r2, $r3, $r4, $r8);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductListRemoteSource productListRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            ProductListRemoteSource $r1 = new ProductListRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductListRepository productListRepository() {
            ProductListRemoteSource $r2 = productListRemoteSource();
            ProductListRepository $r1 = new ProductListRepository($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductListViewModel productListViewModel() {
            ProductBusinessSectorUseCase $r2 = productBusinessSectorUseCase();
            FetchProductListUseCase $r3 = fetchProductListUseCase();
            ProductListViewModel $r1 = new ProductListViewModel($r2, $r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductSearchViewModel productSearchViewModel() {
            FetchProductListUseCase $r2 = fetchProductListUseCase();
            ProductSearchViewModel $r1 = new ProductSearchViewModel($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductSectorLocalSource productSectorLocalSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.providesCoreAppDatabaseProvider;
            Object $r4 = $r3.get();
            CoreAppDatabase $r5 = (CoreAppDatabase) $r4;
            ProductSectorLocalSource $r1 = new ProductSectorLocalSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductSectorRemoteSource productSectorRemoteSource() {
            DaggerMarketplaceComponent $r2 = DaggerMarketplaceComponent.this;
            InterfaceC11700a $r3 = $r2.provideMarketPlaceApiProvider;
            Object $r4 = $r3.get();
            MarketPlaceApi $r5 = (MarketPlaceApi) $r4;
            ProductSectorRemoteSource $r1 = new ProductSectorRemoteSource($r5);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private ProductSectorRepository productSectorRepository() {
            ProductSectorLocalSource $r2 = productSectorLocalSource();
            ProductSectorRemoteSource $r3 = productSectorRemoteSource();
            ProductSectorRepository $r1 = new ProductSectorRepository($r2, $r3);
            return $r1;
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent
        public void inject(ProductDetailsFragment productDetailsFragment) {
            injectProductDetailsFragment(productDetailsFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent
        public void inject(ProductHomeFragment productHomeFragment) {
            injectProductHomeFragment(productHomeFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent
        public void inject(ProductListFragment productListFragment) {
            injectProductListFragment(productListFragment);
        }

        @Override // ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent
        public void inject(ProductSearchFragment productSearchFragment) {
            injectProductSearchFragment(productSearchFragment);
        }
    }

    private DaggerMarketplaceComponent(MarketplaceNetworkModule marketplaceNetworkModule, MarketplaceServiceModule marketplaceServiceModule, MarketplaceProductDataSourceModule marketplaceProductDataSourceModule, MarketplaceProductModule marketplaceProductModule, NetworkModule networkModule, ServiceModule serviceModule, AnalyticModule analyticModule, Context context) {
        this.analyticModule = analyticModule;
        this.context = context;
        this.marketplaceProductModule = marketplaceProductModule;
        this.marketplaceServiceModule = marketplaceServiceModule;
        initialize(marketplaceNetworkModule, marketplaceServiceModule, marketplaceProductDataSourceModule, marketplaceProductModule, networkModule, serviceModule, analyticModule, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Analytics analytics() {
        AnalyticModule $r3 = this.analyticModule;
        Context $r1 = this.context;
        Analytics $r2 = AnalyticModule_ProvidesAnalyticsImplFactory.providesAnalyticsImpl($r3, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceComponent.Factory factory() {
        Factory $r0 = new Factory();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void initialize(MarketplaceNetworkModule marketplaceNetworkModule, MarketplaceServiceModule marketplaceServiceModule, MarketplaceProductDataSourceModule marketplaceProductDataSourceModule, MarketplaceProductModule marketplaceProductModule, NetworkModule networkModule, ServiceModule serviceModule, AnalyticModule analyticModule, Context context) {
        InterfaceC11700a $r10 = C9469e.m14656a(context);
        InterfaceC11700a $r3 = $r10;
        this.contextProvider = $r3;
        InterfaceC11700a $r32 = $r10;
        InterfaceC11700a $r11 = C0681xd3901349.create(marketplaceProductDataSourceModule, $r32);
        InterfaceC11700a $r33 = $r11;
        this.providesCoreAppDatabaseProvider = C9467c.m14658a($r33);
        InterfaceC11700a $r12 = MarketplaceServiceModule_AuthInterceptorFactory.create(marketplaceServiceModule);
        InterfaceC11700a $r34 = $r12;
        this.authInterceptorProvider = $r34;
        InterfaceC11700a $r13 = MarketplaceServiceModule_VersionInterceptorFactory.create(marketplaceServiceModule);
        InterfaceC11700a $r35 = $r13;
        this.versionInterceptorProvider = $r35;
        InterfaceC11700a $r14 = MarketplaceServiceModule_LoggingterceptorFactory.create(marketplaceServiceModule);
        InterfaceC11700a $r36 = $r14;
        this.loggingterceptorProvider = $r36;
        InterfaceC11700a $r15 = this.contextProvider;
        InterfaceC11700a $r16 = this.authInterceptorProvider;
        InterfaceC11700a $r37 = this.versionInterceptorProvider;
        InterfaceC11700a r26 = $r14;
        InterfaceC11700a $r17 = MarketplaceNetworkModule_ProvideDashboardRetrofitFactory.create(marketplaceNetworkModule, $r15, $r16, $r37, r26);
        InterfaceC11700a $r38 = $r17;
        this.provideDashboardRetrofitProvider = $r38;
        InterfaceC11700a $r39 = $r17;
        InterfaceC11700a $r18 = MarketplaceProductDataSourceModule_ProvideMarketPlaceApiFactory.create(marketplaceProductDataSourceModule, $r39);
        InterfaceC11700a $r310 = $r18;
        this.provideMarketPlaceApiProvider = C9467c.m14658a($r310);
        InterfaceC11700a $r311 = this.contextProvider;
        InterfaceC11700a $r19 = MarketplaceProductModule_ProvideSharedPrefsNameFactory.create(marketplaceProductModule, $r311);
        InterfaceC11700a $r312 = $r19;
        this.provideSharedPrefsNameProvider = $r312;
        InterfaceC11700a $r313 = this.contextProvider;
        InterfaceC11700a $r152 = $r19;
        InterfaceC11700a $r20 = MarketplaceProductModule_ProvidesSharedPrefsFactory.create(marketplaceProductModule, $r152, $r313);
        InterfaceC11700a $r314 = $r20;
        this.providesSharedPrefsProvider = C9467c.m14658a($r314);
        InterfaceC11700a $r21 = NetworkModule_ProvidesAuthInterceptorFactory.create(networkModule);
        InterfaceC11700a $r315 = $r21;
        this.providesAuthInterceptorProvider = $r315;
        InterfaceC11700a $r22 = NetworkModule_ProvidesVersionInterceptorFactory.create(networkModule);
        InterfaceC11700a $r316 = $r22;
        this.providesVersionInterceptorProvider = $r316;
        InterfaceC11700a $r23 = NetworkModule_ProvidesLoginInterceptorFactory.create(networkModule);
        InterfaceC11700a $r317 = $r23;
        this.providesLoginInterceptorProvider = $r317;
        InterfaceC11700a $r318 = this.contextProvider;
        InterfaceC11700a $r153 = this.providesAuthInterceptorProvider;
        InterfaceC11700a $r162 = this.providesVersionInterceptorProvider;
        InterfaceC11700a r262 = $r23;
        InterfaceC11700a $r24 = ServiceModule_ProvidesRetrofitFactory.create(serviceModule, $r318, $r153, $r162, r262);
        InterfaceC11700a $r319 = $r24;
        this.providesRetrofitProvider = $r319;
        InterfaceC11700a $r320 = $r24;
        InterfaceC11700a $r25 = MarketplaceProductDataSourceModule_ProvideUserServiceFactory.create(marketplaceProductDataSourceModule, $r320);
        InterfaceC11700a $r321 = $r25;
        this.provideUserServiceProvider = C9467c.m14658a($r321);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UserRepository userRepository() {
        MarketplaceProductModule $r1 = this.marketplaceProductModule;
        InterfaceC11700a $r2 = this.providesCoreAppDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        InterfaceC11700a $r22 = this.provideUserServiceProvider;
        Object $r32 = $r22.get();
        UserService $r5 = (UserService) $r32;
        UserRepository $r6 = MarketplaceProductModule_ProvidesUserRepositoryFactory.providesUserRepository($r1, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.MarketplaceComponent
    public MarketplaceProductLookupSubComponent.Factory marketplaceLookupSubcomponents() {
        MarketplaceProductLookupSubComponentFactory $r1 = new MarketplaceProductLookupSubComponentFactory();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.MarketplaceComponent
    public MarketplaceProductSubComponent.Factory marketplaceProductSubcomponent() {
        MarketplaceProductSubComponentFactory $r1 = new MarketplaceProductSubComponentFactory();
        return $r1;
    }
}
