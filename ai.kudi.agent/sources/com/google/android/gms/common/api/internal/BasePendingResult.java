package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.AbstractC2744e;
import com.google.android.gms.common.api.InterfaceC2746f;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.InterfaceC2749i;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p272h.p286c.p287a.p300b.p307d.p310c.HandlerC8416f;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepName
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends InterfaceC2748h> extends AbstractC2744e<R> {

    /* renamed from: n */
    static final ThreadLocal<Boolean> f7719n = new C2789m1();

    /* renamed from: o */
    public static final /* synthetic */ int f7720o = 0;

    /* renamed from: a */
    private final Object f7721a;

    /* renamed from: b */
    protected final HandlerC2750a<R> f7722b;

    /* renamed from: c */
    private final CountDownLatch f7723c;

    /* renamed from: d */
    private final ArrayList<AbstractC2744e.InterfaceC2745a> f7724d;

    /* renamed from: e */
    private InterfaceC2749i<? super R> f7725e;

    /* renamed from: f */
    private final AtomicReference<C2756b1> f7726f;

    /* renamed from: g */
    private R f7727g;

    /* renamed from: h */
    private Status f7728h;

    /* renamed from: i */
    private volatile boolean f7729i;

    /* renamed from: j */
    private boolean f7730j;

    /* renamed from: k */
    private boolean f7731k;

    /* renamed from: l */
    private volatile C2753a1<R> f7732l;

    /* renamed from: m */
    private boolean f7733m;
    @KeepName
    private C2795o1 mResultGuardian;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes2.dex */
    public static class HandlerC2750a<R extends InterfaceC2748h> extends HandlerC8416f {
        public HandlerC2750a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m32059a(InterfaceC2749i<? super R> interfaceC2749i, R r) {
            int i = BasePendingResult.f7720o;
            com.google.android.gms.common.internal.s.j(interfaceC2749i);
            sendMessage(obtainMessage(1, new Pair(interfaceC2749i, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                InterfaceC2749i interfaceC2749i = (InterfaceC2749i) pair.first;
                InterfaceC2748h interfaceC2748h = (InterfaceC2748h) pair.second;
                try {
                    interfaceC2749i.m32070a(interfaceC2748h);
                } catch (RuntimeException e) {
                    BasePendingResult.m32060l(interfaceC2748h);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).m32067e(Status.f7694z);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f7721a = new Object();
        this.f7723c = new CountDownLatch(1);
        this.f7724d = new ArrayList<>();
        this.f7726f = new AtomicReference<>();
        this.f7733m = false;
        this.f7722b = new HandlerC2750a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    /* renamed from: h */
    private final R m32064h() {
        R r;
        synchronized (this.f7721a) {
            com.google.android.gms.common.internal.s.n(!this.f7729i, "Result has already been consumed.");
            com.google.android.gms.common.internal.s.n(m32066f(), "Result is not ready.");
            r = this.f7727g;
            this.f7727g = null;
            this.f7725e = null;
            this.f7729i = true;
        }
        C2756b1 andSet = this.f7726f.getAndSet(null);
        if (andSet != null) {
            andSet.f7743a.f7750a.remove(this);
        }
        com.google.android.gms.common.internal.s.j(r);
        return r;
    }

    /* renamed from: i */
    private final void m32063i(R r) {
        this.f7727g = r;
        this.f7728h = r.getStatus();
        this.f7723c.countDown();
        if (this.f7730j) {
            this.f7725e = null;
        } else {
            InterfaceC2749i<? super R> interfaceC2749i = this.f7725e;
            if (interfaceC2749i == null) {
                if (this.f7727g instanceof InterfaceC2746f) {
                    this.mResultGuardian = new C2795o1(this, null);
                }
            } else {
                this.f7722b.removeMessages(2);
                this.f7722b.m32059a(interfaceC2749i, m32064h());
            }
        }
        ArrayList<AbstractC2744e.InterfaceC2745a> arrayList = this.f7724d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo31702a(this.f7728h);
        }
        this.f7724d.clear();
    }

    /* renamed from: l */
    public static void m32060l(InterfaceC2748h interfaceC2748h) {
        if (interfaceC2748h instanceof InterfaceC2746f) {
            try {
                ((InterfaceC2746f) interfaceC2748h).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(interfaceC2748h);
                String.valueOf(valueOf).length();
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(valueOf)), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC2744e
    /* renamed from: b */
    public final void mo32069b(AbstractC2744e.InterfaceC2745a interfaceC2745a) {
        com.google.android.gms.common.internal.s.b(interfaceC2745a != null, "Callback cannot be null.");
        synchronized (this.f7721a) {
            if (m32066f()) {
                interfaceC2745a.mo31702a(this.f7728h);
            } else {
                this.f7724d.add(interfaceC2745a);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC2744e
    /* renamed from: c */
    public final R mo32068c(long j, TimeUnit timeUnit) {
        if (j > 0) {
            com.google.android.gms.common.internal.s.i("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.s.n(!this.f7729i, "Result has already been consumed.");
        com.google.android.gms.common.internal.s.n(this.f7732l == null, "Cannot await if then() has been called.");
        try {
            if (!this.f7723c.await(j, timeUnit)) {
                m32067e(Status.f7694z);
            }
        } catch (InterruptedException unused) {
            m32067e(Status.f7693y);
        }
        com.google.android.gms.common.internal.s.n(m32066f(), "Result is not ready.");
        return m32064h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract R mo16049d(Status status);

    @Deprecated
    /* renamed from: e */
    public final void m32067e(Status status) {
        synchronized (this.f7721a) {
            if (!m32066f()) {
                m32065g(mo16049d(status));
                this.f7731k = true;
            }
        }
    }

    /* renamed from: f */
    public final boolean m32066f() {
        return this.f7723c.getCount() == 0;
    }

    /* renamed from: g */
    public final void m32065g(R r) {
        synchronized (this.f7721a) {
            if (!this.f7731k && !this.f7730j) {
                m32066f();
                com.google.android.gms.common.internal.s.n(!m32066f(), "Results have already been set");
                com.google.android.gms.common.internal.s.n(!this.f7729i, "Result has already been consumed");
                m32063i(r);
                return;
            }
            m32060l(r);
        }
    }

    /* renamed from: k */
    public final void m32061k() {
        boolean z = true;
        if (!this.f7733m && !f7719n.get().booleanValue()) {
            z = false;
        }
        this.f7733m = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(AbstractC2743d abstractC2743d) {
        this.f7721a = new Object();
        this.f7723c = new CountDownLatch(1);
        this.f7724d = new ArrayList<>();
        this.f7726f = new AtomicReference<>();
        this.f7733m = false;
        this.f7722b = new HandlerC2750a<>(abstractC2743d != null ? abstractC2743d.m32076b() : Looper.getMainLooper());
        new WeakReference(abstractC2743d);
    }
}
