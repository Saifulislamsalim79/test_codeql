package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.settings.personal.p027ui.viewModels.RelationshipMgrViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.RelationshipManagerFragment_MembersInjector */
/* loaded from: classes.dex */
public final class RelationshipManagerFragment_MembersInjector implements InterfaceC9463a<RelationshipManagerFragment> {
    private final InterfaceC11700a<RelationshipMgrViewModel> relationshipMgrViewModelProvider;

    public RelationshipManagerFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.relationshipMgrViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        RelationshipManagerFragment_MembersInjector $r1 = new RelationshipManagerFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectRelationshipMgrViewModel(RelationshipManagerFragment relationshipManagerFragment, RelationshipMgrViewModel relationshipMgrViewModel) {
        relationshipManagerFragment.relationshipMgrViewModel = relationshipMgrViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(RelationshipManagerFragment relationshipManagerFragment) {
        InterfaceC11700a $r3 = this.relationshipMgrViewModelProvider;
        Object $r2 = $r3.get();
        RelationshipMgrViewModel $r4 = (RelationshipMgrViewModel) $r2;
        injectRelationshipMgrViewModel(relationshipManagerFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        RelationshipManagerFragment $r2 = (RelationshipManagerFragment) obj;
        injectMembers($r2);
    }
}
