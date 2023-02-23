package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.product.other_bills.presenter.AmountPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.product.other_bills.ui.AmountFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AmountFragment_MembersInjector implements InterfaceC9463a<AmountFragment> {
    private final InterfaceC11700a<AmountPresenter> thisPresenterProvider;

    public AmountFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AmountFragment_MembersInjector $r1 = new AmountFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(AmountFragment amountFragment, AmountPresenter amountPresenter) {
        amountFragment.thisPresenter = amountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AmountFragment amountFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        AmountPresenter $r4 = (AmountPresenter) $r2;
        injectThisPresenter(amountFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AmountFragment $r2 = (AmountFragment) obj;
        injectMembers($r2);
    }
}
