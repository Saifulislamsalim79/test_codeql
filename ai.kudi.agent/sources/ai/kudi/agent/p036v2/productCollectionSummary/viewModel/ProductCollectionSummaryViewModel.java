package ai.kudi.agent.p036v2.productCollectionSummary.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p036v2.common.domain.package_3.CollectionTransactionPaymentResponse;
import ai.kudi.agent.p036v2.common.domain.package_3.TransactionRequestBody;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productCollectionSummary.useCases.CollectionTransactionUseCase;
import ai.kudi.agent.p036v2.productCollectionSummary.viewData.ProductCollectionSummaryViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: ProductCollectionSummaryViewModel.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0016J2\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0011J\u001a\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/v2/productCollectionSummary/viewModel/ProductCollectionSummaryViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/productCollectionSummary/viewData/ProductCollectionSummaryViewData;", "collectionTransactionUseCase", "Lai/kudi/agent/v2/productCollectionSummary/useCases/CollectionTransactionUseCase;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/v2/productCollectionSummary/useCases/CollectionTransactionUseCase;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "mapOfFileProperties", "", "", "totalLookupDetails", "", "", "enterPinInitiated", "", "initialData", "makeCollectionTransaction", "longitude", "", "latitude", "propertiesMap", "productCode", "makePaymentInitiated", "setProductSummary", "productSummary", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.viewModel.ProductCollectionSummaryViewModel */
/* loaded from: classes.dex */
public final class ProductCollectionSummaryViewModel extends BaseViewModel<ProductCollectionSummaryViewData> {
    private final Analytics analytics;
    private final CollectionTransactionUseCase collectionTransactionUseCase;
    private final FetchCurrentUser fetchCurrentUser;
    private Map<String, String> mapOfFileProperties;
    private Map<String, Object> totalLookupDetails;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductCollectionSummaryViewModel(CollectionTransactionUseCase collectionTransactionUseCase, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Map $r3;
        Log_OC.getArray(collectionTransactionUseCase, "collectionTransactionUseCase");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.collectionTransactionUseCase = collectionTransactionUseCase;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        LinkedHashMap $r5 = new LinkedHashMap();
        this.totalLookupDetails = $r5;
        $r3 = C13727r0.m3881k();
        this.mapOfFileProperties = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void enterPinInitiated() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.v2.productCollectionSummary.viewModel.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductCollectionSummaryViewModel $r12 = ProductCollectionSummaryViewModel.this;
                User $r3 = (User) obj;
                ProductCollectionSummaryViewModel.m41582enterPinInitiated$lambda2($r12, $r3);
            }
        };
        Function $r4 = Function.SUBTOTAL;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.enterPinInitiated(it.phoneNumber, true)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: enterPinInitiated$lambda-2  reason: not valid java name */
    public static final void m41582enterPinInitiated$lambda2(ProductCollectionSummaryViewModel productCollectionSummaryViewModel, User user) {
        Log_OC.getArray(productCollectionSummaryViewModel, "this$0");
        Analytics $r3 = productCollectionSummaryViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.enterPinInitiated($r0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: makeCollectionTransaction$lambda-4  reason: not valid java name */
    public static final InterfaceC11692s m41584makeCollectionTransaction$lambda4(ProductCollectionSummaryViewModel productCollectionSummaryViewModel, double d, double d2, String str, User user) {
        Log_OC.getArray(productCollectionSummaryViewModel, "this$0");
        Log_OC.getArray(str, "$productCode");
        Log_OC.getArray(user, "it");
        CollectionTransactionUseCase $r5 = productCollectionSummaryViewModel.collectionTransactionUseCase;
        String $r6 = user.getId();
        Log_OC.loadImage($r6, "it.id");
        Map $r3 = productCollectionSummaryViewModel.totalLookupDetails;
        TransactionRequestBody $r4 = new TransactionRequestBody($r6, d, d2, str, $r3);
        AbstractC11688p $r7 = $r5.execute($r4);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: makeCollectionTransaction$lambda-5  reason: not valid java name */
    public static final void m41585makeCollectionTransaction$lambda5(ProductCollectionSummaryViewModel productCollectionSummaryViewModel, CollectionTransactionPaymentResponse collectionTransactionPaymentResponse) {
        Log_OC.getArray(productCollectionSummaryViewModel, "this$0");
        ViewData $r2 = productCollectionSummaryViewModel.getState();
        ProductCollectionSummaryViewData $r3 = (ProductCollectionSummaryViewData) $r2;
        String $r4 = collectionTransactionPaymentResponse == null ? null : collectionTransactionPaymentResponse.getResponseBody();
        Log_OC.append($r4);
        productCollectionSummaryViewModel.publish(ProductCollectionSummaryViewData.copy$default($r3, false, false, null, null, $r4, null, 46, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: makeCollectionTransaction$lambda-6  reason: not valid java name */
    public static final void m41586makeCollectionTransaction$lambda6(ProductCollectionSummaryViewModel productCollectionSummaryViewModel, Throwable th) {
        Log_OC.getArray(productCollectionSummaryViewModel, "this$0");
        ViewData $r3 = productCollectionSummaryViewModel.getState();
        ProductCollectionSummaryViewData $r4 = (ProductCollectionSummaryViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error making payment, try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r1 = new Error((String) $r6, false, 2, null);
        productCollectionSummaryViewModel.publish(ProductCollectionSummaryViewData.copy$default($r4, false, false, null, null, null, $r1, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: makePaymentInitiated$lambda-0  reason: not valid java name */
    public static final void m41587makePaymentInitiated$lambda0(ProductCollectionSummaryViewModel productCollectionSummaryViewModel, User user) {
        Log_OC.getArray(productCollectionSummaryViewModel, "this$0");
        Analytics $r3 = productCollectionSummaryViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.makePaymentInitiated($r0, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ProductCollectionSummaryViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ProductCollectionSummaryViewData initialData() {
        ProductCollectionSummaryViewData $r1 = new ProductCollectionSummaryViewData(false, false, null, null, null, null, 63, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void makeCollectionTransaction(final double d, final double d2, Map map, final String str) {
        Log_OC.getArray(map, "propertiesMap");
        Log_OC.getArray(str, "productCode");
        Map $r3 = this.mapOfFileProperties;
        boolean $z0 = $r3.isEmpty();
        if (!$z0) {
            Map $r32 = this.totalLookupDetails;
            Map $r4 = this.mapOfFileProperties;
            $r32.putAll($r4);
        }
        Map $r33 = this.totalLookupDetails;
        $r33.putAll(map);
        enterPinInitiated();
        ViewData $r5 = getState();
        ProductCollectionSummaryViewData $r6 = ProductCollectionSummaryViewData.copy$default((ProductCollectionSummaryViewData) $r5, true, false, null, null, null, null, 30, null);
        publish($r6);
        FetchCurrentUser $r7 = this.fetchCurrentUser;
        AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
        AbstractC11688p $r10 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.v2.productCollectionSummary.viewModel.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ProductCollectionSummaryViewModel $r1 = ProductCollectionSummaryViewModel.this;
                double $d0 = d2;
                double $d1 = d;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r34 = ProductCollectionSummaryViewModel.m41584makeCollectionTransaction$lambda4($r1, $d0, $d1, $r2, $r52);
                return $r34;
            }
        });
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.v2.productCollectionSummary.viewModel.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductCollectionSummaryViewModel $r1 = ProductCollectionSummaryViewModel.this;
                CollectionTransactionPaymentResponse $r34 = (CollectionTransactionPaymentResponse) obj;
                ProductCollectionSummaryViewModel.m41585makeCollectionTransaction$lambda5($r1, $r34);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productCollectionSummary.viewModel.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductCollectionSummaryViewModel $r1 = ProductCollectionSummaryViewModel.this;
                Throwable $r34 = (Throwable) obj;
                ProductCollectionSummaryViewModel.m41586makeCollectionTransaction$lambda6($r1, $r34);
            }
        });
        Log_OC.loadImage($r13, "fetchCurrentUser.execute().flatMapObservable {\n            collectionTransactionUseCase.execute(\n                TransactionRequestBody(\n                    it.id,\n                    latitude,\n                    longitude,\n                    productCode,\n                    totalLookupDetails\n                )\n            )\n        }.subscribe(\n            {\n                publish(\n                    state.copy(\n                        loading = false,\n                        responseStatusCode = it?.responseBody!!\n                    )\n                )\n            },\n            {\n                publish(\n                    state.copy(\n                        loading = false, error = Error(\n                            genericError =\n                            parseHttpError2(\"Error making payment, try again\")(it)\n                        )\n                    )\n                )\n            }\n        )");
        C11280b $r14 = getCompositeDisposable();
        RxExtKt.addTo($r13, $r14);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void makePaymentInitiated() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.v2.productCollectionSummary.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductCollectionSummaryViewModel $r12 = ProductCollectionSummaryViewModel.this;
                User $r3 = (User) obj;
                ProductCollectionSummaryViewModel.m41587makePaymentInitiated$lambda0($r12, $r3);
            }
        };
        Token $r4 = Token.FUNCTION;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.makePaymentInitiated(it.phoneNumber, true)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setProductSummary(Map map) {
        Log_OC.getArray(map, "productSummary");
        ViewData $r2 = getState();
        ProductCollectionSummaryViewData $r3 = (ProductCollectionSummaryViewData) $r2;
        publish(ProductCollectionSummaryViewData.copy$default($r3, false, false, map, null, null, null, 59, null));
    }
}
