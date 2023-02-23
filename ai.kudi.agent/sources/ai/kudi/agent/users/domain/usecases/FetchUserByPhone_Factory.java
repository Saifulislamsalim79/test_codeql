package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchUserByPhone_Factory implements InterfaceC9468d<FetchUserByPhone> {
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public FetchUserByPhone_Factory(InterfaceC11700a interfaceC11700a) {
        this.userRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchUserByPhone_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchUserByPhone_Factory $r1 = new FetchUserByPhone_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchUserByPhone newInstance(UserRepository userRepository) {
        FetchUserByPhone $r1 = new FetchUserByPhone(userRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchUserByPhone multiply() {
        InterfaceC11700a $r1 = this.userRepositoryProvider;
        Object $r2 = $r1.get();
        UserRepository $r3 = (UserRepository) $r2;
        FetchUserByPhone $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41439multiply() {
        FetchUserByPhone $r1 = multiply();
        return $r1;
    }
}
