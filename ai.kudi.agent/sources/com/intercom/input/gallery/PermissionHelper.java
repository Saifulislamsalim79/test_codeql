package com.intercom.input.gallery;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
/* loaded from: classes2.dex */
class PermissionHelper {
    private static final String ASKED_FOR_PERMISSION = "asked_for_permission";
    private static final String PREFS = "intercom_composer_permission_status_prefs";
    private final Activity activity;
    private final SharedPreferences sharedPreferences;

    PermissionHelper(Activity activity, SharedPreferences sharedPreferences) {
        this.activity = activity;
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PermissionHelper create(Activity activity) {
        return new PermissionHelper(activity, activity.getSharedPreferences(PREFS, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPermissionStatus(String str) {
        if (C1335a.m36327a(this.activity, str) == 0) {
            return 0;
        }
        if (C1291a.m36463t(this.activity, str)) {
            return 1;
        }
        return this.sharedPreferences.getBoolean(ASKED_FOR_PERMISSION, false) ? 2 : 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAskedForPermissionPref(boolean z) {
        this.sharedPreferences.edit().putBoolean(ASKED_FOR_PERMISSION, z).apply();
    }
}
