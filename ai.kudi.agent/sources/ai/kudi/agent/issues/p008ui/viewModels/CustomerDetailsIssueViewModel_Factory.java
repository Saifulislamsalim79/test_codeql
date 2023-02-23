package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.viewModels.CustomerDetailsIssueViewModel_Factory */
/* loaded from: classes.dex */
public final class CustomerDetailsIssueViewModel_Factory implements InterfaceC9468d<CustomerDetailsIssueViewModel> {
    private final InterfaceC11700a<AccountLookup> accountLookupProvider;
    private final InterfaceC11700a<IssueTypeNavigator> issueTypeNavigatorProvider;

    public CustomerDetailsIssueViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.issueTypeNavigatorProvider = interfaceC11700a;
        this.accountLookupProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerDetailsIssueViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        CustomerDetailsIssueViewModel_Factory $r2 = new CustomerDetailsIssueViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomerDetailsIssueViewModel newInstance(IssueTypeNavigator issueTypeNavigator, AccountLookup accountLookup) {
        CustomerDetailsIssueViewModel $r2 = new CustomerDetailsIssueViewModel(issueTypeNavigator, accountLookup);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CustomerDetailsIssueViewModel multiply() {
        InterfaceC11700a $r1 = this.issueTypeNavigatorProvider;
        Object $r2 = $r1.get();
        IssueTypeNavigator $r3 = (IssueTypeNavigator) $r2;
        InterfaceC11700a $r12 = this.accountLookupProvider;
        Object $r22 = $r12.get();
        AccountLookup $r4 = (AccountLookup) $r22;
        CustomerDetailsIssueViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39527multiply() {
        CustomerDetailsIssueViewModel $r1 = multiply();
        return $r1;
    }
}
