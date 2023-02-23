package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.os.Build;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2535a;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.C2536b;
/* compiled from: FadingCircle.java */
/* renamed from: com.github.ybq.android.spinkit.h.e */
/* loaded from: classes2.dex */
public class C2562e extends AbstractC2535a {

    /* compiled from: FadingCircle.java */
    /* renamed from: com.github.ybq.android.spinkit.h.e$a */
    /* loaded from: classes2.dex */
    private class C2563a extends C2536b {
        C2563a(C2562e c2562e) {
            setAlpha(0);
        }

        @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
        /* renamed from: r */
        public ValueAnimator mo32592r() {
            float[] fArr = {0.0f, 0.39f, 0.4f, 1.0f};
            C2525d c2525d = new C2525d(this);
            c2525d.m32682a(fArr, 0, 0, 255, 0);
            c2525d.m32680c(1200L);
            c2525d.m32679d(fArr);
            return c2525d.m32681b();
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        C2563a[] c2563aArr = new C2563a[12];
        for (int i = 0; i < 12; i++) {
            c2563aArr[i] = new C2563a(this);
            if (Build.VERSION.SDK_INT >= 24) {
                c2563aArr[i].m32631t(i * 100);
            } else {
                c2563aArr[i].m32631t((i * 100) - 1200);
            }
        }
        return c2563aArr;
    }
}
