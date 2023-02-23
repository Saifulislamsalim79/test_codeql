package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.PaybackLoanResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: PaybackLoan.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/PaybackLoan;", "", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/kshock/data/model/Loan;", "loanId", "", "sessionId", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaybackLoan {
    private final KshockApi kshockApi;

    public PaybackLoan(KshockApi kshockApi) {
        Log_OC.getArray(kshockApi, "kshockApi");
        this.kshockApi = kshockApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Loan m39697execute$lambda0(PaybackLoanResponse paybackLoanResponse) {
        Log_OC.getArray(paybackLoanResponse, "it");
        Loan $r0 = paybackLoanResponse.getData();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2) {
        Log_OC.getArray(str, "loanId");
        Log_OC.getArray(str2, "sessionId");
        KshockApi $r3 = this.kshockApi;
        AbstractC11688p $r4 = $r3.paybackLoanManually(str2, str);
        Label $r5 = Label.f601k;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "kshockApi.paybackLoanManually(sessionId, loanId).map {\n            it.data\n        }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }
}
