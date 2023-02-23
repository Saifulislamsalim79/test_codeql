package ai.kudi.agent.p036v2.common.domain.usecases;

import ai.kudi.mediaservice.marketplaceCollection.FileStorageClient;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.UploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.utils.FileProgressRequestBody;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: FileUpload.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/usecases/FileUpload;", "", "mediaService", "Lai/kudi/mediaservice/marketplaceCollection/FileStorageClient;", "(Lai/kudi/mediaservice/marketplaceCollection/FileStorageClient;)V", "progressCallback", "Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody$UploadCallbacks;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/mediaservice/marketplaceCollection/response/UploadResponse;", "mediaPath", "", "setProgressCallback", "callback", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.usecases.FileUpload */
/* loaded from: classes.dex */
public final class FileUpload {
    private final FileStorageClient mediaService;
    private FileProgressRequestBody.UploadCallbacks progressCallback;

    public FileUpload(FileStorageClient fileStorageClient) {
        Log_OC.getArray(fileStorageClient, "mediaService");
        this.mediaService = fileStorageClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final UploadResponse m41535execute$lambda0(UploadResponse uploadResponse) {
        Log_OC.getArray(uploadResponse, "it");
        FileUploadResponse $r2 = uploadResponse.getFileUploadResponse();
        String $r3 = uploadResponse.getErrorResponseMessage();
        UploadResponse $r1 = new UploadResponse($r2, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "mediaPath");
        FileStorageClient $r3 = this.mediaService;
        FileProgressRequestBody.UploadCallbacks $r1 = this.progressCallback;
        AbstractC11688p $r4 = $r3.uploadFile(str, $r1);
        Type $r5 = Type.GRIDSET;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        Item $r6 = ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "mediaService.uploadFile(mediaPath, progressCallback)\n            .map { UploadResponse(it.fileUploadResponse, it.errorResponseMessage) }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }

    public final FileUpload setProgressCallback(FileProgressRequestBody.UploadCallbacks uploadCallbacks) {
        Log_OC.getArray(uploadCallbacks, "callback");
        this.progressCallback = uploadCallbacks;
        return this;
    }
}
