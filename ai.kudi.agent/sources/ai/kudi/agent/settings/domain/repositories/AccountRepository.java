package ai.kudi.agent.settings.domain.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.AccountDao;
import ai.kudi.agent.core.domain.room_entities.BankAccount;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.settings.domain.package_4.AddBankAcctRequest;
import ai.kudi.agent.settings.domain.package_4.AddBankAcctResponse;
import ai.kudi.agent.settings.domain.package_4.Data;
import ai.kudi.agent.settings.domain.useCases.AddBankAccount;
import ai.kudi.agent.settings.domain.useCases.FetchCurrentUserBanks;
import ai.kudi.agent.settings.domain.useCases.InsuranceRequests;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: AccountRepository.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001d\u001a\u00020\u0011J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001f0!H\u0007J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\u0010H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/settings/domain/repositories/AccountRepository;", "", "addBankAccount", "Lai/kudi/agent/settings/domain/useCases/AddBankAccount;", "appRoomDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "fetchBanks", "Lai/kudi/agent/settings/domain/useCases/FetchCurrentUserBanks;", "insuranceRequests", "Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/settings/domain/useCases/AddBankAccount;Lai/kudi/agent/core/domain/db/CoreAppDatabase;Lai/kudi/agent/settings/domain/useCases/FetchCurrentUserBanks;Lai/kudi/agent/settings/domain/useCases/InsuranceRequests;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "addBankAcct", "Lio/reactivex/Observable;", "Lai/kudi/agent/settings/domain/dto/AddBankAcctResponse;", "addBankAcctRequest", "Lai/kudi/agent/settings/domain/dto/AddBankAcctRequest;", "sessionId", "", "cacheAccountDetails", "Lio/reactivex/Single;", "", "", "bankAccount", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "cacheBankAccount", "addBankAcctResponse", "fetchAccounts", "", "callback", "Lkotlin/Function1;", "getAccountDetails", "getCashOutAccountDetails", "mapAcctResponseToAcctEntity", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountRepository {
    private final AddBankAccount addBankAccount;
    private final CoreAppDatabase appRoomDatabase;
    private final FetchCurrentUser currentUser;
    private final FetchCurrentUserBanks fetchBanks;
    private final InsuranceRequests insuranceRequests;
    private final RxSchedulers rxSchedulers;

    public AccountRepository(AddBankAccount addBankAccount, CoreAppDatabase coreAppDatabase, FetchCurrentUserBanks fetchCurrentUserBanks, InsuranceRequests insuranceRequests, FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers) {
        Log_OC.getArray(addBankAccount, "addBankAccount");
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        Log_OC.getArray(fetchCurrentUserBanks, "fetchBanks");
        Log_OC.getArray(insuranceRequests, "insuranceRequests");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.addBankAccount = addBankAccount;
        this.appRoomDatabase = coreAppDatabase;
        this.fetchBanks = fetchCurrentUserBanks;
        this.insuranceRequests = insuranceRequests;
        this.currentUser = fetchCurrentUser;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchAccounts$lambda-2  reason: not valid java name */
    public static final void m40723fetchAccounts$lambda2(InterfaceC11767l interfaceC11767l, List list) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        Log_OC.loadImage(list, "it");
        interfaceC11767l.invoke(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchAccounts$lambda-3  reason: not valid java name */
    public static final void m40724fetchAccounts$lambda3(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        th.printStackTrace();
        Log_OC.loadImage(th, "err");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAccounts$lambda-6  reason: not valid java name */
    public static final List m40725fetchAccounts$lambda6(AccountRepository accountRepository, List list) {
        Log_OC.getArray(accountRepository, "this$0");
        Log_OC.getArray(list, "remoteBanks");
        CoreAppDatabase $r2 = accountRepository.appRoomDatabase;
        AccountDao $r3 = $r2.getAccountDao();
        Object[] $r5 = list.toArray(new BankAccount[0]);
        if ($r5 == null) {
            NullPointerException $r10 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r10;
        }
        BankAccount[] $r4 = (BankAccount[]) $r5;
        int $i0 = $r4.length;
        AbstractC11696w $r6 = $r3.addAcctDetails((BankAccount[]) Arrays.copyOf($r4, $i0));
        Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r62 = $r6.u($r7);
        Chunk $r8 = Chunk.NEWLINE;
        Token $r9 = Token.LESS_THAN;
        $r62.s($r8, $r9);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAccounts$lambda-6$lambda-4  reason: not valid java name */
    public static final void m40726fetchAccounts$lambda6$lambda4(List list) {
        Object[] $r1 = new Object[0];
        Timber.tag("Account Details updated", $r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchAccounts$lambda-7  reason: not valid java name */
    public static final void m40728fetchAccounts$lambda7(List list) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p getAccountDetails() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.repositories.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AccountRepository $r12 = AccountRepository.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = AccountRepository.m40730getAccountDetails$lambda0($r12, $r42);
                return $r22;
            }
        });
        Log_OC.loadImage($r4, "currentUser.execute().flatMapObservable {\n            appRoomDatabase.accountDao.getAccountDetails(it.id)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())\n        }");
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAccountDetails$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40730getAccountDetails$lambda0(AccountRepository accountRepository, User user) {
        Log_OC.getArray(accountRepository, "this$0");
        Log_OC.getArray(user, "it");
        CoreAppDatabase $r2 = accountRepository.appRoomDatabase;
        AccountDao $r3 = $r2.getAccountDao();
        String $r4 = user.getId();
        Log_OC.loadImage($r4, "it.id");
        AbstractC11688p $r5 = $r3.getAccountDetails($r4);
        Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        Item $r62 = ContextUtils.LogError();
        return $r52.R($r62);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getCashOutAccountDetails$lambda-1  reason: not valid java name */
    public static final InterfaceC11270a0 m40731getCashOutAccountDetails$lambda1(AccountRepository accountRepository, User user) {
        Log_OC.getArray(accountRepository, "this$0");
        Log_OC.getArray(user, "it");
        CoreAppDatabase $r2 = accountRepository.appRoomDatabase;
        AccountDao $r3 = $r2.getAccountDao();
        String $r4 = user.getId();
        Log_OC.loadImage($r4, "it.id");
        AbstractC11696w $r5 = $r3.fetchCashOutAccounts($r4);
        Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r52 = $r5.u($r6);
        Item $r62 = ContextUtils.LogError();
        return $r52.n($r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final BankAccount mapAcctResponseToAcctEntity(AddBankAcctResponse addBankAcctResponse) {
        Data $r3 = addBankAcctResponse.getData();
        String $r4 = $r3.getAccountName();
        String $r5 = $r3.getAccountNumber();
        String $r6 = $r3.getAgentId();
        String $r7 = $r3.getBankName();
        String $r8 = $r3.getDateAdded();
        String $r9 = $r3.getBankCode();
        String $r10 = $r3.getAccountPurpose();
        BankAccount $r1 = new BankAccount($r4, $r5, $r6, $r7, $r8, $r9, $r10);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p addBankAcct(AddBankAcctRequest addBankAcctRequest, String str) {
        Log_OC.getArray(addBankAcctRequest, "addBankAcctRequest");
        Log_OC.getArray(str, "sessionId");
        AddBankAccount $r4 = this.addBankAccount;
        AbstractC11688p $r2 = $r4.execute(addBankAcctRequest, str);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w cacheAccountDetails(BankAccount bankAccount) {
        Log_OC.getArray(bankAccount, "bankAccount");
        CoreAppDatabase $r2 = this.appRoomDatabase;
        AccountDao $r3 = $r2.getAccountDao();
        BankAccount[] $r4 = {bankAccount};
        AbstractC11696w $r5 = $r3.addAcctDetails($r4);
        Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r52 = $r5.u($r6);
        Item $r62 = ContextUtils.LogError();
        AbstractC11696w $r53 = $r52.n($r62);
        Log_OC.loadImage($r53, "appRoomDatabase.accountDao.addAcctDetails(bankAccount).subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w cacheBankAccount(AddBankAcctResponse addBankAcctResponse) {
        Log_OC.getArray(addBankAcctResponse, "addBankAcctResponse");
        BankAccount $r2 = mapAcctResponseToAcctEntity(addBankAcctResponse);
        CoreAppDatabase $r3 = this.appRoomDatabase;
        AccountDao $r4 = $r3.getAccountDao();
        BankAccount[] $r5 = {$r2};
        AbstractC11696w $r6 = $r4.addAcctDetails($r5);
        Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r62 = $r6.u($r7);
        Item $r72 = ContextUtils.LogError();
        AbstractC11696w $r63 = $r62.n($r72);
        Log_OC.loadImage($r63, "appRoomDatabase.accountDao.addAcctDetails(entity)\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r63;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchAccounts(String str, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(interfaceC11767l, "callback");
        AbstractC11688p $r5 = getAccountDetails();
        $r5.e0(new Object() { // from class: ai.kudi.agent.settings.domain.repositories.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                List $r3 = (List) obj;
                AccountRepository.m40723fetchAccounts$lambda2($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.domain.repositories.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                AccountRepository.m40724fetchAccounts$lambda3($r1, $r3);
            }
        });
        FetchCurrentUserBanks $r6 = this.fetchBanks;
        AbstractC11688p $r52 = $r6.execute(str);
        AbstractC11688p $r53 = $r52.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.repositories.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AccountRepository $r1 = AccountRepository.this;
                List $r2 = (List) obj;
                return AccountRepository.m40725fetchAccounts$lambda6($r1, $r2);
            }
        });
        Log $r8 = Log.LOG;
        C0514c $r9 = C0514c.f1371d;
        $r53.e0($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w getCashOutAccountDetails() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null).m10441i(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.repositories.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AccountRepository $r12 = AccountRepository.this;
                User $r4 = (User) obj;
                InterfaceC11270a0 $r22 = AccountRepository.m40731getCashOutAccountDetails$lambda1($r12, $r4);
                return $r22;
            }
        });
        Log_OC.loadImage($r2, "currentUser.execute().flatMap {\n            appRoomDatabase.accountDao.fetchCashOutAccounts(it.id)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())\n        }");
        return $r2;
    }
}
