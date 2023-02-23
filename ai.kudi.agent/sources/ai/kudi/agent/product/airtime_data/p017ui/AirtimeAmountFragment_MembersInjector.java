package ai.kudi.agent.product.airtime_data.p017ui;

import ai.kudi.agent.product.airtime_data.presenter.AirtimeAndDataPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeAmountFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AirtimeAmountFragment_MembersInjector implements InterfaceC9463a<AirtimeAmountFragment> {
    private final InterfaceC11700a<AirtimeAndDataPresenter> thisPresenterProvider;

    public AirtimeAmountFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AirtimeAmountFragment_MembersInjector $r1 = new AirtimeAmountFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(AirtimeAmountFragment airtimeAmountFragment, AirtimeAndDataPresenter airtimeAndDataPresenter) {
        airtimeAmountFragment.thisPresenter = airtimeAndDataPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AirtimeAmountFragment airtimeAmountFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        AirtimeAndDataPresenter $r4 = (AirtimeAndDataPresenter) $r2;
        injectThisPresenter(airtimeAmountFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AirtimeAmountFragment $r2 = (AirtimeAmountFragment) obj;
        injectMembers($r2);
    }
}
