package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.RelationshipManager;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: RelationshipManagerDao.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H'¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/RelationshipManagerDao;", "", "deleteAll", "", "getRelationshipManager", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/domain/room_entities/RelationshipManager;", "insert", "relationshipManager", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.RelationshipManagerDao */
/* loaded from: classes.dex */
public interface RelationshipManagerDao {
    void deleteAll();

    AbstractC11688p getRelationshipManager();

    void insert(RelationshipManager relationshipManager);
}
