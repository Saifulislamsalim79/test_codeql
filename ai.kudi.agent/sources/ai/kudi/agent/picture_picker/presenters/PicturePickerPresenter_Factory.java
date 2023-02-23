package ai.kudi.agent.picture_picker.presenters;

import ai.kudi.agent.register.domain.usecases.SaveImage;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PicturePickerPresenter_Factory implements InterfaceC9468d<PicturePickerPresenter> {
    private final InterfaceC11700a<SaveImage> saveImageProvider;

    public PicturePickerPresenter_Factory(InterfaceC11700a interfaceC11700a) {
        this.saveImageProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PicturePickerPresenter_Factory create(InterfaceC11700a interfaceC11700a) {
        PicturePickerPresenter_Factory $r1 = new PicturePickerPresenter_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PicturePickerPresenter newInstance(SaveImage saveImage) {
        PicturePickerPresenter $r1 = new PicturePickerPresenter(saveImage);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PicturePickerPresenter multiply() {
        InterfaceC11700a $r1 = this.saveImageProvider;
        Object $r2 = $r1.get();
        SaveImage $r3 = (SaveImage) $r2;
        PicturePickerPresenter $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40012multiply() {
        PicturePickerPresenter $r1 = multiply();
        return $r1;
    }
}
