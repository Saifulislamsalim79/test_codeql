package ai.kudi.agent.transactionhistory.domain.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchWalletActivities_Factory implements InterfaceC9468d<FetchWalletActivities> {
    private final InterfaceC11700a<TransactionsRepository> repositoryProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public FetchWalletActivities_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.repositoryProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchWalletActivities_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        FetchWalletActivities_Factory $r2 = new FetchWalletActivities_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchWalletActivities newInstance(TransactionsRepository transactionsRepository, RxSchedulers rxSchedulers) {
        FetchWalletActivities $r2 = new FetchWalletActivities(transactionsRepository, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchWalletActivities multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        TransactionsRepository $r3 = (TransactionsRepository) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        FetchWalletActivities $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41015multiply() {
        FetchWalletActivities $r1 = multiply();
        return $r1;
    }
}
