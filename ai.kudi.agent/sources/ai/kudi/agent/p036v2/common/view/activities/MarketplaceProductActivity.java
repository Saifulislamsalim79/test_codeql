package ai.kudi.agent.p036v2.common.view.activities;

import ai.kudi.agent.MarketplaceComponent;
import ai.kudi.agent.collections.databinding.ActivityMarketPlaceBinding;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent;
import ai.kudi.agent.p036v2.common.view.viewData.MarketplaceProductViewData;
import ai.kudi.agent.p036v2.common.view.viewModels.MarketplaceProductViewModel;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: MarketplaceProductActivity.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/activities/MarketplaceProductActivity;", "Lai/kudi/agent/v2/common/view/activities/BaseMarketplaceActivity;", "Lai/kudi/agent/v2/common/view/viewModels/MarketplaceProductViewModel;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceProductViewData;", "()V", "activityBinding", "Lai/kudi/agent/collections/databinding/ActivityMarketPlaceBinding;", "getActivityBinding", "()Lai/kudi/agent/collections/databinding/ActivityMarketPlaceBinding;", "marketplaceProductSubcomponent", "Lai/kudi/agent/v2/common/di/components/products/MarketplaceProductSubComponent;", "getMarketplaceProductSubcomponent", "()Lai/kudi/agent/v2/common/di/components/products/MarketplaceProductSubComponent;", "setMarketplaceProductSubcomponent", "(Lai/kudi/agent/v2/common/di/components/products/MarketplaceProductSubComponent;)V", "productsHomeFragment", "Landroidx/fragment/app/Fragment;", "getProductsHomeFragment", "()Landroidx/fragment/app/Fragment;", "productsHomeFragment$delegate", "Lkotlin/Lazy;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.activities.MarketplaceProductActivity */
/* loaded from: classes.dex */
public final class MarketplaceProductActivity extends BaseMarketplaceActivity<MarketplaceProductViewModel, MarketplaceProductViewData> {
    public static final Companion Companion;
    public static final String IS_MARKETPLACE_NEW_FEATURE = "MARKETPLACE_NEW_FEATURE";
    public MarketplaceProductSubComponent marketplaceProductSubcomponent;
    private final InterfaceC11824h productsHomeFragment$delegate;

    /* compiled from: MarketplaceProductActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/activities/MarketplaceProductActivity$Companion;", "", "()V", "IS_MARKETPLACE_NEW_FEATURE", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.activities.MarketplaceProductActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
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
    public MarketplaceProductActivity() {
        InterfaceC11824h $r1;
        MarketplaceProductActivity$productsHomeFragment$2 $r2 = new MarketplaceProductActivity$productsHomeFragment$2(this);
        $r1 = C13218k.m5625b($r2);
        this.productsHomeFragment$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Fragment getProductsHomeFragment() {
        InterfaceC11824h $r2 = this.productsHomeFragment$delegate;
        Object $r1 = $r2.getValue();
        Fragment $r3 = (Fragment) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        MarketplaceProductViewData $r2 = (MarketplaceProductViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(MarketplaceProductViewData marketplaceProductViewData) {
        Log_OC.getArray(marketplaceProductViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        MarketplaceProductViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public MarketplaceProductViewModel createViewModel() {
        MarketplaceProductViewModel $r1 = new MarketplaceProductViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityMarketPlaceBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityMarketPlaceBinding $r2 = ActivityMarketPlaceBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityMarketPlaceBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceProductSubComponent getMarketplaceProductSubcomponent() {
        MarketplaceProductSubComponent $r1 = this.marketplaceProductSubcomponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("marketplaceProductSubcomponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return MarketplaceProductViewModel.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity, ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onCreate(Bundle bundle) {
        MarketplaceComponent $r2 = getMarketplaceComponent();
        MarketplaceProductSubComponent.Factory $r3 = $r2.marketplaceProductSubcomponent();
        MarketplaceProductSubComponent $r4 = $r3.create();
        setMarketplaceProductSubcomponent($r4);
        super.onCreate(bundle);
        if (bundle == null) {
            Fragment $r5 = getProductsHomeFragment();
            startFragment($r5, true);
        }
    }

    public final void setMarketplaceProductSubcomponent(MarketplaceProductSubComponent marketplaceProductSubComponent) {
        Log_OC.getArray(marketplaceProductSubComponent, "<set-?>");
        this.marketplaceProductSubcomponent = marketplaceProductSubComponent;
    }
}
