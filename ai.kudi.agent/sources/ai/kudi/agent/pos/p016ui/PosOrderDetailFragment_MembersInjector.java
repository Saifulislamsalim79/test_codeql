package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.presentation.PosOrderDetailViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.PosOrderDetailFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PosOrderDetailFragment_MembersInjector implements InterfaceC9463a<PosOrderDetailFragment> {
    private final InterfaceC11700a<PosOrderDetailViewModel> viewModelProvider;

    public PosOrderDetailFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PosOrderDetailFragment_MembersInjector $r1 = new PosOrderDetailFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(PosOrderDetailFragment posOrderDetailFragment, PosOrderDetailViewModel posOrderDetailViewModel) {
        posOrderDetailFragment.viewModel = posOrderDetailViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PosOrderDetailFragment posOrderDetailFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        PosOrderDetailViewModel $r4 = (PosOrderDetailViewModel) $r2;
        injectViewModel(posOrderDetailFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PosOrderDetailFragment $r2 = (PosOrderDetailFragment) obj;
        injectMembers($r2);
    }
}
