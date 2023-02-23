package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* compiled from: FetchLoanHistory.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/FetchLoanHistory;", "", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/kshock/data/model/LoanHistoryResponse;", "sessionId", "", "query", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchLoanHistory {
    private final KshockApi kshockApi;
    private final RxSchedulers rxSchedulers;

    public FetchLoanHistory(KshockApi kshockApi, RxSchedulers rxSchedulers) {
        Log_OC.getArray(kshockApi, "kshockApi");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.kshockApi = kshockApi;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, Map map) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(map, "query");
        KshockApi $r3 = this.kshockApi;
        AbstractC11696w $r4 = $r3.fetchLoanHistory(str, map);
        C0305b $r5 = C0305b.f604e;
        AbstractC11696w $r42 = $r4.m10437m($r5);
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11696w $r43 = $r42.u($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r8 = $r43.n($r72).m10427w();
        Log_OC.loadImage($r8, "kshockApi.fetchLoanHistory(sessionId, query).map {\n            it\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main()).toObservable()");
        return $r8;
    }
}
