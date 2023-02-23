package ai.kudi.agent.product.other_bills.presenter;

import ai.kudi.agent.product.repository.BillerRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BillsListPresenter_Factory implements InterfaceC9468d<BillsListPresenter> {
    private final InterfaceC11700a<BillerRepository> billerRepositoryProvider;

    public BillsListPresenter_Factory(InterfaceC11700a interfaceC11700a) {
        this.billerRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillsListPresenter_Factory create(InterfaceC11700a interfaceC11700a) {
        BillsListPresenter_Factory $r1 = new BillsListPresenter_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillsListPresenter newInstance(BillerRepository billerRepository) {
        BillsListPresenter $r1 = new BillsListPresenter(billerRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillsListPresenter multiply() {
        InterfaceC11700a $r1 = this.billerRepositoryProvider;
        Object $r2 = $r1.get();
        BillerRepository $r3 = (BillerRepository) $r2;
        BillsListPresenter $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40199multiply() {
        BillsListPresenter $r1 = multiply();
        return $r1;
    }
}
