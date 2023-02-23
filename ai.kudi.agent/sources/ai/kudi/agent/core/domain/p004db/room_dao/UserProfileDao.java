package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.UserProfile;
import kotlin.Metadata;
import p425j.p444e.AbstractC11696w;
/* compiled from: UserProfileDao.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/UserProfileDao;", "", "deleteUser", "", "userProfile", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "getUserProfile", "Lio/reactivex/Single;", "getUserProfileSingle", "insertUserProfile", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.UserProfileDao */
/* loaded from: classes.dex */
public interface UserProfileDao {
    void deleteUser(UserProfile userProfile);

    AbstractC11696w getUserProfile();

    AbstractC11696w getUserProfileSingle();

    void insertUserProfile(UserProfile userProfile);
}
