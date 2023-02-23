package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.data.remote.CoreApiService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PerformServiceFeeLookup_Factory implements InterfaceC9468d<PerformServiceFeeLookup> {
    private final InterfaceC11700a<CoreApiService> coreApiServiceProvider;
    private final InterfaceC11700a<UserRepository> userRepoProvider;

    public PerformServiceFeeLookup_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.coreApiServiceProvider = interfaceC11700a;
        this.userRepoProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PerformServiceFeeLookup_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        PerformServiceFeeLookup_Factory $r2 = new PerformServiceFeeLookup_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PerformServiceFeeLookup newInstance(CoreApiService coreApiService, UserRepository userRepository) {
        PerformServiceFeeLookup $r2 = new PerformServiceFeeLookup(coreApiService, userRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PerformServiceFeeLookup multiply() {
        InterfaceC11700a $r1 = this.coreApiServiceProvider;
        Object $r2 = $r1.get();
        CoreApiService $r3 = (CoreApiService) $r2;
        InterfaceC11700a $r12 = this.userRepoProvider;
        Object $r22 = $r12.get();
        UserRepository $r4 = (UserRepository) $r22;
        PerformServiceFeeLookup $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39033multiply() {
        PerformServiceFeeLookup $r1 = multiply();
        return $r1;
    }
}
