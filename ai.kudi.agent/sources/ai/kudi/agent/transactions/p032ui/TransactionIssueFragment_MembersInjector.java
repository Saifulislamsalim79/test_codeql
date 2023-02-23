package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.transactions.presenters.TransactionIssuePresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.TransactionIssueFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransactionIssueFragment_MembersInjector implements InterfaceC9463a<TransactionIssueFragment> {
    private final InterfaceC11700a<TransactionIssuePresenter> thisPresenterProvider;

    public TransactionIssueFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        TransactionIssueFragment_MembersInjector $r1 = new TransactionIssueFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(TransactionIssueFragment transactionIssueFragment, TransactionIssuePresenter transactionIssuePresenter) {
        transactionIssueFragment.thisPresenter = transactionIssuePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionIssueFragment transactionIssueFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        TransactionIssuePresenter $r4 = (TransactionIssuePresenter) $r2;
        injectThisPresenter(transactionIssueFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionIssueFragment $r2 = (TransactionIssueFragment) obj;
        injectMembers($r2);
    }
}
