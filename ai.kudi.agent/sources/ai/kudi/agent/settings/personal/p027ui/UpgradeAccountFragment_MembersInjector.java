package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.settings.personal.p027ui.viewModels.UpgradeViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.UpgradeAccountFragment_MembersInjector */
/* loaded from: classes.dex */
public final class UpgradeAccountFragment_MembersInjector implements InterfaceC9463a<UpgradeAccountFragment> {
    private final InterfaceC11700a<SharedPreferences> sharedPrefProvider;
    private final InterfaceC11700a<UpgradeViewModel> upgradeViewModelProvider;

    public UpgradeAccountFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.upgradeViewModelProvider = interfaceC11700a;
        this.sharedPrefProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        UpgradeAccountFragment_MembersInjector $r2 = new UpgradeAccountFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSharedPref(UpgradeAccountFragment upgradeAccountFragment, SharedPreferences sharedPreferences) {
        upgradeAccountFragment.sharedPref = sharedPreferences;
    }

    public static void injectUpgradeViewModel(UpgradeAccountFragment upgradeAccountFragment, UpgradeViewModel upgradeViewModel) {
        upgradeAccountFragment.upgradeViewModel = upgradeViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UpgradeAccountFragment upgradeAccountFragment) {
        InterfaceC11700a $r2 = this.upgradeViewModelProvider;
        Object $r3 = $r2.get();
        UpgradeViewModel $r4 = (UpgradeViewModel) $r3;
        injectUpgradeViewModel(upgradeAccountFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPrefProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPref(upgradeAccountFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UpgradeAccountFragment $r2 = (UpgradeAccountFragment) obj;
        injectMembers($r2);
    }
}
