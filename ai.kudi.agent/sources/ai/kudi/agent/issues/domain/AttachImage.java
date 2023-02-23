package ai.kudi.agent.issues.domain;

import ai.kudi.agent.core.data.remote.CoreApiService;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: AttachImage.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/issues/domain/AttachImage;", "", "networkService", "Lai/kudi/agent/core/data/remote/CoreApiService;", "(Lai/kudi/agent/core/data/remote/CoreApiService;)V", "getNetworkService", "()Lai/kudi/agent/core/data/remote/CoreApiService;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/issues/data/model/Issue;", "sessionId", "", "ticketId", "files", "", "Lokhttp3/MultipartBody$Part;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AttachImage {
    private final CoreApiService networkService;

    public AttachImage(CoreApiService coreApiService) {
        Log_OC.getArray(coreApiService, "networkService");
        this.networkService = coreApiService;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2, List list) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "ticketId");
        Log_OC.getArray(list, "files");
        CoreApiService $r4 = this.networkService;
        AbstractC11688p $r5 = $r4.attachImage(str, str2, list);
        Item $r6 = ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "networkService.attachImage(sessionId, ticketId, files)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CoreApiService getNetworkService() {
        CoreApiService r1 = this.networkService;
        return r1;
    }
}
