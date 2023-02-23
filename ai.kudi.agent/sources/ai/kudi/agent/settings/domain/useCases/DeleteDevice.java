package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: DeleteDevice.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/DeleteDevice;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "sessionId", "", "id", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DeleteDevice {
    private final NetworkService networkService;

    public DeleteDevice(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "id");
        NetworkService $r3 = this.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        AbstractC11688p $r5 = $r4.deleteDevice(str, str2);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "networkService.api.deleteDevice(sessionId, id).subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }
}
