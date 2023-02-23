package ai.kudi.agent.wallettopup;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.wallettopup.presenters.WalletTopupPresenter;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class WalletTopUpActivity_MembersInjector implements InterfaceC9463a<WalletTopUpActivity> {
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<WalletTopupPresenter> walletTopupPresenterProvider;

    public WalletTopUpActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.walletTopupPresenterProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
        this.smartLookAnalyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        WalletTopUpActivity_MembersInjector $r3 = new WalletTopUpActivity_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectSharedPreferences(WalletTopUpActivity walletTopUpActivity, SharedPreferences sharedPreferences) {
        walletTopUpActivity.sharedPreferences = sharedPreferences;
    }

    public static void injectSmartLookAnalytics(WalletTopUpActivity walletTopUpActivity, SmartLookAnalytics smartLookAnalytics) {
        walletTopUpActivity.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectWalletTopupPresenter(WalletTopUpActivity walletTopUpActivity, WalletTopupPresenter walletTopupPresenter) {
        walletTopUpActivity.walletTopupPresenter = walletTopupPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(WalletTopUpActivity walletTopUpActivity) {
        InterfaceC11700a $r2 = this.walletTopupPresenterProvider;
        Object $r3 = $r2.get();
        WalletTopupPresenter $r4 = (WalletTopupPresenter) $r3;
        injectWalletTopupPresenter(walletTopUpActivity, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(walletTopUpActivity, $r5);
        InterfaceC11700a $r23 = this.smartLookAnalyticsProvider;
        Object $r33 = $r23.get();
        SmartLookAnalytics $r6 = (SmartLookAnalytics) $r33;
        injectSmartLookAnalytics(walletTopUpActivity, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        WalletTopUpActivity $r2 = (WalletTopUpActivity) obj;
        injectMembers($r2);
    }
}
