package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p102o.C2956c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.d1 */
/* loaded from: classes2.dex */
public final class C2865d1 {

    /* renamed from: a */
    private static final Object f7966a = new Object();

    /* renamed from: b */
    private static boolean f7967b;

    /* renamed from: c */
    private static int f7968c;

    /* renamed from: a */
    public static int m31765a(Context context) {
        m31764b(context);
        return f7968c;
    }

    /* renamed from: b */
    private static void m31764b(Context context) {
        Bundle bundle;
        synchronized (f7966a) {
            if (f7967b) {
                return;
            }
            f7967b = true;
            try {
                bundle = C2956c.m31548a(context).m31553c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            bundle.getString("com.google.app.id");
            f7968c = bundle.getInt("com.google.android.gms.version");
        }
    }
}
