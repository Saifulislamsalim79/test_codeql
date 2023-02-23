package ai.kudi.agent.settings.dataSource;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KycLevelsLocalDataSource_Factory implements InterfaceC9468d<KycLevelsLocalDataSource> {
    private final InterfaceC11700a<CoreAppDatabase> coreAppDatabaseProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public KycLevelsLocalDataSource_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.coreAppDatabaseProvider = interfaceC11700a;
        this.rxSchedulersProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KycLevelsLocalDataSource_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        KycLevelsLocalDataSource_Factory $r2 = new KycLevelsLocalDataSource_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KycLevelsLocalDataSource newInstance(CoreAppDatabase coreAppDatabase, RxSchedulers rxSchedulers) {
        KycLevelsLocalDataSource $r2 = new KycLevelsLocalDataSource(coreAppDatabase, rxSchedulers);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KycLevelsLocalDataSource multiply() {
        InterfaceC11700a $r1 = this.coreAppDatabaseProvider;
        Object $r2 = $r1.get();
        CoreAppDatabase $r3 = (CoreAppDatabase) $r2;
        InterfaceC11700a $r12 = this.rxSchedulersProvider;
        Object $r22 = $r12.get();
        RxSchedulers $r4 = (RxSchedulers) $r22;
        KycLevelsLocalDataSource $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40722multiply() {
        KycLevelsLocalDataSource $r1 = multiply();
        return $r1;
    }
}
