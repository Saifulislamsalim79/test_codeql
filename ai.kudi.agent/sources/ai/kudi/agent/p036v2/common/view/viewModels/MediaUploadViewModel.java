package ai.kudi.agent.p036v2.common.view.viewModels;

import ai.kudi.agent.p036v2.common.domain.usecases.FileUpload;
import ai.kudi.agent.p036v2.common.view.viewData.MediaUploadViewData;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.UploadResponse;
import androidx.lifecycle.Extension;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: MediaUploadViewModel.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/viewModels/MediaUploadViewModel;", "Landroidx/lifecycle/ViewModel;", "fileUpload", "Lai/kudi/agent/v2/common/domain/usecases/FileUpload;", "(Lai/kudi/agent/v2/common/domain/usecases/FileUpload;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "mediaUploadViewData", "Lio/reactivex/subjects/PublishSubject;", "Lai/kudi/agent/v2/common/view/viewData/MediaUploadViewData;", "getMediaUploadViewData", "()Lio/reactivex/subjects/PublishSubject;", "setMediaUploadViewData", "(Lio/reactivex/subjects/PublishSubject;)V", "initialData", "", "onCleared", "stopFileUpload", "uploadImage", "filePath", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.viewModels.MediaUploadViewModel */
/* loaded from: classes.dex */
public final class MediaUploadViewModel extends Extension {
    private FavoritesArrayAdapter disposable;
    private final FileUpload fileUpload;
    private C11680b<MediaUploadViewData> mediaUploadViewData;

    public MediaUploadViewModel(FileUpload fileUpload) {
        Log_OC.getArray(fileUpload, "fileUpload");
        this.fileUpload = fileUpload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-0  reason: not valid java name */
    public static final void m41563uploadImage$lambda0(MediaUploadViewModel mediaUploadViewModel, UploadResponse uploadResponse) {
        Log_OC.getArray(mediaUploadViewModel, "this$0");
        C11680b $r2 = mediaUploadViewModel.getMediaUploadViewData();
        if ($r2 == null) {
            return;
        }
        FileUploadResponse $r4 = uploadResponse.getFileUploadResponse();
        String $r6 = $r4 == null ? null : $r4.getId();
        FileUploadResponse $r42 = uploadResponse.getFileUploadResponse();
        String $r5 = $r42 != null ? $r42.getUri() : null;
        String $r7 = uploadResponse.getErrorResponseMessage();
        MediaUploadViewData.UploadResponse $r3 = new MediaUploadViewData.UploadResponse(true, $r6, $r5, $r7);
        $r2.mo331f($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-1  reason: not valid java name */
    public static final void m41564uploadImage$lambda1(MediaUploadViewModel mediaUploadViewModel, Throwable th) {
        Log_OC.getArray(mediaUploadViewModel, "this$0");
        th.printStackTrace();
        C11680b $r2 = mediaUploadViewModel.getMediaUploadViewData();
        if ($r2 == null) {
            return;
        }
        String $r4 = th.getLocalizedMessage();
        MediaUploadViewData.UploadResponse $r3 = new MediaUploadViewData.UploadResponse(false, null, null, $r4);
        $r2.mo331f($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getMediaUploadViewData() {
        C11680b r1 = this.mediaUploadViewData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void initialData() {
        C11680b $r1 = C11680b.m10564v0();
        this.mediaUploadViewData = $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.lifecycle.Extension
    public void onCleared() {
        super.onCleared();
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 != null) {
            $r1.backup();
        }
        this.disposable = null;
    }

    public final void setMediaUploadViewData(C11680b c11680b) {
        this.mediaUploadViewData = c11680b;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void stopFileUpload() {
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void uploadImage(String str) {
        Log_OC.getArray(str, "filePath");
        FileUpload $r3 = this.fileUpload;
        AbstractC11688p $r4 = $r3.execute(str);
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.v2.common.view.viewModels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MediaUploadViewModel $r1 = MediaUploadViewModel.this;
                UploadResponse $r32 = (UploadResponse) obj;
                MediaUploadViewModel.m41563uploadImage$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.common.view.viewModels.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MediaUploadViewModel $r1 = MediaUploadViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MediaUploadViewModel.m41564uploadImage$lambda1($r1, $r32);
            }
        });
        this.disposable = $r6;
    }
}
