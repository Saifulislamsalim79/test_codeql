package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C2840i;
import com.google.android.gms.common.p102o.C2956c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.o */
/* loaded from: classes2.dex */
public final class C2976o {
    /* renamed from: a */
    public static boolean m31510a(Context context, int i) {
        if (m31509b(context, i, "com.google.android.gms")) {
            try {
                return C2840i.m31826a(context).m31825b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m31509b(Context context, int i, String str) {
        return C2956c.m31548a(context).m31549g(i, str);
    }
}
