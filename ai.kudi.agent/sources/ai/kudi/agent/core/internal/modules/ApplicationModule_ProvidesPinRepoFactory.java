package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.register.PinRepositoryImpl;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesPinRepoFactory implements InterfaceC9468d<PinRepositoryImpl> {
    private final ApplicationModule module;
    private final InterfaceC11700a<CoreAppDatabase> roomDatabaseProvider;

    public ApplicationModule_ProvidesPinRepoFactory(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        this.module = applicationModule;
        this.roomDatabaseProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvidesPinRepoFactory create(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        ApplicationModule_ProvidesPinRepoFactory $r2 = new ApplicationModule_ProvidesPinRepoFactory(applicationModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PinRepositoryImpl providesPinRepo(ApplicationModule applicationModule, CoreAppDatabase coreAppDatabase) {
        PinRepositoryImpl $r1 = applicationModule.providesPinRepo(coreAppDatabase);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PinRepositoryImpl remainder() {
        ApplicationModule $r1 = this.module;
        InterfaceC11700a $r2 = this.roomDatabaseProvider;
        Object $r3 = $r2.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r3;
        PinRepositoryImpl $r5 = providesPinRepo($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39144remainder() {
        PinRepositoryImpl $r1 = remainder();
        return $r1;
    }
}
