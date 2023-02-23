package com.github.ybq.android.spinkit.p093g;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
/* compiled from: ShapeSprite.java */
/* renamed from: com.github.ybq.android.spinkit.g.e */
/* loaded from: classes2.dex */
public abstract class AbstractC2539e extends AbstractC2540f {

    /* renamed from: T */
    private Paint f7174T;

    /* renamed from: U */
    private int f7175U;

    /* renamed from: V */
    private int f7176V;

    public AbstractC2539e() {
        mo32596u(-1);
        Paint paint = new Paint();
        this.f7174T = paint;
        paint.setAntiAlias(true);
        this.f7174T.setColor(this.f7175U);
    }

    /* renamed from: K */
    private void m32657K() {
        int alpha = getAlpha();
        int i = this.f7176V;
        this.f7175U = ((((i >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24) | ((i << 8) >>> 8);
    }

    /* renamed from: J */
    public abstract void mo32658J(Canvas canvas, Paint paint);

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: b */
    protected final void mo32598b(Canvas canvas) {
        this.f7174T.setColor(this.f7175U);
        mo32658J(canvas, this.f7174T);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: c */
    public int mo32597c() {
        return this.f7176V;
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        m32657K();
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7174T.setColorFilter(colorFilter);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: u */
    public void mo32596u(int i) {
        this.f7176V = i;
        m32657K();
    }
}
