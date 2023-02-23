package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OutletMgtApi;
import ai.kudi.agent.outlet_mgt.data.OutletTopUpRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: PerformOutletTopUp.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/useCases/PerformOutletTopUp;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "sessionId", "", "outletId", TransactionField.AMOUNT, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PerformOutletTopUp {
    private final NetworkService networkService;

    public PerformOutletTopUp(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2, int i) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "outletId");
        NetworkService $r4 = this.networkService;
        OutletMgtApi $r5 = $r4.getOutletApi();
        OutletTopUpRequest $r1 = new OutletTopUpRequest(i);
        AbstractC11688p $r6 = $r5.topUpOutletWallet($r1, str, str2);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r62 = $r6.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r63 = $r62.R($r72);
        Log_OC.loadImage($r63, "networkService.outletApi.topUpOutletWallet(OutletTopUpRequest(amount), sessionId, outletId)\n                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r63;
    }
}
