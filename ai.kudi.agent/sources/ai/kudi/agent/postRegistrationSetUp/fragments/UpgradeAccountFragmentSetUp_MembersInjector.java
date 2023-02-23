package ai.kudi.agent.postRegistrationSetUp.fragments;

import ai.kudi.agent.settings.personal.p027ui.viewModels.PersonalViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UpgradeAccountFragmentSetUp_MembersInjector implements InterfaceC9463a<UpgradeAccountFragmentSetUp> {
    private final InterfaceC11700a<PersonalViewModel> personalViewModelProvider;

    public UpgradeAccountFragmentSetUp_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.personalViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UpgradeAccountFragmentSetUp_MembersInjector $r1 = new UpgradeAccountFragmentSetUp_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectPersonalViewModel(UpgradeAccountFragmentSetUp upgradeAccountFragmentSetUp, PersonalViewModel personalViewModel) {
        upgradeAccountFragmentSetUp.personalViewModel = personalViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UpgradeAccountFragmentSetUp upgradeAccountFragmentSetUp) {
        InterfaceC11700a $r3 = this.personalViewModelProvider;
        Object $r2 = $r3.get();
        PersonalViewModel $r4 = (PersonalViewModel) $r2;
        injectPersonalViewModel(upgradeAccountFragmentSetUp, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UpgradeAccountFragmentSetUp $r2 = (UpgradeAccountFragmentSetUp) obj;
        injectMembers($r2);
    }
}
