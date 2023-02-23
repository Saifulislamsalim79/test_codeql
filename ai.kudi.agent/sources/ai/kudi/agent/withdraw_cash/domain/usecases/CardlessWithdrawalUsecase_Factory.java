package ai.kudi.agent.withdraw_cash.domain.usecases;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.withdraw_cash.domain.repositories.CardlessWithdrawalRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CardlessWithdrawalUsecase_Factory implements InterfaceC9468d<CardlessWithdrawalUsecase> {
    private final InterfaceC11700a<PerformServiceFeeLookup> feeLookupProvider;
    private final InterfaceC11700a<CardlessWithdrawalRepository> repositoryProvider;

    public CardlessWithdrawalUsecase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.repositoryProvider = interfaceC11700a;
        this.feeLookupProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardlessWithdrawalUsecase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        CardlessWithdrawalUsecase_Factory $r2 = new CardlessWithdrawalUsecase_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardlessWithdrawalUsecase newInstance(CardlessWithdrawalRepository cardlessWithdrawalRepository, PerformServiceFeeLookup performServiceFeeLookup) {
        CardlessWithdrawalUsecase $r2 = new CardlessWithdrawalUsecase(cardlessWithdrawalRepository, performServiceFeeLookup);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CardlessWithdrawalUsecase multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        CardlessWithdrawalRepository $r3 = (CardlessWithdrawalRepository) $r2;
        InterfaceC11700a $r12 = this.feeLookupProvider;
        Object $r22 = $r12.get();
        PerformServiceFeeLookup $r4 = (PerformServiceFeeLookup) $r22;
        CardlessWithdrawalUsecase $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41796multiply() {
        CardlessWithdrawalUsecase $r1 = multiply();
        return $r1;
    }
}
