package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.repositories.CardlessWithdrawalRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CardlessWithdrawalRepository_LocalSource_Factory implements InterfaceC9468d<CardlessWithdrawalRepository.LocalSource> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;

    public CardlessWithdrawalRepository_LocalSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.currentUserProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardlessWithdrawalRepository_LocalSource_Factory create(InterfaceC11700a interfaceC11700a) {
        CardlessWithdrawalRepository_LocalSource_Factory $r1 = new CardlessWithdrawalRepository_LocalSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardlessWithdrawalRepository.LocalSource newInstance(FetchCurrentUser fetchCurrentUser) {
        CardlessWithdrawalRepository.LocalSource $r1 = new CardlessWithdrawalRepository.LocalSource(fetchCurrentUser);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CardlessWithdrawalRepository.LocalSource multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        CardlessWithdrawalRepository.LocalSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41789multiply() {
        CardlessWithdrawalRepository.LocalSource $r1 = multiply();
        return $r1;
    }
}
