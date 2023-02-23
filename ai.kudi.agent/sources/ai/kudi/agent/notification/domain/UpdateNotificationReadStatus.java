package ai.kudi.agent.notification.domain;

import ai.kudi.agent.core.data.remote.CoreApiService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.notification.data.model.NotificationModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
import retrofit2.C14840l;
/* compiled from: UpdateNotificationReadStatus.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/notification/domain/UpdateNotificationReadStatus;", "", "networkService", "Lai/kudi/agent/core/data/remote/CoreApiService;", "(Lai/kudi/agent/core/data/remote/CoreApiService;)V", "getNetworkService", "()Lai/kudi/agent/core/data/remote/CoreApiService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/notification/data/model/NotificationModel;", "notificationId", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class UpdateNotificationReadStatus {
    private final CoreApiService networkService;

    public UpdateNotificationReadStatus(CoreApiService coreApiService) {
        Log_OC.getArray(coreApiService, "networkService");
        this.networkService = coreApiService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final NotificationModel m39843execute$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 == 200) {
            Object $r2 = c14840l.m284a();
            Log_OC.append($r2);
            return (NotificationModel) ((APIResponse) $r2).data;
        }
        HashMap $r0 = new HashMap();
        NotificationModel $r4 = new NotificationModel(null, null, null, null, null, null, false, false, $r0, 255, null);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "notificationId");
        CoreApiService $r2 = this.networkService;
        AbstractC11688p $r3 = $r2.updateReadNotification(str);
        Type $r4 = Type.GRIDSET;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        Item $r5 = ClassWriter.LogError();
        AbstractC11688p $r33 = $r32.h0($r5);
        Item $r52 = ContextUtils.LogError();
        AbstractC11688p $r34 = $r33.R($r52);
        Log_OC.loadImage($r34, "networkService.updateReadNotification(notificationId = notificationId)\n            .map {\n                if (it.code() == 200) {\n                    it.body()!!.data\n                } else {\n                    NotificationModel(dateView = hashMapOf())\n                }\n            }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r34;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CoreApiService getNetworkService() {
        CoreApiService r1 = this.networkService;
        return r1;
    }
}
