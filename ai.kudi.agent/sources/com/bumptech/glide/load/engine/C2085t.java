package com.bumptech.glide.load.engine;

import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.p087l.AbstractC2392c;
import com.bumptech.glide.p086q.p087l.C2383a;
import p201g.p227h.p237k.InterfaceC7672e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LockedResource.java */
/* renamed from: com.bumptech.glide.load.engine.t */
/* loaded from: classes2.dex */
public final class C2085t<Z> implements InterfaceC2087u<Z>, C2383a.InterfaceC2389f {

    /* renamed from: w */
    private static final InterfaceC7672e<C2085t<?>> f6334w = C2383a.m33105d(20, new C2086a());

    /* renamed from: c */
    private final AbstractC2392c f6335c = AbstractC2392c.m33094a();

    /* renamed from: d */
    private InterfaceC2087u<Z> f6336d;

    /* renamed from: e */
    private boolean f6337e;

    /* renamed from: f */
    private boolean f6338f;

    /* compiled from: LockedResource.java */
    /* renamed from: com.bumptech.glide.load.engine.t$a */
    /* loaded from: classes2.dex */
    class C2086a implements C2383a.InterfaceC2387d<C2085t<?>> {
        C2086a() {
        }

        @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2387d
        /* renamed from: a */
        public C2085t<?> create() {
            return new C2085t<>();
        }
    }

    C2085t() {
    }

    /* renamed from: a */
    private void m33759a(InterfaceC2087u<Z> interfaceC2087u) {
        this.f6338f = false;
        this.f6337e = true;
        this.f6336d = interfaceC2087u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <Z> C2085t<Z> m33758d(InterfaceC2087u<Z> interfaceC2087u) {
        C2085t<?> mo11982b = f6334w.mo11982b();
        C2380j.m33129d(mo11982b);
        C2085t<Z> c2085t = (C2085t<Z>) mo11982b;
        c2085t.m33759a(interfaceC2087u);
        return c2085t;
    }

    /* renamed from: e */
    private void m33757e() {
        this.f6336d = null;
        f6334w.mo11983a(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: b */
    public synchronized void mo33303b() {
        this.f6335c.mo33092c();
        this.f6338f = true;
        if (!this.f6337e) {
            this.f6336d.mo33303b();
            m33757e();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: c */
    public Class<Z> mo33302c() {
        return this.f6336d.mo33302c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void m33756f() {
        this.f6335c.mo33092c();
        if (this.f6337e) {
            this.f6337e = false;
            if (this.f6338f) {
                mo33303b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2389f
    /* renamed from: g */
    public AbstractC2392c mo33100g() {
        return this.f6335c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public Z get() {
        return this.f6336d.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public int getSize() {
        return this.f6336d.getSize();
    }
}
