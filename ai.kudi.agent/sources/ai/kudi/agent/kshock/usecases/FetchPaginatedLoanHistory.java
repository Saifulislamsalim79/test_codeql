package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.C7998p0;
import p201g.p259r.C8003q0;
import p201g.p259r.p260o1.C7991a;
import p425j.p444e.AbstractC11688p;
/* compiled from: FetchPaginatedLoanHistory.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/FetchPaginatedLoanHistory;", "", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "(Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/kshock/data/domain/api/KshockApi;)V", "execute", "Lio/reactivex/Observable;", "Landroidx/paging/PagingData;", "Lai/kudi/agent/kshock/data/model/Loan;", "sessionId", "", "query", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchPaginatedLoanHistory {
    private final KshockApi kshockApi;
    private final RxSchedulers rxSchedulers;

    public FetchPaginatedLoanHistory(RxSchedulers rxSchedulers, KshockApi kshockApi) {
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(kshockApi, "kshockApi");
        this.rxSchedulers = rxSchedulers;
        this.kshockApi = kshockApi;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, Map map) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(map, "query");
        C8003q0 $r1 = new C8003q0(15, 2, false, 0, 0, 0, 60, (DBUtils$1) null);
        FetchPaginatedLoanHistory$execute$1 $r5 = new FetchPaginatedLoanHistory$execute$1(this, str, map);
        C7998p0 $r4 = new C7998p0($r1, (Object) null, $r5, 2, (DBUtils$1) null);
        AbstractC11688p $r6 = C7991a.m16919c($r4);
        RxSchedulers $r7 = this.rxSchedulers;
        p425j.p444e.Item $r8 = $r7.main();
        AbstractC11688p $r62 = $r6.R($r8);
        Log_OC.loadImage($r62, "fun execute(\n        sessionId: String,\n        query: Map<String, String>\n    ): Observable<PagingData<Loan>> {\n        return Pager(\n            config = PagingConfig(\n                pageSize = LoanHistoryPagingSource.NETWORK_PAGE_SIZE,\n                prefetchDistance = 2\n            ),\n            pagingSourceFactory = { LoanHistoryPagingSource(kshockApi, rxSchedulers, sessionId, query) }\n        ).observable.observeOn(rxSchedulers.main())\n    }");
        return $r62;
    }
}
