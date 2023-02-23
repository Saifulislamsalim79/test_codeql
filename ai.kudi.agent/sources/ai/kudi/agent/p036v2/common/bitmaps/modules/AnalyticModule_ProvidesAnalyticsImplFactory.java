package ai.kudi.agent.p036v2.common.bitmaps.modules;

import ai.kudi.agent.core.analytics.Analytics;
import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.AnalyticModule_ProvidesAnalyticsImplFactory */
/* loaded from: classes.dex */
public final class AnalyticModule_ProvidesAnalyticsImplFactory implements InterfaceC9468d<Analytics> {
    private final InterfaceC11700a<Context> contextProvider;
    private final AnalyticModule module;

    public AnalyticModule_ProvidesAnalyticsImplFactory(AnalyticModule analyticModule, InterfaceC11700a interfaceC11700a) {
        this.module = analyticModule;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AnalyticModule_ProvidesAnalyticsImplFactory create(AnalyticModule analyticModule, InterfaceC11700a interfaceC11700a) {
        AnalyticModule_ProvidesAnalyticsImplFactory $r2 = new AnalyticModule_ProvidesAnalyticsImplFactory(analyticModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Analytics providesAnalyticsImpl(AnalyticModule analyticModule, Context context) {
        Analytics $r1 = analyticModule.providesAnalyticsImpl(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public Analytics get() {
        AnalyticModule $r1 = this.module;
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
