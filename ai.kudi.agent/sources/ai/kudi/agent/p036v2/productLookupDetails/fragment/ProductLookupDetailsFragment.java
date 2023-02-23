package ai.kudi.agent.p036v2.productLookupDetails.fragment;

import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductLookupDetalsBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.common.view.viewModels.LookupObservables;
import ai.kudi.agent.p036v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment;
import ai.kudi.agent.p036v2.productLookupDetails.ProductLookupDetailsViewData;
import ai.kudi.agent.p036v2.productLookupDetails.ProductLookupDetailsViewModel;
import ai.kudi.agent.p036v2.productLookupDetails.adapter.ProductLookupDetailsAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1483g0;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p557z.C13727r0;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ProductLookupDetailsFragment.kt */
@Metadata(m10422d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0014J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0016J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00102\u001a\u00020 H\u0002J\b\u00103\u001a\u00020 H\u0002R\"\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00065"}, m10421d2 = {"Lai/kudi/agent/v2/productLookupDetails/fragment/ProductLookupDetailsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/v2/productLookupDetails/ProductLookupDetailsViewModel;", "Lai/kudi/agent/v2/productLookupDetails/ProductLookupDetailsViewData;", "Lai/kudi/agent/collections/databinding/FragmentProductLookupDetalsBinding;", "()V", "lookupDetailsList", "", "Lkotlin/Pair;", "", "mapOfCustomerDetails", "", "getMapOfCustomerDetails", "()Ljava/util/Map;", "setMapOfCustomerDetails", "(Ljava/util/Map;)V", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "observables", "Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "getObservables", "()Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "observables$delegate", "Lkotlin/Lazy;", "productLookupDetailsAdapter", "Lai/kudi/agent/v2/productLookupDetails/adapter/ProductLookupDetailsAdapter;", "productLookupDetailsViewModel", "getProductLookupDetailsViewModel", "()Lai/kudi/agent/v2/productLookupDetails/ProductLookupDetailsViewModel;", "setProductLookupDetailsViewModel", "(Lai/kudi/agent/v2/productLookupDetails/ProductLookupDetailsViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setToolbar", "setViews", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookupDetails.fragment.ProductLookupDetailsFragment */
/* loaded from: classes.dex */
public final class ProductLookupDetailsFragment extends BaseMVVMViewBindingFragment<ProductLookupDetailsViewModel, ProductLookupDetailsViewData, FragmentProductLookupDetalsBinding> {
    public static final Companion Companion;
    private List<C13287o<String, String>> lookupDetailsList;
    private Map<String, String> mapOfCustomerDetails;
    private MarketplaceLookupActivity marketplaceLookupActivity;
    private final InterfaceC11824h observables$delegate;
    private ProductLookupDetailsAdapter productLookupDetailsAdapter;
    public ProductLookupDetailsViewModel productLookupDetailsViewModel;

    /* compiled from: ProductLookupDetailsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/productLookupDetails/fragment/ProductLookupDetailsFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/v2/productLookupDetails/fragment/ProductLookupDetailsFragment;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productLookupDetails.fragment.ProductLookupDetailsFragment$Companion */
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
        public final ProductLookupDetailsFragment newInstance() {
            ProductLookupDetailsFragment $r1 = new ProductLookupDetailsFragment();
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
    public ProductLookupDetailsFragment() {
        Map $r6;
        InterfaceC11863b $r3 = C11813x.m10316b(LookupObservables.class);
        C0729xac4a19bf $r1 = new C0729xac4a19bf(this);
        C0730xac4a19c0 $r2 = new C0730xac4a19c0(this);
        InterfaceC11824h $r4 = C1483g0.m35752a(this, $r3, $r1, $r2);
        this.observables$delegate = $r4;
        ProductLookupDetailsAdapter $r5 = new ProductLookupDetailsAdapter();
        this.productLookupDetailsAdapter = $r5;
        $r6 = C13727r0.m3881k();
        this.mapOfCustomerDetails = $r6;
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
    private final void setToolbar() {
        MarketplaceLookupActivity $r2 = this.marketplaceLookupActivity;
        if ($r2 == null) {
            Log_OC.LogError("marketplaceLookupActivity");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        BaseMarketplaceActivity.setNavigationIcon$default($r2, 0, 1, null);
        MarketplaceLookupActivity $r22 = this.marketplaceLookupActivity;
        if ($r22 == null) {
            Log_OC.LogError("marketplaceLookupActivity");
            NullPointerException r42 = new NullPointerException("Null throw statement replaced by Soot");
            throw r42;
        }
        int $i0 = R$string.customer_details;
        String $r1 = getString($i0);
        Log_OC.loadImage($r1, "getString(R.string.customer_details)");
        $r22.setToolbarTitle($r1);
        MarketplaceLookupActivity $r23 = this.marketplaceLookupActivity;
        if ($r23 == null) {
            Log_OC.LogError("marketplaceLookupActivity");
            NullPointerException r43 = new NullPointerException("Null throw statement replaced by Soot");
            throw r43;
        }
        $r23.toggleHelpButton(false);
        MarketplaceLookupActivity $r24 = this.marketplaceLookupActivity;
        if ($r24 != null) {
            ProductLookupDetailsFragment$setToolbar$1 $r3 = new ProductLookupDetailsFragment$setToolbar$1(this);
            $r24.setNavigationBehavior($r3);
            return;
        }
        Log_OC.LogError("marketplaceLookupActivity");
        NullPointerException r44 = new NullPointerException("Null throw statement replaced by Soot");
        throw r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setViews() {
        LookupObservables $r1 = getObservables();
        LiveData $r2 = $r1.getMapOfCustomerLookUpSummary();
        if ($r2.getValue() != null) {
            LookupObservables $r12 = getObservables();
            LiveData $r22 = $r12.getMapOfCustomerLookUpSummary();
            Object $r3 = $r22.getValue();
            Log_OC.append($r3);
            Log_OC.loadImage($r3, "observables.mapOfCustomerLookUpSummary.value!!");
            Map $r4 = (Map) $r3;
            this.mapOfCustomerDetails = $r4;
            ProductLookupDetailsViewModel $r5 = getProductLookupDetailsViewModel();
            Map $r42 = this.mapOfCustomerDetails;
            $r5.setCustomerLookupDetails($r42);
        } else {
            MarketplaceLookupActivity $r6 = this.marketplaceLookupActivity;
            if ($r6 == null) {
                Log_OC.LogError("marketplaceLookupActivity");
                NullPointerException r15 = new NullPointerException("Null throw statement replaced by Soot");
                throw r15;
            }
            $r6.finish();
        }
        InterfaceC8209a $r7 = requireBinding();
        FragmentProductLookupDetalsBinding $r8 = (FragmentProductLookupDetalsBinding) $r7;
        RecyclerView $r9 = $r8.rvProductLookupDetails;
        Context $r11 = requireContext();
        LinearLayoutManager r16 = new LinearLayoutManager($r11, 1, false);
        $r9.setLayoutManager(r16);
        ProductLookupDetailsAdapter $r122 = this.productLookupDetailsAdapter;
        $r9.setAdapter($r122);
        InterfaceC8209a $r72 = requireBinding();
        FragmentProductLookupDetalsBinding $r82 = (FragmentProductLookupDetalsBinding) $r72;
        ViewGroup $r13 = $r82.tvProceedBtn;
        ViewGroup r18 = $r13;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.productLookupDetails.fragment.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductLookupDetailsFragment $r23 = ProductLookupDetailsFragment.this;
                ProductLookupDetailsFragment.m41679setViews$lambda3($r23, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-3  reason: not valid java name */
    public static final void m41679setViews$lambda3(ProductLookupDetailsFragment productLookupDetailsFragment, View view) {
        Log_OC.getArray(productLookupDetailsFragment, "this$0");
        MarketplaceLookupActivity $r3 = productLookupDetailsFragment.marketplaceLookupActivity;
        if ($r3 == null) {
            Log_OC.LogError("marketplaceLookupActivity");
            NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
            throw r5;
        }
        ProductAllCollectionFieldsFragment.Companion $r4 = ProductAllCollectionFieldsFragment.Companion;
        ProductAllCollectionFieldsFragment $r0 = $r4.newInstance();
        BaseMarketplaceActivity.startFragment$default($r3, $r0, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ProductLookupDetailsViewData $r2 = (ProductLookupDetailsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.p036v2.productLookupDetails.ProductLookupDetailsViewData r6) {
        /*
            r5 = this;
            java.lang.String r0 = "viewData"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            java.util.Map r1 = r6.getProductLookupDetails()
            if (r1 == 0) goto L14
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L12
            goto L14
        L12:
            r2 = 0
            goto L15
        L14:
            r2 = 1
        L15:
            if (r2 != 0) goto L25
            java.util.List r3 = kotlin.p557z.C13721o0.m3974y(r1)
            r5.lookupDetailsList = r3
            ai.kudi.agent.v2.productLookupDetails.adapter.ProductLookupDetailsAdapter r4 = r5.productLookupDetailsAdapter
            kotlin.p483e0.p485d.Log_OC.append(r3)
            r4.submitList(r3)
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productLookupDetails.fragment.ProductLookupDetailsFragment.applyViewData(ai.kudi.agent.v2.productLookupDetails.ProductLookupDetailsViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ProductLookupDetailsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected ProductLookupDetailsViewModel createViewModel() {
        ProductLookupDetailsViewModel $r1 = getProductLookupDetailsViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getMapOfCustomerDetails() {
        Map r1 = this.mapOfCustomerDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductLookupDetailsViewModel getProductLookupDetailsViewModel() {
        ProductLookupDetailsViewModel $r1 = this.productLookupDetailsViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("productLookupDetailsViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ProductLookupDetailsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof MarketplaceLookupActivity;
        if ($z0) {
            this.marketplaceLookupActivity = (MarketplaceLookupActivity) context;
        }
        MarketplaceLookupActivity $r3 = this.marketplaceLookupActivity;
        if ($r3 != null) {
            MarketplaceProductLookupSubComponent $r1 = $r3.getMarketplaceLookupSubcomponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("marketplaceLookupActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentProductLookupDetalsBinding $r4 = FragmentProductLookupDetalsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setToolbar();
        setViews();
    }

    public final void setMapOfCustomerDetails(Map map) {
        Log_OC.getArray(map, "<set-?>");
        this.mapOfCustomerDetails = map;
    }

    public final void setProductLookupDetailsViewModel(ProductLookupDetailsViewModel productLookupDetailsViewModel) {
        Log_OC.getArray(productLookupDetailsViewModel, "<set-?>");
        this.productLookupDetailsViewModel = productLookupDetailsViewModel;
    }
}
