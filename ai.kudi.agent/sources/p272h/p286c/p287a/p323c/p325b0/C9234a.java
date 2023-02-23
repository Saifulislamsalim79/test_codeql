package p272h.p286c.p287a.p323c.p325b0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p201g.p227h.p228e.C7603a;
/* compiled from: ShadowRenderer.java */
/* renamed from: h.c.a.c.b0.a */
/* loaded from: classes2.dex */
public class C9234a {

    /* renamed from: i */
    private static final int[] f21650i = new int[3];

    /* renamed from: j */
    private static final float[] f21651j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f21652k = new int[4];

    /* renamed from: l */
    private static final float[] f21653l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f21654a;

    /* renamed from: b */
    private final Paint f21655b;

    /* renamed from: c */
    private final Paint f21656c;

    /* renamed from: d */
    private int f21657d;

    /* renamed from: e */
    private int f21658e;

    /* renamed from: f */
    private int f21659f;

    /* renamed from: g */
    private final Path f21660g;

    /* renamed from: h */
    private Paint f21661h;

    public C9234a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m15442a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f21660g;
        if (z) {
            int[] iArr = f21652k;
            iArr[0] = 0;
            iArr[1] = this.f21659f;
            iArr[2] = this.f21658e;
            iArr[3] = this.f21657d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f21652k;
            iArr2[0] = 0;
            iArr2[1] = this.f21657d;
            iArr2[2] = this.f21658e;
            iArr2[3] = this.f21659f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = f21653l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f21655b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f21652k, f21653l, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f21661h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f21655b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m15441b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f21650i;
        iArr[0] = this.f21659f;
        iArr[1] = this.f21658e;
        iArr[2] = this.f21657d;
        Paint paint = this.f21656c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, f21650i, f21651j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f21656c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m15440c() {
        return this.f21654a;
    }

    /* renamed from: d */
    public void m15439d(int i) {
        this.f21657d = C7603a.m18066h(i, 68);
        this.f21658e = C7603a.m18066h(i, 20);
        this.f21659f = C7603a.m18066h(i, 0);
        this.f21654a.setColor(this.f21657d);
    }

    public C9234a(int i) {
        this.f21660g = new Path();
        this.f21661h = new Paint();
        this.f21654a = new Paint();
        m15439d(i);
        this.f21661h.setColor(0);
        Paint paint = new Paint(4);
        this.f21655b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f21656c = new Paint(this.f21655b);
    }
}
