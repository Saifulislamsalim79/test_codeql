package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import com.google.firebase.database.C5615f;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UssdWithdrawalRepository_RemoteSource_Factory implements InterfaceC9468d<UssdWithdrawalRepository.RemoteSource> {
    private final InterfaceC11700a<C5615f> firebaseDatabaseProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public UssdWithdrawalRepository_RemoteSource_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.networkServiceProvider = interfaceC11700a;
        this.firebaseDatabaseProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalRepository_RemoteSource_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        UssdWithdrawalRepository_RemoteSource_Factory $r2 = new UssdWithdrawalRepository_RemoteSource_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UssdWithdrawalRepository.RemoteSource newInstance(NetworkService networkService, C5615f c5615f) {
        UssdWithdrawalRepository.RemoteSource $r2 = new UssdWithdrawalRepository.RemoteSource(networkService, c5615f);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UssdWithdrawalRepository.RemoteSource multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.firebaseDatabaseProvider;
        Object $r22 = $r12.get();
        C5615f $r4 = (C5615f) $r22;
        UssdWithdrawalRepository.RemoteSource $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41795multiply() {
        UssdWithdrawalRepository.RemoteSource $r1 = multiply();
        return $r1;
    }
}
