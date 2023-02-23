package com.github.ybq.android.spinkit.p093g;

import android.graphics.Canvas;
import android.graphics.Paint;
/* compiled from: CircleSprite.java */
/* renamed from: com.github.ybq.android.spinkit.g.b */
/* loaded from: classes2.dex */
public class C2536b extends AbstractC2539e {
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2539e
    /* renamed from: J */
    public void mo32658J(Canvas canvas, Paint paint) {
        if (m32646d() != null) {
            canvas.drawCircle(m32646d().centerX(), m32646d().centerY(), Math.min(m32646d().width(), m32646d().height()) / 2, paint);
        }
    }
}
