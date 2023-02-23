package io.intercom.com.bumptech.glide.p412p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10623h;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10508b;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10751j;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10744g;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10745h;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10756k;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10761m;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10762n;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10793c;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10797f;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10804i;
import io.intercom.com.bumptech.glide.p415q.C10881a;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: RequestOptions.java */
/* renamed from: io.intercom.com.bumptech.glide.p.g */
/* loaded from: classes3.dex */
public class C10856g implements Cloneable {

    /* renamed from: E */
    private boolean f24757E;

    /* renamed from: G */
    private Drawable f24759G;

    /* renamed from: H */
    private int f24760H;

    /* renamed from: L */
    private boolean f24764L;

    /* renamed from: M */
    private Resources.Theme f24765M;

    /* renamed from: N */
    private boolean f24766N;

    /* renamed from: O */
    private boolean f24767O;

    /* renamed from: P */
    private boolean f24768P;

    /* renamed from: R */
    private boolean f24770R;

    /* renamed from: c */
    private int f24771c;

    /* renamed from: w */
    private Drawable f24775w;

    /* renamed from: x */
    private int f24776x;

    /* renamed from: y */
    private Drawable f24777y;

    /* renamed from: z */
    private int f24778z;

    /* renamed from: d */
    private float f24772d = 1.0f;

    /* renamed from: e */
    private AbstractC10544i f24773e = AbstractC10544i.f24239d;

    /* renamed from: f */
    private EnumC10482g f24774f = EnumC10482g.NORMAL;

    /* renamed from: A */
    private boolean f24753A = true;

    /* renamed from: B */
    private int f24754B = -1;

    /* renamed from: C */
    private int f24755C = -1;

    /* renamed from: D */
    private InterfaceC10622g f24756D = C10881a.m12044a();

    /* renamed from: F */
    private boolean f24758F = true;

    /* renamed from: I */
    private C10626i f24761I = new C10626i();

    /* renamed from: J */
    private Map<Class<?>, InterfaceC10629l<?>> f24762J = new HashMap();

    /* renamed from: K */
    private Class<?> f24763K = Object.class;

    /* renamed from: Q */
    private boolean f24769Q = true;

    /* renamed from: K */
    private boolean m12168K(int i) {
        return m12167L(this.f24771c, i);
    }

