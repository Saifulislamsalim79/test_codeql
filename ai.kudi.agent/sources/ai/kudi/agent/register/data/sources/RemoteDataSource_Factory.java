package ai.kudi.agent.register.data.sources;

import ai.kudi.agent.register.domain.usecases.RegisterNewAgent;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class RemoteDataSource_Factory implements InterfaceC9468d<RemoteDataSource> {
    private final InterfaceC11700a<RegisterNewAgent> registerNewAgentProvider;

    public RemoteDataSource_Factory(InterfaceC11700a interfaceC11700a) {
        this.registerNewAgentProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RemoteDataSource_Factory create(InterfaceC11700a interfaceC11700a) {
        RemoteDataSource_Factory $r1 = new RemoteDataSource_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RemoteDataSource newInstance(RegisterNewAgent registerNewAgent) {
        RemoteDataSource $r1 = new RemoteDataSource(registerNewAgent);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RemoteDataSource multiply() {
        InterfaceC11700a $r1 = this.registerNewAgentProvider;
        Object $r2 = $r1.get();
        RegisterNewAgent $r3 = (RegisterNewAgent) $r2;
        RemoteDataSource $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40310multiply() {
        RemoteDataSource $r1 = multiply();
        return $r1;
    }
}
