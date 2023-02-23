package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.settings.p029ui.viewModels.AccountAndSettingsOptionsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.ui.AccountAndSettingsOptionsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AccountAndSettingsOptionsFragment_MembersInjector implements InterfaceC9463a<AccountAndSettingsOptionsFragment> {
    private final InterfaceC11700a<AccountAndSettingsOptionsViewModel> accountAndSettingsOptionsViewModelProvider;

    public AccountAndSettingsOptionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.accountAndSettingsOptionsViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AccountAndSettingsOptionsFragment_MembersInjector $r1 = new AccountAndSettingsOptionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAccountAndSettingsOptionsViewModel(AccountAndSettingsOptionsFragment accountAndSettingsOptionsFragment, AccountAndSettingsOptionsViewModel accountAndSettingsOptionsViewModel) {
        accountAndSettingsOptionsFragment.accountAndSettingsOptionsViewModel = accountAndSettingsOptionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AccountAndSettingsOptionsFragment accountAndSettingsOptionsFragment) {
        InterfaceC11700a $r3 = this.accountAndSettingsOptionsViewModelProvider;
        Object $r2 = $r3.get();
        AccountAndSettingsOptionsViewModel $r4 = (AccountAndSettingsOptionsViewModel) $r2;
        injectAccountAndSettingsOptionsViewModel(accountAndSettingsOptionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AccountAndSettingsOptionsFragment $r2 = (AccountAndSettingsOptionsFragment) obj;
        injectMembers($r2);
    }
}
