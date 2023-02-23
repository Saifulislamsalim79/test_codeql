package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.p086q.C2380j;
/* compiled from: EngineResource.java */
/* renamed from: com.bumptech.glide.load.engine.p */
/* loaded from: classes2.dex */
class C2080p<Z> implements InterfaceC2087u<Z> {

    /* renamed from: c */
    private final boolean f6322c;

    /* renamed from: d */
    private final boolean f6323d;

    /* renamed from: e */
    private final InterfaceC2087u<Z> f6324e;

    /* renamed from: f */
    private final InterfaceC2081a f6325f;

    /* renamed from: w */
    private final InterfaceC2118f f6326w;

    /* renamed from: x */
    private int f6327x;

    /* renamed from: y */
    private boolean f6328y;

    /* compiled from: EngineResource.java */
    /* renamed from: com.bumptech.glide.load.engine.p$a */
    /* loaded from: classes2.dex */
    interface InterfaceC2081a {
        /* renamed from: d */
        void mo33766d(InterfaceC2118f interfaceC2118f, C2080p<?> c2080p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2080p(InterfaceC2087u<Z> interfaceC2087u, boolean z, boolean z2, InterfaceC2118f interfaceC2118f, InterfaceC2081a interfaceC2081a) {
        C2380j.m33129d(interfaceC2087u);
        this.f6324e = interfaceC2087u;
        this.f6322c = z;
        this.f6323d = z2;
        this.f6326w = interfaceC2118f;
        C2380j.m33129d(interfaceC2081a);
        this.f6325f = interfaceC2081a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m33770a() {
        if (!this.f6328y) {
            this.f6327x++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: b */
    public synchronized void mo33303b() {
        if (this.f6327x <= 0) {
            if (!this.f6328y) {
                this.f6328y = true;
                if (this.f6323d) {
                    this.f6324e.mo33303b();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: c */
    public Class<Z> mo33302c() {
        return this.f6324e.mo33302c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC2087u<Z> m33769d() {
        return this.f6324e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m33768e() {
        return this.f6322c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m33767f() {
        boolean z;
        synchronized (this) {
            if (this.f6327x > 0) {
                z = true;
                int i = this.f6327x - 1;
                this.f6327x = i;
                if (i != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f6325f.mo33766d(this.f6326w, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public Z get() {
        return this.f6324e.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public int getSize() {
        return this.f6324e.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f6322c + ", listener=" + this.f6325f + ", key=" + this.f6326w + ", acquired=" + this.f6327x + ", isRecycled=" + this.f6328y + ", resource=" + this.f6324e + '}';
    }
}
