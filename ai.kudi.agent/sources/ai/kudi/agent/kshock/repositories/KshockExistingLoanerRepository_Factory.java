package ai.kudi.agent.kshock.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KshockExistingLoanerRepository_Factory implements InterfaceC9468d<KshockExistingLoanerRepository> {
    private final InterfaceC11700a<CoreAppDatabase> coreAppDatabaseProvider;
    private final InterfaceC11700a<KshockApi> kshockApiProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public KshockExistingLoanerRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.kshockApiProvider = interfaceC11700a;
        this.coreAppDatabaseProvider = interfaceC11700a2;
        this.rxSchedulersProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockExistingLoanerRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        KshockExistingLoanerRepository_Factory $r3 = new KshockExistingLoanerRepository_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockExistingLoanerRepository newInstance(ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi, CoreAppDatabase coreAppDatabase, RxSchedulers rxSchedulers) {
        KshockExistingLoanerRepository $r3 = new KshockExistingLoanerRepository(kshockApi, coreAppDatabase, rxSchedulers);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KshockExistingLoanerRepository multiply() {
        InterfaceC11700a $r1 = this.kshockApiProvider;
        Object $r2 = $r1.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r2;
        InterfaceC11700a $r12 = this.coreAppDatabaseProvider;
        Object $r22 = $r12.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r22;
        InterfaceC11700a $r13 = this.rxSchedulersProvider;
        Object $r23 = $r13.get();
        RxSchedulers $r5 = (RxSchedulers) $r23;
        KshockExistingLoanerRepository $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39627multiply() {
        KshockExistingLoanerRepository $r1 = multiply();
        return $r1;
    }
}
