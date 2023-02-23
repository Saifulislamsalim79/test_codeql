package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.users.data.network.UserService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchLocation_Factory implements InterfaceC9468d<FetchLocation> {
    private final InterfaceC11700a<UserService> networkProvider;

    public FetchLocation_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchLocation_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchLocation_Factory $r1 = new FetchLocation_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchLocation newInstance(UserService userService) {
        FetchLocation $r1 = new FetchLocation(userService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchLocation multiply() {
        InterfaceC11700a $r1 = this.networkProvider;
        Object $r2 = $r1.get();
        UserService $r3 = (UserService) $r2;
        FetchLocation $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40338multiply() {
        FetchLocation $r1 = multiply();
        return $r1;
    }
}
