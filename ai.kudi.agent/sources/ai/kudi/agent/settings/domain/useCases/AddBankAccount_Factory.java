package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AddBankAccount_Factory implements InterfaceC9468d<AddBankAccount> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public AddBankAccount_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AddBankAccount_Factory create(InterfaceC11700a interfaceC11700a) {
        AddBankAccount_Factory $r1 = new AddBankAccount_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AddBankAccount newInstance(NetworkService networkService) {
        AddBankAccount $r1 = new AddBankAccount(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AddBankAccount multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        AddBankAccount $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40743multiply() {
        AddBankAccount $r1 = multiply();
        return $r1;
    }
}
