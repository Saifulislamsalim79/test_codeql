package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.core.internal.modules.PictureUploadModule;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.usecases.CheckPermission;
import ai.kudi.agent.core.usecases.RequestPermission;
import ai.kudi.agent.register.domain.usecases.SaveImage;
import ai.kudi.agent.register.navigators.ImageSelectorNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.data.PictureUploadViewData;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import ai.kudi.mediaservice.utils.ProgressRequestBody;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.Object;
/* compiled from: PictureUploadViewModel.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J3\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001fR\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/PictureUploadViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/PictureUploadViewData;", "Lai/kudi/mediaservice/utils/ProgressRequestBody$UploadCallbacks;", "saveImage", "Lai/kudi/agent/register/domain/usecases/SaveImage;", "hasStoragePermission", "Lai/kudi/agent/core/usecases/CheckPermission;", "hasCameraPermission", "imageSelectorNavigator", "Lai/kudi/agent/register/navigators/ImageSelectorNavigator;", "(Lai/kudi/agent/register/domain/usecases/SaveImage;Lai/kudi/agent/core/usecases/CheckPermission;Lai/kudi/agent/core/usecases/CheckPermission;Lai/kudi/agent/register/navigators/ImageSelectorNavigator;)V", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "(Landroidx/fragment/app/Fragment;)V", "initialData", "onProgressUpdate", "", "percentage", "", "requestCameraPermission", "requestForStoragePermission", "selectPictureFromCamera", "selectPictureFromFile", "uploadImage", "currentPhotoPath", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isSuccessful", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.PictureUploadViewModel */
/* loaded from: classes.dex */
public final class PictureUploadViewModel extends BaseViewModel<PictureUploadViewData> implements ProgressRequestBody.UploadCallbacks {
    public Fragment fragment;
    private final CheckPermission hasCameraPermission;
    private final CheckPermission hasStoragePermission;
    private final ImageSelectorNavigator imageSelectorNavigator;
    private final SaveImage saveImage;

