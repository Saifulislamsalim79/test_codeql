package ai.kudi.agent.p036v2.productHome.viewModel;

import ai.kudi.agent.p036v2.common.domain.usecases.ProductBusinessSectorUseCase;
import ai.kudi.agent.p036v2.productHome.useCases.MarketplaceBestCommissionUseCase;
import ai.kudi.agent.p036v2.productHome.useCases.MarketplaceTopPickUseCase;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productHome.viewModel.ProductHomeViewModel_Factory */
/* loaded from: classes.dex */
public final class ProductHomeViewModel_Factory implements InterfaceC9468d<ProductHomeViewModel> {
    private final InterfaceC11700a<MarketplaceBestCommissionUseCase> marketplaceBestCommissionProvider;
    private final InterfaceC11700a<MarketplaceTopPickUseCase> marketplaceTopPickProvider;
    private final InterfaceC11700a<ProductBusinessSectorUseCase> productBusinessSectorUseCaseProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public ProductHomeViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.productBusinessSectorUseCaseProvider = interfaceC11700a;
        this.marketplaceTopPickProvider = interfaceC11700a2;
        this.marketplaceBestCommissionProvider = interfaceC11700a3;
        this.sharedPreferencesProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductHomeViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        ProductHomeViewModel_Factory $r4 = new ProductHomeViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductHomeViewModel newInstance(ProductBusinessSectorUseCase productBusinessSectorUseCase, MarketplaceTopPickUseCase marketplaceTopPickUseCase, MarketplaceBestCommissionUseCase marketplaceBestCommissionUseCase, SharedPreferences sharedPreferences) {
        ProductHomeViewModel $r4 = new ProductHomeViewModel(productBusinessSectorUseCase, marketplaceTopPickUseCase, marketplaceBestCommissionUseCase, sharedPreferences);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductHomeViewModel multiply() {
        InterfaceC11700a $r1 = this.productBusinessSectorUseCaseProvider;
        Object $r2 = $r1.get();
        ProductBusinessSectorUseCase $r3 = (ProductBusinessSectorUseCase) $r2;
        InterfaceC11700a $r12 = this.marketplaceTopPickProvider;
        Object $r22 = $r12.get();
        MarketplaceTopPickUseCase $r4 = (MarketplaceTopPickUseCase) $r22;
        InterfaceC11700a $r13 = this.marketplaceBestCommissionProvider;
        Object $r23 = $r13.get();
        MarketplaceBestCommissionUseCase $r5 = (MarketplaceBestCommissionUseCase) $r23;
        InterfaceC11700a $r14 = this.sharedPreferencesProvider;
        Object $r24 = $r14.get();
        SharedPreferences $r6 = (SharedPreferences) $r24;
        ProductHomeViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41645multiply() {
        ProductHomeViewModel $r1 = multiply();
        return $r1;
    }
}
