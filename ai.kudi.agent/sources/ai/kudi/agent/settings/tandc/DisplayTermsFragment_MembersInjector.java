package ai.kudi.agent.settings.tandc;

import ai.kudi.agent.settings.navigators.SettingsNavigator;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class DisplayTermsFragment_MembersInjector implements InterfaceC9463a<DisplayTermsFragment> {
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;

    public DisplayTermsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.settingsNavigatorProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        DisplayTermsFragment_MembersInjector $r1 = new DisplayTermsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSettingsNavigator(DisplayTermsFragment displayTermsFragment, SettingsNavigator settingsNavigator) {
        displayTermsFragment.settingsNavigator = settingsNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(DisplayTermsFragment displayTermsFragment) {
        InterfaceC11700a $r3 = this.settingsNavigatorProvider;
        Object $r2 = $r3.get();
        SettingsNavigator $r4 = (SettingsNavigator) $r2;
        injectSettingsNavigator(displayTermsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        DisplayTermsFragment $r2 = (DisplayTermsFragment) obj;
        injectMembers($r2);
    }
}
