package p201g.p267w.p268a.p269a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.p057e.C1364g;
import org.xmlpull.v1.XmlPullParser;
import p201g.p227h.p228e.C7605c;
/* compiled from: PathInterpolatorCompat.java */
/* renamed from: g.w.a.a.g  reason: invalid class name */
/* loaded from: classes2.dex */
public class animationInterpolatorC8197g implements Interpolator {

    /* renamed from: a */
    private float[] f19672a;

    /* renamed from: b */
    private float[] f19673b;

    public animationInterpolatorC8197g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: a */
    private void m16525a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m16524b(path);
    }

    /* renamed from: b */
    private void m16524b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f19672a = new float[min];
            this.f19673b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                this.f19672a[i2] = fArr[0];
                this.f19673b[i2] = fArr[1];
            }
            if (Math.abs(this.f19672a[0]) <= 1.0E-5d && Math.abs(this.f19673b[0]) <= 1.0E-5d) {
                int i3 = min - 1;
                if (Math.abs(this.f19672a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f19673b[i3] - 1.0f) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f19672a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f19672a[0]);
            sb.append(",");
            sb.append(this.f19673b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f19672a[i6]);
            sb.append(",");
            sb.append(this.f19673b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    private void m16523c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m16524b(path);
    }

    /* renamed from: d */
    private void m16522d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C1364g.m36222j(xmlPullParser, "pathData")) {
            String m36223i = C1364g.m36223i(typedArray, xmlPullParser, "pathData", 4);
            Path m18056e = C7605c.m18056e(m36223i);
            if (m18056e != null) {
                m16524b(m18056e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m36223i);
        } else if (C1364g.m36222j(xmlPullParser, "controlX1")) {
            if (C1364g.m36222j(xmlPullParser, "controlY1")) {
                float m36226f = C1364g.m36226f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float m36226f2 = C1364g.m36226f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean m36222j = C1364g.m36222j(xmlPullParser, "controlX2");
                if (m36222j != C1364g.m36222j(xmlPullParser, "controlY2")) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
                if (!m36222j) {
                    m16523c(m36226f, m36226f2);
                    return;
                } else {
                    m16525a(m36226f, m36226f2, C1364g.m36226f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C1364g.m36226f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                    return;
                }
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f19672a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f19672a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f19672a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f19673b[i];
        }
        float[] fArr2 = this.f19673b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public animationInterpolatorC8197g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19658l);
        m16522d(m36221k, xmlPullParser);
        m36221k.recycle();
    }
}
