package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.settings.account.presenters.AccountPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.AccountsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AccountsFragment_MembersInjector implements InterfaceC9463a<AccountsFragment> {
    private final InterfaceC11700a<AccountPresenter> thisPresenterProvider;

    public AccountsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AccountsFragment_MembersInjector $r1 = new AccountsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(AccountsFragment accountsFragment, AccountPresenter accountPresenter) {
        accountsFragment.thisPresenter = accountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AccountsFragment accountsFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        AccountPresenter $r4 = (AccountPresenter) $r2;
        injectThisPresenter(accountsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AccountsFragment $r2 = (AccountsFragment) obj;
        injectMembers($r2);
    }
}
