package ai.kudi.agent.transactionhistory.mapper;

import ai.kudi.agent.transactionhistory.data.model.TransactionKind;
import ai.kudi.agent.transactionhistory.data.model.TransactionType;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionTypeMapper.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;", "", "()V", "mapTransactionKind", "Lai/kudi/agent/transactionhistory/data/model/TransactionType;", "transactionKind", "Lai/kudi/agent/transactionhistory/data/model/TransactionKind;", "mapTransactionType", MetricTracker.Object.INPUT, "Lai/kudi/agent/transactionhistory/mapper/TransactionTypeToUiMapperInput;", "user", "Lai/kudi/agent/users/domain/dto/User;", "toUi", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionTypeMapper {

    /* compiled from: TransactionTypeMapper.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            TransactionKind[] $r0 = TransactionKind.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            TransactionKind $r2 = TransactionKind.DEBIT;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            TransactionKind $r22 = TransactionKind.CREDIT;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TransactionType mapTransactionKind(TransactionKind transactionKind) {
        int $i0;
        if (transactionKind == null) {
            $i0 = -1;
        } else {
            int[] $r2 = WhenMappings.$EnumSwitchMapping$0;
            int $i02 = transactionKind.ordinal();
            $i0 = $r2[$i02];
        }
        if ($i0 == 1) {
            TransactionType r3 = TransactionType.DEBIT;
            return r3;
        } else if ($i0 != 2) {
            TransactionType r32 = TransactionType.UNKNOWN;
            return r32;
        } else {
            TransactionType r33 = TransactionType.CREDIT;
            return r33;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0137, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.ELECTRICITY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0139, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x015c, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0167, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0172, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0177, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.DELAYED_CREDIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0179, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0180, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0185, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.WALLET_TOPUP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0187, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a6, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01af, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b2, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.AIRTIME;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01b4, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01bb, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01be, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bf, code lost:
        if (r9 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01c1, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c3, code lost:
        r5 = r9.getPrimaryBusinessCategory();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c7, code lost:
        r2 = kotlin.p483e0.p485d.Log_OC.append(r5, ai.kudi.agent.transactionhistory.mapper.TransactionTypeMapperKt.AGENCY_BANKING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01cd, code lost:
        if (r2 != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01cf, code lost:
        if (r9 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01d2, code lost:
        r0 = r9.getPrimaryBusinessCategory();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01d6, code lost:
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01d8, code lost:
        r2 = kotlin.p549l0.C13276s.m5440u(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01dc, code lost:
        if (r2 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01df, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01e1, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01e2, code lost:
        if (r2 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01e5, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.CARD_PAYMENT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01e7, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01e8, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.CASH_WITHDRAWAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01ea, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01f1, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01f4, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.INTERNET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01f6, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01fd, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0200, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.DSTV;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0202, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.CHARGE_BACK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.FUNDS_TRANSFER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009c, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dc, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e7, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f2, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fd, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0116, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.SAVINGS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011d, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0124, code lost:
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0129, code lost:
        r4 = ai.kudi.agent.transactionhistory.data.model.TransactionType.GOTV;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x012b, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0132, code lost:
        if (r2 == false) goto L142;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ai.kudi.agent.transactionhistory.data.model.TransactionType mapTransactionType(ai.kudi.agent.transactionhistory.mapper.TransactionTypeToUiMapperInput r8, ai.kudi.agent.users.domain.package_1.User r9) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.mapper.TransactionTypeMapper.mapTransactionType(ai.kudi.agent.transactionhistory.mapper.TransactionTypeToUiMapperInput, ai.kudi.agent.users.domain.package_1.User):ai.kudi.agent.transactionhistory.data.model.TransactionType");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionType toUi(TransactionTypeToUiMapperInput transactionTypeToUiMapperInput, User user) {
        Log_OC.getArray(transactionTypeToUiMapperInput, MetricTracker.Object.INPUT);
        String $r3 = transactionTypeToUiMapperInput.getSource();
        boolean $z0 = Log_OC.append($r3, "commission");
        if ($z0) {
            TransactionType $r4 = TransactionType.COMMISSION;
            return $r4;
        }
        boolean $z02 = Log_OC.append($r3, "commission_payout");
        if ($z02) {
            TransactionType $r42 = TransactionType.COMMISSION_PAYOUT;
            return $r42;
        }
        TransactionType $r43 = mapTransactionType(transactionTypeToUiMapperInput, user);
        return $r43;
    }
}
