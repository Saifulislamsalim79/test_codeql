package ai.kudi.agent.users.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.AccountLookupRequest;
import ai.kudi.agent.users.domain.package_1.AccountLookupResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.views.CashoutView;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p272h.p364d.p365a.p366c.LoginListener;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: CashoutPresenter.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0016J&\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 J*\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/users/presenters/CashoutPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/users/views/CashoutView;", "accountLookup", "Lai/kudi/agent/users/domain/usecases/AccountLookup;", "fetchUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/AccountLookup;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "getAccountLookup", "()Lai/kudi/agent/users/domain/usecases/AccountLookup;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFetchUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "lookupDisposable", "Lio/reactivex/disposables/Disposable;", "chooseBankClicked", "", "destroy", "logEventOnLookup", "type", "", TransactionField.AMOUNT, "product", "fee", "performLookup", "accountNo", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "performTransfer", BanksWithMethods.ACCOUNT_NAME, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CashoutPresenter extends C9410b<CashoutView> {
    private final AccountLookup accountLookup;
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchUser;
    private FavoritesArrayAdapter lookupDisposable;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CashoutPresenter(AccountLookup accountLookup, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(accountLookup, "accountLookup");
        Log_OC.getArray(fetchCurrentUser, "fetchUser");
        Log_OC.getArray(analytics, "analytics");
        this.accountLookup = accountLookup;
        this.fetchUser = fetchCurrentUser;
        this.analytics = analytics;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logEventOnLookup$lambda-5  reason: not valid java name */
    public static final void m41460logEventOnLookup$lambda5(CashoutPresenter cashoutPresenter, String str, String str2, String str3, String str4, User user) {
        Log_OC.getArray(cashoutPresenter, "this$0");
        Log_OC.getArray(str, "$type");
        Log_OC.getArray(str2, "$amount");
        Log_OC.getArray(str3, "$product");
        Log_OC.getArray(str4, "$fee");
        Analytics $r6 = cashoutPresenter.getAnalytics();
        $r6.onTransactionLookUpEvent(str, str2, "", str3, str4, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-4$lambda-1  reason: not valid java name */
    public static final void m41462performLookup$lambda4$lambda1(final CashoutPresenter cashoutPresenter, final AccountLookupResponse accountLookupResponse) {
        Log_OC.getArray(cashoutPresenter, "this$0");
        cashoutPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.users.presenters.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: e */
            public final void m38166e(Object obj) {
                CashoutPresenter $r1 = CashoutPresenter.this;
                AccountLookupResponse $r2 = accountLookupResponse;
                CashoutView $r4 = (CashoutView) obj;
                CashoutPresenter.m41463performLookup$lambda4$lambda1$lambda0($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-4$lambda-1$lambda-0  reason: not valid java name */
    public static final void m41463performLookup$lambda4$lambda1$lambda0(CashoutPresenter cashoutPresenter, AccountLookupResponse accountLookupResponse, CashoutView cashoutView) {
        Log_OC.getArray(cashoutPresenter, "this$0");
        Log_OC.getArray(cashoutView, "view");
        cashoutPresenter.logEventOnLookup("cashout", "", "", "");
        cashoutView.enableTransferButton();
        String $r2 = accountLookupResponse.getAccountName();
        cashoutView.showAccountName($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41464performLookup$lambda4$lambda3(CashoutPresenter cashoutPresenter, Throwable th) {
        Log_OC.getArray(cashoutPresenter, "this$0");
        th.printStackTrace();
        Compression $r2 = Compression.METADATA;
        cashoutPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookup$lambda-4$lambda-3$lambda-2  reason: not valid java name */
    public static final void m41465performLookup$lambda4$lambda3$lambda2(CashoutView cashoutView) {
        Log_OC.getArray(cashoutView, "view");
        cashoutView.showAccountName("");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void chooseBankClicked() {
        LoginListener $r1 = getView();
        CashoutView $r2 = (CashoutView) $r1;
        $r2.showBankOptions();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        FavoritesArrayAdapter $r1 = this.lookupDisposable;
        if ($r1 != null) {
            $r1.backup();
        }
        C11280b $r2 = this.compositeDisposable;
        $r2.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AccountLookup getAccountLookup() {
        AccountLookup r1 = this.accountLookup;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchUser() {
        FetchCurrentUser r1 = this.fetchUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logEventOnLookup(final String str, final String str2, final String str3, final String str4) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Log_OC.getArray(str3, "product");
        Log_OC.getArray(str4, "fee");
        FetchCurrentUser $r6 = this.fetchUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        Item $r8 = ClassWriter.LogError();
        AbstractC11696w $r72 = $r7.u($r8);
        Item $r82 = ContextUtils.LogError();
        AbstractC11696w $r73 = $r72.n($r82);
        Object object = new Object() { // from class: ai.kudi.agent.users.presenters.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashoutPresenter $r2 = CashoutPresenter.this;
                String $r3 = str;
                String $r4 = str2;
                String $r5 = str3;
                String $r62 = str4;
                User $r74 = (User) obj;
                CashoutPresenter.m41460logEventOnLookup$lambda5($r2, $r3, $r4, $r5, $r62, $r74);
            }
        };
        Token $r9 = Token.BOOL;
        FavoritesArrayAdapter $r10 = $r73.s(object, $r9);
        Log_OC.loadImage($r10, "fetchUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onTransactionLookUpEvent(type, amount, \"\", product, fee, it)\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r11 = this.compositeDisposable;
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performLookup(String str, Bank bank) {
        Log_OC.getArray(str, "accountNo");
        FavoritesArrayAdapter $r4 = this.lookupDisposable;
        if ($r4 != null) {
            $r4.backup();
        }
        if (bank == null) {
            return;
        }
        LoginListener $r5 = getView();
        CashoutView $r6 = (CashoutView) $r5;
        $r6.disableTransferButton();
        LoginListener $r52 = getView();
        CashoutView $r62 = (CashoutView) $r52;
        $r62.showAccountNameLoading();
        AccountLookup $r7 = getAccountLookup();
        String $r8 = bank.getBankCode();
        AccountLookupRequest $r1 = new AccountLookupRequest($r8, str);
        AbstractC11688p $r9 = $r7.execute($r1);
        this.lookupDisposable = $r9.e0(new Object() { // from class: ai.kudi.agent.users.presenters.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashoutPresenter $r12 = CashoutPresenter.this;
                AccountLookupResponse $r3 = (AccountLookupResponse) obj;
                CashoutPresenter.m41462performLookup$lambda4$lambda1($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.users.presenters.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashoutPresenter $r12 = CashoutPresenter.this;
                Throwable $r3 = (Throwable) obj;
                CashoutPresenter.m41464performLookup$lambda4$lambda3($r12, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performTransfer(String str, String str2, Bank bank, String str3) {
        boolean $z0;
        boolean $z02;
        Log_OC.getArray(str, TransactionField.AMOUNT);
        Log_OC.getArray(str2, "accountNo");
        try {
            $z0 = C13276s.m5440u(str);
            if ($z0) {
                LoginListener $r5 = getView();
                CashoutView $r6 = (CashoutView) $r5;
                $r6.showInvalidAmountError("You must provide an amount.");
                return;
            }
            int $i0 = Integer.parseInt(str);
            if ($i0 > 1000000) {
                LoginListener $r52 = getView();
                CashoutView $r62 = (CashoutView) $r52;
                $r62.showInvalidAmountError("Maximum amount N1,000,000 exceeded");
                return;
            }
            $z02 = C13276s.m5440u(str2);
            if ($z02) {
                LoginListener $r53 = getView();
                CashoutView $r63 = (CashoutView) $r53;
                $r63.showInvalidAccountNoError("Account Number required.");
            } else if (bank == null) {
                LoginListener $r54 = getView();
                CashoutView $r64 = (CashoutView) $r54;
                $r64.showInvalidBankError("Select a bank.");
            } else if (str3 == null) {
                LoginListener $r55 = getView();
                CashoutView $r65 = (CashoutView) $r55;
                $r65.showInvalidBankError("Select a bank.");
            } else {
                String $r8 = bank.getBankCode();
                int $i02 = Integer.parseInt(str);
                WithdrawToBankRequest $r7 = new WithdrawToBankRequest(str2, $r8, $i02, str3);
                LoginListener $r56 = getView();
                CashoutView $r66 = (CashoutView) $r56;
                $r66.navigateToPerformWithdrawal($r7);
            }
        } catch (NumberFormatException $r9) {
            CrashlyticsReport.logException($r9);
            LoginListener $r57 = getView();
            CashoutView $r67 = (CashoutView) $r57;
            $r67.showInvalidAmountError("Maximum amount N1,000,000 exceeded");
        }
    }
}