    public PictureUploadViewModel(SaveImage saveImage, CheckPermission checkPermission, CheckPermission checkPermission2, ImageSelectorNavigator imageSelectorNavigator) {
        Log_OC.getArray(saveImage, "saveImage");
        Log_OC.getArray(checkPermission, "hasStoragePermission");
        Log_OC.getArray(checkPermission2, "hasCameraPermission");
        Log_OC.getArray(imageSelectorNavigator, "imageSelectorNavigator");
        this.saveImage = saveImage;
        this.hasStoragePermission = checkPermission;
        this.hasCameraPermission = checkPermission2;
        this.imageSelectorNavigator = imageSelectorNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestCameraPermission() {
        PictureUploadModule.Companion $r2 = PictureUploadModule.Companion;
        Fragment $r3 = getFragment();
        RequestPermission $r4 = $r2.providesCameraPermission($r3);
        Boolean $r5 = Boolean.TRUE;
        AbstractC11688p $r6 = $r4.execute($r5);
        Lock $r7 = Lock.lock;
        FalseFileFilter $r1 = FalseFileFilter.INSTANCE;
        FavoritesArrayAdapter $r8 = $r6.e0($r7, $r1);
        Log_OC.loadImage($r8, "PictureUploadModule.providesCameraPermission(fragment)\n            .execute(true).subscribe({}, {})");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestCameraPermission$lambda-4  reason: not valid java name */
    public static final void m40428requestCameraPermission$lambda4(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestCameraPermission$lambda-5  reason: not valid java name */
    public static final void m40429requestCameraPermission$lambda5(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestForStoragePermission() {
        PictureUploadModule.Companion $r2 = PictureUploadModule.Companion;
        Fragment $r3 = getFragment();
        RequestPermission $r4 = $r2.providesStoragePermission($r3);
        Boolean $r5 = Boolean.TRUE;
        AbstractC11688p $r6 = $r4.execute($r5);
        Logger $r7 = Logger.log;
        LogLevel $r1 = LogLevel.SEVERE;
        FavoritesArrayAdapter $r8 = $r6.e0($r7, $r1);
        Log_OC.loadImage($r8, "PictureUploadModule.providesStoragePermission(fragment)\n            .execute(true).subscribe({}, {})");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestForStoragePermission$lambda-6  reason: not valid java name */
    public static final void m40430requestForStoragePermission$lambda6(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestForStoragePermission$lambda-7  reason: not valid java name */
    public static final void m40431requestForStoragePermission$lambda7(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: selectPictureFromCamera$lambda-2  reason: not valid java name */
    public static final void m40432selectPictureFromCamera$lambda2(PictureUploadViewModel pictureUploadViewModel, Boolean bool) {
        Log_OC.getArray(pictureUploadViewModel, "this$0");
        Log_OC.loadImage(bool, "hasPermission");
        boolean $z0 = bool.booleanValue();
        if (!$z0) {
            pictureUploadViewModel.requestCameraPermission();
            return;
        }
        ImageSelectorNavigator $r2 = pictureUploadViewModel.imageSelectorNavigator;
        $r2.openFromCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: selectPictureFromFile$lambda-0  reason: not valid java name */
    public static final void m40434selectPictureFromFile$lambda0(PictureUploadViewModel pictureUploadViewModel, Boolean bool) {
        Log_OC.getArray(pictureUploadViewModel, "this$0");
        Log_OC.loadImage(bool, "hasPermission");
        boolean $z0 = bool.booleanValue();
        if (!$z0) {
            pictureUploadViewModel.requestForStoragePermission();
            return;
        }
        ImageSelectorNavigator $r2 = pictureUploadViewModel.imageSelectorNavigator;
        $r2.openFromFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-10  reason: not valid java name */
    public static final void m40436uploadImage$lambda10(InterfaceC11767l interfaceC11767l, PictureUploadViewModel pictureUploadViewModel, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        Log_OC.getArray(pictureUploadViewModel, "this$0");
        th.printStackTrace();
        Boolean $r4 = Boolean.FALSE;
        interfaceC11767l.invoke($r4);
        PictureUploadViewData.Error $r1 = new PictureUploadViewData.Error("Image upload failed. Please try again.");
        ViewData $r5 = pictureUploadViewModel.getState();
        PictureUploadViewData $r6 = (PictureUploadViewData) $r5;
        pictureUploadViewModel.publish(PictureUploadViewData.copy$default($r6, 0, false, null, $r1, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-8  reason: not valid java name */
    public static final void m40437uploadImage$lambda8(PictureUploadViewModel pictureUploadViewModel) {
        Log_OC.getArray(pictureUploadViewModel, "this$0");
        ViewData $r1 = pictureUploadViewModel.getState();
        PictureUploadViewData $r2 = (PictureUploadViewData) $r1;
        pictureUploadViewModel.publish(PictureUploadViewData.copy$default($r2, 0, false, null, null, 13, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadImage$lambda-9  reason: not valid java name */
    public static final void m40438uploadImage$lambda9(InterfaceC11767l interfaceC11767l, PictureUploadViewModel pictureUploadViewModel, FileUploadResponse fileUploadResponse) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        Log_OC.getArray(pictureUploadViewModel, "this$0");
        Boolean $r4 = Boolean.TRUE;
        interfaceC11767l.invoke($r4);
        ViewData $r5 = pictureUploadViewModel.getState();
        PictureUploadViewData $r6 = (PictureUploadViewData) $r5;
        String $r7 = fileUploadResponse.getId();
        PictureUploadViewData.UploadedImageStatus $r2 = new PictureUploadViewData.UploadedImageStatus($r7);
        pictureUploadViewModel.publish(PictureUploadViewData.copy$default($r6, 0, false, $r2, null, 11, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Fragment getFragment() {
        Fragment $r1 = this.fragment;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("fragment");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PictureUploadViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PictureUploadViewData initialData() {
        PictureUploadViewData $r1 = new PictureUploadViewData(0, false, null, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.mediaservice.utils.ProgressRequestBody.UploadCallbacks
    public void onProgressUpdate(int i) {
        ViewData $r1 = getState();
        PictureUploadViewData $r2 = (PictureUploadViewData) $r1;
        publish(PictureUploadViewData.copy$default($r2, i, false, null, null, 14, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void selectPictureFromCamera() {
        CheckPermission $r2 = this.hasCameraPermission;
        AbstractC11688p $r3 = $r2.execute();
        Object object = new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.OfflineMessageManager$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PictureUploadViewModel $r1 = PictureUploadViewModel.this;
                Boolean $r32 = (Boolean) obj;
                PictureUploadViewModel.m40432selectPictureFromCamera$lambda2($r1, $r32);
            }
        };
        C0440b $r1 = C0440b.f1082e;
        FavoritesArrayAdapter $r5 = $r3.e0(object, $r1);
        Log_OC.loadImage($r5, "hasCameraPermission.execute()\n            .subscribe(\n                { hasPermission ->\n                    if (hasPermission) {\n                        imageSelectorNavigator.openFromCamera()\n                    } else {\n                        requestCameraPermission()\n                    }\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void selectPictureFromFile() {
        CheckPermission $r2 = this.hasStoragePermission;
        AbstractC11688p $r3 = $r2.execute();
        Object object = new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PictureUploadViewModel $r1 = PictureUploadViewModel.this;
                Boolean $r32 = (Boolean) obj;
                PictureUploadViewModel.m40434selectPictureFromFile$lambda0($r1, $r32);
            }
        };
        Quaternion $r1 = Quaternion.f1071K;
        FavoritesArrayAdapter $r5 = $r3.e0(object, $r1);
        Log_OC.loadImage($r5, "hasStoragePermission.execute()\n            .subscribe(\n                { hasPermission ->\n                    if (hasPermission) {\n                        imageSelectorNavigator.openFromFile()\n                    } else {\n                        requestForStoragePermission()\n                    }\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    public final void setFragment(Fragment fragment) {
        Log_OC.getArray(fragment, "<set-?>");
        this.fragment = fragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void uploadImage(String str, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "callback");
        ViewData $r3 = getState();
        PictureUploadViewData $r4 = (PictureUploadViewData) $r3;
        publish(PictureUploadViewData.copy$default($r4, 0, true, null, null, 1, null));
        SaveImage $r5 = this.saveImage;
        SaveImage $r52 = $r5.setProgressCallback(this);
        Log_OC.append(str);
        AbstractC11688p $r6 = $r52.execute(str);
        FavoritesArrayAdapter $r10 = $r6.m10486v(new InterfaceC11287a() { // from class: ai.kudi.agent.register.ui.viewmodels.NumberPicker$TwoDigitFormatter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void format() {
                PictureUploadViewModel $r1 = PictureUploadViewModel.this;
                PictureUploadViewModel.m40437uploadImage$lambda8($r1);
            }
        }).e0(new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                PictureUploadViewModel $r2 = this;
                FileUploadResponse $r42 = (FileUploadResponse) obj;
                PictureUploadViewModel.m40438uploadImage$lambda9($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                PictureUploadViewModel $r2 = this;
                Throwable $r42 = (Throwable) obj;
                PictureUploadViewModel.m40436uploadImage$lambda10($r1, $r2, $r42);
            }
        });
        Log_OC.loadImage($r10, "saveImage\n            .setProgressCallback(this)\n            .execute(currentPhotoPath!!)\n            .doFinally { publish(state.copy(isUploadingPicture = false)) }\n            .subscribe(\n                {\n                    callback(true)\n                    publish(\n                        state.copy(\n                            uploadedImageStatus = UploadedImageStatus(\n                                uploadedImageId = it.id\n                            )\n                        )\n                    )\n\n                },\n                {\n                    it.printStackTrace()\n                    callback(false)\n                    publish(state.copy(uploadedImageStatus = null,\n                        isUploadingPicture = false, error = Error(\n                        message = \"Image upload failed. Please try again.\")))\n                }\n            )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }
}
