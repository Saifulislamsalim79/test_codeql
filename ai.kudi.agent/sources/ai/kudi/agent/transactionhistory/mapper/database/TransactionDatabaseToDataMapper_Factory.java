package ai.kudi.agent.transactionhistory.mapper.database;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionDatabaseToDataMapper_Factory implements InterfaceC9468d<TransactionDatabaseToDataMapper> {
    private final InterfaceC11700a<TransactionKindDatabaseToDataMapper> transactionKindDatabaseToDataMapperProvider;
    private final InterfaceC11700a<TransactionTypeDatabaseToDataMapper> transactionTypeDatabaseToDataMapperProvider;

    public TransactionDatabaseToDataMapper_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.transactionTypeDatabaseToDataMapperProvider = interfaceC11700a;
        this.transactionKindDatabaseToDataMapperProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionDatabaseToDataMapper_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransactionDatabaseToDataMapper_Factory $r2 = new TransactionDatabaseToDataMapper_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionDatabaseToDataMapper newInstance(TransactionTypeDatabaseToDataMapper transactionTypeDatabaseToDataMapper, TransactionKindDatabaseToDataMapper transactionKindDatabaseToDataMapper) {
        TransactionDatabaseToDataMapper $r2 = new TransactionDatabaseToDataMapper(transactionTypeDatabaseToDataMapper, transactionKindDatabaseToDataMapper);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionDatabaseToDataMapper multiply() {
        InterfaceC11700a $r1 = this.transactionTypeDatabaseToDataMapperProvider;
        Object $r2 = $r1.get();
        TransactionTypeDatabaseToDataMapper $r3 = (TransactionTypeDatabaseToDataMapper) $r2;
        InterfaceC11700a $r12 = this.transactionKindDatabaseToDataMapperProvider;
        Object $r22 = $r12.get();
        TransactionKindDatabaseToDataMapper $r4 = (TransactionKindDatabaseToDataMapper) $r22;
        TransactionDatabaseToDataMapper $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41027multiply() {
        TransactionDatabaseToDataMapper $r1 = multiply();
        return $r1;
    }
}
