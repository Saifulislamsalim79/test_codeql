package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.withdraw_cash.domain.repositories.CardlessWithdrawalRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CardlessWithdrawalRepository_RemoteSource_Factory implements InterfaceC9468d<CardlessWithdrawalRepository.RemoteSource> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public CardlessWithdrawalRepository_RemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardlessWithdrawalRepository_RemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        CardlessWithdrawalRepository_RemoteSource_Factory $r1 = new CardlessWithdrawalRepository_RemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardlessWithdrawalRepository.RemoteSource newInstance(NetworkService networkService) {
        CardlessWithdrawalRepository.RemoteSource $r1 = new CardlessWithdrawalRepository.RemoteSource(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CardlessWithdrawalRepository.RemoteSource multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        CardlessWithdrawalRepository.RemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41790multiply() {
        CardlessWithdrawalRepository.RemoteSource $r1 = multiply();
        return $r1;
    }
}
