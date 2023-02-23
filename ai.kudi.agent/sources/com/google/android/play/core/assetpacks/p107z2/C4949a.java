package com.google.android.play.core.assetpacks.p107z2;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.play.core.assetpacks.z2.a */
/* loaded from: classes2.dex */
public final class C4949a {

    /* renamed from: a */
    private static final Map<Integer, String> f12607a = new HashMap();

    /* renamed from: b */
    private static final Map<Integer, String> f12608b = new HashMap();

    static {
        f12607a.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        f12607a.put(-2, "The requested pack is not available.");
        f12607a.put(-3, "The request is invalid.");
        f12607a.put(-4, "The requested download is not found.");
        f12607a.put(-5, "The Asset Delivery API is not available.");
        f12607a.put(-6, "Network error. Unable to obtain the asset pack details.");
        f12607a.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        f12607a.put(-10, "Asset pack download failed due to insufficient storage.");
        f12607a.put(-11, "The Play Store app is either not installed or not the official version.");
        f12607a.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        f12607a.put(-13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        f12607a.put(-100, "Unknown error downloading an asset pack.");
        f12608b.put(-1, "APP_UNAVAILABLE");
        f12608b.put(-2, "PACK_UNAVAILABLE");
        f12608b.put(-3, "INVALID_REQUEST");
        f12608b.put(-4, "DOWNLOAD_NOT_FOUND");
        f12608b.put(-5, "API_NOT_AVAILABLE");
        f12608b.put(-6, "NETWORK_ERROR");
        f12608b.put(-7, "ACCESS_DENIED");
        f12608b.put(-10, "INSUFFICIENT_STORAGE");
        f12608b.put(-11, "PLAY_STORE_NOT_FOUND");
        f12608b.put(-12, "NETWORK_UNRESTRICTED");
        f12608b.put(-13, "APP_NOT_OWNED");
        f12608b.put(-100, "INTERNAL_ERROR");
    }

    /* renamed from: a */
    public static String m25973a(int i) {
        Map<Integer, String> map = f12607a;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            String str = f12607a.get(valueOf);
            String str2 = f12608b.get(valueOf);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
        return "";
    }
}
