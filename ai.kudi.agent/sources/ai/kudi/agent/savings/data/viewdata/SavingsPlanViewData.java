package ai.kudi.agent.savings.data.viewdata;

import ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalyticsKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.viewmodel.SavingsPlanViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingsPlanViewData.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "()V", "Error", "Initial", "Plans", "ShowProgress", IssueResolutionAnalyticsKt.STATUS_SUCCESS, "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Initial;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Success;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$ShowProgress;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Plans;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Error;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class SavingsPlanViewData implements ViewData {

    /* compiled from: SavingsPlanViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Error;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData;", "()V", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Error extends SavingsPlanViewData {
        public static final Error INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Error $r0 = new Error();
            INSTANCE = $r0;
        }

        private Error() {
            super(null);
        }
    }

    /* compiled from: SavingsPlanViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Initial;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData;", "()V", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Initial extends SavingsPlanViewData {
        public static final Initial INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Initial $r0 = new Initial();
            INSTANCE = $r0;
        }

        private Initial() {
            super(null);
        }
    }

    /* compiled from: SavingsPlanViewData.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Plans;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData;", "plan", "Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel$TransactionsAndBalance;", "(Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel$TransactionsAndBalance;)V", "getPlan", "()Lai/kudi/agent/savings/viewmodel/SavingsPlanViewModel$TransactionsAndBalance;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Plans extends SavingsPlanViewData {
        private final SavingsPlanViewModel.TransactionsAndBalance plan;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Plans(SavingsPlanViewModel.TransactionsAndBalance transactionsAndBalance) {
            super(null);
            Log_OC.getArray(transactionsAndBalance, "plan");
            this.plan = transactionsAndBalance;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Plans copy$default(Plans plans, SavingsPlanViewModel.TransactionsAndBalance $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = plans.plan;
            }
            Plans $r1 = plans.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SavingsPlanViewModel.TransactionsAndBalance component1() {
            SavingsPlanViewModel.TransactionsAndBalance r1 = this.plan;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Plans copy(SavingsPlanViewModel.TransactionsAndBalance transactionsAndBalance) {
            Log_OC.getArray(transactionsAndBalance, "plan");
            Plans $r0 = new Plans(transactionsAndBalance);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Plans;
            if ($z0) {
                Plans $r2 = (Plans) obj;
                SavingsPlanViewModel.TransactionsAndBalance $r3 = this.plan;
                SavingsPlanViewModel.TransactionsAndBalance $r4 = $r2.plan;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SavingsPlanViewModel.TransactionsAndBalance getPlan() {
            SavingsPlanViewModel.TransactionsAndBalance r1 = this.plan;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            SavingsPlanViewModel.TransactionsAndBalance $r1 = this.plan;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Plans(plan=");
            SavingsPlanViewModel.TransactionsAndBalance $r3 = this.plan;
            $r2.append($r3);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: SavingsPlanViewData.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$ShowProgress;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData;", "visibility", "", "(Z)V", "getVisibility", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ShowProgress extends SavingsPlanViewData {
        private final boolean visibility;

        public ShowProgress(boolean z) {
            super(null);
            this.visibility = z;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ ShowProgress copy$default(ShowProgress showProgress, boolean $z0, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $z0 = showProgress.visibility;
            }
            ShowProgress $r1 = showProgress.copy($z0);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean z0 = this.visibility;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ShowProgress copy(boolean z) {
            ShowProgress $r0 = new ShowProgress(z);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof ShowProgress;
            if ($z0) {
                ShowProgress $r2 = (ShowProgress) obj;
                boolean $z02 = this.visibility;
                boolean $z1 = $r2.visibility;
                return $z02 == $z1;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean getVisibility() {
            boolean z0 = this.visibility;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = this.visibility;
            if ($z0) {
                return 1;
            }
            return $z0 ? 1 : 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("ShowProgress(visibility=");
            boolean $z0 = this.visibility;
            $r2.append($z0);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: SavingsPlanViewData.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData$Success;", "Lai/kudi/agent/savings/data/viewdata/SavingsPlanViewData;", "savingsList", "", "Lai/kudi/agent/savings/data/model/SavingResponse;", "(Ljava/util/List;)V", "getSavingsList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Success extends SavingsPlanViewData {
        private final List<SavingResponse> savingsList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List list) {
            super(null);
            Log_OC.getArray(list, "savingsList");
            this.savingsList = list;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Success copy$default(Success success, List $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = success.savingsList;
            }
            Success $r1 = success.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List component1() {
            List r1 = this.savingsList;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Success copy(List list) {
            Log_OC.getArray(list, "savingsList");
            Success $r0 = new Success(list);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Success;
            if ($z0) {
                Success $r2 = (Success) obj;
                List $r3 = this.savingsList;
                List $r4 = $r2.savingsList;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getSavingsList() {
            List r1 = this.savingsList;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            List $r1 = this.savingsList;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Success(savingsList=");
            List $r3 = this.savingsList;
            $r2.append($r3);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    private SavingsPlanViewData() {
    }

    public /* synthetic */ SavingsPlanViewData(DBUtils$1 dBUtils$1) {
        this();
    }
}
