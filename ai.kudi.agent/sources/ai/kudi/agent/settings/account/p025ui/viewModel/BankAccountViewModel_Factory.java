package ai.kudi.agent.settings.account.p025ui.viewModel;

import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.BankAccountViewModel_Factory */
/* loaded from: classes.dex */
public final class BankAccountViewModel_Factory implements InterfaceC9468d<BankAccountViewModel> {
    private final InterfaceC11700a<AccountRepository> accountRepositoryProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;

    public BankAccountViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.currentUserProvider = interfaceC11700a;
        this.accountRepositoryProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BankAccountViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BankAccountViewModel_Factory $r2 = new BankAccountViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BankAccountViewModel newInstance(FetchCurrentUser fetchCurrentUser, AccountRepository accountRepository) {
        BankAccountViewModel $r2 = new BankAccountViewModel(fetchCurrentUser, accountRepository);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BankAccountViewModel multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.accountRepositoryProvider;
        Object $r22 = $r12.get();
        AccountRepository $r4 = (AccountRepository) $r22;
        BankAccountViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40712multiply() {
        BankAccountViewModel $r1 = multiply();
        return $r1;
    }
}
