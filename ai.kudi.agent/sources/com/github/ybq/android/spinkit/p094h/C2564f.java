package com.github.ybq.android.spinkit.p094h;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import com.github.ybq.android.spinkit.p091f.C2525d;
import com.github.ybq.android.spinkit.p093g.AbstractC2540f;
import com.github.ybq.android.spinkit.p093g.AbstractC2552g;
import com.github.ybq.android.spinkit.p093g.C2537c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* compiled from: FoldingCube.java */
/* renamed from: com.github.ybq.android.spinkit.h.f */
/* loaded from: classes2.dex */
public class C2564f extends AbstractC2552g {

    /* renamed from: V */
    private boolean f7206V = false;

    /* compiled from: FoldingCube.java */
    /* renamed from: com.github.ybq.android.spinkit.h.f$a */
    /* loaded from: classes2.dex */
    private class C2565a extends C2537c {
        C2565a(C2564f c2564f) {
            setAlpha(0);
            m32656A(-180);
        }

        @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
        /* renamed from: r */
        public ValueAnimator mo32592r() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            C2525d c2525d = new C2525d(this);
            c2525d.m32682a(fArr, 0, 0, 255, 255, 0, 0);
            c2525d.m32673j(fArr, -180, -180, 0, 0, 0, 0);
            c2525d.m32672k(fArr, 0, 0, 0, 0, 180, 180);
            c2525d.m32680c(2400L);
            c2525d.m32675h(new LinearInterpolator());
            return c2525d.m32681b();
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: J */
    public void mo32595J(Canvas canvas) {
        Rect m32647a = m32647a(getBounds());
        for (int i = 0; i < m32600L(); i++) {
            int save = canvas.save();
            canvas.rotate((i * 90) + 45, m32647a.centerX(), m32647a.centerY());
            m32601K(i).draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: O */
    public AbstractC2540f[] mo32593O() {
        C2565a[] c2565aArr = new C2565a[4];
        for (int i = 0; i < 4; i++) {
            c2565aArr[i] = new C2565a(this);
            if (Build.VERSION.SDK_INT >= 24) {
                c2565aArr[i].m32631t(i * IjkMediaCodecInfo.RANK_SECURE);
            } else {
                c2565aArr[i].m32631t((i * IjkMediaCodecInfo.RANK_SECURE) - 1200);
            }
        }
        return c2565aArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g, com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m32647a = m32647a(rect);
        int min = Math.min(m32647a.width(), m32647a.height());
        if (this.f7206V) {
            min = (int) Math.sqrt((min * min) / 2);
            int width = (m32647a.width() - min) / 2;
            int height = (m32647a.height() - min) / 2;
            m32647a = new Rect(m32647a.left + width, m32647a.top + height, m32647a.right - width, m32647a.bottom - height);
        }
        int i = min / 2;
        int i2 = m32647a.left + i + 1;
        int i3 = m32647a.top + i + 1;
        for (int i4 = 0; i4 < m32600L(); i4++) {
            AbstractC2540f m32601K = m32601K(i4);
            m32601K.m32630v(m32647a.left, m32647a.top, i2, i3);
            m32601K.m32628x(m32601K.m32646d().right);
            m32601K.m32627y(m32601K.m32646d().bottom);
        }
    }
}
