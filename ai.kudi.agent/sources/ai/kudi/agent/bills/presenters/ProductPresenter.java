package ai.kudi.agent.bills.presenters;

import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.LookupRequest;
import ai.kudi.agent.bills.domain.usecases.LookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformBillerLookup;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.bills.domain.wiki.BillRequest;
import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.bills.views.ProductView;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import com.google.firebase.database.C5615f;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p272h.p364d.p365a.p366c.LoginListener;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: ProductPresenter.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010)\u001a\u00020*H\u0016J(\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-H\u0002J1\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020-2!\u00103\u001a\u001d\u0012\u0013\u0012\u00110-¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020*04J\u000e\u00107\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u00108\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u0011J\"\u00109\u001a\u00020*2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006="}, m10421d2 = {"Lai/kudi/agent/bills/presenters/ProductPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/bills/views/ProductView;", "fetchUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "billerLookup", "Lai/kudi/agent/bills/domain/usecases/PerformBillerLookup;", "feesLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "firebaseDB", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/bills/domain/usecases/PerformBillerLookup;Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;Lai/kudi/agent/core/analytics/Analytics;Lcom/google/firebase/database/FirebaseDatabase;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", BillPaymentStepOneFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/Biller;", "getBiller", "()Lai/kudi/agent/bills/data/Biller;", "setBiller", "(Lai/kudi/agent/bills/data/Biller;)V", "getBillerLookup", "()Lai/kudi/agent/bills/domain/usecases/PerformBillerLookup;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFeesLookup", "()Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "getFetchUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "isConfirmation", "", "()Z", "setConfirmation", "(Z)V", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/bills/domain/dto/BillRequest;", "getRequest", "()Lai/kudi/agent/bills/domain/dto/BillRequest;", "setRequest", "(Lai/kudi/agent/bills/domain/dto/BillRequest;)V", "destroy", "", "logEventOnLookup", "type", "", TransactionField.AMOUNT, "product", "fee", "performLookup", "customerId", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "showBiller", OpsMetricTracker.START, "submitRequest", "io", "Lio/reactivex/Scheduler;", "main", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ProductPresenter extends C9410b<ProductView> {
    private final Analytics analytics;
    public Biller biller;
    private final PerformBillerLookup billerLookup;
    private final C11280b compositeDisposable;
    private final PerformServiceFeeLookup feesLookup;
    private final FetchCurrentUser fetchUser;
    private final C5615f firebaseDB;
    private boolean isConfirmation;
    private BillRequest request;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductPresenter(FetchCurrentUser fetchCurrentUser, PerformBillerLookup performBillerLookup, PerformServiceFeeLookup performServiceFeeLookup, Analytics analytics, C5615f c5615f) {
        Log_OC.getArray(fetchCurrentUser, "fetchUser");
        Log_OC.getArray(performBillerLookup, "billerLookup");
        Log_OC.getArray(performServiceFeeLookup, "feesLookup");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(c5615f, "firebaseDB");
        this.fetchUser = fetchCurrentUser;
        this.billerLookup = performBillerLookup;
        this.feesLookup = performServiceFeeLookup;
        this.analytics = analytics;
        this.firebaseDB = c5615f;
        C11280b $r6 = new C11280b();
        this.compositeDisposable = $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEventOnLookup(final String str, final String str2, final String str3, final String str4) {
        FetchCurrentUser $r6 = this.fetchUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        p425j.p444e.Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r72 = $r7.u($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        AbstractC11696w $r73 = $r72.n($r82);
        Object object = new Object() { // from class: ai.kudi.agent.bills.presenters.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductPresenter $r2 = ProductPresenter.this;
                String $r3 = str;
                String $r4 = str2;
                String $r5 = str3;
                String $r62 = str4;
                User $r74 = (User) obj;
                ProductPresenter.m39073logEventOnLookup$lambda13($r2, $r3, $r4, $r5, $r62, $r74);
            }
        };
        ImageCache $r9 = ImageCache.mImageCache;
        FavoritesArrayAdapter $r10 = $r73.s(object, $r9);
        Log_OC.loadImage($r10, "fetchUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onTransactionLookUpEvent(\n                        type, amount, \"\", product, fee,\n                        it\n                    )\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r11 = this.compositeDisposable;
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logEventOnLookup$lambda-13  reason: not valid java name */
    public static final void m39073logEventOnLookup$lambda13(ProductPresenter productPresenter, String str, String str2, String str3, String str4, User user) {
        Log_OC.getArray(productPresenter, "this$0");
        Log_OC.getArray(str, "$type");
        Log_OC.getArray(str2, "$amount");
        Log_OC.getArray(str3, "$product");
        Log_OC.getArray(str4, "$fee");
        Analytics $r6 = productPresenter.getAnalytics();
        $r6.onTransactionLookUpEvent(str, str2, "", str3, str4, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-10  reason: not valid java name */
    public static final void m39075performLookup$lambda10(InterfaceC11767l interfaceC11767l, ProductPresenter productPresenter, final LookupResponse lookupResponse) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        Log_OC.getArray(productPresenter, "this$0");
        String $r2 = lookupResponse.getName();
        interfaceC11767l.invoke($r2);
        productPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.bills.presenters.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setContent(Object obj) {
                LookupResponse $r1 = LookupResponse.this;
                ProductView $r3 = (ProductView) obj;
                ProductPresenter.m39076performLookup$lambda10$lambda9($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-10$lambda-9  reason: not valid java name */
    public static final void m39076performLookup$lambda10$lambda9(LookupResponse lookupResponse, ProductView productView) {
        Log_OC.getArray(productView, "view");
        String $r1 = lookupResponse.getName();
        productView.showLookupResult($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-12  reason: not valid java name */
    public static final void m39077performLookup$lambda12(ProductPresenter productPresenter, Throwable th) {
        Log_OC.getArray(productPresenter, "this$0");
        th.printStackTrace();
        Direction $r2 = Direction.f69W;
        productPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookup$lambda-12$lambda-11  reason: not valid java name */
    public static final void m39078performLookup$lambda12$lambda11(ProductView productView) {
        Log_OC.getArray(productView, "view");
        productView.showLookupFailed("Customer name lookup failed. Try again");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showBiller$lambda-1  reason: not valid java name */
    public static final void m39079showBiller$lambda1(Biller biller, ProductView productView) {
        Log_OC.getArray(biller, "$biller");
        Log_OC.getArray(productView, "it");
        productView.hideProductsLoader();
        productView.setBiller(biller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final void m39080start$lambda0(ProductView productView) {
        Log_OC.getArray(productView, "it");
        productView.showProductsLoader();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void submitRequest$default(ProductPresenter productPresenter, BillRequest billRequest, p425j.p444e.Item $r2, p425j.p444e.Item $r3, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            p425j.p444e.Item $r5 = p425j.p444e.p470j0.ClassWriter.LogError();
            $r2 = $r5;
            Log_OC.loadImage($r5, "io()");
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            p425j.p444e.Item $r52 = ContextUtils.LogError();
            $r3 = $r52;
            Log_OC.loadImage($r52, "mainThread()");
        }
        productPresenter.submitRequest(billRequest, $r2, $r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitRequest$lambda-7  reason: not valid java name */
    public static final void m39081submitRequest$lambda7(final BillRequest billRequest, final ProductPresenter productPresenter, final User user) {
        Log_OC.getArray(billRequest, "$request");
        Log_OC.getArray(productPresenter, "this$0");
        Log_OC.getArray(user, "currentUser");
        int $i0 = billRequest.getAmount();
        if ($i0 < 50) {
            LoginListener $r4 = productPresenter.getView();
            ProductView $r5 = (ProductView) $r4;
            $r5.showAmountError("Minimum amount should be 50");
            return;
        }
        boolean $z0 = productPresenter.isConfirmation();
        if ($z0) {
            productPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.bills.presenters.Type
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                public final void getSize(Object obj) {
                    BillRequest $r1 = BillRequest.this;
                    User $r2 = user;
                    ProductView $r42 = (ProductView) obj;
                    ProductPresenter.m39086submitRequest$lambda7$lambda6($r1, $r2, $r42);
                }
            });
            return;
        }
        LoginListener $r42 = productPresenter.getView();
        ProductView $r52 = (ProductView) $r42;
        $r52.toggleServiceFeeLoading(true);
        PerformServiceFeeLookup $r6 = productPresenter.getFeesLookup();
        String $r7 = billRequest.getType();
        String $r8 = billRequest.getProductId();
        FeesLookupRequest $r0 = new FeesLookupRequest($r7, null, $r8, 2, null);
        AbstractC11688p $r9 = $r6.execute($r0);
        FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.bills.presenters.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductPresenter $r1 = ProductPresenter.this;
                BillRequest $r2 = billRequest;
                FeesLookupResponse $r43 = (FeesLookupResponse) obj;
                ProductPresenter.m39082submitRequest$lambda7$lambda3($r1, $r2, $r43);
            }
        }, new Object() { // from class: ai.kudi.agent.bills.presenters.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductPresenter $r1 = ProductPresenter.this;
                Throwable $r3 = (Throwable) obj;
                ProductPresenter.m39084submitRequest$lambda7$lambda5($r1, $r3);
            }
        });
        Log_OC.loadImage($r12, "feesLookup.execute(\n                            FeesLookupRequest(\n                                product = request.type,\n                                productId = request.productId\n                            )\n                        )\n                            .subscribe({\n\n                                logEventOnLookup(\n                                    request.type,\n                                    \"${request.amount}\",\n                                    request.productId,\n                                    it.serviceFee\n                                )\n\n                                ifViewAttached { view ->\n                                    view.toggleServiceFeeLoading(false)\n                                    isConfirmation = true\n                                    view.showServiceFee(it.serviceFee)\n                                }\n                            }, {\n                                it.printStackTrace()\n                                ifViewAttached { view ->\n                                    view.toggleServiceFeeLoading(false)\n                                    view.showLookupFailed(\n                                        \"An error occurred while fetching fees. Try again\"\n                                    )\n                                }\n                            })");
        C11280b $r13 = productPresenter.compositeDisposable;
        RxExtKt.addTo($r12, $r13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitRequest$lambda-7$lambda-3  reason: not valid java name */
    public static final void m39082submitRequest$lambda7$lambda3(final ProductPresenter productPresenter, BillRequest billRequest, final FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(productPresenter, "this$0");
        Log_OC.getArray(billRequest, "$request");
        String $r3 = billRequest.getType();
        int $i0 = billRequest.getAmount();
        String $r4 = String.valueOf($i0);
        String $r5 = billRequest.getProductId();
        String $r6 = feesLookupResponse.getServiceFee();
        productPresenter.logEventOnLookup($r3, $r4, $r5, $r6);
        productPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.bills.presenters.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void add(Object obj) {
                ProductPresenter $r1 = ProductPresenter.this;
                FeesLookupResponse $r2 = feesLookupResponse;
                ProductView $r42 = (ProductView) obj;
                ProductPresenter.m39083submitRequest$lambda7$lambda3$lambda2($r1, $r2, $r42);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitRequest$lambda-7$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39083submitRequest$lambda7$lambda3$lambda2(ProductPresenter productPresenter, FeesLookupResponse feesLookupResponse, ProductView productView) {
        Log_OC.getArray(productPresenter, "this$0");
        Log_OC.getArray(productView, "view");
        productView.toggleServiceFeeLoading(false);
        productPresenter.setConfirmation(true);
        String $r2 = feesLookupResponse.getServiceFee();
        productView.showServiceFee($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitRequest$lambda-7$lambda-5  reason: not valid java name */
    public static final void m39084submitRequest$lambda7$lambda5(ProductPresenter productPresenter, Throwable th) {
        Log_OC.getArray(productPresenter, "this$0");
        th.printStackTrace();
        InputMethod $r2 = InputMethod.inputMethod;
        productPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitRequest$lambda-7$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39085submitRequest$lambda7$lambda5$lambda4(ProductView productView) {
        Log_OC.getArray(productView, "view");
        productView.toggleServiceFeeLoading(false);
        productView.showLookupFailed("An error occurred while fetching fees. Try again");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitRequest$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39086submitRequest$lambda7$lambda6(BillRequest billRequest, User user, ProductView productView) {
        Log_OC.getArray(billRequest, "$request");
        Log_OC.getArray(user, "$currentUser");
        Log_OC.getArray(productView, "view");
        Meta $r3 = billRequest.getMeta();
        String $r4 = user.getId();
        Log_OC.loadImage($r4, "currentUser.id");
        Meta $r32 = Meta.copy$default($r3, null, $r4, null, false, null, 0.0f, 0.0f, 125, null);
        String $r42 = user.getAndroidAppId();
        String $r5 = $r42;
        if ($r42 == null) {
            $r5 = User.generateAndroidAppId();
        }
        Log_OC.loadImage($r5, "currentUser.androidAppId\n                                        ?: User.generateAndroidAppId()");
        BillRequest $r0 = BillRequest.copy$default(billRequest, null, null, null, 0, $r5, $r32, null, 79, null);
        productView.openPerformPayment($r0);
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
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Biller getBiller() {
        Biller $r1 = this.biller;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError(BillPaymentStepOneFragment.BILLER_PARAM);
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PerformBillerLookup getBillerLookup() {
        PerformBillerLookup r1 = this.billerLookup;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PerformServiceFeeLookup getFeesLookup() {
        PerformServiceFeeLookup r1 = this.feesLookup;
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
    public final BillRequest getRequest() {
        BillRequest r1 = this.request;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isConfirmation() {
        boolean z0 = this.isConfirmation;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performLookup(String str, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "customerId");
        Log_OC.getArray(interfaceC11767l, "callback");
        PerformBillerLookup $r4 = this.billerLookup;
        Biller $r5 = getBiller();
        String $r6 = $r5.getLookupId();
        LookupRequest $r1 = new LookupRequest($r6, str);
        AbstractC11688p $r7 = $r4.execute($r1);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.bills.presenters.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r12 = InterfaceC11767l.this;
                ProductPresenter $r2 = this;
                LookupResponse $r42 = (LookupResponse) obj;
                ProductPresenter.m39075performLookup$lambda10($r12, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.bills.presenters.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductPresenter $r12 = ProductPresenter.this;
                Throwable $r3 = (Throwable) obj;
                ProductPresenter.m39077performLookup$lambda12($r12, $r3);
            }
        });
        Log_OC.loadImage($r10, "billerLookup.execute(LookupRequest(biller.lookupId, customerId))\n            .subscribe(\n                {\n                    callback(it.name)\n                    ifViewAttached { view ->\n                        view.showLookupResult(it.name)\n                    }\n                },\n                {\n                    it.printStackTrace()\n                    ifViewAttached { view ->\n                        view.showLookupFailed(\"Customer name lookup failed. Try again\")\n                    }\n                }\n            )");
        C11280b $r11 = this.compositeDisposable;
        RxExtKt.addTo($r10, $r11);
    }

    public final void setBiller(Biller biller) {
        Log_OC.getArray(biller, "<set-?>");
        this.biller = biller;
    }

    public final void setConfirmation(boolean z) {
        this.isConfirmation = z;
    }

    public final void setRequest(BillRequest billRequest) {
        this.request = billRequest;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showBiller(final Biller biller) {
        Log_OC.getArray(biller, BillPaymentStepOneFragment.BILLER_PARAM);
        setBiller(biller);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.bills.presenters.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void writeTo(Object obj) {
                Biller $r1 = Biller.this;
                ProductView $r3 = (ProductView) obj;
                ProductPresenter.m39079showBiller$lambda1($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(Biller biller) {
        Log_OC.getArray(biller, BillPaymentStepOneFragment.BILLER_PARAM);
        Timer $r2 = Timer.timer;
        ifViewAttached($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitRequest(final BillRequest billRequest, p425j.p444e.Item item, p425j.p444e.Item item2) {
        Log_OC.getArray(billRequest, TransactionRequest.TYPE_REQUEST);
        Log_OC.getArray(item, "io");
        Log_OC.getArray(item2, "main");
        FetchCurrentUser $r4 = this.fetchUser;
        AbstractC11696w $r5 = $r4.execute(item, item2);
        Object object = new Object() { // from class: ai.kudi.agent.bills.presenters.DataSource
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BillRequest $r1 = BillRequest.this;
                ProductPresenter $r2 = this;
                User $r42 = (User) obj;
                ProductPresenter.m39081submitRequest$lambda7($r1, $r2, $r42);
            }
        };
        Format $r7 = Format.TAG;
        FavoritesArrayAdapter $r8 = $r5.s(object, $r7);
        Log_OC.loadImage($r8, "fetchUser.execute(io, main)\n            .subscribe(\n                { currentUser: User ->\n\n                    /**if (request.meta.phone_no.isNotBlank() && request.meta.phone_no == currentUser.phoneNo) {\n                    view.genericErrorMesage(\"You can not use your phone number. Please use the phone number of the customer.\")\n                    } else  */\n                    if (request.amount < 50) {\n                        view.showAmountError(\"Minimum amount should be $MIN_AMT\")\n                    } else if (!isConfirmation) {\n\n                        view.toggleServiceFeeLoading(true)\n                        feesLookup.execute(\n                            FeesLookupRequest(\n                                product = request.type,\n                                productId = request.productId\n                            )\n                        )\n                            .subscribe({\n\n                                logEventOnLookup(\n                                    request.type,\n                                    \"${request.amount}\",\n                                    request.productId,\n                                    it.serviceFee\n                                )\n\n                                ifViewAttached { view ->\n                                    view.toggleServiceFeeLoading(false)\n                                    isConfirmation = true\n                                    view.showServiceFee(it.serviceFee)\n                                }\n                            }, {\n                                it.printStackTrace()\n                                ifViewAttached { view ->\n                                    view.toggleServiceFeeLoading(false)\n                                    view.showLookupFailed(\n                                        \"An error occurred while fetching fees. Try again\"\n                                    )\n                                }\n                            }).addTo(compositeDisposable)\n                    } else {\n                        ifViewAttached { view ->\n                            val updatedMeta = request.meta.copy(user_id = currentUser.id)\n                            view.openPerformPayment(\n                                request.copy(\n                                    sourceUserId = currentUser.androidAppId\n                                        ?: User.generateAndroidAppId(),\n                                    meta = updatedMeta\n                                )\n                            )\n                        }\n                    }\n\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r9 = this.compositeDisposable;
        RxExtKt.addTo($r8, $r9);
    }
}
