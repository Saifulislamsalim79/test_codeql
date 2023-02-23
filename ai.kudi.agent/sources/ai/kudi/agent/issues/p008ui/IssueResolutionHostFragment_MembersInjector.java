package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssueResolutionHostFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IssueResolutionHostFragment_MembersInjector implements InterfaceC9463a<IssueResolutionHostFragment> {
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;

    public IssueResolutionHostFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.androidInjectorProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        IssueResolutionHostFragment_MembersInjector $r2 = new IssueResolutionHostFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAndroidInjector(IssueResolutionHostFragment issueResolutionHostFragment, DispatchingAndroidInjector dispatchingAndroidInjector) {
        issueResolutionHostFragment.androidInjector = dispatchingAndroidInjector;
    }

    public static void injectSmartLookAnalytics(IssueResolutionHostFragment issueResolutionHostFragment, SmartLookAnalytics smartLookAnalytics) {
        issueResolutionHostFragment.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssueResolutionHostFragment issueResolutionHostFragment) {
        InterfaceC11700a $r2 = this.androidInjectorProvider;
        Object $r3 = $r2.get();
        DispatchingAndroidInjector $r4 = (DispatchingAndroidInjector) $r3;
        injectAndroidInjector(issueResolutionHostFragment, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(issueResolutionHostFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssueResolutionHostFragment $r2 = (IssueResolutionHostFragment) obj;
        injectMembers($r2);
    }
}
