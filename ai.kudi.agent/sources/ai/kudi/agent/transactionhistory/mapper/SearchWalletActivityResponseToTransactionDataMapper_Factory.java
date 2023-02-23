package ai.kudi.agent.transactionhistory.mapper;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SearchWalletActivityResponseToTransactionDataMapper_Factory implements InterfaceC9468d<SearchWalletActivityResponseToTransactionDataMapper> {
    private final InterfaceC11700a<TransactionTypeMapper> transactionTypeMapperProvider;

    public SearchWalletActivityResponseToTransactionDataMapper_Factory(InterfaceC11700a interfaceC11700a) {
        this.transactionTypeMapperProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SearchWalletActivityResponseToTransactionDataMapper_Factory create(InterfaceC11700a interfaceC11700a) {
        SearchWalletActivityResponseToTransactionDataMapper_Factory $r1 = new SearchWalletActivityResponseToTransactionDataMapper_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SearchWalletActivityResponseToTransactionDataMapper newInstance(TransactionTypeMapper transactionTypeMapper) {
        SearchWalletActivityResponseToTransactionDataMapper $r1 = new SearchWalletActivityResponseToTransactionDataMapper(transactionTypeMapper);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SearchWalletActivityResponseToTransactionDataMapper multiply() {
        InterfaceC11700a $r1 = this.transactionTypeMapperProvider;
        Object $r2 = $r1.get();
        TransactionTypeMapper $r3 = (TransactionTypeMapper) $r2;
        SearchWalletActivityResponseToTransactionDataMapper $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41019multiply() {
        SearchWalletActivityResponseToTransactionDataMapper $r1 = multiply();
        return $r1;
    }
}
