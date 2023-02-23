package ai.kudi.agent.p036v2.productLookup.useCases;

import ai.kudi.agent.p036v2.productLookup.repositories.LookupCustomerRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productLookup.useCases.LookupCustomerUseCase_Factory */
/* loaded from: classes.dex */
public final class LookupCustomerUseCase_Factory implements InterfaceC9468d<LookupCustomerUseCase> {
    private final InterfaceC11700a<LookupCustomerRepository> lookupCustomerRepositoryProvider;

    public LookupCustomerUseCase_Factory(InterfaceC11700a interfaceC11700a) {
        this.lookupCustomerRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LookupCustomerUseCase_Factory create(InterfaceC11700a interfaceC11700a) {
        LookupCustomerUseCase_Factory $r1 = new LookupCustomerUseCase_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LookupCustomerUseCase newInstance(LookupCustomerRepository lookupCustomerRepository) {
        LookupCustomerUseCase $r1 = new LookupCustomerUseCase(lookupCustomerRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LookupCustomerUseCase multiply() {
        InterfaceC11700a $r1 = this.lookupCustomerRepositoryProvider;
        Object $r2 = $r1.get();
        LookupCustomerRepository $r3 = (LookupCustomerRepository) $r2;
        LookupCustomerUseCase $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41663multiply() {
        LookupCustomerUseCase $r1 = multiply();
        return $r1;
    }
}
