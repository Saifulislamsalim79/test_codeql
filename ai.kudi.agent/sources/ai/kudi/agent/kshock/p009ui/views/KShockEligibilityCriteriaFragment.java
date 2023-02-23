package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_kshock.databinding.FragmentKShockEligibilityCriteriaBinding;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter;
import ai.kudi.agent.kshock.presentation.KShockEligibilityCriteriaViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.KShockEligibilityCriteriaViewState;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KShockEligibilityCriteriaFragment.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006("}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KShockEligibilityCriteriaFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/KShockEligibilityCriteriaViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KShockEligibilityCriteriaViewState;", "Lai/kudi/agent/feature_kshock/databinding/FragmentKShockEligibilityCriteriaBinding;", "()V", "criteriaAdapter", "Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter;", "navigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "getNavigator", "()Lai/kudi/agent/kshock/navigator/KShockNavigator;", "setNavigator", "(Lai/kudi/agent/kshock/navigator/KShockNavigator;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/kshock/presentation/KShockEligibilityCriteriaViewModel;", "setViewModel", "(Lai/kudi/agent/kshock/presentation/KShockEligibilityCriteriaViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupAdapter", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KShockEligibilityCriteriaFragment */
/* loaded from: classes.dex */
public final class KShockEligibilityCriteriaFragment extends BaseMVVMViewBindingFragment<KShockEligibilityCriteriaViewModel, KShockEligibilityCriteriaViewState, FragmentKShockEligibilityCriteriaBinding> {
    public static final Companion Companion;
    private final KShockEligibilityCriteriaAdapter criteriaAdapter;
    public KShockNavigator navigator;
    public KShockEligibilityCriteriaViewModel viewModel;

    /* compiled from: KShockEligibilityCriteriaFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KShockEligibilityCriteriaFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/kshock/ui/views/KShockEligibilityCriteriaFragment;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.KShockEligibilityCriteriaFragment$Companion */
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
        public final KShockEligibilityCriteriaFragment newInstance() {
            KShockEligibilityCriteriaFragment $r1 = new KShockEligibilityCriteriaFragment();
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
    public KShockEligibilityCriteriaFragment() {
        KShockEligibilityCriteriaFragment$criteriaAdapter$1 $r2 = new KShockEligibilityCriteriaFragment$criteriaAdapter$1(this);
        KShockEligibilityCriteriaAdapter $r1 = new KShockEligibilityCriteriaAdapter($r2);
        this.criteriaAdapter = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupAdapter() {
        Context $r2 = getContext();
        LinearLayoutManager r8 = new LinearLayoutManager($r2);
        InterfaceC8209a $r3 = requireBinding();
        FragmentKShockEligibilityCriteriaBinding $r4 = (FragmentKShockEligibilityCriteriaBinding) $r3;
        RecyclerView $r5 = $r4.eligibilityCriteriaList;
        $r5.setLayoutManager(r8);
        RecyclerView r10 = $r5;
        Context $r22 = r10.getContext();
        C1723k r9 = new C1723k($r22, 1);
        $r5.m35294h(r9);
        KShockEligibilityCriteriaAdapter $r7 = this.criteriaAdapter;
        $r5.setAdapter($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KShockEligibilityCriteriaViewState $r2 = (KShockEligibilityCriteriaViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(KShockEligibilityCriteriaViewState kShockEligibilityCriteriaViewState) {
        Log_OC.getArray(kShockEligibilityCriteriaViewState, "viewData");
        KShockEligibilityCriteriaAdapter $r2 = this.criteriaAdapter;
        List $r3 = kShockEligibilityCriteriaViewState.getEligibilityCriteria();
        $r2.setItems($r3);
        boolean $z0 = kShockEligibilityCriteriaViewState.isLoading();
        if ($z0) {
            InterfaceC8209a $r4 = requireBinding();
            FragmentKShockEligibilityCriteriaBinding $r5 = (FragmentKShockEligibilityCriteriaBinding) $r4;
            FrameLayout $r6 = $r5.progressBar;
            Log_OC.loadImage($r6, "requireBinding().progressBar");
            ViewExtKt.show($r6);
        } else {
            InterfaceC8209a $r42 = requireBinding();
            FragmentKShockEligibilityCriteriaBinding $r52 = (FragmentKShockEligibilityCriteriaBinding) $r42;
            FrameLayout $r62 = $r52.progressBar;
            Log_OC.loadImage($r62, "requireBinding().progressBar");
            ViewExtKt.hide$default($r62, false, 1, null);
        }
        String $r7 = kShockEligibilityCriteriaViewState.getErrorMessage();
        if ($r7 == null) {
            return;
        }
        Context $r8 = requireContext();
        Log_OC.loadImage($r8, "requireContext()");
        ContextExtKt.toast$default($r8, $r7, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KShockEligibilityCriteriaViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public KShockEligibilityCriteriaViewModel createViewModel() {
        KShockEligibilityCriteriaViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KShockNavigator getNavigator() {
        KShockNavigator $r1 = this.navigator;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("navigator");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return KShockEligibilityCriteriaViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final KShockEligibilityCriteriaViewModel getViewModel() {
        KShockEligibilityCriteriaViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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
        FragmentKShockEligibilityCriteriaBinding $r4 = FragmentKShockEligibilityCriteriaBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
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
        FragmentActivity $r3 = getActivity();
        boolean $z0 = $r3 instanceof KShockActivity;
        KShockActivity $r4 = $z0 ? (KShockActivity) $r3 : null;
        if ($r4 != null) {
            $r4.showSupportActionBar();
        }
        KShockEligibilityCriteriaViewModel $r5 = getViewModel();
        $r5.onViewCreated();
        setupAdapter();
    }

    public final void setNavigator(KShockNavigator kShockNavigator) {
        Log_OC.getArray(kShockNavigator, "<set-?>");
        this.navigator = kShockNavigator;
    }

    public final void setViewModel(KShockEligibilityCriteriaViewModel kShockEligibilityCriteriaViewModel) {
        Log_OC.getArray(kShockEligibilityCriteriaViewModel, "<set-?>");
        this.viewModel = kShockEligibilityCriteriaViewModel;
    }
}
