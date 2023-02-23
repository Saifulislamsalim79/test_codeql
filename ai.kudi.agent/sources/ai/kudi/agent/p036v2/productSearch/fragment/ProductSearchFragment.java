package ai.kudi.agent.p036v2.productSearch.fragment;

import ai.kudi.agent.collections.R$color;
import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.R$style;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ObjectSerializer;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent;
import ai.kudi.agent.p036v2.common.utils.ProductItemOnClickListener;
import ai.kudi.agent.p036v2.common.utils.ViewUtils_extKt;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceProductActivity;
import ai.kudi.agent.p036v2.productDetails.fragment.ProductDetailsFragment;
import ai.kudi.agent.p036v2.productSearch.adapter.ProductSearchAdapter;
import ai.kudi.agent.p036v2.productSearch.viewData.ProductSearchViewData;
import ai.kudi.agent.p036v2.productSearch.viewModel.ProductSearchViewModel;
import ai.kudi.dip.library.button.C0770i;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.Service;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p267w.p268a.p269a.C8199i;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: ProductSearchFragment.kt */
@Metadata(m10422d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!J\u0010\u0010/\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0016J\u0012\u00102\u001a\u00020+2\b\u00103\u001a\u0004\u0018\u000104H\u0016J&\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010;\u001a\u00020+H\u0016J\b\u0010<\u001a\u00020+H\u0017J\u0010\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020?H\u0016J\u001a\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u0002062\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u000e\u0010B\u001a\u00020+2\u0006\u0010C\u001a\u00020 J$\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020 2\b\b\u0002\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020\rH\u0002J\b\u0010H\u001a\u00020+H\u0002J\b\u0010I\u001a\u00020+H\u0002J\b\u0010J\u001a\u00020+H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/fragment/ProductSearchFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "cancelSearch", "Landroid/widget/TextView;", "disposable", "Lio/reactivex/disposables/Disposable;", "ivLoading", "Landroid/widget/ImageView;", "llNoResultFound", "Landroid/widget/LinearLayout;", "loading", "", "marketplaceProductActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceProductActivity;", "productSearchAdapter", "Lai/kudi/agent/v2/productSearch/adapter/ProductSearchAdapter;", "productSearchPref", "Landroid/content/SharedPreferences;", "productSearchViewModel", "Lai/kudi/agent/v2/productSearch/viewModel/ProductSearchViewModel;", "getProductSearchViewModel", "()Lai/kudi/agent/v2/productSearch/viewModel/ProductSearchViewModel;", "setProductSearchViewModel", "(Lai/kudi/agent/v2/productSearch/viewModel/ProductSearchViewModel;)V", "rvSearchResults", "Landroidx/recyclerview/widget/RecyclerView;", "searchContentWrapper", "Landroidx/cardview/widget/CardView;", "searchEntries", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "searchTerm", "searchView", "Landroid/widget/AutoCompleteTextView;", "tvNoResultFoundLabel", "tvReloadBtn", "Lai/kudi/dip/library/button/KudiButton;", "viewLifecycle", "Landroidx/lifecycle/Lifecycle;", "applyViewData", "", "viewData", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData;", "fetchProductSearchResult", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "saveProductSearchResult", "search", AttributeType.TEXT, "page", "", "reset", "setLoaderIcon", "setRecyclerViewInfiniteScroll", "setToolbar", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productSearch.fragment.ProductSearchFragment */
/* loaded from: classes.dex */
public final class ProductSearchFragment extends Chapter implements Service {
    public static final Companion Companion;
    public static final String PREF_PRODUCT_SEARCH = "PREF_PRODUCT_SEARCH";
    public static final String SEARCH_ENTRY = "SEARCH_ENTRY";
    private TextView cancelSearch;
    private FavoritesArrayAdapter disposable;
    private ImageView ivLoading;
    private LinearLayout llNoResultFound;
    private MarketplaceProductActivity marketplaceProductActivity;
    private ProductSearchAdapter productSearchAdapter;
    private SharedPreferences productSearchPref;
    public ProductSearchViewModel productSearchViewModel;
    private RecyclerView rvSearchResults;
    private CardView searchContentWrapper;
    private ArrayList<String> searchEntries;
    private AutoCompleteTextView searchView;
    private TextView tvNoResultFoundLabel;
    private KudiButton tvReloadBtn;
    private AbstractC1565i viewLifecycle;
    private String searchTerm = "";
    private boolean loading = true;

    /* compiled from: ProductSearchFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/fragment/ProductSearchFragment$Companion;", "", "()V", ProductSearchFragment.PREF_PRODUCT_SEARCH, "", ProductSearchFragment.SEARCH_ENTRY, "newInstance", "Lai/kudi/agent/v2/productSearch/fragment/ProductSearchFragment;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productSearch.fragment.ProductSearchFragment$Companion */
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
        public final ProductSearchFragment newInstance() {
            ProductSearchFragment $r1 = new ProductSearchFragment();
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
    public ProductSearchFragment() {
        ArrayList $r2 = new ArrayList();
        this.searchEntries = $r2;
        ProductSearchAdapter $r3 = new ProductSearchAdapter(new ProductItemOnClickListener() { // from class: ai.kudi.agent.v2.productSearch.fragment.ProductSearchFragment$productSearchAdapter$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.p036v2.common.utils.ProductItemOnClickListener
            public void onClick(MarketplaceProductModel marketplaceProductModel, int i) {
                Log_OC.getArray(marketplaceProductModel, "product");
                ProductSearchFragment $r22 = ProductSearchFragment.this;
                ContextExtKt.hideKeyboard($r22);
                ProductSearchFragment $r23 = ProductSearchFragment.this;
                MarketplaceProductActivity $r32 = $r23.marketplaceProductActivity;
                if ($r32 == null) {
                    Log_OC.LogError("marketplaceProductActivity");
                    NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r6;
                }
                ProductDetailsFragment.Companion $r4 = ProductDetailsFragment.Companion;
                ProductDetailsFragment $r5 = $r4.newInstance(marketplaceProductModel);
                BaseMarketplaceActivity.startFragment$default($r32, $r5, true, true, 0, 8, null);
            }
        });
        this.productSearchAdapter = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ProductSearchFragment newInstance() {
        Companion $r1 = Companion;
        ProductSearchFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m41681onViewCreated$lambda0(ProductSearchFragment productSearchFragment, ProductSearchViewData productSearchViewData) {
        Log_OC.getArray(productSearchFragment, "this$0");
        Log_OC.loadImage(productSearchViewData, "it");
        productSearchFragment.applyViewData(productSearchViewData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m41683onViewCreated$lambda2(ProductSearchFragment productSearchFragment, View view) {
        Log_OC.getArray(productSearchFragment, "this$0");
        AutoCompleteTextView $r3 = productSearchFragment.searchView;
        if ($r3 == null) {
            Log_OC.LogError("searchView");
            NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
            throw r5;
        }
        Editable $r0 = $r3.getText();
        $r0.clear();
        AutoCompleteTextView $r32 = productSearchFragment.searchView;
        if ($r32 == null) {
            Log_OC.LogError("searchView");
            NullPointerException r52 = new NullPointerException("Null throw statement replaced by Soot");
            throw r52;
        }
        $r32.clearFocus();
        TextView $r4 = productSearchFragment.cancelSearch;
        if ($r4 != null) {
            ViewExtKt.toggleVisibility($r4, false);
            return;
        }
        Log_OC.LogError("cancelSearch");
        NullPointerException r53 = new NullPointerException("Null throw statement replaced by Soot");
        throw r53;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m41684onViewCreated$lambda3(ProductSearchFragment productSearchFragment, View view) {
        Log_OC.getArray(productSearchFragment, "this$0");
        AutoCompleteTextView $r2 = productSearchFragment.searchView;
        if ($r2 == null) {
            Log_OC.LogError("searchView");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        }
        Editable $r3 = $r2.getText();
        Log_OC.loadImage($r3, "searchView.text");
        int $i0 = $r3.length();
        boolean $z0 = $i0 > 0;
        if ($z0) {
            ProductSearchAdapter $r4 = productSearchFragment.productSearchAdapter;
            $r4.clearData();
            AutoCompleteTextView $r22 = productSearchFragment.searchView;
            if ($r22 == null) {
                Log_OC.LogError("searchView");
                NullPointerException r72 = new NullPointerException("Null throw statement replaced by Soot");
                throw r72;
            }
            String $r5 = $r22.getText().toString();
            search$default(productSearchFragment, $r5, 0, false, 6, null);
        }
        ContextExtKt.hideKeyboard(productSearchFragment);
        LinearLayout $r6 = productSearchFragment.llNoResultFound;
        if ($r6 != null) {
            ViewExtKt.toggleVisibility($r6, false);
            return;
        }
        Log_OC.LogError("llNoResultFound");
        NullPointerException r73 = new NullPointerException("Null throw statement replaced by Soot");
        throw r73;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
    public static final void m41685onViewCreated$lambda4(ProductSearchFragment productSearchFragment, View view, boolean z) {
        Log_OC.getArray(productSearchFragment, "this$0");
        if (z) {
            TextView $r2 = productSearchFragment.cancelSearch;
            if ($r2 != null) {
                ViewExtKt.toggleVisibility($r2, true);
                return;
            }
            Log_OC.LogError("cancelSearch");
            NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
            throw r3;
        }
        TextView $r22 = productSearchFragment.cancelSearch;
        if ($r22 != null) {
            ViewExtKt.toggleVisibility($r22, false);
            return;
        }
        Log_OC.LogError("cancelSearch");
        NullPointerException r32 = new NullPointerException("Null throw statement replaced by Soot");
        throw r32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void search(String str, int i, boolean z) {
        ProductSearchViewModel $r1 = getProductSearchViewModel();
        $r1.fetchAllProducts(str, i, z);
        View $r3 = this.searchContentWrapper;
        if ($r3 != null) {
            View r5 = $r3;
            ViewExtKt.toggleVisibility(r5, true);
            return;
        }
        Log_OC.LogError("searchContentWrapper");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void search$default(ProductSearchFragment productSearchFragment, String str, int $i0, boolean $z0, int i, Object obj) {
        int $i2 = i & 2;
        if ($i2 != 0) {
            $i0 = 0;
        }
        int $i1 = i & 4;
        if ($i1 != 0) {
            $z0 = true;
        }
        productSearchFragment.search(str, $i0, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setLoaderIcon() {
        Resources $r1 = getResources();
        int $i0 = R$drawable.ic_loading;
        final C8199i $r2 = C8199i.m16520b($r1, $i0, null);
        FragmentActivity $r3 = requireActivity();
        $r3.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.v2.productSearch.fragment.InitiationListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                C8199i $r12 = C8199i.this;
                ProductSearchFragment $r22 = this;
                ProductSearchFragment.m41686setLoaderIcon$lambda6($r12, $r22);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setLoaderIcon$lambda-6  reason: not valid java name */
    public static final void m41686setLoaderIcon$lambda6(C8199i c8199i, ProductSearchFragment productSearchFragment) {
        Log_OC.getArray(productSearchFragment, "this$0");
        Log_OC.append(c8199i);
        Context $r2 = productSearchFragment.requireContext();
        int $i0 = R$color.kudiButtonDrawableColor;
        C8199i r7 = c8199i;
        C1365a.m36188n(r7, C1335a.m36324d($r2, $i0));
        C8199i r72 = c8199i;
        C0770i r6 = new C0770i(r72);
        r6.m38010c(360.0f, 1000L);
        ImageView $r4 = productSearchFragment.ivLoading;
        if ($r4 != null) {
            C0770i r73 = r6;
            $r4.setImageDrawable(r73);
            return;
        }
        Log_OC.LogError("ivLoading");
        NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
        throw r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setRecyclerViewInfiniteScroll() {
        RecyclerView $r3 = this.rvSearchResults;
        if ($r3 == null) {
            Log_OC.LogError("rvSearchResults");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        ProductSearchFragment$setRecyclerViewInfiniteScroll$1 $r1 = new ProductSearchFragment$setRecyclerViewInfiniteScroll$1(this);
        RecyclerView.AbstractC1644u $r2 = ViewUtils_extKt.getInfiniteScrollListener$default(0, 0, 0, $r1, 7, null);
        $r3.m35282l($r2);
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
    public final void applyViewData(ProductSearchViewData productSearchViewData) {
        Log_OC.getArray(productSearchViewData, "viewData");
        boolean $z0 = productSearchViewData instanceof ProductSearchViewData.Loading;
        if ($z0) {
            ImageView $r2 = this.ivLoading;
            if ($r2 == null) {
                Log_OC.LogError("ivLoading");
                NullPointerException r17 = new NullPointerException("Null throw statement replaced by Soot");
                throw r17;
            }
            ProductSearchViewData.Loading $r3 = (ProductSearchViewData.Loading) productSearchViewData;
            boolean $z02 = $r3.getLoading();
            ViewExtKt.toggleVisibility($r2, $z02);
            boolean $z03 = $r3.getLoading();
            if ($z03) {
                boolean $z04 = $r3.getLoading();
                this.loading = $z04;
                return;
            }
            return;
        }
        boolean $z1 = productSearchViewData instanceof ProductSearchViewData.ProductList;
        if ($z1) {
            ProductSearchViewData.ProductList $r4 = (ProductSearchViewData.ProductList) productSearchViewData;
            List $r5 = $r4.getProducts();
            boolean $z05 = $r5.isEmpty();
            if (!$z05) {
                ProductSearchAdapter $r6 = this.productSearchAdapter;
                List $r52 = $r4.getProducts();
                $r6.addItems($r52);
            } else {
                boolean $z06 = this.loading;
                if ($z06) {
                    LinearLayout $r7 = this.llNoResultFound;
                    if ($r7 == null) {
                        Log_OC.LogError("llNoResultFound");
                        NullPointerException r172 = new NullPointerException("Null throw statement replaced by Soot");
                        throw r172;
                    }
                    ViewExtKt.toggleVisibility($r7, false);
                } else {
                    LinearLayout $r72 = this.llNoResultFound;
                    if ($r72 == null) {
                        Log_OC.LogError("llNoResultFound");
                        NullPointerException r173 = new NullPointerException("Null throw statement replaced by Soot");
                        throw r173;
                    }
                    ViewExtKt.toggleVisibility($r72, true);
                }
                View $r8 = this.rvSearchResults;
                if ($r8 == null) {
                    Log_OC.LogError("rvSearchResults");
                    NullPointerException r174 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r174;
                }
                View r18 = $r8;
                ViewExtKt.toggleVisibility(r18, false);
            }
            View $r82 = this.rvSearchResults;
            if ($r82 == null) {
                Log_OC.LogError("rvSearchResults");
                NullPointerException r175 = new NullPointerException("Null throw statement replaced by Soot");
                throw r175;
            }
            List $r53 = $r4.getProducts();
            boolean $z07 = $r53.isEmpty();
            View r182 = $r82;
            ViewExtKt.toggleVisibility(r182, !$z07);
            return;
        }
        boolean $z12 = productSearchViewData instanceof ProductSearchViewData.Error;
        if (!$z12) {
            boolean $z08 = productSearchViewData instanceof ProductSearchViewData.SearchEntry;
            if ($z08) {
                ProductSearchViewData.SearchEntry $r16 = (ProductSearchViewData.SearchEntry) productSearchViewData;
                String $r10 = $r16.getText();
                saveProductSearchResult($r10);
                return;
            }
            return;
        }
        ProductSearchViewData.Error $r9 = (ProductSearchViewData.Error) productSearchViewData;
        String $r102 = $r9.getMessage();
        int $i0 = $r102.length();
        boolean $z13 = $i0 > 0;
        if ($z13) {
            TextView $r11 = this.tvNoResultFoundLabel;
            if ($r11 == null) {
                Log_OC.LogError("tvNoResultFoundLabel");
                NullPointerException r176 = new NullPointerException("Null throw statement replaced by Soot");
                throw r176;
            }
            String $r103 = $r9.getMessage();
            $r11.setText($r103);
            CardView $r12 = this.searchContentWrapper;
            if ($r12 == null) {
                Log_OC.LogError("searchContentWrapper");
                NullPointerException r177 = new NullPointerException("Null throw statement replaced by Soot");
                throw r177;
            }
            Context $r13 = requireContext();
            int $i02 = C1335a.m36324d($r13, 17170445);
            ColorStateList $r14 = ColorStateList.valueOf($i02);
            $r12.setCardBackgroundColor($r14);
            CardView $r122 = this.searchContentWrapper;
            if ($r122 == null) {
                Log_OC.LogError("searchContentWrapper");
                NullPointerException r178 = new NullPointerException("Null throw statement replaced by Soot");
                throw r178;
            }
            $r122.setCardElevation(0.0f);
            String $r104 = $r9.getMessage();
            boolean $z14 = Log_OC.append($r104, "search result not found");
            if ($z14) {
                View $r15 = this.tvReloadBtn;
                if ($r15 == null) {
                    Log_OC.LogError("tvReloadBtn");
                    NullPointerException r179 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r179;
                }
                View r183 = $r15;
                ViewExtKt.toggleVisibility(r183, false);
            } else {
                View $r152 = this.tvReloadBtn;
                if ($r152 == null) {
                    Log_OC.LogError("tvReloadBtn");
                    NullPointerException r1710 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r1710;
                }
                View r184 = $r152;
                ViewExtKt.toggleVisibility(r184, true);
            }
        } else {
            CardView $r123 = this.searchContentWrapper;
            if ($r123 == null) {
                Log_OC.LogError("searchContentWrapper");
                NullPointerException r1711 = new NullPointerException("Null throw statement replaced by Soot");
                throw r1711;
            }
            Context $r132 = requireContext();
            int $i03 = R$color.white;
            ColorStateList $r142 = ColorStateList.valueOf(C1335a.m36324d($r132, $i03));
            $r123.setCardBackgroundColor($r142);
            CardView $r124 = this.searchContentWrapper;
            if ($r124 == null) {
                Log_OC.LogError("searchContentWrapper");
                NullPointerException r1712 = new NullPointerException("Null throw statement replaced by Soot");
                throw r1712;
            }
            $r124.setCardElevation(7.0f);
            View $r153 = this.tvReloadBtn;
            if ($r153 == null) {
                Log_OC.LogError("tvReloadBtn");
                NullPointerException r1713 = new NullPointerException("Null throw statement replaced by Soot");
                throw r1713;
            }
            View r185 = $r153;
            ViewExtKt.toggleVisibility(r185, false);
        }
        View $r154 = this.tvReloadBtn;
        if ($r154 == null) {
            Log_OC.LogError("tvReloadBtn");
            NullPointerException r1714 = new NullPointerException("Null throw statement replaced by Soot");
            throw r1714;
        }
        boolean $z15 = $r9.getRetry();
        View r186 = $r154;
        ViewExtKt.toggleVisibility(r186, $z15);
        LinearLayout $r73 = this.llNoResultFound;
        if ($r73 == null) {
            Log_OC.LogError("llNoResultFound");
            NullPointerException r1715 = new NullPointerException("Null throw statement replaced by Soot");
            throw r1715;
        }
        String $r105 = $r9.getMessage();
        int $i04 = $r105.length();
        boolean $z09 = $i04 > 0;
        ViewExtKt.toggleVisibility($r73, $z09);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ArrayList fetchProductSearchResult() {
        ArrayList $r1 = new ArrayList();
        SharedPreferences $r2 = this.productSearchPref;
        try {
            if ($r2 == null) {
                Log_OC.LogError("productSearchPref");
                NullPointerException $r6 = new NullPointerException("Null throw statement replaced by Soot");
                throw $r6;
            }
            ArrayList $r3 = new ArrayList();
            String $r4 = ObjectSerializer.serialize($r3);
            Object $r5 = ObjectSerializer.deserialize($r2.getString(SEARCH_ENTRY, $r4));
            if ($r5 != null) {
                ArrayList $r32 = (ArrayList) $r5;
                return $r32;
            }
            NullPointerException $r62 = new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            throw $r62;
        } catch (IOException $r8) {
            $r8.printStackTrace();
            return $r1;
        } catch (ClassNotFoundException $r7) {
            $r7.printStackTrace();
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductSearchViewModel getProductSearchViewModel() {
        ProductSearchViewModel $r1 = this.productSearchViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("productSearchViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Chapter, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof MarketplaceProductActivity;
        if ($z0) {
            this.marketplaceProductActivity = (MarketplaceProductActivity) context;
        }
        AbstractC1565i $r3 = this.viewLifecycle;
        if ($r3 != null) {
            $r3.a(this);
        }
        MarketplaceProductActivity $r2 = this.marketplaceProductActivity;
        if ($r2 == null) {
            Log_OC.LogError("marketplaceProductActivity");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        MarketplaceProductSubComponent $r4 = $r2.getMarketplaceProductSubcomponent();
        $r4.inject(this);
        ProductSearchViewModel $r5 = getProductSearchViewModel();
        $r5.initializeViewData();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Chapter, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int $i0 = R$style.FullScreenDialogStyle;
        setStyle(0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        int $i0 = R$layout.fragment_product_search;
        View $r4 = layoutInflater.inflate($i0, viewGroup, false);
        int $i02 = R$id.editText_searchbar;
        View $r5 = $r4.findViewById($i02);
        Log_OC.loadImage($r5, "view.findViewById(R.id.editText_searchbar)");
        AutoCompleteTextView $r6 = (AutoCompleteTextView) $r5;
        this.searchView = $r6;
        int $i03 = R$id.textView__cancel_search;
        View $r52 = $r4.findViewById($i03);
        Log_OC.loadImage($r52, "view.findViewById(R.id.textView__cancel_search)");
        TextView $r7 = (TextView) $r52;
        this.cancelSearch = $r7;
        int $i04 = R$id.in_recyclerView_product_search_container;
        View $r53 = $r4.findViewById($i04);
        Log_OC.loadImage($r53, "view.findViewById(R.id.in_recyclerView_product_search_container)");
        CardView $r8 = (CardView) $r53;
        this.searchContentWrapper = $r8;
        if ($r8 == null) {
            Log_OC.LogError("searchContentWrapper");
            NullPointerException r15 = new NullPointerException("Null throw statement replaced by Soot");
            throw r15;
        }
        int $i05 = R$id.rv_product_list;
        CardView r16 = $r8;
        View $r54 = r16.findViewById($i05);
        Log_OC.loadImage($r54, "searchContentWrapper.findViewById(R.id.rv_product_list)");
        RecyclerView $r9 = (RecyclerView) $r54;
        this.rvSearchResults = $r9;
        FrameLayout $r82 = this.searchContentWrapper;
        if ($r82 == null) {
            Log_OC.LogError("searchContentWrapper");
            NullPointerException r152 = new NullPointerException("Null throw statement replaced by Soot");
            throw r152;
        }
        int $i06 = R$id.iv_product_list_loader;
        FrameLayout r162 = $r82;
        View $r55 = r162.findViewById($i06);
        Log_OC.loadImage($r55, "searchContentWrapper.findViewById(R.id.iv_product_list_loader)");
        ImageView $r10 = (ImageView) $r55;
        this.ivLoading = $r10;
        FrameLayout $r83 = this.searchContentWrapper;
        if ($r83 == null) {
            Log_OC.LogError("searchContentWrapper");
            NullPointerException r153 = new NullPointerException("Null throw statement replaced by Soot");
            throw r153;
        }
        int $i07 = R$id.in_not_found_wrapper;
        FrameLayout r163 = $r83;
        View $r56 = r163.findViewById($i07);
        Log_OC.loadImage($r56, "searchContentWrapper.findViewById(R.id.in_not_found_wrapper)");
        LinearLayout $r11 = (LinearLayout) $r56;
        this.llNoResultFound = $r11;
        if ($r11 == null) {
            Log_OC.LogError("llNoResultFound");
            NullPointerException r154 = new NullPointerException("Null throw statement replaced by Soot");
            throw r154;
        }
        int $i08 = R$id.tv_reload_btn;
        View $r57 = $r11.findViewById($i08);
        Log_OC.loadImage($r57, "llNoResultFound.findViewById(R.id.tv_reload_btn)");
        KudiButton $r12 = (KudiButton) $r57;
        this.tvReloadBtn = $r12;
        LinearLayout $r112 = this.llNoResultFound;
        if ($r112 == null) {
            Log_OC.LogError("llNoResultFound");
            NullPointerException r155 = new NullPointerException("Null throw statement replaced by Soot");
            throw r155;
        }
        int $i09 = R$id.tv_not_found_label;
        View $r58 = $r112.findViewById($i09);
        Log_OC.loadImage($r58, "llNoResultFound.findViewById(R.id.tv_not_found_label)");
        TextView $r72 = (TextView) $r58;
        this.tvNoResultFoundLabel = $r72;
        Context $r13 = requireContext();
        SharedPreferences $r14 = $r13.getSharedPreferences(PREF_PRODUCT_SEARCH, 0);
        Log_OC.loadImage($r14, "requireContext().getSharedPreferences(PREF_PRODUCT_SEARCH, Context.MODE_PRIVATE)");
        this.productSearchPref = $r14;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Chapter, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC1565i $r1 = this.viewLifecycle;
        if ($r1 != null) {
            $r1.c(this);
        }
        this.viewLifecycle = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Chapter, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Log_OC.getArray(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        FavoritesArrayAdapter $r2 = this.disposable;
        if ($r2 == null) {
            return;
        }
        $r2.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c1  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r44, android.os.Bundle r45) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productSearch.fragment.ProductSearchFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void saveProductSearchResult(String str) {
        Log_OC.getArray(str, "search");
        int $i0 = str.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            return;
        }
        int $i02 = str.length();
        if ($i02 >= 3) {
            ArrayList $r2 = this.searchEntries;
            boolean $z02 = $r2.contains(str);
            if (!$z02) {
                ArrayList $r22 = this.searchEntries;
                $r22.add(str);
            }
            SharedPreferences $r3 = this.productSearchPref;
            if ($r3 == null) {
                Log_OC.LogError("productSearchPref");
                NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
                throw r6;
            }
            SharedPreferences.Editor $r4 = $r3.edit();
            ArrayList $r23 = this.searchEntries;
            try {
                String $r1 = ObjectSerializer.serialize($r23);
                $r4.putString(SEARCH_ENTRY, $r1);
            } catch (IOException $r5) {
                $r5.printStackTrace();
            }
            $r4.apply();
        }
    }

    public final void setProductSearchViewModel(ProductSearchViewModel productSearchViewModel) {
        Log_OC.getArray(productSearchViewModel, "<set-?>");
        this.productSearchViewModel = productSearchViewModel;
    }
}
