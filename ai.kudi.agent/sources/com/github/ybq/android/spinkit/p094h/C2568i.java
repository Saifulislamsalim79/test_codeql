package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.C2536b;
/* compiled from: Pulse.java */
/* renamed from: com.github.ybq.android.spinkit.h.i */
/* loaded from: classes2.dex */
public class C2568i extends C2536b {
    public C2568i() {
        m32654C(0.0f);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: r */
    public ValueAnimator mo32592r() {
        float[] fArr = {0.0f, 1.0f};
        C2525d c2525d = new C2525d(this);
        c2525d.m32671l(fArr, Float.valueOf(0.0f), Float.valueOf(1.0f));
        c2525d.m32682a(fArr, 255, 0);
        c2525d.m32680c(1000L);
        c2525d.m32679d(fArr);
        return c2525d.m32681b();
    }
}
