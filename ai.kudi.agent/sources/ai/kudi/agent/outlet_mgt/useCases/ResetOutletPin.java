package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OutletMgtApi;
import ai.kudi.agent.outlet_mgt.data.OutletResetPinRequest;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: ResetOutletPin.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/useCases/ResetOutletPin;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/outlet_mgt/data/OutletResetPinResponse;", "outletId", "", "sessionId", "oldPin", "newPin", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ResetOutletPin {
    private final NetworkService networkService;

    public ResetOutletPin(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2, String str3, String str4) {
        Log_OC.getArray(str, "outletId");
        Log_OC.getArray(str2, "sessionId");
        Log_OC.getArray(str3, "oldPin");
        Log_OC.getArray(str4, "newPin");
        NetworkService $r6 = this.networkService;
        OutletMgtApi $r7 = $r6.getOutletApi();
        OutletResetPinRequest $r3 = new OutletResetPinRequest(str4, str3);
        AbstractC11688p $r8 = $r7.resetOutletPin($r3, str2, str);
        p425j.p444e.Item $r9 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r82 = $r8.h0($r9);
        p425j.p444e.Item $r92 = ContextUtils.LogError();
        AbstractC11688p $r83 = $r82.R($r92);
        Log_OC.loadImage($r83, "networkService.outletApi.resetOutletPin(\n            OutletResetPinRequest(oldPin = oldPin, newPin = newPin), sessionId = sessionId, outletId = outletId\n    ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r83;
    }
}
