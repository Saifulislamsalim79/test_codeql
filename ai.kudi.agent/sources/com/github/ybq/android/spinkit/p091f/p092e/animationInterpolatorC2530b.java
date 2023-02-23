package com.github.ybq.android.spinkit.p091f.p092e;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
/* compiled from: KeyFrameInterpolator.java */
/* renamed from: com.github.ybq.android.spinkit.f.e.b  reason: invalid class name */
/* loaded from: classes2.dex */
public class animationInterpolatorC2530b implements Interpolator {

    /* renamed from: a */
    private TimeInterpolator f7170a;

    /* renamed from: b */
    private float[] f7171b;

    public animationInterpolatorC2530b(TimeInterpolator timeInterpolator, float... fArr) {
        this.f7170a = timeInterpolator;
        this.f7171b = fArr;
    }

    /* renamed from: a */
    public static animationInterpolatorC2530b m32665a(float... fArr) {
        animationInterpolatorC2530b animationinterpolatorc2530b = new animationInterpolatorC2530b(C2529a.m32666a(), new float[0]);
        animationinterpolatorc2530b.m32663c(fArr);
        return animationinterpolatorc2530b;
    }

    /* renamed from: b */
    public static animationInterpolatorC2530b m32664b(float f, float f2, float f3, float f4, float... fArr) {
        animationInterpolatorC2530b animationinterpolatorc2530b = new animationInterpolatorC2530b(C2531c.m32662a(f, f2, f3, f4), new float[0]);
        animationinterpolatorc2530b.m32663c(fArr);
        return animationinterpolatorc2530b;
    }

    /* renamed from: c */
    public void m32663c(float... fArr) {
        this.f7171b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (this.f7171b.length > 1) {
            int i = 0;
            while (true) {
                float[] fArr = this.f7171b;
                if (i >= fArr.length - 1) {
                    break;
                }
                float f2 = fArr[i];
                i++;
                float f3 = fArr[i];
                float f4 = f3 - f2;
                if (f >= f2 && f <= f3) {
                    return f2 + (this.f7170a.getInterpolation((f - f2) / f4) * f4);
                }
            }
        }
        return this.f7170a.getInterpolation(f);
    }
}
