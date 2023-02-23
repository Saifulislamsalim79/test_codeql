package ai.kudi.agent.withdraw_cash.domain.usecases;

import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CheckUssdWithdrawalTransactionStatus_Factory implements InterfaceC9468d<CheckUssdWithdrawalTransactionStatus> {
    private final InterfaceC11700a<UssdWithdrawalRepository> repositoryProvider;

    public CheckUssdWithdrawalTransactionStatus_Factory(InterfaceC11700a interfaceC11700a) {
        this.repositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CheckUssdWithdrawalTransactionStatus_Factory create(InterfaceC11700a interfaceC11700a) {
        CheckUssdWithdrawalTransactionStatus_Factory $r1 = new CheckUssdWithdrawalTransactionStatus_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CheckUssdWithdrawalTransactionStatus newInstance(UssdWithdrawalRepository ussdWithdrawalRepository) {
        CheckUssdWithdrawalTransactionStatus $r1 = new CheckUssdWithdrawalTransactionStatus(ussdWithdrawalRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CheckUssdWithdrawalTransactionStatus multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        UssdWithdrawalRepository $r3 = (UssdWithdrawalRepository) $r2;
        CheckUssdWithdrawalTransactionStatus $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41797multiply() {
        CheckUssdWithdrawalTransactionStatus $r1 = multiply();
        return $r1;
    }
}
