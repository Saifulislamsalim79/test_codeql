package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.AbstractC2552g;
import com.github.ybq.android.spinkit.p093g.C2536b;
/* compiled from: ThreeBounce.java */
/* renamed from: com.github.ybq.android.spinkit.h.m */
/* loaded from: classes2.dex */
public class C2572m extends AbstractC2552g {

    /* compiled from: ThreeBounce.java */
    /* renamed from: com.github.ybq.android.spinkit.h.m$a */
    /* loaded from: classes2.dex */
    private class C2573a extends C2536b {
        C2573a(C2572m c2572m) {
            m32654C(0.0f);
        }

        @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
        /* renamed from: r */
        public ValueAnimator mo32592r() {
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            C2525d c2525d = new C2525d(this);
            Float valueOf = Float.valueOf(0.0f);
            c2525d.m32671l(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf);
            c2525d.m32680c(1400L);
            c2525d.m32679d(fArr);
            return c2525d.m32681b();
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: N */
    public void mo32594N(AbstractC2540f... abstractC2540fArr) {
        super.mo32594N(abstractC2540fArr);
        abstractC2540fArr[1].m32631t(160);
        abstractC2540fArr[2].m32631t(320);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        return new AbstractC2540f[]{new C2573a(this), new C2573a(this), new C2573a(this)};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g, com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m32647a = m32647a(rect);
        int width = m32647a.width() / 8;
        int centerY = m32647a.centerY() - width;
        int centerY2 = m32647a.centerY() + width;
        for (int i = 0; i < m32600L(); i++) {
            int width2 = ((m32647a.width() * i) / 3) + m32647a.left;
            m32601K(i).m32630v(width2, centerY, (width * 2) + width2, centerY2);
        }
    }
}
