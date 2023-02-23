package ai.kudi.agent.settings.personal.p027ui.viewModels;

import ai.kudi.agent.core.domain.room_entities.RelationshipManager;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.domain.useCases.FetchRelationshipMgr;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.RelationshipMgrViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: RelationshipMgrViewModel.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/viewModels/RelationshipMgrViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/RelationshipMgrViewData;", "fetchRelationshipMgr", "Lai/kudi/agent/settings/domain/useCases/FetchRelationshipMgr;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/settings/domain/useCases/FetchRelationshipMgr;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "fetchRelationShipMgr", "", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.viewModels.RelationshipMgrViewModel */
/* loaded from: classes.dex */
public final class RelationshipMgrViewModel extends BaseViewModel<RelationshipMgrViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchRelationshipMgr fetchRelationshipMgr;

    public RelationshipMgrViewModel(FetchRelationshipMgr fetchRelationshipMgr, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(fetchRelationshipMgr, "fetchRelationshipMgr");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.fetchRelationshipMgr = fetchRelationshipMgr;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchRelationShipMgr$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40859fetchRelationShipMgr$lambda0(RelationshipMgrViewModel relationshipMgrViewModel, User user) {
        Log_OC.getArray(relationshipMgrViewModel, "this$0");
        Log_OC.getArray(user, "it");
        FetchRelationshipMgr $r2 = relationshipMgrViewModel.fetchRelationshipMgr;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchRelationShipMgr$lambda-1  reason: not valid java name */
    public static final void m40860fetchRelationShipMgr$lambda1(RelationshipMgrViewModel relationshipMgrViewModel, RelationshipManager relationshipManager) {
        Log_OC.getArray(relationshipMgrViewModel, "this$0");
        Log_OC.loadImage(relationshipManager, "it");
        RelationshipMgrViewData.RelationshipManagerData $r2 = new RelationshipMgrViewData.RelationshipManagerData(relationshipManager);
        relationshipMgrViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchRelationShipMgr$lambda-2  reason: not valid java name */
    public static final void m40861fetchRelationShipMgr$lambda2(RelationshipMgrViewModel relationshipMgrViewModel, Throwable th) {
        Log_OC.getArray(relationshipMgrViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        RelationshipMgrViewData.Error $r2 = new RelationshipMgrViewData.Error($r5);
        relationshipMgrViewModel.publish($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchRelationShipMgr() {
        RelationshipMgrViewData.Loading $r1 = RelationshipMgrViewData.Loading.INSTANCE;
        publish($r1);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RelationshipMgrViewModel $r12 = RelationshipMgrViewModel.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = RelationshipMgrViewModel.m40859fetchRelationShipMgr$lambda0($r12, $r4);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                RelationshipMgrViewModel $r12 = RelationshipMgrViewModel.this;
                RelationshipManager $r32 = (RelationshipManager) obj;
                RelationshipMgrViewModel.m40860fetchRelationShipMgr$lambda1($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.personal.ui.viewModels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                RelationshipMgrViewModel $r12 = RelationshipMgrViewModel.this;
                Throwable $r32 = (Throwable) obj;
                RelationshipMgrViewModel.m40861fetchRelationShipMgr$lambda2($r12, $r32);
            }
        });
        Log_OC.loadImage($r8, "fetchCurrentUser.execute().flatMapObservable {\n            fetchRelationshipMgr.execute(sessionId = it.sessionId)\n        }.subscribe(\n            {\n                publish(RelationshipMgrViewData.RelationshipManagerData(it))\n            },\n            {\n                publish(RelationshipMgrViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        RelationshipMgrViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public RelationshipMgrViewData initialData() {
        RelationshipMgrViewData.Initial r1 = RelationshipMgrViewData.Initial.INSTANCE;
        return r1;
    }
}
