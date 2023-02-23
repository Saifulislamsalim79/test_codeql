package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.PaybackLoanResponse;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: PaybackOverdueLoan.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/kshock/usecases/PaybackOverdueLoan;", "", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/kshock/data/model/Loan;", KshockOverdueLoansDetailFragment.KEY_LOAN, "sessionId", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaybackOverdueLoan {
    private final KshockApi kshockApi;

    public PaybackOverdueLoan(KshockApi kshockApi) {
        Log_OC.getArray(kshockApi, "kshockApi");
        this.kshockApi = kshockApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Loan m39699execute$lambda0(PaybackLoanResponse paybackLoanResponse) {
        Log_OC.getArray(paybackLoanResponse, "it");
        Loan $r0 = paybackLoanResponse.getData();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(Loan loan, String str) {
        Log_OC.getArray(str, "sessionId");
        KshockApi $r3 = this.kshockApi;
        String $r5 = loan == null ? null : loan.getId();
        if ($r5 == null) {
            $r5 = "";
        }
        String $r4 = loan != null ? loan.getUserId() : null;
        String $r6 = $r4 != null ? $r4 : "";
        AbstractC11688p $r7 = $r3.paybackOverdueLoan(str, $r5, $r6);
        Money $r8 = Money.ZERO;
        AbstractC11688p $r72 = $r7.m10531O($r8);
        p425j.p444e.Item $r9 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r73 = $r72.h0($r9);
        p425j.p444e.Item $r92 = ContextUtils.LogError();
        AbstractC11688p $r74 = $r73.R($r92);
        Log_OC.loadImage($r74, "kshockApi.paybackOverdueLoan(sessionId, loan?.id.orEmpty(), loan?.userId.orEmpty()).map {\n            it.data\n        }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r74;
    }
}
