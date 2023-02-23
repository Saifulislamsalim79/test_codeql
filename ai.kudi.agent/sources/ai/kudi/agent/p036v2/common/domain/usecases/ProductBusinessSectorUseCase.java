package ai.kudi.agent.p036v2.common.domain.usecases;

import ai.kudi.agent.p036v2.common.domain.repositories.ProductSectorRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: ProductBusinessSectorUseCase.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0018\u00010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/usecases/ProductBusinessSectorUseCase;", "", "productSectorRepository", "Lai/kudi/agent/v2/common/domain/repositories/ProductSectorRepository;", "(Lai/kudi/agent/v2/common/domain/repositories/ProductSectorRepository;)V", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.usecases.ProductBusinessSectorUseCase */
/* loaded from: classes.dex */
public final class ProductBusinessSectorUseCase {
    private final ProductSectorRepository productSectorRepository;

    public ProductBusinessSectorUseCase(ProductSectorRepository productSectorRepository) {
        Log_OC.getArray(productSectorRepository, "productSectorRepository");
        this.productSectorRepository = productSectorRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute() {
        ProductSectorRepository $r1 = this.productSectorRepository;
        AbstractC11688p $r2 = $r1.fetchProductSector();
        if ($r2 == null) {
            return null;
        }
        Item $r3 = ClassWriter.LogError();
        AbstractC11688p $r22 = $r2.h0($r3);
        if ($r22 == null) {
            return null;
        }
        Item $r32 = ContextUtils.LogError();
        return $r22.R($r32);
    }
}
