package ai.kudi.agent.core.domain.p004db.room_dao;

import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: KycLevelsDao.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\u0007\u001a\u00020\u0003H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\tH'¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/KycLevelsDao;", "", "addAllLevels", "", "levels", "", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "deleteAll", "getKycLevels", "Lio/reactivex/Observable;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.KycLevelsDao */
/* loaded from: classes.dex */
public interface KycLevelsDao {
    void addAllLevels(List list);

    void deleteAll();

    AbstractC11688p getKycLevels();
}
