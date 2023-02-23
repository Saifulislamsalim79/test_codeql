package io.intercom.com.bumptech.glide.load.engine;

import android.os.Looper;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.p416r.C10892h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EngineResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.o */
/* loaded from: classes3.dex */
public class C10562o<Z> implements InterfaceC10569t<Z> {

    /* renamed from: c */
    private final boolean f24297c;

    /* renamed from: d */
    private final boolean f24298d;

    /* renamed from: e */
    private InterfaceC10563a f24299e;

    /* renamed from: f */
    private InterfaceC10622g f24300f;

    /* renamed from: w */
    private int f24301w;

    /* renamed from: x */
    private boolean f24302x;

    /* renamed from: y */
    private final InterfaceC10569t<Z> f24303y;

    /* compiled from: EngineResource.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.o$a */
    /* loaded from: classes3.dex */
    interface InterfaceC10563a {
        /* renamed from: a */
        void mo12734a(InterfaceC10622g interfaceC10622g, C10562o<?> c10562o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10562o(InterfaceC10569t<Z> interfaceC10569t, boolean z, boolean z2) {
        C10892h.m12014d(interfaceC10569t);
        this.f24303y = interfaceC10569t;
        this.f24297c = z;
        this.f24298d = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12739a() {
        if (!this.f24302x) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                this.f24301w++;
                return;
            }
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        throw new IllegalStateException("Cannot acquire a recycled resource");
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: b */
    public void mo12303b() {
        if (this.f24301w <= 0) {
            if (!this.f24302x) {
                this.f24302x = true;
                if (this.f24298d) {
                    this.f24303y.mo12303b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: c */
    public Class<Z> mo12302c() {
        return this.f24303y.mo12302c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC10569t<Z> m12738d() {
        return this.f24303y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m12737e() {
        return this.f24297c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m12736f() {
        if (this.f24301w > 0) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                int i = this.f24301w - 1;
                this.f24301w = i;
                if (i == 0) {
                    this.f24299e.mo12734a(this.f24300f, this);
                    return;
                }
                return;
            }
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m12735g(InterfaceC10622g interfaceC10622g, InterfaceC10563a interfaceC10563a) {
        this.f24300f = interfaceC10622g;
        this.f24299e = interfaceC10563a;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public Z get() {
        return this.f24303y.get();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public int getSize() {
        return this.f24303y.getSize();
    }

    public String toString() {
        return "EngineResource{isCacheable=" + this.f24297c + ", listener=" + this.f24299e + ", key=" + this.f24300f + ", acquired=" + this.f24301w + ", isRecycled=" + this.f24302x + ", resource=" + this.f24303y + '}';
    }
}
