package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.transactions.data.repositories.TransactionRepository;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.util.HashMap;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: FetchTransactions.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \r2$\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ,\u0010\n\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/FetchTransactions;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "Lai/kudi/agent/transactions/domain/usecases/FetchTransactionRequest;", "transactionRepo", "Lai/kudi/agent/transactions/data/repositories/TransactionRepository;", "(Lai/kudi/agent/transactions/data/repositories/TransactionRepository;)V", "execute", "Lio/reactivex/Observable;", TransactionRequest.TYPE_REQUEST, "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class FetchTransactions implements OneInputUseCase<List<? extends HashMap<String, String>>, FetchTransactionRequest> {
    private static final int COMPLETED = 0;
    public static final Companion Companion;
    private static final int PENDING;
    private final TransactionRepository transactionRepo;

    /* compiled from: FetchTransactions.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/FetchTransactions$Companion;", "", "()V", "COMPLETED", "", "getCOMPLETED", "()I", KShockActivity.PAYBACK_PENDING, "getPENDING", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getCOMPLETED() {
            int $i0 = FetchTransactions.COMPLETED;
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getPENDING() {
            int $i0 = FetchTransactions.PENDING;
            return $i0;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        PENDING = 1;
    }

    public FetchTransactions(TransactionRepository transactionRepository) {
        Log_OC.getArray(transactionRepository, "transactionRepo");
        this.transactionRepo = transactionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0018 */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41103execute$lambda1(java.util.List r10) {
        /*
            java.lang.String r0 = "it"
            kotlin.p483e0.p485d.Log_OC.getArray(r10, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r2 = kotlin.p557z.C13722p.m3921o(r10, r3)
            r1.<init>(r2)
            java.util.Iterator r4 = r10.iterator()
        L14:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2a
            java.lang.Object r6 = r4.next()
            r8 = r6
            ai.kudi.agent.transactions.data.repositories.dto.TransactionModel r8 = (ai.kudi.agent.transactions.data.repositories.dto.TransactionModel) r8
            r7 = r8
            java.util.HashMap r9 = ai.kudi.agent.transactions.domain.dto.TransactionKt.toTransaction(r7)
            r1.add(r9)
            goto L14
        L2a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.domain.usecases.FetchTransactions.m41103execute$lambda1(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(FetchTransactionRequest fetchTransactionRequest) {
        Log_OC.getArray(fetchTransactionRequest, TransactionRequest.TYPE_REQUEST);
        TransactionRepository $r3 = this.transactionRepo;
        FetchRequest $r1 = new FetchRequest(null, 1, null);
        String $r4 = fetchTransactionRequest.getType();
        $r1.setType($r4);
        String $r42 = fetchTransactionRequest.getStatus();
        $r1.setStatus($r42);
        int $i0 = fetchTransactionRequest.getPage();
        String $r43 = String.valueOf($i0);
        $r1.setPage($r43);
        String $r44 = fetchTransactionRequest.getFrom();
        $r1.setFrom($r44);
        String $r45 = fetchTransactionRequest.getTo();
        $r1.setTo($r45);
        String $r46 = fetchTransactionRequest.getAgentUid();
        String $r5 = $r46;
        if ($r46 == null) {
            $r5 = "";
        }
        $r1.setAgentUid($r5);
        C13666w c13666w = C13666w.f30112a;
        AbstractC11688p $r7 = $r3.fetchTransaction($r1);
        Type $r8 = Type.f1636b;
        AbstractC11688p $r72 = $r7.m10531O($r8);
        p425j.p444e.Item $r9 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r73 = $r72.h0($r9);
        p425j.p444e.Item $r92 = ContextUtils.LogError();
        AbstractC11688p $r74 = $r73.R($r92);
        Log_OC.loadImage($r74, "transactionRepo\n            .fetchTransaction(\n                FetchRequest().apply {\n                    type = request.type\n                    status = request.status\n                    page = request.page.toString()\n                    from = request.from\n                    to = request.to\n                    agentUid = request.agentUid.orEmpty()\n                }\n            )\n            .map { it.map(::toTransaction) }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r74;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        FetchTransactionRequest $r3 = (FetchTransactionRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
