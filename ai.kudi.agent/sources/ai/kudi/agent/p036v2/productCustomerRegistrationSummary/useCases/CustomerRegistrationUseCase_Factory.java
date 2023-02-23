package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.repositories.CustomerRegistrationRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.useCases.CustomerRegistrationUseCase_Factory */
/* loaded from: classes.dex */
public final class CustomerRegistrationUseCase_Factory implements InterfaceC9468d<CustomerRegistrationUseCase> {
    private final InterfaceC11700a<CustomerRegistrationRepository> customerRegistrationRepositoryProvider;

    public CustomerRegistrationUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.customerRegistrationRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerRegistrationUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        CustomerRegistrationUseCase_Factory $r1 = new CustomerRegistrationUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerRegistrationUseCase newInstance(CustomerRegistrationRepository customerRegistrationRepository) {
        CustomerRegistrationUseCase $r1 = new CustomerRegistrationUseCase(customerRegistrationRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CustomerRegistrationUseCase multiply() {
        InterfaceC11700a $r1 = this.customerRegistrationRepositoryProvider;
        Object $r2 = $r1.get();
        CustomerRegistrationRepository $r3 = (CustomerRegistrationRepository) $r2;
        CustomerRegistrationUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41608multiply() {
        CustomerRegistrationUseCase $r1 = multiply();
        return $r1;
    }
}
