package ai.kudi.agent.users.xmpp.modules;

import ai.kudi.agent.product.repository.BillerRepository;
import ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl;
import android.content.SharedPreferences;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RepositoryModule_ProvideBillerRepoFactory implements InterfaceC9468d<BillerRepository> {
    private final InterfaceC11700a<BillerRepository> localdbProvider;
    private final RepositoryModule module;
    private final InterfaceC11700a<RemoteBillerRepositoryImpl> remotedbProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public RepositoryModule_ProvideBillerRepoFactory(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.module = repositoryModule;
        this.localdbProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
        this.remotedbProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RepositoryModule_ProvideBillerRepoFactory create(RepositoryModule repositoryModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        RepositoryModule_ProvideBillerRepoFactory $r4 = new RepositoryModule_ProvideBillerRepoFactory(repositoryModule, interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillerRepository provideBillerRepo(RepositoryModule repositoryModule, BillerRepository billerRepository, SharedPreferences sharedPreferences, RemoteBillerRepositoryImpl remoteBillerRepositoryImpl) {
        BillerRepository $r0 = repositoryModule.provideBillerRepo(billerRepository, sharedPreferences, remoteBillerRepositoryImpl);
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillerRepository remainder() {
        RepositoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.localdbProvider;
        Object $r3 = $r2.get();
        BillerRepository $r4 = (BillerRepository) $r3;
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        InterfaceC11700a $r23 = this.remotedbProvider;
        Object $r33 = $r23.get();
        RemoteBillerRepositoryImpl $r6 = (RemoteBillerRepositoryImpl) $r33;
        return provideBillerRepo($r1, $r4, $r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41486remainder() {
        BillerRepository $r1 = remainder();
        return $r1;
    }
}
