package androidx.core.p058os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* compiled from: UserManagerCompat.java */
/* renamed from: androidx.core.os.k */
/* loaded from: classes2.dex */
public class C1383k {
    /* renamed from: a */
    public static boolean m36158a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
