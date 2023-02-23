package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.ManageOutletViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ManageOutletFragment_MembersInjector implements InterfaceC9463a<ManageOutletFragment> {
    private final InterfaceC11700a<ManageOutletViewModel> manageOutletViewModelProvider;

    public ManageOutletFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.manageOutletViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ManageOutletFragment_MembersInjector $r1 = new ManageOutletFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectManageOutletViewModel(ManageOutletFragment manageOutletFragment, ManageOutletViewModel manageOutletViewModel) {
        manageOutletFragment.manageOutletViewModel = manageOutletViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ManageOutletFragment manageOutletFragment) {
        InterfaceC11700a $r3 = this.manageOutletViewModelProvider;
        Object $r2 = $r3.get();
        ManageOutletViewModel $r4 = (ManageOutletViewModel) $r2;
        injectManageOutletViewModel(manageOutletFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ManageOutletFragment $r2 = (ManageOutletFragment) obj;
        injectMembers($r2);
    }
}
