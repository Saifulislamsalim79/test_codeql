package ai.kudi.agent.transactionhistory.mapper.database;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionDataToDatabaseMapper_Factory implements InterfaceC9468d<TransactionDataToDatabaseMapper> {
    private final InterfaceC11700a<TransactionKindDataToDatabaseMapper> transactionKindDataToDatabaseMapperProvider;
    private final InterfaceC11700a<TransactionTypeDataToDatabaseMapper> transactionTypeDataToDatabaseMapperProvider;

    public TransactionDataToDatabaseMapper_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.transactionTypeDataToDatabaseMapperProvider = interfaceC11700a;
        this.transactionKindDataToDatabaseMapperProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionDataToDatabaseMapper_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransactionDataToDatabaseMapper_Factory $r2 = new TransactionDataToDatabaseMapper_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionDataToDatabaseMapper newInstance(TransactionTypeDataToDatabaseMapper transactionTypeDataToDatabaseMapper, TransactionKindDataToDatabaseMapper transactionKindDataToDatabaseMapper) {
        TransactionDataToDatabaseMapper $r2 = new TransactionDataToDatabaseMapper(transactionTypeDataToDatabaseMapper, transactionKindDataToDatabaseMapper);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionDataToDatabaseMapper multiply() {
        InterfaceC11700a $r1 = this.transactionTypeDataToDatabaseMapperProvider;
        Object $r2 = $r1.get();
        TransactionTypeDataToDatabaseMapper $r3 = (TransactionTypeDataToDatabaseMapper) $r2;
        InterfaceC11700a $r12 = this.transactionKindDataToDatabaseMapperProvider;
        Object $r22 = $r12.get();
        TransactionKindDataToDatabaseMapper $r4 = (TransactionKindDataToDatabaseMapper) $r22;
        TransactionDataToDatabaseMapper $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41026multiply() {
        TransactionDataToDatabaseMapper $r1 = multiply();
        return $r1;
    }
}
