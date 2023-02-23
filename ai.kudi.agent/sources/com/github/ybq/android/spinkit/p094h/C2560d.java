package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.os.Build;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.AbstractC2552g;
import com.github.ybq.android.spinkit.p093g.C2536b;
/* compiled from: DoubleBounce.java */
/* renamed from: com.github.ybq.android.spinkit.h.d */
/* loaded from: classes2.dex */
public class C2560d extends AbstractC2552g {

    /* compiled from: DoubleBounce.java */
    /* renamed from: com.github.ybq.android.spinkit.h.d$a */
    /* loaded from: classes2.dex */
    private class C2561a extends C2536b {
        C2561a(C2560d c2560d) {
            setAlpha(153);
            m32654C(0.0f);
        }

        @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
        /* renamed from: r */
        public ValueAnimator mo32592r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            C2525d c2525d = new C2525d(this);
            Float valueOf = Float.valueOf(0.0f);
            c2525d.m32671l(fArr, valueOf, Float.valueOf(1.0f), valueOf);
            c2525d.m32680c(2000L);
            c2525d.m32679d(fArr);
            return c2525d.m32681b();
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: N */
    public void mo32594N(AbstractC2540f... abstractC2540fArr) {
        super.mo32594N(abstractC2540fArr);
        if (Build.VERSION.SDK_INT >= 24) {
            abstractC2540fArr[1].m32631t(1000);
        } else {
            abstractC2540fArr[1].m32631t(-1000);
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        return new AbstractC2540f[]{new C2561a(this), new C2561a(this)};
    }
}
