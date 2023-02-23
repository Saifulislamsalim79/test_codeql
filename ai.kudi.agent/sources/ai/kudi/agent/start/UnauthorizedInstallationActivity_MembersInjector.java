package ai.kudi.agent.start;

import ai.kudi.agent.core.analytics.Analytics;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UnauthorizedInstallationActivity_MembersInjector implements InterfaceC9463a<UnauthorizedInstallationActivity> {
    private final InterfaceC11700a<Analytics> analyticsImplProvider;

    public UnauthorizedInstallationActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.analyticsImplProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UnauthorizedInstallationActivity_MembersInjector $r1 = new UnauthorizedInstallationActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAnalyticsImpl(UnauthorizedInstallationActivity unauthorizedInstallationActivity, Analytics analytics) {
        unauthorizedInstallationActivity.analyticsImpl = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UnauthorizedInstallationActivity unauthorizedInstallationActivity) {
        InterfaceC11700a $r3 = this.analyticsImplProvider;
        Object $r2 = $r3.get();
        Analytics $r4 = (Analytics) $r2;
        injectAnalyticsImpl(unauthorizedInstallationActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UnauthorizedInstallationActivity $r2 = (UnauthorizedInstallationActivity) obj;
        injectMembers($r2);
    }
}
