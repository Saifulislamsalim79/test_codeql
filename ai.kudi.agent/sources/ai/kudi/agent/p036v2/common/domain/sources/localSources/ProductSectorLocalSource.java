package ai.kudi.agent.p036v2.common.domain.sources.localSources;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
/* compiled from: ProductSectorLocalSource.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/sources/localSources/ProductSectorLocalSource;", "", "appDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "addProductSectors", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "productSectors", "fetchProductSector", "Lai/kudi/agent/core/domain/room_entities/ProductSectorEntity;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.sources.localSources.ProductSectorLocalSource */
/* loaded from: classes.dex */
public final class ProductSectorLocalSource {
    private final CoreAppDatabase appDatabase;

    public ProductSectorLocalSource(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "appDatabase");
        this.appDatabase = coreAppDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addProductSectors$lambda-0  reason: not valid java name */
    public static final C13666w m41510addProductSectors$lambda0(ProductSectorLocalSource productSectorLocalSource) {
        Log_OC.getArray(productSectorLocalSource, "this$0");
        CoreAppDatabase $r2 = productSectorLocalSource.appDatabase;
        ProductSectorDao $r0 = $r2.getProductSectorDao();
        $r0.deleteProductSectors();
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /* renamed from: addProductSectors$lambda-2  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p425j.p444e.InterfaceC11692s m41511addProductSectors$lambda2(ai.kudi.agent.p036v2.common.domain.sources.localSources.ProductSectorLocalSource r14, java.util.List r15) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            java.lang.String r0 = "$productSectors"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r0)
            ai.kudi.agent.core.domain.db.CoreAppDatabase r1 = r14.appDatabase
            ai.kudi.agent.core.domain.db.room_dao.ProductSectorDao r2 = r1.getProductSectorDao()
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r4 = kotlin.p557z.C13722p.m3921o(r15, r5)
            r3.<init>(r4)
            java.util.Iterator r6 = r15.iterator()
        L1f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L37
            java.lang.Object r8 = r6.next()
            r10 = r8
            ai.kudi.agent.core.domain.data.ProductSectorModel r10 = (ai.kudi.agent.core.domain.data.ProductSectorModel) r10
            r9 = r10
            ai.kudi.agent.v2.common.utils.mappers.ProductBusinessSectorMapper r11 = ai.kudi.agent.p036v2.common.utils.mappers.ProductBusinessSectorMapper.INSTANCE
            ai.kudi.agent.core.domain.room_entities.ProductSectorEntity r12 = r11.toEntity(r9)
            r3.add(r12)
            goto L1f
        L37:
            r2.insertProductSectors(r3)
            j.e.p r13 = p425j.p444e.AbstractC11688p.m10532N(r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.domain.sources.localSources.ProductSectorLocalSource.m41511addProductSectors$lambda2(ai.kudi.agent.v2.common.domain.sources.localSources.ProductSectorLocalSource, java.util.List):j.e.s");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p addProductSectors(final List list) {
        Log_OC.getArray(list, "productSectors");
        AbstractC11271b $r4 = AbstractC11271b.m11239l(new Callable() { // from class: ai.kudi.agent.v2.common.domain.sources.localSources.Function
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ProductSectorLocalSource $r2 = ProductSectorLocalSource.this;
                C13666w $r1 = ProductSectorLocalSource.m41510addProductSectors$lambda0($r2);
                return $r1;
            }
        });
        AbstractC11688p $r5 = $r4.m11247d(AbstractC11688p.m10488t(new Callable() { // from class: ai.kudi.agent.v2.common.domain.sources.localSources.Preferences$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ProductSectorLocalSource $r3 = ProductSectorLocalSource.this;
                List $r1 = list;
                InterfaceC11692s $r2 = ProductSectorLocalSource.m41511addProductSectors$lambda2($r3, $r1);
                return $r2;
            }
        }));
        Log_OC.loadImage($r5, "fromCallable {\n            appDatabase.productSectorDao.deleteProductSectors()\n        }.andThen(\n            Observable.defer {\n                appDatabase.productSectorDao.insertProductSectors(productSectors.map {\n                    ProductBusinessSectorMapper.toEntity(\n                        it\n                    )\n                })\n                Observable.just(productSectors)\n            }\n        )");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchProductSector() {
        CoreAppDatabase $r1 = this.appDatabase;
        ProductSectorDao $r2 = $r1.getProductSectorDao();
        AbstractC11688p $r3 = $r2.fetchAllProductSectors();
        return $r3;
    }
}
