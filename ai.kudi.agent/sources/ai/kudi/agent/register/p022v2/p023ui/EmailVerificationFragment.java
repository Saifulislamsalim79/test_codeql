package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentEmailVeridicationBinding;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.EmailVerificationViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.EmailVerificationViewData;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.VerificationError;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: EmailVerificationFragment.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/EmailVerificationFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/v2/ui/viewModels/EmailVerificationViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/EmailVerificationViewData;", "Lai/kudi/agent/databinding/FragmentEmailVeridicationBinding;", "()V", "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "emailVerificationViewModel", "getEmailVerificationViewModel", "()Lai/kudi/agent/register/v2/ui/viewModels/EmailVerificationViewModel;", "setEmailVerificationViewModel", "(Lai/kudi/agent/register/v2/ui/viewModels/EmailVerificationViewModel;)V", "registerActivity", "Lai/kudi/agent/register/v2/ui/RegisterActivity;", "settingsDetailsActivity", "Lai/kudi/agent/settings/ui/SettingsActivity;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.EmailVerificationFragment */
/* loaded from: classes.dex */
public final class EmailVerificationFragment extends BaseMVVMViewBindingFragment<EmailVerificationViewModel, EmailVerificationViewData, FragmentEmailVeridicationBinding> {
    private static final String COMPLETE_REG_DATA = "COMPLETE_REG_DATA";
    public static final Companion Companion;
    private CompleteRegistrationData completeRegistrationData;
    public EmailVerificationViewModel emailVerificationViewModel;
    private RegisterActivity registerActivity;
    private SettingsActivity settingsDetailsActivity;

