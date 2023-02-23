package ai.kudi.agent.product.airtime_data.p017ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.product.airtime_data.presenter.AirtimeAndDataPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeTopUpFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AirtimeTopUpFragment_MembersInjector implements InterfaceC9463a<AirtimeTopUpFragment> {
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<AirtimeAndDataPresenter> thisPresenterProvider;

    public AirtimeTopUpFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        AirtimeTopUpFragment_MembersInjector $r2 = new AirtimeTopUpFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSmartLookAnalytics(AirtimeTopUpFragment airtimeTopUpFragment, SmartLookAnalytics smartLookAnalytics) {
        airtimeTopUpFragment.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectThisPresenter(AirtimeTopUpFragment airtimeTopUpFragment, AirtimeAndDataPresenter airtimeAndDataPresenter) {
        airtimeTopUpFragment.thisPresenter = airtimeAndDataPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AirtimeTopUpFragment airtimeTopUpFragment) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        AirtimeAndDataPresenter $r4 = (AirtimeAndDataPresenter) $r3;
        injectThisPresenter(airtimeTopUpFragment, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(airtimeTopUpFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AirtimeTopUpFragment $r2 = (AirtimeTopUpFragment) obj;
        injectMembers($r2);
    }
}
