package ai.kudi.agent.p036v2.productDetails.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.p036v2.productDetails.domain.usecases.ProductFieldsUseCase;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productDetails.viewModel.ProductDetailsViewModel_Factory */
/* loaded from: classes.dex */
public final class ProductDetailsViewModel_Factory implements InterfaceC9468d<ProductDetailsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<ProductFieldsUseCase> fetchProductFieldsProvider;

    public ProductDetailsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchProductFieldsProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductDetailsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ProductDetailsViewModel_Factory $r3 = new ProductDetailsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductDetailsViewModel newInstance(ProductFieldsUseCase productFieldsUseCase, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        ProductDetailsViewModel $r3 = new ProductDetailsViewModel(productFieldsUseCase, analytics, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductDetailsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchProductFieldsProvider;
        Object $r2 = $r1.get();
        ProductFieldsUseCase $r3 = (ProductFieldsUseCase) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        ProductDetailsViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41627multiply() {
        ProductDetailsViewModel $r1 = multiply();
        return $r1;
    }
}
