package ai.kudi.agent.p036v2.productHome.viewModel;

import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p036v2.common.domain.package_3.MarketplaceProductResponse;
import ai.kudi.agent.p036v2.common.domain.usecases.ProductBusinessSectorUseCase;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceProductActivity;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productHome.useCases.MarketplaceBestCommissionUseCase;
import ai.kudi.agent.p036v2.productHome.useCases.MarketplaceTopPickUseCase;
import ai.kudi.agent.p036v2.productHome.viewData.ProductHomeViewData;
import android.content.SharedPreferences;
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
/* compiled from: ProductHomeViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0006\u0010\u0011\u001a\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/v2/productHome/viewModel/ProductHomeViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/productHome/viewData/ProductHomeViewData;", "productBusinessSectorUseCase", "Lai/kudi/agent/v2/common/domain/usecases/ProductBusinessSectorUseCase;", "marketplaceTopPick", "Lai/kudi/agent/v2/productHome/useCases/MarketplaceTopPickUseCase;", "marketplaceBestCommission", "Lai/kudi/agent/v2/productHome/useCases/MarketplaceBestCommissionUseCase;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/v2/common/domain/usecases/ProductBusinessSectorUseCase;Lai/kudi/agent/v2/productHome/useCases/MarketplaceTopPickUseCase;Lai/kudi/agent/v2/productHome/useCases/MarketplaceBestCommissionUseCase;Landroid/content/SharedPreferences;)V", "fetchBestCommissionProducts", "", "fetchMarketplaceTopPick", "fetchProductBusinessSector", "initialData", "updateIsNewFeature", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productHome.viewModel.ProductHomeViewModel */
/* loaded from: classes.dex */
public final class ProductHomeViewModel extends BaseViewModel<ProductHomeViewData> {
    private final MarketplaceBestCommissionUseCase marketplaceBestCommission;
    private final MarketplaceTopPickUseCase marketplaceTopPick;
    private final ProductBusinessSectorUseCase productBusinessSectorUseCase;
    private final SharedPreferences sharedPreferences;

