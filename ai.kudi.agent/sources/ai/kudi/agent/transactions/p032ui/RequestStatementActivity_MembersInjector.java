package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.transactions.presenters.RequestStatementPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.RequestStatementActivity_MembersInjector */
/* loaded from: classes.dex */
public final class RequestStatementActivity_MembersInjector implements InterfaceC9463a<RequestStatementActivity> {
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;
    private final InterfaceC11700a<RequestStatementPresenter> thisPresenterProvider;

    public RequestStatementActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RequestStatementActivity_MembersInjector $r2 = new RequestStatementActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSmartLookAnalytics(RequestStatementActivity requestStatementActivity, SmartLookAnalytics smartLookAnalytics) {
        requestStatementActivity.smartLookAnalytics = smartLookAnalytics;
    }

    public static void injectThisPresenter(RequestStatementActivity requestStatementActivity, RequestStatementPresenter requestStatementPresenter) {
        requestStatementActivity.thisPresenter = requestStatementPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(RequestStatementActivity requestStatementActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        RequestStatementPresenter $r4 = (RequestStatementPresenter) $r3;
        injectThisPresenter(requestStatementActivity, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(requestStatementActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        RequestStatementActivity $r2 = (RequestStatementActivity) obj;
        injectMembers($r2);
    }
}
