package ai.kudi.agent.p036v2.productDetails.fragment;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductDetailsBinding;
import ai.kudi.agent.collections.databinding.LayoutBottomButtonBinding;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.p036v2.common.archives.PlanAmountField;
import ai.kudi.agent.p036v2.common.archives.PlanAmountProperty;
import ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceProductActivity;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productDetails.adapter.PlanItemOnClickListener;
import ai.kudi.agent.p036v2.productDetails.adapter.ProductDetailsFeaturesAdapter;
import ai.kudi.agent.p036v2.productDetails.adapter.ProductPlansAdapter;
import ai.kudi.agent.p036v2.productDetails.viewData.ProductDetailsLiveData;
import ai.kudi.agent.p036v2.productDetails.viewModel.ProductDetailsViewModel;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProductDetailsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0014J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010(\u001a\u00020 H\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0016J$\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001a\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00106\u001a\u00020 H\u0002J\b\u00107\u001a\u00020 H\u0002J\b\u00108\u001a\u00020 H\u0002J\b\u00109\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/fragment/ProductDetailsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/v2/productDetails/viewModel/ProductDetailsViewModel;", "Lai/kudi/agent/v2/productDetails/viewData/ProductDetailsLiveData;", "Lai/kudi/agent/collections/databinding/FragmentProductDetailsBinding;", "()V", "amountType", "", "collectionAmount", "isPlanProduct", "", "loadCount", "", "marketplaceProductActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceProductActivity;", "marketplaceProductFields", "Lai/kudi/agent/core/domain/data/ProductField;", "marketplaceProductModel", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "planAmountProperty", "Lai/kudi/agent/v2/common/dto/PlanAmountProperty;", "planFieldKey", "productDetailsFeaturesAdapter", "Lai/kudi/agent/v2/productDetails/adapter/ProductDetailsFeaturesAdapter;", "productDetailsViewModel", "getProductDetailsViewModel", "()Lai/kudi/agent/v2/productDetails/viewModel/ProductDetailsViewModel;", "setProductDetailsViewModel", "(Lai/kudi/agent/v2/productDetails/viewModel/ProductDetailsViewModel;)V", "productPlanAdapter", "Lai/kudi/agent/v2/productDetails/adapter/ProductPlansAdapter;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "handleError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "initializeData", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setLoaderIcon", "setProductPlans", "setToolbar", "setViews", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.fragment.ProductDetailsFragment */
/* loaded from: classes.dex */
public final class ProductDetailsFragment extends BaseMVVMViewBindingFragment<ProductDetailsViewModel, ProductDetailsLiveData, FragmentProductDetailsBinding> {
    public static final String ARGS_MARKETPLACE_PRODUCT = "ARGS_MARKETPLACE_PRODUCT";
    public static final Companion Companion;
    private String amountType;
    private String collectionAmount;
    private boolean isPlanProduct;
    private int loadCount;
    private MarketplaceProductActivity marketplaceProductActivity;
    private ProductField marketplaceProductFields;
    private MarketplaceProductModel marketplaceProductModel;
    private PlanAmountProperty planAmountProperty;
    private String planFieldKey;
    private ProductDetailsFeaturesAdapter productDetailsFeaturesAdapter;
    public ProductDetailsViewModel productDetailsViewModel;
    private final ProductPlansAdapter productPlanAdapter;

    /* compiled from: ProductDetailsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/v2/productDetails/fragment/ProductDetailsFragment$Companion;", "", "()V", ProductDetailsFragment.ARGS_MARKETPLACE_PRODUCT, "", "newInstance", "Lai/kudi/agent/v2/productDetails/fragment/ProductDetailsFragment;", "marketplaceProductModel", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productDetails.fragment.ProductDetailsFragment$Companion */
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
        public final ProductDetailsFragment newInstance(MarketplaceProductModel marketplaceProductModel) {
            Log_OC.getArray(marketplaceProductModel, "marketplaceProductModel");
            ProductDetailsFragment $r3 = new ProductDetailsFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(ProductDetailsFragment.ARGS_MARKETPLACE_PRODUCT, marketplaceProductModel);
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
    public ProductDetailsFragment() {
        ProductDetailsFeaturesAdapter $r2 = new ProductDetailsFeaturesAdapter();
        this.productDetailsFeaturesAdapter = $r2;
        this.collectionAmount = "";
        this.amountType = "";
        ProductPlansAdapter $r3 = new ProductPlansAdapter(new PlanItemOnClickListener() { // from class: ai.kudi.agent.v2.productDetails.fragment.ProductDetailsFragment$productPlanAdapter$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.p036v2.productDetails.adapter.PlanItemOnClickListener
            public void onClick(String str, ArrayList arrayList) {
                Log_OC.getArray(str, "key");
                Log_OC.getArray(arrayList, "categories");
                ProductDetailsFragment $r5 = ProductDetailsFragment.this;
                if ($r5.planFieldKey != null) {
                    ProductDetailsFragment $r52 = ProductDetailsFragment.this;
                    ProductDetailsFragment $r7 = ProductDetailsFragment.this;
                    String $r6 = $r7.planFieldKey;
                    Log_OC.append($r6);
                    PlanAmountField $r22 = new PlanAmountField(str, arrayList);
                    PlanAmountProperty $r1 = new PlanAmountProperty($r6, $r22);
                    $r52.planAmountProperty = $r1;
                    ProductDetailsFragment $r53 = ProductDetailsFragment.this;
                    ProductDetailsViewModel $r8 = $r53.getProductDetailsViewModel();
                    ProductDetailsFragment $r54 = ProductDetailsFragment.this;
                    PlanAmountProperty $r12 = $r54.planAmountProperty;
                    $r8.enableButton($r12);
                }
            }
        });
        this.productPlanAdapter = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleError(Error error) {
        if (error != null) {
            FragmentActivity $r2 = requireActivity();
            Log_OC.loadImage($r2, "requireActivity()");
            String $r3 = error.getGenericError();
            ContextExtKt.toast($r2, String.valueOf($r3), 0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initializeData() {
        Bundle $r1 = requireArguments();
        boolean $z0 = $r1.containsKey(ARGS_MARKETPLACE_PRODUCT);
        Integer $r2 = null;
        if ($z0) {
            ProductDetailsViewModel $r3 = getProductDetailsViewModel();
            $r3.marketplaceProductDetails(true);
            Bundle $r12 = requireArguments();
            Parcelable $r4 = $r12.getParcelable(ARGS_MARKETPLACE_PRODUCT);
            this.marketplaceProductModel = (MarketplaceProductModel) $r4;
        } else {
            ProductDetailsViewModel $r32 = getProductDetailsViewModel();
            $r32.marketplaceProductDetails(false);
            MarketplaceProductActivity $r6 = this.marketplaceProductActivity;
            if ($r6 == null) {
                Log_OC.LogError("marketplaceProductActivity");
                NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
                throw r8;
            }
            $r6.closeFragment();
        }
        ProductDetailsViewModel $r33 = getProductDetailsViewModel();
        MarketplaceProductModel $r5 = this.marketplaceProductModel;
        if ($r5 != null) {
            int $i0 = $r5.getId();
            $r2 = Integer.valueOf($i0);
        }
        String $r7 = String.valueOf($r2);
        $r33.getProductFields($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ProductDetailsFragment newInstance(MarketplaceProductModel marketplaceProductModel) {
        Companion $r0 = Companion;
        ProductDetailsFragment $r1 = $r0.newInstance(marketplaceProductModel);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setLoaderIcon() {
        FragmentActivity $r2 = requireActivity();
        $r2.runOnUiThread(new Runnable() { // from class: ai.kudi.agent.v2.productDetails.fragment.InitiationListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                ProductDetailsFragment $r1 = ProductDetailsFragment.this;
                ProductDetailsFragment.m41621setLoaderIcon$lambda8($r1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setLoaderIcon$lambda-8  reason: not valid java name */
    public static final void m41621setLoaderIcon$lambda8(ProductDetailsFragment productDetailsFragment) {
        Log_OC.getArray(productDetailsFragment, "this$0");
        InterfaceC8209a $r0 = productDetailsFragment.requireBinding();
        FragmentProductDetailsBinding $r2 = (FragmentProductDetailsBinding) $r0;
        CamomileSpinner $r3 = $r2.ivPlansLoader;
        $r3.m32588f();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setProductPlans() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentProductDetailsBinding $r2 = (FragmentProductDetailsBinding) $r1;
        ViewGroup r8 = $r2.rvProductDetailsPlans;
        r8.setVisibility(0);
        InterfaceC8209a $r12 = requireBinding();
        FragmentProductDetailsBinding $r22 = (FragmentProductDetailsBinding) $r12;
        RecyclerView $r3 = $r22.rvProductDetailsPlans;
        ProductPlansAdapter $r4 = this.productPlanAdapter;
        $r3.setAdapter($r4);
        Context $r6 = requireContext();
        LinearLayoutManager r7 = new LinearLayoutManager($r6, 0, false);
        $r3.setLayoutManager(r7);
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
        int $i0 = R$string.back;
        String $r1 = getString($i0);
        Log_OC.loadImage($r1, "getString(R.string.back)");
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
        ProductSectorModel $r11;
        String $r6;
        String $r14;
        String $r142;
        String $r62;
        ImageUtil.Companion $r2 = ImageUtil.Companion;
        MarketplaceProductActivity $r3 = this.marketplaceProductActivity;
        if ($r3 == null) {
            Log_OC.LogError("marketplaceProductActivity");
            NullPointerException r24 = new NullPointerException("Null throw statement replaced by Soot");
            throw r24;
        }
        MarketplaceProductModel $r5 = this.marketplaceProductModel;
        String $r63 = $r5 == null ? null : $r5.getImageUrl();
        InterfaceC8209a $r7 = requireBinding();
        FragmentProductDetailsBinding $r8 = (FragmentProductDetailsBinding) $r7;
        ImageView $r9 = $r8.imgProductImage;
        Log_OC.loadImage($r9, "requireBinding().imgProductImage");
        int $i0 = R$drawable.im_rounded_rectangle;
        $r2.load($r3, $r63, $r9, $i0, $i0);
        InterfaceC8209a $r72 = requireBinding();
        FragmentProductDetailsBinding $r82 = (FragmentProductDetailsBinding) $r72;
        TextView $r10 = $r82.textViewProductsTitle;
        MarketplaceProductModel $r52 = this.marketplaceProductModel;
        String $r64 = $r52 == null ? null : $r52.getTitle();
        $r10.setText($r64);
        InterfaceC8209a $r73 = requireBinding();
        FragmentProductDetailsBinding $r83 = (FragmentProductDetailsBinding) $r73;
        TextView $r102 = $r83.tvProductBusinessCategory;
        MarketplaceProductModel $r53 = this.marketplaceProductModel;
        String $r65 = ($r53 == null || ($r11 = $r53.getBusinessSector()) == null) ? null : $r11.getName();
        $r102.setText($r65);
        InterfaceC8209a $r74 = requireBinding();
        FragmentProductDetailsBinding $r84 = (FragmentProductDetailsBinding) $r74;
        TextView $r103 = $r84.tvProductDescription;
        MarketplaceProductModel $r54 = this.marketplaceProductModel;
        String $r66 = $r54 == null ? null : $r54.getDescription();
        $r103.setText($r66);
        InterfaceC8209a $r75 = requireBinding();
        FragmentProductDetailsBinding $r85 = (FragmentProductDetailsBinding) $r75;
        TextView $r104 = $r85.tvAgentCommission;
        Context $r12 = requireContext();
        Object[] $r1 = {"0%"};
        String $r67 = $r12.getString(R$string.agent_commission_2, $r1);
        $r104.setText($r67);
        MarketplaceProductModel $r55 = this.marketplaceProductModel;
        BigDecimal $r13 = $r55 == null ? null : $r55.getAmount();
        if ($r13 != null) {
            MarketplaceProductModel $r56 = this.marketplaceProductModel;
            BigDecimal $r132 = $r56 == null ? null : $r56.getAmount();
            Log_OC.append($r132);
            $r6 = StringExtKt.formatDecimalAmount($r132);
        } else {
            $r6 = StringExtKt.formatDecimalAmount("0");
        }
        MarketplaceProductModel $r57 = this.marketplaceProductModel;
        BigDecimal $r133 = $r57 == null ? null : $r57.getAmount();
        this.collectionAmount = String.valueOf($r133);
        MarketplaceProductModel $r58 = this.marketplaceProductModel;
        String $r15 = $r58 == null ? null : $r58.getAmountType();
        String $r143 = "FIXED";
        boolean $z0 = Log_OC.append($r15, "FIXED");
        if ($z0) {
            InterfaceC8209a $r76 = requireBinding();
            FragmentProductDetailsBinding $r86 = (FragmentProductDetailsBinding) $r76;
            TextView $r105 = $r86.tvProductAmount;
            $r105.setVisibility(0);
            InterfaceC8209a $r77 = requireBinding();
            FragmentProductDetailsBinding $r87 = (FragmentProductDetailsBinding) $r77;
            TextView $r106 = $r87.tvProductAmount;
            Context $r122 = requireContext();
            Object[] $r16 = {$r6};
            String $r68 = $r122.getString(R$string.amount_s, $r16);
            $r106.setText($r68);
            MarketplaceProductModel $r59 = this.marketplaceProductModel;
            if ($r59 != null && ($r62 = $r59.getAmountType()) != null) {
                $r143 = $r62;
            }
            this.amountType = $r143;
        } else {
            MarketplaceProductModel $r510 = this.marketplaceProductModel;
            String $r69 = "DYNAMIC";
            boolean $z02 = Log_OC.append($r510 == null ? null : $r510.getAmountType(), "DYNAMIC");
            if ($z02) {
                InterfaceC8209a $r78 = requireBinding();
                FragmentProductDetailsBinding $r88 = (FragmentProductDetailsBinding) $r78;
                TextView $r107 = $r88.tvProductAmount;
                $r107.setVisibility(8);
                InterfaceC8209a $r79 = requireBinding();
                FragmentProductDetailsBinding $r89 = (FragmentProductDetailsBinding) $r79;
                View $r162 = $r89.vwDividerDecorThree;
                $r162.setVisibility(8);
                MarketplaceProductModel $r511 = this.marketplaceProductModel;
                if ($r511 != null && ($r142 = $r511.getAmountType()) != null) {
                    $r69 = $r142;
                }
                this.amountType = $r69;
            }
            MarketplaceProductModel $r512 = this.marketplaceProductModel;
            String $r610 = "PLAN";
            boolean $z03 = Log_OC.append($r512 == null ? null : $r512.getAmountType(), "PLAN");
            if ($z03) {
                this.isPlanProduct = true;
                InterfaceC8209a $r710 = requireBinding();
                FragmentProductDetailsBinding $r810 = (FragmentProductDetailsBinding) $r710;
                TextView $r108 = $r810.tvProductAmount;
                $r108.setVisibility(0);
                InterfaceC8209a $r711 = requireBinding();
                FragmentProductDetailsBinding $r811 = (FragmentProductDetailsBinding) $r711;
                TextView $r109 = $r811.tvProductAmount;
                Context $r123 = requireContext();
                $r109.setText($r123.getString(R$string.select_plan));
                MarketplaceProductModel $r513 = this.marketplaceProductModel;
                if ($r513 != null && ($r14 = $r513.getAmountType()) != null) {
                    $r610 = $r14;
                }
                this.amountType = $r610;
                setLoaderIcon();
            }
        }
        MarketplaceProductModel $r514 = this.marketplaceProductModel;
        if (($r514 == null ? null : $r514.getFeatures()) != null) {
            MarketplaceProductModel $r515 = this.marketplaceProductModel;
            List $r17 = $r515 == null ? null : $r515.getFeatures();
            Log_OC.append($r17);
            boolean $z04 = $r17.isEmpty();
            if ($z04) {
                InterfaceC8209a $r712 = requireBinding();
                FragmentProductDetailsBinding $r812 = (FragmentProductDetailsBinding) $r712;
                TextView $r1010 = $r812.tvProductFeatureTitle;
                $r1010.setVisibility(8);
            } else {
                InterfaceC8209a $r713 = requireBinding();
                FragmentProductDetailsBinding $r813 = (FragmentProductDetailsBinding) $r713;
                TextView $r1011 = $r813.tvProductFeatureTitle;
                $r1011.setVisibility(0);
            }
        }
        ProductDetailsFeaturesAdapter $r18 = this.productDetailsFeaturesAdapter;
        MarketplaceProductModel $r516 = this.marketplaceProductModel;
        List $r4 = $r516 != null ? $r516.getFeatures() : null;
        Log_OC.append($r4);
        $r18.submitList($r4);
        InterfaceC8209a $r714 = requireBinding();
        FragmentProductDetailsBinding $r814 = (FragmentProductDetailsBinding) $r714;
        RecyclerView $r19 = $r814.rvProductFeatures;
        ProductDetailsFeaturesAdapter $r182 = this.productDetailsFeaturesAdapter;
        $r19.setAdapter($r182);
        Context $r124 = requireContext();
        LinearLayoutManager r25 = new LinearLayoutManager($r124, 1, false);
        $r19.setLayoutManager(r25);
        InterfaceC8209a $r715 = requireBinding();
        FragmentProductDetailsBinding $r815 = (FragmentProductDetailsBinding) $r715;
        LayoutBottomButtonBinding $r21 = $r815.inBottomButton;
        ViewGroup $r22 = $r21.tvProceedBtn;
        ViewGroup r27 = $r22;
        r27.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productDetails.fragment.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductDetailsFragment $r23 = ProductDetailsFragment.this;
                ProductDetailsFragment.m41622setViews$lambda6($r23, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-6  reason: not valid java name */
    public static final void m41622setViews$lambda6(ProductDetailsFragment productDetailsFragment, View view) {
        Log_OC.getArray(productDetailsFragment, "this$0");
        boolean $z0 = productDetailsFragment.isPlanProduct;
        if (!$z0) {
            MarketplaceProductActivity $r4 = productDetailsFragment.marketplaceProductActivity;
            if ($r4 != null) {
                ProductDetailsFragment$setViews$2$2 $r6 = new ProductDetailsFragment$setViews$2$2(productDetailsFragment);
                ContextExtKt.launchActivity$default((Context) $r4, false, MarketplaceLookupActivity.class, (InterfaceC11767l) $r6, 1, (Object) null);
                return;
            }
            Log_OC.LogError("marketplaceProductActivity");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        }
        PlanAmountProperty $r3 = productDetailsFragment.planAmountProperty;
        if ($r3 == null) {
            FragmentActivity $r0 = productDetailsFragment.requireActivity();
            Log_OC.loadImage($r0, "requireActivity()");
            ContextExtKt.toast($r0, "Select a plan to proceed", 0);
            return;
        }
        MarketplaceProductActivity $r42 = productDetailsFragment.marketplaceProductActivity;
        if ($r42 != null) {
            ProductDetailsFragment$setViews$2$1 $r5 = new ProductDetailsFragment$setViews$2$1(productDetailsFragment);
            ContextExtKt.launchActivity$default((Context) $r42, false, MarketplaceLookupActivity.class, (InterfaceC11767l) $r5, 1, (Object) null);
            return;
        }
        Log_OC.LogError("marketplaceProductActivity");
        NullPointerException r72 = new NullPointerException("Null throw statement replaced by Soot");
        throw r72;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ProductDetailsLiveData $r2 = (ProductDetailsLiveData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x0052 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.p036v2.productDetails.viewData.ProductDetailsLiveData r27) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productDetails.fragment.ProductDetailsFragment.applyViewData(ai.kudi.agent.v2.productDetails.viewData.ProductDetailsLiveData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ProductDetailsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected ProductDetailsViewModel createViewModel() {
        ProductDetailsViewModel $r1 = getProductDetailsViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductDetailsViewModel getProductDetailsViewModel() {
        ProductDetailsViewModel $r1 = this.productDetailsViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("productDetailsViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ProductDetailsViewModel.class;
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
        FragmentProductDetailsBinding $r4 = FragmentProductDetailsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        initializeData();
        setToolbar();
        setViews();
    }

    public final void setProductDetailsViewModel(ProductDetailsViewModel productDetailsViewModel) {
        Log_OC.getArray(productDetailsViewModel, "<set-?>");
        this.productDetailsViewModel = productDetailsViewModel;
    }
}
