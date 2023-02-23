package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.TypeFaceSpan;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.model.ResetSavingPinRequest;
import ai.kudi.agent.savings.data.model.SavingsRequest;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.savings.data.viewdata.ConfirmOtpViewData;
import ai.kudi.agent.savings.databinding.FragmentConfirmOtpBinding;
import ai.kudi.agent.savings.viewmodel.ConfirmOtpViewModel;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.p057e.C1355f;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import dagger.android.p197e.C7429a;
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
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010-\u001a\u00020\u0015H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/savings/ui/ConfirmOtpFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/ConfirmOtpViewModel;", "Lai/kudi/agent/savings/data/viewdata/ConfirmOtpViewData;", "Lai/kudi/agent/savings/databinding/FragmentConfirmOtpBinding;", "()V", "mobileNo", "", "savingPin", "savingsModel", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "updateSavingPlanRequest", "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/ConfirmOtpViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/ConfirmOtpViewModel;)V", "withDrawRequest", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "applyViewData", "", "viewData", "boldText", "Landroid/text/SpannableString;", "textToBold", "createViewModel", "displaySuccessDialog", "getVMType", "Ljava/lang/Class;", "launchPinDialog", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setClickableSpan", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.ConfirmOtpFragment */
/* loaded from: classes.dex */
public final class ConfirmOtpFragment extends BaseMVVMViewBindingFragment<ConfirmOtpViewModel, ConfirmOtpViewData, FragmentConfirmOtpBinding> {
    public static final Companion Companion;
    private static final String DEACTIVATE_KEY = "deactivate";
    private static final String OTP_CONFIRMATION_NUMBER = "otp_confirmation_number";
    private static final String SAVINGS_KEY = "savings";
    private static final String SAVING_PIN = "saving_pin";
    private static final String WITHDRAW_KEY = "withdraw";
    private String mobileNo;
    private String savingPin;
    private CreateSavingsModel savingsModel;
    private UpdateSavingPlanRequest updateSavingPlanRequest;
    public ConfirmOtpViewModel viewModel;
    private WithdrawRequest withDrawRequest;

