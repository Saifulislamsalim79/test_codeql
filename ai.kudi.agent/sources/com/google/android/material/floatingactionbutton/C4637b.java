package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C1365a;
import com.google.android.material.internal.C4684l;
import java.util.ArrayList;
import java.util.Iterator;
import p201g.p227h.p237k.C7675h;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9228a;
import p272h.p286c.p287a.p323c.p324a0.C9229a;
import p272h.p286c.p287a.p323c.p324a0.C9232b;
import p272h.p286c.p287a.p323c.p325b0.InterfaceC9235b;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import p272h.p286c.p287a.p323c.p328m.C9279b;
import p272h.p286c.p287a.p323c.p328m.C9283f;
import p272h.p286c.p287a.p323c.p328m.C9284g;
import p272h.p286c.p287a.p323c.p328m.C9285h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes2.dex */
public class C4637b {

    /* renamed from: F */
    static final TimeInterpolator f11567F = C9278a.f21808c;

    /* renamed from: G */
    static final int[] f11568G = {16842919, 16842910};

    /* renamed from: H */
    static final int[] f11569H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    static final int[] f11570I = {16842908, 16842910};

    /* renamed from: J */
    static final int[] f11571J = {16843623, 16842910};

    /* renamed from: K */
    static final int[] f11572K = {16842910};

    /* renamed from: L */
    static final int[] f11573L = new int[0];

    /* renamed from: E */
    private ViewTreeObserver.OnPreDrawListener f11578E;

    /* renamed from: a */
    C9250k f11579a;

    /* renamed from: b */
    C9243g f11580b;

    /* renamed from: c */
    Drawable f11581c;

    /* renamed from: d */
    C4634a f11582d;

    /* renamed from: e */
    Drawable f11583e;

    /* renamed from: f */
    boolean f11584f;

    /* renamed from: h */
    float f11586h;

    /* renamed from: i */
    float f11587i;

    /* renamed from: j */
    float f11588j;

    /* renamed from: k */
    int f11589k;

    /* renamed from: l */
    private final C4684l f11590l;

    /* renamed from: m */
    private C9285h f11591m;

    /* renamed from: n */
    private C9285h f11592n;

    /* renamed from: o */
    private Animator f11593o;

    /* renamed from: p */
    private C9285h f11594p;

    /* renamed from: q */
    private C9285h f11595q;

    /* renamed from: r */
    private float f11596r;

    /* renamed from: t */
    private int f11598t;

    /* renamed from: v */
    private ArrayList<Animator.AnimatorListener> f11600v;

    /* renamed from: w */
    private ArrayList<Animator.AnimatorListener> f11601w;

    /* renamed from: x */
    private ArrayList<InterfaceC4646i> f11602x;

    /* renamed from: y */
    final FloatingActionButton f11603y;

    /* renamed from: z */
    final InterfaceC9235b f11604z;

    /* renamed from: g */
    boolean f11585g = true;

    /* renamed from: s */
    private float f11597s = 1.0f;

    /* renamed from: u */
    private int f11599u = 0;

    /* renamed from: A */
    private final Rect f11574A = new Rect();

    /* renamed from: B */
    private final RectF f11575B = new RectF();

    /* renamed from: C */
    private final RectF f11576C = new RectF();

    /* renamed from: D */
    private final Matrix f11577D = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* loaded from: classes2.dex */
    public class C4638a extends AnimatorListenerAdapter {

        /* renamed from: c */
        private boolean f11605c;

        /* renamed from: d */
        final /* synthetic */ boolean f11606d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC4647j f11607e;

