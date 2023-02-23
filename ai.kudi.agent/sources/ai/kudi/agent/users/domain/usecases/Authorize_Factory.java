package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.users.data.network.UserService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class Authorize_Factory implements InterfaceC9468d<Authorize> {
    private final InterfaceC11700a<UserService> networkServiceProvider;

    public Authorize_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Authorize_Factory create(InterfaceC11700a interfaceC11700a) {
        Authorize_Factory $r1 = new Authorize_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Authorize newInstance(UserService userService) {
        Authorize $r1 = new Authorize(userService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Authorize convertType() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        UserService $r3 = (UserService) $r2;
        Authorize $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: convertType  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41428convertType() {
        Authorize $r1 = convertType();
        return $r1;
    }
}
