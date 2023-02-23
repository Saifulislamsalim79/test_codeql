package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: BundleCompat.java */
/* renamed from: androidx.core.app.f */
/* loaded from: classes2.dex */
public final class C1306f {

    /* compiled from: BundleCompat.java */
    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes2.dex */
    static class C1307a {

        /* renamed from: a */
        private static Method f4081a;

        /* renamed from: b */
        private static boolean f4082b;

        /* renamed from: c */
        private static Method f4083c;

        /* renamed from: d */
        private static boolean f4084d;

        /* renamed from: a */
        public static IBinder m36440a(Bundle bundle, String str) {
            if (!f4082b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f4081a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f4082b = true;
            }
            Method method2 = f4081a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f4081a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m36439b(Bundle bundle, String str, IBinder iBinder) {
            if (!f4084d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f4083c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f4084d = true;
            }
            Method method2 = f4083c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f4083c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m36442a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C1307a.m36440a(bundle, str);
    }

    /* renamed from: b */
    public static void m36441b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C1307a.m36439b(bundle, str, iBinder);
        }
    }
}
