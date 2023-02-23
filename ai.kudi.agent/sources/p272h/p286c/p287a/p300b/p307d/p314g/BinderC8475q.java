package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC2764e;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.C4117e;
/* renamed from: h.c.a.b.d.g.q */
/* loaded from: classes2.dex */
final class BinderC8475q extends AbstractBinderC8465g {

    /* renamed from: a */
    private InterfaceC2764e<C4117e> f20175a;

    public BinderC8475q(InterfaceC2764e<C4117e> interfaceC2764e) {
        s.b(interfaceC2764e != null, "listener can't be null.");
        this.f20175a = interfaceC2764e;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p314g.InterfaceC8464f
    /* renamed from: Y */
    public final void mo16055Y(C4117e c4117e) throws RemoteException {
        this.f20175a.mo32039a(c4117e);
        this.f20175a = null;
    }
}
