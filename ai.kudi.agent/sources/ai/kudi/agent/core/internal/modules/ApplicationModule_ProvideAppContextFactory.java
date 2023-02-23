package ai.kudi.agent.core.internal.modules;

import android.app.Application;
import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAppContextFactory implements InterfaceC9468d<Context> {
    private final InterfaceC11700a<Application> applicationProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideAppContextFactory(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        this.module = applicationModule;
        this.applicationProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvideAppContextFactory create(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        ApplicationModule_ProvideAppContextFactory $r2 = new ApplicationModule_ProvideAppContextFactory(applicationModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Context provideAppContext(ApplicationModule applicationModule, Application application) {
        Context $r1 = applicationModule.provideAppContext(application);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public Context m38951f() {
        ApplicationModule $r1 = this.module;
        InterfaceC11700a $r2 = this.applicationProvider;
        Object $r3 = $r2.get();
        Application $r4 = (Application) $r3;
        Context $r5 = provideAppContext($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object m38950f() {
        Context $r1 = m38951f();
        return $r1;
    }
}
