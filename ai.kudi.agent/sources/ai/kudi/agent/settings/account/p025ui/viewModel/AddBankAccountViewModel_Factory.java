package ai.kudi.agent.settings.account.p025ui.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.AddBankAccountViewModel_Factory */
/* loaded from: classes.dex */
public final class AddBankAccountViewModel_Factory implements InterfaceC9468d<AddBankAccountViewModel> {
    private final InterfaceC11700a<AccountLookup> accountLookupProvider;
    private final InterfaceC11700a<AccountRepository> accountRepositoryProvider;
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public AddBankAccountViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.accountLookupProvider = interfaceC11700a;
        this.accountRepositoryProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AddBankAccountViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        AddBankAccountViewModel_Factory $r4 = new AddBankAccountViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AddBankAccountViewModel newInstance(AccountLookup accountLookup, AccountRepository accountRepository, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        AddBankAccountViewModel $r4 = new AddBankAccountViewModel(accountLookup, accountRepository, fetchCurrentUser, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AddBankAccountViewModel multiply() {
        InterfaceC11700a $r1 = this.accountLookupProvider;
        Object $r2 = $r1.get();
        AccountLookup $r3 = (AccountLookup) $r2;
        InterfaceC11700a $r12 = this.accountRepositoryProvider;
        Object $r22 = $r12.get();
        AccountRepository $r4 = (AccountRepository) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        AddBankAccountViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40709multiply() {
        AddBankAccountViewModel $r1 = multiply();
        return $r1;
    }
}
