package io.intercom.com.bumptech.glide.load.p402o.p407g;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.p393l.InterfaceC10501a;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10867f;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GifFrameLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.g.g */
/* loaded from: classes3.dex */
public class C10798g {

    /* renamed from: a */
    private final InterfaceC10501a f24654a;

    /* renamed from: b */
    private final Handler f24655b;

    /* renamed from: c */
    private final List<InterfaceC10800b> f24656c;

    /* renamed from: d */
    final C10486i f24657d;

    /* renamed from: e */
    private final InterfaceC10581e f24658e;

    /* renamed from: f */
    private boolean f24659f;

    /* renamed from: g */
    private boolean f24660g;

    /* renamed from: h */
    private boolean f24661h;

    /* renamed from: i */
    private C10483h<Bitmap> f24662i;

    /* renamed from: j */
    private C10799a f24663j;

    /* renamed from: k */
    private boolean f24664k;

    /* renamed from: l */
    private C10799a f24665l;

    /* renamed from: m */
    private Bitmap f24666m;

    /* renamed from: n */
    private C10799a f24667n;

    /* renamed from: o */
    private InterfaceC10802d f24668o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifFrameLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.g.g$a */
    /* loaded from: classes3.dex */
    public static class C10799a extends AbstractC10867f<Bitmap> {

        /* renamed from: c */
        private final Handler f24669c;

        /* renamed from: d */
        final int f24670d;

        /* renamed from: e */
        private final long f24671e;

        /* renamed from: f */
        private Bitmap f24672f;

        C10799a(Handler handler, int i, long j) {
            this.f24669c = handler;
            this.f24670d = i;
            this.f24671e = j;
        }

        /* renamed from: c */
        Bitmap m12281c() {
            return this.f24672f;
        }

        @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, InterfaceC10878d interfaceC10878d) {
            onResourceReady((Bitmap) obj, (InterfaceC10878d<? super Bitmap>) interfaceC10878d);
        }

