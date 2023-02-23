package ai.kudi.agent.p036v2.common.view.activities;

import ai.kudi.agent.MarketplaceComponent;
import ai.kudi.agent.collections.databinding.ActivityMarketPlaceBinding;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.p036v2.common.archives.PlanAmountField;
import ai.kudi.agent.p036v2.common.archives.PlanAmountProperty;
import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.view.viewData.MarketplaceLookupViewData;
import ai.kudi.agent.p036v2.common.view.viewModels.LookupObservables;
import ai.kudi.agent.p036v2.common.view.viewModels.MarketplaceLookupViewModel;
import ai.kudi.agent.p036v2.productLookup.fragment.ProductLookupFragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import androidx.lifecycle.C1554f0;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p557z.C13725q0;
import p201g.p270x.InterfaceC8209a;
/* compiled from: MarketplaceLookupActivity.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "Lai/kudi/agent/v2/common/view/activities/BaseMarketplaceActivity;", "Lai/kudi/agent/v2/common/view/viewModels/MarketplaceLookupViewModel;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceLookupViewData;", "()V", "activityBinding", "Lai/kudi/agent/collections/databinding/ActivityMarketPlaceBinding;", "getActivityBinding", "()Lai/kudi/agent/collections/databinding/ActivityMarketPlaceBinding;", "lookupObservables", "Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "getLookupObservables", "()Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "lookupObservables$delegate", "Lkotlin/Lazy;", "marketplaceLookupSubcomponent", "Lai/kudi/agent/v2/common/di/components/lookup/MarketplaceProductLookupSubComponent;", "getMarketplaceLookupSubcomponent", "()Lai/kudi/agent/v2/common/di/components/lookup/MarketplaceProductLookupSubComponent;", "setMarketplaceLookupSubcomponent", "(Lai/kudi/agent/v2/common/di/components/lookup/MarketplaceProductLookupSubComponent;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.activities.MarketplaceLookupActivity */
/* loaded from: classes.dex */
public final class MarketplaceLookupActivity extends BaseMarketplaceActivity<MarketplaceLookupViewModel, MarketplaceLookupViewData> {
    public static final String ARGS_AGENT_WALLET_ID = "ARGS_AGENT_WALLET_ID";
    public static final String ARGS_AMOUNT_TYPE = "ARGS_AMOUNT_TYPE";
    public static final String ARGS_COLLECTION_AMOUNT = "ARGS_COLLECTION_AMOUNT";
    public static final String ARGS_MARKETPLACE_ID = "ARGS_MARKETPLACE_ID";
    public static final String ARGS_MARKETPLACE_PRODUCT_CODE = "ARGS_MARKETPLACE_PRODUCT_CODE";
    public static final String ARGS_PLAN_AMOUNT_FIELD = "ARGS_PLAN_AMOUNT_TYPE";
    public static final Companion Companion;
    private final InterfaceC11824h lookupObservables$delegate;
    public MarketplaceProductLookupSubComponent marketplaceLookupSubcomponent;

