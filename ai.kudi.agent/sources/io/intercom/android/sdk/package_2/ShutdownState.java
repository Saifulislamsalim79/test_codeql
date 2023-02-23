package io.intercom.android.sdk.package_2;

import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.sdk.commons.utilities.DeviceUtils;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.PreferenceKeys;
/* loaded from: classes.dex */
public class ShutdownState {
    private static final String PREFS_SHUTDOWN_EXPIRY = "ShutdownExpiry";
    private static final String PREFS_SHUTDOWN_FINGERPRINT = "ShutdownFingerprint";
    private static final String PREFS_SHUTDOWN_REASON = "ShutdownReason";
    private final AppIdentity appIdentity;
    private final Context context;
    private final SharedPreferences prefs;
    long shutdownExpiry;
    String shutdownFingerprint;
    private String shutdownReason;
    private final TimeProvider timeProvider;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public ShutdownState(Context context, AppIdentity appIdentity, TimeProvider timeProvider) {
        this.context = context;
        this.appIdentity = appIdentity;
        SharedPreferences $r4 = context.getSharedPreferences(PreferenceKeys.INTERCOM_SHUTDOWN_PREFS, 0);
        this.prefs = $r4;
        this.timeProvider = timeProvider;
        long $l0 = timeProvider.currentTimeMillis();
        this.shutdownExpiry = $r4.getLong(PREFS_SHUTDOWN_EXPIRY, $l0);
        String $r5 = this.prefs.getString(PREFS_SHUTDOWN_REASON, "");
        this.shutdownReason = $r5;
        SharedPreferences $r42 = this.prefs;
        String $r52 = generateAppFingerprint(context, appIdentity);
        this.shutdownFingerprint = $r42.getString(PREFS_SHUTDOWN_FINGERPRINT, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static String generateAppFingerprint(Context context, AppIdentity appIdentity) {
        StringBuilder $r1 = new StringBuilder();
        String $r3 = context.getPackageName();
        $r1.append($r3);
        $r1.append("-");
        String $r32 = DeviceUtils.getAppVersion(context);
        $r1.append($r32);
        $r1.append("-");
        String $r33 = appIdentity.appId();
        $r1.append($r33);
        $r1.append("-");
        $r1.append("5.5.0");
        String $r34 = $r1.toString();
        return $r34;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void persistCachedAttributes() {
        SharedPreferences $r1 = this.prefs;
        SharedPreferences.Editor $r2 = $r1.edit();
        String $r3 = this.shutdownFingerprint;
        SharedPreferences.Editor $r22 = $r2.putString(PREFS_SHUTDOWN_FINGERPRINT, $r3);
        String $r32 = this.shutdownReason;
        SharedPreferences.Editor $r23 = $r22.putString(PREFS_SHUTDOWN_REASON, $r32);
        long $l0 = this.shutdownExpiry;
        $r23.putLong(PREFS_SHUTDOWN_EXPIRY, $l0).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean canSendNetworkRequests() {
        long $l1 = this.shutdownExpiry;
        TimeProvider $r2 = this.timeProvider;
        long $l2 = $r2.currentTimeMillis();
        boolean $z0 = $l1 <= $l2;
        String $r3 = this.shutdownFingerprint;
        Context $r4 = this.context;
        AppIdentity $r1 = this.appIdentity;
        String $r5 = generateAppFingerprint($r4, $r1);
        boolean $z1 = $r3.equals($r5);
        return $z0 || !$z1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getShutdownReason() {
        String r1 = this.shutdownReason;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void updateShutdownState(long j, String str) {
        TimeProvider $r3 = this.timeProvider;
        long $l1 = $r3.currentTimeMillis();
        long $l0 = $l1 + j;
        this.shutdownExpiry = $l0;
        this.shutdownReason = str;
        Context $r4 = this.context;
        AppIdentity $r1 = this.appIdentity;
        String $r2 = generateAppFingerprint($r4, $r1);
        this.shutdownFingerprint = $r2;
        persistCachedAttributes();
    }
}
