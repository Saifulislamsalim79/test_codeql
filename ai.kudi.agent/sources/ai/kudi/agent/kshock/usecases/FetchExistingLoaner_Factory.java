package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.repositories.KshockExistingLoanerRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchExistingLoaner_Factory implements InterfaceC9468d<FetchExistingLoaner> {
    private final InterfaceC11700a<KshockExistingLoanerRepository> kshockExistingLoanerRepositoryProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public FetchExistingLoaner_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.kshockExistingLoanerRepositoryProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchExistingLoaner_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        FetchExistingLoaner_Factory $r2 = new FetchExistingLoaner_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchExistingLoaner newInstance(KshockExistingLoanerRepository kshockExistingLoanerRepository, RxSchedulers rxSchedulers) {
        FetchExistingLoaner $r2 = new FetchExistingLoaner(kshockExistingLoanerRepository, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchExistingLoaner multiply() {
        InterfaceC11700a $r1 = this.kshockExistingLoanerRepositoryProvider;
        Object $r2 = $r1.get();
        KshockExistingLoanerRepository $r3 = (KshockExistingLoanerRepository) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        FetchExistingLoaner $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39679multiply() {
        FetchExistingLoaner $r1 = multiply();
        return $r1;
    }
}
