package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.AbstractC2060j;
import com.bumptech.glide.p082o.AbstractC2346a;
import com.bumptech.glide.p082o.C2347b;
import com.bumptech.glide.p082o.C2352f;
import com.bumptech.glide.p082o.C2354h;
import com.bumptech.glide.p082o.C2356i;
import com.bumptech.glide.p082o.InterfaceC2348c;
import com.bumptech.glide.p082o.InterfaceC2349d;
import com.bumptech.glide.p082o.InterfaceC2351e;
import com.bumptech.glide.p082o.p083j.InterfaceC2360d;
import com.bumptech.glide.p086q.C2373e;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.C2381k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: RequestBuilder.java */
/* renamed from: com.bumptech.glide.g */
/* loaded from: classes2.dex */
public class C1950g<TranscodeType> extends AbstractC2346a<C1950g<TranscodeType>> implements Cloneable {

    /* renamed from: S */
    private final Context f5921S;

    /* renamed from: T */
    private final ComponentCallbacks2C1952h f5922T;

    /* renamed from: U */
    private final Class<TranscodeType> f5923U;

    /* renamed from: V */
    private final C1947d f5924V;

    /* renamed from: W */
    private AbstractC1955i<?, ? super TranscodeType> f5925W;

    /* renamed from: X */
    private Object f5926X;

    /* renamed from: Y */
    private List<InterfaceC2351e<TranscodeType>> f5927Y;

    /* renamed from: Z */
    private C1950g<TranscodeType> f5928Z;

    /* renamed from: a0 */
    private C1950g<TranscodeType> f5929a0;

    /* renamed from: b0 */
    private Float f5930b0;

    /* renamed from: c0 */
    private boolean f5931c0 = true;

    /* renamed from: d0 */
    private boolean f5932d0;

    /* renamed from: e0 */
    private boolean f5933e0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestBuilder.java */
    /* renamed from: com.bumptech.glide.g$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1951a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5934a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5935b;

        static {
            int[] iArr = new int[EnumC1949f.values().length];
            f5935b = iArr;
            try {
                iArr[EnumC1949f.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5935b[EnumC1949f.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5935b[EnumC1949f.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5935b[EnumC1949f.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f5934a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5934a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5934a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5934a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5934a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5934a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5934a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5934a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new C2352f().m33232e(AbstractC2060j.f6253b).m33247L(EnumC1949f.LOW).m33241R(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C1950g(ComponentCallbacks2C1943b componentCallbacks2C1943b, ComponentCallbacks2C1952h componentCallbacks2C1952h, Class<TranscodeType> cls, Context context) {
        this.f5922T = componentCallbacks2C1952h;
        this.f5923U = cls;
        this.f5921S = context;
        this.f5925W = componentCallbacks2C1952h.m34119l(cls);
        this.f5924V = componentCallbacks2C1943b.m34163i();
        m34134f0(componentCallbacks2C1952h.m34121j());
        mo33236a(componentCallbacks2C1952h.m34120k());
    }

    /* renamed from: a0 */
    private InterfaceC2348c m34139a0(InterfaceC2360d<TranscodeType> interfaceC2360d, InterfaceC2351e<TranscodeType> interfaceC2351e, AbstractC2346a<?> abstractC2346a, Executor executor) {
        return m34138b0(new Object(), interfaceC2360d, interfaceC2351e, null, this.f5925W, abstractC2346a.m33219s(), abstractC2346a.m33222p(), abstractC2346a.m33223o(), abstractC2346a, executor);
    }

