package com.google.android.gms.common.p101n;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@Deprecated
/* renamed from: com.google.android.gms.common.n.b */
/* loaded from: classes2.dex */
public class C2952b {
    /* renamed from: a */
    public static String m31560a(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
