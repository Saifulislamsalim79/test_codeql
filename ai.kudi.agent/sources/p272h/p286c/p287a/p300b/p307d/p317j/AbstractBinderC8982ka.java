package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.ka */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC8982ka extends BinderC8837b0 implements InterfaceC8998lb {
    /* renamed from: m */
    public static InterfaceC8998lb m15680m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        return queryLocalInterface instanceof InterfaceC8998lb ? (InterfaceC8998lb) queryLocalInterface : new C8966j9(iBinder);
    }
}
