package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.p417j.AbstractC10903b;
import io.intercom.com.bumptech.glide.p416r.p417j.C10895a;
import p201g.p227h.p237k.InterfaceC7672e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LockedResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.s */
/* loaded from: classes3.dex */
public final class C10567s<Z> implements InterfaceC10569t<Z>, C10895a.InterfaceC10901f {

    /* renamed from: w */
    private static final InterfaceC7672e<C10567s<?>> f24309w = C10895a.m11988e(20, new C10568a());

    /* renamed from: c */
    private final AbstractC10903b f24310c = AbstractC10903b.m11979a();

    /* renamed from: d */
    private InterfaceC10569t<Z> f24311d;

    /* renamed from: e */
    private boolean f24312e;

    /* renamed from: f */
    private boolean f24313f;

    /* compiled from: LockedResource.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.s$a */
    /* loaded from: classes3.dex */
    static class C10568a implements C10895a.InterfaceC10899d<C10567s<?>> {
        C10568a() {
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10899d
        /* renamed from: a */
        public C10567s<?> create() {
            return new C10567s<>();
        }
    }

    C10567s() {
    }

    /* renamed from: a */
    private void m12727a(InterfaceC10569t<Z> interfaceC10569t) {
        this.f24313f = false;
        this.f24312e = true;
        this.f24311d = interfaceC10569t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <Z> C10567s<Z> m12726d(InterfaceC10569t<Z> interfaceC10569t) {
        C10567s<?> mo11982b = f24309w.mo11982b();
        C10892h.m12014d(mo11982b);
        C10567s<Z> c10567s = (C10567s<Z>) mo11982b;
        c10567s.m12727a(interfaceC10569t);
        return c10567s;
    }

    /* renamed from: e */
    private void m12725e() {
        this.f24311d = null;
        f24309w.mo11983a(this);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: b */
    public synchronized void mo12303b() {
        this.f24310c.mo11977c();
        this.f24313f = true;
        if (!this.f24312e) {
            this.f24311d.mo12303b();
            m12725e();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: c */
    public Class<Z> mo12302c() {
        return this.f24311d.mo12302c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void m12724f() {
        this.f24310c.mo11977c();
        if (this.f24312e) {
            this.f24312e = false;
            if (this.f24313f) {
                mo12303b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10901f
    /* renamed from: g */
    public AbstractC10903b mo11981g() {
        return this.f24310c;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public Z get() {
        return this.f24311d.get();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public int getSize() {
        return this.f24311d.getSize();
    }
}