    /* compiled from: EmailVerificationFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/EmailVerificationFragment$Companion;", "", "()V", EmailVerificationFragment.COMPLETE_REG_DATA, "", "newInstance", "Lai/kudi/agent/register/v2/ui/EmailVerificationFragment;", "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.EmailVerificationFragment$Companion */
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
        public final EmailVerificationFragment newInstance(CompleteRegistrationData completeRegistrationData) {
            Log_OC.getArray(completeRegistrationData, "completeRegistrationData");
            EmailVerificationFragment $r3 = new EmailVerificationFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(EmailVerificationFragment.COMPLETE_REG_DATA, completeRegistrationData);
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
    public static final EmailVerificationFragment newInstance(CompleteRegistrationData completeRegistrationData) {
        Companion $r0 = Companion;
        EmailVerificationFragment $r1 = $r0.newInstance(completeRegistrationData);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-2  reason: not valid java name */
    public static final void m40446onViewCreated$lambda4$lambda2(FragmentEmailVeridicationBinding fragmentEmailVeridicationBinding, EmailVerificationFragment emailVerificationFragment, View view) {
        Log_OC.getArray(fragmentEmailVeridicationBinding, "$this_apply");
        Log_OC.getArray(emailVerificationFragment, "this$0");
        KudiInputField $r3 = fragmentEmailVeridicationBinding.secondaryPhoneNumberInputField;
        String $r4 = $r3.getText();
        KudiInputField $r32 = fragmentEmailVeridicationBinding.emailValidationEmailAddressInputField;
        String $r5 = $r32.getText();
        EmailVerificationViewModel $r6 = emailVerificationFragment.getEmailVerificationViewModel();
        CompleteRegistrationData $r7 = emailVerificationFragment.completeRegistrationData;
        Log_OC.append($r7);
        $r6.sendOtp($r4, $r5, $r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40447onViewCreated$lambda4$lambda3(EmailVerificationFragment emailVerificationFragment, View view) {
        Boolean $r6;
        Boolean $r62;
        Log_OC.getArray(emailVerificationFragment, "this$0");
        CompleteRegistrationData $r3 = emailVerificationFragment.completeRegistrationData;
        Log_OC.append($r3);
        boolean $z0 = $r3.isOnbardingFlow();
        if (!$z0) {
            SettingsActivity $r8 = emailVerificationFragment.settingsDetailsActivity;
            if ($r8 == null) {
                return;
            }
            $r8.finish();
            return;
        }
        RegisterActivity $r0 = emailVerificationFragment.registerActivity;
        if ($r0 == null) {
            return;
        }
        CompleteRegistrationData $r32 = emailVerificationFragment.completeRegistrationData;
        String $r4 = $r32 == null ? null : $r32.getFirstName();
        if ($r4 == null) {
            $r4 = "";
        }
        CompleteRegistrationData $r33 = emailVerificationFragment.completeRegistrationData;
        Double $r5 = $r33 == null ? null : $r33.getWalletBalance();
        Log_OC.append($r5);
        double $d0 = $r5.doubleValue();
        CompleteRegistrationData $r34 = emailVerificationFragment.completeRegistrationData;
        Boolean $r63 = $r34 == null ? null : $r34.isKCashEnabled();
        Log_OC.append($r63);
        boolean $z02 = $r63.booleanValue();
        CompleteRegistrationData $r35 = emailVerificationFragment.completeRegistrationData;
        Boolean $r64 = $r35 == null ? null : $r35.isC2C();
        Log_OC.append($r64);
        boolean $z1 = $r64.booleanValue();
        CompleteRegistrationData $r36 = emailVerificationFragment.completeRegistrationData;
        if ($r36 == null) {
            $r6 = null;
        } else {
            boolean $z2 = $r36.isHq();
            $r6 = Boolean.valueOf($z2);
        }
        Log_OC.append($r6);
        boolean $z22 = $r6.booleanValue();
        CompleteRegistrationData $r37 = emailVerificationFragment.completeRegistrationData;
        if ($r37 == null) {
            $r62 = null;
        } else {
            boolean $z3 = $r37.isOutlet();
            $r62 = Boolean.valueOf($z3);
        }
        Log_OC.append($r62);
        boolean $z32 = $r62.booleanValue();
        CompleteRegistrationData $r38 = emailVerificationFragment.completeRegistrationData;
        Boolean $r65 = $r38 == null ? null : $r38.isNewUser();
        Log_OC.append($r65);
        boolean $z4 = $r65.booleanValue();
        CompleteRegistrationData $r39 = emailVerificationFragment.completeRegistrationData;
        String $r7 = $r39 == null ? null : $r39.getCustomerType();
        Log_OC.append($r7);
        $r0.navigateToWelcomePage($r4, $d0, $z4, $z02, $z1, $z22, $z32, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        EmailVerificationViewData $r2 = (EmailVerificationViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(EmailVerificationViewData emailVerificationViewData) {
        FragmentActivity $r8;
        Log_OC.getArray(emailVerificationViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentEmailVeridicationBinding $r3 = (FragmentEmailVeridicationBinding) $r2;
        boolean $z0 = emailVerificationViewData.isSendingOtp();
        if ($z0) {
            KudiButton $r4 = $r3.verifyDetailsButton;
            $r4.m38032f();
        } else {
            KudiButton $r42 = $r3.verifyDetailsButton;
            $r42.m38033e();
        }
        VerificationError $r5 = emailVerificationViewData.getVerificationError();
        if ($r5 == null) {
            return;
        }
        String $r6 = $r5.getPhoneError();
        if ($r6 != null) {
            KudiInputField $r7 = $r3.secondaryPhoneNumberInputField;
            $r7.setError($r6);
        }
        String $r62 = $r5.getEmailError();
        if ($r62 != null) {
            KudiInputField $r72 = $r3.emailValidationEmailAddressInputField;
            $r72.setError($r62);
        }
        String $r63 = $r5.getError();
        if ($r63 == null || ($r8 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r8, $r63, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        EmailVerificationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public EmailVerificationViewModel createViewModel() {
        EmailVerificationViewModel $r1 = getEmailVerificationViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EmailVerificationViewModel getEmailVerificationViewModel() {
        EmailVerificationViewModel $r1 = this.emailVerificationViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("emailVerificationViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return EmailVerificationViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        SettingsSubComponent $r5;
        RegistrationSubComponent $r3;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof RegisterActivity;
        if ($z0) {
            RegisterActivity $r2 = (RegisterActivity) context;
            this.registerActivity = $r2;
            if ($r2 == null || ($r3 = $r2.getRegistrationV2SubComponent()) == null) {
                return;
            }
            $r3.inject(this);
            return;
        }
        boolean $z02 = context instanceof SettingsActivity;
        if ($z02) {
            SettingsActivity $r4 = (SettingsActivity) context;
            this.settingsDetailsActivity = $r4;
            if ($r4 == null || ($r5 = $r4.getSettingsSubComponent()) == null) {
                return;
            }
            $r5.inject(this);
        }
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
        Parcelable $r2 = $r1.getParcelable(COMPLETE_REG_DATA);
        CompleteRegistrationData $r3 = (CompleteRegistrationData) $r2;
        this.completeRegistrationData = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentEmailVeridicationBinding $r4 = FragmentEmailVeridicationBinding.inflate(layoutInflater, viewGroup, false);
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
        String $r5 = getString(C0001R.string._2fa_setup);
        Log_OC.loadImage($r5, "getString(R.string._2fa_setup)");
        SettingsActivityExtKt.setSettingsTitle(this, $r5);
        InterfaceC8209a $r6 = requireBinding();
        final FragmentEmailVeridicationBinding $r7 = (FragmentEmailVeridicationBinding) $r6;
        CompleteRegistrationData $r8 = this.completeRegistrationData;
        Log_OC.append($r8);
        boolean $z0 = $r8.isOnbardingFlow();
        if (!$z0) {
            ViewGroup $r9 = $r7.emailVerificationRootLayout;
            Context $r10 = requireContext();
            Log_OC.loadImage($r10, "requireContext()");
            int $i0 = ContextExtKt.getKudiColor($r10, C0001R.color.page_background);
            ViewGroup r21 = $r9;
            r21.setBackgroundColor($i0);
            TextView $r11 = $r7.emailVerificationSubtitle;
            Context $r102 = requireContext();
            Log_OC.loadImage($r102, "requireContext()");
            int $i02 = ContextExtKt.getKudiColor($r102, C0001R.color.black);
            TextView $r12 = $r11;
            $r12.setTextColor($i02);
            TextView $r122 = $r7.emailVerificationSkipThisStepButton;
            Context $r103 = requireContext();
            Log_OC.loadImage($r103, "requireContext()");
            int $i03 = ContextExtKt.getKudiColor($r103, C0001R.color.colorPrimary);
            $r122.setTextColor($i03);
            TextView $r123 = $r7.emailVerificationSkipThisStepButton;
            Drawable[] $r13 = $r123.getCompoundDrawables();
            Log_OC.loadImage($r13, "emailVerificationSkipThisStepButton.compoundDrawables");
            for (Drawable $r1 : $r13) {
                if ($r1 != null) {
                    Context $r104 = requireContext();
                    Log_OC.loadImage($r104, "requireContext()");
                    int $i2 = ContextExtKt.getKudiColor($r104, C0001R.color.yellow);
                    PorterDuff.Mode $r14 = PorterDuff.Mode.SRC_IN;
                    PorterDuffColorFilter r18 = new PorterDuffColorFilter($i2, $r14);
                    $r1.setColorFilter(r18);
                }
            }
            View $r112 = $r7.emailVerificationTitleText;
            Log_OC.loadImage($r112, "emailVerificationTitleText");
            View $r3 = $r112;
            ViewExtKt.hide$default($r3, false, 1, null);
        }
        ViewGroup $r15 = $r7.verifyDetailsButton;
        ViewGroup r212 = $r15;
        r212.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FragmentEmailVeridicationBinding $r2 = FragmentEmailVeridicationBinding.this;
                EmailVerificationFragment $r32 = this;
                EmailVerificationFragment.m40446onViewCreated$lambda4$lambda2($r2, $r32, view2);
            }
        });
        TextView $r124 = $r7.emailVerificationSkipThisStepButton;
        $r124.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.SubscribeActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmailVerificationFragment $r2 = EmailVerificationFragment.this;
                EmailVerificationFragment.m40447onViewCreated$lambda4$lambda3($r2, view2);
            }
        });
    }

    public final void setEmailVerificationViewModel(EmailVerificationViewModel emailVerificationViewModel) {
        Log_OC.getArray(emailVerificationViewModel, "<set-?>");
        this.emailVerificationViewModel = emailVerificationViewModel;
    }
}
