package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.TypeFaceSpan;
import ai.kudi.agent.databinding.FragmentConfirmOtpBinding;
import ai.kudi.agent.settings.domain.package_4.ResetSavingPinRequest;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.security.p028ui.viewModels.ConfirmOtpViewModel;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.ConfirmOtpViewData;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.p057e.C1355f;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import kotlin.p549l0.C13282v;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ConfirmOtpFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010%\u001a\u00020\u000fH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/ConfirmOtpFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/security/ui/viewModels/ConfirmOtpViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/ConfirmOtpViewData;", "Lai/kudi/agent/databinding/FragmentConfirmOtpBinding;", "()V", "mobileNo", "", "savingPin", "viewModel", "getViewModel", "()Lai/kudi/agent/settings/security/ui/viewModels/ConfirmOtpViewModel;", "setViewModel", "(Lai/kudi/agent/settings/security/ui/viewModels/ConfirmOtpViewModel;)V", "applyViewData", "", "viewData", "boldText", "Landroid/text/SpannableString;", "textToBold", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setClickableSpan", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.ConfirmOtpFragment */
/* loaded from: classes.dex */
public final class ConfirmOtpFragment extends BaseMVVMViewBindingFragment<ConfirmOtpViewModel, ConfirmOtpViewData, FragmentConfirmOtpBinding> {
    public static final Companion Companion;
    private static final String OTP_CONFIRMATION_NUMBER = "otp_confirmation_number";
    private static final String SAVING_PIN = "saving_pin";
    private String mobileNo;
    private String savingPin;
    public ConfirmOtpViewModel viewModel;

