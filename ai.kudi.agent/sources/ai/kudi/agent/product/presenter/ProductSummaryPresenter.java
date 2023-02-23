package ai.kudi.agent.product.presenter;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.bills.domain.usecases.BillResponse;
import ai.kudi.agent.bills.domain.usecases.SubmitBillRequest;
import ai.kudi.agent.bills.domain.wiki.BillRequest;
import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.network.util.ConnectivityUtil;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.product.airtime_data.data.AirtimePurchase;
import ai.kudi.agent.product.airtime_data.data.ProductPurchase;
import ai.kudi.agent.product.navigators.ProductNavigator;
import ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator;
import ai.kudi.agent.product.view.ProductSummaryView;
import ai.kudi.agent.transactions.TransactionStatus;
import ai.kudi.agent.transactions.TransactionStatusType;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProductSummaryPresenter.kt */
@Metadata(m10422d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010 \u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#J0\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010#H\u0002J\u0016\u0010+\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020,2\u0006\u0010'\u001a\u00020(J\u0006\u0010-\u001a\u00020\u0015J\u000e\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020#J\u0006\u00100\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u00061"}, m10421d2 = {"Lai/kudi/agent/product/presenter/ProductSummaryPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/product/view/ProductSummaryView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "navigator", "Lai/kudi/agent/product/navigators/ProductNavigator;", "billPaymentNavigator", "Lai/kudi/agent/product/other_bills/navigators/BillPaymentNavigator;", "submitRequest", "Lai/kudi/agent/bills/domain/usecases/SubmitBillRequest;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/product/navigators/ProductNavigator;Lai/kudi/agent/product/other_bills/navigators/BillPaymentNavigator;Lai/kudi/agent/bills/domain/usecases/SubmitBillRequest;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "destroy", "", "editAmountPage", "payload", "Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;", "isFromSummaryPage", "", "editProductPurchaseStepOne", "Lai/kudi/agent/bills/data/BillsData;", "editProductPurchaseStepTwo", "editPurchaseDetailsPage", "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "hideLoading", "logUserEvent", MetricTracker.Object.MESSAGE, "", "navigateToTransactionStatusPage", TransactionField.STATUS, "Lai/kudi/agent/transactions/TransactionStatus;", "transactionType", "Lai/kudi/agent/transactions/TransactionStatusType;", "errorMessage", "transactionReference", "performPurchase", "Lai/kudi/agent/bills/domain/dto/BillRequest;", "showAuthDialog", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showLoading", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ProductSummaryPresenter extends C9410b<ProductSummaryView> {
    private final BillPaymentNavigator billPaymentNavigator;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final ProductNavigator navigator;
    private final SubmitBillRequest submitRequest;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductSummaryPresenter(FetchCurrentUser fetchCurrentUser, ProductNavigator productNavigator, BillPaymentNavigator billPaymentNavigator, SubmitBillRequest submitBillRequest) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(productNavigator, "navigator");
        Log_OC.getArray(billPaymentNavigator, "billPaymentNavigator");
        Log_OC.getArray(submitBillRequest, "submitRequest");
        this.fetchCurrentUser = fetchCurrentUser;
        this.navigator = productNavigator;
        this.billPaymentNavigator = billPaymentNavigator;
        this.submitRequest = submitBillRequest;
        C11280b $r5 = new C11280b();
        this.compositeDisposable = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideLoading$lambda-1  reason: not valid java name */
    public static final void m40215hideLoading$lambda1(ProductSummaryView productSummaryView) {
        Log_OC.getArray(productSummaryView, "view");
        productSummaryView.hideLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToTransactionStatusPage(final TransactionStatus transactionStatus, final TransactionStatusType transactionStatusType, final String str, final String str2) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.presenter.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                TransactionStatus $r1 = TransactionStatus.this;
                TransactionStatusType $r2 = transactionStatusType;
                String $r3 = str;
                String $r4 = str2;
                ProductSummaryView $r6 = (ProductSummaryView) obj;
                ProductSummaryPresenter.m40216navigateToTransactionStatusPage$lambda2($r1, $r2, $r3, $r4, $r6);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void navigateToTransactionStatusPage$default(ProductSummaryPresenter productSummaryPresenter, TransactionStatus transactionStatus, TransactionStatusType transactionStatusType, String $r3, String $r4, int i, Object obj) {
        int $i1 = i & 4;
        if ($i1 != 0) {
            $r3 = null;
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r4 = null;
        }
        productSummaryPresenter.navigateToTransactionStatusPage(transactionStatus, transactionStatusType, $r3, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToTransactionStatusPage$lambda-2  reason: not valid java name */
    public static final void m40216navigateToTransactionStatusPage$lambda2(TransactionStatus transactionStatus, TransactionStatusType transactionStatusType, String str, String str2, ProductSummaryView productSummaryView) {
        Log_OC.getArray(transactionStatus, "$status");
        Log_OC.getArray(transactionStatusType, "$transactionType");
        Log_OC.getArray(productSummaryView, "view");
        productSummaryView.navigateToTransactionStatusPage(transactionStatus, transactionStatusType, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performPurchase$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m40217performPurchase$lambda5(ProductSummaryPresenter productSummaryPresenter, BillRequest billRequest, User user) {
        Log_OC.getArray(productSummaryPresenter, "this$0");
        Log_OC.getArray(billRequest, "$payload");
        Log_OC.getArray(user, "it");
        SubmitBillRequest $r3 = productSummaryPresenter.submitRequest;
        String $r4 = user.getAndroidAppId();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = User.generateAndroidAppId();
        }
        Log_OC.loadImage($r5, "it.androidAppId ?: User.generateAndroidAppId()");
        Meta $r6 = billRequest.getMeta();
        String $r42 = user.getId();
        Log_OC.loadImage($r42, "it.id");
        BillRequest $r1 = BillRequest.copy$default(billRequest, null, null, null, 0, $r5, Meta.copy$default($r6, null, $r42, null, false, null, 0.0f, 0.0f, 125, null), null, 79, null);
        AbstractC11688p $r7 = $r3.execute($r1);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performPurchase$lambda-6  reason: not valid java name */
    public static final void m40218performPurchase$lambda6(ProductSummaryPresenter productSummaryPresenter, TransactionStatusType transactionStatusType, BillResponse billResponse) {
        Log_OC.getArray(productSummaryPresenter, "this$0");
        Log_OC.getArray(transactionStatusType, "$transactionType");
        productSummaryPresenter.hideLoading();
        TransactionStatus $r3 = TransactionStatus.SUCCESSFUL;
        String $r4 = billResponse.getReference();
        navigateToTransactionStatusPage$default(productSummaryPresenter, $r3, transactionStatusType, null, $r4, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performPurchase$lambda-7  reason: not valid java name */
    public static final void m40219performPurchase$lambda7(ProductSummaryPresenter productSummaryPresenter, TransactionStatusType transactionStatusType, Throwable th) {
        Log_OC.getArray(productSummaryPresenter, "this$0");
        Log_OC.getArray(transactionStatusType, "$transactionType");
        Log_OC.getArray(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        th.printStackTrace();
        productSummaryPresenter.hideLoading();
        CrashlyticsReport.logException(th);
        boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
        if ($z0) {
            return;
        }
        TransactionStatus $r2 = TransactionStatus.FAILED;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again.", null, 2, null);
        Object $r5 = $r4.invoke(th);
        navigateToTransactionStatusPage$default(productSummaryPresenter, $r2, transactionStatusType, (String) $r5, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAuthDialog$lambda-4  reason: not valid java name */
    public static final void m40220showAuthDialog$lambda4(ProductSummaryView productSummaryView) {
        Log_OC.getArray(productSummaryView, "view");
        productSummaryView.pinConfirmationDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-3  reason: not valid java name */
    public static final void m40221showError$lambda3(String str, ProductSummaryView productSummaryView) {
        Log_OC.getArray(str, "$error");
        Log_OC.getArray(productSummaryView, "view");
        productSummaryView.showError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoading$lambda-0  reason: not valid java name */
    public static final void m40222showLoading$lambda0(ProductSummaryView productSummaryView) {
        Log_OC.getArray(productSummaryView, "view");
        productSummaryView.showLoading();
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
    public final void editAmountPage(AirtimePurchase airtimePurchase, boolean z) {
        Log_OC.getArray(airtimePurchase, "payload");
        ProductNavigator $r2 = this.navigator;
        $r2.navigateToAirtimeAmountFragment(airtimePurchase);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editProductPurchaseStepOne(BillsData billsData, boolean z) {
        Log_OC.getArray(billsData, "payload");
        BillPaymentNavigator $r2 = this.billPaymentNavigator;
        $r2.toStepOneView(billsData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editProductPurchaseStepTwo(BillsData billsData, boolean z) {
        Log_OC.getArray(billsData, "payload");
        BillPaymentNavigator $r2 = this.billPaymentNavigator;
        $r2.toStepTwoView(billsData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void editPurchaseDetailsPage(ProductPurchase productPurchase, boolean z) {
        Log_OC.getArray(productPurchase, "payload");
        ProductNavigator $r2 = this.navigator;
        $r2.navigateToAirtimeAndDataFragment(productPurchase);
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
    public final void logUserEvent(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        String $r1 = Log_OC.m10359a("Location is enable ", (Object) str);
        Object[] $r2 = new Object[0];
        Timber.tag($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performPurchase(final BillRequest billRequest, final TransactionStatusType transactionStatusType) {
        Log_OC.getArray(billRequest, "payload");
        Log_OC.getArray(transactionStatusType, "transactionType");
        showLoading();
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.product.presenter.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ProductSummaryPresenter $r1 = ProductSummaryPresenter.this;
                BillRequest $r2 = billRequest;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = ProductSummaryPresenter.m40217performPurchase$lambda5($r1, $r2, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.product.presenter.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductSummaryPresenter $r1 = ProductSummaryPresenter.this;
                TransactionStatusType $r2 = transactionStatusType;
                BillResponse $r42 = (BillResponse) obj;
                ProductSummaryPresenter.m40218performPurchase$lambda6($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.product.presenter.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductSummaryPresenter $r1 = ProductSummaryPresenter.this;
                TransactionStatusType $r2 = transactionStatusType;
                Throwable $r42 = (Throwable) obj;
                ProductSummaryPresenter.m40219performPurchase$lambda7($r1, $r2, $r42);
            }
        });
        Log_OC.loadImage($r9, "fetchCurrentUser.execute().flatMapObservable {\n            submitRequest.execute(\n                payload.copy(\n                    sourceUserId = it.androidAppId ?: User.generateAndroidAppId(),\n                    meta = payload.meta.copy(user_id = it.id)\n                )\n            )\n        }\n            .subscribe(\n                {\n                    hideLoading()\n                    navigateToTransactionStatusPage(\n                        status = TransactionStatus.SUCCESSFUL,\n                        transactionType = transactionType,\n                        transactionReference = it.reference\n                    )\n                },\n                { error: Throwable ->\n                    error.printStackTrace()\n                    hideLoading()\n                    CrashlyticsReport.logException(error)\n                    if (ConnectivityUtil.isNoConnectivity(error)) {\n                    } else {\n                        navigateToTransactionStatusPage(\n                            TransactionStatus.FAILED,\n                            transactionType,\n                            parseHttpError2(\n                                \"Something went wrong. Please try again.\"\n                            )(error)\n                        )\n                    }\n                }\n            )");
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
        Compression $r1 = Compression.METADATA;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.presenter.Game
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void play(Object obj) {
                String $r1 = str;
                ProductSummaryView $r3 = (ProductSummaryView) obj;
                ProductSummaryPresenter.m40221showError$lambda3($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading() {
        C0407b $r1 = C0407b.f948c;
        ifViewAttached($r1);
    }
}
