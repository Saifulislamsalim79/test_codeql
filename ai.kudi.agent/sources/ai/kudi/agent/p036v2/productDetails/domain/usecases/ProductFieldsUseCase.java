package ai.kudi.agent.p036v2.productDetails.domain.usecases;

import ai.kudi.agent.p036v2.common.domain.repositories.ProductFieldsRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: ProductFieldsUseCase.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;", "", "productFieldsRepository", "Lai/kudi/agent/v2/common/domain/repositories/ProductFieldsRepository;", "(Lai/kudi/agent/v2/common/domain/repositories/ProductFieldsRepository;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/ProductFieldResponse;", "productId", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.domain.usecases.ProductFieldsUseCase */
/* loaded from: classes.dex */
public final class ProductFieldsUseCase {
    private final ProductFieldsRepository productFieldsRepository;

    public ProductFieldsUseCase(ProductFieldsRepository productFieldsRepository) {
        Log_OC.getArray(productFieldsRepository, "productFieldsRepository");
        this.productFieldsRepository = productFieldsRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "productId");
        ProductFieldsRepository $r3 = this.productFieldsRepository;
        AbstractC11688p $r1 = $r3.fetchProductFields(str);
        return $r1;
    }
}
