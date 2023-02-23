package ai.kudi.agent.login.p011ui.p012v2;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentResetPinBinding;
import ai.kudi.agent.login.game.components.ForgotPasswordSubComponent;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.ResetPinViewModel;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.data.ResetPinViewData;
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
@Metadata(m10422d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u001a\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\"\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/login/ui/v2/ResetPinFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/login/ui/v2/viewModels/ResetPinViewModel;", "Lai/kudi/agent/login/ui/v2/viewModels/data/ResetPinViewData;", "Lai/kudi/agent/databinding/FragmentResetPinBinding;", "()V", "phoneNumber", "", "vm", "getVm", "()Lai/kudi/agent/login/ui/v2/viewModels/ResetPinViewModel;", "setVm", "(Lai/kudi/agent/login/ui/v2/viewModels/ResetPinViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResetPinClicked", "onViewCreated", "view", "setTitle", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.v2.ResetPinFragment */
/* loaded from: classes.dex */
public final class ResetPinFragment extends BaseMVVMViewBindingFragment<ResetPinViewModel, ResetPinViewData, FragmentResetPinBinding> {
    private static final String ARG_PHONE_NUMBER;
    public static final Companion Companion;
    private String phoneNumber;
    public ResetPinViewModel srv;

    /* compiled from: ResetPinFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/login/ui/v2/ResetPinFragment$Companion;", "", "()V", "ARG_PHONE_NUMBER", "", "newInstance", "Lai/kudi/agent/login/ui/v2/ResetPinFragment;", "phoneNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.ui.v2.ResetPinFragment$Companion */
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
        public final ResetPinFragment newInstance(String str) {
            Log_OC.getArray(str, "phoneNumber");
            ResetPinFragment $r4 = new ResetPinFragment();
            Bundle $r2 = new Bundle();
            String $r3 = ResetPinFragment.ARG_PHONE_NUMBER;
            $r2.putString($r3, str);
            $r4.setArguments($r2);
            return $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        ARG_PHONE_NUMBER = "args_phone_number";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onResetPinClicked() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentResetPinBinding $r3 = (FragmentResetPinBinding) $r2;
        KudiInputField $r4 = $r3.newPinInputView;
        String $r5 = $r4.getText();
        InterfaceC8209a $r22 = requireBinding();
        FragmentResetPinBinding $r32 = (FragmentResetPinBinding) $r22;
        KudiInputField $r42 = $r32.confirmPinInputView;
        String $r6 = $r42.getText();
        BaseViewModel $r7 = getViewModel();
        ResetPinViewModel $r8 = (ResetPinViewModel) $r7;
        String $r1 = this.phoneNumber;
        if ($r1 != null) {
            $r8.submitPin($r1, $r5, $r6);
            return;
        }
        Log_OC.LogError("phoneNumber");
        NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
        throw r9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m39803onViewCreated$lambda1(ResetPinFragment resetPinFragment, View view) {
        Log_OC.getArray(resetPinFragment, "this$0");
        resetPinFragment.onResetPinClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setTitle() {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            return;
        }
        $r1.setTitle(C0001R.string.secure_account);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ResetPinViewData $r2 = (ResetPinViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ResetPinViewData resetPinViewData) {
        FragmentActivity $r6;
        FragmentActivity $r62;
        Log_OC.getArray(resetPinViewData, "viewData");
        boolean $z0 = resetPinViewData.isSubmittingPin();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentResetPinBinding $r3 = (FragmentResetPinBinding) $r2;
            KudiButton $r4 = $r3.resetPinButton;
            $r4.m38032f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentResetPinBinding $r32 = (FragmentResetPinBinding) $r22;
            KudiButton $r42 = $r32.resetPinButton;
            $r42.m38033e();
        }
        String $r5 = resetPinViewData.getSuccessMessage();
        if ($r5 != null && ($r62 = getActivity()) != null) {
            ContextExtKt.toast$default($r62, $r5, 0, 2, (Object) null);
        }
        ResetPinViewData.Error $r7 = resetPinViewData.getError();
        if ($r7 == null) {
            return;
        }
        InterfaceC8209a $r23 = requireBinding();
        FragmentResetPinBinding $r33 = (FragmentResetPinBinding) $r23;
        KudiInputField $r8 = $r33.newPinInputView;
        $r8.setError($r7.getPinError());
        InterfaceC8209a $r24 = requireBinding();
        FragmentResetPinBinding $r34 = (FragmentResetPinBinding) $r24;
        KudiInputField $r82 = $r34.confirmPinInputView;
        $r82.setError($r7.getConfirmPinError());
        String $r52 = $r7.getMessage();
        if ($r52 == null || ($r6 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r6, $r52, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ResetPinViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ResetPinViewModel createViewModel() {
        ResetPinViewModel $r1 = getVm();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ResetPinViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ResetPinViewModel getVm() {
        ResetPinViewModel $r1 = this.srv;
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getString(ARG_PHONE_NUMBER);
        Log_OC.append($r2);
        Log_OC.loadImage($r2, "getString(ARG_PHONE_NUMBER)!!");
        this.phoneNumber = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentResetPinBinding $r4 = FragmentResetPinBinding.inflate(layoutInflater, viewGroup, false);
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
        setTitle();
        InterfaceC8209a $r1 = requireBinding();
        FragmentResetPinBinding $r4 = (FragmentResetPinBinding) $r1;
        ViewGroup $r5 = $r4.resetPinButton;
        ViewGroup r8 = $r5;
        r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.v2.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ResetPinFragment $r2 = ResetPinFragment.this;
                ResetPinFragment.m39803onViewCreated$lambda1($r2, view2);
            }
        });
    }

    public final void setVm(ResetPinViewModel resetPinViewModel) {
        Log_OC.getArray(resetPinViewModel, "<set-?>");
        this.srv = resetPinViewModel;
    }
}
