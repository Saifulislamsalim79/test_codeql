package io.intercom.com.bumptech.glide.p412p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import io.intercom.com.bumptech.glide.C10480e;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.engine.C10549j;
import io.intercom.com.bumptech.glide.load.engine.GlideException;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10781a;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10868g;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10880e;
import io.intercom.com.bumptech.glide.p416r.C10888d;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import io.intercom.com.bumptech.glide.p416r.p417j.AbstractC10903b;
import io.intercom.com.bumptech.glide.p416r.p417j.C10895a;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: SingleRequest.java */
/* renamed from: io.intercom.com.bumptech.glide.p.i */
/* loaded from: classes3.dex */
public final class C10858i<R> implements InterfaceC10850c, InterfaceC10868g, InterfaceC10857h, C10895a.InterfaceC10901f {

    /* renamed from: S */
    private static final InterfaceC7672e<C10858i<?>> f24779S = C10895a.m11989d(150, new C10859a());

    /* renamed from: T */
    private static final boolean f24780T = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private Class<R> f24781A;

    /* renamed from: B */
    private C10856g f24782B;

    /* renamed from: C */
    private int f24783C;

    /* renamed from: D */
    private int f24784D;

    /* renamed from: E */
    private EnumC10482g f24785E;

    /* renamed from: F */
    private InterfaceC10869h<R> f24786F;

    /* renamed from: G */
    private InterfaceC10855f<R> f24787G;

    /* renamed from: H */
    private C10549j f24788H;

    /* renamed from: I */
    private InterfaceC10880e<? super R> f24789I;

    /* renamed from: J */
    private InterfaceC10569t<R> f24790J;

    /* renamed from: K */
    private C10549j.C10555d f24791K;

    /* renamed from: L */
    private long f24792L;

    /* renamed from: M */
    private EnumC10860b f24793M;

    /* renamed from: N */
    private Drawable f24794N;

    /* renamed from: O */
    private Drawable f24795O;

    /* renamed from: P */
    private Drawable f24796P;

    /* renamed from: Q */
    private int f24797Q;

    /* renamed from: R */
    private int f24798R;

    /* renamed from: c */
    private boolean f24799c;

    /* renamed from: d */
    private final String f24800d;

    /* renamed from: e */
    private final AbstractC10903b f24801e;

    /* renamed from: f */
    private InterfaceC10855f<R> f24802f;

    /* renamed from: w */
    private InterfaceC10851d f24803w;

    /* renamed from: x */
    private Context f24804x;

    /* renamed from: y */
    private C10480e f24805y;

    /* renamed from: z */
    private Object f24806z;

