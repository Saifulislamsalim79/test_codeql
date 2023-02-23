package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SubmitLinkingRequest_Factory implements InterfaceC9468d<SubmitLinkingRequest> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public SubmitLinkingRequest_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitLinkingRequest_Factory create(InterfaceC11700a interfaceC11700a) {
        SubmitLinkingRequest_Factory $r1 = new SubmitLinkingRequest_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SubmitLinkingRequest newInstance(NetworkService networkService) {
        SubmitLinkingRequest $r1 = new SubmitLinkingRequest(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitLinkingRequest multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        SubmitLinkingRequest $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39914multiply() {
        SubmitLinkingRequest $r1 = multiply();
        return $r1;
    }
}
