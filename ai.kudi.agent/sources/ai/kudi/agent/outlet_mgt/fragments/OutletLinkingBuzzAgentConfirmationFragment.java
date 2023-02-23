package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentOutletLinkingBuzzAgentConfirmationBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletLinkingBuzzAgentConfirmationFragment.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0001J$\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010\u0015\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletLinkingBuzzAgentConfirmationFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentOutletLinkingBuzzAgentConfirmationBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentOutletLinkingBuzzAgentConfirmationBinding;", "initBinding", "Landroid/view/View;", "fragment", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "requireBinding", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletLinkingBuzzAgentConfirmationFragment extends Fragment implements BaseViewBinder<FragmentOutletLinkingBuzzAgentConfirmationBinding> {
    private final /* synthetic */ BaseViewBinderImpl<FragmentOutletLinkingBuzzAgentConfirmationBinding> $$delegate_0;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletLinkingBuzzAgentConfirmationFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m39872onViewCreated$lambda0(OutletLinkingBuzzAgentConfirmationFragment outletLinkingBuzzAgentConfirmationFragment, View view) {
        Log_OC.getArray(outletLinkingBuzzAgentConfirmationFragment, "this$0");
        boolean $z0 = outletLinkingBuzzAgentConfirmationFragment.getActivity() instanceof OutletMgtActivity;
        if ($z0) {
            FragmentActivity $r3 = outletLinkingBuzzAgentConfirmationFragment.getActivity();
            if ($r3 == null) {
                NullPointerException r7 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity");
                throw r7;
            }
            OutletMgtActivity $r4 = (OutletMgtActivity) $r3;
            AppCompatActivity r8 = (AppCompatActivity) $r4;
            AppCompatActivityExtKt.popAllFragmentsInActivity$default(r8, null, 1, null);
            OutletsListingFragment r6 = new OutletsListingFragment();
            AppCompatActivity r82 = (AppCompatActivity) $r4;
            AppCompatActivityExtKt.startFragment$default(r82, r6, C0001R.C0003id.contentFrameLayout, true, false, false, 24, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentOutletLinkingBuzzAgentConfirmationBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentOutletLinkingBuzzAgentConfirmationBinding $r3 = (FragmentOutletLinkingBuzzAgentConfirmationBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentOutletLinkingBuzzAgentConfirmationBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentOutletLinkingBuzzAgentConfirmationBinding fragmentOutletLinkingBuzzAgentConfirmationBinding, Fragment fragment) {
        Log_OC.getArray(fragmentOutletLinkingBuzzAgentConfirmationBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentOutletLinkingBuzzAgentConfirmationBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentOutletLinkingBuzzAgentConfirmationBinding $r4 = (FragmentOutletLinkingBuzzAgentConfirmationBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOutletLinkingBuzzAgentConfirmationBinding $r4 = FragmentOutletLinkingBuzzAgentConfirmationBinding.inflate(layoutInflater, viewGroup, false);
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
        FragmentOutletLinkingBuzzAgentConfirmationBinding $r1 = requireBinding();
        ImageView $r4 = $r1.closeButton;
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.EulaActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletLinkingBuzzAgentConfirmationFragment $r2 = OutletLinkingBuzzAgentConfirmationFragment.this;
                OutletLinkingBuzzAgentConfirmationFragment.m39872onViewCreated$lambda0($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentOutletLinkingBuzzAgentConfirmationBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentOutletLinkingBuzzAgentConfirmationBinding $r3 = (FragmentOutletLinkingBuzzAgentConfirmationBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentOutletLinkingBuzzAgentConfirmationBinding $r1 = requireBinding();
        return $r1;
    }
}
