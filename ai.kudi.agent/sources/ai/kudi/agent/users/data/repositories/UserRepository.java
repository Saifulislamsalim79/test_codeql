package ai.kudi.agent.users.data.repositories;

import ai.kudi.agent.core.domain.repositories.Repository;
import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.users.domain.dto.User;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* compiled from: UserRepository.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000f\u001a\u00020\rH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0011\u001a\u00020\rH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/users/data/repositories/UserRepository;", "Lai/kudi/agent/core/domain/repositories/Repository;", "Lai/kudi/agent/users/domain/dto/User;", "currentUser", "Lio/reactivex/Single;", "getCurrentUser", "()Lio/reactivex/Single;", "fetchUserProfile", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "user", "isEmailAvailable", "email", "", "isPhoneAvailable", "phoneNumber", "isUsernameAvailable", CacheDataSource.PREF_USERNAME, "saveFCMForCurrentUser", "fcm", "updateUser", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface UserRepository extends Repository<User> {
    AbstractC11688p fetchUserProfile(ai.kudi.agent.users.domain.package_1.User user);

    AbstractC11696w getCurrentUser();

    AbstractC11688p isEmailAvailable(String str);

    AbstractC11688p isPhoneAvailable(String str);

    AbstractC11688p isUsernameAvailable(String str);

    AbstractC11688p saveFCMForCurrentUser(String str);

    AbstractC11688p updateUser(ai.kudi.agent.users.domain.package_1.User user);
}
