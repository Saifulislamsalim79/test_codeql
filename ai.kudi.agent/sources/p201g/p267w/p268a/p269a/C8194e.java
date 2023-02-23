package p201g.p267w.p268a.p269a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.p057e.C1364g;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p227h.p228e.C7605c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* compiled from: AnimatorInflaterCompat.java */
/* renamed from: g.w.a.a.e */
/* loaded from: classes2.dex */
public class C8194e {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatorInflaterCompat.java */
    /* renamed from: g.w.a.a.e$a */
    /* loaded from: classes2.dex */
    public static class C8195a implements TypeEvaluator<C7605c.C7607b[]> {

        /* renamed from: a */
        private C7605c.C7607b[] f19670a;

        C8195a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C7605c.C7607b[] evaluate(float f, C7605c.C7607b[] c7607bArr, C7605c.C7607b[] c7607bArr2) {
            if (C7605c.m18059b(c7607bArr, c7607bArr2)) {
                if (!C7605c.m18059b(this.f19670a, c7607bArr)) {
                    this.f19670a = C7605c.m18055f(c7607bArr);
                }
                for (int i = 0; i < c7607bArr.length; i++) {
                    this.f19670a[i].m18047d(c7607bArr[i], c7607bArr2[i], f);
                }
                return this.f19670a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m16546a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return m16545b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator m16545b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p267w.p268a.p269a.C8194e.m16545b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m16544c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: d */
    private static void m16543d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m16542e(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        float f;
        PropertyValuesHolder ofFloat;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m16539h(i7)) || (z2 && m16539h(i8))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C7605c.C7607b[] m18057d = C7605c.m18057d(string);
            C7605c.C7607b[] m18057d2 = C7605c.m18057d(string2);
            if (m18057d == null && m18057d2 == null) {
                return null;
            }
            if (m18057d == null) {
                if (m18057d2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C8195a(), m18057d2);
                }
                return null;
            }
            C8195a c8195a = new C8195a();
            if (m18057d2 != null) {
                if (C7605c.m18059b(m18057d, m18057d2)) {
                    ofObject = PropertyValuesHolder.ofObject(str, c8195a, m18057d, m18057d2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, c8195a, m18057d);
            }
            return ofObject;
        }
        C8196f m16526a = i == 3 ? C8196f.m16526a() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (m16539h(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m16539h(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5);
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (m16539h(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i4);
        }
        if (propertyValuesHolder == null || m16526a == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(m16526a);
        return propertyValuesHolder;
    }

    /* renamed from: f */
    private static int m16541f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && m16539h(i3)) || (z2 && m16539h(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    private static int m16540g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19656j);
        int i = 0;
        TypedValue m36220l = C1364g.m36220l(m36221k, xmlPullParser, "value", 0);
        if ((m36220l != null) && m16539h(m36220l.type)) {
            i = 3;
        }
        m36221k.recycle();
        return i;
    }

    /* renamed from: h */
    private static boolean m16539h(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: i */
    public static Animator m16538i(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m16537j(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: j */
    public static Animator m16537j(Context context, Resources resources, Resources.Theme theme, int i) throws Resources.NotFoundException {
        return m16536k(context, resources, theme, i, 1.0f);
    }

    /* renamed from: k */
    public static Animator m16536k(Context context, Resources resources, Resources.Theme theme, int i, float f) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m16546a(context, resources, theme, xmlResourceParser, f);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m16535l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19653g);
        TypedArray m36221k2 = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19657k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m16530q(valueAnimator, m36221k, m36221k2, f, xmlPullParser);
        int m36224h = C1364g.m36224h(m36221k, xmlPullParser, "interpolator", 0, 0);
        if (m36224h > 0) {
            valueAnimator.setInterpolator(C8193d.m16547b(context, m36224h));
        }
        m36221k.recycle();
        if (m36221k2 != null) {
            m36221k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m16534m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe ofInt;
        TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19656j);
        float m36226f = C1364g.m36226f(m36221k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m36220l = C1364g.m36220l(m36221k, xmlPullParser, "value", 0);
        boolean z = m36220l != null;
        if (i == 4) {
            i = (z && m16539h(m36220l.type)) ? 3 : 0;
        }
        if (z) {
            if (i != 0) {
                ofInt = (i == 1 || i == 3) ? Keyframe.ofInt(m36226f, C1364g.m36225g(m36221k, xmlPullParser, "value", 0, 0)) : null;
            } else {
                ofInt = Keyframe.ofFloat(m36226f, C1364g.m36226f(m36221k, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i == 0) {
            ofInt = Keyframe.ofFloat(m36226f);
        } else {
            ofInt = Keyframe.ofInt(m36226f);
        }
        int m36224h = C1364g.m36224h(m36221k, xmlPullParser, "interpolator", 1, 0);
        if (m36224h > 0) {
            ofInt.setInterpolator(C8193d.m16547b(context, m36224h));
        }
        m36221k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m16533n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m16535l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m16532o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m16540g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m16534m = m16534m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m16534m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m16534m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m16544c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m16544c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m16543d(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C8196f.m16526a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m16531p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19655i);
                    String m36223i = C1364g.m36223i(m36221k, xmlPullParser, "propertyName", 3);
                    int m36225g = C1364g.m36225g(m36221k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m16532o = m16532o(context, resources, theme, xmlPullParser, m36223i, m36225g);
                    if (m16532o == null) {
                        m16532o = m16542e(m36221k, m36225g, 0, 1, m36223i);
                    }
                    if (m16532o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m16532o);
                    }
                    m36221k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m16530q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m36225g = C1364g.m36225g(typedArray, xmlPullParser, "duration", 1, IjkMediaCodecInfo.RANK_SECURE);
        long m36225g2 = C1364g.m36225g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m36225g3 = C1364g.m36225g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C1364g.m36222j(xmlPullParser, "valueFrom") && C1364g.m36222j(xmlPullParser, "valueTo")) {
            if (m36225g3 == 4) {
                m36225g3 = m16541f(typedArray, 5, 6);
            }
            PropertyValuesHolder m16542e = m16542e(typedArray, m36225g3, 5, 6, "");
            if (m16542e != null) {
                valueAnimator.setValues(m16542e);
            }
        }
        valueAnimator.setDuration(m36225g);
        valueAnimator.setStartDelay(m36225g2);
        valueAnimator.setRepeatCount(C1364g.m36225g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C1364g.m36225g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m16529r(valueAnimator, typedArray2, m36225g3, f, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m16529r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m36223i = C1364g.m36223i(typedArray, xmlPullParser, "pathData", 1);
        if (m36223i != null) {
            String m36223i2 = C1364g.m36223i(typedArray, xmlPullParser, "propertyXName", 2);
            String m36223i3 = C1364g.m36223i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (m36223i2 == null && m36223i3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m16528s(C7605c.m18056e(m36223i), objectAnimator, f * 0.5f, m36223i2, m36223i3);
            return;
        }
        objectAnimator.setPropertyName(C1364g.m36223i(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: s */
    private static void m16528s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
