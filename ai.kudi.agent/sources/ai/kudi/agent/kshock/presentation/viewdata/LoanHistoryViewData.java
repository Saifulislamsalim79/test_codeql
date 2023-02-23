package ai.kudi.agent.kshock.presentation.viewdata;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.data.model.Loan;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.C8013r0;
/* compiled from: LoanHistoryViewData.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "()V", "Data", "Empty", "Error", "InitialState", "Loading", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$Loading;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$Empty;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$InitialState;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$Data;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$Error;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class LoanHistoryViewData implements ViewData {

    /* compiled from: LoanHistoryViewData.kt */
    @Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$Data;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData;", "loans", "Landroidx/paging/PagingData;", "Lai/kudi/agent/kshock/data/model/Loan;", "page", "", "(Landroidx/paging/PagingData;I)V", "getLoans", "()Landroidx/paging/PagingData;", "getPage", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Data extends LoanHistoryViewData {
        private final C8013r0<Loan> loans;
        private final int page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(C8013r0 c8013r0, int i) {
            super(null);
            Log_OC.getArray(c8013r0, "loans");
            this.loans = c8013r0;
            this.page = i;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Data copy$default(Data data, C8013r0 $r1, int $i0, int i, Object obj) {
            int $i2 = i & 1;
            if ($i2 != 0) {
                $r1 = data.loans;
            }
            int $i1 = i & 2;
            if ($i1 != 0) {
                $i0 = data.page;
            }
            Data $r0 = data.copy($r1, $i0);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final C8013r0 component1() {
            C8013r0 r1 = this.loans;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component2() {
            int i0 = this.page;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Data copy(C8013r0 c8013r0, int i) {
            Log_OC.getArray(c8013r0, "loans");
            Data $r0 = new Data(c8013r0, i);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Data;
            if ($z0) {
                Data $r3 = (Data) obj;
                C8013r0 $r4 = this.loans;
                C8013r0 $r1 = $r3.loans;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    int $i0 = this.page;
                    int $i1 = $r3.page;
                    return $i0 == $i1;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final C8013r0 getLoans() {
            C8013r0 r1 = this.loans;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getPage() {
            int i0 = this.page;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            C8013r0 $r1 = this.loans;
            int $i0 = $r1.hashCode();
            int $i1 = $i0 * 31;
            int $i02 = this.page;
            return $i1 + $i02;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Data(loans=");
            C8013r0 $r3 = this.loans;
            $r2.append($r3);
            $r2.append(", page=");
            int $i0 = this.page;
            $r2.append($i0);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: LoanHistoryViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$Empty;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData;", "()V", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Empty extends LoanHistoryViewData {
        public static final Empty INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Empty $r0 = new Empty();
            INSTANCE = $r0;
        }

        private Empty() {
            super(null);
        }
    }

    /* compiled from: LoanHistoryViewData.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$Error;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData;", MetricTracker.Object.MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Error extends LoanHistoryViewData {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str) {
            super(null);
            Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
            this.message = str;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = error.message;
            }
            Error $r1 = error.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.message;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(String str) {
            Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
            Error $r0 = new Error(str);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Error;
            if ($z0) {
                Error $r2 = (Error) obj;
                String $r3 = this.message;
                String $r4 = $r2.message;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getMessage() {
            String r1 = this.message;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.message;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(message=");
            String $r1 = this.message;
            $r2.append($r1);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    /* compiled from: LoanHistoryViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$InitialState;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData;", "()V", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class InitialState extends LoanHistoryViewData {
        public static final InitialState INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            InitialState $r0 = new InitialState();
            INSTANCE = $r0;
        }

        private InitialState() {
            super(null);
        }
    }

    /* compiled from: LoanHistoryViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$Loading;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData;", "()V", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Loading extends LoanHistoryViewData {
        public static final Loading INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Loading $r0 = new Loading();
            INSTANCE = $r0;
        }

        private Loading() {
            super(null);
        }
    }

    private LoanHistoryViewData() {
    }

    public /* synthetic */ LoanHistoryViewData(DBUtils$1 dBUtils$1) {
        this();
    }
}
