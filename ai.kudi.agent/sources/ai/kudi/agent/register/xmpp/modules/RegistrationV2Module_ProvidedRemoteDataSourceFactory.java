package ai.kudi.agent.register.xmpp.modules;

import ai.kudi.agent.register.data.sources.DataSource;
import ai.kudi.agent.register.domain.usecases.RegisterNewAgent;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RegistrationV2Module_ProvidedRemoteDataSourceFactory implements InterfaceC9468d<DataSource> {
    private final RegistrationV2Module module;
    private final InterfaceC11700a<RegisterNewAgent> registerProvider;

    public RegistrationV2Module_ProvidedRemoteDataSourceFactory(RegistrationV2Module registrationV2Module, InterfaceC11700a interfaceC11700a) {
        this.module = registrationV2Module;
        this.registerProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegistrationV2Module_ProvidedRemoteDataSourceFactory create(RegistrationV2Module registrationV2Module, InterfaceC11700a interfaceC11700a) {
        RegistrationV2Module_ProvidedRemoteDataSourceFactory $r2 = new RegistrationV2Module_ProvidedRemoteDataSourceFactory(registrationV2Module, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DataSource providedRemoteDataSource(RegistrationV2Module registrationV2Module, RegisterNewAgent registerNewAgent) {
        DataSource $r1 = registrationV2Module.providedRemoteDataSource(registerNewAgent);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DataSource subtract() {
        RegistrationV2Module $r1 = this.module;
        InterfaceC11700a $r2 = this.registerProvider;
        Object $r3 = $r2.get();
        RegisterNewAgent $r4 = (RegisterNewAgent) $r3;
        DataSource $r5 = providedRemoteDataSource($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: subtract  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40504subtract() {
        DataSource $r1 = subtract();
        return $r1;
    }
}
