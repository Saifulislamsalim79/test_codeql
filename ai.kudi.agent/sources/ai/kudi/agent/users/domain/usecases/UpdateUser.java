package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.dto.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: UpdateUser.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/UpdateUser;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/users/domain/dto/User;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/users/data/repositories/UserRepository;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateUser implements OneInputUseCase<User, User> {
    private final RxSchedulers rxSchedulers;
    private final UserRepository userRepository;

    public UpdateUser(UserRepository userRepository, RxSchedulers rxSchedulers) {
        Log_OC.getArray(userRepository, "userRepository");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.userRepository = userRepository;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(user, MetricTracker.Object.INPUT);
        UserRepository $r2 = this.userRepository;
        AbstractC11688p $r3 = $r2.updateUser(user);
        RxSchedulers $r4 = this.rxSchedulers;
        p425j.p444e.Item $r5 = $r4.setSettings();
        AbstractC11688p $r32 = $r3.h0($r5);
        RxSchedulers $r42 = this.rxSchedulers;
        p425j.p444e.Item $r52 = $r42.main();
        AbstractC11688p $r33 = $r32.R($r52);
        Log_OC.loadImage($r33, "userRepository.updateUser(input).subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
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
