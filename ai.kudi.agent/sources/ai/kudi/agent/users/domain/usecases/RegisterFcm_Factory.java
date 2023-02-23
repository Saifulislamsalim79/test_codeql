package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RegisterFcm_Factory implements InterfaceC9468d<RegisterFcm> {
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public RegisterFcm_Factory(InterfaceC11700a interfaceC11700a) {
        this.userRepoProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegisterFcm_Factory create(InterfaceC11700a interfaceC11700a) {
        RegisterFcm_Factory $r1 = new RegisterFcm_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegisterFcm newInstance(UserRepository userRepository) {
        RegisterFcm $r1 = new RegisterFcm(userRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RegisterFcm multiply() {
        InterfaceC11700a $r1 = this.userRepoProvider;
        Object $r2 = $r1.get();
        UserRepository $r3 = (UserRepository) $r2;
        RegisterFcm $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41451multiply() {
        RegisterFcm $r1 = multiply();
        return $r1;
    }
}
