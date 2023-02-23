package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.repositories;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources.RegisterCustomerRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.repositories.CustomerRegistrationRepository_Factory */
/* loaded from: classes.dex */
public final class CustomerRegistrationRepository_Factory implements InterfaceC9468d<CustomerRegistrationRepository> {
    private final InterfaceC11700a<RegisterCustomerRemoteSource> registerCustomerRemoteSourceProvider;

    public CustomerRegistrationRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.registerCustomerRemoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerRegistrationRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        CustomerRegistrationRepository_Factory $r1 = new CustomerRegistrationRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerRegistrationRepository newInstance(RegisterCustomerRemoteSource registerCustomerRemoteSource) {
        CustomerRegistrationRepository $r1 = new CustomerRegistrationRepository(registerCustomerRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CustomerRegistrationRepository multiply() {
        InterfaceC11700a $r1 = this.registerCustomerRemoteSourceProvider;
        Object $r2 = $r1.get();
        RegisterCustomerRemoteSource $r3 = (RegisterCustomerRemoteSource) $r2;
        CustomerRegistrationRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41599multiply() {
        CustomerRegistrationRepository $r1 = multiply();
        return $r1;
    }
}
