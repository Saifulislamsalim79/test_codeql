package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ConstraintLayoutStates.java */
/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes2.dex */
public class C1262c {

    /* renamed from: a */
    private final ConstraintLayout f3858a;

    /* renamed from: b */
    C1265d f3859b;

    /* renamed from: c */
    int f3860c = -1;

    /* renamed from: d */
    int f3861d = -1;

    /* renamed from: e */
    private SparseArray<C1263a> f3862e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C1265d> f3863f = new SparseArray<>();

    /* renamed from: g */
    private AbstractC1273f f3864g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes2.dex */
    public static class C1263a {

        /* renamed from: a */
        int f3865a;

        /* renamed from: b */
        ArrayList<C1264b> f3866b = new ArrayList<>();

        /* renamed from: c */
        int f3867c;

        /* renamed from: d */
        C1265d f3868d;

        public C1263a(Context context, XmlPullParser xmlPullParser) {
            this.f3867c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1276i.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1276i.State_android_id) {
                    this.f3865a = obtainStyledAttributes.getResourceId(index, this.f3865a);
                } else if (index == C1276i.State_constraints) {
                    this.f3867c = obtainStyledAttributes.getResourceId(index, this.f3867c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3867c);
                    context.getResources().getResourceName(this.f3867c);
                    if ("layout".equals(resourceTypeName)) {
                        C1265d c1265d = new C1265d();
                        this.f3868d = c1265d;
                        c1265d.m36604f(context, this.f3867c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m36612a(C1264b c1264b) {
            this.f3866b.add(c1264b);
        }

        /* renamed from: b */
        public int m36611b(float f, float f2) {
            for (int i = 0; i < this.f3866b.size(); i++) {
                if (this.f3866b.get(i).m36610a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: classes2.dex */
    public static class C1264b {

        /* renamed from: a */
        float f3869a;

        /* renamed from: b */
        float f3870b;

        /* renamed from: c */
        float f3871c;

        /* renamed from: d */
        float f3872d;

        /* renamed from: e */
        int f3873e;

        /* renamed from: f */
        C1265d f3874f;

        public C1264b(Context context, XmlPullParser xmlPullParser) {
            this.f3869a = Float.NaN;
            this.f3870b = Float.NaN;
            this.f3871c = Float.NaN;
            this.f3872d = Float.NaN;
            this.f3873e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1276i.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1276i.Variant_constraints) {
                    this.f3873e = obtainStyledAttributes.getResourceId(index, this.f3873e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3873e);
                    context.getResources().getResourceName(this.f3873e);
                    if ("layout".equals(resourceTypeName)) {
                        C1265d c1265d = new C1265d();
                        this.f3874f = c1265d;
                        c1265d.m36604f(context, this.f3873e);
                    }
                } else if (index == C1276i.Variant_region_heightLessThan) {
                    this.f3872d = obtainStyledAttributes.getDimension(index, this.f3872d);
                } else if (index == C1276i.Variant_region_heightMoreThan) {
                    this.f3870b = obtainStyledAttributes.getDimension(index, this.f3870b);
                } else if (index == C1276i.Variant_region_widthLessThan) {
                    this.f3871c = obtainStyledAttributes.getDimension(index, this.f3871c);
                } else if (index == C1276i.Variant_region_widthMoreThan) {
                    this.f3869a = obtainStyledAttributes.getDimension(index, this.f3869a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        boolean m36610a(float f, float f2) {
            if (Float.isNaN(this.f3869a) || f >= this.f3869a) {
                if (Float.isNaN(this.f3870b) || f2 >= this.f3870b) {
                    if (Float.isNaN(this.f3871c) || f <= this.f3871c) {
                        return Float.isNaN(this.f3872d) || f2 <= this.f3872d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1262c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f3858a = constraintLayout;
        m36616a(context, i);
    }

    /* renamed from: a */
    private void m36616a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C1263a c1263a = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0 && c != 1) {
                        if (c == 2) {
                            c1263a = new C1263a(context, xml);
                            this.f3862e.put(c1263a.f3865a, c1263a);
                            continue;
                        } else if (c == 3) {
                            C1264b c1264b = new C1264b(context, xml);
                            if (c1263a != null) {
                                c1263a.m36612a(c1264b);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            continue;
                        } else {
                            m36615b(context, xml);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m36615b(Context context, XmlPullParser xmlPullParser) {
        C1265d c1265d = new C1265d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue != null && attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c1265d.m36594p(context, xmlPullParser);
                this.f3863f.put(identifier, c1265d);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m36614c(AbstractC1273f abstractC1273f) {
        this.f3864g = abstractC1273f;
    }

    /* renamed from: d */
    public void m36613d(int i, float f, float f2) {
        C1265d c1265d;
        int i2;
        C1263a c1263a;
        int m36611b;
        C1265d c1265d2;
        int i3;
        int i4 = this.f3860c;
        if (i4 == i) {
            if (i == -1) {
                c1263a = this.f3862e.valueAt(0);
            } else {
                c1263a = this.f3862e.get(i4);
            }
            int i5 = this.f3861d;
            if ((i5 == -1 || !c1263a.f3866b.get(i5).m36610a(f, f2)) && this.f3861d != (m36611b = c1263a.m36611b(f, f2))) {
                if (m36611b == -1) {
                    c1265d2 = this.f3859b;
                } else {
                    c1265d2 = c1263a.f3866b.get(m36611b).f3874f;
                }
                if (m36611b == -1) {
                    i3 = c1263a.f3867c;
                } else {
                    i3 = c1263a.f3866b.get(m36611b).f3873e;
                }
                if (c1265d2 == null) {
                    return;
                }
                this.f3861d = m36611b;
                AbstractC1273f abstractC1273f = this.f3864g;
                if (abstractC1273f != null) {
                    abstractC1273f.m36571b(-1, i3);
                }
                c1265d2.m36607c(this.f3858a);
                AbstractC1273f abstractC1273f2 = this.f3864g;
                if (abstractC1273f2 != null) {
                    abstractC1273f2.m36572a(-1, i3);
                    return;
                }
                return;
            }
            return;
        }
        this.f3860c = i;
        C1263a c1263a2 = this.f3862e.get(i);
        int m36611b2 = c1263a2.m36611b(f, f2);
        if (m36611b2 == -1) {
            c1265d = c1263a2.f3868d;
        } else {
            c1265d = c1263a2.f3866b.get(m36611b2).f3874f;
        }
        if (m36611b2 == -1) {
            i2 = c1263a2.f3867c;
        } else {
            i2 = c1263a2.f3866b.get(m36611b2).f3873e;
        }
        if (c1265d == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f3861d = m36611b2;
        AbstractC1273f abstractC1273f3 = this.f3864g;
        if (abstractC1273f3 != null) {
            abstractC1273f3.m36571b(i, i2);
        }
        c1265d.m36607c(this.f3858a);
        AbstractC1273f abstractC1273f4 = this.f3864g;
        if (abstractC1273f4 != null) {
            abstractC1273f4.m36572a(i, i2);
        }
    }
}
