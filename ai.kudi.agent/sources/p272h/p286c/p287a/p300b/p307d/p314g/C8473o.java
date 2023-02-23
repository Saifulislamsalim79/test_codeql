package p272h.p286c.p287a.p300b.p307d.p314g;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.internal.InterfaceC2764e;
import com.google.android.gms.common.internal.C2867e;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.C4112c;
import com.google.android.gms.location.C4117e;
/* renamed from: h.c.a.b.d.g.o */
/* loaded from: classes2.dex */
public final class C8473o extends C8484z {

    /* renamed from: C */
    private final C8466h f20174C;

    public C8473o(Context context, Looper looper, AbstractC2743d.a aVar, AbstractC2743d.b bVar, String str, C2867e c2867e) {
        super(context, looper, aVar, bVar, str, c2867e);
        this.f20174C = new C8466h(context, this.f20193B);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    public final void disconnect() {
        synchronized (this.f20174C) {
            if (isConnected()) {
                try {
                    this.f20174C.m16064b();
                    this.f20174C.m16062d();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    /* renamed from: l0 */
    public final Location m16058l0() throws RemoteException {
        return this.f20174C.m16065a();
    }

    /* renamed from: m0 */
    public final void m16057m0(C4112c c4112c, InterfaceC2764e<C4117e> interfaceC2764e, String str) throws RemoteException {
        m31776q();
        s.b(c4112c != null, "locationSettingsRequest can't be null nor empty.");
        s.b(interfaceC2764e != null, "listener can't be null.");
        ((InterfaceC8460d) m31814C()).mo16067m1(c4112c, new BinderC8475q(interfaceC2764e), str);
    }
}
