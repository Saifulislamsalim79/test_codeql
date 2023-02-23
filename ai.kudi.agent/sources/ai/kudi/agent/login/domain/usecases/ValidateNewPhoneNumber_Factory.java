package ai.kudi.agent.login.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ValidateNewPhoneNumber_Factory implements InterfaceC9468d<ValidateNewPhoneNumber> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public ValidateNewPhoneNumber_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ValidateNewPhoneNumber_Factory create(InterfaceC11700a interfaceC11700a) {
        ValidateNewPhoneNumber_Factory $r1 = new ValidateNewPhoneNumber_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ValidateNewPhoneNumber newInstance(NetworkService networkService) {
        ValidateNewPhoneNumber $r1 = new ValidateNewPhoneNumber(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ValidateNewPhoneNumber multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        ValidateNewPhoneNumber $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39714multiply() {
        ValidateNewPhoneNumber $r1 = multiply();
        return $r1;
    }
}