    /* renamed from: L */
    private static boolean m12167L(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: U */
    private C10856g m12158U(AbstractC10751j abstractC10751j, InterfaceC10629l<Bitmap> interfaceC10629l) {
        return m12149c0(abstractC10751j, interfaceC10629l, false);
    }

    /* renamed from: c0 */
    private C10856g m12149c0(AbstractC10751j abstractC10751j, InterfaceC10629l<Bitmap> interfaceC10629l, boolean z) {
        C10856g m12130n0 = z ? m12130n0(abstractC10751j, interfaceC10629l) : m12157W(abstractC10751j, interfaceC10629l);
        m12130n0.f24769Q = true;
        return m12130n0;
    }

    /* renamed from: d0 */
    private C10856g m12147d0() {
        if (this.f24764L) {
            throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
        }
        return this;
    }

    /* renamed from: e */
    public static C10856g m12146e(Class<?> cls) {
        return new C10856g().m12148d(cls);
    }

    /* renamed from: g */
    public static C10856g m12142g(AbstractC10544i abstractC10544i) {
        return new C10856g().m12144f(abstractC10544i);
    }

    /* renamed from: h0 */
    public static C10856g m12140h0(InterfaceC10622g interfaceC10622g) {
        return new C10856g().m12143f0(interfaceC10622g);
    }

    /* renamed from: m0 */
    private C10856g m12132m0(InterfaceC10629l<Bitmap> interfaceC10629l, boolean z) {
        if (this.f24766N) {
            return clone().m12132m0(interfaceC10629l, z);
        }
        C10761m c10761m = new C10761m(interfaceC10629l, z);
        m12128o0(Bitmap.class, interfaceC10629l, z);
        m12128o0(Drawable.class, c10761m, z);
        c10761m.m12397a();
        m12128o0(BitmapDrawable.class, c10761m, z);
        m12128o0(C10793c.class, new C10797f(interfaceC10629l), z);
        m12147d0();
        return this;
    }

    /* renamed from: o0 */
    private <T> C10856g m12128o0(Class<T> cls, InterfaceC10629l<T> interfaceC10629l, boolean z) {
        if (this.f24766N) {
            return clone().m12128o0(cls, interfaceC10629l, z);
        }
        C10892h.m12014d(cls);
        C10892h.m12014d(interfaceC10629l);
        this.f24762J.put(cls, interfaceC10629l);
        int i = this.f24771c | IjkMediaMeta.FF_PROFILE_H264_INTRA;
        this.f24771c = i;
        this.f24758F = true;
        int i2 = i | 65536;
        this.f24771c = i2;
        this.f24769Q = false;
        if (z) {
            this.f24771c = i2 | 131072;
            this.f24757E = true;
        }
        m12147d0();
        return this;
    }

    /* renamed from: A */
    public final InterfaceC10622g m12177A() {
        return this.f24756D;
    }

    /* renamed from: B */
    public final float m12176B() {
        return this.f24772d;
    }

    /* renamed from: C */
    public final Resources.Theme m12175C() {
        return this.f24765M;
    }

    /* renamed from: D */
    public final Map<Class<?>, InterfaceC10629l<?>> m12174D() {
        return this.f24762J;
    }

    /* renamed from: E */
    public final boolean m12173E() {
        return this.f24770R;
    }

    /* renamed from: F */
    public final boolean m12172F() {
        return this.f24767O;
    }

    /* renamed from: G */
    public final boolean m12171G() {
        return this.f24753A;
    }

    /* renamed from: H */
    public final boolean m12170H() {
        return m12168K(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean m12169I() {
        return this.f24769Q;
    }

    /* renamed from: M */
    public final boolean m12166M() {
        return this.f24758F;
    }

    /* renamed from: N */
    public final boolean m12165N() {
        return this.f24757E;
    }

    /* renamed from: O */
    public final boolean m12164O() {
        return m12168K(IjkMediaMeta.FF_PROFILE_H264_INTRA);
    }

    /* renamed from: P */
    public final boolean m12163P() {
        return C10893i.m11994s(this.f24755C, this.f24754B);
    }

    /* renamed from: Q */
    public C10856g m12162Q() {
        this.f24764L = true;
        return this;
    }

    /* renamed from: R */
    public C10856g m12161R() {
        return m12157W(AbstractC10751j.f24574b, new C10744g());
    }

    /* renamed from: S */
    public C10856g m12160S() {
        return m12158U(AbstractC10751j.f24575c, new C10745h());
    }

    /* renamed from: T */
    public C10856g m12159T() {
        return m12158U(AbstractC10751j.f24573a, new C10762n());
    }

    /* renamed from: W */
    final C10856g m12157W(AbstractC10751j abstractC10751j, InterfaceC10629l<Bitmap> interfaceC10629l) {
        if (this.f24766N) {
            return clone().m12157W(abstractC10751j, interfaceC10629l);
        }
        m12139i(abstractC10751j);
        return m12132m0(interfaceC10629l, false);
    }

    /* renamed from: X */
    public C10856g m12156X(int i, int i2) {
        if (this.f24766N) {
            return clone().m12156X(i, i2);
        }
        this.f24755C = i;
        this.f24754B = i2;
        this.f24771c |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        m12147d0();
        return this;
    }

    /* renamed from: Y */
    public C10856g m12155Y(int i) {
        if (this.f24766N) {
            return clone().m12155Y(i);
        }
        this.f24778z = i;
        this.f24771c |= 128;
        m12147d0();
        return this;
    }

    /* renamed from: a */
    public C10856g m12154a(C10856g c10856g) {
        if (this.f24766N) {
            return clone().m12154a(c10856g);
        }
        if (m12167L(c10856g.f24771c, 2)) {
            this.f24772d = c10856g.f24772d;
        }
        if (m12167L(c10856g.f24771c, 262144)) {
            this.f24767O = c10856g.f24767O;
        }
        if (m12167L(c10856g.f24771c, 1048576)) {
            this.f24770R = c10856g.f24770R;
        }
        if (m12167L(c10856g.f24771c, 4)) {
            this.f24773e = c10856g.f24773e;
        }
        if (m12167L(c10856g.f24771c, 8)) {
            this.f24774f = c10856g.f24774f;
        }
        if (m12167L(c10856g.f24771c, 16)) {
            this.f24775w = c10856g.f24775w;
        }
        if (m12167L(c10856g.f24771c, 32)) {
            this.f24776x = c10856g.f24776x;
        }
        if (m12167L(c10856g.f24771c, 64)) {
            this.f24777y = c10856g.f24777y;
        }
        if (m12167L(c10856g.f24771c, 128)) {
            this.f24778z = c10856g.f24778z;
        }
        if (m12167L(c10856g.f24771c, 256)) {
            this.f24753A = c10856g.f24753A;
        }
        if (m12167L(c10856g.f24771c, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED)) {
            this.f24755C = c10856g.f24755C;
            this.f24754B = c10856g.f24754B;
        }
        if (m12167L(c10856g.f24771c, 1024)) {
            this.f24756D = c10856g.f24756D;
        }
        if (m12167L(c10856g.f24771c, 4096)) {
            this.f24763K = c10856g.f24763K;
        }
        if (m12167L(c10856g.f24771c, 8192)) {
            this.f24759G = c10856g.f24759G;
        }
        if (m12167L(c10856g.f24771c, 16384)) {
            this.f24760H = c10856g.f24760H;
        }
        if (m12167L(c10856g.f24771c, 32768)) {
            this.f24765M = c10856g.f24765M;
        }
        if (m12167L(c10856g.f24771c, 65536)) {
            this.f24758F = c10856g.f24758F;
        }
        if (m12167L(c10856g.f24771c, 131072)) {
            this.f24757E = c10856g.f24757E;
        }
        if (m12167L(c10856g.f24771c, IjkMediaMeta.FF_PROFILE_H264_INTRA)) {
            this.f24762J.putAll(c10856g.f24762J);
            this.f24769Q = c10856g.f24769Q;
        }
        if (m12167L(c10856g.f24771c, 524288)) {
            this.f24768P = c10856g.f24768P;
        }
        if (!this.f24758F) {
            this.f24762J.clear();
            int i = this.f24771c & (-2049);
            this.f24771c = i;
            this.f24757E = false;
            this.f24771c = i & (-131073);
            this.f24769Q = true;
        }
        this.f24771c |= c10856g.f24771c;
        this.f24761I.m12592b(c10856g.f24761I);
        m12147d0();
        return this;
    }

    /* renamed from: a0 */
    public C10856g m12153a0(Drawable drawable) {
        if (this.f24766N) {
            return clone().m12153a0(drawable);
        }
        this.f24777y = drawable;
        this.f24771c |= 64;
        m12147d0();
        return this;
    }

    /* renamed from: b */
    public C10856g m12152b() {
        if (this.f24764L && !this.f24766N) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f24766N = true;
        m12162Q();
        return this;
    }

    /* renamed from: b0 */
    public C10856g m12151b0(EnumC10482g enumC10482g) {
        if (this.f24766N) {
            return clone().m12151b0(enumC10482g);
        }
        C10892h.m12014d(enumC10482g);
        this.f24774f = enumC10482g;
        this.f24771c |= 8;
        m12147d0();
        return this;
    }

    /* renamed from: c */
    public C10856g clone() {
        try {
            C10856g c10856g = (C10856g) super.clone();
            C10626i c10626i = new C10626i();
            c10856g.f24761I = c10626i;
            c10626i.m12592b(this.f24761I);
            HashMap hashMap = new HashMap();
            c10856g.f24762J = hashMap;
            hashMap.putAll(this.f24762J);
            c10856g.f24764L = false;
            c10856g.f24766N = false;
            return c10856g;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public C10856g m12148d(Class<?> cls) {
        if (this.f24766N) {
            return clone().m12148d(cls);
        }
        C10892h.m12014d(cls);
        this.f24763K = cls;
        this.f24771c |= 4096;
        m12147d0();
        return this;
    }

    /* renamed from: e0 */
    public <T> C10856g m12145e0(C10623h<T> c10623h, T t) {
        if (this.f24766N) {
            return clone().m12145e0(c10623h, t);
        }
        C10892h.m12014d(c10623h);
        C10892h.m12014d(t);
        this.f24761I.m12591c(c10623h, t);
        m12147d0();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10856g) {
            C10856g c10856g = (C10856g) obj;
            return Float.compare(c10856g.f24772d, this.f24772d) == 0 && this.f24776x == c10856g.f24776x && C10893i.m12009d(this.f24775w, c10856g.f24775w) && this.f24778z == c10856g.f24778z && C10893i.m12009d(this.f24777y, c10856g.f24777y) && this.f24760H == c10856g.f24760H && C10893i.m12009d(this.f24759G, c10856g.f24759G) && this.f24753A == c10856g.f24753A && this.f24754B == c10856g.f24754B && this.f24755C == c10856g.f24755C && this.f24757E == c10856g.f24757E && this.f24758F == c10856g.f24758F && this.f24767O == c10856g.f24767O && this.f24768P == c10856g.f24768P && this.f24773e.equals(c10856g.f24773e) && this.f24774f == c10856g.f24774f && this.f24761I.equals(c10856g.f24761I) && this.f24762J.equals(c10856g.f24762J) && this.f24763K.equals(c10856g.f24763K) && C10893i.m12009d(this.f24756D, c10856g.f24756D) && C10893i.m12009d(this.f24765M, c10856g.f24765M);
        }
        return false;
    }

    /* renamed from: f */
    public C10856g m12144f(AbstractC10544i abstractC10544i) {
        if (this.f24766N) {
            return clone().m12144f(abstractC10544i);
        }
        C10892h.m12014d(abstractC10544i);
        this.f24773e = abstractC10544i;
        this.f24771c |= 4;
        m12147d0();
        return this;
    }

    /* renamed from: f0 */
    public C10856g m12143f0(InterfaceC10622g interfaceC10622g) {
        if (this.f24766N) {
            return clone().m12143f0(interfaceC10622g);
        }
        C10892h.m12014d(interfaceC10622g);
        this.f24756D = interfaceC10622g;
        this.f24771c |= 1024;
        m12147d0();
        return this;
    }

    /* renamed from: h */
    public C10856g m12141h() {
        return m12145e0(C10804i.f24676b, Boolean.TRUE);
    }

    public int hashCode() {
        return C10893i.m11999n(this.f24765M, C10893i.m11999n(this.f24756D, C10893i.m11999n(this.f24763K, C10893i.m11999n(this.f24762J, C10893i.m11999n(this.f24761I, C10893i.m11999n(this.f24774f, C10893i.m11999n(this.f24773e, C10893i.m11998o(this.f24768P, C10893i.m11998o(this.f24767O, C10893i.m11998o(this.f24758F, C10893i.m11998o(this.f24757E, C10893i.m12000m(this.f24755C, C10893i.m12000m(this.f24754B, C10893i.m11998o(this.f24753A, C10893i.m11999n(this.f24759G, C10893i.m12000m(this.f24760H, C10893i.m11999n(this.f24777y, C10893i.m12000m(this.f24778z, C10893i.m11999n(this.f24775w, C10893i.m12000m(this.f24776x, C10893i.m12002k(this.f24772d)))))))))))))))))))));
    }

    /* renamed from: i */
    public C10856g m12139i(AbstractC10751j abstractC10751j) {
        C10623h<AbstractC10751j> c10623h = C10756k.f24581g;
        C10892h.m12014d(abstractC10751j);
        return m12145e0(c10623h, abstractC10751j);
    }

    /* renamed from: i0 */
    public C10856g m12138i0(float f) {
        if (this.f24766N) {
            return clone().m12138i0(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.f24772d = f;
            this.f24771c |= 2;
            m12147d0();
            return this;
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    /* renamed from: j */
    public C10856g m12137j(int i) {
        if (this.f24766N) {
            return clone().m12137j(i);
        }
        this.f24776x = i;
        this.f24771c |= 32;
        m12147d0();
        return this;
    }

    /* renamed from: j0 */
    public C10856g m12136j0(boolean z) {
        if (this.f24766N) {
            return clone().m12136j0(true);
        }
        this.f24753A = !z;
        this.f24771c |= 256;
        m12147d0();
        return this;
    }

    /* renamed from: k */
    public C10856g m12135k(Drawable drawable) {
        if (this.f24766N) {
            return clone().m12135k(drawable);
        }
        this.f24775w = drawable;
        this.f24771c |= 16;
        m12147d0();
        return this;
    }

    /* renamed from: l */
    public C10856g m12134l(EnumC10508b enumC10508b) {
        C10892h.m12014d(enumC10508b);
        return m12145e0(C10756k.f24580f, enumC10508b).m12145e0(C10804i.f24675a, enumC10508b);
    }

    /* renamed from: l0 */
    public C10856g m12133l0(InterfaceC10629l<Bitmap> interfaceC10629l) {
        return m12132m0(interfaceC10629l, true);
    }

    /* renamed from: n */
    public final AbstractC10544i m12131n() {
        return this.f24773e;
    }

    /* renamed from: n0 */
    final C10856g m12130n0(AbstractC10751j abstractC10751j, InterfaceC10629l<Bitmap> interfaceC10629l) {
        if (this.f24766N) {
            return clone().m12130n0(abstractC10751j, interfaceC10629l);
        }
        m12139i(abstractC10751j);
        return m12133l0(interfaceC10629l);
    }

    /* renamed from: o */
    public final int m12129o() {
        return this.f24776x;
    }

    /* renamed from: p */
    public final Drawable m12127p() {
        return this.f24775w;
    }

    /* renamed from: p0 */
    public C10856g m12126p0(boolean z) {
        if (this.f24766N) {
            return clone().m12126p0(z);
        }
        this.f24770R = z;
        this.f24771c |= 1048576;
        m12147d0();
        return this;
    }

    /* renamed from: q */
    public final Drawable m12125q() {
        return this.f24759G;
    }

    /* renamed from: r */
    public final int m12124r() {
        return this.f24760H;
    }

    /* renamed from: s */
    public final boolean m12123s() {
        return this.f24768P;
    }

    /* renamed from: t */
    public final C10626i m12122t() {
        return this.f24761I;
    }

    /* renamed from: u */
    public final int m12121u() {
        return this.f24754B;
    }

    /* renamed from: v */
    public final int m12120v() {
        return this.f24755C;
    }

    /* renamed from: w */
    public final Drawable m12119w() {
        return this.f24777y;
    }

    /* renamed from: x */
    public final int m12118x() {
        return this.f24778z;
    }

    /* renamed from: y */
    public final EnumC10482g m12117y() {
        return this.f24774f;
    }

    /* renamed from: z */
    public final Class<?> m12116z() {
        return this.f24763K;
    }
}
