package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.repositories.CustomerVerificationRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.useCases.CustomerVerificationUseCase_Factory */
/* loaded from: classes.dex */
public final class CustomerVerificationUseCase_Factory implements InterfaceC9468d<CustomerVerificationUseCase> {
    private final InterfaceC11700a<CustomerVerificationRepository> repoProvider;

    public CustomerVerificationUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.repoProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerVerificationUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        CustomerVerificationUseCase_Factory $r1 = new CustomerVerificationUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerVerificationUseCase newInstance(CustomerVerificationRepository customerVerificationRepository) {
        CustomerVerificationUseCase $r1 = new CustomerVerificationUseCase(customerVerificationRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CustomerVerificationUseCase multiply() {
        InterfaceC11700a $r1 = this.repoProvider;
        Object $r2 = $r1.get();
        CustomerVerificationRepository $r3 = (CustomerVerificationRepository) $r2;
        CustomerVerificationUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41609multiply() {
        CustomerVerificationUseCase $r1 = multiply();
        return $r1;
    }
}
