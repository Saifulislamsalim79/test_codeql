package com.github.ybq.android.spinkit.p093g;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.github.ybq.android.spinkit.p091f.C2522a;
/* compiled from: SpriteContainer.java */
/* renamed from: com.github.ybq.android.spinkit.g.g */
/* loaded from: classes2.dex */
public abstract class AbstractC2552g extends AbstractC2540f {

    /* renamed from: T */
    private AbstractC2540f[] f7204T = mo32593O();

    /* renamed from: U */
    private int f7205U;

    public AbstractC2552g() {
        m32599M();
        mo32594N(this.f7204T);
    }

    /* renamed from: M */
    private void m32599M() {
        AbstractC2540f[] abstractC2540fArr = this.f7204T;
        if (abstractC2540fArr != null) {
            for (AbstractC2540f abstractC2540f : abstractC2540fArr) {
                abstractC2540f.setCallback(this);
            }
        }
    }

    /* renamed from: J */
    public void mo32595J(Canvas canvas) {
        AbstractC2540f[] abstractC2540fArr = this.f7204T;
        if (abstractC2540fArr != null) {
            for (AbstractC2540f abstractC2540f : abstractC2540fArr) {
                int save = canvas.save();
                abstractC2540f.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: K */
    public AbstractC2540f m32601K(int i) {
        AbstractC2540f[] abstractC2540fArr = this.f7204T;
        if (abstractC2540fArr == null) {
            return null;
        }
        return abstractC2540fArr[i];
    }

    /* renamed from: L */
    public int m32600L() {
        AbstractC2540f[] abstractC2540fArr = this.f7204T;
        if (abstractC2540fArr == null) {
            return 0;
        }
        return abstractC2540fArr.length;
    }

    /* renamed from: N */
    public void mo32594N(AbstractC2540f... abstractC2540fArr) {
    }

    /* renamed from: O */
    public abstract AbstractC2540f[] mo32593O();

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: b */
    protected void mo32598b(Canvas canvas) {
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: c */
    public int mo32597c() {
        return this.f7205U;
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo32595J(canvas);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Animatable
    public boolean isRunning() {
        return C2522a.m32689b(this.f7204T) || super.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (AbstractC2540f abstractC2540f : this.f7204T) {
            abstractC2540f.setBounds(rect);
        }
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: r */
    public ValueAnimator mo32592r() {
        return null;
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        C2522a.m32686e(this.f7204T);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
        C2522a.m32685f(this.f7204T);
    }

    @Override // com.github.ybq.android.spinkit.p093g.AbstractC2540f
    /* renamed from: u */
    public void mo32596u(int i) {
        this.f7205U = i;
        for (int i2 = 0; i2 < m32600L(); i2++) {
            m32601K(i2).mo32596u(i);
        }
    }
}
