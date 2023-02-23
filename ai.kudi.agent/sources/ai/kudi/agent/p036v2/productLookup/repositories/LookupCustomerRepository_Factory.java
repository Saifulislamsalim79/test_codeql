package ai.kudi.agent.p036v2.productLookup.repositories;

import ai.kudi.agent.p036v2.productLookup.sources.remoteSources.LookupCustomerRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productLookup.repositories.LookupCustomerRepository_Factory */
/* loaded from: classes.dex */
public final class LookupCustomerRepository_Factory implements InterfaceC9468d<LookupCustomerRepository> {
    private final InterfaceC11700a<LookupCustomerRemoteSource> lookupCustomerRemoteSourceProvider;

    public LookupCustomerRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.lookupCustomerRemoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LookupCustomerRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        LookupCustomerRepository_Factory $r1 = new LookupCustomerRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LookupCustomerRepository newInstance(LookupCustomerRemoteSource lookupCustomerRemoteSource) {
        LookupCustomerRepository $r1 = new LookupCustomerRepository(lookupCustomerRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LookupCustomerRepository multiply() {
        InterfaceC11700a $r1 = this.lookupCustomerRemoteSourceProvider;
        Object $r2 = $r1.get();
        LookupCustomerRemoteSource $r3 = (LookupCustomerRemoteSource) $r2;
        LookupCustomerRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41659multiply() {
        LookupCustomerRepository $r1 = multiply();
        return $r1;
    }
}
