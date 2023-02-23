package com.github.ybq.android.spinkit.p093g;

import android.graphics.Canvas;
import android.graphics.Paint;
/* compiled from: RingSprite.java */
/* renamed from: com.github.ybq.android.spinkit.g.d */
/* loaded from: classes2.dex */
public class C2538d extends AbstractC2539e {
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2539e
    /* renamed from: J */
    public void mo32658J(Canvas canvas, Paint paint) {
        if (m32646d() != null) {
            paint.setStyle(Paint.Style.STROKE);
            int min = Math.min(m32646d().width(), m32646d().height()) / 2;
            paint.setStrokeWidth(min / 12);
            canvas.drawCircle(m32646d().centerX(), m32646d().centerY(), min, paint);
        }
    }
}
