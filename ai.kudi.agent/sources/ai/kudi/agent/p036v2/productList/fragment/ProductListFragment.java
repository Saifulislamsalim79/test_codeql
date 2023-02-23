package ai.kudi.agent.p036v2.productList.fragment;

import ai.kudi.agent.collections.R$color;
import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductListBinding;
import ai.kudi.agent.collections.databinding.LayoutListHeaderBinding;
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
import ai.kudi.agent.p036v2.common.utils.ViewUtils_extKt;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceProductActivity;
import ai.kudi.agent.p036v2.common.view.adapter.ProductBusinessSectorAdapter;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productDetails.fragment.ProductDetailsFragment;
import ai.kudi.agent.p036v2.productList.adapter.ProductListAdapter;
import ai.kudi.agent.p036v2.productList.viewData.ProductListViewData;
import ai.kudi.agent.p036v2.productList.viewModel.ProductListViewModel;
import ai.kudi.agent.p036v2.productSearch.fragment.ProductSearchFragment;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.dip.library.button.C0770i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p267w.p268a.p269a.C8199i;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ProductListFragment.kt */
@Metadata(m10422d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 E2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001EB\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0014J\b\u0010%\u001a\u00020\u001cH\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\bH\u0016J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\bH\u0002J\b\u0010:\u001a\u00020\u001cH\u0002J\u0010\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\bH\u0002J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001aH\u0002J\b\u0010?\u001a\u00020\u001cH\u0002J\b\u0010@\u001a\u00020\u001cH\u0002J\b\u0010A\u001a\u00020\u001cH\u0002J\u0010\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\fH\u0002J\u0010\u0010D\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m10421d2 = {"Lai/kudi/agent/v2/productList/fragment/ProductListFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/v2/productList/viewModel/ProductListViewModel;", "Lai/kudi/agent/v2/productList/viewData/ProductListViewData;", "Lai/kudi/agent/collections/databinding/FragmentProductListBinding;", "Lai/kudi/agent/v2/common/utils/ProductBusinessSectorOnClickListener;", "()V", "adapterPosition", "", "anim", "Landroid/view/animation/RotateAnimation;", "listLoading", "", "marketplaceProductActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceProductActivity;", "productListAdapter", "Lai/kudi/agent/v2/productList/adapter/ProductListAdapter;", "productListViewModel", "getProductListViewModel", "()Lai/kudi/agent/v2/productList/viewModel/ProductListViewModel;", "setProductListViewModel", "(Lai/kudi/agent/v2/productList/viewModel/ProductListViewModel;)V", "productSectorId", "productSectorListAdapter", "Lai/kudi/agent/v2/common/view/adapter/ProductBusinessSectorAdapter;", "productSectorTitle", "", "addItems", "", "moreItems", "", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "applyViewData", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "handlePagination", "initializeList", "onAttach", "context", "Landroid/content/Context;", "onClick", "productSectorModel", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "position", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "paginateProductList", "page", "setLoaderIcons", "setProductsCategoryId", "id", "setProductsCategoryTitle", KudiPin.KUDI_PIN_TITLE, "setRecyclerView", "setToolbar", "setViews", "showProductList", "show", "showProductSectors", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productList.fragment.ProductListFragment */
/* loaded from: classes.dex */
public final class ProductListFragment extends BaseMVVMViewBindingFragment<ProductListViewModel, ProductListViewData, FragmentProductListBinding> implements ProductBusinessSectorOnClickListener {
    private static final String ARGS_BUSINESS_SECTOR_ADAPTER_POS = "ARGS_BUSINESS_SECTOR_ADAPTER_POS";
    private static final String ARGS_PRODUCT_BUSINESS_SECTOR = "ARGS_PRODUCT_BUSINESS_SECTOR";
    private static final String ARGS_PRODUCT_BUSINESS_SECTOR_ID = "ARGS_PRODUCT_BUSINESS_SECTOR_ID";
    public static final Companion Companion;
    private int adapterPosition;
    private RotateAnimation anim;
    private boolean listLoading;
    private MarketplaceProductActivity marketplaceProductActivity;
    private ProductListAdapter productListAdapter;
    public ProductListViewModel productListViewModel;
    private ProductBusinessSectorAdapter productSectorListAdapter;
    private int productSectorId = -1;
    private String productSectorTitle = "";

    /* compiled from: ProductListFragment.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/v2/productList/fragment/ProductListFragment$Companion;", "", "()V", ProductListFragment.ARGS_BUSINESS_SECTOR_ADAPTER_POS, "", ProductListFragment.ARGS_PRODUCT_BUSINESS_SECTOR, ProductListFragment.ARGS_PRODUCT_BUSINESS_SECTOR_ID, "newInstance", "Lai/kudi/agent/v2/productList/fragment/ProductListFragment;", "productSector", "id", "", "position", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productList.fragment.ProductListFragment$Companion */
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
        public final ProductListFragment newInstance(String str, int i, int i2) {
            Log_OC.getArray(str, "productSector");
            ProductListFragment $r3 = new ProductListFragment();
            Bundle $r1 = new Bundle();
            $r1.putString(ProductListFragment.ARGS_PRODUCT_BUSINESS_SECTOR, str);
            $r1.putInt(ProductListFragment.ARGS_PRODUCT_BUSINESS_SECTOR_ID, i);
            $r1.putInt(ProductListFragment.ARGS_BUSINESS_SECTOR_ADAPTER_POS, i2);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
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
    public ProductListFragment() {
        ProductListAdapter $r2 = new ProductListAdapter(new ProductItemOnClickListener() { // from class: ai.kudi.agent.v2.productList.fragment.ProductListFragment$productListAdapter$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.p036v2.common.utils.ProductItemOnClickListener
            public void onClick(MarketplaceProductModel marketplaceProductModel, int i) {
                Log_OC.getArray(marketplaceProductModel, "product");
                ProductListFragment $r22 = ProductListFragment.this;
                MarketplaceProductActivity $r3 = $r22.marketplaceProductActivity;
                if ($r3 == null) {
                    Log_OC.LogError("marketplaceProductActivity");
                    NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r8;
                }
                ProductDetailsFragment.Companion $r4 = ProductDetailsFragment.Companion;
                ProductDetailsFragment $r5 = $r4.newInstance(marketplaceProductModel);
                BaseMarketplaceActivity.startFragment$default($r3, $r5, true, true, 0, 8, null);
                ProductListFragment $r23 = ProductListFragment.this;
                Bundle $r6 = $r23.requireArguments();
                ProductListFragment $r24 = ProductListFragment.this;
                int $i0 = $r24.productSectorId;
                $r6.putInt("ARGS_PRODUCT_BUSINESS_SECTOR_ID", $i0);
                ProductListFragment $r25 = ProductListFragment.this;
                Bundle $r62 = $r25.requireArguments();
                ProductListFragment $r26 = ProductListFragment.this;
                String $r7 = $r26.productSectorTitle;
                $r62.putString("ARGS_PRODUCT_BUSINESS_SECTOR", $r7);
            }
        });
        this.productListAdapter = $r2;
        ProductBusinessSectorAdapter $r3 = new ProductBusinessSectorAdapter(this);
        this.productSectorListAdapter = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void addItems(List list) {
        ProductListAdapter $r2 = this.productListAdapter;
        $r2.addItems(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: applyViewData$lambda-11$lambda-8$lambda-7  reason: not valid java name */
    public static final void m41648applyViewData$lambda11$lambda8$lambda7(ProductListFragment productListFragment, List list) {
        Log_OC.getArray(productListFragment, "this$0");
        Log_OC.getArray(list, "$it");
        productListFragment.addItems(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handlePagination() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentProductListBinding $r3 = (FragmentProductListBinding) $r2;
        RecyclerView $r4 = $r3.rvProductList;
        ProductListFragment$handlePagination$1 $r1 = new ProductListFragment$handlePagination$1(this);
        RecyclerView.AbstractC1644u $r5 = ViewUtils_extKt.getInfiniteScrollListener$default(0, 0, 0, $r1, 7, null);
        $r4.m35282l($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initializeList(int i) {
        ProductListViewModel $r1 = getProductListViewModel();
        ProductListViewModel.getMarketplaceProductsById$default($r1, false, i, 0, false, 13, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ProductListFragment newInstance(String str, int i, int i2) {
        Companion $r0 = Companion;
        ProductListFragment $r1 = $r0.newInstance(str, i, i2);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void paginateProductList(int i) {
        ProductListViewModel $r1 = getProductListViewModel();
        int $i1 = this.productSectorId;
        ProductListViewModel.getMarketplaceProductsById$default($r1, false, $i1, i, false, 8, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setLoaderIcons() {
        Resources $r1 = getResources();
        int $i0 = R$drawable.ic_loading;
        final C8199i $r2 = C8199i.m16520b($r1, $i0, null);
        FragmentActivity $r3 = requireActivity();
        $r3.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.v2.productList.fragment.FileBrowser$11
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                C8199i $r12 = C8199i.this;
                ProductListFragment $r22 = this;
                ProductListFragment.m41649setLoaderIcons$lambda12($r12, $r22);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setLoaderIcons$lambda-12  reason: not valid java name */
    public static final void m41649setLoaderIcons$lambda12(C8199i c8199i, ProductListFragment productListFragment) {
        Log_OC.getArray(productListFragment, "this$0");
        Log_OC.append(c8199i);
        Context $r2 = productListFragment.requireContext();
        int $i0 = R$color.kudiButtonDrawableColor;
        C8199i r12 = c8199i;
        C1365a.m36188n(r12, C1335a.m36324d($r2, $i0));
        C8199i r122 = c8199i;
        C0770i r9 = new C0770i(r122);
        r9.m38010c(360.0f, 1000L);
        InterfaceC8209a $r4 = productListFragment.requireBinding();
        CamomileSpinner $r6 = ((FragmentProductListBinding) $r4).ivSectorLoader;
        $r6.m32588f();
        RotateAnimation r10 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        productListFragment.anim = r10;
        if (r10 != null) {
            LinearInterpolator r11 = new LinearInterpolator();
            r10.setInterpolator(r11);
        }
        RotateAnimation $r7 = productListFragment.anim;
        if ($r7 != null) {
            $r7.setRepeatCount(-1);
        }
        RotateAnimation $r72 = productListFragment.anim;
        if ($r72 != null) {
            $r72.setDuration(1000L);
        }
        InterfaceC8209a $r42 = productListFragment.requireBinding();
        FragmentProductListBinding $r5 = (FragmentProductListBinding) $r42;
        ImageView $r62 = $r5.ivProductListLoader;
        ImageView r13 = $r62;
        r13.setAnimation(productListFragment.anim);
        InterfaceC8209a $r43 = productListFragment.requireBinding();
        FragmentProductListBinding $r52 = (FragmentProductListBinding) $r43;
        ImageView $r63 = $r52.ivProductListLoader;
        ImageView r132 = $r63;
        r132.startAnimation(productListFragment.anim);
    }

    private final void setProductsCategoryId(int i) {
        this.productSectorId = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setProductsCategoryTitle(String str) {
        this.productSectorTitle = str;
        InterfaceC8209a $r2 = requireBinding();
        FragmentProductListBinding $r3 = (FragmentProductListBinding) $r2;
        LayoutListHeaderBinding $r4 = $r3.inCategoryHeader;
        TextView $r5 = $r4.listHeaderTitle;
        String $r1 = this.productSectorTitle;
        $r5.setText($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setRecyclerView() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentProductListBinding $r2 = (FragmentProductListBinding) $r1;
        RecyclerView $r3 = $r2.rvProductList;
        ProductListAdapter $r4 = this.productListAdapter;
        $r3.setAdapter($r4);
        RecyclerView r8 = $r3;
        Context $r6 = r8.getContext();
        LinearLayoutManager r7 = new LinearLayoutManager($r6, 1, false);
        $r3.setLayoutManager(r7);
        handlePagination();
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setViews() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productList.fragment.ProductListFragment.setViews():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-14  reason: not valid java name */
    public static final void m41650setViews$lambda14(ProductListFragment productListFragment, View view) {
        Log_OC.getArray(productListFragment, "this$0");
        MarketplaceProductActivity $r3 = productListFragment.marketplaceProductActivity;
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
    /* renamed from: setViews$lambda-15  reason: not valid java name */
    public static final void m41651setViews$lambda15(ProductListFragment productListFragment, View view) {
        Log_OC.getArray(productListFragment, "this$0");
        ProductListAdapter $r3 = productListFragment.productListAdapter;
        $r3.clearData();
        ProductListViewModel $r1 = productListFragment.getProductListViewModel();
        int $i0 = productListFragment.productSectorId;
        ProductListViewModel.getMarketplaceProductsById$default($r1, false, $i0, 0, false, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-16  reason: not valid java name */
    public static final void m41652setViews$lambda16(ProductListFragment productListFragment, View view) {
        Log_OC.getArray(productListFragment, "this$0");
        ProductListViewModel $r0 = productListFragment.getProductListViewModel();
        $r0.fetchProductBusinessSector();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showProductList(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = requireBinding();
            FragmentProductListBinding $r2 = (FragmentProductListBinding) $r1;
            View $r3 = $r2.rvProductList;
            Log_OC.loadImage($r3, "requireBinding().rvProductList");
            View r9 = $r3;
            ViewExtKt.toggleVisibility(r9, true);
            InterfaceC8209a $r12 = requireBinding();
            FragmentProductListBinding $r22 = (FragmentProductListBinding) $r12;
            FrameLayout $r4 = $r22.flProductListWrapper;
            Context $r5 = requireContext();
            int $i0 = R$drawable.drawable_product_list_background;
            Drawable $r6 = C1335a.m36322f($r5, $i0);
            $r4.setBackground($r6);
            return;
        }
        InterfaceC8209a $r13 = requireBinding();
        FragmentProductListBinding $r23 = (FragmentProductListBinding) $r13;
        View $r32 = $r23.rvProductList;
        Log_OC.loadImage($r32, "requireBinding().rvProductList");
        View r92 = $r32;
        ViewExtKt.toggleVisibility(r92, false);
        boolean $z0 = this.listLoading;
        if ($z0) {
            InterfaceC8209a $r14 = requireBinding();
            FragmentProductListBinding $r24 = (FragmentProductListBinding) $r14;
            LayoutReloadContentBinding $r7 = $r24.inNotFoundWrapper;
            LinearLayout $r8 = $r7.llNoResultFound;
            Log_OC.loadImage($r8, "requireBinding().inNotFoundWrapper.llNoResultFound");
            ViewExtKt.toggleVisibility($r8, false);
            return;
        }
        InterfaceC8209a $r15 = requireBinding();
        FragmentProductListBinding $r25 = (FragmentProductListBinding) $r15;
        LayoutReloadContentBinding $r72 = $r25.inNotFoundWrapper;
        LinearLayout $r82 = $r72.llNoResultFound;
        Log_OC.loadImage($r82, "requireBinding().inNotFoundWrapper.llNoResultFound");
        ViewExtKt.toggleVisibility($r82, true);
        InterfaceC8209a $r16 = requireBinding();
        FragmentProductListBinding $r26 = (FragmentProductListBinding) $r16;
        FrameLayout $r42 = $r26.flProductListWrapper;
        Context $r52 = requireContext();
        Drawable $r62 = C1335a.m36322f($r52, 17170445);
        $r42.setBackground($r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showProductSectors(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = requireBinding();
            FragmentProductListBinding $r2 = (FragmentProductListBinding) $r1;
            LinearLayout $r3 = $r2.llCategorySectorNotFound;
            Log_OC.loadImage($r3, "requireBinding().llCategorySectorNotFound");
            ViewExtKt.toggleVisibility($r3, false);
            InterfaceC8209a $r12 = requireBinding();
            FragmentProductListBinding $r22 = (FragmentProductListBinding) $r12;
            View $r4 = $r22.recyclerViewProductCategoriesSector;
            Log_OC.loadImage($r4, "requireBinding().recyclerViewProductCategoriesSector");
            View r5 = $r4;
            ViewExtKt.toggleVisibility(r5, true);
            return;
        }
        InterfaceC8209a $r13 = requireBinding();
        FragmentProductListBinding $r23 = (FragmentProductListBinding) $r13;
        LinearLayout $r32 = $r23.llCategorySectorNotFound;
        Log_OC.loadImage($r32, "requireBinding().llCategorySectorNotFound");
        ViewExtKt.toggleVisibility($r32, true);
        InterfaceC8209a $r14 = requireBinding();
        FragmentProductListBinding $r24 = (FragmentProductListBinding) $r14;
        View $r42 = $r24.recyclerViewProductCategoriesSector;
        Log_OC.loadImage($r42, "requireBinding().recyclerViewProductCategoriesSector");
        View r52 = $r42;
        ViewExtKt.toggleVisibility(r52, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ProductListViewData $r2 = (ProductListViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ProductListViewData productListViewData) {
        Log_OC.getArray(productListViewData, "viewData");
        boolean $z0 = productListViewData.isProductListLoading();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentProductListBinding $r3 = (FragmentProductListBinding) $r2;
            ImageView $r4 = $r3.ivProductListLoader;
            Animation $r5 = this.anim;
            ImageView r21 = $r4;
            r21.setAnimation($r5);
            InterfaceC8209a $r22 = requireBinding();
            FragmentProductListBinding $r32 = (FragmentProductListBinding) $r22;
            ImageView $r42 = $r32.ivProductListLoader;
            Animation $r52 = this.anim;
            ImageView r212 = $r42;
            r212.startAnimation($r52);
        } else {
            InterfaceC8209a $r23 = requireBinding();
            FragmentProductListBinding $r33 = (FragmentProductListBinding) $r23;
            ImageView r213 = $r33.ivProductListLoader;
            r213.clearAnimation();
        }
        InterfaceC8209a $r24 = requireBinding();
        FragmentProductListBinding $r34 = (FragmentProductListBinding) $r24;
        View $r43 = $r34.ivProductListLoader;
        Log_OC.loadImage($r43, "requireBinding().ivProductListLoader");
        View r22 = $r43;
        ViewExtKt.toggleVisibility(r22, $z0);
        this.listLoading = $z0;
        boolean $z02 = productListViewData.isSectorListLoading();
        InterfaceC8209a $r25 = requireBinding();
        FragmentProductListBinding $r35 = (FragmentProductListBinding) $r25;
        View $r44 = $r35.ivSectorLoader;
        Log_OC.loadImage($r44, "requireBinding().ivSectorLoader");
        View r222 = $r44;
        ViewExtKt.toggleVisibility(r222, $z02);
        InterfaceC8209a $r26 = requireBinding();
        FragmentProductListBinding $r36 = (FragmentProductListBinding) $r26;
        LinearLayout $r6 = $r36.llReloadBtn;
        Log_OC.loadImage($r6, "requireBinding().llReloadBtn");
        ViewExtKt.toggleVisibility($r6, !$z02);
        Error $r7 = productListViewData.getError();
        if ($r7 != null) {
            InterfaceC8209a $r27 = requireBinding();
            FragmentProductListBinding $r37 = (FragmentProductListBinding) $r27;
            LayoutReloadContentBinding $r8 = $r37.inNotFoundWrapper;
            LinearLayout $r62 = $r8.llNoResultFound;
            Log_OC.loadImage($r62, "requireBinding().inNotFoundWrapper.llNoResultFound");
            ViewExtKt.toggleVisibility($r62, true);
            InterfaceC8209a $r28 = requireBinding();
            FragmentProductListBinding $r38 = (FragmentProductListBinding) $r28;
            FrameLayout $r9 = $r38.flProductListWrapper;
            Context $r10 = requireContext();
            Drawable $r11 = C1335a.m36322f($r10, 17170445);
            $r9.setBackground($r11);
            InterfaceC8209a $r29 = requireBinding();
            FragmentProductListBinding $r39 = (FragmentProductListBinding) $r29;
            LayoutReloadContentBinding $r82 = $r39.inNotFoundWrapper;
            TextView $r12 = $r82.tvNotFoundLabel;
            $r12.setText($r7.getGenericError());
            InterfaceC8209a $r210 = requireBinding();
            FragmentProductListBinding $r310 = (FragmentProductListBinding) $r210;
            LayoutReloadContentBinding $r83 = $r310.inNotFoundWrapper;
            View $r14 = $r83.tvReloadBtn;
            Log_OC.loadImage($r14, "requireBinding().inNotFoundWrapper.tvReloadBtn");
            View r223 = $r14;
            ViewExtKt.toggleVisibility(r223, $r7.getRetry());
        }
        List $r15 = productListViewData.getProductSectors();
        if (productListViewData.getClearSectorAdapter()) {
            ProductBusinessSectorAdapter $r16 = this.productSectorListAdapter;
            $r16.clearList();
        }
        if (!$r15.isEmpty()) {
            ProductBusinessSectorAdapter $r162 = this.productSectorListAdapter;
            $r162.submitList($r15);
        }
        showProductSectors(!$r15.isEmpty());
        final List $r152 = productListViewData.getMarketplaceProductList();
        if (!$r152.isEmpty()) {
            InterfaceC8209a $r211 = requireBinding();
            FragmentProductListBinding $r311 = (FragmentProductListBinding) $r211;
            ViewGroup $r17 = $r311.rvProductList;
            ViewGroup r23 = $r17;
            r23.post(new Runnable() { // from class: ai.kudi.agent.v2.productList.fragment.InitiationListener$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    ProductListFragment $r1 = ProductListFragment.this;
                    List $r212 = $r152;
                    ProductListFragment.m41648applyViewData$lambda11$lambda8$lambda7($r1, $r212);
                }
            });
        }
        showProductList(!$r152.isEmpty());
        Integer $r19 = productListViewData.getProductBusinessCategoryId();
        if ($r19 != null) {
            int $i0 = $r19.intValue();
            setProductsCategoryId($i0);
        }
        String $r13 = productListViewData.getProductBusinessSectorTitle();
        if ($r13 != null) {
            setProductsCategoryTitle($r13);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ProductListViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected ProductListViewModel createViewModel() {
        ProductListViewModel $r1 = getProductListViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductListViewModel getProductListViewModel() {
        ProductListViewModel $r1 = this.productListViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("productListViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ProductListViewModel.class;
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
    @Override // ai.kudi.agent.p036v2.common.utils.ProductBusinessSectorOnClickListener
    public void onClick(ProductSectorModel productSectorModel, int i) {
        Log_OC.getArray(productSectorModel, "productSectorModel");
        InterfaceC8209a $r2 = requireBinding();
        FragmentProductListBinding $r3 = (FragmentProductListBinding) $r2;
        LayoutListHeaderBinding $r4 = $r3.inCategoryHeader;
        TextView $r5 = $r4.listHeaderTitle;
        String $r6 = productSectorModel.getName();
        $r5.setText($r6);
        ProductListAdapter $r7 = this.productListAdapter;
        $r7.clearData();
        Integer $r8 = productSectorModel.getId();
        if ($r8 != null) {
            int $i0 = $r8.intValue();
            ProductListViewModel $r9 = getProductListViewModel();
            ProductListViewModel.getMarketplaceProductsById$default($r9, false, $i0, 0, true, 5, null);
        }
        Integer $r82 = productSectorModel.getId();
        if ($r82 != null) {
            int $i02 = $r82.intValue();
            ProductListViewModel $r92 = getProductListViewModel();
            String $r62 = productSectorModel.getName();
            $r92.setProductSectorParams($i02, $r62);
        }
        Integer $r83 = productSectorModel.getId();
        if ($r83 == null) {
            return;
        }
        int $i03 = $r83.intValue();
        ProductBusinessSectorAdapter $r10 = this.productSectorListAdapter;
        $r10.setSelectedCategoryId($i03);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentProductListBinding $r4 = FragmentProductListBinding.inflate(layoutInflater, viewGroup, false);
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
        ProductListViewModel $r2 = getProductListViewModel();
        $r2.fetchProductBusinessSector();
    }

    public final void setProductListViewModel(ProductListViewModel productListViewModel) {
        Log_OC.getArray(productListViewModel, "<set-?>");
        this.productListViewModel = productListViewModel;
    }
}
