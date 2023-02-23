package ai.kudi.agent.settings.p029ui.viewModels;

import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.ui.viewModels.AccountAndSettingsOptionsViewModel_Factory */
/* loaded from: classes.dex */
public final class AccountAndSettingsOptionsViewModel_Factory implements InterfaceC9468d<AccountAndSettingsOptionsViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;

    public AccountAndSettingsOptionsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.settingsNavigatorProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AccountAndSettingsOptionsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        AccountAndSettingsOptionsViewModel_Factory $r2 = new AccountAndSettingsOptionsViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AccountAndSettingsOptionsViewModel newInstance(SettingsNavigator settingsNavigator, FetchCurrentUser fetchCurrentUser) {
        AccountAndSettingsOptionsViewModel $r2 = new AccountAndSettingsOptionsViewModel(settingsNavigator, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountAndSettingsOptionsViewModel multiply() {
        InterfaceC11700a $r1 = this.settingsNavigatorProvider;
        Object $r2 = $r1.get();
        SettingsNavigator $r3 = (SettingsNavigator) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        AccountAndSettingsOptionsViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40919multiply() {
        AccountAndSettingsOptionsViewModel $r1 = multiply();
        return $r1;
    }
}
