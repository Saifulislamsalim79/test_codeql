package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.product.repository.BillerRepository;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvideBillerLocalSourceFactory implements InterfaceC9468d<BillerRepository> {
    private final RepositoryModule module;
    private final InterfaceC11700a<CoreAppDatabase> roomDatabaseProvider;

    public RepositoryModule_ProvideBillerLocalSourceFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a) {
        this.module = repositoryModule;
        this.roomDatabaseProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvideBillerLocalSourceFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a) {
        RepositoryModule_ProvideBillerLocalSourceFactory $r2 = new RepositoryModule_ProvideBillerLocalSourceFactory(repositoryModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillerRepository provideBillerLocalSource(RepositoryModule repositoryModule, CoreAppDatabase coreAppDatabase) {
        BillerRepository $r1 = repositoryModule.provideBillerLocalSource(coreAppDatabase);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillerRepository remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.roomDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        BillerRepository $r5 = provideBillerLocalSource($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41485remainder() {
        BillerRepository $r1 = remainder();
        return $r1;
    }
}
