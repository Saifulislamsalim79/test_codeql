package ai.kudi.agent.banks.p001ui;

import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.ViewData;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: BanksViewData.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/banks/ui/BanksViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "()V", "Banks", "Error", "Initial", "IsLoading", "Lai/kudi/agent/banks/ui/BanksViewData$Initial;", "Lai/kudi/agent/banks/ui/BanksViewData$IsLoading;", "Lai/kudi/agent/banks/ui/BanksViewData$Banks;", "Lai/kudi/agent/banks/ui/BanksViewData$Error;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.banks.ui.BanksViewData */
/* loaded from: classes.dex */
public abstract class BanksViewData implements ViewData {

    /* compiled from: BanksViewData.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/banks/ui/BanksViewData$Banks;", "Lai/kudi/agent/banks/ui/BanksViewData;", "banks", "", "Lai/kudi/agent/core/domain/room_entities/Bank;", "(Ljava/util/List;)V", "getBanks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.banks.ui.BanksViewData$Banks */
    /* loaded from: classes.dex */
    public static final class Banks extends BanksViewData {
        private final List<Bank> banks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Banks(List list) {
            super(null);
            Log_OC.getArray(list, "banks");
            this.banks = list;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Banks copy$default(Banks banks, List $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = banks.banks;
            }
            Banks $r1 = banks.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List component1() {
            List r1 = this.banks;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Banks copy(List list) {
            Log_OC.getArray(list, "banks");
            Banks $r0 = new Banks(list);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Banks;
            if ($z0) {
                Banks $r2 = (Banks) obj;
                List $r3 = this.banks;
                List $r4 = $r2.banks;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getBanks() {
            List r1 = this.banks;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            List $r1 = this.banks;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Banks(banks=");
            List $r3 = this.banks;
            $r2.append($r3);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: BanksViewData.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/banks/ui/BanksViewData$Error;", "Lai/kudi/agent/banks/ui/BanksViewData;", MetricTracker.Object.MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.banks.ui.BanksViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error extends BanksViewData {
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

    /* compiled from: BanksViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/banks/ui/BanksViewData$Initial;", "Lai/kudi/agent/banks/ui/BanksViewData;", "()V", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.banks.ui.BanksViewData$Initial */
    /* loaded from: classes.dex */
    public static final class Initial extends BanksViewData {
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

    /* compiled from: BanksViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/banks/ui/BanksViewData$IsLoading;", "Lai/kudi/agent/banks/ui/BanksViewData;", "()V", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.banks.ui.BanksViewData$IsLoading */
    /* loaded from: classes.dex */
    public static final class IsLoading extends BanksViewData {
        public static final IsLoading INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            IsLoading $r0 = new IsLoading();
            INSTANCE = $r0;
        }

        private IsLoading() {
            super(null);
        }
    }

    private BanksViewData() {
    }

    public /* synthetic */ BanksViewData(DBUtils$1 dBUtils$1) {
        this();
    }
}
