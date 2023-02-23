package ai.kudi.agent.core.analytics;

import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AnalyticsModule_ProvidesAnalyticsImplFactory implements InterfaceC9468d<Analytics> {
    private final InterfaceC11700a<Context> contextProvider;
    private final AnalyticsModule module;

    public AnalyticsModule_ProvidesAnalyticsImplFactory(AnalyticsModule analyticsModule, InterfaceC11700a interfaceC11700a) {
        this.module = analyticsModule;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AnalyticsModule_ProvidesAnalyticsImplFactory create(AnalyticsModule analyticsModule, InterfaceC11700a interfaceC11700a) {
        AnalyticsModule_ProvidesAnalyticsImplFactory $r2 = new AnalyticsModule_ProvidesAnalyticsImplFactory(analyticsModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Analytics providesAnalyticsImpl(AnalyticsModule analyticsModule, Context context) {
        Analytics $r1 = analyticsModule.providesAnalyticsImpl(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public Analytics get() {
        AnalyticsModule $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        Analytics $r5 = providesAnalyticsImpl($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public /* bridge */ /* synthetic */ Object get() {
        Analytics $r1 = get();
        return $r1;
    }
}
