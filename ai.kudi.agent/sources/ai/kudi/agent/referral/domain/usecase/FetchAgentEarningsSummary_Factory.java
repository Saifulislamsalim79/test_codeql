package ai.kudi.agent.referral.domain.usecase;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchAgentEarningsSummary_Factory implements InterfaceC9468d<FetchAgentEarningsSummary> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public FetchAgentEarningsSummary_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchAgentEarningsSummary_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchAgentEarningsSummary_Factory $r1 = new FetchAgentEarningsSummary_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchAgentEarningsSummary newInstance(NetworkService networkService) {
        FetchAgentEarningsSummary $r1 = new FetchAgentEarningsSummary(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchAgentEarningsSummary multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        FetchAgentEarningsSummary $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40244multiply() {
        FetchAgentEarningsSummary $r1 = multiply();
        return $r1;
    }
}
