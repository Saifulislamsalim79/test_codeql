package com.bumptech.glide.load.p074o.p078g;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1950g;
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.ComponentCallbacks2C1952h;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.AbstractC2060j;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.p065k.InterfaceC1965a;
import com.bumptech.glide.p082o.C2352f;
import com.bumptech.glide.p082o.p083j.AbstractC2357a;
import com.bumptech.glide.p082o.p084k.InterfaceC2363b;
import com.bumptech.glide.p085p.C2366b;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.C2381k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GifFrameLoader.java */
/* renamed from: com.bumptech.glide.load.o.g.g */
/* loaded from: classes2.dex */
public class C2270g {

    /* renamed from: a */
    private final InterfaceC1965a f6619a;

    /* renamed from: b */
    private final Handler f6620b;

    /* renamed from: c */
    private final List<InterfaceC2272b> f6621c;

    /* renamed from: d */
    final ComponentCallbacks2C1952h f6622d;

    /* renamed from: e */
    private final InterfaceC2100e f6623e;

    /* renamed from: f */
    private boolean f6624f;

    /* renamed from: g */
    private boolean f6625g;

    /* renamed from: h */
    private boolean f6626h;

    /* renamed from: i */
    private C1950g<Bitmap> f6627i;

    /* renamed from: j */
    private C2271a f6628j;

    /* renamed from: k */
    private boolean f6629k;

    /* renamed from: l */
    private C2271a f6630l;

    /* renamed from: m */
    private Bitmap f6631m;

    /* renamed from: n */
    private C2271a f6632n;

    /* renamed from: o */
    private InterfaceC2274d f6633o;

    /* renamed from: p */
    private int f6634p;

    /* renamed from: q */
    private int f6635q;

    /* renamed from: r */
    private int f6636r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.o.g.g$a */
    /* loaded from: classes2.dex */
    public static class C2271a extends AbstractC2357a<Bitmap> {

        /* renamed from: f */
        private final Handler f6637f;

        /* renamed from: w */
        final int f6638w;

        /* renamed from: x */
        private final long f6639x;

        /* renamed from: y */
        private Bitmap f6640y;

        C2271a(Handler handler, int i, long j) {
            this.f6637f = handler;
            this.f6638w = i;
            this.f6639x = j;
        }

        /* renamed from: e */
        Bitmap m33421e() {
            return this.f6640y;
        }

        @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
        /* renamed from: f */
        public void mo22923b(Bitmap bitmap, InterfaceC2363b<? super Bitmap> interfaceC2363b) {
            this.f6640y = bitmap;
            this.f6637f.sendMessageAtTime(this.f6637f.obtainMessage(1, this), this.f6639x);
        }

