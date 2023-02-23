package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.models.User;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class UserIdentity {
    public static final String ANONYMOUS_ID = "anonymous_id";
    public static final String EMAIL = "email";
    public static final String INTERCOM_ID = "intercom_id";
    private static final String KEY_ANONYMOUS_ID = "INTERCOM_SDK_ANONYMOUS_ID";
    private static final String KEY_EMAIL_ID = "INTERCOM_SDK_EMAIL_ID";
    private static final String KEY_INTERCOM_ID = "INTERCOM_SDK_INTERCOM_ID";
    private static final String KEY_PREFIX = "intercomsdk-session-";
    private static final String KEY_SECURE_DATA = "SecureMode_Data";
    private static final String KEY_SECURE_HMAC = "SecureMode_HMAC";
    private static final String KEY_USER_ID = "INTERCOM_SDK_USER_ID";
    private static final String TYPE = "type";
    private static final String USER = "user";
    private static final String USER_ID = "user_id";
    private String anonymousId;
    private String data;
    private String email;
    private String encryptedUserId;
    private String fingerprint;
    private String hmac;
    private String intercomId;
    private final SharedPreferences prefs;
    private SoftUserIdentity softUserIdentity;
    private String userId;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public UserIdentity(Context context) {
        this.fingerprint = "";
        SoftUserIdentity $r2 = SoftUserIdentity.NONE;
        this.softUserIdentity = $r2;
        SharedPreferences $r3 = context.getSharedPreferences(PreferenceKeys.INTERCOM_USER_PREFS, 0);
        this.prefs = $r3;
        String $r4 = $r3.getString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", "");
        this.anonymousId = $r4;
        String $r42 = this.prefs.getString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", "");
        this.intercomId = $r42;
        String $r43 = this.prefs.getString("intercomsdk-session-INTERCOM_SDK_USER_ID", "");
        this.userId = $r43;
        String $r44 = this.prefs.getString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", "");
        this.email = $r44;
        String $r45 = this.prefs.getString("intercomsdk-session-SecureMode_Data", "");
        this.data = $r45;
        String $r46 = this.prefs.getString("intercomsdk-session-SecureMode_HMAC", "");
        this.hmac = $r46;
        this.encryptedUserId = "";
        boolean $z0 = identityExists();
        if ($z0) {
            String $r47 = generateFingerprint();
            this.fingerprint = $r47;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private String generateFingerprint() {
        UUID $r1 = UUID.randomUUID();
        String $r2 = $r1.toString();
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
    public boolean canRegisterIdentifiedUser(Registration registration) {
        boolean $z0 = registration.isValidRegistration();
        if ($z0) {
            boolean $z02 = isIdentified();
            return !$z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean canRegisterUnidentifiedUser() {
        boolean $z0 = identityExists();
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getAnonymousId() {
        String r1 = this.anonymousId;
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
    public String getData() {
        String r1 = this.data;
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
    public String getEmail() {
        String r1 = this.email;
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
    public String getEncryptedUserId() {
        String r1 = this.encryptedUserId;
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
    public String getFingerprint() {
        String r1 = this.fingerprint;
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
    public String getHmac() {
        String r1 = this.hmac;
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
    public String getIntercomId() {
        String r1 = this.intercomId;
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
    public String getSoftUserIdentityHmac() {
        SoftUserIdentity $r2 = this.softUserIdentity;
        String $r1 = $r2.hmac();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getUserId() {
        String r1 = this.userId;
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
    public void hardReset() {
        SoftUserIdentity $r1 = SoftUserIdentity.NONE;
        this.softUserIdentity = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean hasIntercomId() {
        String $r1 = getIntercomId();
        boolean $z0 = $r1.isEmpty();
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean identityExists() {
        String $r1 = this.email;
        boolean $z0 = $r1.isEmpty();
        if ($z0) {
            String $r12 = this.userId;
            boolean $z02 = $r12.isEmpty();
            if ($z02) {
                String $r13 = this.intercomId;
                boolean $z03 = $r13.isEmpty();
                if ($z03) {
                    String $r14 = this.anonymousId;
                    boolean $z04 = $r14.isEmpty();
                    return !$z04;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isIdentified() {
        boolean $z0 = identityExists();
        if ($z0) {
            boolean $z02 = isUnidentified();
            return !$z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isSameUser(Registration registration) {
        boolean $z0 = isUnidentified();
        if ($z0) {
            return false;
        }
        SoftUserIdentity $r2 = this.softUserIdentity;
        boolean $z02 = $r2.isSameUser(registration);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isSoftReset() {
        SoftUserIdentity $r1 = this.softUserIdentity;
        boolean $z0 = $r1.isPresent();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isUnidentified() {
        String $r1 = this.anonymousId;
        boolean $z0 = $r1.isEmpty();
        if ($z0) {
            return false;
        }
        String $r12 = this.email;
        boolean $z02 = $r12.isEmpty();
        if ($z02) {
            String $r13 = this.userId;
            boolean $z03 = $r13.isEmpty();
            return $z03;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void registerIdentifiedUser(Registration registration) {
        this.intercomId = "";
        SharedPreferences $r2 = this.prefs;
        SharedPreferences.Editor $r3 = $r2.edit();
        String $r4 = this.intercomId;
        SharedPreferences.Editor $r32 = $r3.putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", $r4);
        String $r42 = registration.getUserId();
        boolean $z0 = $r42.isEmpty();
        if (!$z0) {
            String $r43 = registration.getUserId();
            this.userId = $r43;
            $r32.putString("intercomsdk-session-INTERCOM_SDK_USER_ID", $r43);
        }
        String $r44 = registration.getEmail();
        boolean $z02 = $r44.isEmpty();
        if (!$z02) {
            String $r45 = registration.getEmail();
            this.email = $r45;
            $r32.putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", $r45);
        }
        $r32.apply();
        String $r46 = this.fingerprint;
        boolean $z03 = $r46.isEmpty();
        if ($z03) {
            String $r47 = generateFingerprint();
            this.fingerprint = $r47;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void registerUnidentifiedUser() {
        UUID $r2 = UUID.randomUUID();
        String $r1 = $r2.toString();
        this.anonymousId = $r1;
        SharedPreferences $r3 = this.prefs;
        SharedPreferences.Editor $r4 = $r3.edit();
        String $r12 = this.anonymousId;
        $r4.putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", $r12).apply();
        String $r13 = this.fingerprint;
        boolean $z0 = $r13.isEmpty();
        if ($z0) {
            String $r14 = generateFingerprint();
            this.fingerprint = $r14;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean registrationHasAttributes(Registration registration) {
        if (registration != null) {
            UserAttributes $r2 = registration.getAttributes();
            if ($r2 != null) {
                UserAttributes $r22 = registration.getAttributes();
                boolean $z0 = $r22.isEmpty();
                return !$z0;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setSecureMode(String str, String str2) {
        this.data = str2;
        this.hmac = str;
        SharedPreferences $r3 = this.prefs;
        SharedPreferences.Editor $r4 = $r3.edit();
        $r4.putString("intercomsdk-session-SecureMode_Data", str2).putString("intercomsdk-session-SecureMode_HMAC", str).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setUserHash(String str) {
        this.hmac = str;
        this.data = "";
        SharedPreferences $r2 = this.prefs;
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putString("intercomsdk-session-SecureMode_HMAC", str).remove("intercomsdk-session-SecureMode_Data").apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void softReset() {
        boolean $z0 = isSoftReset();
        if ($z0) {
            return;
        }
        String $r1 = this.anonymousId;
        String $r2 = this.data;
        String $r3 = this.email;
        String $r4 = this.fingerprint;
        String $r5 = this.hmac;
        String $r6 = this.intercomId;
        String $r7 = this.userId;
        String $r8 = this.encryptedUserId;
        SoftUserIdentity $r9 = SoftUserIdentity.create($r1, $r2, $r3, $r4, $r5, $r6, $r7, $r8);
        this.softUserIdentity = $r9;
        SharedPreferences $r10 = this.prefs;
        SharedPreferences.Editor $r11 = $r10.edit();
        $r11.clear().apply();
        this.anonymousId = "";
        this.intercomId = "";
        this.encryptedUserId = "";
        this.userId = "";
        this.email = "";
        this.data = "";
        this.hmac = "";
        this.fingerprint = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void softRestart() {
        SoftUserIdentity $r1 = this.softUserIdentity;
        String $r2 = $r1.userId();
        this.userId = $r2;
        SoftUserIdentity $r12 = this.softUserIdentity;
        String $r22 = $r12.email();
        this.email = $r22;
        SoftUserIdentity $r13 = this.softUserIdentity;
        String $r23 = $r13.anonymousId();
        this.anonymousId = $r23;
        SoftUserIdentity $r14 = this.softUserIdentity;
        String $r24 = $r14.intercomId();
        this.intercomId = $r24;
        SoftUserIdentity $r15 = this.softUserIdentity;
        String $r25 = $r15.encryptedUserId();
        this.encryptedUserId = $r25;
        SoftUserIdentity $r16 = this.softUserIdentity;
        String $r26 = $r16.data();
        this.data = $r26;
        SoftUserIdentity $r17 = this.softUserIdentity;
        String $r27 = $r17.hmac();
        this.hmac = $r27;
        SoftUserIdentity $r18 = this.softUserIdentity;
        String $r28 = $r18.fingerprint();
        this.fingerprint = $r28;
        SharedPreferences $r3 = this.prefs;
        SharedPreferences.Editor $r4 = $r3.edit();
        String $r29 = this.userId;
        SharedPreferences.Editor $r42 = $r4.putString("intercomsdk-session-INTERCOM_SDK_USER_ID", $r29);
        String $r210 = this.email;
        SharedPreferences.Editor $r43 = $r42.putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", $r210);
        String $r211 = this.anonymousId;
        SharedPreferences.Editor $r44 = $r43.putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", $r211);
        String $r212 = this.intercomId;
        $r44.putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", $r212).apply();
        SoftUserIdentity $r19 = SoftUserIdentity.NONE;
        this.softUserIdentity = $r19;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean softUserIdentityHmacDiffers(String str) {
        SoftUserIdentity $r2 = this.softUserIdentity;
        boolean $z0 = $r2.isPresent();
        if ($z0) {
            String $r3 = getSoftUserIdentityHmac();
            boolean $z02 = $r3.equals(str);
            return !$z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Map toMap() {
        HashMap $r1 = new HashMap();
        String $r2 = this.anonymousId;
        boolean $z0 = $r2.isEmpty();
        if ($z0) {
            String $r22 = this.intercomId;
            boolean $z02 = $r22.isEmpty();
            if (!$z02) {
                String $r23 = this.intercomId;
                $r1.put(INTERCOM_ID, $r23);
            }
        } else {
            String $r24 = this.anonymousId;
            $r1.put(ANONYMOUS_ID, $r24);
        }
        String $r25 = this.userId;
        boolean $z03 = $r25.isEmpty();
        if (!$z03) {
            String $r26 = this.userId;
            $r1.put(USER_ID, $r26);
        }
        String $r27 = this.email;
        boolean $z04 = $r27.isEmpty();
        if (!$z04) {
            String $r28 = this.email;
            $r1.put("email", $r28);
        }
        $r1.put("type", USER);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void update(User user) {
        User $r2 = User.NULL;
        if (user == $r2) {
            return;
        }
        String $r3 = user.getUserId();
        this.userId = $r3;
        String $r32 = user.getEmail();
        this.email = $r32;
        String $r33 = user.getAnonymousId();
        this.anonymousId = $r33;
        String $r34 = user.getEncryptedUserId();
        this.encryptedUserId = $r34;
        SharedPreferences $r4 = this.prefs;
        SharedPreferences.Editor $r5 = $r4.edit();
        String $r35 = this.userId;
        SharedPreferences.Editor $r52 = $r5.putString("intercomsdk-session-INTERCOM_SDK_USER_ID", $r35);
        String $r36 = this.email;
        SharedPreferences.Editor $r53 = $r52.putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", $r36);
        String $r37 = this.anonymousId;
        SharedPreferences.Editor $r54 = $r53.putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", $r37);
        String $r38 = user.getIntercomId();
        boolean $z0 = $r38.isEmpty();
        if (!$z0) {
            String $r39 = user.getIntercomId();
            this.intercomId = $r39;
            $r54.putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", $r39);
        }
        $r54.apply();
    }
}
