package ai.kudi.agent.settings.domain.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class IdtypeRepository_Factory implements InterfaceC9468d<IdtypeRepository> {
    private final InterfaceC11700a<CoreAppDatabase> appRoomDatabaseProvider;

    public IdtypeRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.appRoomDatabaseProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IdtypeRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        IdtypeRepository_Factory $r1 = new IdtypeRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IdtypeRepository newInstance(CoreAppDatabase coreAppDatabase) {
        IdtypeRepository $r1 = new IdtypeRepository(coreAppDatabase);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IdtypeRepository multiply() {
        InterfaceC11700a $r1 = this.appRoomDatabaseProvider;
        Object $r2 = $r1.get();
        CoreAppDatabase $r3 = (CoreAppDatabase) $r2;
        IdtypeRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40733multiply() {
        IdtypeRepository $r1 = multiply();
        return $r1;
    }
}
