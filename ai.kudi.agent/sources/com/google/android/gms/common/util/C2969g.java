package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.g */
/* loaded from: classes2.dex */
public final class C2969g {
    /* renamed from: a */
    public static boolean m31536a(Context context, Throwable th) {
        try {
            com.google.android.gms.common.internal.s.j(context);
            com.google.android.gms.common.internal.s.j(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
