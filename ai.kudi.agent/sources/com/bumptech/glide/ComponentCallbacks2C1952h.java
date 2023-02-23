package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.AbstractC2060j;
import com.bumptech.glide.load.p074o.p078g.C2265c;
import com.bumptech.glide.p066l.C1989n;
import com.bumptech.glide.p066l.C1992p;
import com.bumptech.glide.p066l.InterfaceC1973c;
import com.bumptech.glide.p066l.InterfaceC1975d;
import com.bumptech.glide.p066l.InterfaceC1980h;
import com.bumptech.glide.p066l.InterfaceC1981i;
import com.bumptech.glide.p066l.InterfaceC1988m;
import com.bumptech.glide.p082o.C2352f;
import com.bumptech.glide.p082o.InterfaceC2348c;
import com.bumptech.glide.p082o.InterfaceC2351e;
import com.bumptech.glide.p082o.p083j.InterfaceC2360d;
import com.bumptech.glide.p086q.C2381k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: RequestManager.java */
/* renamed from: com.bumptech.glide.h */
/* loaded from: classes2.dex */
public class ComponentCallbacks2C1952h implements ComponentCallbacks2, InterfaceC1981i {

    /* renamed from: E */
    private static final C2352f f5936E;

    /* renamed from: A */
    private final InterfaceC1973c f5937A;

    /* renamed from: B */
    private final CopyOnWriteArrayList<InterfaceC2351e<Object>> f5938B;

    /* renamed from: C */
    private C2352f f5939C;

    /* renamed from: D */
    private boolean f5940D;

    /* renamed from: c */
    protected final ComponentCallbacks2C1943b f5941c;

    /* renamed from: d */
    protected final Context f5942d;

    /* renamed from: e */
    final InterfaceC1980h f5943e;

    /* renamed from: f */
    private final C1989n f5944f;

    /* renamed from: w */
    private final InterfaceC1988m f5945w;

    /* renamed from: x */
    private final C1992p f5946x;

    /* renamed from: y */
    private final Runnable f5947y;

    /* renamed from: z */
    private final Handler f5948z;

