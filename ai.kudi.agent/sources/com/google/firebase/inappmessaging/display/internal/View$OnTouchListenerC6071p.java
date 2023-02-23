package com.google.firebase.inappmessaging.display.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
/* compiled from: SwipeDismissTouchListener.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.p */
/* loaded from: classes2.dex */
public class View$OnTouchListenerC6071p implements View.OnTouchListener {

    /* renamed from: A */
    private float f14820A;

    /* renamed from: B */
    private boolean f14821B;

    /* renamed from: C */
    private int f14822C;

    /* renamed from: D */
    private Object f14823D;

    /* renamed from: E */
    private VelocityTracker f14824E;

    /* renamed from: F */
    private float f14825F;

    /* renamed from: c */
    private int f14826c;

    /* renamed from: d */
    private int f14827d;

    /* renamed from: e */
    private int f14828e;

    /* renamed from: f */
    private long f14829f;

    /* renamed from: w */
    private View f14830w;

    /* renamed from: x */
    private InterfaceC6076e f14831x;

    /* renamed from: y */
    private int f14832y = 1;

    /* renamed from: z */
    private float f14833z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwipeDismissTouchListener.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.p$a */
    /* loaded from: classes2.dex */
    public class C6072a extends AnimatorListenerAdapter {
        C6072a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View$OnTouchListenerC6071p.this.m22802g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwipeDismissTouchListener.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.p$b */
    /* loaded from: classes2.dex */
    public class C6073b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        final /* synthetic */ float f14835c;

        /* renamed from: d */
        final /* synthetic */ float f14836d;

        /* renamed from: e */
        final /* synthetic */ float f14837e;

        /* renamed from: f */
        final /* synthetic */ float f14838f;

        C6073b(float f, float f2, float f3, float f4) {
            this.f14835c = f;
            this.f14836d = f2;
            this.f14837e = f3;
            this.f14838f = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = this.f14835c + (valueAnimator.getAnimatedFraction() * this.f14836d);
            float animatedFraction2 = this.f14837e + (valueAnimator.getAnimatedFraction() * this.f14838f);
            View$OnTouchListenerC6071p.this.mo22800i(animatedFraction);
            View$OnTouchListenerC6071p.this.m22801h(animatedFraction2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwipeDismissTouchListener.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.p$c */
    /* loaded from: classes2.dex */
    public class C6074c extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ ViewGroup.LayoutParams f14840c;

        /* renamed from: d */
        final /* synthetic */ int f14841d;

        C6074c(ViewGroup.LayoutParams layoutParams, int i) {
            this.f14840c = layoutParams;
            this.f14841d = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View$OnTouchListenerC6071p.this.f14831x.mo22796b(View$OnTouchListenerC6071p.this.f14830w, View$OnTouchListenerC6071p.this.f14823D);
            View$OnTouchListenerC6071p.this.f14830w.setAlpha(1.0f);
            View$OnTouchListenerC6071p.this.f14830w.setTranslationX(0.0f);
            this.f14840c.height = this.f14841d;
            View$OnTouchListenerC6071p.this.f14830w.setLayoutParams(this.f14840c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwipeDismissTouchListener.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.p$d */
    /* loaded from: classes2.dex */
    public class C6075d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        final /* synthetic */ ViewGroup.LayoutParams f14843c;

        C6075d(ViewGroup.LayoutParams layoutParams) {
            this.f14843c = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14843c.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            View$OnTouchListenerC6071p.this.f14830w.setLayoutParams(this.f14843c);
        }
    }

    /* compiled from: SwipeDismissTouchListener.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.p$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC6076e {
        /* renamed from: a */
        boolean mo22797a(Object obj);

        /* renamed from: b */
        void mo22796b(View view, Object obj);
    }

    public View$OnTouchListenerC6071p(View view, Object obj, InterfaceC6076e interfaceC6076e) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f14826c = viewConfiguration.getScaledTouchSlop();
        this.f14827d = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f14828e = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f14829f = view.getContext().getResources().getInteger(17694720);
        this.f14830w = view;
        this.f14823D = obj;
        this.f14831x = interfaceC6076e;
    }

    /* renamed from: e */
    private void m22804e(float f, float f2, AnimatorListenerAdapter animatorListenerAdapter) {
        float mo22803f = mo22803f();
        float f3 = f - mo22803f;
        float alpha = this.f14830w.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.f14829f);
        ofFloat.addUpdateListener(new C6073b(mo22803f, f3, alpha, f2 - alpha));
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m22802g() {
        ViewGroup.LayoutParams layoutParams = this.f14830w.getLayoutParams();
        int height = this.f14830w.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.f14829f);
        duration.addListener(new C6074c(layoutParams, height));
        duration.addUpdateListener(new C6075d(layoutParams));
        duration.start();
    }

