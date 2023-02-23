package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.PosActivity_MembersInjector */
/* loaded from: classes.dex */
public final class PosActivity_MembersInjector implements InterfaceC9463a<PosActivity> {
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;

    public PosActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.smartLookAnalyticsProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PosActivity_MembersInjector $r1 = new PosActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSmartLookAnalytics(PosActivity posActivity, SmartLookAnalytics smartLookAnalytics) {
        posActivity.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PosActivity posActivity) {
        InterfaceC11700a $r3 = this.smartLookAnalyticsProvider;
        Object $r2 = $r3.get();
        SmartLookAnalytics $r4 = (SmartLookAnalytics) $r2;
        injectSmartLookAnalytics(posActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PosActivity $r2 = (PosActivity) obj;
        injectMembers($r2);
    }
}
