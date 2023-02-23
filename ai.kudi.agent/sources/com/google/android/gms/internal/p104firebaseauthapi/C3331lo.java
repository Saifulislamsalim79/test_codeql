package com.google.android.gms.internal.p104firebaseauthapi;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lo */
/* loaded from: classes2.dex */
public final class C3331lo implements InterfaceC3280k0 {

    /* renamed from: a */
    private final AbstractC3304ko f8712a;

    /* renamed from: b */
    private int f8713b;

    /* renamed from: c */
    private int f8714c;

    /* renamed from: d */
    private int f8715d = 0;

    private C3331lo(AbstractC3304ko abstractC3304ko) {
        C3117e.m31220f(abstractC3304ko, MetricTracker.Object.INPUT);
        this.f8712a = abstractC3304ko;
        abstractC3304ko.f8694b = this;
    }

    /* renamed from: Q */
    private static final void m30749Q(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzaae.m29867g();
        }
    }

    /* renamed from: R */
    public static C3331lo m30748R(AbstractC3304ko abstractC3304ko) {
        C3331lo c3331lo = abstractC3304ko.f8694b;
        return c3331lo != null ? c3331lo : new C3331lo(abstractC3304ko);
    }

    /* renamed from: p */
    private final <T> T m30732p(InterfaceC3307l0<T> interfaceC3307l0, C3617wo c3617wo) throws IOException {
        int i = this.f8714c;
        this.f8714c = ((this.f8713b >>> 3) << 3) | 4;
        try {
            T mo30816a = interfaceC3307l0.mo30816a();
            interfaceC3307l0.mo30809h(mo30816a, this, c3617wo);
            interfaceC3307l0.mo30814c(mo30816a);
            if (this.f8713b == this.f8714c) {
                return mo30816a;
            }
            throw zzaae.m29867g();
        } finally {
            this.f8714c = i;
        }
    }

    /* renamed from: q */
    private final <T> T m30731q(InterfaceC3307l0<T> interfaceC3307l0, C3617wo c3617wo) throws IOException {
        AbstractC3304ko abstractC3304ko;
        int m30889p = ((C3277jo) this.f8712a).m30889p();
        AbstractC3304ko abstractC3304ko2 = this.f8712a;
        if (abstractC3304ko2.f8693a < 100) {
            int mo30828b = abstractC3304ko2.mo30828b(m30889p);
            T mo30816a = interfaceC3307l0.mo30816a();
            this.f8712a.f8693a++;
            interfaceC3307l0.mo30809h(mo30816a, this, c3617wo);
            interfaceC3307l0.mo30814c(mo30816a);
            this.f8712a.mo30823g(0);
            abstractC3304ko.f8693a--;
            this.f8712a.mo30822h(mo30828b);
            return mo30816a;
        }
        throw new zzaae("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: s */
    private final void m30729s(int i) throws IOException {
        if (this.f8712a.mo30829a() != i) {
            throw zzaae.m29865i();
        }
    }

    /* renamed from: t */
    private final void m30728t(int i) throws IOException {
        if ((this.f8713b & 7) != i) {
            throw zzaae.m29873a();
        }
    }

    /* renamed from: u */
    private static final void m30727u(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzaae.m29867g();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: A */
    public final void mo30765A(List<Long> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3358n) {
            C3358n c3358n = (C3358n) list;
            int i = this.f8713b & 7;
            if (i == 0) {
                do {
                    c3358n.m30647f(((C3277jo) this.f8712a).m30887r());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int mo30829a = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
                do {
                    c3358n.m30647f(((C3277jo) this.f8712a).m30887r());
                } while (this.f8712a.mo30829a() < mo30829a);
                m30729s(mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(((C3277jo) this.f8712a).m30887r()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int mo30829a2 = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
            do {
                list.add(Long.valueOf(((C3277jo) this.f8712a).m30887r()));
            } while (this.f8712a.mo30829a() < mo30829a2);
            m30729s(mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: B */
    public final void mo30764B(List<Double> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3539to) {
            C3539to c3539to = (C3539to) list;
            int i = this.f8713b & 7;
            if (i == 1) {
                do {
                    c3539to.m30210e(Double.longBitsToDouble(((C3277jo) this.f8712a).m30888q()));
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int m30889p = ((C3277jo) this.f8712a).m30889p();
                m30749Q(m30889p);
                int mo30829a = this.f8712a.mo30829a() + m30889p;
                do {
                    c3539to.m30210e(Double.longBitsToDouble(((C3277jo) this.f8712a).m30888q()));
                } while (this.f8712a.mo30829a() < mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((C3277jo) this.f8712a).m30888q())));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int m30889p2 = ((C3277jo) this.f8712a).m30889p();
            m30749Q(m30889p2);
            int mo30829a2 = this.f8712a.mo30829a() + m30889p2;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((C3277jo) this.f8712a).m30888q())));
            } while (this.f8712a.mo30829a() < mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: C */
    public final void mo30763C(List<AbstractC3223ho> list) throws IOException {
        int mo30827c;
        if ((this.f8713b & 7) != 2) {
            throw zzaae.m29873a();
        }
        do {
            list.add(mo30741g());
            if (this.f8712a.mo30821i()) {
                return;
            }
            mo30827c = this.f8712a.mo30827c();
        } while (mo30827c == this.f8713b);
        this.f8715d = mo30827c;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: D */
    public final void mo30762D(List<Integer> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3278jp) {
            C3278jp c3278jp = (C3278jp) list;
            int i = this.f8713b & 7;
            if (i == 0) {
                do {
                    c3278jp.m30883f(((C3277jo) this.f8712a).m30889p());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int mo30829a = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
                do {
                    c3278jp.m30883f(((C3277jo) this.f8712a).m30889p());
                } while (this.f8712a.mo30829a() < mo30829a);
                m30729s(mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(((C3277jo) this.f8712a).m30889p()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int mo30829a2 = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
            do {
                list.add(Integer.valueOf(((C3277jo) this.f8712a).m30889p()));
            } while (this.f8712a.mo30829a() < mo30829a2);
            m30729s(mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: E */
    public final <T> T mo30761E(InterfaceC3307l0<T> interfaceC3307l0, C3617wo c3617wo) throws IOException {
        m30728t(3);
        return (T) m30732p(interfaceC3307l0, c3617wo);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: F */
    public final void mo30760F(List<Long> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3358n) {
            C3358n c3358n = (C3358n) list;
            int i = this.f8713b & 7;
            if (i == 1) {
                do {
                    c3358n.m30647f(((C3277jo) this.f8712a).m30888q());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int m30889p = ((C3277jo) this.f8712a).m30889p();
                m30749Q(m30889p);
                int mo30829a = this.f8712a.mo30829a() + m30889p;
                do {
                    c3358n.m30647f(((C3277jo) this.f8712a).m30888q());
                } while (this.f8712a.mo30829a() < mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(((C3277jo) this.f8712a).m30888q()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int m30889p2 = ((C3277jo) this.f8712a).m30889p();
            m30749Q(m30889p2);
            int mo30829a2 = this.f8712a.mo30829a() + m30889p2;
            do {
                list.add(Long.valueOf(((C3277jo) this.f8712a).m30888q()));
            } while (this.f8712a.mo30829a() < mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: G */
    public final void mo30759G(List<Integer> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (!(list instanceof C3278jp)) {
            int i = this.f8713b & 7;
            if (i == 2) {
                int m30889p = ((C3277jo) this.f8712a).m30889p();
                m30727u(m30889p);
                int mo30829a = this.f8712a.mo30829a() + m30889p;
                do {
                    list.add(Integer.valueOf(((C3277jo) this.f8712a).m30890o()));
                } while (this.f8712a.mo30829a() < mo30829a);
                return;
            } else if (i != 5) {
                throw zzaae.m29873a();
            } else {
                do {
                    list.add(Integer.valueOf(((C3277jo) this.f8712a).m30890o()));
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c = this.f8712a.mo30827c();
                } while (mo30827c == this.f8713b);
                this.f8715d = mo30827c;
                return;
            }
        }
        C3278jp c3278jp = (C3278jp) list;
        int i2 = this.f8713b & 7;
        if (i2 == 2) {
            int m30889p2 = ((C3277jo) this.f8712a).m30889p();
            m30727u(m30889p2);
            int mo30829a2 = this.f8712a.mo30829a() + m30889p2;
            do {
                c3278jp.m30883f(((C3277jo) this.f8712a).m30890o());
            } while (this.f8712a.mo30829a() < mo30829a2);
        } else if (i2 != 5) {
            throw zzaae.m29873a();
        } else {
            do {
                c3278jp.m30883f(((C3277jo) this.f8712a).m30890o());
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c2 = this.f8712a.mo30827c();
            } while (mo30827c2 == this.f8713b);
            this.f8715d = mo30827c2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: H */
    public final <T> void mo30758H(List<T> list, InterfaceC3307l0<T> interfaceC3307l0, C3617wo c3617wo) throws IOException {
        int mo30827c;
        int i = this.f8713b;
        if ((i & 7) != 3) {
            throw zzaae.m29873a();
        }
        do {
            list.add(m30732p(interfaceC3307l0, c3617wo));
            if (this.f8712a.mo30821i() || this.f8715d != 0) {
                return;
            }
            mo30827c = this.f8712a.mo30827c();
        } while (mo30827c == i);
        this.f8715d = mo30827c;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: I */
    public final void mo30757I(List<Integer> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (!(list instanceof C3278jp)) {
            int i = this.f8713b & 7;
            if (i == 2) {
                int m30889p = ((C3277jo) this.f8712a).m30889p();
                m30727u(m30889p);
                int mo30829a = this.f8712a.mo30829a() + m30889p;
                do {
                    list.add(Integer.valueOf(((C3277jo) this.f8712a).m30890o()));
                } while (this.f8712a.mo30829a() < mo30829a);
                return;
            } else if (i != 5) {
                throw zzaae.m29873a();
            } else {
                do {
                    list.add(Integer.valueOf(((C3277jo) this.f8712a).m30890o()));
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c = this.f8712a.mo30827c();
                } while (mo30827c == this.f8713b);
                this.f8715d = mo30827c;
                return;
            }
        }
        C3278jp c3278jp = (C3278jp) list;
        int i2 = this.f8713b & 7;
        if (i2 == 2) {
            int m30889p2 = ((C3277jo) this.f8712a).m30889p();
            m30727u(m30889p2);
            int mo30829a2 = this.f8712a.mo30829a() + m30889p2;
            do {
                c3278jp.m30883f(((C3277jo) this.f8712a).m30890o());
            } while (this.f8712a.mo30829a() < mo30829a2);
        } else if (i2 != 5) {
            throw zzaae.m29873a();
        } else {
            do {
                c3278jp.m30883f(((C3277jo) this.f8712a).m30890o());
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c2 = this.f8712a.mo30827c();
            } while (mo30827c2 == this.f8713b);
            this.f8715d = mo30827c2;
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: J */
    public final void mo30756J(List<Long> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3358n) {
            C3358n c3358n = (C3358n) list;
            int i = this.f8713b & 7;
            if (i == 0) {
                do {
                    c3358n.m30647f(AbstractC3304ko.m30818l(((C3277jo) this.f8712a).m30887r()));
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int mo30829a = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
                do {
                    c3358n.m30647f(AbstractC3304ko.m30818l(((C3277jo) this.f8712a).m30887r()));
                } while (this.f8712a.mo30829a() < mo30829a);
                m30729s(mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(AbstractC3304ko.m30818l(((C3277jo) this.f8712a).m30887r())));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int mo30829a2 = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
            do {
                list.add(Long.valueOf(AbstractC3304ko.m30818l(((C3277jo) this.f8712a).m30887r())));
            } while (this.f8712a.mo30829a() < mo30829a2);
            m30729s(mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: K */
    public final void mo30755K(List<Long> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3358n) {
            C3358n c3358n = (C3358n) list;
            int i = this.f8713b & 7;
            if (i == 1) {
                do {
                    c3358n.m30647f(((C3277jo) this.f8712a).m30888q());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int m30889p = ((C3277jo) this.f8712a).m30889p();
                m30749Q(m30889p);
                int mo30829a = this.f8712a.mo30829a() + m30889p;
                do {
                    c3358n.m30647f(((C3277jo) this.f8712a).m30888q());
                } while (this.f8712a.mo30829a() < mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(((C3277jo) this.f8712a).m30888q()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int m30889p2 = ((C3277jo) this.f8712a).m30889p();
            m30749Q(m30889p2);
            int mo30829a2 = this.f8712a.mo30829a() + m30889p2;
            do {
                list.add(Long.valueOf(((C3277jo) this.f8712a).m30888q()));
            } while (this.f8712a.mo30829a() < mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: L */
    public final void mo30754L(List<Integer> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3278jp) {
            C3278jp c3278jp = (C3278jp) list;
            int i = this.f8713b & 7;
            if (i == 0) {
                do {
                    c3278jp.m30883f(AbstractC3304ko.m30819k(((C3277jo) this.f8712a).m30889p()));
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int mo30829a = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
                do {
                    c3278jp.m30883f(AbstractC3304ko.m30819k(((C3277jo) this.f8712a).m30889p()));
                } while (this.f8712a.mo30829a() < mo30829a);
                m30729s(mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(AbstractC3304ko.m30819k(((C3277jo) this.f8712a).m30889p())));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int mo30829a2 = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
            do {
                list.add(Integer.valueOf(AbstractC3304ko.m30819k(((C3277jo) this.f8712a).m30889p())));
            } while (this.f8712a.mo30829a() < mo30829a2);
            m30729s(mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: M */
    public final void mo30753M(List<Integer> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3278jp) {
            C3278jp c3278jp = (C3278jp) list;
            int i = this.f8713b & 7;
            if (i == 0) {
                do {
                    c3278jp.m30883f(((C3277jo) this.f8712a).m30889p());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int mo30829a = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
                do {
                    c3278jp.m30883f(((C3277jo) this.f8712a).m30889p());
                } while (this.f8712a.mo30829a() < mo30829a);
                m30729s(mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(((C3277jo) this.f8712a).m30889p()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int mo30829a2 = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
            do {
                list.add(Integer.valueOf(((C3277jo) this.f8712a).m30889p()));
            } while (this.f8712a.mo30829a() < mo30829a2);
            m30729s(mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: N */
    public final void mo30752N(List<Boolean> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3694zn) {
            C3694zn c3694zn = (C3694zn) list;
            int i = this.f8713b & 7;
            if (i == 0) {
                do {
                    c3694zn.m29879e(this.f8712a.mo30820j());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int mo30829a = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
                do {
                    c3694zn.m29879e(this.f8712a.mo30820j());
                } while (this.f8712a.mo30829a() < mo30829a);
                m30729s(mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.f8712a.mo30820j()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int mo30829a2 = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
            do {
                list.add(Boolean.valueOf(this.f8712a.mo30820j()));
            } while (this.f8712a.mo30829a() < mo30829a2);
            m30729s(mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: O */
    public final <T> void mo30751O(List<T> list, InterfaceC3307l0<T> interfaceC3307l0, C3617wo c3617wo) throws IOException {
        int mo30827c;
        int i = this.f8713b;
        if ((i & 7) != 2) {
            throw zzaae.m29873a();
        }
        do {
            list.add(m30731q(interfaceC3307l0, c3617wo));
            if (this.f8712a.mo30821i() || this.f8715d != 0) {
                return;
            }
            mo30827c = this.f8712a.mo30827c();
        } while (mo30827c == i);
        this.f8715d = mo30827c;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: P */
    public final void mo30750P(List<Float> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (!(list instanceof C3116dp)) {
            int i = this.f8713b & 7;
            if (i == 2) {
                int m30889p = ((C3277jo) this.f8712a).m30889p();
                m30727u(m30889p);
                int mo30829a = this.f8712a.mo30829a() + m30889p;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C3277jo) this.f8712a).m30890o())));
                } while (this.f8712a.mo30829a() < mo30829a);
                return;
            } else if (i != 5) {
                throw zzaae.m29873a();
            } else {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C3277jo) this.f8712a).m30890o())));
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c = this.f8712a.mo30827c();
                } while (mo30827c == this.f8713b);
                this.f8715d = mo30827c;
                return;
            }
        }
        C3116dp c3116dp = (C3116dp) list;
        int i2 = this.f8713b & 7;
        if (i2 == 2) {
            int m30889p2 = ((C3277jo) this.f8712a).m30889p();
            m30727u(m30889p2);
            int mo30829a2 = this.f8712a.mo30829a() + m30889p2;
            do {
                c3116dp.m31228e(Float.intBitsToFloat(((C3277jo) this.f8712a).m30890o()));
            } while (this.f8712a.mo30829a() < mo30829a2);
        } else if (i2 != 5) {
            throw zzaae.m29873a();
        } else {
            do {
                c3116dp.m31228e(Float.intBitsToFloat(((C3277jo) this.f8712a).m30890o()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c2 = this.f8712a.mo30827c();
            } while (mo30827c2 == this.f8713b);
            this.f8715d = mo30827c2;
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: a */
    public final int mo30747a() throws IOException {
        m30728t(0);
        return ((C3277jo) this.f8712a).m30889p();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: b */
    public final int mo30746b() throws IOException {
        m30728t(5);
        return ((C3277jo) this.f8712a).m30890o();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: c */
    public final int mo30745c() throws IOException {
        int i = this.f8715d;
        if (i != 0) {
            this.f8713b = i;
            this.f8715d = 0;
        } else {
            i = this.f8712a.mo30827c();
            this.f8713b = i;
        }
        if (i == 0 || i == this.f8714c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: d */
    public final int mo30744d() {
        return this.f8713b;
    }

    /* renamed from: e */
    public final void m30743e(List<String> list, boolean z) throws IOException {
        int mo30827c;
        int mo30827c2;
        if ((this.f8713b & 7) == 2) {
            if (!(list instanceof InterfaceC3225i) || z) {
                do {
                    list.add(z ? mo30730r() : mo30726v());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c = this.f8712a.mo30827c();
                } while (mo30827c == this.f8713b);
                this.f8715d = mo30827c;
                return;
            }
            InterfaceC3225i interfaceC3225i = (InterfaceC3225i) list;
            do {
                interfaceC3225i.mo31004w(mo30741g());
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c2 = this.f8712a.mo30827c();
            } while (mo30827c2 == this.f8713b);
            this.f8715d = mo30827c2;
            return;
        }
        throw zzaae.m29873a();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: f */
    public final int mo30742f() throws IOException {
        m30728t(0);
        return ((C3277jo) this.f8712a).m30889p();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: g */
    public final AbstractC3223ho mo30741g() throws IOException {
        m30728t(2);
        return this.f8712a.mo30826d();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: h */
    public final int mo30740h() throws IOException {
        m30728t(0);
        return AbstractC3304ko.m30819k(((C3277jo) this.f8712a).m30889p());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: i */
    public final long mo30739i() throws IOException {
        m30728t(0);
        return AbstractC3304ko.m30818l(((C3277jo) this.f8712a).m30887r());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: j */
    public final int mo30738j() throws IOException {
        m30728t(5);
        return ((C3277jo) this.f8712a).m30890o();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: k */
    public final long mo30737k() throws IOException {
        m30728t(0);
        return ((C3277jo) this.f8712a).m30887r();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: l */
    public final long mo30736l() throws IOException {
        m30728t(0);
        return ((C3277jo) this.f8712a).m30887r();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: m */
    public final long mo30735m() throws IOException {
        m30728t(1);
        return ((C3277jo) this.f8712a).m30888q();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: n */
    public final int mo30734n() throws IOException {
        m30728t(0);
        return ((C3277jo) this.f8712a).m30889p();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: o */
    public final long mo30733o() throws IOException {
        m30728t(1);
        return ((C3277jo) this.f8712a).m30888q();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: r */
    public final String mo30730r() throws IOException {
        m30728t(2);
        return this.f8712a.mo30824f();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: v */
    public final String mo30726v() throws IOException {
        m30728t(2);
        return this.f8712a.mo30825e();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: w */
    public final boolean mo30725w() throws IOException {
        m30728t(0);
        return this.f8712a.mo30820j();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: x */
    public final void mo30724x(List<Integer> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3278jp) {
            C3278jp c3278jp = (C3278jp) list;
            int i = this.f8713b & 7;
            if (i == 0) {
                do {
                    c3278jp.m30883f(((C3277jo) this.f8712a).m30889p());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int mo30829a = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
                do {
                    c3278jp.m30883f(((C3277jo) this.f8712a).m30889p());
                } while (this.f8712a.mo30829a() < mo30829a);
                m30729s(mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(((C3277jo) this.f8712a).m30889p()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int mo30829a2 = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
            do {
                list.add(Integer.valueOf(((C3277jo) this.f8712a).m30889p()));
            } while (this.f8712a.mo30829a() < mo30829a2);
            m30729s(mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: y */
    public final void mo30723y(List<Long> list) throws IOException {
        int mo30827c;
        int mo30827c2;
        if (list instanceof C3358n) {
            C3358n c3358n = (C3358n) list;
            int i = this.f8713b & 7;
            if (i == 0) {
                do {
                    c3358n.m30647f(((C3277jo) this.f8712a).m30887r());
                    if (this.f8712a.mo30821i()) {
                        return;
                    }
                    mo30827c2 = this.f8712a.mo30827c();
                } while (mo30827c2 == this.f8713b);
                this.f8715d = mo30827c2;
                return;
            } else if (i == 2) {
                int mo30829a = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
                do {
                    c3358n.m30647f(((C3277jo) this.f8712a).m30887r());
                } while (this.f8712a.mo30829a() < mo30829a);
                m30729s(mo30829a);
                return;
            } else {
                throw zzaae.m29873a();
            }
        }
        int i2 = this.f8713b & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(((C3277jo) this.f8712a).m30887r()));
                if (this.f8712a.mo30821i()) {
                    return;
                }
                mo30827c = this.f8712a.mo30827c();
            } while (mo30827c == this.f8713b);
            this.f8715d = mo30827c;
        } else if (i2 == 2) {
            int mo30829a2 = this.f8712a.mo30829a() + ((C3277jo) this.f8712a).m30889p();
            do {
                list.add(Long.valueOf(((C3277jo) this.f8712a).m30887r()));
            } while (this.f8712a.mo30829a() < mo30829a2);
            m30729s(mo30829a2);
        } else {
            throw zzaae.m29873a();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    /* renamed from: z */
    public final <T> T mo30722z(InterfaceC3307l0<T> interfaceC3307l0, C3617wo c3617wo) throws IOException {
        m30728t(2);
        return (T) m30731q(interfaceC3307l0, c3617wo);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    public final double zza() throws IOException {
        m30728t(1);
        return Double.longBitsToDouble(((C3277jo) this.f8712a).m30888q());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3280k0
    public final float zzb() throws IOException {
        m30728t(5);
        return Float.intBitsToFloat(((C3277jo) this.f8712a).m30890o());
    }
}
