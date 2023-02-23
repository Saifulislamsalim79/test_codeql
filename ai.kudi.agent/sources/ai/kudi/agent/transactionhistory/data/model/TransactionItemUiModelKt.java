package ai.kudi.agent.transactionhistory.data.model;

import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactions.p032ui.PendingVerificationActivity;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* compiled from: TransactionItemUiModel.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"detailsScreenIntent", "Landroid/content/Intent;", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "context", "Landroid/content/Context;", "app_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionItemUiModelKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Intent detailsScreenIntent(TransactionItemUiModel.Transaction transaction, Context context) {
        boolean $z0;
        Log_OC.getArray(transaction, "<this>");
        Log_OC.getArray(context, "context");
        String $r2 = transaction.getStatus();
        $z0 = C13276s.m5442s($r2, "PENDING_FRAUD_CHECK", true);
        if (!$z0) {
            Intent $r3 = new Intent(context, TransactionDetailsActivity.class);
            String $r22 = transaction.getId();
            $r3.putExtra("transaction_details_extra_reference", $r22);
            return $r3;
        }
        Intent $r32 = new Intent(context, PendingVerificationActivity.class);
        String $r23 = transaction.getId();
        $r32.putExtra(PendingVerificationActivity.EXTRA_TRANS_REF, $r23);
        String $r24 = transaction.getCustomerName();
        $r32.putExtra("extra_customer_name", $r24);
        String $r25 = transaction.getCustomerPhone();
        $r32.putExtra(PendingVerificationActivity.EXTRA_CUSTOMER_PHONE_NUMBER, $r25);
        String $r26 = transaction.getCustomerPhone();
        $r32.putExtra(PendingVerificationActivity.EXTRA_CUSTOMER_PICTURE_ID, $r26);
        return $r32;
    }
}
