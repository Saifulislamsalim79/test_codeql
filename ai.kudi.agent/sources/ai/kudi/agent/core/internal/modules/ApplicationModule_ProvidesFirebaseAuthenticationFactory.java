package ai.kudi.agent.core.internal.modules;

import com.google.firebase.auth.FirebaseAuth;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFirebaseAuthenticationFactory implements InterfaceC9468d<FirebaseAuth> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFirebaseAuthenticationFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvidesFirebaseAuthenticationFactory create(ApplicationModule applicationModule) {
        ApplicationModule_ProvidesFirebaseAuthenticationFactory $r1 = new ApplicationModule_ProvidesFirebaseAuthenticationFactory(applicationModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FirebaseAuth providesFirebaseAuthentication(ApplicationModule applicationModule) {
        FirebaseAuth $r0 = applicationModule.providesFirebaseAuthentication();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FirebaseAuth cbrt() {
        ApplicationModule $r2 = this.module;
        FirebaseAuth $r1 = providesFirebaseAuthentication($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39143cbrt() {
        FirebaseAuth $r1 = cbrt();
        return $r1;
    }
}