    /* compiled from: SingleRequest.java */
    /* renamed from: io.intercom.com.bumptech.glide.p.i$a */
    /* loaded from: classes3.dex */
    static class C10859a implements C10895a.InterfaceC10899d<C10858i<?>> {
        C10859a() {
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10899d
        /* renamed from: a */
        public C10858i<?> create() {
            return new C10858i<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleRequest.java */
    /* renamed from: io.intercom.com.bumptech.glide.p.i$b */
    /* loaded from: classes3.dex */
    public enum EnumC10860b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    C10858i() {
        this.f24800d = f24780T ? String.valueOf(super.hashCode()) : null;
        this.f24801e = AbstractC10903b.m11979a();
    }

    /* renamed from: A */
    private void m12115A(GlideException glideException, int i) {
        this.f24801e.mo11977c();
        int m13008f = this.f24805y.m13008f();
        if (m13008f <= i) {
            Log.w("Glide", "Load failed for " + this.f24806z + " with size [" + this.f24797Q + "x" + this.f24798R + "]", glideException);
            if (m13008f <= 4) {
                glideException.m12866g("Glide");
            }
        }
        this.f24791K = null;
        this.f24793M = EnumC10860b.FAILED;
        this.f24799c = true;
        try {
            if ((this.f24787G == null || !this.f24787G.onLoadFailed(glideException, this.f24806z, this.f24786F, m12100t())) && (this.f24802f == null || !this.f24802f.onLoadFailed(glideException, this.f24806z, this.f24786F, m12100t()))) {
                m12112D();
            }
            this.f24799c = false;
            m12096x();
        } catch (Throwable th) {
            this.f24799c = false;
            throw th;
        }
    }

    /* renamed from: B */
    private void m12114B(InterfaceC10569t<R> interfaceC10569t, R r, EnumC10507a enumC10507a) {
        boolean m12100t = m12100t();
        this.f24793M = EnumC10860b.COMPLETE;
        this.f24790J = interfaceC10569t;
        if (this.f24805y.m13008f() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + enumC10507a + " for " + this.f24806z + " with size [" + this.f24797Q + "x" + this.f24798R + "] in " + C10888d.m12032a(this.f24792L) + " ms");
        }
        this.f24799c = true;
        try {
            if ((this.f24787G == null || !this.f24787G.onResourceReady(r, this.f24806z, this.f24786F, enumC10507a, m12100t)) && (this.f24802f == null || !this.f24802f.onResourceReady(r, this.f24806z, this.f24786F, enumC10507a, m12100t))) {
                this.f24786F.onResourceReady(r, this.f24789I.mo12045a(enumC10507a, m12100t));
            }
            this.f24799c = false;
            m12095y();
        } catch (Throwable th) {
            this.f24799c = false;
            throw th;
        }
    }

    /* renamed from: C */
    private void m12113C(InterfaceC10569t<?> interfaceC10569t) {
        this.f24788H.m12766j(interfaceC10569t);
        this.f24790J = null;
    }

    /* renamed from: D */
    private void m12112D() {
        if (m12107m()) {
            Drawable m12103q = this.f24806z == null ? m12103q() : null;
            if (m12103q == null) {
                m12103q = m12104p();
            }
            if (m12103q == null) {
                m12103q = m12102r();
            }
            this.f24786F.onLoadFailed(m12103q);
        }
    }

    /* renamed from: j */
    private void m12109j() {
        if (this.f24799c) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: l */
    private boolean m12108l() {
        InterfaceC10851d interfaceC10851d = this.f24803w;
        return interfaceC10851d == null || interfaceC10851d.mo12089d(this);
    }

    /* renamed from: m */
    private boolean m12107m() {
        InterfaceC10851d interfaceC10851d = this.f24803w;
        return interfaceC10851d == null || interfaceC10851d.mo12090c(this);
    }

    /* renamed from: n */
    private boolean m12106n() {
        InterfaceC10851d interfaceC10851d = this.f24803w;
        return interfaceC10851d == null || interfaceC10851d.mo12086g(this);
    }

    /* renamed from: p */
    private Drawable m12104p() {
        if (this.f24794N == null) {
            Drawable m12127p = this.f24782B.m12127p();
            this.f24794N = m12127p;
            if (m12127p == null && this.f24782B.m12129o() > 0) {
                this.f24794N = m12099u(this.f24782B.m12129o());
            }
        }
        return this.f24794N;
    }

    /* renamed from: q */
    private Drawable m12103q() {
        if (this.f24796P == null) {
            Drawable m12125q = this.f24782B.m12125q();
            this.f24796P = m12125q;
            if (m12125q == null && this.f24782B.m12124r() > 0) {
                this.f24796P = m12099u(this.f24782B.m12124r());
            }
        }
        return this.f24796P;
    }

    /* renamed from: r */
    private Drawable m12102r() {
        if (this.f24795O == null) {
            Drawable m12119w = this.f24782B.m12119w();
            this.f24795O = m12119w;
            if (m12119w == null && this.f24782B.m12118x() > 0) {
                this.f24795O = m12099u(this.f24782B.m12118x());
            }
        }
        return this.f24795O;
    }

    /* renamed from: s */
    private void m12101s(Context context, C10480e c10480e, Object obj, Class<R> cls, C10856g c10856g, int i, int i2, EnumC10482g enumC10482g, InterfaceC10869h<R> interfaceC10869h, InterfaceC10855f<R> interfaceC10855f, InterfaceC10855f<R> interfaceC10855f2, InterfaceC10851d interfaceC10851d, C10549j c10549j, InterfaceC10880e<? super R> interfaceC10880e) {
        this.f24804x = context;
        this.f24805y = c10480e;
        this.f24806z = obj;
        this.f24781A = cls;
        this.f24782B = c10856g;
        this.f24783C = i;
        this.f24784D = i2;
        this.f24785E = enumC10482g;
        this.f24786F = interfaceC10869h;
        this.f24802f = interfaceC10855f;
        this.f24787G = interfaceC10855f2;
        this.f24803w = interfaceC10851d;
        this.f24788H = c10549j;
        this.f24789I = interfaceC10880e;
        this.f24793M = EnumC10860b.PENDING;
    }

    /* renamed from: t */
    private boolean m12100t() {
        InterfaceC10851d interfaceC10851d = this.f24803w;
        return interfaceC10851d == null || !interfaceC10851d.mo12092a();
    }

    /* renamed from: u */
    private Drawable m12099u(int i) {
        return C10781a.m12350b(this.f24805y, i, this.f24782B.m12175C() != null ? this.f24782B.m12175C() : this.f24804x.getTheme());
    }

    /* renamed from: v */
    private void m12098v(String str) {
        Log.v("Request", str + " this: " + this.f24800d);
    }

    /* renamed from: w */
    private static int m12097w(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    /* renamed from: x */
    private void m12096x() {
        InterfaceC10851d interfaceC10851d = this.f24803w;
        if (interfaceC10851d != null) {
            interfaceC10851d.mo12081l(this);
        }
    }

    /* renamed from: y */
    private void m12095y() {
        InterfaceC10851d interfaceC10851d = this.f24803w;
        if (interfaceC10851d != null) {
            interfaceC10851d.mo12083j(this);
        }
    }

    /* renamed from: z */
    public static <R> C10858i<R> m12094z(Context context, C10480e c10480e, Object obj, Class<R> cls, C10856g c10856g, int i, int i2, EnumC10482g enumC10482g, InterfaceC10869h<R> interfaceC10869h, InterfaceC10855f<R> interfaceC10855f, InterfaceC10855f<R> interfaceC10855f2, InterfaceC10851d interfaceC10851d, C10549j c10549j, InterfaceC10880e<? super R> interfaceC10880e) {
        C10858i<?> mo11982b = f24779S.mo11982b();
        if (mo11982b == null) {
            mo11982b = new C10858i();
        }
        mo11982b.m12101s(context, c10480e, obj, cls, c10856g, i, i2, enumC10482g, interfaceC10869h, interfaceC10855f, interfaceC10855f2, interfaceC10851d, c10549j, interfaceC10880e);
        return mo11982b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10857h
    /* renamed from: a */
    public void mo12111a(InterfaceC10569t<?> interfaceC10569t, EnumC10507a enumC10507a) {
        this.f24801e.mo11977c();
        this.f24791K = null;
        if (interfaceC10569t == null) {
            mo12110c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f24781A + " inside, but instead got null."));
            return;
        }
        Object obj = interfaceC10569t.get();
        if (obj != null && this.f24781A.isAssignableFrom(obj.getClass())) {
            if (!m12106n()) {
                m12113C(interfaceC10569t);
                this.f24793M = EnumC10860b.COMPLETE;
                return;
            }
            m12114B(interfaceC10569t, obj, enumC10507a);
            return;
        }
        m12113C(interfaceC10569t);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f24781A);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(interfaceC10569t);
        sb.append("}.");
        sb.append(obj == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : "");
        mo12110c(new GlideException(sb.toString()));
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: b */
    public void mo12091b() {
        m12109j();
        this.f24804x = null;
        this.f24805y = null;
        this.f24806z = null;
        this.f24781A = null;
        this.f24782B = null;
        this.f24783C = -1;
        this.f24784D = -1;
        this.f24786F = null;
        this.f24787G = null;
        this.f24802f = null;
        this.f24803w = null;
        this.f24789I = null;
        this.f24791K = null;
        this.f24794N = null;
        this.f24795O = null;
        this.f24796P = null;
        this.f24797Q = -1;
        this.f24798R = -1;
        f24779S.mo11983a(this);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10857h
    /* renamed from: c */
    public void mo12110c(GlideException glideException) {
        m12115A(glideException, 5);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public void clear() {
        C10893i.m12011b();
        m12109j();
        this.f24801e.mo11977c();
        if (this.f24793M == EnumC10860b.CLEARED) {
            return;
        }
        m12105o();
        InterfaceC10569t<R> interfaceC10569t = this.f24790J;
        if (interfaceC10569t != null) {
            m12113C(interfaceC10569t);
        }
        if (m12108l()) {
            this.f24786F.onLoadCleared(m12102r());
        }
        this.f24793M = EnumC10860b.CLEARED;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10868g
    /* renamed from: d */
    public void mo12069d(int i, int i2) {
        this.f24801e.mo11977c();
        if (f24780T) {
            m12098v("Got onSizeReady in " + C10888d.m12032a(this.f24792L));
        }
        if (this.f24793M != EnumC10860b.WAITING_FOR_SIZE) {
            return;
        }
        this.f24793M = EnumC10860b.RUNNING;
        float m12176B = this.f24782B.m12176B();
        this.f24797Q = m12097w(i, m12176B);
        this.f24798R = m12097w(i2, m12176B);
        if (f24780T) {
            m12098v("finished setup for calling load in " + C10888d.m12032a(this.f24792L));
        }
        this.f24791K = this.f24788H.m12770f(this.f24805y, this.f24806z, this.f24782B.m12177A(), this.f24797Q, this.f24798R, this.f24782B.m12116z(), this.f24781A, this.f24785E, this.f24782B.m12131n(), this.f24782B.m12174D(), this.f24782B.m12165N(), this.f24782B.m12169I(), this.f24782B.m12122t(), this.f24782B.m12171G(), this.f24782B.m12172F(), this.f24782B.m12173E(), this.f24782B.m12123s(), this);
        if (this.f24793M != EnumC10860b.RUNNING) {
            this.f24791K = null;
        }
        if (f24780T) {
            m12098v("finished onSizeReady in " + C10888d.m12032a(this.f24792L));
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: e */
    public void mo12088e() {
        m12109j();
        this.f24801e.mo11977c();
        this.f24792L = C10888d.m12031b();
        if (this.f24806z == null) {
            if (C10893i.m11994s(this.f24783C, this.f24784D)) {
                this.f24797Q = this.f24783C;
                this.f24798R = this.f24784D;
            }
            m12115A(new GlideException("Received null model"), m12103q() == null ? 5 : 3);
            return;
        }
        EnumC10860b enumC10860b = this.f24793M;
        if (enumC10860b != EnumC10860b.RUNNING) {
            if (enumC10860b == EnumC10860b.COMPLETE) {
                mo12111a(this.f24790J, EnumC10507a.MEMORY_CACHE);
                return;
            }
            this.f24793M = EnumC10860b.WAITING_FOR_SIZE;
            if (C10893i.m11994s(this.f24783C, this.f24784D)) {
                mo12069d(this.f24783C, this.f24784D);
            } else {
                this.f24786F.getSize(this);
            }
            EnumC10860b enumC10860b2 = this.f24793M;
            if ((enumC10860b2 == EnumC10860b.RUNNING || enumC10860b2 == EnumC10860b.WAITING_FOR_SIZE) && m12107m()) {
                this.f24786F.onLoadStarted(m12102r());
            }
            if (f24780T) {
                m12098v("finished run method in " + C10888d.m12032a(this.f24792L));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot restart a running request");
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: f */
    public boolean mo12087f() {
        return this.f24793M == EnumC10860b.COMPLETE;
    }

    @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10901f
    /* renamed from: g */
    public AbstractC10903b mo11981g() {
        return this.f24801e;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: h */
    public boolean mo12085h() {
        return mo12087f();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: i */
    public boolean mo12084i() {
        return this.f24793M == EnumC10860b.FAILED;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public boolean isCancelled() {
        EnumC10860b enumC10860b = this.f24793M;
        return enumC10860b == EnumC10860b.CANCELLED || enumC10860b == EnumC10860b.CLEARED;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public boolean isRunning() {
        EnumC10860b enumC10860b = this.f24793M;
        return enumC10860b == EnumC10860b.RUNNING || enumC10860b == EnumC10860b.WAITING_FOR_SIZE;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    /* renamed from: k */
    public boolean mo12082k(InterfaceC10850c interfaceC10850c) {
        if (interfaceC10850c instanceof C10858i) {
            C10858i c10858i = (C10858i) interfaceC10850c;
            if (this.f24783C == c10858i.f24783C && this.f24784D == c10858i.f24784D && C10893i.m12010c(this.f24806z, c10858i.f24806z) && this.f24781A.equals(c10858i.f24781A) && this.f24782B.equals(c10858i.f24782B) && this.f24785E == c10858i.f24785E) {
                InterfaceC10855f<R> interfaceC10855f = this.f24787G;
                InterfaceC10855f<R> interfaceC10855f2 = c10858i.f24787G;
                if (interfaceC10855f != null) {
                    if (interfaceC10855f2 == null) {
                        return false;
                    }
                } else if (interfaceC10855f2 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    void m12105o() {
        m12109j();
        this.f24801e.mo11977c();
        this.f24786F.removeCallback(this);
        this.f24793M = EnumC10860b.CANCELLED;
        C10549j.C10555d c10555d = this.f24791K;
        if (c10555d != null) {
            c10555d.m12760a();
            this.f24791K = null;
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10850c
    public void pause() {
        clear();
        this.f24793M = EnumC10860b.PAUSED;
    }
}
