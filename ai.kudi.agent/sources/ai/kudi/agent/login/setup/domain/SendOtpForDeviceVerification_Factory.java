package ai.kudi.agent.login.setup.domain;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SendOtpForDeviceVerification_Factory implements InterfaceC9468d<SendOtpForDeviceVerification> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public SendOtpForDeviceVerification_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SendOtpForDeviceVerification_Factory create(InterfaceC11700a interfaceC11700a) {
        SendOtpForDeviceVerification_Factory $r1 = new SendOtpForDeviceVerification_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SendOtpForDeviceVerification newInstance(NetworkService networkService) {
        SendOtpForDeviceVerification $r1 = new SendOtpForDeviceVerification(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SendOtpForDeviceVerification multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        SendOtpForDeviceVerification $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39738multiply() {
        SendOtpForDeviceVerification $r1 = multiply();
        return $r1;
    }
}
