package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.settings.domain.useCases.FetchRelationshipMgr;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.RelationshipMgrViewModel_Factory */
/* loaded from: classes.dex */
public final class RelationshipMgrViewModel_Factory implements InterfaceC9468d<RelationshipMgrViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchRelationshipMgr> fetchRelationshipMgrProvider;

    public RelationshipMgrViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.fetchRelationshipMgrProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RelationshipMgrViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RelationshipMgrViewModel_Factory $r2 = new RelationshipMgrViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RelationshipMgrViewModel newInstance(FetchRelationshipMgr fetchRelationshipMgr, FetchCurrentUser fetchCurrentUser) {
        RelationshipMgrViewModel $r2 = new RelationshipMgrViewModel(fetchRelationshipMgr, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RelationshipMgrViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchRelationshipMgrProvider;
        Object $r2 = $r1.get();
        FetchRelationshipMgr $r3 = (FetchRelationshipMgr) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        RelationshipMgrViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40862multiply() {
        RelationshipMgrViewModel $r1 = multiply();
        return $r1;
    }
}
