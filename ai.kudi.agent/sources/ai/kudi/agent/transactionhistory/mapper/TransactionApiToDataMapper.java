package ai.kudi.agent.transactionhistory.mapper;

import ai.kudi.agent.bills.data.BillerKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.transactionhistory.data.model.TransactionDataModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionKind;
import ai.kudi.agent.transactionhistory.data.model.TransactionType;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionApiToDataMapper.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\nH\u0002J(\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/TransactionApiToDataMapper;", "", "transactionTypeMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;", "(Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;)V", "kind", "Lai/kudi/agent/transactionhistory/data/model/TransactionKind;", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "map", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", MetricTracker.Object.INPUT, "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionApiToDataMapper {
    private final TransactionTypeMapper transactionTypeMapper;

    public TransactionApiToDataMapper(TransactionTypeMapper transactionTypeMapper) {
        Log_OC.getArray(transactionTypeMapper, "transactionTypeMapper");
        this.transactionTypeMapper = transactionTypeMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r5 == true) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ai.kudi.agent.transactionhistory.data.model.TransactionKind kind(java.util.HashMap r11) {
        /*
            r10 = this;
            java.lang.String r1 = "Amount Added"
            java.lang.Object r0 = r11.get(r1)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            r2 = r3
            r4 = 1
            if (r2 != 0) goto Lf
        Ld:
            r4 = 0
            goto L1b
        Lf:
            java.lang.String r1 = "-"
            r6 = 0
            r7 = 2
            r8 = 0
            boolean r5 = kotlin.p549l0.C13265j.m5507E(r2, r1, r6, r7, r8)
            r6 = 1
            if (r5 != r6) goto Ld
        L1b:
            if (r4 == 0) goto L20
            ai.kudi.agent.transactionhistory.data.model.TransactionKind r9 = ai.kudi.agent.transactionhistory.data.model.TransactionKind.DEBIT
            return r9
        L20:
            ai.kudi.agent.transactionhistory.data.model.TransactionKind r9 = ai.kudi.agent.transactionhistory.data.model.TransactionKind.CREDIT
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.mapper.TransactionApiToDataMapper.kind(java.util.HashMap):ai.kudi.agent.transactionhistory.data.model.TransactionKind");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionDataModel parse(HashMap hashMap, User user) {
        String $r7;
        String $r72;
        String $r12;
        Log_OC.getArray(hashMap, MetricTracker.Object.INPUT);
        Object $r3 = hashMap.get("reference");
        String $r4 = (String) $r3;
        if ($r4 == null) {
            $r4 = "";
        }
        TransactionTypeMapper $r5 = this.transactionTypeMapper;
        Object $r32 = hashMap.get("type");
        String str = (String) $r32;
        if (str == null) {
            $r7 = null;
        } else {
            Locale $r9 = Locale.getDefault();
            Log_OC.loadImage($r9, "getDefault()");
            $r7 = str.toLowerCase($r9);
            Log_OC.loadImage($r7, "(this as java.lang.String).toLowerCase(locale)");
        }
        TransactionKind $r10 = kind(hashMap);
        TransactionTypeToUiMapperInput $r6 = new TransactionTypeToUiMapperInput($r7, null, $r10, 2, null);
        TransactionType $r11 = $r5.toUi($r6, user);
        Object $r33 = hashMap.get(TransactionField.WALLET_BALANCE);
        String $r73 = (String) $r33;
        if ($r73 == null || ($r72 = StringExtKt.formatAmount($r73)) == null) {
            $r72 = BillerKt.NAMEPROMPT_NA;
        }
        Object $r34 = hashMap.get(TransactionField.AMOUNT);
        String $r122 = (String) $r34;
        if ($r122 == null || ($r12 = StringExtKt.formatAmount($r122)) == null) {
            $r12 = BillerKt.NAMEPROMPT_NA;
        }
        TransactionKind $r102 = kind(hashMap);
        Object $r35 = hashMap.get(TransactionField.CUSTOMER_NAME);
        String $r13 = (String) $r35;
        if ($r13 == null) {
            $r13 = "";
        }
        Object $r36 = hashMap.get(TransactionField.CUSTOMER_PHONE_NUMBER);
        String $r14 = (String) $r36;
        if ($r14 == null) {
            $r14 = "";
        }
        Object $r37 = hashMap.get(TransactionField.CUSTOMER_PICTURE_ID);
        String $r15 = (String) $r37;
        if ($r15 == null) {
            $r15 = "";
        }
        Object $r38 = hashMap.get(TransactionField.STATUS);
        String $r16 = (String) $r38;
        if ($r16 == null) {
            $r16 = "";
        }
        Object $r39 = hashMap.get(TransactionField.TIME);
        String $r17 = (String) $r39;
        Date $r8 = $r17 != null ? StringExtKt.formatKudiDate($r17) : null;
        if ($r8 == null) {
            $r8 = new Date();
        }
        TransactionDataModel $r18 = new TransactionDataModel($r4, $r11, $r72, $r12, $r102, $r14, $r13, $r15, $r16, $r8);
        return $r18;
    }
}
