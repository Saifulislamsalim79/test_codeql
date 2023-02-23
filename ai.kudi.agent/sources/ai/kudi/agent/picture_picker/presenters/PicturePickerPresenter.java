package ai.kudi.agent.picture_picker.presenters;

import ai.kudi.agent.picture_picker.views.PicturePickerView;
import ai.kudi.agent.register.domain.usecases.SaveImage;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: PicturePickerPresenter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\tJ_\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2O\u0010\u000e\u001aK\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\t0\u000fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/picture_picker/presenters/PicturePickerPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/picture_picker/views/PicturePickerView;", "saveImage", "Lai/kudi/agent/register/domain/usecases/SaveImage;", "(Lai/kudi/agent/register/domain/usecases/SaveImage;)V", "mediaServiceUploadDisposable", "Lio/reactivex/disposables/Disposable;", "destroy", "", "stopImageUpload", "uploadImage", "currentPhotoPath", "", "callback", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "isSuccessful", "pictureId", "pictureUrl", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PicturePickerPresenter extends C9410b<PicturePickerView> {
    private FavoritesArrayAdapter mediaServiceUploadDisposable;
    private final SaveImage saveImage;

    public PicturePickerPresenter(SaveImage saveImage) {
        Log_OC.getArray(saveImage, "saveImage");
        this.saveImage = saveImage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-0  reason: not valid java name */
    public static final void m40010uploadImage$lambda0(InterfaceC11772q interfaceC11772q, FileUploadResponse fileUploadResponse) {
        Log_OC.getArray(interfaceC11772q, "$callback");
        Boolean $r2 = Boolean.TRUE;
        String $r3 = fileUploadResponse.getId();
        String $r4 = fileUploadResponse.getUri();
        interfaceC11772q.invoke($r2, $r3, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-1  reason: not valid java name */
    public static final void m40011uploadImage$lambda1(InterfaceC11772q interfaceC11772q, Throwable th) {
        Log_OC.getArray(interfaceC11772q, "$callback");
        th.printStackTrace();
        Boolean $r2 = Boolean.FALSE;
        interfaceC11772q.invoke($r2, null, null);
    }

    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        stopImageUpload();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void stopImageUpload() {
        FavoritesArrayAdapter $r1 = this.mediaServiceUploadDisposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void uploadImage(String str, final InterfaceC11772q interfaceC11772q) {
        Log_OC.getArray(str, "currentPhotoPath");
        Log_OC.getArray(interfaceC11772q, "callback");
        SaveImage $r4 = this.saveImage;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.picture_picker.presenters.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11772q $r1 = InterfaceC11772q.this;
                FileUploadResponse $r3 = (FileUploadResponse) obj;
                PicturePickerPresenter.m40010uploadImage$lambda0($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.picture_picker.presenters.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11772q $r1 = InterfaceC11772q.this;
                Throwable $r3 = (Throwable) obj;
                PicturePickerPresenter.m40011uploadImage$lambda1($r1, $r3);
            }
        });
        this.mediaServiceUploadDisposable = $r7;
    }
}
