package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.withdraw_cash.domain.repositories.CardlessWithdrawalRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CardlessWithdrawalRepository_Factory implements InterfaceC9468d<CardlessWithdrawalRepository> {
    private final InterfaceC11700a<CardlessWithdrawalRepository.LocalSource> localSourceProvider;
    private final InterfaceC11700a<CardlessWithdrawalRepository.RemoteSource> remoteSourceProvider;

    public CardlessWithdrawalRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.localSourceProvider = interfaceC11700a;
        this.remoteSourceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardlessWithdrawalRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        CardlessWithdrawalRepository_Factory $r2 = new CardlessWithdrawalRepository_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardlessWithdrawalRepository newInstance(CardlessWithdrawalRepository.LocalSource localSource, CardlessWithdrawalRepository.RemoteSource remoteSource) {
        CardlessWithdrawalRepository $r2 = new CardlessWithdrawalRepository(localSource, remoteSource);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CardlessWithdrawalRepository multiply() {
        InterfaceC11700a $r1 = this.localSourceProvider;
        Object $r2 = $r1.get();
        CardlessWithdrawalRepository.LocalSource $r3 = (CardlessWithdrawalRepository.LocalSource) $r2;
        InterfaceC11700a $r12 = this.remoteSourceProvider;
        Object $r22 = $r12.get();
        CardlessWithdrawalRepository.RemoteSource $r4 = (CardlessWithdrawalRepository.RemoteSource) $r22;
        CardlessWithdrawalRepository $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41788multiply() {
        CardlessWithdrawalRepository $r1 = multiply();
        return $r1;
    }
}
