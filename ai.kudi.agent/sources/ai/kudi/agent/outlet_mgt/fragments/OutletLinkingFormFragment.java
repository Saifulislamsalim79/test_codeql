package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentOutletLinkingFormBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.OutletLinkingResponse;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletLinkingFormViewModel;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletLinkingFormFragment.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0010H\u0002J\u001a\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010#\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletLinkingFormFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel$OutletLinkingFormViewData;", "Lai/kudi/agent/databinding/FragmentOutletLinkingFormBinding;", "()V", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "phoneNumber", "", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel;", "setScreenViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletLinkingFormViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onNavButtonClicked", "onViewCreated", "view", "showSuccessScreen", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletLinkingFormFragment extends BaseMVVMViewBindingFragment<OutletLinkingFormViewModel, OutletLinkingFormViewModel.OutletLinkingFormViewData, FragmentOutletLinkingFormBinding> {
    private OutletMgtActivity outletMgtActivity;
    private String phoneNumber = "";
    public OutletLinkingFormViewModel screenViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onNavButtonClicked() {
        OutletMgtActivity $r1 = this.outletMgtActivity;
        if ($r1 == null) {
            Log_OC.LogError("outletMgtActivity");
            NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
            throw r3;
        }
        $r1.setNavigationAction(null);
        OutletMgtActivity $r12 = this.outletMgtActivity;
        if ($r12 == null) {
            Log_OC.LogError("outletMgtActivity");
            NullPointerException r32 = new NullPointerException("Null throw statement replaced by Soot");
            throw r32;
        }
        OutletMgtActivity.toggleToolbar$default($r12, false, 1, null);
        OutletMgtActivity $r13 = this.outletMgtActivity;
        if ($r13 == null) {
            Log_OC.LogError("outletMgtActivity");
            NullPointerException r33 = new NullPointerException("Null throw statement replaced by Soot");
            throw r33;
        }
        AppCompatActivity r5 = (AppCompatActivity) $r13;
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(r5, null, 1, null);
        OutletsListingFragment r4 = new OutletsListingFragment();
        OutletMgtActivity $r14 = this.outletMgtActivity;
        if ($r14 != null) {
            AppCompatActivity r52 = (AppCompatActivity) $r14;
            AppCompatActivityExtKt.startFragment$default(r52, r4, C0001R.C0003id.contentFrameLayout, true, false, false, 24, null);
            return;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r34 = new NullPointerException("Null throw statement replaced by Soot");
        throw r34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m39876onViewCreated$lambda0(OutletLinkingFormFragment outletLinkingFormFragment, View view) {
        Log_OC.getArray(outletLinkingFormFragment, "this$0");
        InterfaceC8209a $r3 = outletLinkingFormFragment.requireBinding();
        FragmentOutletLinkingFormBinding $r4 = (FragmentOutletLinkingFormBinding) $r3;
        KudiInputField $r5 = $r4.etOutletPhoneNum;
        String $r0 = $r5.getText();
        outletLinkingFormFragment.phoneNumber = $r0;
        OutletLinkingFormViewModel $r6 = outletLinkingFormFragment.getScreenViewModel();
        String $r02 = outletLinkingFormFragment.phoneNumber;
        InterfaceC8209a $r32 = outletLinkingFormFragment.requireBinding();
        FragmentOutletLinkingFormBinding $r42 = (FragmentOutletLinkingFormBinding) $r32;
        KudiInputField $r52 = $r42.etOutletPin;
        String $r7 = $r52.getText();
        $r6.submitLinkingRequest($r02, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showSuccessScreen() {
        OutletMgtActivity $r1 = this.outletMgtActivity;
        if ($r1 == null) {
            Log_OC.LogError("outletMgtActivity");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        OutletLinkingFormFragment$showSuccessScreen$1 $r2 = new OutletLinkingFormFragment$showSuccessScreen$1(this);
        $r1.setNavigationAction($r2);
        OutletMgtActivity $r12 = this.outletMgtActivity;
        if ($r12 == null) {
            Log_OC.LogError("outletMgtActivity");
            NullPointerException r92 = new NullPointerException("Null throw statement replaced by Soot");
            throw r92;
        }
        $r12.toggleToolbar(false);
        SuccessScreenDialogFragment.Companion $r3 = SuccessScreenDialogFragment.Companion;
        String $r5 = this.phoneNumber;
        SuccessScreenCustomOption $r4 = new SuccessScreenCustomOption("Your request has been sent", Log_OC.m10359a($r5, (Object) " will get your account linking request. If request is accepted, both accounts will be linked and details of the account will be accessible to you in the outlet list."), "Go Back", false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_msg_sent, 0, false, 7160, null);
        C0338xd03a74cd $r6 = new C0338xd03a74cd(this);
        SuccessScreenDialogFragment $r7 = $r3.newInstance($r4, $r6);
        FragmentManager $r8 = getChildFragmentManager();
        $r7.show($r8, SuccessScreenDialogFragment.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OutletLinkingFormViewModel.OutletLinkingFormViewData $r2 = (OutletLinkingFormViewModel.OutletLinkingFormViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(OutletLinkingFormViewModel.OutletLinkingFormViewData outletLinkingFormViewData) {
        Log_OC.getArray(outletLinkingFormViewData, "viewData");
        boolean $z0 = outletLinkingFormViewData.getShowLoader();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentOutletLinkingFormBinding $r3 = (FragmentOutletLinkingFormBinding) $r2;
            KudiButton $r4 = $r3.btnAddOutlet;
            $r4.m38032f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentOutletLinkingFormBinding $r32 = (FragmentOutletLinkingFormBinding) $r22;
            KudiButton $r42 = $r32.btnAddOutlet;
            $r42.m38033e();
        }
        OutletLinkingResponse $r5 = outletLinkingFormViewData.getOutletLinkingResponse();
        if ($r5 != null) {
            showSuccessScreen();
        }
        OutletLinkingFormViewModel.OutletLinkingFormError $r6 = outletLinkingFormViewData.getError();
        if ($r6 == null) {
            return;
        }
        String $r7 = $r6.getPhoneNumber();
        if ($r7 != null) {
            InterfaceC8209a $r23 = requireBinding();
            FragmentOutletLinkingFormBinding $r33 = (FragmentOutletLinkingFormBinding) $r23;
            KudiInputField $r8 = $r33.etOutletPhoneNum;
            $r8.setError($r7);
        }
        String $r72 = $r6.getPin();
        if ($r72 != null) {
            InterfaceC8209a $r24 = requireBinding();
            FragmentOutletLinkingFormBinding $r34 = (FragmentOutletLinkingFormBinding) $r24;
            KudiInputField $r82 = $r34.etOutletPin;
            $r82.setError($r72);
        }
        String $r73 = $r6.getError();
        if ($r73 == null) {
            return;
        }
        FragmentActivity $r9 = requireActivity();
        Log_OC.loadImage($r9, "requireActivity()");
        ContextExtKt.toast$default($r9, $r73, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OutletLinkingFormViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OutletLinkingFormViewModel createViewModel() {
        OutletLinkingFormViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletLinkingFormViewModel getScreenViewModel() {
        OutletLinkingFormViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OutletLinkingFormViewModel.class;
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
        FragmentOutletLinkingFormBinding $r4 = FragmentOutletLinkingFormBinding.inflate(layoutInflater, viewGroup, false);
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
        InterfaceC8209a $r1 = requireBinding();
        FragmentOutletLinkingFormBinding $r4 = (FragmentOutletLinkingFormBinding) $r1;
        ViewGroup $r5 = $r4.btnAddOutlet;
        ViewGroup r8 = $r5;
        r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.EulaActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletLinkingFormFragment $r2 = OutletLinkingFormFragment.this;
                OutletLinkingFormFragment.m39876onViewCreated$lambda0($r2, view2);
            }
        });
    }

    public final void setScreenViewModel(OutletLinkingFormViewModel outletLinkingFormViewModel) {
        Log_OC.getArray(outletLinkingFormViewModel, "<set-?>");
        this.screenViewModel = outletLinkingFormViewModel;
    }
}
