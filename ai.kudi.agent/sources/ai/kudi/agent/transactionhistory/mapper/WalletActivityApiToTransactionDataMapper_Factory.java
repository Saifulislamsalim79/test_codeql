package ai.kudi.agent.transactionhistory.mapper;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class WalletActivityApiToTransactionDataMapper_Factory implements InterfaceC9468d<WalletActivityApiToTransactionDataMapper> {
    private final InterfaceC11700a<TransactionKindMapper> transactionKindMapperProvider;
    private final InterfaceC11700a<TransactionTypeMapper> transactionTypeMapperProvider;

    public WalletActivityApiToTransactionDataMapper_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.transactionTypeMapperProvider = interfaceC11700a;
        this.transactionKindMapperProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WalletActivityApiToTransactionDataMapper_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        WalletActivityApiToTransactionDataMapper_Factory $r2 = new WalletActivityApiToTransactionDataMapper_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WalletActivityApiToTransactionDataMapper newInstance(TransactionTypeMapper transactionTypeMapper, TransactionKindMapper transactionKindMapper) {
        WalletActivityApiToTransactionDataMapper $r2 = new WalletActivityApiToTransactionDataMapper(transactionTypeMapper, transactionKindMapper);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public WalletActivityApiToTransactionDataMapper multiply() {
        InterfaceC11700a $r1 = this.transactionTypeMapperProvider;
        Object $r2 = $r1.get();
        TransactionTypeMapper $r3 = (TransactionTypeMapper) $r2;
        InterfaceC11700a $r12 = this.transactionKindMapperProvider;
        Object $r22 = $r12.get();
        TransactionKindMapper $r4 = (TransactionKindMapper) $r22;
        WalletActivityApiToTransactionDataMapper $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41025multiply() {
        WalletActivityApiToTransactionDataMapper $r1 = multiply();
        return $r1;
    }
}
