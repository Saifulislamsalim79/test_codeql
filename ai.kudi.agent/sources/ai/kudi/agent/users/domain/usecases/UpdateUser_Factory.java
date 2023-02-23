package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UpdateUser_Factory implements InterfaceC9468d<UpdateUser> {
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public UpdateUser_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.userRepositoryProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpdateUser_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        UpdateUser_Factory $r2 = new UpdateUser_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpdateUser newInstance(UserRepository userRepository, RxSchedulers rxSchedulers) {
        UpdateUser $r2 = new UpdateUser(userRepository, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UpdateUser multiply() {
        InterfaceC11700a $r1 = this.userRepositoryProvider;
        Object $r2 = $r1.get();
        UserRepository $r3 = (UserRepository) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        UpdateUser $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41459multiply() {
        UpdateUser $r1 = multiply();
        return $r1;
    }
}
