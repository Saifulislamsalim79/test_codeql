package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.analytics.Analytics;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.KYCformIssueFragment_MembersInjector */
/* loaded from: classes.dex */
public final class KYCformIssueFragment_MembersInjector implements InterfaceC9463a<KYCformIssueFragment> {
    private final InterfaceC11700a<Analytics> analyticsProvider;

    public KYCformIssueFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.analyticsProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        KYCformIssueFragment_MembersInjector $r1 = new KYCformIssueFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAnalytics(KYCformIssueFragment kYCformIssueFragment, Analytics analytics) {
        kYCformIssueFragment.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(KYCformIssueFragment kYCformIssueFragment) {
        InterfaceC11700a $r3 = this.analyticsProvider;
        Object $r2 = $r3.get();
        Analytics $r4 = (Analytics) $r2;
        injectAnalytics(kYCformIssueFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        KYCformIssueFragment $r2 = (KYCformIssueFragment) obj;
        injectMembers($r2);
    }
}
