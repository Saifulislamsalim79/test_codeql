package ai.kudi.agent.banks.domain;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BanksRepository_Factory implements InterfaceC9468d<BanksRepository> {
    private final InterfaceC11700a<BanksLocalSource> banksLocalSourceProvider;
    private final InterfaceC11700a<BanksRemoteSource> banksRemoteSourceProvider;

    public BanksRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.banksLocalSourceProvider = interfaceC11700a;
        this.banksRemoteSourceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BanksRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BanksRepository_Factory $r2 = new BanksRepository_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BanksRepository newInstance(BanksLocalSource banksLocalSource, BanksRemoteSource banksRemoteSource) {
        BanksRepository $r2 = new BanksRepository(banksLocalSource, banksRemoteSource);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BanksRepository multiply() {
        InterfaceC11700a $r1 = this.banksLocalSourceProvider;
        Object $r2 = $r1.get();
        BanksLocalSource $r3 = (BanksLocalSource) $r2;
        InterfaceC11700a $r12 = this.banksRemoteSourceProvider;
        Object $r22 = $r12.get();
        BanksRemoteSource $r4 = (BanksRemoteSource) $r22;
        BanksRepository $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39007multiply() {
        BanksRepository $r1 = multiply();
        return $r1;
    }
}
