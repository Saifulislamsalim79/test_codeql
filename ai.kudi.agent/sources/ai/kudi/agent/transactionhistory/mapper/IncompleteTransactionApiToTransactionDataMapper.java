package ai.kudi.agent.transactionhistory.mapper;

import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.transactionhistory.data.model.IncompleteTransaction;
import ai.kudi.agent.transactionhistory.data.model.TransactionDataModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionType;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IncompleteTransactionApiToTransactionDataMapper.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/IncompleteTransactionApiToTransactionDataMapper;", "", "transactionTypeMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;", "(Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;)V", "map", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", MetricTracker.Object.INPUT, "Lai/kudi/agent/transactionhistory/data/model/IncompleteTransaction;", "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IncompleteTransactionApiToTransactionDataMapper {
    private final TransactionTypeMapper transactionTypeMapper;

    public IncompleteTransactionApiToTransactionDataMapper(TransactionTypeMapper transactionTypeMapper) {
        Log_OC.getArray(transactionTypeMapper, "transactionTypeMapper");
        this.transactionTypeMapper = transactionTypeMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionDataModel getShares(IncompleteTransaction incompleteTransaction, User user) {
        Log_OC.getArray(incompleteTransaction, MetricTracker.Object.INPUT);
        String $r4 = incompleteTransaction.getId();
        TransactionTypeMapper $r5 = this.transactionTypeMapper;
        String $r7 = incompleteTransaction.getType();
        TransactionTypeToUiMapperInput $r6 = new TransactionTypeToUiMapperInput($r7, null, null, 6, null);
        TransactionType $r8 = $r5.toUi($r6, user);
        double $d0 = incompleteTransaction.getAmount();
        Double $r9 = Double.valueOf($d0);
        String $r72 = StringExtKt.formatAmount($r9);
        String $r10 = incompleteTransaction.getStatus();
        String $r11 = incompleteTransaction.getTimeCreated();
        Date $r12 = StringExtKt.formatKudiDateAlt3($r11);
        TransactionDataModel $r3 = new TransactionDataModel($r4, $r8, null, $r72, null, null, null, null, $r10, $r12, 228, null);
        return $r3;
    }
}
