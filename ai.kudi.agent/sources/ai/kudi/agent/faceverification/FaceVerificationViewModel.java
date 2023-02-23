package ai.kudi.agent.faceverification;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.presentation.viewdata.KShockViewData;
import ai.kudi.agent.register.domain.usecases.SaveImage;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: FaceVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bR\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/faceverification/FaceVerificationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/core/mvvm/ViewData;", "saveImage", "Lai/kudi/agent/register/domain/usecases/SaveImage;", "(Lai/kudi/agent/register/domain/usecases/SaveImage;)V", "onPictureUploadFail", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getOnPictureUploadFail", "()Lio/reactivex/subjects/PublishSubject;", "onPictureUploaded", "getOnPictureUploaded", "initialData", "Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "uploadImage", "", "photoPath", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FaceVerificationViewModel extends BaseViewModel<ViewData> {
    private final C11680b<String> onPictureUploadFail;
    private final C11680b<String> onPictureUploaded;
    private final SaveImage saveImage;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FaceVerificationViewModel(SaveImage saveImage) {
        Log_OC.getArray(saveImage, "saveImage");
        this.saveImage = saveImage;
        C11680b $r2 = C11680b.m10564v0();
        Log_OC.loadImage($r2, "create<String>()");
        this.onPictureUploaded = $r2;
        C11680b $r22 = C11680b.m10564v0();
        Log_OC.loadImage($r22, "create<String>()");
        this.onPictureUploadFail = $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-0  reason: not valid java name */
    public static final void m39237uploadImage$lambda0(FaceVerificationViewModel faceVerificationViewModel, FileUploadResponse fileUploadResponse) {
        Log_OC.getArray(faceVerificationViewModel, "this$0");
        C11680b $r2 = faceVerificationViewModel.getOnPictureUploaded();
        String $r3 = fileUploadResponse.getId();
        $r2.mo331f($r3);
        String $r32 = fileUploadResponse.getId();
        Object[] $r4 = new Object[0];
        Timber.wtf(Log_OC.m10359a("pictureId onNext: ", (Object) $r32), $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-1  reason: not valid java name */
    public static final void m39238uploadImage$lambda1(FaceVerificationViewModel faceVerificationViewModel, String str, Throwable th) {
        Log_OC.getArray(faceVerificationViewModel, "this$0");
        Log_OC.getArray(str, "$photoPath");
        C11680b $r2 = faceVerificationViewModel.getOnPictureUploadFail();
        $r2.mo331f(str);
        Timber.reorder(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnPictureUploadFail() {
        C11680b r1 = this.onPictureUploadFail;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnPictureUploaded() {
        C11680b r1 = this.onPictureUploaded;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KShockViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KShockViewData initialData() {
        KShockViewData $r1 = new KShockViewData(false, null, null, null, null, null, 63, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void uploadImage(final String str) {
        Log_OC.getArray(str, "photoPath");
        SaveImage $r4 = this.saveImage;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r6 = $r5.e0(new Object() { // from class: ai.kudi.agent.faceverification.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FaceVerificationViewModel $r1 = FaceVerificationViewModel.this;
                FileUploadResponse $r3 = (FileUploadResponse) obj;
                FaceVerificationViewModel.m39237uploadImage$lambda0($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.faceverification.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FaceVerificationViewModel $r1 = FaceVerificationViewModel.this;
                String $r2 = str;
                Throwable $r42 = (Throwable) obj;
                FaceVerificationViewModel.m39238uploadImage$lambda1($r1, $r2, $r42);
            }
        });
        Log_OC.loadImage($r6, "saveImage.execute(photoPath).subscribe(\n            {\n                onPictureUploaded.onNext(it.id)\n                Timber.d(\"pictureId onNext: ${it.id}\")\n            },\n            { error ->\n                onPictureUploadFail.onNext(photoPath)\n                Timber.e(error)\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }
}
