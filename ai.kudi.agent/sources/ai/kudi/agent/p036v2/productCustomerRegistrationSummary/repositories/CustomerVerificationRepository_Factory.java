package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.repositories;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources.VerifyCustomerRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.repositories.CustomerVerificationRepository_Factory */
/* loaded from: classes.dex */
public final class CustomerVerificationRepository_Factory implements InterfaceC9468d<CustomerVerificationRepository> {
    private final InterfaceC11700a<VerifyCustomerRemoteSource> remoteSourceProvider;

    public CustomerVerificationRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.remoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerVerificationRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        CustomerVerificationRepository_Factory $r1 = new CustomerVerificationRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerVerificationRepository newInstance(VerifyCustomerRemoteSource verifyCustomerRemoteSource) {
        CustomerVerificationRepository $r1 = new CustomerVerificationRepository(verifyCustomerRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CustomerVerificationRepository multiply() {
        InterfaceC11700a $r1 = this.remoteSourceProvider;
        Object $r2 = $r1.get();
        VerifyCustomerRemoteSource $r3 = (VerifyCustomerRemoteSource) $r2;
        CustomerVerificationRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41600multiply() {
        CustomerVerificationRepository $r1 = multiply();
        return $r1;
    }
}
