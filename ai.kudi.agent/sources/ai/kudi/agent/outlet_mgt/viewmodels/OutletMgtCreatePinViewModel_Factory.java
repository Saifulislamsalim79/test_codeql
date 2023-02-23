package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.outlet_mgt.useCases.CreateOutlet;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtCreatePinViewModel_Factory implements InterfaceC9468d<OutletMgtCreatePinViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CreateOutlet> createOutletProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<OutletMgtNavigator> outletMgtNavigatorProvider;

    public OutletMgtCreatePinViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.outletMgtNavigatorProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.createOutletProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtCreatePinViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        OutletMgtCreatePinViewModel_Factory $r4 = new OutletMgtCreatePinViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtCreatePinViewModel newInstance(OutletMgtNavigator outletMgtNavigator, FetchCurrentUser fetchCurrentUser, CreateOutlet createOutlet, Analytics analytics) {
        OutletMgtCreatePinViewModel $r4 = new OutletMgtCreatePinViewModel(outletMgtNavigator, fetchCurrentUser, createOutlet, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletMgtCreatePinViewModel multiply() {
        InterfaceC11700a $r1 = this.outletMgtNavigatorProvider;
        Object $r2 = $r1.get();
        OutletMgtNavigator $r3 = (OutletMgtNavigator) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.createOutletProvider;
        Object $r23 = $r13.get();
        CreateOutlet $r5 = (CreateOutlet) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        OutletMgtCreatePinViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39952multiply() {
        OutletMgtCreatePinViewModel $r1 = multiply();
        return $r1;
    }
}
