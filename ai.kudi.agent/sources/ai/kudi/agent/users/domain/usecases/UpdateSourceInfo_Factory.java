package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UpdateSourceInfo_Factory implements InterfaceC9468d<UpdateSourceInfo> {
    private final InterfaceC11700a<UserService> networkServiceProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public UpdateSourceInfo_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.networkServiceProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpdateSourceInfo_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        UpdateSourceInfo_Factory $r2 = new UpdateSourceInfo_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpdateSourceInfo newInstance(UserService userService, UserRepository userRepository) {
        UpdateSourceInfo $r2 = new UpdateSourceInfo(userService, userRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UpdateSourceInfo multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        UserService $r3 = (UserService) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        UpdateSourceInfo $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41458multiply() {
        UpdateSourceInfo $r1 = multiply();
        return $r1;
    }
}
