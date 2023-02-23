package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.LoanRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: FetchLoanInterest.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/FetchLoanInterest;", "", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/kshock/data/model/InterestResponse;", "sessionId", "", "loanRequest", "Lai/kudi/agent/kshock/data/model/LoanRequest;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchLoanInterest {
    private final KshockApi kshockApi;
    private final RxSchedulers rxSchedulers;

    public FetchLoanInterest(KshockApi kshockApi, RxSchedulers rxSchedulers) {
        Log_OC.getArray(kshockApi, "kshockApi");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.kshockApi = kshockApi;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, LoanRequest loanRequest) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(loanRequest, "loanRequest");
        KshockApi $r3 = this.kshockApi;
        AbstractC11688p $r4 = $r3.fetchLoanInterest(str, loanRequest);
        RxSchedulers $r5 = this.rxSchedulers;
        p425j.p444e.Item $r6 = $r5.setSettings();
        AbstractC11688p $r42 = $r4.h0($r6);
        RxSchedulers $r52 = this.rxSchedulers;
        p425j.p444e.Item $r62 = $r52.main();
        AbstractC11688p $r43 = $r42.R($r62);
        Log_OC.loadImage($r43, "kshockApi.fetchLoanInterest(sessionId, loanRequest)\n            .subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r43;
    }
}
