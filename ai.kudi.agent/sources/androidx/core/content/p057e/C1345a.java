package androidx.core.content.p057e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p227h.C7599a;
import p201g.p227h.C7602d;
/* compiled from: ColorStateListInflaterCompat.java */
/* renamed from: androidx.core.content.e.a */
/* loaded from: classes2.dex */
public final class C1345a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f4186a = new ThreadLocal<>();

    /* renamed from: a */
    public static ColorStateList m36295a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m36294b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m36294b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m36291e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    private static TypedValue m36293c() {
        TypedValue typedValue = f4186a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f4186a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: d */
    public static ColorStateList m36292d(Resources resources, int i, Resources.Theme theme) {
        try {
            return m36295a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* renamed from: e */
    private static ColorStateList m36291e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray m36288h = m36288h(resources, theme, attributeSet, C7602d.ColorStateListItem);
                int resourceId = m36288h.getResourceId(C7602d.ColorStateListItem_android_color, -1);
                if (resourceId != -1 && !m36290f(resources, resourceId)) {
                    try {
                        color = m36295a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = m36288h.getColor(C7602d.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = m36288h.getColor(C7602d.ColorStateListItem_android_color, -65281);
                }
                float f = 1.0f;
                if (m36288h.hasValue(C7602d.ColorStateListItem_android_alpha)) {
                    f = m36288h.getFloat(C7602d.ColorStateListItem_android_alpha, 1.0f);
                } else if (m36288h.hasValue(C7602d.ColorStateListItem_alpha)) {
                    f = m36288h.getFloat(C7602d.ColorStateListItem_alpha, 1.0f);
                }
                m36288h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C7599a.alpha) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i3);
                iArr2 = C1354e.m36252a(iArr2, i2, m36289g(color, f));
                iArr = (int[][]) C1354e.m36251b(iArr, i2, trimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr4 = new int[i2];
        int[][] iArr5 = new int[i2];
        System.arraycopy(iArr2, 0, iArr4, 0, i2);
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        return new ColorStateList(iArr5, iArr4);
    }

    /* renamed from: f */
    private static boolean m36290f(Resources resources, int i) {
        TypedValue m36293c = m36293c();
        resources.getValue(i, m36293c, true);
        int i2 = m36293c.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: g */
    private static int m36289g(int i, float f) {
        return (i & 16777215) | (Math.round(Color.alpha(i) * f) << 24);
    }

    /* renamed from: h */
    private static TypedArray m36288h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
