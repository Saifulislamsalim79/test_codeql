package p201g.p227h.p238l;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;
/* compiled from: LayoutInflaterCompat.java */
/* renamed from: g.h.l.g */
/* loaded from: classes2.dex */
public final class C7697g {

    /* renamed from: a */
    private static Field f18431a;

    /* renamed from: b */
    private static boolean f18432b;

    /* renamed from: a */
    private static void m17795a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f18432b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f18431a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f18432b = true;
        }
        Field field = f18431a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m17794b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m17795a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m17795a(layoutInflater, factory2);
            }
        }
    }
}
