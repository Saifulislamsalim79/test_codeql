package ai.kudi.agent.users.navigators;

import ai.kudi.agent.bills.p002ui.PerformPaymentActivity;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProcessTopupNavigator.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/users/navigators/ProcessTopupNavigator;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "navigate", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactions/domain/dto/TransactionRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessTopupNavigator {
    private final Context context;

    public ProcessTopupNavigator(Context context) {
        Log_OC.getArray(context, "context");
        this.context = context;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void navigate(TransactionRequest transactionRequest) {
        Log_OC.getArray(transactionRequest, TransactionRequest.TYPE_REQUEST);
        Context $r3 = this.context;
        Intent $r2 = new Intent($r3, PerformPaymentActivity.class);
        $r2.putExtra(TransactionRequest.PARCEL_NAME, transactionRequest);
        Context $r32 = this.context;
        $r32.startActivity($r2);
    }
}
