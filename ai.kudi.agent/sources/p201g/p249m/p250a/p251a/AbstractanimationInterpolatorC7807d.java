package p201g.p249m.p250a.p251a;

import android.view.animation.Interpolator;
/* compiled from: LookupTableInterpolator.java */
/* renamed from: g.m.a.a.d  reason: invalid class name */
/* loaded from: classes2.dex */
abstract class AbstractanimationInterpolatorC7807d implements Interpolator {

    /* renamed from: a */
    private final float[] f18652a;

    /* renamed from: b */
    private final float f18653b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractanimationInterpolatorC7807d(float[] fArr) {
        this.f18652a = fArr;
        this.f18653b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f18652a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f18653b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f18652a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
