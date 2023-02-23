package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.AbstractC2552g;
import com.github.ybq.android.spinkit.p093g.C2537c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* compiled from: Wave.java */
/* renamed from: com.github.ybq.android.spinkit.h.o */
/* loaded from: classes2.dex */
public class C2576o extends AbstractC2552g {

    /* compiled from: Wave.java */
    /* renamed from: com.github.ybq.android.spinkit.h.o$a */
    /* loaded from: classes2.dex */
    private class C2577a extends C2537c {
        C2577a(C2576o c2576o) {
            m32652E(0.4f);
        }

        @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
        /* renamed from: r */
        public ValueAnimator mo32592r() {
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            C2525d c2525d = new C2525d(this);
            Float valueOf = Float.valueOf(0.4f);
            c2525d.m32670m(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf);
            c2525d.m32680c(1200L);
            c2525d.m32679d(fArr);
            return c2525d.m32681b();
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        C2577a[] c2577aArr = new C2577a[5];
        for (int i = 0; i < 5; i++) {
            c2577aArr[i] = new C2577a(this);
            if (Build.VERSION.SDK_INT >= 24) {
                c2577aArr[i].m32631t((i * 100) + IjkMediaCodecInfo.RANK_LAST_CHANCE);
            } else {
                c2577aArr[i].m32631t((i * 100) - 1200);
            }
        }
        return c2577aArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g, com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m32647a = m32647a(rect);
        int width = m32647a.width() / m32600L();
        int width2 = ((m32647a.width() / 5) * 3) / 5;
        for (int i = 0; i < m32600L(); i++) {
            AbstractC2540f m32601K = m32601K(i);
            int i2 = m32647a.left + (i * width) + (width / 5);
            m32601K.m32630v(i2, m32647a.top, i2 + width2, m32647a.bottom);
        }
    }
}
