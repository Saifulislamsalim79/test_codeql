package ai.kudi.agent.product.airtime_data.presenter;

import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.constants.ConstantsKt;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.product.airtime_data.data.AirtimePurchase;
import ai.kudi.agent.product.airtime_data.data.DataPurchase;
import ai.kudi.agent.product.airtime_data.data.Networks;
import ai.kudi.agent.product.airtime_data.data.Plan;
import ai.kudi.agent.product.airtime_data.data.ProductPurchase;
import ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView;
import ai.kudi.agent.product.airtime_data.views.AirtimeView;
import ai.kudi.agent.product.navigators.ProductNavigator;
import ai.kudi.agent.product.repository.BillerRepository;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: AirtimeAndDataPresenter.kt */
@Metadata(m10422d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0015H\u0002J(\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0002J(\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0018H\u0002J*\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010(\u001a\u00020)J\u0016\u0010.\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)J\u0006\u0010/\u001a\u00020\u0015J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\"\u001a\u0002012\u0006\u0010(\u001a\u00020)H\u0002J$\u00102\u001a\u00020\u00132\u0006\u0010&\u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\"\u00103\u001a\u00020\u00132\u0006\u0010&\u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u00104\u001a\u00020!H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/presenter/AirtimeAndDataPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/product/airtime_data/views/AirtimeAndDataView;", "navigator", "Lai/kudi/agent/product/navigators/ProductNavigator;", "fetchUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "feesLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "sharedPreferences", "Landroid/content/SharedPreferences;", "billerRepository", "Lai/kudi/agent/product/repository/BillerRepository;", "(Lai/kudi/agent/product/navigators/ProductNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;Lai/kudi/agent/core/analytics/Analytics;Landroid/content/SharedPreferences;Lai/kudi/agent/product/repository/BillerRepository;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isConfirmation", "", "destroy", "", "editPurchaseDetailsPage", "payload", "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "isFromSummaryPage", "fetchAirtimeNetworks", "fetchDataPlan", "network", "Lai/kudi/agent/product/airtime_data/data/Networks;", "fetchWalletBalance", "logEventOnLookup", "type", "", TransactionField.AMOUNT, "product", "fee", "navigateToEnterAmount", "phoneNumber", "purchaseTypes", "walletBalance", "", "navigateToSummaryPage", TransactionRequest.TYPE_REQUEST, "plan", "Lai/kudi/agent/product/airtime_data/data/Plan;", "performFeesLookup", OpsMetricTracker.START, "validateAmount", "", "validateDataPurchaseFields", "validateDetails", "purchaseType", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AirtimeAndDataPresenter extends C9410b<AirtimeAndDataView> {
    private final Analytics analytics;
    private final BillerRepository billerRepository;
    private final C11280b compositeDisposable;
    private final PerformServiceFeeLookup feesLookup;
    private final FetchCurrentUser fetchUser;
    private boolean isConfirmation;
    private final ProductNavigator navigator;
    private final SharedPreferences sharedPreferences;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AirtimeAndDataPresenter(ProductNavigator productNavigator, FetchCurrentUser fetchCurrentUser, PerformServiceFeeLookup performServiceFeeLookup, Analytics analytics, SharedPreferences sharedPreferences, BillerRepository billerRepository) {
        Log_OC.getArray(productNavigator, "navigator");
        Log_OC.getArray(fetchCurrentUser, "fetchUser");
        Log_OC.getArray(performServiceFeeLookup, "feesLookup");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        Log_OC.getArray(billerRepository, "billerRepository");
        this.navigator = productNavigator;
        this.fetchUser = fetchCurrentUser;
        this.feesLookup = performServiceFeeLookup;
        this.analytics = analytics;
        this.sharedPreferences = sharedPreferences;
        this.billerRepository = billerRepository;
        C11280b $r7 = new C11280b();
        this.compositeDisposable = $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAirtimeNetworks$lambda-14  reason: not valid java name */
    public static final void m40143fetchAirtimeNetworks$lambda14(AirtimeAndDataPresenter airtimeAndDataPresenter, final List list) {
        Log_OC.getArray(airtimeAndDataPresenter, "this$0");
        airtimeAndDataPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.airtime_data.presenter.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                List $r1 = list;
                AirtimeAndDataView $r3 = (AirtimeAndDataView) obj;
                AirtimeAndDataPresenter.m40144fetchAirtimeNetworks$lambda14$lambda13($r1, $r3);
            }
        });
        airtimeAndDataPresenter.fetchWalletBalance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002a */
    /* renamed from: fetchAirtimeNetworks$lambda-14$lambda-13  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40144fetchAirtimeNetworks$lambda14$lambda13(java.util.List r16, ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView r17) {
        /*
            java.lang.String r1 = "view"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r3 = r17
            ai.kudi.agent.product.airtime_data.views.AirtimeView r3 = (ai.kudi.agent.product.airtime_data.views.AirtimeView) r3
            r2 = r3
            java.lang.String r1 = "billers"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            r0 = r16
            int r5 = kotlin.p557z.C13722p.m3921o(r0, r6)
            r4.<init>(r5)
            r0 = r16
            java.util.Iterator r7 = r0.iterator()
        L26:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L49
            java.lang.Object r9 = r7.next()
            r11 = r9
            ai.kudi.agent.bills.data.Biller r11 = (ai.kudi.agent.bills.data.Biller) r11
            r10 = r11
            ai.kudi.agent.product.airtime_data.data.Networks r12 = new ai.kudi.agent.product.airtime_data.data.Networks
            java.lang.String r13 = r10.getName()
            java.lang.String r14 = r10.getLookupId()
            java.lang.String r15 = r10.getImage()
            r12.<init>(r13, r14, r15)
            r4.add(r12)
            goto L26
        L49:
            r2.showNetworks(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.airtime_data.presenter.AirtimeAndDataPresenter.m40144fetchAirtimeNetworks$lambda14$lambda13(java.util.List, ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDataPlan$lambda-18  reason: not valid java name */
    public static final void m40146fetchDataPlan$lambda18(AirtimeAndDataPresenter airtimeAndDataPresenter, final List list) {
        Log_OC.getArray(airtimeAndDataPresenter, "this$0");
        airtimeAndDataPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.airtime_data.presenter.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                List $r1 = list;
                AirtimeAndDataView $r3 = (AirtimeAndDataView) obj;
                AirtimeAndDataPresenter.m40147fetchDataPlan$lambda18$lambda17($r1, $r3);
            }
        });
        airtimeAndDataPresenter.fetchWalletBalance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002a */
    /* renamed from: fetchDataPlan$lambda-18$lambda-17  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40147fetchDataPlan$lambda18$lambda17(java.util.List r16, ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView r17) {
        /*
            java.lang.String r1 = "view"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r3 = r17
            ai.kudi.agent.product.airtime_data.views.AirtimeView r3 = (ai.kudi.agent.product.airtime_data.views.AirtimeView) r3
            r2 = r3
            java.lang.String r1 = "products"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            r0 = r16
            int r5 = kotlin.p557z.C13722p.m3921o(r0, r6)
            r4.<init>(r5)
            r0 = r16
            java.util.Iterator r7 = r0.iterator()
        L26:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L51
            java.lang.Object r9 = r7.next()
            r11 = r9
            ai.kudi.agent.bills.data.Product r11 = (ai.kudi.agent.bills.data.Product) r11
            r10 = r11
            ai.kudi.agent.product.airtime_data.data.Plan r12 = new ai.kudi.agent.product.airtime_data.data.Plan
            java.lang.String r13 = r10.getName()
            java.lang.Integer r14 = r10.getAmount()
            if (r14 != 0) goto L42
            r5 = 0
            goto L46
        L42:
            int r5 = r14.intValue()
        L46:
            java.lang.String r15 = r10.getId()
            r12.<init>(r13, r5, r15)
            r4.add(r12)
            goto L26
        L51:
            r2.showPlans(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.airtime_data.presenter.AirtimeAndDataPresenter.m40147fetchDataPlan$lambda18$lambda17(java.util.List, ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchWalletBalance() {
        SharedPreferences $r2 = this.sharedPreferences;
        String $r1 = $r2.getString(ConstantsKt.EXTRA_WALLET_BALANCE, "0.0");
        final String $r3 = $r1 != null ? $r1 : "0.0";
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.airtime_data.presenter.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTitle(Object obj) {
                String $r12 = $r3;
                AirtimeAndDataView $r32 = (AirtimeAndDataView) obj;
                AirtimeAndDataPresenter.m40149fetchWalletBalance$lambda27($r12, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchWalletBalance$lambda-27  reason: not valid java name */
    public static final void m40149fetchWalletBalance$lambda27(String str, AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(str, "$balance");
        Log_OC.getArray(airtimeAndDataView, "view");
        AirtimeView $r2 = (AirtimeView) airtimeAndDataView;
        double $d0 = Double.parseDouble(str);
        $r2.setWalletBalance($d0);
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
        Object object = new Object() { // from class: ai.kudi.agent.product.airtime_data.presenter.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AirtimeAndDataPresenter $r2 = AirtimeAndDataPresenter.this;
                String $r3 = str;
                String $r4 = str2;
                String $r5 = str3;
                String $r62 = str4;
                User $r74 = (User) obj;
                AirtimeAndDataPresenter.m40150logEventOnLookup$lambda25($r2, $r3, $r4, $r5, $r62, $r74);
            }
        };
        Direction $r9 = Direction.f903E;
        FavoritesArrayAdapter $r10 = $r73.s(object, $r9);
        Log_OC.loadImage($r10, "fetchUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onTransactionLookUpEvent(\n                        type, amount, \"\", product, fee,\n                        it\n                    )\n                }, {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r11 = this.compositeDisposable;
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logEventOnLookup$lambda-25  reason: not valid java name */
    public static final void m40150logEventOnLookup$lambda25(AirtimeAndDataPresenter airtimeAndDataPresenter, String str, String str2, String str3, String str4, User user) {
        Log_OC.getArray(airtimeAndDataPresenter, "this$0");
        Log_OC.getArray(str, "$type");
        Log_OC.getArray(str2, "$amount");
        Log_OC.getArray(str3, "$product");
        Log_OC.getArray(str4, "$fee");
        Analytics $r6 = airtimeAndDataPresenter.analytics;
        $r6.onTransactionLookUpEvent(str, str2, "", str3, str4, user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToSummaryPage(ProductPurchase productPurchase) {
        ProductNavigator $r2 = this.navigator;
        $r2.navigateToAirtimePurchaseSummaryFragment(productPurchase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performFeesLookup$lambda-20  reason: not valid java name */
    public static final void m40152performFeesLookup$lambda20(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        airtimeAndDataView.showLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performFeesLookup$lambda-22  reason: not valid java name */
    public static final void m40153performFeesLookup$lambda22(final AirtimeAndDataPresenter airtimeAndDataPresenter, final ProductPurchase productPurchase, final FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(airtimeAndDataPresenter, "this$0");
        Log_OC.getArray(productPurchase, "$request");
        String $r3 = productPurchase.getRequestType();
        int $i0 = productPurchase.getRequestAmount();
        String $r4 = String.valueOf($i0);
        String $r5 = productPurchase.getProductId();
        Log_OC.append($r5);
        String $r6 = feesLookupResponse.getServiceFee();
        airtimeAndDataPresenter.logEventOnLookup($r3, $r4, $r5, $r6);
        airtimeAndDataPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.airtime_data.presenter.Settings$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void run(Object obj) {
                AirtimeAndDataPresenter $r1 = AirtimeAndDataPresenter.this;
                ProductPurchase $r2 = productPurchase;
                FeesLookupResponse $r32 = feesLookupResponse;
                AirtimeAndDataView $r52 = (AirtimeAndDataView) obj;
                AirtimeAndDataPresenter.m40154performFeesLookup$lambda22$lambda21($r1, $r2, $r32, $r52);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performFeesLookup$lambda-22$lambda-21  reason: not valid java name */
    public static final void m40154performFeesLookup$lambda22$lambda21(AirtimeAndDataPresenter airtimeAndDataPresenter, ProductPurchase productPurchase, FeesLookupResponse feesLookupResponse, AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataPresenter, "this$0");
        Log_OC.getArray(productPurchase, "$request");
        Log_OC.getArray(airtimeAndDataView, "view");
        airtimeAndDataView.hideLoader();
        airtimeAndDataPresenter.isConfirmation = true;
        String $r4 = feesLookupResponse.getServiceFee();
        ProductPurchase $r1 = productPurchase.setRequestServiceFee($r4);
        String $r42 = Log_OC.m10359a("Request ", $r1);
        Object[] $r5 = new Object[0];
        Timber.m1627e($r42, $r5);
        airtimeAndDataPresenter.navigateToSummaryPage($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performFeesLookup$lambda-24  reason: not valid java name */
    public static final void m40155performFeesLookup$lambda24(AirtimeAndDataPresenter airtimeAndDataPresenter, Throwable th) {
        Log_OC.getArray(airtimeAndDataPresenter, "this$0");
        th.printStackTrace();
        Debug $r2 = Debug.debug;
        airtimeAndDataPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performFeesLookup$lambda-24$lambda-23  reason: not valid java name */
    public static final void m40156performFeesLookup$lambda24$lambda23(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "view");
        airtimeAndDataView.hideLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-1  reason: not valid java name */
    public static final void m40157start$lambda1(AirtimeAndDataPresenter airtimeAndDataPresenter, final User user) {
        Log_OC.getArray(airtimeAndDataPresenter, "this$0");
        airtimeAndDataPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.airtime_data.presenter.ViewTarget
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                User $r1 = User.this;
                AirtimeAndDataView $r3 = (AirtimeAndDataView) obj;
                AirtimeAndDataPresenter.m40158start$lambda1$lambda0($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40158start$lambda1$lambda0(User user, AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "view");
        AirtimeView $r3 = (AirtimeView) airtimeAndDataView;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.setPhoneNumber($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-2  reason: not valid java name */
    public static final void m40159start$lambda2(Throwable th) {
        Object[] $r1 = new Object[0];
        Timber.m1627e("No Phone number found", $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean validateAmount(int i, double d) {
        if (i >= 50) {
            String $r1 = String.valueOf(i);
            boolean $z0 = StringExtKt.isValidAmountOfMoney($r1);
            if ($z0) {
                boolean $z02 = d == 0.0d;
                if ($z02) {
                    return true;
                }
                double $d1 = i;
                if ($d1 > d) {
                    C0390b $r2 = C0390b.f908c;
                    ifViewAttached($r2);
                    return false;
                }
                return true;
            }
        }
        Logger $r3 = Logger.logger;
        ifViewAttached($r3);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateAmount$lambda-3  reason: not valid java name */
    public static final void m40160validateAmount$lambda3(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        airtimeAndDataView.showAmountError("Amount cannot be less than 50 NGN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateAmount$lambda-4  reason: not valid java name */
    public static final void m40161validateAmount$lambda4(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        airtimeAndDataView.showAmountError("Provide an amount less than your wallet balance");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean validateDataPurchaseFields(String str, Networks networks, Plan plan) {
        boolean $z0;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            Pattern $r4 = Pattern.NONE;
            ifViewAttached($r4);
            return false;
        }
        boolean $z02 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z02) {
            Line $r5 = Line.previous;
            ifViewAttached($r5);
            return false;
        } else if (networks == null) {
            Permission $r6 = Permission.NONE;
            ifViewAttached($r6);
            return false;
        } else if (plan == null) {
            MainActivity$21 $r7 = MainActivity$21.STATUS_COMPLETED;
            ifViewAttached($r7);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateDataPurchaseFields$lambda-10  reason: not valid java name */
    public static final void m40162validateDataPurchaseFields$lambda10(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        AirtimeView $r1 = (AirtimeView) airtimeAndDataView;
        $r1.showInvalidNetworkSelection("Please choose a network");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateDataPurchaseFields$lambda-11  reason: not valid java name */
    public static final void m40163validateDataPurchaseFields$lambda11(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        AirtimeView $r1 = (AirtimeView) airtimeAndDataView;
        $r1.showInvalidDataPlan("Please choose an option");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateDataPurchaseFields$lambda-8  reason: not valid java name */
    public static final void m40164validateDataPurchaseFields$lambda8(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        AirtimeView $r1 = (AirtimeView) airtimeAndDataView;
        $r1.showInvalidPhoneNumber("Phone number cannot be blank");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateDataPurchaseFields$lambda-9  reason: not valid java name */
    public static final void m40165validateDataPurchaseFields$lambda9(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        AirtimeView $r1 = (AirtimeView) airtimeAndDataView;
        $r1.showInvalidPhoneNumber("Please provide a valid phone number");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean validateDetails(String str, Networks networks, String str2) {
        boolean $z0;
        boolean $z02;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ClassWriter $r4 = ClassWriter.f902m;
            ifViewAttached($r4);
            return false;
        }
        boolean $z03 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z03) {
            Session $r5 = Session.inflater;
            ifViewAttached($r5);
            return false;
        } else if (networks != null) {
            $z02 = C13276s.m5440u(str2);
            return !$z02;
        } else {
            Channel $r6 = Channel.f901LS;
            ifViewAttached($r6);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateDetails$lambda-5  reason: not valid java name */
    public static final void m40166validateDetails$lambda5(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        AirtimeView $r1 = (AirtimeView) airtimeAndDataView;
        $r1.showInvalidPhoneNumber("Phone number cannot be blank");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateDetails$lambda-6  reason: not valid java name */
    public static final void m40167validateDetails$lambda6(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        AirtimeView $r1 = (AirtimeView) airtimeAndDataView;
        $r1.showInvalidPhoneNumber("Please provide a valid phone number");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateDetails$lambda-7  reason: not valid java name */
    public static final void m40168validateDetails$lambda7(AirtimeAndDataView airtimeAndDataView) {
        Log_OC.getArray(airtimeAndDataView, "it");
        AirtimeView $r1 = (AirtimeView) airtimeAndDataView;
        $r1.showInvalidNetworkSelection("Please choose a network");
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
    public final void editPurchaseDetailsPage(ProductPurchase productPurchase, boolean z) {
        Log_OC.getArray(productPurchase, "payload");
        ProductNavigator $r2 = this.navigator;
        $r2.navigateToAirtimeAndDataFragment(productPurchase);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchAirtimeNetworks() {
        BillerRepository $r2 = this.billerRepository;
        AbstractC11696w $r3 = $r2.fetchAirtimeAndDataNetwork();
        Object object = new Object() { // from class: ai.kudi.agent.product.airtime_data.presenter.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AirtimeAndDataPresenter $r1 = AirtimeAndDataPresenter.this;
                List $r32 = (List) obj;
                AirtimeAndDataPresenter.m40143fetchAirtimeNetworks$lambda14($r1, $r32);
            }
        };
        Token $r1 = Token.BOOL;
        FavoritesArrayAdapter $r5 = $r3.s(object, $r1);
        Log_OC.loadImage($r5, "billerRepository.fetchAirtimeAndDataNetwork()\n            .subscribe({ billers ->\n                ifViewAttached { view ->\n                    (view as AirtimeView).showNetworks(\n                        billers.map {\n                            Networks(\n                                it.name,\n                                it.lookupId,\n                                it.image\n                            )\n                        })\n                }\n                fetchWalletBalance()\n            }, { it.printStackTrace() }\n            )");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchDataPlan(Networks networks) {
        Log_OC.getArray(networks, "network");
        BillerRepository $r3 = this.billerRepository;
        String $r4 = networks.getProductId();
        AbstractC11696w $r5 = $r3.fetchProductsByBillerId($r4);
        Object object = new Object() { // from class: ai.kudi.agent.product.airtime_data.presenter.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AirtimeAndDataPresenter $r1 = AirtimeAndDataPresenter.this;
                List $r32 = (List) obj;
                AirtimeAndDataPresenter.m40146fetchDataPlan$lambda18($r1, $r32);
            }
        };
        Chunk $r1 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r7 = $r5.s(object, $r1);
        Log_OC.loadImage($r7, "billerRepository.fetchProductsByBillerId(network.productId)\n            .subscribe({ products ->\n                ifViewAttached { view ->\n                    (view as AirtimeView).showPlans(\n                        products.map {\n                            Plan(\n                                it.name,\n                                it.amount\n                                    ?: 0,\n                                it.id\n                            )\n                        })\n                }\n                fetchWalletBalance()\n            },\n                { it.printStackTrace() }\n            )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToEnterAmount(String str, Networks networks, String str2, double d) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "purchaseTypes");
        boolean $z0 = validateDetails(str, networks, str2);
        if ($z0) {
            AirtimePurchase $r4 = new AirtimePurchase(networks, 0, str, null, null, null, d, 58, null);
            ProductNavigator $r5 = this.navigator;
            $r5.navigateToAirtimeAmountFragment($r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSummaryPage(String str, Networks networks, Plan plan, double d) {
        Log_OC.getArray(str, "phoneNumber");
        boolean $z0 = validateDataPurchaseFields(str, networks, plan);
        if ($z0) {
            Log_OC.append(plan);
            DataPurchase $r4 = new DataPurchase(networks, str, null, null, plan, d, 12, null);
            String $r1 = Log_OC.m10359a("Data Request ", $r4);
            Object[] $r5 = new Object[0];
            Timber.m1627e($r1, $r5);
            performFeesLookup($r4, d);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performFeesLookup(final ProductPurchase productPurchase, double d) {
        Log_OC.getArray(productPurchase, TransactionRequest.TYPE_REQUEST);
        int $i0 = productPurchase.getRequestAmount();
        boolean $z0 = validateAmount($i0, d);
        if ($z0) {
            C0391c $r2 = C0391c.f909d;
            ifViewAttached($r2);
            PerformServiceFeeLookup $r3 = this.feesLookup;
            String $r5 = productPurchase.getRequestType();
            String $r6 = productPurchase.getProductId();
            Log_OC.append($r6);
            FeesLookupRequest $r4 = new FeesLookupRequest($r5, null, $r6, 2, null);
            AbstractC11688p $r7 = $r3.execute($r4);
            FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.product.airtime_data.presenter.Label
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    AirtimeAndDataPresenter $r1 = AirtimeAndDataPresenter.this;
                    ProductPurchase $r22 = productPurchase;
                    FeesLookupResponse $r42 = (FeesLookupResponse) obj;
                    AirtimeAndDataPresenter.m40153performFeesLookup$lambda22($r1, $r22, $r42);
                }
            }, new Object() { // from class: ai.kudi.agent.product.airtime_data.presenter.Tools$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    AirtimeAndDataPresenter $r1 = AirtimeAndDataPresenter.this;
                    Throwable $r32 = (Throwable) obj;
                    AirtimeAndDataPresenter.m40155performFeesLookup$lambda24($r1, $r32);
                }
            });
            Log_OC.loadImage($r10, "feesLookup.execute(\n                FeesLookupRequest(\n                    product = request.getRequestType(),\n                    productId = request.getProductId()!!\n                )\n            )\n                .subscribe(\n                    {\n                        logEventOnLookup(\n                            request.getRequestType(),\n                            \"${request.getRequestAmount()}\",\n                            request.getProductId()!!,\n                            it.serviceFee\n                        )\n\n                        ifViewAttached { view ->\n                            view.hideLoader()\n                            isConfirmation = true\n                            val updatedRequest = request.setRequestServiceFee(\n                                serviceFee = it.serviceFee\n                            )\n                            Timber.e(\"Request $updatedRequest\")\n                            navigateToSummaryPage(updatedRequest)\n                            // view.showServiceFee(it.serviceFee)\n                        }\n                    },\n                    {\n                        it.printStackTrace()\n                        ifViewAttached { view ->\n                            view.hideLoader()\n                            /* view.showLookupFailed(\n                                 \"An error occurred while fetching fees. Try again\")*/\n                        }\n                    }\n                )");
            C11280b $r11 = this.compositeDisposable;
            RxExtKt.addTo($r10, $r11);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start() {
        FetchCurrentUser $r1 = this.fetchUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.product.airtime_data.presenter.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AirtimeAndDataPresenter $r12 = AirtimeAndDataPresenter.this;
                User $r3 = (User) obj;
                AirtimeAndDataPresenter.m40157start$lambda1($r12, $r3);
            }
        };
        Log $r4 = Log.logger;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchUser.execute().subscribe(\n            { ifViewAttached { view -> (view as AirtimeView).setPhoneNumber(it.phoneNumber) } },\n            { Timber.e(\"No Phone number found\") })");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
    }
}
