package ai.kudi.dip.library.button;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.e0.d.l;
import p201g.p202a.p205l.p206a.C7477c;
/* compiled from: RotatableDrawable.kt */
/* renamed from: ai.kudi.dip.library.button.i */
/* loaded from: classes2.dex */
public final class C0770i extends C7477c {

    /* renamed from: d */
    private float f2181d;

    /* renamed from: e */
    private final Rect f2182e;

    /* renamed from: f */
    private ObjectAnimator f2183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770i(Drawable drawable) {
        super(drawable);
        l.f(drawable, "drawable");
        this.f2182e = new Rect();
    }

    /* renamed from: c */
    public final void m38010c(float f, long j) {
        ObjectAnimator objectAnimator = this.f2183f;
        if (objectAnimator != null) {
            l.d(objectAnimator);
            if (objectAnimator.isStarted()) {
                ObjectAnimator objectAnimator2 = this.f2183f;
                l.d(objectAnimator2);
                objectAnimator2.end();
                ObjectAnimator objectAnimator3 = this.f2183f;
                l.d(objectAnimator3);
                objectAnimator3.setFloatValues(this.f2181d, f);
                ObjectAnimator objectAnimator4 = this.f2183f;
                l.d(objectAnimator4);
                objectAnimator4.setRepeatCount(-1);
                ObjectAnimator objectAnimator5 = this.f2183f;
                l.d(objectAnimator5);
                objectAnimator5.setDuration(j).start();
            }
        }
        if (this.f2183f == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", 0.0f, 0.0f);
            this.f2183f = ofFloat;
            l.d(ofFloat);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ObjectAnimator objectAnimator32 = this.f2183f;
        l.d(objectAnimator32);
        objectAnimator32.setFloatValues(this.f2181d, f);
        ObjectAnimator objectAnimator42 = this.f2183f;
        l.d(objectAnimator42);
        objectAnimator42.setRepeatCount(-1);
        ObjectAnimator objectAnimator52 = this.f2183f;
        l.d(objectAnimator52);
        objectAnimator52.setDuration(j).start();
    }

    @Override // p201g.p202a.p205l.p206a.C7477c, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        copyBounds(this.f2182e);
        canvas.save();
        canvas.rotate(this.f2181d, this.f2182e.centerX(), this.f2182e.centerY());
        super.draw(canvas);
        canvas.restore();
    }
}
