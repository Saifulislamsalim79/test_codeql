package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.PhoneAndBvnViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.PhoneFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PhoneFragment_MembersInjector implements InterfaceC9463a<PhoneFragment> {
    private final InterfaceC11700a<SharedPreferences> sharedPrefsProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<PhoneAndBvnViewModel> vmProvider;

    public PhoneFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.sharedPrefsProvider = interfaceC11700a;
        this.vmProvider = interfaceC11700a2;
        this.smartLookAnalyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        PhoneFragment_MembersInjector $r3 = new PhoneFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectSharedPrefs(PhoneFragment phoneFragment, SharedPreferences sharedPreferences) {
        phoneFragment.sharedPrefs = sharedPreferences;
    }

    public static void injectSmartLookAnalytics(PhoneFragment phoneFragment, SmartLookAnalytics smartLookAnalytics) {
        phoneFragment.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectVm(PhoneFragment phoneFragment, PhoneAndBvnViewModel phoneAndBvnViewModel) {
        phoneFragment.srv = phoneAndBvnViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PhoneFragment phoneFragment) {
        InterfaceC11700a $r2 = this.sharedPrefsProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        injectSharedPrefs(phoneFragment, $r4);
        InterfaceC11700a $r22 = this.vmProvider;
        Object $r32 = $r22.get();
        PhoneAndBvnViewModel $r5 = (PhoneAndBvnViewModel) $r32;
        injectVm(phoneFragment, $r5);
        InterfaceC11700a $r23 = this.smartLookAnalyticsProvider;
        Object $r33 = $r23.get();
        SmartLookAnalytics $r6 = (SmartLookAnalytics) $r33;
        injectSmartLookAnalytics(phoneFragment, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PhoneFragment $r2 = (PhoneFragment) obj;
        injectMembers($r2);
    }
}