    /* compiled from: RequestManager.java */
    /* renamed from: com.bumptech.glide.h$a */
    /* loaded from: classes2.dex */
    class RunnableC1953a implements Runnable {
        RunnableC1953a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C1952h componentCallbacks2C1952h = ComponentCallbacks2C1952h.this;
            componentCallbacks2C1952h.f5943e.mo34004a(componentCallbacks2C1952h);
        }
    }

    /* compiled from: RequestManager.java */
    /* renamed from: com.bumptech.glide.h$b */
    /* loaded from: classes2.dex */
    private class C1954b implements InterfaceC1973c.InterfaceC1974a {

        /* renamed from: a */
        private final C1989n f5950a;

        C1954b(C1989n c1989n) {
            this.f5950a = c1989n;
        }

        @Override // com.bumptech.glide.p066l.InterfaceC1973c.InterfaceC1974a
        /* renamed from: a */
        public void mo34009a(boolean z) {
            if (z) {
                synchronized (ComponentCallbacks2C1952h.this) {
                    this.f5950a.m33972e();
                }
            }
        }
    }

    static {
        C2352f m33205X = C2352f.m33205X(Bitmap.class);
        m33205X.m33250H();
        f5936E = m33205X;
        C2352f.m33205X(C2265c.class).m33250H();
        C2352f.m33204Y(AbstractC2060j.f6253b).m33247L(EnumC1949f.LOW).m33241R(true);
    }

    public ComponentCallbacks2C1952h(ComponentCallbacks2C1943b componentCallbacks2C1943b, InterfaceC1980h interfaceC1980h, InterfaceC1988m interfaceC1988m, Context context) {
        this(componentCallbacks2C1943b, interfaceC1980h, interfaceC1988m, new C1989n(), componentCallbacks2C1943b.m34165g(), context);
    }

    /* renamed from: u */
    private void m34110u(InterfaceC2360d<?> interfaceC2360d) {
        boolean m34111t = m34111t(interfaceC2360d);
        InterfaceC2348c request = interfaceC2360d.getRequest();
        if (m34111t || this.f5941c.m34156p(interfaceC2360d) || request == null) {
            return;
        }
        interfaceC2360d.mo33165c(null);
        request.clear();
    }

    /* renamed from: e */
    public ComponentCallbacks2C1952h m34126e(InterfaceC2351e<Object> interfaceC2351e) {
        this.f5938B.add(interfaceC2351e);
        return this;
    }

    /* renamed from: f */
    public <ResourceType> C1950g<ResourceType> m34125f(Class<ResourceType> cls) {
        return new C1950g<>(this.f5941c, this, cls, this.f5942d);
    }

    /* renamed from: g */
    public C1950g<Bitmap> m34124g() {
        return m34125f(Bitmap.class).mo33236a(f5936E);
    }

    /* renamed from: h */
    public C1950g<Drawable> m34123h() {
        return m34125f(Drawable.class);
    }

    /* renamed from: i */
    public void m34122i(InterfaceC2360d<?> interfaceC2360d) {
        if (interfaceC2360d == null) {
            return;
        }
        m34110u(interfaceC2360d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public List<InterfaceC2351e<Object>> m34121j() {
        return this.f5938B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized C2352f m34120k() {
        return this.f5939C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public <T> AbstractC1955i<?, T> m34119l(Class<T> cls) {
        return this.f5941c.m34163i().m34146d(cls);
    }

    /* renamed from: m */
    public C1950g<Drawable> m34118m(Object obj) {
        C1950g<Drawable> m34123h = m34123h();
        m34123h.m34129m0(obj);
        return m34123h;
    }

    /* renamed from: n */
    public synchronized void m34117n() {
        this.f5944f.m33974c();
    }

    /* renamed from: o */
    public synchronized void m34116o() {
        m34117n();
        for (ComponentCallbacks2C1952h componentCallbacks2C1952h : this.f5945w.mo33956a()) {
            componentCallbacks2C1952h.m34117n();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public synchronized void onDestroy() {
        this.f5946x.onDestroy();
        for (InterfaceC2360d<?> interfaceC2360d : this.f5946x.m33954f()) {
            m34122i(interfaceC2360d);
        }
        this.f5946x.m33955e();
        this.f5944f.m33975b();
        this.f5943e.mo34003b(this);
        this.f5943e.mo34003b(this.f5937A);
        this.f5948z.removeCallbacks(this.f5947y);
        this.f5941c.m34153s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public synchronized void onStart() {
        m34114q();
        this.f5946x.onStart();
    }

    @Override // com.bumptech.glide.p066l.InterfaceC1981i
    public synchronized void onStop() {
        m34115p();
        this.f5946x.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f5940D) {
            m34116o();
        }
    }

    /* renamed from: p */
    public synchronized void m34115p() {
        this.f5944f.m33973d();
    }

    /* renamed from: q */
    public synchronized void m34114q() {
        this.f5944f.m33971f();
    }

    /* renamed from: r */
    protected synchronized void m34113r(C2352f c2352f) {
        C2352f clone = c2352f.clone();
        clone.m33235b();
        this.f5939C = clone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public synchronized void m34112s(InterfaceC2360d<?> interfaceC2360d, InterfaceC2348c interfaceC2348c) {
        this.f5946x.m33953g(interfaceC2360d);
        this.f5944f.m33970g(interfaceC2348c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized boolean m34111t(InterfaceC2360d<?> interfaceC2360d) {
        InterfaceC2348c request = interfaceC2360d.getRequest();
        if (request == null) {
            return true;
        }
        if (this.f5944f.m33976a(request)) {
            this.f5946x.m33952h(interfaceC2360d);
            interfaceC2360d.mo33165c(null);
            return true;
        }
        return false;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5944f + ", treeNode=" + this.f5945w + "}";
    }

    ComponentCallbacks2C1952h(ComponentCallbacks2C1943b componentCallbacks2C1943b, InterfaceC1980h interfaceC1980h, InterfaceC1988m interfaceC1988m, C1989n c1989n, InterfaceC1975d interfaceC1975d, Context context) {
        this.f5946x = new C1992p();
        this.f5947y = new RunnableC1953a();
        this.f5948z = new Handler(Looper.getMainLooper());
        this.f5941c = componentCallbacks2C1943b;
        this.f5943e = interfaceC1980h;
        this.f5945w = interfaceC1988m;
        this.f5944f = c1989n;
        this.f5942d = context;
        this.f5937A = interfaceC1975d.mo34005a(context.getApplicationContext(), new C1954b(c1989n));
        if (C2381k.m33113o()) {
            this.f5948z.post(this.f5947y);
        } else {
            interfaceC1980h.mo34004a(this);
        }
        interfaceC1980h.mo34004a(this.f5937A);
        this.f5938B = new CopyOnWriteArrayList<>(componentCallbacks2C1943b.m34163i().m34148b());
        m34113r(componentCallbacks2C1943b.m34163i().m34147c());
        componentCallbacks2C1943b.m34157o(this);
    }
}
