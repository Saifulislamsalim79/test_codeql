package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.usecases.NoInputUseCase;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.dto.User;
import ai.kudi.agent.users.domain.package_1.UpdateSourceInfoRequest;
import ai.kudi.agent.users.domain.package_1.UpdateSourceInfoResponse;
import ai.kudi.agent.users.domain.package_1.User;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: UpdateSourceInfo.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/UpdateSourceInfo;", "Lai/kudi/agent/core/usecases/NoInputUseCase;", "Lai/kudi/agent/users/domain/dto/User;", "networkService", "Lai/kudi/agent/users/data/network/UserService;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/users/data/network/UserService;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "execute", "Lio/reactivex/Observable;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateSourceInfo implements NoInputUseCase<User> {
    private final UserService networkService;
    private final UserRepository userRepo;

    public UpdateSourceInfo(UserService userService, UserRepository userRepository) {
        Log_OC.getArray(userService, "networkService");
        Log_OC.getArray(userRepository, "userRepo");
        this.networkService = userService;
        this.userRepo = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m41455execute$lambda1(UpdateSourceInfo updateSourceInfo, final String str, final String str2, final ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(updateSourceInfo, "this$0");
        Log_OC.getArray(user, "user");
        UserService $r4 = updateSourceInfo.networkService;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "user.sessionId");
        Log_OC.loadImage(str, "sourceId");
        Log_OC.loadImage(str2, "fcmToken");
        UpdateSourceInfoRequest $r6 = new UpdateSourceInfoRequest(str, str2);
        AbstractC11688p $r7 = $r4.updateSourceInfo($r5, $r6);
        return $r7.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.users.domain.usecases.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ai.kudi.agent.users.domain.package_1.User $r1 = ai.kudi.agent.users.domain.package_1.User.this;
                String $r2 = str;
                String $r3 = str2;
                UpdateSourceInfoResponse $r52 = (UpdateSourceInfoResponse) obj;
                return UpdateSourceInfo.m41456execute$lambda1$lambda0($r1, $r2, $r3, $r52);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
    public static final ai.kudi.agent.users.domain.package_1.User m41456execute$lambda1$lambda0(ai.kudi.agent.users.domain.package_1.User user, String str, String str2, UpdateSourceInfoResponse updateSourceInfoResponse) {
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(updateSourceInfoResponse, "it");
        User.Builder $r4 = user.toBuilder();
        ai.kudi.agent.users.domain.package_1.User $r3 = $r4.setAndroidAppId(str).setFcmToken(str2).build();
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m41457execute$lambda2(UpdateSourceInfo updateSourceInfo, ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(updateSourceInfo, "this$0");
        Log_OC.getArray(user, "it");
        UserRepository $r3 = updateSourceInfo.userRepo;
        AbstractC11688p $r1 = $r3.updateUser(user);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.NoInputUseCase
    public AbstractC11688p execute() {
        final String $r2 = ai.kudi.agent.users.domain.package_1.User.generateAndroidAppId();
        FirebaseMessaging $r3 = FirebaseMessaging.m21927f();
        Object $r5 = $r3.m21924i().get();
        final String $r6 = (String) $r5;
        UserRepository $r7 = this.userRepo;
        AbstractC11696w $r8 = $r7.getCurrentUser();
        AbstractC11688p $r9 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.users.domain.usecases.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                UpdateSourceInfo $r1 = UpdateSourceInfo.this;
                String $r22 = $r2;
                String $r32 = $r6;
                ai.kudi.agent.users.domain.package_1.User $r62 = (ai.kudi.agent.users.domain.package_1.User) obj;
                InterfaceC11692s $r4 = UpdateSourceInfo.m41455execute$lambda1($r1, $r22, $r32, $r62);
                return $r4;
            }
        });
        AbstractC11688p $r92 = $r9.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.users.domain.usecases.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                UpdateSourceInfo $r1 = UpdateSourceInfo.this;
                ai.kudi.agent.users.domain.package_1.User $r4 = (ai.kudi.agent.users.domain.package_1.User) obj;
                InterfaceC11692s $r22 = UpdateSourceInfo.m41457execute$lambda2($r1, $r4);
                return $r22;
            }
        });
        p425j.p444e.Item $r11 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r93 = $r92.h0($r11);
        p425j.p444e.Item $r112 = ContextUtils.LogError();
        AbstractC11688p $r94 = $r93.R($r112);
        Log_OC.loadImage($r94, "userRepo.currentUser.flatMapObservable { user ->\n            networkService\n                .updateSourceInfo(user.sessionId, UpdateSourceInfoRequest(sourceId, fcmToken))\n                .map {\n                    user.toBuilder()\n                        .setAndroidAppId(sourceId)\n                        .setFcmToken(fcmToken)\n                        .build()\n                }\n        }\n            .flatMap { userRepo.updateUser(it) }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r94;
    }
}
