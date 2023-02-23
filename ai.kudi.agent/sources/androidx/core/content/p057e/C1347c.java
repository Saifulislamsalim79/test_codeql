package androidx.core.content.p057e;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p227h.C7602d;
import p201g.p227h.p234i.C7635d;
/* compiled from: FontResourcesParserCompat.java */
/* renamed from: androidx.core.content.e.c */
/* loaded from: classes2.dex */
public class C1347c {

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.e.c$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1348a {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.e.c$b */
    /* loaded from: classes2.dex */
    public static final class C1349b implements InterfaceC1348a {

        /* renamed from: a */
        private final C1350c[] f4190a;

        public C1349b(C1350c[] c1350cArr) {
            this.f4190a = c1350cArr;
        }

        /* renamed from: a */
        public C1350c[] m36267a() {
            return this.f4190a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.e.c$c */
    /* loaded from: classes2.dex */
    public static final class C1350c {

        /* renamed from: a */
        private final String f4191a;

        /* renamed from: b */
        private int f4192b;

        /* renamed from: c */
        private boolean f4193c;

        /* renamed from: d */
        private String f4194d;

        /* renamed from: e */
        private int f4195e;

        /* renamed from: f */
        private int f4196f;

        public C1350c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f4191a = str;
            this.f4192b = i;
            this.f4193c = z;
            this.f4194d = str2;
            this.f4195e = i2;
            this.f4196f = i3;
        }

        /* renamed from: a */
        public String m36266a() {
            return this.f4191a;
        }

        /* renamed from: b */
        public int m36265b() {
            return this.f4196f;
        }

        /* renamed from: c */
        public int m36264c() {
            return this.f4195e;
        }

        /* renamed from: d */
        public String m36263d() {
            return this.f4194d;
        }

        /* renamed from: e */
        public int m36262e() {
            return this.f4192b;
        }

        /* renamed from: f */
        public boolean m36261f() {
            return this.f4193c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.e.c$d */
    /* loaded from: classes2.dex */
    public static final class C1351d implements InterfaceC1348a {

        /* renamed from: a */
        private final C7635d f4197a;

        /* renamed from: b */
        private final int f4198b;

        /* renamed from: c */
        private final int f4199c;

        /* renamed from: d */
        private final String f4200d;

        public C1351d(C7635d c7635d, int i, int i2, String str) {
            this.f4197a = c7635d;
            this.f4199c = i;
            this.f4198b = i2;
            this.f4200d = str;
        }

        /* renamed from: a */
        public int m36260a() {
            return this.f4199c;
        }

        /* renamed from: b */
        public C7635d m36259b() {
            return this.f4197a;
        }

        /* renamed from: c */
        public String m36258c() {
            return this.f4200d;
        }

        /* renamed from: d */
        public int m36257d() {
            return this.f4198b;
        }
    }

    /* renamed from: a */
    private static int m36275a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static InterfaceC1348a m36274b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m36272d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m36273c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m36275a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m36268h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m36268h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static InterfaceC1348a m36272d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m36271e(xmlPullParser, resources);
        }
        m36269g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static InterfaceC1348a m36271e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7602d.FontFamily);
        String string = obtainAttributes.getString(C7602d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C7602d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C7602d.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C7602d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C7602d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C7602d.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(C7602d.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m36269g(xmlPullParser);
            }
            return new C1351d(new C7635d(string, string2, string3, m36273c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m36270f(xmlPullParser, resources));
                } else {
                    m36269g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1349b((C1350c[]) arrayList.toArray(new C1350c[arrayList.size()]));
    }

    /* renamed from: f */
    private static C1350c m36270f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7602d.FontFamilyFont);
        if (obtainAttributes.hasValue(C7602d.FontFamilyFont_fontWeight)) {
            i = C7602d.FontFamilyFont_fontWeight;
        } else {
            i = C7602d.FontFamilyFont_android_fontWeight;
        }
        int i6 = obtainAttributes.getInt(i, 400);
        if (obtainAttributes.hasValue(C7602d.FontFamilyFont_fontStyle)) {
            i2 = C7602d.FontFamilyFont_fontStyle;
        } else {
            i2 = C7602d.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == obtainAttributes.getInt(i2, 0);
        if (obtainAttributes.hasValue(C7602d.FontFamilyFont_ttcIndex)) {
            i3 = C7602d.FontFamilyFont_ttcIndex;
        } else {
            i3 = C7602d.FontFamilyFont_android_ttcIndex;
        }
        if (obtainAttributes.hasValue(C7602d.FontFamilyFont_fontVariationSettings)) {
            i4 = C7602d.FontFamilyFont_fontVariationSettings;
        } else {
            i4 = C7602d.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i4);
        int i7 = obtainAttributes.getInt(i3, 0);
        if (obtainAttributes.hasValue(C7602d.FontFamilyFont_font)) {
            i5 = C7602d.FontFamilyFont_font;
        } else {
            i5 = C7602d.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i5, 0);
        String string2 = obtainAttributes.getString(i5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m36269g(xmlPullParser);
        }
        return new C1350c(string2, i6, z, string, i7, resourceId);
    }

    /* renamed from: g */
    private static void m36269g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m36268h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
