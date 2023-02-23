package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.c */
/* loaded from: classes2.dex */
final class C1299c {

    /* renamed from: g */
    private static final Handler f4068g = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    protected static final Class<?> f4062a = m36455a();

    /* renamed from: b */
    protected static final Field f4063b = m36454b();

    /* renamed from: c */
    protected static final Field f4064c = m36450f();

    /* renamed from: d */
    protected static final Method f4065d = m36452d(f4062a);

    /* renamed from: e */
    protected static final Method f4066e = m36453c(f4062a);

    /* renamed from: f */
    protected static final Method f4067f = m36451e(f4062a);

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$a */
    /* loaded from: classes2.dex */
    class RunnableC1300a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C1303d f4069c;

        /* renamed from: d */
        final /* synthetic */ Object f4070d;

        RunnableC1300a(C1303d c1303d, Object obj) {
            this.f4069c = c1303d;
            this.f4070d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4069c.f4075c = this.f4070d;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$b */
    /* loaded from: classes2.dex */
    class RunnableC1301b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Application f4071c;

        /* renamed from: d */
        final /* synthetic */ C1303d f4072d;

        RunnableC1301b(Application application, C1303d c1303d) {
            this.f4071c = application;
            this.f4072d = c1303d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4071c.unregisterActivityLifecycleCallbacks(this.f4072d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$c */
    /* loaded from: classes2.dex */
    public class RunnableC1302c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Object f4073c;

        /* renamed from: d */
        final /* synthetic */ Object f4074d;

        RunnableC1302c(Object obj, Object obj2) {
            this.f4073c = obj;
            this.f4074d = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C1299c.f4065d != null) {
                    C1299c.f4065d.invoke(this.f4073c, this.f4074d, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C1299c.f4066e.invoke(this.f4073c, this.f4074d, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$d */
    /* loaded from: classes2.dex */
    private static final class C1303d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: c */
        Object f4075c;

        /* renamed from: d */
        private Activity f4076d;

        /* renamed from: e */
        private final int f4077e;

        /* renamed from: f */
        private boolean f4078f = false;

        /* renamed from: w */
        private boolean f4079w = false;

        /* renamed from: x */
        private boolean f4080x = false;

        C1303d(Activity activity) {
            this.f4076d = activity;
            this.f4077e = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f4076d == activity) {
                this.f4076d = null;
                this.f4079w = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f4079w || this.f4080x || this.f4078f || !C1299c.m36448h(this.f4075c, this.f4077e, activity)) {
                return;
            }
            this.f4080x = true;
            this.f4075c = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f4076d == activity) {
                this.f4078f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    private static Class<?> m36455a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m36454b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m36453c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m36452d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m36451e(Class<?> cls) {
        if (m36449g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m36450f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m36449g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m36448h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f4064c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f4068g.postAtFrontOfQueue(new RunnableC1302c(f4063b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m36447i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m36449g() && f4067f == null) {
            return false;
        } else {
            if (f4066e == null && f4065d == null) {
                return false;
            }
            try {
                Object obj2 = f4064c.get(activity);
                if (obj2 == null || (obj = f4063b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C1303d c1303d = new C1303d(activity);
                application.registerActivityLifecycleCallbacks(c1303d);
                f4068g.post(new RunnableC1300a(c1303d, obj2));
                if (m36449g()) {
                    f4067f.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                } else {
                    activity.recreate();
                }
                f4068g.post(new RunnableC1301b(application, c1303d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
