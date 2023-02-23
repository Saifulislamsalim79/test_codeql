package ai.kudi.agent.transfer.domain.repositories;

import ai.kudi.agent.transfer.domain.sources.remote.TransactionLookUpRemoteSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class DefaultTransactionLookUpRepository_Factory implements InterfaceC9468d<DefaultTransactionLookUpRepository> {
    private final InterfaceC11700a<TransactionLookUpRemoteSource> remoteSourceProvider;

    public DefaultTransactionLookUpRepository_Factory(InterfaceC11700a interfaceC11700a) {
        this.remoteSourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DefaultTransactionLookUpRepository_Factory create(InterfaceC11700a interfaceC11700a) {
        DefaultTransactionLookUpRepository_Factory $r1 = new DefaultTransactionLookUpRepository_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DefaultTransactionLookUpRepository newInstance(TransactionLookUpRemoteSource transactionLookUpRemoteSource) {
        DefaultTransactionLookUpRepository $r1 = new DefaultTransactionLookUpRepository(transactionLookUpRemoteSource);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DefaultTransactionLookUpRepository multiply() {
        InterfaceC11700a $r1 = this.remoteSourceProvider;
        Object $r2 = $r1.get();
        TransactionLookUpRemoteSource $r3 = (TransactionLookUpRemoteSource) $r2;
        DefaultTransactionLookUpRepository $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41314multiply() {
        DefaultTransactionLookUpRepository $r1 = multiply();
        return $r1;
    }
}
