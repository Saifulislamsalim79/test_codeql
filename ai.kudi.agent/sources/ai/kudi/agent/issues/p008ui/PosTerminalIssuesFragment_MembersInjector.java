package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.PosTerminalIssuesViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.PosTerminalIssuesFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PosTerminalIssuesFragment_MembersInjector implements InterfaceC9463a<PosTerminalIssuesFragment> {
    private final InterfaceC11700a<PosTerminalIssuesViewModel> posTerminalIssuesViewModelProvider;

    public PosTerminalIssuesFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.posTerminalIssuesViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PosTerminalIssuesFragment_MembersInjector $r1 = new PosTerminalIssuesFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectPosTerminalIssuesViewModel(PosTerminalIssuesFragment posTerminalIssuesFragment, PosTerminalIssuesViewModel posTerminalIssuesViewModel) {
        posTerminalIssuesFragment.posTerminalIssuesViewModel = posTerminalIssuesViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PosTerminalIssuesFragment posTerminalIssuesFragment) {
        InterfaceC11700a $r3 = this.posTerminalIssuesViewModelProvider;
        Object $r2 = $r3.get();
        PosTerminalIssuesViewModel $r4 = (PosTerminalIssuesViewModel) $r2;
        injectPosTerminalIssuesViewModel(posTerminalIssuesFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PosTerminalIssuesFragment $r2 = (PosTerminalIssuesFragment) obj;
        injectMembers($r2);
    }
}
