package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.transactions.presenters.CreateCustomerPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.CreateCustomerFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CreateCustomerFragment_MembersInjector implements InterfaceC9463a<CreateCustomerFragment> {
    private final InterfaceC11700a<CreateCustomerPresenter> thisPresenterProvider;

    public CreateCustomerFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CreateCustomerFragment_MembersInjector $r1 = new CreateCustomerFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(CreateCustomerFragment createCustomerFragment, CreateCustomerPresenter createCustomerPresenter) {
        createCustomerFragment.thisPresenter = createCustomerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CreateCustomerFragment createCustomerFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        CreateCustomerPresenter $r4 = (CreateCustomerPresenter) $r2;
        injectThisPresenter(createCustomerFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CreateCustomerFragment $r2 = (CreateCustomerFragment) obj;
        injectMembers($r2);
    }
}
