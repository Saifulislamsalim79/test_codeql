package io.intercom.android.sdk.package_2;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class UserUpdateRequest {
    private static final String CUSTOM_ATTRIBUTES = "custom_attributes";
    private final Map<String, Object> attributes;
    private final int batchSize;
    private final boolean internalUpdate;
    private final boolean newSession;
    private final boolean sentFromBackground;

    public UserUpdateRequest() {
        this(false, true, null, 0, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    UserUpdateRequest(boolean z, boolean z2, Map map, int i, boolean z3) {
        HashMap $r2 = new HashMap();
        this.attributes = $r2;
        if (map != null) {
            $r2.putAll(map);
        }
        this.sentFromBackground = z2;
        this.newSession = z;
        this.batchSize = i;
        this.internalUpdate = z3;
    }

    public UserUpdateRequest(boolean z, boolean z2, Map map, boolean z3) {
        this(z, z2, map, 1, z3);
    }

    public UserUpdateRequest(boolean z, boolean z2, boolean z3) {
        this(z, z2, null, 1, z3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:16:0x0048 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean attributesWillOverwriteExistingAttributes(java.util.Map r13) {
        /*
            r12 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.attributes
            java.util.Map r0 = getCustomAttributes(r0)
            java.util.Map r1 = getCustomAttributes(r13)
            if (r0 == 0) goto L3a
            if (r1 == 0) goto L3a
            java.util.Set r2 = r0.entrySet()
            java.util.Iterator r3 = r2.iterator()
        L16:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r5 = r3.next()
            r7 = r5
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            r6 = r7
            java.lang.Object r5 = r6.getKey()
            java.lang.Object r5 = r1.get(r5)
            if (r5 == 0) goto L16
            java.lang.Object r8 = r6.getValue()
            boolean r4 = r5.equals(r8)
            if (r4 != 0) goto L16
            r9 = 1
            return r9
        L3a:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.attributes
            java.util.Set r2 = r0.entrySet()
            java.util.Iterator r3 = r2.iterator()
        L44:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r5 = r3.next()
            r10 = r5
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            r6 = r10
            java.lang.Object r5 = r6.getKey()
            java.lang.String r11 = "custom_attributes"
            boolean r4 = r11.equals(r5)
            if (r4 == 0) goto L5f
            goto L44
        L5f:
            java.lang.Object r5 = r6.getKey()
            java.lang.Object r5 = r13.get(r5)
            if (r5 == 0) goto L44
            java.lang.Object r8 = r6.getValue()
            boolean r4 = r5.equals(r8)
            if (r4 != 0) goto L44
            r9 = 1
            return r9
        L75:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.package_2.UserUpdateRequest.attributesWillOverwriteExistingAttributes(java.util.Map):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static Map getCustomAttributes(Map map) {
        Object $r0 = map.get(CUSTOM_ATTRIBUTES);
        boolean $z0 = $r0 instanceof Map;
        if ($z0) {
            Map $r1 = (Map) $r0;
            return $r1;
        }
        return null;
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
    private static Map mergeAttributes(Map map, Map map2) {
        HashMap r5 = new HashMap(map);
        Map $r3 = getCustomAttributes(r5);
        HashMap hashMap = $r3;
        Map $r1 = getCustomAttributes(map2);
        r5.putAll(map2);
        if ($r1 != null) {
            boolean $z0 = $r1.isEmpty();
            if (!$z0) {
                if ($r3 == null) {
                    hashMap = r5;
                    HashMap r52 = new HashMap();
                }
                Map $r2 = hashMap;
                $r2.putAll($r1);
                r5.put(CUSTOM_ATTRIBUTES, hashMap);
                return r5;
            }
        }
        if ($r3 != null) {
            r5.put(CUSTOM_ATTRIBUTES, $r3);
            return r5;
        }
        r5.remove(CUSTOM_ATTRIBUTES);
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean canMergeUpdate(UserUpdateRequest userUpdateRequest) {
        Map $r2 = userUpdateRequest.attributes;
        boolean $z0 = attributesWillOverwriteExistingAttributes($r2);
        if ($z0) {
            return false;
        }
        boolean $z02 = this.newSession;
        if ($z02) {
            boolean $z03 = userUpdateRequest.newSession;
            return !$z03;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class $r2 = obj.getClass();
            if (io.intercom.android.sdk.api.UserUpdateRequest.class != $r2) {
                return false;
            }
            UserUpdateRequest $r3 = (UserUpdateRequest) obj;
            boolean $z0 = this.newSession;
            boolean $z1 = $r3.newSession;
            if ($z0 != $z1) {
                return false;
            }
            int $i0 = this.batchSize;
            int $i1 = $r3.batchSize;
            if ($i0 != $i1) {
                return false;
            }
            boolean $z02 = this.sentFromBackground;
            boolean $z12 = $r3.sentFromBackground;
            if ($z02 != $z12) {
                return false;
            }
            boolean $z03 = this.internalUpdate;
            boolean $z13 = $r3.internalUpdate;
            if ($z03 != $z13) {
                return false;
            }
            Map $r4 = this.attributes;
            Map $r5 = $r3.attributes;
            boolean $z04 = $r4.equals($r5);
            return $z04;
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
    public Map getAttributes() {
        Map r1 = this.attributes;
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
    public int getBatchSize() {
        int i0 = this.batchSize;
        return i0;
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
    public int hashCode() {
        Map $r1 = this.attributes;
        int $i0 = $r1.hashCode();
        int $i1 = this.batchSize;
        boolean $z0 = this.sentFromBackground;
        boolean $z02 = this.internalUpdate;
        return ((((((($i0 * 31) + (this.newSession ? 1 : 0)) * 31) + $i1) * 31) + ($z0 ? 1 : 0)) * 31) + ($z02 ? 1 : 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isInternalUpdate() {
        boolean z0 = this.internalUpdate;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isNewSession() {
        boolean z0 = this.newSession;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isSentFromBackground() {
        boolean z0 = this.sentFromBackground;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isValidUpdate() {
        boolean $z0 = this.internalUpdate;
        if ($z0) {
            return true;
        }
        Map $r1 = this.attributes;
        boolean $z02 = $r1.isEmpty();
        return !$z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.intercom.android.sdk.package_2.UserUpdateRequest merge(io.intercom.android.sdk.package_2.UserUpdateRequest r14) {
        /*
            r13 = this;
            boolean r6 = r13.internalUpdate
            if (r6 != 0) goto Lb
            boolean r6 = r14.internalUpdate
            if (r6 == 0) goto L9
            goto Lb
        L9:
            r6 = 0
            goto Lc
        Lb:
            r6 = 1
        Lc:
            boolean r7 = r13.newSession
            if (r7 != 0) goto L17
            boolean r7 = r14.newSession
            if (r7 == 0) goto L15
            goto L17
        L15:
            r7 = 0
            goto L18
        L17:
            r7 = 1
        L18:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.attributes
            java.util.Map<java.lang.String, java.lang.Object> r9 = r14.attributes
            java.util.Map r8 = mergeAttributes(r8, r9)
            boolean r10 = r13.sentFromBackground
            if (r10 == 0) goto L2a
            boolean r10 = r14.sentFromBackground
            if (r10 == 0) goto L2a
            r10 = 1
            goto L2b
        L2a:
            r10 = 0
        L2b:
            int r11 = r13.batchSize
            int r12 = r14.batchSize
            int r11 = r11 + r12
            io.intercom.android.sdk.package_2.UserUpdateRequest r13 = new io.intercom.android.sdk.package_2.UserUpdateRequest
            r0 = r13
            r1 = r7
            r2 = r10
            r3 = r8
            r4 = r11
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.package_2.UserUpdateRequest.merge(io.intercom.android.sdk.package_2.UserUpdateRequest):io.intercom.android.sdk.package_2.UserUpdateRequest");
    }
}
