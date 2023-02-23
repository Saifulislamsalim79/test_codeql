package ai.kudi.agent.banks.domain;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BanksLocalSource_Factory implements InterfaceC9468d<BanksLocalSource> {
    private final InterfaceC11700a<CoreAppDatabase> appRoomDatabaseProvider;

    public BanksLocalSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.appRoomDatabaseProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BanksLocalSource_Factory create(InterfaceC11700a interfaceC11700a) {
        BanksLocalSource_Factory $r1 = new BanksLocalSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BanksLocalSource newInstance(CoreAppDatabase coreAppDatabase) {
        BanksLocalSource $r1 = new BanksLocalSource(coreAppDatabase);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BanksLocalSource multiply() {
        InterfaceC11700a $r1 = this.appRoomDatabaseProvider;
        Object $r2 = $r1.get();
        CoreAppDatabase $r3 = (CoreAppDatabase) $r2;
        BanksLocalSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39003multiply() {
        BanksLocalSource $r1 = multiply();
        return $r1;
    }
}
