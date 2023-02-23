package ai.kudi.agent.p036v2.productLookup.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.p036v2.common.domain.usecases.AssociatedField;
import ai.kudi.agent.p036v2.common.domain.usecases.FileUpload;
import ai.kudi.agent.p036v2.productDetails.domain.usecases.ProductFieldsUseCase;
import ai.kudi.agent.p036v2.productLookup.useCases.LookupCustomerUseCase;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productLookup.viewModel.MarketplaceProductLookupViewModel_Factory */
/* loaded from: classes.dex */
public final class MarketplaceProductLookupViewModel_Factory implements InterfaceC9468d<MarketplaceProductLookupViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<AssociatedField> fetchAssociatedFieldProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchLocation> fetchLocationProvider;
    private final InterfaceC11700a<ProductFieldsUseCase> fetchProductFieldsProvider;
    private final InterfaceC11700a<FileUpload> fileUploadProvider;
    private final InterfaceC11700a<LookupCustomerUseCase> lookupCustomerUseCaseProvider;

    public MarketplaceProductLookupViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.fetchProductFieldsProvider = interfaceC11700a;
        this.fileUploadProvider = interfaceC11700a2;
        this.fetchLocationProvider = interfaceC11700a3;
        this.lookupCustomerUseCaseProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
        this.fetchCurrentUserProvider = interfaceC11700a6;
        this.fetchAssociatedFieldProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceProductLookupViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        MarketplaceProductLookupViewModel_Factory $r7 = new MarketplaceProductLookupViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceProductLookupViewModel newInstance(ProductFieldsUseCase productFieldsUseCase, FileUpload fileUpload, FetchLocation fetchLocation, LookupCustomerUseCase lookupCustomerUseCase, Analytics analytics, FetchCurrentUser fetchCurrentUser, AssociatedField associatedField) {
        MarketplaceProductLookupViewModel $r7 = new MarketplaceProductLookupViewModel(productFieldsUseCase, fileUpload, fetchLocation, lookupCustomerUseCase, analytics, fetchCurrentUser, associatedField);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MarketplaceProductLookupViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchProductFieldsProvider;
        Object $r2 = $r1.get();
        ProductFieldsUseCase $r3 = (ProductFieldsUseCase) $r2;
        InterfaceC11700a $r12 = this.fileUploadProvider;
        Object $r22 = $r12.get();
        FileUpload $r4 = (FileUpload) $r22;
        InterfaceC11700a $r13 = this.fetchLocationProvider;
        Object $r23 = $r13.get();
        FetchLocation $r5 = (FetchLocation) $r23;
        InterfaceC11700a $r14 = this.lookupCustomerUseCaseProvider;
        Object $r24 = $r14.get();
        LookupCustomerUseCase lookupCustomerUseCase = (LookupCustomerUseCase) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics analytics = (Analytics) $r25;
        InterfaceC11700a $r16 = this.fetchCurrentUserProvider;
        Object $r26 = $r16.get();
        FetchCurrentUser fetchCurrentUser = (FetchCurrentUser) $r26;
        InterfaceC11700a $r17 = this.fetchAssociatedFieldProvider;
        Object $r27 = $r17.get();
        AssociatedField $r9 = (AssociatedField) $r27;
        MarketplaceProductLookupViewModel $r10 = newInstance($r3, $r4, $r5, lookupCustomerUseCase, analytics, fetchCurrentUser, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41677multiply() {
        MarketplaceProductLookupViewModel $r1 = multiply();
        return $r1;
    }
}
