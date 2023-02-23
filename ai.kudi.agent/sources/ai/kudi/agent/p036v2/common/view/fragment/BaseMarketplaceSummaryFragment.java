package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.collections.databinding.FragmentProductLookupSummaryBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.productCollectionSummary.adapter.ProductLookupSummaryAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BaseMarketplaceSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00060\u0005B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H&J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010!\u001a\u00020\u0015H&J\b\u0010\"\u001a\u00020\u0015H&J\b\u0010#\u001a\u00020\u0015H\u0002R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/fragment/BaseMarketplaceSummaryFragment;", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/collections/databinding/FragmentProductLookupSummaryBinding;", "()V", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "getMarketplaceLookupActivity", "()Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "setMarketplaceLookupActivity", "(Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;)V", "marketplaceProductSummaryAdapter", "Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;", "getMarketplaceProductSummaryAdapter", "()Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;", "setMarketplaceProductSummaryAdapter", "(Lai/kudi/agent/v2/productCollectionSummary/adapter/ProductLookupSummaryAdapter;)V", "handleButtonClick", "", "initializeData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "performButtonAction", "setToolbar", "setViews", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceSummaryFragment */
/* loaded from: classes.dex */
public abstract class BaseMarketplaceSummaryFragment<VM extends BaseViewModel<State>, State extends ViewData> extends BaseMVVMViewBindingFragment<VM, State, FragmentProductLookupSummaryBinding> {
    private final void handleButtonClick() {
        performButtonAction();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setViews() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentProductLookupSummaryBinding $r2 = (FragmentProductLookupSummaryBinding) $r1;
        RecyclerView $r3 = $r2.rvProductLookupSummary;
        Context $r5 = requireContext();
        LinearLayoutManager r9 = new LinearLayoutManager($r5, 1, false);
        $r3.setLayoutManager(r9);
        ProductLookupSummaryAdapter $r6 = getMarketplaceProductSummaryAdapter();
        $r3.setAdapter($r6);
        InterfaceC8209a $r12 = requireBinding();
        FragmentProductLookupSummaryBinding $r22 = (FragmentProductLookupSummaryBinding) $r12;
        ViewGroup $r7 = $r22.tvProceedBtn;
        ViewGroup r11 = $r7;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.common.view.fragment.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMarketplaceSummaryFragment $r23 = BaseMarketplaceSummaryFragment.this;
                BaseMarketplaceSummaryFragment.m41550setViews$lambda1($r23, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setViews$lambda-1  reason: not valid java name */
    public static final void m41550setViews$lambda1(BaseMarketplaceSummaryFragment baseMarketplaceSummaryFragment, View view) {
        Log_OC.getArray(baseMarketplaceSummaryFragment, "this$0");
        baseMarketplaceSummaryFragment.handleButtonClick();
    }

    public abstract MarketplaceLookupActivity getMarketplaceLookupActivity();

    public abstract ProductLookupSummaryAdapter getMarketplaceProductSummaryAdapter();

    public abstract void initializeData();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentProductLookupSummaryBinding $r4 = FragmentProductLookupSummaryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setToolbar();
        initializeData();
        setViews();
    }

    public abstract void performButtonAction();

    public abstract void setMarketplaceLookupActivity(MarketplaceLookupActivity marketplaceLookupActivity);

    public abstract void setMarketplaceProductSummaryAdapter(ProductLookupSummaryAdapter productLookupSummaryAdapter);

    public abstract void setToolbar();
}
