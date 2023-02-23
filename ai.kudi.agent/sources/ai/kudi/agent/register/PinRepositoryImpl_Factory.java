package ai.kudi.agent.register;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PinRepositoryImpl_Factory implements InterfaceC9468d<PinRepositoryImpl> {
    private final InterfaceC11700a<CoreAppDatabase> roomDbProvider;

    public PinRepositoryImpl_Factory(InterfaceC11700a interfaceC11700a) {
        this.roomDbProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PinRepositoryImpl_Factory create(InterfaceC11700a interfaceC11700a) {
        PinRepositoryImpl_Factory $r1 = new PinRepositoryImpl_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PinRepositoryImpl newInstance(CoreAppDatabase coreAppDatabase) {
        PinRepositoryImpl $r1 = new PinRepositoryImpl(coreAppDatabase);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PinRepositoryImpl multiply() {
        InterfaceC11700a $r1 = this.roomDbProvider;
        Object $r2 = $r1.get();
        CoreAppDatabase $r3 = (CoreAppDatabase) $r2;
        PinRepositoryImpl $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40304multiply() {
        PinRepositoryImpl $r1 = multiply();
        return $r1;
    }
}
