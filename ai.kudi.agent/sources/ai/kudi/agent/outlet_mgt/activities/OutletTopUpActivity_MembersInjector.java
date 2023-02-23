package ai.kudi.agent.outlet_mgt.activities;

import ai.kudi.agent.outlet_mgt.presenters.OutletTopUpPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletTopUpActivity_MembersInjector implements InterfaceC9463a<OutletTopUpActivity> {
    private final InterfaceC11700a<OutletTopUpPresenter> screenPresenterProvider;

    public OutletTopUpActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletTopUpActivity_MembersInjector $r1 = new OutletTopUpActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenPresenter(OutletTopUpActivity outletTopUpActivity, OutletTopUpPresenter outletTopUpPresenter) {
        outletTopUpActivity.screenPresenter = outletTopUpPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletTopUpActivity outletTopUpActivity) {
        InterfaceC11700a $r3 = this.screenPresenterProvider;
        Object $r2 = $r3.get();
        OutletTopUpPresenter $r4 = (OutletTopUpPresenter) $r2;
        injectScreenPresenter(outletTopUpActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletTopUpActivity $r2 = (OutletTopUpActivity) obj;
        injectMembers($r2);
    }
}