        C4638a(boolean z, InterfaceC4647j interfaceC4647j) {
            this.f11606d = z;
            this.f11607e = interfaceC4647j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11605c = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4637b.this.f11599u = 0;
            C4637b.this.f11593o = null;
            if (this.f11605c) {
                return;
            }
            C4637b.this.f11603y.m26680b(this.f11606d ? 8 : 4, this.f11606d);
            InterfaceC4647j interfaceC4647j = this.f11607e;
            if (interfaceC4647j != null) {
                interfaceC4647j.mo26888b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4637b.this.f11603y.m26680b(0, this.f11606d);
            C4637b.this.f11599u = 1;
            C4637b.this.f11593o = animator;
            this.f11605c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    /* loaded from: classes2.dex */
    public class C4639b extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ boolean f11609c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC4647j f11610d;

        C4639b(boolean z, InterfaceC4647j interfaceC4647j) {
            this.f11609c = z;
            this.f11610d = interfaceC4647j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4637b.this.f11599u = 0;
            C4637b.this.f11593o = null;
            InterfaceC4647j interfaceC4647j = this.f11610d;
            if (interfaceC4647j != null) {
                interfaceC4647j.mo26889a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4637b.this.f11603y.m26680b(0, this.f11609c);
            C4637b.this.f11599u = 2;
            C4637b.this.f11593o = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    /* loaded from: classes2.dex */
    public class C4640c extends C9284g {
        C4640c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C4637b.this.f11597s = f;
            return super.mo15226a(f, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    /* loaded from: classes2.dex */
    public class C4641d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f11613a = new FloatEvaluator();

        C4641d(C4637b c4637b) {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f11613a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnPreDrawListenerC4642e implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC4642e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C4637b.this.m26937H();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    /* loaded from: classes2.dex */
    private class C4643f extends AbstractC4649l {
        C4643f(C4637b c4637b) {
            super(c4637b, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4637b.AbstractC4649l
        /* renamed from: a */
        protected float mo26887a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    /* loaded from: classes2.dex */
    private class C4644g extends AbstractC4649l {
        C4644g() {
            super(C4637b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4637b.AbstractC4649l
        /* renamed from: a */
        protected float mo26887a() {
            C4637b c4637b = C4637b.this;
            return c4637b.f11586h + c4637b.f11587i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    /* loaded from: classes2.dex */
    private class C4645h extends AbstractC4649l {
        C4645h() {
            super(C4637b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4637b.AbstractC4649l
        /* renamed from: a */
        protected float mo26887a() {
            C4637b c4637b = C4637b.this;
            return c4637b.f11586h + c4637b.f11588j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC4646i {
        /* renamed from: a */
        void mo26891a();

        /* renamed from: b */
        void mo26890b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC4647j {
        /* renamed from: a */
        void mo26889a();

        /* renamed from: b */
        void mo26888b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    /* loaded from: classes2.dex */
    private class C4648k extends AbstractC4649l {
        C4648k() {
            super(C4637b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4637b.AbstractC4649l
        /* renamed from: a */
        protected float mo26887a() {
            return C4637b.this.f11586h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    /* loaded from: classes2.dex */
    private abstract class AbstractC4649l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        private boolean f11618c;

        /* renamed from: d */
        private float f11619d;

        /* renamed from: e */
        private float f11620e;

        private AbstractC4649l() {
        }

        /* renamed from: a */
        protected abstract float mo26887a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4637b.this.m26909g0((int) this.f11620e);
            this.f11618c = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f11618c) {
                C9243g c9243g = C4637b.this.f11580b;
                this.f11619d = c9243g == null ? 0.0f : c9243g.m15375w();
                this.f11620e = mo26887a();
                this.f11618c = true;
            }
            C4637b c4637b = C4637b.this;
            float f = this.f11619d;
            c4637b.m26909g0((int) (f + ((this.f11620e - f) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ AbstractC4649l(C4637b c4637b, C4638a c4638a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4637b(FloatingActionButton floatingActionButton, InterfaceC9235b interfaceC9235b) {
        this.f11603y = floatingActionButton;
        this.f11604z = interfaceC9235b;
        C4684l c4684l = new C4684l();
        this.f11590l = c4684l;
        c4684l.m26721a(f11568G, m26906i(new C4645h()));
        this.f11590l.m26721a(f11569H, m26906i(new C4644g()));
        this.f11590l.m26721a(f11570I, m26906i(new C4644g()));
        this.f11590l.m26721a(f11571J, m26906i(new C4644g()));
        this.f11590l.m26721a(f11572K, m26906i(new C4648k()));
        this.f11590l.m26721a(f11573L, m26906i(new C4643f(this)));
        this.f11596r = this.f11603y.getRotation();
    }

    /* renamed from: a0 */
    private boolean m26920a0() {
        return C7759x.m17535U(this.f11603y) && !this.f11603y.isInEditMode();
    }

    /* renamed from: g */
    private void m26910g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f11603y.getDrawable();
        if (drawable == null || this.f11598t == 0) {
            return;
        }
        RectF rectF = this.f11575B;
        RectF rectF2 = this.f11576C;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f11598t;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f11598t;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    /* renamed from: h */
    private AnimatorSet m26908h(C9285h c9285h, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11603y, View.ALPHA, f);
        c9285h.m15221e("opacity").m15216a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11603y, View.SCALE_X, f2);
        c9285h.m15221e("scale").m15216a(ofFloat2);
        m26907h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f11603y, View.SCALE_Y, f2);
        c9285h.m15221e("scale").m15216a(ofFloat3);
        m26907h0(ofFloat3);
        arrayList.add(ofFloat3);
        m26910g(f3, this.f11577D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f11603y, new C9283f(), new C4640c(), new Matrix(this.f11577D));
        c9285h.m15221e("iconScale").m15216a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C9279b.m15235a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: h0 */
    private void m26907h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C4641d(this));
    }

    /* renamed from: i */
    private ValueAnimator m26906i(AbstractC4649l abstractC4649l) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f11567F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC4649l);
        valueAnimator.addUpdateListener(abstractC4649l);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: l */
    private C9285h m26904l() {
        if (this.f11592n == null) {
            this.f11592n = C9285h.m15223c(this.f11603y.getContext(), C9228a.design_fab_hide_motion_spec);
        }
        C9285h c9285h = this.f11592n;
        C7675h.m17866f(c9285h);
        return c9285h;
    }

    /* renamed from: m */
    private C9285h m26903m() {
        if (this.f11591m == null) {
            this.f11591m = C9285h.m15223c(this.f11603y.getContext(), C9228a.design_fab_show_motion_spec);
        }
        C9285h c9285h = this.f11591m;
        C7675h.m17866f(c9285h);
        return c9285h;
    }

    /* renamed from: r */
    private ViewTreeObserver.OnPreDrawListener m26899r() {
        if (this.f11578E == null) {
            this.f11578E = new ViewTreeObserver$OnPreDrawListenerC4642e();
        }
        return this.f11578E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo26886A() {
        this.f11590l.m26719c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m26940B() {
        C9243g c9243g = this.f11580b;
        if (c9243g != null) {
            C9247h.m15366f(this.f11603y, c9243g);
        }
        if (mo26882K()) {
            this.f11603y.getViewTreeObserver().addOnPreDrawListener(m26899r());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo26885C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m26939D() {
        ViewTreeObserver viewTreeObserver = this.f11603y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f11578E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f11578E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo26884E(int[] iArr) {
        this.f11590l.m26718d(iArr);
    }

    /* renamed from: F */
    void mo26883F(float f, float f2, float f3) {
        m26911f0();
        m26909g0(f);
    }

    /* renamed from: G */
    void m26938G(Rect rect) {
        C7675h.m17865g(this.f11583e, "Didn't initialize content background");
        if (mo26880Z()) {
            this.f11604z.mo15438a(new InsetDrawable(this.f11583e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f11604z.mo15438a(this.f11583e);
    }

    /* renamed from: H */
    void m26937H() {
        float rotation = this.f11603y.getRotation();
        if (this.f11596r != rotation) {
            this.f11596r = rotation;
            mo26879d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m26936I() {
        ArrayList<InterfaceC4646i> arrayList = this.f11602x;
        if (arrayList != null) {
            Iterator<InterfaceC4646i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo26890b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m26935J() {
        ArrayList<InterfaceC4646i> arrayList = this.f11602x;
        if (arrayList != null) {
            Iterator<InterfaceC4646i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo26891a();
            }
        }
    }

    /* renamed from: K */
    boolean mo26882K() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m26934L(ColorStateList colorStateList) {
        C9243g c9243g = this.f11580b;
        if (c9243g != null) {
            c9243g.setTintList(colorStateList);
        }
        C4634a c4634a = this.f11582d;
        if (c4634a != null) {
            c4634a.m26944c(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m26933M(PorterDuff.Mode mode) {
        C9243g c9243g = this.f11580b;
        if (c9243g != null) {
            c9243g.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m26932N(float f) {
        if (this.f11586h != f) {
            this.f11586h = f;
            mo26883F(f, this.f11587i, this.f11588j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m26931O(boolean z) {
        this.f11584f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m26930P(C9285h c9285h) {
        this.f11595q = c9285h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void m26929Q(float f) {
        if (this.f11587i != f) {
            this.f11587i = f;
            mo26883F(this.f11586h, f, this.f11588j);
        }
    }

    /* renamed from: R */
    final void m26928R(float f) {
        this.f11597s = f;
        Matrix matrix = this.f11577D;
        m26910g(f, matrix);
        this.f11603y.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public final void m26927S(int i) {
        if (this.f11598t != i) {
            this.f11598t = i;
            m26913e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m26926T(int i) {
        this.f11589k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final void m26925U(float f) {
        if (this.f11588j != f) {
            this.f11588j = f;
            mo26883F(this.f11586h, this.f11587i, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo26881V(ColorStateList colorStateList) {
        Drawable drawable = this.f11581c;
        if (drawable != null) {
            C1365a.m36187o(drawable, C9232b.m15444d(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m26924W(boolean z) {
        this.f11585g = z;
        m26911f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public final void m26923X(C9250k c9250k) {
        this.f11579a = c9250k;
        C9243g c9243g = this.f11580b;
        if (c9243g != null) {
            c9243g.setShapeAppearanceModel(c9250k);
        }
        Drawable drawable = this.f11581c;
        if (drawable instanceof InterfaceC9266n) {
            ((InterfaceC9266n) drawable).setShapeAppearanceModel(c9250k);
        }
        C4634a c4634a = this.f11582d;
        if (c4634a != null) {
            c4634a.m26941f(c9250k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public final void m26922Y(C9285h c9285h) {
        this.f11594p = c9285h;
    }

    /* renamed from: Z */
    boolean mo26880Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean m26918b0() {
        return !this.f11584f || this.f11603y.getSizeDimension() >= this.f11589k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m26916c0(InterfaceC4647j interfaceC4647j, boolean z) {
        if (m26893z()) {
            return;
        }
        Animator animator = this.f11593o;
        if (animator != null) {
            animator.cancel();
        }
        if (m26920a0()) {
            if (this.f11603y.getVisibility() != 0) {
                this.f11603y.setAlpha(0.0f);
                this.f11603y.setScaleY(0.0f);
                this.f11603y.setScaleX(0.0f);
                m26928R(0.0f);
            }
            C9285h c9285h = this.f11594p;
            if (c9285h == null) {
                c9285h = m26903m();
            }
            AnimatorSet m26908h = m26908h(c9285h, 1.0f, 1.0f, 1.0f);
            m26908h.addListener(new C4639b(z, interfaceC4647j));
            ArrayList<Animator.AnimatorListener> arrayList = this.f11600v;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m26908h.addListener(it.next());
                }
            }
            m26908h.start();
            return;
        }
        this.f11603y.m26680b(0, z);
        this.f11603y.setAlpha(1.0f);
        this.f11603y.setScaleY(1.0f);
        this.f11603y.setScaleX(1.0f);
        m26928R(1.0f);
        if (interfaceC4647j != null) {
            interfaceC4647j.mo26889a();
        }
    }

    /* renamed from: d */
    public void m26915d(Animator.AnimatorListener animatorListener) {
        if (this.f11601w == null) {
            this.f11601w = new ArrayList<>();
        }
        this.f11601w.add(animatorListener);
    }

    /* renamed from: d0 */
    void mo26879d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f11596r % 90.0f != 0.0f) {
                if (this.f11603y.getLayerType() != 1) {
                    this.f11603y.setLayerType(1, null);
                }
            } else if (this.f11603y.getLayerType() != 0) {
                this.f11603y.setLayerType(0, null);
            }
        }
        C9243g c9243g = this.f11580b;
        if (c9243g != null) {
            c9243g.m15402c0((int) this.f11596r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m26914e(Animator.AnimatorListener animatorListener) {
        if (this.f11600v == null) {
            this.f11600v = new ArrayList<>();
        }
        this.f11600v.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void m26913e0() {
        m26928R(this.f11597s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m26912f(InterfaceC4646i interfaceC4646i) {
        if (this.f11602x == null) {
            this.f11602x = new ArrayList<>();
        }
        this.f11602x.add(interfaceC4646i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final void m26911f0() {
        Rect rect = this.f11574A;
        mo26874s(rect);
        m26938G(rect);
        this.f11604z.mo15437b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void m26909g0(float f) {
        C9243g c9243g = this.f11580b;
        if (c9243g != null) {
            c9243g.m15410W(f);
        }
    }

    /* renamed from: j */
    C9243g mo26877j() {
        C9250k c9250k = this.f11579a;
        C7675h.m17866f(c9250k);
        return new C9243g(c9250k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final Drawable m26905k() {
        return this.f11583e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo26875n() {
        return this.f11586h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m26902o() {
        return this.f11584f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final C9285h m26901p() {
        return this.f11595q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public float m26900q() {
        return this.f11587i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo26874s(Rect rect) {
        int sizeDimension = this.f11584f ? (this.f11589k - this.f11603y.getSizeDimension()) / 2 : 0;
        float mo26875n = this.f11585g ? mo26875n() + this.f11588j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(mo26875n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(mo26875n * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public float m26898t() {
        return this.f11588j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final C9250k m26897u() {
        return this.f11579a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final C9285h m26896v() {
        return this.f11594p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m26895w(InterfaceC4647j interfaceC4647j, boolean z) {
        if (m26894y()) {
            return;
        }
        Animator animator = this.f11593o;
        if (animator != null) {
            animator.cancel();
        }
        if (m26920a0()) {
            C9285h c9285h = this.f11595q;
            if (c9285h == null) {
                c9285h = m26904l();
            }
            AnimatorSet m26908h = m26908h(c9285h, 0.0f, 0.0f, 0.0f);
            m26908h.addListener(new C4638a(z, interfaceC4647j));
            ArrayList<Animator.AnimatorListener> arrayList = this.f11601w;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m26908h.addListener(it.next());
                }
            }
            m26908h.start();
            return;
        }
        this.f11603y.m26680b(z ? 8 : 4, z);
        if (interfaceC4647j != null) {
            interfaceC4647j.mo26888b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo26873x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C9243g mo26877j = mo26877j();
        this.f11580b = mo26877j;
        mo26877j.setTintList(colorStateList);
        if (mode != null) {
            this.f11580b.setTintMode(mode);
        }
        this.f11580b.m15404b0(-12303292);
        this.f11580b.m15420M(this.f11603y.getContext());
        C9229a c9229a = new C9229a(this.f11580b.m15430C());
        c9229a.setTintList(C9232b.m15444d(colorStateList2));
        this.f11581c = c9229a;
        C9243g c9243g = this.f11580b;
        C7675h.m17866f(c9243g);
        this.f11583e = new LayerDrawable(new Drawable[]{c9243g, c9229a});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m26894y() {
        return this.f11603y.getVisibility() == 0 ? this.f11599u == 1 : this.f11599u != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m26893z() {
        return this.f11603y.getVisibility() != 0 ? this.f11599u == 2 : this.f11599u != 1;
    }
}
