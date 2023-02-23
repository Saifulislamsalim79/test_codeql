package ai.kudi.agent.transactionstatus.summary.p033ui;

import ai.kudi.agent.transactionstatus.summary.presenter.WithdrawalSummaryPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactionstatus.summary.ui.WithdrawalSummaryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class WithdrawalSummaryFragment_MembersInjector implements InterfaceC9463a<WithdrawalSummaryFragment> {
    private final InterfaceC11700a<WithdrawalSummaryPresenter> thisPresenterProvider;

    public WithdrawalSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        WithdrawalSummaryFragment_MembersInjector $r1 = new WithdrawalSummaryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(WithdrawalSummaryFragment withdrawalSummaryFragment, WithdrawalSummaryPresenter withdrawalSummaryPresenter) {
        withdrawalSummaryFragment.thisPresenter = withdrawalSummaryPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(WithdrawalSummaryFragment withdrawalSummaryFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        WithdrawalSummaryPresenter $r4 = (WithdrawalSummaryPresenter) $r2;
        injectThisPresenter(withdrawalSummaryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        WithdrawalSummaryFragment $r2 = (WithdrawalSummaryFragment) obj;
        injectMembers($r2);
    }
}
