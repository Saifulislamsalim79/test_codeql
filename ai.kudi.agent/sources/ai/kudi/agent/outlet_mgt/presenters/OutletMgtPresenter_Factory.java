package ai.kudi.agent.outlet_mgt.presenters;

import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtPresenter_Factory implements InterfaceC9468d<OutletMgtPresenter> {
    private final InterfaceC11700a<BaseOtpUtil> baseOtpUtilProvider;
    private final InterfaceC11700a<OutletMgtNavigator> outletMgtNavigatorProvider;

    public OutletMgtPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.baseOtpUtilProvider = interfaceC11700a;
        this.outletMgtNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OutletMgtPresenter_Factory $r2 = new OutletMgtPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtPresenter newInstance(BaseOtpUtil baseOtpUtil, OutletMgtNavigator outletMgtNavigator) {
        OutletMgtPresenter $r2 = new OutletMgtPresenter(baseOtpUtil, outletMgtNavigator);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletMgtPresenter multiply() {
        InterfaceC11700a $r1 = this.baseOtpUtilProvider;
        Object $r2 = $r1.get();
        BaseOtpUtil $r3 = (BaseOtpUtil) $r2;
        InterfaceC11700a $r12 = this.outletMgtNavigatorProvider;
        Object $r22 = $r12.get();
        OutletMgtNavigator $r4 = (OutletMgtNavigator) $r22;
        OutletMgtPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39892multiply() {
        OutletMgtPresenter $r1 = multiply();
        return $r1;
    }
}
