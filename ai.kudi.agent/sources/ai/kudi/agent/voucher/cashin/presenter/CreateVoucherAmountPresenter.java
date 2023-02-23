package ai.kudi.agent.voucher.cashin.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.view.CashInAmountView;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreateVoucherAmountPresenter.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherAmountPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/voucher/cashin/view/CashInAmountView;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/voucher/cashin/view/MainTransferView;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "logVoucherAmountEnteredEvent", TransactionField.AMOUNT, "", "phoneNumber", "user", "Lai/kudi/agent/users/domain/dto/User;", "navigateToCashInNamePage", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "isFromSummaryPage", "", "navigateToVoucherRecipientPage", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateVoucherAmountPresenter extends C9410b<CashInAmountView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final MainTransferView mainTransferView;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateVoucherAmountPresenter(MainTransferView mainTransferView, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(mainTransferView, "mainTransferView");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.mainTransferView = mainTransferView;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logVoucherAmountEnteredEvent(String str, String str2, User user) {
        Analytics $r4 = this.analytics;
        $r4.onVoucherAmountEntered(str2, str, user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void navigateToCashInNamePage$default(CreateVoucherAmountPresenter createVoucherAmountPresenter, String str, VoucherCashInRequest voucherCashInRequest, boolean $z0, int i, Object obj) {
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z0 = false;
        }
        createVoucherAmountPresenter.navigateToCashInNamePage(str, voucherCashInRequest, $z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: navigateToCashInNamePage$lambda-1  reason: not valid java name */
    public static final void m41692navigateToCashInNamePage$lambda1(CreateVoucherAmountPresenter createVoucherAmountPresenter, String str, VoucherCashInRequest voucherCashInRequest, boolean z, User user) {
        VoucherCashInRequest $r0;
        String $r5;
        Log_OC.getArray(createVoucherAmountPresenter, "this$0");
        Log_OC.getArray(str, "$amount");
        String $r4 = "";
        if (voucherCashInRequest != null && ($r5 = voucherCashInRequest.getSenderPhoneNumber()) != null) {
            $r4 = $r5;
        }
        Log_OC.loadImage(user, "it");
        createVoucherAmountPresenter.logVoucherAmountEnteredEvent(str, $r4, user);
        if (voucherCashInRequest == null) {
            $r0 = null;
        } else {
            int $i0 = Integer.parseInt(str);
            $r0 = VoucherCashInRequest.copy$default(voucherCashInRequest, null, null, null, null, $i0, 15, null);
        }
        if (z) {
            MainTransferView $r6 = createVoucherAmountPresenter.mainTransferView;
            $r6.navigateToSummaryPage($r0);
            return;
        }
        MainTransferView $r62 = createVoucherAmountPresenter.mainTransferView;
        $r62.navigateToSenderPage($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-0  reason: not valid java name */
    public static final void m41694showError$lambda0(String str, CashInAmountView cashInAmountView) {
        Log_OC.getArray(str, "$error");
        Log_OC.getArray(cashInAmountView, "view");
        cashInAmountView.showError(str);
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
    public final void navigateToCashInNamePage(final String str, final VoucherCashInRequest voucherCashInRequest, final boolean z) {
        Log_OC.getArray(str, TransactionField.AMOUNT);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.voucher.cashin.presenter.LayoutManager
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CreateVoucherAmountPresenter $r1 = CreateVoucherAmountPresenter.this;
                String $r2 = str;
                VoucherCashInRequest $r32 = voucherCashInRequest;
                boolean $z0 = z;
                User $r5 = (User) obj;
                CreateVoucherAmountPresenter.m41692navigateToCashInNamePage$lambda1($r1, $r2, $r32, $z0, $r5);
            }
        };
        Token $r6 = Token.BOOL;
        FavoritesArrayAdapter $r7 = $r4.s(object, $r6);
        Log_OC.loadImage($r7, "fetchCurrentUser.execute()\n            .subscribe(\n                {\n                    logVoucherAmountEnteredEvent(\n                        amount,\n                        request?.senderPhoneNumber ?: \"\", it\n                    )\n                    val updatedRequest = request?.copy(amount = amount.toInt())\n                    if (isFromSummaryPage) {\n                        mainTransferView.navigateToSummaryPage(updatedRequest)\n                    } else {\n                        mainTransferView.navigateToSenderPage(updatedRequest)\n                    }\n\n                },\n                { err -> err.printStackTrace() }\n            )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToVoucherRecipientPage(VoucherCashInRequest voucherCashInRequest) {
        MainTransferView $r2 = this.mainTransferView;
        MainTransferView.DefaultImpls.navigateToRecipientPage$default($r2, voucherCashInRequest, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashin.presenter.NameFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void accept(Object obj) {
                String $r1 = str;
                CashInAmountView $r3 = (CashInAmountView) obj;
                CreateVoucherAmountPresenter.m41694showError$lambda0($r1, $r3);
            }
        });
    }
}
