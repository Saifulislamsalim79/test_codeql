package ai.kudi.agent.transactionhistory.mapper.database;

import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionSummaryDataToDatabaseMapper_Factory implements InterfaceC9468d<TransactionSummaryDataToDatabaseMapper> {
    private final InterfaceC11700a<TransactionSummaryTypeUiToDatabaseMapper> transactionSummaryTypeUiToDatabaseMapperProvider;

    public TransactionSummaryDataToDatabaseMapper_Factory(InterfaceC11700a interfaceC11700a) {
        this.transactionSummaryTypeUiToDatabaseMapperProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionSummaryDataToDatabaseMapper_Factory create(InterfaceC11700a interfaceC11700a) {
        TransactionSummaryDataToDatabaseMapper_Factory $r1 = new TransactionSummaryDataToDatabaseMapper_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionSummaryDataToDatabaseMapper newInstance(TransactionSummaryTypeUiToDatabaseMapper transactionSummaryTypeUiToDatabaseMapper) {
        TransactionSummaryDataToDatabaseMapper $r1 = new TransactionSummaryDataToDatabaseMapper(transactionSummaryTypeUiToDatabaseMapper);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionSummaryDataToDatabaseMapper multiply() {
        InterfaceC11700a $r1 = this.transactionSummaryTypeUiToDatabaseMapperProvider;
        Object $r2 = $r1.get();
        TransactionSummaryTypeUiToDatabaseMapper $r3 = (TransactionSummaryTypeUiToDatabaseMapper) $r2;
        TransactionSummaryDataToDatabaseMapper $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41030multiply() {
        TransactionSummaryDataToDatabaseMapper $r1 = multiply();
        return $r1;
    }
}
