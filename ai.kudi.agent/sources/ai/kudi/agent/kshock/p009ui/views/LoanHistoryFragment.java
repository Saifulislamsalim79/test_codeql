package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_kshock.databinding.FragmentLoanHistoryBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.p009ui.adapter.LoanHistoryAdapter;
import ai.kudi.agent.kshock.presentation.LoanHistoryViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.LoanHistoryViewData;
import ai.kudi.dip.library.filter.KudiDateAndTypeFilterView;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.C1483g0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.AbstractC1567j;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1577p;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import dagger.android.p197e.C7429a;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p557z.C13722p;
import kotlinx.coroutines.C13916j;
import p201g.p259r.C8013r0;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11678a;
/* compiled from: LoanHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0001H\u0096\u0001J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J$\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0017J\t\u0010-\u001a\u00020\u0003H\u0096\u0001J\b\u0010.\u001a\u00020\u001bH\u0002J\b\u0010/\u001a\u00020\u001bH\u0002R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00061"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/LoanHistoryFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_kshock/databinding/FragmentLoanHistoryBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_kshock/databinding/FragmentLoanHistoryBinding;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "filteredStatus", "", "loansAdapter", "Lai/kudi/agent/kshock/ui/adapter/LoanHistoryAdapter;", "viewModel", "Lai/kudi/agent/kshock/presentation/LoanHistoryViewModel;", "getViewModel", "()Lai/kudi/agent/kshock/presentation/LoanHistoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "applyViewData", "", "viewData", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData;", "initBinding", "Landroid/view/View;", "fragment", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "setupAdapter", "setupFilter", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment */
/* loaded from: classes.dex */
public final class LoanHistoryFragment extends Fragment implements BaseViewBinder<FragmentLoanHistoryBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentLoanHistoryBinding> $$delegate_0;
    private FilteredDate filteredDate;
    private String filteredStatus;
    private LoanHistoryAdapter loansAdapter;
    private final InterfaceC11824h viewModel$delegate;
    public C1556g0.InterfaceC1559b viewModelFactory;

    /* compiled from: LoanHistoryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/LoanHistoryFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/kshock/ui/views/LoanHistoryFragment;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$Companion */
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
        public final LoanHistoryFragment newInstance() {
            LoanHistoryFragment $r1 = new LoanHistoryFragment();
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
    public LoanHistoryFragment() {
        BaseViewBinderImpl $r2 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r2;
        LoanHistoryFragment$viewModel$2 $r3 = new LoanHistoryFragment$viewModel$2(this);
        LoanHistoryFragment$special$$inlined$viewModels$default$1 $r4 = new LoanHistoryFragment$special$$inlined$viewModels$default$1(this);
        InterfaceC11863b $r5 = C11813x.m10316b(LoanHistoryViewModel.class);
        LoanHistoryFragment$special$$inlined$viewModels$default$2 $r1 = new LoanHistoryFragment$special$$inlined$viewModels$default$2($r4);
        InterfaceC11824h $r6 = C1483g0.m35752a(this, $r5, $r1, $r3);
        this.viewModel$delegate = $r6;
        Date $r8 = new Date();
        Date $r9 = new Date();
        FilteredDate $r7 = new FilteredDate($r8, $r9);
        this.filteredDate = $r7;
        this.filteredStatus = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m39656onViewCreated$lambda0(LoanHistoryFragment loanHistoryFragment, View view) {
        Log_OC.getArray(loanHistoryFragment, "this$0");
        FragmentActivity $r0 = loanHistoryFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m39657onViewCreated$lambda1(LoanHistoryFragment loanHistoryFragment, LoanHistoryViewData loanHistoryViewData) {
        Log_OC.getArray(loanHistoryFragment, "this$0");
        Log_OC.loadImage(loanHistoryViewData, "it");
        loanHistoryFragment.applyViewData(loanHistoryViewData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupAdapter() {
        Context $r3 = getContext();
        LinearLayoutManager $r2 = new LinearLayoutManager($r3);
        this.loansAdapter = new LoanHistoryAdapter();
        FragmentLoanHistoryBinding $r5 = requireBinding();
        RecyclerView $r6 = $r5.loanList;
        $r6.setLayoutManager($r2);
        LoanHistoryAdapter $r4 = this.loansAdapter;
        if ($r4 == null) {
            Log_OC.LogError("loansAdapter");
            NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
            throw r10;
        }
        $r6.setAdapter($r4);
        LoanHistoryAdapter $r42 = this.loansAdapter;
        if ($r42 == null) {
            Log_OC.LogError("loansAdapter");
            NullPointerException r102 = new NullPointerException("Null throw statement replaced by Soot");
            throw r102;
        }
        LoanHistoryFragment$setupAdapter$2 $r7 = new LoanHistoryFragment$setupAdapter$2(this);
        $r42.setOnLoanSelectedListener($r7);
        PreferenceActivity $r8 = getViewLifecycleOwner();
        Log_OC.loadImage($r8, "viewLifecycleOwner");
        AbstractC1567j $r9 = C1577p.a($r8);
        LoanHistoryFragment$setupAdapter$3 $r1 = new LoanHistoryFragment$setupAdapter$3(this, null);
        C13916j.m3412b($r9, null, null, $r1, 3, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFilter() {
        FragmentLoanHistoryBinding $r1 = requireBinding();
        final KudiDateAndTypeFilterView $r2 = $r1.filterView;
        Log_OC.loadImage($r2, "requireBinding().filterView");
        Date $r3 = new Date();
        String $r4 = DateExtKt.convertDateToGivenFormat$default($r3, null, 2, null);
        $r2.setDateText($r4);
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.kshock.ui.views.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                LoanHistoryFragment $r32 = LoanHistoryFragment.this;
                KudiDateAndTypeFilterView $r42 = $r2;
                LoanHistoryFragment.m39659setupFilter$lambda4($r32, $r42, str, bundle);
            }
        };
        FragmentManager $r6 = getChildFragmentManager();
        PreferenceActivity $r7 = getViewLifecycleOwner();
        $r6.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, $r7, interfaceC1523w);
        LoanHistoryFragment$setupFilter$1 $r8 = new LoanHistoryFragment$setupFilter$1(this);
        $r2.setDateFilterClickedListener($r8);
        LoanHistoryViewModel $r9 = getViewModel();
        Map $r10 = $r9.getLoanStatusFilterMap();
        Set $r11 = $r10.keySet();
        Object $r12 = C13722p.m3955Q($r11);
        Log_OC.loadImage($r12, "viewModel.loanStatusFilterMap.keys.first()");
        String $r42 = (String) $r12;
        $r2.setTypeText($r42);
        LoanHistoryFragment$setupFilter$2 $r13 = new LoanHistoryFragment$setupFilter$2(this, $r2);
        $r2.setTypeFilterClickListener($r13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupFilter$lambda-4  reason: not valid java name */
    public static final void m39659setupFilter$lambda4(LoanHistoryFragment loanHistoryFragment, KudiDateAndTypeFilterView kudiDateAndTypeFilterView, String str, Bundle bundle) {
        Log_OC.getArray(loanHistoryFragment, "this$0");
        Log_OC.getArray(kudiDateAndTypeFilterView, "$filterView");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DateFilterFragment.RESULT_KEY_FILTERED_DATE);
        if ($z0) {
            Serializable $r4 = bundle.getSerializable(DateFilterFragment.RESULT_KEY_FILTERED_DATE);
            boolean $z02 = $r4 instanceof FilteredDate;
            FilteredDate $r5 = $z02 ? (FilteredDate) $r4 : null;
            if ($r5 == null) {
                return;
            }
            loanHistoryFragment.filteredDate = $r5;
            Date $r6 = $r5.getFrom();
            Date $r7 = $r5.getTo();
            String $r2 = DateExtKt.getDateDiff$default($r6, $r7, 0, null, 8, null);
            kudiDateAndTypeFilterView.setDateText($r2);
            LoanHistoryViewModel $r8 = loanHistoryFragment.getViewModel();
            String $r22 = loanHistoryFragment.filteredStatus;
            Date $r62 = loanHistoryFragment.filteredDate.getFrom();
            String $r9 = DateExtKt.convertDateToGivenFormat($r62, "yyyy/MM/dd");
            Date $r63 = loanHistoryFragment.filteredDate.getTo();
            String $r10 = DateExtKt.convertDateToGivenFormat($r63, "yyyy/MM/dd");
            LoanHistoryViewModel.loadLoanHistory$default($r8, $r22, 0, $r9, $r10, 2, null);
            LoanHistoryAdapter $r11 = loanHistoryFragment.loansAdapter;
            if ($r11 != null) {
                $r11.refresh();
                return;
            }
            Log_OC.LogError("loansAdapter");
            NullPointerException r12 = new NullPointerException("Null throw statement replaced by Soot");
            throw r12;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void applyViewData(LoanHistoryViewData loanHistoryViewData) {
        Log_OC.getArray(loanHistoryViewData, "viewData");
        boolean $z0 = loanHistoryViewData instanceof LoanHistoryViewData.Empty;
        if ($z0) {
            FragmentLoanHistoryBinding $r2 = requireBinding();
            LinearLayout $r3 = $r2.emptyStateView;
            Log_OC.loadImage($r3, "requireBinding().emptyStateView");
            ViewExtKt.show($r3);
            FragmentLoanHistoryBinding $r22 = requireBinding();
            View $r4 = $r22.shimmerLoader;
            Log_OC.loadImage($r4, "requireBinding().shimmerLoader");
            View r14 = $r4;
            ViewExtKt.hide$default(r14, false, 1, null);
            return;
        }
        boolean $z02 = loanHistoryViewData instanceof LoanHistoryViewData.Loading;
        if ($z02) {
            FragmentLoanHistoryBinding $r23 = requireBinding();
            LinearLayout $r32 = $r23.emptyStateView;
            Log_OC.loadImage($r32, "requireBinding().emptyStateView");
            ViewExtKt.hide$default($r32, false, 1, null);
            FragmentLoanHistoryBinding $r24 = requireBinding();
            View $r42 = $r24.shimmerLoader;
            Log_OC.loadImage($r42, "requireBinding().shimmerLoader");
            View r142 = $r42;
            ViewExtKt.show(r142);
            return;
        }
        boolean $z03 = loanHistoryViewData instanceof LoanHistoryViewData.Data;
        if (!$z03) {
            boolean $z04 = loanHistoryViewData instanceof LoanHistoryViewData.Error;
            if ($z04) {
                FragmentLoanHistoryBinding $r25 = requireBinding();
                ProgressBar $r5 = $r25.nextLoadingProgressBar;
                Log_OC.loadImage($r5, "requireBinding().nextLoadingProgressBar");
                ViewExtKt.hide$default($r5, false, 1, null);
                FragmentLoanHistoryBinding $r26 = requireBinding();
                LinearLayout $r33 = $r26.emptyStateView;
                Log_OC.loadImage($r33, "requireBinding().emptyStateView");
                ViewExtKt.show($r33);
                FragmentLoanHistoryBinding $r27 = requireBinding();
                TextView $r10 = $r27.emptyStateText;
                LoanHistoryViewData.Error $r11 = (LoanHistoryViewData.Error) loanHistoryViewData;
                String $r12 = $r11.getMessage();
                $r10.setText($r12);
                FragmentLoanHistoryBinding $r28 = requireBinding();
                View $r43 = $r28.shimmerLoader;
                Log_OC.loadImage($r43, "requireBinding().shimmerLoader");
                View r143 = $r43;
                ViewExtKt.hide$default(r143, false, 1, null);
                return;
            }
            return;
        }
        FragmentLoanHistoryBinding $r29 = requireBinding();
        ProgressBar $r52 = $r29.nextLoadingProgressBar;
        Log_OC.loadImage($r52, "requireBinding().nextLoadingProgressBar");
        ViewExtKt.hide$default($r52, false, 1, null);
        FragmentLoanHistoryBinding $r210 = requireBinding();
        LinearLayout $r34 = $r210.emptyStateView;
        Log_OC.loadImage($r34, "requireBinding().emptyStateView");
        ViewExtKt.hide$default($r34, false, 1, null);
        FragmentLoanHistoryBinding $r211 = requireBinding();
        View $r44 = $r211.shimmerLoader;
        Log_OC.loadImage($r44, "requireBinding().shimmerLoader");
        View r144 = $r44;
        ViewExtKt.hide$default(r144, false, 1, null);
        LoanHistoryAdapter $r6 = this.loansAdapter;
        if ($r6 == null) {
            Log_OC.LogError("loansAdapter");
            NullPointerException r13 = new NullPointerException("Null throw statement replaced by Soot");
            throw r13;
        }
        AbstractC1565i $r7 = getLifecycle();
        Log_OC.loadImage($r7, "lifecycle");
        LoanHistoryViewData.Data $r8 = (LoanHistoryViewData.Data) loanHistoryViewData;
        C8013r0 $r9 = $r8.getLoans();
        $r6.submitData($r7, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentLoanHistoryBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentLoanHistoryBinding $r3 = (FragmentLoanHistoryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentLoanHistoryBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LoanHistoryViewModel getViewModel() {
        InterfaceC11824h $r2 = this.viewModel$delegate;
        Object $r1 = $r2.getValue();
        LoanHistoryViewModel $r3 = (LoanHistoryViewModel) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C1556g0.InterfaceC1559b getViewModelFactory() {
        C1556g0.InterfaceC1559b $r1 = this.viewModelFactory;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModelFactory");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentLoanHistoryBinding fragmentLoanHistoryBinding, Fragment fragment) {
        Log_OC.getArray(fragmentLoanHistoryBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentLoanHistoryBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentLoanHistoryBinding $r4 = (FragmentLoanHistoryBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentLoanHistoryBinding $r4 = FragmentLoanHistoryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        boolean $z0 = $r3 instanceof KShockActivity;
        KShockActivity $r4 = $z0 ? (KShockActivity) $r3 : null;
        if ($r4 != null) {
            $r4.hideActionBar();
        }
        setupAdapter();
        setupFilter();
        LoanHistoryViewModel $r5 = getViewModel();
        LoanHistoryViewModel.loadLoanHistory$default($r5, null, 0, null, null, 15, null);
        FragmentLoanHistoryBinding $r6 = requireBinding();
        ImageView $r7 = $r6.backButton;
        ImageView r16 = $r7;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoanHistoryFragment $r2 = LoanHistoryFragment.this;
                LoanHistoryFragment.m39656onViewCreated$lambda0($r2, view2);
            }
        });
        LoanHistoryViewModel $r52 = getViewModel();
        C11678a $r9 = $r52.getViewData();
        PreferenceActivity $r10 = getViewLifecycleOwner();
        Log_OC.loadImage($r10, "viewLifecycleOwner");
        AbstractC11688p $r11 = C7390a.a($r9, $r10);
        Object object = new Object() { // from class: ai.kudi.agent.kshock.ui.views.Logger
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoanHistoryFragment $r1 = LoanHistoryFragment.this;
                LoanHistoryViewData $r32 = (LoanHistoryViewData) obj;
                LoanHistoryFragment.m39657onViewCreated$lambda1($r1, $r32);
            }
        };
        Constants $r13 = Constants.INSTANCE;
        $r11.e0(object, $r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentLoanHistoryBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentLoanHistoryBinding $r3 = (FragmentLoanHistoryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentLoanHistoryBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setViewModelFactory(C1556g0.InterfaceC1559b interfaceC1559b) {
        Log_OC.getArray(interfaceC1559b, "<set-?>");
        this.viewModelFactory = interfaceC1559b;
    }
}
