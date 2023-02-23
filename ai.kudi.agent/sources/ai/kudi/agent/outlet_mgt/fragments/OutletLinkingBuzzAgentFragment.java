package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentOutletLinkingBuzzAgentBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingBuzzAgentViewModel;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletLinkingBuzzAgentFragment.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletLinkingBuzzAgentFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingBuzzAgentViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingBuzzAgentViewModel$OutletLinkingBuzzAgentViewData;", "Lai/kudi/agent/databinding/FragmentOutletLinkingBuzzAgentBinding;", "()V", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingBuzzAgentViewModel;", "setScreenViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingBuzzAgentViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletLinkingBuzzAgentFragment extends BaseMVVMViewBindingFragment<OutletLinkingBuzzAgentViewModel, OutletLinkingBuzzAgentViewModel.OutletLinkingBuzzAgentViewData, FragmentOutletLinkingBuzzAgentBinding> {
    public static final Companion Companion;
    private Outlet outlet;
    private OutletMgtActivity outletMgtActivity;
    public OutletLinkingBuzzAgentViewModel screenViewModel;

    /* compiled from: OutletLinkingBuzzAgentFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletLinkingBuzzAgentFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/OutletLinkingBuzzAgentFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/outlet_mgt/data/Outlet;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final OutletLinkingBuzzAgentFragment newInstance(Outlet outlet) {
            Log_OC.getArray(outlet, TransactionBreakDownItemType.DATA);
            OutletLinkingBuzzAgentFragment $r3 = new OutletLinkingBuzzAgentFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(ConstKt.OUTLET_DATA, outlet);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
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
    public static final OutletLinkingBuzzAgentFragment newInstance(Outlet outlet) {
        Companion $r0 = Companion;
        OutletLinkingBuzzAgentFragment $r1 = $r0.newInstance(outlet);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-0  reason: not valid java name */
    public static final void m39873onViewCreated$lambda3$lambda0(OutletLinkingBuzzAgentFragment outletLinkingBuzzAgentFragment, View view) {
        Log_OC.getArray(outletLinkingBuzzAgentFragment, "this$0");
        OutletMgtActivity $r2 = outletLinkingBuzzAgentFragment.outletMgtActivity;
        if ($r2 != null) {
            $r2.onBackPressed();
            return;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
        throw r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-1  reason: not valid java name */
    public static final void m39874onViewCreated$lambda3$lambda1(OutletLinkingBuzzAgentFragment outletLinkingBuzzAgentFragment, View view) {
        Log_OC.getArray(outletLinkingBuzzAgentFragment, "this$0");
        OutletMgtActivity $r2 = outletLinkingBuzzAgentFragment.outletMgtActivity;
        if ($r2 != null) {
            $r2.onBackPressed();
            return;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
        throw r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39875onViewCreated$lambda3$lambda2(OutletLinkingBuzzAgentFragment outletLinkingBuzzAgentFragment, View view) {
        Log_OC.getArray(outletLinkingBuzzAgentFragment, "this$0");
        OutletLinkingBuzzAgentViewModel $r3 = outletLinkingBuzzAgentFragment.getScreenViewModel();
        Outlet $r4 = outletLinkingBuzzAgentFragment.outlet;
        Log_OC.append($r4);
        String $r5 = $r4.getOutletId();
        OutletLinkingBuzzAgentFragment$onViewCreated$1$3$1 $r1 = new OutletLinkingBuzzAgentFragment$onViewCreated$1$3$1(outletLinkingBuzzAgentFragment);
        $r3.buzzPendingOutlet($r5, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OutletLinkingBuzzAgentViewModel.OutletLinkingBuzzAgentViewData $r2 = (OutletLinkingBuzzAgentViewModel.OutletLinkingBuzzAgentViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(OutletLinkingBuzzAgentViewModel.OutletLinkingBuzzAgentViewData outletLinkingBuzzAgentViewData) {
        Log_OC.getArray(outletLinkingBuzzAgentViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentOutletLinkingBuzzAgentBinding $r3 = (FragmentOutletLinkingBuzzAgentBinding) $r2;
        boolean $z0 = outletLinkingBuzzAgentViewData.isLoading();
        if ($z0) {
            TextView $r4 = $r3.tvBtnBuzz;
            $r4.setEnabled(false);
            ViewLoaderBinding $r5 = $r3.loaderView;
            View $r6 = $r5.getRoot();
            Log_OC.loadImage($r6, "loaderView.root");
            View r10 = $r6;
            ViewExtKt.show(r10);
        } else {
            TextView $r42 = $r3.tvBtnBuzz;
            $r42.setEnabled(true);
            ViewLoaderBinding $r52 = $r3.loaderView;
            View $r62 = $r52.getRoot();
            Log_OC.loadImage($r62, "loaderView.root");
            View r102 = $r62;
            ViewExtKt.hide$default(r102, false, 1, null);
        }
        String $r7 = outletLinkingBuzzAgentViewData.getError();
        if ($r7 == null) {
            return;
        }
        OutletMgtActivity $r8 = this.outletMgtActivity;
        if ($r8 != null) {
            Context r11 = (Context) $r8;
            ContextExtKt.toast$default(r11, $r7, 0, 2, (Object) null);
            return;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
        throw r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OutletLinkingBuzzAgentViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OutletLinkingBuzzAgentViewModel createViewModel() {
        OutletLinkingBuzzAgentViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletLinkingBuzzAgentViewModel getScreenViewModel() {
        OutletLinkingBuzzAgentViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OutletLinkingBuzzAgentViewModel.class;
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
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOutletLinkingBuzzAgentBinding $r4 = FragmentOutletLinkingBuzzAgentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Outlet $r3;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = getArguments();
        if ($r2 == null) {
            $r3 = null;
        } else {
            Parcelable $r4 = $r2.getParcelable(ConstKt.OUTLET_DATA);
            $r3 = (Outlet) $r4;
        }
        this.outlet = $r3;
        OutletMgtActivity $r5 = this.outletMgtActivity;
        if ($r5 == null) {
            Log_OC.LogError("outletMgtActivity");
            NullPointerException r16 = new NullPointerException("Null throw statement replaced by Soot");
            throw r16;
        }
        $r5.toggleToolbar(false);
        InterfaceC8209a $r6 = requireBinding();
        FragmentOutletLinkingBuzzAgentBinding $r7 = (FragmentOutletLinkingBuzzAgentBinding) $r6;
        ViewGroup $r8 = $r7.btnAction;
        ViewGroup r20 = $r8;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletLinkingBuzzAgentFragment $r22 = OutletLinkingBuzzAgentFragment.this;
                OutletLinkingBuzzAgentFragment.m39873onViewCreated$lambda3$lambda0($r22, view2);
            }
        });
        ImageView $r10 = $r7.closeButtonBuzz;
        $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletLinkingBuzzAgentFragment $r22 = OutletLinkingBuzzAgentFragment.this;
                OutletLinkingBuzzAgentFragment.m39874onViewCreated$lambda3$lambda1($r22, view2);
            }
        });
        Outlet $r32 = this.outlet;
        Log_OC.append($r32);
        boolean $z0 = $r32.getDueToBeNotified();
        if ($z0) {
            TextView $r12 = $r7.tvBtnBuzz;
            Log_OC.loadImage($r12, "tvBtnBuzz");
            ViewExtKt.show($r12);
        } else {
            TextView $r122 = $r7.tvBtnBuzz;
            Log_OC.loadImage($r122, "tvBtnBuzz");
            ViewExtKt.hide$default($r122, false, 1, null);
        }
        TextView $r123 = $r7.tvMsg;
        Outlet $r33 = this.outlet;
        Log_OC.append($r33);
        String $r14 = $r33.getPhoneNumber();
        Object[] $r13 = {$r14};
        String $r142 = getString(C0001R.string.remind_agent_text, $r13);
        $r123.setText($r142);
        $r7.tvBtnBuzz.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletLinkingBuzzAgentFragment $r22 = OutletLinkingBuzzAgentFragment.this;
                OutletLinkingBuzzAgentFragment.m39875onViewCreated$lambda3$lambda2($r22, view2);
            }
        });
    }

    public final void setScreenViewModel(OutletLinkingBuzzAgentViewModel outletLinkingBuzzAgentViewModel) {
        Log_OC.getArray(outletLinkingBuzzAgentViewModel, "<set-?>");
        this.screenViewModel = outletLinkingBuzzAgentViewModel;
    }
}
