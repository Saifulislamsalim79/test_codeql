package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
/* compiled from: AppOpsManagerCompat.java */
/* renamed from: androidx.core.app.d */
/* loaded from: classes2.dex */
public final class C1304d {
    /* renamed from: a */
    public static int m36446a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    /* renamed from: b */
    public static String m36445b(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
