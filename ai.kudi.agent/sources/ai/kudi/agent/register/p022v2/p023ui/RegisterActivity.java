package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.acceptterms.AcceptTermsActivity;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ActivityRegisterBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.domain.wiki.ResetPinResponse;
import ai.kudi.agent.login.p011ui.LoginActivity;
import ai.kudi.agent.login.p011ui.NonAgentSignOnFragment;
import ai.kudi.agent.login.p011ui.p012v2.ResetPinFragment;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.data.models.OtpCallBacks;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.navigators.EmailVerificationNavigator;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.AccountTypeFragment;
import ai.kudi.agent.register.p021ui.BusinessInfoFragment;
import ai.kudi.agent.register.p021ui.BusinessTypeDescriptionFragment;
import ai.kudi.agent.register.p021ui.CreatePinFragment;
import ai.kudi.agent.register.p021ui.PersonalInfoFragment;
import ai.kudi.agent.register.p021ui.SelectBusinessTypeFragment;
import ai.kudi.agent.register.p021ui.viewmodels.ContainerViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import ai.kudi.agent.register.p022v2.p023ui.BvnNinFragment;
import ai.kudi.agent.register.p022v2.p023ui.EnableFingerPrintFragment;
import ai.kudi.agent.register.p022v2.p023ui.OtpFragment;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.register.p022v2.p023ui.SomethingIsNotRightFragment;
import ai.kudi.agent.register.p022v2.p023ui.WelcomeFragment;
import ai.kudi.agent.register.verifybvn.VerifyBvnPictureFragment;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.snackbar.Snackbar;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: RegisterActivity.kt */
@Metadata(m10422d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0014J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0014J\b\u0010 \u001a\u00020\u001cH\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0014J\u0006\u0010'\u001a\u00020\u001cJ$\u0010(\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010$2\u0006\u0010*\u001a\u00020$H\u0016J@\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020$H\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u001cH\u0016J\u0010\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020:H\u0016J\u001c\u0010;\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010$H\u0016JH\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e2\u0006\u00103\u001a\u00020$H\u0016J\"\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\b\u0010D\u001a\u00020\u001cH\u0016J\u0012\u0010E\u001a\u00020\u001c2\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\b\u0010H\u001a\u00020\u001cH\u0016J\u0018\u0010I\u001a\u00020J2\u0006\u0010)\u001a\u00020$2\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010M\u001a\u00020J2\u0006\u0010N\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0002J\b\u0010O\u001a\u00020\u001cH\u0002J\u0006\u0010P\u001a\u00020\u001cJ\u0016\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020$J\b\u0010U\u001a\u00020\u001cH\u0002J\u0012\u0010V\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010:H\u0016J\u0012\u0010W\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010:H\u0016J\b\u0010X\u001a\u00020\u001cH\u0016J\u0010\u0010Y\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010Y\u001a\u00020\u001c2\u0006\u0010\\\u001a\u00020:H\u0016J\b\u0010]\u001a\u00020\u001cH\u0016J\u0018\u0010^\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020L2\u0006\u0010)\u001a\u00020$H\u0016J \u0010^\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020L2\u0006\u0010N\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0016J\u0010\u0010_\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010`\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010:H\u0016J\u0012\u0010a\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010b\u001a\u00020\u001c2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010c\u001a\u00020\u001cH\u0016J\u0010\u0010d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010e\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010:H\u0016J\u0012\u0010f\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010:H\u0016J\u0018\u0010g\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010)\u001a\u00020$H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006h"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/RegisterActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/register/ui/viewmodels/ContainerViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/ContainerViewData;", "Lai/kudi/agent/databinding/ActivityRegisterBinding;", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "Lai/kudi/agent/register/navigators/EmailVerificationNavigator;", "()V", "ONBOARDING_STEPS", "", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityRegisterBinding;", "isOnCallSupportOrSomethingIsWrong", "", "isOnStatesOrLgaFragment", "registrationV2SubComponent", "Lai/kudi/agent/register/di/components/RegistrationSubComponent;", "getRegistrationV2SubComponent", "()Lai/kudi/agent/register/di/components/RegistrationSubComponent;", "setRegistrationV2SubComponent", "(Lai/kudi/agent/register/di/components/RegistrationSubComponent;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/register/ui/viewmodels/ContainerViewModel;", "setViewModel", "(Lai/kudi/agent/register/ui/viewmodels/ContainerViewModel;)V", "applyViewData", "", "viewData", "backToBusinessInfoFragment", "createViewModel", "finishFragmentBvn", "getPhoneAndBvnFragment", "Landroidx/fragment/app/Fragment;", "phoneNumber", "", "getVMType", "Ljava/lang/Class;", "hideLoader", "navigateToBvnNinView", PhoneFragment.ARG_BVN, "regId", "navigateToDashboard", "walletBalance", "", "isNewUser", "isKCashEnabled", "isC2C", "isOutlet", "isHq", "customerType", "navigateToEnableFingerPrint", "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "navigateToFundWallet", "navigateToPendingKycVerification", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "navigateToPhoneView", "navigateToWelcomePage", "firstName", "sNewUser", "onActivityResult", "requestCode", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "otpCallBacks", "Lai/kudi/agent/register/data/models/OtpCallBacks;", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "otpCallBacksForEmailVerification", "emailAddress", "setInitialFragment", "showLoader", "showSnackBar", "view", "Landroid/view/View;", MetricTracker.Object.MESSAGE, "startPinResetFlow", "toAccountTypeSelectionView", "toBusinessInformationView", "toCallSupportView", "toCreatePinView", "resetPinResponse", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;", "personalInfo", "toDuplicateIdentityNumberFragment", "toEnterOtpView", "toLoginView", "toMerchantTandC", "toPersonalInformationView", "toProfilePictureUploadView", "toProfilePictureView", "toResetPinView", "toSelectBusinessTypeDescriptionView", "toSelectBusinessTypeView", "toSomethingIsWrongView", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.RegisterActivity */
/* loaded from: classes.dex */
public final class RegisterActivity extends BaseMVVMActivity<ContainerViewModel, ContainerViewData, ActivityRegisterBinding> implements RegisterNavigator, EmailVerificationNavigator {
    private final int ONBOARDING_STEPS = 12;
    private boolean isOnCallSupportOrSomethingIsWrong;
    private boolean isOnStatesOrLgaFragment;
    public RegistrationSubComponent registrationV2SubComponent;
    public ContainerViewModel viewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Fragment getPhoneAndBvnFragment(String str) {
        FragmentManager $r2 = getSupportFragmentManager();
        String $r4 = PhoneFragment.class.getCanonicalName();
        Fragment $r5 = $r2.m35938g0($r4);
        if ($r5 == null) {
            PhoneFragment.Companion $r6 = PhoneFragment.Companion;
            PhoneFragment $r7 = $r6.newInstance(str, "");
            return $r7;
        }
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m40466onCreate$lambda0(RegisterActivity registerActivity, View view) {
        Log_OC.getArray(registerActivity, "this$0");
        registerActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final OtpCallBacks otpCallBacks(final String str, final OtpFragmentData otpFragmentData) {
        return new OtpCallBacks() { // from class: ai.kudi.agent.register.v2.ui.RegisterActivity$otpCallBacks$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onBottomViewActionClicked() {
                String $r5;
                OtpFragmentData $r1 = OtpFragmentData.this;
                boolean $z0 = $r1.isNewVerification();
                if ($z0) {
                    RegisterActivity $r2 = this;
                    AppCompatActivityExtKt.callSupport($r2);
                    return;
                }
                RegisterActivity $r22 = this;
                OtpFragmentData $r12 = OtpFragmentData.this;
                OtpData $r3 = $r12.getOtpData();
                String $r4 = "";
                if ($r3 != null && ($r5 = $r3.getPhoneNumber()) != null) {
                    $r4 = $r5;
                }
                $r22.toLoginView($r4);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onOtpEntered(OtpData otpData) {
                if (otpData == null) {
                    return;
                }
                OtpFragmentData $r2 = OtpFragmentData.this;
                RegisterActivity $r3 = this;
                String $r4 = str;
                boolean $z0 = $r2.isNewVerification();
                if ($z0) {
                    ContainerViewModel $r5 = $r3.getViewModel();
                    String $r42 = otpData.getOtpRequestId();
                    String $r6 = otpData.getOtp();
                    String $r7 = otpData.getPhoneNumber();
                    $r5.verifyOtpForNewUser($r42, $r6, $r7);
                    return;
                }
                String $r62 = otpData.getOtpRequestId();
                String $r72 = otpData.getPhoneNumber();
                String $r8 = otpData.getOtp();
                ContainerViewModel $r52 = $r3.getViewModel();
                $r52.verifyOtp($r62, $r8, $r72, $r4);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onResendOtpClicked(OtpData otpData) {
                if (otpData == null) {
                    return;
                }
                RegisterActivity $r2 = this;
                ContainerViewModel $r3 = $r2.getViewModel();
                String $r4 = otpData.getOtpRequestId();
                String $r5 = otpData.getPhoneNumber();
                $r3.resendOtp($r4, $r5);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final OtpCallBacks otpCallBacksForEmailVerification(final String str, final CompleteRegistrationData completeRegistrationData) {
        return new OtpCallBacks() { // from class: ai.kudi.agent.register.v2.ui.RegisterActivity$otpCallBacksForEmailVerification$1
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onBottomViewActionClicked() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onOtpEntered(OtpData otpData) {
                if (otpData == null) {
                    return;
                }
                RegisterActivity $r4 = RegisterActivity.this;
                String $r1 = str;
                CompleteRegistrationData $r2 = completeRegistrationData;
                ContainerViewModel $r5 = $r4.getViewModel();
                String $r6 = otpData.getPhoneNumber();
                String $r7 = otpData.getOtp();
                $r5.verifyOtpSecondaryVerification($r1, $r6, $r7, $r2);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onResendOtpClicked(OtpData otpData) {
                if (otpData == null) {
                    return;
                }
                RegisterActivity $r2 = RegisterActivity.this;
                ContainerViewModel $r3 = $r2.getViewModel();
                String $r4 = otpData.getPhoneNumber();
                $r3.sendOtpEmailVerification($r4);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setInitialFragment() {
        InterfaceC8209a $r1 = getBinding();
        ActivityRegisterBinding $r2 = (ActivityRegisterBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r3.setProgress($i0 * 1);
        Intent $r4 = getIntent();
        String $r5 = $r4.getStringExtra("phoneNo");
        Fragment $r6 = getPhoneAndBvnFragment($r5);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 12, null);
        InterfaceC8209a $r12 = getBinding();
        ActivityRegisterBinding $r22 = (ActivityRegisterBinding) $r12;
        Toolbar $r7 = $r22.toolbar;
        setSupportActionBar($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void startPinResetFlow() {
        NonAgentSignOnFragment.Companion $r1 = NonAgentSignOnFragment.Companion;
        Intent $r2 = getIntent();
        Serializable $r3 = $r2.getSerializableExtra("USER");
        if ($r3 == null) {
            NullPointerException $r10 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.users.domain.dto.User");
            throw $r10;
        }
        User $r4 = (User) $r3;
        NonAgentSignOnFragment $r5 = $r1.newInstance($r4);
        AppCompatActivityExtKt.startFragment$default(this, $r5, C0001R.C0003id.container, false, false, false, 12, null);
        InterfaceC8209a $r6 = getBinding();
        ActivityRegisterBinding $r7 = (ActivityRegisterBinding) $r6;
        ProgressBar $r8 = $r7.progressBar;
        Log_OC.loadImage($r8, "binding.progressBar");
        ViewExtKt.hide$default($r8, false, 1, null);
        InterfaceC8209a $r62 = getBinding();
        ActivityRegisterBinding $r72 = (ActivityRegisterBinding) $r62;
        Toolbar $r9 = $r72.toolbar;
        setSupportActionBar($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ContainerViewData $r2 = (ContainerViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData r17) {
        /*
            r16 = this;
            java.lang.String r1 = "viewData"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r16
            androidx.fragment.app.FragmentManager r2 = r0.getSupportFragmentManager()
            r4 = 2131362280(0x7f0a01e8, float:1.8344336E38)
            androidx.fragment.app.Fragment r3 = r2.m35941f0(r4)
            boolean r5 = r3 instanceof ai.kudi.agent.register.p022v2.p023ui.OtpFragment
            if (r5 == 0) goto L1d
            r7 = r3
            ai.kudi.agent.register.v2.ui.OtpFragment r7 = (ai.kudi.agent.register.p022v2.p023ui.OtpFragment) r7
            r6 = r7
            goto L1e
        L1d:
            r6 = 0
        L1e:
            if (r6 != 0) goto L22
            r8 = 0
            goto L26
        L22:
            ai.kudi.agent.register.data.models.OtpData r8 = r6.getOtpData()
        L26:
            r0 = r17
            boolean r5 = r0.isSubmittingOtp()
            if (r5 != 0) goto L3d
            r0 = r17
            boolean r5 = r0.isResendingOtp()
            if (r5 == 0) goto L37
            goto L3d
        L37:
            r0 = r16
            r0.hideLoader()
            goto L42
        L3d:
            r0 = r16
            r0.showLoader()
        L42:
            r0 = r17
            java.lang.Long r9 = r0.getTimeLeft()
            if (r9 != 0) goto L4b
            goto L5b
        L4b:
            long r10 = r9.longValue()
            if (r8 != 0) goto L52
            goto L55
        L52:
            r8.setExpiryInSeconds(r10)
        L55:
            if (r6 != 0) goto L58
            goto L5b
        L58:
            r6.initCountDownTimer()
        L5b:
            r0 = r17
            java.lang.String r12 = r0.getFeedbackMsg()
            r5 = 0
            if (r12 != 0) goto L65
            goto L6d
        L65:
            r4 = 0
            r13 = 2
            r14 = 0
            r0 = r16
            ai.kudi.agent.core.util.ContextExtKt.toast$default(r0, r12, r4, r13, r14)
        L6d:
            r0 = r17
            java.lang.String r12 = r0.getOtpRequestId()
            if (r12 != 0) goto L76
            goto L7c
        L76:
            if (r8 != 0) goto L79
            goto L7c
        L79:
            r8.setOtpRequestId(r12)
        L7c:
            r0 = r17
            java.lang.String r12 = r0.getError()
            if (r12 != 0) goto L85
            return
        L85:
            if (r6 != 0) goto L88
            goto L90
        L88:
            boolean r15 = r6.isAdded()
            r4 = 1
            if (r15 != r4) goto L90
            r5 = 1
        L90:
            if (r5 == 0) goto L9c
            r0 = r17
            boolean r5 = r0.isAuthError()
            r4 = 1
            r6.handleError(r4, r12, r5)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p022v2.p023ui.RegisterActivity.applyViewData(ai.kudi.agent.register.ui.viewmodels.data.ContainerViewData):void");
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void backToBusinessInfoFragment() {
        onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ContainerViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected ContainerViewModel createViewModel() {
        ContainerViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void finishFragmentBvn() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityRegisterBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityRegisterBinding $r2 = ActivityRegisterBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityRegisterBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RegistrationSubComponent getRegistrationV2SubComponent() {
        RegistrationSubComponent $r1 = this.registrationV2SubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("registrationV2SubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return ContainerViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public final ContainerViewModel getViewModel() {
        ContainerViewModel $r1 = this.viewModel;
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
    public final void hideLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivityRegisterBinding $r2 = (ActivityRegisterBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToBvnNinView(String str, String str2, String str3) {
        Log_OC.getArray(str3, "regId");
        InterfaceC8209a $r4 = getBinding();
        ActivityRegisterBinding $r5 = (ActivityRegisterBinding) $r4;
        View $r6 = $r5.toolbar;
        Log_OC.loadImage($r6, "binding.toolbar");
        View r10 = $r6;
        ViewExtKt.show(r10);
        InterfaceC8209a $r42 = getBinding();
        ActivityRegisterBinding $r52 = (ActivityRegisterBinding) $r42;
        ProgressBar $r7 = $r52.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r7.setProgress($i0 * 2);
        this.isOnCallSupportOrSomethingIsWrong = false;
        BvnNinFragment.Companion $r8 = BvnNinFragment.Companion;
        BvnNinFragment $r9 = $r8.newInstance(str, str2, str3);
        AppCompatActivityExtKt.startFragment$default(this, $r9, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToDashboard(double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        Log_OC.getArray(str, "customerType");
        LoginParams $r2 = LoginParams.INSTANCE;
        $r2.buildLoginIntent(this, z, z2, z3, z5, z4, str, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToEnableFingerPrint(CompleteRegistrationData completeRegistrationData) {
        Log_OC.getArray(completeRegistrationData, "completeRegistrationData");
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        EnableFingerPrintFragment.Companion $r3 = EnableFingerPrintFragment.Companion;
        RegisterActivity$navigateToEnableFingerPrint$1 $r4 = new RegisterActivity$navigateToEnableFingerPrint$1(this);
        EnableFingerPrintFragment $r2 = $r3.newInstance(completeRegistrationData, $r4);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.container, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToFundWallet() {
        RegisterActivity$navigateToFundWallet$1 $r1 = RegisterActivity$navigateToFundWallet$1.INSTANCE;
        ContextExtKt.launchActivity((Context) this, false, WalletTopUpActivity.class, (InterfaceC11767l) $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToPendingKycVerification(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "registrationInfo");
        RegisterActivity$navigateToPendingKycVerification$1 $r1 = new RegisterActivity$navigateToPendingKycVerification$1(registrationInfo);
        ContextExtKt.launchActivity((Context) this, true, PendingKycActivity.class, (InterfaceC11767l) $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToPhoneView(String str, String str2) {
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        InterfaceC8209a $r3 = getBinding();
        ActivityRegisterBinding $r4 = (ActivityRegisterBinding) $r3;
        Toolbar $r5 = $r4.toolbar;
        Log_OC.loadImage($r5, "binding.toolbar");
        ViewExtKt.show($r5);
        this.isOnCallSupportOrSomethingIsWrong = false;
        PhoneFragment.Companion $r6 = PhoneFragment.Companion;
        PhoneFragment $r7 = $r6.newInstance(str, str2);
        AppCompatActivityExtKt.startFragment$default(this, $r7, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToWelcomePage(String str, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2) {
        Log_OC.getArray(str, "firstName");
        Log_OC.getArray(str2, "customerType");
        InterfaceC8209a $r3 = getBinding();
        ActivityRegisterBinding $r4 = (ActivityRegisterBinding) $r3;
        View $r5 = $r4.appBarLayout;
        Log_OC.loadImage($r5, "binding.appBarLayout");
        View r8 = $r5;
        ViewExtKt.hide$default(r8, false, 1, null);
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        WelcomeFragment.Companion $r6 = WelcomeFragment.Companion;
        WelcomeFragment $r7 = $r6.newInstance(str, d, z, z2, z3, z4, z5, str2);
        AppCompatActivityExtKt.startFragment$default(this, $r7, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void onActivityResult(int i, int i2, Intent intent) {
        Boolean $r2;
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            if (intent == null) {
                $r2 = null;
            } else {
                boolean $z0 = intent.getBooleanExtra(AcceptTermsActivity.BUNDLE_KEY_ACCEPTED, false);
                $r2 = Boolean.valueOf($z0);
            }
            if (i2 == -1) {
                Boolean $r3 = Boolean.TRUE;
                boolean $z02 = Log_OC.append($r2, $r3);
                if ($z02) {
                    ContainerViewModel $r4 = getViewModel();
                    RegistrationInfo $r5 = $r4.getRegistrationInfo();
                    if ($r5 == null) {
                        return;
                    }
                    toCreatePinView($r5);
                    return;
                }
            }
            AppCompatActivityExtKt.pop$default(this, null, 1, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        FragmentManager $r1 = getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r12 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r12;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        RegistrationSubComponent.Factory $r5 = $r4.registrationV2SubComponent();
        RegistrationSubComponent $r6 = $r5.create(this, this);
        setRegistrationV2SubComponent($r6);
        RegistrationSubComponent $r62 = getRegistrationV2SubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        disableLogoutTimer();
        if (bundle == null) {
            Intent $r7 = getIntent();
            boolean $z0 = $r7.getBooleanExtra(Constants.PIN_RESET_REQUIRED, false);
            if ($z0) {
                startPinResetFlow();
                InterfaceC8209a $r8 = getBinding();
                ActivityRegisterBinding $r9 = (ActivityRegisterBinding) $r8;
                Toolbar $r10 = $r9.toolbar;
                $r10.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.k
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RegisterActivity $r22 = RegisterActivity.this;
                        RegisterActivity.m40466onCreate$lambda0($r22, view);
                    }
                });
            }
        }
        setInitialFragment();
        InterfaceC8209a $r82 = getBinding();
        ActivityRegisterBinding $r92 = (ActivityRegisterBinding) $r82;
        Toolbar $r102 = $r92.toolbar;
        $r102.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.k
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegisterActivity $r22 = RegisterActivity.this;
                RegisterActivity.m40466onCreate$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onResume() {
        super.onResume();
        boolean $z0 = this.isOnStatesOrLgaFragment;
        if (!$z0) {
            boolean $z02 = this.isOnCallSupportOrSomethingIsWrong;
            if (!$z02) {
                InterfaceC8209a $r1 = getBinding();
                ActivityRegisterBinding $r2 = (ActivityRegisterBinding) $r1;
                View $r3 = $r2.toolbar;
                Log_OC.loadImage($r3, "binding.toolbar");
                View r4 = $r3;
                ViewExtKt.show(r4);
                return;
            }
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityRegisterBinding $r22 = (ActivityRegisterBinding) $r12;
        View $r32 = $r22.toolbar;
        Log_OC.loadImage($r32, "binding.toolbar");
        View r42 = $r32;
        ViewExtKt.hide$default(r42, false, 1, null);
    }

    public final void setRegistrationV2SubComponent(RegistrationSubComponent registrationSubComponent) {
        Log_OC.getArray(registrationSubComponent, "<set-?>");
        this.registrationV2SubComponent = registrationSubComponent;
    }

    public final void setViewModel(ContainerViewModel containerViewModel) {
        Log_OC.getArray(containerViewModel, "<set-?>");
        this.viewModel = containerViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivityRegisterBinding $r2 = (ActivityRegisterBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.show(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showSnackBar(View view, String $r2) {
        Log_OC.getArray(view, "view");
        Log_OC.getArray($r2, MetricTracker.Object.MESSAGE);
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            Spanned $r4 = Html.fromHtml("<font color=\"#ffffff\">" + $r2 + "</font>", 0);
            Snackbar $r5 = Snackbar.m26606Y(view, $r4, -1);
            $r5.mo26610N();
            return;
        }
        Spanned $r42 = Html.fromHtml("<font color=\"#ffffff\">" + $r2 + "</font>");
        Snackbar $r52 = Snackbar.m26606Y(view, $r42, -1);
        $r52.mo26610N();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toAccountTypeSelectionView(RegistrationInfo registrationInfo) {
        InterfaceC8209a $r2 = getBinding();
        ActivityRegisterBinding $r3 = (ActivityRegisterBinding) $r2;
        ProgressBar $r4 = $r3.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r4.setProgress($i0 * 6);
        AccountTypeFragment.Companion $r5 = AccountTypeFragment.Companion;
        AccountTypeFragment $r6 = AccountTypeFragment.Companion.newInstance$default($r5, registrationInfo, null, null, 6, null);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toBusinessInformationView(RegistrationInfo registrationInfo) {
        InterfaceC8209a $r2 = getBinding();
        ActivityRegisterBinding $r3 = (ActivityRegisterBinding) $r2;
        ProgressBar $r4 = $r3.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r4.setProgress($i0 * 7);
        BusinessInfoFragment.Companion $r5 = BusinessInfoFragment.Companion;
        BusinessInfoFragment $r6 = BusinessInfoFragment.Companion.newInstance$default($r5, registrationInfo, null, null, 6, null);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toCallSupportView() {
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        this.isOnCallSupportOrSomethingIsWrong = true;
        InterfaceC8209a $r2 = getBinding();
        ActivityRegisterBinding $r3 = (ActivityRegisterBinding) $r2;
        Toolbar $r4 = $r3.toolbar;
        Log_OC.loadImage($r4, "binding.toolbar");
        ViewExtKt.hide$default($r4, false, 1, null);
        CallUsFragment r5 = new CallUsFragment();
        AppCompatActivityExtKt.startFragment$default(this, r5, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toCreatePinView(ResetPinResponse resetPinResponse) {
        Log_OC.getArray(resetPinResponse, "resetPinResponse");
        InterfaceC8209a $r2 = getBinding();
        ActivityRegisterBinding $r3 = (ActivityRegisterBinding) $r2;
        ProgressBar $r4 = $r3.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r4.setProgress($i0 * 8);
        CreatePinFragment.Companion $r5 = CreatePinFragment.Companion;
        CreatePinFragment $r6 = $r5.newInstance(resetPinResponse);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toCreatePinView(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "personalInfo");
        InterfaceC8209a $r2 = getBinding();
        ActivityRegisterBinding $r3 = (ActivityRegisterBinding) $r2;
        ProgressBar $r4 = $r3.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r4.setProgress($i0 * 8);
        CreatePinFragment.Companion $r5 = CreatePinFragment.Companion;
        CreatePinFragment $r6 = CreatePinFragment.Companion.newInstance$default($r5, registrationInfo, null, null, 6, null);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toDuplicateIdentityNumberFragment() {
        DuplicateIdentityNumberFragment $r1 = new DuplicateIdentityNumberFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toEnterOtpView(OtpFragmentData otpFragmentData, String str) {
        Log_OC.getArray(otpFragmentData, "otpFragmentData");
        Log_OC.getArray(str, PhoneFragment.ARG_BVN);
        InterfaceC8209a $r3 = getBinding();
        ActivityRegisterBinding $r4 = (ActivityRegisterBinding) $r3;
        ProgressBar $r5 = $r4.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r5.setProgress($i0 * 3);
        OtpFragment.Companion $r6 = OtpFragment.Companion;
        OtpCallBacks $r7 = otpCallBacks(str, otpFragmentData);
        OtpFragment $r8 = $r6.newInstance(otpFragmentData, $r7);
        AppCompatActivityExtKt.startFragment$default(this, $r8, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.EmailVerificationNavigator
    public void toEnterOtpView(OtpFragmentData otpFragmentData, String str, CompleteRegistrationData completeRegistrationData) {
        Log_OC.getArray(otpFragmentData, "otpFragmentData");
        Log_OC.getArray(str, "emailAddress");
        Log_OC.getArray(completeRegistrationData, "completeRegistrationData");
        OtpFragment.Companion $r4 = OtpFragment.Companion;
        OtpCallBacks $r5 = otpCallBacksForEmailVerification(str, completeRegistrationData);
        OtpFragment $r6 = $r4.newInstance(otpFragmentData, $r5);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toLoginView(String str) {
        Log_OC.getArray(str, "phoneNumber");
        RegisterActivity$toLoginView$1 $r1 = new RegisterActivity$toLoginView$1(str);
        ContextExtKt.launchActivity((Context) this, true, LoginActivity.class, (InterfaceC11767l) $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toMerchantTandC(RegistrationInfo registrationInfo) {
        ContainerViewModel $r2 = getViewModel();
        $r2.setRegistrationInfo(registrationInfo);
        AcceptTermsActivity.Companion $r3 = AcceptTermsActivity.Companion;
        Intent $r4 = $r3.getIntent(this, "file:///android_asset/html/merchant_terms.html");
        startActivityForResult($r4, 200);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toPersonalInformationView(RegistrationInfo registrationInfo) {
        InterfaceC8209a $r2 = getBinding();
        ActivityRegisterBinding $r3 = (ActivityRegisterBinding) $r2;
        ProgressBar $r4 = $r3.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r4.setProgress($i0 * 7);
        PersonalInfoFragment.Companion $r5 = PersonalInfoFragment.Companion;
        PersonalInfoFragment $r6 = PersonalInfoFragment.Companion.newInstance$default($r5, registrationInfo, null, null, 6, null);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toProfilePictureUploadView(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "registrationInfo");
        InterfaceC8209a $r2 = getBinding();
        ActivityRegisterBinding $r3 = (ActivityRegisterBinding) $r2;
        ProgressBar $r4 = $r3.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r4.setProgress($i0 * 5);
        VerifyBvnPictureFragment.Companion $r5 = VerifyBvnPictureFragment.Companion;
        VerifyBvnPictureFragment $r6 = $r5.newInstance(registrationInfo);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 28, null);
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toProfilePictureView() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toResetPinView(String str) {
        Log_OC.getArray(str, "phoneNumber");
        InterfaceC8209a $r2 = getBinding();
        ActivityRegisterBinding $r3 = (ActivityRegisterBinding) $r2;
        ProgressBar $r4 = $r3.progressBar;
        int $i0 = this.ONBOARDING_STEPS;
        $r4.setProgress($i0 * 8);
        ResetPinFragment.Companion $r5 = ResetPinFragment.Companion;
        ResetPinFragment $r6 = $r5.newInstance(str);
        AppCompatActivityExtKt.startFragment$default(this, $r6, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toSelectBusinessTypeDescriptionView(RegistrationInfo registrationInfo) {
        BusinessTypeDescriptionFragment.Companion $r2 = BusinessTypeDescriptionFragment.Companion;
        BusinessTypeDescriptionFragment $r3 = $r2.newInstance(registrationInfo);
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toSelectBusinessTypeView(RegistrationInfo registrationInfo) {
        SelectBusinessTypeFragment.Companion $r2 = SelectBusinessTypeFragment.Companion;
        SelectBusinessTypeFragment $r3 = $r2.newInstance(registrationInfo);
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toSomethingIsWrongView(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, PhoneFragment.ARG_BVN);
        this.isOnCallSupportOrSomethingIsWrong = true;
        InterfaceC8209a $r3 = getBinding();
        ActivityRegisterBinding $r4 = (ActivityRegisterBinding) $r3;
        View $r5 = $r4.toolbar;
        Log_OC.loadImage($r5, "binding.toolbar");
        View r8 = $r5;
        ViewExtKt.hide$default(r8, false, 1, null);
        hideLoader();
        SomethingIsNotRightFragment.Companion $r6 = SomethingIsNotRightFragment.Companion;
        SomethingIsNotRightFragment $r7 = $r6.newInstance(str, str2);
        AppCompatActivityExtKt.startFragment$default(this, $r7, C0001R.C0003id.container, false, false, false, 28, null);
    }
}
