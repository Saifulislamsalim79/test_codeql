package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.DelayedKTAViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.DelayedKTAtopUpFragment_MembersInjector */
/* loaded from: classes.dex */
public final class DelayedKTAtopUpFragment_MembersInjector implements InterfaceC9463a<DelayedKTAtopUpFragment> {
    private final InterfaceC11700a<DelayedKTAViewModel> delayedKTAViewModelProvider;

    public DelayedKTAtopUpFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.delayedKTAViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        DelayedKTAtopUpFragment_MembersInjector $r1 = new DelayedKTAtopUpFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectDelayedKTAViewModel(DelayedKTAtopUpFragment delayedKTAtopUpFragment, DelayedKTAViewModel delayedKTAViewModel) {
        delayedKTAtopUpFragment.delayedKTAViewModel = delayedKTAViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(DelayedKTAtopUpFragment delayedKTAtopUpFragment) {
        InterfaceC11700a $r3 = this.delayedKTAViewModelProvider;
        Object $r2 = $r3.get();
        DelayedKTAViewModel $r4 = (DelayedKTAViewModel) $r2;
        injectDelayedKTAViewModel(delayedKTAtopUpFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        DelayedKTAtopUpFragment $r2 = (DelayedKTAtopUpFragment) obj;
        injectMembers($r2);
    }
}
