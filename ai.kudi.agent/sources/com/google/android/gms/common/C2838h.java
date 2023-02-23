package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C2865d1;
import com.google.android.gms.common.p102o.C2956c;
import com.google.android.gms.common.util.C2971i;
import com.google.android.gms.common.util.C2974l;
import com.google.android.gms.common.util.C2976o;
import com.google.android.gms.common.util.C2980r;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.h */
/* loaded from: classes2.dex */
public class C2838h {
    @Deprecated

    /* renamed from: a */
    public static final int f7921a = 12451000;

    /* renamed from: c */
    private static boolean f7923c = false;

    /* renamed from: d */
    static boolean f7924d = false;

    /* renamed from: b */
    static final AtomicBoolean f7922b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f7925e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m31838a(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int mo31845h = C2834f.m31847f().mo31845h(context, i);
        if (mo31845h != 0) {
            Intent mo31851b = C2834f.m31847f().mo31851b(context, mo31845h, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(mo31845h);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (mo31851b == null) {
                throw new GooglePlayServicesNotAvailableException(mo31845h);
            }
            throw new GooglePlayServicesRepairableException(mo31845h, "Google Play Services not available", mo31851b);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static int m31837b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static String m31836c(int i) {
        return C2826b.m31878u(i);
    }

    /* renamed from: d */
    public static Context m31835d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Resources m31834e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m31833f(Context context) {
        try {
            if (!f7924d) {
                PackageInfo m31551e = C2956c.m31548a(context).m31551e("com.google.android.gms", 64);
                C2840i.m31826a(context);
                if (m31551e == null || C2840i.m31822e(m31551e, false) || !C2840i.m31822e(m31551e, true)) {
                    f7923c = false;
                } else {
                    f7923c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f7924d = true;
        }
        return f7923c || !C2971i.m31531b();
    }

    @Deprecated
    /* renamed from: g */
    public static int m31832g(Context context, int i) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C2942j.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f7925e.get()) {
            int m31765a = C2865d1.m31765a(context);
            if (m31765a != 0) {
                if (m31765a != f7921a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(m31765a);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        boolean z = (C2971i.m31529d(context) || C2971i.m31527f(context)) ? false : true;
        com.google.android.gms.common.internal.s.a(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C2840i.m31826a(context);
            if (!C2840i.m31822e(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z) {
                    com.google.android.gms.common.internal.s.j(packageInfo);
                    if (!C2840i.m31822e(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (C2980r.m31503a(packageInfo2.versionCode) < C2980r.m31503a(i)) {
                    int i2 = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 82);
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(i);
                    sb.append(" but found ");
                    sb.append(i2);
                    Log.w("GooglePlayServicesUtil", sb.toString());
                    return 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m31831h(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m31827l(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m31830i(Context context) {
        if (C2974l.m31520c()) {
            Object systemService = context.getSystemService("user");
            com.google.android.gms.common.internal.s.j(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
        }
        return false;
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m31829j(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    /* renamed from: k */
    public static boolean m31828k(Context context, int i, String str) {
        return C2976o.m31509b(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static boolean m31827l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C2974l.m31517f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        return applicationInfo.enabled && !m31830i(context);
    }
}
