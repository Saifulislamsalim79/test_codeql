package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.C2536b;
/* compiled from: RotatingCircle.java */
/* renamed from: com.github.ybq.android.spinkit.h.k */
/* loaded from: classes2.dex */
public class C2570k extends C2536b {
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: r */
    public ValueAnimator mo32592r() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        C2525d c2525d = new C2525d(this);
        c2525d.m32673j(fArr, 0, -180, -180);
        c2525d.m32672k(fArr, 0, 0, -180);
        c2525d.m32680c(1200L);
        c2525d.m32679d(fArr);
        return c2525d.m32681b();
    }
}
