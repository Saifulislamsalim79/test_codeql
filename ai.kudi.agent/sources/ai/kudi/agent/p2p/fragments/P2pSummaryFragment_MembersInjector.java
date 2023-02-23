package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.p2p.viewmodels.P2pSummaryViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class P2pSummaryFragment_MembersInjector implements InterfaceC9463a<P2pSummaryFragment> {
    private final InterfaceC11700a<P2pSummaryViewModel> p2pSummaryViewModelProvider;

    public P2pSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.p2pSummaryViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        P2pSummaryFragment_MembersInjector $r1 = new P2pSummaryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectP2pSummaryViewModel(P2pSummaryFragment p2pSummaryFragment, P2pSummaryViewModel p2pSummaryViewModel) {
        p2pSummaryFragment.p2pSummaryViewModel = p2pSummaryViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(P2pSummaryFragment p2pSummaryFragment) {
        InterfaceC11700a $r3 = this.p2pSummaryViewModelProvider;
        Object $r2 = $r3.get();
        P2pSummaryViewModel $r4 = (P2pSummaryViewModel) $r2;
        injectP2pSummaryViewModel(p2pSummaryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        P2pSummaryFragment $r2 = (P2pSummaryFragment) obj;
        injectMembers($r2);
    }
}
