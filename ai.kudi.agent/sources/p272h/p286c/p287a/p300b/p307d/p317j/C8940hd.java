package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.hd */
/* loaded from: classes2.dex */
public final class C8940hd extends C8821a implements InterfaceC8970jd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8940hd(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8970jd
    /* renamed from: O */
    public final C8925gd mo15694O(InterfaceC2987a interfaceC2987a, C8865cd c8865cd) throws RemoteException {
        C8925gd c8925gd;
        Parcel m15839m = m15839m();
        C8838b1.m15811b(m15839m, interfaceC2987a);
        C8838b1.m15812a(m15839m, c8865cd);
        Parcel m15838n = m15838n(1, m15839m);
        IBinder readStrongBinder = m15838n.readStrongBinder();
        if (readStrongBinder == null) {
            c8925gd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            c8925gd = queryLocalInterface instanceof C8925gd ? (C8925gd) queryLocalInterface : new C8925gd(readStrongBinder);
        }
        m15838n.recycle();
        return c8925gd;
    }
}
