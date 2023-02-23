package ai.kudi.agent.settings.account.p025ui.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.account.p025ui.data.AddBankAccountViewData;
import ai.kudi.agent.settings.domain.package_4.AddBankAcctRequest;
import ai.kudi.agent.settings.domain.package_4.AddBankAcctResponse;
import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.users.domain.package_1.AccountLookupRequest;
import ai.kudi.agent.users.domain.package_1.AccountLookupResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import ai.kudi.agent.withdraw_cash.utils.UssdWithdrawalUtilKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: AddBankAccountViewModel.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013J2\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0006\u0010\u0019\u001a\u00020\u0011J\b\u0010\u001a\u001a\u00020\u0002H\u0016J*\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0014J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/viewModel/AddBankAccountViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/account/ui/data/AddBankAccountViewData;", "accountLookup", "Lai/kudi/agent/users/domain/usecases/AccountLookup;", "accountRepository", "Lai/kudi/agent/settings/domain/repositories/AccountRepository;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/AccountLookup;Lai/kudi/agent/settings/domain/repositories/AccountRepository;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "accountLookupRequest", "Lio/reactivex/disposables/Disposable;", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "addAccount", "", "acctName", "", "acctNumber", BanksWithMethods.BANK_NAME, "bankCode", "accountPurpose", "addBankAcct", "disposeLookUpProcess", "initialData", "isInputParamsValid", "", "onCleared", "performAcctNameLookup", "accountNo", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.AddBankAccountViewModel */
/* loaded from: classes.dex */
public final class AddBankAccountViewModel extends BaseViewModel<AddBankAccountViewData> {
    private final AccountLookup accountLookup;
    private FavoritesArrayAdapter accountLookupRequest;
    private final AccountRepository accountRepository;
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;

