package p425j.p444e.p451f0.p465h;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11656c;
import p425j.p444e.p451f0.p467j.C11663i;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: StrictSubscriber.java */
/* renamed from: j.e.f0.h.d */
/* loaded from: classes3.dex */
public class C11645d<T> extends AtomicInteger implements InterfaceC11676j<T>, InterfaceC14457c {

    /* renamed from: c */
    final InterfaceC14456b<? super T> f26319c;

    /* renamed from: d */
    final C11656c f26320d = new C11656c();

    /* renamed from: e */
    final AtomicLong f26321e = new AtomicLong();

    /* renamed from: f */
    final AtomicReference<InterfaceC14457c> f26322f = new AtomicReference<>();

    /* renamed from: w */
    final AtomicBoolean f26323w = new AtomicBoolean();

    /* renamed from: x */
    volatile boolean f26324x;

    public C11645d(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f26319c = interfaceC14456b;
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: a */
    public void mo1690a() {
        this.f26324x = true;
        C11663i.m10644b(this.f26319c, this, this.f26320d);
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: b */
    public void mo1689b(Throwable th) {
        this.f26324x = true;
        C11663i.m10642d(this.f26319c, th, this, this.f26320d);
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
        if (this.f26324x) {
            return;
        }
        EnumC11652g.m10675a(this.f26322f);
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
        if (j <= 0) {
            cancel();
            mo1689b(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        EnumC11652g.m10674b(this.f26322f, this.f26321e, j);
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: f */
    public void mo1688f(T t) {
        C11663i.m10640f(this.f26319c, t, this, this.f26320d);
    }

    @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
    /* renamed from: g */
    public void mo1687g(InterfaceC14457c interfaceC14457c) {
        if (this.f26323w.compareAndSet(false, true)) {
            this.f26319c.mo1687g(this);
            EnumC11652g.m10673g(this.f26322f, this.f26321e, interfaceC14457c);
            return;
        }
        interfaceC14457c.cancel();
        cancel();
        mo1689b(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }
}
