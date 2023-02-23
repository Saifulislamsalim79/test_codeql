package ai.kudi.agent.transactionhistory.mapper;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: WalletActivityApiToTransactionDataMapper.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/WalletActivityApiToTransactionDataMapper;", "", "transactionTypeMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;", "transactionKindMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionKindMapper;", "(Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;Lai/kudi/agent/transactionhistory/mapper/TransactionKindMapper;)V", "map", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", MetricTracker.Object.INPUT, "Lai/kudi/agent/users/data/model/WalletActivityModel;", "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WalletActivityApiToTransactionDataMapper {
    private final TransactionKindMapper transactionKindMapper;
    private final TransactionTypeMapper transactionTypeMapper;

    public WalletActivityApiToTransactionDataMapper(TransactionTypeMapper transactionTypeMapper, TransactionKindMapper transactionKindMapper) {
        Log_OC.getArray(transactionTypeMapper, "transactionTypeMapper");
        Log_OC.getArray(transactionKindMapper, "transactionKindMapper");
        this.transactionTypeMapper = transactionTypeMapper;
        this.transactionKindMapper = transactionKindMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r16 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        r16 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r18 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r16 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r16 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ai.kudi.agent.transactionhistory.data.model.TransactionDataModel getGroupName(ai.kudi.agent.users.data.model.WalletActivityModel r37, ai.kudi.agent.users.domain.package_1.User r38) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.mapper.WalletActivityApiToTransactionDataMapper.getGroupName(ai.kudi.agent.users.data.model.WalletActivityModel, ai.kudi.agent.users.domain.package_1.User):ai.kudi.agent.transactionhistory.data.model.TransactionDataModel");
    }
}