        @Override // com.bumptech.glide.p082o.p083j.InterfaceC2360d
        public void onLoadCleared(Drawable drawable) {
            this.f6640y = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.o.g.g$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2272b {
        /* renamed from: a */
        void mo33419a();
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.o.g.g$c */
    /* loaded from: classes2.dex */
    private class C2273c implements Handler.Callback {
        C2273c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C2270g.this.m33428m((C2271a) message.obj);
                return true;
            } else if (i == 2) {
                C2270g.this.f6622d.m34122i((C2271a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.o.g.g$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC2274d {
        /* renamed from: a */
        void m33418a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2270g(ComponentCallbacks2C1943b componentCallbacks2C1943b, InterfaceC1965a interfaceC1965a, int i, int i2, InterfaceC2126l<Bitmap> interfaceC2126l, Bitmap bitmap) {
        this(componentCallbacks2C1943b.m34166f(), ComponentCallbacks2C1943b.m34152t(componentCallbacks2C1943b.m34164h()), interfaceC1965a, null, m33432i(ComponentCallbacks2C1943b.m34152t(componentCallbacks2C1943b.m34164h()), i, i2), interfaceC2126l, bitmap);
    }

    /* renamed from: g */
    private static InterfaceC2118f m33434g() {
        return new C2366b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static C1950g<Bitmap> m33432i(ComponentCallbacks2C1952h componentCallbacks2C1952h, int i, int i2) {
        return componentCallbacks2C1952h.m34124g().mo33236a(C2352f.m33204Y(AbstractC2060j.f6252a).m33237W(true).m33241R(true).m33249I(i, i2));
    }

    /* renamed from: l */
    private void m33429l() {
        if (!this.f6624f || this.f6625g) {
            return;
        }
        if (this.f6626h) {
            C2380j.m33132a(this.f6632n == null, "Pending target must be null when starting from the first frame");
            this.f6619a.mo34025g();
            this.f6626h = false;
        }
        C2271a c2271a = this.f6632n;
        if (c2271a != null) {
            this.f6632n = null;
            m33428m(c2271a);
            return;
        }
        this.f6625g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f6619a.mo34028d();
        this.f6619a.mo34030b();
        this.f6630l = new C2271a(this.f6620b, this.f6619a.mo34024h(), uptimeMillis);
        C1950g<Bitmap> mo33236a = this.f6627i.mo33236a(C2352f.m33203a0(m33434g()));
        mo33236a.m34129m0(this.f6619a);
        mo33236a.m34133h0(this.f6630l);
    }

    /* renamed from: n */
    private void m33427n() {
        Bitmap bitmap = this.f6631m;
        if (bitmap != null) {
            this.f6623e.mo33347c(bitmap);
            this.f6631m = null;
        }
    }

    /* renamed from: p */
    private void m33425p() {
        if (this.f6624f) {
            return;
        }
        this.f6624f = true;
        this.f6629k = false;
        m33429l();
    }

    /* renamed from: q */
    private void m33424q() {
        this.f6624f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m33440a() {
        this.f6621c.clear();
        m33427n();
        m33424q();
        C2271a c2271a = this.f6628j;
        if (c2271a != null) {
            this.f6622d.m34122i(c2271a);
            this.f6628j = null;
        }
        C2271a c2271a2 = this.f6630l;
        if (c2271a2 != null) {
            this.f6622d.m34122i(c2271a2);
            this.f6630l = null;
        }
        C2271a c2271a3 = this.f6632n;
        if (c2271a3 != null) {
            this.f6622d.m34122i(c2271a3);
            this.f6632n = null;
        }
        this.f6619a.clear();
        this.f6629k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer m33439b() {
        return this.f6619a.mo34026f().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap m33438c() {
        C2271a c2271a = this.f6628j;
        return c2271a != null ? c2271a.m33421e() : this.f6631m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m33437d() {
        C2271a c2271a = this.f6628j;
        if (c2271a != null) {
            return c2271a.f6638w;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap m33436e() {
        return this.f6631m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m33435f() {
        return this.f6619a.mo34029c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m33433h() {
        return this.f6636r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m33431j() {
        return this.f6619a.mo34023i() + this.f6634p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m33430k() {
        return this.f6635q;
    }

    /* renamed from: m */
    void m33428m(C2271a c2271a) {
        InterfaceC2274d interfaceC2274d = this.f6633o;
        if (interfaceC2274d != null) {
            interfaceC2274d.m33418a();
        }
        this.f6625g = false;
        if (this.f6629k) {
            this.f6620b.obtainMessage(2, c2271a).sendToTarget();
        } else if (!this.f6624f) {
            this.f6632n = c2271a;
        } else {
            if (c2271a.m33421e() != null) {
                m33427n();
                C2271a c2271a2 = this.f6628j;
                this.f6628j = c2271a;
                for (int size = this.f6621c.size() - 1; size >= 0; size--) {
                    this.f6621c.get(size).mo33419a();
                }
                if (c2271a2 != null) {
                    this.f6620b.obtainMessage(2, c2271a2).sendToTarget();
                }
            }
            m33429l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m33426o(InterfaceC2126l<Bitmap> interfaceC2126l, Bitmap bitmap) {
        C2380j.m33129d(interfaceC2126l);
        C2380j.m33129d(bitmap);
        this.f6631m = bitmap;
        this.f6627i = this.f6627i.mo33236a(new C2352f().m33240S(interfaceC2126l));
        this.f6634p = C2381k.m33121g(bitmap);
        this.f6635q = bitmap.getWidth();
        this.f6636r = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m33423r(InterfaceC2272b interfaceC2272b) {
        if (!this.f6629k) {
            if (!this.f6621c.contains(interfaceC2272b)) {
                boolean isEmpty = this.f6621c.isEmpty();
                this.f6621c.add(interfaceC2272b);
                if (isEmpty) {
                    m33425p();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m33422s(InterfaceC2272b interfaceC2272b) {
        this.f6621c.remove(interfaceC2272b);
        if (this.f6621c.isEmpty()) {
            m33424q();
        }
    }

    C2270g(InterfaceC2100e interfaceC2100e, ComponentCallbacks2C1952h componentCallbacks2C1952h, InterfaceC1965a interfaceC1965a, Handler handler, C1950g<Bitmap> c1950g, InterfaceC2126l<Bitmap> interfaceC2126l, Bitmap bitmap) {
        this.f6621c = new ArrayList();
        this.f6622d = componentCallbacks2C1952h;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C2273c()) : handler;
        this.f6623e = interfaceC2100e;
        this.f6620b = handler;
        this.f6627i = c1950g;
        this.f6619a = interfaceC1965a;
        m33426o(interfaceC2126l, bitmap);
    }
}
