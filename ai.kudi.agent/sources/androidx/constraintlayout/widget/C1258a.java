package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: ConstraintAttribute.java */
/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes2.dex */
public class C1258a {

    /* renamed from: a */
    String f3834a;

    /* renamed from: b */
    private EnumC1260b f3835b;

    /* renamed from: c */
    private int f3836c;

    /* renamed from: d */
    private float f3837d;

    /* renamed from: e */
    private String f3838e;

    /* renamed from: f */
    boolean f3839f;

    /* renamed from: g */
    private int f3840g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1259a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3841a;

        static {
            int[] iArr = new int[EnumC1260b.values().length];
            f3841a = iArr;
            try {
                iArr[EnumC1260b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3841a[EnumC1260b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3841a[EnumC1260b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3841a[EnumC1260b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3841a[EnumC1260b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3841a[EnumC1260b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3841a[EnumC1260b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* loaded from: classes2.dex */
    public enum EnumC1260b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C1258a(String str, EnumC1260b enumC1260b, Object obj) {
        this.f3834a = str;
        this.f3835b = enumC1260b;
        m36630d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C1258a> m36633a(HashMap<String, C1258a> hashMap, View view) {
        HashMap<String, C1258a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C1258a c1258a = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new C1258a(c1258a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new C1258a(c1258a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m36632b(Context context, XmlPullParser xmlPullParser, HashMap<String, C1258a> hashMap) {
        EnumC1260b enumC1260b;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1276i.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC1260b enumC1260b2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C1276i.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C1276i.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC1260b2 = EnumC1260b.BOOLEAN_TYPE;
            } else {
                if (index == C1276i.CustomAttribute_customColorValue) {
                    enumC1260b = EnumC1260b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C1276i.CustomAttribute_customColorDrawableValue) {
                    enumC1260b = EnumC1260b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C1276i.CustomAttribute_customPixelDimension) {
                    enumC1260b = EnumC1260b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C1276i.CustomAttribute_customDimension) {
                    enumC1260b = EnumC1260b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C1276i.CustomAttribute_customFloatValue) {
                    enumC1260b = EnumC1260b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C1276i.CustomAttribute_customIntegerValue) {
                    enumC1260b = EnumC1260b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C1276i.CustomAttribute_customStringValue) {
                    enumC1260b = EnumC1260b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                enumC1260b2 = enumC1260b;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C1258a(str, enumC1260b2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m36631c(View view, HashMap<String, C1258a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C1258a c1258a = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C1259a.f3841a[c1258a.f3835b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c1258a.f3840g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c1258a.f3840g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c1258a.f3836c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c1258a.f3837d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c1258a.f3838e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c1258a.f3839f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c1258a.f3837d));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void m36630d(Object obj) {
        switch (C1259a.f3841a[this.f3835b.ordinal()]) {
            case 1:
            case 2:
                this.f3840g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f3836c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f3837d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f3838e = (String) obj;
                return;
            case 6:
                this.f3839f = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f3837d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C1258a(C1258a c1258a, Object obj) {
        this.f3834a = c1258a.f3834a;
        this.f3835b = c1258a.f3835b;
        m36630d(obj);
    }
}
