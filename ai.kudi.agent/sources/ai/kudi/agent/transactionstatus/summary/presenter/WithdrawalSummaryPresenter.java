package ai.kudi.agent.transactionstatus.summary.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactionstatus.summary.view.WithdrawalView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest;
import ai.kudi.agent.voucher.cashout.domain.usecase.RedeemVoucher;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: WithdrawalSummaryPresenter.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J \u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019J\"\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u0005\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019J\u0006\u0010 \u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0019J\u0006\u0010\"\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/presenter/WithdrawalSummaryPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactionstatus/summary/view/WithdrawalView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "redeemVoucher", "Lai/kudi/agent/voucher/cashout/domain/usecase/RedeemVoucher;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/voucher/cashout/domain/usecase/RedeemVoucher;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "destroy", "", "hideLoading", "logEventUponPinVerification", "phoneNumber", "", "isSuccessful", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "logEventUponVoucherCashOut", "reference", "navigateToTransactionStatusPage", "showAuthDialog", "showError", "showLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WithdrawalSummaryPresenter extends C9410b<WithdrawalView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final RedeemVoucher redeemVoucher;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public WithdrawalSummaryPresenter(FetchCurrentUser fetchCurrentUser, RedeemVoucher redeemVoucher, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(redeemVoucher, "redeemVoucher");
        Log_OC.getArray(analytics, "analytics");
        this.fetchCurrentUser = fetchCurrentUser;
        this.redeemVoucher = redeemVoucher;
        this.analytics = analytics;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideLoading$lambda-1  reason: not valid java name */
    public static final void m41295hideLoading$lambda1(WithdrawalView withdrawalView) {
        Log_OC.getArray(withdrawalView, "view");
        withdrawalView.hideLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEventUponVoucherCashOut(String str, boolean z, String str2) {
        Analytics $r3 = this.analytics;
        User $r4 = this.user;
        $r3.onVoucherCashOutRequestEvent(z, str, str2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToTransactionStatusPage(final boolean z) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.NumberPicker$TwoDigitFormatter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void format(Object obj) {
                boolean $z0 = z;
                WithdrawalView $r2 = (WithdrawalView) obj;
                WithdrawalSummaryPresenter.m41296navigateToTransactionStatusPage$lambda2($z0, $r2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToTransactionStatusPage$lambda-2  reason: not valid java name */
    public static final void m41296navigateToTransactionStatusPage$lambda2(boolean z, WithdrawalView withdrawalView) {
        Log_OC.getArray(withdrawalView, "view");
        withdrawalView.navigateToTransactionStatusPage(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: redeemVoucher$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m41297redeemVoucher$lambda5(WithdrawalSummaryPresenter withdrawalSummaryPresenter, VoucherRequest voucherRequest, User user) {
        Log_OC.getArray(withdrawalSummaryPresenter, "this$0");
        Log_OC.getArray(voucherRequest, "$voucherRequest");
        Log_OC.getArray(user, "it");
        withdrawalSummaryPresenter.setUser(user);
        RedeemVoucher $r3 = withdrawalSummaryPresenter.redeemVoucher;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, voucherRequest);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: redeemVoucher$lambda-6  reason: not valid java name */
    public static final void m41298redeemVoucher$lambda6(WithdrawalSummaryPresenter withdrawalSummaryPresenter, String $r2, Boolean bool) {
        Log_OC.getArray(withdrawalSummaryPresenter, "this$0");
        if ($r2 == null) {
            $r2 = "";
        }
        withdrawalSummaryPresenter.logEventUponVoucherCashOut($r2, true, null);
        withdrawalSummaryPresenter.hideLoading();
        Log_OC.loadImage(bool, TransactionField.STATUS);
        boolean $z0 = bool.booleanValue();
        withdrawalSummaryPresenter.navigateToTransactionStatusPage($z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: redeemVoucher$lambda-7  reason: not valid java name */
    public static final void m41299redeemVoucher$lambda7(WithdrawalSummaryPresenter withdrawalSummaryPresenter, String $r3, Throwable th) {
        Log_OC.getArray(withdrawalSummaryPresenter, "this$0");
        withdrawalSummaryPresenter.hideLoading();
        if ($r3 == null) {
            $r3 = "";
        }
        String $r2 = th.getMessage();
        withdrawalSummaryPresenter.logEventUponVoucherCashOut($r3, false, $r2);
        th.printStackTrace();
        withdrawalSummaryPresenter.navigateToTransactionStatusPage(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAuthDialog$lambda-4  reason: not valid java name */
    public static final void m41300showAuthDialog$lambda4(WithdrawalView withdrawalView) {
        Log_OC.getArray(withdrawalView, "view");
        withdrawalView.pinConfirmationDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-3  reason: not valid java name */
    public static final void m41301showError$lambda3(String str, WithdrawalView withdrawalView) {
        Log_OC.getArray(str, "$error");
        Log_OC.getArray(withdrawalView, "view");
        withdrawalView.showError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoading$lambda-0  reason: not valid java name */
    public static final void m41302showLoading$lambda0(WithdrawalView withdrawalView) {
        Log_OC.getArray(withdrawalView, "view");
        withdrawalView.showLoading();
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
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoading() {
        Settings $r1 = Settings.settings;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logEventUponPinVerification(String str, boolean z, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Analytics $r4 = this.analytics;
        User $r3 = this.user;
        $r4.onVoucherPinCashOutPinVerification(str, z, str2, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void redeemVoucher(final String str) {
        showLoading();
        final VoucherRequest $r2 = new VoucherRequest(null, str, 1, null);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                WithdrawalSummaryPresenter $r1 = WithdrawalSummaryPresenter.this;
                VoucherRequest $r22 = $r2;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = WithdrawalSummaryPresenter.m41297redeemVoucher$lambda5($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                WithdrawalSummaryPresenter $r1 = WithdrawalSummaryPresenter.this;
                String $r22 = str;
                Boolean $r42 = (Boolean) obj;
                WithdrawalSummaryPresenter.m41298redeemVoucher$lambda6($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                WithdrawalSummaryPresenter $r1 = WithdrawalSummaryPresenter.this;
                String $r22 = str;
                Throwable $r42 = (Throwable) obj;
                WithdrawalSummaryPresenter.m41299redeemVoucher$lambda7($r1, $r22, $r42);
            }
        });
        Log_OC.loadImage($r9, "fetchCurrentUser.execute()\n                .flatMapObservable {\n                    user = it\n                    redeemVoucher.execute(it.sessionId, voucherRequest)\n                }\n                .subscribe({ status ->\n                               logEventUponVoucherCashOut(reference ?: \"\", true, null)\n                               hideLoading()\n                               navigateToTransactionStatusPage(status)\n\n                           }, { err ->\n                               hideLoading()\n                               logEventUponVoucherCashOut(reference ?: \"\", false, err.message)\n                               err.printStackTrace()\n                               navigateToTransactionStatusPage(false)\n                           }\n                )");
        C11280b $r10 = this.compositeDisposable;
        RxExtKt.addTo($r9, $r10);
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showAuthDialog() {
        Token $r1 = Token.GREATER_THAN;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactionstatus.summary.presenter.Preference
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTitle(Object obj) {
                String $r1 = str;
                WithdrawalView $r3 = (WithdrawalView) obj;
                WithdrawalSummaryPresenter.m41301showError$lambda3($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading() {
        Macro $r1 = Macro.URL;
        ifViewAttached($r1);
    }
}
