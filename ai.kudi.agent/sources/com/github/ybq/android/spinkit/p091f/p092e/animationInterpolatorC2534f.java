package com.github.ybq.android.spinkit.p091f.p092e;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
/* compiled from: PathInterpolatorDonut.java */
/* renamed from: com.github.ybq.android.spinkit.f.e.f  reason: invalid class name */
/* loaded from: classes2.dex */
class animationInterpolatorC2534f implements Interpolator {

    /* renamed from: a */
    private final float[] f7172a;

    /* renamed from: b */
    private final float[] f7173b;

    public animationInterpolatorC2534f(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f7172a = new float[i];
        this.f7173b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.f7172a[i2] = fArr[0];
            this.f7173b[i2] = fArr[1];
        }
    }

    /* renamed from: a */
    private static Path m32659a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f7172a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f7172a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f7172a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f7173b[i];
        }
        float[] fArr2 = this.f7173b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public animationInterpolatorC2534f(float f, float f2, float f3, float f4) {
        this(m32659a(f, f2, f3, f4));
    }
}
