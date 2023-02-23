package ai.kudi.agent.settings.p029ui.viewModels.data;

import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.settings.data.SettingsOption;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AccountAndSettingsOptionsViewData.kt */
@Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "()V", "Initial", "Settings", "Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData$Initial;", "Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData$Settings;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.viewModels.data.AccountAndSettingsOptionsViewData */
/* loaded from: classes.dex */
public abstract class AccountAndSettingsOptionsViewData implements ViewData {

    /* compiled from: AccountAndSettingsOptionsViewData.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData$Initial;", "Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData;", "()V", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.viewModels.data.AccountAndSettingsOptionsViewData$Initial */
    /* loaded from: classes.dex */
    public static final class Initial extends AccountAndSettingsOptionsViewData {
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

    /* compiled from: AccountAndSettingsOptionsViewData.kt */
    @Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData$Settings;", "Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData;", TransactionBreakDownItemType.DATA, "", "Lai/kudi/agent/settings/data/SettingsOption;", "user", "Lai/kudi/agent/users/domain/dto/User;", "(Ljava/util/List;Lai/kudi/agent/users/domain/dto/User;)V", "getData", "()Ljava/util/List;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.viewModels.data.AccountAndSettingsOptionsViewData$Settings */
    /* loaded from: classes.dex */
    public static final class Settings extends AccountAndSettingsOptionsViewData {
        private final List<SettingsOption> data;
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Settings(List list, User user) {
            super(null);
            Log_OC.getArray(list, TransactionBreakDownItemType.DATA);
            Log_OC.getArray(user, "user");
            this.data = list;
            this.user = user;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Settings copy$default(Settings settings, List $r1, User $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = settings.data;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = settings.user;
            }
            Settings $r0 = settings.copy($r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List component1() {
            List r1 = this.data;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final User component2() {
            User r1 = this.user;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Settings copy(List list, User user) {
            Log_OC.getArray(list, TransactionBreakDownItemType.DATA);
            Log_OC.getArray(user, "user");
            Settings $r0 = new Settings(list, user);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Settings;
            if ($z0) {
                Settings $r3 = (Settings) obj;
                List $r4 = this.data;
                List $r1 = $r3.data;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    User $r5 = this.user;
                    User $r6 = $r3.user;
                    boolean $z03 = Log_OC.append($r5, $r6);
                    return $z03;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getData() {
            List r1 = this.data;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final User getUser() {
            User r1 = this.user;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            List $r1 = this.data;
            int $i0 = $r1.hashCode();
            User $r2 = this.user;
            int $i1 = $r2.hashCode();
            return ($i0 * 31) + $i1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Settings(data=");
            List $r3 = this.data;
            $r2.append($r3);
            $r2.append(", user=");
            User $r4 = this.user;
            $r2.append($r4);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    private AccountAndSettingsOptionsViewData() {
    }

    public /* synthetic */ AccountAndSettingsOptionsViewData(DBUtils$1 dBUtils$1) {
        this();
    }
}
