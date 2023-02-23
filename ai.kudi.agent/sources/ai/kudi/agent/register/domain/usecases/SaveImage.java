package ai.kudi.agent.register.domain.usecases;

import ai.kudi.mediaservice.DrakeClient;
import ai.kudi.mediaservice.dto.MediaUploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import ai.kudi.mediaservice.utils.ProgressRequestBody;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: SaveImage.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/SaveImage;", "", "mediaService", "Lai/kudi/mediaservice/DrakeClient;", "(Lai/kudi/mediaservice/DrakeClient;)V", "progressCallback", "Lai/kudi/mediaservice/utils/ProgressRequestBody$UploadCallbacks;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/mediaservice/marketplaceCollection/response/FileUploadResponse;", "picturePath", "", "setProgressCallback", "callback", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class SaveImage {
    private final DrakeClient mediaService;
    private ProgressRequestBody.UploadCallbacks progressCallback;

    public SaveImage(DrakeClient drakeClient) {
        Log_OC.getArray(drakeClient, "mediaService");
        this.mediaService = drakeClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final FileUploadResponse m40350execute$lambda0(MediaUploadResponse mediaUploadResponse) {
        Log_OC.getArray(mediaUploadResponse, "it");
        String $r2 = mediaUploadResponse.getId();
        String $r3 = mediaUploadResponse.getOriginal();
        FileUploadResponse $r1 = new FileUploadResponse($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "picturePath");
        DrakeClient $r3 = this.mediaService;
        ProgressRequestBody.UploadCallbacks $r1 = this.progressCallback;
        AbstractC11688p $r4 = $r3.uploadImage(str, $r1);
        Label $r5 = Label.f1016b;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "mediaService.uploadImage(picturePath, progressCallback)\n            .map { FileUploadResponse(it.id, it.original) }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }

    public final SaveImage setProgressCallback(ProgressRequestBody.UploadCallbacks uploadCallbacks) {
        Log_OC.getArray(uploadCallbacks, "callback");
        this.progressCallback = uploadCallbacks;
        return this;
    }
}
