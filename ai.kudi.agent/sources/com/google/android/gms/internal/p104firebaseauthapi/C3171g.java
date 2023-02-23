package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g */
/* loaded from: classes2.dex */
public class C3171g {

    /* renamed from: a */
    protected volatile InterfaceC3644y f8497a;

    /* renamed from: b */
    private volatile AbstractC3223ho f8498b;

    static {
        C3617wo.m30072a();
    }

    /* renamed from: a */
    public final int m31123a() {
        if (this.f8498b != null) {
            return ((C3196go) this.f8498b).f8520e.length;
        }
        if (this.f8497a != null) {
            return this.f8497a.mo29997t();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC3223ho m31122b() {
        if (this.f8498b != null) {
            return this.f8498b;
        }
        synchronized (this) {
            if (this.f8498b != null) {
                return this.f8498b;
            }
            if (this.f8497a == null) {
                this.f8498b = AbstractC3223ho.f8571d;
            } else {
                this.f8498b = this.f8497a.mo30001k();
            }
            return this.f8498b;
        }
    }

    /* renamed from: c */
    protected final void m31121c(InterfaceC3644y interfaceC3644y) {
        if (this.f8497a != null) {
            return;
        }
        synchronized (this) {
            if (this.f8497a == null) {
                try {
                    this.f8497a = interfaceC3644y;
                    this.f8498b = AbstractC3223ho.f8571d;
                } catch (zzaae unused) {
                    this.f8497a = interfaceC3644y;
                    this.f8498b = AbstractC3223ho.f8571d;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3171g) {
            C3171g c3171g = (C3171g) obj;
            InterfaceC3644y interfaceC3644y = this.f8497a;
            InterfaceC3644y interfaceC3644y2 = c3171g.f8497a;
            if (interfaceC3644y == null && interfaceC3644y2 == null) {
                return m31122b().equals(c3171g.m31122b());
            }
            if (interfaceC3644y == null || interfaceC3644y2 == null) {
                if (interfaceC3644y != null) {
                    c3171g.m31121c(interfaceC3644y.mo30944u());
                    return interfaceC3644y.equals(c3171g.f8497a);
                }
                m31121c(interfaceC3644y2.mo30944u());
                return this.f8497a.equals(interfaceC3644y2);
            }
            return interfaceC3644y.equals(interfaceC3644y2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
