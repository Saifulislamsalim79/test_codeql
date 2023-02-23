package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.v8 */
/* loaded from: classes2.dex */
public class C4036v8 {

    /* renamed from: a */
    protected volatile InterfaceC3927o9 f9797a;

    /* renamed from: b */
    private volatile AbstractC3909n7 f9798b;

    static {
        C4099z7.m28538a();
    }

    /* renamed from: a */
    public final int m28739a() {
        if (this.f9798b != null) {
            return ((C3893m7) this.f9798b).f9493e.length;
        }
        if (this.f9797a != null) {
            return this.f9797a.mo29249b();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC3909n7 m28738b() {
        if (this.f9798b != null) {
            return this.f9798b;
        }
        synchronized (this) {
            if (this.f9798b != null) {
                return this.f9798b;
            }
            if (this.f9797a == null) {
                this.f9798b = AbstractC3909n7.f9575d;
            } else {
                this.f9798b = this.f9797a.mo29247d();
            }
            return this.f9798b;
        }
    }

    /* renamed from: c */
    protected final void m28737c(InterfaceC3927o9 interfaceC3927o9) {
        if (this.f9797a != null) {
            return;
        }
        synchronized (this) {
            if (this.f9797a == null) {
                try {
                    this.f9797a = interfaceC3927o9;
                    this.f9798b = AbstractC3909n7.f9575d;
                } catch (zzkh unused) {
                    this.f9797a = interfaceC3927o9;
                    this.f9798b = AbstractC3909n7.f9575d;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4036v8) {
            C4036v8 c4036v8 = (C4036v8) obj;
            InterfaceC3927o9 interfaceC3927o9 = this.f9797a;
            InterfaceC3927o9 interfaceC3927o92 = c4036v8.f9797a;
            if (interfaceC3927o9 == null && interfaceC3927o92 == null) {
                return m28738b().equals(c4036v8.m28738b());
            }
            if (interfaceC3927o9 == null || interfaceC3927o92 == null) {
                if (interfaceC3927o9 != null) {
                    c4036v8.m28737c(interfaceC3927o9.mo29102e());
                    return interfaceC3927o9.equals(c4036v8.f9797a);
                }
                m28737c(interfaceC3927o92.mo29102e());
                return this.f9797a.equals(interfaceC3927o92);
            }
            return interfaceC3927o9.equals(interfaceC3927o92);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
