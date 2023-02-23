package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.personal.p027ui.viewModels.PersonalViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.PersonalFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PersonalFragment_MembersInjector implements InterfaceC9463a<PersonalFragment> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<PersonalViewModel> vmProvider;

    public PersonalFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.sharedPreferencesProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.vmProvider = interfaceC11700a3;
        this.settingsNavigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        PersonalFragment_MembersInjector $r4 = new PersonalFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    public static void injectAnalytics(PersonalFragment personalFragment, Analytics analytics) {
        personalFragment.analytics = analytics;
    }

    public static void injectSettingsNavigator(PersonalFragment personalFragment, SettingsNavigator settingsNavigator) {
        personalFragment.settingsNavigator = settingsNavigator;
    }

    public static void injectSharedPreferences(PersonalFragment personalFragment, SharedPreferences sharedPreferences) {
        personalFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectVm(PersonalFragment personalFragment, PersonalViewModel personalViewModel) {
        personalFragment.srv = personalViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PersonalFragment personalFragment) {
        InterfaceC11700a $r2 = this.sharedPreferencesProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        injectSharedPreferences(personalFragment, $r4);
        InterfaceC11700a $r22 = this.analyticsProvider;
        Object $r32 = $r22.get();
        Analytics $r5 = (Analytics) $r32;
        injectAnalytics(personalFragment, $r5);
        InterfaceC11700a $r23 = this.vmProvider;
        Object $r33 = $r23.get();
        PersonalViewModel $r6 = (PersonalViewModel) $r33;
        injectVm(personalFragment, $r6);
        InterfaceC11700a $r24 = this.settingsNavigatorProvider;
        Object $r34 = $r24.get();
        SettingsNavigator $r7 = (SettingsNavigator) $r34;
        injectSettingsNavigator(personalFragment, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PersonalFragment $r2 = (PersonalFragment) obj;
        injectMembers($r2);
    }
}
