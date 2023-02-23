package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public class CircleImageView extends ImageView {

    /* renamed from: M */
    private static final ImageView.ScaleType f17585M = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: N */
    private static final Bitmap.Config f17586N = Bitmap.Config.ARGB_8888;

    /* renamed from: A */
    private int f17587A;

    /* renamed from: B */
    private Bitmap f17588B;

    /* renamed from: C */
    private BitmapShader f17589C;

    /* renamed from: D */
    private int f17590D;

    /* renamed from: E */
    private int f17591E;

    /* renamed from: F */
    private float f17592F;

    /* renamed from: G */
    private float f17593G;

    /* renamed from: H */
    private ColorFilter f17594H;

    /* renamed from: I */
    private boolean f17595I;

    /* renamed from: J */
    private boolean f17596J;

    /* renamed from: K */
    private boolean f17597K;

    /* renamed from: L */
    private boolean f17598L;

    /* renamed from: c */
    private final RectF f17599c;

    /* renamed from: d */
    private final RectF f17600d;

    /* renamed from: e */
    private final Matrix f17601e;

    /* renamed from: f */
    private final Paint f17602f;

    /* renamed from: w */
    private final Paint f17603w;

    /* renamed from: x */
    private final Paint f17604x;

    /* renamed from: y */
    private int f17605y;

    /* renamed from: z */
    private int f17606z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: de.hdodenhof.circleimageview.CircleImageView$b */
    /* loaded from: classes2.dex */
    public class C7431b extends ViewOutlineProvider {
        private C7431b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.f17600d.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m18749b() {
        Paint paint = this.f17602f;
        if (paint != null) {
            paint.setColorFilter(this.f17594H);
        }
    }

    /* renamed from: c */
    private RectF m18748c() {
        int width;
        int height;
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((width - min) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - min) / 2.0f);
        float f = min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    /* renamed from: d */
    private Bitmap m18747d(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, f17586N);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f17586N);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    private void m18746e() {
        super.setScaleType(f17585M);
        this.f17595I = true;
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C7431b());
        }
        if (this.f17596J) {
            m18744g();
            this.f17596J = false;
        }
    }

    /* renamed from: f */
    private void m18745f() {
        if (this.f17598L) {
            this.f17588B = null;
        } else {
            this.f17588B = m18747d(getDrawable());
        }
        m18744g();
    }

    /* renamed from: g */
    private void m18744g() {
        int i;
        if (!this.f17595I) {
            this.f17596J = true;
        } else if (getWidth() == 0 && getHeight() == 0) {
        } else {
            if (this.f17588B == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.f17588B;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f17589C = new BitmapShader(bitmap, tileMode, tileMode);
            this.f17602f.setAntiAlias(true);
            this.f17602f.setShader(this.f17589C);
            this.f17603w.setStyle(Paint.Style.STROKE);
            this.f17603w.setAntiAlias(true);
            this.f17603w.setColor(this.f17605y);
            this.f17603w.setStrokeWidth(this.f17606z);
            this.f17604x.setStyle(Paint.Style.FILL);
            this.f17604x.setAntiAlias(true);
            this.f17604x.setColor(this.f17587A);
            this.f17591E = this.f17588B.getHeight();
            this.f17590D = this.f17588B.getWidth();
            this.f17600d.set(m18748c());
            this.f17593G = Math.min((this.f17600d.height() - this.f17606z) / 2.0f, (this.f17600d.width() - this.f17606z) / 2.0f);
            this.f17599c.set(this.f17600d);
            if (!this.f17597K && (i = this.f17606z) > 0) {
                this.f17599c.inset(i - 1.0f, i - 1.0f);
            }
            this.f17592F = Math.min(this.f17599c.height() / 2.0f, this.f17599c.width() / 2.0f);
            m18749b();
            m18743h();
            invalidate();
        }
    }

    /* renamed from: h */
    private void m18743h() {
        float width;
        float height;
        this.f17601e.set(null);
        float f = 0.0f;
        if (this.f17590D * this.f17599c.height() > this.f17599c.width() * this.f17591E) {
            width = this.f17599c.height() / this.f17591E;
            f = (this.f17599c.width() - (this.f17590D * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = this.f17599c.width() / this.f17590D;
            height = (this.f17599c.height() - (this.f17591E * width)) * 0.5f;
        }
        this.f17601e.setScale(width, width);
        Matrix matrix = this.f17601e;
        RectF rectF = this.f17599c;
        matrix.postTranslate(((int) (f + 0.5f)) + rectF.left, ((int) (height + 0.5f)) + rectF.top);
        this.f17589C.setLocalMatrix(this.f17601e);
    }

    public int getBorderColor() {
        return this.f17605y;
    }

    public int getBorderWidth() {
        return this.f17606z;
    }

    public int getCircleBackgroundColor() {
        return this.f17587A;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f17594H;
    }

    @Deprecated
    public int getFillColor() {
        return getCircleBackgroundColor();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f17585M;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f17598L) {
            super.onDraw(canvas);
        } else if (this.f17588B == null) {
        } else {
            if (this.f17587A != 0) {
                canvas.drawCircle(this.f17599c.centerX(), this.f17599c.centerY(), this.f17592F, this.f17604x);
            }
            canvas.drawCircle(this.f17599c.centerX(), this.f17599c.centerY(), this.f17592F, this.f17602f);
            if (this.f17606z > 0) {
                canvas.drawCircle(this.f17600d.centerX(), this.f17600d.centerY(), this.f17593G, this.f17603w);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m18744g();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i == this.f17605y) {
            return;
        }
        this.f17605y = i;
        this.f17603w.setColor(i);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.f17597K) {
            return;
        }
        this.f17597K = z;
        m18744g();
    }

    public void setBorderWidth(int i) {
        if (i == this.f17606z) {
            return;
        }
        this.f17606z = i;
        m18744g();
    }

    public void setCircleBackgroundColor(int i) {
        if (i == this.f17587A) {
            return;
        }
        this.f17587A = i;
        this.f17604x.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f17594H) {
            return;
        }
        this.f17594H = colorFilter;
        m18749b();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f17598L == z) {
            return;
        }
        this.f17598L = z;
        m18745f();
    }

    @Deprecated
    public void setFillColor(int i) {
        setCircleBackgroundColor(i);
    }

    @Deprecated
    public void setFillColorResource(int i) {
        setCircleBackgroundColorResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m18745f();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m18745f();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        m18745f();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m18745f();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m18744g();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m18744g();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f17585M) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17599c = new RectF();
        this.f17600d = new RectF();
        this.f17601e = new Matrix();
        this.f17602f = new Paint();
        this.f17603w = new Paint();
        this.f17604x = new Paint();
        this.f17605y = -16777216;
        this.f17606z = 0;
        this.f17587A = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7432a.CircleImageView, i, 0);
        this.f17606z = obtainStyledAttributes.getDimensionPixelSize(C7432a.CircleImageView_civ_border_width, 0);
        this.f17605y = obtainStyledAttributes.getColor(C7432a.CircleImageView_civ_border_color, -16777216);
        this.f17597K = obtainStyledAttributes.getBoolean(C7432a.CircleImageView_civ_border_overlay, false);
        if (obtainStyledAttributes.hasValue(C7432a.CircleImageView_civ_circle_background_color)) {
            this.f17587A = obtainStyledAttributes.getColor(C7432a.CircleImageView_civ_circle_background_color, 0);
        } else if (obtainStyledAttributes.hasValue(C7432a.CircleImageView_civ_fill_color)) {
            this.f17587A = obtainStyledAttributes.getColor(C7432a.CircleImageView_civ_fill_color, 0);
        }
        obtainStyledAttributes.recycle();
        m18746e();
    }
}
