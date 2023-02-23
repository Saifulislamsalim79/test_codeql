package com.google.android.gms.common.p102o;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C2974l;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.o.b */
/* loaded from: classes2.dex */
public class C2955b {

    /* renamed from: a */
    protected final Context f8131a;

    public C2955b(Context context) {
        this.f8131a = context;
    }

    /* renamed from: a */
    public int m31555a(String str) {
        return this.f8131a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m31554b(String str, String str2) {
        return this.f8131a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m31553c(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f8131a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence m31552d(String str) throws PackageManager.NameNotFoundException {
        return this.f8131a.getPackageManager().getApplicationLabel(this.f8131a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo m31551e(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f8131a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: f */
    public boolean m31550f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2954a.m31556a(this.f8131a);
        }
        if (!C2974l.m31515h() || (nameForUid = this.f8131a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f8131a.getPackageManager().isInstantApp(nameForUid);
    }

    /* renamed from: g */
    public final boolean m31549g(int i, String str) {
        if (C2974l.m31519d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f8131a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f8131a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
