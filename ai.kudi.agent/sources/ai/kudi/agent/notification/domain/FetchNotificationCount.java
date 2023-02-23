package ai.kudi.agent.notification.domain;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.notification.viewmodels.NotificationCount;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
import retrofit2.C14840l;
/* compiled from: FetchNotificationCount.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/notification/domain/FetchNotificationCount;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/notification/viewmodels/NotificationCount;", "sessionId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class FetchNotificationCount {
    private final NetworkService networkService;

    public FetchNotificationCount(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final NotificationCount m39841execute$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 != 200) {
            NotificationCount $r3 = new NotificationCount(0);
            return $r3;
        }
        Object $r1 = c14840l.m284a();
        Log_OC.append($r1);
        APIResponse $r2 = (APIResponse) $r1;
        NotificationCount $r32 = (NotificationCount) $r2.data;
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "sessionId");
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        AbstractC11688p $r4 = $r3.getNotificationCount(str);
        C0331b $r5 = C0331b.f686e;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        Item $r6 = ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "networkService.api.getNotificationCount(sessionId)\n                .map {\n                    if (it.code() == 200) {\n                        it.body()!!.data\n                    } else {\n                        NotificationCount(count = 0)\n                    }\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}
