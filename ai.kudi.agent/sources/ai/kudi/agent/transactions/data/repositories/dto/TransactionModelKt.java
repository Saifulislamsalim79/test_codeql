package ai.kudi.agent.transactions.data.repositories.dto;

import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.gson.C6784f;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionModel.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m10421d2 = {"toTransactionModel", "Lai/kudi/agent/transactions/data/repositories/dto/TransactionModel;", "map", "Ljava/util/HashMap;", "", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionModelKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final TransactionModel toTransactionModel(HashMap hashMap) {
        Log_OC.getArray(hashMap, "map");
        Object $r1 = hashMap.get("reference");
        String $r2 = (String) $r1;
        if ($r2 == null) {
            $r2 = "";
        }
        Object $r12 = hashMap.get(TransactionField.STATUS);
        String $r3 = (String) $r12;
        if ($r3 == null) {
            $r3 = "";
        }
        Object $r13 = hashMap.get("Status");
        String $r4 = (String) $r13;
        if ($r4 == null) {
            $r4 = "";
        }
        Object $r14 = hashMap.get(TransactionField.AMOUNT);
        String $r5 = (String) $r14;
        if ($r5 == null) {
            $r5 = "";
        }
        Object $r15 = hashMap.get("fee");
        String $r6 = (String) $r15;
        if ($r6 == null) {
            $r6 = "";
        }
        Object $r16 = hashMap.get(TransactionField.TRANSACTION_CHANNEL);
        String $r7 = (String) $r16;
        if ($r7 == null) {
            $r7 = "";
        }
        Object $r17 = hashMap.get("type");
        String $r8 = (String) $r17;
        if ($r8 == null) {
            $r8 = "";
        }
        Object $r18 = hashMap.get("Kudi Charge");
        String $r9 = (String) $r18;
        if ($r9 == null) {
            $r9 = "";
        }
        Object $r19 = hashMap.get(TransactionField.AMOUNT_ADDED);
        String $r10 = (String) $r19;
        if ($r10 == null) {
            $r10 = "";
        }
        Object $r110 = hashMap.get("payment_method");
        String $r11 = (String) $r110;
        if ($r11 == null) {
            $r11 = "";
        }
        Object $r111 = hashMap.get(TransactionField.TIME);
        String $r122 = (String) $r111;
        if ($r122 == null) {
            $r122 = "";
        }
        Date $r132 = StringExtKt.formatKudiDate($r122);
        Object $r112 = hashMap.get("refundReason");
        String $r123 = (String) $r112;
        if ($r123 == null) {
            $r123 = "";
        }
        C6784f $r142 = new C6784f();
        String $r152 = $r142.m20751u(hashMap);
        Log_OC.loadImage($r152, "toJson(map)");
        TransactionModel $r162 = new TransactionModel($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r132, $r11, $r123, $r152);
        return $r162;
    }
}
