package androidx.core.content.p056d;

import android.content.pm.PackageInfo;
import android.os.Build;
/* compiled from: PackageInfoCompat.java */
/* renamed from: androidx.core.content.d.a */
/* loaded from: classes2.dex */
public final class C1344a {
    /* renamed from: a */
    public static long m36296a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return packageInfo.versionCode;
    }
}
