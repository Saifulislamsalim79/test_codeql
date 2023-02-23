package ai.kudi.agent.core.domain.p004db.model;

import ai.kudi.agent.issues.viewmodels.model.WithdrawalTypes;
import ai.kudi.agent.settings.account.ConstantsKt;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransactionTypeDatabaseModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/core/domain/db/model/TransactionTypeDatabaseModel;", "", "(Ljava/lang/String;I)V", WithdrawalTypes.CASH, "CARD_PAYMENT", ConstantsKt.ACCOUNT_TYPE_CASHOUT, "ELECTRICITY", "WALLET_TOPUP", "AIRTIME", "CHARGE_BACK", "FUNDS_TRANSFER", "CARD_TOPUP", "P2P", "INSURANCE", "WAEC", "POS", "USSD", "BET9JA", "DSTV", "GOTV", "STAR_TIMES", "REFUND", "REVERSAL", "COLLECTIONS", "DELAYED_CREDIT", "COMMISSION", "ONBOARDING_COMMISSION", "COMMISSION_PAYOUT", "DEBIT", "CREDIT", "SAVINGS", "UNKNOWN", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.model.TransactionTypeDatabaseModel */
/* loaded from: classes.dex */
public final class TransactionTypeDatabaseModel {
    private static final /* synthetic */ TransactionTypeDatabaseModel[] $VALUES;
    public static final TransactionTypeDatabaseModel AIRTIME;
    public static final TransactionTypeDatabaseModel BET9JA;
    public static final TransactionTypeDatabaseModel CARD_PAYMENT;
    public static final TransactionTypeDatabaseModel CARD_TOPUP;
    public static final TransactionTypeDatabaseModel CASH_OUT;
    public static final TransactionTypeDatabaseModel CASH_WITHDRAWAL;
    public static final TransactionTypeDatabaseModel CHARGE_BACK;
    public static final TransactionTypeDatabaseModel COLLECTIONS;
    public static final TransactionTypeDatabaseModel COMMISSION;
    public static final TransactionTypeDatabaseModel COMMISSION_PAYOUT;
    public static final TransactionTypeDatabaseModel CREDIT;
    public static final TransactionTypeDatabaseModel DEBIT;
    public static final TransactionTypeDatabaseModel DELAYED_CREDIT;
    public static final TransactionTypeDatabaseModel DSTV;
    public static final TransactionTypeDatabaseModel Direct;
    public static final TransactionTypeDatabaseModel ELECTRICITY;
    public static final TransactionTypeDatabaseModel FUNDS_TRANSFER;
    public static final TransactionTypeDatabaseModel GOTV;
    public static final TransactionTypeDatabaseModel INSURANCE;
    public static final TransactionTypeDatabaseModel INTERNET;
    public static final TransactionTypeDatabaseModel ONBOARDING_COMMISSION;
    public static final TransactionTypeDatabaseModel REFUND;
    public static final TransactionTypeDatabaseModel REVERSAL;
    public static final TransactionTypeDatabaseModel SAVINGS;
    public static final TransactionTypeDatabaseModel STAR_TIMES;
    public static final TransactionTypeDatabaseModel UNKNOWN;
    public static final TransactionTypeDatabaseModel USSD;
    public static final TransactionTypeDatabaseModel WAEC;
    public static final TransactionTypeDatabaseModel WALLET_TOPUP;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ TransactionTypeDatabaseModel[] $values() {
        TransactionTypeDatabaseModel $r1 = CASH_WITHDRAWAL;
        TransactionTypeDatabaseModel $r12 = CARD_PAYMENT;
        TransactionTypeDatabaseModel $r13 = CASH_OUT;
        TransactionTypeDatabaseModel $r14 = ELECTRICITY;
        TransactionTypeDatabaseModel $r15 = WALLET_TOPUP;
        TransactionTypeDatabaseModel $r16 = AIRTIME;
        TransactionTypeDatabaseModel $r17 = CHARGE_BACK;
        TransactionTypeDatabaseModel $r18 = FUNDS_TRANSFER;
        TransactionTypeDatabaseModel $r19 = CARD_TOPUP;
        TransactionTypeDatabaseModel $r110 = Direct;
        TransactionTypeDatabaseModel $r111 = INSURANCE;
        TransactionTypeDatabaseModel $r112 = WAEC;
        TransactionTypeDatabaseModel $r113 = INTERNET;
        TransactionTypeDatabaseModel $r114 = USSD;
        TransactionTypeDatabaseModel $r115 = BET9JA;
        TransactionTypeDatabaseModel $r116 = DSTV;
        TransactionTypeDatabaseModel $r117 = GOTV;
        TransactionTypeDatabaseModel $r118 = STAR_TIMES;
        TransactionTypeDatabaseModel $r119 = REFUND;
        TransactionTypeDatabaseModel $r120 = REVERSAL;
        TransactionTypeDatabaseModel $r121 = COLLECTIONS;
        TransactionTypeDatabaseModel $r122 = DELAYED_CREDIT;
        TransactionTypeDatabaseModel $r123 = COMMISSION;
        TransactionTypeDatabaseModel $r124 = ONBOARDING_COMMISSION;
        TransactionTypeDatabaseModel $r125 = COMMISSION_PAYOUT;
        TransactionTypeDatabaseModel $r126 = DEBIT;
        TransactionTypeDatabaseModel $r127 = CREDIT;
        TransactionTypeDatabaseModel $r128 = SAVINGS;
        TransactionTypeDatabaseModel $r129 = UNKNOWN;
        TransactionTypeDatabaseModel[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116, $r117, $r118, $r119, $r120, $r121, $r122, $r123, $r124, $r125, $r126, $r127, $r128, $r129};
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
    static {
        TransactionTypeDatabaseModel $r1 = new TransactionTypeDatabaseModel(WithdrawalTypes.CASH, 0);
        CASH_WITHDRAWAL = $r1;
        TransactionTypeDatabaseModel $r12 = new TransactionTypeDatabaseModel("CARD_PAYMENT", 1);
        CARD_PAYMENT = $r12;
        TransactionTypeDatabaseModel $r13 = new TransactionTypeDatabaseModel(ConstantsKt.ACCOUNT_TYPE_CASHOUT, 2);
        CASH_OUT = $r13;
        TransactionTypeDatabaseModel $r14 = new TransactionTypeDatabaseModel("ELECTRICITY", 3);
        ELECTRICITY = $r14;
        TransactionTypeDatabaseModel $r15 = new TransactionTypeDatabaseModel("WALLET_TOPUP", 4);
        WALLET_TOPUP = $r15;
        TransactionTypeDatabaseModel $r16 = new TransactionTypeDatabaseModel("AIRTIME", 5);
        AIRTIME = $r16;
        TransactionTypeDatabaseModel $r17 = new TransactionTypeDatabaseModel("CHARGE_BACK", 6);
        CHARGE_BACK = $r17;
        TransactionTypeDatabaseModel $r18 = new TransactionTypeDatabaseModel("FUNDS_TRANSFER", 7);
        FUNDS_TRANSFER = $r18;
        TransactionTypeDatabaseModel $r19 = new TransactionTypeDatabaseModel("CARD_TOPUP", 8);
        CARD_TOPUP = $r19;
        TransactionTypeDatabaseModel $r110 = new TransactionTypeDatabaseModel("P2P", 9);
        Direct = $r110;
        TransactionTypeDatabaseModel $r111 = new TransactionTypeDatabaseModel("INSURANCE", 10);
        INSURANCE = $r111;
        TransactionTypeDatabaseModel $r112 = new TransactionTypeDatabaseModel("WAEC", 11);
        WAEC = $r112;
        TransactionTypeDatabaseModel $r113 = new TransactionTypeDatabaseModel("POS", 12);
        INTERNET = $r113;
        TransactionTypeDatabaseModel $r114 = new TransactionTypeDatabaseModel("USSD", 13);
        USSD = $r114;
        TransactionTypeDatabaseModel $r115 = new TransactionTypeDatabaseModel("BET9JA", 14);
        BET9JA = $r115;
        TransactionTypeDatabaseModel $r116 = new TransactionTypeDatabaseModel("DSTV", 15);
        DSTV = $r116;
        TransactionTypeDatabaseModel $r117 = new TransactionTypeDatabaseModel("GOTV", 16);
        GOTV = $r117;
        TransactionTypeDatabaseModel $r118 = new TransactionTypeDatabaseModel("STAR_TIMES", 17);
        STAR_TIMES = $r118;
        TransactionTypeDatabaseModel $r119 = new TransactionTypeDatabaseModel("REFUND", 18);
        REFUND = $r119;
        TransactionTypeDatabaseModel $r120 = new TransactionTypeDatabaseModel("REVERSAL", 19);
        REVERSAL = $r120;
        TransactionTypeDatabaseModel $r121 = new TransactionTypeDatabaseModel("COLLECTIONS", 20);
        COLLECTIONS = $r121;
        TransactionTypeDatabaseModel $r122 = new TransactionTypeDatabaseModel("DELAYED_CREDIT", 21);
        DELAYED_CREDIT = $r122;
        TransactionTypeDatabaseModel $r123 = new TransactionTypeDatabaseModel("COMMISSION", 22);
        COMMISSION = $r123;
        TransactionTypeDatabaseModel $r124 = new TransactionTypeDatabaseModel("ONBOARDING_COMMISSION", 23);
        ONBOARDING_COMMISSION = $r124;
        TransactionTypeDatabaseModel $r125 = new TransactionTypeDatabaseModel("COMMISSION_PAYOUT", 24);
        COMMISSION_PAYOUT = $r125;
        TransactionTypeDatabaseModel $r126 = new TransactionTypeDatabaseModel("DEBIT", 25);
        DEBIT = $r126;
        TransactionTypeDatabaseModel $r127 = new TransactionTypeDatabaseModel("CREDIT", 26);
        CREDIT = $r127;
        TransactionTypeDatabaseModel $r128 = new TransactionTypeDatabaseModel("SAVINGS", 27);
        SAVINGS = $r128;
        TransactionTypeDatabaseModel $r129 = new TransactionTypeDatabaseModel("UNKNOWN", 28);
        UNKNOWN = $r129;
        TransactionTypeDatabaseModel[] $r0 = $values();
        $VALUES = $r0;
    }

    private TransactionTypeDatabaseModel(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static TransactionTypeDatabaseModel valueOf(String str) {
        Enum $r0 = Enum.valueOf(TransactionTypeDatabaseModel.class, str);
        TransactionTypeDatabaseModel $r2 = (TransactionTypeDatabaseModel) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static TransactionTypeDatabaseModel[] values() {
        TransactionTypeDatabaseModel[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        TransactionTypeDatabaseModel[] $r12 = (TransactionTypeDatabaseModel[]) $r0;
        return $r12;
    }
}
