package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.outlet_mgt.useCases.SubmitLinkingRequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletLinkingFormViewModel_Factory implements InterfaceC9468d<OutletLinkingFormViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<SubmitLinkingRequest> submitLinkingRequestProvider;

    public OutletLinkingFormViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.submitLinkingRequestProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletLinkingFormViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        OutletLinkingFormViewModel_Factory $r3 = new OutletLinkingFormViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletLinkingFormViewModel newInstance(SubmitLinkingRequest submitLinkingRequest, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        OutletLinkingFormViewModel $r3 = new OutletLinkingFormViewModel(submitLinkingRequest, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletLinkingFormViewModel multiply() {
        InterfaceC11700a $r1 = this.submitLinkingRequestProvider;
        Object $r2 = $r1.get();
        SubmitLinkingRequest $r3 = (SubmitLinkingRequest) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        OutletLinkingFormViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39944multiply() {
        OutletLinkingFormViewModel $r1 = multiply();
        return $r1;
    }
}
