package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
/* compiled from: CutoutDrawable.java */
/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes2.dex */
class C4778c extends C9243g {

    /* renamed from: Q */
    private final Paint f12089Q;

    /* renamed from: R */
    private final RectF f12090R;

    /* renamed from: S */
    private int f12091S;

    C4778c() {
        this(null);
    }

    /* renamed from: l0 */
    private void m26364l0(Canvas canvas) {
        if (m26357s0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f12091S);
    }

    /* renamed from: m0 */
    private void m26363m0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m26357s0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m26361o0(canvas);
    }

    /* renamed from: o0 */
    private void m26361o0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f12091S = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.f12091S = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    /* renamed from: r0 */
    private void m26358r0() {
        this.f12089Q.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f12089Q.setColor(-1);
        this.f12089Q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: s0 */
    private boolean m26357s0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.C9243g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m26363m0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f12090R, this.f12089Q);
        m26364l0(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public boolean m26365k0() {
        return !this.f12090R.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void m26362n0() {
        m26360p0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: p0 */
    void m26360p0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f12090R;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        this.f12090R.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m26359q0(RectF rectF) {
        m26360p0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4778c(C9250k c9250k) {
        super(c9250k == null ? new C9250k() : c9250k);
        this.f12089Q = new Paint(1);
        m26358r0();
        this.f12090R = new RectF();
    }
}
