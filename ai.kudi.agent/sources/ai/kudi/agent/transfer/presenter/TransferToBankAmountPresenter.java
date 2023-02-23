package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.IntExtKt;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.views.TransferToBankAmountView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransferToBankAmountPresenter.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJA\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0013J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\u0012\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/transfer/presenter/TransferToBankAmountPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transfer/views/TransferToBankAmountView;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "feeLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;Lai/kudi/agent/voucher/cashin/view/MainTransferView;Lai/kudi/agent/core/analytics/Analytics;Landroid/content/SharedPreferences;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "continueToNextPage", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "walletBalance", "", "isFromSummaryPage", "", "io", "Lio/reactivex/Scheduler;", "main", "isCashOutFlow", "(Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;Ljava/lang/Double;ZLio/reactivex/Scheduler;Lio/reactivex/Scheduler;Z)V", "destroy", "editAccountDetails", "payload", "fetchServiceFee", "openVoucherPage", "showErrorMsg", "showInvalidAmount", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferToBankAmountPresenter extends C9410b<TransferToBankAmountView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private final PerformServiceFeeLookup feeLookup;
    private final MainTransferView mainTransferView;
    private final SharedPreferences sharedPreferences;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferToBankAmountPresenter(FetchCurrentUser fetchCurrentUser, PerformServiceFeeLookup performServiceFeeLookup, MainTransferView mainTransferView, Analytics analytics, SharedPreferences sharedPreferences) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(performServiceFeeLookup, "feeLookup");
        Log_OC.getArray(mainTransferView, "mainTransferView");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.currentUser = fetchCurrentUser;
        this.feeLookup = performServiceFeeLookup;
        this.mainTransferView = mainTransferView;
        this.analytics = analytics;
        this.sharedPreferences = sharedPreferences;
        C11280b $r6 = new C11280b();
        this.compositeDisposable = $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void continueToNextPage$default(TransferToBankAmountPresenter transferToBankAmountPresenter, TransferToBankPayload transferToBankPayload, Double d, boolean z, p425j.p444e.Item $r3, p425j.p444e.Item $r4, boolean z2, int i, Object obj) {
        int $i1 = i & 8;
        if ($i1 != 0) {
            p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
            $r3 = $r6;
            Log_OC.loadImage($r6, "io()");
        }
        int $i0 = i & 16;
        if ($i0 != 0) {
            p425j.p444e.Item $r62 = ContextUtils.LogError();
            $r4 = $r62;
            Log_OC.loadImage($r62, "mainThread()");
        }
        transferToBankAmountPresenter.continueToNextPage(transferToBankPayload, d, z, $r3, $r4, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueToNextPage$lambda-0  reason: not valid java name */
    public static final void m41320continueToNextPage$lambda0(TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "it");
        TransferToBankAmountView.DefaultImpls.toggleActionBtn$default(transferToBankAmountView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchServiceFee$lambda-1  reason: not valid java name */
    public static final void m41321fetchServiceFee$lambda1(TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "it");
        TransferToBankAmountView.DefaultImpls.toggleActionBtn$default(transferToBankAmountView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-6  reason: not valid java name */
    public static final void m41322fetchServiceFee$lambda6(final TransferToBankAmountPresenter transferToBankAmountPresenter, final TransferToBankPayload transferToBankPayload, final User user) {
        Log_OC.getArray(transferToBankAmountPresenter, "this$0");
        Log_OC.getArray(transferToBankPayload, "$payload");
        PerformServiceFeeLookup $r3 = transferToBankAmountPresenter.feeLookup;
        Integer $r5 = transferToBankPayload.getAmount();
        String $r6 = String.valueOf($r5);
        FeesLookupRequest $r4 = new FeesLookupRequest("cashout", $r6, "cashout");
        AbstractC11688p $r7 = $r3.execute($r4);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.transfer.presenter.LayoutManager
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankAmountPresenter $r1 = TransferToBankAmountPresenter.this;
                TransferToBankPayload $r2 = transferToBankPayload;
                User $r32 = user;
                FeesLookupResponse $r52 = (FeesLookupResponse) obj;
                TransferToBankAmountPresenter.m41323fetchServiceFee$lambda6$lambda3($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.transfer.presenter.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankAmountPresenter $r1 = TransferToBankAmountPresenter.this;
                User $r2 = user;
                Throwable $r42 = (Throwable) obj;
                TransferToBankAmountPresenter.m41325fetchServiceFee$lambda6$lambda5($r1, $r2, $r42);
            }
        });
        Log_OC.loadImage($r10, "feeLookup.execute(\n                    FeesLookupRequest(\n                        Constants.CASHOUT_PRODUCT_NAME,\n                        payload.amount.toString(),\n                        productId = Constants.CASHOUT_PRODUCT_ID\n                    )\n                )\n                    .subscribe(\n                        {\n                            openVoucherPage(\n                                payload.copy(\n                                    serviceFeeIncluded = true,\n                                    serviceFee = it.serviceFee\n                                )\n                            )\n                            analytics.onPerformServiceFeeLookup(\n                                user.phoneNumber,\n                                true\n                            )\n                            ifViewAttached { view ->\n                                view.toggleActionBtn(true)\n                            }\n                        },\n                        {\n                            it.printStackTrace()\n                            analytics.onPerformServiceFeeLookup(\n                                user.phoneNumber,\n                                false, it.message\n                            )\n                            showErrorMsg()\n                            ifViewAttached { view ->\n                                view.toggleActionBtn(true)\n                            }\n                        }\n                    )");
        C11280b $r11 = transferToBankAmountPresenter.compositeDisposable;
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-6$lambda-3  reason: not valid java name */
    public static final void m41323fetchServiceFee$lambda6$lambda3(TransferToBankAmountPresenter transferToBankAmountPresenter, TransferToBankPayload transferToBankPayload, User user, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(transferToBankAmountPresenter, "this$0");
        Log_OC.getArray(transferToBankPayload, "$payload");
        Boolean $r4 = Boolean.TRUE;
        TransferToBankPayload $r1 = TransferToBankPayload.copy$default(transferToBankPayload, null, null, null, null, null, null, $r4, null, null, null, feesLookupResponse.getServiceFee(), null, null, 7103, null);
        transferToBankAmountPresenter.openVoucherPage($r1);
        Analytics $r6 = transferToBankAmountPresenter.analytics;
        String $r5 = user.getPhoneNumber();
        Log_OC.loadImage($r5, "user.phoneNumber");
        TransferToBankAnalytics.DefaultImpls.onPerformServiceFeeLookup$default($r6, $r5, true, null, 4, null);
        Logger $r7 = Logger.logger;
        transferToBankAmountPresenter.ifViewAttached($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchServiceFee$lambda-6$lambda-3$lambda-2  reason: not valid java name */
    public static final void m41324fetchServiceFee$lambda6$lambda3$lambda2(TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "view");
        transferToBankAmountView.toggleActionBtn(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-6$lambda-5  reason: not valid java name */
    public static final void m41325fetchServiceFee$lambda6$lambda5(TransferToBankAmountPresenter transferToBankAmountPresenter, User user, Throwable th) {
        Log_OC.getArray(transferToBankAmountPresenter, "this$0");
        th.printStackTrace();
        Analytics $r3 = transferToBankAmountPresenter.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "user.phoneNumber");
        String $r5 = th.getMessage();
        $r3.onPerformServiceFeeLookup($r4, false, $r5);
        transferToBankAmountPresenter.showErrorMsg();
        Affiliation $r6 = Affiliation.publisher;
        transferToBankAmountPresenter.ifViewAttached($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchServiceFee$lambda-6$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41326fetchServiceFee$lambda6$lambda5$lambda4(TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "view");
        transferToBankAmountView.toggleActionBtn(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-8  reason: not valid java name */
    public static final void m41327fetchServiceFee$lambda8(TransferToBankAmountPresenter transferToBankAmountPresenter, Throwable th) {
        Log_OC.getArray(transferToBankAmountPresenter, "this$0");
        th.printStackTrace();
        transferToBankAmountPresenter.showErrorMsg();
        MXParser $r2 = MXParser.f1805pc;
        transferToBankAmountPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchServiceFee$lambda-8$lambda-7  reason: not valid java name */
    public static final void m41328fetchServiceFee$lambda8$lambda7(TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "view");
        transferToBankAmountView.toggleActionBtn(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openVoucherPage(TransferToBankPayload transferToBankPayload) {
        MainTransferView $r2 = this.mainTransferView;
        $r2.navigateToBankTransferSummaryPage(transferToBankPayload, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showErrorMsg() {
        Dialogs $r1 = Dialogs.CONNECT;
        ifViewAttached($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showErrorMsg$lambda-9  reason: not valid java name */
    public static final void m41329showErrorMsg$lambda9(TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "it");
        transferToBankAmountView.showMsg("Error occurred, please retry");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showInvalidAmount(final String str) {
        if (str == null) {
            return;
        }
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transfer.presenter.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTitle(Object obj) {
                String $r1 = str;
                TransferToBankAmountView $r3 = (TransferToBankAmountView) obj;
                TransferToBankAmountPresenter.m41330showInvalidAmount$lambda11$lambda10($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showInvalidAmount$lambda-11$lambda-10  reason: not valid java name */
    public static final void m41330showInvalidAmount$lambda11$lambda10(String str, TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "view");
        transferToBankAmountView.showInvalidAmount(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void continueToNextPage(TransferToBankPayload transferToBankPayload, Double d, boolean z, p425j.p444e.Item item, p425j.p444e.Item item2, boolean z2) {
        Log_OC.getArray(transferToBankPayload, TransactionRequest.TYPE_REQUEST);
        Log_OC.getArray(item, "io");
        Log_OC.getArray(item2, "main");
        Frame $r6 = Frame.f1795h;
        ifViewAttached($r6);
        SharedPreferences $r7 = this.sharedPreferences;
        String $r8 = $r7.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "AGENT");
        String $r9 = $r8;
        if ($r8 == null) {
            $r9 = "AGENT";
        }
        int $i0 = z2 ? 500000 : 200000;
        double $d0 = $i0;
        boolean $z2 = Log_OC.append($r9, "AGENT");
        double $d1 = $z2 ? 500.0d : 100.0d;
        Integer $r10 = transferToBankPayload.getAmount();
        String $r82 = String.valueOf($r10);
        TransferToBankAmountPresenter$continueToNextPage$2 $r5 = new TransferToBankAmountPresenter$continueToNextPage$2(this, item, item2, z2, transferToBankPayload, z);
        IntExtKt.transferAmountValidation($r82, d, false, $d1, $d0, $r5);
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
    public final void editAccountDetails(TransferToBankPayload transferToBankPayload) {
        Analytics $r2 = this.analytics;
        $r2.onEditAccountDetailsClicked();
        MainTransferView $r3 = this.mainTransferView;
        MainTransferView.DefaultImpls.navigateToAccountDetailsPage$default($r3, transferToBankPayload, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchServiceFee(final TransferToBankPayload transferToBankPayload) {
        Log_OC.getArray(transferToBankPayload, "payload");
        C0655c $r2 = C0655c.f1816d;
        ifViewAttached($r2);
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        FavoritesArrayAdapter $r7 = $r4.s(new Object() { // from class: ai.kudi.agent.transfer.presenter.StandardShowcaseDrawer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankAmountPresenter $r1 = TransferToBankAmountPresenter.this;
                TransferToBankPayload $r22 = transferToBankPayload;
                User $r42 = (User) obj;
                TransferToBankAmountPresenter.m41322fetchServiceFee$lambda6($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transfer.presenter.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankAmountPresenter $r1 = TransferToBankAmountPresenter.this;
                Throwable $r32 = (Throwable) obj;
                TransferToBankAmountPresenter.m41327fetchServiceFee$lambda8($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "currentUser.execute().subscribe(\n            { user ->\n                feeLookup.execute(\n                    FeesLookupRequest(\n                        Constants.CASHOUT_PRODUCT_NAME,\n                        payload.amount.toString(),\n                        productId = Constants.CASHOUT_PRODUCT_ID\n                    )\n                )\n                    .subscribe(\n                        {\n                            openVoucherPage(\n                                payload.copy(\n                                    serviceFeeIncluded = true,\n                                    serviceFee = it.serviceFee\n                                )\n                            )\n                            analytics.onPerformServiceFeeLookup(\n                                user.phoneNumber,\n                                true\n                            )\n                            ifViewAttached { view ->\n                                view.toggleActionBtn(true)\n                            }\n                        },\n                        {\n                            it.printStackTrace()\n                            analytics.onPerformServiceFeeLookup(\n                                user.phoneNumber,\n                                false, it.message\n                            )\n                            showErrorMsg()\n                            ifViewAttached { view ->\n                                view.toggleActionBtn(true)\n                            }\n                        }\n                    ).addTo(compositeDisposable)\n            },\n            {\n                it.printStackTrace()\n                showErrorMsg()\n                ifViewAttached { view ->\n                    view.toggleActionBtn(true)\n                }\n            }\n        )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }
}
