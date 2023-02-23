package ai.kudi.agent.login.setup.domain;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class VerifyFaceForLogin_Factory implements InterfaceC9468d<VerifyFaceForLogin> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public VerifyFaceForLogin_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VerifyFaceForLogin_Factory create(InterfaceC11700a interfaceC11700a) {
        VerifyFaceForLogin_Factory $r1 = new VerifyFaceForLogin_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VerifyFaceForLogin newInstance(NetworkService networkService) {
        VerifyFaceForLogin $r1 = new VerifyFaceForLogin(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VerifyFaceForLogin multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        VerifyFaceForLogin $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39741multiply() {
        VerifyFaceForLogin $r1 = multiply();
        return $r1;
    }
}
