package ai.kudi.agent.faceverification;

import ai.kudi.agent.register.domain.usecases.SaveImage;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FaceVerificationViewModel_Factory implements InterfaceC9468d<FaceVerificationViewModel> {
    private final InterfaceC11700a<SaveImage> saveImageProvider;

    public FaceVerificationViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.saveImageProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FaceVerificationViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        FaceVerificationViewModel_Factory $r1 = new FaceVerificationViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FaceVerificationViewModel newInstance(SaveImage saveImage) {
        FaceVerificationViewModel $r1 = new FaceVerificationViewModel(saveImage);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FaceVerificationViewModel multiply() {
        InterfaceC11700a $r1 = this.saveImageProvider;
        Object $r2 = $r1.get();
        SaveImage $r3 = (SaveImage) $r2;
        FaceVerificationViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39239multiply() {
        FaceVerificationViewModel $r1 = multiply();
        return $r1;
    }
}
