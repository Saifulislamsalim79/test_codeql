package io.intercom.android.sdk.experimental;

import io.intercom.android.sdk.identity.Registration;
import java.util.Map;
/* loaded from: classes.dex */
class UserMergeUtils {
    private static final String EMAIL = "email";
    private static final String USER_ID = "user_id";

    UserMergeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static void addIdentityDataToRegistration(Registration registration, Map map) {
        boolean $z0 = map.containsKey("email");
        if ($z0) {
            Object $r2 = map.get("email");
            String $r3 = $r2.toString();
            registration.withEmail($r3);
        }
        boolean $z02 = map.containsKey(USER_ID);
        if ($z02) {
            Object $r22 = map.get(USER_ID);
            String $r32 = $r22.toString();
            registration.withUserId($r32);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static boolean hasIdentificationData(Map map) {
        boolean $z0 = map.containsKey("email");
        if ($z0) {
            return true;
        }
        boolean $z02 = map.containsKey(USER_ID);
        return $z02;
    }
}
