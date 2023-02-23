package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircleImageView.java */
/* renamed from: androidx.swiperefreshlayout.widget.a */
/* loaded from: classes2.dex */
public class C1880a extends ImageView {

    /* renamed from: c */
    private Animation.AnimationListener f5712c;

    /* renamed from: d */
    int f5713d;

    /* compiled from: CircleImageView.java */
    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* loaded from: classes2.dex */
    private class C1881a extends OvalShape {

        /* renamed from: c */
        private RadialGradient f5714c;

        /* renamed from: d */
        private Paint f5715d = new Paint();

        C1881a(int i) {
            C1880a.this.f5713d = i;
            m34366a((int) rect().width());
        }

        /* renamed from: a */
        private void m34366a(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C1880a.this.f5713d, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f5714c = radialGradient;
            this.f5715d.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = C1880a.this.getWidth() / 2;
            float height = C1880a.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f5715d);
            canvas.drawCircle(width2, height, width - C1880a.this.f5713d, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m34366a((int) f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1880a(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f5713d = (int) (3.5f * f);
        if (m34368a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C7759x.m17484w0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1881a(this.f5713d));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f5713d, i3, i2, 503316480);
            int i4 = this.f5713d;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C7759x.m17492s0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m34368a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void m34367b(Animation.AnimationListener animationListener) {
        this.f5712c = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f5712c;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f5712c;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m34368a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f5713d * 2), getMeasuredHeight() + (this.f5713d * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
