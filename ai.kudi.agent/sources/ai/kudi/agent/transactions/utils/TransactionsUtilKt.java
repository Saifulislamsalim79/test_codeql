package ai.kudi.agent.transactions.utils;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
/* compiled from: TransactionsUtil.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\t\" \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, m10421d2 = {"localIdTypes", "", "Lai/kudi/agent/transactions/utils/IdTypes;", "getLocalIdTypes", "()Ljava/util/List;", "setLocalIdTypes", "(Ljava/util/List;)V", "statusMap", "", "", "getStatusMap", "()Ljava/util/Map;", "transactionMap", "getTransactionMap", "findIdTypeById", "id", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionsUtilKt {
    private static List<? extends IdTypes> localIdTypes;
    private static final Map<String, String> statusMap;
    private static final Map<String, String> transactionMap;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Map $r2;
        Map $r22;
        List $r5;
        C13287o $r1 = C13664u.m4227a("Successful", "success");
        C13287o $r12 = C13664u.m4227a("Pending", "pending");
        C13287o $r13 = C13664u.m4227a("Failed", "payment_failed");
        C13287o $r14 = C13664u.m4227a("Refund", "refund");
        C13287o $r15 = C13664u.m4227a("Cancelled", "cancelled");
        C13287o[] $r0 = {$r1, $r12, $r13, $r14, $r15};
        $r2 = C13727r0.m3878n($r0);
        statusMap = $r2;
        C13287o $r16 = C13664u.m4227a("All Transactions", "");
        C13287o $r17 = C13664u.m4227a("Fund Transfer", "transfer");
        C13287o $r18 = C13664u.m4227a("Cash Withdrawal", TransactionBreakDownItemType.WITHDRAWAL);
        C13287o $r19 = C13664u.m4227a("Wallet Top Up", "Wallet_topup");
        C13287o $r110 = C13664u.m4227a("Electricity", TransactionBreakDownItemType.PHCN);
        C13287o $r111 = C13664u.m4227a("Airtime", TransactionBreakDownItemType.AIRTIME_TOPUP);
        C13287o $r112 = C13664u.m4227a("Data Subscription", TransactionBreakDownItemType.DATA);
        C13287o $r113 = C13664u.m4227a("DSTV Subscription", "dstv");
        C13287o $r114 = C13664u.m4227a("GOTV Subscription", "gotv");
        C13287o $r115 = C13664u.m4227a("StarTimes Subscription", "startimes");
        C13287o $r116 = C13664u.m4227a("P2P Transfer", "p2p");
        C13287o $r117 = C13664u.m4227a("Betting", TransactionBreakDownItemType.BETTING);
        C13287o[] $r02 = {$r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116, $r117};
        $r22 = C13727r0.m3878n($r02);
        transactionMap = $r22;
        IdTypes $r4 = IdTypes.NATIONAL_ID_CARD;
        IdTypes $r42 = IdTypes.INTL_PASSPORT;
        IdTypes $r43 = IdTypes.VOTERS_CARD;
        IdTypes $r44 = IdTypes.NIMC_SLIP;
        IdTypes $r45 = IdTypes.DRIVERS_LICENSE;
        IdTypes[] $r3 = {$r4, $r42, $r43, $r44, $r45};
        $r5 = C13726r.m3888h($r3);
        localIdTypes = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static final IdTypes findIdTypeById(String str) {
        IdTypes idTypes;
        Log_OC.getArray(str, "id");
        List $r1 = localIdTypes;
        Iterator $r2 = $r1.iterator();
        while (true) {
            boolean $z0 = $r2.hasNext();
            if (!$z0) {
                idTypes = null;
                break;
            }
            Object $r3 = $r2.next();
            idTypes = $r3;
            IdTypes $r5 = (IdTypes) $r3;
            String $r6 = $r5.getId();
            boolean $z02 = Log_OC.append($r6, str);
            if ($z02) {
                break;
            }
        }
        IdTypes $r52 = idTypes;
        return $r52;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final List getLocalIdTypes() {
        List r0 = localIdTypes;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Map getStatusMap() {
        Map r0 = statusMap;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Map getTransactionMap() {
        Map r0 = transactionMap;
        return r0;
    }

    public static final void setLocalIdTypes(List list) {
        Log_OC.getArray(list, "<set-?>");
        localIdTypes = list;
    }
}
