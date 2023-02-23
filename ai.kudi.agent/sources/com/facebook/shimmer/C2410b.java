package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
/* compiled from: Shimmer.java */
/* renamed from: com.facebook.shimmer.b */
/* loaded from: classes2.dex */
public class C2410b {

    /* renamed from: a */
    final float[] f6924a = new float[4];

    /* renamed from: b */
    final int[] f6925b = new int[4];

    /* renamed from: c */
    int f6926c;

    /* renamed from: d */
    int f6927d;

    /* renamed from: e */
    int f6928e;

    /* renamed from: f */
    int f6929f;

    /* renamed from: g */
    int f6930g;

    /* renamed from: h */
    int f6931h;

    /* renamed from: i */
    float f6932i;

    /* renamed from: j */
    float f6933j;

    /* renamed from: k */
    float f6934k;

    /* renamed from: l */
    float f6935l;

    /* renamed from: m */
    float f6936m;

    /* renamed from: n */
    boolean f6937n;

    /* renamed from: o */
    boolean f6938o;

    /* renamed from: p */
    boolean f6939p;

    /* renamed from: q */
    int f6940q;

    /* renamed from: r */
    int f6941r;

    /* renamed from: s */
    long f6942s;

    /* renamed from: t */
    long f6943t;

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.b$a */
    /* loaded from: classes2.dex */
    public static class C2411a extends AbstractC2412b<C2411a> {
        public C2411a() {
            this.f6944a.f6939p = true;
        }

        @Override // com.facebook.shimmer.C2410b.AbstractC2412b
        /* renamed from: d */
        protected /* bridge */ /* synthetic */ C2411a mo32938d() {
            m32959v();
            return this;
        }

