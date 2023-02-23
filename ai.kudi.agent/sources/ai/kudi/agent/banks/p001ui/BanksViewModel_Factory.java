package ai.kudi.agent.banks.p001ui;

import ai.kudi.agent.banks.useCases.FetchBanks;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.banks.ui.BanksViewModel_Factory */
/* loaded from: classes.dex */
public final class BanksViewModel_Factory implements InterfaceC9468d<BanksViewModel> {
    private final InterfaceC11700a<FetchBanks> fetchBanksProvider;

    public BanksViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.fetchBanksProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BanksViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        BanksViewModel_Factory $r1 = new BanksViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BanksViewModel newInstance(FetchBanks fetchBanks) {
        BanksViewModel $r1 = new BanksViewModel(fetchBanks);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BanksViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchBanksProvider;
        Object $r2 = $r1.get();
        FetchBanks $r3 = (FetchBanks) $r2;
        BanksViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39013multiply() {
        BanksViewModel $r1 = multiply();
        return $r1;
    }
}
