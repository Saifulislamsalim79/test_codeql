package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.users.presenters.CashoutPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.users.ui.CashoutActivity_MembersInjector */
/* loaded from: classes.dex */
public final class CashoutActivity_MembersInjector implements InterfaceC9463a<CashoutActivity> {
    private final InterfaceC11700a<CashoutFeesDialog> feesDialogProvider;
    private final InterfaceC11700a<CashoutPresenter> thisPresenterProvider;

    public CashoutActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.feesDialogProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        CashoutActivity_MembersInjector $r2 = new CashoutActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectFeesDialog(CashoutActivity cashoutActivity, CashoutFeesDialog cashoutFeesDialog) {
        cashoutActivity.feesDialog = cashoutFeesDialog;
    }

    public static void injectThisPresenter(CashoutActivity cashoutActivity, CashoutPresenter cashoutPresenter) {
        cashoutActivity.thisPresenter = cashoutPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CashoutActivity cashoutActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        CashoutPresenter $r4 = (CashoutPresenter) $r3;
        injectThisPresenter(cashoutActivity, $r4);
        InterfaceC11700a $r22 = this.feesDialogProvider;
        Object $r32 = $r22.get();
        CashoutFeesDialog $r5 = (CashoutFeesDialog) $r32;
        injectFeesDialog(cashoutActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CashoutActivity $r2 = (CashoutActivity) obj;
        injectMembers($r2);
    }
}
