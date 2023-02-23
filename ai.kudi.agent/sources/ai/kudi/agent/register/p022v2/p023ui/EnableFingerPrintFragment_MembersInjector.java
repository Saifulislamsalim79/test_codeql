package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.EnableFingerPrintViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.EnableFingerPrintFragment_MembersInjector */
/* loaded from: classes.dex */
public final class EnableFingerPrintFragment_MembersInjector implements InterfaceC9463a<EnableFingerPrintFragment> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<EnableFingerPrintViewModel> vmProvider;

    public EnableFingerPrintFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.vmProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        EnableFingerPrintFragment_MembersInjector $r3 = new EnableFingerPrintFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectAnalytics(EnableFingerPrintFragment enableFingerPrintFragment, Analytics analytics) {
        enableFingerPrintFragment.analytics = analytics;
    }

    public static void injectSharedPreferences(EnableFingerPrintFragment enableFingerPrintFragment, SharedPreferences sharedPreferences) {
        enableFingerPrintFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectVm(EnableFingerPrintFragment enableFingerPrintFragment, EnableFingerPrintViewModel enableFingerPrintViewModel) {
        enableFingerPrintFragment.srv = enableFingerPrintViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(EnableFingerPrintFragment enableFingerPrintFragment) {
        InterfaceC11700a $r2 = this.vmProvider;
        Object $r3 = $r2.get();
        EnableFingerPrintViewModel $r4 = (EnableFingerPrintViewModel) $r3;
        injectVm(enableFingerPrintFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(enableFingerPrintFragment, $r5);
        InterfaceC11700a $r23 = this.analyticsProvider;
        Object $r33 = $r23.get();
        Analytics $r6 = (Analytics) $r33;
        injectAnalytics(enableFingerPrintFragment, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        EnableFingerPrintFragment $r2 = (EnableFingerPrintFragment) obj;
        injectMembers($r2);
    }
}
