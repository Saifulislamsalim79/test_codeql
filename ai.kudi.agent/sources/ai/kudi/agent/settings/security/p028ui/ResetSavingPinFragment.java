package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentResetSavingPinBinding;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.security.p028ui.viewModels.ResetSavingPinViewModel;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.ResetSavingPinViewData;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ResetSavingPinFragment.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/ResetSavingPinFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/security/ui/viewModels/ResetSavingPinViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/ResetSavingPinViewData;", "Lai/kudi/agent/databinding/FragmentResetSavingPinBinding;", "()V", "resetSavingPinViewModel", "getResetSavingPinViewModel", "()Lai/kudi/agent/settings/security/ui/viewModels/ResetSavingPinViewModel;", "setResetSavingPinViewModel", "(Lai/kudi/agent/settings/security/ui/viewModels/ResetSavingPinViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.ResetSavingPinFragment */
/* loaded from: classes.dex */
public final class ResetSavingPinFragment extends BaseMVVMViewBindingFragment<ResetSavingPinViewModel, ResetSavingPinViewData, FragmentResetSavingPinBinding> {
    public static final Companion Companion;
    public ResetSavingPinViewModel resetSavingPinViewModel;

    /* compiled from: ResetSavingPinFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/ResetSavingPinFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/security/ui/ResetSavingPinFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.security.ui.ResetSavingPinFragment$Companion */
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
        public final ResetSavingPinFragment newInstance() {
            ResetSavingPinFragment $r1 = new ResetSavingPinFragment();
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
    public static final ResetSavingPinFragment newInstance() {
        Companion $r1 = Companion;
        ResetSavingPinFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40873onViewCreated$lambda1$lambda0(ResetSavingPinFragment resetSavingPinFragment, FragmentResetSavingPinBinding fragmentResetSavingPinBinding, View view) {
        Log_OC.getArray(resetSavingPinFragment, "this$0");
        Log_OC.getArray(fragmentResetSavingPinBinding, "$this_apply");
        ResetSavingPinViewModel $r3 = resetSavingPinFragment.getResetSavingPinViewModel();
        KudiInputField $r4 = fragmentResetSavingPinBinding.newPinView;
        String $r5 = $r4.getText();
        KudiInputField $r42 = fragmentResetSavingPinBinding.confirmNewPinView;
        String $r6 = $r42.getText();
        $r3.validateInput($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ResetSavingPinViewData $r2 = (ResetSavingPinViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ResetSavingPinViewData resetSavingPinViewData) {
        Log_OC.getArray(resetSavingPinViewData, "viewData");
        boolean $z0 = resetSavingPinViewData instanceof ResetSavingPinViewData.Error;
        if ($z0) {
            ResetSavingPinViewData.Error $r2 = (ResetSavingPinViewData.Error) resetSavingPinViewData;
            String $r3 = $r2.getError();
            if ($r3 != null) {
                FragmentActivity $r4 = requireActivity();
                Log_OC.loadImage($r4, "requireActivity()");
                ContextExtKt.toast$default($r4, $r3, 0, 2, (Object) null);
            }
            String $r32 = $r2.getPinError();
            if ($r32 != null) {
                InterfaceC8209a $r5 = requireBinding();
                FragmentResetSavingPinBinding $r6 = (FragmentResetSavingPinBinding) $r5;
                KudiInputField $r7 = $r6.newPinView;
                $r7.setError($r32);
            }
            String $r33 = $r2.getConfirmPinError();
            if ($r33 == null) {
                return;
            }
            InterfaceC8209a $r52 = requireBinding();
            FragmentResetSavingPinBinding $r62 = (FragmentResetSavingPinBinding) $r52;
            KudiInputField $r72 = $r62.confirmNewPinView;
            $r72.setError($r33);
            return;
        }
        boolean $z02 = resetSavingPinViewData instanceof ResetSavingPinViewData.ShowProgress;
        if (!$z02) {
            boolean $z03 = resetSavingPinViewData instanceof ResetSavingPinViewData.Success;
            if ($z03) {
                ResetSavingPinViewModel $r10 = getResetSavingPinViewModel();
                ResetSavingPinViewData.Success $r11 = (ResetSavingPinViewData.Success) resetSavingPinViewData;
                String $r34 = $r11.getMobileNo();
                InterfaceC8209a $r53 = requireBinding();
                FragmentResetSavingPinBinding $r63 = (FragmentResetSavingPinBinding) $r53;
                KudiInputField $r73 = $r63.confirmNewPinView;
                String $r12 = $r73.getText();
                $r10.navigateToConfirmOtp($r34, $r12);
                return;
            }
            return;
        }
        ResetSavingPinViewData.ShowProgress $r8 = (ResetSavingPinViewData.ShowProgress) resetSavingPinViewData;
        boolean $z04 = $r8.getVisibility();
        if ($z04) {
            InterfaceC8209a $r54 = requireBinding();
            FragmentResetSavingPinBinding $r64 = (FragmentResetSavingPinBinding) $r54;
            KudiButton $r9 = $r64.kbSendOtp;
            $r9.m38032f();
            return;
        }
        InterfaceC8209a $r55 = requireBinding();
        FragmentResetSavingPinBinding $r65 = (FragmentResetSavingPinBinding) $r55;
        KudiButton $r92 = $r65.kbSendOtp;
        $r92.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ResetSavingPinViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ResetSavingPinViewModel createViewModel() {
        ResetSavingPinViewModel $r1 = getResetSavingPinViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ResetSavingPinViewModel getResetSavingPinViewModel() {
        ResetSavingPinViewModel $r1 = this.resetSavingPinViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("resetSavingPinViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ResetSavingPinViewModel.class;
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
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r5;
        }
        SettingsActivity $r3 = (SettingsActivity) $r2;
        SettingsSubComponent $r4 = $r3.getSettingsSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentResetSavingPinBinding $r4 = FragmentResetSavingPinBinding.inflate(layoutInflater, viewGroup, false);
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
        String $r4 = getString(C0001R.string.reset_savings_pin);
        Log_OC.loadImage($r4, "getString(R.string.reset_savings_pin)");
        SettingsActivityExtKt.setSettingsTitle(this, $r4);
        InterfaceC8209a $r5 = requireBinding();
        final FragmentResetSavingPinBinding $r6 = (FragmentResetSavingPinBinding) $r5;
        ViewGroup $r7 = $r6.kbSendOtp;
        ViewGroup r9 = $r7;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.security.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ResetSavingPinFragment $r2 = ResetSavingPinFragment.this;
                FragmentResetSavingPinBinding $r3 = $r6;
                ResetSavingPinFragment.m40873onViewCreated$lambda1$lambda0($r2, $r3, view2);
            }
        });
    }

    public final void setResetSavingPinViewModel(ResetSavingPinViewModel resetSavingPinViewModel) {
        Log_OC.getArray(resetSavingPinViewModel, "<set-?>");
        this.resetSavingPinViewModel = resetSavingPinViewModel;
    }
}
