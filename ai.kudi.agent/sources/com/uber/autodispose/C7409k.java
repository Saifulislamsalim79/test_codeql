package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p469h0.AbstractC11673a;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: AutoDisposingSubscriberImpl.java */
/* renamed from: com.uber.autodispose.k */
/* loaded from: classes2.dex */
final class C7409k<T> extends AtomicInteger implements Object<T>, InterfaceC14457c, j.e.c0.c {

    /* renamed from: c */
    final AtomicReference<InterfaceC14457c> f17564c = new AtomicReference<>();

    /* renamed from: d */
    final AtomicReference<j.e.c0.c> f17565d = new AtomicReference<>();

    /* renamed from: e */
    private final C7398b f17566e = new C7398b();

    /* renamed from: f */
    private final AtomicReference<InterfaceC14457c> f17567f = new AtomicReference<>();

    /* renamed from: w */
    private final AtomicLong f17568w = new AtomicLong();

    /* renamed from: x */
    private final InterfaceC11284d f17569x;

    /* renamed from: y */
    private final InterfaceC14456b<? super T> f17570y;

    /* compiled from: AutoDisposingSubscriberImpl.java */
    /* renamed from: com.uber.autodispose.k$a */
    /* loaded from: classes2.dex */
    class C7410a extends AbstractC11673a {
        C7410a() {
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            C7409k.this.f17565d.lazySet(EnumC7399c.DISPOSED);
            EnumC7411l.m18783a(C7409k.this.f17564c);
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            C7409k.this.f17565d.lazySet(EnumC7399c.DISPOSED);
            C7409k.this.m18788b(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7409k(InterfaceC11284d interfaceC11284d, InterfaceC14456b<? super T> interfaceC14456b) {
        this.f17569x = interfaceC11284d;
        this.f17570y = interfaceC14456b;
    }

    /* renamed from: a */
    public void m18789a() {
        if (m18784j()) {
            return;
        }
        this.f17564c.lazySet(EnumC7411l.CANCELLED);
        EnumC7399c.m18805a(this.f17565d);
        C7421o.m18765a(this.f17570y, this, this.f17566e);
    }

    /* renamed from: b */
    public void m18788b(Throwable th) {
        if (m18784j()) {
            return;
        }
        this.f17564c.lazySet(EnumC7411l.CANCELLED);
        EnumC7399c.m18805a(this.f17565d);
        C7421o.m18764b(this.f17570y, th, this, this.f17566e);
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
        EnumC7399c.m18805a(this.f17565d);
        EnumC7411l.m18783a(this.f17564c);
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
        EnumC7411l.m18782b(this.f17567f, this.f17568w, j);
    }

    /* renamed from: f */
    public void m18787f(T t) {
        if (m18784j() || !C7421o.m18763c(this.f17570y, t, this, this.f17566e)) {
            return;
        }
        this.f17564c.lazySet(EnumC7411l.CANCELLED);
        EnumC7399c.m18805a(this.f17565d);
    }

    /* renamed from: g */
    public void m18786g(InterfaceC14457c interfaceC14457c) {
        C7410a c7410a = new C7410a();
        if (C7405g.m18794c(this.f17565d, c7410a, C7409k.class)) {
            this.f17570y.mo1687g(this);
            this.f17569x.mo11202b(c7410a);
            if (C7405g.m18793d(this.f17564c, interfaceC14457c, C7409k.class)) {
                EnumC7411l.m18781g(this.f17567f, this.f17568w, interfaceC14457c);
            }
        }
    }

    /* renamed from: i */
    public void m18785i() {
        cancel();
    }

    /* renamed from: j */
    public boolean m18784j() {
        return this.f17564c.get() == EnumC7411l.CANCELLED;
    }
}
