package ai.kudi.agent.transactionhistory.mapper.database;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionSummaryDatabaseToDataMapper_Factory implements InterfaceC9468d<TransactionSummaryDatabaseToDataMapper> {
    private final InterfaceC11700a<TransactionSummaryTypeDatabaseToUiMapper> transactionSummaryTypeDatabaseToUiMapperProvider;

    public TransactionSummaryDatabaseToDataMapper_Factory(InterfaceC11700a interfaceC11700a) {
        this.transactionSummaryTypeDatabaseToUiMapperProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionSummaryDatabaseToDataMapper_Factory create(InterfaceC11700a interfaceC11700a) {
        TransactionSummaryDatabaseToDataMapper_Factory $r1 = new TransactionSummaryDatabaseToDataMapper_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionSummaryDatabaseToDataMapper newInstance(TransactionSummaryTypeDatabaseToUiMapper transactionSummaryTypeDatabaseToUiMapper) {
        TransactionSummaryDatabaseToDataMapper $r1 = new TransactionSummaryDatabaseToDataMapper(transactionSummaryTypeDatabaseToUiMapper);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionSummaryDatabaseToDataMapper multiply() {
        InterfaceC11700a $r1 = this.transactionSummaryTypeDatabaseToUiMapperProvider;
        Object $r2 = $r1.get();
        TransactionSummaryTypeDatabaseToUiMapper $r3 = (TransactionSummaryTypeDatabaseToUiMapper) $r2;
        TransactionSummaryDatabaseToDataMapper $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41031multiply() {
        TransactionSummaryDatabaseToDataMapper $r1 = multiply();
        return $r1;
    }
}
