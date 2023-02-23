package ai.kudi.agent.product.repository;

import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BillerRepositoryImpl_Factory implements InterfaceC9468d<BillerRepositoryImpl> {
    private final InterfaceC11700a<BillerRepository> localdbProvider;
    private final InterfaceC11700a<RemoteBillerRepositoryImpl> remotedbProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public BillerRepositoryImpl_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.localdbProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
        this.remotedbProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillerRepositoryImpl_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        BillerRepositoryImpl_Factory $r3 = new BillerRepositoryImpl_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BillerRepositoryImpl newInstance(BillerRepository billerRepository, SharedPreferences sharedPreferences, RemoteBillerRepositoryImpl remoteBillerRepositoryImpl) {
        BillerRepositoryImpl $r3 = new BillerRepositoryImpl(billerRepository, sharedPreferences, remoteBillerRepositoryImpl);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillerRepositoryImpl multiply() {
        InterfaceC11700a $r1 = this.localdbProvider;
        Object $r2 = $r1.get();
        BillerRepository $r3 = (BillerRepository) $r2;
        InterfaceC11700a $r12 = this.sharedPreferencesProvider;
        Object $r22 = $r12.get();
        SharedPreferences $r4 = (SharedPreferences) $r22;
        InterfaceC11700a $r13 = this.remotedbProvider;
        Object $r23 = $r13.get();
        RemoteBillerRepositoryImpl $r5 = (RemoteBillerRepositoryImpl) $r23;
        BillerRepositoryImpl $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40231multiply() {
        BillerRepositoryImpl $r1 = multiply();
        return $r1;
    }
}
