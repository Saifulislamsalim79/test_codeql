package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.transfer.presenter.MainTransferPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transfer.ui.TransferActivity_MembersInjector */
/* loaded from: classes.dex */
public final class TransferActivity_MembersInjector implements InterfaceC9463a<TransferActivity> {
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<MainTransferPresenter> thisPresenterProvider;

    public TransferActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransferActivity_MembersInjector $r2 = new TransferActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSmartLookAnalytics(TransferActivity transferActivity, SmartLookAnalytics smartLookAnalytics) {
        transferActivity.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectThisPresenter(TransferActivity transferActivity, MainTransferPresenter mainTransferPresenter) {
        transferActivity.thisPresenter = mainTransferPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransferActivity transferActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        MainTransferPresenter $r4 = (MainTransferPresenter) $r3;
        injectThisPresenter(transferActivity, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(transferActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransferActivity $r2 = (TransferActivity) obj;
        injectMembers($r2);
    }
}
