package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.presentation.PosOrderHistoryViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.PosOrderHistoryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PosOrderHistoryFragment_MembersInjector implements InterfaceC9463a<PosOrderHistoryFragment> {
    private final InterfaceC11700a<PosOrderHistoryViewModel> viewModelProvider;

    public PosOrderHistoryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PosOrderHistoryFragment_MembersInjector $r1 = new PosOrderHistoryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(PosOrderHistoryFragment posOrderHistoryFragment, PosOrderHistoryViewModel posOrderHistoryViewModel) {
        posOrderHistoryFragment.viewModel = posOrderHistoryViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PosOrderHistoryFragment posOrderHistoryFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        PosOrderHistoryViewModel $r4 = (PosOrderHistoryViewModel) $r2;
        injectViewModel(posOrderHistoryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PosOrderHistoryFragment $r2 = (PosOrderHistoryFragment) obj;
        injectMembers($r2);
    }
}
