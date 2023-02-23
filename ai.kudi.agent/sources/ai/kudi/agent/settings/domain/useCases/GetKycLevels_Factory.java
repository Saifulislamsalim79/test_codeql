package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.settings.domain.repositories.KycLevelRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class GetKycLevels_Factory implements InterfaceC9468d<GetKycLevels> {
    private final InterfaceC11700a<KycLevelRepository> kycLevelRepositoryProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public GetKycLevels_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.kycLevelRepositoryProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetKycLevels_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        GetKycLevels_Factory $r2 = new GetKycLevels_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetKycLevels newInstance(KycLevelRepository kycLevelRepository, RxSchedulers rxSchedulers) {
        GetKycLevels $r2 = new GetKycLevels(kycLevelRepository, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GetKycLevels multiply() {
        InterfaceC11700a $r1 = this.kycLevelRepositoryProvider;
        Object $r2 = $r1.get();
        KycLevelRepository $r3 = (KycLevelRepository) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        GetKycLevels $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40753multiply() {
        GetKycLevels $r1 = multiply();
        return $r1;
    }
}
