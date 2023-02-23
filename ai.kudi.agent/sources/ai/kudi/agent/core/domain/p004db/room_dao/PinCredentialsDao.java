package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.PinEntity;
import kotlin.Metadata;
import p425j.p444e.AbstractC11696w;
/* compiled from: PinCredentialsDao.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/PinCredentialsDao;", "", "deletePin", "", "pin", "Lai/kudi/agent/core/domain/room_entities/PinEntity;", "getPin", "Lio/reactivex/Single;", "phoneNumber", "", "insertPin", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.PinCredentialsDao */
/* loaded from: classes.dex */
public interface PinCredentialsDao {
    void deletePin(PinEntity pinEntity);

    AbstractC11696w getPin(String str);

    AbstractC11696w insertPin(PinEntity pinEntity);
}
