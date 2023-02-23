package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC2852b1;
import com.google.android.gms.common.internal.InterfaceC2861c1;
import com.google.android.gms.common.util.C2963a;
import com.google.android.gms.common.util.C2972j;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.b0 */
/* loaded from: classes2.dex */
public final class C2827b0 {

    /* renamed from: a */
    static final AbstractBinderC2986z f7897a;

    /* renamed from: b */
    static final AbstractBinderC2986z f7898b;

    /* renamed from: c */
    private static volatile InterfaceC2861c1 f7899c;

    /* renamed from: d */
    private static final Object f7900d;

    /* renamed from: e */
    private static Context f7901e;

    static {
        new BinderC2961t(AbstractBinderC2984x.m31499o("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC2962u(AbstractBinderC2984x.m31499o("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f7897a = new BinderC2982v(AbstractBinderC2984x.m31499o("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f7898b = new BinderC2983w(AbstractBinderC2984x.m31499o("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f7900d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2947l0 m31877a(String str, AbstractBinderC2984x abstractBinderC2984x, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m31872f(str, abstractBinderC2984x, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.a, android.os.IBinder] */
    /* renamed from: b */
    public static C2947l0 m31876b(String str, boolean z, boolean z2, boolean z3) {
        C2947l0 m31572d;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.s.j(f7901e);
            try {
                m31871g();
                try {
                    C2835f0 mo31767n0 = f7899c.mo31767n0(new C2829c0(str, z, false, BinderC2989b.m31494p1(f7901e), false));
                    if (mo31767n0.m31841f()) {
                        m31572d = C2947l0.m31574b();
                    } else {
                        String zza = mo31767n0.zza();
                        if (zza == null) {
                            zza = "error checking package certificate";
                        }
                        m31572d = mo31767n0.m31840h() == 4 ? C2947l0.m31572d(zza, new PackageManager.NameNotFoundException()) : C2947l0.m31573c(zza);
                    }
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    m31572d = C2947l0.m31572d("module call", e);
                }
            } catch (DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                String valueOf = String.valueOf(e2.getMessage());
                m31572d = C2947l0.m31572d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
            }
            return m31572d;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ String m31875c(boolean z, String str, AbstractBinderC2984x abstractBinderC2984x) throws Exception {
        String str2 = true != (!z && m31872f(str, abstractBinderC2984x, true, false).f8121a) ? "not allowed" : "debug cert rejected";
        MessageDigest m31545b = C2963a.m31545b("SHA-1");
        com.google.android.gms.common.internal.s.j(m31545b);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, C2972j.m31526a(m31545b.digest(abstractBinderC2984x.mo31498p1())), Boolean.valueOf(z), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static synchronized void m31874d(Context context) {
        synchronized (C2827b0.class) {
            if (f7901e != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f7901e = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m31873e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m31871g();
                return f7899c.mo31769f();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    /* renamed from: f */
    private static C2947l0 m31872f(final String str, final AbstractBinderC2984x abstractBinderC2984x, final boolean z, boolean z2) {
        try {
            m31871g();
            com.google.android.gms.common.internal.s.j(f7901e);
            try {
                return f7899c.mo31768g0(new C2839h0(str, abstractBinderC2984x, z, z2), BinderC2989b.m31494p1(f7901e.getPackageManager())) ? C2947l0.m31574b() : new C2945k0(new Callable() { // from class: com.google.android.gms.common.s
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C2827b0.m31875c(z, str, abstractBinderC2984x);
                    }
                }, null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C2947l0.m31572d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return C2947l0.m31572d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    /* renamed from: g */
    private static void m31871g() throws DynamiteModule.LoadingException {
        if (f7899c != null) {
            return;
        }
        com.google.android.gms.common.internal.s.j(f7901e);
        synchronized (f7900d) {
            if (f7899c == null) {
                f7899c = AbstractBinderC2852b1.m31816n(DynamiteModule.m31489e(f7901e, DynamiteModule.f8163e, "com.google.android.gms.googlecertificates").m31490d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
