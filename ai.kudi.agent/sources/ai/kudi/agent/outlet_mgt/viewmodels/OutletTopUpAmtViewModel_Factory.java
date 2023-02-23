package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.outlet_mgt.useCases.PerformOutletTopUp;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletTopUpAmtViewModel_Factory implements InterfaceC9468d<OutletTopUpAmtViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<PerformOutletTopUp> performOutletTopUpProvider;

    public OutletTopUpAmtViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.performOutletTopUpProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletTopUpAmtViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OutletTopUpAmtViewModel_Factory $r2 = new OutletTopUpAmtViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletTopUpAmtViewModel newInstance(PerformOutletTopUp performOutletTopUp, FetchCurrentUser fetchCurrentUser) {
        OutletTopUpAmtViewModel $r2 = new OutletTopUpAmtViewModel(performOutletTopUp, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletTopUpAmtViewModel multiply() {
        InterfaceC11700a $r1 = this.performOutletTopUpProvider;
        Object $r2 = $r1.get();
        PerformOutletTopUp $r3 = (PerformOutletTopUp) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        OutletTopUpAmtViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39967multiply() {
        OutletTopUpAmtViewModel $r1 = multiply();
        return $r1;
    }
}
