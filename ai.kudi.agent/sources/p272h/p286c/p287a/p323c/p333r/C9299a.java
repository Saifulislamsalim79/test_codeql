package p272h.p286c.p287a.p323c.p333r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p272h.p286c.p287a.p323c.p333r.InterfaceC9303d;
/* compiled from: CircularRevealCompat.java */
/* renamed from: h.c.a.c.r.a */
/* loaded from: classes2.dex */
public final class C9299a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: h.c.a.c.r.a$a */
    /* loaded from: classes2.dex */
    static class C9300a extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9303d f21875c;

        C9300a(InterfaceC9303d interfaceC9303d) {
            this.f21875c = interfaceC9303d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f21875c.mo15085b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f21875c.mo15086a();
        }
    }

    /* renamed from: a */
    public static Animator m15104a(InterfaceC9303d interfaceC9303d, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC9303d, (Property<InterfaceC9303d, V>) InterfaceC9303d.C9306c.f21880a, (TypeEvaluator) InterfaceC9303d.C9305b.f21878b, (Object[]) new InterfaceC9303d.C9308e[]{new InterfaceC9303d.C9308e(f, f2, f3)});
        if (Build.VERSION.SDK_INT >= 21) {
            InterfaceC9303d.C9308e revealInfo = interfaceC9303d.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC9303d, (int) f, (int) f2, revealInfo.f21884c, f3);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        return ofObject;
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m15103b(InterfaceC9303d interfaceC9303d) {
        return new C9300a(interfaceC9303d);
    }
}
