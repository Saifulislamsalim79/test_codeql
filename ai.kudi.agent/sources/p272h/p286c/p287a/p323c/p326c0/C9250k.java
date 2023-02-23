package p272h.p286c.p287a.p323c.p326c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p272h.p286c.p287a.p323c.C9277l;
/* compiled from: ShapeAppearanceModel.java */
/* renamed from: h.c.a.c.c0.k */
/* loaded from: classes2.dex */
public class C9250k {

    /* renamed from: m */
    public static final InterfaceC9239c f21716m = new C9248i(0.5f);

    /* renamed from: a */
    C9240d f21717a;

    /* renamed from: b */
    C9240d f21718b;

    /* renamed from: c */
    C9240d f21719c;

    /* renamed from: d */
    C9240d f21720d;

    /* renamed from: e */
    InterfaceC9239c f21721e;

    /* renamed from: f */
    InterfaceC9239c f21722f;

    /* renamed from: g */
    InterfaceC9239c f21723g;

    /* renamed from: h */
    InterfaceC9239c f21724h;

    /* renamed from: i */
    C9242f f21725i;

    /* renamed from: j */
    C9242f f21726j;

    /* renamed from: k */
    C9242f f21727k;

    /* renamed from: l */
    C9242f f21728l;

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: h.c.a.c.c0.k$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC9253c {
        /* renamed from: a */
        InterfaceC9239c mo15306a(InterfaceC9239c interfaceC9239c);
    }

    /* renamed from: a */
    public static C9252b m15363a() {
        return new C9252b();
    }

    /* renamed from: b */
    public static C9252b m15362b(Context context, int i, int i2) {
        return m15361c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C9252b m15361c(Context context, int i, int i2, int i3) {
        return m15360d(context, i, i2, new C9237a(i3));
    }

    /* renamed from: d */
    private static C9252b m15360d(Context context, int i, int i2, InterfaceC9239c interfaceC9239c) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C9277l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C9277l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C9277l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C9277l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C9277l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C9277l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            InterfaceC9239c m15351m = m15351m(obtainStyledAttributes, C9277l.ShapeAppearance_cornerSize, interfaceC9239c);
            InterfaceC9239c m15351m2 = m15351m(obtainStyledAttributes, C9277l.ShapeAppearance_cornerSizeTopLeft, m15351m);
            InterfaceC9239c m15351m3 = m15351m(obtainStyledAttributes, C9277l.ShapeAppearance_cornerSizeTopRight, m15351m);
            InterfaceC9239c m15351m4 = m15351m(obtainStyledAttributes, C9277l.ShapeAppearance_cornerSizeBottomRight, m15351m);
            InterfaceC9239c m15351m5 = m15351m(obtainStyledAttributes, C9277l.ShapeAppearance_cornerSizeBottomLeft, m15351m);
            C9252b c9252b = new C9252b();
            c9252b.m15308y(i4, m15351m2);
            c9252b.m15336C(i5, m15351m3);
            c9252b.m15312u(i6, m15351m4);
            c9252b.m15316q(i7, m15351m5);
            return c9252b;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C9252b m15359e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m15358f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C9252b m15358f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m15357g(context, attributeSet, i, i2, new C9237a(i3));
    }

    /* renamed from: g */
    public static C9252b m15357g(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC9239c interfaceC9239c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C9277l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C9277l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m15360d(context, resourceId, resourceId2, interfaceC9239c);
    }

