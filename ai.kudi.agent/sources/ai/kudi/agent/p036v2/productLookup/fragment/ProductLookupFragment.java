package ai.kudi.agent.p036v2.productLookup.fragment;

import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductLookupBinding;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.common.view.viewModels.LookupObservables;
import ai.kudi.agent.p036v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment;
import ai.kudi.agent.p036v2.productLookup.viewData.MarketplaceProductLookupViewData;
import ai.kudi.agent.p036v2.productLookup.viewModel.MarketplaceProductLookupViewModel;
import ai.kudi.agent.p036v2.productLookupDetails.fragment.ProductLookupDetailsFragment;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.C1483g0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
/* compiled from: ProductLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001fB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0003H\u0014J\b\u0010C\u001a\u00020\u0002H\u0014J\b\u0010D\u001a\u00020@H\u0002J\b\u0010E\u001a\u00020@H\u0002J\b\u0010F\u001a\u00020@H\u0016J\u001a\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020KH\u0014J\u0012\u0010L\u001a\u00020@2\b\u0010M\u001a\u0004\u0018\u00010NH\u0002J\b\u0010O\u001a\u00020@H\u0016J\u0010\u0010P\u001a\u00020@2\u0006\u0010Q\u001a\u00020\u0006H\u0002J\b\u0010R\u001a\u00020@H\u0016J\b\u0010S\u001a\u00020@H\u0002J\u0012\u0010T\u001a\u00020@2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\u0010\u0010W\u001a\u00020@2\u0006\u0010X\u001a\u00020YH\u0016J\u001a\u0010Z\u001a\u00020@2\u0006\u0010[\u001a\u00020\\2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J@\u0010]\u001a\u00020@2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000/2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060/2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u0006H\u0016J\b\u0010a\u001a\u00020@H\u0002J\b\u0010b\u001a\u00020@H\u0016J\u0018\u0010c\u001a\u00020@2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R,\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130)X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00102\u001a\u0004\u0018\u000103X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006g"}, m10421d2 = {"Lai/kudi/agent/v2/productLookup/fragment/ProductLookupFragment;", "Lai/kudi/agent/v2/common/view/fragment/BaseMarketplaceLookupFragment;", "Lai/kudi/agent/v2/productLookup/viewModel/MarketplaceProductLookupViewModel;", "Lai/kudi/agent/v2/productLookup/viewData/MarketplaceProductLookupViewData;", "()V", "associatedFieldId", "", "getAssociatedFieldId", "()Ljava/lang/String;", "setAssociatedFieldId", "(Ljava/lang/String;)V", "associationFieldName", "collectionAmount", "collectionAmountType", "getCollectionAmountType", "setCollectionAmountType", "errorCount", "", "fields", "", "Lai/kudi/dip/library/bottomSheets/models/Field;", "getFields", "()Ljava/util/List;", "setFields", "(Ljava/util/List;)V", "loadCount", "loading", "", "locationTracker", "Lai/kudi/agent/core/util/LocationUtil;", "locations", "Lai/kudi/agent/register/data/models/LocationModel;", "getLocations", "setLocations", "lookupObservables", "Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "getLookupObservables", "()Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "lookupObservables$delegate", "Lkotlin/Lazy;", "mapOfAssociatedFields", "", "getMapOfAssociatedFields", "()Ljava/util/Map;", "setMapOfAssociatedFields", "(Ljava/util/Map;)V", "mapOfProperties", "", "", "marketplaceId", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "getMarketplaceLookupActivity", "()Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "setMarketplaceLookupActivity", "(Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;)V", "marketplaceLookupViewModel", "getMarketplaceLookupViewModel", "()Lai/kudi/agent/v2/productLookup/viewModel/MarketplaceProductLookupViewModel;", "setMarketplaceLookupViewModel", "(Lai/kudi/agent/v2/productLookup/viewModel/MarketplaceProductLookupViewModel;)V", "onBoardingFieldList", "productCode", "animateLoader", "", "applyViewData", "viewData", "createViewModel", "displayLocationAwareness", "displayLocationNotification", "fetchLocation", "getAssociatedFields", "id", "fieldName", "getVMType", "Ljava/lang/Class;", "handleError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "handleNavigation", "handleResponseMessage", MetricTracker.Object.MESSAGE, "initializeData", "navigateToDetailsScreen", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "performActionWithData", "propertiesMap", "mapOfSummary", "amountKey", "requestLocation", "setToolbar", "uploadFile", "filePath", "field", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookup.fragment.ProductLookupFragment */
/* loaded from: classes.dex */
public final class ProductLookupFragment extends BaseMarketplaceLookupFragment<MarketplaceProductLookupViewModel, MarketplaceProductLookupViewData> {
    public static final Companion Companion;
    private String associatedFieldId;
    private String associationFieldName;
    private String collectionAmount;
    private String collectionAmountType;
    private int errorCount;
    private List<Field> fields;
    private int loadCount;
    private boolean loading;
    private LocationUtil locationTracker;
    private List<LocationModel> locations;
    private final InterfaceC11824h lookupObservables$delegate;
    private Map<String, List<Field>> mapOfAssociatedFields;
    private Map<String, ? extends Object> mapOfProperties;
    private String marketplaceId;
    private MarketplaceLookupActivity marketplaceLookupActivity;
    public MarketplaceProductLookupViewModel marketplaceLookupViewModel;
    private List<Field> onBoardingFieldList;
    private String productCode;

