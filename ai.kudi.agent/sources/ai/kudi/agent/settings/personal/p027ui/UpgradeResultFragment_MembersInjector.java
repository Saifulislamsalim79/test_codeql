package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.settings.personal.p027ui.viewModels.UpgradeViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.UpgradeResultFragment_MembersInjector */
/* loaded from: classes.dex */
public final class UpgradeResultFragment_MembersInjector implements InterfaceC9463a<UpgradeResultFragment> {
    private final InterfaceC11700a<UpgradeViewModel> upgradeViewModelProvider;

    public UpgradeResultFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.upgradeViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UpgradeResultFragment_MembersInjector $r1 = new UpgradeResultFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectUpgradeViewModel(UpgradeResultFragment upgradeResultFragment, UpgradeViewModel upgradeViewModel) {
        upgradeResultFragment.upgradeViewModel = upgradeViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UpgradeResultFragment upgradeResultFragment) {
        InterfaceC11700a $r3 = this.upgradeViewModelProvider;
        Object $r2 = $r3.get();
        UpgradeViewModel $r4 = (UpgradeViewModel) $r2;
        injectUpgradeViewModel(upgradeResultFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UpgradeResultFragment $r2 = (UpgradeResultFragment) obj;
        injectMembers($r2);
    }
}
