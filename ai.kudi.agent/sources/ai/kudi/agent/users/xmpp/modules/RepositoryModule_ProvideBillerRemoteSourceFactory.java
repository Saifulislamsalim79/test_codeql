package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl;
import com.google.firebase.database.C5615f;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvideBillerRemoteSourceFactory implements InterfaceC9468d<RemoteBillerRepositoryImpl> {
    private final InterfaceC11700a<C5615f> firebaseDatabaseProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideBillerRemoteSourceFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a) {
        this.module = repositoryModule;
        this.firebaseDatabaseProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvideBillerRemoteSourceFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a) {
        RepositoryModule_ProvideBillerRemoteSourceFactory $r2 = new RepositoryModule_ProvideBillerRemoteSourceFactory(repositoryModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RemoteBillerRepositoryImpl provideBillerRemoteSource(RepositoryModule repositoryModule, C5615f c5615f) {
        RemoteBillerRepositoryImpl $r1 = repositoryModule.provideBillerRemoteSource(c5615f);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public RemoteBillerRepositoryImpl m38160a() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.firebaseDatabaseProvider;
        Object $r3 = $r2.get();
        C5615f $r4 = (C5615f) $r3;
        RemoteBillerRepositoryImpl $r5 = provideBillerRemoteSource($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m38159a() {
        RemoteBillerRepositoryImpl $r1 = m38160a();
        return $r1;
    }
}
