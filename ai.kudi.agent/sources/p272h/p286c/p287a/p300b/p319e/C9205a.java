package p272h.p286c.p287a.p300b.p319e;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C2834f;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: h.c.a.b.e.a */
/* loaded from: classes2.dex */
public class C9205a {

    /* renamed from: a */
    private static final C2834f f21589a = C2834f.m31847f();

    /* renamed from: b */
    private static final Object f21590b = new Object();

    /* renamed from: c */
    private static Method f21591c = null;

    /* renamed from: d */
    private static Method f21592d = null;

    /* renamed from: a */
    public static void m15474a(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        s.k(context, "Context must not be null");
        f21589a.m31842k(context, 11925000);
        synchronized (f21590b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m31489e(context, DynamiteModule.f8163e, "com.google.android.gms.providerinstaller.dynamite").m31492b();
            } catch (DynamiteModule.LoadingException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ProviderInstaller", valueOf.length() != 0 ? "Failed to load providerinstaller module: ".concat(valueOf) : new String("Failed to load providerinstaller module: "));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context m31835d = C2838h.m31835d(context);
                if (m31835d != null) {
                    try {
                        if (f21592d == null) {
                            f21592d = m15473b(m31835d, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, Long.TYPE, Long.TYPE});
                        }
                        f21592d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                    } catch (Exception e2) {
                        String valueOf2 = String.valueOf(e2.getMessage());
                        Log.w("ProviderInstaller", valueOf2.length() != 0 ? "Failed to report request stats: ".concat(valueOf2) : new String("Failed to report request stats: "));
                    }
                }
                if (m31835d != null) {
                    m15472c(m31835d, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            }
            m15472c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    /* renamed from: b */
    private static Method m15473b(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    /* renamed from: c */
    private static void m15472c(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f21591c == null) {
                f21591c = m15473b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f21591c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                String valueOf = String.valueOf(cause == null ? e.getMessage() : cause.getMessage());
                Log.e("ProviderInstaller", valueOf.length() != 0 ? "Failed to install provider: ".concat(valueOf) : new String("Failed to install provider: "));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
