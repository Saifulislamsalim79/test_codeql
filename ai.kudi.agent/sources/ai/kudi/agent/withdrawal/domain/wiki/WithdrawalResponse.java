package ai.kudi.agent.withdrawal.domain.wiki;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: WithdrawalResponse.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/withdrawal/domain/dto/WithdrawalResponse;", "", TransactionField.STATUS, "", "reference", "redirectUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRedirectUrl", "()Ljava/lang/String;", "getReference", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WithdrawalResponse {
    private final String redirectUrl;
    private final String reference;
    private final String status;

    public WithdrawalResponse(String str, String str2, String str3) {
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, "reference");
        this.status = str;
        this.reference = str2;
        this.redirectUrl = str3;
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
    public static /* synthetic */ WithdrawalResponse copy$default(WithdrawalResponse withdrawalResponse, String $r1, String $r2, String $r3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = withdrawalResponse.status;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = withdrawalResponse.reference;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r3 = withdrawalResponse.redirectUrl;
        }
        WithdrawalResponse $r0 = withdrawalResponse.copy($r1, $r2, $r3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component1() {
        String r1 = this.status;
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
    public final String component2() {
        String r1 = this.reference;
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
    public final String component3() {
        String r1 = this.redirectUrl;
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
    public final WithdrawalResponse copy(String str, String str2, String str3) {
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, "reference");
        WithdrawalResponse $r0 = new WithdrawalResponse(str, str2, str3);
        return $r0;
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
        boolean $z0 = obj instanceof WithdrawalResponse;
        if ($z0) {
            WithdrawalResponse $r2 = (WithdrawalResponse) obj;
            String $r3 = this.status;
            String $r4 = $r2.status;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.reference;
                String $r42 = $r2.reference;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    String $r33 = this.redirectUrl;
                    String $r43 = $r2.redirectUrl;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    return $z04;
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
    public final String getRedirectUrl() {
        String r1 = this.redirectUrl;
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
    public final String getReference() {
        String r1 = this.reference;
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
    public final String getStatus() {
        String r1 = this.status;
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
        String $r1 = this.status;
        int $i0 = $r1.hashCode();
        String $r12 = this.reference;
        int $i1 = $r12.hashCode();
        int $i02 = (($i0 * 31) + $i1) * 31;
        String $r13 = this.redirectUrl;
        int $i12 = $r13 == null ? 0 : $r13.hashCode();
        return $i02 + $i12;
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
        $r2.append("WithdrawalResponse(status=");
        String $r1 = this.status;
        $r2.append($r1);
        $r2.append(", reference=");
        String $r12 = this.reference;
        $r2.append($r12);
        $r2.append(", redirectUrl=");
        String $r13 = this.redirectUrl;
        $r2.append((Object) $r13);
        $r2.append(')');
        String $r14 = $r2.toString();
        return $r14;
    }
}
