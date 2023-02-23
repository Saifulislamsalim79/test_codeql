package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchUserByEmail_Factory implements InterfaceC9468d<FetchUserByEmail> {
    private final InterfaceC11700a<UserRepository> userRepositoryProvider;

    public FetchUserByEmail_Factory(InterfaceC11700a interfaceC11700a) {
        this.userRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchUserByEmail_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchUserByEmail_Factory $r1 = new FetchUserByEmail_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchUserByEmail newInstance(UserRepository userRepository) {
        FetchUserByEmail $r1 = new FetchUserByEmail(userRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchUserByEmail multiply() {
        InterfaceC11700a $r1 = this.userRepositoryProvider;
        Object $r2 = $r1.get();
        UserRepository $r3 = (UserRepository) $r2;
        FetchUserByEmail $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41437multiply() {
        FetchUserByEmail $r1 = multiply();
        return $r1;
    }
}
