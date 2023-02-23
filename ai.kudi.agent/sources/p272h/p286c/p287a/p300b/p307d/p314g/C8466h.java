package p272h.p286c.p287a.p300b.p307d.p314g;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C2778j;
import java.util.HashMap;
import java.util.Map;
/* renamed from: h.c.a.b.d.g.h */
/* loaded from: classes2.dex */
public final class C8466h {

    /* renamed from: a */
    private final InterfaceC8480v<InterfaceC8460d> f20165a;

    /* renamed from: b */
    private final Context f20166b;

    /* renamed from: c */
    private boolean f20167c = false;

    /* renamed from: d */
    private final Map<C2778j.C2779a<Object>, BinderC8471m> f20168d = new HashMap();

    /* renamed from: e */
    private final Map<C2778j.C2779a<Object>, BinderC8470l> f20169e = new HashMap();

    /* renamed from: f */
    private final Map<C2778j.C2779a<Object>, BinderC8467i> f20170f = new HashMap();

    public C8466h(Context context, InterfaceC8480v<InterfaceC8460d> interfaceC8480v) {
        this.f20166b = context;
        this.f20165a = interfaceC8480v;
    }

    /* renamed from: a */
    public final Location m16065a() throws RemoteException {
        this.f20165a.mo16052a();
        return this.f20165a.mo16051b().mo16068e(this.f20166b.getPackageName());
    }

    /* renamed from: b */
    public final void m16064b() throws RemoteException {
        synchronized (this.f20168d) {
            for (BinderC8471m binderC8471m : this.f20168d.values()) {
                if (binderC8471m != null) {
                    this.f20165a.mo16051b().mo16069W0(C8478t.m16053h(binderC8471m, null));
                }
            }
            this.f20168d.clear();
        }
        synchronized (this.f20170f) {
            for (BinderC8467i binderC8467i : this.f20170f.values()) {
                if (binderC8467i != null) {
                    this.f20165a.mo16051b().mo16069W0(C8478t.m16054f(binderC8467i, null));
                }
            }
            this.f20170f.clear();
        }
        synchronized (this.f20169e) {
            for (BinderC8470l binderC8470l : this.f20169e.values()) {
                if (binderC8470l != null) {
                    this.f20165a.mo16051b().mo16066p0(new C8461d0(2, null, binderC8470l.asBinder(), null));
                }
            }
            this.f20169e.clear();
        }
    }

    /* renamed from: c */
    public final void m16063c(boolean z) throws RemoteException {
        this.f20165a.mo16052a();
        this.f20165a.mo16051b().mo16070Q0(z);
        this.f20167c = z;
    }

    /* renamed from: d */
    public final void m16062d() throws RemoteException {
        if (this.f20167c) {
            m16063c(false);
        }
    }
}
