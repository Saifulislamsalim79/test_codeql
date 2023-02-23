package com.google.mlkit.common.p186b;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.AbstractC4446a;
import com.google.android.gms.tasks.C4448b;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.j;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p272h.p286c.p287a.p300b.p307d.p315h.C8532z;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.k */
/* loaded from: classes2.dex */
public abstract class AbstractC6941k {

    /* renamed from: b */
    private final AtomicInteger f16637b = new AtomicInteger(0);

    /* renamed from: c */
    private final AtomicBoolean f16638c = new AtomicBoolean(false);

    /* renamed from: a */
    protected final C6945o f16636a = new C6945o();

    /* renamed from: a */
    public <T> j<T> m20440a(final Executor executor, final Callable<T> callable, final AbstractC4446a abstractC4446a) {
        s.m(this.f16637b.get() > 0);
        if (abstractC4446a.mo27728a()) {
            return C4469m.m27767d();
        }
        final C4448b c4448b = new C4448b();
        final C4465k c4465k = new C4465k(c4448b.m27787b());
        this.f16636a.m20431a(new Executor() { // from class: com.google.mlkit.common.b.b0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                AbstractC4446a abstractC4446a2 = abstractC4446a;
                C4448b c4448b2 = c4448b;
                C4465k c4465k2 = c4465k;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e) {
                    if (abstractC4446a2.mo27728a()) {
                        c4448b2.m27788a();
                    } else {
                        c4465k2.m27776b(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.b.z
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6941k.this.m20437f(abstractC4446a, c4448b, callable, c4465k);
            }
        });
        return c4465k.m27777a();
    }

    /* renamed from: b */
    public abstract void mo20397b() throws MlKitException;

    /* renamed from: c */
    public void m20439c() {
        this.f16637b.incrementAndGet();
    }

    /* renamed from: d */
    protected abstract void mo20396d();

    /* renamed from: e */
    public void m20438e(Executor executor) {
        s.m(this.f16637b.get() > 0);
        final C4465k c4465k = new C4465k();
        this.f16636a.m20431a(executor, new Runnable() { // from class: com.google.mlkit.common.b.a0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6941k.this.m20436g(c4465k);
            }
        });
        c4465k.m27777a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m20437f(AbstractC4446a abstractC4446a, C4448b c4448b, Callable callable, C4465k c4465k) {
        try {
            if (abstractC4446a.mo27728a()) {
                c4448b.m27788a();
                return;
            }
            try {
                if (!this.f16638c.get()) {
                    mo20397b();
                    this.f16638c.set(true);
                }
                if (abstractC4446a.mo27728a()) {
                    c4448b.m27788a();
                    return;
                }
                Object call = callable.call();
                if (abstractC4446a.mo27728a()) {
                    c4448b.m27788a();
                } else {
                    c4465k.m27775c(call);
                }
            } catch (RuntimeException e) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e2) {
            if (abstractC4446a.mo27728a()) {
                c4448b.m27788a();
            } else {
                c4465k.m27776b(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m20436g(C4465k c4465k) {
        int decrementAndGet = this.f16637b.decrementAndGet();
        s.m(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            mo20396d();
            this.f16638c.set(false);
        }
        C8532z.m15994a();
        c4465k.m27775c(null);
    }
}
