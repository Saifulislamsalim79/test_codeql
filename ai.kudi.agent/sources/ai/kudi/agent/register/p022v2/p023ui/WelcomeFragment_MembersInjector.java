package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.register.p022v2.p023ui.viewModels.WelcomeViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.WelcomeFragment_MembersInjector */
/* loaded from: classes.dex */
public final class WelcomeFragment_MembersInjector implements InterfaceC9463a<WelcomeFragment> {
    private final InterfaceC11700a<SharedPreferences> sharedPrefsProvider;
    private final InterfaceC11700a<WelcomeViewModel> vmProvider;

    public WelcomeFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.vmProvider = interfaceC11700a;
        this.sharedPrefsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        WelcomeFragment_MembersInjector $r2 = new WelcomeFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSharedPrefs(WelcomeFragment welcomeFragment, SharedPreferences sharedPreferences) {
        welcomeFragment.sharedPrefs = sharedPreferences;
    }

    public static void injectVm(WelcomeFragment welcomeFragment, WelcomeViewModel welcomeViewModel) {
        welcomeFragment.mSlideshow = welcomeViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(WelcomeFragment welcomeFragment) {
        InterfaceC11700a $r2 = this.vmProvider;
        Object $r3 = $r2.get();
        WelcomeViewModel $r4 = (WelcomeViewModel) $r3;
        injectVm(welcomeFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPrefsProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPrefs(welcomeFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        WelcomeFragment $r2 = (WelcomeFragment) obj;
        injectMembers($r2);
    }
}