    /* compiled from: ConfirmOtpFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/ConfirmOtpFragment$Companion;", "", "()V", "OTP_CONFIRMATION_NUMBER", "", "SAVING_PIN", "newInstance", "Lai/kudi/agent/settings/security/ui/ConfirmOtpFragment;", "mobileNumber", "pin", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.security.ui.ConfirmOtpFragment$Companion */
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
        public final ConfirmOtpFragment newInstance(String str, String str2) {
            Log_OC.getArray(str, "mobileNumber");
            Log_OC.getArray(str2, "pin");
            ConfirmOtpFragment $r3 = new ConfirmOtpFragment();
            C13287o $r5 = C13664u.m4227a(ConfirmOtpFragment.OTP_CONFIRMATION_NUMBER, str);
            C13287o $r52 = C13664u.m4227a(ConfirmOtpFragment.SAVING_PIN, str2);
            C13287o[] $r4 = {$r5, $r52};
            Bundle $r6 = C1372b.m36174a($r4);
            $r3.setArguments($r6);
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
    private final SpannableString boldText(String str) {
        int $i0;
        Object[] $r3 = {str};
        String $r4 = getString(C0001R.string.mobile_otp_verification_message, $r3);
        Log_OC.loadImage($r4, "getString(R.string.mobile_otp_verification_message, textToBold)");
        SpannableString $r5 = new SpannableString($r4);
        Context $r6 = requireContext();
        Typeface $r7 = C1355f.m36245e($r6, C0001R.font.garant_bold);
        TypeFaceSpan $r1 = new TypeFaceSpan($r7);
        $i0 = C13277t.m5404W($r4, str, 0, false, 6, null);
        int $i1 = $r4.length();
        $r5.setSpan($r1, $i0, $i1, 33);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ConfirmOtpFragment newInstance(String str, String str2) {
        Companion $r1 = Companion;
        ConfirmOtpFragment $r2 = $r1.newInstance(str, str2);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40869onViewCreated$lambda4$lambda3(ConfirmOtpFragment confirmOtpFragment, FragmentConfirmOtpBinding fragmentConfirmOtpBinding, View view) {
        Log_OC.getArray(confirmOtpFragment, "this$0");
        Log_OC.getArray(fragmentConfirmOtpBinding, "$this_apply");
        String $r3 = confirmOtpFragment.mobileNo;
        String $r4 = confirmOtpFragment.savingPin;
        if ($r3 == null || $r4 == null) {
            FragmentActivity $r9 = confirmOtpFragment.requireActivity();
            Log_OC.loadImage($r9, "requireActivity()");
            ContextExtKt.toast$default($r9, confirmOtpFragment.getString(C0001R.string.error_occurred), 0, 2, (Object) null);
            return;
        }
        ConfirmOtpViewModel $r5 = confirmOtpFragment.getViewModel();
        KudiInputField $r7 = fragmentConfirmOtpBinding.confirmNewPinView;
        String $r8 = $r7.getText();
        ResetSavingPinRequest $r6 = new ResetSavingPinRequest($r8, $r3, $r4);
        $r5.resetPin($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setClickableSpan() {
        String $r3;
        int $i0;
        int $i1;
        int $i02;
        String $r2 = getString(C0001R.string.did_not_receive_otp);
        Log_OC.loadImage($r2, "getString(ai.kudi.agent.savings.R.string.did_not_receive_otp)");
        SpannableString $r1 = new SpannableString($r2);
        $r3 = C13282v.m5368Q0($r2, 7);
        $i0 = C13277t.m5404W($r2, $r3, 0, false, 6, null);
        $i1 = C13277t.m5404W($r2, $r3, 0, false, 6, null);
        int $i2 = $r3.length();
        SpannableString $r4 = StringExtKt.boldSpan($r2, $i0, $i1 + $i2, $r1);
        String $r22 = $r4.toString();
        Log_OC.loadImage($r22, "boldSpannedDescription.toString()");
        $i02 = C13277t.m5404W($r4, $r3, 0, false, 6, null);
        int $i12 = $r4.length();
        Context $r5 = requireContext();
        Log_OC.loadImage($r5, "requireContext()");
        ConfirmOtpFragment$setClickableSpan$clickableSpannedText$1 $r6 = new ConfirmOtpFragment$setClickableSpan$clickableSpannedText$1(this);
        SpannableString $r12 = StringExtKt.clickableSpan$default($r22, $i02, $i12, 0, $r5, $r1, $r6, 4, null);
        InterfaceC8209a $r7 = requireBinding();
        FragmentConfirmOtpBinding $r8 = (FragmentConfirmOtpBinding) $r7;
        TextView $r9 = $r8.tvResendOtp;
        $r9.setText($r12);
        InterfaceC8209a $r72 = requireBinding();
        FragmentConfirmOtpBinding $r82 = (FragmentConfirmOtpBinding) $r72;
        TextView $r92 = $r82.tvResendOtp;
        MovementMethod $r10 = LinkMovementMethod.getInstance();
        $r92.setMovementMethod($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ConfirmOtpViewData $r2 = (ConfirmOtpViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ConfirmOtpViewData confirmOtpViewData) {
        Log_OC.getArray(confirmOtpViewData, "viewData");
        boolean $z0 = confirmOtpViewData instanceof ConfirmOtpViewData.Error;
        if ($z0) {
            FragmentActivity $r2 = requireActivity();
            Log_OC.loadImage($r2, "requireActivity()");
            ConfirmOtpViewData.Error $r3 = (ConfirmOtpViewData.Error) confirmOtpViewData;
            String $r4 = $r3.getMessage();
            ContextExtKt.toast$default($r2, $r4, 0, 2, (Object) null);
            return;
        }
        boolean $z02 = confirmOtpViewData instanceof ConfirmOtpViewData.ShowProgress;
        if ($z02) {
            ConfirmOtpViewData.ShowProgress $r5 = (ConfirmOtpViewData.ShowProgress) confirmOtpViewData;
            boolean $z03 = $r5.getVisibility();
            if ($z03) {
                InterfaceC8209a $r6 = requireBinding();
                FragmentConfirmOtpBinding $r7 = (FragmentConfirmOtpBinding) $r6;
                KudiButton $r8 = $r7.kbConfirmOtp;
                $r8.m38032f();
                return;
            }
            InterfaceC8209a $r62 = requireBinding();
            FragmentConfirmOtpBinding $r72 = (FragmentConfirmOtpBinding) $r62;
            KudiButton $r82 = $r72.kbConfirmOtp;
            $r82.m38033e();
            return;
        }
        boolean $z04 = confirmOtpViewData instanceof ConfirmOtpViewData.Success;
        if ($z04) {
            ConfirmOtpViewModel $r9 = getViewModel();
            $r9.displaySuccessDialog();
            return;
        }
        boolean $z05 = confirmOtpViewData instanceof ConfirmOtpViewData.OTPResent;
        if ($z05) {
            FragmentActivity $r22 = requireActivity();
            Log_OC.loadImage($r22, "requireActivity()");
            ContextExtKt.toast$default($r22, (int) C0001R.string.otp_sent, 0, 2, (Object) null);
            return;
        }
        boolean $z06 = confirmOtpViewData instanceof ConfirmOtpViewData.Initial;
        if ($z06) {
            return;
        }
        boolean $z07 = confirmOtpViewData instanceof ConfirmOtpViewData.Timer;
        if ($z07) {
            InterfaceC8209a $r63 = requireBinding();
            FragmentConfirmOtpBinding $r73 = (FragmentConfirmOtpBinding) $r63;
            TextView $r10 = $r73.tvResendOtp;
            ConfirmOtpViewData.Timer $r12 = (ConfirmOtpViewData.Timer) confirmOtpViewData;
            String $r42 = $r12.getTime();
            Object[] $r11 = {$r42};
            String $r43 = getString(C0001R.string.did_not_receive_otp_timer, $r11);
            $r10.setText($r43);
            boolean $z08 = $r12.isFinished();
            if ($z08) {
                setClickableSpan();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ConfirmOtpViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ConfirmOtpViewModel createViewModel() {
        ConfirmOtpViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ConfirmOtpViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final ConfirmOtpViewModel getViewModel() {
        ConfirmOtpViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
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
    public void onCreate(Bundle bundle) {
        C13666w $r2;
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            $r2 = null;
        } else {
            String $r3 = $r1.getString(OTP_CONFIRMATION_NUMBER);
            this.mobileNo = $r3;
            String $r32 = $r1.getString(SAVING_PIN);
            this.savingPin = $r32;
            $r2 = C13666w.f30112a;
        }
        if ($r2 == null) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentConfirmOtpBinding $r4 = FragmentConfirmOtpBinding.inflate(layoutInflater, viewGroup, false);
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
        String $r3 = getString(C0001R.string.reset_savings_pin);
        Log_OC.loadImage($r3, "getString(R.string.reset_savings_pin)");
        SettingsActivityExtKt.setSettingsTitle(this, $r3);
        InterfaceC8209a $r4 = requireBinding();
        final FragmentConfirmOtpBinding $r5 = (FragmentConfirmOtpBinding) $r4;
        String $r32 = this.mobileNo;
        if ($r32 != null) {
            TextView $r6 = $r5.tvOtpVerificationInfo;
            SpannableString $r7 = boldText($r32);
            $r6.setText($r7);
        }
        ViewGroup $r8 = $r5.kbConfirmOtp;
        ViewGroup r11 = $r8;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.security.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfirmOtpFragment $r2 = ConfirmOtpFragment.this;
                FragmentConfirmOtpBinding $r33 = $r5;
                ConfirmOtpFragment.m40869onViewCreated$lambda4$lambda3($r2, $r33, view2);
            }
        });
        setClickableSpan();
    }

    public final void setViewModel(ConfirmOtpViewModel confirmOtpViewModel) {
        Log_OC.getArray(confirmOtpViewModel, "<set-?>");
        this.viewModel = confirmOtpViewModel;
    }
}
