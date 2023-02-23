package ai.kudi.agent.register.data;

import ai.kudi.agent.register.data.sources.DataSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RegistrationRepositoryImpl_Factory implements InterfaceC9468d<RegistrationRepositoryImpl> {
    private final InterfaceC11700a<DataSource> cacheProvider;
    private final InterfaceC11700a<DataSource> remoteProvider;

    public RegistrationRepositoryImpl_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.cacheProvider = interfaceC11700a;
        this.remoteProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegistrationRepositoryImpl_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        RegistrationRepositoryImpl_Factory $r2 = new RegistrationRepositoryImpl_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RegistrationRepositoryImpl newInstance(DataSource dataSource, DataSource dataSource2) {
        RegistrationRepositoryImpl $r2 = new RegistrationRepositoryImpl(dataSource, dataSource2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RegistrationRepositoryImpl multiply() {
        InterfaceC11700a $r1 = this.cacheProvider;
        Object $r2 = $r1.get();
        DataSource $r3 = (DataSource) $r2;
        InterfaceC11700a $r12 = this.remoteProvider;
        Object $r22 = $r12.get();
        DataSource $r4 = (DataSource) $r22;
        RegistrationRepositoryImpl $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40307multiply() {
        RegistrationRepositoryImpl $r1 = multiply();
        return $r1;
    }
}
