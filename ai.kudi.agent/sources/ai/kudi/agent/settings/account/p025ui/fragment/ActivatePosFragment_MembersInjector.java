package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.settings.account.p025ui.viewModel.ActivatePosViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.ActivatePosFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ActivatePosFragment_MembersInjector implements InterfaceC9463a<ActivatePosFragment> {
    private final InterfaceC11700a<ActivatePosViewModel> activatePosVmProvider;

    public ActivatePosFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.activatePosVmProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ActivatePosFragment_MembersInjector $r1 = new ActivatePosFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectActivatePosVm(ActivatePosFragment activatePosFragment, ActivatePosViewModel activatePosViewModel) {
        activatePosFragment.activatePosVm = activatePosViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ActivatePosFragment activatePosFragment) {
        InterfaceC11700a $r3 = this.activatePosVmProvider;
        Object $r2 = $r3.get();
        ActivatePosViewModel $r4 = (ActivatePosViewModel) $r2;
        injectActivatePosVm(activatePosFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ActivatePosFragment $r2 = (ActivatePosFragment) obj;
        injectMembers($r2);
    }
}
