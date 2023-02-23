package com.github.ybq.android.spinkit.p091f;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
/* compiled from: AnimationUtils.java */
/* renamed from: com.github.ybq.android.spinkit.f.a */
/* loaded from: classes2.dex */
public class C2522a {
    /* renamed from: a */
    public static boolean m32690a(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: b */
    public static boolean m32689b(AbstractC2540f... abstractC2540fArr) {
        for (AbstractC2540f abstractC2540f : abstractC2540fArr) {
            if (abstractC2540f.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m32688c(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* renamed from: d */
    public static void m32687d(Animator animator) {
        if (animator == null || animator.isStarted()) {
            return;
        }
        animator.start();
    }

    /* renamed from: e */
    public static void m32686e(AbstractC2540f... abstractC2540fArr) {
        for (AbstractC2540f abstractC2540f : abstractC2540fArr) {
            abstractC2540f.start();
        }
    }

    /* renamed from: f */
    public static void m32685f(AbstractC2540f... abstractC2540fArr) {
        for (AbstractC2540f abstractC2540f : abstractC2540fArr) {
            abstractC2540f.stop();
        }
    }
}
