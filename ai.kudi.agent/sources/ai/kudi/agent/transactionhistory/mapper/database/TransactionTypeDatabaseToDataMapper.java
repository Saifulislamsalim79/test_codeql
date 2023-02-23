package ai.kudi.agent.transactionhistory.mapper.database;

import ai.kudi.agent.core.domain.p004db.model.TransactionTypeDatabaseModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionType;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionTypeDatabaseToDataMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/mapper/database/TransactionTypeDatabaseToDataMapper;", "", "()V", "toUi", "Lai/kudi/agent/transactionhistory/data/model/TransactionType;", MetricTracker.Object.INPUT, "Lai/kudi/agent/core/domain/db/model/TransactionTypeDatabaseModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionTypeDatabaseToDataMapper {

    /* compiled from: TransactionTypeDatabaseToDataMapper.kt */
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
            TransactionTypeDatabaseModel[] $r0 = TransactionTypeDatabaseModel.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            TransactionTypeDatabaseModel $r2 = TransactionTypeDatabaseModel.CASH_WITHDRAWAL;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            TransactionTypeDatabaseModel $r22 = TransactionTypeDatabaseModel.CARD_PAYMENT;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            TransactionTypeDatabaseModel $r23 = TransactionTypeDatabaseModel.CASH_OUT;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            TransactionTypeDatabaseModel $r24 = TransactionTypeDatabaseModel.ELECTRICITY;
            int $i05 = $r24.ordinal();
            $r1[$i05] = 4;
            TransactionTypeDatabaseModel $r25 = TransactionTypeDatabaseModel.WALLET_TOPUP;
            int $i06 = $r25.ordinal();
            $r1[$i06] = 5;
            TransactionTypeDatabaseModel $r26 = TransactionTypeDatabaseModel.AIRTIME;
            int $i07 = $r26.ordinal();
            $r1[$i07] = 6;
            TransactionTypeDatabaseModel $r27 = TransactionTypeDatabaseModel.CHARGE_BACK;
            int $i08 = $r27.ordinal();
            $r1[$i08] = 7;
            TransactionTypeDatabaseModel $r28 = TransactionTypeDatabaseModel.FUNDS_TRANSFER;
            int $i09 = $r28.ordinal();
            $r1[$i09] = 8;
            TransactionTypeDatabaseModel $r29 = TransactionTypeDatabaseModel.CARD_TOPUP;
            int $i010 = $r29.ordinal();
            $r1[$i010] = 9;
            TransactionTypeDatabaseModel $r210 = TransactionTypeDatabaseModel.Direct;
            int $i011 = $r210.ordinal();
            $r1[$i011] = 10;
            TransactionTypeDatabaseModel $r211 = TransactionTypeDatabaseModel.INSURANCE;
            int $i012 = $r211.ordinal();
            $r1[$i012] = 11;
            TransactionTypeDatabaseModel $r212 = TransactionTypeDatabaseModel.WAEC;
            int $i013 = $r212.ordinal();
            $r1[$i013] = 12;
            TransactionTypeDatabaseModel $r213 = TransactionTypeDatabaseModel.INTERNET;
            int $i014 = $r213.ordinal();
            $r1[$i014] = 13;
            TransactionTypeDatabaseModel $r214 = TransactionTypeDatabaseModel.USSD;
            int $i015 = $r214.ordinal();
            $r1[$i015] = 14;
            TransactionTypeDatabaseModel $r215 = TransactionTypeDatabaseModel.BET9JA;
            int $i016 = $r215.ordinal();
            $r1[$i016] = 15;
            TransactionTypeDatabaseModel $r216 = TransactionTypeDatabaseModel.DSTV;
            int $i017 = $r216.ordinal();
            $r1[$i017] = 16;
            TransactionTypeDatabaseModel $r217 = TransactionTypeDatabaseModel.GOTV;
            int $i018 = $r217.ordinal();
            $r1[$i018] = 17;
            TransactionTypeDatabaseModel $r218 = TransactionTypeDatabaseModel.STAR_TIMES;
            int $i019 = $r218.ordinal();
            $r1[$i019] = 18;
            TransactionTypeDatabaseModel $r219 = TransactionTypeDatabaseModel.REFUND;
            int $i020 = $r219.ordinal();
            $r1[$i020] = 19;
            TransactionTypeDatabaseModel $r220 = TransactionTypeDatabaseModel.REVERSAL;
            int $i021 = $r220.ordinal();
            $r1[$i021] = 20;
            TransactionTypeDatabaseModel $r221 = TransactionTypeDatabaseModel.COLLECTIONS;
            int $i022 = $r221.ordinal();
            $r1[$i022] = 21;
            TransactionTypeDatabaseModel $r222 = TransactionTypeDatabaseModel.DELAYED_CREDIT;
            int $i023 = $r222.ordinal();
            $r1[$i023] = 22;
            TransactionTypeDatabaseModel $r223 = TransactionTypeDatabaseModel.COMMISSION;
            int $i024 = $r223.ordinal();
            $r1[$i024] = 23;
            TransactionTypeDatabaseModel $r224 = TransactionTypeDatabaseModel.ONBOARDING_COMMISSION;
            int $i025 = $r224.ordinal();
            $r1[$i025] = 24;
            TransactionTypeDatabaseModel $r225 = TransactionTypeDatabaseModel.COMMISSION_PAYOUT;
            int $i026 = $r225.ordinal();
            $r1[$i026] = 25;
            TransactionTypeDatabaseModel $r226 = TransactionTypeDatabaseModel.DEBIT;
            int $i027 = $r226.ordinal();
            $r1[$i027] = 26;
            TransactionTypeDatabaseModel $r227 = TransactionTypeDatabaseModel.CREDIT;
            int $i028 = $r227.ordinal();
            $r1[$i028] = 27;
            TransactionTypeDatabaseModel $r228 = TransactionTypeDatabaseModel.SAVINGS;
            int $i029 = $r228.ordinal();
            $r1[$i029] = 28;
            TransactionTypeDatabaseModel $r229 = TransactionTypeDatabaseModel.UNKNOWN;
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
    public final TransactionType toUi(TransactionTypeDatabaseModel transactionTypeDatabaseModel) {
        Log_OC.getArray(transactionTypeDatabaseModel, MetricTracker.Object.INPUT);
        int[] $r2 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = transactionTypeDatabaseModel.ordinal();
        switch ($r2[$i0]) {
            case 1:
                TransactionType r4 = TransactionType.CASH_WITHDRAWAL;
                return r4;
            case 2:
                TransactionType r42 = TransactionType.CARD_PAYMENT;
                return r42;
            case 3:
                TransactionType r43 = TransactionType.CASH_OUT;
                return r43;
            case 4:
                TransactionType r44 = TransactionType.ELECTRICITY;
                return r44;
            case 5:
                TransactionType r45 = TransactionType.WALLET_TOPUP;
                return r45;
            case 6:
                TransactionType r46 = TransactionType.AIRTIME;
                return r46;
            case 7:
                TransactionType r47 = TransactionType.CHARGE_BACK;
                return r47;
            case 8:
                TransactionType r48 = TransactionType.FUNDS_TRANSFER;
                return r48;
            case 9:
                TransactionType r49 = TransactionType.CARD_TOPUP;
                return r49;
            case 10:
                TransactionType r410 = TransactionType.Direct;
                return r410;
            case 11:
                TransactionType r411 = TransactionType.INSURANCE;
                return r411;
            case 12:
                TransactionType r412 = TransactionType.WAEC;
                return r412;
            case 13:
                TransactionType r413 = TransactionType.INTERNET;
                return r413;
            case 14:
                TransactionType r414 = TransactionType.USSD;
                return r414;
            case 15:
                TransactionType r415 = TransactionType.BET9JA;
                return r415;
            case 16:
                TransactionType r416 = TransactionType.DSTV;
                return r416;
            case 17:
                TransactionType r417 = TransactionType.GOTV;
                return r417;
            case 18:
                TransactionType r418 = TransactionType.STAR_TIMES;
                return r418;
            case 19:
                TransactionType r419 = TransactionType.REFUND;
                return r419;
            case 20:
                TransactionType r420 = TransactionType.REVERSAL;
                return r420;
            case 21:
                TransactionType r421 = TransactionType.COLLECTIONS;
                return r421;
            case 22:
                TransactionType r422 = TransactionType.DELAYED_CREDIT;
                return r422;
            case 23:
                TransactionType r423 = TransactionType.COMMISSION;
                return r423;
            case 24:
                TransactionType r424 = TransactionType.ONBOARDING_COMMISSION;
                return r424;
            case 25:
                TransactionType r425 = TransactionType.COMMISSION_PAYOUT;
                return r425;
            case 26:
                TransactionType r426 = TransactionType.DEBIT;
                return r426;
            case 27:
                TransactionType r427 = TransactionType.CREDIT;
                return r427;
            case 28:
                TransactionType r428 = TransactionType.SAVINGS;
                return r428;
            case 29:
                TransactionType r429 = TransactionType.UNKNOWN;
                return r429;
            default:
                Throwable r5 = new NoWhenBranchMatchedException();
                Throwable r6 = r5;
                throw r6;
        }
    }
}
