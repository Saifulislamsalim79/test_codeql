package p201g.p202a.p205l.p206a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C1365a;
import p201g.p202a.C7452a;
import p201g.p202a.C7460i;
import p201g.p202a.C7461j;
/* compiled from: DrawerArrowDrawable.java */
/* renamed from: g.a.l.a.d */
/* loaded from: classes2.dex */
public class C7478d extends Drawable {

    /* renamed from: m */
    private static final float f17742m = (float) Math.toRadians(45.0d);

    /* renamed from: b */
    private float f17744b;

    /* renamed from: c */
    private float f17745c;

    /* renamed from: d */
    private float f17746d;

    /* renamed from: e */
    private float f17747e;

    /* renamed from: f */
    private boolean f17748f;

    /* renamed from: h */
    private final int f17750h;

    /* renamed from: j */
    private float f17752j;

    /* renamed from: k */
    private float f17753k;

    /* renamed from: a */
    private final Paint f17743a = new Paint();

    /* renamed from: g */
    private final Path f17749g = new Path();

    /* renamed from: i */
    private boolean f17751i = false;

    /* renamed from: l */
    private int f17754l = 2;

    public C7478d(Context context) {
        this.f17743a.setStyle(Paint.Style.STROKE);
        this.f17743a.setStrokeJoin(Paint.Join.MITER);
        this.f17743a.setStrokeCap(Paint.Cap.BUTT);
        this.f17743a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C7461j.DrawerArrowToggle, C7452a.drawerArrowStyle, C7460i.Base_Widget_AppCompat_DrawerArrowToggle);
        m18623d(obtainStyledAttributes.getColor(C7461j.DrawerArrowToggle_color, 0));
        m18624c(obtainStyledAttributes.getDimension(C7461j.DrawerArrowToggle_thickness, 0.0f));
        m18620g(obtainStyledAttributes.getBoolean(C7461j.DrawerArrowToggle_spinBars, true));
        m18622e(Math.round(obtainStyledAttributes.getDimension(C7461j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f17750h = obtainStyledAttributes.getDimensionPixelSize(C7461j.DrawerArrowToggle_drawableSize, 0);
        this.f17745c = Math.round(obtainStyledAttributes.getDimension(C7461j.DrawerArrowToggle_barLength, 0.0f));
        this.f17744b = Math.round(obtainStyledAttributes.getDimension(C7461j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f17746d = obtainStyledAttributes.getDimension(C7461j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private static float m18625b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public final Paint m18626a() {
        return this.f17743a;
    }

    /* renamed from: c */
    public void m18624c(float f) {
        if (this.f17743a.getStrokeWidth() != f) {
            this.f17743a.setStrokeWidth(f);
            double d = f / 2.0f;
            double cos = Math.cos(f17742m);
            Double.isNaN(d);
            this.f17753k = (float) (d * cos);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void m18623d(int i) {
        if (i != this.f17743a.getColor()) {
            this.f17743a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        int i = this.f17754l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C1365a.m36196f(this) == 0 : C1365a.m36196f(this) == 1))) {
            z = true;
        }
        float f2 = this.f17744b;
        float m18625b = m18625b(this.f17745c, (float) Math.sqrt(f2 * f2 * 2.0f), this.f17752j);
        float m18625b2 = m18625b(this.f17745c, this.f17746d, this.f17752j);
        float round = Math.round(m18625b(0.0f, this.f17753k, this.f17752j));
        float m18625b3 = m18625b(0.0f, f17742m, this.f17752j);
        float m18625b4 = m18625b(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f17752j);
        double d = m18625b;
        double d2 = m18625b3;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        boolean z2 = z;
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f17749g.rewind();
        float m18625b5 = m18625b(this.f17747e + this.f17743a.getStrokeWidth(), -this.f17753k, this.f17752j);
        float f3 = (-m18625b2) / 2.0f;
        this.f17749g.moveTo(f3 + round, 0.0f);
        this.f17749g.rLineTo(m18625b2 - (round * 2.0f), 0.0f);
        this.f17749g.moveTo(f3, m18625b5);
        this.f17749g.rLineTo(round2, round3);
        this.f17749g.moveTo(f3, -m18625b5);
        this.f17749g.rLineTo(round2, -round3);
        this.f17749g.close();
        canvas.save();
        float strokeWidth = this.f17743a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f17747e);
        if (this.f17748f) {
            canvas.rotate(m18625b4 * (this.f17751i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f17749g, this.f17743a);
        canvas.restore();
    }

    /* renamed from: e */
    public void m18622e(float f) {
        if (f != this.f17747e) {
            this.f17747e = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void m18621f(float f) {
        if (this.f17752j != f) {
            this.f17752j = f;
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public void m18620g(boolean z) {
        if (this.f17748f != z) {
            this.f17748f = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f17750h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f17750h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m18619h(boolean z) {
        if (this.f17751i != z) {
            this.f17751i = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f17743a.getAlpha()) {
            this.f17743a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17743a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
