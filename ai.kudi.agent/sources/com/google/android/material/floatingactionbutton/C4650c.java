package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.C1335a;
import java.util.ArrayList;
import p201g.p227h.p237k.C7675h;
import p272h.p286c.p287a.p323c.C9236c;
import p272h.p286c.p287a.p323c.p324a0.C9232b;
import p272h.p286c.p287a.p323c.p325b0.InterfaceC9235b;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImplLollipop.java */
/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes2.dex */
public class C4650c extends C4637b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* renamed from: com.google.android.material.floatingactionbutton.c$a */
    /* loaded from: classes2.dex */
    public static class C4651a extends C9243g {
        C4651a(C9250k c9250k) {
            super(c9250k);
        }

        @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4650c(FloatingActionButton floatingActionButton, InterfaceC9235b interfaceC9235b) {
        super(floatingActionButton, interfaceC9235b);
    }

    /* renamed from: j0 */
    private Animator m26876j0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f11603y, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f11603y, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C4637b.f11567F);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: A */
    public void mo26886A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: C */
    public void mo26885C() {
        m26911f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: E */
    public void mo26884E(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f11603y.isEnabled()) {
                this.f11603y.setElevation(this.f11586h);
                if (this.f11603y.isPressed()) {
                    this.f11603y.setTranslationZ(this.f11588j);
                    return;
                } else if (!this.f11603y.isFocused() && !this.f11603y.isHovered()) {
                    this.f11603y.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f11603y.setTranslationZ(this.f11587i);
                    return;
                }
            }
            this.f11603y.setElevation(0.0f);
            this.f11603y.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: F */
    void mo26883F(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f11603y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C4637b.f11568G, m26876j0(f, f3));
            stateListAnimator.addState(C4637b.f11569H, m26876j0(f, f2));
            stateListAnimator.addState(C4637b.f11570I, m26876j0(f, f2));
            stateListAnimator.addState(C4637b.f11571J, m26876j0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f11603y, "elevation", f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f11603y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f11603y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C4637b.f11567F);
            stateListAnimator.addState(C4637b.f11572K, animatorSet);
            stateListAnimator.addState(C4637b.f11573L, m26876j0(0.0f, 0.0f));
            this.f11603y.setStateListAnimator(stateListAnimator);
        }
        if (mo26880Z()) {
            m26911f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: K */
    boolean mo26882K() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: V */
    public void mo26881V(ColorStateList colorStateList) {
        Drawable drawable = this.f11581c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C9232b.m15444d(colorStateList));
        } else {
            super.mo26881V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: Z */
    boolean mo26880Z() {
        return this.f11604z.mo15436c() || !m26918b0();
    }

    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: d0 */
    void mo26879d0() {
    }

    /* renamed from: i0 */
    C4634a m26878i0(int i, ColorStateList colorStateList) {
        Context context = this.f11603y.getContext();
        C9250k c9250k = this.f11579a;
        C7675h.m17866f(c9250k);
        C4634a c4634a = new C4634a(c9250k);
        c4634a.m26942e(C1335a.m36324d(context, C9236c.design_fab_stroke_top_outer_color), C1335a.m36324d(context, C9236c.design_fab_stroke_top_inner_color), C1335a.m36324d(context, C9236c.design_fab_stroke_end_inner_color), C1335a.m36324d(context, C9236c.design_fab_stroke_end_outer_color));
        c4634a.m26943d(i);
        c4634a.m26944c(colorStateList);
        return c4634a;
    }

    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: j */
    C9243g mo26877j() {
        C9250k c9250k = this.f11579a;
        C7675h.m17866f(c9250k);
        return new C4651a(c9250k);
    }

    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: n */
    public float mo26875n() {
        return this.f11603y.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: s */
    public void mo26874s(Rect rect) {
        if (this.f11604z.mo15436c()) {
            super.mo26874s(rect);
        } else if (!m26918b0()) {
            int sizeDimension = (this.f11589k - this.f11603y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C4637b
    /* renamed from: x */
    public void mo26873x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C9243g mo26877j = mo26877j();
        this.f11580b = mo26877j;
        mo26877j.setTintList(colorStateList);
        if (mode != null) {
            this.f11580b.setTintMode(mode);
        }
        this.f11580b.m15420M(this.f11603y.getContext());
        if (i > 0) {
            this.f11582d = m26878i0(i, colorStateList);
            C4634a c4634a = this.f11582d;
            C7675h.m17866f(c4634a);
            C9243g c9243g = this.f11580b;
            C7675h.m17866f(c9243g);
            drawable = new LayerDrawable(new Drawable[]{c4634a, c9243g});
        } else {
            this.f11582d = null;
            drawable = this.f11580b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C9232b.m15444d(colorStateList2), drawable, null);
        this.f11581c = rippleDrawable;
        this.f11583e = rippleDrawable;
    }
}
