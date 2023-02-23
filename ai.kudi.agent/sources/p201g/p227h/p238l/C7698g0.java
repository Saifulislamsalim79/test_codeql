package p201g.p227h.p238l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p201g.p227h.p228e.C7604b;
import p201g.p227h.p237k.C7670c;
import p201g.p227h.p237k.C7675h;
/* compiled from: WindowInsetsCompat.java */
/* renamed from: g.h.l.g0 */
/* loaded from: classes2.dex */
public class C7698g0 {

    /* renamed from: b */
    public static final C7698g0 f18433b;

    /* renamed from: a */
    private final C7710l f18434a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$a */
    /* loaded from: classes2.dex */
    public static class C7699a {

        /* renamed from: a */
        private static Field f18435a;

        /* renamed from: b */
        private static Field f18436b;

        /* renamed from: c */
        private static Field f18437c;

        /* renamed from: d */
        private static boolean f18438d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f18435a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f18436b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f18437c = declaredField3;
                declaredField3.setAccessible(true);
                f18438d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C7698g0 m17769a(View view) {
            if (f18438d && view.isAttachedToWindow()) {
                try {
                    Object obj = f18435a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f18436b.get(obj);
                        Rect rect2 = (Rect) f18437c.get(obj);
                        if (rect != null && rect2 != null) {
                            C7700b c7700b = new C7700b();
                            c7700b.m17767b(C7604b.m18063c(rect));
                            c7700b.m17766c(C7604b.m18063c(rect2));
                            C7698g0 m17768a = c7700b.m17768a();
                            m17768a.m17774t(m17768a);
                            m17768a.m17790d(view.getRootView());
                            return m17768a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$e */
    /* loaded from: classes2.dex */
    private static class C7703e extends C7702d {
        C7703e() {
        }

        C7703e(C7698g0 c7698g0) {
            super(c7698g0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$f */
    /* loaded from: classes2.dex */
    public static class C7704f {

        /* renamed from: a */
        private final C7698g0 f18447a;

        /* renamed from: b */
        C7604b[] f18448b;

        C7704f() {
            this(new C7698g0((C7698g0) null));
        }

        /* renamed from: a */
        protected final void m17764a() {
            C7604b[] c7604bArr = this.f18448b;
            if (c7604bArr != null) {
                C7604b c7604b = c7604bArr[C7711m.m17733a(1)];
                C7604b c7604b2 = this.f18448b[C7711m.m17733a(2)];
                if (c7604b2 == null) {
                    c7604b2 = this.f18447a.m17788f(2);
                }
                if (c7604b == null) {
                    c7604b = this.f18447a.m17788f(1);
                }
                mo17759f(C7604b.m18065a(c7604b, c7604b2));
                C7604b c7604b3 = this.f18448b[C7711m.m17733a(16)];
                if (c7604b3 != null) {
                    mo17760e(c7604b3);
                }
                C7604b c7604b4 = this.f18448b[C7711m.m17733a(32)];
                if (c7604b4 != null) {
                    mo17762c(c7604b4);
                }
                C7604b c7604b5 = this.f18448b[C7711m.m17733a(64)];
                if (c7604b5 != null) {
                    mo17758g(c7604b5);
                }
            }
        }

        /* renamed from: b */
        C7698g0 mo17763b() {
            m17764a();
            return this.f18447a;
        }

        /* renamed from: c */
        void mo17762c(C7604b c7604b) {
        }

        /* renamed from: d */
        void mo17761d(C7604b c7604b) {
        }

        /* renamed from: e */
        void mo17760e(C7604b c7604b) {
        }

        /* renamed from: f */
        void mo17759f(C7604b c7604b) {
        }

        /* renamed from: g */
        void mo17758g(C7604b c7604b) {
        }

        C7704f(C7698g0 c7698g0) {
            this.f18447a = c7698g0;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$i */
    /* loaded from: classes2.dex */
    private static class C7707i extends C7706h {
        C7707i(C7698g0 c7698g0, WindowInsets windowInsets) {
            super(c7698g0, windowInsets);
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: a */
        C7698g0 mo17752a() {
            return C7698g0.m17771w(this.f18455c.consumeDisplayCutout());
        }

        @Override // p201g.p227h.p238l.C7698g0.C7705g, p201g.p227h.p238l.C7698g0.C7710l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7707i) {
                C7707i c7707i = (C7707i) obj;
                return Objects.equals(this.f18455c, c7707i.f18455c) && Objects.equals(this.f18459g, c7707i.f18459g);
            }
            return false;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: f */
        C7691d mo17747f() {
            return C7691d.m17808e(this.f18455c.getDisplayCutout());
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        public int hashCode() {
            return this.f18455c.hashCode();
        }

        C7707i(C7698g0 c7698g0, C7707i c7707i) {
            super(c7698g0, c7707i);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$k */
    /* loaded from: classes2.dex */
    private static class C7709k extends C7708j {

        /* renamed from: r */
        static final C7698g0 f18464r = C7698g0.m17771w(WindowInsets.CONSUMED);

        C7709k(C7698g0 c7698g0, WindowInsets windowInsets) {
            super(c7698g0, windowInsets);
        }

        @Override // p201g.p227h.p238l.C7698g0.C7705g, p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: d */
        final void mo17749d(View view) {
        }

        @Override // p201g.p227h.p238l.C7698g0.C7705g, p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: g */
        public C7604b mo17746g(int i) {
            return C7604b.m18062d(this.f18455c.getInsets(C7712n.m17732a(i)));
        }

        C7709k(C7698g0 c7698g0, C7709k c7709k) {
            super(c7698g0, c7709k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$l */
    /* loaded from: classes2.dex */
    public static class C7710l {

        /* renamed from: b */
        static final C7698g0 f18465b = new C7700b().m17768a().m17793a().m17792b().m17791c();

        /* renamed from: a */
        final C7698g0 f18466a;

        C7710l(C7698g0 c7698g0) {
            this.f18466a = c7698g0;
        }

        /* renamed from: a */
        C7698g0 mo17752a() {
            return this.f18466a;
        }

        /* renamed from: b */
        C7698g0 mo17751b() {
            return this.f18466a;
        }

        /* renamed from: c */
        C7698g0 mo17750c() {
            return this.f18466a;
        }

        /* renamed from: d */
        void mo17749d(View view) {
        }

        /* renamed from: e */
        void mo17748e(C7698g0 c7698g0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7710l) {
                C7710l c7710l = (C7710l) obj;
                return mo17738o() == c7710l.mo17738o() && mo17739n() == c7710l.mo17739n() && C7670c.m17875a(mo17742k(), c7710l.mo17742k()) && C7670c.m17875a(mo17744i(), c7710l.mo17744i()) && C7670c.m17875a(mo17747f(), c7710l.mo17747f());
            }
            return false;
        }

        /* renamed from: f */
        C7691d mo17747f() {
            return null;
        }

        /* renamed from: g */
        C7604b mo17746g(int i) {
            return C7604b.f18272e;
        }

        /* renamed from: h */
        C7604b mo17745h() {
            return mo17742k();
        }

        public int hashCode() {
            return C7670c.m17874b(Boolean.valueOf(mo17738o()), Boolean.valueOf(mo17739n()), mo17742k(), mo17744i(), mo17747f());
        }

        /* renamed from: i */
        C7604b mo17744i() {
            return C7604b.f18272e;
        }

        /* renamed from: j */
        C7604b mo17743j() {
            return mo17742k();
        }

        /* renamed from: k */
        C7604b mo17742k() {
            return C7604b.f18272e;
        }

        /* renamed from: l */
        C7604b mo17741l() {
            return mo17742k();
        }

        /* renamed from: m */
        C7698g0 mo17740m(int i, int i2, int i3, int i4) {
            return f18465b;
        }

        /* renamed from: n */
        boolean mo17739n() {
            return false;
        }

        /* renamed from: o */
        boolean mo17738o() {
            return false;
        }

        /* renamed from: p */
        public void mo17737p(C7604b[] c7604bArr) {
        }

        /* renamed from: q */
        void mo17736q(C7604b c7604b) {
        }

        /* renamed from: r */
        void mo17735r(C7698g0 c7698g0) {
        }

        /* renamed from: s */
        public void mo17734s(C7604b c7604b) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$m */
    /* loaded from: classes2.dex */
    public static final class C7711m {
        /* renamed from: a */
        static int m17733a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$n */
    /* loaded from: classes2.dex */
    private static final class C7712n {
        /* renamed from: a */
        static int m17732a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f18433b = C7709k.f18464r;
        } else {
            f18433b = C7710l.f18465b;
        }
    }

    private C7698g0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f18434a = new C7709k(this, windowInsets);
        } else if (i >= 29) {
            this.f18434a = new C7708j(this, windowInsets);
        } else if (i >= 28) {
            this.f18434a = new C7707i(this, windowInsets);
        } else if (i >= 21) {
            this.f18434a = new C7706h(this, windowInsets);
        } else if (i >= 20) {
            this.f18434a = new C7705g(this, windowInsets);
        } else {
            this.f18434a = new C7710l(this);
        }
    }

    /* renamed from: o */
    static C7604b m17779o(C7604b c7604b, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c7604b.f18273a - i);
        int max2 = Math.max(0, c7604b.f18274b - i2);
        int max3 = Math.max(0, c7604b.f18275c - i3);
        int max4 = Math.max(0, c7604b.f18276d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c7604b : C7604b.m18064b(max, max2, max3, max4);
    }

    /* renamed from: w */
    public static C7698g0 m17771w(WindowInsets windowInsets) {
        return m17770x(windowInsets, null);
    }

    /* renamed from: x */
    public static C7698g0 m17770x(WindowInsets windowInsets, View view) {
        C7675h.m17866f(windowInsets);
        C7698g0 c7698g0 = new C7698g0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c7698g0.m17774t(C7759x.m17547K(view));
            c7698g0.m17790d(view.getRootView());
        }
        return c7698g0;
    }

    @Deprecated
    /* renamed from: a */
    public C7698g0 m17793a() {
        return this.f18434a.mo17752a();
    }

    @Deprecated
    /* renamed from: b */
    public C7698g0 m17792b() {
        return this.f18434a.mo17751b();
    }

    @Deprecated
    /* renamed from: c */
    public C7698g0 m17791c() {
        return this.f18434a.mo17750c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m17790d(View view) {
        this.f18434a.mo17749d(view);
    }

    /* renamed from: e */
    public C7691d m17789e() {
        return this.f18434a.mo17747f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7698g0) {
            return C7670c.m17875a(this.f18434a, ((C7698g0) obj).f18434a);
        }
        return false;
    }

    /* renamed from: f */
    public C7604b m17788f(int i) {
        return this.f18434a.mo17746g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C7604b m17787g() {
        return this.f18434a.mo17745h();
    }

    @Deprecated
    /* renamed from: h */
    public C7604b m17786h() {
        return this.f18434a.mo17744i();
    }

    public int hashCode() {
        C7710l c7710l = this.f18434a;
        if (c7710l == null) {
            return 0;
        }
        return c7710l.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m17785i() {
        return this.f18434a.mo17742k().f18276d;
    }

    @Deprecated
    /* renamed from: j */
    public int m17784j() {
        return this.f18434a.mo17742k().f18273a;
    }

    @Deprecated
    /* renamed from: k */
    public int m17783k() {
        return this.f18434a.mo17742k().f18275c;
    }

    @Deprecated
    /* renamed from: l */
    public int m17782l() {
        return this.f18434a.mo17742k().f18274b;
    }

    @Deprecated
    /* renamed from: m */
    public boolean m17781m() {
        return !this.f18434a.mo17742k().equals(C7604b.f18272e);
    }

    /* renamed from: n */
    public C7698g0 m17780n(int i, int i2, int i3, int i4) {
        return this.f18434a.mo17740m(i, i2, i3, i4);
    }

    /* renamed from: p */
    public boolean m17778p() {
        return this.f18434a.mo17739n();
    }

    @Deprecated
    /* renamed from: q */
    public C7698g0 m17777q(int i, int i2, int i3, int i4) {
        C7700b c7700b = new C7700b(this);
        c7700b.m17766c(C7604b.m18064b(i, i2, i3, i4));
        return c7700b.m17768a();
    }

    /* renamed from: r */
    void m17776r(C7604b[] c7604bArr) {
        this.f18434a.mo17737p(c7604bArr);
    }

    /* renamed from: s */
    void m17775s(C7604b c7604b) {
        this.f18434a.mo17736q(c7604b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m17774t(C7698g0 c7698g0) {
        this.f18434a.mo17735r(c7698g0);
    }

    /* renamed from: u */
    void m17773u(C7604b c7604b) {
        this.f18434a.mo17734s(c7604b);
    }

    /* renamed from: v */
    public WindowInsets m17772v() {
        C7710l c7710l = this.f18434a;
        if (c7710l instanceof C7705g) {
            return ((C7705g) c7710l).f18455c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$c */
    /* loaded from: classes2.dex */
    private static class C7701c extends C7704f {

        /* renamed from: e */
        private static Field f18440e = null;

        /* renamed from: f */
        private static boolean f18441f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f18442g = null;

        /* renamed from: h */
        private static boolean f18443h = false;

        /* renamed from: c */
        private WindowInsets f18444c;

        /* renamed from: d */
        private C7604b f18445d;

        C7701c() {
            this.f18444c = m17765h();
        }

        /* renamed from: h */
        private static WindowInsets m17765h() {
            if (!f18441f) {
                try {
                    f18440e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f18441f = true;
            }
            Field field = f18440e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f18443h) {
                try {
                    f18442g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f18443h = true;
            }
            Constructor<WindowInsets> constructor = f18442g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: b */
        C7698g0 mo17763b() {
            m17764a();
            C7698g0 m17771w = C7698g0.m17771w(this.f18444c);
            m17771w.m17776r(this.f18448b);
            m17771w.m17773u(this.f18445d);
            return m17771w;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: d */
        void mo17761d(C7604b c7604b) {
            this.f18445d = c7604b;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: f */
        void mo17759f(C7604b c7604b) {
            WindowInsets windowInsets = this.f18444c;
            if (windowInsets != null) {
                this.f18444c = windowInsets.replaceSystemWindowInsets(c7604b.f18273a, c7604b.f18274b, c7604b.f18275c, c7604b.f18276d);
            }
        }

        C7701c(C7698g0 c7698g0) {
            super(c7698g0);
            this.f18444c = c7698g0.m17772v();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$d */
    /* loaded from: classes2.dex */
    private static class C7702d extends C7704f {

        /* renamed from: c */
        final WindowInsets.Builder f18446c;

        C7702d() {
            this.f18446c = new WindowInsets.Builder();
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: b */
        C7698g0 mo17763b() {
            m17764a();
            C7698g0 m17771w = C7698g0.m17771w(this.f18446c.build());
            m17771w.m17776r(this.f18448b);
            return m17771w;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: c */
        void mo17762c(C7604b c7604b) {
            this.f18446c.setMandatorySystemGestureInsets(c7604b.m18061e());
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: d */
        void mo17761d(C7604b c7604b) {
            this.f18446c.setStableInsets(c7604b.m18061e());
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: e */
        void mo17760e(C7604b c7604b) {
            this.f18446c.setSystemGestureInsets(c7604b.m18061e());
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: f */
        void mo17759f(C7604b c7604b) {
            this.f18446c.setSystemWindowInsets(c7604b.m18061e());
        }

        @Override // p201g.p227h.p238l.C7698g0.C7704f
        /* renamed from: g */
        void mo17758g(C7604b c7604b) {
            this.f18446c.setTappableElementInsets(c7604b.m18061e());
        }

        C7702d(C7698g0 c7698g0) {
            super(c7698g0);
            WindowInsets.Builder builder;
            WindowInsets m17772v = c7698g0.m17772v();
            if (m17772v != null) {
                builder = new WindowInsets.Builder(m17772v);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f18446c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$h */
    /* loaded from: classes2.dex */
    private static class C7706h extends C7705g {

        /* renamed from: n */
        private C7604b f18460n;

        C7706h(C7698g0 c7698g0, WindowInsets windowInsets) {
            super(c7698g0, windowInsets);
            this.f18460n = null;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: b */
        C7698g0 mo17751b() {
            return C7698g0.m17771w(this.f18455c.consumeStableInsets());
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: c */
        C7698g0 mo17750c() {
            return C7698g0.m17771w(this.f18455c.consumeSystemWindowInsets());
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: i */
        final C7604b mo17744i() {
            if (this.f18460n == null) {
                this.f18460n = C7604b.m18064b(this.f18455c.getStableInsetLeft(), this.f18455c.getStableInsetTop(), this.f18455c.getStableInsetRight(), this.f18455c.getStableInsetBottom());
            }
            return this.f18460n;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: n */
        boolean mo17739n() {
            return this.f18455c.isConsumed();
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: s */
        public void mo17734s(C7604b c7604b) {
            this.f18460n = c7604b;
        }

        C7706h(C7698g0 c7698g0, C7706h c7706h) {
            super(c7698g0, c7706h);
            this.f18460n = null;
            this.f18460n = c7706h.f18460n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$g */
    /* loaded from: classes2.dex */
    public static class C7705g extends C7710l {

        /* renamed from: h */
        private static boolean f18449h = false;

        /* renamed from: i */
        private static Method f18450i;

        /* renamed from: j */
        private static Class<?> f18451j;

        /* renamed from: k */
        private static Class<?> f18452k;

        /* renamed from: l */
        private static Field f18453l;

        /* renamed from: m */
        private static Field f18454m;

        /* renamed from: c */
        final WindowInsets f18455c;

        /* renamed from: d */
        private C7604b[] f18456d;

        /* renamed from: e */
        private C7604b f18457e;

        /* renamed from: f */
        private C7698g0 f18458f;

        /* renamed from: g */
        C7604b f18459g;

        C7705g(C7698g0 c7698g0, WindowInsets windowInsets) {
            super(c7698g0);
            this.f18457e = null;
            this.f18455c = windowInsets;
        }

        /* renamed from: t */
        private C7604b m17757t(int i, boolean z) {
            C7604b c7604b = C7604b.f18272e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    c7604b = C7604b.m18065a(c7604b, m17756u(i2, z));
                }
            }
            return c7604b;
        }

        /* renamed from: v */
        private C7604b m17755v() {
            C7698g0 c7698g0 = this.f18458f;
            if (c7698g0 != null) {
                return c7698g0.m17786h();
            }
            return C7604b.f18272e;
        }

        /* renamed from: w */
        private C7604b m17754w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f18449h) {
                    m17753x();
                }
                Method method = f18450i;
                if (method != null && f18452k != null && f18453l != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f18453l.get(f18454m.get(invoke));
                        if (rect != null) {
                            return C7604b.m18063c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* renamed from: x */
        private static void m17753x() {
            try {
                f18450i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f18451j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f18452k = cls;
                f18453l = cls.getDeclaredField("mVisibleInsets");
                f18454m = f18451j.getDeclaredField("mAttachInfo");
                f18453l.setAccessible(true);
                f18454m.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f18449h = true;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: d */
        void mo17749d(View view) {
            C7604b m17754w = m17754w(view);
            if (m17754w == null) {
                m17754w = C7604b.f18272e;
            }
            mo17736q(m17754w);
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: e */
        void mo17748e(C7698g0 c7698g0) {
            c7698g0.m17774t(this.f18458f);
            c7698g0.m17775s(this.f18459g);
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f18459g, ((C7705g) obj).f18459g);
            }
            return false;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: g */
        public C7604b mo17746g(int i) {
            return m17757t(i, false);
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: k */
        final C7604b mo17742k() {
            if (this.f18457e == null) {
                this.f18457e = C7604b.m18064b(this.f18455c.getSystemWindowInsetLeft(), this.f18455c.getSystemWindowInsetTop(), this.f18455c.getSystemWindowInsetRight(), this.f18455c.getSystemWindowInsetBottom());
            }
            return this.f18457e;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: m */
        C7698g0 mo17740m(int i, int i2, int i3, int i4) {
            C7700b c7700b = new C7700b(C7698g0.m17771w(this.f18455c));
            c7700b.m17766c(C7698g0.m17779o(mo17742k(), i, i2, i3, i4));
            c7700b.m17767b(C7698g0.m17779o(mo17744i(), i, i2, i3, i4));
            return c7700b.m17768a();
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: o */
        boolean mo17738o() {
            return this.f18455c.isRound();
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: p */
        public void mo17737p(C7604b[] c7604bArr) {
            this.f18456d = c7604bArr;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: q */
        void mo17736q(C7604b c7604b) {
            this.f18459g = c7604b;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: r */
        void mo17735r(C7698g0 c7698g0) {
            this.f18458f = c7698g0;
        }

        /* renamed from: u */
        protected C7604b m17756u(int i, boolean z) {
            C7604b m17786h;
            int i2;
            C7691d mo17747f;
            if (i == 1) {
                if (z) {
                    return C7604b.m18064b(0, Math.max(m17755v().f18274b, mo17742k().f18274b), 0, 0);
                }
                return C7604b.m18064b(0, mo17742k().f18274b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    C7604b m17755v = m17755v();
                    C7604b mo17744i = mo17744i();
                    return C7604b.m18064b(Math.max(m17755v.f18273a, mo17744i.f18273a), 0, Math.max(m17755v.f18275c, mo17744i.f18275c), Math.max(m17755v.f18276d, mo17744i.f18276d));
                }
                C7604b mo17742k = mo17742k();
                C7698g0 c7698g0 = this.f18458f;
                m17786h = c7698g0 != null ? c7698g0.m17786h() : null;
                int i3 = mo17742k.f18276d;
                if (m17786h != null) {
                    i3 = Math.min(i3, m17786h.f18276d);
                }
                return C7604b.m18064b(mo17742k.f18273a, 0, mo17742k.f18275c, i3);
            } else if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                return C7604b.f18272e;
                            }
                            C7698g0 c7698g02 = this.f18458f;
                            if (c7698g02 != null) {
                                mo17747f = c7698g02.m17789e();
                            } else {
                                mo17747f = mo17747f();
                            }
                            if (mo17747f != null) {
                                return C7604b.m18064b(mo17747f.m17811b(), mo17747f.m17809d(), mo17747f.m17810c(), mo17747f.m17812a());
                            }
                            return C7604b.f18272e;
                        }
                        return mo17741l();
                    }
                    return mo17745h();
                }
                return mo17743j();
            } else {
                C7604b[] c7604bArr = this.f18456d;
                m17786h = c7604bArr != null ? c7604bArr[C7711m.m17733a(8)] : null;
                if (m17786h != null) {
                    return m17786h;
                }
                C7604b mo17742k2 = mo17742k();
                C7604b m17755v2 = m17755v();
                int i4 = mo17742k2.f18276d;
                if (i4 > m17755v2.f18276d) {
                    return C7604b.m18064b(0, 0, 0, i4);
                }
                C7604b c7604b = this.f18459g;
                if (c7604b != null && !c7604b.equals(C7604b.f18272e) && (i2 = this.f18459g.f18276d) > m17755v2.f18276d) {
                    return C7604b.m18064b(0, 0, 0, i2);
                }
                return C7604b.f18272e;
            }
        }

        C7705g(C7698g0 c7698g0, C7705g c7705g) {
            this(c7698g0, new WindowInsets(c7705g.f18455c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$j */
    /* loaded from: classes2.dex */
    private static class C7708j extends C7707i {

        /* renamed from: o */
        private C7604b f18461o;

        /* renamed from: p */
        private C7604b f18462p;

        /* renamed from: q */
        private C7604b f18463q;

        C7708j(C7698g0 c7698g0, WindowInsets windowInsets) {
            super(c7698g0, windowInsets);
            this.f18461o = null;
            this.f18462p = null;
            this.f18463q = null;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: h */
        C7604b mo17745h() {
            if (this.f18462p == null) {
                this.f18462p = C7604b.m18062d(this.f18455c.getMandatorySystemGestureInsets());
            }
            return this.f18462p;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: j */
        C7604b mo17743j() {
            if (this.f18461o == null) {
                this.f18461o = C7604b.m18062d(this.f18455c.getSystemGestureInsets());
            }
            return this.f18461o;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: l */
        C7604b mo17741l() {
            if (this.f18463q == null) {
                this.f18463q = C7604b.m18062d(this.f18455c.getTappableElementInsets());
            }
            return this.f18463q;
        }

        @Override // p201g.p227h.p238l.C7698g0.C7705g, p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: m */
        C7698g0 mo17740m(int i, int i2, int i3, int i4) {
            return C7698g0.m17771w(this.f18455c.inset(i, i2, i3, i4));
        }

        @Override // p201g.p227h.p238l.C7698g0.C7706h, p201g.p227h.p238l.C7698g0.C7710l
        /* renamed from: s */
        public void mo17734s(C7604b c7604b) {
        }

        C7708j(C7698g0 c7698g0, C7708j c7708j) {
            super(c7698g0, c7708j);
            this.f18461o = null;
            this.f18462p = null;
            this.f18463q = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: g.h.l.g0$b */
    /* loaded from: classes2.dex */
    public static final class C7700b {

        /* renamed from: a */
        private final C7704f f18439a;

        public C7700b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f18439a = new C7703e();
            } else if (i >= 29) {
                this.f18439a = new C7702d();
            } else if (i >= 20) {
                this.f18439a = new C7701c();
            } else {
                this.f18439a = new C7704f();
            }
        }

        /* renamed from: a */
        public C7698g0 m17768a() {
            return this.f18439a.mo17763b();
        }

        @Deprecated
        /* renamed from: b */
        public C7700b m17767b(C7604b c7604b) {
            this.f18439a.mo17761d(c7604b);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C7700b m17766c(C7604b c7604b) {
            this.f18439a.mo17759f(c7604b);
            return this;
        }

        public C7700b(C7698g0 c7698g0) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f18439a = new C7703e(c7698g0);
            } else if (i >= 29) {
                this.f18439a = new C7702d(c7698g0);
            } else if (i >= 20) {
                this.f18439a = new C7701c(c7698g0);
            } else {
                this.f18439a = new C7704f(c7698g0);
            }
        }
    }

    public C7698g0(C7698g0 c7698g0) {
        if (c7698g0 != null) {
            C7710l c7710l = c7698g0.f18434a;
            if (Build.VERSION.SDK_INT >= 30 && (c7710l instanceof C7709k)) {
                this.f18434a = new C7709k(this, (C7709k) c7710l);
            } else if (Build.VERSION.SDK_INT >= 29 && (c7710l instanceof C7708j)) {
                this.f18434a = new C7708j(this, (C7708j) c7710l);
            } else if (Build.VERSION.SDK_INT >= 28 && (c7710l instanceof C7707i)) {
                this.f18434a = new C7707i(this, (C7707i) c7710l);
            } else if (Build.VERSION.SDK_INT >= 21 && (c7710l instanceof C7706h)) {
                this.f18434a = new C7706h(this, (C7706h) c7710l);
            } else if (Build.VERSION.SDK_INT >= 20 && (c7710l instanceof C7705g)) {
                this.f18434a = new C7705g(this, (C7705g) c7710l);
            } else {
                this.f18434a = new C7710l(this);
            }
            c7710l.mo17748e(this);
            return;
        }
        this.f18434a = new C7710l(this);
    }
}
