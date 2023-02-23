package ai.kudi.agent.banks.useCases;

import ai.kudi.agent.banks.domain.BanksRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchBanks_Factory implements InterfaceC9468d<FetchBanks> {
    private final InterfaceC11700a<BanksRepository> banksRepositoryProvider;

    public FetchBanks_Factory(InterfaceC11700a interfaceC11700a) {
        this.banksRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchBanks_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchBanks_Factory $r1 = new FetchBanks_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchBanks newInstance(BanksRepository banksRepository) {
        FetchBanks $r1 = new FetchBanks(banksRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchBanks multiply() {
        InterfaceC11700a $r1 = this.banksRepositoryProvider;
        Object $r2 = $r1.get();
        BanksRepository $r3 = (BanksRepository) $r2;
        FetchBanks $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39015multiply() {
        FetchBanks $r1 = multiply();
        return $r1;
    }
}
