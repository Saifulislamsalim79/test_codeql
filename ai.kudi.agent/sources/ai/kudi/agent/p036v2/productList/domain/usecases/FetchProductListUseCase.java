package ai.kudi.agent.p036v2.productList.domain.usecases;

import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductsApiParams;
import ai.kudi.agent.p036v2.common.domain.repositories.ProductListRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: FetchProductListUseCase.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/v2/productList/domain/usecases/FetchProductListUseCase;", "", "repository", "Lai/kudi/agent/v2/common/domain/repositories/ProductListRepository;", "(Lai/kudi/agent/v2/common/domain/repositories/ProductListRepository;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductResponse;", "page", "", "param", "Lai/kudi/agent/v2/common/domain/dto/MarketplaceProductsApiParams;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productList.domain.usecases.FetchProductListUseCase */
/* loaded from: classes.dex */
public final class FetchProductListUseCase {
    private final ProductListRepository repository;

    public FetchProductListUseCase(ProductListRepository productListRepository) {
        Log_OC.getArray(productListRepository, "repository");
        this.repository = productListRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(int i, MarketplaceProductsApiParams marketplaceProductsApiParams) {
        Log_OC.getArray(marketplaceProductsApiParams, "param");
        ProductListRepository $r3 = this.repository;
        AbstractC11688p $r2 = $r3.fetchAllProduct(i, marketplaceProductsApiParams);
        return $r2;
    }
}
