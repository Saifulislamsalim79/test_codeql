package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C1304d;
/* compiled from: PermissionChecker.java */
/* renamed from: androidx.core.content.c */
/* loaded from: classes2.dex */
public final class C1343c {
    /* renamed from: a */
    public static int m36298a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m36445b = C1304d.m36445b(str);
        if (m36445b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C1304d.m36446a(context, m36445b, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m36297b(Context context, String str) {
        return m36298a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
