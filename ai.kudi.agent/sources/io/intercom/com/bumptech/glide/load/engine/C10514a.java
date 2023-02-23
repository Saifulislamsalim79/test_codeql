package io.intercom.com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.C10562o;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ActiveResources.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.a */
/* loaded from: classes3.dex */
final class C10514a {

    /* renamed from: a */
    private final boolean f24124a;

    /* renamed from: b */
    private final Handler f24125b = new Handler(Looper.getMainLooper(), new C10515a());

    /* renamed from: c */
    final Map<InterfaceC10622g, C10518d> f24126c = new HashMap();

    /* renamed from: d */
    private C10562o.InterfaceC10563a f24127d;

    /* renamed from: e */
    private ReferenceQueue<C10562o<?>> f24128e;

    /* renamed from: f */
    private Thread f24129f;

    /* renamed from: g */
    private volatile boolean f24130g;

    /* renamed from: h */
    private volatile InterfaceC10517c f24131h;

    /* compiled from: ActiveResources.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.a$a */
    /* loaded from: classes3.dex */
    class C10515a implements Handler.Callback {
        C10515a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                C10514a.this.m12855g((C10518d) message.obj);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveResources.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.a$b */
    /* loaded from: classes3.dex */
    public class RunnableC10516b implements Runnable {
        RunnableC10516b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (!C10514a.this.f24130g) {
                try {
                    C10514a.this.f24125b.obtainMessage(1, (C10518d) C10514a.this.f24128e.remove()).sendToTarget();
                    InterfaceC10517c interfaceC10517c = C10514a.this.f24131h;
                    if (interfaceC10517c != null) {
                        interfaceC10517c.m12850a();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* compiled from: ActiveResources.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.a$c */
    /* loaded from: classes3.dex */
    interface InterfaceC10517c {
        /* renamed from: a */
        void m12850a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveResources.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.a$d */
    /* loaded from: classes3.dex */
    public static final class C10518d extends WeakReference<C10562o<?>> {

        /* renamed from: a */
        final InterfaceC10622g f24134a;

        /* renamed from: b */
        final boolean f24135b;

        /* renamed from: c */
        InterfaceC10569t<?> f24136c;

        C10518d(InterfaceC10622g interfaceC10622g, C10562o<?> c10562o, ReferenceQueue<? super C10562o<?>> referenceQueue, boolean z) {
            super(c10562o, referenceQueue);
            InterfaceC10569t<?> interfaceC10569t;
            C10892h.m12014d(interfaceC10622g);
            this.f24134a = interfaceC10622g;
            if (c10562o.m12737e() && z) {
                InterfaceC10569t<?> m12738d = c10562o.m12738d();
                C10892h.m12014d(m12738d);
                interfaceC10569t = m12738d;
            } else {
                interfaceC10569t = null;
            }
            this.f24136c = interfaceC10569t;
            this.f24135b = c10562o.m12737e();
        }

        /* renamed from: a */
        void m12849a() {
            this.f24136c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10514a(boolean z) {
        this.f24124a = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m12855g(C10518d c10518d) {
        InterfaceC10569t<?> interfaceC10569t;
        C10893i.m12011b();
        this.f24126c.remove(c10518d.f24134a);
        if (!c10518d.f24135b || (interfaceC10569t = c10518d.f24136c) == null) {
            return;
        }
        C10562o<?> c10562o = new C10562o<>(interfaceC10569t, true, false);
        c10562o.m12735g(c10518d.f24134a, this.f24127d);
        this.f24127d.mo12734a(c10518d.f24134a, c10562o);
    }

    /* renamed from: j */
    private ReferenceQueue<C10562o<?>> m12852j() {
        if (this.f24128e == null) {
            this.f24128e = new ReferenceQueue<>();
            Thread thread = new Thread(new RunnableC10516b(), "glide-active-resources");
            this.f24129f = thread;
            thread.start();
        }
        return this.f24128e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m12856f(InterfaceC10622g interfaceC10622g, C10562o<?> c10562o) {
        C10518d put = this.f24126c.put(interfaceC10622g, new C10518d(interfaceC10622g, c10562o, m12852j(), this.f24124a));
        if (put != null) {
            put.m12849a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m12854h(InterfaceC10622g interfaceC10622g) {
        C10518d remove = this.f24126c.remove(interfaceC10622g);
        if (remove != null) {
            remove.m12849a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C10562o<?> m12853i(InterfaceC10622g interfaceC10622g) {
        C10518d c10518d = this.f24126c.get(interfaceC10622g);
        if (c10518d == null) {
            return null;
        }
        C10562o<?> c10562o = c10518d.get();
        if (c10562o == null) {
            m12855g(c10518d);
        }
        return c10562o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m12851k(C10562o.InterfaceC10563a interfaceC10563a) {
        this.f24127d = interfaceC10563a;
    }
}
