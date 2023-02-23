package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p272h.p286c.p287a.p323c.p328m.C9278a;
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC1280c<V> {

    /* renamed from: a */
    private int f11027a;

    /* renamed from: b */
    private int f11028b;

    /* renamed from: c */
    private int f11029c;

    /* renamed from: d */
    private ViewPropertyAnimator f11030d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes2.dex */
    public class C4507a extends AnimatorListenerAdapter {
        C4507a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f11030d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f11027a = 0;
        this.f11028b = 2;
        this.f11029c = 0;
    }

    /* renamed from: F */
    private void m27598F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f11030d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C4507a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: A */
    public boolean mo27481A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public void m27597G(V v, int i) {
        this.f11029c = i;
        if (this.f11028b == 1) {
            v.setTranslationY(this.f11027a + i);
        }
    }

    /* renamed from: H */
    public void m27596H(V v) {
        if (this.f11028b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f11030d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f11028b = 1;
        m27598F(v, this.f11027a + this.f11029c, 175L, C9278a.f21808c);
    }

    /* renamed from: I */
    public void m27595I(V v) {
        if (this.f11028b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f11030d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f11028b = 2;
        m27598F(v, 0, 225L, C9278a.f21809d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: l */
    public boolean mo26206l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f11027a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo26206l(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: t */
    public void mo27434t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            m27596H(v);
        } else if (i2 < 0) {
            m27595I(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11027a = 0;
        this.f11028b = 2;
        this.f11029c = 0;
    }
}
