package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentResetPin2Binding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletResetPinViewData;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletResetPinViewModel;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OutletMgtResetPinFragment.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtResetPinFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletResetPinViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletResetPinViewData;", "Lai/kudi/agent/databinding/FragmentResetPin2Binding;", "()V", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "getOutletMgtActivity", "()Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "setOutletMgtActivity", "(Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;)V", "outletResetPinViewModel", "getOutletResetPinViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletResetPinViewModel;", "setOutletResetPinViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletResetPinViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtResetPinFragment extends BaseMVVMViewBindingFragment<OutletResetPinViewModel, OutletResetPinViewData, FragmentResetPin2Binding> {
    public static final Companion Companion;
    private Outlet outlet;
    public OutletMgtActivity outletMgtActivity;
    public OutletResetPinViewModel outletResetPinViewModel;

    /* compiled from: OutletMgtResetPinFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtResetPinFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtResetPinFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/outlet_mgt/data/Outlet;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final OutletMgtResetPinFragment newInstance(Outlet outlet) {
            Log_OC.getArray(outlet, TransactionBreakDownItemType.DATA);
            OutletMgtResetPinFragment $r3 = new OutletMgtResetPinFragment();
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
    public static final OutletMgtResetPinFragment newInstance(Outlet outlet) {
        Companion $r0 = Companion;
        OutletMgtResetPinFragment $r1 = $r0.newInstance(outlet);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OutletResetPinViewData $r2 = (OutletResetPinViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(OutletResetPinViewData outletResetPinViewData) {
        Log_OC.getArray(outletResetPinViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OutletResetPinViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OutletResetPinViewModel createViewModel() {
        OutletResetPinViewModel $r1 = getOutletResetPinViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletMgtActivity getOutletMgtActivity() {
        OutletMgtActivity $r1 = this.outletMgtActivity;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletResetPinViewModel getOutletResetPinViewModel() {
        OutletResetPinViewModel $r1 = this.outletResetPinViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletResetPinViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OutletResetPinViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity");
            throw $r5;
        }
        OutletMgtActivity $r3 = (OutletMgtActivity) $r2;
        setOutletMgtActivity($r3);
        OutletMgtActivity $r32 = getOutletMgtActivity();
        OutletMgtSubComponent $r4 = $r32.getOutletMgtSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentResetPin2Binding $r4 = FragmentResetPin2Binding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
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
        OutletMgtActivity $r5 = getOutletMgtActivity();
        $r5.setTitle("Manage Outlet");
    }

    public final void setOutletMgtActivity(OutletMgtActivity outletMgtActivity) {
        Log_OC.getArray(outletMgtActivity, "<set-?>");
        this.outletMgtActivity = outletMgtActivity;
    }

    public final void setOutletResetPinViewModel(OutletResetPinViewModel outletResetPinViewModel) {
        Log_OC.getArray(outletResetPinViewModel, "<set-?>");
        this.outletResetPinViewModel = outletResetPinViewModel;
    }
}
