package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.outlet_mgt.useCases.BuzzPendingOutlet;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletLinkingBuzzAgentViewModel_Factory implements InterfaceC9468d<OutletLinkingBuzzAgentViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<BuzzPendingOutlet> buzzPendingOutletProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public OutletLinkingBuzzAgentViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.buzzPendingOutletProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletLinkingBuzzAgentViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        OutletLinkingBuzzAgentViewModel_Factory $r3 = new OutletLinkingBuzzAgentViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletLinkingBuzzAgentViewModel newInstance(BuzzPendingOutlet buzzPendingOutlet, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        OutletLinkingBuzzAgentViewModel $r3 = new OutletLinkingBuzzAgentViewModel(buzzPendingOutlet, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletLinkingBuzzAgentViewModel multiply() {
        InterfaceC11700a $r1 = this.buzzPendingOutletProvider;
        Object $r2 = $r1.get();
        BuzzPendingOutlet $r3 = (BuzzPendingOutlet) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        OutletLinkingBuzzAgentViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39940multiply() {
        OutletLinkingBuzzAgentViewModel $r1 = multiply();
        return $r1;
    }
}
