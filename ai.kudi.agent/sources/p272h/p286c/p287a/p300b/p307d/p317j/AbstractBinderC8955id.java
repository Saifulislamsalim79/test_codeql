package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.id */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC8955id extends BinderC8837b0 implements InterfaceC8970jd {
    /* renamed from: m */
    public static InterfaceC8970jd m15696m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return queryLocalInterface instanceof InterfaceC8970jd ? (InterfaceC8970jd) queryLocalInterface : new C8940hd(iBinder);
    }
}
