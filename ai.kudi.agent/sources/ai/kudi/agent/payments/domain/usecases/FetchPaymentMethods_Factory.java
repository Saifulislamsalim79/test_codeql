package ai.kudi.agent.payments.domain.usecases;

import ai.kudi.agent.payments.data.repositories.PaymentMethodRepository;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchPaymentMethods_Factory implements InterfaceC9468d<FetchPaymentMethods> {
    private final InterfaceC11700a<PaymentMethodRepository> paymentMethodRepoProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public FetchPaymentMethods_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.paymentMethodRepoProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchPaymentMethods_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        FetchPaymentMethods_Factory $r2 = new FetchPaymentMethods_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchPaymentMethods newInstance(PaymentMethodRepository paymentMethodRepository, UserRepository userRepository) {
        FetchPaymentMethods $r2 = new FetchPaymentMethods(paymentMethodRepository, userRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchPaymentMethods multiply() {
        InterfaceC11700a $r1 = this.paymentMethodRepoProvider;
        Object $r2 = $r1.get();
        PaymentMethodRepository $r3 = (PaymentMethodRepository) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        FetchPaymentMethods $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40007multiply() {
        FetchPaymentMethods $r1 = multiply();
        return $r1;
    }
}
