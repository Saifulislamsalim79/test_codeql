package ai.kudi.agent.product.repository;

import com.google.firebase.database.C5615f;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RemoteBillerRepositoryImpl_Factory implements InterfaceC9468d<RemoteBillerRepositoryImpl> {
    private final InterfaceC11700a<C5615f> firebaseDatabaseProvider;

    public RemoteBillerRepositoryImpl_Factory(InterfaceC11700a interfaceC11700a) {
        this.firebaseDatabaseProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RemoteBillerRepositoryImpl_Factory create(InterfaceC11700a interfaceC11700a) {
        RemoteBillerRepositoryImpl_Factory $r1 = new RemoteBillerRepositoryImpl_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RemoteBillerRepositoryImpl newInstance(C5615f c5615f) {
        RemoteBillerRepositoryImpl $r1 = new RemoteBillerRepositoryImpl(c5615f);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RemoteBillerRepositoryImpl multiply() {
        InterfaceC11700a $r1 = this.firebaseDatabaseProvider;
        Object $r2 = $r1.get();
        C5615f $r3 = (C5615f) $r2;
        RemoteBillerRepositoryImpl $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40233multiply() {
        RemoteBillerRepositoryImpl $r1 = multiply();
        return $r1;
    }
}
