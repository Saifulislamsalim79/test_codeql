package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchCurrentUserBanks_Factory implements InterfaceC9468d<FetchCurrentUserBanks> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public FetchCurrentUserBanks_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchCurrentUserBanks_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchCurrentUserBanks_Factory $r1 = new FetchCurrentUserBanks_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchCurrentUserBanks newInstance(NetworkService networkService) {
        FetchCurrentUserBanks $r1 = new FetchCurrentUserBanks(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchCurrentUserBanks multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        FetchCurrentUserBanks $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40749multiply() {
        FetchCurrentUserBanks $r1 = multiply();
        return $r1;
    }
}
