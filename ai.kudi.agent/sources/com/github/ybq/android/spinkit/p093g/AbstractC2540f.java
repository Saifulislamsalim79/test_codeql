package com.github.ybq.android.spinkit.p093g;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.github.ybq.android.spinkit.p091f.AbstractC2523b;
import com.github.ybq.android.spinkit.p091f.AbstractC2524c;
import com.github.ybq.android.spinkit.p091f.C2522a;
/* compiled from: Sprite.java */
/* renamed from: com.github.ybq.android.spinkit.g.f */
/* loaded from: classes2.dex */
public abstract class AbstractC2540f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {

    /* renamed from: K */
    private static final Rect f7177K = new Rect();

    /* renamed from: L */
    public static final Property<AbstractC2540f, Integer> f7178L = new C2543c("rotateX");

    /* renamed from: M */
    public static final Property<AbstractC2540f, Integer> f7179M = new C2544d("rotate");

    /* renamed from: N */
    public static final Property<AbstractC2540f, Integer> f7180N = new C2545e("rotateY");

    /* renamed from: O */
    public static final Property<AbstractC2540f, Float> f7181O;

    /* renamed from: P */
    public static final Property<AbstractC2540f, Float> f7182P;

    /* renamed from: Q */
    public static final Property<AbstractC2540f, Float> f7183Q;

    /* renamed from: R */
    public static final Property<AbstractC2540f, Float> f7184R;

    /* renamed from: S */
    public static final Property<AbstractC2540f, Integer> f7185S;

    /* renamed from: A */
    private int f7186A;

    /* renamed from: B */
    private int f7187B;

    /* renamed from: C */
    private int f7188C;

    /* renamed from: D */
    private float f7189D;

    /* renamed from: E */
    private float f7190E;

    /* renamed from: F */
    private ValueAnimator f7191F;

    /* renamed from: f */
    private float f7199f;

    /* renamed from: w */
    private float f7200w;

    /* renamed from: x */
    private int f7201x;

    /* renamed from: y */
    private int f7202y;

    /* renamed from: z */
    private int f7203z;

    /* renamed from: c */
    private float f7196c = 1.0f;

    /* renamed from: d */
    private float f7197d = 1.0f;

    /* renamed from: e */
    private float f7198e = 1.0f;

    /* renamed from: G */
    private int f7192G = 255;

    /* renamed from: H */
    protected Rect f7193H = f7177K;

    /* renamed from: I */
    private Camera f7194I = new Camera();

