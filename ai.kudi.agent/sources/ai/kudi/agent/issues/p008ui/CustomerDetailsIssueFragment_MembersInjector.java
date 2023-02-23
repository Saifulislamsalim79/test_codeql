package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.CustomerDetailsIssueViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.CustomerDetailsIssueFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CustomerDetailsIssueFragment_MembersInjector implements InterfaceC9463a<CustomerDetailsIssueFragment> {
    private final InterfaceC11700a<CustomerDetailsIssueViewModel> customerDetailsIssueViewModelProvider;

    public CustomerDetailsIssueFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.customerDetailsIssueViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CustomerDetailsIssueFragment_MembersInjector $r1 = new CustomerDetailsIssueFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectCustomerDetailsIssueViewModel(CustomerDetailsIssueFragment customerDetailsIssueFragment, CustomerDetailsIssueViewModel customerDetailsIssueViewModel) {
        customerDetailsIssueFragment.customerDetailsIssueViewModel = customerDetailsIssueViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CustomerDetailsIssueFragment customerDetailsIssueFragment) {
        InterfaceC11700a $r3 = this.customerDetailsIssueViewModelProvider;
        Object $r2 = $r3.get();
        CustomerDetailsIssueViewModel $r4 = (CustomerDetailsIssueViewModel) $r2;
        injectCustomerDetailsIssueViewModel(customerDetailsIssueFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CustomerDetailsIssueFragment $r2 = (CustomerDetailsIssueFragment) obj;
        injectMembers($r2);
    }
}
