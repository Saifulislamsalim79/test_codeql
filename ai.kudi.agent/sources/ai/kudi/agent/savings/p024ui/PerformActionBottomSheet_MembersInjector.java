package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.PerformActionBottomSheet_MembersInjector */
/* loaded from: classes.dex */
public final class PerformActionBottomSheet_MembersInjector implements InterfaceC9463a<PerformActionBottomSheet> {
    private final InterfaceC11700a<Analytics> analyticsProvider;

    public PerformActionBottomSheet_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.analyticsProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PerformActionBottomSheet_MembersInjector $r1 = new PerformActionBottomSheet_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAnalytics(PerformActionBottomSheet performActionBottomSheet, Analytics analytics) {
        performActionBottomSheet.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PerformActionBottomSheet performActionBottomSheet) {
        InterfaceC11700a $r3 = this.analyticsProvider;
        Object $r2 = $r3.get();
        Analytics $r4 = (Analytics) $r2;
        injectAnalytics(performActionBottomSheet, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PerformActionBottomSheet $r2 = (PerformActionBottomSheet) obj;
        injectMembers($r2);
    }
}
