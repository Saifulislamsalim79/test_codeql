package ai.kudi.agent.p036v2.productList.viewModel;

import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse;
import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductsApiParams;
import ai.kudi.agent.p036v2.common.domain.usecases.ProductBusinessSectorUseCase;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productList.domain.usecases.FetchProductListUseCase;
import ai.kudi.agent.p036v2.productList.viewData.ProductListViewData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: ProductListViewModel.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0006\u0010\u0010\u001a\u00020\tJ.\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/v2/productList/viewModel/ProductListViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/productList/viewData/ProductListViewData;", "productBusinessSectorUseCase", "Lai/kudi/agent/v2/common/domain/usecases/ProductBusinessSectorUseCase;", "productListUseCase", "Lai/kudi/agent/v2/productList/domain/usecases/FetchProductListUseCase;", "(Lai/kudi/agent/v2/common/domain/usecases/ProductBusinessSectorUseCase;Lai/kudi/agent/v2/productList/domain/usecases/FetchProductListUseCase;)V", "fetchMarketPlaceProductList", "", "reset", "", "businessCategoryId", "", "page", "clearList", "fetchProductBusinessSector", "getMarketplaceProductsById", "id", "initialData", "setProductSectorParams", "businessCategoryName", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productList.viewModel.ProductListViewModel */
/* loaded from: classes.dex */
public final class ProductListViewModel extends BaseViewModel<ProductListViewData> {
    private final ProductBusinessSectorUseCase productBusinessSectorUseCase;
    private final FetchProductListUseCase productListUseCase;

