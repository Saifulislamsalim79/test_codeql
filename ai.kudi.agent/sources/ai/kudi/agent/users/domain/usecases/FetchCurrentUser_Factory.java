package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchCurrentUser_Factory implements InterfaceC9468d<FetchCurrentUser> {
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public FetchCurrentUser_Factory(InterfaceC11700a interfaceC11700a) {
        this.userRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchCurrentUser_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchCurrentUser_Factory $r1 = new FetchCurrentUser_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchCurrentUser newInstance(UserRepository userRepository) {
        FetchCurrentUser $r1 = new FetchCurrentUser(userRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchCurrentUser multiply() {
        InterfaceC11700a $r1 = this.userRepositoryProvider;
        Object $r2 = $r1.get();
        UserRepository $r3 = (UserRepository) $r2;
        FetchCurrentUser $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41429multiply() {
        FetchCurrentUser $r1 = multiply();
        return $r1;
    }
}
