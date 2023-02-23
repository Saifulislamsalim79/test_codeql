package ai.kudi.agent.banks.p001ui;

import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.banks.ui.BanksFragment_MembersInjector */
/* loaded from: classes.dex */
public final class BanksFragment_MembersInjector implements InterfaceC9463a<BanksFragment> {
    private final InterfaceC11700a<BanksViewModel> banksViewModelProvider;

    public BanksFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.banksViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        BanksFragment_MembersInjector $r1 = new BanksFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectBanksViewModel(BanksFragment banksFragment, BanksViewModel banksViewModel) {
        banksFragment.banksViewModel = banksViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BanksFragment banksFragment) {
        InterfaceC11700a $r3 = this.banksViewModelProvider;
        Object $r2 = $r3.get();
        BanksViewModel $r4 = (BanksViewModel) $r2;
        injectBanksViewModel(banksFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BanksFragment $r2 = (BanksFragment) obj;
        injectMembers($r2);
    }
}
