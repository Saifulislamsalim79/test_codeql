package com.bumptech.glide.p082o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2119g;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1994b;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.AbstractC2060j;
import com.bumptech.glide.load.p074o.p078g.C2265c;
import com.bumptech.glide.load.p074o.p078g.C2269f;
import com.bumptech.glide.load.p074o.p078g.C2276i;
import com.bumptech.glide.load.resource.bitmap.C2301i;
import com.bumptech.glide.load.resource.bitmap.C2306k;
import com.bumptech.glide.p082o.AbstractC2346a;
import com.bumptech.glide.p085p.C2365a;
import com.bumptech.glide.p086q.C2370b;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.C2381k;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: BaseRequestOptions.java */
/* renamed from: com.bumptech.glide.o.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2346a<T extends AbstractC2346a<T>> implements Cloneable {

    /* renamed from: E */
    private boolean f6766E;

    /* renamed from: G */
    private Drawable f6768G;

    /* renamed from: H */
    private int f6769H;

    /* renamed from: L */
    private boolean f6773L;

    /* renamed from: M */
    private Resources.Theme f6774M;

    /* renamed from: N */
    private boolean f6775N;

    /* renamed from: O */
    private boolean f6776O;

    /* renamed from: P */
    private boolean f6777P;

    /* renamed from: R */
    private boolean f6779R;

    /* renamed from: c */
    private int f6780c;

    /* renamed from: w */
    private Drawable f6784w;

    /* renamed from: x */
    private int f6785x;

    /* renamed from: y */
    private Drawable f6786y;

    /* renamed from: z */
    private int f6787z;

    /* renamed from: d */
    private float f6781d = 1.0f;

    /* renamed from: e */
    private AbstractC2060j f6782e = AbstractC2060j.f6254c;

    /* renamed from: f */
    private EnumC1949f f6783f = EnumC1949f.NORMAL;

    /* renamed from: A */
    private boolean f6762A = true;

    /* renamed from: B */
    private int f6763B = -1;

    /* renamed from: C */
    private int f6764C = -1;

    /* renamed from: D */
    private InterfaceC2118f f6765D = C2365a.m33161b();

    /* renamed from: F */
    private boolean f6767F = true;

    /* renamed from: I */
    private C2122h f6770I = new C2122h();

    /* renamed from: J */
    private Map<Class<?>, InterfaceC2126l<?>> f6771J = new C2370b();

    /* renamed from: K */
    private Class<?> f6772K = Object.class;

    /* renamed from: Q */
    private boolean f6778Q = true;

    /* renamed from: D */
    private boolean m33254D(int i) {
        return m33253E(this.f6780c, i);
    }

    /* renamed from: E */
    private static boolean m33253E(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: M */
    private T m33246M() {
        return this;
    }

    /* renamed from: N */
    private T m33245N() {
        if (!this.f6773L) {
            m33246M();
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: A */
    public final boolean m33257A() {
        return this.f6762A;
    }

    /* renamed from: B */
    public final boolean m33256B() {
        return m33254D(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m33255C() {
        return this.f6778Q;
    }

    /* renamed from: F */
    public final boolean m33252F() {
        return this.f6766E;
    }

    /* renamed from: G */
    public final boolean m33251G() {
        return C2381k.m33110r(this.f6764C, this.f6763B);
    }

    /* renamed from: H */
    public T m33250H() {
        this.f6773L = true;
        m33246M();
        return this;
    }

    /* renamed from: I */
    public T m33249I(int i, int i2) {
        if (this.f6775N) {
            return (T) clone().m33249I(i, i2);
        }
        this.f6764C = i;
        this.f6763B = i2;
        this.f6780c |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        m33245N();
        return this;
    }

    /* renamed from: K */
    public T m33248K(int i) {
        if (this.f6775N) {
            return (T) clone().m33248K(i);
        }
        this.f6787z = i;
        int i2 = this.f6780c | 128;
        this.f6780c = i2;
        this.f6786y = null;
        this.f6780c = i2 & (-65);
        m33245N();
        return this;
    }

    /* renamed from: L */
    public T m33247L(EnumC1949f enumC1949f) {
        if (this.f6775N) {
            return (T) clone().m33247L(enumC1949f);
        }
        C2380j.m33129d(enumC1949f);
        this.f6783f = enumC1949f;
        this.f6780c |= 8;
        m33245N();
        return this;
    }

    /* renamed from: O */
    public <Y> T m33244O(C2119g<Y> c2119g, Y y) {
        if (this.f6775N) {
            return (T) clone().m33244O(c2119g, y);
        }
        C2380j.m33129d(c2119g);
        C2380j.m33129d(y);
        this.f6770I.m33659d(c2119g, y);
        m33245N();
        return this;
    }

    /* renamed from: P */
    public T m33243P(InterfaceC2118f interfaceC2118f) {
        if (this.f6775N) {
            return (T) clone().m33243P(interfaceC2118f);
        }
        C2380j.m33129d(interfaceC2118f);
        this.f6765D = interfaceC2118f;
        this.f6780c |= 1024;
        m33245N();
        return this;
    }

    /* renamed from: Q */
    public T m33242Q(float f) {
        if (this.f6775N) {
            return (T) clone().m33242Q(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.f6781d = f;
            this.f6780c |= 2;
            m33245N();
            return this;
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    /* renamed from: R */
    public T m33241R(boolean z) {
        if (this.f6775N) {
            return (T) clone().m33241R(true);
        }
        this.f6762A = !z;
        this.f6780c |= 256;
        m33245N();
        return this;
    }

    /* renamed from: S */
    public T m33240S(InterfaceC2126l<Bitmap> interfaceC2126l) {
        return m33239T(interfaceC2126l, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    T m33239T(InterfaceC2126l<Bitmap> interfaceC2126l, boolean z) {
        if (this.f6775N) {
            return (T) clone().m33239T(interfaceC2126l, z);
        }
        C2306k c2306k = new C2306k(interfaceC2126l, z);
        m33238U(Bitmap.class, interfaceC2126l, z);
        m33238U(Drawable.class, c2306k, z);
        c2306k.m33345b();
        m33238U(BitmapDrawable.class, c2306k, z);
        m33238U(C2265c.class, new C2269f(interfaceC2126l), z);
        m33245N();
        return this;
    }

    /* renamed from: U */
    <Y> T m33238U(Class<Y> cls, InterfaceC2126l<Y> interfaceC2126l, boolean z) {
        if (this.f6775N) {
            return (T) clone().m33238U(cls, interfaceC2126l, z);
        }
        C2380j.m33129d(cls);
        C2380j.m33129d(interfaceC2126l);
        this.f6771J.put(cls, interfaceC2126l);
        int i = this.f6780c | IjkMediaMeta.FF_PROFILE_H264_INTRA;
        this.f6780c = i;
        this.f6767F = true;
        int i2 = i | 65536;
        this.f6780c = i2;
        this.f6778Q = false;
        if (z) {
            this.f6780c = i2 | 131072;
            this.f6766E = true;
        }
        m33245N();
        return this;
    }

    /* renamed from: W */
    public T m33237W(boolean z) {
        if (this.f6775N) {
            return (T) clone().m33237W(z);
        }
        this.f6779R = z;
        this.f6780c |= 1048576;
        m33245N();
        return this;
    }

    /* renamed from: a */
    public T mo33236a(AbstractC2346a<?> abstractC2346a) {
        if (this.f6775N) {
            return (T) clone().mo33236a(abstractC2346a);
        }
        if (m33253E(abstractC2346a.f6780c, 2)) {
            this.f6781d = abstractC2346a.f6781d;
        }
        if (m33253E(abstractC2346a.f6780c, 262144)) {
            this.f6776O = abstractC2346a.f6776O;
        }
        if (m33253E(abstractC2346a.f6780c, 1048576)) {
            this.f6779R = abstractC2346a.f6779R;
        }
        if (m33253E(abstractC2346a.f6780c, 4)) {
            this.f6782e = abstractC2346a.f6782e;
        }
        if (m33253E(abstractC2346a.f6780c, 8)) {
            this.f6783f = abstractC2346a.f6783f;
        }
        if (m33253E(abstractC2346a.f6780c, 16)) {
            this.f6784w = abstractC2346a.f6784w;
            this.f6785x = 0;
            this.f6780c &= -33;
        }
        if (m33253E(abstractC2346a.f6780c, 32)) {
            this.f6785x = abstractC2346a.f6785x;
            this.f6784w = null;
            this.f6780c &= -17;
        }
        if (m33253E(abstractC2346a.f6780c, 64)) {
            this.f6786y = abstractC2346a.f6786y;
            this.f6787z = 0;
            this.f6780c &= -129;
        }
        if (m33253E(abstractC2346a.f6780c, 128)) {
            this.f6787z = abstractC2346a.f6787z;
            this.f6786y = null;
            this.f6780c &= -65;
        }
        if (m33253E(abstractC2346a.f6780c, 256)) {
            this.f6762A = abstractC2346a.f6762A;
        }
        if (m33253E(abstractC2346a.f6780c, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED)) {
            this.f6764C = abstractC2346a.f6764C;
            this.f6763B = abstractC2346a.f6763B;
        }
        if (m33253E(abstractC2346a.f6780c, 1024)) {
            this.f6765D = abstractC2346a.f6765D;
        }
        if (m33253E(abstractC2346a.f6780c, 4096)) {
            this.f6772K = abstractC2346a.f6772K;
        }
        if (m33253E(abstractC2346a.f6780c, 8192)) {
            this.f6768G = abstractC2346a.f6768G;
            this.f6769H = 0;
            this.f6780c &= -16385;
        }
        if (m33253E(abstractC2346a.f6780c, 16384)) {
            this.f6769H = abstractC2346a.f6769H;
            this.f6768G = null;
            this.f6780c &= -8193;
        }
        if (m33253E(abstractC2346a.f6780c, 32768)) {
            this.f6774M = abstractC2346a.f6774M;
        }
        if (m33253E(abstractC2346a.f6780c, 65536)) {
            this.f6767F = abstractC2346a.f6767F;
        }
        if (m33253E(abstractC2346a.f6780c, 131072)) {
            this.f6766E = abstractC2346a.f6766E;
        }
        if (m33253E(abstractC2346a.f6780c, IjkMediaMeta.FF_PROFILE_H264_INTRA)) {
            this.f6771J.putAll(abstractC2346a.f6771J);
            this.f6778Q = abstractC2346a.f6778Q;
        }
        if (m33253E(abstractC2346a.f6780c, 524288)) {
            this.f6777P = abstractC2346a.f6777P;
        }
        if (!this.f6767F) {
            this.f6771J.clear();
            int i = this.f6780c & (-2049);
            this.f6780c = i;
            this.f6766E = false;
            this.f6780c = i & (-131073);
            this.f6778Q = true;
        }
        this.f6780c |= abstractC2346a.f6780c;
        this.f6770I.m33660c(abstractC2346a.f6770I);
        m33245N();
        return this;
    }

    /* renamed from: b */
    public T m33235b() {
        if (this.f6773L && !this.f6775N) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f6775N = true;
        m33250H();
        return this;
    }

    @Override // 
    /* renamed from: c */
    public T clone() {
        try {
            T t = (T) super.clone();
            C2122h c2122h = new C2122h();
            t.f6770I = c2122h;
            c2122h.m33660c(this.f6770I);
            C2370b c2370b = new C2370b();
            t.f6771J = c2370b;
            c2370b.putAll(this.f6771J);
            t.f6773L = false;
            t.f6775N = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public T m33233d(Class<?> cls) {
        if (this.f6775N) {
            return (T) clone().m33233d(cls);
        }
        C2380j.m33129d(cls);
        this.f6772K = cls;
        this.f6780c |= 4096;
        m33245N();
        return this;
    }

    /* renamed from: e */
    public T m33232e(AbstractC2060j abstractC2060j) {
        if (this.f6775N) {
            return (T) clone().m33232e(abstractC2060j);
        }
        C2380j.m33129d(abstractC2060j);
        this.f6782e = abstractC2060j;
        this.f6780c |= 4;
        m33245N();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2346a) {
            AbstractC2346a abstractC2346a = (AbstractC2346a) obj;
            return Float.compare(abstractC2346a.f6781d, this.f6781d) == 0 && this.f6785x == abstractC2346a.f6785x && C2381k.m33125c(this.f6784w, abstractC2346a.f6784w) && this.f6787z == abstractC2346a.f6787z && C2381k.m33125c(this.f6786y, abstractC2346a.f6786y) && this.f6769H == abstractC2346a.f6769H && C2381k.m33125c(this.f6768G, abstractC2346a.f6768G) && this.f6762A == abstractC2346a.f6762A && this.f6763B == abstractC2346a.f6763B && this.f6764C == abstractC2346a.f6764C && this.f6766E == abstractC2346a.f6766E && this.f6767F == abstractC2346a.f6767F && this.f6776O == abstractC2346a.f6776O && this.f6777P == abstractC2346a.f6777P && this.f6782e.equals(abstractC2346a.f6782e) && this.f6783f == abstractC2346a.f6783f && this.f6770I.equals(abstractC2346a.f6770I) && this.f6771J.equals(abstractC2346a.f6771J) && this.f6772K.equals(abstractC2346a.f6772K) && C2381k.m33125c(this.f6765D, abstractC2346a.f6765D) && C2381k.m33125c(this.f6774M, abstractC2346a.f6774M);
        }
        return false;
    }

    /* renamed from: f */
    public T m33231f(EnumC1994b enumC1994b) {
        C2380j.m33129d(enumC1994b);
        return (T) m33244O(C2301i.f6685f, enumC1994b).m33244O(C2276i.f6643a, enumC1994b);
    }

    /* renamed from: g */
    public final AbstractC2060j m33230g() {
        return this.f6782e;
    }

    /* renamed from: h */
    public final int m33229h() {
        return this.f6785x;
    }

    public int hashCode() {
        return C2381k.m33115m(this.f6774M, C2381k.m33115m(this.f6765D, C2381k.m33115m(this.f6772K, C2381k.m33115m(this.f6771J, C2381k.m33115m(this.f6770I, C2381k.m33115m(this.f6783f, C2381k.m33115m(this.f6782e, C2381k.m33114n(this.f6777P, C2381k.m33114n(this.f6776O, C2381k.m33114n(this.f6767F, C2381k.m33114n(this.f6766E, C2381k.m33116l(this.f6764C, C2381k.m33116l(this.f6763B, C2381k.m33114n(this.f6762A, C2381k.m33115m(this.f6768G, C2381k.m33116l(this.f6769H, C2381k.m33115m(this.f6786y, C2381k.m33116l(this.f6787z, C2381k.m33115m(this.f6784w, C2381k.m33116l(this.f6785x, C2381k.m33118j(this.f6781d)))))))))))))))))))));
    }

    /* renamed from: i */
    public final Drawable m33228i() {
        return this.f6784w;
    }

    /* renamed from: j */
    public final Drawable m33227j() {
        return this.f6768G;
    }

    /* renamed from: k */
    public final int m33226k() {
        return this.f6769H;
    }

    /* renamed from: l */
    public final boolean m33225l() {
        return this.f6777P;
    }

    /* renamed from: n */
    public final C2122h m33224n() {
        return this.f6770I;
    }

    /* renamed from: o */
    public final int m33223o() {
        return this.f6763B;
    }

    /* renamed from: p */
    public final int m33222p() {
        return this.f6764C;
    }

    /* renamed from: q */
    public final Drawable m33221q() {
        return this.f6786y;
    }

    /* renamed from: r */
    public final int m33220r() {
        return this.f6787z;
    }

    /* renamed from: s */
    public final EnumC1949f m33219s() {
        return this.f6783f;
    }

    /* renamed from: t */
    public final Class<?> m33218t() {
        return this.f6772K;
    }

    /* renamed from: u */
    public final InterfaceC2118f m33217u() {
        return this.f6765D;
    }

    /* renamed from: v */
    public final float m33216v() {
        return this.f6781d;
    }

    /* renamed from: w */
    public final Resources.Theme m33215w() {
        return this.f6774M;
    }

    /* renamed from: x */
    public final Map<Class<?>, InterfaceC2126l<?>> m33214x() {
        return this.f6771J;
    }

    /* renamed from: y */
    public final boolean m33213y() {
        return this.f6779R;
    }

    /* renamed from: z */
    public final boolean m33212z() {
        return this.f6776O;
    }
}
