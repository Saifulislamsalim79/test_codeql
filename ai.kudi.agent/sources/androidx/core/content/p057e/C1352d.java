package androidx.core.content.p057e;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p227h.C7602d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientColorInflaterCompat.java */
/* renamed from: androidx.core.content.e.d */
/* loaded from: classes2.dex */
public final class C1352d {
    /* renamed from: a */
    private static C1353a m36256a(C1353a c1353a, int i, int i2, boolean z, int i3) {
        if (c1353a != null) {
            return c1353a;
        }
        if (z) {
            return new C1353a(i, i3, i2);
        }
        return new C1353a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Shader m36255b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C7602d.GradientColor);
            float m36226f = C1364g.m36226f(m36221k, xmlPullParser, "startX", C7602d.GradientColor_android_startX, 0.0f);
            float m36226f2 = C1364g.m36226f(m36221k, xmlPullParser, "startY", C7602d.GradientColor_android_startY, 0.0f);
            float m36226f3 = C1364g.m36226f(m36221k, xmlPullParser, "endX", C7602d.GradientColor_android_endX, 0.0f);
            float m36226f4 = C1364g.m36226f(m36221k, xmlPullParser, "endY", C7602d.GradientColor_android_endY, 0.0f);
            float m36226f5 = C1364g.m36226f(m36221k, xmlPullParser, "centerX", C7602d.GradientColor_android_centerX, 0.0f);
            float m36226f6 = C1364g.m36226f(m36221k, xmlPullParser, "centerY", C7602d.GradientColor_android_centerY, 0.0f);
            int m36225g = C1364g.m36225g(m36221k, xmlPullParser, "type", C7602d.GradientColor_android_type, 0);
            int m36230b = C1364g.m36230b(m36221k, xmlPullParser, "startColor", C7602d.GradientColor_android_startColor, 0);
            boolean m36222j = C1364g.m36222j(xmlPullParser, "centerColor");
            int m36230b2 = C1364g.m36230b(m36221k, xmlPullParser, "centerColor", C7602d.GradientColor_android_centerColor, 0);
            int m36230b3 = C1364g.m36230b(m36221k, xmlPullParser, "endColor", C7602d.GradientColor_android_endColor, 0);
            int m36225g2 = C1364g.m36225g(m36221k, xmlPullParser, "tileMode", C7602d.GradientColor_android_tileMode, 0);
            float m36226f7 = C1364g.m36226f(m36221k, xmlPullParser, "gradientRadius", C7602d.GradientColor_android_gradientRadius, 0.0f);
            m36221k.recycle();
            C1353a m36256a = m36256a(m36254c(resources, xmlPullParser, attributeSet, theme), m36230b, m36230b3, m36222j, m36230b2);
            if (m36225g != 1) {
                if (m36225g != 2) {
                    return new LinearGradient(m36226f, m36226f2, m36226f3, m36226f4, m36256a.f4201a, m36256a.f4202b, m36253d(m36225g2));
                }
                return new SweepGradient(m36226f5, m36226f6, m36256a.f4201a, m36256a.f4202b);
            } else if (m36226f7 > 0.0f) {
                return new RadialGradient(m36226f5, m36226f6, m36226f7, m36256a.f4201a, m36256a.f4202b, m36253d(m36225g2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.p057e.C1352d.C1353a m36254c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p201g.p227h.C7602d.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.p057e.C1364g.m36221k(r8, r11, r10, r3)
            int r5 = p201g.p227h.C7602d.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p201g.p227h.C7602d.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = p201g.p227h.C7602d.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p201g.p227h.C7602d.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            androidx.core.content.e.d$a r8 = new androidx.core.content.e.d$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p057e.C1352d.m36254c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.e.d$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m36253d(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradientColorInflaterCompat.java */
    /* renamed from: androidx.core.content.e.d$a */
    /* loaded from: classes2.dex */
    public static final class C1353a {

        /* renamed from: a */
        final int[] f4201a;

        /* renamed from: b */
        final float[] f4202b;

        C1353a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f4201a = new int[size];
            this.f4202b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f4201a[i] = list.get(i).intValue();
                this.f4202b[i] = list2.get(i).floatValue();
            }
        }

        C1353a(int i, int i2) {
            this.f4201a = new int[]{i, i2};
            this.f4202b = new float[]{0.0f, 1.0f};
        }

        C1353a(int i, int i2, int i3) {
            this.f4201a = new int[]{i, i2, i3};
            this.f4202b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
