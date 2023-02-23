package ai.kudi.agent.p036v2.common.utils.mappers;

import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.core.domain.room_entities.ProductSectorEntity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductBusinessSectorMapper.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/v2/common/utils/mappers/ProductBusinessSectorMapper;", "", "()V", "toDomain", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "entity", "Lai/kudi/agent/core/domain/room_entities/ProductSectorEntity;", "toEntity", "model", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.utils.mappers.ProductBusinessSectorMapper */
/* loaded from: classes.dex */
public final class ProductBusinessSectorMapper {
    public static final ProductBusinessSectorMapper INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ProductBusinessSectorMapper $r0 = new ProductBusinessSectorMapper();
        INSTANCE = $r0;
    }

    private ProductBusinessSectorMapper() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductSectorModel toDomain(ProductSectorEntity productSectorEntity) {
        Log_OC.getArray(productSectorEntity, "entity");
        Integer $r3 = productSectorEntity.getId();
        String $r4 = productSectorEntity.getName();
        String $r5 = productSectorEntity.getNameSlugified();
        String $r6 = productSectorEntity.getStatus();
        ProductSectorModel $r2 = new ProductSectorModel($r3, $r4, $r5, $r6, false, 16, null);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductSectorEntity toEntity(ProductSectorModel productSectorModel) {
        Log_OC.getArray(productSectorModel, "model");
        Integer $r3 = productSectorModel.getId();
        String $r4 = productSectorModel.getName();
        String $r5 = productSectorModel.getNameSlugified();
        String $r6 = productSectorModel.getStatus();
        ProductSectorEntity $r2 = new ProductSectorEntity($r3, $r4, $r5, $r6);
        return $r2;
    }
}
