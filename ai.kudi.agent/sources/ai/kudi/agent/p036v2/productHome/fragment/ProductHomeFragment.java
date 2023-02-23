package ai.kudi.agent.p036v2.productHome.fragment;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.collections.R$color;
import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductHomeBinding;
import ai.kudi.agent.collections.databinding.LayoutListHeaderBinding;
import ai.kudi.agent.collections.databinding.LayoutProductRecyclerviewBinding;
import ai.kudi.agent.collections.databinding.LayoutReloadContentBinding;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent;
import ai.kudi.agent.p036v2.common.utils.ProductBusinessSectorOnClickListener;
import ai.kudi.agent.p036v2.common.utils.ProductItemOnClickListener;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceProductActivity;
import ai.kudi.agent.p036v2.common.view.adapter.ProductBusinessSectorAdapter;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productDetails.fragment.ProductDetailsFragment;
import ai.kudi.agent.p036v2.productHome.adapter.ProductHomeAdapter;
import ai.kudi.agent.p036v2.productHome.viewData.ProductHomeViewData;
import ai.kudi.agent.p036v2.productHome.viewModel.ProductHomeViewModel;
import ai.kudi.agent.p036v2.productList.fragment.ProductListFragment;
import ai.kudi.agent.p036v2.productSearch.fragment.ProductSearchFragment;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p267w.p268a.p269a.C8199i;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ProductHomeFragment.kt */
@Metadata(m10422d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 A2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001AB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J \u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J$\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00101\u001a\u00020\u0019H\u0002J\b\u00102\u001a\u00020\u0019H\u0002J\b\u00103\u001a\u00020\u0019H\u0002J\u0016\u00104\u001a\u00020\u00192\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0002J\u0016\u00108\u001a\u00020\u00192\f\u00109\u001a\b\u0012\u0004\u0012\u00020:06H\u0002J\u0016\u0010;\u001a\u00020\u00192\f\u0010<\u001a\b\u0012\u0004\u0012\u00020706H\u0002J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020\u00192\u0006\u0010>\u001a\u00020?H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, m10421d2 = {"Lai/kudi/agent/v2/productHome/fragment/ProductHomeFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/v2/productHome/viewModel/ProductHomeViewModel;", "Lai/kudi/agent/v2/productHome/viewData/ProductHomeViewData;", "Lai/kudi/agent/collections/databinding/FragmentProductHomeBinding;", "()V", "bestCommissionListAdapter", "Lai/kudi/agent/v2/productHome/adapter/ProductHomeAdapter;", "marketplaceProductActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceProductActivity;", "productHomeViewModel", "getProductHomeViewModel", "()Lai/kudi/agent/v2/productHome/viewModel/ProductHomeViewModel;", "setProductHomeViewModel", "(Lai/kudi/agent/v2/productHome/viewModel/ProductHomeViewModel;)V", "productSectorListAdapter", "Lai/kudi/agent/v2/common/view/adapter/ProductBusinessSectorAdapter;", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "topPicksListAdapter", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "navigateToProductSectorFragment", "productBusinessSector", "", "id", "", "position", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setLoaderIcons", "setToolbar", "setViews", "showBestCommissionProducts", "bestCommissionProducts", "", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "showProductSectorCategories", "sectors", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "showTopPickProducts", "topPickProducts", "toggleBestCommissionProducts", "show", "", "toggleTopPickProducts", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productHome.fragment.ProductHomeFragment */
/* loaded from: classes.dex */
public final class ProductHomeFragment extends BaseMVVMViewBindingFragment<ProductHomeViewModel, ProductHomeViewData, FragmentProductHomeBinding> {
    public static final Companion Companion;
    private ProductHomeAdapter bestCommissionListAdapter;
    private MarketplaceProductActivity marketplaceProductActivity;
    public ProductHomeViewModel productHomeViewModel;
    private ProductBusinessSectorAdapter productSectorListAdapter;
    public SmartLookAnalytics smartLookAnalytics;
    private ProductHomeAdapter topPicksListAdapter;

    /* compiled from: ProductHomeFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/productHome/fragment/ProductHomeFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/v2/productHome/fragment/ProductHomeFragment;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productHome.fragment.ProductHomeFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ProductHomeFragment newInstance() {
            ProductHomeFragment $r1 = new ProductHomeFragment();
            Bundle $r2 = new Bundle();
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductHomeFragment() {
        ProductBusinessSectorAdapter $r1 = new ProductBusinessSectorAdapter(new ProductBusinessSectorOnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.ProductHomeFragment$productSectorListAdapter$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.p036v2.common.utils.ProductBusinessSectorOnClickListener
            public void onClick(ProductSectorModel productSectorModel, int i) {
                Log_OC.getArray(productSectorModel, "productSectorModel");
                Integer $r3 = productSectorModel.getId();
                if ($r3 == null) {
                    return;
                }
                ProductHomeFragment $r12 = ProductHomeFragment.this;
                int $i1 = $r3.intValue();
                String $r4 = productSectorModel.getName();
                if ($r4 == null) {
                    return;
                }
                $r12.navigateToProductSectorFragment($r4, $i1, i);
            }
        });
        this.productSectorListAdapter = $r1;
        ProductHomeAdapter $r3 = new ProductHomeAdapter(new ProductItemOnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.ProductHomeFragment$topPicksListAdapter$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.p036v2.common.utils.ProductItemOnClickListener
            public void onClick(MarketplaceProductModel marketplaceProductModel, int i) {
                Log_OC.getArray(marketplaceProductModel, "product");
                ProductHomeFragment $r2 = ProductHomeFragment.this;
                MarketplaceProductActivity $r32 = $r2.marketplaceProductActivity;
                if ($r32 == null) {
                    Log_OC.LogError("marketplaceProductActivity");
                    NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r6;
                }
                ProductDetailsFragment.Companion $r4 = ProductDetailsFragment.Companion;
                ProductDetailsFragment $r5 = $r4.newInstance(marketplaceProductModel);
                $r32.startFragment($r5, true);
            }
        });
        this.topPicksListAdapter = $r3;
        ProductHomeAdapter $r32 = new ProductHomeAdapter(new ProductItemOnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.ProductHomeFragment$bestCommissionListAdapter$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.p036v2.common.utils.ProductItemOnClickListener
            public void onClick(MarketplaceProductModel marketplaceProductModel, int i) {
                Log_OC.getArray(marketplaceProductModel, "product");
                ProductHomeFragment $r2 = ProductHomeFragment.this;
                MarketplaceProductActivity $r33 = $r2.marketplaceProductActivity;
                if ($r33 == null) {
                    Log_OC.LogError("marketplaceProductActivity");
                    NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r6;
                }
                ProductDetailsFragment.Companion $r4 = ProductDetailsFragment.Companion;
                ProductDetailsFragment $r5 = $r4.newInstance(marketplaceProductModel);
                $r33.startFragment($r5, true);
            }
        });
        this.bestCommissionListAdapter = $r32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToProductSectorFragment(String str, int i, int i2) {
        MarketplaceProductActivity $r1 = this.marketplaceProductActivity;
        if ($r1 == null) {
            Log_OC.LogError("marketplaceProductActivity");
            NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
            throw r5;
        }
        ProductListFragment.Companion $r2 = ProductListFragment.Companion;
        ProductListFragment $r3 = $r2.newInstance(str, i, i2);
        $r1.startFragment($r3, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ProductHomeFragment newInstance() {
        Companion $r1 = Companion;
        ProductHomeFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setLoaderIcons() {
        Resources $r1 = getResources();
        int $i0 = R$drawable.ic_loading;
        Drawable $r2 = C8199i.m16520b($r1, $i0, null);
        Log_OC.append($r2);
        Context $r3 = requireContext();
        int $i02 = R$color.kudiButtonDrawableColor;
        Drawable r7 = $r2;
        C1365a.m36188n(r7, C1335a.m36324d($r3, $i02));
        FragmentActivity $r4 = requireActivity();
        $r4.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.v2.productHome.fragment.InitiationListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                ProductHomeFragment $r12 = ProductHomeFragment.this;
                ProductHomeFragment.m41629setLoaderIcons$lambda20($r12);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setLoaderIcons$lambda-20  reason: not valid java name */
    public static final void m41629setLoaderIcons$lambda20(ProductHomeFragment productHomeFragment) {
        Log_OC.getArray(productHomeFragment, "this$0");
        InterfaceC8209a $r1 = productHomeFragment.requireBinding();
        FragmentProductHomeBinding $r2 = (FragmentProductHomeBinding) $r1;
        CamomileSpinner $r3 = $r2.ivSectorLoader;
        $r3.m32588f();
        InterfaceC8209a $r12 = productHomeFragment.requireBinding();
        FragmentProductHomeBinding $r22 = (FragmentProductHomeBinding) $r12;
        LayoutProductRecyclerviewBinding $r4 = $r22.rvProductTopPicksList;
        CamomileSpinner $r32 = $r4.ivProductListLoader;
        $r32.m32588f();
        InterfaceC8209a $r13 = productHomeFragment.requireBinding();
        FragmentProductHomeBinding $r23 = (FragmentProductHomeBinding) $r13;
        LayoutProductRecyclerviewBinding $r42 = $r23.rvProductBestCommissionList;
        CamomileSpinner $r33 = $r42.ivProductListLoader;
        $r33.m32588f();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setToolbar() {
        MarketplaceProductActivity $r2 = this.marketplaceProductActivity;
        if ($r2 == null) {
            Log_OC.LogError("marketplaceProductActivity");
            NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
            throw r3;
        }
        BaseMarketplaceActivity.setNavigationIcon$default($r2, 0, 1, null);
        MarketplaceProductActivity $r22 = this.marketplaceProductActivity;
        if ($r22 == null) {
            Log_OC.LogError("marketplaceProductActivity");
            NullPointerException r32 = new NullPointerException("Null throw statement replaced by Soot");
            throw r32;
        }
        int $i0 = R$string.marketplace;
        String $r1 = getString($i0);
        Log_OC.loadImage($r1, "getString(R.string.marketplace)");
        $r22.setToolbarTitle($r1);
        MarketplaceProductActivity $r23 = this.marketplaceProductActivity;
        if ($r23 != null) {
            $r23.toggleHelpButton(false);
            return;
        }
        Log_OC.LogError("marketplaceProductActivity");
        NullPointerException r33 = new NullPointerException("Null throw statement replaced by Soot");
        throw r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setViews() {
        setLoaderIcons();
        InterfaceC8209a $r1 = requireBinding();
        FragmentProductHomeBinding $r2 = (FragmentProductHomeBinding) $r1;
        TextView $r3 = $r2.textViewFragmentProductsSearchbar;
        $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductHomeFragment $r22 = ProductHomeFragment.this;
                ProductHomeFragment.m41630setViews$lambda10($r22, view);
            }
        });
        InterfaceC8209a $r12 = requireBinding();
        FragmentProductHomeBinding $r22 = (FragmentProductHomeBinding) $r12;
        SwipeRefreshLayout $r5 = $r22.srProductHomeWrapper;
        $r5.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC1879j() { // from class: ai.kudi.agent.v2.productHome.fragment.OverviewFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1879j
            public final void onRefresh() {
                ProductHomeFragment $r13 = ProductHomeFragment.this;
                ProductHomeFragment.m41631setViews$lambda11($r13);
            }
        });
        InterfaceC8209a $r13 = requireBinding();
        FragmentProductHomeBinding $r23 = (FragmentProductHomeBinding) $r13;
        LayoutListHeaderBinding $r7 = $r23.inTopPicksHeader;
        TextView $r32 = $r7.listHeaderTitle;
        Resources $r8 = getResources();
        int $i0 = R$string.top_picks;
        String $r9 = $r8.getString($i0);
        $r32.setText($r9);
        InterfaceC8209a $r14 = requireBinding();
        FragmentProductHomeBinding $r24 = (FragmentProductHomeBinding) $r14;
        LayoutListHeaderBinding $r72 = $r24.inTopPicksHeader;
        TextView $r33 = $r72.listHeaderSeeAllBtn;
        $r33.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductHomeFragment $r25 = ProductHomeFragment.this;
                ProductHomeFragment.m41632setViews$lambda12($r25, view);
            }
        });
        InterfaceC8209a $r15 = requireBinding();
        FragmentProductHomeBinding $r25 = (FragmentProductHomeBinding) $r15;
        LayoutListHeaderBinding $r73 = $r25.inBestCommissionHeader;
        TextView $r34 = $r73.listHeaderTitle;
        Resources $r82 = getResources();
        int $i02 = R$string.best_commission;
        String $r92 = $r82.getString($i02);
        $r34.setText($r92);
        InterfaceC8209a $r16 = requireBinding();
        FragmentProductHomeBinding $r26 = (FragmentProductHomeBinding) $r16;
        LayoutListHeaderBinding $r74 = $r26.inBestCommissionHeader;
        TextView $r35 = $r74.listHeaderSeeAllBtn;
        $r35.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.EditEventView$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductHomeFragment $r27 = ProductHomeFragment.this;
                ProductHomeFragment.m41633setViews$lambda13($r27, view);
            }
        });
        InterfaceC8209a $r17 = requireBinding();
        FragmentProductHomeBinding $r27 = (FragmentProductHomeBinding) $r17;
        RecyclerView $r122 = $r27.recyclerViewProductCategoriesSector;
        ProductBusinessSectorAdapter $r132 = this.productSectorListAdapter;
        $r122.setAdapter($r132);
        RecyclerView r32 = $r122;
        Context $r152 = r32.getContext();
        LinearLayoutManager r28 = new LinearLayoutManager($r152, 0, false);
        $r122.setLayoutManager(r28);
        InterfaceC8209a $r18 = requireBinding();
        FragmentProductHomeBinding $r28 = (FragmentProductHomeBinding) $r18;
        LayoutProductRecyclerviewBinding $r162 = $r28.rvProductTopPicksList;
        RecyclerView $r123 = $r162.rvProductList;
        ProductHomeAdapter $r172 = this.topPicksListAdapter;
        $r123.setAdapter($r172);
        RecyclerView r322 = $r123;
        Context $r153 = r322.getContext();
        LinearLayoutManager r282 = new LinearLayoutManager($r153, 1, false);
        $r123.setLayoutManager(r282);
        InterfaceC8209a $r19 = requireBinding();
        FragmentProductHomeBinding $r29 = (FragmentProductHomeBinding) $r19;
        LayoutProductRecyclerviewBinding $r163 = $r29.rvProductBestCommissionList;
        RecyclerView $r124 = $r163.rvProductList;
        ProductHomeAdapter $r173 = this.bestCommissionListAdapter;
        $r124.setAdapter($r173);
        RecyclerView r323 = $r124;
        Context $r154 = r323.getContext();
        LinearLayoutManager r283 = new LinearLayoutManager($r154, 1, false);
        $r124.setLayoutManager(r283);
        InterfaceC8209a $r110 = requireBinding();
        FragmentProductHomeBinding $r210 = (FragmentProductHomeBinding) $r110;
        LayoutProductRecyclerviewBinding $r164 = $r210.rvProductTopPicksList;
        LayoutReloadContentBinding $r182 = $r164.inNotFoundWrapper;
        ViewGroup $r192 = $r182.tvReloadBtn;
        ViewGroup r324 = $r192;
        r324.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductHomeFragment $r211 = ProductHomeFragment.this;
                ProductHomeFragment.m41634setViews$lambda17($r211, view);
            }
        });
        InterfaceC8209a $r111 = requireBinding();
        FragmentProductHomeBinding $r211 = (FragmentProductHomeBinding) $r111;
        LayoutProductRecyclerviewBinding $r165 = $r211.rvProductBestCommissionList;
        LayoutReloadContentBinding $r183 = $r165.inNotFoundWrapper;
        ViewGroup $r193 = $r183.tvReloadBtn;
        ViewGroup r325 = $r193;
        r325.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.Settings
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductHomeFragment $r212 = ProductHomeFragment.this;
                ProductHomeFragment.m41635setViews$lambda18($r212, view);
            }
        });
        InterfaceC8209a $r112 = requireBinding();
        FragmentProductHomeBinding $r212 = (FragmentProductHomeBinding) $r112;
        LinearLayout $r222 = $r212.llReloadBtn;
        $r222.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productHome.fragment.ErrorActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductHomeFragment $r213 = ProductHomeFragment.this;
                ProductHomeFragment.m41636setViews$lambda19($r213, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-10  reason: not valid java name */
    public static final void m41630setViews$lambda10(ProductHomeFragment productHomeFragment, View view) {
        Log_OC.getArray(productHomeFragment, "this$0");
        MarketplaceProductActivity $r3 = productHomeFragment.marketplaceProductActivity;
        if ($r3 == null) {
            Log_OC.LogError("marketplaceProductActivity");
            NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
            throw r5;
        }
        ProductSearchFragment.Companion $r4 = ProductSearchFragment.Companion;
        ProductSearchFragment $r0 = $r4.newInstance();
        $r3.startFragment($r0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-11  reason: not valid java name */
    public static final void m41631setViews$lambda11(ProductHomeFragment productHomeFragment) {
        Log_OC.getArray(productHomeFragment, "this$0");
        ProductHomeViewModel $r1 = productHomeFragment.getProductHomeViewModel();
        $r1.fetchProductBusinessSector();
        ProductHomeViewModel $r12 = productHomeFragment.getProductHomeViewModel();
        $r12.fetchMarketplaceTopPick();
        ProductHomeViewModel $r13 = productHomeFragment.getProductHomeViewModel();
        $r13.fetchBestCommissionProducts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setViews$lambda-12  reason: not valid java name */
    public static final void m41632setViews$lambda12(ProductHomeFragment productHomeFragment, View view) {
        Log_OC.getArray(productHomeFragment, "this$0");
        productHomeFragment.navigateToProductSectorFragment("ALL", 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setViews$lambda-13  reason: not valid java name */
    public static final void m41633setViews$lambda13(ProductHomeFragment productHomeFragment, View view) {
        Log_OC.getArray(productHomeFragment, "this$0");
        productHomeFragment.navigateToProductSectorFragment("ALL", 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-17  reason: not valid java name */
    public static final void m41634setViews$lambda17(ProductHomeFragment productHomeFragment, View view) {
        Log_OC.getArray(productHomeFragment, "this$0");
        ProductHomeViewModel $r2 = productHomeFragment.getProductHomeViewModel();
        $r2.fetchMarketplaceTopPick();
        InterfaceC8209a $r3 = productHomeFragment.requireBinding();
        FragmentProductHomeBinding $r4 = (FragmentProductHomeBinding) $r3;
        LayoutProductRecyclerviewBinding $r5 = $r4.rvProductTopPicksList;
        LayoutReloadContentBinding $r6 = $r5.inNotFoundWrapper;
        LinearLayout $r7 = $r6.llNoResultFound;
        Log_OC.loadImage($r7, "requireBinding().rvProductTopPicksList.inNotFoundWrapper.llNoResultFound");
        ViewExtKt.toggleVisibility($r7, false);
        InterfaceC8209a $r32 = productHomeFragment.requireBinding();
        FragmentProductHomeBinding $r42 = (FragmentProductHomeBinding) $r32;
        LayoutProductRecyclerviewBinding $r52 = $r42.rvProductTopPicksList;
        View $r8 = $r52.rvProductList;
        Log_OC.loadImage($r8, "requireBinding().rvProductTopPicksList.rvProductList");
        View $r1 = $r8;
        ViewExtKt.toggleVisibility($r1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-18  reason: not valid java name */
    public static final void m41635setViews$lambda18(ProductHomeFragment productHomeFragment, View view) {
        Log_OC.getArray(productHomeFragment, "this$0");
        ProductHomeViewModel $r2 = productHomeFragment.getProductHomeViewModel();
        $r2.fetchBestCommissionProducts();
        InterfaceC8209a $r3 = productHomeFragment.requireBinding();
        FragmentProductHomeBinding $r4 = (FragmentProductHomeBinding) $r3;
        LayoutProductRecyclerviewBinding $r5 = $r4.rvProductBestCommissionList;
        LayoutReloadContentBinding $r6 = $r5.inNotFoundWrapper;
        LinearLayout $r7 = $r6.llNoResultFound;
        Log_OC.loadImage($r7, "requireBinding().rvProductBestCommissionList.inNotFoundWrapper.llNoResultFound");
        ViewExtKt.toggleVisibility($r7, false);
        InterfaceC8209a $r32 = productHomeFragment.requireBinding();
        FragmentProductHomeBinding $r42 = (FragmentProductHomeBinding) $r32;
        LayoutProductRecyclerviewBinding $r52 = $r42.rvProductBestCommissionList;
        View $r8 = $r52.rvProductList;
        Log_OC.loadImage($r8, "requireBinding().rvProductBestCommissionList.rvProductList");
        View $r1 = $r8;
        ViewExtKt.toggleVisibility($r1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-19  reason: not valid java name */
    public static final void m41636setViews$lambda19(ProductHomeFragment productHomeFragment, View view) {
        Log_OC.getArray(productHomeFragment, "this$0");
        ProductHomeViewModel $r0 = productHomeFragment.getProductHomeViewModel();
        $r0.fetchProductBusinessSector();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showBestCommissionProducts(List list) {
        boolean $z0 = list.isEmpty();
        if (!$z0) {
            ProductHomeAdapter $r2 = this.bestCommissionListAdapter;
            $r2.addItems(list);
        }
        boolean $z02 = list.isEmpty();
        toggleBestCommissionProducts(!$z02);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showProductSectorCategories(List list) {
        boolean $z0 = list.isEmpty();
        if (!(!$z0)) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentProductHomeBinding $r3 = (FragmentProductHomeBinding) $r2;
            LinearLayout $r4 = $r3.llCategorySectorNotFound;
            Log_OC.loadImage($r4, "requireBinding().llCategorySectorNotFound");
            ViewExtKt.toggleVisibility($r4, true);
            InterfaceC8209a $r22 = requireBinding();
            FragmentProductHomeBinding $r32 = (FragmentProductHomeBinding) $r22;
            View $r5 = $r32.recyclerViewProductCategoriesSector;
            Log_OC.loadImage($r5, "requireBinding().recyclerViewProductCategoriesSector");
            View r7 = $r5;
            ViewExtKt.toggleVisibility(r7, false);
            return;
        }
        InterfaceC8209a $r23 = requireBinding();
        FragmentProductHomeBinding $r33 = (FragmentProductHomeBinding) $r23;
        LinearLayout $r42 = $r33.llCategorySectorNotFound;
        Log_OC.loadImage($r42, "requireBinding().llCategorySectorNotFound");
        ViewExtKt.toggleVisibility($r42, false);
        InterfaceC8209a $r24 = requireBinding();
        FragmentProductHomeBinding $r34 = (FragmentProductHomeBinding) $r24;
        View $r52 = $r34.recyclerViewProductCategoriesSector;
        Log_OC.loadImage($r52, "requireBinding().recyclerViewProductCategoriesSector");
        View r72 = $r52;
        ViewExtKt.toggleVisibility(r72, true);
        ProductBusinessSectorAdapter $r6 = this.productSectorListAdapter;
        $r6.submitList(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showTopPickProducts(List list) {
        boolean $z0 = list.isEmpty();
        if (!$z0) {
            ProductHomeAdapter $r2 = this.topPicksListAdapter;
            $r2.addItems(list);
        }
        boolean $z02 = list.isEmpty();
        toggleTopPickProducts(!$z02);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleBestCommissionProducts(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentProductHomeBinding $r2 = (FragmentProductHomeBinding) $r1;
        LayoutProductRecyclerviewBinding $r3 = $r2.rvProductBestCommissionList;
        View $r4 = $r3.rvProductList;
        Log_OC.loadImage($r4, "requireBinding().rvProductBestCommissionList.rvProductList");
        View r7 = $r4;
        ViewExtKt.toggleVisibility(r7, z);
        InterfaceC8209a $r12 = requireBinding();
        FragmentProductHomeBinding $r22 = (FragmentProductHomeBinding) $r12;
        LayoutProductRecyclerviewBinding $r32 = $r22.rvProductBestCommissionList;
        LayoutReloadContentBinding $r5 = $r32.inNotFoundWrapper;
        LinearLayout $r6 = $r5.llNoResultFound;
        Log_OC.loadImage($r6, "requireBinding().rvProductBestCommissionList.inNotFoundWrapper.llNoResultFound");
        boolean $z0 = !z;
        ViewExtKt.toggleVisibility($r6, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleTopPickProducts(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentProductHomeBinding $r2 = (FragmentProductHomeBinding) $r1;
        LayoutProductRecyclerviewBinding $r3 = $r2.rvProductTopPicksList;
        View $r4 = $r3.rvProductList;
        Log_OC.loadImage($r4, "requireBinding().rvProductTopPicksList.rvProductList");
        View r7 = $r4;
        ViewExtKt.toggleVisibility(r7, z);
        InterfaceC8209a $r12 = requireBinding();
        FragmentProductHomeBinding $r22 = (FragmentProductHomeBinding) $r12;
        LayoutProductRecyclerviewBinding $r32 = $r22.rvProductTopPicksList;
        LayoutReloadContentBinding $r5 = $r32.inNotFoundWrapper;
        LinearLayout $r6 = $r5.llNoResultFound;
        Log_OC.loadImage($r6, "requireBinding().rvProductTopPicksList.inNotFoundWrapper.llNoResultFound");
        boolean $z0 = !z;
        ViewExtKt.toggleVisibility($r6, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ProductHomeViewData $r2 = (ProductHomeViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ProductHomeViewData productHomeViewData) {
        Log_OC.getArray(productHomeViewData, "viewData");
        boolean $z0 = productHomeViewData.isSectorListLoading();
        InterfaceC8209a $r2 = requireBinding();
        FragmentProductHomeBinding $r3 = (FragmentProductHomeBinding) $r2;
        View $r4 = $r3.ivSectorLoader;
        Log_OC.loadImage($r4, "requireBinding().ivSectorLoader");
        View r15 = $r4;
        ViewExtKt.toggleVisibility(r15, $z0);
        InterfaceC8209a $r22 = requireBinding();
        FragmentProductHomeBinding $r32 = (FragmentProductHomeBinding) $r22;
        LinearLayout $r5 = $r32.llReloadBtn;
        Log_OC.loadImage($r5, "requireBinding().llReloadBtn");
        ViewExtKt.toggleVisibility($r5, !$z0);
        boolean $z02 = productHomeViewData.isBestCommissionProductsLoading();
        if ($z02) {
            InterfaceC8209a $r23 = requireBinding();
            FragmentProductHomeBinding $r33 = (FragmentProductHomeBinding) $r23;
            LayoutProductRecyclerviewBinding $r6 = $r33.rvProductBestCommissionList;
            $r6.ivProductListLoader.m32588f();
        } else {
            InterfaceC8209a $r24 = requireBinding();
            FragmentProductHomeBinding $r34 = (FragmentProductHomeBinding) $r24;
            LayoutProductRecyclerviewBinding $r62 = $r34.rvProductBestCommissionList;
            $r62.ivProductListLoader.m32587g();
        }
        InterfaceC8209a $r25 = requireBinding();
        FragmentProductHomeBinding $r35 = (FragmentProductHomeBinding) $r25;
        LayoutProductRecyclerviewBinding $r63 = $r35.rvProductBestCommissionList;
        View $r42 = $r63.ivProductListLoader;
        Log_OC.loadImage($r42, "requireBinding().rvProductBestCommissionList.ivProductListLoader");
        View r152 = $r42;
        ViewExtKt.toggleVisibility(r152, $z02);
        InterfaceC8209a $r26 = requireBinding();
        FragmentProductHomeBinding $r36 = (FragmentProductHomeBinding) $r26;
        SwipeRefreshLayout $r7 = $r36.srProductHomeWrapper;
        $r7.setRefreshing($z02);
        boolean $z03 = productHomeViewData.isTopPicksProductListLoading();
        if ($z03) {
            InterfaceC8209a $r27 = requireBinding();
            FragmentProductHomeBinding $r37 = (FragmentProductHomeBinding) $r27;
            LayoutProductRecyclerviewBinding $r64 = $r37.rvProductTopPicksList;
            $r64.ivProductListLoader.m32588f();
        } else {
            InterfaceC8209a $r28 = requireBinding();
            FragmentProductHomeBinding $r38 = (FragmentProductHomeBinding) $r28;
            LayoutProductRecyclerviewBinding $r65 = $r38.rvProductTopPicksList;
            $r65.ivProductListLoader.m32587g();
        }
        InterfaceC8209a $r29 = requireBinding();
        FragmentProductHomeBinding $r39 = (FragmentProductHomeBinding) $r29;
        LayoutProductRecyclerviewBinding $r66 = $r39.rvProductTopPicksList;
        View $r43 = $r66.ivProductListLoader;
        Log_OC.loadImage($r43, "requireBinding().rvProductTopPicksList.ivProductListLoader");
        View r153 = $r43;
        ViewExtKt.toggleVisibility(r153, $z03);
        if (productHomeViewData.getBusinessSectorError() != null) {
            InterfaceC8209a $r210 = requireBinding();
            FragmentProductHomeBinding $r310 = (FragmentProductHomeBinding) $r210;
            LinearLayout $r52 = $r310.llReloadBtn;
            Log_OC.loadImage($r52, "requireBinding().llReloadBtn");
            ViewExtKt.toggleVisibility($r52, true);
        }
        Error $r8 = productHomeViewData.getTopPicksProductListError();
        if ($r8 != null) {
            InterfaceC8209a $r211 = requireBinding();
            FragmentProductHomeBinding $r311 = (FragmentProductHomeBinding) $r211;
            LayoutProductRecyclerviewBinding $r67 = $r311.rvProductTopPicksList;
            LayoutReloadContentBinding $r9 = $r67.inNotFoundWrapper;
            LinearLayout $r53 = $r9.llNoResultFound;
            Log_OC.loadImage($r53, "requireBinding().rvProductTopPicksList.inNotFoundWrapper.llNoResultFound");
            ViewExtKt.toggleVisibility($r53, true);
            InterfaceC8209a $r212 = requireBinding();
            FragmentProductHomeBinding $r312 = (FragmentProductHomeBinding) $r212;
            LayoutProductRecyclerviewBinding $r68 = $r312.rvProductTopPicksList;
            LayoutReloadContentBinding $r92 = $r68.inNotFoundWrapper;
            TextView $r10 = $r92.tvNotFoundLabel;
            String $r11 = $r8.getGenericError();
            $r10.setText($r11);
            InterfaceC8209a $r213 = requireBinding();
            FragmentProductHomeBinding $r313 = (FragmentProductHomeBinding) $r213;
            LayoutProductRecyclerviewBinding $r69 = $r313.rvProductTopPicksList;
            LayoutReloadContentBinding $r93 = $r69.inNotFoundWrapper;
            View $r12 = $r93.tvReloadBtn;
            Log_OC.loadImage($r12, "requireBinding().rvProductTopPicksList.inNotFoundWrapper.tvReloadBtn");
            View r154 = $r12;
            ViewExtKt.toggleVisibility(r154, $r8.getRetry());
        }
        Error $r82 = productHomeViewData.getBestCommissionProductListError();
        if ($r82 != null) {
            InterfaceC8209a $r214 = requireBinding();
            FragmentProductHomeBinding $r314 = (FragmentProductHomeBinding) $r214;
            LayoutProductRecyclerviewBinding $r610 = $r314.rvProductBestCommissionList;
            LayoutReloadContentBinding $r94 = $r610.inNotFoundWrapper;
            LinearLayout $r54 = $r94.llNoResultFound;
            Log_OC.loadImage($r54, "requireBinding().rvProductBestCommissionList.inNotFoundWrapper.llNoResultFound");
            ViewExtKt.toggleVisibility($r54, true);
            InterfaceC8209a $r215 = requireBinding();
            FragmentProductHomeBinding $r315 = (FragmentProductHomeBinding) $r215;
            LayoutProductRecyclerviewBinding $r611 = $r315.rvProductBestCommissionList;
            LayoutReloadContentBinding $r95 = $r611.inNotFoundWrapper;
            TextView $r102 = $r95.tvNotFoundLabel;
            String $r112 = $r82.getGenericError();
            $r102.setText($r112);
            InterfaceC8209a $r216 = requireBinding();
            FragmentProductHomeBinding $r316 = (FragmentProductHomeBinding) $r216;
            LayoutProductRecyclerviewBinding $r612 = $r316.rvProductBestCommissionList;
            LayoutReloadContentBinding $r96 = $r612.inNotFoundWrapper;
            View $r122 = $r96.tvReloadBtn;
            Log_OC.loadImage($r122, "requireBinding().rvProductBestCommissionList.inNotFoundWrapper.tvReloadBtn");
            View r155 = $r122;
            ViewExtKt.toggleVisibility(r155, $r82.getRetry());
        }
        List $r13 = productHomeViewData.getTopPickProductList();
        if ($r13 != null) {
            showTopPickProducts($r13);
        }
        List $r132 = productHomeViewData.getBestCommissionProductList();
        if ($r132 != null) {
            showBestCommissionProducts($r132);
        }
        List $r133 = productHomeViewData.getProductSectors();
        if (productHomeViewData.getClearSectorAdapter()) {
            ProductBusinessSectorAdapter $r14 = this.productSectorListAdapter;
            $r14.clearList();
        }
        showProductSectorCategories($r133);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ProductHomeViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected ProductHomeViewModel createViewModel() {
        ProductHomeViewModel $r1 = getProductHomeViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductHomeViewModel getProductHomeViewModel() {
        ProductHomeViewModel $r1 = this.productHomeViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("productHomeViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ProductHomeViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof MarketplaceProductActivity;
        if ($z0) {
            this.marketplaceProductActivity = (MarketplaceProductActivity) context;
        }
        MarketplaceProductActivity $r3 = this.marketplaceProductActivity;
        if ($r3 != null) {
            MarketplaceProductSubComponent $r1 = $r3.getMarketplaceProductSubcomponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("marketplaceProductActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentProductHomeBinding $r4 = FragmentProductHomeBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setToolbar();
        setViews();
        ProductHomeViewModel $r3 = getProductHomeViewModel();
        $r3.updateIsNewFeature();
        ProductHomeViewModel $r32 = getProductHomeViewModel();
        $r32.fetchProductBusinessSector();
        ProductHomeViewModel $r33 = getProductHomeViewModel();
        $r33.fetchMarketplaceTopPick();
        ProductHomeViewModel $r34 = getProductHomeViewModel();
        $r34.fetchBestCommissionProducts();
        SmartLookAnalytics $r4 = getSmartLookAnalytics();
        $r4.logMarketplace();
    }

    public final void setProductHomeViewModel(ProductHomeViewModel productHomeViewModel) {
        Log_OC.getArray(productHomeViewModel, "<set-?>");
        this.productHomeViewModel = productHomeViewModel;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }
}
