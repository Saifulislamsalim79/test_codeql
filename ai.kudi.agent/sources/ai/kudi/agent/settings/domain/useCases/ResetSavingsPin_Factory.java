package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ResetSavingsPin_Factory implements InterfaceC9468d<ResetSavingsPin> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<NetworkService> networkServiceProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public ResetSavingsPin_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
        this.networkServiceProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResetSavingsPin_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        ResetSavingsPin_Factory $r3 = new ResetSavingsPin_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResetSavingsPin newInstance(FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers, NetworkService networkService) {
        ResetSavingsPin $r3 = new ResetSavingsPin(fetchCurrentUser, rxSchedulers, networkService);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ResetSavingsPin multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        InterfaceC11700a $r13 = this.networkServiceProvider;
        Object $r23 = $r13.get();
        NetworkService $r5 = (NetworkService) $r23;
        ResetSavingsPin $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40767multiply() {
        ResetSavingsPin $r1 = multiply();
        return $r1;
    }
}
