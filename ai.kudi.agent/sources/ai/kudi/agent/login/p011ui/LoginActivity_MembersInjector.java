package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.login.presenters.LoginPresenter;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.ui.LoginActivity_MembersInjector */
/* loaded from: classes.dex */
public final class LoginActivity_MembersInjector implements InterfaceC9463a<LoginActivity> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<SharedPreferences> devicePrefsProvider;
    private final InterfaceC11700a<IPFSecurityUtils> facProvider;
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<k> remoteConfigProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPrefsProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<LoginPresenter> thisPresenterProvider;

    public LoginActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        this.thisPresenterProvider = interfaceC11700a;
        this.prefProvider = interfaceC11700a2;
        this.facProvider = interfaceC11700a3;
        this.sharedPrefsProvider = interfaceC11700a4;
        this.remoteConfigProvider = interfaceC11700a5;
        this.devicePrefsProvider = interfaceC11700a6;
        this.analyticsProvider = interfaceC11700a7;
        this.smartLookAnalyticsProvider = interfaceC11700a8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        LoginActivity_MembersInjector $r8 = new LoginActivity_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8);
        return $r8;
    }

    public static void injectAnalytics(LoginActivity loginActivity, Analytics analytics) {
        loginActivity.analytics = analytics;
    }

    public static void injectDevicePrefs(LoginActivity loginActivity, SharedPreferences sharedPreferences) {
        loginActivity.devicePrefs = sharedPreferences;
    }

    public static void injectFac(LoginActivity loginActivity, IPFSecurityUtils iPFSecurityUtils) {
        loginActivity.mProgressView = iPFSecurityUtils;
    }

    public static void injectPref(LoginActivity loginActivity, Pref pref) {
        loginActivity.pref = pref;
    }

    public static void injectRemoteConfig(LoginActivity loginActivity, Frame frame) {
        loginActivity.remoteConfig = frame;
    }

    public static void injectSharedPrefs(LoginActivity loginActivity, SharedPreferences sharedPreferences) {
        loginActivity.sharedPrefs = sharedPreferences;
    }

    public static void injectSmartLookAnalytics(LoginActivity loginActivity, SmartLookAnalytics smartLookAnalytics) {
        loginActivity.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectThisPresenter(LoginActivity loginActivity, LoginPresenter loginPresenter) {
        loginActivity.thisPresenter = loginPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(LoginActivity loginActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        LoginPresenter $r4 = (LoginPresenter) $r3;
        injectThisPresenter(loginActivity, $r4);
        InterfaceC11700a $r22 = this.prefProvider;
        Object $r32 = $r22.get();
        Pref $r5 = (Pref) $r32;
        injectPref(loginActivity, $r5);
        InterfaceC11700a $r23 = this.facProvider;
        Object $r33 = $r23.get();
        IPFSecurityUtils $r6 = (IPFSecurityUtils) $r33;
        injectFac(loginActivity, $r6);
        InterfaceC11700a $r24 = this.sharedPrefsProvider;
        Object $r34 = $r24.get();
        SharedPreferences $r7 = (SharedPreferences) $r34;
        injectSharedPrefs(loginActivity, $r7);
        InterfaceC11700a $r25 = this.remoteConfigProvider;
        Object $r35 = $r25.get();
        Frame $r8 = (Frame) $r35;
        injectRemoteConfig(loginActivity, $r8);
        InterfaceC11700a $r26 = this.devicePrefsProvider;
        Object $r36 = $r26.get();
        SharedPreferences $r72 = (SharedPreferences) $r36;
        injectDevicePrefs(loginActivity, $r72);
        InterfaceC11700a $r27 = this.analyticsProvider;
        Object $r37 = $r27.get();
        Analytics $r9 = (Analytics) $r37;
        injectAnalytics(loginActivity, $r9);
        InterfaceC11700a $r28 = this.smartLookAnalyticsProvider;
        Object $r38 = $r28.get();
        SmartLookAnalytics $r10 = (SmartLookAnalytics) $r38;
        injectSmartLookAnalytics(loginActivity, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        LoginActivity $r2 = (LoginActivity) obj;
        injectMembers($r2);
    }
}
