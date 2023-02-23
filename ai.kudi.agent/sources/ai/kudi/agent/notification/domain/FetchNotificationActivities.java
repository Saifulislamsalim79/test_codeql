package ai.kudi.agent.notification.domain;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
import retrofit2.C14840l;
/* compiled from: FetchNotificationActivities.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/notification/domain/FetchNotificationActivities;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/notification/data/model/NotificationModel;", "sessionId", "", "fetchRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class FetchNotificationActivities {
    private final NetworkService networkService;

    public FetchNotificationActivities(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final List m39839execute$lambda0(C14840l c14840l) {
        List $r3;
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 != 200) {
            $r3 = C13726r.m3891e();
            return $r3;
        }
        Object $r1 = c14840l.m284a();
        Log_OC.append($r1);
        APIResponse $r2 = (APIResponse) $r1;
        List $r32 = (List) $r2.data;
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, FetchRequest fetchRequest) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(fetchRequest, "fetchRequest");
        NetworkService $r3 = this.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        Map $r5 = fetchRequest.getParams();
        AbstractC11688p $r6 = $r4.getNotifications(str, $r5);
        FlurryAdSize $r7 = FlurryAdSize.FULLSCREEN;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        Item $r8 = ClassWriter.LogError();
        AbstractC11688p $r63 = $r62.h0($r8);
        Item $r82 = ContextUtils.LogError();
        AbstractC11688p $r64 = $r63.R($r82);
        Log_OC.loadImage($r64, "networkService.api.getNotifications(sessionId, fetchRequest.params)\n            .map {\n                if (it.code() == 200) {\n                    it.body()!!.data\n                } else {\n                    emptyList()\n                }\n            }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r64;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}
