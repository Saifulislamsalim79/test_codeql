package ai.kudi.agent.banks.domain;

import com.google.firebase.database.C5615f;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BanksRemoteSource_Factory implements InterfaceC9468d<BanksRemoteSource> {
    private final InterfaceC11700a<C5615f> firebaseDbProvider;

    public BanksRemoteSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.firebaseDbProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BanksRemoteSource_Factory create(InterfaceC11700a interfaceC11700a) {
        BanksRemoteSource_Factory $r1 = new BanksRemoteSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BanksRemoteSource newInstance(C5615f c5615f) {
        BanksRemoteSource $r1 = new BanksRemoteSource(c5615f);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BanksRemoteSource multiply() {
        InterfaceC11700a $r1 = this.firebaseDbProvider;
        Object $r2 = $r1.get();
        C5615f $r3 = (C5615f) $r2;
        BanksRemoteSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39004multiply() {
        BanksRemoteSource $r1 = multiply();
        return $r1;
    }
}
