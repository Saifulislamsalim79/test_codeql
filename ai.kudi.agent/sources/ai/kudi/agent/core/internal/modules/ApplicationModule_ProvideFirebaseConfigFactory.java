package ai.kudi.agent.core.internal.modules;

import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvideFirebaseConfigFactory implements InterfaceC9468d<k> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFirebaseConfigFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvideFirebaseConfigFactory create(ApplicationModule applicationModule) {
        ApplicationModule_ProvideFirebaseConfigFactory $r1 = new ApplicationModule_ProvideFirebaseConfigFactory(applicationModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Frame provideFirebaseConfig(ApplicationModule applicationModule) {
        Frame $r0 = applicationModule.provideFirebaseConfig();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Frame cbrt() {
        ApplicationModule $r2 = this.module;
        Frame $r1 = provideFirebaseConfig($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39139cbrt() {
        Frame $r1 = cbrt();
        return $r1;
    }
}
