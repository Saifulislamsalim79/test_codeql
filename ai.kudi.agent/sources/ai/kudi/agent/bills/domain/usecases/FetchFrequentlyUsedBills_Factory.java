package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.product.repository.BillerRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchFrequentlyUsedBills_Factory implements InterfaceC9468d<FetchFrequentlyUsedBills> {
    private final InterfaceC11700a<BillerRepository> billerRepositoryProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public FetchFrequentlyUsedBills_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.networkServiceProvider = interfaceC11700a;
        this.billerRepositoryProvider = interfaceC11700a2;
        this.rxSchedulersProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchFrequentlyUsedBills_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        FetchFrequentlyUsedBills_Factory $r3 = new FetchFrequentlyUsedBills_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchFrequentlyUsedBills newInstance(NetworkService networkService, BillerRepository billerRepository, RxSchedulers rxSchedulers) {
        FetchFrequentlyUsedBills $r3 = new FetchFrequentlyUsedBills(networkService, billerRepository, rxSchedulers);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchFrequentlyUsedBills multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        InterfaceC11700a $r12 = this.billerRepositoryProvider;
        Object $r22 = $r12.get();
        BillerRepository $r4 = (BillerRepository) $r22;
        InterfaceC11700a $r13 = this.rxSchedulersProvider;
        Object $r23 = $r13.get();
        RxSchedulers $r5 = (RxSchedulers) $r23;
        FetchFrequentlyUsedBills $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39027multiply() {
        FetchFrequentlyUsedBills $r1 = multiply();
        return $r1;
    }
}
