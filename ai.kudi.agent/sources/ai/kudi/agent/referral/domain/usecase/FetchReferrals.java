package ai.kudi.agent.referral.domain.usecase;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.ReferralApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: FetchReferrals.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/referral/domain/usecase/FetchReferrals;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/referral/AgentReferralModel;", "sessionId", "", "page", "", TransactionField.STATUS, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchReferrals {
    private final NetworkService networkService;

    public FetchReferrals(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ AbstractC11688p execute$default(FetchReferrals fetchReferrals, String str, int $i0, String $r3, int i, Object obj) {
        int $i2 = i & 2;
        if ($i2 != 0) {
            $i0 = 0;
        }
        int $i1 = i & 4;
        if ($i1 != 0) {
            $r3 = "";
        }
        AbstractC11688p $r1 = fetchReferrals.execute(str, $i0, $r3);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final List m40247execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        List $r2 = (List) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, int i, String str2) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, TransactionField.STATUS);
        NetworkService $r3 = this.networkService;
        ReferralApi $r4 = $r3.getReferralApi();
        AbstractC11688p $r5 = $r4.getAllReferrals(str, i, str2);
        Frame $r6 = Frame.f957h;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.referralApi.getAllReferrals(sessionId, page, status)\n                .map { it.data }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }
}
