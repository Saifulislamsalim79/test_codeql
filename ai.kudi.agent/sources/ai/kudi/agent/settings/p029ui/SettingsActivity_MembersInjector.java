package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.settings.p029ui.viewModels.SettingsDetailsViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.ui.SettingsActivity_MembersInjector */
/* loaded from: classes.dex */
public final class SettingsActivity_MembersInjector implements InterfaceC9463a<SettingsActivity> {
    private final InterfaceC11700a<SettingsDetailsViewModel> settingsDetailsViewModelProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;

    public SettingsActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.settingsDetailsViewModelProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
        this.sharedPreferencesProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        SettingsActivity_MembersInjector $r3 = new SettingsActivity_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectSettingsDetailsViewModel(SettingsActivity settingsActivity, SettingsDetailsViewModel settingsDetailsViewModel) {
        settingsActivity.settingsDetailsViewModel = settingsDetailsViewModel;
    }

    public static void injectSharedPreferences(SettingsActivity settingsActivity, SharedPreferences sharedPreferences) {
        settingsActivity.sharedPreferences = sharedPreferences;
    }

    public static void injectSmartLookAnalytics(SettingsActivity settingsActivity, SmartLookAnalytics smartLookAnalytics) {
        settingsActivity.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SettingsActivity settingsActivity) {
        InterfaceC11700a $r2 = this.settingsDetailsViewModelProvider;
        Object $r3 = $r2.get();
        SettingsDetailsViewModel $r4 = (SettingsDetailsViewModel) $r3;
        injectSettingsDetailsViewModel(settingsActivity, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(settingsActivity, $r5);
        InterfaceC11700a $r23 = this.sharedPreferencesProvider;
        Object $r33 = $r23.get();
        SharedPreferences $r6 = (SharedPreferences) $r33;
        injectSharedPreferences(settingsActivity, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SettingsActivity $r2 = (SettingsActivity) obj;
        injectMembers($r2);
    }
}
