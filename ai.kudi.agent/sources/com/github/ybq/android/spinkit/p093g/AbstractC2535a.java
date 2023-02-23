package com.github.ybq.android.spinkit.p093g;

import android.graphics.Canvas;
import android.graphics.Rect;
/* compiled from: CircleLayoutContainer.java */
/* renamed from: com.github.ybq.android.spinkit.g.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2535a extends AbstractC2552g {
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g
    /* renamed from: J */
    public void mo32595J(Canvas canvas) {
        for (int i = 0; i < m32600L(); i++) {
            AbstractC2540f m32601K = m32601K(i);
            int save = canvas.save();
            canvas.rotate((i * 360) / m32600L(), getBounds().centerX(), getBounds().centerY());
            m32601K.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2552g, com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m32647a = m32647a(rect);
        double width = m32647a.width();
        Double.isNaN(width);
        double m32600L = m32600L();
        Double.isNaN(m32600L);
        int i = (int) (((width * 3.141592653589793d) / 3.5999999046325684d) / m32600L);
        int centerX = m32647a.centerX() - i;
        int centerX2 = m32647a.centerX() + i;
        for (int i2 = 0; i2 < m32600L(); i2++) {
            AbstractC2540f m32601K = m32601K(i2);
            int i3 = m32647a.top;
            m32601K.m32630v(centerX, i3, centerX2, (i * 2) + i3);
        }
    }
}
