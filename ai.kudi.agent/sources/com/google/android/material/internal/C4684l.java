package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
/* compiled from: StateListAnimator.java */
/* renamed from: com.google.android.material.internal.l */
/* loaded from: classes2.dex */
public final class C4684l {

    /* renamed from: a */
    private final ArrayList<C4686b> f11748a = new ArrayList<>();

    /* renamed from: b */
    private C4686b f11749b = null;

    /* renamed from: c */
    ValueAnimator f11750c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f11751d = new C4685a();

    /* compiled from: StateListAnimator.java */
    /* renamed from: com.google.android.material.internal.l$a */
    /* loaded from: classes2.dex */
    class C4685a extends AnimatorListenerAdapter {
        C4685a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4684l c4684l = C4684l.this;
            if (c4684l.f11750c == animator) {
                c4684l.f11750c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateListAnimator.java */
    /* renamed from: com.google.android.material.internal.l$b */
    /* loaded from: classes2.dex */
    public static class C4686b {

        /* renamed from: a */
        final int[] f11753a;

        /* renamed from: b */
        final ValueAnimator f11754b;

        C4686b(int[] iArr, ValueAnimator valueAnimator) {
            this.f11753a = iArr;
            this.f11754b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m26720b() {
        ValueAnimator valueAnimator = this.f11750c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11750c = null;
        }
    }

    /* renamed from: e */
    private void m26717e(C4686b c4686b) {
        ValueAnimator valueAnimator = c4686b.f11754b;
        this.f11750c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void m26721a(int[] iArr, ValueAnimator valueAnimator) {
        C4686b c4686b = new C4686b(iArr, valueAnimator);
        valueAnimator.addListener(this.f11751d);
        this.f11748a.add(c4686b);
    }

    /* renamed from: c */
    public void m26719c() {
        ValueAnimator valueAnimator = this.f11750c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f11750c = null;
        }
    }

    /* renamed from: d */
    public void m26718d(int[] iArr) {
        C4686b c4686b;
        int size = this.f11748a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c4686b = null;
                break;
            }
            c4686b = this.f11748a.get(i);
            if (StateSet.stateSetMatches(c4686b.f11753a, iArr)) {
                break;
            }
            i++;
        }
        C4686b c4686b2 = this.f11749b;
        if (c4686b == c4686b2) {
            return;
        }
        if (c4686b2 != null) {
            m26720b();
        }
        this.f11749b = c4686b;
        if (c4686b != null) {
            m26717e(c4686b);
        }
    }
}