        /* renamed from: v */
        protected C2411a m32959v() {
            return this;
        }
    }

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.b$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC2412b<T extends AbstractC2412b<T>> {

        /* renamed from: a */
        final C2410b f6944a = new C2410b();

        /* renamed from: b */
        private static float m32957b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: a */
        public C2410b m32958a() {
            this.f6944a.m32962b();
            this.f6944a.m32961c();
            return this.f6944a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public T mo32939c(TypedArray typedArray) {
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_clip_to_children)) {
                m32954g(typedArray.getBoolean(C2409a.ShimmerFrameLayout_shimmer_clip_to_children, this.f6944a.f6937n));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_auto_start)) {
                m32956e(typedArray.getBoolean(C2409a.ShimmerFrameLayout_shimmer_auto_start, this.f6944a.f6938o));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_base_alpha)) {
                m32955f(typedArray.getFloat(C2409a.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_highlight_alpha)) {
                m32947n(typedArray.getFloat(C2409a.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_duration)) {
                m32951j(typedArray.getInt(C2409a.ShimmerFrameLayout_shimmer_duration, (int) this.f6944a.f6942s));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_repeat_count)) {
                m32945p(typedArray.getInt(C2409a.ShimmerFrameLayout_shimmer_repeat_count, this.f6944a.f6940q));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_repeat_delay)) {
                m32944q(typedArray.getInt(C2409a.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.f6944a.f6943t));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_repeat_mode)) {
                m32943r(typedArray.getInt(C2409a.ShimmerFrameLayout_shimmer_repeat_mode, this.f6944a.f6941r));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_direction)) {
                int i = typedArray.getInt(C2409a.ShimmerFrameLayout_shimmer_direction, this.f6944a.f6926c);
                if (i == 1) {
                    m32953h(1);
                } else if (i == 2) {
                    m32953h(2);
                } else if (i != 3) {
                    m32953h(0);
                } else {
                    m32953h(3);
                }
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_shape)) {
                if (typedArray.getInt(C2409a.ShimmerFrameLayout_shimmer_shape, this.f6944a.f6929f) != 1) {
                    m32942s(0);
                } else {
                    m32942s(1);
                }
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_dropoff)) {
                m32952i(typedArray.getFloat(C2409a.ShimmerFrameLayout_shimmer_dropoff, this.f6944a.f6935l));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_fixed_width)) {
                m32949l(typedArray.getDimensionPixelSize(C2409a.ShimmerFrameLayout_shimmer_fixed_width, this.f6944a.f6930g));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_fixed_height)) {
                m32950k(typedArray.getDimensionPixelSize(C2409a.ShimmerFrameLayout_shimmer_fixed_height, this.f6944a.f6931h));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_intensity)) {
                m32946o(typedArray.getFloat(C2409a.ShimmerFrameLayout_shimmer_intensity, this.f6944a.f6934k));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_width_ratio)) {
                m32940u(typedArray.getFloat(C2409a.ShimmerFrameLayout_shimmer_width_ratio, this.f6944a.f6932i));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_height_ratio)) {
                m32948m(typedArray.getFloat(C2409a.ShimmerFrameLayout_shimmer_height_ratio, this.f6944a.f6933j));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_tilt)) {
                m32941t(typedArray.getFloat(C2409a.ShimmerFrameLayout_shimmer_tilt, this.f6944a.f6936m));
            }
            return mo32938d();
        }

        /* renamed from: d */
        protected abstract T mo32938d();

        /* renamed from: e */
        public T m32956e(boolean z) {
            this.f6944a.f6938o = z;
            return mo32938d();
        }

        /* renamed from: f */
        public T m32955f(float f) {
            C2410b c2410b = this.f6944a;
            c2410b.f6928e = (((int) (m32957b(0.0f, 1.0f, f) * 255.0f)) << 24) | (c2410b.f6928e & 16777215);
            return mo32938d();
        }

        /* renamed from: g */
        public T m32954g(boolean z) {
            this.f6944a.f6937n = z;
            return mo32938d();
        }

        /* renamed from: h */
        public T m32953h(int i) {
            this.f6944a.f6926c = i;
            return mo32938d();
        }

        /* renamed from: i */
        public T m32952i(float f) {
            if (f >= 0.0f) {
                this.f6944a.f6935l = f;
                return mo32938d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        /* renamed from: j */
        public T m32951j(long j) {
            if (j >= 0) {
                this.f6944a.f6942s = j;
                return mo32938d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        /* renamed from: k */
        public T m32950k(int i) {
            if (i >= 0) {
                this.f6944a.f6931h = i;
                return mo32938d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        /* renamed from: l */
        public T m32949l(int i) {
            if (i >= 0) {
                this.f6944a.f6930g = i;
                return mo32938d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        /* renamed from: m */
        public T m32948m(float f) {
            if (f >= 0.0f) {
                this.f6944a.f6933j = f;
                return mo32938d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        /* renamed from: n */
        public T m32947n(float f) {
            C2410b c2410b = this.f6944a;
            c2410b.f6927d = (((int) (m32957b(0.0f, 1.0f, f) * 255.0f)) << 24) | (c2410b.f6927d & 16777215);
            return mo32938d();
        }

        /* renamed from: o */
        public T m32946o(float f) {
            if (f >= 0.0f) {
                this.f6944a.f6934k = f;
                return mo32938d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        /* renamed from: p */
        public T m32945p(int i) {
            this.f6944a.f6940q = i;
            return mo32938d();
        }

        /* renamed from: q */
        public T m32944q(long j) {
            if (j >= 0) {
                this.f6944a.f6943t = j;
                return mo32938d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        /* renamed from: r */
        public T m32943r(int i) {
            this.f6944a.f6941r = i;
            return mo32938d();
        }

        /* renamed from: s */
        public T m32942s(int i) {
            this.f6944a.f6929f = i;
            return mo32938d();
        }

        /* renamed from: t */
        public T m32941t(float f) {
            this.f6944a.f6936m = f;
            return mo32938d();
        }

        /* renamed from: u */
        public T m32940u(float f) {
            if (f >= 0.0f) {
                this.f6944a.f6932i = f;
                return mo32938d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.b$c */
    /* loaded from: classes2.dex */
    public static class C2413c extends AbstractC2412b<C2413c> {
        public C2413c() {
            this.f6944a.f6939p = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.facebook.shimmer.C2410b.AbstractC2412b
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C2413c mo32939c(TypedArray typedArray) {
            m32937v(typedArray);
            return this;
        }

        @Override // com.facebook.shimmer.C2410b.AbstractC2412b
        /* renamed from: d */
        protected /* bridge */ /* synthetic */ C2413c mo32938d() {
            m32936w();
            return this;
        }

        /* renamed from: v */
        C2413c m32937v(TypedArray typedArray) {
            super.mo32939c(typedArray);
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_base_color)) {
                m32935x(typedArray.getColor(C2409a.ShimmerFrameLayout_shimmer_base_color, this.f6944a.f6928e));
            }
            if (typedArray.hasValue(C2409a.ShimmerFrameLayout_shimmer_highlight_color)) {
                m32934y(typedArray.getColor(C2409a.ShimmerFrameLayout_shimmer_highlight_color, this.f6944a.f6927d));
            }
            m32936w();
            return this;
        }

        /* renamed from: w */
        protected C2413c m32936w() {
            return this;
        }

        /* renamed from: x */
        public C2413c m32935x(int i) {
            C2410b c2410b = this.f6944a;
            c2410b.f6928e = (i & 16777215) | (c2410b.f6928e & (-16777216));
            m32936w();
            return this;
        }

        /* renamed from: y */
        public C2413c m32934y(int i) {
            this.f6944a.f6927d = i;
            m32936w();
            return this;
        }
    }

    C2410b() {
        new RectF();
        this.f6926c = 0;
        this.f6927d = -1;
        this.f6928e = 1291845631;
        this.f6929f = 0;
        this.f6930g = 0;
        this.f6931h = 0;
        this.f6932i = 1.0f;
        this.f6933j = 1.0f;
        this.f6934k = 0.0f;
        this.f6935l = 0.5f;
        this.f6936m = 20.0f;
        this.f6937n = true;
        this.f6938o = true;
        this.f6939p = true;
        this.f6940q = -1;
        this.f6941r = 1;
        this.f6942s = 1000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m32963a(int i) {
        int i2 = this.f6931h;
        return i2 > 0 ? i2 : Math.round(this.f6933j * i);
    }

    /* renamed from: b */
    void m32962b() {
        if (this.f6929f != 1) {
            int[] iArr = this.f6925b;
            int i = this.f6928e;
            iArr[0] = i;
            int i2 = this.f6927d;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f6925b;
        int i3 = this.f6927d;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f6928e;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* renamed from: c */
    void m32961c() {
        if (this.f6929f != 1) {
            this.f6924a[0] = Math.max(((1.0f - this.f6934k) - this.f6935l) / 2.0f, 0.0f);
            this.f6924a[1] = Math.max(((1.0f - this.f6934k) - 0.001f) / 2.0f, 0.0f);
            this.f6924a[2] = Math.min(((this.f6934k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f6924a[3] = Math.min(((this.f6934k + 1.0f) + this.f6935l) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f6924a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f6934k, 1.0f);
        this.f6924a[2] = Math.min(this.f6934k + this.f6935l, 1.0f);
        this.f6924a[3] = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m32960d(int i) {
        int i2 = this.f6930g;
        return i2 > 0 ? i2 : Math.round(this.f6932i * i);
    }
}
