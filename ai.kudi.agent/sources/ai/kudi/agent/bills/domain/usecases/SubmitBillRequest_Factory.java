package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.bills.data.remote.BillsService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SubmitBillRequest_Factory implements InterfaceC9468d<SubmitBillRequest> {
    private final InterfaceC11700a<BillsService> billsServiceProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public SubmitBillRequest_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.billsServiceProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitBillRequest_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        SubmitBillRequest_Factory $r2 = new SubmitBillRequest_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitBillRequest newInstance(BillsService billsService, UserRepository userRepository) {
        SubmitBillRequest $r2 = new SubmitBillRequest(billsService, userRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitBillRequest multiply() {
        InterfaceC11700a $r1 = this.billsServiceProvider;
        Object $r2 = $r1.get();
        BillsService $r3 = (BillsService) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        SubmitBillRequest $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39035multiply() {
        SubmitBillRequest $r1 = multiply();
        return $r1;
    }
}
