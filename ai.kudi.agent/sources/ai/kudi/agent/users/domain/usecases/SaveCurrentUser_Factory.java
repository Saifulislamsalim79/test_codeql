package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SaveCurrentUser_Factory implements InterfaceC9468d<SaveCurrentUser> {
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public SaveCurrentUser_Factory(InterfaceC11700a interfaceC11700a) {
        this.userRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SaveCurrentUser_Factory create(InterfaceC11700a interfaceC11700a) {
        SaveCurrentUser_Factory $r1 = new SaveCurrentUser_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SaveCurrentUser newInstance(UserRepository userRepository) {
        SaveCurrentUser $r1 = new SaveCurrentUser(userRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SaveCurrentUser multiply() {
        InterfaceC11700a $r1 = this.userRepositoryProvider;
        Object $r2 = $r1.get();
        UserRepository $r3 = (UserRepository) $r2;
        SaveCurrentUser $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41452multiply() {
        SaveCurrentUser $r1 = multiply();
        return $r1;
    }
}
