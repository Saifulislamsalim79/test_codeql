package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: FetchOutletTransactions.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/useCases/FetchOutletTransactions;", "", "repository", "Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "(Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;)V", "getRepository", "()Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactionhistory/data/source/request/GetOutletWalletActivitiesRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchOutletTransactions {
    private final TransactionsRepository repository;

    public FetchOutletTransactions(TransactionsRepository transactionsRepository) {
        Log_OC.getArray(transactionsRepository, "repository");
        this.repository = transactionsRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(GetOutletWalletActivitiesRequest getOutletWalletActivitiesRequest) {
        Log_OC.getArray(getOutletWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRepository $r2 = this.repository;
        AbstractC11688p $r3 = $r2.outletTransactions(getOutletWalletActivitiesRequest);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "repository.outletTransactions(request)\n            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionsRepository getRepository() {
        TransactionsRepository r1 = this.repository;
        return r1;
    }
}
