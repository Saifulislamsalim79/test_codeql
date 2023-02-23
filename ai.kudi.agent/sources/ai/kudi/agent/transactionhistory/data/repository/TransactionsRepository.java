package ai.kudi.agent.transactionhistory.data.repository;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.transactionhistory.data.source.TransactionsLocalSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource;
import ai.kudi.agent.transactionhistory.data.source.TransactionsSummaryLocalSource;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletTransactionSummaryRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetTransactionSummaryRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: TransactionsRepository.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\f2\u0006\u0010\u000f\u001a\u00020\u0015J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0012J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\f2\u0006\u0010\u000f\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u001c\u001a\u00020\u001d*\u00020\u001eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/repository/TransactionsRepository;", "", "transactionsRemoteSource", "Lai/kudi/agent/transactionhistory/data/source/TransactionsRemoteSource;", "transactionsLocalSource", "Lai/kudi/agent/transactionhistory/data/source/TransactionsLocalSource;", "transactionsSummaryLocalDataSource", "Lai/kudi/agent/transactionhistory/data/source/TransactionsSummaryLocalSource;", "schedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/transactionhistory/data/source/TransactionsRemoteSource;Lai/kudi/agent/transactionhistory/data/source/TransactionsLocalSource;Lai/kudi/agent/transactionhistory/data/source/TransactionsSummaryLocalSource;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "incompleteTransactions", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactionhistory/data/source/request/GetWalletActivitiesRequest;", "outletTransactions", "Lai/kudi/agent/transactionhistory/data/source/request/GetOutletWalletActivitiesRequest;", "outletTransactionsSummary", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "Lai/kudi/agent/transactionhistory/data/source/request/GetOutletTransactionSummaryRequest;", "outletWalletActivities", "searchTransactions", "transactions", "transactionsSummary", "Lai/kudi/agent/transactionhistory/data/source/request/GetTransactionSummaryRequest;", "walletActivities", "isFirstPage", "", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionsRepository {
    private final RxSchedulers schedulers;
    private final TransactionsLocalSource transactionsLocalSource;
    private final TransactionsRemoteSource transactionsRemoteSource;
    private final TransactionsSummaryLocalSource transactionsSummaryLocalDataSource;

    public TransactionsRepository(TransactionsRemoteSource transactionsRemoteSource, TransactionsLocalSource transactionsLocalSource, TransactionsSummaryLocalSource transactionsSummaryLocalSource, RxSchedulers rxSchedulers) {
        Log_OC.getArray(transactionsRemoteSource, "transactionsRemoteSource");
        Log_OC.getArray(transactionsLocalSource, "transactionsLocalSource");
        Log_OC.getArray(transactionsSummaryLocalSource, "transactionsSummaryLocalDataSource");
        Log_OC.getArray(rxSchedulers, "schedulers");
        this.transactionsRemoteSource = transactionsRemoteSource;
        this.transactionsLocalSource = transactionsLocalSource;
        this.transactionsSummaryLocalDataSource = transactionsSummaryLocalSource;
        this.schedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isFirstPage(ai.kudi.agent.transactions.data.repositories.dto.FetchRequest r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getPage()
            if (r0 == 0) goto Lf
            boolean r1 = kotlin.p549l0.C13265j.m5470u(r0)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            if (r1 != 0) goto L1e
            java.lang.String r0 = r5.getPage()
            java.lang.String r2 = "0"
            boolean r1 = kotlin.p483e0.p485d.Log_OC.append(r0, r2)
            if (r1 == 0) goto L20
        L1e:
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.repository.TransactionsRepository.isFirstPage(ai.kudi.agent.transactions.data.repositories.dto.FetchRequest):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: transactionsSummary$lambda-1  reason: not valid java name */
    public static final List m40995transactionsSummary$lambda1(TransactionsRepository transactionsRepository, GetTransactionSummaryRequest getTransactionSummaryRequest, List list) {
        Log_OC.getArray(transactionsRepository, "this$0");
        Log_OC.getArray(getTransactionSummaryRequest, "$request");
        Log_OC.getArray(list, "summaryItems");
        TransactionsSummaryLocalSource $r4 = transactionsRepository.transactionsSummaryLocalDataSource;
        String $r1 = getTransactionSummaryRequest.getUserId();
        $r4.saveAll($r1, list);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: walletActivities$lambda-0  reason: not valid java name */
    public static final List m40996walletActivities$lambda0(TransactionsRepository transactionsRepository, GetWalletActivitiesRequest getWalletActivitiesRequest, List list) {
        Log_OC.getArray(transactionsRepository, "this$0");
        Log_OC.getArray(getWalletActivitiesRequest, "$request");
        Log_OC.getArray(list, "it");
        TransactionsLocalSource $r4 = transactionsRepository.transactionsLocalSource;
        String $r1 = getWalletActivitiesRequest.getUserId();
        $r4.saveAll($r1, list);
        return list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p incompleteTransactions(GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRemoteSource $r3 = this.transactionsRemoteSource;
        AbstractC11688p $r1 = $r3.incompleteTransactions(getWalletActivitiesRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p outletTransactions(GetOutletWalletActivitiesRequest getOutletWalletActivitiesRequest) {
        Log_OC.getArray(getOutletWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRemoteSource $r3 = this.transactionsRemoteSource;
        AbstractC11688p $r1 = $r3.outletTransactions(getOutletWalletActivitiesRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p outletTransactionsSummary(GetOutletTransactionSummaryRequest getOutletTransactionSummaryRequest) {
        Log_OC.getArray(getOutletTransactionSummaryRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRemoteSource $r3 = this.transactionsRemoteSource;
        AbstractC11688p $r1 = $r3.outletTransactionsSummary(getOutletTransactionSummaryRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p outletWalletActivities(GetOutletWalletActivitiesRequest getOutletWalletActivitiesRequest) {
        Log_OC.getArray(getOutletWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRemoteSource $r3 = this.transactionsRemoteSource;
        AbstractC11688p $r1 = $r3.outletWalletActivities(getOutletWalletActivitiesRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p searchTransactions(GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRemoteSource $r3 = this.transactionsRemoteSource;
        AbstractC11688p $r1 = $r3.searchTransactions(getWalletActivitiesRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p transactions(GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRemoteSource $r3 = this.transactionsRemoteSource;
        AbstractC11688p $r1 = $r3.transactions(getWalletActivitiesRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p transactionsSummary(final GetTransactionSummaryRequest getTransactionSummaryRequest) {
        Log_OC.getArray(getTransactionSummaryRequest, TransactionRequest.TYPE_REQUEST);
        TransactionsRemoteSource $r2 = this.transactionsRemoteSource;
        AbstractC11688p $r3 = $r2.transactionsSummary(getTransactionSummaryRequest);
        RxSchedulers $r4 = this.schedulers;
        Item $r5 = $r4.setSettings();
        AbstractC11688p $r32 = $r3.h0($r5);
        RxSchedulers $r42 = this.schedulers;
        Item $r52 = $r42.setSettings();
        AbstractC11688p $r33 = $r32.R($r52).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.repository.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsRepository $r1 = TransactionsRepository.this;
                GetTransactionSummaryRequest $r22 = getTransactionSummaryRequest;
                List $r34 = (List) obj;
                return TransactionsRepository.m40995transactionsSummary$lambda1($r1, $r22, $r34);
            }
        });
        boolean $z0 = getTransactionSummaryRequest.isCachingEnabled();
        if (!$z0) {
            Log_OC.loadImage($r33, "{\n            remoteSource\n        }");
            return $r33;
        }
        TransactionsSummaryLocalSource $r7 = this.transactionsSummaryLocalDataSource;
        AbstractC11688p $r8 = $r7.transactionSummary();
        AbstractC11688p $r34 = AbstractC11688p.m10529Q($r8, $r33);
        Log_OC.loadImage($r34, "{\n            Observable.mergeDelayError(\n                transactionsSummaryLocalDataSource.transactionSummary(),\n                remoteSource\n            )\n        }");
        return $r34;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p walletActivities(final GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        FetchRequest $r3 = getWalletActivitiesRequest.getFetchRequest();
        boolean $z0 = isFirstPage($r3);
        if ($z0) {
            String $r4 = getWalletActivitiesRequest.getUserId();
            if ($r4 != null) {
                boolean $z02 = getWalletActivitiesRequest.getLoadFromCache();
                if ($z02) {
                    TransactionsLocalSource $r5 = this.transactionsLocalSource;
                    String $r42 = getWalletActivitiesRequest.getUserId();
                    AbstractC11688p $r6 = $r5.observeTransactions($r42);
                    TransactionsRemoteSource $r7 = this.transactionsRemoteSource;
                    AbstractC11688p $r8 = $r7.walletActivities(getWalletActivitiesRequest);
                    AbstractC11688p $r62 = AbstractC11688p.m10529Q($r6, $r8.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.repository.b
                        /* JADX WARN: Can't parse signature for local variable: 
                        java.lang.NullPointerException
                         */
                        @Override // p425j.p444e.p450e0.InterfaceC11291f
                        /* renamed from: a */
                        public final Object mo10663a(Object obj) {
                            TransactionsRepository $r1 = TransactionsRepository.this;
                            GetWalletActivitiesRequest $r2 = getWalletActivitiesRequest;
                            List $r32 = (List) obj;
                            return TransactionsRepository.m40996walletActivities$lambda0($r1, $r2, $r32);
                        }
                    }));
                    Log_OC.loadImage($r62, "{\n            Observable.mergeDelayError(\n                transactionsLocalSource.observeTransactions(request.userId),\n                transactionsRemoteSource.walletActivities(request).map {\n                    transactionsLocalSource.saveAll(request.userId, it)\n                    it\n                }\n            )\n        }");
                    return $r62;
                }
            }
        }
        TransactionsRemoteSource $r72 = this.transactionsRemoteSource;
        AbstractC11688p $r63 = $r72.walletActivities(getWalletActivitiesRequest);
        return $r63;
    }
}
