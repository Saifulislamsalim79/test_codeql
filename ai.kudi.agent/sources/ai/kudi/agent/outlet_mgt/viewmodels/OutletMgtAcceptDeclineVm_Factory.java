package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.outlet_mgt.useCases.AcceptOrDeclineLinkingRequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtAcceptDeclineVm_Factory implements InterfaceC9468d<OutletMgtAcceptDeclineVm> {
    private final InterfaceC11700a<AcceptOrDeclineLinkingRequest> acceptOrDeclineLinkingRequestProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public OutletMgtAcceptDeclineVm_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.acceptOrDeclineLinkingRequestProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtAcceptDeclineVm_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OutletMgtAcceptDeclineVm_Factory $r2 = new OutletMgtAcceptDeclineVm_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtAcceptDeclineVm newInstance(AcceptOrDeclineLinkingRequest acceptOrDeclineLinkingRequest, FetchCurrentUser fetchCurrentUser) {
        OutletMgtAcceptDeclineVm $r2 = new OutletMgtAcceptDeclineVm(acceptOrDeclineLinkingRequest, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletMgtAcceptDeclineVm multiply() {
        InterfaceC11700a $r1 = this.acceptOrDeclineLinkingRequestProvider;
        Object $r2 = $r1.get();
        AcceptOrDeclineLinkingRequest $r3 = (AcceptOrDeclineLinkingRequest) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        OutletMgtAcceptDeclineVm $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39948multiply() {
        OutletMgtAcceptDeclineVm $r1 = multiply();
        return $r1;
    }
}
