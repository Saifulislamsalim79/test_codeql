package ai.kudi.agent.login.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RequestVoiceOTP_Factory implements InterfaceC9468d<RequestVoiceOTP> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public RequestVoiceOTP_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RequestVoiceOTP_Factory create(InterfaceC11700a interfaceC11700a) {
        RequestVoiceOTP_Factory $r1 = new RequestVoiceOTP_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RequestVoiceOTP newInstance(NetworkService networkService) {
        RequestVoiceOTP $r1 = new RequestVoiceOTP(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RequestVoiceOTP multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        RequestVoiceOTP $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39710multiply() {
        RequestVoiceOTP $r1 = multiply();
        return $r1;
    }
}
