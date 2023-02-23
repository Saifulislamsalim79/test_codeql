package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.dto.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: Profile.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/Profile;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "Lai/kudi/agent/users/domain/dto/User;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/users/data/repositories/UserRepository;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Profile implements OneInputUseCase<UserProfile, User> {
    private final UserRepository userRepository;

    public Profile(UserRepository userRepository) {
        Log_OC.getArray(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(user, MetricTracker.Object.INPUT);
        UserRepository $r2 = this.userRepository;
        AbstractC11688p $r3 = $r2.fetchUserProfile(user);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "userRepository.fetchUserProfile(input)\n            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        ai.kudi.agent.users.domain.package_1.User $r3 = (ai.kudi.agent.users.domain.package_1.User) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
