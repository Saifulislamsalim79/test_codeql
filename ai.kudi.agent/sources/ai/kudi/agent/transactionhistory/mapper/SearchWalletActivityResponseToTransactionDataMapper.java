package ai.kudi.agent.transactionhistory.mapper;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SearchWalletActivityResponseToTransactionDataMapper.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/SearchWalletActivityResponseToTransactionDataMapper;", "", "transactionTypeMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;", "(Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;)V", "map", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", MetricTracker.Object.INPUT, "Lai/kudi/agent/users/data/model/SearchWalletActivityModel;", "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SearchWalletActivityResponseToTransactionDataMapper {
    private final TransactionTypeMapper transactionTypeMapper;

    public SearchWalletActivityResponseToTransactionDataMapper(TransactionTypeMapper transactionTypeMapper) {
        Log_OC.getArray(transactionTypeMapper, "transactionTypeMapper");
        this.transactionTypeMapper = transactionTypeMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r24 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ai.kudi.agent.transactionhistory.data.model.TransactionDataModel parseName(ai.kudi.agent.users.data.model.SearchWalletActivityModel r33, ai.kudi.agent.users.domain.package_1.User r34) {
        /*
            r32 = this;
            java.lang.String r13 = "input"
            r0 = r33
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r13)
            r0 = r33
            java.lang.String r14 = r0.getTransactionId()
            r15 = r14
            if (r14 == 0) goto L11
            goto L13
        L11:
            java.lang.String r15 = ""
        L13:
            r14 = r15
            r0 = r32
            ai.kudi.agent.transactionhistory.mapper.TransactionTypeMapper r0 = r0.transactionTypeMapper
            r16 = r0
            ai.kudi.agent.transactionhistory.mapper.TransactionTypeToUiMapperInput r17 = new ai.kudi.agent.transactionhistory.mapper.TransactionTypeToUiMapperInput
            r0 = r33
            java.lang.String r15 = r0.getType()
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r0 = r17
            r1 = r15
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r16
            r1 = r17
            r2 = r34
            ai.kudi.agent.transactionhistory.data.model.TransactionType r22 = r0.toUi(r1, r2)
            r0 = r33
            java.lang.Double r23 = r0.getWalletBalance()
            if (r23 != 0) goto L4d
        L4a:
            java.lang.String r15 = "N/A"
            goto L58
        L4d:
            r0 = r23
            java.lang.String r24 = ai.kudi.agent.core.util.StringExtKt.formatAmount(r0)
            r15 = r24
            if (r24 != 0) goto L58
            goto L4a
        L58:
            r0 = r33
            java.lang.Double r23 = r0.getAmount()
            if (r23 == 0) goto Lac
            r0 = r23
            java.lang.String r24 = ai.kudi.agent.core.util.StringExtKt.formatAmount(r0)
            r0 = r33
            java.lang.String r25 = r0.getTimeUpdated()
            if (r25 != 0) goto L71
            r26 = 0
            goto L77
        L71:
            r0 = r25
            java.util.Date r26 = ai.kudi.agent.core.util.StringExtKt.formatKudiDateAlt4(r0)
        L77:
            if (r26 != 0) goto L80
            java.util.Date r26 = new java.util.Date
            r0 = r26
            r0.<init>()
        L80:
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r27 = new ai.kudi.agent.transactionhistory.data.model.TransactionDataModel
            r18 = 0
            r19 = 0
            r21 = 0
            r28 = 0
            r29 = 0
            r20 = 480(0x1e0, float:6.73E-43)
            r30 = 0
            r0 = r27
            r1 = r14
            r2 = r22
            r3 = r15
            r4 = r24
            r5 = r18
            r6 = r19
            r7 = r21
            r8 = r28
            r9 = r29
            r10 = r26
            r11 = r20
            r12 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r27
        Lac:
            java.lang.IllegalArgumentException r31 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Required value was null."
            java.lang.String r14 = r14.toString()
            r0 = r31
            r0.<init>(r14)
            goto Lba
        Lba:
            throw r31
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.mapper.SearchWalletActivityResponseToTransactionDataMapper.parseName(ai.kudi.agent.users.data.model.SearchWalletActivityModel, ai.kudi.agent.users.domain.package_1.User):ai.kudi.agent.transactionhistory.data.model.TransactionDataModel");
    }
}
