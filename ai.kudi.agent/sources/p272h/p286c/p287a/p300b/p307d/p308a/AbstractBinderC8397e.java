package p272h.p286c.p287a.p300b.p307d.p308a;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: h.c.a.b.d.a.e */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC8397e extends BinderC8394b implements InterfaceC8396d {
    /* renamed from: m */
    public static InterfaceC8396d m16137m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof InterfaceC8396d ? (InterfaceC8396d) queryLocalInterface : new C8398f(iBinder);
    }
}
