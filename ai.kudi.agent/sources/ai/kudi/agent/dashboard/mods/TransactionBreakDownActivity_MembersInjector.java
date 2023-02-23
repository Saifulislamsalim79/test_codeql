package ai.kudi.agent.dashboard.mods;

import ai.kudi.agent.dashboard.presenter.TransactionBreakDownPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionBreakDownActivity_MembersInjector implements InterfaceC9463a<ai.kudi.agent.dashboard.ui.TransactionBreakDownActivity> {
    private final InterfaceC11700a<TransactionBreakDownPresenter> thisPresenterProvider;

    public TransactionBreakDownActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        TransactionBreakDownActivity_MembersInjector $r1 = new TransactionBreakDownActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(TransactionBreakDownActivity transactionBreakDownActivity, TransactionBreakDownPresenter transactionBreakDownPresenter) {
        transactionBreakDownActivity.thisPresenter = transactionBreakDownPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionBreakDownActivity transactionBreakDownActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        TransactionBreakDownPresenter $r4 = (TransactionBreakDownPresenter) $r2;
        injectThisPresenter(transactionBreakDownActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionBreakDownActivity $r2 = (TransactionBreakDownActivity) obj;
        injectMembers($r2);
    }
}
