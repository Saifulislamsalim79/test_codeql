package ai.kudi.agent.transactioncommissions.domain;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.LoanProviderResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: LoanProviderUseCase.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/domain/LoanProviderUseCase;", "", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "(Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/kshock/data/domain/api/KshockApi;)V", "execute", "Lio/reactivex/Observable;", "", "sessionId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoanProviderUseCase {
    private final KshockApi kshockApi;
    private final RxSchedulers rxSchedulers;

    public LoanProviderUseCase(RxSchedulers rxSchedulers, KshockApi kshockApi) {
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(kshockApi, "kshockApi");
        this.rxSchedulers = rxSchedulers;
        this.kshockApi = kshockApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Boolean m40949execute$lambda0(LoanProviderResponse loanProviderResponse) {
        Log_OC.getArray(loanProviderResponse, "it");
        boolean $z0 = loanProviderResponse.getStatus();
        Boolean $r1 = Boolean.valueOf($z0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "sessionId");
        KshockApi $r2 = this.kshockApi;
        AbstractC11688p $r3 = $r2.fetchLoanProviderStatus(str);
        Token $r4 = Token.UNION;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        RxSchedulers $r5 = this.rxSchedulers;
        p425j.p444e.Item $r6 = $r5.setSettings();
        AbstractC11688p $r33 = $r32.h0($r6);
        RxSchedulers $r52 = this.rxSchedulers;
        p425j.p444e.Item $r62 = $r52.main();
        AbstractC11688p $r34 = $r33.R($r62);
        Log_OC.loadImage($r34, "kshockApi.fetchLoanProviderStatus(sessionId = sessionId).map {\n            it.status\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r34;
    }
}
