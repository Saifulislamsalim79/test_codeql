package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.i */
/* loaded from: classes2.dex */
public class C2840i {

    /* renamed from: c */
    private static C2840i f7930c;

    /* renamed from: a */
    private final Context f7931a;

    /* renamed from: b */
    private volatile String f7932b;

    public C2840i(Context context) {
        this.f7931a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C2840i m31826a(Context context) {
        com.google.android.gms.common.internal.s.j(context);
        synchronized (C2840i.class) {
            if (f7930c == null) {
                C2827b0.m31874d(context);
                f7930c = new C2840i(context);
            }
        }
        return f7930c;
    }

    /* renamed from: d */
    static final AbstractBinderC2984x m31823d(PackageInfo packageInfo, AbstractBinderC2984x... abstractBinderC2984xArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC2985y binderC2985y = new BinderC2985y(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC2984xArr.length; i++) {
            if (abstractBinderC2984xArr[i].equals(binderC2985y)) {
                return abstractBinderC2984xArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m31822e(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m31823d(packageInfo, C2729a0.f7685a) : m31823d(packageInfo, C2729a0.f7685a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final C2947l0 m31821f(String str, boolean z, boolean z2) {
        C2947l0 m31573c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C2947l0.m31573c("null pkg");
        }
        if (!str.equals(this.f7932b)) {
            if (C2827b0.m31873e()) {
                m31573c = C2827b0.m31876b(str, C2838h.m31833f(this.f7931a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f7931a.getPackageManager().getPackageInfo(str, 64);
                    boolean m31833f = C2838h.m31833f(this.f7931a);
                    if (packageInfo == null) {
                        m31573c = C2947l0.m31573c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            BinderC2985y binderC2985y = new BinderC2985y(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            C2947l0 m31877a = C2827b0.m31877a(str2, binderC2985y, m31833f, false);
                            m31573c = (!m31877a.f8121a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C2827b0.m31877a(str2, binderC2985y, false, true).f8121a) ? m31877a : C2947l0.m31573c("debuggable release cert app rejected");
                        } else {
                            m31573c = C2947l0.m31573c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    return C2947l0.m31572d(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e);
                }
            }
            if (m31573c.f8121a) {
                this.f7932b = str;
            }
            return m31573c;
        }
        return C2947l0.m31574b();
    }

    /* renamed from: b */
    public boolean m31825b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m31822e(packageInfo, false)) {
            return true;
        }
        if (m31822e(packageInfo, true)) {
            if (C2838h.m31833f(this.f7931a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m31824c(int i) {
        C2947l0 m31573c;
        int length;
        String[] packagesForUid = this.f7931a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m31573c = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    m31573c = m31821f(packagesForUid[i2], false, false);
                    if (m31573c.f8121a) {
                        break;
                    }
                    i2++;
                } else {
                    com.google.android.gms.common.internal.s.j(m31573c);
                    break;
                }
            }
        } else {
            m31573c = C2947l0.m31573c("no pkgs");
        }
        m31573c.m31571e();
        return m31573c.f8121a;
    }
}
