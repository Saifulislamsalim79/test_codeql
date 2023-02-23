package ai.kudi.agent.wallettopup.presenters;

import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.kshock.data.domain.fht.TransactionResponse;
import ai.kudi.agent.payments.domain.wiki.PaymentMethod;
import ai.kudi.agent.transactions.domain.dto.Method;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.navigators.ProcessTopupNavigator;
import ai.kudi.agent.users.navigators.TopupKCashNavigator;
import ai.kudi.agent.users.navigators.WebViewNavigator;
import ai.kudi.agent.users.viewmodels.data.WalletTopupViewData;
import ai.kudi.agent.wallettopup.views.WalletTopupView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: WalletTopupPresenter.kt */
@Metadata(m10422d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J,\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\t\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001eH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/wallettopup/presenters/WalletTopupPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/wallettopup/views/WalletTopupView;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "topupNavigator", "Lai/kudi/agent/users/navigators/ProcessTopupNavigator;", "kcashNavigator", "Lai/kudi/agent/users/navigators/TopupKCashNavigator;", "submitRequest", "Lai/kudi/agent/transactions/domain/usecases/SubmitTransactionRequest;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/navigators/ProcessTopupNavigator;Lai/kudi/agent/users/navigators/TopupKCashNavigator;Lai/kudi/agent/transactions/domain/usecases/SubmitTransactionRequest;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isPerformingTopup", "", "()Z", "setPerformingTopup", "(Z)V", "destroy", "", "paymentMethodToRequestMethod", "Lai/kudi/agent/transactions/domain/dto/Method;", "paymentMethod", "Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "performTopup", TransactionField.AMOUNT, "", "pin", "webViewNavigator", "Lai/kudi/agent/users/navigators/WebViewNavigator;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactions/domain/dto/TransactionRequest;", "webNavigator", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WalletTopupPresenter extends C9410b<WalletTopupView> {
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private boolean isPerformingTopup;
    private final TopupKCashNavigator kcashNavigator;
    private final SubmitTransactionRequest submitRequest;
    private final ProcessTopupNavigator topupNavigator;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public WalletTopupPresenter(FetchCurrentUser fetchCurrentUser, ProcessTopupNavigator processTopupNavigator, TopupKCashNavigator topupKCashNavigator, SubmitTransactionRequest submitTransactionRequest) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(processTopupNavigator, "topupNavigator");
        Log_OC.getArray(topupKCashNavigator, "kcashNavigator");
        Log_OC.getArray(submitTransactionRequest, "submitRequest");
        this.currentUser = fetchCurrentUser;
        this.topupNavigator = processTopupNavigator;
        this.kcashNavigator = topupKCashNavigator;
        this.submitRequest = submitTransactionRequest;
        C11280b $r5 = new C11280b();
        this.compositeDisposable = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Method paymentMethodToRequestMethod(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            Method.Companion $r2 = Method.Companion;
            Method $r3 = $r2.newCard();
            return $r3;
        }
        boolean $z0 = paymentMethod.isCard();
        if ($z0) {
            Method.Companion $r22 = Method.Companion;
            String $r4 = paymentMethod.getToken();
            String $r5 = $r4;
            if ($r4 == null) {
                $r5 = "";
            }
            Method $r32 = $r22.tokenCard($r5);
            return $r32;
        }
        long $l1 = paymentMethod.getType();
        if ($l1 == 6) {
            Method.Companion $r23 = Method.Companion;
            Method $r33 = $r23.kcash();
            return $r33;
        }
        long $l12 = paymentMethod.getType();
        if ($l12 == 7) {
            Method.Companion $r24 = Method.Companion;
            Method $r34 = $r24.bankTransfer();
            return $r34;
        }
        Method.Companion $r25 = Method.Companion;
        Method $r35 = $r25.newCard();
        return $r35;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void performTopup$default(WalletTopupPresenter walletTopupPresenter, String str, PaymentMethod $r3, String $r4, WebViewNavigator webViewNavigator, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $r3 = null;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r4 = "1111";
        }
        walletTopupPresenter.performTopup(str, $r3, $r4, webViewNavigator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performTopup$lambda-0  reason: not valid java name */
    public static final void m41760performTopup$lambda0(WalletTopupView walletTopupView) {
        Log_OC.getArray(walletTopupView, "view");
        WalletTopupViewData.Error $r1 = new WalletTopupViewData.Error(false, null, "Enter a top up amount.", 3, null);
        walletTopupView.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performTopup$lambda-1  reason: not valid java name */
    public static final void m41761performTopup$lambda1(WalletTopupView walletTopupView) {
        Log_OC.getArray(walletTopupView, "view");
        walletTopupView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performTopup$lambda-2  reason: not valid java name */
    public static final void m41762performTopup$lambda2(WalletTopupPresenter walletTopupPresenter, int i, String str, PaymentMethod paymentMethod, WebViewNavigator webViewNavigator, User user) {
        Log_OC.getArray(walletTopupPresenter, "this$0");
        Log_OC.getArray(str, "$pin");
        Log_OC.getArray(webViewNavigator, "$webViewNavigator");
        String $r6 = user.getPhoneNumber();
        Log_OC.loadImage($r6, "it.phoneNumber");
        Method $r7 = walletTopupPresenter.paymentMethodToRequestMethod(paymentMethod);
        TransactionRequest $r5 = new TransactionRequest($r6, "Topup from Agent App", i, str, TransactionRequest.TYPE_PAYMENT, $r7, 0, 64, null);
        walletTopupPresenter.submitRequest($r5, webViewNavigator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performTopup$lambda-3  reason: not valid java name */
    public static final void m41763performTopup$lambda3(WalletTopupPresenter walletTopupPresenter, Throwable th) {
        Log_OC.getArray(walletTopupPresenter, "this$0");
        walletTopupPresenter.setPerformingTopup(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void submitRequest(TransactionRequest transactionRequest, final WebViewNavigator webViewNavigator) {
        Method $r3 = transactionRequest.getPaymentMethod();
        boolean $z0 = $r3.isNewCard();
        if ($z0) {
            SubmitTransactionRequest $r4 = this.submitRequest;
            AbstractC11688p $r5 = $r4.execute(transactionRequest);
            FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.wallettopup.presenters.FlingerListView$ItemFlingerResponder
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    WalletTopupPresenter $r1 = WalletTopupPresenter.this;
                    WebViewNavigator $r2 = webViewNavigator;
                    TransactionResponse $r42 = (TransactionResponse) obj;
                    WalletTopupPresenter.m41765submitRequest$lambda5($r1, $r2, $r42);
                }
            }, new Object() { // from class: ai.kudi.agent.wallettopup.presenters.Chunk
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    WalletTopupPresenter $r1 = WalletTopupPresenter.this;
                    Throwable $r32 = (Throwable) obj;
                    WalletTopupPresenter.m41767submitRequest$lambda7($r1, $r32);
                }
            });
            Log_OC.loadImage($r8, "submitRequest.execute(request)\n                    .subscribe(\n                        {\n                            isPerformingTopup = false\n                            ifViewAttached { view -> view.hideLoading() }\n                            webNavigator.navigate(it.url)\n                        },\n                        {\n                            it.printStackTrace()\n                            isPerformingTopup = false\n                            ifViewAttached { view ->\n                                view.hideLoading()\n                                view.showError(\n                                    error = WalletTopupViewData.Error(\n                                        generalError = \"Sorry! Wallet topup is not available at the moment.\"\n                                    )\n                                )\n                            }\n                        }\n                    )");
            C11280b $r9 = this.compositeDisposable;
            RxExtKt.addTo($r8, $r9);
            return;
        }
        Method $r32 = transactionRequest.getPaymentMethod();
        boolean $z02 = $r32.isKCash();
        if ($z02) {
            this.isPerformingTopup = false;
            Log $r10 = Log.LOG;
            ifViewAttached($r10);
            TopupKCashNavigator $r11 = this.kcashNavigator;
            $r11.navigate(transactionRequest);
            return;
        }
        Method $r33 = transactionRequest.getPaymentMethod();
        boolean $z03 = $r33.isBankTransfer();
        if ($z03) {
            this.isPerformingTopup = false;
            C0745c $r12 = C0745c.f2060d;
            ifViewAttached($r12);
            return;
        }
        this.isPerformingTopup = false;
        DataSource $r13 = DataSource.mDataSource;
        ifViewAttached($r13);
        ProcessTopupNavigator $r14 = this.topupNavigator;
        $r14.navigate(transactionRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitRequest$lambda-10  reason: not valid java name */
    public static final void m41764submitRequest$lambda10(WalletTopupView walletTopupView) {
        Log_OC.getArray(walletTopupView, "view");
        walletTopupView.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitRequest$lambda-5  reason: not valid java name */
    public static final void m41765submitRequest$lambda5(WalletTopupPresenter walletTopupPresenter, WebViewNavigator webViewNavigator, TransactionResponse transactionResponse) {
        Log_OC.getArray(walletTopupPresenter, "this$0");
        Log_OC.getArray(webViewNavigator, "$webNavigator");
        walletTopupPresenter.setPerformingTopup(false);
        Compression $r4 = Compression.METADATA;
        walletTopupPresenter.ifViewAttached($r4);
        String $r2 = transactionResponse.getUrl();
        webViewNavigator.navigate($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitRequest$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41766submitRequest$lambda5$lambda4(WalletTopupView walletTopupView) {
        Log_OC.getArray(walletTopupView, "view");
        walletTopupView.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitRequest$lambda-7  reason: not valid java name */
    public static final void m41767submitRequest$lambda7(WalletTopupPresenter walletTopupPresenter, Throwable th) {
        Log_OC.getArray(walletTopupPresenter, "this$0");
        th.printStackTrace();
        walletTopupPresenter.setPerformingTopup(false);
        Target $r2 = Target.NONE;
        walletTopupPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitRequest$lambda-7$lambda-6  reason: not valid java name */
    public static final void m41768submitRequest$lambda7$lambda6(WalletTopupView walletTopupView) {
        Log_OC.getArray(walletTopupView, "view");
        walletTopupView.hideLoading();
        WalletTopupViewData.Error $r1 = new WalletTopupViewData.Error(false, null, "Sorry! Wallet topup is not available at the moment.", 3, null);
        walletTopupView.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitRequest$lambda-8  reason: not valid java name */
    public static final void m41769submitRequest$lambda8(WalletTopupView walletTopupView) {
        Log_OC.getArray(walletTopupView, "view");
        walletTopupView.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitRequest$lambda-9  reason: not valid java name */
    public static final void m41770submitRequest$lambda9(WalletTopupView walletTopupView) {
        Log_OC.getArray(walletTopupView, "view");
        walletTopupView.hideLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isPerformingTopup() {
        boolean z0 = this.isPerformingTopup;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performTopup(String str, final PaymentMethod paymentMethod, final String str2, final WebViewNavigator webViewNavigator) {
        boolean $z0;
        Log_OC.getArray(str, TransactionField.AMOUNT);
        Log_OC.getArray(str2, "pin");
        Log_OC.getArray(webViewNavigator, "webViewNavigator");
        boolean $z02 = this.isPerformingTopup;
        if ($z02) {
            return;
        }
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            C0744b $r5 = C0744b.f2059e;
            ifViewAttached($r5);
        }
        this.isPerformingTopup = true;
        ClassWriter $r6 = ClassWriter.f2053b;
        ifViewAttached($r6);
        double $d0 = Double.parseDouble(str);
        final int $i0 = (int) $d0;
        FetchCurrentUser $r7 = this.currentUser;
        AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
        FavoritesArrayAdapter $r11 = $r8.s(new Object() { // from class: ai.kudi.agent.wallettopup.presenters.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                WalletTopupPresenter $r2 = WalletTopupPresenter.this;
                int $i02 = $i0;
                String $r3 = str2;
                PaymentMethod $r4 = paymentMethod;
                WebViewNavigator $r52 = webViewNavigator;
                User $r62 = (User) obj;
                WalletTopupPresenter.m41762performTopup$lambda2($r2, $i02, $r3, $r4, $r52, $r62);
            }
        }, new Object() { // from class: ai.kudi.agent.wallettopup.presenters.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                WalletTopupPresenter $r1 = WalletTopupPresenter.this;
                Throwable $r3 = (Throwable) obj;
                WalletTopupPresenter.m41763performTopup$lambda3($r1, $r3);
            }
        });
        Log_OC.loadImage($r11, "currentUser.execute()\n            .subscribe({\n                submitRequest(\n                    TransactionRequest(\n                        it.phoneNumber,\n                        \"Topup from Agent App\",\n                        intAmount,\n                        pin,\n                        TransactionRequest.TYPE_PAYMENT,\n                        paymentMethodToRequestMethod(paymentMethod)\n                    ), webViewNavigator\n                )\n            }, {\n                // error fetching current userProfile\n                isPerformingTopup = false\n            })");
        C11280b $r12 = this.compositeDisposable;
        RxExtKt.addTo($r11, $r12);
    }

    public final void setPerformingTopup(boolean z) {
        this.isPerformingTopup = z;
    }
}
