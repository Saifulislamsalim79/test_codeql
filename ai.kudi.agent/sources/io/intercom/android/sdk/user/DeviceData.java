package io.intercom.android.sdk.user;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.intercom.android.sdk.commons.utilities.DeviceUtils;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes3.dex */
public class DeviceData {
    private static final String PREFS_PUSH_TOKEN = "push_token";

    public static void cacheDeviceToken(Context context, String str) {
        getPreferences(context).edit().putString(PREFS_PUSH_TOKEN, str).apply();
    }

    public static Map<String, Object> generateDeviceData(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("platform_version", Build.VERSION.RELEASE);
        hashMap.put("platform", Build.MODEL);
        hashMap.put("browser", "Intercom-Android-SDK");
        hashMap.put("version", DeviceUtils.getAppVersion(context));
        hashMap.put("application", getApplicationName(context));
        hashMap.put("application_id", DeviceUtils.getAppName(context));
        hashMap.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, Locale.getDefault().getDisplayLanguage());
        String string = getPreferences(context).getString(PREFS_PUSH_TOKEN, "");
        if (!string.isEmpty()) {
            hashMap.put("device_token", string);
        }
        return hashMap;
    }

    static String getApplicationName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            return (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "").toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getDeviceToken(Context context) {
        return getPreferences(context).getString(PREFS_PUSH_TOKEN, "");
    }

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PreferenceKeys.INTERCOM_DATA_PREFS, 0);
    }

    public static boolean hasCachedDeviceToken(Context context, String str) {
        return str.equals(getDeviceToken(context));
    }
}
