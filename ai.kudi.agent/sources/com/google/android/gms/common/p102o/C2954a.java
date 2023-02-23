package com.google.android.gms.common.p102o;

import android.content.Context;
import com.google.android.gms.common.util.C2974l;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.o.a */
/* loaded from: classes2.dex */
public class C2954a {

    /* renamed from: a */
    private static Context f8129a;

    /* renamed from: b */
    private static Boolean f8130b;

    /* renamed from: a */
    public static synchronized boolean m31556a(Context context) {
        Boolean bool;
        synchronized (C2954a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f8129a;
            if (context2 != null && (bool = f8130b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f8130b = null;
            if (C2974l.m31515h()) {
                f8130b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f8130b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f8130b = Boolean.FALSE;
                }
            }
            f8129a = applicationContext;
            return f8130b.booleanValue();
        }
    }
}
