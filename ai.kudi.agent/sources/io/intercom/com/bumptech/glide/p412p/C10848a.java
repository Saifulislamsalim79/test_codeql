package io.intercom.com.bumptech.glide.p412p;
/* compiled from: ErrorRequestCoordinator.java */
/* renamed from: io.intercom.com.bumptech.glide.p.a */
/* loaded from: classes3.dex */
public final class C10848a implements InterfaceC10851d, InterfaceC10850c {

    /* renamed from: c */
    private final InterfaceC10851d f24737c;

    /* renamed from: d */
    private InterfaceC10850c f24738d;

    /* renamed from: e */
    private InterfaceC10850c f24739e;

    public C10848a(InterfaceC10851d interfaceC10851d) {
        this.f24737c = interfaceC10851d;
    }

    /* renamed from: m */
    private boolean m12187m(InterfaceC10850c interfaceC10850c) {
        return interfaceC10850c.equals(this.f24738d) || (this.f24738d.mo12084i() && interfaceC10850c.equals(this.f24739e));
    }

    /* renamed from: n */
    private boolean m12186n() {
        InterfaceC10851d interfaceC10851d = this.f24737c;
        return interfaceC10851d == null || interfaceC10851d.mo12089d(this);
    }

    /* renamed from: o */
    private boolean m12185o() {
        InterfaceC10851d interfaceC10851d = this.f24737c;
        return interfaceC10851d == null || interfaceC10851d.mo12090c(this);
    }

    /* renamed from: p */
    private boolean m12184p() {
        InterfaceC10851d interfaceC10851d = this.f24737c;
        return interfaceC10851d == null || interfaceC10851d.mo12086g(this);
    }

    /* renamed from: q */
    private boolean m12183q() {
        InterfaceC10851d interfaceC10851d = this.f24737c;
        return interfaceC10851d != null && interfaceC10851d.mo12092a();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: a */
    public boolean mo12092a() {
        return m12183q() || mo12085h();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: b */
    public void mo12091b() {
        this.f24738d.mo12091b();
        this.f24739e.mo12091b();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: c */
    public boolean mo12090c(InterfaceC10850c interfaceC10850c) {
        return m12185o() && m12187m(interfaceC10850c);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public void clear() {
        this.f24738d.clear();
        if (this.f24738d.mo12084i()) {
            this.f24739e.clear();
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: d */
    public boolean mo12089d(InterfaceC10850c interfaceC10850c) {
        return m12186n() && m12187m(interfaceC10850c);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: e */
    public void mo12088e() {
        if (this.f24738d.isRunning()) {
            return;
        }
        this.f24738d.mo12088e();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: f */
    public boolean mo12087f() {
        return (this.f24738d.mo12084i() ? this.f24739e : this.f24738d).mo12087f();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: g */
    public boolean mo12086g(InterfaceC10850c interfaceC10850c) {
        return m12184p() && m12187m(interfaceC10850c);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: h */
    public boolean mo12085h() {
        return (this.f24738d.mo12084i() ? this.f24739e : this.f24738d).mo12085h();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: i */
    public boolean mo12084i() {
        return this.f24738d.mo12084i() && this.f24739e.mo12084i();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public boolean isCancelled() {
        return (this.f24738d.mo12084i() ? this.f24739e : this.f24738d).isCancelled();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public boolean isRunning() {
        return (this.f24738d.mo12084i() ? this.f24739e : this.f24738d).isRunning();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: j */
    public void mo12083j(InterfaceC10850c interfaceC10850c) {
        InterfaceC10851d interfaceC10851d = this.f24737c;
        if (interfaceC10851d != null) {
            interfaceC10851d.mo12083j(this);
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: k */
    public boolean mo12082k(InterfaceC10850c interfaceC10850c) {
        if (interfaceC10850c instanceof C10848a) {
            C10848a c10848a = (C10848a) interfaceC10850c;
            return this.f24738d.mo12082k(c10848a.f24738d) && this.f24739e.mo12082k(c10848a.f24739e);
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: l */
    public void mo12081l(InterfaceC10850c interfaceC10850c) {
        if (!interfaceC10850c.equals(this.f24739e)) {
            if (this.f24739e.isRunning()) {
                return;
            }
            this.f24739e.mo12088e();
            return;
        }
        InterfaceC10851d interfaceC10851d = this.f24737c;
        if (interfaceC10851d != null) {
            interfaceC10851d.mo12081l(this);
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public void pause() {
        if (!this.f24738d.mo12084i()) {
            this.f24738d.pause();
        }
        if (this.f24739e.isRunning()) {
            this.f24739e.pause();
        }
    }

    /* renamed from: r */
    public void m12182r(InterfaceC10850c interfaceC10850c, InterfaceC10850c interfaceC10850c2) {
        this.f24738d = interfaceC10850c;
        this.f24739e = interfaceC10850c2;
    }
}
