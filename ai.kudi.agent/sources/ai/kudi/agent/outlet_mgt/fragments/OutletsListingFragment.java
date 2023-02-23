package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentOutletsListingBinding;
import ai.kudi.agent.databinding.LayoutListShimmerLoaderBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity;
import ai.kudi.agent.outlet_mgt.adapters.OutletListingAdapter;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.fragments.OutletLinkingBuzzAgentFragment;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.STATUS;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsContainerFragment;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletsListingFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00016B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0014J\b\u0010\u001f\u001a\u00020\u0002H\u0014J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0014J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00067"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletsListingFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel$OutletsListingViewData;", "Lai/kudi/agent/databinding/FragmentOutletsListingBinding;", "Lai/kudi/agent/outlet_mgt/adapters/OutletListingAdapter$ActionLister;", "()V", "bottomSheetDialog", "Lai/kudi/dip/library/bottomSheets/FilterBottomSheet;", "lastSelectedStatus", "", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "outletListingAdapter", "Lai/kudi/agent/outlet_mgt/adapters/OutletListingAdapter;", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel;", "setScreenViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletsListingViewModel;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "initBottomSheet", "onAttach", "context", "Landroid/content/Context;", "onClick", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/outlet_mgt/data/Outlet;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showEmptyState", "isFilteredState", "", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletsListingFragment extends BaseMVVMViewBindingFragment<OutletsListingViewModel, OutletsListingViewModel.OutletsListingViewData, FragmentOutletsListingBinding> implements OutletListingAdapter.ActionLister {
    public static final Companion Companion;
    public static final String OUTLET_NEW_FEATURE = "IS_NEW_FEATURE";
    private DialogC0809i bottomSheetDialog;
    private String lastSelectedStatus = "All Outlets";
    private LinearLayoutManager linearLayoutManager;
    private OutletListingAdapter outletListingAdapter;
    private OutletMgtActivity outletMgtActivity;
    public OutletsListingViewModel screenViewModel;
    public SharedPreferences sharedPreferences;

    /* compiled from: OutletsListingFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletsListingFragment$Companion;", "", "()V", "OUTLET_NEW_FEATURE", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
    private final void initBottomSheet() {
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        OutletsListingFragment$initBottomSheet$1 r4 = new OutletsListingFragment$initBottomSheet$1(this);
        DialogC0809i r5 = new DialogC0809i($r2, r4);
        this.bottomSheetDialog = r5;
        if (r5 == null) {
            return;
        }
        DialogC0809i r6 = r5;
        r6.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m39887onViewCreated$lambda0(OutletsListingFragment outletsListingFragment, View view) {
        Log_OC.getArray(outletsListingFragment, "this$0");
        outletsListingFragment.initBottomSheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m39888onViewCreated$lambda1(OutletsListingFragment outletsListingFragment, View view) {
        Log_OC.getArray(outletsListingFragment, "this$0");
        OutletsListingViewModel $r2 = outletsListingFragment.getScreenViewModel();
        $r2.addOutletClicked();
        OutletMgtCreateAcctOptionsFragment r6 = new OutletMgtCreateAcctOptionsFragment();
        OutletMgtActivity $r0 = outletsListingFragment.outletMgtActivity;
        if ($r0 != null) {
            AppCompatActivity r7 = (AppCompatActivity) $r0;
            AppCompatActivityExtKt.startFragment$default(r7, r6, C0001R.C0003id.contentFrameLayout, true, true, false, 16, null);
            return;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
        throw r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showEmptyState(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentOutletsListingBinding $r2 = (FragmentOutletsListingBinding) $r1;
        View $r3 = $r2.rvOutletRequest;
        Log_OC.loadImage($r3, "rvOutletRequest");
        View r13 = $r3;
        ViewExtKt.hide$default(r13, false, 1, null);
        LayoutListShimmerLoaderBinding $r4 = $r2.layoutListShimmerLoader;
        $r4.sflLoadingState.m32964d();
        LayoutListShimmerLoaderBinding $r42 = $r2.layoutListShimmerLoader;
        View $r5 = $r42.sflLoadingState;
        Log_OC.loadImage($r5, "layoutListShimmerLoader.sflLoadingState");
        View r132 = $r5;
        ViewExtKt.hide$default(r132, false, 1, null);
        View $r6 = $r2.clEmptyState;
        Log_OC.loadImage($r6, "clEmptyState");
        View r133 = $r6;
        ViewExtKt.show(r133);
        if (!z) {
            TextView $r8 = $r2.tvTitle;
            String $r7 = getString(C0001R.string.text_you_have_not_linked_any_outlet);
            $r8.setText($r7);
            return;
        }
        String $r72 = this.lastSelectedStatus;
        boolean $z0 = Log_OC.append($r72, "ALL");
        if ($z0) {
            return;
        }
        TextView $r82 = $r2.tvTitle;
        StringBuilder r12 = new StringBuilder();
        r12.append("You don’t have any ");
        TextView $r10 = $r2.tvStatusFilter;
        CharSequence $r11 = $r10.getText();
        r12.append((Object) $r11);
        r12.append(" outlet at this time");
        String $r73 = r12.toString();
        $r82.setText($r73);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OutletsListingViewModel.OutletsListingViewData $r2 = (OutletsListingViewModel.OutletsListingViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(OutletsListingViewModel.OutletsListingViewData outletsListingViewData) {
        String $r9;
        FragmentActivity $r10;
        Log_OC.getArray(outletsListingViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentOutletsListingBinding $r3 = (FragmentOutletsListingBinding) $r2;
        boolean $z0 = outletsListingViewData.isLoading();
        if ($z0) {
            View $r4 = $r3.rvOutletRequest;
            Log_OC.loadImage($r4, "rvOutletRequest");
            View r16 = $r4;
            ViewExtKt.hide$default(r16, false, 1, null);
            LayoutListShimmerLoaderBinding $r5 = $r3.layoutListShimmerLoader;
            View $r6 = $r5.sflLoadingState;
            Log_OC.loadImage($r6, "layoutListShimmerLoader.sflLoadingState");
            View r162 = $r6;
            ViewExtKt.show(r162);
            View $r7 = $r3.clEmptyState;
            Log_OC.loadImage($r7, "clEmptyState");
            View r163 = $r7;
            ViewExtKt.hide$default(r163, false, 1, null);
            LayoutListShimmerLoaderBinding $r52 = $r3.layoutListShimmerLoader;
            $r52.sflLoadingState.m32965c();
        } else {
            View $r42 = $r3.rvOutletRequest;
            Log_OC.loadImage($r42, "rvOutletRequest");
            View r164 = $r42;
            ViewExtKt.show(r164);
            LayoutListShimmerLoaderBinding $r53 = $r3.layoutListShimmerLoader;
            $r53.sflLoadingState.m32964d();
            LayoutListShimmerLoaderBinding $r54 = $r3.layoutListShimmerLoader;
            View $r62 = $r54.sflLoadingState;
            Log_OC.loadImage($r62, "layoutListShimmerLoader.sflLoadingState");
            View r165 = $r62;
            ViewExtKt.hide$default(r165, false, 1, null);
        }
        OutletsListingViewModel.OutletListingError $r8 = outletsListingViewData.getError();
        if ($r8 != null && ($r9 = $r8.getMessage()) != null && ($r10 = getActivity()) != null) {
            ContextExtKt.toast$default($r10, $r9, 0, 2, (Object) null);
        }
        List $r11 = outletsListingViewData.getOutletListingResponse();
        if ($r11 != null) {
            OutletListingAdapter $r12 = this.outletListingAdapter;
            if ($r12 == null) {
                Log_OC.LogError("outletListingAdapter");
                NullPointerException r14 = new NullPointerException("Null throw statement replaced by Soot");
                throw r14;
            }
            List $r112 = outletsListingViewData.getOutletListingResponse();
            OutletsListingFragment$applyViewData$1$1$2 r15 = new OutletsListingFragment$applyViewData$1$1$2(this);
            $r12.setDataAfterInvalidating($r112, r15);
        }
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
        OutletsListingViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletsListingViewModel getScreenViewModel() {
        OutletsListingViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OutletsListingViewModel.class;
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
            this.outletMgtActivity = (OutletMgtActivity) context;
        }
        OutletMgtActivity $r3 = this.outletMgtActivity;
        if ($r3 != null) {
            OutletMgtSubComponent $r1 = $r3.getOutletMgtSubComponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.outlet_mgt.adapters.OutletListingAdapter.ActionLister
    public void onClick(Outlet outlet) {
        Log_OC.getArray(outlet, TransactionBreakDownItemType.DATA);
        OutletsListingViewModel $r2 = getScreenViewModel();
        String $r3 = outlet.getOutletId();
        $r2.onOutletItemSelected($r3);
        boolean $z0 = outlet.getOutletInfoUpdated();
        if (!$z0) {
            String $r32 = outlet.getOutletApprovalStatus();
            STATUS $r4 = STATUS.APPROVED;
            String $r5 = $r4.name();
            boolean $z02 = Log_OC.append($r32, $r5);
            if ($z02) {
                OutletMgtActivity $r6 = this.outletMgtActivity;
                if ($r6 == null) {
                    Log_OC.LogError("outletMgtActivity");
                    NullPointerException r15 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r15;
                }
                OutletMgtActivity $r8 = this.outletMgtActivity;
                if ($r8 == null) {
                    Log_OC.LogError("outletMgtActivity");
                    NullPointerException r152 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r152;
                }
                Intent r16 = new Intent((Context) $r8, ChildOutletInformationActivity.class);
                r16.putExtra(ChildOutletInformationActivity.EXTRA_KEY_OUTLET_DETAIL, outlet);
                C13666w c13666w = C13666w.f30112a;
                Activity r19 = (Activity) $r6;
                r19.startActivity(r16);
                return;
            }
        }
        String $r33 = outlet.getOutletApprovalStatus();
        STATUS $r42 = STATUS.PENDING;
        String $r52 = $r42.name();
        boolean $z03 = Log_OC.append($r33, $r52);
        if ($z03) {
            OutletLinkingBuzzAgentFragment.Companion $r10 = OutletLinkingBuzzAgentFragment.Companion;
            OutletLinkingBuzzAgentFragment $r11 = $r10.newInstance(outlet);
            OutletMgtActivity $r62 = this.outletMgtActivity;
            if ($r62 != null) {
                AppCompatActivity r20 = (AppCompatActivity) $r62;
                AppCompatActivityExtKt.startFragment$default(r20, $r11, C0001R.C0003id.contentFrameLayout, true, false, false, 16, null);
                return;
            }
            Log_OC.LogError("outletMgtActivity");
            NullPointerException r153 = new NullPointerException("Null throw statement replaced by Soot");
            throw r153;
        }
        TransactionsContainerFragment.Companion $r12 = TransactionsContainerFragment.Companion;
        TransactionHistoryScope.OutletTransactions r17 = new TransactionHistoryScope.OutletTransactions(outlet);
        TransactionsContainerFragment $r14 = $r12.newInstance(r17);
        OutletMgtActivity $r63 = this.outletMgtActivity;
        if ($r63 != null) {
            AppCompatActivity r202 = (AppCompatActivity) $r63;
            AppCompatActivityExtKt.startFragment$default(r202, $r14, C0001R.C0003id.contentFrameLayout, true, false, false, 16, null);
            return;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r154 = new NullPointerException("Null throw statement replaced by Soot");
        throw r154;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOutletsListingBinding $r4 = FragmentOutletsListingBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        OutletMgtActivity $r3 = this.outletMgtActivity;
        if ($r3 == null) {
            Log_OC.LogError("outletMgtActivity");
            NullPointerException r18 = new NullPointerException("Null throw statement replaced by Soot");
            throw r18;
        }
        $r3.toggleToolbar(true);
        FragmentActivity $r5 = getActivity();
        LinearLayoutManager r19 = new LinearLayoutManager($r5);
        this.linearLayoutManager = r19;
        InterfaceC8209a $r6 = requireBinding();
        FragmentOutletsListingBinding $r7 = (FragmentOutletsListingBinding) $r6;
        RecyclerView $r8 = $r7.rvOutletRequest;
        LinearLayoutManager $r4 = this.linearLayoutManager;
        if ($r4 == null) {
            Log_OC.LogError("linearLayoutManager");
            NullPointerException r182 = new NullPointerException("Null throw statement replaced by Soot");
            throw r182;
        }
        $r8.setLayoutManager($r4);
        OutletListingAdapter r20 = new OutletListingAdapter(this);
        this.outletListingAdapter = r20;
        InterfaceC8209a $r62 = requireBinding();
        FragmentOutletsListingBinding $r72 = (FragmentOutletsListingBinding) $r62;
        RecyclerView $r82 = $r72.rvOutletRequest;
        OutletListingAdapter $r9 = this.outletListingAdapter;
        if ($r9 == null) {
            Log_OC.LogError("outletListingAdapter");
            NullPointerException r183 = new NullPointerException("Null throw statement replaced by Soot");
            throw r183;
        }
        $r82.setAdapter($r9);
        SharedPreferences $r10 = getSharedPreferences();
        SharedPreferences.Editor $r11 = $r10.edit();
        $r11.putBoolean("IS_NEW_FEATURE", false).apply();
        InterfaceC8209a $r63 = requireBinding();
        FragmentOutletsListingBinding $r73 = (FragmentOutletsListingBinding) $r63;
        TextView $r12 = $r73.tvStatusFilter;
        $r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.TimePicker$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletsListingFragment $r2 = OutletsListingFragment.this;
                OutletsListingFragment.m39887onViewCreated$lambda0($r2, view2);
            }
        });
        OutletsListingViewModel $r14 = getScreenViewModel();
        OutletsListingViewModel.loadNext$default($r14, null, true, false, 1, null);
        InterfaceC8209a $r64 = requireBinding();
        FragmentOutletsListingBinding $r74 = (FragmentOutletsListingBinding) $r64;
        RecyclerView $r83 = $r74.rvOutletRequest;
        $r83.m35282l(new RecyclerView.AbstractC1644u() { // from class: ai.kudi.agent.outlet_mgt.fragments.OutletsListingFragment$onViewCreated$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Log_OC.getArray(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                RecyclerView r7 = recyclerView;
                boolean $z0 = r7.canScrollVertically(1);
                if ($z0) {
                    return;
                }
                OutletsListingFragment $r2 = OutletsListingFragment.this;
                OutletsListingViewModel $r32 = $r2.getScreenViewModel();
                Map $r42 = $r32.getOutletStatusMap();
                OutletsListingFragment $r22 = OutletsListingFragment.this;
                Object $r65 = $r42.get($r22.lastSelectedStatus);
                String $r52 = (String) $r65;
                if ($r52 == null) {
                    $r52 = "";
                }
                OutletsListingFragment $r23 = OutletsListingFragment.this;
                OutletsListingViewModel $r33 = $r23.getScreenViewModel();
                $r33.loadNext($r52, false, true);
            }
        });
        InterfaceC8209a $r65 = requireBinding();
        FragmentOutletsListingBinding $r75 = (FragmentOutletsListingBinding) $r65;
        ImageButton $r16 = $r75.fabLinkOutlet;
        ImageButton r24 = $r16;
        r24.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.ErrorActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletsListingFragment $r2 = OutletsListingFragment.this;
                OutletsListingFragment.m39888onViewCreated$lambda1($r2, view2);
            }
        });
    }

    public final void setScreenViewModel(OutletsListingViewModel outletsListingViewModel) {
        Log_OC.getArray(outletsListingViewModel, "<set-?>");
        this.screenViewModel = outletsListingViewModel;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}