    public ProductHomeViewModel(ProductBusinessSectorUseCase productBusinessSectorUseCase, MarketplaceTopPickUseCase marketplaceTopPickUseCase, MarketplaceBestCommissionUseCase marketplaceBestCommissionUseCase, SharedPreferences sharedPreferences) {
        Log_OC.getArray(productBusinessSectorUseCase, "productBusinessSectorUseCase");
        Log_OC.getArray(marketplaceTopPickUseCase, "marketplaceTopPick");
        Log_OC.getArray(marketplaceBestCommissionUseCase, "marketplaceBestCommission");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.productBusinessSectorUseCase = productBusinessSectorUseCase;
        this.marketplaceTopPick = marketplaceTopPickUseCase;
        this.marketplaceBestCommission = marketplaceBestCommissionUseCase;
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchBestCommissionProducts$lambda-5  reason: not valid java name */
    public static final void m41639fetchBestCommissionProducts$lambda5(ProductHomeViewModel productHomeViewModel, MarketplaceProductResponse marketplaceProductResponse) {
        Log_OC.getArray(productHomeViewModel, "this$0");
        List $r2 = marketplaceProductResponse.getMarketplaceProductList();
        if ($r2 != null) {
            List $r22 = marketplaceProductResponse.getMarketplaceProductList();
            boolean $z1 = $r22.isEmpty();
            if (!$z1) {
                List $r23 = marketplaceProductResponse.getMarketplaceProductList();
                ViewData $r3 = productHomeViewModel.getState();
                ProductHomeViewData $r4 = ProductHomeViewData.copy$default((ProductHomeViewData) $r3, false, false, false, null, null, null, false, null, null, $r23, 507, null);
                productHomeViewModel.publish($r4);
            } else {
                ViewData $r32 = productHomeViewModel.getState();
                ProductHomeViewData $r42 = (ProductHomeViewData) $r32;
                Error $r5 = new Error("There is nothing to see here", false);
                productHomeViewModel.publish(ProductHomeViewData.copy$default($r42, false, false, false, null, null, $r5, false, null, null, null, 987, null));
            }
        }
        String $r6 = marketplaceProductResponse.getResponseMessage();
        if ($r6 != null) {
            String $r62 = marketplaceProductResponse.getResponseMessage();
            int $i0 = $r62.length();
            boolean $z0 = $i0 > 0;
            if (!$z0) {
                ViewData $r33 = productHomeViewModel.getState();
                ProductHomeViewData $r43 = (ProductHomeViewData) $r33;
                Error $r52 = new Error("Error Fetching products, try again", false, 2, null);
                productHomeViewModel.publish(ProductHomeViewData.copy$default($r43, false, false, false, null, null, $r52, false, null, null, null, 987, null));
                return;
            }
            ViewData $r34 = productHomeViewModel.getState();
            ProductHomeViewData $r44 = (ProductHomeViewData) $r34;
            String $r63 = marketplaceProductResponse.getResponseMessage();
            Error $r53 = new Error($r63, false, 2, null);
            productHomeViewModel.publish(ProductHomeViewData.copy$default($r44, false, false, false, null, null, $r53, false, null, null, null, 987, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchBestCommissionProducts$lambda-6  reason: not valid java name */
    public static final void m41640fetchBestCommissionProducts$lambda6(ProductHomeViewModel productHomeViewModel, Throwable th) {
        Log_OC.getArray(productHomeViewModel, "this$0");
        ViewData $r3 = productHomeViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading best commissions", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r1 = new Error((String) $r6, false, 2, null);
        ProductHomeViewData $r4 = ProductHomeViewData.copy$default((ProductHomeViewData) $r3, false, false, false, null, null, $r1, false, null, null, null, 987, null);
        productHomeViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMarketplaceTopPick$lambda-3  reason: not valid java name */
    public static final void m41641fetchMarketplaceTopPick$lambda3(ProductHomeViewModel productHomeViewModel, MarketplaceProductResponse marketplaceProductResponse) {
        Log_OC.getArray(productHomeViewModel, "this$0");
        List $r2 = marketplaceProductResponse.getMarketplaceProductList();
        if ($r2 != null) {
            List $r22 = marketplaceProductResponse.getMarketplaceProductList();
            boolean $z1 = $r22.isEmpty();
            if (!$z1) {
                List $r23 = marketplaceProductResponse.getMarketplaceProductList();
                ViewData $r3 = productHomeViewModel.getState();
                ProductHomeViewData $r4 = ProductHomeViewData.copy$default((ProductHomeViewData) $r3, false, false, false, null, null, null, false, null, $r23, null, 765, null);
                productHomeViewModel.publish($r4);
            } else {
                ViewData $r32 = productHomeViewModel.getState();
                ProductHomeViewData $r42 = (ProductHomeViewData) $r32;
                Error $r5 = new Error("There is nothing to see here", false);
                productHomeViewModel.publish(ProductHomeViewData.copy$default($r42, false, false, false, null, $r5, null, false, null, null, null, 1005, null));
            }
        }
        String $r6 = marketplaceProductResponse.getResponseMessage();
        if ($r6 != null) {
            String $r62 = marketplaceProductResponse.getResponseMessage();
            int $i0 = $r62.length();
            boolean $z0 = $i0 > 0;
            if (!$z0) {
                ViewData $r33 = productHomeViewModel.getState();
                ProductHomeViewData $r43 = (ProductHomeViewData) $r33;
                Error $r52 = new Error("Error Fetching products, try again", false, 2, null);
                productHomeViewModel.publish(ProductHomeViewData.copy$default($r43, false, false, false, null, $r52, null, false, null, null, null, 1005, null));
                return;
            }
            ViewData $r34 = productHomeViewModel.getState();
            ProductHomeViewData $r44 = (ProductHomeViewData) $r34;
            String $r63 = marketplaceProductResponse.getResponseMessage();
            Error $r53 = new Error($r63, false, 2, null);
            productHomeViewModel.publish(ProductHomeViewData.copy$default($r44, false, false, false, null, $r53, null, false, null, null, null, 1005, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchMarketplaceTopPick$lambda-4  reason: not valid java name */
    public static final void m41642fetchMarketplaceTopPick$lambda4(ProductHomeViewModel productHomeViewModel, Throwable th) {
        Log_OC.getArray(productHomeViewModel, "this$0");
        ViewData $r3 = productHomeViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading top picks", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r1 = new Error((String) $r6, false, 2, null);
        ProductHomeViewData $r4 = ProductHomeViewData.copy$default((ProductHomeViewData) $r3, false, false, false, null, $r1, null, false, null, null, null, 1005, null);
        productHomeViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* renamed from: fetchProductBusinessSector$lambda-0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m41643fetchProductBusinessSector$lambda0(java.util.ArrayList r30, ai.kudi.agent.p036v2.productHome.viewModel.ProductHomeViewModel r31, java.util.List r32) {
        /*
            java.lang.String r13 = "$businessCategory"
            r0 = r30
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r13)
            java.lang.String r13 = "this$0"
            r0 = r31
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r13)
            if (r32 == 0) goto L1b
            r0 = r32
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L19
            goto L1b
        L19:
            r14 = 0
            goto L1c
        L1b:
            r14 = 1
        L1c:
            if (r14 != 0) goto L6d
            r0 = r30
            r1 = r32
            r0.addAll(r1)
            r0 = r31
            ai.kudi.agent.core.mvvm.ViewData r15 = r0.getState()
            r17 = r15
            ai.kudi.agent.v2.productHome.viewData.ProductHomeViewData r17 = (ai.kudi.agent.p036v2.productHome.viewData.ProductHomeViewData) r17
            r16 = r17
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 894(0x37e, float:1.253E-42)
            r28 = 0
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r30
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            ai.kudi.agent.v2.productHome.viewData.ProductHomeViewData r16 = ai.kudi.agent.p036v2.productHome.viewData.ProductHomeViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r31
            r1 = r16
            r0.publish(r1)
            return
        L6d:
            r0 = r31
            ai.kudi.agent.core.mvvm.ViewData r15 = r0.getState()
            r29 = r15
            ai.kudi.agent.v2.productHome.viewData.ProductHomeViewData r29 = (ai.kudi.agent.p036v2.productHome.viewData.ProductHomeViewData) r29
            r16 = r29
            java.util.List r32 = kotlin.p557z.C13722p.m3941e()
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 894(0x37e, float:1.253E-42)
            r28 = 0
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r32
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            ai.kudi.agent.v2.productHome.viewData.ProductHomeViewData r16 = ai.kudi.agent.p036v2.productHome.viewData.ProductHomeViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r31
            r1 = r16
            r0.publish(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productHome.viewModel.ProductHomeViewModel.m41643fetchProductBusinessSector$lambda0(java.util.ArrayList, ai.kudi.agent.v2.productHome.viewModel.ProductHomeViewModel, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProductBusinessSector$lambda-1  reason: not valid java name */
    public static final void m41644fetchProductBusinessSector$lambda1(ProductHomeViewModel productHomeViewModel, Throwable th) {
        Log_OC.getArray(productHomeViewModel, "this$0");
        ViewData $r3 = productHomeViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading business Categories", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r1 = new Error((String) $r6, false, 2, null);
        ProductHomeViewData $r4 = ProductHomeViewData.copy$default((ProductHomeViewData) $r3, false, false, false, $r1, null, null, false, null, null, null, 1014, null);
        productHomeViewModel.publish($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchBestCommissionProducts() {
        ViewData $r1 = getState();
        ProductHomeViewData $r2 = (ProductHomeViewData) $r1;
        publish(ProductHomeViewData.copy$default($r2, false, false, true, null, null, null, false, null, null, null, 1019, null));
        MarketplaceBestCommissionUseCase $r3 = this.marketplaceBestCommission;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.v2.productHome.viewModel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductHomeViewModel $r12 = ProductHomeViewModel.this;
                MarketplaceProductResponse $r32 = (MarketplaceProductResponse) obj;
                ProductHomeViewModel.m41639fetchBestCommissionProducts$lambda5($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productHome.viewModel.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductHomeViewModel $r12 = ProductHomeViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductHomeViewModel.m41640fetchBestCommissionProducts$lambda6($r12, $r32);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchMarketplaceTopPick() {
        ViewData $r1 = getState();
        ProductHomeViewData $r2 = (ProductHomeViewData) $r1;
        publish(ProductHomeViewData.copy$default($r2, false, true, false, null, null, null, false, null, null, null, 1021, null));
        MarketplaceTopPickUseCase $r3 = this.marketplaceTopPick;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.v2.productHome.viewModel.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductHomeViewModel $r12 = ProductHomeViewModel.this;
                MarketplaceProductResponse $r32 = (MarketplaceProductResponse) obj;
                ProductHomeViewModel.m41641fetchMarketplaceTopPick$lambda3($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productHome.viewModel.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductHomeViewModel $r12 = ProductHomeViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductHomeViewModel.m41642fetchMarketplaceTopPick$lambda4($r12, $r32);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
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
        ProductHomeViewData $r6 = ProductHomeViewData.copy$default((ProductHomeViewData) $r5, true, false, false, null, null, null, false, null, null, null, 1014, null);
        publish($r6);
        ProductBusinessSectorUseCase $r7 = this.productBusinessSectorUseCase;
        AbstractC11688p $r8 = $r7.execute();
        FavoritesArrayAdapter $r9 = $r8 == null ? null : $r8.e0(new Object() { // from class: ai.kudi.agent.v2.productHome.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ArrayList $r12 = $r4;
                ProductHomeViewModel $r2 = this;
                List $r42 = (List) obj;
                ProductHomeViewModel.m41643fetchProductBusinessSector$lambda0($r12, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productHome.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductHomeViewModel $r12 = ProductHomeViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductHomeViewModel.m41644fetchProductBusinessSector$lambda1($r12, $r32);
            }
        });
        if ($r9 == null) {
            return;
        }
        C11280b $r12 = getCompositeDisposable();
        $r12.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ProductHomeViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ProductHomeViewData initialData() {
        ProductHomeViewData $r1 = new ProductHomeViewData(false, false, false, null, null, null, false, null, null, null, 1023, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateIsNewFeature() {
        SharedPreferences $r1 = this.sharedPreferences;
        boolean $z0 = $r1.getBoolean(MarketplaceProductActivity.IS_MARKETPLACE_NEW_FEATURE, true);
        if ($z0) {
            SharedPreferences $r12 = this.sharedPreferences;
            SharedPreferences.Editor $r2 = $r12.edit();
            $r2.putBoolean(MarketplaceProductActivity.IS_MARKETPLACE_NEW_FEATURE, false).apply();
        }
    }
}
