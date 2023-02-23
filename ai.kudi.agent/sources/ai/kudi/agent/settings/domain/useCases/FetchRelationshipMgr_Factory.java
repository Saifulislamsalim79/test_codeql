package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.settings.domain.repositories.RelationshipManagerRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchRelationshipMgr_Factory implements InterfaceC9468d<FetchRelationshipMgr> {
    private final InterfaceC11700a<RelationshipManagerRepository> relationshipManagerRepositoryProvider;

    public FetchRelationshipMgr_Factory(InterfaceC11700a interfaceC11700a) {
        this.relationshipManagerRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchRelationshipMgr_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchRelationshipMgr_Factory $r1 = new FetchRelationshipMgr_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchRelationshipMgr newInstance(RelationshipManagerRepository relationshipManagerRepository) {
        FetchRelationshipMgr $r1 = new FetchRelationshipMgr(relationshipManagerRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchRelationshipMgr multiply() {
        InterfaceC11700a $r1 = this.relationshipManagerRepositoryProvider;
        Object $r2 = $r1.get();
        RelationshipManagerRepository $r3 = (RelationshipManagerRepository) $r2;
        FetchRelationshipMgr $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40750multiply() {
        FetchRelationshipMgr $r1 = multiply();
        return $r1;
    }
}
