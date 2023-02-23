package io.intercom.com.bumptech.glide.p412p;
/* compiled from: ThumbnailRequestCoordinator.java */
/* renamed from: io.intercom.com.bumptech.glide.p.j */
/* loaded from: classes3.dex */
public class C10861j implements InterfaceC10851d, InterfaceC10850c {

    /* renamed from: c */
    private final InterfaceC10851d f24816c;

    /* renamed from: d */
    private InterfaceC10850c f24817d;

    /* renamed from: e */
    private InterfaceC10850c f24818e;

    /* renamed from: f */
    private boolean f24819f;

    C10861j() {
        this(null);
    }

    /* renamed from: m */
    private boolean m12080m() {
        InterfaceC10851d interfaceC10851d = this.f24816c;
        return interfaceC10851d == null || interfaceC10851d.mo12089d(this);
    }

    /* renamed from: n */
    private boolean m12079n() {
        InterfaceC10851d interfaceC10851d = this.f24816c;
        return interfaceC10851d == null || interfaceC10851d.mo12090c(this);
    }

    /* renamed from: o */
    private boolean m12078o() {
        InterfaceC10851d interfaceC10851d = this.f24816c;
        return interfaceC10851d == null || interfaceC10851d.mo12086g(this);
    }

    /* renamed from: p */
    private boolean m12077p() {
        InterfaceC10851d interfaceC10851d = this.f24816c;
        return interfaceC10851d != null && interfaceC10851d.mo12092a();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: a */
    public boolean mo12092a() {
        return m12077p() || mo12085h();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: b */
    public void mo12091b() {
        this.f24817d.mo12091b();
        this.f24818e.mo12091b();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: c */
    public boolean mo12090c(InterfaceC10850c interfaceC10850c) {
        return m12079n() && interfaceC10850c.equals(this.f24817d) && !mo12092a();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public void clear() {
        this.f24819f = false;
        this.f24818e.clear();
        this.f24817d.clear();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: d */
    public boolean mo12089d(InterfaceC10850c interfaceC10850c) {
        return m12080m() && interfaceC10850c.equals(this.f24817d);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: e */
    public void mo12088e() {
        this.f24819f = true;
        if (!this.f24817d.mo12087f() && !this.f24818e.isRunning()) {
            this.f24818e.mo12088e();
        }
        if (!this.f24819f || this.f24817d.isRunning()) {
            return;
        }
        this.f24817d.mo12088e();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: f */
    public boolean mo12087f() {
        return this.f24817d.mo12087f() || this.f24818e.mo12087f();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: g */
    public boolean mo12086g(InterfaceC10850c interfaceC10850c) {
        return m12078o() && (interfaceC10850c.equals(this.f24817d) || !this.f24817d.mo12085h());
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: h */
    public boolean mo12085h() {
        return this.f24817d.mo12085h() || this.f24818e.mo12085h();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: i */
    public boolean mo12084i() {
        return this.f24817d.mo12084i();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public boolean isCancelled() {
        return this.f24817d.isCancelled();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public boolean isRunning() {
        return this.f24817d.isRunning();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: j */
    public void mo12083j(InterfaceC10850c interfaceC10850c) {
        if (interfaceC10850c.equals(this.f24818e)) {
            return;
        }
        InterfaceC10851d interfaceC10851d = this.f24816c;
        if (interfaceC10851d != null) {
            interfaceC10851d.mo12083j(this);
        }
        if (this.f24818e.mo12087f()) {
            return;
        }
        this.f24818e.clear();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: k */
    public boolean mo12082k(InterfaceC10850c interfaceC10850c) {
        if (interfaceC10850c instanceof C10861j) {
            C10861j c10861j = (C10861j) interfaceC10850c;
            InterfaceC10850c interfaceC10850c2 = this.f24817d;
            if (interfaceC10850c2 == null) {
                if (c10861j.f24817d != null) {
                    return false;
                }
            } else if (!interfaceC10850c2.mo12082k(c10861j.f24817d)) {
                return false;
            }
            InterfaceC10850c interfaceC10850c3 = this.f24818e;
            InterfaceC10850c interfaceC10850c4 = c10861j.f24818e;
            if (interfaceC10850c3 == null) {
                if (interfaceC10850c4 != null) {
                    return false;
                }
            } else if (!interfaceC10850c3.mo12082k(interfaceC10850c4)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10851d
    /* renamed from: l */
    public void mo12081l(InterfaceC10850c interfaceC10850c) {
        InterfaceC10851d interfaceC10851d;
        if (interfaceC10850c.equals(this.f24817d) && (interfaceC10851d = this.f24816c) != null) {
            interfaceC10851d.mo12081l(this);
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public void pause() {
        this.f24819f = false;
        this.f24817d.pause();
        this.f24818e.pause();
    }

    /* renamed from: q */
    public void m12076q(InterfaceC10850c interfaceC10850c, InterfaceC10850c interfaceC10850c2) {
        this.f24817d = interfaceC10850c;
        this.f24818e = interfaceC10850c2;
    }

    public C10861j(InterfaceC10851d interfaceC10851d) {
        this.f24816c = interfaceC10851d;
    }
}
