package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.settings.domain.repositories.RelationshipManagerRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: FetchRelationshipMgr.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/FetchRelationshipMgr;", "", "relationshipManagerRepository", "Lai/kudi/agent/settings/domain/repositories/RelationshipManagerRepository;", "(Lai/kudi/agent/settings/domain/repositories/RelationshipManagerRepository;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/domain/room_entities/RelationshipManager;", "sessionId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchRelationshipMgr {
    private final RelationshipManagerRepository relationshipManagerRepository;

    public FetchRelationshipMgr(RelationshipManagerRepository relationshipManagerRepository) {
        Log_OC.getArray(relationshipManagerRepository, "relationshipManagerRepository");
        this.relationshipManagerRepository = relationshipManagerRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "sessionId");
        RelationshipManagerRepository $r2 = this.relationshipManagerRepository;
        AbstractC11688p $r3 = $r2.getRelationshipManager(str);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "relationshipManagerRepository.getRelationshipManager(sessionId)\n            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }
}