    /* compiled from: MarketplaceLookupActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity$Companion;", "", "()V", MarketplaceLookupActivity.ARGS_AGENT_WALLET_ID, "", MarketplaceLookupActivity.ARGS_AMOUNT_TYPE, MarketplaceLookupActivity.ARGS_COLLECTION_AMOUNT, MarketplaceLookupActivity.ARGS_MARKETPLACE_ID, MarketplaceLookupActivity.ARGS_MARKETPLACE_PRODUCT_CODE, "ARGS_PLAN_AMOUNT_FIELD", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.activities.MarketplaceLookupActivity$Companion */
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
    public MarketplaceLookupActivity() {
        MarketplaceLookupActivity$special$$inlined$viewModels$default$1 $r1 = new MarketplaceLookupActivity$special$$inlined$viewModels$default$1(this);
        InterfaceC11863b $r4 = C11813x.m10316b(LookupObservables.class);
        MarketplaceLookupActivity$special$$inlined$viewModels$default$2 $r3 = new MarketplaceLookupActivity$special$$inlined$viewModels$default$2(this);
        C1554f0 $r2 = new C1554f0($r4, $r3, $r1);
        this.lookupObservables$delegate = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final LookupObservables getLookupObservables() {
        InterfaceC11824h $r2 = this.lookupObservables$delegate;
        Object $r1 = $r2.getValue();
        LookupObservables $r3 = (LookupObservables) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        MarketplaceLookupViewData $r2 = (MarketplaceLookupViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(MarketplaceLookupViewData marketplaceLookupViewData) {
        Log_OC.getArray(marketplaceLookupViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        MarketplaceLookupViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public MarketplaceLookupViewModel createViewModel() {
        MarketplaceLookupViewModel $r1 = new MarketplaceLookupViewModel();
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
    public final MarketplaceProductLookupSubComponent getMarketplaceLookupSubcomponent() {
        MarketplaceProductLookupSubComponent $r1 = this.marketplaceLookupSubcomponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("marketplaceLookupSubcomponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return MarketplaceLookupViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity, ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected void onCreate(Bundle bundle) {
        Map $r12;
        MarketplaceComponent $r2 = getMarketplaceComponent();
        MarketplaceProductLookupSubComponent.Factory $r3 = $r2.marketplaceLookupSubcomponents();
        MarketplaceProductLookupSubComponent $r4 = $r3.create();
        setMarketplaceLookupSubcomponent($r4);
        super.onCreate(bundle);
        Intent $r5 = getActivityIntent();
        String $r6 = $r5.getStringExtra(ARGS_MARKETPLACE_PRODUCT_CODE);
        if ($r6 != null) {
            LookupObservables $r7 = getLookupObservables();
            Intent $r52 = getActivityIntent();
            String $r62 = $r52.getStringExtra(ARGS_MARKETPLACE_PRODUCT_CODE);
            Log_OC.append($r62);
            Log_OC.loadImage($r62, "getActivityIntent().getStringExtra(\n                    ARGS_MARKETPLACE_PRODUCT_CODE\n                )!!");
            $r7.setProductCode($r62);
        }
        Intent $r53 = getActivityIntent();
        String $r63 = $r53.getStringExtra(ARGS_COLLECTION_AMOUNT);
        if ($r63 != null) {
            LookupObservables $r72 = getLookupObservables();
            Intent $r54 = getActivityIntent();
            String $r64 = $r54.getStringExtra(ARGS_COLLECTION_AMOUNT);
            Log_OC.append($r64);
            Log_OC.loadImage($r64, "getActivityIntent().getStringExtra(\n                    ARGS_COLLECTION_AMOUNT\n                )!!");
            $r72.setCollectionAmount($r64);
        }
        Intent $r55 = getActivityIntent();
        String $r65 = $r55.getStringExtra(ARGS_MARKETPLACE_ID);
        if ($r65 != null) {
            LookupObservables $r73 = getLookupObservables();
            Intent $r56 = getActivityIntent();
            String $r66 = $r56.getStringExtra(ARGS_MARKETPLACE_ID);
            Log_OC.append($r66);
            Log_OC.loadImage($r66, "getActivityIntent().getStringExtra(ARGS_MARKETPLACE_ID)!!");
            $r73.setProductID($r66);
        }
        Intent $r57 = getActivityIntent();
        String $r67 = $r57.getStringExtra(ARGS_AMOUNT_TYPE);
        if ($r67 != null) {
            LookupObservables $r74 = getLookupObservables();
            Intent $r58 = getActivityIntent();
            String $r68 = $r58.getStringExtra(ARGS_AMOUNT_TYPE);
            Log_OC.append($r68);
            Log_OC.loadImage($r68, "getActivityIntent().getStringExtra(ARGS_AMOUNT_TYPE)!!");
            $r74.setAmountType($r68);
        }
        Intent $r59 = getActivityIntent();
        String $r69 = $r59.getStringExtra(ARGS_AGENT_WALLET_ID);
        if ($r69 != null) {
            LookupObservables $r75 = getLookupObservables();
            Intent $r510 = getActivityIntent();
            String $r610 = $r510.getStringExtra(ARGS_AGENT_WALLET_ID);
            Log_OC.append($r610);
            Log_OC.loadImage($r610, "getActivityIntent().getStringExtra(ARGS_AGENT_WALLET_ID)!!");
            $r75.setWalletId($r610);
        }
        Intent $r511 = getActivityIntent();
        if ($r511.getParcelableExtra(ARGS_PLAN_AMOUNT_FIELD) != null) {
            Intent $r512 = getActivityIntent();
            Parcelable $r8 = $r512.getParcelableExtra(ARGS_PLAN_AMOUNT_FIELD);
            Log_OC.append($r8);
            Log_OC.loadImage($r8, "getActivityIntent().getParcelableExtra<PlanAmountProperty>(ARGS_PLAN_AMOUNT_FIELD)!!");
            PlanAmountProperty $r9 = (PlanAmountProperty) $r8;
            String $r611 = $r9.getKey();
            PlanAmountField $r10 = $r9.getPlanAmountField();
            C13287o $r11 = C13664u.m4227a($r611, $r10);
            $r12 = C13725q0.m3897g($r11);
            LookupObservables $r76 = getLookupObservables();
            $r76.setPlanAmountMap($r12);
        }
        if (bundle == null) {
            ProductLookupFragment.Companion $r13 = ProductLookupFragment.Companion;
            ProductLookupFragment $r14 = $r13.newInstance();
            startFragment($r14, true);
        }
    }

    public final void setMarketplaceLookupSubcomponent(MarketplaceProductLookupSubComponent marketplaceProductLookupSubComponent) {
        Log_OC.getArray(marketplaceProductLookupSubComponent, "<set-?>");
        this.marketplaceLookupSubcomponent = marketplaceProductLookupSubComponent;
    }
}
