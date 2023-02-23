package ai.kudi.agent.p036v2.common.domain.repositories;

import ai.kudi.agent.p036v2.common.domain.sources.localSources.ProductSectorLocalSource;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductSectorRemoteSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
import p590o.p591a.Timber;
/* compiled from: ProductSectorRepository.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0018\u00010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/repositories/ProductSectorRepository;", "", "localSource", "Lai/kudi/agent/v2/common/domain/sources/localSources/ProductSectorLocalSource;", "remoteSource", "Lai/kudi/agent/v2/common/domain/sources/remoteSources/ProductSectorRemoteSource;", "(Lai/kudi/agent/v2/common/domain/sources/localSources/ProductSectorLocalSource;Lai/kudi/agent/v2/common/domain/sources/remoteSources/ProductSectorRemoteSource;)V", "fetchProductSector", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "saveProductSectors", "Lio/reactivex/disposables/Disposable;", "productSectors", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.repositories.ProductSectorRepository */
/* loaded from: classes.dex */
public final class ProductSectorRepository {
    private final ProductSectorLocalSource localSource;
    private final ProductSectorRemoteSource remoteSource;

    public ProductSectorRepository(ProductSectorLocalSource productSectorLocalSource, ProductSectorRemoteSource productSectorRemoteSource) {
        Log_OC.getArray(productSectorLocalSource, "localSource");
        Log_OC.getArray(productSectorRemoteSource, "remoteSource");
        this.localSource = productSectorLocalSource;
        this.remoteSource = productSectorRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchProductSector$lambda-0  reason: not valid java name */
    public static final void m41506fetchProductSector$lambda0(ProductSectorRepository productSectorRepository, List list) {
        Log_OC.getArray(productSectorRepository, "this$0");
        productSectorRepository.saveProductSectors(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final FavoritesArrayAdapter saveProductSectors(List $r2) {
        ProductSectorLocalSource $r3 = this.localSource;
        if ($r2 == null) {
            $r2 = C13726r.m3891e();
        }
        AbstractC11688p $r4 = $r3.addProductSectors($r2);
        Item $r5 = ClassWriter.LogError();
        AbstractC11688p $r42 = $r4.h0($r5);
        Function $r6 = Function.LEN;
        C0685c $r1 = C0685c.f1902d;
        FavoritesArrayAdapter $r7 = $r42.e0($r6, $r1);
        Log_OC.loadImage($r7, "localSource.addProductSectors(productSectors ?: emptyList())\n            .subscribeOn(Schedulers.io()).subscribe(\n                {\n                    Timber.d(\"product sector list $it\")\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: saveProductSectors$lambda-1  reason: not valid java name */
    public static final void m41507saveProductSectors$lambda1(List list) {
        String $r0 = Log_OC.m10359a("product sector list ", list);
        Object[] $r2 = new Object[0];
        Timber.wtf($r0, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchProductSector() {
        ProductSectorRemoteSource $r2 = this.remoteSource;
        AbstractC11688p $r3 = $r2.fetchProductSector();
        if ($r3 == null) {
            return null;
        }
        return $r3.u(new Object() { // from class: ai.kudi.agent.v2.common.domain.repositories.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductSectorRepository $r1 = ProductSectorRepository.this;
                List $r32 = (List) obj;
                ProductSectorRepository.m41506fetchProductSector$lambda0($r1, $r32);
            }
        });
    }
}
