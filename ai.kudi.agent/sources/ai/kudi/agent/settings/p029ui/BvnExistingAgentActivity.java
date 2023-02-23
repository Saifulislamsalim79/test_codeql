package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ActivityBvnExistingAgentBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.domain.wiki.ResetPinResponse;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.BusinessInfoFragment;
import ai.kudi.agent.register.p021ui.PersonalInfoFragment;
import ai.kudi.agent.register.p021ui.viewmodels.ContainerViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import ai.kudi.agent.register.p022v2.p023ui.BvnNinFragment;
import ai.kudi.agent.register.p022v2.p023ui.CallUsFragment;
import ai.kudi.agent.register.p022v2.p023ui.DuplicateIdentityNumberFragment;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.register.p022v2.p023ui.SomethingIsNotRightFragment;
import ai.kudi.agent.register.verifybvn.VerifyBvnPictureFragment;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BvnExistingAgentActivity.kt */
@Metadata(m10422d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0014J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0002H\u0014J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0014J\b\u0010)\u001a\u00020\u001eH\u0002J\u0006\u0010*\u001a\u00020\u001eJ$\u0010+\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010,\u001a\u0004\u0018\u00010&2\u0006\u0010-\u001a\u00020&H\u0016J@\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020&H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020=H\u0016J\u001c\u0010>\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010,\u001a\u0004\u0018\u00010&H\u0016JH\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020&2\u0006\u0010/\u001a\u0002002\u0006\u0010A\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00162\u0006\u00106\u001a\u00020&H\u0016J\b\u0010B\u001a\u00020\u001eH\u0016J\u0012\u0010C\u001a\u00020\u001e2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\b\u0010F\u001a\u00020\u001eH\u0016J\b\u0010G\u001a\u00020\u001eH\u0002J\b\u0010H\u001a\u00020\u001eH\u0002J\u0006\u0010I\u001a\u00020\u001eJ\u0012\u0010J\u001a\u00020\u001e2\b\u0010K\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010L\u001a\u00020\u001e2\b\u0010K\u001a\u0004\u0018\u00010=H\u0016J\b\u0010M\u001a\u00020\u001eH\u0016J\u0010\u0010N\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010N\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020=H\u0016J\b\u0010R\u001a\u00020\u001eH\u0016J\u0018\u0010S\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020U2\u0006\u0010,\u001a\u00020&H\u0016J\u0010\u0010V\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010W\u001a\u00020\u001e2\b\u0010K\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010X\u001a\u00020\u001e2\b\u0010K\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010Y\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010Z\u001a\u00020\u001eH\u0016J\u0010\u0010[\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010\\\u001a\u00020\u001e2\b\u0010K\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010]\u001a\u00020\u001e2\b\u0010K\u001a\u0004\u0018\u00010=H\u0016J\u0018\u0010^\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006_"}, m10421d2 = {"Lai/kudi/agent/settings/ui/BvnExistingAgentActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/register/ui/viewmodels/ContainerViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/ContainerViewData;", "Lai/kudi/agent/databinding/ActivityBvnExistingAgentBinding;", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityBvnExistingAgentBinding;", "bvnVerificationSubComponent", "Lai/kudi/agent/settings/di/components/BvnVerificationSubcomponent;", "getBvnVerificationSubComponent", "()Lai/kudi/agent/settings/di/components/BvnVerificationSubcomponent;", "setBvnVerificationSubComponent", "(Lai/kudi/agent/settings/di/components/BvnVerificationSubcomponent;)V", "containerViewModel", "getContainerViewModel", "()Lai/kudi/agent/register/ui/viewmodels/ContainerViewModel;", "setContainerViewModel", "(Lai/kudi/agent/register/ui/viewmodels/ContainerViewModel;)V", "isOnCallSupportOrSomethingIsWrong", "", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "applyViewData", "", "viewData", "backToBusinessInfoFragment", "createViewModel", "finishFragmentBvn", "getPhoneAndBvnFragment", "Landroidx/fragment/app/Fragment;", "phoneNumber", "", "getVMType", "Ljava/lang/Class;", "handleNavClickListener", "hideLoader", "navigateToBvnNinView", PhoneFragment.ARG_BVN, "regId", "navigateToDashboard", "walletBalance", "", "isNewUser", "isKCashEnabled", "isC2C", "isOutlet", "isHq", "customerType", "navigateToEnableFingerPrint", "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "navigateToFundWallet", "navigateToPendingKycVerification", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "navigateToPhoneView", "navigateToWelcomePage", "firstName", "sNewUser", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setInitialFragment", "setUpIcon", "showLoader", "toAccountTypeSelectionView", TransactionBreakDownItemType.DATA, "toBusinessInformationView", "toCallSupportView", "toCreatePinView", "resetPinResponse", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;", "personalInfo", "toDuplicateIdentityNumberFragment", "toEnterOtpView", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "toLoginView", "toMerchantTandC", "toPersonalInformationView", "toProfilePictureUploadView", "toProfilePictureView", "toResetPinView", "toSelectBusinessTypeDescriptionView", "toSelectBusinessTypeView", "toSomethingIsWrongView", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.BvnExistingAgentActivity */
/* loaded from: classes.dex */
public final class BvnExistingAgentActivity extends BaseMVVMActivity<ContainerViewModel, ContainerViewData, ActivityBvnExistingAgentBinding> implements RegisterNavigator {
    public BvnVerificationSubcomponent bvnVerificationSubComponent;
    public ContainerViewModel containerViewModel;
    private boolean isOnCallSupportOrSomethingIsWrong;
    public SharedPreferences sharedPref;

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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleNavClickListener() {
        InterfaceC8209a $r2 = getBinding();
        ActivityBvnExistingAgentBinding $r3 = (ActivityBvnExistingAgentBinding) $r2;
        Toolbar $r4 = $r3.toolbar;
        $r4.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BvnExistingAgentActivity $r22 = BvnExistingAgentActivity.this;
                BvnExistingAgentActivity.m40901handleNavClickListener$lambda2($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNavClickListener$lambda-2  reason: not valid java name */
    public static final void m40901handleNavClickListener$lambda2(BvnExistingAgentActivity bvnExistingAgentActivity, View view) {
        Log_OC.getArray(bvnExistingAgentActivity, "this$0");
        bvnExistingAgentActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setInitialFragment() {
        Intent $r1 = getIntent();
        boolean $z0 = $r1.hasExtra("isFrom");
        if ($z0) {
            Intent $r12 = getIntent();
            boolean $z02 = $r12.hasExtra(LoginParams.DASHBOARD_DATA);
            if ($z02) {
                Intent $r13 = getIntent();
                String $r2 = $r13.getStringExtra("isFrom");
                String $r4 = AccountVerificationHolderActivity.class.getCanonicalName();
                boolean $z03 = Log_OC.append($r2, $r4);
                if ($z03) {
                    BusinessInfoFragment.Companion $r5 = BusinessInfoFragment.Companion;
                    PersonalInfo $r6 = new PersonalInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, -1, 127, null);
                    RegistrationInfo $r7 = new RegistrationInfo("", $r6, null, false, null, 28, null);
                    String $r22 = AccountVerificationHolderActivity.class.getCanonicalName();
                    String $r42 = $r22;
                    if ($r22 == null) {
                        $r42 = "";
                    }
                    Intent $r14 = getIntent();
                    Parcelable $r8 = $r14.getParcelableExtra(LoginParams.DASHBOARD_DATA);
                    DashboardData $r9 = (DashboardData) $r8;
                    BusinessInfoFragment $r10 = $r5.newInstance($r7, $r42, $r9);
                    AppCompatActivityExtKt.startFragment$default(this, $r10, C0001R.C0003id.container, false, false, false, 28, null);
                    InterfaceC8209a $r122 = getBinding();
                    ActivityBvnExistingAgentBinding $r132 = (ActivityBvnExistingAgentBinding) $r122;
                    Toolbar $r142 = $r132.toolbar;
                    setSupportActionBar($r142);
                }
            }
        }
        Intent $r15 = getIntent();
        String $r23 = $r15.getStringExtra("phoneNo");
        Fragment $r11 = getPhoneAndBvnFragment($r23);
        AppCompatActivityExtKt.startFragment$default(this, $r11, C0001R.C0003id.container, false, false, false, 12, null);
        InterfaceC8209a $r1222 = getBinding();
        ActivityBvnExistingAgentBinding $r1322 = (ActivityBvnExistingAgentBinding) $r1222;
        Toolbar $r1422 = $r1322.toolbar;
        setSupportActionBar($r1422);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpIcon() {
        InterfaceC8209a $r1 = getBinding();
        ActivityBvnExistingAgentBinding $r2 = (ActivityBvnExistingAgentBinding) $r1;
        Toolbar $r3 = $r2.toolbar;
        Drawable $r4 = $r3.getNavigationIcon();
        Log_OC.append($r4);
        Drawable $r42 = $r4.mutate();
        int $i0 = C1335a.m36324d(this, C0001R.color.white);
        C1365a.m36188n($r42, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ContainerViewData $r2 = (ContainerViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(ContainerViewData containerViewData) {
        Log_OC.getArray(containerViewData, "viewData");
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void backToBusinessInfoFragment() {
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
        ContainerViewModel $r1 = getContainerViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void finishFragmentBvn() {
        SharedPreferences $r1 = getSharedPref();
        boolean $z0 = $r1.getBoolean(LoginParams.SHOULD_FORCE_KYC_UPGRADE, false);
        if (!$z0) {
            Intent $r3 = new Intent();
            $r3.putExtra(OpsMetricTracker.FINISH, OpsMetricTracker.FINISH);
            C13666w $r4 = C13666w.f30112a;
            setResult(0, $r3);
            finish();
            return;
        }
        SharedPreferences $r12 = getSharedPref();
        SharedPreferences.Editor $r2 = $r12.edit();
        $r2.putBoolean(LoginParams.SHOULD_FORCE_KYC_UPGRADE, false).apply();
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        Intent $r32 = new Intent(this, HomeActivity.class);
        $r32.setFlags(268468224);
        C13666w c13666w = C13666w.f30112a;
        startActivity($r32);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityBvnExistingAgentBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityBvnExistingAgentBinding $r2 = ActivityBvnExistingAgentBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityBvnExistingAgentBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BvnVerificationSubcomponent getBvnVerificationSubComponent() {
        BvnVerificationSubcomponent $r1 = this.bvnVerificationSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("bvnVerificationSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ContainerViewModel getContainerViewModel() {
        ContainerViewModel $r1 = this.containerViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("containerViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPref() {
        SharedPreferences $r1 = this.sharedPref;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPref");
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
    public final void hideLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivityBvnExistingAgentBinding $r2 = (ActivityBvnExistingAgentBinding) $r1;
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
        this.isOnCallSupportOrSomethingIsWrong = false;
        BvnNinFragment.Companion $r5 = BvnNinFragment.Companion;
        BvnNinFragment $r4 = $r5.newInstance(str, str2, str3);
        AppCompatActivityExtKt.startFragment$default(this, $r4, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToDashboard(double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        Log_OC.getArray(str, "customerType");
        LoginParams $r2 = LoginParams.INSTANCE;
        LoginParams.buildLoginIntent$default($r2, this, z, z2, z3, z5, z4, str, false, 128, null);
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToEnableFingerPrint(CompleteRegistrationData completeRegistrationData) {
        Log_OC.getArray(completeRegistrationData, "completeRegistrationData");
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToFundWallet() {
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToPendingKycVerification(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "registrationInfo");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToPhoneView(String str, String str2) {
        this.isOnCallSupportOrSomethingIsWrong = false;
        PhoneFragment.Companion $r4 = PhoneFragment.Companion;
        PhoneFragment $r3 = $r4.newInstance(str, str2);
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.container, false, false, false, 28, null);
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void navigateToWelcomePage(String str, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2) {
        Log_OC.getArray(str, "firstName");
        Log_OC.getArray(str2, "customerType");
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
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r7;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        BvnVerificationSubcomponent.Factory $r5 = $r4.bvnVerificationSubComponent();
        BvnVerificationSubcomponent $r6 = $r5.create(this);
        setBvnVerificationSubComponent($r6);
        BvnVerificationSubcomponent $r62 = getBvnVerificationSubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        disableLogoutTimer();
        if (bundle == null) {
            setInitialFragment();
        }
        handleNavClickListener();
        setUpIcon();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onResume() {
        super.onResume();
        boolean $z0 = this.isOnCallSupportOrSomethingIsWrong;
        if ($z0) {
            InterfaceC8209a $r1 = getBinding();
            ActivityBvnExistingAgentBinding $r2 = (ActivityBvnExistingAgentBinding) $r1;
            View $r3 = $r2.toolbar;
            Log_OC.loadImage($r3, "binding.toolbar");
            View r4 = $r3;
            ViewExtKt.hide$default(r4, false, 1, null);
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityBvnExistingAgentBinding $r22 = (ActivityBvnExistingAgentBinding) $r12;
        View $r32 = $r22.toolbar;
        Log_OC.loadImage($r32, "binding.toolbar");
        View r42 = $r32;
        ViewExtKt.show(r42);
    }

    public final void setBvnVerificationSubComponent(BvnVerificationSubcomponent bvnVerificationSubcomponent) {
        Log_OC.getArray(bvnVerificationSubcomponent, "<set-?>");
        this.bvnVerificationSubComponent = bvnVerificationSubcomponent;
    }

    public final void setContainerViewModel(ContainerViewModel containerViewModel) {
        Log_OC.getArray(containerViewModel, "<set-?>");
        this.containerViewModel = containerViewModel;
    }

    public final void setSharedPref(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPref = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivityBvnExistingAgentBinding $r2 = (ActivityBvnExistingAgentBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.show(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toAccountTypeSelectionView(RegistrationInfo registrationInfo) {
        PersonalInfoFragment.Companion $r2 = PersonalInfoFragment.Companion;
        PersonalInfoFragment $r3 = PersonalInfoFragment.Companion.newInstance$default($r2, registrationInfo, null, null, 6, null);
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toBusinessInformationView(RegistrationInfo registrationInfo) {
        BusinessInfoFragment.Companion $r2 = BusinessInfoFragment.Companion;
        BusinessInfoFragment $r3 = BusinessInfoFragment.Companion.newInstance$default($r2, registrationInfo, null, null, 6, null);
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toCallSupportView() {
        this.isOnCallSupportOrSomethingIsWrong = true;
        InterfaceC8209a $r2 = getBinding();
        ActivityBvnExistingAgentBinding $r3 = (ActivityBvnExistingAgentBinding) $r2;
        View $r4 = $r3.toolbar;
        Log_OC.loadImage($r4, "binding.toolbar");
        View r7 = $r4;
        ViewExtKt.hide$default(r7, false, 1, null);
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        CallUsFragment r6 = new CallUsFragment();
        AppCompatActivityExtKt.startFragment$default(this, r6, C0001R.C0003id.container, false, false, false, 28, null);
        ContainerViewModel $r5 = getContainerViewModel();
        $r5.onCallSupportClicked();
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toCreatePinView(ResetPinResponse resetPinResponse) {
        Log_OC.getArray(resetPinResponse, "resetPinResponse");
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toCreatePinView(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "personalInfo");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toDuplicateIdentityNumberFragment() {
        DuplicateIdentityNumberFragment $r1 = new DuplicateIdentityNumberFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.container, false, false, false, 28, null);
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toEnterOtpView(OtpFragmentData otpFragmentData, String str) {
        Log_OC.getArray(otpFragmentData, "otpFragmentData");
        Log_OC.getArray(str, PhoneFragment.ARG_BVN);
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toLoginView(String str) {
        Log_OC.getArray(str, "phoneNumber");
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toMerchantTandC(RegistrationInfo registrationInfo) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toPersonalInformationView(RegistrationInfo registrationInfo) {
        PersonalInfoFragment.Companion $r2 = PersonalInfoFragment.Companion;
        PersonalInfoFragment $r3 = PersonalInfoFragment.Companion.newInstance$default($r2, registrationInfo, null, null, 6, null);
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toProfilePictureUploadView(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "registrationInfo");
        VerifyBvnPictureFragment.Companion $r3 = VerifyBvnPictureFragment.Companion;
        VerifyBvnPictureFragment $r2 = $r3.newInstance(registrationInfo);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.container, false, false, false, 28, null);
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toProfilePictureView() {
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toResetPinView(String str) {
        Log_OC.getArray(str, "phoneNumber");
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toSelectBusinessTypeDescriptionView(RegistrationInfo registrationInfo) {
    }

    @Override // ai.kudi.agent.register.navigators.RegisterNavigator
    public void toSelectBusinessTypeView(RegistrationInfo registrationInfo) {
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
        ActivityBvnExistingAgentBinding $r4 = (ActivityBvnExistingAgentBinding) $r3;
        View $r5 = $r4.toolbar;
        Log_OC.loadImage($r5, "binding.toolbar");
        View r8 = $r5;
        ViewExtKt.hide$default(r8, false, 1, null);
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        SomethingIsNotRightFragment.Companion $r6 = SomethingIsNotRightFragment.Companion;
        SomethingIsNotRightFragment $r7 = $r6.newInstance(str, str2);
        AppCompatActivityExtKt.startFragment$default(this, $r7, C0001R.C0003id.container, false, false, false, 28, null);
    }
}
