package io.intercom.android.sdk.identity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class SoftUserIdentity {
    static final SoftUserIdentity NONE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        SoftUserIdentity $r0 = create("", "", "", "", "", "", "", "");
        NONE = $r0;
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
    public static SoftUserIdentity create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AutoValue_SoftUserIdentity $r8 = new AutoValue_SoftUserIdentity(str, str2, str3, str4, str5, str6, str7, str8);
        return $r8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String anonymousId();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String data();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String email();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String encryptedUserId();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String fingerprint();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String hmac();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String intercomId();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isPresent() {
        SoftUserIdentity $r1 = NONE;
        boolean $z0 = equals($r1);
        return !$z0;
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isSameUser(io.intercom.android.sdk.identity.Registration r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getUserId()
            java.lang.String r1 = r7.getEmail()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L18
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L16
            goto L18
        L16:
            r2 = 0
            goto L19
        L18:
            r2 = 1
        L19:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L2e
            if (r2 == 0) goto L2d
            java.lang.String r5 = r6.userId()
            boolean r2 = r0.equals(r5)
            if (r2 == 0) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L42
            if (r2 == 0) goto L41
            java.lang.String r0 = r6.email()
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L41
            r3 = 1
        L41:
            return r3
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.identity.SoftUserIdentity.isSameUser(io.intercom.android.sdk.identity.Registration):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String userId();
}
