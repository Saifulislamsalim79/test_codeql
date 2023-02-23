package ai.kudi.agent.withdraw_cash.domain.usecases;

import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchUssdWithdrawalProviderListUsecase_Factory implements InterfaceC9468d<FetchUssdWithdrawalProviderListUsecase> {
    private final InterfaceC11700a<UssdWithdrawalRepository> repositoryProvider;

    public FetchUssdWithdrawalProviderListUsecase_Factory(InterfaceC11700a interfaceC11700a) {
        this.repositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchUssdWithdrawalProviderListUsecase_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchUssdWithdrawalProviderListUsecase_Factory $r1 = new FetchUssdWithdrawalProviderListUsecase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchUssdWithdrawalProviderListUsecase newInstance(UssdWithdrawalRepository ussdWithdrawalRepository) {
        FetchUssdWithdrawalProviderListUsecase $r1 = new FetchUssdWithdrawalProviderListUsecase(ussdWithdrawalRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchUssdWithdrawalProviderListUsecase multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        UssdWithdrawalRepository $r3 = (UssdWithdrawalRepository) $r2;
        FetchUssdWithdrawalProviderListUsecase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41798multiply() {
        FetchUssdWithdrawalProviderListUsecase $r1 = multiply();
        return $r1;
    }
}