    /* renamed from: J */
    private Matrix f7195J = new Matrix();

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$a */
    /* loaded from: classes2.dex */
    static class C2541a extends AbstractC2523b<AbstractC2540f> {
        C2541a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(AbstractC2540f abstractC2540f) {
            return Float.valueOf(abstractC2540f.m32640j());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2523b
        /* renamed from: d */
        public void mo32604b(AbstractC2540f abstractC2540f, float f) {
            abstractC2540f.m32654C(f);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$b */
    /* loaded from: classes2.dex */
    static class C2542b extends AbstractC2524c<AbstractC2540f> {
        C2542b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(AbstractC2540f abstractC2540f) {
            return Integer.valueOf(abstractC2540f.getAlpha());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2524c
        /* renamed from: d */
        public void mo32613b(AbstractC2540f abstractC2540f, int i) {
            abstractC2540f.setAlpha(i);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$c */
    /* loaded from: classes2.dex */
    static class C2543c extends AbstractC2524c<AbstractC2540f> {
        C2543c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(AbstractC2540f abstractC2540f) {
            return Integer.valueOf(abstractC2540f.m32642h());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2524c
        /* renamed from: d */
        public void mo32613b(AbstractC2540f abstractC2540f, int i) {
            abstractC2540f.m32656A(i);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$d */
    /* loaded from: classes2.dex */
    static class C2544d extends AbstractC2524c<AbstractC2540f> {
        C2544d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(AbstractC2540f abstractC2540f) {
            return Integer.valueOf(abstractC2540f.m32643g());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2524c
        /* renamed from: d */
        public void mo32613b(AbstractC2540f abstractC2540f, int i) {
            abstractC2540f.m32626z(i);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$e */
    /* loaded from: classes2.dex */
    static class C2545e extends AbstractC2524c<AbstractC2540f> {
        C2545e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(AbstractC2540f abstractC2540f) {
            return Integer.valueOf(abstractC2540f.m32641i());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2524c
        /* renamed from: d */
        public void mo32613b(AbstractC2540f abstractC2540f, int i) {
            abstractC2540f.m32655B(i);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$f */
    /* loaded from: classes2.dex */
    static class C2546f extends AbstractC2524c<AbstractC2540f> {
        C2546f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(AbstractC2540f abstractC2540f) {
            return Integer.valueOf(abstractC2540f.m32637m());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2524c
        /* renamed from: d */
        public void mo32613b(AbstractC2540f abstractC2540f, int i) {
            abstractC2540f.m32651F(i);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$g */
    /* loaded from: classes2.dex */
    static class C2547g extends AbstractC2524c<AbstractC2540f> {
        C2547g(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(AbstractC2540f abstractC2540f) {
            return Integer.valueOf(abstractC2540f.m32635o());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2524c
        /* renamed from: d */
        public void mo32613b(AbstractC2540f abstractC2540f, int i) {
            abstractC2540f.m32649H(i);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$h */
    /* loaded from: classes2.dex */
    static class C2548h extends AbstractC2523b<AbstractC2540f> {
        C2548h(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(AbstractC2540f abstractC2540f) {
            return Float.valueOf(abstractC2540f.m32636n());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2523b
        /* renamed from: d */
        public void mo32604b(AbstractC2540f abstractC2540f, float f) {
            abstractC2540f.m32650G(f);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$i */
    /* loaded from: classes2.dex */
    static class C2549i extends AbstractC2523b<AbstractC2540f> {
        C2549i(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(AbstractC2540f abstractC2540f) {
            return Float.valueOf(abstractC2540f.m32634p());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2523b
        /* renamed from: d */
        public void mo32604b(AbstractC2540f abstractC2540f, float f) {
            abstractC2540f.m32648I(f);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$j */
    /* loaded from: classes2.dex */
    static class C2550j extends AbstractC2523b<AbstractC2540f> {
        C2550j(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(AbstractC2540f abstractC2540f) {
            return Float.valueOf(abstractC2540f.m32639k());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2523b
        /* renamed from: d */
        public void mo32604b(AbstractC2540f abstractC2540f, float f) {
            abstractC2540f.m32653D(f);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: com.github.ybq.android.spinkit.g.f$k */
    /* loaded from: classes2.dex */
    static class C2551k extends AbstractC2523b<AbstractC2540f> {
        C2551k(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(AbstractC2540f abstractC2540f) {
            return Float.valueOf(abstractC2540f.m32638l());
        }

        @Override // com.github.ybq.android.spinkit.p091f.AbstractC2523b
        /* renamed from: d */
        public void mo32604b(AbstractC2540f abstractC2540f, float f) {
            abstractC2540f.m32652E(f);
        }
    }

    static {
        new C2546f("translateX");
        new C2547g("translateY");
        f7181O = new C2548h("translateXPercentage");
        f7182P = new C2549i("translateYPercentage");
        new C2550j("scaleX");
        f7183Q = new C2551k("scaleY");
        f7184R = new C2541a("scale");
        f7185S = new C2542b("alpha");
    }

    /* renamed from: A */
    public void m32656A(int i) {
        this.f7202y = i;
    }

    /* renamed from: B */
    public void m32655B(int i) {
        this.f7203z = i;
    }

    /* renamed from: C */
    public void m32654C(float f) {
        this.f7196c = f;
        m32653D(f);
        m32652E(f);
    }

    /* renamed from: D */
    public void m32653D(float f) {
        this.f7197d = f;
    }

    /* renamed from: E */
    public void m32652E(float f) {
        this.f7198e = f;
    }

    /* renamed from: F */
    public void m32651F(int i) {
        this.f7186A = i;
    }

    /* renamed from: G */
    public void m32650G(float f) {
        this.f7189D = f;
    }

    /* renamed from: H */
    public void m32649H(int i) {
        this.f7187B = i;
    }

    /* renamed from: I */
    public void m32648I(float f) {
        this.f7190E = f;
    }

    /* renamed from: a */
    public Rect m32647a(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i = min / 2;
        return new Rect(centerX - i, centerY - i, centerX + i, centerY + i);
    }

    /* renamed from: b */
    protected abstract void mo32598b(Canvas canvas);

    /* renamed from: c */
    public abstract int mo32597c();

    /* renamed from: d */
    public Rect m32646d() {
        return this.f7193H;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int m32637m = m32637m();
        if (m32637m == 0) {
            m32637m = (int) (getBounds().width() * m32636n());
        }
        int m32635o = m32635o();
        if (m32635o == 0) {
            m32635o = (int) (getBounds().height() * m32634p());
        }
        canvas.translate(m32637m, m32635o);
        canvas.scale(m32639k(), m32638l(), m32645e(), m32644f());
        canvas.rotate(m32643g(), m32645e(), m32644f());
        if (m32642h() != 0 || m32641i() != 0) {
            this.f7194I.save();
            this.f7194I.rotateX(m32642h());
            this.f7194I.rotateY(m32641i());
            this.f7194I.getMatrix(this.f7195J);
            this.f7195J.preTranslate(-m32645e(), -m32644f());
            this.f7195J.postTranslate(m32645e(), m32644f());
            this.f7194I.restore();
            canvas.concat(this.f7195J);
        }
        mo32598b(canvas);
    }

    /* renamed from: e */
    public float m32645e() {
        return this.f7199f;
    }

    /* renamed from: f */
    public float m32644f() {
        return this.f7200w;
    }

    /* renamed from: g */
    public int m32643g() {
        return this.f7188C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7192G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int m32642h() {
        return this.f7202y;
    }

    /* renamed from: i */
    public int m32641i() {
        return this.f7203z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return C2522a.m32690a(this.f7191F);
    }

    /* renamed from: j */
    public float m32640j() {
        return this.f7196c;
    }

    /* renamed from: k */
    public float m32639k() {
        return this.f7197d;
    }

    /* renamed from: l */
    public float m32638l() {
        return this.f7198e;
    }

    /* renamed from: m */
    public int m32637m() {
        return this.f7186A;
    }

    /* renamed from: n */
    public float m32636n() {
        return this.f7189D;
    }

    /* renamed from: o */
    public int m32635o() {
        return this.f7187B;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m32629w(rect);
    }

    /* renamed from: p */
    public float m32634p() {
        return this.f7190E;
    }

    /* renamed from: q */
    public ValueAnimator m32633q() {
        if (this.f7191F == null) {
            this.f7191F = mo32592r();
        }
        ValueAnimator valueAnimator = this.f7191F;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
            this.f7191F.setStartDelay(this.f7201x);
        }
        return this.f7191F;
    }

    /* renamed from: r */
    public abstract ValueAnimator mo32592r();

    /* renamed from: s */
    public void m32632s() {
        this.f7196c = 1.0f;
        this.f7202y = 0;
        this.f7203z = 0;
        this.f7186A = 0;
        this.f7187B = 0;
        this.f7188C = 0;
        this.f7189D = 0.0f;
        this.f7190E = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f7192G = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (C2522a.m32688c(this.f7191F)) {
            return;
        }
        ValueAnimator m32633q = m32633q();
        this.f7191F = m32633q;
        if (m32633q == null) {
            return;
        }
        C2522a.m32687d(m32633q);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (C2522a.m32688c(this.f7191F)) {
            this.f7191F.removeAllUpdateListeners();
            this.f7191F.end();
            m32632s();
        }
    }

    /* renamed from: t */
    public AbstractC2540f m32631t(int i) {
        this.f7201x = i;
        return this;
    }

    /* renamed from: u */
    public abstract void mo32596u(int i);

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* renamed from: v */
    public void m32630v(int i, int i2, int i3, int i4) {
        this.f7193H = new Rect(i, i2, i3, i4);
        m32628x(m32646d().centerX());
        m32627y(m32646d().centerY());
    }

    /* renamed from: w */
    public void m32629w(Rect rect) {
        m32630v(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: x */
    public void m32628x(float f) {
        this.f7199f = f;
    }

    /* renamed from: y */
    public void m32627y(float f) {
        this.f7200w = f;
    }

    /* renamed from: z */
    public void m32626z(int i) {
        this.f7188C = i;
    }
}
