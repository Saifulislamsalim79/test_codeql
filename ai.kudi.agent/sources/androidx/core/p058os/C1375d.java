package androidx.core.p058os;

import android.content.res.Configuration;
import android.os.Build;
/* compiled from: ConfigurationCompat.java */
/* renamed from: androidx.core.os.d */
/* loaded from: classes2.dex */
public final class C1375d {
    /* renamed from: a */
    public static C1378f m36169a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C1378f.m36163e(configuration.getLocales()) : C1378f.m36167a(configuration.locale);
    }
}
