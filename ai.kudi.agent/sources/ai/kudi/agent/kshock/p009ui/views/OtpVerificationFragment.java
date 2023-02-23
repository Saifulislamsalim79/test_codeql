package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.TypeFaceSpan;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.KshockToolBarBinding;
import ai.kudi.agent.feature_kshock.databinding.OtpVerificationFragmentBinding;
import ai.kudi.agent.kshock.data.model.Interest;
import ai.kudi.agent.kshock.presentation.viewdata.OtpVerificationViewData;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.p057e.C1355f;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OtpVerificationFragment.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0014J\u0012\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/OtpVerificationFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/ui/views/OtpVerificationViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/OtpVerificationViewData;", "Lai/kudi/agent/feature_kshock/databinding/OtpVerificationFragmentBinding;", "()V", "interest", "Lai/kudi/agent/kshock/data/model/Interest;", "userEmail", "", "userMobile", "viewModel", "getViewModel", "()Lai/kudi/agent/kshock/ui/views/OtpVerificationViewModel;", "setViewModel", "(Lai/kudi/agent/kshock/ui/views/OtpVerificationViewModel;)V", "applyViewData", "", "viewData", "boldText", "Landroid/text/SpannableString;", "mobileNo", "email", "createViewModel", "disableOrEnableResendOtp", "isEnabled", "", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.OtpVerificationFragment */
/* loaded from: classes.dex */
public final class OtpVerificationFragment extends BaseMVVMViewBindingFragment<OtpVerificationViewModel, OtpVerificationViewData, OtpVerificationFragmentBinding> {
    public static final Companion Companion;
    private static final String INTEREST_KEY = "BUNDLE_KEY_CHARGE";
    private static final int MAX_OTP_LENGTH = 4;
    private static final String USER_EMAIL_INFO = "otp_user_email_info";
    private static final String USER_MOBILE_INFO = "otp_user_mobile_info";
    private Interest interest;
    private String userEmail;
    private String userMobile;
    public OtpVerificationViewModel viewModel;

