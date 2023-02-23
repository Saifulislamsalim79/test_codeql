package ai.kudi.agent.settings.data;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1335a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: SettingsOption.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001a2\u00020\u0001:\n\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\u001b\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\t\u001f !\"#$%&'¨\u0006("}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption;", "", "iconRes", "", "textRes", "(II)V", "getIconRes", "()I", "getTextRes", "icon", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", KudiPin.KUDI_PIN_TITLE, "", "resources", "Landroid/content/res/Resources;", "AccountInformation", "AppPermissions", "AppUpdate", "BankAccounts", "ClearAppData", "Companion", "OpenSource", "PersonalInformation", "SecurityAndSafety", "TermsAndCondition", "Lai/kudi/agent/settings/data/SettingsOption$PersonalInformation;", "Lai/kudi/agent/settings/data/SettingsOption$AccountInformation;", "Lai/kudi/agent/settings/data/SettingsOption$BankAccounts;", "Lai/kudi/agent/settings/data/SettingsOption$SecurityAndSafety;", "Lai/kudi/agent/settings/data/SettingsOption$TermsAndCondition;", "Lai/kudi/agent/settings/data/SettingsOption$AppPermissions;", "Lai/kudi/agent/settings/data/SettingsOption$ClearAppData;", "Lai/kudi/agent/settings/data/SettingsOption$AppUpdate;", "Lai/kudi/agent/settings/data/SettingsOption$OpenSource;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class SettingsOption {
    public static final Companion Companion;
    private final int iconRes;
    private final int textRes;

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$AccountInformation;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AccountInformation extends SettingsOption {
        public static final AccountInformation INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            AccountInformation $r0 = new AccountInformation();
            INSTANCE = $r0;
        }

        private AccountInformation() {
            super(C0001R.C0002drawable.ic_account, C0001R.string.account_information, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
            settingsNavigator.toAccountInformationFragment();
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$AppPermissions;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AppPermissions extends SettingsOption {
        public static final AppPermissions INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            AppPermissions $r0 = new AppPermissions();
            INSTANCE = $r0;
        }

        private AppPermissions() {
            super(C0001R.C0002drawable.ic_app_permission, C0001R.string.app_permissions, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
            settingsNavigator.toAppPermissionsFragment();
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$AppUpdate;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AppUpdate extends SettingsOption {
        public static final AppUpdate INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            AppUpdate $r0 = new AppUpdate();
            INSTANCE = $r0;
        }

        private AppUpdate() {
            super(C0001R.C0002drawable.ic_update, C0001R.string.new_app_update, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$BankAccounts;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class BankAccounts extends SettingsOption {
        public static final BankAccounts INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            BankAccounts $r0 = new BankAccounts();
            INSTANCE = $r0;
        }

        private BankAccounts() {
            super(C0001R.C0002drawable.ic_bank_blue, C0001R.string.bank_accounts, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
            settingsNavigator.toBankAccountsFragment();
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$ClearAppData;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ClearAppData extends SettingsOption {
        public static final ClearAppData INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            ClearAppData $r0 = new ClearAppData();
            INSTANCE = $r0;
        }

        private ClearAppData() {
            super(C0001R.C0002drawable.ic_broom, C0001R.string.clear_app_data, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
            settingsNavigator.onClearAppData();
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$Companion;", "", "()V", "values", "", "Lai/kudi/agent/settings/data/SettingsOption;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List values() {
            List $r1;
            PersonalInformation $r3 = PersonalInformation.INSTANCE;
            AccountInformation $r4 = AccountInformation.INSTANCE;
            BankAccounts $r5 = BankAccounts.INSTANCE;
            SecurityAndSafety $r6 = SecurityAndSafety.INSTANCE;
            TermsAndCondition $r7 = TermsAndCondition.INSTANCE;
            AppPermissions $r8 = AppPermissions.INSTANCE;
            ClearAppData $r9 = ClearAppData.INSTANCE;
            OpenSource $r10 = OpenSource.INSTANCE;
            SettingsOption[] $r2 = {$r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10};
            $r1 = C13726r.m3888h($r2);
            return $r1;
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$OpenSource;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OpenSource extends SettingsOption {
        public static final OpenSource INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            OpenSource $r0 = new OpenSource();
            INSTANCE = $r0;
        }

        private OpenSource() {
            super(C0001R.C0002drawable.ic_app_permission, C0001R.string.open_source, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
            settingsNavigator.navigateToOpenSource();
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$PersonalInformation;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class PersonalInformation extends SettingsOption {
        public static final PersonalInformation INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            PersonalInformation $r0 = new PersonalInformation();
            INSTANCE = $r0;
        }

        private PersonalInformation() {
            super(C0001R.C0002drawable.ic_personal_settings, C0001R.string.personal_information, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
            settingsNavigator.toPersonalFragment();
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$SecurityAndSafety;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SecurityAndSafety extends SettingsOption {
        public static final SecurityAndSafety INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            SecurityAndSafety $r0 = new SecurityAndSafety();
            INSTANCE = $r0;
        }

        private SecurityAndSafety() {
            super(C0001R.C0002drawable.ic_security_outline, C0001R.string.security_and_safety, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
            settingsNavigator.toSecurityAndSafety();
        }
    }

    /* compiled from: SettingsOption.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/data/SettingsOption$TermsAndCondition;", "Lai/kudi/agent/settings/data/SettingsOption;", "()V", "navigate", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TermsAndCondition extends SettingsOption {
        public static final TermsAndCondition INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            TermsAndCondition $r0 = new TermsAndCondition();
            INSTANCE = $r0;
        }

        private TermsAndCondition() {
            super(C0001R.C0002drawable.ic_account, C0001R.string.terms_and_conditions_text, null);
        }

        @Override // ai.kudi.agent.settings.data.SettingsOption
        public void navigate(SettingsNavigator settingsNavigator) {
            Log_OC.getArray(settingsNavigator, "settingsNavigator");
            settingsNavigator.toDisplayTermsFragment();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    private SettingsOption(int i, int i2) {
        this.iconRes = i;
        this.textRes = i2;
    }

    public /* synthetic */ SettingsOption(int i, int i2, DBUtils$1 dBUtils$1) {
        this(i, i2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getIconRes() {
        int i0 = this.iconRes;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getTextRes() {
        int i0 = this.textRes;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Drawable icon(Context context) {
        Log_OC.getArray(context, "context");
        int $i0 = this.iconRes;
        Drawable $r1 = C1335a.m36322f(context, $i0);
        return $r1;
    }

    public abstract void navigate(SettingsNavigator settingsNavigator);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String title(Resources resources) {
        Log_OC.getArray(resources, "resources");
        int $i0 = this.textRes;
        String $r1 = resources.getString($i0);
        Log_OC.loadImage($r1, "resources.getString(textRes)");
        return $r1;
    }
}
