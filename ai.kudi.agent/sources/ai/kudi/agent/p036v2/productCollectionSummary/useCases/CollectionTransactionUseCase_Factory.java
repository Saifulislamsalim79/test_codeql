package ai.kudi.agent.p036v2.productCollectionSummary.useCases;

import ai.kudi.agent.p036v2.productCollectionSummary.repositories.CollectionTransactionRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.useCases.CollectionTransactionUseCase_Factory */
/* loaded from: classes.dex */
public final class CollectionTransactionUseCase_Factory implements InterfaceC9468d<CollectionTransactionUseCase> {
    private final InterfaceC11700a<CollectionTransactionRepository> repoProvider;

    public CollectionTransactionUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.repoProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CollectionTransactionUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        CollectionTransactionUseCase_Factory $r1 = new CollectionTransactionUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CollectionTransactionUseCase newInstance(CollectionTransactionRepository collectionTransactionRepository) {
        CollectionTransactionUseCase $r1 = new CollectionTransactionUseCase(collectionTransactionRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CollectionTransactionUseCase multiply() {
        InterfaceC11700a $r1 = this.repoProvider;
        Object $r2 = $r1.get();
        CollectionTransactionRepository $r3 = (CollectionTransactionRepository) $r2;
        CollectionTransactionUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41581multiply() {
        CollectionTransactionUseCase $r1 = multiply();
        return $r1;
    }
}