    public ProductListViewModel(ProductBusinessSectorUseCase productBusinessSectorUseCase, FetchProductListUseCase fetchProductListUseCase) {
        Log_OC.getArray(productBusinessSectorUseCase, "productBusinessSectorUseCase");
        Log_OC.getArray(fetchProductListUseCase, "productListUseCase");
        this.productBusinessSectorUseCase = productBusinessSectorUseCase;
        this.productListUseCase = fetchProductListUseCase;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchMarketPlaceProductList(boolean z, final int i, int i2, boolean z2) {
        List $r1;
        if (z2) {
            $r1 = C13726r.m3891e();
            ViewData $r2 = getState();
            ProductListViewData $r3 = ProductListViewData.copy$default((ProductListViewData) $r2, false, true, null, false, null, $r1, false, null, null, 473, null);
            publish($r3);
        } else {
            ViewData $r22 = getState();
            ProductListViewData $r32 = (ProductListViewData) $r22;
            publish(ProductListViewData.copy$default($r32, false, true, null, false, null, null, false, null, null, 505, null));
        }
        if (i2 == -1) {
            return;
        }
        FetchProductListUseCase $r4 = this.productListUseCase;
        Integer $r6 = Integer.valueOf(i);
        MarketplaceProductsApiParams $r5 = new MarketplaceProductsApiParams(z, null, $r6, null, null, null, null, null, null, null, 1018, null);
        AbstractC11688p $r7 = $r4.execute(i2, $r5);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.v2.productList.viewModel.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductListViewModel $r12 = ProductListViewModel.this;
                int $i0 = i;
                MarketplaceProductResponse $r33 = (MarketplaceProductResponse) obj;
                ProductListViewModel.m41653fetchMarketPlaceProductList$lambda0($r12, $i0, $r33);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productList.viewModel.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductListViewModel $r12 = ProductListViewModel.this;
                Throwable $r33 = (Throwable) obj;
                ProductListViewModel.m41654fetchMarketPlaceProductList$lambda1($r12, $r33);
            }
        });
        C11280b $r11 = getCompositeDisposable();
        $r11.b($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMarketPlaceProductList$lambda-0 */
    public static final void m41653fetchMarketPlaceProductList$lambda0(ProductListViewModel productListViewModel, int i, MarketplaceProductResponse marketplaceProductResponse) {
        List $r2;
        List $r22;
        Log_OC.getArray(productListViewModel, "this$0");
        List $r23 = marketplaceProductResponse.getMarketplaceProductList();
        if ($r23 != null) {
            List $r24 = marketplaceProductResponse.getMarketplaceProductList();
            boolean $z1 = $r24.isEmpty();
            if (!$z1) {
                ViewData $r3 = productListViewModel.getState();
                List $r25 = marketplaceProductResponse.getMarketplaceProductList();
                Integer $r5 = Integer.valueOf(i);
                ProductListViewData $r4 = ProductListViewData.copy$default((ProductListViewData) $r3, false, false, null, false, null, $r25, false, $r5, null, 349, null);
                productListViewModel.publish($r4);
            } else {
                ViewData $r32 = productListViewModel.getState();
                ProductListViewData $r42 = (ProductListViewData) $r32;
                Error $r6 = new Error("There is nothing to see here", false);
                Integer $r52 = Integer.valueOf(i);
                productListViewModel.publish(ProductListViewData.copy$default($r42, false, false, $r6, false, null, null, false, $r52, null, 377, null));
            }
        }
        String $r7 = marketplaceProductResponse.getResponseMessage();
        if ($r7 != null) {
            String $r72 = marketplaceProductResponse.getResponseMessage();
            int $i1 = $r72.length();
            boolean $z0 = $i1 > 0;
            if (!$z0) {
                $r2 = C13726r.m3891e();
                Error $r62 = new Error("Error Fetching products, try again", false, 2, null);
                ViewData $r33 = productListViewModel.getState();
                ProductListViewData $r43 = (ProductListViewData) $r33;
                Integer $r53 = Integer.valueOf(i);
                productListViewModel.publish(ProductListViewData.copy$default($r43, false, false, $r62, false, null, $r2, false, $r53, null, 345, null));
                return;
            }
            $r22 = C13726r.m3891e();
            String $r73 = marketplaceProductResponse.getResponseMessage();
            Error $r63 = new Error($r73, false, 2, null);
            ViewData $r34 = productListViewModel.getState();
            ProductListViewData $r44 = (ProductListViewData) $r34;
            Integer $r54 = Integer.valueOf(i);
            productListViewModel.publish(ProductListViewData.copy$default($r44, false, false, $r63, false, null, $r22, false, $r54, null, 345, null));
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMarketPlaceProductList$lambda-1 */
    public static final void m41654fetchMarketPlaceProductList$lambda1(ProductListViewModel productListViewModel, Throwable th) {
        Log_OC.getArray(productListViewModel, "this$0");
        ViewData $r3 = productListViewModel.getState();
        ProductListViewData $r4 = (ProductListViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading product Lists", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r1 = new Error((String) $r6, false, 2, null);
        productListViewModel.publish(ProductListViewData.copy$default($r4, false, false, $r1, false, null, null, false, null, null, 505, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* renamed from: fetchProductBusinessSector$lambda-2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m41655fetchProductBusinessSector$lambda2(java.util.ArrayList r28, ai.kudi.agent.p036v2.productList.viewModel.ProductListViewModel r29, java.util.List r30) {
        /*
            java.lang.String r12 = "$businessCategory"
            r0 = r28
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r12)
            java.lang.String r12 = "this$0"
            r0 = r29
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r12)
            if (r30 == 0) goto L1b
            r0 = r30
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L19
            goto L1b
        L19:
            r13 = 0
            goto L1c
        L1b:
            r13 = 1
        L1c:
            if (r13 != 0) goto L66
            r0 = r28
            r1 = r30
            r0.addAll(r1)
            r0 = r29
            ai.kudi.agent.core.mvvm.ViewData r14 = r0.getState()
            r16 = r14
            ai.kudi.agent.v2.productList.viewData.ProductListViewData r16 = (ai.kudi.agent.p036v2.productList.viewData.ProductListViewData) r16
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 494(0x1ee, float:6.92E-43)
            r26 = 0
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r28
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            ai.kudi.agent.v2.productList.viewData.ProductListViewData r15 = ai.kudi.agent.p036v2.productList.viewData.ProductListViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r29
            r0.publish(r15)
            return
        L66:
            r0 = r29
            ai.kudi.agent.core.mvvm.ViewData r14 = r0.getState()
            r27 = r14
            ai.kudi.agent.v2.productList.viewData.ProductListViewData r27 = (ai.kudi.agent.p036v2.productList.viewData.ProductListViewData) r27
            r15 = r27
            java.util.List r30 = kotlin.p557z.C13722p.m3941e()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 494(0x1ee, float:6.92E-43)
            r26 = 0
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r30
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            ai.kudi.agent.v2.productList.viewData.ProductListViewData r15 = ai.kudi.agent.p036v2.productList.viewData.ProductListViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r29
            r0.publish(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productList.viewModel.ProductListViewModel.m41655fetchProductBusinessSector$lambda2(java.util.ArrayList, ai.kudi.agent.v2.productList.viewModel.ProductListViewModel, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProductBusinessSector$lambda-3 */
    public static final void m41656fetchProductBusinessSector$lambda3(ProductListViewModel productListViewModel, Throwable th) {
        Log_OC.getArray(productListViewModel, "this$0");
        ViewData $r3 = productListViewModel.getState();
        ProductListViewData $r4 = (ProductListViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading business Categories", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r1 = new Error((String) $r6, false, 2, null);
        productListViewModel.publish(ProductListViewData.copy$default($r4, false, false, $r1, false, null, null, false, null, null, 506, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void getMarketplaceProductsById$default(ProductListViewModel productListViewModel, boolean $z0, int $i0, int $i1, boolean $z1, int i, Object obj) {
        int $i3 = i & 1;
        if ($i3 != 0) {
            $z0 = true;
        }
        int $i32 = i & 2;
        if ($i32 != 0) {
            $i0 = 0;
        }
        int $i33 = i & 4;
        if ($i33 != 0) {
            $i1 = 0;
        }
        int $i2 = i & 8;
        if ($i2 != 0) {
            $z1 = false;
        }
        productListViewModel.getMarketplaceProductsById($z0, $i0, $i1, $z1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchProductBusinessSector() {
        final ArrayList $r4;
        ProductSectorModel $r1 = new ProductSectorModel(0, "All", "All", null, false, 24, null);
        ProductSectorModel[] $r3 = {$r1};
        $r4 = C13726r.m3893c($r3);
        ViewData $r5 = getState();
        ProductListViewData $r6 = ProductListViewData.copy$default((ProductListViewData) $r5, true, false, null, false, null, null, false, null, null, 506, null);
        publish($r6);
        ProductBusinessSectorUseCase $r7 = this.productBusinessSectorUseCase;
        AbstractC11688p $r8 = $r7.execute();
        FavoritesArrayAdapter $r9 = $r8 == null ? null : $r8.e0(new Object() { // from class: ai.kudi.agent.v2.productList.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ArrayList $r12 = $r4;
                ProductListViewModel $r2 = this;
                List $r42 = (List) obj;
                ProductListViewModel.m41655fetchProductBusinessSector$lambda2($r12, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productList.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductListViewModel $r12 = ProductListViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductListViewModel.m41656fetchProductBusinessSector$lambda3($r12, $r32);
            }
        });
        if ($r9 == null) {
            return;
        }
        C11280b $r12 = getCompositeDisposable();
        $r12.b($r9);
    }

    public final void getMarketplaceProductsById(boolean z, int i, int i2, boolean z2) {
        fetchMarketPlaceProductList(z, i, i2, z2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ProductListViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ProductListViewData initialData() {
        ProductListViewData $r1 = new ProductListViewData(false, false, null, false, null, null, false, null, null, 511, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setProductSectorParams(int i, String str) {
        ViewData $r2 = getState();
        ProductListViewData $r3 = (ProductListViewData) $r2;
        Integer $r4 = Integer.valueOf(i);
        publish(ProductListViewData.copy$default($r3, false, false, null, false, null, null, false, $r4, str, 127, null));
    }
}