    /* renamed from: m */
    private static InterfaceC9239c m15351m(TypedArray typedArray, int i, InterfaceC9239c interfaceC9239c) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC9239c;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C9237a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C9248i(peekValue.getFraction(1.0f, 1.0f)) : interfaceC9239c;
    }

    /* renamed from: h */
    public C9242f m15356h() {
        return this.f21727k;
    }

    /* renamed from: i */
    public C9240d m15355i() {
        return this.f21720d;
    }

    /* renamed from: j */
    public InterfaceC9239c m15354j() {
        return this.f21724h;
    }

    /* renamed from: k */
    public C9240d m15353k() {
        return this.f21719c;
    }

    /* renamed from: l */
    public InterfaceC9239c m15352l() {
        return this.f21723g;
    }

    /* renamed from: n */
    public C9242f m15350n() {
        return this.f21728l;
    }

    /* renamed from: o */
    public C9242f m15349o() {
        return this.f21726j;
    }

    /* renamed from: p */
    public C9242f m15348p() {
        return this.f21725i;
    }

    /* renamed from: q */
    public C9240d m15347q() {
        return this.f21717a;
    }

    /* renamed from: r */
    public InterfaceC9239c m15346r() {
        return this.f21721e;
    }

    /* renamed from: s */
    public C9240d m15345s() {
        return this.f21718b;
    }

    /* renamed from: t */
    public InterfaceC9239c m15344t() {
        return this.f21722f;
    }

    /* renamed from: u */
    public boolean m15343u(RectF rectF) {
        boolean z = this.f21728l.getClass().equals(C9242f.class) && this.f21726j.getClass().equals(C9242f.class) && this.f21725i.getClass().equals(C9242f.class) && this.f21727k.getClass().equals(C9242f.class);
        float mo15365a = this.f21721e.mo15365a(rectF);
        return z && ((this.f21722f.mo15365a(rectF) > mo15365a ? 1 : (this.f21722f.mo15365a(rectF) == mo15365a ? 0 : -1)) == 0 && (this.f21724h.mo15365a(rectF) > mo15365a ? 1 : (this.f21724h.mo15365a(rectF) == mo15365a ? 0 : -1)) == 0 && (this.f21723g.mo15365a(rectF) > mo15365a ? 1 : (this.f21723g.mo15365a(rectF) == mo15365a ? 0 : -1)) == 0) && ((this.f21718b instanceof C9249j) && (this.f21717a instanceof C9249j) && (this.f21719c instanceof C9249j) && (this.f21720d instanceof C9249j));
    }

    /* renamed from: v */
    public C9252b m15342v() {
        return new C9252b(this);
    }

    /* renamed from: w */
    public C9250k m15341w(float f) {
        C9252b m15342v = m15342v();
        m15342v.m15318o(f);
        return m15342v.m15320m();
    }

    /* renamed from: x */
    public C9250k m15340x(InterfaceC9239c interfaceC9239c) {
        C9252b m15342v = m15342v();
        m15342v.m15317p(interfaceC9239c);
        return m15342v.m15320m();
    }

    /* renamed from: y */
    public C9250k m15339y(InterfaceC9253c interfaceC9253c) {
        C9252b m15342v = m15342v();
        m15342v.m15337B(interfaceC9253c.mo15306a(m15346r()));
        m15342v.m15333F(interfaceC9253c.mo15306a(m15344t()));
        m15342v.m15313t(interfaceC9253c.mo15306a(m15354j()));
        m15342v.m15309x(interfaceC9253c.mo15306a(m15352l()));
        return m15342v.m15320m();
    }

    private C9250k(C9252b c9252b) {
        this.f21717a = c9252b.f21729a;
        this.f21718b = c9252b.f21730b;
        this.f21719c = c9252b.f21731c;
        this.f21720d = c9252b.f21732d;
        this.f21721e = c9252b.f21733e;
        this.f21722f = c9252b.f21734f;
        this.f21723g = c9252b.f21735g;
        this.f21724h = c9252b.f21736h;
        this.f21725i = c9252b.f21737i;
        this.f21726j = c9252b.f21738j;
        this.f21727k = c9252b.f21739k;
        this.f21728l = c9252b.f21740l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: h.c.a.c.c0.k$b */
    /* loaded from: classes2.dex */
    public static final class C9252b {

        /* renamed from: a */
        private C9240d f21729a;

        /* renamed from: b */
        private C9240d f21730b;

        /* renamed from: c */
        private C9240d f21731c;

        /* renamed from: d */
        private C9240d f21732d;

        /* renamed from: e */
        private InterfaceC9239c f21733e;

        /* renamed from: f */
        private InterfaceC9239c f21734f;

        /* renamed from: g */
        private InterfaceC9239c f21735g;

        /* renamed from: h */
        private InterfaceC9239c f21736h;

        /* renamed from: i */
        private C9242f f21737i;

        /* renamed from: j */
        private C9242f f21738j;

        /* renamed from: k */
        private C9242f f21739k;

        /* renamed from: l */
        private C9242f f21740l;

        public C9252b() {
            this.f21729a = C9247h.m15370b();
            this.f21730b = C9247h.m15370b();
            this.f21731c = C9247h.m15370b();
            this.f21732d = C9247h.m15370b();
            this.f21733e = new C9237a(0.0f);
            this.f21734f = new C9237a(0.0f);
            this.f21735g = new C9237a(0.0f);
            this.f21736h = new C9237a(0.0f);
            this.f21737i = C9247h.m15369c();
            this.f21738j = C9247h.m15369c();
            this.f21739k = C9247h.m15369c();
            this.f21740l = C9247h.m15369c();
        }

        /* renamed from: n */
        private static float m15319n(C9240d c9240d) {
            if (c9240d instanceof C9249j) {
                return ((C9249j) c9240d).f21715a;
            }
            if (c9240d instanceof C9241e) {
                return ((C9241e) c9240d).f21665a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C9252b m15338A(float f) {
            this.f21733e = new C9237a(f);
            return this;
        }

        /* renamed from: B */
        public C9252b m15337B(InterfaceC9239c interfaceC9239c) {
            this.f21733e = interfaceC9239c;
            return this;
        }

        /* renamed from: C */
        public C9252b m15336C(int i, InterfaceC9239c interfaceC9239c) {
            m15335D(C9247h.m15371a(i));
            m15333F(interfaceC9239c);
            return this;
        }

        /* renamed from: D */
        public C9252b m15335D(C9240d c9240d) {
            this.f21730b = c9240d;
            float m15319n = m15319n(c9240d);
            if (m15319n != -1.0f) {
                m15334E(m15319n);
            }
            return this;
        }

        /* renamed from: E */
        public C9252b m15334E(float f) {
            this.f21734f = new C9237a(f);
            return this;
        }

        /* renamed from: F */
        public C9252b m15333F(InterfaceC9239c interfaceC9239c) {
            this.f21734f = interfaceC9239c;
            return this;
        }

        /* renamed from: m */
        public C9250k m15320m() {
            return new C9250k(this);
        }

        /* renamed from: o */
        public C9252b m15318o(float f) {
            m15338A(f);
            m15334E(f);
            m15310w(f);
            m15314s(f);
            return this;
        }

        /* renamed from: p */
        public C9252b m15317p(InterfaceC9239c interfaceC9239c) {
            m15337B(interfaceC9239c);
            m15333F(interfaceC9239c);
            m15309x(interfaceC9239c);
            m15313t(interfaceC9239c);
            return this;
        }

        /* renamed from: q */
        public C9252b m15316q(int i, InterfaceC9239c interfaceC9239c) {
            m15315r(C9247h.m15371a(i));
            m15313t(interfaceC9239c);
            return this;
        }

        /* renamed from: r */
        public C9252b m15315r(C9240d c9240d) {
            this.f21732d = c9240d;
            float m15319n = m15319n(c9240d);
            if (m15319n != -1.0f) {
                m15314s(m15319n);
            }
            return this;
        }

        /* renamed from: s */
        public C9252b m15314s(float f) {
            this.f21736h = new C9237a(f);
            return this;
        }

        /* renamed from: t */
        public C9252b m15313t(InterfaceC9239c interfaceC9239c) {
            this.f21736h = interfaceC9239c;
            return this;
        }

        /* renamed from: u */
        public C9252b m15312u(int i, InterfaceC9239c interfaceC9239c) {
            m15311v(C9247h.m15371a(i));
            m15309x(interfaceC9239c);
            return this;
        }

        /* renamed from: v */
        public C9252b m15311v(C9240d c9240d) {
            this.f21731c = c9240d;
            float m15319n = m15319n(c9240d);
            if (m15319n != -1.0f) {
                m15310w(m15319n);
            }
            return this;
        }

        /* renamed from: w */
        public C9252b m15310w(float f) {
            this.f21735g = new C9237a(f);
            return this;
        }

        /* renamed from: x */
        public C9252b m15309x(InterfaceC9239c interfaceC9239c) {
            this.f21735g = interfaceC9239c;
            return this;
        }

        /* renamed from: y */
        public C9252b m15308y(int i, InterfaceC9239c interfaceC9239c) {
            m15307z(C9247h.m15371a(i));
            m15337B(interfaceC9239c);
            return this;
        }

        /* renamed from: z */
        public C9252b m15307z(C9240d c9240d) {
            this.f21729a = c9240d;
            float m15319n = m15319n(c9240d);
            if (m15319n != -1.0f) {
                m15338A(m15319n);
            }
            return this;
        }

        public C9252b(C9250k c9250k) {
            this.f21729a = C9247h.m15370b();
            this.f21730b = C9247h.m15370b();
            this.f21731c = C9247h.m15370b();
            this.f21732d = C9247h.m15370b();
            this.f21733e = new C9237a(0.0f);
            this.f21734f = new C9237a(0.0f);
            this.f21735g = new C9237a(0.0f);
            this.f21736h = new C9237a(0.0f);
            this.f21737i = C9247h.m15369c();
            this.f21738j = C9247h.m15369c();
            this.f21739k = C9247h.m15369c();
            this.f21740l = C9247h.m15369c();
            this.f21729a = c9250k.f21717a;
            this.f21730b = c9250k.f21718b;
            this.f21731c = c9250k.f21719c;
            this.f21732d = c9250k.f21720d;
            this.f21733e = c9250k.f21721e;
            this.f21734f = c9250k.f21722f;
            this.f21735g = c9250k.f21723g;
            this.f21736h = c9250k.f21724h;
            this.f21737i = c9250k.f21725i;
            this.f21738j = c9250k.f21726j;
            this.f21739k = c9250k.f21727k;
            this.f21740l = c9250k.f21728l;
        }
    }

    public C9250k() {
        this.f21717a = C9247h.m15370b();
        this.f21718b = C9247h.m15370b();
        this.f21719c = C9247h.m15370b();
        this.f21720d = C9247h.m15370b();
        this.f21721e = new C9237a(0.0f);
        this.f21722f = new C9237a(0.0f);
        this.f21723g = new C9237a(0.0f);
        this.f21724h = new C9237a(0.0f);
        this.f21725i = C9247h.m15369c();
        this.f21726j = C9247h.m15369c();
        this.f21727k = C9247h.m15369c();
        this.f21728l = C9247h.m15369c();
    }
}
