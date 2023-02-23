package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.network.exceptions.MalformedParamException;
import ai.kudi.agent.network.exceptions.NotFoundException;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.dto.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.Object;
import retrofit2.HttpException;
/* compiled from: FetchUserByPhone.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/FetchUserByPhone;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/users/domain/dto/User;", "", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/users/data/repositories/UserRepository;)V", "execute", "Lio/reactivex/Observable;", "phoneNumber", "throwAppropriateException", "Lio/reactivex/functions/Consumer;", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class FetchUserByPhone implements OneInputUseCase<User, String> {
    private final UserRepository userRepository;

    public FetchUserByPhone(UserRepository userRepository) {
        Log_OC.getArray(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Object throwAppropriateException() {
        State r1 = State.Failed;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: throwAppropriateException$lambda-0  reason: not valid java name */
    public static final void m41438throwAppropriateException$lambda0(Throwable th) {
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            HttpException $r1 = (HttpException) th;
            int $i0 = $r1.m352a();
            if ($i0 == 400) {
                MalformedParamException $r3 = new MalformedParamException("Incorrect phone number");
                throw $r3;
            } else if ($i0 != 404) {
            } else {
                NotFoundException $r2 = new NotFoundException("User doesn't exist.");
                throw $r2;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        String $r3 = (String) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "phoneNumber");
        UserRepository $r2 = this.userRepository;
        AbstractC11688p $r3 = $r2.isPhoneAvailable(str);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.m10607d();
        AbstractC11688p $r32 = $r3.h0($r4);
        Object $r5 = throwAppropriateException();
        AbstractC11688p $r33 = $r32.x($r5);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r34 = $r33.R($r42);
        Log_OC.loadImage($r34, "userRepository.isPhoneAvailable(phoneNumber)\n                .subscribeOn(Schedulers.newThread())\n                .doOnError(throwAppropriateException())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r34;
    }
}
