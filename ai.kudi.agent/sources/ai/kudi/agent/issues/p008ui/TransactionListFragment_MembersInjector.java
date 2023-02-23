package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.navigation.GlobalNavigator;
import ai.kudi.agent.issues.presenters.TransactionListPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.TransactionListFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransactionListFragment_MembersInjector implements InterfaceC9463a<TransactionListFragment> {
    private final InterfaceC11700a<GlobalNavigator> globalNavigatorProvider;
    private final InterfaceC11700a<TransactionListPresenter> thisPresenterProvider;

    public TransactionListFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.globalNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransactionListFragment_MembersInjector $r2 = new TransactionListFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectGlobalNavigator(TransactionListFragment transactionListFragment, GlobalNavigator globalNavigator) {
        transactionListFragment.globalNavigator = globalNavigator;
    }

    public static void injectThisPresenter(TransactionListFragment transactionListFragment, TransactionListPresenter transactionListPresenter) {
        transactionListFragment.thisPresenter = transactionListPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionListFragment transactionListFragment) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        TransactionListPresenter $r4 = (TransactionListPresenter) $r3;
        injectThisPresenter(transactionListFragment, $r4);
        InterfaceC11700a $r22 = this.globalNavigatorProvider;
        Object $r32 = $r22.get();
        GlobalNavigator $r5 = (GlobalNavigator) $r32;
        injectGlobalNavigator(transactionListFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionListFragment $r2 = (TransactionListFragment) obj;
        injectMembers($r2);
    }
}
