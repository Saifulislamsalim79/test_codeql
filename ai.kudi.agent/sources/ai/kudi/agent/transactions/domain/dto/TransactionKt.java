package ai.kudi.agent.transactions.domain.dto;

import ai.kudi.agent.transactions.data.repositories.dto.TransactionModel;
import com.google.gson.C6784f;
import com.google.gson.p184v.C6916a;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: Transaction.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00072\u0006\u0010\u0004\u001a\u00020\u0005*\"\u0010\b\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0016\u0010\n\"\u0002`\u00032\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000b"}, m10421d2 = {"toReceiptTransaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/ReceiptTransaction;", "transactionModel", "Lai/kudi/agent/transactions/data/repositories/dto/TransactionModel;", "toTransaction", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "ReceiptTransaction", "Lkotlin/collections/HashMap;", "Transaction", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final HashMap toReceiptTransaction(TransactionModel transactionModel) {
        Log_OC.getArray(transactionModel, "transactionModel");
        Type $r3 = new C6916a<HashMap<String, String>>() { // from class: ai.kudi.agent.transactions.domain.dto.TransactionKt$toReceiptTransaction$type$1
        }.getType();
        C6784f $r0 = new C6784f();
        String $r4 = transactionModel.getRaw();
        Object $r5 = $r0.m20759m($r4, $r3);
        Log_OC.loadImage($r5, "Gson().fromJson(transactionModel.raw, type)");
        HashMap $r6 = (HashMap) $r5;
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final HashMap toTransaction(TransactionModel transactionModel) {
        Log_OC.getArray(transactionModel, "transactionModel");
        Type $r3 = new C6916a<HashMap<String, String>>() { // from class: ai.kudi.agent.transactions.domain.dto.TransactionKt$toTransaction$type$1
        }.getType();
        C6784f $r0 = new C6784f();
        String $r4 = transactionModel.getRaw();
        Object $r5 = $r0.m20759m($r4, $r3);
        Log_OC.loadImage($r5, "Gson().fromJson(transactionModel.raw, type)");
        HashMap $r6 = (HashMap) $r5;
        return $r6;
    }
}
