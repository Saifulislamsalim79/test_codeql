package ai.kudi.agent.p036v2.productCustomerRegistration.fragment;

import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductLookupBinding;
import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.common.view.viewModels.LookupObservables;
import ai.kudi.agent.p036v2.productCustomerRegistration.viewData.MarketplaceCustomerRegistrationViewData;
import ai.kudi.agent.p036v2.productCustomerRegistration.viewModel.MarketplaceCustomerRegistrationViewModel;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.C1483g0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p474a0.C11703b;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: MarketplaceCustomerRegistrationFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 \\2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\\B\u0005¢\u0006\u0002\u0010\u0004J\b\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u0003H\u0014J\b\u0010<\u001a\u00020\u0002H\u0014J\b\u0010=\u001a\u000209H\u0016J\u001a\u0010>\u001a\u0002092\u0006\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020BH\u0014J\u0012\u0010C\u001a\u0002092\b\u0010D\u001a\u0004\u0018\u00010EH\u0002J\b\u0010F\u001a\u000209H\u0016J\b\u0010G\u001a\u000209H\u0016J\b\u0010H\u001a\u000209H\u0002J\u0010\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020KH\u0016J\u001a\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J@\u0010Q\u001a\u0002092\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020T0S2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0S2\u0006\u0010V\u001a\u00020\b2\u0006\u0010W\u001a\u00020\bH\u0016J\b\u0010X\u001a\u000209H\u0016J\u0018\u0010Y\u001a\u0002092\u0006\u0010Z\u001a\u00020\b2\u0006\u0010[\u001a\u00020\u0013H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b4\u00105¨\u0006]"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistration/fragment/MarketplaceCustomerRegistrationFragment;", "Lai/kudi/agent/v2/common/view/fragment/BaseMarketplaceLookupFragment;", "Lai/kudi/agent/v2/productCustomerRegistration/viewModel/MarketplaceCustomerRegistrationViewModel;", "Lai/kudi/agent/v2/productCustomerRegistration/viewData/MarketplaceCustomerRegistrationViewData;", "()V", "anim", "Landroid/view/animation/RotateAnimation;", "associatedFieldId", "", "getAssociatedFieldId", "()Ljava/lang/String;", "setAssociatedFieldId", "(Ljava/lang/String;)V", "associationFieldName", "collectionAmountType", "getCollectionAmountType", "setCollectionAmountType", "fields", "", "Lai/kudi/dip/library/bottomSheets/models/Field;", "getFields", "()Ljava/util/List;", "setFields", "(Ljava/util/List;)V", "loadCount", "", "loading", "", "locations", "Lai/kudi/agent/register/data/models/LocationModel;", "getLocations", "setLocations", "mapOfAssociatedFields", "", "getMapOfAssociatedFields", "()Ljava/util/Map;", "setMapOfAssociatedFields", "(Ljava/util/Map;)V", "marketplaceCustomerRegistrationViewModel", "getMarketplaceCustomerRegistrationViewModel", "()Lai/kudi/agent/v2/productCustomerRegistration/viewModel/MarketplaceCustomerRegistrationViewModel;", "setMarketplaceCustomerRegistrationViewModel", "(Lai/kudi/agent/v2/productCustomerRegistration/viewModel/MarketplaceCustomerRegistrationViewModel;)V", "marketplaceId", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "getMarketplaceLookupActivity", "()Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "setMarketplaceLookupActivity", "(Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;)V", "observables", "Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "getObservables", "()Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "observables$delegate", "Lkotlin/Lazy;", "animateLoader", "", "applyViewData", "viewData", "createViewModel", "fetchLocation", "getAssociatedFields", "id", "fieldName", "getVMType", "Ljava/lang/Class;", "handleError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "handleNavigation", "initializeData", "navigateToSummaryScreen", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "performActionWithData", "propertiesMap", "", "", "mapOfSummary", "collectionAmount", "amountKey", "setToolbar", "uploadFile", "filePath", "field", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistration.fragment.MarketplaceCustomerRegistrationFragment */
/* loaded from: classes.dex */
public final class MarketplaceCustomerRegistrationFragment extends BaseMarketplaceLookupFragment<MarketplaceCustomerRegistrationViewModel, MarketplaceCustomerRegistrationViewData> {
    public static final Companion Companion;
    private RotateAnimation anim;
    private String associatedFieldId;
    private String associationFieldName;
    private String collectionAmountType;
    private List<Field> fields;
    private int loadCount;
    private boolean loading;
    private List<LocationModel> locations;
    private Map<String, List<Field>> mapOfAssociatedFields;
    public MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel;
    private String marketplaceId;
    private MarketplaceLookupActivity marketplaceLookupActivity;
    private final InterfaceC11824h observables$delegate;

    /* compiled from: MarketplaceCustomerRegistrationFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistration/fragment/MarketplaceCustomerRegistrationFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/v2/productCustomerRegistration/fragment/MarketplaceCustomerRegistrationFragment;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productCustomerRegistration.fragment.MarketplaceCustomerRegistrationFragment$Companion */
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
        public final MarketplaceCustomerRegistrationFragment newInstance() {
            MarketplaceCustomerRegistrationFragment $r1 = new MarketplaceCustomerRegistrationFragment();
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
    public MarketplaceCustomerRegistrationFragment() {
        InterfaceC11863b $r2 = C11813x.m10316b(LookupObservables.class);
        C0707x2f762ca8 $r3 = new C0707x2f762ca8(this);
        C0708x2f762ca9 $r1 = new C0708x2f762ca9(this);
        InterfaceC11824h $r4 = C1483g0.m35752a(this, $r2, $r3, $r1);
        this.observables$delegate = $r4;
        ArrayList $r5 = new ArrayList();
        this.locations = $r5;
        LinkedHashMap $r6 = new LinkedHashMap();
        this.mapOfAssociatedFields = $r6;
        this.associatedFieldId = "";
        this.associationFieldName = "";
        this.collectionAmountType = "";
        this.loading = true;
        this.marketplaceId = "";
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
    private final LookupObservables getObservables() {
        InterfaceC11824h $r2 = this.observables$delegate;
        Object $r1 = $r2.getValue();
        LookupObservables $r3 = (LookupObservables) $r1;
        return $r3;
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
    private final void navigateToSummaryScreen() {
        MarketplaceLookupActivity $r1 = getMarketplaceLookupActivity();
        if ($r1 == null) {
            return;
        }
        ProductCustomerRegistrationSummaryFragment.Companion $r2 = ProductCustomerRegistrationSummaryFragment.Companion;
        ProductCustomerRegistrationSummaryFragment $r3 = $r2.newInstance();
        BaseMarketplaceActivity.startFragment$default($r1, $r3, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final MarketplaceCustomerRegistrationFragment newInstance() {
        Companion $r1 = Companion;
        MarketplaceCustomerRegistrationFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        MarketplaceCustomerRegistrationViewData $r2 = (MarketplaceCustomerRegistrationViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(MarketplaceCustomerRegistrationViewData marketplaceCustomerRegistrationViewData) {
        List $r7;
        Log_OC.getArray(marketplaceCustomerRegistrationViewData, "viewData");
        boolean $z0 = marketplaceCustomerRegistrationViewData.getLoading();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentProductLookupBinding $r3 = (FragmentProductLookupBinding) $r2;
            CamomileSpinner $r4 = $r3.ivProductLookupLoader;
            $r4.m32588f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentProductLookupBinding $r32 = (FragmentProductLookupBinding) $r22;
            CamomileSpinner $r42 = $r32.ivProductLookupLoader;
            $r42.m32587g();
        }
        InterfaceC8209a $r23 = requireBinding();
        FragmentProductLookupBinding $r33 = (FragmentProductLookupBinding) $r23;
        FrameLayout $r5 = $r33.flProductLookupLoaderContainer;
        Log_OC.loadImage($r5, "requireBinding().flProductLookupLoaderContainer");
        ViewExtKt.toggleVisibility($r5, $z0);
        this.loading = $z0;
        ProductField $r6 = marketplaceCustomerRegistrationViewData.getProductField();
        if ($r6 != null) {
            int $i0 = this.loadCount + 1;
            this.loadCount = $i0;
            if ($i0 <= 1) {
                List $r72 = $r6.getOnBoardingFields();
                $r7 = C13742z.m3777u0($r72, new Comparator() { // from class: ai.kudi.agent.v2.productCustomerRegistration.fragment.MarketplaceCustomerRegistrationFragment$applyViewData$lambda-13$lambda-2$$inlined$sortedBy$1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int $i02;
                        Field $r34 = (Field) obj;
                        int $i03 = $r34.getRank();
                        Integer $r43 = Integer.valueOf($i03);
                        Field $r35 = (Field) obj2;
                        int $i04 = $r35.getRank();
                        Integer $r52 = Integer.valueOf($i04);
                        $i02 = C11703b.m10416a($r43, $r52);
                        return $i02;
                    }
                });
                setFields($r7);
                setViews();
            }
            InterfaceC8209a $r24 = requireBinding();
            FragmentProductLookupBinding $r34 = (FragmentProductLookupBinding) $r24;
            LinearLayout $r9 = $r34.llReloadBtn;
            Log_OC.loadImage($r9, "requireBinding().llReloadBtn");
            ViewExtKt.toggleVisibility($r9, false);
            InterfaceC8209a $r25 = requireBinding();
            FragmentProductLookupBinding $r35 = (FragmentProductLookupBinding) $r25;
            LinearLayout $r92 = $r35.llProductLookupWrapper;
            Log_OC.loadImage($r92, "requireBinding().llProductLookupWrapper");
            ViewExtKt.toggleVisibility($r92, true);
        } else {
            if (marketplaceCustomerRegistrationViewData.getLoading()) {
                InterfaceC8209a $r26 = requireBinding();
                FragmentProductLookupBinding $r36 = (FragmentProductLookupBinding) $r26;
                LinearLayout $r93 = $r36.llReloadBtn;
                Log_OC.loadImage($r93, "requireBinding().llReloadBtn");
                ViewExtKt.toggleVisibility($r93, false);
            } else {
                InterfaceC8209a $r27 = requireBinding();
                FragmentProductLookupBinding $r37 = (FragmentProductLookupBinding) $r27;
                LinearLayout $r94 = $r37.llReloadBtn;
                Log_OC.loadImage($r94, "requireBinding().llReloadBtn");
                ViewExtKt.toggleVisibility($r94, true);
            }
            InterfaceC8209a $r28 = requireBinding();
            FragmentProductLookupBinding $r38 = (FragmentProductLookupBinding) $r28;
            LinearLayout $r95 = $r38.llProductLookupWrapper;
            Log_OC.loadImage($r95, "requireBinding().llProductLookupWrapper");
            ViewExtKt.toggleVisibility($r95, false);
        }
        Error $r10 = marketplaceCustomerRegistrationViewData.getError();
        handleError($r10);
        List $r73 = marketplaceCustomerRegistrationViewData.getLocation();
        setLocations($r73);
        showLocation();
        Error $r102 = marketplaceCustomerRegistrationViewData.getLocationError();
        handleError($r102);
        if (marketplaceCustomerRegistrationViewData.getFetchingLocation()) {
            FragmentActivity $r11 = requireActivity();
            Log_OC.loadImage($r11, "requireActivity()");
            ContextExtKt.toast($r11, "Fetching states and LGAs", 0);
        }
        Error $r103 = marketplaceCustomerRegistrationViewData.getFileUploadError();
        handleError($r103);
        boolean $z02 = marketplaceCustomerRegistrationViewData.getFetchingAssociatedFields();
        boolean $z1 = marketplaceCustomerRegistrationViewData.getLoading();
        if (!$z1) {
            if ($z02) {
                InterfaceC8209a $r29 = requireBinding();
                FragmentProductLookupBinding $r39 = (FragmentProductLookupBinding) $r29;
                CamomileSpinner $r43 = $r39.ivProductLookupLoader;
                $r43.m32588f();
                FragmentActivity $r112 = requireActivity();
                Log_OC.loadImage($r112, "requireActivity()");
                String $r12 = this.associationFieldName;
                ContextExtKt.toast($r112, Log_OC.m10359a("Fetching options for ", (Object) $r12), 0);
            } else {
                InterfaceC8209a $r210 = requireBinding();
                FragmentProductLookupBinding $r310 = (FragmentProductLookupBinding) $r210;
                CamomileSpinner $r44 = $r310.ivProductLookupLoader;
                $r44.m32587g();
            }
            InterfaceC8209a $r211 = requireBinding();
            FragmentProductLookupBinding $r311 = (FragmentProductLookupBinding) $r211;
            FrameLayout $r52 = $r311.flProductLookupLoaderContainer;
            Log_OC.loadImage($r52, "requireBinding().flProductLookupLoaderContainer");
            ViewExtKt.toggleVisibility($r52, $z02);
        }
        Error $r104 = marketplaceCustomerRegistrationViewData.getAssociatedFieldsError();
        handleError($r104);
        List $r74 = marketplaceCustomerRegistrationViewData.getAssociatedFields();
        Map $r13 = getMapOfAssociatedFields();
        String $r122 = getAssociatedFieldId();
        $r13.put($r122, $r74);
        boolean $z03 = marketplaceCustomerRegistrationViewData.getUploadingFile();
        boolean $z12 = marketplaceCustomerRegistrationViewData.getLoading();
        if (!$z12) {
            if ($z03) {
                InterfaceC8209a $r212 = requireBinding();
                FragmentProductLookupBinding $r312 = (FragmentProductLookupBinding) $r212;
                CamomileSpinner $r45 = $r312.ivProductLookupLoader;
                $r45.m32588f();
                FragmentActivity $r113 = requireActivity();
                Log_OC.loadImage($r113, "requireActivity()");
                ContextExtKt.toast($r113, "Uploading files", 0);
            } else {
                InterfaceC8209a $r213 = requireBinding();
                FragmentProductLookupBinding $r313 = (FragmentProductLookupBinding) $r213;
                CamomileSpinner $r46 = $r313.ivProductLookupLoader;
                $r46.m32587g();
            }
            InterfaceC8209a $r214 = requireBinding();
            FragmentProductLookupBinding $r314 = (FragmentProductLookupBinding) $r214;
            FrameLayout $r53 = $r314.flProductLookupLoaderContainer;
            Log_OC.loadImage($r53, "requireBinding().flProductLookupLoaderContainer");
            ViewExtKt.toggleVisibility($r53, $z03);
        }
        Map $r132 = marketplaceCustomerRegistrationViewData.getFilePropertyMap();
        LookupObservables $r14 = getObservables();
        $r14.setMapOfRegistrationFiles($r132);
        if (!$r132.isEmpty()) {
            FragmentActivity $r114 = requireActivity();
            Log_OC.loadImage($r114, "requireActivity()");
            ContextExtKt.toast($r114, "File upload successful", 0);
            handleEnableButton();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        MarketplaceCustomerRegistrationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected MarketplaceCustomerRegistrationViewModel createViewModel() {
        MarketplaceCustomerRegistrationViewModel $r1 = getMarketplaceCustomerRegistrationViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void fetchLocation() {
        MarketplaceCustomerRegistrationViewModel $r1 = getMarketplaceCustomerRegistrationViewModel();
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
        MarketplaceCustomerRegistrationViewModel $r2 = getMarketplaceCustomerRegistrationViewModel();
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
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public Map getMapOfAssociatedFields() {
        Map r1 = this.mapOfAssociatedFields;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceCustomerRegistrationViewModel getMarketplaceCustomerRegistrationViewModel() {
        MarketplaceCustomerRegistrationViewModel $r1 = this.marketplaceCustomerRegistrationViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("marketplaceCustomerRegistrationViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public MarketplaceLookupActivity getMarketplaceLookupActivity() {
        MarketplaceLookupActivity r1 = this.marketplaceLookupActivity;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return MarketplaceCustomerRegistrationViewModel.class;
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
        $r1.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void initializeData() {
        LookupObservables $r1 = getObservables();
        LiveData $r2 = $r1.getProductID();
        if ($r2.getValue() == null) {
            MarketplaceLookupActivity $r6 = getMarketplaceLookupActivity();
            if ($r6 == null) {
                return;
            }
            $r6.finish();
            return;
        }
        LookupObservables $r12 = getObservables();
        LiveData $r22 = $r12.getProductID();
        Object $r3 = $r22.getValue();
        Log_OC.append($r3);
        Log_OC.loadImage($r3, "observables.productID.value!!");
        String $r4 = (String) $r3;
        this.marketplaceId = $r4;
        MarketplaceCustomerRegistrationViewModel $r5 = getMarketplaceCustomerRegistrationViewModel();
        String $r42 = this.marketplaceId;
        $r5.getProductFields($r42);
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
        int $i0 = R$string.proceed_to_summary;
        String $r7 = $r6.getString($i0);
        Log_OC.loadImage($r7, "resources.getString(R.string.proceed_to_summary)");
        $r5.setText($r7);
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
        LookupObservables $r5 = getObservables();
        $r5.setRegistrationProperties(map);
        LookupObservables $r52 = getObservables();
        $r52.setRegistrationSummary(map2);
        navigateToSummaryScreen();
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

    public final void setMarketplaceCustomerRegistrationViewModel(MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel) {
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "<set-?>");
        this.marketplaceCustomerRegistrationViewModel = marketplaceCustomerRegistrationViewModel;
    }

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setMarketplaceLookupActivity(MarketplaceLookupActivity marketplaceLookupActivity) {
        this.marketplaceLookupActivity = marketplaceLookupActivity;
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
            int $i0 = R$string.register_customer;
            String $r2 = getString($i0);
            Log_OC.loadImage($r2, "getString(R.string.register_customer)");
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
        MarketplaceCustomerRegistrationFragment$setToolbar$1 $r3 = new MarketplaceCustomerRegistrationFragment$setToolbar$1(this);
        $r14.setNavigationBehavior($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void uploadFile(String str, Field field) {
        Log_OC.getArray(str, "filePath");
        Log_OC.getArray(field, "field");
        MarketplaceCustomerRegistrationViewModel $r3 = getMarketplaceCustomerRegistrationViewModel();
        $r3.uploadFile(str, field);
    }
}
