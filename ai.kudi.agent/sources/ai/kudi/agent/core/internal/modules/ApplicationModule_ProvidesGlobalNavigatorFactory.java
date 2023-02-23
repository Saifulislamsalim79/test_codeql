package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.navigation.GlobalNavigator;
import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesGlobalNavigatorFactory implements InterfaceC9468d<GlobalNavigator> {
    private final InterfaceC11700a<Context> contextProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesGlobalNavigatorFactory(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        this.module = applicationModule;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvidesGlobalNavigatorFactory create(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        ApplicationModule_ProvidesGlobalNavigatorFactory $r2 = new ApplicationModule_ProvidesGlobalNavigatorFactory(applicationModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GlobalNavigator providesGlobalNavigator(ApplicationModule applicationModule, Context context) {
        GlobalNavigator $r1 = applicationModule.providesGlobalNavigator(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public GlobalNavigator get() {
        ApplicationModule $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        GlobalNavigator $r5 = providesGlobalNavigator($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public /* bridge */ /* synthetic */ Object get() {
        GlobalNavigator $r1 = get();
        return $r1;
    }
}