    /* compiled from: ConfirmOtpFragment.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/savings/ui/ConfirmOtpFragment$Companion;", "", "()V", "DEACTIVATE_KEY", "", "OTP_CONFIRMATION_NUMBER", "SAVINGS_KEY", "SAVING_PIN", "WITHDRAW_KEY", "newInstance", "Lai/kudi/agent/savings/ui/ConfirmOtpFragment;", "mobileNumber", "pin", ConfirmOtpFragment.SAVINGS_KEY, "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.ConfirmOtpFragment$Companion */
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
        public final ConfirmOtpFragment newInstance(String str, String str2, CreateSavingsModel createSavingsModel) {
            Log_OC.getArray(str, "mobileNumber");
            Log_OC.getArray(str2, "pin");
            Log_OC.getArray(createSavingsModel, ConfirmOtpFragment.SAVINGS_KEY);
            ConfirmOtpFragment $r2 = new ConfirmOtpFragment();
            C13287o $r6 = C13664u.m4227a(ConfirmOtpFragment.OTP_CONFIRMATION_NUMBER, str);
            C13287o $r62 = C13664u.m4227a(ConfirmOtpFragment.SAVING_PIN, str2);
            C13287o $r63 = C13664u.m4227a(ConfirmOtpFragment.SAVINGS_KEY, createSavingsModel);
            C13287o[] $r5 = {$r6, $r62, $r63};
            Bundle $r7 = C1372b.m36174a($r5);
            $r2.setArguments($r7);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ConfirmOtpFragment newInstance(String str, String str2, UpdateSavingPlanRequest updateSavingPlanRequest) {
            Log_OC.getArray(str, "mobileNumber");
            Log_OC.getArray(str2, "pin");
            Log_OC.getArray(updateSavingPlanRequest, TransactionRequest.TYPE_REQUEST);
            ConfirmOtpFragment $r4 = new ConfirmOtpFragment();
            C13287o $r6 = C13664u.m4227a(ConfirmOtpFragment.OTP_CONFIRMATION_NUMBER, str);
            C13287o $r62 = C13664u.m4227a(ConfirmOtpFragment.SAVING_PIN, str2);
            C13287o $r63 = C13664u.m4227a(ConfirmOtpFragment.DEACTIVATE_KEY, updateSavingPlanRequest);
            C13287o[] $r5 = {$r6, $r62, $r63};
            Bundle $r7 = C1372b.m36174a($r5);
            $r4.setArguments($r7);
            return $r4;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ConfirmOtpFragment newInstance(String str, String str2, WithdrawRequest withdrawRequest) {
            Log_OC.getArray(str, "mobileNumber");
            Log_OC.getArray(str2, "pin");
            Log_OC.getArray(withdrawRequest, TransactionRequest.TYPE_REQUEST);
            ConfirmOtpFragment $r4 = new ConfirmOtpFragment();
            C13287o $r6 = C13664u.m4227a(ConfirmOtpFragment.OTP_CONFIRMATION_NUMBER, str);
            C13287o $r62 = C13664u.m4227a(ConfirmOtpFragment.SAVING_PIN, str2);
            C13287o $r63 = C13664u.m4227a(ConfirmOtpFragment.WITHDRAW_KEY, withdrawRequest);
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
    private final SpannableString boldText(String str) {
        int $i0;
        int $i02 = C0456R.string.mobile_otp_verification_message;
        Object[] $r3 = {str};
        String $r4 = getString($i02, $r3);
        Log_OC.loadImage($r4, "getString(R.string.mobile_otp_verification_message, textToBold)");
        SpannableString $r5 = new SpannableString($r4);
        Context $r6 = requireContext();
        int $i03 = C0456R.font.garant_bold;
        Typeface $r7 = C1355f.m36245e($r6, $i03);
        TypeFaceSpan $r1 = new TypeFaceSpan($r7);
        $i0 = C13277t.m5404W($r4, str, 0, false, 6, null);
        int $i1 = $r4.length();
        $r5.setSpan($r1, $i0, $i1, 33);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displaySuccessDialog() {
        SuccessScreenDialogFragment.Companion $r1 = SuccessScreenDialogFragment.Companion;
        int $i0 = C0456R.string.pin_change_succces;
        String $r2 = getString($i0);
        int $i02 = C0456R.C0457drawable.ic_success_mark;
        Log_OC.loadImage($r2, "getString(R.string.pin_change_succces)");
        SuccessScreenCustomOption $r3 = new SuccessScreenCustomOption($r2, "", null, true, false, false, 0, 0, 0, 0, $i02, 0, true, 3060, null);
        ConfirmOtpFragment$displaySuccessDialog$1 $r4 = new ConfirmOtpFragment$displaySuccessDialog$1(this);
        SuccessScreenDialogFragment $r5 = $r1.newInstance($r3, $r4);
        FragmentManager $r6 = getChildFragmentManager();
        int $i03 = C0456R.string.reset_pin;
        $r5.show($r6, getString($i03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void launchPinDialog() {
        FragmentManager $r1 = getChildFragmentManager();
        PreferenceActivity $r2 = getViewLifecycleOwner();
        $r1.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r2, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38479c(String str, Bundle bundle) {
                ConfirmOtpFragment $r3 = ConfirmOtpFragment.this;
                ConfirmOtpFragment.m40519launchPinDialog$lambda8($r3, str, bundle);
            }
        });
        KudiPin.Companion $r4 = KudiPin.Companion;
        int $i0 = C0456R.string.confirm_saving_pin_title;
        String $r5 = getString($i0);
        int $i02 = C0456R.string.enter_pin_to_complete_saving_transaction;
        String $r6 = getString($i02);
        KudiPin $r7 = $r4.newInstance($r5, $r6, true);
        FragmentManager $r12 = getChildFragmentManager();
        Chapter r9 = (Chapter) $r7;
        r9.show($r12, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: launchPinDialog$lambda-8  reason: not valid java name */
    public static final void m40519launchPinDialog$lambda8(ConfirmOtpFragment confirmOtpFragment, String str, Bundle bundle) {
        Integer $r8;
        Log_OC.getArray(confirmOtpFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY);
        if ($z0) {
            String $r1 = bundle.getString(KudiPin.PASSWORD_KEY);
            WithdrawRequest $r3 = confirmOtpFragment.withDrawRequest;
            if ($r3 != null) {
                ConfirmOtpViewModel $r4 = confirmOtpFragment.getViewModel();
                String $r5 = $r1 != null ? $r1 : "";
                $r4.withdrawSavings(WithdrawRequest.copy$default($r3, 0, $r5, null, 5, null));
            }
            UpdateSavingPlanRequest $r6 = confirmOtpFragment.updateSavingPlanRequest;
            if ($r6 != null) {
                ConfirmOtpViewModel $r42 = confirmOtpFragment.getViewModel();
                String $r52 = $r1 != null ? $r1 : "";
                $r42.deactivateSavingPlan(UpdateSavingPlanRequest.copy$default($r6, null, null, $r52, 3, null));
            }
            CreateSavingsModel $r7 = confirmOtpFragment.savingsModel;
            if ($r7 == null) {
                return;
            }
            ConfirmOtpViewModel $r43 = confirmOtpFragment.getViewModel();
            if ($r1 == null) {
                $r8 = null;
            } else {
                int $i0 = Integer.parseInt($r1);
                $r8 = Integer.valueOf($i0);
            }
            SavingsRequest $r9 = CreateSavingsModel.copy$default($r7, null, null, null, null, null, null, $r8, 63, null).toSavingRequest();
            $r43.createSavings($r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ConfirmOtpFragment newInstance(String str, String str2, CreateSavingsModel createSavingsModel) {
        Companion $r2 = Companion;
        ConfirmOtpFragment $r3 = $r2.newInstance(str, str2, createSavingsModel);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40520onViewCreated$lambda4$lambda3(ConfirmOtpFragment confirmOtpFragment, FragmentConfirmOtpBinding fragmentConfirmOtpBinding, View view) {
        C13666w $r9;
        Log_OC.getArray(confirmOtpFragment, "this$0");
        Log_OC.getArray(fragmentConfirmOtpBinding, "$this_apply");
        String $r4 = confirmOtpFragment.mobileNo;
        String $r5 = confirmOtpFragment.savingPin;
        if ($r4 == null || $r5 == null) {
            $r9 = null;
        } else {
            ConfirmOtpViewModel $r6 = confirmOtpFragment.getViewModel();
            KudiInputField $r7 = fragmentConfirmOtpBinding.confirmNewPinView;
            String $r8 = $r7.getText();
            ResetSavingPinRequest $r0 = new ResetSavingPinRequest($r8, $r4, $r5);
            $r6.resetPin($r0);
            $r9 = C13666w.f30112a;
        }
        if ($r9 == null) {
            FragmentActivity $r10 = confirmOtpFragment.requireActivity();
            Log_OC.loadImage($r10, "requireActivity()");
            int $i0 = C0456R.string.saving_error;
            ContextExtKt.toast$default($r10, confirmOtpFragment.getString($i0), 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setClickableSpan() {
        String $r3;
        int $i0;
        int $i1;
        int $i02;
        int $i03 = C0456R.string.did_not_receive_otp;
        String $r2 = getString($i03);
        Log_OC.loadImage($r2, "getString(R.string.did_not_receive_otp)");
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
                KudiButton $r8 = ((FragmentConfirmOtpBinding) $r6).kbConfirmOtp;
                $r8.m38032f();
                return;
            }
            InterfaceC8209a $r62 = requireBinding();
            FragmentConfirmOtpBinding $r7 = (FragmentConfirmOtpBinding) $r62;
            KudiButton $r82 = $r7.kbConfirmOtp;
            $r82.m38033e();
            return;
        }
        boolean $z04 = confirmOtpViewData instanceof ConfirmOtpViewData.ResetPinSuccess;
        if ($z04) {
            displaySuccessDialog();
            return;
        }
        boolean $z05 = confirmOtpViewData instanceof ConfirmOtpViewData.ResendComplete;
        if ($z05) {
            FragmentActivity $r22 = requireActivity();
            Log_OC.loadImage($r22, "requireActivity()");
            int $i0 = C0456R.string.otp_resent;
            String $r42 = getString($i0);
            ContextExtKt.toast$default($r22, $r42, 0, 2, (Object) null);
            return;
        }
        boolean $z06 = confirmOtpViewData instanceof ConfirmOtpViewData.Initial;
        if ($z06) {
            return;
        }
        boolean $z07 = confirmOtpViewData instanceof ConfirmOtpViewData.SavingsCreatedSuccess;
        if ($z07) {
            ConfirmOtpViewModel $r9 = getViewModel();
            $r9.navigateToSavingSuccessDialog();
            return;
        }
        boolean $z08 = confirmOtpViewData instanceof ConfirmOtpViewData.DeactivatePlanSuccess;
        if ($z08) {
            FragmentActivity $r23 = requireActivity();
            Log_OC.loadImage($r23, "requireActivity()");
            int $i02 = C0456R.string.plan_deactivated_successfully;
            String $r43 = getString($i02);
            ContextExtKt.toast$default($r23, $r43, 0, 2, (Object) null);
            ConfirmOtpViewModel $r92 = getViewModel();
            $r92.navigateToDeactivateSavingsDialog();
            return;
        }
        boolean $z09 = confirmOtpViewData instanceof ConfirmOtpViewData.Timer;
        if ($z09) {
            InterfaceC8209a $r63 = requireBinding();
            FragmentConfirmOtpBinding $r72 = (FragmentConfirmOtpBinding) $r63;
            TextView $r10 = $r72.tvResendOtp;
            int $i03 = C0456R.string.did_not_receive_otp_timer;
            ConfirmOtpViewData.Timer $r12 = (ConfirmOtpViewData.Timer) confirmOtpViewData;
            String $r44 = $r12.getTime();
            Object[] $r11 = {$r44};
            String $r45 = getString($i03, $r11);
            $r10.setText($r45);
            boolean $z010 = $r12.isFinished();
            if ($z010) {
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
            String $r3 = $r1.getString(OTP_CONFIRMATION_NUMBER);
            this.mobileNo = $r3;
            String $r32 = $r1.getString(SAVING_PIN);
            this.savingPin = $r32;
            Parcelable $r4 = $r1.getParcelable(SAVINGS_KEY);
            CreateSavingsModel $r5 = (CreateSavingsModel) $r4;
            this.savingsModel = $r5;
            Parcelable $r42 = $r1.getParcelable(WITHDRAW_KEY);
            WithdrawRequest $r6 = (WithdrawRequest) $r42;
            this.withDrawRequest = $r6;
            Parcelable $r43 = $r1.getParcelable(DEACTIVATE_KEY);
            UpdateSavingPlanRequest $r7 = (UpdateSavingPlanRequest) $r43;
            this.updateSavingPlanRequest = $r7;
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
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException r15 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r15;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        AbstractC0925a $r5 = $r4.getSupportActionBar();
        if ($r5 != null) {
            int $i0 = C0456R.string.reset_savings_pin;
            $r5.mo37631C(getString($i0));
        }
        InterfaceC8209a $r7 = requireBinding();
        final FragmentConfirmOtpBinding $r8 = (FragmentConfirmOtpBinding) $r7;
        String $r6 = this.mobileNo;
        if ($r6 != null) {
            TextView $r9 = $r8.tvOtpVerificationInfo;
            SpannableString $r10 = boldText($r6);
            $r9.setText($r10);
        }
        ViewGroup $r11 = $r8.kbConfirmOtp;
        ViewGroup r16 = $r11;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfirmOtpFragment $r2 = ConfirmOtpFragment.this;
                FragmentConfirmOtpBinding $r32 = $r8;
                ConfirmOtpFragment.m40520onViewCreated$lambda4$lambda3($r2, $r32, view2);
            }
        });
        setClickableSpan();
    }

    public final void setViewModel(ConfirmOtpViewModel confirmOtpViewModel) {
        Log_OC.getArray(confirmOtpViewModel, "<set-?>");
        this.viewModel = confirmOtpViewModel;
    }
}
