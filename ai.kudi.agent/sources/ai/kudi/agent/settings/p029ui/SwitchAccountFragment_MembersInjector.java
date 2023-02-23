package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.settings.p029ui.viewModels.SwitchAccountViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.ui.SwitchAccountFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SwitchAccountFragment_MembersInjector implements InterfaceC9463a<SwitchAccountFragment> {
    private final InterfaceC11700a<SwitchAccountViewModel> switchAccountViewModelProvider;

    public SwitchAccountFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.switchAccountViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SwitchAccountFragment_MembersInjector $r1 = new SwitchAccountFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSwitchAccountViewModel(SwitchAccountFragment switchAccountFragment, SwitchAccountViewModel switchAccountViewModel) {
        switchAccountFragment.switchAccountViewModel = switchAccountViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SwitchAccountFragment switchAccountFragment) {
        InterfaceC11700a $r3 = this.switchAccountViewModelProvider;
        Object $r2 = $r3.get();
        SwitchAccountViewModel $r4 = (SwitchAccountViewModel) $r2;
        injectSwitchAccountViewModel(switchAccountFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SwitchAccountFragment $r2 = (SwitchAccountFragment) obj;
        injectMembers($r2);
    }
}
