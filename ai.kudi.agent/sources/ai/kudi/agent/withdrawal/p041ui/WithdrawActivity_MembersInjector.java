package ai.kudi.agent.withdrawal.p041ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.withdrawal.presenter.MainWithdrawalPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdrawal.ui.WithdrawActivity_MembersInjector */
/* loaded from: classes.dex */
public final class WithdrawActivity_MembersInjector implements InterfaceC9463a<WithdrawActivity> {
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<MainWithdrawalPresenter> thisPresenterProvider;

    public WithdrawActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        WithdrawActivity_MembersInjector $r2 = new WithdrawActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSmartLookAnalytics(WithdrawActivity withdrawActivity, SmartLookAnalytics smartLookAnalytics) {
        withdrawActivity.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectThisPresenter(WithdrawActivity withdrawActivity, MainWithdrawalPresenter mainWithdrawalPresenter) {
        withdrawActivity.thisPresenter = mainWithdrawalPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(WithdrawActivity withdrawActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        MainWithdrawalPresenter $r4 = (MainWithdrawalPresenter) $r3;
        injectThisPresenter(withdrawActivity, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(withdrawActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        WithdrawActivity $r2 = (WithdrawActivity) obj;
        injectMembers($r2);
    }
}
