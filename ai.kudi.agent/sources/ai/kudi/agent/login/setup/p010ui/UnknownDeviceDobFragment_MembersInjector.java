package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.login.setup.viewModels.UnknownDeviceDobViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.setup.ui.UnknownDeviceDobFragment_MembersInjector */
/* loaded from: classes.dex */
public final class UnknownDeviceDobFragment_MembersInjector implements InterfaceC9463a<UnknownDeviceDobFragment> {
    private final InterfaceC11700a<UnknownDeviceDobViewModel> unknownDeviceDobViewModelProvider;

    public UnknownDeviceDobFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.unknownDeviceDobViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UnknownDeviceDobFragment_MembersInjector $r1 = new UnknownDeviceDobFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectUnknownDeviceDobViewModel(UnknownDeviceDobFragment unknownDeviceDobFragment, UnknownDeviceDobViewModel unknownDeviceDobViewModel) {
        unknownDeviceDobFragment.unknownDeviceDobViewModel = unknownDeviceDobViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UnknownDeviceDobFragment unknownDeviceDobFragment) {
        InterfaceC11700a $r3 = this.unknownDeviceDobViewModelProvider;
        Object $r2 = $r3.get();
        UnknownDeviceDobViewModel $r4 = (UnknownDeviceDobViewModel) $r2;
        injectUnknownDeviceDobViewModel(unknownDeviceDobFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UnknownDeviceDobFragment $r2 = (UnknownDeviceDobFragment) obj;
        injectMembers($r2);
    }
}
