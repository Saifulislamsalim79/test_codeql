package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p091f.p092e.animationInterpolatorC2530b;
import com.github.ybq.android.spinkit.p093g.C2538d;
/* compiled from: PulseRing.java */
/* renamed from: com.github.ybq.android.spinkit.h.j */
/* loaded from: classes2.dex */
public class C2569j extends C2538d {
    public C2569j() {
        m32654C(0.0f);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: r */
    public ValueAnimator mo32592r() {
        float[] fArr = {0.0f, 0.7f, 1.0f};
        C2525d c2525d = new C2525d(this);
        Float valueOf = Float.valueOf(1.0f);
        c2525d.m32671l(fArr, Float.valueOf(0.0f), valueOf, valueOf);
        c2525d.m32682a(fArr, 255, 178, 0);
        c2525d.m32680c(1000L);
        c2525d.m32675h(animationInterpolatorC2530b.m32664b(0.21f, 0.53f, 0.56f, 0.8f, fArr));
        return c2525d.m32681b();
    }
}
