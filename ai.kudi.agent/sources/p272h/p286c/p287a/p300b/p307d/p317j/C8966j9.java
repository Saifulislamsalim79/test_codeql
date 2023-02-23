package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.j9 */
/* loaded from: classes2.dex */
public final class C8966j9 extends C8821a implements InterfaceC8998lb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8966j9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8998lb
    /* renamed from: x0 */
    public final C8950i8 mo15658x0(InterfaceC2987a interfaceC2987a, C8918g6 c8918g6) throws RemoteException {
        C8950i8 c8950i8;
        Parcel m15839m = m15839m();
        C8838b1.m15811b(m15839m, interfaceC2987a);
        C8838b1.m15812a(m15839m, c8918g6);
        Parcel m15838n = m15838n(1, m15839m);
        IBinder readStrongBinder = m15838n.readStrongBinder();
        if (readStrongBinder == null) {
            c8950i8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            c8950i8 = queryLocalInterface instanceof C8950i8 ? (C8950i8) queryLocalInterface : new C8950i8(readStrongBinder);
        }
        m15838n.recycle();
        return c8950i8;
    }
}
