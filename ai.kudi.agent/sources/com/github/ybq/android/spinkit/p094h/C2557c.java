package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.AbstractC2552g;
import com.github.ybq.android.spinkit.p093g.C2537c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* compiled from: CubeGrid.java */
/* renamed from: com.github.ybq.android.spinkit.h.c */
/* loaded from: classes2.dex */
public class C2557c extends AbstractC2552g {

    /* compiled from: CubeGrid.java */
    /* renamed from: com.github.ybq.android.spinkit.h.c$b */
    /* loaded from: classes2.dex */
    private class C2559b extends C2537c {
        private C2559b(C2557c c2557c) {
        }

        @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
        /* renamed from: r */
        public ValueAnimator mo32592r() {
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            C2525d c2525d = new C2525d(this);
            Float valueOf = Float.valueOf(1.0f);
            c2525d.m32671l(fArr, valueOf, Float.valueOf(0.0f), valueOf, valueOf);
            c2525d.m32680c(1300L);
            c2525d.m32679d(fArr);
            return c2525d.m32681b();
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        int[] iArr = {200, IjkMediaCodecInfo.RANK_SECURE, 400, 100, 200, IjkMediaCodecInfo.RANK_SECURE, 0, 100, 200};
        C2559b[] c2559bArr = new C2559b[9];
        for (int i = 0; i < 9; i++) {
            c2559bArr[i] = new C2559b();
            c2559bArr[i].m32631t(iArr[i]);
        }
        return c2559bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g, com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m32647a = m32647a(rect);
        int width = (int) (m32647a.width() * 0.33f);
        int height = (int) (m32647a.height() * 0.33f);
        for (int i = 0; i < m32600L(); i++) {
            int i2 = m32647a.left + ((i % 3) * width);
            int i3 = m32647a.top + ((i / 3) * height);
            m32601K(i).m32630v(i2, i3, i2 + width, i3 + height);
        }
    }
}
