package ai.kudi.agent.voucher.cashin.domain.usecase;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateVoucher_Factory implements InterfaceC9468d<CreateVoucher> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public CreateVoucher_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateVoucher_Factory create(InterfaceC11700a interfaceC11700a) {
        CreateVoucher_Factory $r1 = new CreateVoucher_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateVoucher newInstance(NetworkService networkService) {
        CreateVoucher $r1 = new CreateVoucher(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateVoucher multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        CreateVoucher $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41691multiply() {
        CreateVoucher $r1 = multiply();
        return $r1;
    }
}
