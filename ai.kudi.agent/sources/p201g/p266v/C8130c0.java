package p201g.p266v;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* renamed from: g.v.c0 */
/* loaded from: classes2.dex */
public class C8130c0 {

    /* renamed from: a */
    private static final C8150i0 f19513a;

    /* renamed from: b */
    static final Property<View, Float> f19514b;

    /* compiled from: ViewUtils.java */
    /* renamed from: g.v.c0$a */
    /* loaded from: classes2.dex */
    static class C8131a extends Property<View, Float> {
        C8131a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C8130c0.m16711c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C8130c0.m16707g(view, f.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: g.v.c0$b */
    /* loaded from: classes2.dex */
    static class C8132b extends Property<View, Rect> {
        C8132b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return C7759x.m17489u(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            C7759x.m17486v0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f19513a = new C8148h0();
        } else if (i >= 23) {
            f19513a = new C8146g0();
        } else if (i >= 22) {
            f19513a = new C8144f0();
        } else if (i >= 21) {
            f19513a = new C8142e0();
        } else if (i >= 19) {
            f19513a = new C8136d0();
        } else {
            f19513a = new C8150i0();
        }
        f19514b = new C8131a(Float.class, "translationAlpha");
        new C8132b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m16713a(View view) {
        f19513a.mo16677a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC8117b0 m16712b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C8115a0(view);
        }
        return C8185z.m16562e(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m16711c(View view) {
        return f19513a.mo16675c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static InterfaceC8167m0 m16710d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C8159l0(view);
        }
        return new C8157k0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m16709e(View view) {
        f19513a.mo16674d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m16708f(View view, int i, int i2, int i3, int i4) {
        f19513a.mo16673e(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m16707g(View view, float f) {
        f19513a.mo16672f(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m16706h(View view, int i) {
        f19513a.mo16671g(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m16705i(View view, Matrix matrix) {
        f19513a.mo16670h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m16704j(View view, Matrix matrix) {
        f19513a.mo16669i(view, matrix);
    }
}
