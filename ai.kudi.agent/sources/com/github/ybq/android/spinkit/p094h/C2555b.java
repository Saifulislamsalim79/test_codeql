package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.os.Build;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2535a;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.C2536b;
/* compiled from: Circle.java */
/* renamed from: com.github.ybq.android.spinkit.h.b */
/* loaded from: classes2.dex */
public class C2555b extends AbstractC2535a {

    /* compiled from: Circle.java */
    /* renamed from: com.github.ybq.android.spinkit.h.b$a */
    /* loaded from: classes2.dex */
    private class C2556a extends C2536b {
        C2556a(C2555b c2555b) {
            m32654C(0.0f);
        }

        @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
        /* renamed from: r */
        public ValueAnimator mo32592r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            C2525d c2525d = new C2525d(this);
            Float valueOf = Float.valueOf(0.0f);
            c2525d.m32671l(fArr, valueOf, Float.valueOf(1.0f), valueOf);
            c2525d.m32680c(1200L);
            c2525d.m32679d(fArr);
            return c2525d.m32681b();
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        C2556a[] c2556aArr = new C2556a[12];
        for (int i = 0; i < 12; i++) {
            c2556aArr[i] = new C2556a(this);
            if (Build.VERSION.SDK_INT >= 24) {
                c2556aArr[i].m32631t(i * 100);
            } else {
                c2556aArr[i].m32631t((i * 100) - 1200);
            }
        }
        return c2556aArr;
    }
}
