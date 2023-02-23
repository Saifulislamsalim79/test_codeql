package ai.kudi.agent.p036v2.productCollectionSummary.repositories;

import ai.kudi.agent.p036v2.productCollectionSummary.sources.remoteSources.CollectionTransactionRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.repositories.CollectionTransactionRepository_Factory */
/* loaded from: classes.dex */
public final class CollectionTransactionRepository_Factory implements InterfaceC9468d<CollectionTransactionRepository> {
    private final InterfaceC11700a<CollectionTransactionRemoteSource> sourceProvider;

    public CollectionTransactionRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.sourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CollectionTransactionRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        CollectionTransactionRepository_Factory $r1 = new CollectionTransactionRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CollectionTransactionRepository newInstance(CollectionTransactionRemoteSource collectionTransactionRemoteSource) {
        CollectionTransactionRepository $r1 = new CollectionTransactionRepository(collectionTransactionRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CollectionTransactionRepository multiply() {
        InterfaceC11700a $r1 = this.sourceProvider;
        Object $r2 = $r1.get();
        CollectionTransactionRemoteSource $r3 = (CollectionTransactionRemoteSource) $r2;
        CollectionTransactionRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41576multiply() {
        CollectionTransactionRepository $r1 = multiply();
        return $r1;
    }
}
