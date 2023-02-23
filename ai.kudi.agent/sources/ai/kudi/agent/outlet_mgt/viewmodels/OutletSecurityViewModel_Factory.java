package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.outlet_mgt.useCases.ResetOutletPin;
import ai.kudi.agent.outlet_mgt.useCases.SuspendOutlet;
import ai.kudi.agent.outlet_mgt.useCases.UnsuspendOutlet;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletSecurityViewModel_Factory implements InterfaceC9468d<OutletSecurityViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<ResetOutletPin> resetOutletPinProvider;
    private final InterfaceC11700a<SuspendOutlet> suspendOutletProvider;
    private final InterfaceC11700a<UnsuspendOutlet> unsuspendOutletProvider;

    public OutletSecurityViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.suspendOutletProvider = interfaceC11700a;
        this.unsuspendOutletProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.resetOutletPinProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletSecurityViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        OutletSecurityViewModel_Factory $r5 = new OutletSecurityViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletSecurityViewModel newInstance(SuspendOutlet suspendOutlet, UnsuspendOutlet unsuspendOutlet, FetchCurrentUser fetchCurrentUser, ResetOutletPin resetOutletPin, Analytics analytics) {
        OutletSecurityViewModel $r5 = new OutletSecurityViewModel(suspendOutlet, unsuspendOutlet, fetchCurrentUser, resetOutletPin, analytics);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletSecurityViewModel multiply() {
        InterfaceC11700a $r1 = this.suspendOutletProvider;
        Object $r2 = $r1.get();
        SuspendOutlet $r3 = (SuspendOutlet) $r2;
        InterfaceC11700a $r12 = this.unsuspendOutletProvider;
        Object $r22 = $r12.get();
        UnsuspendOutlet $r4 = (UnsuspendOutlet) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.resetOutletPinProvider;
        Object $r24 = $r14.get();
        ResetOutletPin $r6 = (ResetOutletPin) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics $r7 = (Analytics) $r25;
        OutletSecurityViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39963multiply() {
        OutletSecurityViewModel $r1 = multiply();
        return $r1;
    }
}
