package ai.kudi.agent.withdraw_cash.p040ui.activities;

import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.activities.CashWithdrawalOptionActivity_MembersInjector */
/* loaded from: classes.dex */
public final class CashWithdrawalOptionActivity_MembersInjector implements InterfaceC9463a<CashWithdrawalOptionActivity> {
    private final InterfaceC11700a<CashWithdrawalOptionPresenter> thisPresenterProvider;

    public CashWithdrawalOptionActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        CashWithdrawalOptionActivity_MembersInjector $r1 = new CashWithdrawalOptionActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(CashWithdrawalOptionActivity cashWithdrawalOptionActivity, CashWithdrawalOptionPresenter cashWithdrawalOptionPresenter) {
        cashWithdrawalOptionActivity.thisPresenter = cashWithdrawalOptionPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CashWithdrawalOptionActivity cashWithdrawalOptionActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        CashWithdrawalOptionPresenter $r4 = (CashWithdrawalOptionPresenter) $r2;
        injectThisPresenter(cashWithdrawalOptionActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CashWithdrawalOptionActivity $r2 = (CashWithdrawalOptionActivity) obj;
        injectMembers($r2);
    }
}
