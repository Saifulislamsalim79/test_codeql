package ai.kudi.agent.register.xmpp.modules;

import ai.kudi.agent.register.data.sources.DataSource;
import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RegistrationV2Module_ProvidesCachedDataSourceFactory implements InterfaceC9468d<DataSource> {
    private final InterfaceC11700a<Context> contextProvider;
    private final RegistrationV2Module module;

    public RegistrationV2Module_ProvidesCachedDataSourceFactory(RegistrationV2Module registrationV2Module, InterfaceC11700a interfaceC11700a) {
        this.module = registrationV2Module;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegistrationV2Module_ProvidesCachedDataSourceFactory create(RegistrationV2Module registrationV2Module, InterfaceC11700a interfaceC11700a) {
        RegistrationV2Module_ProvidesCachedDataSourceFactory $r2 = new RegistrationV2Module_ProvidesCachedDataSourceFactory(registrationV2Module, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DataSource providesCachedDataSource(RegistrationV2Module registrationV2Module, Context context) {
        DataSource $r1 = registrationV2Module.providesCachedDataSource(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public DataSource get() {
        RegistrationV2Module $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        DataSource $r5 = providesCachedDataSource($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public /* bridge */ /* synthetic */ Object get() {
        DataSource $r1 = get();
        return $r1;
    }
}
