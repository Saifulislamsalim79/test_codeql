package ai.kudi.agent.product.repository;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class LocalBillerRepositoryImpl_Factory implements InterfaceC9468d<LocalBillerRepositoryImpl> {
    private final InterfaceC11700a<CoreAppDatabase> dbProvider;

    public LocalBillerRepositoryImpl_Factory(InterfaceC11700a interfaceC11700a) {
        this.dbProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LocalBillerRepositoryImpl_Factory create(InterfaceC11700a interfaceC11700a) {
        LocalBillerRepositoryImpl_Factory $r1 = new LocalBillerRepositoryImpl_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LocalBillerRepositoryImpl newInstance(CoreAppDatabase coreAppDatabase) {
        LocalBillerRepositoryImpl $r1 = new LocalBillerRepositoryImpl(coreAppDatabase);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LocalBillerRepositoryImpl multiply() {
        InterfaceC11700a $r1 = this.dbProvider;
        Object $r2 = $r1.get();
        CoreAppDatabase $r3 = (CoreAppDatabase) $r2;
        LocalBillerRepositoryImpl $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40232multiply() {
        LocalBillerRepositoryImpl $r1 = multiply();
        return $r1;
    }
}
