package com.google.android.play.core.install.p108c;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.play.core.install.c.a */
/* loaded from: classes2.dex */
public final class C4956a {

    /* renamed from: a */
    private static final Map<Integer, String> f12617a = new HashMap();

    /* renamed from: b */
    private static final Map<Integer, String> f12618b = new HashMap();

    static {
        f12617a.put(-2, "An unknown error occurred.");
        f12617a.put(-3, "The API is not available on this device.");
        f12617a.put(-4, "The request that was sent by the app is malformed.");
        f12617a.put(-5, "The install is unavailable to this user or device.");
        f12617a.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        f12617a.put(-7, "The install/update has not been (fully) downloaded yet.");
        f12617a.put(-8, "The install is already in progress and there is no UI flow to resume.");
        f12617a.put(-9, "The Play Store app is either not installed or not the official version.");
        f12617a.put(-10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        f12617a.put(-100, "An internal error happened in the Play Store.");
        f12618b.put(-2, "ERROR_UNKNOWN");
        f12618b.put(-3, "ERROR_API_NOT_AVAILABLE");
        f12618b.put(-4, "ERROR_INVALID_REQUEST");
        f12618b.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        f12618b.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        f12618b.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        f12618b.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        f12618b.put(-100, "ERROR_INTERNAL_ERROR");
        f12618b.put(-9, "ERROR_PLAY_STORE_NOT_FOUND");
        f12618b.put(-10, "ERROR_APP_NOT_OWNED");
    }

    /* renamed from: a */
    public static String m25960a(int i) {
        Map<Integer, String> map = f12617a;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf) && f12618b.containsKey(valueOf)) {
            String str = f12617a.get(valueOf);
            String str2 = f12618b.get(valueOf);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
        return "";
    }
}
