package io.intercom.com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.p412p.C10848a;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.C10858i;
import io.intercom.com.bumptech.glide.p412p.C10861j;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10850c;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10851d;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10855f;
import io.intercom.com.bumptech.glide.p412p.InterfaceFutureC10849b;
import io.intercom.com.bumptech.glide.p412p.RunnableC10852e;
import io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10870i;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.io.File;
/* compiled from: RequestBuilder.java */
/* renamed from: io.intercom.com.bumptech.glide.h */
/* loaded from: classes3.dex */
public class C10483h<TranscodeType> implements Cloneable {

    /* renamed from: A */
    private InterfaceC10855f<TranscodeType> f23972A;

    /* renamed from: B */
    private C10483h<TranscodeType> f23973B;

    /* renamed from: C */
    private C10483h<TranscodeType> f23974C;

    /* renamed from: D */
    private Float f23975D;

    /* renamed from: E */
    private boolean f23976E = true;

    /* renamed from: F */
    private boolean f23977F;

    /* renamed from: G */
    private boolean f23978G;

    /* renamed from: c */
    private final Context f23979c;

    /* renamed from: d */
    private final C10486i f23980d;

    /* renamed from: e */
    private final Class<TranscodeType> f23981e;

    /* renamed from: f */
    private final C10856g f23982f;

    /* renamed from: w */
    private final C10480e f23983w;

    /* renamed from: x */
    protected C10856g f23984x;

    /* renamed from: y */
    private AbstractC10491j<?, ? super TranscodeType> f23985y;

    /* renamed from: z */
    private Object f23986z;

    /* compiled from: RequestBuilder.java */
    /* renamed from: io.intercom.com.bumptech.glide.h$a */
    /* loaded from: classes3.dex */
    class RunnableC10484a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ RunnableC10852e f23987c;

