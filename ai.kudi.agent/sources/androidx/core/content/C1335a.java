package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.p057e.C1355f;
import androidx.core.p058os.C1376e;
import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: ContextCompat.java */
/* renamed from: androidx.core.content.a */
/* loaded from: classes2.dex */
public class C1335a {

    /* renamed from: a */
    private static final Object f4183a = new Object();

    /* renamed from: b */
    private static final Object f4184b = new Object();

    /* renamed from: c */
    private static TypedValue f4185c;

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$a */
    /* loaded from: classes2.dex */
    static class C1336a {
        /* renamed from: a */
        static void m36315a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m36314b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$b */
    /* loaded from: classes2.dex */
    static class C1337b {
        /* renamed from: a */
        static File[] m36313a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m36312b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m36311c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$c */
    /* loaded from: classes2.dex */
    static class C1338c {
        /* renamed from: a */
        static File m36310a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m36309b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m36308c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$d */
    /* loaded from: classes2.dex */
    static class C1339d {
        /* renamed from: a */
        static int m36307a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static ColorStateList m36306b(Context context, int i) {
            return context.getColorStateList(i);
        }

        /* renamed from: c */
        static <T> T m36305c(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: d */
        static String m36304d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$e */
    /* loaded from: classes2.dex */
    static class C1340e {
        /* renamed from: a */
        static Context m36303a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m36302b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m36301c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$f */
    /* loaded from: classes2.dex */
    static class C1341f {
        /* renamed from: a */
        static Executor m36300a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: a */
    public static int m36327a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static Context m36326b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1340e.m36303a(context);
        }
        return null;
    }

    /* renamed from: c */
    private static File m36325c(File file) {
        synchronized (f4184b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    /* renamed from: d */
    public static int m36324d(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1339d.m36307a(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: e */
    public static ColorStateList m36323e(Context context, int i) {
        return C1355f.m36247c(context.getResources(), i, context.getTheme());
    }

    /* renamed from: f */
    public static Drawable m36322f(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C1338c.m36309b(context, i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f4183a) {
            if (f4185c == null) {
                f4185c = new TypedValue();
            }
            context.getResources().getValue(i, f4185c, true);
            i2 = f4185c.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: g */
    public static File[] m36321g(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? C1337b.m36313a(context) : new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: h */
    public static File[] m36320h(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? C1337b.m36312b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: i */
    public static Executor m36319i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1341f.m36300a(context);
        }
        return C1376e.m36168a(new Handler(context.getMainLooper()));
    }

    /* renamed from: j */
    public static File m36318j(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1338c.m36308c(context);
        }
        File file = new File(context.getApplicationInfo().dataDir, "no_backup");
        m36325c(file);
        return file;
    }

    /* renamed from: k */
    public static boolean m36317k(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1336a.m36315a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: l */
    public static void m36316l(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1336a.m36314b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
