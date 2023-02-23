package ai.kudi.agent.p036v2.productAllCollectionFields.fragment;

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
import ai.kudi.agent.p036v2.productAllCollectionFields.viewData.ProductAllCollectionFieldsViewData;
import ai.kudi.agent.p036v2.productAllCollectionFields.viewModel.ProductAllCollectionFieldsViewModel;
import ai.kudi.agent.p036v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import kotlin.p549l0.C13262h;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProductAllCollectionFieldsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \\2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\\B\u0005¢\u0006\u0002\u0010\u0004J\b\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u0003H\u0014J\b\u0010=\u001a\u00020\u0002H\u0014J\b\u0010>\u001a\u00020:H\u0016J\u001a\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020CH\u0014J\u0012\u0010D\u001a\u00020:2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\b\u0010G\u001a\u00020:H\u0016J\b\u0010H\u001a\u00020:H\u0016J\b\u0010I\u001a\u00020:H\u0002J\u0010\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020LH\u0016J\u001a\u0010M\u001a\u00020:2\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J@\u0010R\u001a\u00020:2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020U0T2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060T2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u0006H\u0016J\b\u0010X\u001a\u00020:H\u0016J\u0018\u0010Y\u001a\u00020:2\u0006\u0010Z\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\"X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101R\u001e\u00104\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006]"}, m10421d2 = {"Lai/kudi/agent/v2/productAllCollectionFields/fragment/ProductAllCollectionFieldsFragment;", "Lai/kudi/agent/v2/common/view/fragment/BaseMarketplaceLookupFragment;", "Lai/kudi/agent/v2/productAllCollectionFields/viewModel/ProductAllCollectionFieldsViewModel;", "Lai/kudi/agent/v2/productAllCollectionFields/viewData/ProductAllCollectionFieldsViewData;", "()V", TransactionField.AMOUNT, "", "amountType", "associatedFieldId", "getAssociatedFieldId", "()Ljava/lang/String;", "setAssociatedFieldId", "(Ljava/lang/String;)V", "associationFieldName", "collectionAmount", "collectionAmountType", "getCollectionAmountType", "setCollectionAmountType", "fields", "", "Lai/kudi/dip/library/bottomSheets/models/Field;", "getFields", "()Ljava/util/List;", "setFields", "(Ljava/util/List;)V", "loadCount", "", "loading", "", "locations", "Lai/kudi/agent/register/data/models/LocationModel;", "getLocations", "setLocations", "mapOfAssociatedFields", "", "getMapOfAssociatedFields", "()Ljava/util/Map;", "setMapOfAssociatedFields", "(Ljava/util/Map;)V", "marketplaceId", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "getMarketplaceLookupActivity", "()Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "setMarketplaceLookupActivity", "(Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;)V", "observables", "Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "getObservables", "()Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "observables$delegate", "Lkotlin/Lazy;", "productAllCollectionFieldsViewModel", "getProductAllCollectionFieldsViewModel", "()Lai/kudi/agent/v2/productAllCollectionFields/viewModel/ProductAllCollectionFieldsViewModel;", "setProductAllCollectionFieldsViewModel", "(Lai/kudi/agent/v2/productAllCollectionFields/viewModel/ProductAllCollectionFieldsViewModel;)V", "animateLoader", "", "applyViewData", "viewData", "createViewModel", "fetchLocation", "getAssociatedFields", "id", "fieldName", "getVMType", "Ljava/lang/Class;", "handleError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/v2/common/view/viewData/data/Error;", "handleNavigation", "initializeData", "navigateToSummaryScreen", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "performActionWithData", "propertiesMap", "", "", "mapOfSummary", "amountKey", "setToolbar", "uploadFile", "filePath", "field", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment */
/* loaded from: classes.dex */
public final class ProductAllCollectionFieldsFragment extends BaseMarketplaceLookupFragment<ProductAllCollectionFieldsViewModel, ProductAllCollectionFieldsViewData> {
    public static final Companion Companion;
    private String amount;
    private String amountType;
    private String associatedFieldId;
    private String associationFieldName;
    private String collectionAmount;
    private String collectionAmountType;
    private List<Field> fields;
    private int loadCount;
    private boolean loading;
    private List<LocationModel> locations;
    private Map<String, List<Field>> mapOfAssociatedFields;
    private String marketplaceId;
    private MarketplaceLookupActivity marketplaceLookupActivity;
    private final InterfaceC11824h observables$delegate;
    public ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel;

    /* compiled from: ProductAllCollectionFieldsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/productAllCollectionFields/fragment/ProductAllCollectionFieldsFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/v2/productAllCollectionFields/fragment/ProductAllCollectionFieldsFragment;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment$Companion */
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
        public final ProductAllCollectionFieldsFragment newInstance() {
            ProductAllCollectionFieldsFragment $r1 = new ProductAllCollectionFieldsFragment();
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
    public ProductAllCollectionFieldsFragment() {
        InterfaceC11863b $r2 = C11813x.m10316b(LookupObservables.class);
        C0698xf2f5d84f $r3 = new C0698xf2f5d84f(this);
        C0699xf2f5d850 $r1 = new C0699xf2f5d850(this);
        InterfaceC11824h $r4 = C1483g0.m35752a(this, $r2, $r3, $r1);
        this.observables$delegate = $r4;
        this.collectionAmountType = "";
        ArrayList $r5 = new ArrayList();
        this.locations = $r5;
        LinkedHashMap $r6 = new LinkedHashMap();
        this.mapOfAssociatedFields = $r6;
        this.associatedFieldId = "";
        this.amount = "";
        this.collectionAmount = "";
        this.amountType = "";
        this.loading = true;
        this.marketplaceId = "";
        this.associationFieldName = "";
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
        ProductCollectionSummaryFragment.Companion $r2 = ProductCollectionSummaryFragment.Companion;
        String $r3 = this.collectionAmount;
        ProductCollectionSummaryFragment $r4 = $r2.newInstance($r3);
        BaseMarketplaceActivity.startFragment$default($r1, $r4, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ProductAllCollectionFieldsFragment newInstance() {
        Companion $r1 = Companion;
        ProductAllCollectionFieldsFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ProductAllCollectionFieldsViewData $r2 = (ProductAllCollectionFieldsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ProductAllCollectionFieldsViewData productAllCollectionFieldsViewData) {
        List $r7;
        Log_OC.getArray(productAllCollectionFieldsViewData, "viewData");
        boolean $z0 = productAllCollectionFieldsViewData.getLoading();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentProductLookupBinding $r3 = (FragmentProductLookupBinding) $r2;
            CamomileSpinner $r4 = $r3.ivProductLookupLoader;
            $r4.m32588f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentProductLookupBinding $r32 = (FragmentProductLookupBinding) $r22;
            ImageView $r42 = $r32.ivProductLookupLoader;
            ImageView r21 = $r42;
            r21.clearAnimation();
        }
        InterfaceC8209a $r23 = requireBinding();
        FragmentProductLookupBinding $r33 = (FragmentProductLookupBinding) $r23;
        FrameLayout $r5 = $r33.flProductLookupLoaderContainer;
        Log_OC.loadImage($r5, "requireBinding().flProductLookupLoaderContainer");
        ViewExtKt.toggleVisibility($r5, $z0);
        this.loading = $z0;
        ProductField $r6 = productAllCollectionFieldsViewData.getProductField();
        if ($r6 != null) {
            int $i0 = this.loadCount + 1;
            this.loadCount = $i0;
            if ($i0 <= 1) {
                List $r72 = $r6.getCollectionFields();
                $r7 = C13742z.m3777u0($r72, new Comparator() { // from class: ai.kudi.agent.v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment$applyViewData$lambda-13$lambda-3$$inlined$sortedBy$1
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
                ArrayList r20 = new ArrayList();
                for (Object $r11 : $r7) {
                    Field $r12 = (Field) $r11;
                    if (!$r12.getLookupRequired()) {
                        r20.add($r11);
                    }
                }
                setFields(r20);
                setViews();
            }
            InterfaceC8209a $r24 = requireBinding();
            FragmentProductLookupBinding $r34 = (FragmentProductLookupBinding) $r24;
            LinearLayout $r13 = $r34.llReloadBtn;
            Log_OC.loadImage($r13, "requireBinding().llReloadBtn");
            ViewExtKt.toggleVisibility($r13, false);
            InterfaceC8209a $r25 = requireBinding();
            FragmentProductLookupBinding $r35 = (FragmentProductLookupBinding) $r25;
            LinearLayout $r132 = $r35.llProductLookupWrapper;
            Log_OC.loadImage($r132, "requireBinding().llProductLookupWrapper");
            ViewExtKt.toggleVisibility($r132, true);
        } else {
            if (productAllCollectionFieldsViewData.getLoading()) {
                InterfaceC8209a $r26 = requireBinding();
                FragmentProductLookupBinding $r36 = (FragmentProductLookupBinding) $r26;
                LinearLayout $r133 = $r36.llReloadBtn;
                Log_OC.loadImage($r133, "requireBinding().llReloadBtn");
                ViewExtKt.toggleVisibility($r133, false);
            } else {
                InterfaceC8209a $r27 = requireBinding();
                FragmentProductLookupBinding $r37 = (FragmentProductLookupBinding) $r27;
                LinearLayout $r134 = $r37.llReloadBtn;
                Log_OC.loadImage($r134, "requireBinding().llReloadBtn");
                ViewExtKt.toggleVisibility($r134, true);
            }
            InterfaceC8209a $r28 = requireBinding();
            FragmentProductLookupBinding $r38 = (FragmentProductLookupBinding) $r28;
            LinearLayout $r135 = $r38.llProductLookupWrapper;
            Log_OC.loadImage($r135, "requireBinding().llProductLookupWrapper");
            ViewExtKt.toggleVisibility($r135, false);
        }
        Error $r14 = productAllCollectionFieldsViewData.getError();
        handleError($r14);
        List $r73 = productAllCollectionFieldsViewData.getLocation();
        setLocations($r73);
        showLocation();
        Error $r142 = productAllCollectionFieldsViewData.getLocationError();
        handleError($r142);
        boolean $z02 = productAllCollectionFieldsViewData.getUploadingFile();
        boolean $z1 = productAllCollectionFieldsViewData.getLoading();
        if (!$z1) {
            if ($z02) {
                InterfaceC8209a $r29 = requireBinding();
                FragmentProductLookupBinding $r39 = (FragmentProductLookupBinding) $r29;
                CamomileSpinner $r43 = $r39.ivProductLookupLoader;
                $r43.m32588f();
                FragmentActivity $r15 = requireActivity();
                Log_OC.loadImage($r15, "requireActivity()");
                ContextExtKt.toast($r15, "Uploading File", 0);
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
        boolean $z03 = productAllCollectionFieldsViewData.getFetchingAssociatedFields();
        boolean $z12 = productAllCollectionFieldsViewData.getLoading();
        if (!$z12) {
            if ($z03) {
                InterfaceC8209a $r212 = requireBinding();
                FragmentProductLookupBinding $r312 = (FragmentProductLookupBinding) $r212;
                CamomileSpinner $r45 = $r312.ivProductLookupLoader;
                $r45.m32588f();
                FragmentActivity $r152 = requireActivity();
                Log_OC.loadImage($r152, "requireActivity()");
                String $r16 = this.associationFieldName;
                ContextExtKt.toast($r152, Log_OC.m10359a("Fetching options for ", (Object) $r16), 0);
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
        Error $r143 = productAllCollectionFieldsViewData.getAssociatedFieldsError();
        handleError($r143);
        List $r74 = productAllCollectionFieldsViewData.getAssociatedFields();
        Map $r17 = getMapOfAssociatedFields();
        String $r162 = getAssociatedFieldId();
        $r17.put($r162, $r74);
        Error $r144 = productAllCollectionFieldsViewData.getFileUploadError();
        handleError($r144);
        Map $r172 = productAllCollectionFieldsViewData.getFilePropertyMap();
        LookupObservables $r18 = getObservables();
        $r18.setMapOfCollectionFiles($r172);
        if (!$r172.isEmpty()) {
            FragmentActivity $r153 = requireActivity();
            Log_OC.loadImage($r153, "requireActivity()");
            ContextExtKt.toast($r153, "File upload successful", 0);
            handleEnableButton();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ProductAllCollectionFieldsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected ProductAllCollectionFieldsViewModel createViewModel() {
        ProductAllCollectionFieldsViewModel $r1 = getProductAllCollectionFieldsViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void fetchLocation() {
        ProductAllCollectionFieldsViewModel $r1 = getProductAllCollectionFieldsViewModel();
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
        ProductAllCollectionFieldsViewModel $r2 = getProductAllCollectionFieldsViewModel();
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
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public MarketplaceLookupActivity getMarketplaceLookupActivity() {
        MarketplaceLookupActivity r1 = this.marketplaceLookupActivity;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductAllCollectionFieldsViewModel getProductAllCollectionFieldsViewModel() {
        ProductAllCollectionFieldsViewModel $r1 = this.productAllCollectionFieldsViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("productAllCollectionFieldsViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ProductAllCollectionFieldsViewModel.class;
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
        ProductAllCollectionFieldsViewModel $r5 = getProductAllCollectionFieldsViewModel();
        String $r42 = this.marketplaceId;
        $r5.getProductFields($r42);
        LookupObservables $r13 = getObservables();
        LiveData $r23 = $r13.getAmountType();
        if ($r23.getValue() != null) {
            LookupObservables $r14 = getObservables();
            LiveData $r24 = $r14.getAmountType();
            Object $r32 = $r24.getValue();
            Log_OC.append($r32);
            Log_OC.loadImage($r32, "observables.amountType.value!!");
            String $r43 = (String) $r32;
            this.amountType = $r43;
            setCollectionAmountType($r43);
        }
        LookupObservables $r15 = getObservables();
        LiveData $r25 = $r15.getCollectionAmount();
        if ($r25.getValue() != null) {
            LookupObservables $r16 = getObservables();
            LiveData $r26 = $r16.getCollectionAmount();
            Object $r33 = $r26.getValue();
            Log_OC.append($r33);
            Log_OC.loadImage($r33, "observables.collectionAmount.value!!");
            String $r44 = (String) $r33;
            this.amount = $r44;
        }
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
        int $i0 = R$string.proceed;
        String $r7 = $r6.getString($i0);
        Log_OC.loadImage($r7, "resources.getString(R.string.proceed)");
        $r5.setText($r7);
        animateLoader();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void performActionWithData(Map map, Map map2, String $r3, String str) {
        Log_OC.getArray(map, "propertiesMap");
        Log_OC.getArray(map2, "mapOfSummary");
        Log_OC.getArray($r3, "collectionAmount");
        Log_OC.getArray(str, "amountKey");
        LinkedHashMap $r5 = new LinkedHashMap();
        $r5.putAll(map);
        String $r6 = this.amountType;
        boolean $z0 = Log_OC.append($r6, "PLAN");
        if ($z0) {
            $r3 = "";
        } else {
            String $r62 = this.amountType;
            boolean $z02 = Log_OC.append($r62, "DYNAMIC");
            if (!$z02) {
                $r3 = this.amount;
            }
            double $d0 = Double.parseDouble($r3);
            Double $r7 = Double.valueOf($d0);
            $r5.put(str, $r7);
        }
        C13262h $r8 = new C13262h("[0-9]+");
        boolean $z03 = $r8.m5522e($r3);
        if (!$z03) {
            $r3 = "0";
        }
        this.collectionAmount = $r3;
        LookupObservables $r9 = getObservables();
        $r9.setAllCustomerDetails(map2);
        LookupObservables $r92 = getObservables();
        $r92.setMapOfAllCollectionsProperties($r5);
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

    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void setMarketplaceLookupActivity(MarketplaceLookupActivity marketplaceLookupActivity) {
        this.marketplaceLookupActivity = marketplaceLookupActivity;
    }

    public final void setProductAllCollectionFieldsViewModel(ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel) {
        Log_OC.getArray(productAllCollectionFieldsViewModel, "<set-?>");
        this.productAllCollectionFieldsViewModel = productAllCollectionFieldsViewModel;
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
            int $i0 = R$string.fill_the_details;
            String $r2 = getString($i0);
            Log_OC.loadImage($r2, "getString(R.string.fill_the_details)");
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
        ProductAllCollectionFieldsFragment$setToolbar$1 $r3 = new ProductAllCollectionFieldsFragment$setToolbar$1(this);
        $r14.setNavigationBehavior($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment
    public void uploadFile(String str, Field field) {
        Log_OC.getArray(str, "filePath");
        Log_OC.getArray(field, "field");
        ProductAllCollectionFieldsViewModel $r3 = getProductAllCollectionFieldsViewModel();
        $r3.uploadFile(str, field);
    }
}
