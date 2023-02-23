package ai.kudi.agent.core.internal.modules;

import com.google.firebase.crashlytics.C5325g;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvideFirebaseCrashlyticsFactory implements InterfaceC9468d<C5325g> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFirebaseCrashlyticsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvideFirebaseCrashlyticsFactory create(ApplicationModule applicationModule) {
        ApplicationModule_ProvideFirebaseCrashlyticsFactory $r1 = new ApplicationModule_ProvideFirebaseCrashlyticsFactory(applicationModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C5325g provideFirebaseCrashlytics(ApplicationModule applicationModule) {
        C5325g $r0 = applicationModule.provideFirebaseCrashlytics();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C5325g cbrt() {
        ApplicationModule $r2 = this.module;
        C5325g $r1 = provideFirebaseCrashlytics($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39140cbrt() {
        C5325g $r1 = cbrt();
        return $r1;
    }
}
