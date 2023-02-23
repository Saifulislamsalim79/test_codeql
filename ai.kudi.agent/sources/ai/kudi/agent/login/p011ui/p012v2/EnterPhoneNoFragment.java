package ai.kudi.agent.login.p011ui.p012v2;

import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentEnterPhoneNoBinding;
import ai.kudi.agent.login.game.components.ForgotPasswordSubComponent;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.EnterPhoneNoViewModel;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.data.EnterPhoneNoViewData;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: EnterPhoneNoFragment.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002J\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/login/ui/v2/EnterPhoneNoFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/login/ui/v2/viewModels/EnterPhoneNoViewModel;", "Lai/kudi/agent/login/ui/v2/viewModels/data/EnterPhoneNoViewData;", "Lai/kudi/agent/databinding/FragmentEnterPhoneNoBinding;", "()V", "vm", "getVm", "()Lai/kudi/agent/login/ui/v2/viewModels/EnterPhoneNoViewModel;", "setVm", "(Lai/kudi/agent/login/ui/v2/viewModels/EnterPhoneNoViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLoginButtonClicked", "onSendOtpClicked", "onViewCreated", "view", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.v2.EnterPhoneNoFragment */
/* loaded from: classes.dex */
public final class EnterPhoneNoFragment extends BaseMVVMViewBindingFragment<EnterPhoneNoViewModel, EnterPhoneNoViewData, FragmentEnterPhoneNoBinding> {
    public EnterPhoneNoViewModel srv;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onLoginButtonClicked() {
        EnterPhoneNoViewModel $r1 = getVm();
        InterfaceC8209a $r2 = requireBinding();
        FragmentEnterPhoneNoBinding $r3 = (FragmentEnterPhoneNoBinding) $r2;
        KudiInputField $r4 = $r3.phoneNumberInputField;
        String $r5 = $r4.getText();
        $r1.navigateToLoginView($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onSendOtpClicked() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentEnterPhoneNoBinding $r2 = (FragmentEnterPhoneNoBinding) $r1;
        KudiInputField $r3 = $r2.phoneNumberInputField;
        String $r4 = $r3.getText();
        EnterPhoneNoViewModel $r5 = getVm();
        $r5.sendOtpFor($r4);
        ContextExtKt.hideKeyboard(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m39800onViewCreated$lambda0(EnterPhoneNoFragment enterPhoneNoFragment, View view) {
        Log_OC.getArray(enterPhoneNoFragment, "this$0");
        enterPhoneNoFragment.onSendOtpClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m39801onViewCreated$lambda1(EnterPhoneNoFragment enterPhoneNoFragment, View view) {
        Log_OC.getArray(enterPhoneNoFragment, "this$0");
        enterPhoneNoFragment.onLoginButtonClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        EnterPhoneNoViewData $r2 = (EnterPhoneNoViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(EnterPhoneNoViewData enterPhoneNoViewData) {
        Log_OC.getArray(enterPhoneNoViewData, "viewData");
        boolean $z0 = enterPhoneNoViewData.isOtpSending();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentEnterPhoneNoBinding $r3 = (FragmentEnterPhoneNoBinding) $r2;
            KudiButton $r4 = $r3.sendOtp;
            $r4.m38032f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentEnterPhoneNoBinding $r32 = (FragmentEnterPhoneNoBinding) $r22;
            KudiButton $r42 = $r32.sendOtp;
            $r42.m38033e();
        }
        EnterPhoneNoViewData.Error $r5 = enterPhoneNoViewData.getError();
        if ($r5 == null) {
            return;
        }
        InterfaceC8209a $r23 = requireBinding();
        FragmentEnterPhoneNoBinding $r33 = (FragmentEnterPhoneNoBinding) $r23;
        KudiInputField $r6 = $r33.phoneNumberInputField;
        $r6.setError($r5.getPhoneNumber());
        String $r7 = $r5.getMessage();
        if ($r7 == null) {
            return;
        }
        FragmentActivity $r8 = getActivity();
        if ($r8 == null) {
            NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.login.ui.v2.ForgotPasswordActivity");
            throw $r11;
        }
        ForgotPasswordActivity $r9 = (ForgotPasswordActivity) $r8;
        View $r10 = requireView();
        Log_OC.loadImage($r10, "requireView()");
        $r9.showSnackBar($r10, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        EnterPhoneNoViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public EnterPhoneNoViewModel createViewModel() {
        EnterPhoneNoViewModel $r1 = getVm();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return EnterPhoneNoViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EnterPhoneNoViewModel getVm() {
        EnterPhoneNoViewModel $r1 = this.srv;
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
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.login.ui.v2.ForgotPasswordActivity");
            throw $r5;
        }
        ForgotPasswordActivity $r3 = (ForgotPasswordActivity) $r2;
        ForgotPasswordSubComponent $r4 = $r3.getForgotPasswordSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentEnterPhoneNoBinding $r4 = FragmentEnterPhoneNoBinding.inflate(layoutInflater, viewGroup, false);
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
        InterfaceC8209a $r3 = requireBinding();
        FragmentEnterPhoneNoBinding $r4 = (FragmentEnterPhoneNoBinding) $r3;
        ViewGroup $r5 = $r4.sendOtp;
        ViewGroup r12 = $r5;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.v2.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EnterPhoneNoFragment $r2 = EnterPhoneNoFragment.this;
                EnterPhoneNoFragment.m39800onViewCreated$lambda0($r2, view2);
            }
        });
        InterfaceC8209a $r32 = requireBinding();
        FragmentEnterPhoneNoBinding $r42 = (FragmentEnterPhoneNoBinding) $r32;
        BottomLoginViewBinding $r7 = $r42.view;
        TextView $r8 = $r7.loginButton;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.v2.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EnterPhoneNoFragment $r2 = EnterPhoneNoFragment.this;
                EnterPhoneNoFragment.m39801onViewCreated$lambda1($r2, view2);
            }
        });
    }

    public final void setVm(EnterPhoneNoViewModel enterPhoneNoViewModel) {
        Log_OC.getArray(enterPhoneNoViewModel, "<set-?>");
        this.srv = enterPhoneNoViewModel;
    }
}
