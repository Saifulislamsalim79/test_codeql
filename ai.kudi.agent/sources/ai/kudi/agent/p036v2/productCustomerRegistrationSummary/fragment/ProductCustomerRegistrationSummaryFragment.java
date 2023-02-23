package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment;

import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductLookupSummaryBinding;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.common.view.dialogs.bottomsheetDialogs.CustomerVerificationDialog;
import ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.common.view.viewModels.LookupObservables;
import ai.kudi.agent.p036v2.productCollectionSummary.adapter.ProductLookupSummaryAdapter;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewModel.ProductCustomerRegistrationSummaryViewModel;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.C1483g0;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import java.util.HashMap;
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
/* compiled from: ProductCustomerRegistrationSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0014J\b\u0010.\u001a\u00020\u0002H\u0014J\b\u0010/\u001a\u00020,H\u0002J\b\u00100\u001a\u00020,H\u0002J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u000202H\u0014J\b\u00103\u001a\u00020,H\u0002J\u0010\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\u000bH\u0002J\u0012\u00106\u001a\u00020,2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\b\u00109\u001a\u00020,H\u0016J\u0012\u0010:\u001a\u00020,2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020,H\u0016J\b\u0010A\u001a\u00020,H\u0002J\b\u0010B\u001a\u00020,H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistrationSummary/fragment/ProductCustomerRegistrationSummaryFragment;", "Lai/kudi/agent/v2/common/view/fragment/BaseMarketplaceSummaryFragment;", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/viewModel/ProductCustomerRegistrationSummaryViewModel;", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/viewData/ProductCustomerRegistrationSummaryViewData;", "()V", "customerVerificationDialog", "Lai/kudi/agent/v2/common/view/dialogs/bottomsheetDialogs/CustomerVerificationDialog;", "locationTracker", "Lai/kudi/agent/core/util/LocationUtil;", "mapOfOnBoardingFiles", "", "", "mapOfRegistrationProperty", "", "", "mapOfSummary", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "getMarketplaceLookupActivity", "()Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "setMarketplaceLookupActivity", "(Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;)V", "marketplaceProductSummaryAdapter", "Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;", "getMarketplaceProductSummaryAdapter", "()Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;", "setMarketplaceProductSummaryAdapter", "(Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;)V", "observable", "Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "getObservable", "()Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "observable$delegate", "Lkotlin/Lazy;", "productCode", "productCustomerRegistrationSummaryViewModel", "getProductCustomerRegistrationSummaryViewModel", "()Lai/kudi/agent/v2/productCustomerRegistrationSummary/viewModel/ProductCustomerRegistrationSummaryViewModel;", "setProductCustomerRegistrationSummaryViewModel", "(Lai/kudi/agent/v2/productCustomerRegistrationSummary/viewModel/ProductCustomerRegistrationSummaryViewModel;)V", "verificationCount", "", "verificationRetryCount", "applyViewData", "", "viewData", "createViewModel", "displayLocationAwareness", "displayLocationNotification", "getVMType", "Ljava/lang/Class;", "handleCustomerVerification", "handleCustomerVerificationError", "errMessage", "handleError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "initializeData", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "performButtonAction", "requestLocation", "setToolbar", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment */
/* loaded from: classes.dex */
public final class ProductCustomerRegistrationSummaryFragment extends BaseMarketplaceSummaryFragment<ProductCustomerRegistrationSummaryViewModel, ProductCustomerRegistrationSummaryViewData> {
    public static final Companion Companion;
    private CustomerVerificationDialog customerVerificationDialog;
    private LocationUtil locationTracker;
    private Map<String, String> mapOfOnBoardingFiles;
    private Map<String, Object> mapOfRegistrationProperty;
    private Map<String, String> mapOfSummary;
    private MarketplaceLookupActivity marketplaceLookupActivity;
    private ProductLookupSummaryAdapter marketplaceProductSummaryAdapter;
    private final InterfaceC11824h observable$delegate;
    private String productCode;
    public ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel;
    private int verificationCount;
    private int verificationRetryCount;

    /* compiled from: ProductCustomerRegistrationSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistrationSummary/fragment/ProductCustomerRegistrationSummaryFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/fragment/ProductCustomerRegistrationSummaryFragment;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment$Companion */
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
        public final ProductCustomerRegistrationSummaryFragment newInstance() {
            ProductCustomerRegistrationSummaryFragment $r1 = new ProductCustomerRegistrationSummaryFragment();
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
    public ProductCustomerRegistrationSummaryFragment() {
        Map $r5;
        HashMap $r3 = new HashMap();
        this.mapOfSummary = $r3;
        LinkedHashMap $r4 = new LinkedHashMap();
        this.mapOfRegistrationProperty = $r4;
        this.productCode = "";
        $r5 = C13727r0.m3881k();
        this.mapOfOnBoardingFiles = $r5;
        InterfaceC11863b $r6 = C11813x.m10316b(LookupObservables.class);
        C0709x7b16f546 $r1 = new C0709x7b16f546(this);
        C0710x7b16f547 $r2 = new C0710x7b16f547(this);
        InterfaceC11824h $r7 = C1483g0.m35752a(this, $r6, $r1, $r2);
        this.observable$delegate = $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displayLocationAwareness() {
        int $i0 = R$string.location_notification;
        String $r4 = getString($i0);
        Log_OC.loadImage($r4, "getString(R.string.location_notification)");
        CustomDialog.Companion $r1 = CustomDialog.Companion;
        C0711x1b54e6ff $r2 = new C0711x1b54e6ff(this);
        C0712x1b54e700 $r3 = new C0712x1b54e700(this);
        MarketplaceLookupActivity $r5 = getMarketplaceLookupActivity();
        Log_OC.append($r5);
        $r1.show("Registration", $r4, "Ok", "Cancel", $r2, $r3, $r5);
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
    private final LookupObservables getObservable() {
        InterfaceC11824h $r2 = this.observable$delegate;
        Object $r1 = $r2.getValue();
        LookupObservables $r3 = (LookupObservables) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleCustomerVerification() {
        Boolean $r2;
        CustomerVerificationDialog $r1;
        CustomerVerificationDialog $r12 = this.customerVerificationDialog;
        if ($r12 != null) {
            if ($r12 == null) {
                $r2 = null;
            } else {
                Fragment r7 = (Fragment) $r12;
                boolean $z0 = r7.isAdded();
                $r2 = Boolean.valueOf($z0);
            }
            Log_OC.append($r2);
            boolean $z02 = $r2.booleanValue();
            if ($z02 && ($r1 = this.customerVerificationDialog) != null) {
                $r1.dismiss();
            }
        }
        C0713xf06da3c2 r5 = new C0713xf06da3c2(this);
        CustomerVerificationDialog r6 = new CustomerVerificationDialog(r5);
        this.customerVerificationDialog = r6;
        if (r6 == null) {
            return;
        }
        FragmentManager $r4 = getChildFragmentManager();
        Chapter r8 = (Chapter) r6;
        r8.show($r4, CustomerVerificationDialog.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleCustomerVerificationError(String str) {
        CustomerVerificationDialog $r2 = this.customerVerificationDialog;
        if ($r2 == null) {
            return;
        }
        $r2.setErrorMessage(str);
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
        ProductCustomerRegistrationSummaryViewData $r2 = (ProductCustomerRegistrationSummaryViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData r28) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment.applyViewData(ai.kudi.agent.v2.productCustomerRegistrationSummary.viewData.ProductCustomerRegistrationSummaryViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ProductCustomerRegistrationSummaryViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected ProductCustomerRegistrationSummaryViewModel createViewModel() {
        ProductCustomerRegistrationSummaryViewModel $r1 = getProductCustomerRegistrationSummaryViewModel();
        return $r1;
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductCustomerRegistrationSummaryViewModel getProductCustomerRegistrationSummaryViewModel() {
        ProductCustomerRegistrationSummaryViewModel $r1 = this.productCustomerRegistrationSummaryViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("productCustomerRegistrationSummaryViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ProductCustomerRegistrationSummaryViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public void initializeData() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentProductLookupSummaryBinding $r2 = (FragmentProductLookupSummaryBinding) $r1;
        KudiButton $r3 = $r2.tvProceedBtn;
        int $i0 = R$string.register;
        String $r4 = getString($i0);
        Log_OC.loadImage($r4, "getString(R.string.register)");
        $r3.setText($r4);
        LookupObservables $r5 = getObservable();
        LiveData $r6 = $r5.getMapOfRegistrationSummary();
        Object $r7 = $r6.getValue();
        if ($r7 != null) {
            LookupObservables $r52 = getObservable();
            LiveData $r62 = $r52.getMapOfRegistrationSummary();
            Object $r72 = $r62.getValue();
            Log_OC.append($r72);
            Log_OC.loadImage($r72, "observable.mapOfRegistrationSummary.value!!");
            Map $r8 = (Map) $r72;
            this.mapOfSummary = $r8;
            ProductCustomerRegistrationSummaryViewModel $r9 = getProductCustomerRegistrationSummaryViewModel();
            Map $r82 = this.mapOfSummary;
            $r9.setProductSummary($r82);
            ProductLookupSummaryAdapter $r10 = new ProductLookupSummaryAdapter();
            setMarketplaceProductSummaryAdapter($r10);
        } else {
            MarketplaceLookupActivity $r11 = getMarketplaceLookupActivity();
            if ($r11 != null) {
                $r11.finish();
            }
        }
        LookupObservables $r53 = getObservable();
        LiveData $r63 = $r53.getProductCode();
        Object $r73 = $r63.getValue();
        if ($r73 != null) {
            LookupObservables $r54 = getObservable();
            LiveData $r64 = $r54.getProductCode();
            Object $r74 = $r64.getValue();
            Log_OC.append($r74);
            Log_OC.loadImage($r74, "observable.productCode.value!!");
            this.productCode = (String) $r74;
        }
        LookupObservables $r55 = getObservable();
        LiveData $r65 = $r55.getMapOfRegistrationProperties();
        Object $r75 = $r65.getValue();
        if ($r75 != null) {
            Map $r83 = this.mapOfRegistrationProperty;
            LookupObservables $r56 = getObservable();
            LiveData $r66 = $r56.getMapOfRegistrationProperties();
            Object $r76 = $r66.getValue();
            Log_OC.append($r76);
            Log_OC.loadImage($r76, "observable.mapOfRegistrationProperties.value!!");
            Map $r12 = (Map) $r76;
            $r83.putAll($r12);
        }
        LookupObservables $r57 = getObservable();
        LiveData $r67 = $r57.getMapOfRegistrationFiles();
        Object $r77 = $r67.getValue();
        if ($r77 != null) {
            LookupObservables $r58 = getObservable();
            LiveData $r68 = $r58.getMapOfRegistrationFiles();
            Object $r78 = $r68.getValue();
            Log_OC.append($r78);
            Log_OC.loadImage($r78, "observable.mapOfRegistrationFiles.value!!");
            Map $r84 = (Map) $r78;
            this.mapOfOnBoardingFiles = $r84;
        }
        Map $r85 = this.mapOfOnBoardingFiles;
        boolean $z0 = $r85.isEmpty();
        if (!$z0) {
            Map $r86 = this.mapOfRegistrationProperty;
            Map $r122 = this.mapOfOnBoardingFiles;
            $r86.putAll($r122);
        }
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
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public void performButtonAction() {
        LocationUtil $r2 = this.locationTracker;
        if ($r2 != null) {
            Context $r3 = requireContext();
            C4107a $r4 = C4109b.m28502b($r3);
            Log_OC.loadImage($r4, "getFusedLocationProviderClient(requireContext())");
            ProductCustomerRegistrationSummaryFragment$performButtonAction$1 $r1 = new ProductCustomerRegistrationSummaryFragment$performButtonAction$1(this);
            LocationUtil.getLastLocation$default($r2, $r4, 0, $r1, 2, null);
        }
        int $i0 = this.verificationCount;
        if ($i0 > 0) {
            this.verificationCount = 0;
        }
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public void setMarketplaceLookupActivity(MarketplaceLookupActivity marketplaceLookupActivity) {
        this.marketplaceLookupActivity = marketplaceLookupActivity;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceSummaryFragment
    public void setMarketplaceProductSummaryAdapter(ProductLookupSummaryAdapter productLookupSummaryAdapter) {
        this.marketplaceProductSummaryAdapter = productLookupSummaryAdapter;
    }

    public final void setProductCustomerRegistrationSummaryViewModel(ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel) {
        Log_OC.getArray(productCustomerRegistrationSummaryViewModel, "<set-?>");
        this.productCustomerRegistrationSummaryViewModel = productCustomerRegistrationSummaryViewModel;
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
        ProductCustomerRegistrationSummaryFragment$setToolbar$1 $r3 = new ProductCustomerRegistrationSummaryFragment$setToolbar$1(this);
        $r14.setNavigationBehavior($r3);
    }
}
