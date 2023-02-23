package ai.kudi.agent.register.domain.usecases;

import ai.kudi.mediaservice.DrakeClient;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SaveImage_Factory implements InterfaceC9468d<SaveImage> {
    private final InterfaceC11700a<DrakeClient> mediaServiceProvider;

    public SaveImage_Factory(InterfaceC11700a interfaceC11700a) {
        this.mediaServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SaveImage_Factory create(InterfaceC11700a interfaceC11700a) {
        SaveImage_Factory $r1 = new SaveImage_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SaveImage newInstance(DrakeClient drakeClient) {
        SaveImage $r1 = new SaveImage(drakeClient);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SaveImage multiply() {
        InterfaceC11700a $r1 = this.mediaServiceProvider;
        Object $r2 = $r1.get();
        DrakeClient $r3 = (DrakeClient) $r2;
        SaveImage $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40351multiply() {
        SaveImage $r1 = multiply();
        return $r1;
    }
}