        public void onResourceReady(Bitmap bitmap, InterfaceC10878d<? super Bitmap> interfaceC10878d) {
            this.f24672f = bitmap;
            this.f24669c.sendMessageAtTime(this.f24669c.obtainMessage(1, this), this.f24671e);
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.g.g$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10800b {
        /* renamed from: a */
        void mo12280a();
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.g.g$c */
    /* loaded from: classes3.dex */
    private class C10801c implements Handler.Callback {
        C10801c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C10798g.this.m12288n((C10799a) message.obj);
                return true;
            } else if (i == 2) {
                C10798g.this.f24657d.m12981e((C10799a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifFrameLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.g.g$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC10802d {
        /* renamed from: a */
        void m12279a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10798g(ComponentCallbacks2C10478c componentCallbacks2C10478c, InterfaceC10501a interfaceC10501a, int i, int i2, InterfaceC10629l<Bitmap> interfaceC10629l, Bitmap bitmap) {
        this(componentCallbacks2C10478c.m13031f(), ComponentCallbacks2C10478c.m13018s(componentCallbacks2C10478c.m13029h()), interfaceC10501a, null, m12292j(ComponentCallbacks2C10478c.m13018s(componentCallbacks2C10478c.m13029h()), i, i2), interfaceC10629l, bitmap);
    }

    /* renamed from: g */
    private static InterfaceC10622g m12295g() {
        return new C10882b(Double.valueOf(Math.random()));
    }

    /* renamed from: h */
    private int m12294h() {
        return C10893i.m12006g(m12299c().getWidth(), m12299c().getHeight(), m12299c().getConfig());
    }

    /* renamed from: j */
    private static C10483h<Bitmap> m12292j(C10486i c10486i, int i, int i2) {
        C10483h<Bitmap> m12984b = c10486i.m12984b();
        m12984b.m13004b(C10856g.m12142g(AbstractC10544i.f24236a).m12126p0(true).m12136j0(true).m12156X(i, i2));
        return m12984b;
    }

    /* renamed from: m */
    private void m12289m() {
        if (!this.f24659f || this.f24660g) {
            return;
        }
        if (this.f24661h) {
            C10892h.m12017a(this.f24667n == null, "Pending target must be null when starting from the first frame");
            this.f24654a.mo12886g();
            this.f24661h = false;
        }
        C10799a c10799a = this.f24667n;
        if (c10799a != null) {
            this.f24667n = null;
            m12288n(c10799a);
            return;
        }
        this.f24660g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f24654a.mo12889d();
        this.f24654a.mo12891b();
        this.f24665l = new C10799a(this.f24655b, this.f24654a.mo12885h(), uptimeMillis);
        C10483h<Bitmap> c10483h = this.f24662i;
        c10483h.m13004b(C10856g.m12140h0(m12295g()));
        c10483h.m12991p(this.f24654a);
        c10483h.m12997i(this.f24665l);
    }

    /* renamed from: o */
    private void m12287o() {
        Bitmap bitmap = this.f24666m;
        if (bitmap != null) {
            this.f24658e.mo12398c(bitmap);
            this.f24666m = null;
        }
    }

    /* renamed from: q */
    private void m12285q() {
        if (this.f24659f) {
            return;
        }
        this.f24659f = true;
        this.f24664k = false;
        m12289m();
    }

    /* renamed from: r */
    private void m12284r() {
        this.f24659f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12301a() {
        this.f24656c.clear();
        m12287o();
        m12284r();
        C10799a c10799a = this.f24663j;
        if (c10799a != null) {
            this.f24657d.m12981e(c10799a);
            this.f24663j = null;
        }
        C10799a c10799a2 = this.f24665l;
        if (c10799a2 != null) {
            this.f24657d.m12981e(c10799a2);
            this.f24665l = null;
        }
        C10799a c10799a3 = this.f24667n;
        if (c10799a3 != null) {
            this.f24657d.m12981e(c10799a3);
            this.f24667n = null;
        }
        this.f24654a.clear();
        this.f24664k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer m12300b() {
        return this.f24654a.mo12887f().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap m12299c() {
        C10799a c10799a = this.f24663j;
        return c10799a != null ? c10799a.m12281c() : this.f24666m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m12298d() {
        C10799a c10799a = this.f24663j;
        if (c10799a != null) {
            return c10799a.f24670d;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap m12297e() {
        return this.f24666m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m12296f() {
        return this.f24654a.mo12890c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m12293i() {
        return m12299c().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m12291k() {
        return this.f24654a.mo12884i() + m12294h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m12290l() {
        return m12299c().getWidth();
    }

    /* renamed from: n */
    void m12288n(C10799a c10799a) {
        InterfaceC10802d interfaceC10802d = this.f24668o;
        if (interfaceC10802d != null) {
            interfaceC10802d.m12279a();
        }
        this.f24660g = false;
        if (this.f24664k) {
            this.f24655b.obtainMessage(2, c10799a).sendToTarget();
        } else if (!this.f24659f) {
            this.f24667n = c10799a;
        } else {
            if (c10799a.m12281c() != null) {
                m12287o();
                C10799a c10799a2 = this.f24663j;
                this.f24663j = c10799a;
                for (int size = this.f24656c.size() - 1; size >= 0; size--) {
                    this.f24656c.get(size).mo12280a();
                }
                if (c10799a2 != null) {
                    this.f24655b.obtainMessage(2, c10799a2).sendToTarget();
                }
            }
            m12289m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m12286p(InterfaceC10629l<Bitmap> interfaceC10629l, Bitmap bitmap) {
        C10892h.m12014d(interfaceC10629l);
        C10892h.m12014d(bitmap);
        this.f24666m = bitmap;
        C10483h<Bitmap> c10483h = this.f24662i;
        c10483h.m13004b(new C10856g().m12133l0(interfaceC10629l));
        this.f24662i = c10483h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m12283s(InterfaceC10800b interfaceC10800b) {
        if (!this.f24664k) {
            boolean isEmpty = this.f24656c.isEmpty();
            if (!this.f24656c.contains(interfaceC10800b)) {
                this.f24656c.add(interfaceC10800b);
                if (isEmpty) {
                    m12285q();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m12282t(InterfaceC10800b interfaceC10800b) {
        this.f24656c.remove(interfaceC10800b);
        if (this.f24656c.isEmpty()) {
            m12284r();
        }
    }

    C10798g(InterfaceC10581e interfaceC10581e, C10486i c10486i, InterfaceC10501a interfaceC10501a, Handler handler, C10483h<Bitmap> c10483h, InterfaceC10629l<Bitmap> interfaceC10629l, Bitmap bitmap) {
        this.f24656c = new ArrayList();
        this.f24659f = false;
        this.f24660g = false;
        this.f24661h = false;
        this.f24657d = c10486i;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C10801c()) : handler;
        this.f24658e = interfaceC10581e;
        this.f24655b = handler;
        this.f24662i = c10483h;
        this.f24654a = interfaceC10501a;
        m12286p(interfaceC10629l, bitmap);
    }
}
