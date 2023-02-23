package ai.kudi.agent.p036v2.productCustomerRegistration.viewModel;

import ai.kudi.agent.p036v2.common.domain.usecases.AssociatedField;
import ai.kudi.agent.p036v2.common.domain.usecases.FileUpload;
import ai.kudi.agent.p036v2.productDetails.domain.usecases.ProductFieldsUseCase;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistration.viewModel.MarketplaceCustomerRegistrationViewModel_Factory */
/* loaded from: classes.dex */
public final class MarketplaceCustomerRegistrationViewModel_Factory implements InterfaceC9468d<MarketplaceCustomerRegistrationViewModel> {
    private final InterfaceC11700a<AssociatedField> fetchAssociatedFieldProvider;
    private final InterfaceC11700a<FetchLocation> fetchLocationProvider;
    private final InterfaceC11700a<ProductFieldsUseCase> fetchProductFieldsProvider;
    private final InterfaceC11700a<FileUpload> fileUploadProvider;

    public MarketplaceCustomerRegistrationViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchProductFieldsProvider = interfaceC11700a;
        this.fetchLocationProvider = interfaceC11700a2;
        this.fileUploadProvider = interfaceC11700a3;
        this.fetchAssociatedFieldProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceCustomerRegistrationViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        MarketplaceCustomerRegistrationViewModel_Factory $r4 = new MarketplaceCustomerRegistrationViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceCustomerRegistrationViewModel newInstance(ProductFieldsUseCase productFieldsUseCase, FetchLocation fetchLocation, FileUpload fileUpload, AssociatedField associatedField) {
        MarketplaceCustomerRegistrationViewModel $r4 = new MarketplaceCustomerRegistrationViewModel(productFieldsUseCase, fetchLocation, fileUpload, associatedField);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MarketplaceCustomerRegistrationViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchProductFieldsProvider;
        Object $r2 = $r1.get();
        ProductFieldsUseCase $r3 = (ProductFieldsUseCase) $r2;
        InterfaceC11700a $r12 = this.fetchLocationProvider;
        Object $r22 = $r12.get();
        FetchLocation $r4 = (FetchLocation) $r22;
        InterfaceC11700a $r13 = this.fileUploadProvider;
        Object $r23 = $r13.get();
        FileUpload $r5 = (FileUpload) $r23;
        InterfaceC11700a $r14 = this.fetchAssociatedFieldProvider;
        Object $r24 = $r14.get();
        AssociatedField $r6 = (AssociatedField) $r24;
        MarketplaceCustomerRegistrationViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41598multiply() {
        MarketplaceCustomerRegistrationViewModel $r1 = multiply();
        return $r1;
    }
}
