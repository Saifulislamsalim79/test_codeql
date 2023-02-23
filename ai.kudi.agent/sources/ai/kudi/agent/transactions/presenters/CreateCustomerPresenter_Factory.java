package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.domain.usecases.CreateCustomerRequest;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class CreateCustomerPresenter_Factory implements InterfaceC9468d<CreateCustomerPresenter> {
    private final InterfaceC11700a<CreateCustomerRequest> createCustomerRequestProvider;

    public CreateCustomerPresenter_Factory(InterfaceC11700a interfaceC11700a) {
        this.createCustomerRequestProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateCustomerPresenter_Factory create(InterfaceC11700a interfaceC11700a) {
        CreateCustomerPresenter_Factory $r1 = new CreateCustomerPresenter_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CreateCustomerPresenter newInstance(CreateCustomerRequest createCustomerRequest) {
        CreateCustomerPresenter $r1 = new CreateCustomerPresenter(createCustomerRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateCustomerPresenter multiply() {
        InterfaceC11700a $r1 = this.createCustomerRequestProvider;
        Object $r2 = $r1.get();
        CreateCustomerRequest $r3 = (CreateCustomerRequest) $r2;
        CreateCustomerPresenter $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41146multiply() {
        CreateCustomerPresenter $r1 = multiply();
        return $r1;
    }
}
