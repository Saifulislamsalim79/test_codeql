package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.security.p028ui.viewModels.SecurityViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.SecurityFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SecurityFragment_MembersInjector implements InterfaceC9463a<SecurityFragment> {
    private final InterfaceC11700a<SecurityViewModel> securityViewModelProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public SecurityFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.sharedPreferencesProvider = interfaceC11700a;
        this.settingsNavigatorProvider = interfaceC11700a2;
        this.securityViewModelProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SecurityFragment_MembersInjector $r3 = new SecurityFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectSecurityViewModel(SecurityFragment securityFragment, SecurityViewModel securityViewModel) {
        securityFragment.securityViewModel = securityViewModel;
    }

    public static void injectSettingsNavigator(SecurityFragment securityFragment, SettingsNavigator settingsNavigator) {
        securityFragment.settingsNavigator = settingsNavigator;
    }

    public static void injectSharedPreferences(SecurityFragment securityFragment, SharedPreferences sharedPreferences) {
        securityFragment.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SecurityFragment securityFragment) {
        InterfaceC11700a $r2 = this.sharedPreferencesProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        injectSharedPreferences(securityFragment, $r4);
        InterfaceC11700a $r22 = this.settingsNavigatorProvider;
        Object $r32 = $r22.get();
        SettingsNavigator $r5 = (SettingsNavigator) $r32;
        injectSettingsNavigator(securityFragment, $r5);
        InterfaceC11700a $r23 = this.securityViewModelProvider;
        Object $r33 = $r23.get();
        SecurityViewModel $r6 = (SecurityViewModel) $r33;
        injectSecurityViewModel(securityFragment, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SecurityFragment $r2 = (SecurityFragment) obj;
        injectMembers($r2);
    }
}
