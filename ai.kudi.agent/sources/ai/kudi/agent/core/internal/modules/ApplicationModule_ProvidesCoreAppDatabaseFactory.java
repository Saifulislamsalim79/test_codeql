package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesCoreAppDatabaseFactory implements InterfaceC9468d<CoreAppDatabase> {
    private final InterfaceC11700a<Context> contextProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCoreAppDatabaseFactory(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        this.module = applicationModule;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvidesCoreAppDatabaseFactory create(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        ApplicationModule_ProvidesCoreAppDatabaseFactory $r2 = new ApplicationModule_ProvidesCoreAppDatabaseFactory(applicationModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CoreAppDatabase providesCoreAppDatabase(ApplicationModule applicationModule, Context context) {
        CoreAppDatabase $r1 = applicationModule.providesCoreAppDatabase(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public CoreAppDatabase get() {
        ApplicationModule $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        CoreAppDatabase $r5 = providesCoreAppDatabase($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public /* bridge */ /* synthetic */ Object get() {
        CoreAppDatabase $r1 = get();
        return $r1;
    }
}
