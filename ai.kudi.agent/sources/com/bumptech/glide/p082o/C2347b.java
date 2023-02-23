package com.bumptech.glide.p082o;

import com.bumptech.glide.p082o.InterfaceC2349d;
/* compiled from: ErrorRequestCoordinator.java */
/* renamed from: com.bumptech.glide.o.b */
/* loaded from: classes2.dex */
public final class C2347b implements InterfaceC2349d, InterfaceC2348c {

    /* renamed from: a */
    private final Object f6788a;

    /* renamed from: b */
    private final InterfaceC2349d f6789b;

    /* renamed from: c */
    private volatile InterfaceC2348c f6790c;

    /* renamed from: d */
    private volatile InterfaceC2348c f6791d;

    /* renamed from: e */
    private InterfaceC2349d.EnumC2350a f6792e;

    /* renamed from: f */
    private InterfaceC2349d.EnumC2350a f6793f;

    public C2347b(Object obj, InterfaceC2349d interfaceC2349d) {
        InterfaceC2349d.EnumC2350a enumC2350a = InterfaceC2349d.EnumC2350a.CLEARED;
        this.f6792e = enumC2350a;
        this.f6793f = enumC2350a;
        this.f6788a = obj;
        this.f6789b = interfaceC2349d;
    }

    /* renamed from: k */
    private boolean m33211k(InterfaceC2348c interfaceC2348c) {
        return interfaceC2348c.equals(this.f6790c) || (this.f6792e == InterfaceC2349d.EnumC2350a.FAILED && interfaceC2348c.equals(this.f6791d));
    }

    /* renamed from: l */
    private boolean m33210l() {
        InterfaceC2349d interfaceC2349d = this.f6789b;
        return interfaceC2349d == null || interfaceC2349d.mo33172j(this);
    }

    /* renamed from: m */
    private boolean m33209m() {
        InterfaceC2349d interfaceC2349d = this.f6789b;
        return interfaceC2349d == null || interfaceC2349d.mo33179c(this);
    }

    /* renamed from: n */
    private boolean m33208n() {
        InterfaceC2349d interfaceC2349d = this.f6789b;
        return interfaceC2349d == null || interfaceC2349d.mo33178d(this);
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d, com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: a */
    public boolean mo33181a() {
        boolean z;
        synchronized (this.f6788a) {
            z = this.f6790c.mo33181a() || this.f6791d.mo33181a();
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: b */
    public void mo33180b(InterfaceC2348c interfaceC2348c) {
        synchronized (this.f6788a) {
            if (!interfaceC2348c.equals(this.f6791d)) {
                this.f6792e = InterfaceC2349d.EnumC2350a.FAILED;
                if (this.f6793f != InterfaceC2349d.EnumC2350a.RUNNING) {
                    this.f6793f = InterfaceC2349d.EnumC2350a.RUNNING;
                    this.f6791d.mo33177e();
                }
                return;
            }
            this.f6793f = InterfaceC2349d.EnumC2350a.FAILED;
            if (this.f6789b != null) {
                this.f6789b.mo33180b(this);
            }
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: c */
    public boolean mo33179c(InterfaceC2348c interfaceC2348c) {
        boolean z;
        synchronized (this.f6788a) {
            z = m33209m() && m33211k(interfaceC2348c);
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public void clear() {
        synchronized (this.f6788a) {
            this.f6792e = InterfaceC2349d.EnumC2350a.CLEARED;
            this.f6790c.clear();
            if (this.f6793f != InterfaceC2349d.EnumC2350a.CLEARED) {
                this.f6793f = InterfaceC2349d.EnumC2350a.CLEARED;
                this.f6791d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: d */
    public boolean mo33178d(InterfaceC2348c interfaceC2348c) {
        boolean z;
        synchronized (this.f6788a) {
            z = m33208n() && m33211k(interfaceC2348c);
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: e */
    public void mo33177e() {
        synchronized (this.f6788a) {
            if (this.f6792e != InterfaceC2349d.EnumC2350a.RUNNING) {
                this.f6792e = InterfaceC2349d.EnumC2350a.RUNNING;
                this.f6790c.mo33177e();
            }
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: f */
    public boolean mo33176f() {
        boolean z;
        synchronized (this.f6788a) {
            z = this.f6792e == InterfaceC2349d.EnumC2350a.SUCCESS || this.f6793f == InterfaceC2349d.EnumC2350a.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: g */
    public boolean mo33175g(InterfaceC2348c interfaceC2348c) {
        if (interfaceC2348c instanceof C2347b) {
            C2347b c2347b = (C2347b) interfaceC2348c;
            return this.f6790c.mo33175g(c2347b.f6790c) && this.f6791d.mo33175g(c2347b.f6791d);
        }
        return false;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    public InterfaceC2349d getRoot() {
        InterfaceC2349d root;
        synchronized (this.f6788a) {
            root = this.f6789b != null ? this.f6789b.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: h */
    public boolean mo33174h() {
        boolean z;
        synchronized (this.f6788a) {
            z = this.f6792e == InterfaceC2349d.EnumC2350a.CLEARED && this.f6793f == InterfaceC2349d.EnumC2350a.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: i */
    public void mo33173i(InterfaceC2348c interfaceC2348c) {
        synchronized (this.f6788a) {
            if (interfaceC2348c.equals(this.f6790c)) {
                this.f6792e = InterfaceC2349d.EnumC2350a.SUCCESS;
            } else if (interfaceC2348c.equals(this.f6791d)) {
                this.f6793f = InterfaceC2349d.EnumC2350a.SUCCESS;
            }
            if (this.f6789b != null) {
                this.f6789b.mo33173i(this);
            }
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f6788a) {
            z = this.f6792e == InterfaceC2349d.EnumC2350a.RUNNING || this.f6793f == InterfaceC2349d.EnumC2350a.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: j */
    public boolean mo33172j(InterfaceC2348c interfaceC2348c) {
        boolean z;
        synchronized (this.f6788a) {
            z = m33210l() && m33211k(interfaceC2348c);
        }
        return z;
    }

    /* renamed from: o */
    public void m33207o(InterfaceC2348c interfaceC2348c, InterfaceC2348c interfaceC2348c2) {
        this.f6790c = interfaceC2348c;
        this.f6791d = interfaceC2348c2;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public void pause() {
        synchronized (this.f6788a) {
            if (this.f6792e == InterfaceC2349d.EnumC2350a.RUNNING) {
                this.f6792e = InterfaceC2349d.EnumC2350a.PAUSED;
                this.f6790c.pause();
            }
            if (this.f6793f == InterfaceC2349d.EnumC2350a.RUNNING) {
                this.f6793f = InterfaceC2349d.EnumC2350a.PAUSED;
                this.f6791d.pause();
            }
        }
    }
}
