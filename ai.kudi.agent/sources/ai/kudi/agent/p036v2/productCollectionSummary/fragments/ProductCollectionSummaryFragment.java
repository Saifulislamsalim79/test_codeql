package ai.kudi.agent.p036v2.productCollectionSummary.fragments;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductLookupSummaryBinding;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.utils.MarketplaceCustomDialogKt;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.common.view.viewModels.LookupObservables;
import ai.kudi.agent.p036v2.productCollectionSummary.adapter.ProductLookupSummaryAdapter;
import ai.kudi.agent.p036v2.productCollectionSummary.viewData.ProductCollectionSummaryViewData;
import ai.kudi.agent.p036v2.productCollectionSummary.viewModel.ProductCollectionSummaryViewModel;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1483g0;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p557z.C13727r0;
import p201g.p270x.InterfaceC8209a;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProductCollectionSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001GB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003H\u0014J\b\u00100\u001a\u00020\u0002H\u0014J\b\u00101\u001a\u00020.H\u0002J\b\u00102\u001a\u00020.H\u0002J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0014J\u0010\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u0006H\u0002J\u0012\u00107\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u000109H\u0002J\b\u0010:\u001a\u00020.H\u0016J\u0012\u0010;\u001a\u00020.2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020@H\u0016J\u001a\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020C2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010D\u001a\u00020.H\u0016J\b\u0010E\u001a\u00020.H\u0002J\b\u0010F\u001a\u00020.H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, m10421d2 = {"Lai/kudi/agent/v2/productCollectionSummary/fragments/ProductCollectionSummaryFragment;", "Lai/kudi/agent/v2/common/view/fragment/BaseMarketplaceSummaryFragment;", "Lai/kudi/agent/v2/productCollectionSummary/viewModel/ProductCollectionSummaryViewModel;", "Lai/kudi/agent/v2/productCollectionSummary/viewData/ProductCollectionSummaryViewData;", "()V", "agentWalletId", "", "allProductProperties", "", "", "amountType", "collectionAmount", "locationTracker", "Lai/kudi/agent/core/util/LocationUtil;", "lookupDetails", "", "mapOfFiles", "marketplaceCollectionSummaryViewModel", "getMarketplaceCollectionSummaryViewModel", "()Lai/kudi/agent/v2/productCollectionSummary/viewModel/ProductCollectionSummaryViewModel;", "setMarketplaceCollectionSummaryViewModel", "(Lai/kudi/agent/v2/productCollectionSummary/viewModel/ProductCollectionSummaryViewModel;)V", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "getMarketplaceLookupActivity", "()Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "setMarketplaceLookupActivity", "(Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;)V", "marketplaceProductSummaryAdapter", "Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;", "getMarketplaceProductSummaryAdapter", "()Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;", "setMarketplaceProductSummaryAdapter", "(Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;)V", "observables", "Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "getObservables", "()Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "observables$delegate", "Lkotlin/Lazy;", "otherDetails", "productCode", "retryCount", "", "totalPaymentSummary", "applyViewData", "", "viewData", "createViewModel", "displayLocationAwareness", "displayLocationNotification", "getVMType", "Ljava/lang/Class;", "handleDialogActions", "response", "handleError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "initializeData", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "performButtonAction", "requestLocation", "setToolbar", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment */
/* loaded from: classes.dex */
public final class ProductCollectionSummaryFragment extends BaseMarketplaceSummaryFragment<ProductCollectionSummaryViewModel, ProductCollectionSummaryViewData> {
    private static final String ARGS_MARKET_PLACE_SUMMARY_AMOUNT = "ARGS_MARKET_PLACE_AMOUNT";
    public static final Companion Companion;
    private String agentWalletId;
    private Map<String, Object> allProductProperties;
    private String amountType;
    private LocationUtil locationTracker;
    private Map<String, String> lookupDetails;
    private Map<String, String> mapOfFiles;
    public ProductCollectionSummaryViewModel marketplaceCollectionSummaryViewModel;
    private MarketplaceLookupActivity marketplaceLookupActivity;
    private ProductLookupSummaryAdapter marketplaceProductSummaryAdapter;
    private final InterfaceC11824h observables$delegate;
    private Map<String, String> otherDetails;
    private int retryCount;
    private Map<String, String> totalPaymentSummary;
    private String collectionAmount = "";
    private String productCode = "";

    /* compiled from: ProductCollectionSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/v2/productCollectionSummary/fragments/ProductCollectionSummaryFragment$Companion;", "", "()V", "ARGS_MARKET_PLACE_SUMMARY_AMOUNT", "", "newInstance", "Lai/kudi/agent/v2/productCollectionSummary/fragments/ProductCollectionSummaryFragment;", TransactionField.AMOUNT, "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment$Companion */
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
        public final ProductCollectionSummaryFragment newInstance(String str) {
            Log_OC.getArray(str, TransactionField.AMOUNT);
            ProductCollectionSummaryFragment $r3 = new ProductCollectionSummaryFragment();
            Bundle $r1 = new Bundle();
            $r1.putString(ProductCollectionSummaryFragment.ARGS_MARKET_PLACE_SUMMARY_AMOUNT, str);
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
    public ProductCollectionSummaryFragment() {
        Map $r2;
        Map $r22;
        $r2 = C13727r0.m3881k();
        this.lookupDetails = $r2;
        $r22 = C13727r0.m3881k();
        this.otherDetails = $r22;
        LinkedHashMap $r3 = new LinkedHashMap();
        this.totalPaymentSummary = $r3;
        LinkedHashMap $r32 = new LinkedHashMap();
        this.allProductProperties = $r32;
        this.agentWalletId = "";
        LinkedHashMap $r33 = new LinkedHashMap();
        this.mapOfFiles = $r33;
        this.amountType = "";
        InterfaceC11863b $r4 = C11813x.m10316b(LookupObservables.class);
        C0700xcb0f68ff $r5 = new C0700xcb0f68ff(this);
        C0701xcb0f6900 $r1 = new C0701xcb0f6900(this);
        InterfaceC11824h $r6 = C1483g0.m35752a(this, $r4, $r5, $r1);
        this.observables$delegate = $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displayLocationAwareness() {
        int $i0 = R$string.location_notification;
        String $r4 = getString($i0);
        Log_OC.loadImage($r4, "getString(R.string.location_notification)");
        CustomDialog.Companion $r1 = CustomDialog.Companion;
        ProductCollectionSummaryFragment$displayLocationAwareness$1 $r2 = new ProductCollectionSummaryFragment$displayLocationAwareness$1(this);
        ProductCollectionSummaryFragment$displayLocationAwareness$2 $r3 = new ProductCollectionSummaryFragment$displayLocationAwareness$2(this);
        MarketplaceLookupActivity $r5 = getMarketplaceLookupActivity();
        Log_OC.append($r5);
        $r1.show("Collection Transaction", $r4, "Ok", "Cancel", $r2, $r3, $r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void displayLocationNotification() {
        if (getActivity() == null) {
            return;
        }
        FragmentActivity $r1 = requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        LocationUtil $r2 = new LocationUtil($r1);
        this.locationTracker = $r2;
        Log_OC.append($r2);
        boolean $z0 = $r2.isGpsOn();
        if ($z0) {
            Object[] $r3 = new Object[0];
            Timber.tag("Location is enabled", $r3);
            return;
        }
        LocationUtil $r22 = this.locationTracker;
        if ($r22 == null) {
            return;
        }
        $r22.onGpsWithoutSetting();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final LookupObservables getObservables() {
        InterfaceC11824h $r2 = this.observables$delegate;
        Object $r1 = $r2.getValue();
        LookupObservables $r3 = (LookupObservables) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleDialogActions(String $r1) {
        boolean $z0 = Log_OC.append($r1, "PROCESSING");
        if ($z0) {
            Context $r3 = requireContext();
            Log_OC.loadImage($r3, "requireContext()");
            Resources $r4 = getResources();
            int $i0 = R$string.close;
            String $r12 = $r4.getString($i0);
            Log_OC.loadImage($r12, "resources.getString(R.string.close)");
            Resources $r42 = getResources();
            int $i02 = R$string.transaction_successful;
            String $r5 = $r42.getString($i02);
            Log_OC.loadImage($r5, "resources.getString(R.string.transaction_successful)");
            int $i03 = R$drawable.success_alert;
            ProductCollectionSummaryFragment$handleDialogActions$1 $r6 = new ProductCollectionSummaryFragment$handleDialogActions$1(this);
            MarketplaceCustomDialogKt.marketplaceCustomDialog($r3, $r12, $r5, false, $i03, $r6);
            return;
        }
        boolean $z02 = Log_OC.append($r1, "PAYMENT_ERROR");
        if ($z02) {
            Context $r32 = requireContext();
            Log_OC.loadImage($r32, "requireContext()");
            Resources $r43 = getResources();
            int $i04 = R$string.close;
            String $r13 = $r43.getString($i04);
            Log_OC.loadImage($r13, "resources.getString(R.string.close)");
            Resources $r44 = getResources();
            int $i05 = R$string.no_enough_funds;
            String $r52 = $r44.getString($i05);
            Log_OC.loadImage($r52, "resources.getString(R.string.no_enough_funds)");
            int $i06 = R$drawable.error_alert;
            ProductCollectionSummaryFragment$handleDialogActions$2 $r7 = new ProductCollectionSummaryFragment$handleDialogActions$2(this);
            MarketplaceCustomDialogKt.marketplaceCustomDialog($r32, $r13, $r52, false, $i06, $r7);
            return;
        }
        int $i07 = this.retryCount;
        if ($i07 <= 3) {
            Context $r33 = requireContext();
            Log_OC.loadImage($r33, "requireContext()");
            Resources $r45 = getResources();
            int $i08 = R$string.retry;
            String $r14 = $r45.getString($i08);
            Log_OC.loadImage($r14, "resources.getString(R.string.retry)");
            Resources $r46 = getResources();
            int $i09 = R$string.transaction_failed;
            String $r53 = $r46.getString($i09);
            Log_OC.loadImage($r53, "resources.getString(R.string.transaction_failed)");
            int $i010 = R$drawable.error_alert;
            ProductCollectionSummaryFragment$handleDialogActions$3 $r2 = new ProductCollectionSummaryFragment$handleDialogActions$3(this);
            MarketplaceCustomDialogKt.marketplaceCustomDialog($r33, $r14, $r53, true, $i010, $r2);
            return;
        }
        Context $r34 = requireContext();
        Log_OC.loadImage($r34, "requireContext()");
        Resources $r47 = getResources();
        int $i011 = R$string.close;
        String $r15 = $r47.getString($i011);
        Log_OC.loadImage($r15, "resources.getString(R.string.close)");
        Resources $r48 = getResources();
        int $i012 = R$string.transaction_failed;
        String $r54 = $r48.getString($i012);
        Log_OC.loadImage($r54, "resources.getString(R.string.transaction_failed)");
        int $i013 = R$drawable.error_alert;
        ProductCollectionSummaryFragment$handleDialogActions$4 $r8 = new ProductCollectionSummaryFragment$handleDialogActions$4(this);
        MarketplaceCustomDialogKt.marketplaceCustomDialog($r34, $r15, $r54, false, $i013, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleError(Error error) {
        if (error == null) {
            return;
        }
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        String $r3 = error.getGenericError();
        ContextExtKt.toast($r2, $r3, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performButtonAction$lambda-1  reason: not valid java name */
    public static final void m41575performButtonAction$lambda1(ProductCollectionSummaryFragment productCollectionSummaryFragment, String str, Bundle bundle) {
        Log_OC.getArray(productCollectionSummaryFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        LocationUtil $r4 = productCollectionSummaryFragment.locationTracker;
        if ($r4 == null) {
            return;
        }
        MarketplaceLookupActivity $r5 = productCollectionSummaryFragment.getMarketplaceLookupActivity();
        Log_OC.append($r5);
        C4107a $r6 = C4109b.m28503a($r5);
        Log_OC.loadImage($r6, "getFusedLocationProviderClient(marketplaceLookupActivity!!)");
        ProductCollectionSummaryFragment$performButtonAction$1$1 $r2 = new ProductCollectionSummaryFragment$performButtonAction$1$1(productCollectionSummaryFragment);
        LocationUtil.getLastLocation$default($r4, $r6, 0, $r2, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestLocation() {
        FragmentActivity $r1 = requireActivity();
        SharedPreferences $r2 = $r1.getSharedPreferences(LocationUtil.LOCATION_PREFERENCE, 0);
        boolean $z0 = $r2.getBoolean(LocationUtil.IS_LOCATION_ALLOWED_PREFERENCE_TRANSFER, false);
        if ($z0) {
            displayLocationNotification();
        } else {
            displayLocationAwareness();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ProductCollectionSummaryViewData $r2 = (ProductCollectionSummaryViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.p036v2.productCollectionSummary.viewData.ProductCollectionSummaryViewData r13) {
        /*
            r12 = this;
            java.lang.String r0 = "viewData"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r0)
            boolean r1 = r13.getLoading()
            if (r1 == 0) goto L19
            g.x.a r2 = r12.requireBinding()
            r4 = r2
            ai.kudi.agent.collections.databinding.FragmentProductLookupSummaryBinding r4 = (ai.kudi.agent.collections.databinding.FragmentProductLookupSummaryBinding) r4
            r3 = r4
            ai.kudi.dip.library.button.KudiButton r5 = r3.tvProceedBtn
            r5.m38032f()
            goto L26
        L19:
            g.x.a r2 = r12.requireBinding()
            r6 = r2
            ai.kudi.agent.collections.databinding.FragmentProductLookupSummaryBinding r6 = (ai.kudi.agent.collections.databinding.FragmentProductLookupSummaryBinding) r6
            r3 = r6
            ai.kudi.dip.library.button.KudiButton r5 = r3.tvProceedBtn
            r5.m38033e()
        L26:
            java.util.Map r7 = r13.getMarketplaceSummary()
            if (r7 == 0) goto L35
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L33
            goto L35
        L33:
            r1 = 0
            goto L36
        L35:
            r1 = 1
        L36:
            if (r1 != 0) goto L46
            ai.kudi.agent.v2.productCollectionSummary.adapter.ProductLookupSummaryAdapter r8 = r12.getMarketplaceProductSummaryAdapter()
            if (r8 != 0) goto L3f
            goto L46
        L3f:
            java.util.List r9 = kotlin.p557z.C13721o0.m3974y(r7)
            r8.submitList(r9)
        L46:
            ai.kudi.agent.v2.common.view.viewData.data.Error r10 = r13.getError()
            r12.handleError(r10)
            java.lang.String r11 = r13.getResponseStatusCode()
            if (r11 == 0) goto L56
            r12.handleDialogActions(r11)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment.applyViewData(ai.kudi.agent.v2.productCollectionSummary.viewData.ProductCollectionSummaryViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ProductCollectionSummaryViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected ProductCollectionSummaryViewModel createViewModel() {
        ProductCollectionSummaryViewModel $r1 = getMarketplaceCollectionSummaryViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductCollectionSummaryViewModel getMarketplaceCollectionSummaryViewModel() {
        ProductCollectionSummaryViewModel $r1 = this.marketplaceCollectionSummaryViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("marketplaceCollectionSummaryViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public MarketplaceLookupActivity getMarketplaceLookupActivity() {
        MarketplaceLookupActivity r1 = this.marketplaceLookupActivity;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public ProductLookupSummaryAdapter getMarketplaceProductSummaryAdapter() {
        ProductLookupSummaryAdapter r1 = this.marketplaceProductSummaryAdapter;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ProductCollectionSummaryViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initializeData() {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment.initializeData():void");
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        requestLocation();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        MarketplaceProductLookupSubComponent $r3;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof MarketplaceLookupActivity;
        if ($z0) {
            setMarketplaceLookupActivity((MarketplaceLookupActivity) context);
        }
        MarketplaceLookupActivity $r2 = getMarketplaceLookupActivity();
        if ($r2 == null || ($r3 = $r2.getMarketplaceLookupSubcomponent()) == null) {
            return;
        }
        $r3.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r3 = requireBinding();
        FragmentProductLookupSummaryBinding $r4 = (FragmentProductLookupSummaryBinding) $r3;
        KudiButton $r5 = $r4.tvProceedBtn;
        int $i0 = R$string.make_payment;
        String $r6 = getString($i0);
        Log_OC.loadImage($r6, "getString(R.string.make_payment)");
        $r5.setText($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public void performButtonAction() {
        ProductCollectionSummaryViewModel $r2 = getMarketplaceCollectionSummaryViewModel();
        $r2.makePaymentInitiated();
        FragmentManager $r3 = getChildFragmentManager();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        $r3.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r4, new InterfaceC1523w() { // from class: ai.kudi.agent.v2.productCollectionSummary.fragments.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38143b(String str, Bundle bundle) {
                ProductCollectionSummaryFragment $r32 = ProductCollectionSummaryFragment.this;
                ProductCollectionSummaryFragment.m41575performButtonAction$lambda1($r32, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r6 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        FragmentManager $r32 = getChildFragmentManager();
        ((Chapter) $r6).show($r32, ".AuthDialog.Dialog");
    }

    public final void setMarketplaceCollectionSummaryViewModel(ProductCollectionSummaryViewModel productCollectionSummaryViewModel) {
        Log_OC.getArray(productCollectionSummaryViewModel, "<set-?>");
        this.marketplaceCollectionSummaryViewModel = productCollectionSummaryViewModel;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public void setMarketplaceLookupActivity(MarketplaceLookupActivity marketplaceLookupActivity) {
        this.marketplaceLookupActivity = marketplaceLookupActivity;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public void setMarketplaceProductSummaryAdapter(ProductLookupSummaryAdapter productLookupSummaryAdapter) {
        this.marketplaceProductSummaryAdapter = productLookupSummaryAdapter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public void setToolbar() {
        MarketplaceLookupActivity $r1 = getMarketplaceLookupActivity();
        if ($r1 != null) {
            BaseMarketplaceActivity.setNavigationIcon$default($r1, 0, 1, null);
        }
        MarketplaceLookupActivity $r12 = getMarketplaceLookupActivity();
        if ($r12 != null) {
            int $i0 = R$string.summary;
            String $r2 = getString($i0);
            Log_OC.loadImage($r2, "getString(R.string.summary)");
            $r12.setToolbarTitle($r2);
        }
        MarketplaceLookupActivity $r13 = getMarketplaceLookupActivity();
        if ($r13 != null) {
            $r13.toggleHelpButton(false);
        }
        MarketplaceLookupActivity $r14 = getMarketplaceLookupActivity();
        if ($r14 == null) {
            return;
        }
        ProductCollectionSummaryFragment$setToolbar$1 $r3 = new ProductCollectionSummaryFragment$setToolbar$1(this);
        $r14.setNavigationBehavior($r3);
    }
}
