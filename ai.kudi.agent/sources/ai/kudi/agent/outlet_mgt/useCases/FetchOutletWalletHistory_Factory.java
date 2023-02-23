package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchOutletWalletHistory_Factory implements InterfaceC9468d<FetchOutletWalletHistory> {
    private final InterfaceC11700a<TransactionsRepository> repositoryProvider;

    public FetchOutletWalletHistory_Factory(InterfaceC11700a interfaceC11700a) {
        this.repositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchOutletWalletHistory_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchOutletWalletHistory_Factory $r1 = new FetchOutletWalletHistory_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchOutletWalletHistory newInstance(TransactionsRepository transactionsRepository) {
        FetchOutletWalletHistory $r1 = new FetchOutletWalletHistory(transactionsRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchOutletWalletHistory multiply() {
        InterfaceC11700a $r1 = this.repositoryProvider;
        Object $r2 = $r1.get();
        TransactionsRepository $r3 = (TransactionsRepository) $r2;
        FetchOutletWalletHistory $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39910multiply() {
        FetchOutletWalletHistory $r1 = multiply();
        return $r1;
    }
}
