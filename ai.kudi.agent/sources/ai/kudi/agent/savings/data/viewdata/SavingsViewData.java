package ai.kudi.agent.savings.data.viewdata;

import ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalyticsKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.savings.data.model.SavingsItemModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.C8013r0;
import p425j.p444e.AbstractC11293f;
/* compiled from: SavingsViewData.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "()V", "Error", "Initial", "SavingTransactions", "ShowProgress", IssueResolutionAnalyticsKt.STATUS_SUCCESS, "TotalBalance", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData$Initial;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData$ShowProgress;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData$Success;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData$TotalBalance;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData$SavingTransactions;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData$Error;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class SavingsViewData implements ViewData {

    /* compiled from: SavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsViewData$Error;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", "()V", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Error extends SavingsViewData {
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

    /* compiled from: SavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsViewData$Initial;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", "()V", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Initial extends SavingsViewData {
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

    /* compiled from: SavingsViewData.kt */
    @Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsViewData$SavingTransactions;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", TransactionBreakDownItemType.DATA, "Lio/reactivex/Flowable;", "Landroidx/paging/PagingData;", "Lai/kudi/agent/savings/data/model/SavingsItemModel;", "(Lio/reactivex/Flowable;)V", "getData", "()Lio/reactivex/Flowable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SavingTransactions extends SavingsViewData {
        private final AbstractC11293f<C8013r0<SavingsItemModel>> data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingTransactions(AbstractC11293f abstractC11293f) {
            super(null);
            Log_OC.getArray(abstractC11293f, TransactionBreakDownItemType.DATA);
            this.data = abstractC11293f;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ SavingTransactions copy$default(SavingTransactions savingTransactions, AbstractC11293f $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = savingTransactions.data;
            }
            SavingTransactions $r1 = savingTransactions.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AbstractC11293f component1() {
            AbstractC11293f r1 = this.data;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SavingTransactions copy(AbstractC11293f abstractC11293f) {
            Log_OC.getArray(abstractC11293f, TransactionBreakDownItemType.DATA);
            SavingTransactions $r0 = new SavingTransactions(abstractC11293f);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof SavingTransactions;
            if ($z0) {
                SavingTransactions $r2 = (SavingTransactions) obj;
                AbstractC11293f $r3 = this.data;
                AbstractC11293f $r4 = $r2.data;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AbstractC11293f getData() {
            AbstractC11293f r1 = this.data;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            AbstractC11293f $r1 = this.data;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("SavingTransactions(data=");
            AbstractC11293f $r3 = this.data;
            $r2.append($r3);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: SavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsViewData$ShowProgress;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", "visibility", "", "(Z)V", "getVisibility", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ShowProgress extends SavingsViewData {
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

    /* compiled from: SavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsViewData$Success;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", "hasSavingsPlan", "", "(Z)V", "getHasSavingsPlan", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Success extends SavingsViewData {
        private final boolean hasSavingsPlan;

        public Success(boolean z) {
            super(null);
            this.hasSavingsPlan = z;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Success copy$default(Success success, boolean $z0, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $z0 = success.hasSavingsPlan;
            }
            Success $r1 = success.copy($z0);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean z0 = this.hasSavingsPlan;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Success copy(boolean z) {
            Success $r0 = new Success(z);
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
                boolean $z02 = this.hasSavingsPlan;
                boolean $z1 = $r2.hasSavingsPlan;
                return $z02 == $z1;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean getHasSavingsPlan() {
            boolean z0 = this.hasSavingsPlan;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = this.hasSavingsPlan;
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
            $r2.append("Success(hasSavingsPlan=");
            boolean $z0 = this.hasSavingsPlan;
            $r2.append($z0);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: SavingsViewData.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/savings/data/viewdata/SavingsViewData$TotalBalance;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", TransactionField.AMOUNT, "", "(I)V", "getAmount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TotalBalance extends SavingsViewData {
        private final int amount;

        public TotalBalance(int i) {
            super(null);
            this.amount = i;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ TotalBalance copy$default(TotalBalance totalBalance, int $i0, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $i0 = totalBalance.amount;
            }
            TotalBalance $r1 = totalBalance.copy($i0);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component1() {
            int i0 = this.amount;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TotalBalance copy(int i) {
            TotalBalance $r0 = new TotalBalance(i);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof TotalBalance;
            if ($z0) {
                TotalBalance $r2 = (TotalBalance) obj;
                int $i0 = this.amount;
                int $i1 = $r2.amount;
                return $i0 == $i1;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getAmount() {
            int i0 = this.amount;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            int i0 = this.amount;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("TotalBalance(amount=");
            int $i0 = this.amount;
            $r2.append($i0);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    private SavingsViewData() {
    }

    public /* synthetic */ SavingsViewData(DBUtils$1 dBUtils$1) {
        this();
    }
}
