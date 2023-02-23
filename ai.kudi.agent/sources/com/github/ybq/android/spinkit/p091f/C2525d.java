package com.github.ybq.android.spinkit.p091f;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.util.Property;
import android.view.animation.Interpolator;
import com.github.ybq.android.spinkit.p091f.p092e.animationInterpolatorC2530b;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: SpriteAnimatorBuilder.java */
/* renamed from: com.github.ybq.android.spinkit.f.d */
/* loaded from: classes2.dex */
public class C2525d {

    /* renamed from: a */
    private AbstractC2540f f7161a;

    /* renamed from: b */
    private Interpolator f7162b;

    /* renamed from: c */
    private int f7163c = -1;

    /* renamed from: d */
    private long f7164d = 2000;

    /* renamed from: e */
    private int f7165e = 0;

    /* renamed from: f */
    private Map<String, C2527b> f7166f = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpriteAnimatorBuilder.java */
    /* renamed from: com.github.ybq.android.spinkit.f.d$a */
    /* loaded from: classes2.dex */
    public class C2526a extends C2527b<Float> {
        public C2526a(C2525d c2525d, float[] fArr, Property property, Float[] fArr2) {
            super(c2525d, fArr, property, fArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpriteAnimatorBuilder.java */
    /* renamed from: com.github.ybq.android.spinkit.f.d$b */
    /* loaded from: classes2.dex */
    public class C2527b<T> {

        /* renamed from: a */
        float[] f7167a;

        /* renamed from: b */
        Property f7168b;

        /* renamed from: c */
        T[] f7169c;

        public C2527b(C2525d c2525d, float[] fArr, Property property, T[] tArr) {
            this.f7167a = fArr;
            this.f7168b = property;
            this.f7169c = tArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpriteAnimatorBuilder.java */
    /* renamed from: com.github.ybq.android.spinkit.f.d$c */
    /* loaded from: classes2.dex */
    public class C2528c extends C2527b<Integer> {
        public C2528c(C2525d c2525d, float[] fArr, Property property, Integer[] numArr) {
            super(c2525d, fArr, property, numArr);
        }
    }

    public C2525d(AbstractC2540f abstractC2540f) {
        this.f7161a = abstractC2540f;
    }

    /* renamed from: e */
    private void m32678e(int i, int i2) {
        if (i != i2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: f */
    private void m32677f(float[] fArr, Property property, Float[] fArr2) {
        m32678e(fArr.length, fArr2.length);
        this.f7166f.put(property.getName(), new C2526a(this, fArr, property, fArr2));
    }

    /* renamed from: g */
    private void m32676g(float[] fArr, Property property, Integer[] numArr) {
        m32678e(fArr.length, numArr.length);
        this.f7166f.put(property.getName(), new C2528c(this, fArr, property, numArr));
    }

    /* renamed from: a */
    public C2525d m32682a(float[] fArr, Integer... numArr) {
        m32676g(fArr, AbstractC2540f.f7185S, numArr);
        return this;
    }

    /* renamed from: b */
    public ObjectAnimator m32681b() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.f7166f.size()];
        int i = 0;
        for (Map.Entry<String, C2527b> entry : this.f7166f.entrySet()) {
            C2527b value = entry.getValue();
            float[] fArr = value.f7167a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i2 = this.f7165e;
            float f = fArr[i2];
            while (true) {
                int i3 = this.f7165e;
                T[] tArr = value.f7169c;
                if (i2 < tArr.length + i3) {
                    int i4 = i2 - i3;
                    int length = i2 % tArr.length;
                    float f2 = fArr[length] - f;
                    if (f2 < 0.0f) {
                        f2 += fArr[fArr.length - 1];
                    }
                    if (value instanceof C2528c) {
                        keyframeArr[i4] = Keyframe.ofInt(f2, ((Integer) value.f7169c[length]).intValue());
                    } else if (value instanceof C2526a) {
                        keyframeArr[i4] = Keyframe.ofFloat(f2, ((Float) value.f7169c[length]).floatValue());
                    } else {
                        keyframeArr[i4] = Keyframe.ofObject(f2, value.f7169c[length]);
                    }
                    i2++;
                }
            }
            propertyValuesHolderArr[i] = PropertyValuesHolder.ofKeyframe(value.f7168b, keyframeArr);
            i++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f7161a, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.f7164d);
        ofPropertyValuesHolder.setRepeatCount(this.f7163c);
        ofPropertyValuesHolder.setInterpolator(this.f7162b);
        return ofPropertyValuesHolder;
    }

    /* renamed from: c */
    public C2525d m32680c(long j) {
        this.f7164d = j;
        return this;
    }

    /* renamed from: d */
    public C2525d m32679d(float... fArr) {
        m32675h(animationInterpolatorC2530b.m32665a(fArr));
        return this;
    }

    /* renamed from: h */
    public C2525d m32675h(Interpolator interpolator) {
        this.f7162b = interpolator;
        return this;
    }

    /* renamed from: i */
    public C2525d m32674i(float[] fArr, Integer... numArr) {
        m32676g(fArr, AbstractC2540f.f7179M, numArr);
        return this;
    }

    /* renamed from: j */
    public C2525d m32673j(float[] fArr, Integer... numArr) {
        m32676g(fArr, AbstractC2540f.f7178L, numArr);
        return this;
    }

    /* renamed from: k */
    public C2525d m32672k(float[] fArr, Integer... numArr) {
        m32676g(fArr, AbstractC2540f.f7180N, numArr);
        return this;
    }

    /* renamed from: l */
    public C2525d m32671l(float[] fArr, Float... fArr2) {
        m32677f(fArr, AbstractC2540f.f7184R, fArr2);
        return this;
    }

    /* renamed from: m */
    public C2525d m32670m(float[] fArr, Float... fArr2) {
        m32677f(fArr, AbstractC2540f.f7183Q, fArr2);
        return this;
    }

    /* renamed from: n */
    public C2525d m32669n(int i) {
        if (i < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            i = 0;
        }
        this.f7165e = i;
        return this;
    }

    /* renamed from: o */
    public C2525d m32668o(float[] fArr, Float... fArr2) {
        m32677f(fArr, AbstractC2540f.f7181O, fArr2);
        return this;
    }

    /* renamed from: p */
    public C2525d m32667p(float[] fArr, Float... fArr2) {
        m32677f(fArr, AbstractC2540f.f7182P, fArr2);
        return this;
    }
}
