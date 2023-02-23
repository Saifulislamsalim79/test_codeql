package ai.kudi.agent.p036v2.common.domain.sources.localSources;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.sources.localSources.ProductSectorLocalSource_Factory */
/* loaded from: classes.dex */
public final class ProductSectorLocalSource_Factory implements InterfaceC9468d<ProductSectorLocalSource> {
    private final InterfaceC11700a<CoreAppDatabase> appDatabaseProvider;

    public ProductSectorLocalSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.appDatabaseProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSectorLocalSource_Factory create(InterfaceC11700a interfaceC11700a) {
        ProductSectorLocalSource_Factory $r1 = new ProductSectorLocalSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductSectorLocalSource newInstance(CoreAppDatabase coreAppDatabase) {
        ProductSectorLocalSource $r1 = new ProductSectorLocalSource(coreAppDatabase);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSectorLocalSource multiply() {
        InterfaceC11700a $r1 = this.appDatabaseProvider;
        Object $r2 = $r1.get();
        CoreAppDatabase $r3 = (CoreAppDatabase) $r2;
        ProductSectorLocalSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41512multiply() {
        ProductSectorLocalSource $r1 = multiply();
        return $r1;
    }
}
