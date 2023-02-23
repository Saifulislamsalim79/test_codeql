package com.google.firebase.inappmessaging.display.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.graphics.Point;
import android.view.View;
/* compiled from: FiamAnimator.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.c */
/* loaded from: classes2.dex */
public class C6038c {

    /* compiled from: FiamAnimator.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.c$a */
    /* loaded from: classes2.dex */
    class C6039a extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ View f14742c;

        /* renamed from: d */
        final /* synthetic */ Application f14743d;

        C6039a(C6038c c6038c, View view, Application application) {
            this.f14742c = view;
            this.f14743d = application;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f14742c.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.f14743d.getResources().getInteger(17694722)).setListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FiamAnimator.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.c$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6040b {

        /* renamed from: a */
        static final /* synthetic */ int[] f14744a;

        static {
            int[] iArr = new int[EnumC6041c.values().length];
            f14744a = iArr;
            try {
                iArr[EnumC6041c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14744a[EnumC6041c.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14744a[EnumC6041c.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14744a[EnumC6041c.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FiamAnimator.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.c$c */
    /* loaded from: classes2.dex */
    public enum EnumC6041c {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static Point m22931b(EnumC6041c enumC6041c, View view) {
            view.measure(-2, -2);
            int i = C6040b.f14744a[enumC6041c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return new Point(0, view.getMeasuredHeight() * (-1));
                        }
                        return new Point(0, view.getMeasuredHeight() * 1);
                    }
                    return new Point(0, view.getMeasuredHeight() * (-1));
                }
                return new Point(view.getMeasuredWidth() * 1, 0);
            }
            return new Point(view.getMeasuredWidth() * (-1), 0);
        }
    }

    /* renamed from: a */
    public void m22933a(Application application, View view, EnumC6041c enumC6041c) {
        view.setAlpha(0.0f);
        Point m22931b = EnumC6041c.m22931b(enumC6041c, view);
        view.animate().translationX(m22931b.x).translationY(m22931b.y).setDuration(1L).setListener(new C6039a(this, view, application));
    }
}
