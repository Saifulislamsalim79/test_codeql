package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.core.usecases.CheckPermission;
import ai.kudi.agent.register.domain.usecases.SaveImage;
import ai.kudi.agent.register.navigators.ImageSelectorNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.ui.viewmodels.PictureUploadViewModel_Factory */
/* loaded from: classes.dex */
public final class PictureUploadViewModel_Factory implements InterfaceC9468d<PictureUploadViewModel> {
    private final InterfaceC11700a<CheckPermission> hasCameraPermissionProvider;
    private final InterfaceC11700a<CheckPermission> hasStoragePermissionProvider;
    private final InterfaceC11700a<ImageSelectorNavigator> imageSelectorNavigatorProvider;
    private final InterfaceC11700a<SaveImage> saveImageProvider;

    public PictureUploadViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.saveImageProvider = interfaceC11700a;
        this.hasStoragePermissionProvider = interfaceC11700a2;
        this.hasCameraPermissionProvider = interfaceC11700a3;
        this.imageSelectorNavigatorProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PictureUploadViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        PictureUploadViewModel_Factory $r4 = new PictureUploadViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PictureUploadViewModel newInstance(SaveImage saveImage, CheckPermission checkPermission, CheckPermission checkPermission2, ImageSelectorNavigator imageSelectorNavigator) {
        PictureUploadViewModel $r4 = new PictureUploadViewModel(saveImage, checkPermission, checkPermission2, imageSelectorNavigator);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PictureUploadViewModel multiply() {
        InterfaceC11700a $r1 = this.saveImageProvider;
        Object $r2 = $r1.get();
        SaveImage $r3 = (SaveImage) $r2;
        InterfaceC11700a $r12 = this.hasStoragePermissionProvider;
        Object $r22 = $r12.get();
        CheckPermission $r4 = (CheckPermission) $r22;
        InterfaceC11700a $r13 = this.hasCameraPermissionProvider;
        Object $r23 = $r13.get();
        CheckPermission $r5 = (CheckPermission) $r23;
        InterfaceC11700a $r14 = this.imageSelectorNavigatorProvider;
        Object $r24 = $r14.get();
        ImageSelectorNavigator $r6 = (ImageSelectorNavigator) $r24;
        PictureUploadViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40439multiply() {
        PictureUploadViewModel $r1 = multiply();
        return $r1;
    }
}
