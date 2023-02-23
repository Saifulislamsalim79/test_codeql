package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import p272h.p286c.p287a.p323c.p328m.C9279b;
import p272h.p286c.p287a.p323c.p328m.C9280c;
import p272h.p286c.p287a.p323c.p328m.C9281d;
import p272h.p286c.p287a.p323c.p328m.C9282e;
import p272h.p286c.p287a.p323c.p328m.C9285h;
import p272h.p286c.p287a.p323c.p328m.C9286i;
import p272h.p286c.p287a.p323c.p328m.C9287j;
import p272h.p286c.p287a.p323c.p333r.C9299a;
import p272h.p286c.p287a.p323c.p333r.C9302c;
import p272h.p286c.p287a.p323c.p333r.InterfaceC9303d;
import p272h.p286c.p287a.p323c.p340x.C9316a;
@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f12227c;

    /* renamed from: d */
    private final RectF f12228d;

    /* renamed from: e */
    private final RectF f12229e;

    /* renamed from: f */
    private final int[] f12230f;

    /* renamed from: g */
    private float f12231g;

    /* renamed from: h */
    private float f12232h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes2.dex */
    class C4826a extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ boolean f12233c;

        /* renamed from: d */
        final /* synthetic */ View f12234d;

        /* renamed from: e */
        final /* synthetic */ View f12235e;

        C4826a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f12233c = z;
            this.f12234d = view;
            this.f12235e = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f12233c) {
                return;
            }
            this.f12234d.setVisibility(4);
            this.f12235e.setAlpha(1.0f);
            this.f12235e.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f12233c) {
                this.f12234d.setVisibility(0);
                this.f12235e.setAlpha(0.0f);
                this.f12235e.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes2.dex */
    public class C4827b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        final /* synthetic */ View f12236c;

        C4827b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f12236c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f12236c.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes2.dex */
    public class C4828c extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9303d f12237c;

        /* renamed from: d */
        final /* synthetic */ Drawable f12238d;

        C4828c(FabTransformationBehavior fabTransformationBehavior, InterfaceC9303d interfaceC9303d, Drawable drawable) {
            this.f12237c = interfaceC9303d;
            this.f12238d = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12237c.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f12237c.setCircularRevealOverlayDrawable(this.f12238d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes2.dex */
    public class C4829d extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9303d f12239c;

        C4829d(FabTransformationBehavior fabTransformationBehavior, InterfaceC9303d interfaceC9303d) {
            this.f12239c = interfaceC9303d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC9303d.C9308e revealInfo = this.f12239c.getRevealInfo();
            revealInfo.f21884c = Float.MAX_VALUE;
            this.f12239c.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes2.dex */
    public static class C4830e {

        /* renamed from: a */
        public C9285h f12240a;

        /* renamed from: b */
        public C9287j f12241b;
    }

    public FabTransformationBehavior() {
        this.f12227c = new Rect();
        this.f12228d = new RectF();
        this.f12229e = new RectF();
        this.f12230f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m26204K(View view) {
        View findViewById = view.findViewById(C9271f.mtrl_child_content_container);
        if (findViewById != null) {
            return m26184f0(findViewById);
        }
        if (!(view instanceof C4833b) && !(view instanceof C4832a)) {
            return m26184f0(view);
        }
        return m26184f0(((ViewGroup) view).getChildAt(0));
    }

    /* renamed from: L */
    private void m26203L(View view, C4830e c4830e, C9286i c9286i, C9286i c9286i2, float f, float f2, float f3, float f4, RectF rectF) {
        float m26196S = m26196S(c4830e, c9286i, f, f3);
        float m26196S2 = m26196S(c4830e, c9286i2, f2, f4);
        Rect rect = this.f12227c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f12228d;
        rectF2.set(rect);
        RectF rectF3 = this.f12229e;
        m26195T(view, rectF3);
        rectF3.offset(m26196S, m26196S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m26202M(View view, RectF rectF) {
        m26195T(view, rectF);
        rectF.offset(this.f12231g, this.f12232h);
    }

    /* renamed from: N */
    private Pair<C9286i, C9286i> m26201N(float f, float f2, boolean z, C4830e c4830e) {
        C9286i m15221e;
        C9286i m15221e2;
        if (f == 0.0f || f2 == 0.0f) {
            m15221e = c4830e.f12240a.m15221e("translationXLinear");
            m15221e2 = c4830e.f12240a.m15221e("translationYLinear");
        } else if ((z && f2 < 0.0f) || (!z && f2 > 0.0f)) {
            m15221e = c4830e.f12240a.m15221e("translationXCurveUpwards");
            m15221e2 = c4830e.f12240a.m15221e("translationYCurveUpwards");
        } else {
            m15221e = c4830e.f12240a.m15221e("translationXCurveDownwards");
            m15221e2 = c4830e.f12240a.m15221e("translationYCurveDownwards");
        }
        return new Pair<>(m15221e, m15221e2);
    }

    /* renamed from: O */
    private float m26200O(View view, View view2, C9287j c9287j) {
        RectF rectF = this.f12228d;
        RectF rectF2 = this.f12229e;
        m26202M(view, rectF);
        m26195T(view2, rectF2);
        rectF2.offset(-m26198Q(view, view2, c9287j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m26199P(View view, View view2, C9287j c9287j) {
        RectF rectF = this.f12228d;
        RectF rectF2 = this.f12229e;
        m26202M(view, rectF);
        m26195T(view2, rectF2);
        rectF2.offset(0.0f, -m26197R(view, view2, c9287j));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m26198Q(View view, View view2, C9287j c9287j) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.f12228d;
        RectF rectF2 = this.f12229e;
        m26202M(view, rectF);
        m26195T(view2, rectF2);
        int i = c9287j.f21826a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i == 5) {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        } else {
            f = 0.0f;
            return f + c9287j.f21827b;
        }
        f = centerX - centerX2;
        return f + c9287j.f21827b;
    }

    /* renamed from: R */
    private float m26197R(View view, View view2, C9287j c9287j) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.f12228d;
        RectF rectF2 = this.f12229e;
        m26202M(view, rectF);
        m26195T(view2, rectF2);
        int i = c9287j.f21826a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i == 80) {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        } else {
            f = 0.0f;
            return f + c9287j.f21828c;
        }
        f = centerY - centerY2;
        return f + c9287j.f21828c;
    }

    /* renamed from: S */
    private float m26196S(C4830e c4830e, C9286i c9286i, float f, float f2) {
        long m15214c = c9286i.m15214c();
        long m15213d = c9286i.m15213d();
        C9286i m15221e = c4830e.f12240a.m15221e("expansion");
        return C9278a.m15237a(f, f2, c9286i.m15212e().getInterpolation(((float) (((m15221e.m15214c() + m15221e.m15213d()) + 17) - m15214c)) / ((float) m15213d)));
    }

    /* renamed from: T */
    private void m26195T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f12230f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m26194U(View view, View view2, boolean z, boolean z2, C4830e c4830e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m26204K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC9303d) && C9302c.f21877a == 0) || (m26204K = m26204K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C9281d.f21812a.set(m26204K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m26204K, C9281d.f21812a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m26204K, C9281d.f21812a, 0.0f);
            }
            c4830e.f12240a.m15221e("contentFade").m15216a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* renamed from: V */
    private void m26193V(View view, View view2, boolean z, boolean z2, C4830e c4830e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof InterfaceC9303d) {
            InterfaceC9303d interfaceC9303d = (InterfaceC9303d) view2;
            int m26185d0 = m26185d0(view);
            int i = 16777215 & m26185d0;
            if (z) {
                if (!z2) {
                    interfaceC9303d.setCircularRevealScrimColor(m26185d0);
                }
                ofInt = ObjectAnimator.ofInt(interfaceC9303d, InterfaceC9303d.C9307d.f21881a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(interfaceC9303d, InterfaceC9303d.C9307d.f21881a, m26185d0);
            }
            ofInt.setEvaluator(C9280c.m15233b());
            c4830e.f12240a.m15221e("color").m15216a(ofInt);
            list.add(ofInt);
        }
    }

    /* renamed from: W */
    private void m26192W(View view, View view2, boolean z, C4830e c4830e, List<Animator> list) {
        float m26198Q = m26198Q(view, view2, c4830e.f12241b);
        float m26197R = m26197R(view, view2, c4830e.f12241b);
        Pair<C9286i, C9286i> m26201N = m26201N(m26198Q, m26197R, z, c4830e);
        C9286i c9286i = (C9286i) m26201N.first;
        C9286i c9286i2 = (C9286i) m26201N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m26198Q = this.f12231g;
        }
        fArr[0] = m26198Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m26197R = this.f12232h;
        }
        fArr2[0] = m26197R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        c9286i.m15216a(ofFloat);
        c9286i2.m15216a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: X */
    private void m26191X(View view, View view2, boolean z, boolean z2, C4830e c4830e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m17485w = C7759x.m17485w(view2) - C7759x.m17485w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m17485w);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m17485w);
        }
        c4830e.f12240a.m15221e("elevation").m15216a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: Y */
    private void m26190Y(View view, View view2, boolean z, boolean z2, C4830e c4830e, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof InterfaceC9303d) {
            InterfaceC9303d interfaceC9303d = (InterfaceC9303d) view2;
            float m26200O = m26200O(view, view2, c4830e.f12241b);
            float m26199P = m26199P(view, view2, c4830e.f12241b);
            ((FloatingActionButton) view).m26972i(this.f12227c);
            float width = this.f12227c.width() / 2.0f;
            C9286i m15221e = c4830e.f12240a.m15221e("expansion");
            if (z) {
                if (!z2) {
                    interfaceC9303d.setRevealInfo(new InterfaceC9303d.C9308e(m26200O, m26199P, width));
                }
                if (z2) {
                    width = interfaceC9303d.getRevealInfo().f21884c;
                }
                animator = C9299a.m15104a(interfaceC9303d, m26200O, m26199P, C9316a.m15063b(m26200O, m26199P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C4829d(this, interfaceC9303d));
                m26187b0(view2, m15221e.m15214c(), (int) m26200O, (int) m26199P, width, list);
            } else {
                float f3 = interfaceC9303d.getRevealInfo().f21884c;
                Animator m15104a = C9299a.m15104a(interfaceC9303d, m26200O, m26199P, width);
                int i = (int) m26200O;
                int i2 = (int) m26199P;
                m26187b0(view2, m15221e.m15214c(), i, i2, f3, list);
                m26188a0(view2, m15221e.m15214c(), m15221e.m15213d(), c4830e.f12240a.m15220f(), i, i2, width, list);
                animator = m15104a;
            }
            m15221e.m15216a(animator);
            list.add(animator);
            list2.add(C9299a.m15103b(interfaceC9303d));
        }
    }

    /* renamed from: Z */
    private void m26189Z(View view, View view2, boolean z, boolean z2, C4830e c4830e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC9303d) && (view instanceof ImageView)) {
            InterfaceC9303d interfaceC9303d = (InterfaceC9303d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, C9282e.f21813b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, C9282e.f21813b, 255);
            }
            ofInt.addUpdateListener(new C4827b(this, view2));
            c4830e.f12240a.m15221e("iconFade").m15216a(ofInt);
            list.add(ofInt);
            list2.add(new C4828c(this, interfaceC9303d, drawable));
        }
    }

    /* renamed from: a0 */
    private void m26188a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m26187b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    /* renamed from: c0 */
    private void m26186c0(View view, View view2, boolean z, boolean z2, C4830e c4830e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m26198Q = m26198Q(view, view2, c4830e.f12241b);
        float m26197R = m26197R(view, view2, c4830e.f12241b);
        Pair<C9286i, C9286i> m26201N = m26201N(m26198Q, m26197R, z, c4830e);
        C9286i c9286i = (C9286i) m26201N.first;
        C9286i c9286i2 = (C9286i) m26201N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m26198Q);
                view2.setTranslationY(-m26197R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m26203L(view2, c4830e, c9286i, c9286i2, -m26198Q, -m26197R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m26198Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -m26197R);
        }
        c9286i.m15216a(ofFloat);
        c9286i2.m15216a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d0 */
    private int m26185d0(View view) {
        ColorStateList m17493s = C7759x.m17493s(view);
        if (m17493s != null) {
            return m17493s.getColorForState(view.getDrawableState(), m17493s.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m26184f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo26181J(View view, View view2, boolean z, boolean z2) {
        C4830e mo26177e0 = mo26177e0(view2.getContext(), z);
        if (z) {
            this.f12231g = view.getTranslationX();
            this.f12232h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m26191X(view, view2, z, z2, mo26177e0, arrayList, arrayList2);
        }
        RectF rectF = this.f12228d;
        m26186c0(view, view2, z, z2, mo26177e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m26192W(view, view2, z, mo26177e0, arrayList);
        m26189Z(view, view2, z, z2, mo26177e0, arrayList, arrayList2);
        m26190Y(view, view2, z, z2, mo26177e0, width, height, arrayList, arrayList2);
        m26193V(view, view2, z, z2, mo26177e0, arrayList, arrayList2);
        m26194U(view, view2, z, z2, mo26177e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C9279b.m15235a(animatorSet, arrayList);
        animatorSet.addListener(new C4826a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: e */
    public boolean mo26179e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: e0 */
    protected abstract C4830e mo26177e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: g */
    public void mo26183g(CoordinatorLayout.C1283f c1283f) {
        if (c1283f.f4031h == 0) {
            c1283f.f4031h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12227c = new Rect();
        this.f12228d = new RectF();
        this.f12229e = new RectF();
        this.f12230f = new int[2];
    }
}
