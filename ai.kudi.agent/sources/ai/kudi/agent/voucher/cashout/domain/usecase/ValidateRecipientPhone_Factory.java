package ai.kudi.agent.voucher.cashout.domain.usecase;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ValidateRecipientPhone_Factory implements InterfaceC9468d<ValidateRecipientPhone> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public ValidateRecipientPhone_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ValidateRecipientPhone_Factory create(InterfaceC11700a interfaceC11700a) {
        ValidateRecipientPhone_Factory $r1 = new ValidateRecipientPhone_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ValidateRecipientPhone newInstance(NetworkService networkService) {
        ValidateRecipientPhone $r1 = new ValidateRecipientPhone(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ValidateRecipientPhone multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        ValidateRecipientPhone $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41719multiply() {
        ValidateRecipientPhone $r1 = multiply();
        return $r1;
    }
}
