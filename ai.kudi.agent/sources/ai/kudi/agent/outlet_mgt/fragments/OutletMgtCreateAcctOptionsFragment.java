package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.databinding.KudiTypeListLayoutBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel;
import ai.kudi.agent.withdraw_cash.p040ui.adapters.KudiOptionListAdapter;
import ai.kudi.agent.withdraw_cash.utils.Option;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletMgtCreateAcctOptionsFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0014J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtCreateAcctOptionsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel$OutletsListingViewData;", "Lai/kudi/agent/databinding/KudiTypeListLayoutBinding;", "Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter$OnOptionClick;", "()V", "kudiOptionListAdapter", "Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter;", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "viewModel", "getViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel;", "setViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onClick", "option", "Lai/kudi/agent/withdraw_cash/utils/Option;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtCreateAcctOptionsFragment extends BaseMVVMViewBindingFragment<OutletsListingViewModel, OutletsListingViewModel.OutletsListingViewData, KudiTypeListLayoutBinding> implements KudiOptionListAdapter.OnOptionClick {
    private KudiOptionListAdapter kudiOptionListAdapter;
    private OutletMgtActivity outletMgtActivity;
    public OutletsListingViewModel viewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OutletsListingViewModel.OutletsListingViewData $r2 = (OutletsListingViewModel.OutletsListingViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(OutletsListingViewModel.OutletsListingViewData outletsListingViewData) {
        Log_OC.getArray(outletsListingViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OutletsListingViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OutletsListingViewModel createViewModel() {
        OutletsListingViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OutletsListingViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final OutletsListingViewModel getViewModel() {
        OutletsListingViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof OutletMgtActivity;
        if ($z0) {
            OutletMgtActivity $r3 = (OutletMgtActivity) context;
            this.outletMgtActivity = $r3;
            Log_OC.append($r3);
            OutletMgtSubComponent $r1 = $r3.getOutletMgtSubComponent();
            $r1.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdraw_cash.p040ui.adapters.KudiOptionListAdapter.OnOptionClick
    public void onClick(Option option) {
        Log_OC.getArray(option, "option");
        Option $r2 = Option.OUTLET_NEW_AGENT;
        if (option == $r2) {
            OutletsListingViewModel $r3 = getViewModel();
            $r3.newOutletClicked("New");
            OutletMgtActivity $r4 = this.outletMgtActivity;
            if ($r4 == null) {
                return;
            }
            CreateOutletFragment r7 = new CreateOutletFragment();
            AppCompatActivity r9 = (AppCompatActivity) $r4;
            AppCompatActivityExtKt.startFragment$default(r9, r7, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
            return;
        }
        OutletsListingViewModel $r32 = getViewModel();
        $r32.newOutletClicked("Existing");
        OutletMgtActivity $r42 = this.outletMgtActivity;
        if ($r42 == null) {
            return;
        }
        OutletLinkingFormFragment r8 = new OutletLinkingFormFragment();
        AppCompatActivity r92 = (AppCompatActivity) $r42;
        AppCompatActivityExtKt.startFragment$default(r92, r8, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        KudiTypeListLayoutBinding $r4 = KudiTypeListLayoutBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List $r7;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        OutletMgtActivity $r3 = this.outletMgtActivity;
        if ($r3 != null) {
            $r3.setTitle("Outlets");
        }
        Option $r6 = Option.OUTLET_EXISTING_AGENT;
        Option $r62 = Option.OUTLET_NEW_AGENT;
        Option[] $r5 = {$r6, $r62};
        $r7 = C13726r.m3888h($r5);
        KudiOptionListAdapter $r4 = new KudiOptionListAdapter(this, $r7);
        this.kudiOptionListAdapter = $r4;
        InterfaceC8209a $r8 = requireBinding();
        KudiTypeListLayoutBinding $r9 = (KudiTypeListLayoutBinding) $r8;
        RecyclerView $r10 = $r9.rvOptions;
        $r10.setHasFixedSize(true);
        RecyclerView $r102 = $r9.rvOptions;
        Context $r12 = requireContext();
        LinearLayoutManager $r11 = new LinearLayoutManager($r12, 1, false);
        $r102.setLayoutManager($r11);
        RecyclerView $r103 = $r9.rvOptions;
        KudiOptionListAdapter $r42 = this.kudiOptionListAdapter;
        $r103.setAdapter($r42);
    }

    public final void setViewModel(OutletsListingViewModel outletsListingViewModel) {
        Log_OC.getArray(outletsListingViewModel, "<set-?>");
        this.viewModel = outletsListingViewModel;
    }
}
