package ai.kudi.agent.outlet_mgt.activities;

import ai.kudi.agent.outlet_mgt.presenters.OutletMgtPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtActivity_MembersInjector implements InterfaceC9463a<OutletMgtActivity> {
    private final InterfaceC11700a<OutletMgtPresenter> screenPresenterProvider;

    public OutletMgtActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletMgtActivity_MembersInjector $r1 = new OutletMgtActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenPresenter(OutletMgtActivity outletMgtActivity, OutletMgtPresenter outletMgtPresenter) {
        outletMgtActivity.screenPresenter = outletMgtPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletMgtActivity outletMgtActivity) {
        InterfaceC11700a $r3 = this.screenPresenterProvider;
        Object $r2 = $r3.get();
        OutletMgtPresenter $r4 = (OutletMgtPresenter) $r2;
        injectScreenPresenter(outletMgtActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletMgtActivity $r2 = (OutletMgtActivity) obj;
        injectMembers($r2);
    }
}
