package ai.kudi.agent.settings.domain.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.RelationshipManagerDao;
import ai.kudi.agent.core.domain.room_entities.RelationshipManager;
import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RelationshipManagerRepository.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/settings/domain/repositories/RelationshipManagerRepository;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "appRoomDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "getRelationshipManager", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/domain/room_entities/RelationshipManager;", "sessionId", "", "getRelationshipManagerApi", "getRelationshipManagerLocal", "saveRelationshipManager", "", "relationshipManager", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RelationshipManagerRepository {
    private final CoreAppDatabase appRoomDatabase;
    private final NetworkService networkService;

    public RelationshipManagerRepository(NetworkService networkService, CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        this.networkService = networkService;
        this.appRoomDatabase = coreAppDatabase;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p getRelationshipManagerApi(String str) {
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        AbstractC11688p $r4 = $r3.fetchRelationshipManager(str);
        AbstractC11688p $r42 = $r4.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.repositories.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RelationshipManagerRepository $r1 = RelationshipManagerRepository.this;
                APIResponse $r43 = (APIResponse) obj;
                RelationshipManager $r22 = RelationshipManagerRepository.m40737getRelationshipManagerApi$lambda0($r1, $r43);
                return $r22;
            }
        });
        Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        return $r42.h0($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getRelationshipManagerApi$lambda-0  reason: not valid java name */
    public static final RelationshipManager m40737getRelationshipManagerApi$lambda0(RelationshipManagerRepository relationshipManagerRepository, APIResponse aPIResponse) {
        Log_OC.getArray(relationshipManagerRepository, "this$0");
        Log_OC.getArray(aPIResponse, "it");
        Object $r2 = aPIResponse.data;
        RelationshipManager $r3 = (RelationshipManager) $r2;
        Log_OC.loadImage($r3, "relationshipManager");
        relationshipManagerRepository.saveRelationshipManager($r3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p getRelationshipManagerLocal() {
        CoreAppDatabase $r1 = this.appRoomDatabase;
        RelationshipManagerDao $r2 = $r1.getRelationshipManagerDao();
        AbstractC11688p $r3 = $r2.getRelationshipManager();
        Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        Log_OC.loadImage($r32, "appRoomDatabase.relationshipManagerDao.getRelationshipManager()\n            .subscribeOn(Schedulers.io())");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void saveRelationshipManager(RelationshipManager relationshipManager) {
        CoreAppDatabase $r3 = this.appRoomDatabase;
        RelationshipManagerDao $r2 = $r3.getRelationshipManagerDao();
        $r2.insert(relationshipManager);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getRelationshipManager(String str) {
        Log_OC.getArray(str, "sessionId");
        AbstractC11688p $r3 = getRelationshipManagerLocal();
        AbstractC11688p $r32 = getRelationshipManagerApi(str);
        Object[] $r2 = {$r3, $r32};
        InterfaceC11692s[] r5 = (InterfaceC11692s[]) $r2;
        AbstractC11688p $r33 = AbstractC11688p.m10500n(r5);
        Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r34 = $r33.h0($r4);
        Log_OC.loadImage($r34, "concatArrayEager(\n            getRelationshipManagerLocal(),\n            getRelationshipManagerApi(sessionId)\n        ).subscribeOn(Schedulers.io())");
        return $r34;
    }
}
