package androidx.core.content.p057e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: TypedArrayUtils.java */
/* renamed from: androidx.core.content.e.g */
/* loaded from: classes2.dex */
public class C1364g {
    /* renamed from: a */
    public static boolean m36231a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m36222j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m36230b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m36222j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m36229c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (m36222j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                if (i2 >= 28 && i2 <= 31) {
                    return m36228d(typedValue);
                }
                return C1345a.m36292d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    /* renamed from: d */
    private static ColorStateList m36228d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C1346b m36227e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m36222j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C1346b.m36286b(typedValue.data);
            }
            C1346b m36281g = C1346b.m36281g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m36281g != null) {
                return m36281g;
            }
        }
        return C1346b.m36286b(i2);
    }

    /* renamed from: f */
    public static float m36226f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m36222j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m36225g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m36222j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m36224h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m36222j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m36223i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m36222j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m36222j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m36221k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m36220l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m36222j(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}
