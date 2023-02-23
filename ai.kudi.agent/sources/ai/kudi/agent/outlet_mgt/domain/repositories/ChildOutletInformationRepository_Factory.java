package ai.kudi.agent.outlet_mgt.domain.repositories;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ChildOutletInformationRepository_Factory implements InterfaceC9468d<ChildOutletInformationRepository> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchLocation> fetchLocationProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public ChildOutletInformationRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.fetchLocationProvider = interfaceC11700a2;
        this.networkServiceProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ChildOutletInformationRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ChildOutletInformationRepository_Factory $r3 = new ChildOutletInformationRepository_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ChildOutletInformationRepository newInstance(FetchCurrentUser fetchCurrentUser, FetchLocation fetchLocation, NetworkService networkService) {
        ChildOutletInformationRepository $r3 = new ChildOutletInformationRepository(fetchCurrentUser, fetchLocation, networkService);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ChildOutletInformationRepository multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchLocationProvider;
        Object $r22 = $r12.get();
        FetchLocation $r4 = (FetchLocation) $r22;
        InterfaceC11700a $r13 = this.networkServiceProvider;
        Object $r23 = $r13.get();
        NetworkService $r5 = (NetworkService) $r23;
        ChildOutletInformationRepository $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39870multiply() {
        ChildOutletInformationRepository $r1 = multiply();
        return $r1;
    }
}