        RunnableC10484a(RunnableC10852e runnableC10852e) {
            this.f23987c = runnableC10852e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23987c.isCancelled()) {
                return;
            }
            C10483h c10483h = C10483h.this;
            RunnableC10852e runnableC10852e = this.f23987c;
            c10483h.m12996j(runnableC10852e, runnableC10852e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestBuilder.java */
    /* renamed from: io.intercom.com.bumptech.glide.h$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C10485b {

        /* renamed from: a */
        static final /* synthetic */ int[] f23989a;

        /* renamed from: b */
        static final /* synthetic */ int[] f23990b;

        static {
            int[] iArr = new int[EnumC10482g.values().length];
            f23990b = iArr;
            try {
                iArr[EnumC10482g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23990b[EnumC10482g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23990b[EnumC10482g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23990b[EnumC10482g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f23989a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23989a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23989a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23989a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23989a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23989a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23989a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23989a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new C10856g().m12144f(AbstractC10544i.f24237b).m12151b0(EnumC10482g.LOW).m12136j0(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C10483h(ComponentCallbacks2C10478c componentCallbacks2C10478c, C10486i c10486i, Class<TranscodeType> cls, Context context) {
        this.f23980d = c10486i;
        this.f23981e = cls;
        this.f23982f = c10486i.m12979g();
        this.f23979c = context;
        this.f23985y = c10486i.m12978h(cls);
        this.f23984x = this.f23982f;
        this.f23983w = componentCallbacks2C10478c.m13028i();
    }

    /* renamed from: c */
    private InterfaceC10850c m13003c(InterfaceC10869h<TranscodeType> interfaceC10869h, InterfaceC10855f<TranscodeType> interfaceC10855f, C10856g c10856g) {
        return m13002d(interfaceC10869h, interfaceC10855f, null, this.f23985y, c10856g.m12117y(), c10856g.m12120v(), c10856g.m12121u(), c10856g);
    }

    /* renamed from: d */
    private InterfaceC10850c m13002d(InterfaceC10869h<TranscodeType> interfaceC10869h, InterfaceC10855f<TranscodeType> interfaceC10855f, InterfaceC10851d interfaceC10851d, AbstractC10491j<?, ? super TranscodeType> abstractC10491j, EnumC10482g enumC10482g, int i, int i2, C10856g c10856g) {
        C10848a c10848a;
        C10848a c10848a2;
        if (this.f23974C != null) {
            c10848a2 = new C10848a(interfaceC10851d);
            c10848a = c10848a2;
        } else {
            c10848a = null;
            c10848a2 = interfaceC10851d;
        }
        InterfaceC10850c m13001e = m13001e(interfaceC10869h, interfaceC10855f, c10848a2, abstractC10491j, enumC10482g, i, i2, c10856g);
        if (c10848a == null) {
            return m13001e;
        }
        int m12120v = this.f23974C.f23984x.m12120v();
        int m12121u = this.f23974C.f23984x.m12121u();
        if (C10893i.m11994s(i, i2) && !this.f23974C.f23984x.m12163P()) {
            m12120v = c10856g.m12120v();
            m12121u = c10856g.m12121u();
        }
        C10483h<TranscodeType> c10483h = this.f23974C;
        C10848a c10848a3 = c10848a;
        c10848a3.m12182r(m13001e, c10483h.m13002d(interfaceC10869h, interfaceC10855f, c10848a, c10483h.f23985y, c10483h.f23984x.m12117y(), m12120v, m12121u, this.f23974C.f23984x));
        return c10848a3;
    }

    /* renamed from: e */
    private InterfaceC10850c m13001e(InterfaceC10869h<TranscodeType> interfaceC10869h, InterfaceC10855f<TranscodeType> interfaceC10855f, InterfaceC10851d interfaceC10851d, AbstractC10491j<?, ? super TranscodeType> abstractC10491j, EnumC10482g enumC10482g, int i, int i2, C10856g c10856g) {
        C10483h<TranscodeType> c10483h = this.f23973B;
        if (c10483h != null) {
            if (!this.f23978G) {
                AbstractC10491j<?, ? super TranscodeType> abstractC10491j2 = c10483h.f23976E ? abstractC10491j : c10483h.f23985y;
                EnumC10482g m12117y = this.f23973B.f23984x.m12170H() ? this.f23973B.f23984x.m12117y() : m12998h(enumC10482g);
                int m12120v = this.f23973B.f23984x.m12120v();
                int m12121u = this.f23973B.f23984x.m12121u();
                if (C10893i.m11994s(i, i2) && !this.f23973B.f23984x.m12163P()) {
                    m12120v = c10856g.m12120v();
                    m12121u = c10856g.m12121u();
                }
                C10861j c10861j = new C10861j(interfaceC10851d);
                InterfaceC10850c m12988s = m12988s(interfaceC10869h, interfaceC10855f, c10856g, c10861j, abstractC10491j, enumC10482g, i, i2);
                this.f23978G = true;
                C10483h<TranscodeType> c10483h2 = this.f23973B;
                InterfaceC10850c m13002d = c10483h2.m13002d(interfaceC10869h, interfaceC10855f, c10861j, abstractC10491j2, m12117y, m12120v, m12121u, c10483h2.f23984x);
                this.f23978G = false;
                c10861j.m12076q(m12988s, m13002d);
                return c10861j;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f23975D != null) {
            C10861j c10861j2 = new C10861j(interfaceC10851d);
            c10861j2.m12076q(m12988s(interfaceC10869h, interfaceC10855f, c10856g, c10861j2, abstractC10491j, enumC10482g, i, i2), m12988s(interfaceC10869h, interfaceC10855f, c10856g.clone().m12138i0(this.f23975D.floatValue()), c10861j2, abstractC10491j, m12998h(enumC10482g), i, i2));
            return c10861j2;
        } else {
            return m12988s(interfaceC10869h, interfaceC10855f, c10856g, interfaceC10851d, abstractC10491j, enumC10482g, i, i2);
        }
    }

    /* renamed from: h */
    private EnumC10482g m12998h(EnumC10482g enumC10482g) {
        int i = C10485b.f23990b[enumC10482g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalArgumentException("unknown priority: " + this.f23984x.m12117y());
                }
                return EnumC10482g.IMMEDIATE;
            }
            return EnumC10482g.HIGH;
        }
        return EnumC10482g.NORMAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public <Y extends InterfaceC10869h<TranscodeType>> Y m12996j(Y y, InterfaceC10855f<TranscodeType> interfaceC10855f) {
        m12995k(y, interfaceC10855f, m12999g());
        return y;
    }

    /* renamed from: k */
    private <Y extends InterfaceC10869h<TranscodeType>> Y m12995k(Y y, InterfaceC10855f<TranscodeType> interfaceC10855f, C10856g c10856g) {
        C10893i.m12011b();
        C10892h.m12014d(y);
        if (this.f23977F) {
            c10856g.m12152b();
            InterfaceC10850c m13003c = m13003c(y, interfaceC10855f, c10856g);
            InterfaceC10850c request = y.getRequest();
            if (m13003c.mo12082k(request)) {
                m13003c.mo12091b();
                C10892h.m12014d(request);
                if (!request.isRunning()) {
                    request.mo12088e();
                }
                return y;
            }
            this.f23980d.m12981e(y);
            y.setRequest(m13003c);
            this.f23980d.m12973m(y, m13003c);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: r */
    private C10483h<TranscodeType> m12989r(Object obj) {
        this.f23986z = obj;
        this.f23977F = true;
        return this;
    }

    /* renamed from: s */
    private InterfaceC10850c m12988s(InterfaceC10869h<TranscodeType> interfaceC10869h, InterfaceC10855f<TranscodeType> interfaceC10855f, C10856g c10856g, InterfaceC10851d interfaceC10851d, AbstractC10491j<?, ? super TranscodeType> abstractC10491j, EnumC10482g enumC10482g, int i, int i2) {
        Context context = this.f23979c;
        C10480e c10480e = this.f23983w;
        return C10858i.m12094z(context, c10480e, this.f23986z, this.f23981e, c10856g, i, i2, enumC10482g, interfaceC10869h, interfaceC10855f, this.f23972A, interfaceC10851d, c10480e.m13009e(), abstractC10491j.m12969b());
    }

    /* renamed from: b */
    public C10483h<TranscodeType> m13004b(C10856g c10856g) {
        C10892h.m12014d(c10856g);
        this.f23984x = m12999g().m12154a(c10856g);
        return this;
    }

    /* renamed from: f */
    public C10483h<TranscodeType> clone() {
        try {
            C10483h<TranscodeType> c10483h = (C10483h) super.clone();
            c10483h.f23984x = c10483h.f23984x.clone();
            c10483h.f23985y = (AbstractC10491j<?, ? super TranscodeType>) c10483h.f23985y.clone();
            return c10483h;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    protected C10856g m12999g() {
        C10856g c10856g = this.f23982f;
        C10856g c10856g2 = this.f23984x;
        return c10856g == c10856g2 ? c10856g2.clone() : c10856g2;
    }

    /* renamed from: i */
    public <Y extends InterfaceC10869h<TranscodeType>> Y m12997i(Y y) {
        m12996j(y, null);
        return y;
    }

    /* renamed from: l */
    public AbstractC10870i<ImageView, TranscodeType> m12994l(ImageView imageView) {
        C10893i.m12011b();
        C10892h.m12014d(imageView);
        C10856g c10856g = this.f23984x;
        if (!c10856g.m12164O() && c10856g.m12166M() && imageView.getScaleType() != null) {
            switch (C10485b.f23989a[imageView.getScaleType().ordinal()]) {
                case 1:
                    c10856g = c10856g.clone().m12161R();
                    break;
                case 2:
                    c10856g = c10856g.clone().m12160S();
                    break;
                case 3:
                case 4:
                case 5:
                    c10856g = c10856g.clone().m12159T();
                    break;
                case 6:
                    c10856g = c10856g.clone().m12160S();
                    break;
            }
        }
        AbstractC10870i<ImageView, TranscodeType> m13013a = this.f23983w.m13013a(imageView, this.f23981e);
        m12995k(m13013a, null, c10856g);
        return m13013a;
    }

    /* renamed from: n */
    public C10483h<TranscodeType> m12993n(InterfaceC10855f<TranscodeType> interfaceC10855f) {
        this.f23972A = interfaceC10855f;
        return this;
    }

    /* renamed from: o */
    public C10483h<TranscodeType> m12992o(File file) {
        m12989r(file);
        return this;
    }

    /* renamed from: p */
    public C10483h<TranscodeType> m12991p(Object obj) {
        m12989r(obj);
        return this;
    }

    /* renamed from: q */
    public C10483h<TranscodeType> m12990q(String str) {
        m12989r(str);
        return this;
    }

    /* renamed from: t */
    public InterfaceFutureC10849b<TranscodeType> m12987t(int i, int i2) {
        RunnableC10852e runnableC10852e = new RunnableC10852e(this.f23983w.m13007g(), i, i2);
        if (C10893i.m11997p()) {
            this.f23983w.m13007g().post(new RunnableC10484a(runnableC10852e));
        } else {
            m12996j(runnableC10852e, runnableC10852e);
        }
        return runnableC10852e;
    }

    /* renamed from: u */
    public C10483h<TranscodeType> m12986u(AbstractC10491j<?, ? super TranscodeType> abstractC10491j) {
        C10892h.m12014d(abstractC10491j);
        this.f23985y = abstractC10491j;
        this.f23976E = false;
        return this;
    }
}
