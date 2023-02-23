package ai.kudi.agent.settings.domain.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.settings.domain.useCases.AddBankAccount;
import ai.kudi.agent.settings.domain.useCases.FetchCurrentUserBanks;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AccountRepository_Factory implements InterfaceC9468d<AccountRepository> {
    private final InterfaceC11700a<AddBankAccount> addBankAccountProvider;
    private final InterfaceC11700a<CoreAppDatabase> appRoomDatabaseProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchCurrentUserBanks> fetchBanksProvider;
    private final InterfaceC11700a<InsuranceRequests> insuranceRequestsProvider;
    private final InterfaceC11700a<RxSchedulers> rxSchedulersProvider;

    public AccountRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.addBankAccountProvider = interfaceC11700a;
        this.appRoomDatabaseProvider = interfaceC11700a2;
        this.fetchBanksProvider = interfaceC11700a3;
        this.insuranceRequestsProvider = interfaceC11700a4;
        this.currentUserProvider = interfaceC11700a5;
        this.rxSchedulersProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AccountRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        AccountRepository_Factory $r6 = new AccountRepository_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AccountRepository newInstance(AddBankAccount addBankAccount, CoreAppDatabase coreAppDatabase, FetchCurrentUserBanks fetchCurrentUserBanks, InsuranceRequests insuranceRequests, FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers) {
        AccountRepository $r6 = new AccountRepository(addBankAccount, coreAppDatabase, fetchCurrentUserBanks, insuranceRequests, fetchCurrentUser, rxSchedulers);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountRepository multiply() {
        InterfaceC11700a $r1 = this.addBankAccountProvider;
        Object $r2 = $r1.get();
        AddBankAccount $r3 = (AddBankAccount) $r2;
        InterfaceC11700a $r12 = this.appRoomDatabaseProvider;
        Object $r22 = $r12.get();
        CoreAppDatabase $r4 = (CoreAppDatabase) $r22;
        InterfaceC11700a $r13 = this.fetchBanksProvider;
        Object $r23 = $r13.get();
        FetchCurrentUserBanks $r5 = (FetchCurrentUserBanks) $r23;
        InterfaceC11700a $r14 = this.insuranceRequestsProvider;
        Object $r24 = $r14.get();
        InsuranceRequests $r6 = (InsuranceRequests) $r24;
        InterfaceC11700a $r15 = this.currentUserProvider;
        Object $r25 = $r15.get();
        FetchCurrentUser fetchCurrentUser = (FetchCurrentUser) $r25;
        InterfaceC11700a $r16 = this.rxSchedulersProvider;
        Object $r26 = $r16.get();
        AccountRepository $r9 = newInstance($r3, $r4, $r5, $r6, fetchCurrentUser, (RxSchedulers) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40732multiply() {
        AccountRepository $r1 = multiply();
        return $r1;
    }
}
