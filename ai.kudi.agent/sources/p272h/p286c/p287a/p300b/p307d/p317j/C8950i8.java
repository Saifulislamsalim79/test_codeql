package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.i8 */
/* loaded from: classes2.dex */
public final class C8950i8 extends C8821a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8950i8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    /* renamed from: p1 */
    public final void m15699p1() throws RemoteException {
        m15837o(3, m15839m());
    }

    /* renamed from: q1 */
    public final C8886e4[] m15698q1(InterfaceC2987a interfaceC2987a, C9030nd c9030nd) throws RemoteException {
        Parcel m15839m = m15839m();
        C8838b1.m15811b(m15839m, interfaceC2987a);
        C8838b1.m15812a(m15839m, c9030nd);
        Parcel m15838n = m15838n(1, m15839m);
        C8886e4[] c8886e4Arr = (C8886e4[]) m15838n.createTypedArray(C8886e4.CREATOR);
        m15838n.recycle();
        return c8886e4Arr;
    }

    /* renamed from: r1 */
    public final C8886e4[] m15697r1(InterfaceC2987a interfaceC2987a, InterfaceC2987a interfaceC2987a2, InterfaceC2987a interfaceC2987a3, int i, int i2, int i3, int i4, int i5, int i6, C9030nd c9030nd) throws RemoteException {
        Parcel m15839m = m15839m();
        C8838b1.m15811b(m15839m, interfaceC2987a);
        C8838b1.m15811b(m15839m, interfaceC2987a2);
        C8838b1.m15811b(m15839m, interfaceC2987a3);
        m15839m.writeInt(i);
        m15839m.writeInt(i2);
        m15839m.writeInt(i3);
        m15839m.writeInt(i4);
        m15839m.writeInt(i5);
        m15839m.writeInt(i6);
        C8838b1.m15812a(m15839m, c9030nd);
        Parcel m15838n = m15838n(4, m15839m);
        C8886e4[] c8886e4Arr = (C8886e4[]) m15838n.createTypedArray(C8886e4.CREATOR);
        m15838n.recycle();
        return c8886e4Arr;
    }
}
