package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewModel;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases.CustomerRegistrationUseCase;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases.CustomerVerificationUseCase;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.viewModel.ProductCustomerRegistrationSummaryViewModel_Factory */
/* loaded from: classes.dex */
public final class ProductCustomerRegistrationSummaryViewModel_Factory implements InterfaceC9468d<ProductCustomerRegistrationSummaryViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<CustomerRegistrationUseCase> registerCustomerProvider;
    private final InterfaceC11700a<CustomerVerificationUseCase> verifyCustomerRegistrationProvider;

    public ProductCustomerRegistrationSummaryViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.registerCustomerProvider = interfaceC11700a;
        this.verifyCustomerRegistrationProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductCustomerRegistrationSummaryViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ProductCustomerRegistrationSummaryViewModel_Factory $r3 = new ProductCustomerRegistrationSummaryViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductCustomerRegistrationSummaryViewModel newInstance(CustomerRegistrationUseCase customerRegistrationUseCase, CustomerVerificationUseCase customerVerificationUseCase, FetchCurrentUser fetchCurrentUser) {
        ProductCustomerRegistrationSummaryViewModel $r3 = new ProductCustomerRegistrationSummaryViewModel(customerRegistrationUseCase, customerVerificationUseCase, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductCustomerRegistrationSummaryViewModel multiply() {
        InterfaceC11700a $r1 = this.registerCustomerProvider;
        Object $r2 = $r1.get();
        CustomerRegistrationUseCase $r3 = (CustomerRegistrationUseCase) $r2;
        InterfaceC11700a $r12 = this.verifyCustomerRegistrationProvider;
        Object $r22 = $r12.get();
        CustomerVerificationUseCase $r4 = (CustomerVerificationUseCase) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        ProductCustomerRegistrationSummaryViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41616multiply() {
        ProductCustomerRegistrationSummaryViewModel $r1 = multiply();
        return $r1;
    }
}
