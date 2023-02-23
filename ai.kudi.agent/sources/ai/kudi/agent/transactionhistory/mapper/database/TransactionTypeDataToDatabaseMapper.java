package ai.kudi.agent.transactionhistory.mapper.database;

import ai.kudi.agent.core.domain.p004db.model.TransactionTypeDatabaseModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionType;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionTypeDataToDatabaseMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionTypeDataToDatabaseMapper;", "", "()V", "toDatabase", "Lai/kudi/agent/core/domain/db/model/TransactionTypeDatabaseModel;", MetricTracker.Object.INPUT, "Lai/kudi/agent/transactionhistory/data/model/TransactionType;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionTypeDataToDatabaseMapper {

    /* compiled from: TransactionTypeDataToDatabaseMapper.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        static {
            TransactionType[] $r0 = TransactionType.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            TransactionType $r2 = TransactionType.CASH_WITHDRAWAL;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            TransactionType $r22 = TransactionType.CARD_PAYMENT;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            TransactionType $r23 = TransactionType.CASH_OUT;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            TransactionType $r24 = TransactionType.ELECTRICITY;
            int $i05 = $r24.ordinal();
            $r1[$i05] = 4;
            TransactionType $r25 = TransactionType.WALLET_TOPUP;
            int $i06 = $r25.ordinal();
            $r1[$i06] = 5;
            TransactionType $r26 = TransactionType.AIRTIME;
            int $i07 = $r26.ordinal();
            $r1[$i07] = 6;
            TransactionType $r27 = TransactionType.CHARGE_BACK;
            int $i08 = $r27.ordinal();
            $r1[$i08] = 7;
            TransactionType $r28 = TransactionType.FUNDS_TRANSFER;
            int $i09 = $r28.ordinal();
            $r1[$i09] = 8;
            TransactionType $r29 = TransactionType.CARD_TOPUP;
            int $i010 = $r29.ordinal();
            $r1[$i010] = 9;
            TransactionType $r210 = TransactionType.Direct;
            int $i011 = $r210.ordinal();
            $r1[$i011] = 10;
            TransactionType $r211 = TransactionType.INSURANCE;
            int $i012 = $r211.ordinal();
            $r1[$i012] = 11;
            TransactionType $r212 = TransactionType.WAEC;
            int $i013 = $r212.ordinal();
            $r1[$i013] = 12;
            TransactionType $r213 = TransactionType.INTERNET;
            int $i014 = $r213.ordinal();
            $r1[$i014] = 13;
            TransactionType $r214 = TransactionType.USSD;
            int $i015 = $r214.ordinal();
            $r1[$i015] = 14;
            TransactionType $r215 = TransactionType.BET9JA;
            int $i016 = $r215.ordinal();
            $r1[$i016] = 15;
            TransactionType $r216 = TransactionType.DSTV;
            int $i017 = $r216.ordinal();
            $r1[$i017] = 16;
            TransactionType $r217 = TransactionType.GOTV;
            int $i018 = $r217.ordinal();
            $r1[$i018] = 17;
            TransactionType $r218 = TransactionType.STAR_TIMES;
            int $i019 = $r218.ordinal();
            $r1[$i019] = 18;
            TransactionType $r219 = TransactionType.REFUND;
            int $i020 = $r219.ordinal();
            $r1[$i020] = 19;
            TransactionType $r220 = TransactionType.REVERSAL;
            int $i021 = $r220.ordinal();
            $r1[$i021] = 20;
            TransactionType $r221 = TransactionType.COLLECTIONS;
            int $i022 = $r221.ordinal();
            $r1[$i022] = 21;
            TransactionType $r222 = TransactionType.DELAYED_CREDIT;
            int $i023 = $r222.ordinal();
            $r1[$i023] = 22;
            TransactionType $r223 = TransactionType.COMMISSION;
            int $i024 = $r223.ordinal();
            $r1[$i024] = 23;
            TransactionType $r224 = TransactionType.ONBOARDING_COMMISSION;
            int $i025 = $r224.ordinal();
            $r1[$i025] = 24;
            TransactionType $r225 = TransactionType.COMMISSION_PAYOUT;
            int $i026 = $r225.ordinal();
            $r1[$i026] = 25;
            TransactionType $r226 = TransactionType.DEBIT;
            int $i027 = $r226.ordinal();
            $r1[$i027] = 26;
            TransactionType $r227 = TransactionType.CREDIT;
            int $i028 = $r227.ordinal();
            $r1[$i028] = 27;
            TransactionType $r228 = TransactionType.SAVINGS;
            int $i029 = $r228.ordinal();
            $r1[$i029] = 28;
            TransactionType $r229 = TransactionType.UNKNOWN;
            int $i030 = $r229.ordinal();
            $r1[$i030] = 29;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final TransactionTypeDatabaseModel toDatabase(TransactionType transactionType) {
        Log_OC.getArray(transactionType, MetricTracker.Object.INPUT);
        int[] $r2 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = transactionType.ordinal();
        switch ($r2[$i0]) {
            case 1:
                TransactionTypeDatabaseModel r4 = TransactionTypeDatabaseModel.CASH_WITHDRAWAL;
                return r4;
            case 2:
                TransactionTypeDatabaseModel r42 = TransactionTypeDatabaseModel.CARD_PAYMENT;
                return r42;
            case 3:
                TransactionTypeDatabaseModel r43 = TransactionTypeDatabaseModel.CASH_OUT;
                return r43;
            case 4:
                TransactionTypeDatabaseModel r44 = TransactionTypeDatabaseModel.ELECTRICITY;
                return r44;
            case 5:
                TransactionTypeDatabaseModel r45 = TransactionTypeDatabaseModel.WALLET_TOPUP;
                return r45;
            case 6:
                TransactionTypeDatabaseModel r46 = TransactionTypeDatabaseModel.AIRTIME;
                return r46;
            case 7:
                TransactionTypeDatabaseModel r47 = TransactionTypeDatabaseModel.CHARGE_BACK;
                return r47;
            case 8:
                TransactionTypeDatabaseModel r48 = TransactionTypeDatabaseModel.FUNDS_TRANSFER;
                return r48;
            case 9:
                TransactionTypeDatabaseModel r49 = TransactionTypeDatabaseModel.CARD_TOPUP;
                return r49;
            case 10:
                TransactionTypeDatabaseModel r410 = TransactionTypeDatabaseModel.Direct;
                return r410;
            case 11:
                TransactionTypeDatabaseModel r411 = TransactionTypeDatabaseModel.INSURANCE;
                return r411;
            case 12:
                TransactionTypeDatabaseModel r412 = TransactionTypeDatabaseModel.WAEC;
                return r412;
            case 13:
                TransactionTypeDatabaseModel r413 = TransactionTypeDatabaseModel.INTERNET;
                return r413;
            case 14:
                TransactionTypeDatabaseModel r414 = TransactionTypeDatabaseModel.USSD;
                return r414;
            case 15:
                TransactionTypeDatabaseModel r415 = TransactionTypeDatabaseModel.BET9JA;
                return r415;
            case 16:
                TransactionTypeDatabaseModel r416 = TransactionTypeDatabaseModel.DSTV;
                return r416;
            case 17:
                TransactionTypeDatabaseModel r417 = TransactionTypeDatabaseModel.GOTV;
                return r417;
            case 18:
                TransactionTypeDatabaseModel r418 = TransactionTypeDatabaseModel.STAR_TIMES;
                return r418;
            case 19:
                TransactionTypeDatabaseModel r419 = TransactionTypeDatabaseModel.REFUND;
                return r419;
            case 20:
                TransactionTypeDatabaseModel r420 = TransactionTypeDatabaseModel.REVERSAL;
                return r420;
            case 21:
                TransactionTypeDatabaseModel r421 = TransactionTypeDatabaseModel.COLLECTIONS;
                return r421;
            case 22:
                TransactionTypeDatabaseModel r422 = TransactionTypeDatabaseModel.DELAYED_CREDIT;
                return r422;
            case 23:
                TransactionTypeDatabaseModel r423 = TransactionTypeDatabaseModel.COMMISSION;
                return r423;
            case 24:
                TransactionTypeDatabaseModel r424 = TransactionTypeDatabaseModel.ONBOARDING_COMMISSION;
                return r424;
            case 25:
                TransactionTypeDatabaseModel r425 = TransactionTypeDatabaseModel.COMMISSION_PAYOUT;
                return r425;
            case 26:
                TransactionTypeDatabaseModel r426 = TransactionTypeDatabaseModel.DEBIT;
                return r426;
            case 27:
                TransactionTypeDatabaseModel r427 = TransactionTypeDatabaseModel.CREDIT;
                return r427;
            case 28:
                TransactionTypeDatabaseModel r428 = TransactionTypeDatabaseModel.SAVINGS;
                return r428;
            case 29:
                TransactionTypeDatabaseModel r429 = TransactionTypeDatabaseModel.UNKNOWN;
                return r429;
            default:
                Throwable r5 = new NoWhenBranchMatchedException();
                Throwable r6 = r5;
                throw r6;
        }
    }
}
