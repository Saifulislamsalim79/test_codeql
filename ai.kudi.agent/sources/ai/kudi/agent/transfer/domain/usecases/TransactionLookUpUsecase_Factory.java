package ai.kudi.agent.transfer.domain.usecases;

import ai.kudi.agent.transfer.domain.repositories.TransactionLookUpRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionLookUpUsecase_Factory implements InterfaceC9468d<TransactionLookUpUsecase> {
    private final InterfaceC11700a<TransactionLookUpRepository> repositoryProvider;

    public TransactionLookUpUsecase_Factory(InterfaceC11700a interfaceC11700a) {
        this.repositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionLookUpUsecase_Factory create(InterfaceC11700a interfaceC11700a) {
        TransactionLookUpUsecase_Factory $r1 = new TransactionLookUpUsecase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionLookUpUsecase newInstance(TransactionLookUpRepository transactionLookUpRepository) {
        TransactionLookUpUsecase $r1 = new TransactionLookUpUsecase(transactionLookUpRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionLookUpUsecase multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        TransactionLookUpRepository $r3 = (TransactionLookUpRepository) $r2;
        TransactionLookUpUsecase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41316multiply() {
        TransactionLookUpUsecase $r1 = multiply();
        return $r1;
    }
}
