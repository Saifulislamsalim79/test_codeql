package com.bumptech.glide.p082o;

import com.bumptech.glide.p082o.InterfaceC2349d;
/* compiled from: ThumbnailRequestCoordinator.java */
/* renamed from: com.bumptech.glide.o.i */
/* loaded from: classes2.dex */
public class C2356i implements InterfaceC2349d, InterfaceC2348c {

    /* renamed from: a */
    private final InterfaceC2349d f6838a;

    /* renamed from: b */
    private final Object f6839b;

    /* renamed from: c */
    private volatile InterfaceC2348c f6840c;

    /* renamed from: d */
    private volatile InterfaceC2348c f6841d;

    /* renamed from: e */
    private InterfaceC2349d.EnumC2350a f6842e;

    /* renamed from: f */
    private InterfaceC2349d.EnumC2350a f6843f;

    /* renamed from: g */
    private boolean f6844g;

    public C2356i(Object obj, InterfaceC2349d interfaceC2349d) {
        InterfaceC2349d.EnumC2350a enumC2350a = InterfaceC2349d.EnumC2350a.CLEARED;
        this.f6842e = enumC2350a;
        this.f6843f = enumC2350a;
        this.f6839b = obj;
        this.f6838a = interfaceC2349d;
    }

    /* renamed from: k */
    private boolean m33171k() {
        InterfaceC2349d interfaceC2349d = this.f6838a;
        return interfaceC2349d == null || interfaceC2349d.mo33172j(this);
    }

    /* renamed from: l */
    private boolean m33170l() {
        InterfaceC2349d interfaceC2349d = this.f6838a;
        return interfaceC2349d == null || interfaceC2349d.mo33179c(this);
    }

    /* renamed from: m */
    private boolean m33169m() {
        InterfaceC2349d interfaceC2349d = this.f6838a;
        return interfaceC2349d == null || interfaceC2349d.mo33178d(this);
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d, com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: a */
    public boolean mo33181a() {
        boolean z;
        synchronized (this.f6839b) {
            z = this.f6841d.mo33181a() || this.f6840c.mo33181a();
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: b */
    public void mo33180b(InterfaceC2348c interfaceC2348c) {
        synchronized (this.f6839b) {
            if (!interfaceC2348c.equals(this.f6840c)) {
                this.f6843f = InterfaceC2349d.EnumC2350a.FAILED;
                return;
            }
            this.f6842e = InterfaceC2349d.EnumC2350a.FAILED;
            if (this.f6838a != null) {
                this.f6838a.mo33180b(this);
            }
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: c */
    public boolean mo33179c(InterfaceC2348c interfaceC2348c) {
        boolean z;
        synchronized (this.f6839b) {
            z = m33170l() && interfaceC2348c.equals(this.f6840c) && !mo33181a();
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public void clear() {
        synchronized (this.f6839b) {
            this.f6844g = false;
            this.f6842e = InterfaceC2349d.EnumC2350a.CLEARED;
            this.f6843f = InterfaceC2349d.EnumC2350a.CLEARED;
            this.f6841d.clear();
            this.f6840c.clear();
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: d */
    public boolean mo33178d(InterfaceC2348c interfaceC2348c) {
        boolean z;
        synchronized (this.f6839b) {
            z = m33169m() && (interfaceC2348c.equals(this.f6840c) || this.f6842e != InterfaceC2349d.EnumC2350a.SUCCESS);
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: e */
    public void mo33177e() {
        synchronized (this.f6839b) {
            this.f6844g = true;
            if (this.f6842e != InterfaceC2349d.EnumC2350a.SUCCESS && this.f6843f != InterfaceC2349d.EnumC2350a.RUNNING) {
                this.f6843f = InterfaceC2349d.EnumC2350a.RUNNING;
                this.f6841d.mo33177e();
            }
            if (this.f6844g && this.f6842e != InterfaceC2349d.EnumC2350a.RUNNING) {
                this.f6842e = InterfaceC2349d.EnumC2350a.RUNNING;
                this.f6840c.mo33177e();
            }
            this.f6844g = false;
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: f */
    public boolean mo33176f() {
        boolean z;
        synchronized (this.f6839b) {
            z = this.f6842e == InterfaceC2349d.EnumC2350a.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: g */
    public boolean mo33175g(InterfaceC2348c interfaceC2348c) {
        if (interfaceC2348c instanceof C2356i) {
            C2356i c2356i = (C2356i) interfaceC2348c;
            if (this.f6840c == null) {
                if (c2356i.f6840c != null) {
                    return false;
                }
            } else if (!this.f6840c.mo33175g(c2356i.f6840c)) {
                return false;
            }
            if (this.f6841d == null) {
                if (c2356i.f6841d != null) {
                    return false;
                }
            } else if (!this.f6841d.mo33175g(c2356i.f6841d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    public InterfaceC2349d getRoot() {
        InterfaceC2349d root;
        synchronized (this.f6839b) {
            root = this.f6838a != null ? this.f6838a.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: h */
    public boolean mo33174h() {
        boolean z;
        synchronized (this.f6839b) {
            z = this.f6842e == InterfaceC2349d.EnumC2350a.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: i */
    public void mo33173i(InterfaceC2348c interfaceC2348c) {
        synchronized (this.f6839b) {
            if (interfaceC2348c.equals(this.f6841d)) {
                this.f6843f = InterfaceC2349d.EnumC2350a.SUCCESS;
                return;
            }
            this.f6842e = InterfaceC2349d.EnumC2350a.SUCCESS;
            if (this.f6838a != null) {
                this.f6838a.mo33173i(this);
            }
            if (!this.f6843f.m33206a()) {
                this.f6841d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f6839b) {
            z = this.f6842e == InterfaceC2349d.EnumC2350a.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2349d
    /* renamed from: j */
    public boolean mo33172j(InterfaceC2348c interfaceC2348c) {
        boolean z;
        synchronized (this.f6839b) {
            z = m33171k() && interfaceC2348c.equals(this.f6840c) && this.f6842e != InterfaceC2349d.EnumC2350a.PAUSED;
        }
        return z;
    }

    /* renamed from: n */
    public void m33168n(InterfaceC2348c interfaceC2348c, InterfaceC2348c interfaceC2348c2) {
        this.f6840c = interfaceC2348c;
        this.f6841d = interfaceC2348c2;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public void pause() {
        synchronized (this.f6839b) {
            if (!this.f6843f.m33206a()) {
                this.f6843f = InterfaceC2349d.EnumC2350a.PAUSED;
                this.f6841d.pause();
            }
            if (!this.f6842e.m33206a()) {
                this.f6842e = InterfaceC2349d.EnumC2350a.PAUSED;
                this.f6840c.pause();
            }
        }
    }
}
