package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.gd */
/* loaded from: classes2.dex */
public final class C8925gd extends C8821a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8925gd(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    /* renamed from: p1 */
    public final List m15705p1(InterfaceC2987a interfaceC2987a, C9189yc c9189yc) throws RemoteException {
        Parcel m15839m = m15839m();
        C8838b1.m15811b(m15839m, interfaceC2987a);
        C8838b1.m15812a(m15839m, c9189yc);
        Parcel m15838n = m15838n(3, m15839m);
        ArrayList createTypedArrayList = m15838n.createTypedArrayList(C8895ed.CREATOR);
        m15838n.recycle();
        return createTypedArrayList;
    }

    /* renamed from: q1 */
    public final void m15704q1() throws RemoteException {
        m15837o(1, m15839m());
    }

    /* renamed from: r1 */
    public final void m15703r1() throws RemoteException {
        m15837o(2, m15839m());
    }
}
