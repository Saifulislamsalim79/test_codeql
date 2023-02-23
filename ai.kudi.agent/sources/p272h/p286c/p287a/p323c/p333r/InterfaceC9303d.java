package p272h.p286c.p287a.p323c.p333r;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p272h.p286c.p287a.p323c.p340x.C9316a;
/* compiled from: CircularRevealWidget.java */
/* renamed from: h.c.a.c.r.d */
/* loaded from: classes2.dex */
public interface InterfaceC9303d {

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: h.c.a.c.r.d$b */
    /* loaded from: classes2.dex */
    public static class C9305b implements TypeEvaluator<C9308e> {

        /* renamed from: b */
        public static final TypeEvaluator<C9308e> f21878b = new C9305b();

        /* renamed from: a */
        private final C9308e f21879a = new C9308e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C9308e evaluate(float f, C9308e c9308e, C9308e c9308e2) {
            this.f21879a.m15087a(C9316a.m15062c(c9308e.f21882a, c9308e2.f21882a, f), C9316a.m15062c(c9308e.f21883b, c9308e2.f21883b, f), C9316a.m15062c(c9308e.f21884c, c9308e2.f21884c, f));
            return this.f21879a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: h.c.a.c.r.d$c */
    /* loaded from: classes2.dex */
    public static class C9306c extends Property<InterfaceC9303d, C9308e> {

        /* renamed from: a */
        public static final Property<InterfaceC9303d, C9308e> f21880a = new C9306c("circularReveal");

        private C9306c(String str) {
            super(C9308e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public C9308e get(InterfaceC9303d interfaceC9303d) {
            return interfaceC9303d.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC9303d interfaceC9303d, C9308e c9308e) {
            interfaceC9303d.setRevealInfo(c9308e);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: h.c.a.c.r.d$d */
    /* loaded from: classes2.dex */
    public static class C9307d extends Property<InterfaceC9303d, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC9303d, Integer> f21881a = new C9307d("circularRevealScrimColor");

        private C9307d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(InterfaceC9303d interfaceC9303d) {
            return Integer.valueOf(interfaceC9303d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC9303d interfaceC9303d, Integer num) {
            interfaceC9303d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: h.c.a.c.r.d$e */
    /* loaded from: classes2.dex */
    public static class C9308e {

        /* renamed from: a */
        public float f21882a;

        /* renamed from: b */
        public float f21883b;

        /* renamed from: c */
        public float f21884c;

        /* renamed from: a */
        public void m15087a(float f, float f2, float f3) {
            this.f21882a = f;
            this.f21883b = f2;
            this.f21884c = f3;
        }

        private C9308e() {
        }

        public C9308e(float f, float f2, float f3) {
            this.f21882a = f;
            this.f21883b = f2;
            this.f21884c = f3;
        }
    }

    /* renamed from: a */
    void mo15086a();

    /* renamed from: b */
    void mo15085b();

    int getCircularRevealScrimColor();

    C9308e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C9308e c9308e);
}