    /* compiled from: ProductLookupFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/productLookup/fragment/ProductLookupFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/v2/productLookup/fragment/ProductLookupFragment;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productLookup.fragment.ProductLookupFragment$Companion */
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
        public final ProductLookupFragment newInstance() {
            ProductLookupFragment $r1 = new ProductLookupFragment();
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
    public ProductLookupFragment() {
        Map $r7;
        InterfaceC11863b $r2 = C11813x.m10316b(LookupObservables.class);
        C0725xa43b2a0f $r3 = new C0725xa43b2a0f(this);
        C0726xa43b2a10 $r1 = new C0726xa43b2a10(this);
        InterfaceC11824h $r4 = C1483g0.m35752a(this, $r2, $r3, $r1);
        this.lookupObservables$delegate = $r4;
        this.collectionAmountType = "";
        ArrayList $r5 = new ArrayList();
        this.locations = $r5;
        LinkedHashMap $r6 = new LinkedHashMap();
        this.mapOfAssociatedFields = $r6;
        this.associatedFieldId = "";
        this.loading = true;
        this.collectionAmount = "";
        this.marketplaceId = "";
        this.productCode = "";
        this.associationFieldName = "";
        $r7 = C13727r0.m3881k();
        this.mapOfProperties = $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void animateLoader() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentProductLookupBinding $r2 = (FragmentProductLookupBinding) $r1;
        CamomileSpinner $r3 = $r2.ivProductLookupLoader;
        $r3.m32588f();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displayLocationAwareness() {
        int $i0 = R$string.location_notification;
        String $r4 = getString($i0);
        Log_OC.loadImage($r4, "getString(R.string.location_notification)");
        CustomDialog.Companion $r1 = CustomDialog.Companion;
        ProductLookupFragment$displayLocationAwareness$1 $r2 = new ProductLookupFragment$displayLocationAwareness$1(this);
        ProductLookupFragment$displayLocationAwareness$2 $r3 = new ProductLookupFragment$displayLocationAwareness$2(this);
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
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fd, code lost:
        if (r19 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleResponseMessage(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productLookup.fragment.ProductLookupFragment.handleResponseMessage(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToDetailsScreen() {
        MarketplaceLookupActivity $r1 = getMarketplaceLookupActivity();
        if ($r1 == null) {
            return;
        }
        ProductLookupDetailsFragment.Companion $r2 = ProductLookupDetailsFragment.Companion;
        ProductLookupDetailsFragment $r3 = $r2.newInstance();
        BaseMarketplaceActivity.startFragment$default($r1, $r3, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ProductLookupFragment newInstance() {
        Companion $r1 = Companion;
        ProductLookupFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m41658onViewCreated$lambda0(ProductLookupFragment productLookupFragment, View view) {
        Log_OC.getArray(productLookupFragment, "this$0");
        MarketplaceProductLookupViewModel $r0 = productLookupFragment.getMarketplaceLookupViewModel();
        String $r3 = productLookupFragment.marketplaceId;
        $r0.getProductFields($r3);
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
        MarketplaceProductLookupViewData $r2 = (MarketplaceProductLookupViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0082 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.p036v2.productLookup.viewData.MarketplaceProductLookupViewData r45) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productLookup.fragment.ProductLookupFragment.applyViewData(ai.kudi.agent.v2.productLookup.viewData.MarketplaceProductLookupViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        MarketplaceProductLookupViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected MarketplaceProductLookupViewModel createViewModel() {
        MarketplaceProductLookupViewModel $r1 = getMarketplaceLookupViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void fetchLocation() {
        MarketplaceProductLookupViewModel $r1 = getMarketplaceLookupViewModel();
        $r1.fetchLocation();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public String getAssociatedFieldId() {
        String r1 = this.associatedFieldId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void getAssociatedFields(String str, String str2) {
        Log_OC.getArray(str, "id");
        setAssociatedFieldId(str);
        this.associationFieldName = str2;
        MarketplaceProductLookupViewModel $r2 = getMarketplaceLookupViewModel();
        $r2.getAssociatedField(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public String getCollectionAmountType() {
        String r1 = this.collectionAmountType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public List getFields() {
        List r1 = this.fields;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public List getLocations() {
        List r1 = this.locations;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LookupObservables getLookupObservables() {
        InterfaceC11824h $r2 = this.lookupObservables$delegate;
        Object $r1 = $r2.getValue();
        LookupObservables $r3 = (LookupObservables) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public Map getMapOfAssociatedFields() {
        Map r1 = this.mapOfAssociatedFields;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public MarketplaceLookupActivity getMarketplaceLookupActivity() {
        MarketplaceLookupActivity r1 = this.marketplaceLookupActivity;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceProductLookupViewModel getMarketplaceLookupViewModel() {
        MarketplaceProductLookupViewModel $r1 = this.marketplaceLookupViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("marketplaceLookupViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return MarketplaceProductLookupViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void handleNavigation() {
        MarketplaceLookupActivity $r1 = getMarketplaceLookupActivity();
        if ($r1 == null) {
            return;
        }
        ProductAllCollectionFieldsFragment.Companion $r2 = ProductAllCollectionFieldsFragment.Companion;
        ProductAllCollectionFieldsFragment $r3 = $r2.newInstance();
        BaseMarketplaceActivity.startFragment$default($r1, $r3, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void initializeData() {
        LookupObservables $r1 = getLookupObservables();
        LiveData $r2 = $r1.getProductID();
        if ($r2.getValue() == null) {
            MarketplaceProductLookupViewModel $r5 = getMarketplaceLookupViewModel();
            $r5.collectionEvent(false);
            MarketplaceLookupActivity $r6 = getMarketplaceLookupActivity();
            if ($r6 == null) {
                return;
            }
            $r6.closeFragment();
            return;
        }
        LookupObservables $r12 = getLookupObservables();
        LiveData $r22 = $r12.getProductID();
        Object $r3 = $r22.getValue();
        Log_OC.append($r3);
        Log_OC.loadImage($r3, "lookupObservables.productID.value!!");
        String $r4 = (String) $r3;
        this.marketplaceId = $r4;
        MarketplaceProductLookupViewModel $r52 = getMarketplaceLookupViewModel();
        String $r42 = this.marketplaceId;
        $r52.getProductFields($r42);
        MarketplaceProductLookupViewModel $r53 = getMarketplaceLookupViewModel();
        $r53.collectionEvent(true);
        LookupObservables $r13 = getLookupObservables();
        LiveData $r23 = $r13.getProductCode();
        if ($r23.getValue() == null) {
            MarketplaceProductLookupViewModel $r54 = getMarketplaceLookupViewModel();
            $r54.collectionEvent(false);
            MarketplaceLookupActivity $r62 = getMarketplaceLookupActivity();
            if ($r62 == null) {
                return;
            }
            $r62.closeFragment();
            return;
        }
        LookupObservables $r14 = getLookupObservables();
        LiveData $r24 = $r14.getProductCode();
        Object $r32 = $r24.getValue();
        Log_OC.append($r32);
        Log_OC.loadImage($r32, "lookupObservables.productCode.value!!");
        String $r43 = (String) $r32;
        this.productCode = $r43;
        LookupObservables $r15 = getLookupObservables();
        LiveData $r25 = $r15.getCollectionAmount();
        if ($r25.getValue() != null) {
            LookupObservables $r16 = getLookupObservables();
            LiveData $r26 = $r16.getCollectionAmount();
            Object $r33 = $r26.getValue();
            Log_OC.append($r33);
            Log_OC.loadImage($r33, "lookupObservables.collectionAmount.value!!");
            String $r44 = (String) $r33;
            this.collectionAmount = $r44;
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
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r3 = requireBinding();
        FragmentProductLookupBinding $r4 = (FragmentProductLookupBinding) $r3;
        KudiButton $r5 = $r4.tvProceedBtn;
        Resources $r6 = getResources();
        int $i0 = R$string.lookup_customer;
        String $r7 = $r6.getString($i0);
        Log_OC.loadImage($r7, "resources.getString(R.string.lookup_customer)");
        $r5.setText($r7);
        InterfaceC8209a $r32 = requireBinding();
        FragmentProductLookupBinding $r42 = (FragmentProductLookupBinding) $r32;
        ImageView $r8 = $r42.ivReloadBtn;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productLookup.fragment.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ProductLookupFragment $r2 = ProductLookupFragment.this;
                ProductLookupFragment.m41658onViewCreated$lambda0($r2, view2);
            }
        });
        animateLoader();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void performActionWithData(Map map, Map map2, String str, String str2) {
        Log_OC.getArray(map, "propertiesMap");
        Log_OC.getArray(map2, "mapOfSummary");
        Log_OC.getArray(str, "collectionAmount");
        Log_OC.getArray(str2, "amountKey");
        LocationUtil $r6 = this.locationTracker;
        if ($r6 != null) {
            MarketplaceLookupActivity $r7 = getMarketplaceLookupActivity();
            Log_OC.append($r7);
            C4107a $r8 = C4109b.m28503a($r7);
            Log_OC.loadImage($r8, "getFusedLocationProviderClient(marketplaceLookupActivity!!)");
            ProductLookupFragment$performActionWithData$1 $r3 = new ProductLookupFragment$performActionWithData$1(this, map);
            LocationUtil.getLastLocation$default($r6, $r8, 0, $r3, 2, null);
        }
        LookupObservables $r9 = getLookupObservables();
        $r9.setCustomerLookupDetails(map2);
        LookupObservables $r92 = getLookupObservables();
        $r92.setMapOfLookupProperties(map);
        this.mapOfProperties = map;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setAssociatedFieldId(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.associatedFieldId = str;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setCollectionAmountType(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.collectionAmountType = str;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setFields(List list) {
        this.fields = list;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setLocations(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.locations = list;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setMapOfAssociatedFields(Map map) {
        Log_OC.getArray(map, "<set-?>");
        this.mapOfAssociatedFields = map;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setMarketplaceLookupActivity(MarketplaceLookupActivity marketplaceLookupActivity) {
        this.marketplaceLookupActivity = marketplaceLookupActivity;
    }

    public final void setMarketplaceLookupViewModel(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "<set-?>");
        this.marketplaceLookupViewModel = marketplaceProductLookupViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setToolbar() {
        MarketplaceLookupActivity $r1 = getMarketplaceLookupActivity();
        if ($r1 != null) {
            BaseMarketplaceActivity.setNavigationIcon$default($r1, 0, 1, null);
        }
        MarketplaceLookupActivity $r12 = getMarketplaceLookupActivity();
        if ($r12 != null) {
            int $i0 = R$string.customer_lookup;
            String $r2 = getString($i0);
            Log_OC.loadImage($r2, "getString(R.string.customer_lookup)");
            $r12.setToolbarTitle($r2);
        }
        MarketplaceLookupActivity $r13 = getMarketplaceLookupActivity();
        if ($r13 == null) {
            return;
        }
        $r13.toggleHelpButton(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void uploadFile(String str, Field field) {
        Log_OC.getArray(str, "filePath");
        Log_OC.getArray(field, "field");
        MarketplaceProductLookupViewModel $r3 = getMarketplaceLookupViewModel();
        $r3.uploadFile(str, field);
    }
}
