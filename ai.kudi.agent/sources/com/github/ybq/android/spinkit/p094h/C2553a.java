package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.AbstractC2552g;
import com.github.ybq.android.spinkit.p093g.C2536b;
/* compiled from: ChasingDots.java */
/* renamed from: com.github.ybq.android.spinkit.h.a */
/* loaded from: classes2.dex */
public class C2553a extends AbstractC2552g {

    /* compiled from: ChasingDots.java */
    /* renamed from: com.github.ybq.android.spinkit.h.a$a */
    /* loaded from: classes2.dex */
    private class C2554a extends C2536b {
        C2554a(C2553a c2553a) {
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
        return new AbstractC2540f[]{new C2554a(this), new C2554a(this)};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g, com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m32647a = m32647a(rect);
        int width = (int) (m32647a.width() * 0.6f);
        AbstractC2540f m32601K = m32601K(0);
        int i = m32647a.right;
        int i2 = m32647a.top;
        m32601K.m32630v(i - width, i2, i, i2 + width);
        AbstractC2540f m32601K2 = m32601K(1);
        int i3 = m32647a.right;
        int i4 = m32647a.bottom;
        m32601K2.m32630v(i3 - width, i4 - width, i3, i4);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g, com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: r */
    public ValueAnimator mo32592r() {
        C2525d c2525d = new C2525d(this);
        c2525d.m32674i(new float[]{0.0f, 1.0f}, 0, 360);
        c2525d.m32680c(2000L);
        c2525d.m32675h(new LinearInterpolator());
        return c2525d.m32681b();
    }
}
