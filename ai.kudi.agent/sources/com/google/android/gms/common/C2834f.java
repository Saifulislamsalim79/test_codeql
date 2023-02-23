package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2937y1;
import com.google.android.gms.common.p102o.C2956c;
import com.google.android.gms.common.util.C2971i;
import p272h.p286c.p287a.p300b.p307d.p312e.C8426d;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.f */
/* loaded from: classes2.dex */
public class C2834f {

    /* renamed from: a */
    public static final int f7916a = C2838h.f7921a;

    /* renamed from: b */
    private static final C2834f f7917b = new C2834f();

    /* renamed from: f */
    public static C2834f m31847f() {
        return f7917b;
    }

    /* renamed from: a */
    public int m31852a(Context context) {
        return C2838h.m31837b(context);
    }

    /* renamed from: b */
    public Intent mo31851b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return C2937y1.m31595c("com.google.android.gms");
        } else if (context != null && C2971i.m31529d(context)) {
            return C2937y1.m31597a();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f7916a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C2956c.m31548a(context).m31551e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C2937y1.m31596b("com.google.android.gms", sb.toString());
        }
    }

    /* renamed from: c */
    public PendingIntent mo31850c(Context context, int i, int i2) {
        return m31849d(context, i, i2, null);
    }

    /* renamed from: d */
    public PendingIntent m31849d(Context context, int i, int i2, String str) {
        Intent mo31851b = mo31851b(context, i, str);
        if (mo31851b == null) {
            return null;
        }
        return C8426d.m16106a(context, i2, mo31851b, C8426d.f20097a | 134217728);
    }

    /* renamed from: e */
    public String mo31848e(int i) {
        return C2838h.m31836c(i);
    }

    /* renamed from: g */
    public int mo31846g(Context context) {
        return mo31845h(context, f7916a);
    }

    /* renamed from: h */
    public int mo31845h(Context context, int i) {
        int m31832g = C2838h.m31832g(context, i);
        if (C2838h.m31831h(context, m31832g)) {
            return 18;
        }
        return m31832g;
    }

    /* renamed from: i */
    public boolean m31844i(Context context, String str) {
        return C2838h.m31827l(context, str);
    }

    /* renamed from: j */
    public boolean mo31843j(int i) {
        return C2838h.m31829j(i);
    }

    /* renamed from: k */
    public void m31842k(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        C2838h.m31838a(context, i);
    }
}
