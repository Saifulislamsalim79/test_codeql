package io.intercom.android.sdk.identity;
/* loaded from: classes.dex */
final class AutoValue_SoftUserIdentity extends SoftUserIdentity {
    private final String anonymousId;
    private final String data;
    private final String email;
    private final String encryptedUserId;
    private final String fingerprint;
    private final String hmac;
    private final String intercomId;
    private final String userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public AutoValue_SoftUserIdentity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str == null) {
            NullPointerException $r9 = new NullPointerException("Null anonymousId");
            throw $r9;
        }
        this.anonymousId = str;
        if (str2 == null) {
            NullPointerException $r92 = new NullPointerException("Null data");
            throw $r92;
        }
        this.data = str2;
        if (str3 == null) {
            NullPointerException $r93 = new NullPointerException("Null email");
            throw $r93;
        }
        this.email = str3;
        if (str4 == null) {
            NullPointerException $r94 = new NullPointerException("Null fingerprint");
            throw $r94;
        }
        this.fingerprint = str4;
        if (str5 == null) {
            NullPointerException $r95 = new NullPointerException("Null hmac");
            throw $r95;
        }
        this.hmac = str5;
        if (str6 == null) {
            NullPointerException $r96 = new NullPointerException("Null intercomId");
            throw $r96;
        }
        this.intercomId = str6;
        if (str7 == null) {
            NullPointerException $r97 = new NullPointerException("Null userId");
            throw $r97;
        }
        this.userId = str7;
        if (str8 != null) {
            this.encryptedUserId = str8;
        } else {
            NullPointerException $r98 = new NullPointerException("Null encryptedUserId");
            throw $r98;
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
    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    String anonymousId() {
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
    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    String data() {
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
    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    String email() {
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
    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    String encryptedUserId() {
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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean $z0 = obj instanceof SoftUserIdentity;
        if ($z0) {
            SoftUserIdentity $r2 = (SoftUserIdentity) obj;
            String $r3 = this.anonymousId;
            String $r4 = $r2.anonymousId();
            boolean $z02 = $r3.equals($r4);
            if ($z02) {
                String $r32 = this.data;
                String $r42 = $r2.data();
                boolean $z03 = $r32.equals($r42);
                if ($z03) {
                    String $r33 = this.email;
                    String $r43 = $r2.email();
                    boolean $z04 = $r33.equals($r43);
                    if ($z04) {
                        String $r34 = this.fingerprint;
                        String $r44 = $r2.fingerprint();
                        boolean $z05 = $r34.equals($r44);
                        if ($z05) {
                            String $r35 = this.hmac;
                            String $r45 = $r2.hmac();
                            boolean $z06 = $r35.equals($r45);
                            if ($z06) {
                                String $r36 = this.intercomId;
                                String $r46 = $r2.intercomId();
                                boolean $z07 = $r36.equals($r46);
                                if ($z07) {
                                    String $r37 = this.userId;
                                    String $r47 = $r2.userId();
                                    boolean $z08 = $r37.equals($r47);
                                    if ($z08) {
                                        String $r38 = this.encryptedUserId;
                                        String $r48 = $r2.encryptedUserId();
                                        boolean $z09 = $r38.equals($r48);
                                        return $z09;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
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
    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    String fingerprint() {
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
    public int hashCode() {
        String $r1 = this.anonymousId;
        int $i0 = $r1.hashCode();
        String $r12 = this.data;
        int $i1 = $r12.hashCode();
        String $r13 = this.email;
        int $i12 = $r13.hashCode();
        String $r14 = this.fingerprint;
        int $i13 = $r14.hashCode();
        String $r15 = this.hmac;
        int $i14 = $r15.hashCode();
        String $r16 = this.intercomId;
        int $i15 = $r16.hashCode();
        String $r17 = this.userId;
        int $i16 = $r17.hashCode();
        String $r18 = this.encryptedUserId;
        int $i17 = $r18.hashCode();
        return (((((((((((((($i0 ^ 1000003) * 1000003) ^ $i1) * 1000003) ^ $i12) * 1000003) ^ $i13) * 1000003) ^ $i14) * 1000003) ^ $i15) * 1000003) ^ $i16) * 1000003) ^ $i17;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    String hmac() {
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
    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    String intercomId() {
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
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("SoftUserIdentity{anonymousId=");
        String $r1 = this.anonymousId;
        $r2.append($r1);
        $r2.append(", data=");
        String $r12 = this.data;
        $r2.append($r12);
        $r2.append(", email=");
        String $r13 = this.email;
        $r2.append($r13);
        $r2.append(", fingerprint=");
        String $r14 = this.fingerprint;
        $r2.append($r14);
        $r2.append(", hmac=");
        String $r15 = this.hmac;
        $r2.append($r15);
        $r2.append(", intercomId=");
        String $r16 = this.intercomId;
        $r2.append($r16);
        $r2.append(", userId=");
        String $r17 = this.userId;
        $r2.append($r17);
        $r2.append(", encryptedUserId=");
        String $r18 = this.encryptedUserId;
        $r2.append($r18);
        $r2.append("}");
        String $r19 = $r2.toString();
        return $r19;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    String userId() {
        String r1 = this.userId;
        return r1;
    }
}