    public AddBankAccountViewModel(AccountLookup accountLookup, AccountRepository accountRepository, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(accountLookup, "accountLookup");
        Log_OC.getArray(accountRepository, "accountRepository");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.accountLookup = accountLookup;
        this.accountRepository = accountRepository;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void addBankAcct(final String str, final String str2, final String str3, final String str4, final String str5) {
        final C11812w $r6 = new C11812w();
        FetchCurrentUser $r8 = this.fetchCurrentUser;
        AbstractC11696w $r9 = FetchCurrentUser.execute$default($r8, null, null, 3, null);
        AbstractC11688p $r10 = $r9.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.account.ui.viewModel.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r1 = C11812w.this;
                AddBankAccountViewModel $r2 = this;
                String $r3 = str2;
                String $r4 = str;
                String $r5 = str3;
                String $r62 = str5;
                String $r7 = str4;
                User $r102 = (User) obj;
                InterfaceC11692s $r82 = AddBankAccountViewModel.m40703addBankAcct$lambda0($r1, $r2, $r3, $r4, $r5, $r62, $r7, $r102);
                return $r82;
            }
        });
        FavoritesArrayAdapter $r14 = $r10.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.account.ui.viewModel.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AddBankAccountViewModel $r1 = AddBankAccountViewModel.this;
                AddBankAcctResponse $r4 = (AddBankAcctResponse) obj;
                InterfaceC11692s $r2 = AddBankAccountViewModel.m40704addBankAcct$lambda1($r1, $r4);
                return $r2;
            }
        }).e0(new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.SimpleXYSeries
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AddBankAccountViewModel $r1 = AddBankAccountViewModel.this;
                C11812w $r2 = $r6;
                List $r4 = (List) obj;
                AddBankAccountViewModel.m40705addBankAcct$lambda2($r1, $r2, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AddBankAccountViewModel $r1 = AddBankAccountViewModel.this;
                C11812w $r2 = $r6;
                Throwable $r4 = (Throwable) obj;
                AddBankAccountViewModel.m40706addBankAcct$lambda3($r1, $r2, $r4);
            }
        });
        Log_OC.loadImage($r14, "fetchCurrentUser.execute().flatMapObservable {\n            user = it\n            analytics.onAddNewAccountButtonClick(\n                user?.phoneNumber!!,\n                acctNumber,\n                acctName,\n                bankName,\n                accountPurpose\n            )\n\n            accountRepository.addBankAcct(\n                AddBankAcctRequest(\n                    accountName = acctName,\n                    accountNumber = acctNumber,\n                    bankName = bankName,\n                    bankCode = bankCode ?: \"\",\n                    purpose = accountPurpose\n                ),\n                user?.sessionId!!\n            )\n        }.flatMap {\n            accountRepository.cacheBankAccount(it).toObservable()\n        }.subscribe(\n            {\n                analytics.onSaveAccountNumberClick(user?.phoneNumber!!, \"successful\")\n                publish(state.copy(isAdding = false, closeScreen = true))\n            },\n            {\n                analytics.onSaveAccountNumberClick(user?.phoneNumber!!, \"failed\")\n                it.printStackTrace()\n                publish(\n                    state.copy(\n                        isAdding = false,\n                        error = AddBankAccountViewData.Error(\n                            message = parseHttpError2(\"Try again please.\")(\n                                it\n                            )\n                        )\n                    )\n                )\n            }\n        )");
        C11280b $r15 = getCompositeDisposable();
        RxExtKt.addTo($r14, $r15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: addBankAcct$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40703addBankAcct$lambda0(C11812w c11812w, AddBankAccountViewModel addBankAccountViewModel, String str, String str2, String str3, String str4, String $r6, User user) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(addBankAccountViewModel, "this$0");
        Log_OC.getArray(str, "$acctNumber");
        Log_OC.getArray(str2, "$acctName");
        Log_OC.getArray(str3, "$bankName");
        Log_OC.getArray(str4, "$accountPurpose");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        Analytics $r8 = addBankAccountViewModel.analytics;
        User $r7 = user;
        String $r10 = $r7 == null ? null : $r7.getPhoneNumber();
        Log_OC.append($r10);
        $r8.onAddNewAccountButtonClick($r10, str, str2, str3, str4);
        AccountRepository $r11 = addBankAccountViewModel.accountRepository;
        if ($r6 == null) {
            $r6 = "";
        }
        AddBankAcctRequest $r12 = new AddBankAcctRequest(str2, str, str3, $r6, str4);
        Object $r13 = c11812w.f26499c;
        User $r72 = (User) $r13;
        String $r9 = $r72 != null ? $r72.getSessionId() : null;
        Log_OC.append($r9);
        AbstractC11688p $r14 = $r11.addBankAcct($r12, $r9);
        return $r14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addBankAcct$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m40704addBankAcct$lambda1(AddBankAccountViewModel addBankAccountViewModel, AddBankAcctResponse addBankAcctResponse) {
        Log_OC.getArray(addBankAccountViewModel, "this$0");
        Log_OC.getArray(addBankAcctResponse, "it");
        AccountRepository $r2 = addBankAccountViewModel.accountRepository;
        AbstractC11696w $r3 = $r2.cacheBankAccount(addBankAcctResponse);
        AbstractC11688p $r4 = $r3.m10427w();
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addBankAcct$lambda-2  reason: not valid java name */
    public static final void m40705addBankAcct$lambda2(AddBankAccountViewModel addBankAccountViewModel, C11812w c11812w, List list) {
        Log_OC.getArray(addBankAccountViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Analytics $r3 = addBankAccountViewModel.analytics;
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        String $r6 = $r5 == null ? null : $r5.getPhoneNumber();
        Log_OC.append($r6);
        $r3.onSaveAccountNumberClick($r6, "successful");
        ViewData $r7 = addBankAccountViewModel.getState();
        AddBankAccountViewData $r8 = AddBankAccountViewData.copy$default((AddBankAccountViewData) $r7, false, null, false, null, true, 11, null);
        addBankAccountViewModel.publish($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addBankAcct$lambda-3  reason: not valid java name */
    public static final void m40706addBankAcct$lambda3(AddBankAccountViewModel addBankAccountViewModel, C11812w c11812w, Throwable th) {
        Log_OC.getArray(addBankAccountViewModel, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Analytics $r3 = addBankAccountViewModel.analytics;
        Object $r4 = c11812w.f26499c;
        User $r5 = (User) $r4;
        String $r6 = $r5 == null ? null : $r5.getPhoneNumber();
        Log_OC.append($r6);
        $r3.onSaveAccountNumberClick($r6, "failed");
        th.printStackTrace();
        ViewData $r7 = addBankAccountViewModel.getState();
        InterfaceC11767l $r10 = KudiErrorParserKt.parseHttpError2$default("Try again please.", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r42 = $r10.invoke(th);
        AddBankAccountViewData.Error $r9 = new AddBankAccountViewData.Error(null, null, null, (String) $r42, 7, null);
        AddBankAccountViewData $r8 = AddBankAccountViewData.copy$default((AddBankAccountViewData) $r7, false, null, false, $r9, false, 19, null);
        addBankAccountViewModel.publish($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isInputParamsValid(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.account.p025ui.viewModel.AddBankAccountViewModel.isInputParamsValid(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performAcctNameLookup$lambda-6$lambda-4  reason: not valid java name */
    public static final void m40707performAcctNameLookup$lambda6$lambda4(AddBankAccountViewModel addBankAccountViewModel, AccountLookupResponse accountLookupResponse) {
        boolean $z0;
        Log_OC.getArray(addBankAccountViewModel, "this$0");
        String $r2 = accountLookupResponse.getAccountName();
        $z0 = C13276s.m5440u($r2);
        if ($z0) {
            ViewData $r3 = addBankAccountViewModel.getState();
            AddBankAccountViewData $r4 = (AddBankAccountViewData) $r3;
            AddBankAccountViewData.Error $r5 = new AddBankAccountViewData.Error(null, null, "The account number is invalid", null, 11, null);
            addBankAccountViewModel.publish(AddBankAccountViewData.copy$default($r4, false, "", false, $r5, false, 20, null));
            return;
        }
        ViewData $r32 = addBankAccountViewModel.getState();
        AddBankAccountViewData $r42 = (AddBankAccountViewData) $r32;
        String $r22 = accountLookupResponse.getAccountName();
        addBankAccountViewModel.publish(AddBankAccountViewData.copy$default($r42, false, $r22, false, null, false, 20, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performAcctNameLookup$lambda-6$lambda-5  reason: not valid java name */
    public static final void m40708performAcctNameLookup$lambda6$lambda5(AddBankAccountViewModel addBankAccountViewModel, Throwable th) {
        Log_OC.getArray(addBankAccountViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = addBankAccountViewModel.getState();
        AddBankAccountViewData $r3 = (AddBankAccountViewData) $r2;
        AddBankAccountViewData.Error $r4 = new AddBankAccountViewData.Error(null, null, "We couldn't fetch your account name. Please click here to try again", null, 11, null);
        addBankAccountViewModel.publish(AddBankAccountViewData.copy$default($r3, false, null, false, $r4, false, 22, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addAccount(String str, String str2, String str3, String str4, String str5) {
        Log_OC.getArray(str, "acctName");
        Log_OC.getArray(str2, "acctNumber");
        Log_OC.getArray(str3, BanksWithMethods.BANK_NAME);
        Log_OC.getArray(str4, "bankCode");
        Log_OC.getArray(str5, "accountPurpose");
        boolean $z0 = isInputParamsValid(str, str2, str3, str4);
        if ($z0) {
            addBankAcct(str, str2, str3, str4, str5);
            ViewData $r6 = getState();
            AddBankAccountViewData $r7 = (AddBankAccountViewData) $r6;
            publish(AddBankAccountViewData.copy$default($r7, false, null, true, null, false, 27, null));
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void disposeLookUpProcess() {
        FavoritesArrayAdapter $r1 = this.accountLookupRequest;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        AddBankAccountViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public AddBankAccountViewData initialData() {
        AddBankAccountViewData $r1 = new AddBankAccountViewData(false, null, false, null, false, 23, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        disposeLookUpProcess();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performAcctNameLookup(String str, Bank bank) {
        boolean $z0;
        Log_OC.getArray(str, "accountNo");
        int $i0 = str.length();
        if ($i0 >= 10) {
            String $r3 = bank == null ? null : bank.getBankCode();
            $z0 = C13276s.m5441t($r3, UssdWithdrawalUtilKt.USSD_PROVIDER_KUDI_SAVE, false, 2, null);
            if ($z0) {
                return;
            }
            ViewData $r4 = getState();
            AddBankAccountViewData $r5 = AddBankAccountViewData.copy$default((AddBankAccountViewData) $r4, true, null, false, null, false, 30, null);
            publish($r5);
            disposeLookUpProcess();
            if (bank == null) {
                return;
            }
            AccountLookup $r6 = this.accountLookup;
            String $r32 = bank.getBankCode();
            AccountLookupRequest $r7 = new AccountLookupRequest($r32, str);
            AbstractC11688p $r8 = $r6.execute($r7);
            FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.Tools$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    AddBankAccountViewModel $r1 = AddBankAccountViewModel.this;
                    AccountLookupResponse $r33 = (AccountLookupResponse) obj;
                    AddBankAccountViewModel.m40707performAcctNameLookup$lambda6$lambda4($r1, $r33);
                }
            }, new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.FileFilterUtil$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    AddBankAccountViewModel $r1 = AddBankAccountViewModel.this;
                    Throwable $r33 = (Throwable) obj;
                    AddBankAccountViewModel.m40708performAcctNameLookup$lambda6$lambda5($r1, $r33);
                }
            });
            this.accountLookupRequest = $r11;
        }
    }
}