    /* renamed from: b0 */
    private InterfaceC2348c m34138b0(Object obj, InterfaceC2360d<TranscodeType> interfaceC2360d, InterfaceC2351e<TranscodeType> interfaceC2351e, InterfaceC2349d interfaceC2349d, AbstractC1955i<?, ? super TranscodeType> abstractC1955i, EnumC1949f enumC1949f, int i, int i2, AbstractC2346a<?> abstractC2346a, Executor executor) {
        C2347b c2347b;
        C2347b c2347b2;
        if (this.f5929a0 != null) {
            c2347b2 = new C2347b(obj, interfaceC2349d);
            c2347b = c2347b2;
        } else {
            c2347b = null;
            c2347b2 = interfaceC2349d;
        }
        InterfaceC2348c m34137c0 = m34137c0(obj, interfaceC2360d, interfaceC2351e, c2347b2, abstractC1955i, enumC1949f, i, i2, abstractC2346a, executor);
        if (c2347b == null) {
            return m34137c0;
        }
        int m33222p = this.f5929a0.m33222p();
        int m33223o = this.f5929a0.m33223o();
        if (C2381k.m33110r(i, i2) && !this.f5929a0.m33251G()) {
            m33222p = abstractC2346a.m33222p();
            m33223o = abstractC2346a.m33223o();
        }
        C1950g<TranscodeType> c1950g = this.f5929a0;
        C2347b c2347b3 = c2347b;
        c2347b3.m33207o(m34137c0, c1950g.m34138b0(obj, interfaceC2360d, interfaceC2351e, c2347b3, c1950g.f5925W, c1950g.m33219s(), m33222p, m33223o, this.f5929a0, executor));
        return c2347b3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bumptech.glide.o.a] */
    /* renamed from: c0 */
    private InterfaceC2348c m34137c0(Object obj, InterfaceC2360d<TranscodeType> interfaceC2360d, InterfaceC2351e<TranscodeType> interfaceC2351e, InterfaceC2349d interfaceC2349d, AbstractC1955i<?, ? super TranscodeType> abstractC1955i, EnumC1949f enumC1949f, int i, int i2, AbstractC2346a<?> abstractC2346a, Executor executor) {
        EnumC1949f m34135e0;
        C1950g<TranscodeType> c1950g = this.f5928Z;
        if (c1950g != null) {
            if (!this.f5933e0) {
                AbstractC1955i<?, ? super TranscodeType> abstractC1955i2 = c1950g.f5931c0 ? abstractC1955i : c1950g.f5925W;
                if (this.f5928Z.m33256B()) {
                    m34135e0 = this.f5928Z.m33219s();
                } else {
                    m34135e0 = m34135e0(enumC1949f);
                }
                EnumC1949f enumC1949f2 = m34135e0;
                int m33222p = this.f5928Z.m33222p();
                int m33223o = this.f5928Z.m33223o();
                if (C2381k.m33110r(i, i2) && !this.f5928Z.m33251G()) {
                    m33222p = abstractC2346a.m33222p();
                    m33223o = abstractC2346a.m33223o();
                }
                C2356i c2356i = new C2356i(obj, interfaceC2349d);
                InterfaceC2348c m34127o0 = m34127o0(obj, interfaceC2360d, interfaceC2351e, abstractC2346a, c2356i, abstractC1955i, enumC1949f, i, i2, executor);
                this.f5933e0 = true;
                C1950g<TranscodeType> c1950g2 = this.f5928Z;
                InterfaceC2348c m34138b0 = c1950g2.m34138b0(obj, interfaceC2360d, interfaceC2351e, c2356i, abstractC1955i2, enumC1949f2, m33222p, m33223o, c1950g2, executor);
                this.f5933e0 = false;
                c2356i.m33168n(m34127o0, m34138b0);
                return c2356i;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f5930b0 != null) {
            C2356i c2356i2 = new C2356i(obj, interfaceC2349d);
            c2356i2.m33168n(m34127o0(obj, interfaceC2360d, interfaceC2351e, abstractC2346a, c2356i2, abstractC1955i, enumC1949f, i, i2, executor), m34127o0(obj, interfaceC2360d, interfaceC2351e, abstractC2346a.clone().m33242Q(this.f5930b0.floatValue()), c2356i2, abstractC1955i, m34135e0(enumC1949f), i, i2, executor));
            return c2356i2;
        } else {
            return m34127o0(obj, interfaceC2360d, interfaceC2351e, abstractC2346a, interfaceC2349d, abstractC1955i, enumC1949f, i, i2, executor);
        }
    }

    /* renamed from: e0 */
    private EnumC1949f m34135e0(EnumC1949f enumC1949f) {
        int i = C1951a.f5935b[enumC1949f.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalArgumentException("unknown priority: " + m33219s());
                }
                return EnumC1949f.IMMEDIATE;
            }
            return EnumC1949f.HIGH;
        }
        return EnumC1949f.NORMAL;
    }

    /* renamed from: f0 */
    private void m34134f0(List<InterfaceC2351e<Object>> list) {
        for (InterfaceC2351e<Object> interfaceC2351e : list) {
            m34141X(interfaceC2351e);
        }
    }

    /* renamed from: i0 */
    private <Y extends InterfaceC2360d<TranscodeType>> Y m34132i0(Y y, InterfaceC2351e<TranscodeType> interfaceC2351e, AbstractC2346a<?> abstractC2346a, Executor executor) {
        C2380j.m33129d(y);
        if (this.f5932d0) {
            InterfaceC2348c m34139a0 = m34139a0(y, interfaceC2351e, abstractC2346a, executor);
            InterfaceC2348c request = y.getRequest();
            if (m34139a0.mo33175g(request) && !m34130l0(abstractC2346a, request)) {
                C2380j.m33129d(request);
                if (!request.isRunning()) {
                    request.mo33177e();
                }
                return y;
            }
            this.f5922T.m34122i(y);
            y.mo33165c(m34139a0);
            this.f5922T.m34112s(y, m34139a0);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: l0 */
    private boolean m34130l0(AbstractC2346a<?> abstractC2346a, InterfaceC2348c interfaceC2348c) {
        return !abstractC2346a.m33257A() && interfaceC2348c.mo33176f();
    }

    /* renamed from: n0 */
    private C1950g<TranscodeType> m34128n0(Object obj) {
        this.f5926X = obj;
        this.f5932d0 = true;
        return this;
    }

    /* renamed from: o0 */
    private InterfaceC2348c m34127o0(Object obj, InterfaceC2360d<TranscodeType> interfaceC2360d, InterfaceC2351e<TranscodeType> interfaceC2351e, AbstractC2346a<?> abstractC2346a, InterfaceC2349d interfaceC2349d, AbstractC1955i<?, ? super TranscodeType> abstractC1955i, EnumC1949f enumC1949f, int i, int i2, Executor executor) {
        Context context = this.f5921S;
        C1947d c1947d = this.f5924V;
        return C2354h.m33184x(context, c1947d, obj, this.f5926X, this.f5923U, abstractC2346a, i, i2, enumC1949f, interfaceC2360d, interfaceC2351e, this.f5927Y, interfaceC2349d, c1947d.m34145e(), abstractC1955i.m34108b(), executor);
    }

    /* renamed from: X */
    public C1950g<TranscodeType> m34141X(InterfaceC2351e<TranscodeType> interfaceC2351e) {
        if (interfaceC2351e != null) {
            if (this.f5927Y == null) {
                this.f5927Y = new ArrayList();
            }
            this.f5927Y.add(interfaceC2351e);
        }
        return this;
    }

    @Override // com.bumptech.glide.p082o.AbstractC2346a
    /* renamed from: Y */
    public C1950g<TranscodeType> mo33236a(AbstractC2346a<?> abstractC2346a) {
        C2380j.m33129d(abstractC2346a);
        return (C1950g) super.mo33236a(abstractC2346a);
    }

    @Override // com.bumptech.glide.p082o.AbstractC2346a
    /* renamed from: d0 */
    public C1950g<TranscodeType> clone() {
        C1950g<TranscodeType> c1950g = (C1950g) super.clone();
        c1950g.f5925W = (AbstractC1955i<?, ? super TranscodeType>) c1950g.f5925W.clone();
        return c1950g;
    }

    /* renamed from: h0 */
    public <Y extends InterfaceC2360d<TranscodeType>> Y m34133h0(Y y) {
        m34131j0(y, null, C2373e.m33147b());
        return y;
    }

    /* renamed from: j0 */
    <Y extends InterfaceC2360d<TranscodeType>> Y m34131j0(Y y, InterfaceC2351e<TranscodeType> interfaceC2351e, Executor executor) {
        m34132i0(y, interfaceC2351e, this, executor);
        return y;
    }

    /* renamed from: m0 */
    public C1950g<TranscodeType> m34129m0(Object obj) {
        m34128n0(obj);
        return this;
    }
}