    /* compiled from: OtpVerificationFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/OtpVerificationFragment$Companion;", "", "()V", "INTEREST_KEY", "", "MAX_OTP_LENGTH", "", "USER_EMAIL_INFO", "USER_MOBILE_INFO", "newInstance", "Lai/kudi/agent/kshock/ui/views/OtpVerificationFragment;", "mobile", "email", "interest", "Lai/kudi/agent/kshock/data/model/Interest;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.OtpVerificationFragment$Companion */
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
        public final OtpVerificationFragment newInstance(String str, String str2, Interest interest) {
            Log_OC.getArray(str, "mobile");
            Log_OC.getArray(str2, "email");
            Log_OC.getArray(interest, "interest");
            OtpVerificationFragment $r4 = new OtpVerificationFragment();
            C13287o $r6 = C13664u.m4227a(OtpVerificationFragment.USER_MOBILE_INFO, str);
            C13287o $r62 = C13664u.m4227a(OtpVerificationFragment.USER_EMAIL_INFO, str2);
            C13287o $r63 = C13664u.m4227a("BUNDLE_KEY_CHARGE", interest);
            C13287o[] $r5 = {$r6, $r62, $r63};
            Bundle $r7 = C1372b.m36174a($r5);
            $r4.setArguments($r7);
            return $r4;
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
    private final SpannableString boldText(String str, String str2) {
        int $i0;
        int $i1;
        int $i02;
        int $i12;
        int $i03 = C0220R.string.kshock_otp_verification_message;
        Object[] $r3 = {str, str2};
        String $r4 = getString($i03, $r3);
        Log_OC.loadImage($r4, "getString(R.string.kshock_otp_verification_message, mobileNo, email)");
        SpannableString $r5 = new SpannableString($r4);
        Context $r6 = requireContext();
        int $i04 = C0220R.font.garant_bold;
        Typeface $r7 = C1355f.m36245e($r6, $i04);
        TypeFaceSpan $r8 = new TypeFaceSpan($r7);
        $i0 = C13277t.m5404W($r4, str, 0, false, 6, null);
        $i1 = C13277t.m5404W($r4, str, 0, false, 6, null);
        int $i2 = str.length();
        $r5.setSpan($r8, $i0, $i1 + $i2, 33);
        TypeFaceSpan $r82 = new TypeFaceSpan($r7);
        $i02 = C13277t.m5404W($r4, str2, 0, false, 6, null);
        $i12 = C13277t.m5404W($r4, str2, 0, false, 6, null);
        int $i22 = str2.length();
        $r5.setSpan($r82, $i02, $i12 + $i22, 33);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void disableOrEnableResendOtp(boolean z) {
        float $f0;
        InterfaceC8209a $r2 = requireBinding();
        OtpVerificationFragmentBinding $r3 = (OtpVerificationFragmentBinding) $r2;
        TextView $r1 = $r3.time;
        Log_OC.loadImage($r1, TransactionField.TIME);
        if (z) {
            ViewExtKt.hide$default($r1, false, 1, null);
        } else {
            ViewExtKt.show($r1);
        }
        View $r4 = $r3.resendOtp;
        if (z) {
            Log_OC.loadImage($r4, "");
            View r5 = $r4;
            ViewExtKt.enable(r5);
            $f0 = 1.0f;
        } else {
            Log_OC.loadImage($r4, "");
            View r52 = $r4;
            ViewExtKt.disable(r52);
            $f0 = 0.45f;
        }
        ((TextView) $r4).setAlpha($f0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void disableOrEnableResendOtp$default(OtpVerificationFragment otpVerificationFragment, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        otpVerificationFragment.disableOrEnableResendOtp($z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-2  reason: not valid java name */
    public static final void m39663onViewCreated$lambda6$lambda2(OtpVerificationFragmentBinding otpVerificationFragmentBinding, OtpVerificationFragment otpVerificationFragment, View view) {
        C13666w $r5;
        Log_OC.getArray(otpVerificationFragmentBinding, "$this_apply");
        Log_OC.getArray(otpVerificationFragment, "this$0");
        TextView $r3 = otpVerificationFragmentBinding.tvOtpError;
        Log_OC.loadImage($r3, "tvOtpError");
        boolean $z0 = ViewExtKt.isVisible($r3);
        if ($z0) {
            TextView $r32 = otpVerificationFragmentBinding.tvOtpError;
            Log_OC.loadImage($r32, "tvOtpError");
            ViewExtKt.hide$default($r32, false, 1, null);
        }
        Interest $r4 = otpVerificationFragment.interest;
        if ($r4 == null) {
            $r5 = null;
        } else {
            OtpVerificationViewModel $r6 = otpVerificationFragment.getViewModel();
            PinEntryView $r7 = otpVerificationFragmentBinding.pinEntryView;
            Editable $r8 = $r7.getText();
            String $r9 = $r8.toString();
            $r6.verifyOtp($r9, $r4);
            $r5 = C13666w.f30112a;
        }
        if ($r5 == null) {
            FragmentActivity $r10 = otpVerificationFragment.requireActivity();
            Log_OC.loadImage($r10, "requireActivity()");
            int $i0 = C0220R.string.loan_app_error;
            ContextExtKt.toast$default($r10, $i0, 0, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-4  reason: not valid java name */
    public static final void m39664onViewCreated$lambda6$lambda4(OtpVerificationFragment otpVerificationFragment, View view) {
        Log_OC.getArray(otpVerificationFragment, "this$0");
        OtpVerificationViewModel $r0 = otpVerificationFragment.getViewModel();
        $r0.resendOrCheckStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-5  reason: not valid java name */
    public static final void m39665onViewCreated$lambda6$lambda5(OtpVerificationFragment otpVerificationFragment, View view) {
        Log_OC.getArray(otpVerificationFragment, "this$0");
        FragmentActivity $r0 = otpVerificationFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OtpVerificationViewData $r2 = (OtpVerificationViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(OtpVerificationViewData otpVerificationViewData) {
        Log_OC.getArray(otpVerificationViewData, "viewData");
        boolean $z0 = otpVerificationViewData instanceof OtpVerificationViewData.Error;
        if ($z0) {
            FragmentActivity $r2 = requireActivity();
            Log_OC.loadImage($r2, "requireActivity()");
            OtpVerificationViewData.Error $r3 = (OtpVerificationViewData.Error) otpVerificationViewData;
            String $r4 = $r3.getMessage();
            ContextExtKt.toast$default($r2, $r4, 0, 2, (Object) null);
            return;
        }
        boolean $z02 = otpVerificationViewData instanceof OtpVerificationViewData.ShowProgress;
        if ($z02) {
            OtpVerificationViewData.ShowProgress $r5 = (OtpVerificationViewData.ShowProgress) otpVerificationViewData;
            boolean $z03 = $r5.getVisibility();
            if ($z03) {
                InterfaceC8209a $r6 = requireBinding();
                KudiButton $r8 = ((OtpVerificationFragmentBinding) $r6).kbConfirmOtp;
                $r8.m38032f();
                return;
            }
            InterfaceC8209a $r62 = requireBinding();
            KudiButton $r82 = ((OtpVerificationFragmentBinding) $r62).kbConfirmOtp;
            $r82.m38033e();
            return;
        }
        boolean $z04 = otpVerificationViewData instanceof OtpVerificationViewData.OtpVerification;
        if (!$z04) {
            boolean $z05 = otpVerificationViewData instanceof OtpVerificationViewData.Timer;
            if ($z05) {
                InterfaceC8209a $r63 = requireBinding();
                TextView $r10 = ((OtpVerificationFragmentBinding) $r63).time;
                int $i0 = C0220R.string.did_not_receive_otp_with_timer;
                OtpVerificationViewData.Timer $r12 = (OtpVerificationViewData.Timer) otpVerificationViewData;
                String $r42 = $r12.getTime();
                Object[] $r11 = {$r42};
                String $r43 = getString($i0, $r11);
                $r10.setText($r43);
                boolean $z06 = $r12.isFinished();
                disableOrEnableResendOtp($z06);
                return;
            }
            return;
        }
        InterfaceC8209a $r64 = requireBinding();
        OtpVerificationFragmentBinding $r7 = (OtpVerificationFragmentBinding) $r64;
        OtpVerificationViewData.OtpVerification $r9 = (OtpVerificationViewData.OtpVerification) otpVerificationViewData;
        boolean $z07 = $r9.isVerified();
        if ($z07) {
            FragmentActivity $r22 = requireActivity();
            Log_OC.loadImage($r22, "requireActivity()");
            String $r44 = $r9.getMessage();
            ContextExtKt.toast$default($r22, $r44, 0, 2, (Object) null);
            return;
        }
        TextView $r102 = $r7.tvOtpError;
        String $r45 = $r9.getMessage();
        $r102.setText($r45);
        TextView $r103 = $r7.tvOtpError;
        Log_OC.loadImage($r103, "tvOtpError");
        ViewExtKt.show($r103);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OtpVerificationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OtpVerificationViewModel createViewModel() {
        OtpVerificationViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OtpVerificationViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final OtpVerificationViewModel getViewModel() {
        OtpVerificationViewModel $r1 = this.viewModel;
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
    public void onCreate(Bundle bundle) {
        C13666w $r2;
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            $r2 = null;
        } else {
            String $r3 = $r1.getString(USER_MOBILE_INFO);
            this.userMobile = $r3;
            String $r32 = $r1.getString(USER_EMAIL_INFO);
            this.userEmail = $r32;
            Parcelable $r4 = $r1.getParcelable("BUNDLE_KEY_CHARGE");
            Interest $r5 = (Interest) $r4;
            this.interest = $r5;
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
        OtpVerificationFragmentBinding $r4 = OtpVerificationFragmentBinding.inflate(layoutInflater, viewGroup, false);
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
        disableOrEnableResendOtp$default(this, false, 1, null);
        InterfaceC8209a $r3 = requireBinding();
        final OtpVerificationFragmentBinding $r4 = (OtpVerificationFragmentBinding) $r3;
        KshockToolBarBinding $r5 = $r4.kshockToolBar;
        TextView $r6 = $r5.screenTitleText;
        int $i0 = C0220R.string.enter_otp;
        $r6.setText(getString($i0));
        KudiButton $r8 = $r4.kbConfirmOtp;
        $r8.m38035c();
        String $r7 = this.userMobile;
        if ($r7 != null && this.userEmail != null) {
            TextView $r62 = $r4.tvOtpVerificationInfo;
            Log_OC.append($r7);
            String $r72 = StringExtKt.getMaskMobile($r7);
            String $r9 = this.userEmail;
            Log_OC.append($r9);
            SpannableString $r10 = boldText($r72, StringExtKt.getMaskEmail($r9));
            $r62.setText($r10);
        }
        ViewGroup $r82 = $r4.kbConfirmOtp;
        ViewGroup r26 = $r82;
        r26.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.ArchiveBackupDialogFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OtpVerificationFragmentBinding $r2 = OtpVerificationFragmentBinding.this;
                OtpVerificationFragment $r32 = this;
                OtpVerificationFragment.m39663onViewCreated$lambda6$lambda2($r2, $r32, view2);
            }
        });
        KudiInputField $r12 = $r4.confirmNewPinView;
        EditText $r13 = $r12.getInputEditText();
        $r13.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.kshock.ui.views.OtpVerificationFragment$onViewCreated$lambda-6$$inlined$doAfterTextChanged$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String $r2 = String.valueOf(editable);
                int $i02 = $r2.length();
                if ($i02 == 4) {
                    OtpVerificationFragmentBinding $r32 = OtpVerificationFragmentBinding.this;
                    KudiButton $r42 = $r32.kbConfirmOtp;
                    $r42.m38034d();
                    return;
                }
                OtpVerificationFragmentBinding $r33 = OtpVerificationFragmentBinding.this;
                KudiButton $r43 = $r33.kbConfirmOtp;
                $r43.m38035c();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        $r4.pinEntryView.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.kshock.ui.views.OtpVerificationFragment$onViewCreated$1$watcher$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String $r2 = String.valueOf(editable);
                int $i02 = $r2.length();
                if ($i02 == 4) {
                    OtpVerificationFragmentBinding $r32 = OtpVerificationFragmentBinding.this;
                    KudiButton $r42 = $r32.kbConfirmOtp;
                    $r42.m38034d();
                    return;
                }
                OtpVerificationFragmentBinding $r33 = OtpVerificationFragmentBinding.this;
                KudiButton $r43 = $r33.kbConfirmOtp;
                $r43.m38035c();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        TextView $r17 = $r4.resendOtp;
        TextView $r63 = $r17;
        $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.ErrorActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OtpVerificationFragment $r2 = OtpVerificationFragment.this;
                OtpVerificationFragment.m39664onViewCreated$lambda6$lambda4($r2, view2);
            }
        });
        KshockToolBarBinding $r52 = $r4.kshockToolBar;
        ImageView $r19 = $r52.backButton;
        ImageView r27 = $r19;
        r27.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.ActivityMain$17
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OtpVerificationFragment $r2 = OtpVerificationFragment.this;
                OtpVerificationFragment.m39665onViewCreated$lambda6$lambda5($r2, view2);
            }
        });
    }

    public final void setViewModel(OtpVerificationViewModel otpVerificationViewModel) {
        Log_OC.getArray(otpVerificationViewModel, "<set-?>");
        this.viewModel = otpVerificationViewModel;
    }
}
