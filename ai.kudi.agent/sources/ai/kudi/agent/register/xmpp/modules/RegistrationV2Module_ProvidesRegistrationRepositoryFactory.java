package ai.kudi.agent.register.xmpp.modules;

import ai.kudi.agent.register.data.RegistrationRepository;
import ai.kudi.agent.register.data.RegistrationRepositoryImpl;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RegistrationV2Module_ProvidesRegistrationRepositoryFactory implements InterfaceC9468d<RegistrationRepository> {
    private final RegistrationV2Module module;
    private final InterfaceC11700a<RegistrationRepositoryImpl> registrationRepositoryImplProvider;

    public RegistrationV2Module_ProvidesRegistrationRepositoryFactory(RegistrationV2Module registrationV2Module, InterfaceC11700a interfaceC11700a) {
        this.module = registrationV2Module;
        this.registrationRepositoryImplProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegistrationV2Module_ProvidesRegistrationRepositoryFactory create(RegistrationV2Module registrationV2Module, InterfaceC11700a interfaceC11700a) {
        RegistrationV2Module_ProvidesRegistrationRepositoryFactory $r2 = new RegistrationV2Module_ProvidesRegistrationRepositoryFactory(registrationV2Module, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegistrationRepository providesRegistrationRepository(RegistrationV2Module registrationV2Module, RegistrationRepositoryImpl registrationRepositoryImpl) {
        RegistrationRepository $r1 = registrationV2Module.providesRegistrationRepository(registrationRepositoryImpl);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RegistrationRepository remainder() {
        RegistrationV2Module $r1 = this.module;
        InterfaceC11700a $r2 = this.registrationRepositoryImplProvider;
        Object $r3 = $r2.get();
        RegistrationRepositoryImpl $r4 = (RegistrationRepositoryImpl) $r3;
        RegistrationRepository $r5 = providesRegistrationRepository($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: remainder  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40505remainder() {
        RegistrationRepository $r1 = remainder();
        return $r1;
    }
}
