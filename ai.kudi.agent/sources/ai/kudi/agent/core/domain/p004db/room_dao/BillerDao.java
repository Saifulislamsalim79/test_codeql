package ai.kudi.agent.core.domain.p004db.room_dao;

import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11696w;
/* compiled from: BillerDao.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H'J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H'J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H'¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/BillerDao;", "", "getBillersWithoutData", "Lio/reactivex/Single;", "", "Lai/kudi/agent/bills/data/Biller;", "filterValues", "", "getFrequentlyUsedBillers", "getNetworksForAirtimeAndData", "saveBillers", "", "billers", "updateBillers", "", "billerId", "usageFrequency", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.BillerDao */
/* loaded from: classes.dex */
public interface BillerDao {

    /* compiled from: BillerDao.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.core.domain.db.room_dao.BillerDao$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ AbstractC11696w getBillersWithoutData$default(BillerDao billerDao, List $r2, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBillersWithoutData");
                throw $r5;
            }
            int $i0 = i & 1;
            if ($i0 != 0) {
                listOfAirtimeAndDataLookupIDs $r3 = listOfAirtimeAndDataLookupIDs.INSTANCE;
                $r2 = $r3.getList();
            }
            AbstractC11696w $r4 = billerDao.getBillersWithoutData($r2);
            return $r4;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ AbstractC11696w getFrequentlyUsedBillers$default(BillerDao billerDao, List $r2, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFrequentlyUsedBillers");
                throw $r5;
            }
            int $i0 = i & 1;
            if ($i0 != 0) {
                listOfAirtimeAndDataLookupIDs $r3 = listOfAirtimeAndDataLookupIDs.INSTANCE;
                $r2 = $r3.getList();
            }
            AbstractC11696w $r4 = billerDao.getFrequentlyUsedBillers($r2);
            return $r4;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ AbstractC11696w getNetworksForAirtimeAndData$default(BillerDao billerDao, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNetworksForAirtimeAndData");
                throw $r4;
            }
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = "Airtime";
            }
            AbstractC11696w $r1 = billerDao.getNetworksForAirtimeAndData($r3);
            return $r1;
        }
    }

    AbstractC11696w getBillersWithoutData(List list);

    AbstractC11696w getFrequentlyUsedBillers(List list);

    AbstractC11696w getNetworksForAirtimeAndData(String str);

    AbstractC11696w saveBillers(List list);

    AbstractC11696w updateBillers(String str, int i);
}
