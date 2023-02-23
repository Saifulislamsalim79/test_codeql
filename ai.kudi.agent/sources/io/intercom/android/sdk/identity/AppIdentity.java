package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.sdk.utilities.PreferenceKeys;
/* loaded from: classes.dex */
public abstract class AppIdentity {
    private static final String PREFS_API_KEY = "ApiKey";
    private static final String PREFS_APP_ID = "AppId";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static AppIdentity create(String str, String str2) {
        AutoValue_AppIdentity $r2 = new AutoValue_AppIdentity(str, str2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static AppIdentity loadFromDevice(Context context) {
        SharedPreferences $r1 = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        String $r2 = $r1.getString(PREFS_API_KEY, "");
        String $r3 = $r1.getString(PREFS_APP_ID, "");
        AppIdentity $r4 = create($r2, $r3);
        return $r4;
    }

    public abstract String apiKey();

    public abstract String appId();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void persist(Context context) {
        SharedPreferences $r2 = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        SharedPreferences.Editor $r3 = $r2.edit();
        String $r4 = apiKey();
        SharedPreferences.Editor $r32 = $r3.putString(PREFS_API_KEY, $r4);
        String $r42 = appId();
        $r32.putString(PREFS_APP_ID, $r42).apply();
    }
}
