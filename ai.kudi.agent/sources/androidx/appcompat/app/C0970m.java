package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: ResourcesFlusher.java */
/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes2.dex */
class C0970m {

    /* renamed from: a */
    private static Field f2671a;

    /* renamed from: b */
    private static boolean f2672b;

    /* renamed from: c */
    private static Class<?> f2673c;

    /* renamed from: d */
    private static boolean f2674d;

    /* renamed from: e */
    private static Field f2675e;

    /* renamed from: f */
    private static boolean f2676f;

    /* renamed from: g */
    private static Field f2677g;

    /* renamed from: h */
    private static boolean f2678h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m37655a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m37652d(resources);
        } else if (i >= 23) {
            m37653c(resources);
        } else if (i >= 21) {
            m37654b(resources);
        }
    }

    /* renamed from: b */
    private static void m37654b(Resources resources) {
        if (!f2672b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2671a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2672b = true;
        }
        Field field = f2671a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m37653c(Resources resources) {
        if (!f2672b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2671a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2672b = true;
        }
        Object obj = null;
        Field field = f2671a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj == null) {
            return;
        }
        m37651e(obj);
    }

    /* renamed from: d */
    private static void m37652d(Resources resources) {
        Object obj;
        if (!f2678h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2677g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2678h = true;
        }
        Field field = f2677g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f2672b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f2671a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f2672b = true;
        }
        Field field2 = f2671a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            m37651e(obj2);
        }
    }

    /* renamed from: e */
    private static void m37651e(Object obj) {
        if (!f2674d) {
            try {
                f2673c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2674d = true;
        }
        Class<?> cls = f2673c;
        if (cls == null) {
            return;
        }
        if (!f2676f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2675e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2676f = true;
        }
        Field field = f2675e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
