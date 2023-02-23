package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentResetPin2Binding;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.security.p028ui.viewModels.ChangePinViewModel;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.ChangePinViewData;
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
/* compiled from: ResetPinFragment.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/ResetPinFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/security/ui/viewModels/ChangePinViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/ChangePinViewData;", "Lai/kudi/agent/databinding/FragmentResetPin2Binding;", "()V", "fac", "Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "getFac", "()Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "setFac", "(Lai/kudi/agent/biometric/security/IPFSecurityUtils;)V", "vm", "getVm", "()Lai/kudi/agent/settings/security/ui/viewModels/ChangePinViewModel;", "setVm", "(Lai/kudi/agent/settings/security/ui/viewModels/ChangePinViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.ResetPinFragment */
/* loaded from: classes.dex */
public final class ResetPinFragment extends BaseMVVMViewBindingFragment<ChangePinViewModel, ChangePinViewData, FragmentResetPin2Binding> {
    public static final Companion Companion;
    public ChangePinViewModel errorReason;
    public IPFSecurityUtils srv;

    /* compiled from: ResetPinFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/ResetPinFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/security/ui/ResetPinFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.security.ui.ResetPinFragment$Companion */
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
        public final ResetPinFragment newInstance() {
            ResetPinFragment $r1 = new ResetPinFragment();
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
    public static final ResetPinFragment newInstance() {
        Companion $r1 = Companion;
        ResetPinFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40872onViewCreated$lambda1$lambda0(FragmentResetPin2Binding fragmentResetPin2Binding, ResetPinFragment resetPinFragment, View view) {
        Log_OC.getArray(fragmentResetPin2Binding, "$this_apply");
        Log_OC.getArray(resetPinFragment, "this$0");
        KudiInputField $r3 = fragmentResetPin2Binding.currentPinView;
        String $r4 = $r3.getText();
        KudiInputField $r32 = fragmentResetPin2Binding.newPinView;
        String $r5 = $r32.getText();
        IPFSecurityUtils $r6 = resetPinFragment.getFac();
        FragmentActivity $r7 = resetPinFragment.requireActivity();
        Log_OC.loadImage($r7, "requireActivity()");
        String $r8 = $r6.encode($r7, "fp_pin_lock_screen_key_store", $r5, false);
        KudiInputField $r33 = fragmentResetPin2Binding.confirmNewPinView;
        String $r9 = $r33.getText();
        ChangePinViewModel $r10 = resetPinFragment.getVm();
        $r10.resetPin($r5, $r4, $r9, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ChangePinViewData $r2 = (ChangePinViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ChangePinViewData changePinViewData) {
        FragmentActivity $r8;
        Log_OC.getArray(changePinViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentResetPin2Binding $r3 = (FragmentResetPin2Binding) $r2;
        boolean $z0 = changePinViewData.isChangingPin();
        if ($z0) {
            KudiButton $r4 = $r3.resetPinView;
            $r4.m38032f();
        } else {
            KudiButton $r42 = $r3.resetPinView;
            $r42.m38033e();
        }
        ChangePinViewData.Error $r5 = changePinViewData.getError();
        if ($r5 == null) {
            return;
        }
        KudiInputField $r6 = $r3.currentPinView;
        String $r7 = $r5.getOldPin();
        $r6.setError($r7);
        KudiInputField $r62 = $r3.newPinView;
        String $r72 = $r5.getNewPin();
        $r62.setError($r72);
        KudiInputField $r63 = $r3.confirmNewPinView;
        String $r73 = $r5.getNewPin();
        $r63.setError($r73);
        String $r74 = $r5.getMessage();
        if ($r74 == null || ($r8 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r8, $r74, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ChangePinViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ChangePinViewModel createViewModel() {
        ChangePinViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IPFSecurityUtils getFac() {
        IPFSecurityUtils $r1 = this.srv;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("fac");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ChangePinViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ChangePinViewModel getVm() {
        ChangePinViewModel $r1 = this.errorReason;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
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
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        String $r3 = getString(C0001R.string.reset_pin);
        Log_OC.loadImage($r3, "getString(R.string.reset_pin)");
        SettingsActivityExtKt.setSettingsTitle(this, $r3);
        InterfaceC8209a $r4 = requireBinding();
        final FragmentResetPin2Binding $r5 = (FragmentResetPin2Binding) $r4;
        ViewGroup $r6 = $r5.resetPinView;
        ViewGroup r9 = $r6;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.security.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FragmentResetPin2Binding $r2 = FragmentResetPin2Binding.this;
                ResetPinFragment $r32 = this;
                ResetPinFragment.m40872onViewCreated$lambda1$lambda0($r2, $r32, view2);
            }
        });
    }

    public final void setFac(IPFSecurityUtils iPFSecurityUtils) {
        Log_OC.getArray(iPFSecurityUtils, "<set-?>");
        this.srv = iPFSecurityUtils;
    }

    public final void setVm(ChangePinViewModel changePinViewModel) {
        Log_OC.getArray(changePinViewModel, "<set-?>");
        this.errorReason = changePinViewModel;
    }
}
