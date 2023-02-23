package ai.kudi.agent.p036v2.productDetails.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p036v2.common.archives.PlanAmountProperty;
import ai.kudi.agent.p036v2.common.domain.package_3.ProductFieldResponse;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productDetails.domain.usecases.ProductFieldsUseCase;
import ai.kudi.agent.p036v2.productDetails.viewData.ProductDetailsLiveData;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: ProductDetailsViewModel.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/viewModel/ProductDetailsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/productDetails/viewData/ProductDetailsLiveData;", "fetchProductFields", "Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "enableButton", "", "planAmountProperty", "Lai/kudi/agent/v2/common/dto/PlanAmountProperty;", "getProductFields", "productId", "", "initialData", "marketplaceProductDetails", TransactionField.STATUS, "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.viewModel.ProductDetailsViewModel */
/* loaded from: classes.dex */
public final class ProductDetailsViewModel extends BaseViewModel<ProductDetailsLiveData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final ProductFieldsUseCase fetchProductFields;

    public ProductDetailsViewModel(ProductFieldsUseCase productFieldsUseCase, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(productFieldsUseCase, "fetchProductFields");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.fetchProductFields = productFieldsUseCase;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void enableButton$default(ProductDetailsViewModel productDetailsViewModel, PlanAmountProperty $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        productDetailsViewModel.enableButton($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProductFields$lambda-0  reason: not valid java name */
    public static final void m41623getProductFields$lambda0(ProductDetailsViewModel productDetailsViewModel, ProductFieldResponse productFieldResponse) {
        Log_OC.getArray(productDetailsViewModel, "this$0");
        ProductField $r2 = productFieldResponse == null ? null : productFieldResponse.getProductField();
        if ($r2 != null) {
            ViewData $r3 = productDetailsViewModel.getState();
            ProductDetailsLiveData $r4 = (ProductDetailsLiveData) $r3;
            ProductField $r22 = productFieldResponse.getProductField();
            productDetailsViewModel.publish(ProductDetailsLiveData.copy$default($r4, false, $r22, false, null, false, 25, null));
        }
        String $r5 = productFieldResponse == null ? null : productFieldResponse.getResponseMessage();
        if ($r5 != null) {
            String $r52 = productFieldResponse.getResponseMessage();
            Error $r6 = new Error($r52, false, 2, null);
            ViewData $r32 = productDetailsViewModel.getState();
            ProductDetailsLiveData $r42 = (ProductDetailsLiveData) $r32;
            productDetailsViewModel.publish(ProductDetailsLiveData.copy$default($r42, false, null, false, $r6, false, 19, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProductFields$lambda-1  reason: not valid java name */
    public static final void m41624getProductFields$lambda1(ProductDetailsViewModel productDetailsViewModel, Throwable th) {
        Log_OC.getArray(productDetailsViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error loading product fields", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r1 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = productDetailsViewModel.getState();
        ProductDetailsLiveData $r7 = ProductDetailsLiveData.copy$default((ProductDetailsLiveData) $r6, false, null, false, $r1, false, 19, null);
        productDetailsViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: marketplaceProductDetails$lambda-3  reason: not valid java name */
    public static final void m41625marketplaceProductDetails$lambda3(ProductDetailsViewModel productDetailsViewModel, boolean z, User user) {
        Log_OC.getArray(productDetailsViewModel, "this$0");
        Analytics $r3 = productDetailsViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.marketPlaceProductClicked($r0, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void enableButton(PlanAmountProperty planAmountProperty) {
        ViewData $r2 = getState();
        ProductDetailsLiveData $r3 = (ProductDetailsLiveData) $r2;
        boolean $z0 = planAmountProperty != null;
        publish(ProductDetailsLiveData.copy$default($r3, false, null, false, null, $z0, 15, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getProductFields(String str) {
        Log_OC.getArray(str, "productId");
        ViewData $r2 = getState();
        ProductDetailsLiveData $r3 = (ProductDetailsLiveData) $r2;
        publish(ProductDetailsLiveData.copy$default($r3, false, null, true, null, false, 27, null));
        ProductFieldsUseCase $r4 = this.fetchProductFields;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r6 = $r5 == null ? null : $r5.e0(new Object() { // from class: ai.kudi.agent.v2.productDetails.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductDetailsViewModel $r1 = ProductDetailsViewModel.this;
                ProductFieldResponse $r32 = (ProductFieldResponse) obj;
                ProductDetailsViewModel.m41623getProductFields$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productDetails.viewModel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductDetailsViewModel $r1 = ProductDetailsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductDetailsViewModel.m41624getProductFields$lambda1($r1, $r32);
            }
        });
        if ($r6 == null) {
            return;
        }
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ProductDetailsLiveData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ProductDetailsLiveData initialData() {
        ProductDetailsLiveData $r1 = new ProductDetailsLiveData(false, null, false, null, false, 31, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void marketplaceProductDetails(final boolean z) {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.v2.productDetails.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductDetailsViewModel $r12 = ProductDetailsViewModel.this;
                boolean $z0 = z;
                User $r3 = (User) obj;
                ProductDetailsViewModel.m41625marketplaceProductDetails$lambda3($r12, $z0, $r3);
            }
        };
        Token $r4 = Token.FUNCTION;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.marketPlaceProductClicked(it.phoneNumber, status)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }
}
