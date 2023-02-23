package ai.kudi.agent.core.internal.modules;

import com.google.firebase.database.C5615f;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFirebaseDbFactory implements InterfaceC9468d<C5615f> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFirebaseDbFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvidesFirebaseDbFactory create(ApplicationModule applicationModule) {
        ApplicationModule_ProvidesFirebaseDbFactory $r1 = new ApplicationModule_ProvidesFirebaseDbFactory(applicationModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C5615f providesFirebaseDb(ApplicationModule applicationModule) {
        C5615f $r0 = applicationModule.providesFirebaseDb();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public C5615f m38947f() {
        ApplicationModule $r2 = this.module;
        C5615f $r1 = providesFirebaseDb($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object m38946f() {
        C5615f $r1 = m38947f();
        return $r1;
    }
}
