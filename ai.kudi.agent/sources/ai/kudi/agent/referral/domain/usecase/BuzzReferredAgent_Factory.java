package ai.kudi.agent.referral.domain.usecase;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BuzzReferredAgent_Factory implements InterfaceC9468d<BuzzReferredAgent> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public BuzzReferredAgent_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.networkServiceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BuzzReferredAgent_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BuzzReferredAgent_Factory $r2 = new BuzzReferredAgent_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BuzzReferredAgent newInstance(FetchCurrentUser fetchCurrentUser, NetworkService networkService) {
        BuzzReferredAgent $r2 = new BuzzReferredAgent(fetchCurrentUser, networkService);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BuzzReferredAgent multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.networkServiceProvider;
        Object $r22 = $r12.get();
        NetworkService $r4 = (NetworkService) $r22;
        BuzzReferredAgent $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40240multiply() {
        BuzzReferredAgent $r1 = multiply();
        return $r1;
    }
}