    /* renamed from: f */
    protected float mo22803f() {
        return this.f14830w.getTranslationX();
    }

    /* renamed from: h */
    protected void m22801h(float f) {
        this.f14830w.setAlpha(f);
    }

    /* renamed from: i */
    protected void mo22800i(float f) {
        this.f14830w.setTranslationX(f);
    }

    /* renamed from: j */
    protected void m22799j() {
        m22804e(0.0f, 1.0f, null);
    }

    /* renamed from: k */
    protected void m22798k(boolean z) {
        m22804e(z ? this.f14832y : -this.f14832y, 0.0f, new C6072a());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        motionEvent.offsetLocation(this.f14825F, 0.0f);
        if (this.f14832y < 2) {
            this.f14832y = this.f14830w.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14833z = motionEvent.getRawX();
            this.f14820A = motionEvent.getRawY();
            if (this.f14831x.mo22797a(this.f14823D)) {
                VelocityTracker obtain = VelocityTracker.obtain();
                this.f14824E = obtain;
                obtain.addMovement(motionEvent);
            }
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3 && this.f14824E != null) {
                    m22799j();
                    this.f14824E.recycle();
                    this.f14824E = null;
                    this.f14825F = 0.0f;
                    this.f14833z = 0.0f;
                    this.f14820A = 0.0f;
                    this.f14821B = false;
                }
            } else {
                VelocityTracker velocityTracker = this.f14824E;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f14833z;
                    float rawY = motionEvent.getRawY() - this.f14820A;
                    if (Math.abs(rawX) > this.f14826c && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.f14821B = true;
                        this.f14822C = rawX > 0.0f ? this.f14826c : -this.f14826c;
                        this.f14830w.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                        obtain2.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.f14830w.onTouchEvent(obtain2);
                        obtain2.recycle();
                    }
                    if (this.f14821B) {
                        this.f14825F = rawX;
                        mo22800i(rawX - this.f14822C);
                        m22801h(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.f14832y))));
                        return true;
                    }
                }
            }
        } else if (this.f14824E != null) {
            float rawX2 = motionEvent.getRawX() - this.f14833z;
            this.f14824E.addMovement(motionEvent);
            this.f14824E.computeCurrentVelocity(1000);
            float xVelocity = this.f14824E.getXVelocity();
            float abs = Math.abs(xVelocity);
            float abs2 = Math.abs(this.f14824E.getYVelocity());
            if (Math.abs(rawX2) > this.f14832y / 2 && this.f14821B) {
                z = rawX2 > 0.0f;
            } else if (this.f14827d > abs || abs > this.f14828e || abs2 >= abs || abs2 >= abs || !this.f14821B) {
                z = false;
                r4 = false;
            } else {
                r4 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                z = this.f14824E.getXVelocity() > 0.0f;
            }
            if (r4) {
                m22798k(z);
            } else if (this.f14821B) {
                m22799j();
            }
            VelocityTracker velocityTracker2 = this.f14824E;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.f14824E = null;
            this.f14825F = 0.0f;
            this.f14833z = 0.0f;
            this.f14820A = 0.0f;
            this.f14821B = false;
        }
        return false;
    }
}
