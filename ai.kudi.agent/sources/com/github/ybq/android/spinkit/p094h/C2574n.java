package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.AbstractC2552g;
import com.github.ybq.android.spinkit.p093g.C2537c;
/* compiled from: WanderingCubes.java */
/* renamed from: com.github.ybq.android.spinkit.h.n */
/* loaded from: classes2.dex */
public class C2574n extends AbstractC2552g {

    /* compiled from: WanderingCubes.java */
    /* renamed from: com.github.ybq.android.spinkit.h.n$a */
    /* loaded from: classes2.dex */
    private class C2575a extends C2537c {

        /* renamed from: W */
        int f7207W;

        public C2575a(C2574n c2574n, int i) {
            this.f7207W = i;
        }

        @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
        /* renamed from: r */
        public ValueAnimator mo32592r() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            C2525d c2525d = new C2525d(this);
            c2525d.m32674i(fArr, 0, -90, -179, -180, -270, -360);
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(0.75f);
            c2525d.m32668o(fArr, valueOf, valueOf2, valueOf2, valueOf2, valueOf, valueOf);
            c2525d.m32667p(fArr, valueOf, valueOf, valueOf2, valueOf2, valueOf2, valueOf);
            Float valueOf3 = Float.valueOf(1.0f);
            Float valueOf4 = Float.valueOf(0.5f);
            c2525d.m32671l(fArr, valueOf3, valueOf4, valueOf3, valueOf3, valueOf4, valueOf3);
            c2525d.m32680c(1800L);
            c2525d.m32679d(fArr);
            if (Build.VERSION.SDK_INT >= 24) {
                c2525d.m32669n(this.f7207W);
            }
            return c2525d.m32681b();
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: N */
    public void mo32594N(AbstractC2540f... abstractC2540fArr) {
        super.mo32594N(abstractC2540fArr);
        if (Build.VERSION.SDK_INT < 24) {
            abstractC2540fArr[1].m32631t(-900);
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        return new AbstractC2540f[]{new C2575a(this, 0), new C2575a(this, 3)};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g, com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Rect m32647a = m32647a(rect);
        super.onBoundsChange(m32647a);
        for (int i = 0; i < m32600L(); i++) {
            AbstractC2540f m32601K = m32601K(i);
            int i2 = m32647a.left;
            m32601K.m32630v(i2, m32647a.top, (m32647a.width() / 4) + i2, m32647a.top + (m32647a.height() / 4));
        }
    }
}
