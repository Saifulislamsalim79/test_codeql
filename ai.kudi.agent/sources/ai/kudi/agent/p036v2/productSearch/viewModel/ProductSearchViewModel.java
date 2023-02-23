package ai.kudi.agent.p036v2.productSearch.viewModel;

import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse;
import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductsApiParams;
import ai.kudi.agent.p036v2.productList.domain.usecases.FetchProductListUseCase;
import ai.kudi.agent.p036v2.productSearch.viewData.ProductSearchViewData;
import androidx.lifecycle.Extension;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: ProductSearchViewModel.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u00020\u000fH\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/viewModel/ProductSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchProducts", "Lai/kudi/agent/v2/productList/domain/usecases/FetchProductListUseCase;", "(Lai/kudi/agent/v2/productList/domain/usecases/FetchProductListUseCase;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "productListViewData", "Lio/reactivex/subjects/PublishSubject;", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData;", "getProductListViewData", "()Lio/reactivex/subjects/PublishSubject;", "setProductListViewData", "(Lio/reactivex/subjects/PublishSubject;)V", "fetchAllProducts", "", "searchText", "", "page", "", "reset", "", "initializeViewData", "onCleared", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productSearch.viewModel.ProductSearchViewModel */
/* loaded from: classes.dex */
public final class ProductSearchViewModel extends Extension {
    private FavoritesArrayAdapter disposable;
    private final FetchProductListUseCase fetchProducts;
    private C11680b<ProductSearchViewData> productListViewData;

    public ProductSearchViewModel(FetchProductListUseCase fetchProductListUseCase) {
        Log_OC.getArray(fetchProductListUseCase, "fetchProducts");
        this.fetchProducts = fetchProductListUseCase;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void fetchAllProducts$default(ProductSearchViewModel productSearchViewModel, String str, int $i0, boolean z, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $i0 = 0;
        }
        productSearchViewModel.fetchAllProducts(str, $i0, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAllProducts$lambda-0  reason: not valid java name */
    public static final void m41687fetchAllProducts$lambda0(ProductSearchViewModel productSearchViewModel, String str, MarketplaceProductResponse marketplaceProductResponse) {
        C11680b $r4;
        Log_OC.getArray(productSearchViewModel, "this$0");
        Log_OC.getArray(str, "$searchText");
        List $r3 = marketplaceProductResponse.getMarketplaceProductList();
        if ($r3 != null) {
            List $r32 = marketplaceProductResponse.getMarketplaceProductList();
            boolean $z0 = $r32.isEmpty();
            if (!$z0) {
                C11680b $r42 = productSearchViewModel.getProductListViewData();
                if ($r42 != null) {
                    List $r33 = marketplaceProductResponse.getMarketplaceProductList();
                    ProductSearchViewData.ProductList $r5 = new ProductSearchViewData.ProductList($r33);
                    $r42.mo331f($r5);
                }
            } else {
                C11680b $r43 = productSearchViewModel.getProductListViewData();
                if ($r43 != null) {
                    ProductSearchViewData.Error $r6 = new ProductSearchViewData.Error("search result not found", false);
                    $r43.mo331f($r6);
                }
            }
        }
        String $r7 = marketplaceProductResponse.getResponseMessage();
        if ($r7 != null && ($r4 = productSearchViewModel.getProductListViewData()) != null) {
            String $r72 = marketplaceProductResponse == null ? null : marketplaceProductResponse.getResponseMessage();
            ProductSearchViewData.Error $r62 = new ProductSearchViewData.Error($r72, true);
            $r4.mo331f($r62);
        }
        C11680b $r44 = productSearchViewModel.getProductListViewData();
        if ($r44 != null) {
            ProductSearchViewData.Loading $r8 = new ProductSearchViewData.Loading(false);
            $r44.mo331f($r8);
        }
        C11680b $r45 = productSearchViewModel.getProductListViewData();
        if ($r45 == null) {
            return;
        }
        ProductSearchViewData.SearchEntry $r9 = new ProductSearchViewData.SearchEntry(str);
        $r45.mo331f($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchAllProducts$lambda-1  reason: not valid java name */
    public static final void m41688fetchAllProducts$lambda1(ProductSearchViewModel productSearchViewModel, Throwable th) {
        Log_OC.getArray(productSearchViewModel, "this$0");
        C11680b $r3 = productSearchViewModel.getProductListViewData();
        if ($r3 != null) {
            String $r4 = th == null ? null : th.getLocalizedMessage();
            ProductSearchViewData.Error $r0 = new ProductSearchViewData.Error(String.valueOf($r4), true);
            $r3.mo331f($r0);
        }
        C11680b $r32 = productSearchViewModel.getProductListViewData();
        if ($r32 == null) {
            return;
        }
        ProductSearchViewData.Loading $r5 = new ProductSearchViewData.Loading(false);
        $r32.mo331f($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchAllProducts(final String str, int i, boolean z) {
        CharSequence $r8;
        C11680b $r2;
        List $r4;
        Log_OC.getArray(str, "searchText");
        if (z && ($r2 = this.productListViewData) != null) {
            $r4 = C13726r.m3891e();
            ProductSearchViewData.ProductList $r3 = new ProductSearchViewData.ProductList($r4);
            $r2.mo331f($r3);
        }
        C11680b $r22 = this.productListViewData;
        if ($r22 != null) {
            ProductSearchViewData.Loading $r5 = new ProductSearchViewData.Loading(true);
            $r22.mo331f($r5);
        }
        FetchProductListUseCase $r6 = this.fetchProducts;
        $r8 = C13277t.m5414M0(str);
        String $r9 = $r8.toString();
        MarketplaceProductsApiParams $r7 = new MarketplaceProductsApiParams(false, $r9, null, null, null, null, null, null, null, null, 1021, null);
        AbstractC11688p $r10 = $r6.execute(i, $r7);
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.v2.productSearch.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductSearchViewModel $r1 = ProductSearchViewModel.this;
                String $r23 = str;
                MarketplaceProductResponse $r42 = (MarketplaceProductResponse) obj;
                ProductSearchViewModel.m41687fetchAllProducts$lambda0($r1, $r23, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productSearch.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductSearchViewModel $r1 = ProductSearchViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductSearchViewModel.m41688fetchAllProducts$lambda1($r1, $r32);
            }
        });
        this.disposable = $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getProductListViewData() {
        C11680b r1 = this.productListViewData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void initializeViewData() {
        C11680b $r1 = C11680b.m10564v0();
        this.productListViewData = $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.lifecycle.Extension
    public void onCleared() {
        super.onCleared();
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    public final void setProductListViewData(C11680b c11680b) {
        this.productListViewData = c11680b;
    }
}
