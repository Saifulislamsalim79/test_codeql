package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivitySettingsDetailBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.postRegistrationSetUp.TodoConstantsKt;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.data.models.OtpCallBacks;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.navigators.EmailVerificationNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import ai.kudi.agent.register.p022v2.p023ui.EmailVerificationFragment;
import ai.kudi.agent.register.p022v2.p023ui.OtpFragment;
import ai.kudi.agent.settings.account.p025ui.activity.BankAccountActivity;
import ai.kudi.agent.settings.account.p025ui.fragment.AccountsFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.ActivatePosFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.InsuranceSignUpFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.PosActivationNotificationReceiverFragment;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.p029ui.viewModels.SettingsDetailsViewModel;
import ai.kudi.agent.settings.personal.p027ui.AboutKycFragment;
import ai.kudi.agent.settings.personal.p027ui.EditProfileFragment;
import ai.kudi.agent.settings.personal.p027ui.EditUserProfileFragment;
import ai.kudi.agent.settings.personal.p027ui.PersonalFragment;
import ai.kudi.agent.settings.personal.p027ui.RelationshipManagerFragment;
import ai.kudi.agent.settings.personal.p027ui.UpgradeAccountFragment;
import ai.kudi.agent.settings.personal.p027ui.UpgradeResultFragment;
import ai.kudi.agent.settings.personal.p027ui.VerifiedInformationFragment;
import ai.kudi.agent.settings.security.p028ui.ConfirmOtpFragment;
import ai.kudi.agent.settings.security.p028ui.MyDevicesFragment;
import ai.kudi.agent.settings.security.p028ui.ResetPinFragment;
import ai.kudi.agent.settings.security.p028ui.ResetSavingPinFragment;
import ai.kudi.agent.settings.security.p028ui.SecurityFragment;
import ai.kudi.agent.settings.tandc.DisplayTermsFragment;
import ai.kudi.agent.settings.tandc.TermsAndConditionFragment;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: SettingsActivity.kt */
@Metadata(m10422d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007B\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0014J\b\u0010'\u001a\u00020\u0002H\u0014J\b\u0010(\u001a\u00020%H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0014J\b\u0010+\u001a\u00020%H\u0002J\u0006\u0010,\u001a\u00020%J\b\u0010-\u001a\u00020%H\u0016J\b\u0010.\u001a\u00020%H\u0016J\u0018\u0010/\u001a\u00020%2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016J\b\u00103\u001a\u00020%H\u0016J\u0010\u00104\u001a\u00020%2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020%H\u0016J\b\u00108\u001a\u00020%H\u0016J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020%H\u0016J\b\u0010=\u001a\u00020%H\u0016J\u0012\u0010>\u001a\u00020%2\b\u0010?\u001a\u0004\u0018\u00010@H\u0014J\u0010\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u000201H\u0016J\u001c\u0010C\u001a\u00020%2\b\b\u0001\u0010D\u001a\u00020E2\b\b\u0001\u0010F\u001a\u00020EH\u0016J\u0006\u0010G\u001a\u00020%J\b\u0010H\u001a\u00020%H\u0016J\b\u0010I\u001a\u00020%H\u0016J\b\u0010J\u001a\u00020%H\u0016J\b\u0010K\u001a\u00020%H\u0016J\b\u0010L\u001a\u00020%H\u0016J\b\u0010M\u001a\u00020%H\u0016J\b\u0010N\u001a\u00020%H\u0016J\u0010\u0010O\u001a\u00020%2\u0006\u0010P\u001a\u00020QH\u0016J \u0010R\u001a\u00020%2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u0002012\u0006\u0010V\u001a\u00020WH\u0016J\b\u0010X\u001a\u00020%H\u0016J\b\u0010Y\u001a\u00020%H\u0016J\u0010\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u000201H\u0016J\b\u0010\\\u001a\u00020%H\u0016J\b\u0010]\u001a\u00020%H\u0016J\b\u0010^\u001a\u00020%H\u0016J\u0010\u0010_\u001a\u00020%2\u0006\u0010`\u001a\u000201H\u0016J\u0010\u0010a\u001a\u00020%2\b\b\u0002\u0010b\u001a\u00020QR\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006c"}, m10421d2 = {"Lai/kudi/agent/settings/ui/SettingsActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/settings/ui/viewModels/SettingsDetailsViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/ContainerViewData;", "Lai/kudi/agent/databinding/ActivitySettingsDetailBinding;", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "Lai/kudi/agent/issues/ui/IssuesTermsAndConditionsFragment$OnFragmentCallBack;", "Lai/kudi/agent/register/navigators/EmailVerificationNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivitySettingsDetailBinding;", "settingsDetailsViewModel", "getSettingsDetailsViewModel", "()Lai/kudi/agent/settings/ui/viewModels/SettingsDetailsViewModel;", "setSettingsDetailsViewModel", "(Lai/kudi/agent/settings/ui/viewModels/SettingsDetailsViewModel;)V", "settingsSubComponent", "Lai/kudi/agent/settings/di/components/SettingsSubComponent;", "getSettingsSubComponent", "()Lai/kudi/agent/settings/di/components/SettingsSubComponent;", "setSettingsSubComponent", "(Lai/kudi/agent/settings/di/components/SettingsSubComponent;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "applyViewData", "", "viewData", "createViewModel", "finishFragment", "getVMType", "Ljava/lang/Class;", "handleBackIcon", "hideLoader", "launchSavingsPinResetSuccessDialog", "navigateToAcctsFragment", "navigateToConfirmOtpFragment", "mobile", "", "pin", "navigateToHomePage", "navigateToKycUpgradeResult", "fragment", "Lai/kudi/agent/settings/personal/ui/UpgradeResultFragment;", "navigateToOpenSource", "navigateToResetSavingsPin", "navigateToVerifiedInfoScreen", "userProfile", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "onBackPressed", "onClearAppData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", AttributeType.TEXT, "setToolBarColor", "toolBarColor", "", "textColor", "showLoader", "toAboutKyc", "toAccountInformationFragment", "toActivatePos", "toAppPermissionsFragment", "toBankAccountsFragment", "toCashInsurance", "toDisplayTermsFragment", "toEditProfileFragment", "isBvnVerified", "", "toEnterOtpView", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "emailAddress", "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "toMyDevicesFragment", "toPersonalFragment", "toRelationshipManager", "managerId", "toResetPinFragment", "toSecondaryPhoneNumberFragment", "toSecurityAndSafety", "toTermsAndConditionsFragment", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "toggleAppBarLayout", "isVisible", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.SettingsActivity */
/* loaded from: classes.dex */
public final class SettingsActivity extends BaseMVVMActivity<SettingsDetailsViewModel, ContainerViewData, ActivitySettingsDetailBinding> implements SettingsNavigator, IssuesTermsAndConditionsFragment.OnFragmentCallBack, EmailVerificationNavigator {
    public SettingsDetailsViewModel settingsDetailsViewModel;
    public SettingsSubComponent settingsSubComponent;
    public SharedPreferences sharedPreferences;
    public SmartLookAnalytics smartLookAnalytics;

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleBackIcon() {
        InterfaceC8209a $r2 = getBinding();
        ActivitySettingsDetailBinding $r3 = (ActivitySettingsDetailBinding) $r2;
        Toolbar $r4 = $r3.toolbar;
        $r4.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity $r22 = SettingsActivity.this;
                SettingsActivity.m40902handleBackIcon$lambda0($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBackIcon$lambda-0  reason: not valid java name */
    public static final void m40902handleBackIcon$lambda0(SettingsActivity settingsActivity, View view) {
        Log_OC.getArray(settingsActivity, "this$0");
        settingsActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleAppBarLayout$default(SettingsActivity settingsActivity, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = true;
        }
        settingsActivity.toggleAppBarLayout($z0);
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
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData r15) {
        /*
            r14 = this;
            java.lang.String r0 = "viewData"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r0)
            androidx.fragment.app.FragmentManager r1 = r14.getSupportFragmentManager()
            r3 = 2131362589(0x7f0a031d, float:1.8344963E38)
            androidx.fragment.app.Fragment r2 = r1.m35941f0(r3)
            boolean r4 = r2 instanceof ai.kudi.agent.register.p022v2.p023ui.OtpFragment
            if (r4 == 0) goto L19
            r6 = r2
            ai.kudi.agent.register.v2.ui.OtpFragment r6 = (ai.kudi.agent.register.p022v2.p023ui.OtpFragment) r6
            r5 = r6
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r5 != 0) goto L1e
            r7 = 0
            goto L22
        L1e:
            ai.kudi.agent.register.data.models.OtpData r7 = r5.getOtpData()
        L22:
            boolean r4 = r15.isSubmittingOtp()
            if (r4 != 0) goto L33
            boolean r4 = r15.isResendingOtp()
            if (r4 == 0) goto L2f
            goto L33
        L2f:
            r14.hideLoader()
            goto L36
        L33:
            r14.showLoader()
        L36:
            boolean r4 = r15.isSecondaryDetailsSubmitted()
            if (r4 == 0) goto L47
            java.lang.String r0 = "Secondary details submitted!"
            r3 = 0
            r8 = 2
            r9 = 0
            ai.kudi.agent.core.util.ContextExtKt.toast$default(r14, r0, r3, r8, r9)
            r14.finish()
        L47:
            java.lang.Long r10 = r15.getTimeLeft()
            if (r10 != 0) goto L4e
            goto L5e
        L4e:
            long r11 = r10.longValue()
            if (r7 != 0) goto L55
            goto L58
        L55:
            r7.setExpiryInSeconds(r11)
        L58:
            if (r5 != 0) goto L5b
            goto L5e
        L5b:
            r5.initCountDownTimer()
        L5e:
            java.lang.String r13 = r15.getFeedbackMsg()
            if (r13 != 0) goto L65
            goto L6b
        L65:
            r3 = 0
            r8 = 2
            r9 = 0
            ai.kudi.agent.core.util.ContextExtKt.toast$default(r14, r13, r3, r8, r9)
        L6b:
            java.lang.String r13 = r15.getOtpRequestId()
            if (r13 != 0) goto L72
            goto L78
        L72:
            if (r7 != 0) goto L75
            goto L78
        L75:
            r7.setOtpRequestId(r13)
        L78:
            java.lang.String r13 = r15.getError()
            if (r13 != 0) goto L7f
            return
        L7f:
            r3 = 0
            r8 = 2
            r9 = 0
            ai.kudi.agent.core.util.ContextExtKt.toast$default(r14, r13, r3, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.SettingsActivity.applyViewData(ai.kudi.agent.register.ui.viewmodels.data.ContainerViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SettingsDetailsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected SettingsDetailsViewModel createViewModel() {
        SettingsDetailsViewModel $r1 = getSettingsDetailsViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void finishFragment() {
        onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivitySettingsDetailBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivitySettingsDetailBinding $r2 = ActivitySettingsDetailBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivitySettingsDetailBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SettingsDetailsViewModel getSettingsDetailsViewModel() {
        SettingsDetailsViewModel $r1 = this.settingsDetailsViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("settingsDetailsViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SettingsSubComponent getSettingsSubComponent() {
        SettingsSubComponent $r1 = this.settingsSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("settingsSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return SettingsDetailsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivitySettingsDetailBinding $r2 = (ActivitySettingsDetailBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void launchSavingsPinResetSuccessDialog() {
        SuccessScreenDialogFragment.Companion $r1 = SuccessScreenDialogFragment.Companion;
        String $r2 = getString(C0001R.string.pin_change_succces);
        Log_OC.loadImage($r2, "getString(R.string.pin_change_succces)");
        SuccessScreenCustomOption $r3 = new SuccessScreenCustomOption($r2, "", null, true, true, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_success_mark, 0, true, 3044, null);
        SettingsActivity$launchSavingsPinResetSuccessDialog$1 $r4 = new SettingsActivity$launchSavingsPinResetSuccessDialog$1(this);
        SuccessScreenDialogFragment $r5 = $r1.newInstance($r3, $r4);
        FragmentManager $r6 = getSupportFragmentManager();
        $r5.show($r6, getString(C0001R.string.reset_pin));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void navigateToAcctsFragment() {
        Intent $r1 = new Intent();
        $r1.putExtra(OpsMetricTracker.FINISH, OpsMetricTracker.FINISH);
        C13666w c13666w = C13666w.f30112a;
        setResult(-1, $r1);
        finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void navigateToConfirmOtpFragment(String str, String str2) {
        Log_OC.getArray(str, "mobile");
        Log_OC.getArray(str2, "pin");
        ConfirmOtpFragment.Companion $r4 = ConfirmOtpFragment.Companion;
        ConfirmOtpFragment $r3 = $r4.newInstance(str, str2);
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void navigateToHomePage() {
        Intent $r1 = new Intent(this, HomeActivity.class);
        $r1.setFlags(268468224);
        startActivity($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void navigateToKycUpgradeResult(UpgradeResultFragment upgradeResultFragment) {
        Log_OC.getArray(upgradeResultFragment, "fragment");
        InterfaceC8209a $r2 = getBinding();
        ActivitySettingsDetailBinding $r3 = (ActivitySettingsDetailBinding) $r2;
        View $r4 = $r3.appBarLayout;
        Log_OC.loadImage($r4, "binding.appBarLayout");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
        AppCompatActivityExtKt.startFragment$default(this, upgradeResultFragment, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void navigateToOpenSource() {
        OpenSourceFragment $r1 = new OpenSourceFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void navigateToResetSavingsPin() {
        ResetSavingPinFragment.Companion $r1 = ResetSavingPinFragment.Companion;
        ResetSavingPinFragment $r2 = $r1.newInstance();
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void navigateToVerifiedInfoScreen(UserProfile userProfile) {
        Log_OC.getArray(userProfile, "userProfile");
        VerifiedInformationFragment.Companion $r3 = VerifiedInformationFragment.Companion;
        VerifiedInformationFragment $r2 = $r3.newInstance(userProfile);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.frame, false, false, false, 28, null);
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
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void onClearAppData() {
        CustomDialog.Companion $r1 = CustomDialog.Companion;
        String $r3 = getString(C0001R.string.clear_app_data);
        Log_OC.loadImage($r3, "getString(R.string.clear_app_data)");
        String $r4 = getString(C0001R.string.clear_app_data_message);
        Log_OC.loadImage($r4, "getString(R.string.clear_app_data_message)");
        SettingsActivity$onClearAppData$1 $r2 = new SettingsActivity$onClearAppData$1(this);
        CustomDialog.Companion.show$default($r1, $r3, $r4, (String) null, (String) null, $r2, (InterfaceC11756a) null, this, 44, (Object) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r17 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r17;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        SettingsSubComponent.Factory $r5 = $r4.settingsSubComponent();
        SettingsSubComponent $r6 = $r5.create(this, this);
        setSettingsSubComponent($r6);
        SettingsSubComponent $r62 = getSettingsSubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        Intent $r7 = getIntent();
        String $r8 = $r7.getStringExtra("PARAM_SETTINGS");
        if ($r8 != null) {
            int $i0 = $r8.hashCode();
            switch ($i0) {
                case -1031948857:
                    boolean $z0 = $r8.equals(Constants.SETTINGS_PARAM_ACTIVATE_POS);
                    if ($z0) {
                        Intent $r72 = getIntent();
                        boolean $z02 = $r72.hasExtra(PosActivationNotificationReceiverFragment.EXTRA_URL);
                        if ($z02) {
                            PosActivationNotificationReceiverFragment.Companion $r13 = PosActivationNotificationReceiverFragment.Companion;
                            Intent $r73 = getIntent();
                            PosActivationNotificationReceiverFragment $r14 = $r13.newInstance($r73.getStringExtra(PosActivationNotificationReceiverFragment.EXTRA_URL));
                            AppCompatActivityExtKt.startFragment$default(this, $r14, C0001R.C0003id.frame, false, false, false, 28, null);
                            break;
                        }
                    }
                    break;
                case -516430932:
                    boolean $z03 = $r8.equals(TodoConstantsKt.CASH_INSURANCE_TODO);
                    if ($z03) {
                        toCashInsurance();
                        break;
                    }
                    break;
                case -5708519:
                    boolean $z04 = $r8.equals(Constants.SETTINGS_PARAM_UPGRADE_KYC);
                    if ($z04) {
                        UpgradeAccountFragment.Companion $r10 = UpgradeAccountFragment.Companion;
                        Intent $r74 = getIntent();
                        String $r82 = $r74.getStringExtra(Constants.PARAM_CURRENT_KYC_LEVEL);
                        String $r11 = $r82;
                        if ($r82 == null) {
                            $r11 = "";
                        }
                        UpgradeAccountFragment $r12 = $r10.newInstance($r11);
                        AppCompatActivityExtKt.startFragment$default(this, $r12, C0001R.C0003id.frame, false, false, false, 28, null);
                        break;
                    }
                    break;
                case 1067352344:
                    boolean $z05 = $r8.equals("VerifyBvnOrCompleteKyc");
                    if ($z05) {
                        PersonalFragment $r9 = new PersonalFragment();
                        AppCompatActivityExtKt.startFragment$default(this, $r9, C0001R.C0003id.frame, false, false, false, 28, null);
                        break;
                    }
                    break;
                case 1683989000:
                    boolean $z06 = $r8.equals(Constants.SETTINGS_PARAM_ABOUT_KYC);
                    if ($z06) {
                        toAboutKyc();
                        break;
                    }
                    break;
            }
            handleBackIcon();
            SmartLookAnalytics $r16 = getSmartLookAnalytics();
            $r16.logSettings();
        }
        AccountAndSettingsOptionsFragment $r15 = new AccountAndSettingsOptionsFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r15, C0001R.C0003id.frame, false, false, false, 28, null);
        handleBackIcon();
        SmartLookAnalytics $r162 = getSmartLookAnalytics();
        $r162.logSettings();
    }

    public final void setSettingsDetailsViewModel(SettingsDetailsViewModel settingsDetailsViewModel) {
        Log_OC.getArray(settingsDetailsViewModel, "<set-?>");
        this.settingsDetailsViewModel = settingsDetailsViewModel;
    }

    public final void setSettingsSubComponent(SettingsSubComponent settingsSubComponent) {
        Log_OC.getArray(settingsSubComponent, "<set-?>");
        this.settingsSubComponent = settingsSubComponent;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment.OnFragmentCallBack
    public void setTitle(String str) {
        Log_OC.getArray(str, AttributeType.TEXT);
        InterfaceC8209a $r2 = getBinding();
        ActivitySettingsDetailBinding $r3 = (ActivitySettingsDetailBinding) $r2;
        Toolbar $r4 = $r3.toolbar;
        $r4.setTitle(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment.OnFragmentCallBack
    public void setToolBarColor(int i, int i2) {
        InterfaceC8209a $r1 = getBinding();
        ActivitySettingsDetailBinding $r2 = (ActivitySettingsDetailBinding) $r1;
        ViewGroup $r3 = $r2.toolbar;
        int $i0 = ContextExtKt.getKudiColor(this, i);
        ViewGroup r5 = $r3;
        r5.setBackgroundColor($i0);
        InterfaceC8209a $r12 = getBinding();
        ActivitySettingsDetailBinding $r22 = (ActivitySettingsDetailBinding) $r12;
        Toolbar $r32 = $r22.toolbar;
        int $i02 = ContextExtKt.getKudiColor(this, i2);
        $r32.setTitleTextColor($i02);
        Drawable $r4 = ContextExtKt.getKudiDrawable(this, C0001R.C0002drawable.ic_arrow_backward);
        if ($r4 != null) {
            ContextExtKt.setKudiColorFilter($r4, this, i2);
        }
        InterfaceC8209a $r13 = getBinding();
        ActivitySettingsDetailBinding $r23 = (ActivitySettingsDetailBinding) $r13;
        Toolbar $r33 = $r23.toolbar;
        $r33.setNavigationIcon($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivitySettingsDetailBinding $r2 = (ActivitySettingsDetailBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.show(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toAboutKyc() {
        String $r2 = getString(C0001R.string.about_kyc);
        Log_OC.loadImage($r2, "getString(R.string.about_kyc)");
        setTitle($r2);
        AboutKycFragment $r1 = new AboutKycFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toAccountInformationFragment() {
        Fragment r2 = new AccountsFragment();
        Fragment r3 = r2;
        AppCompatActivityExtKt.startFragment$default(this, r3, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toActivatePos() {
        ActivatePosFragment $r1 = new ActivatePosFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toAppPermissionsFragment() {
        AppPermissionsFragment $r1 = new AppPermissionsFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toBankAccountsFragment() {
        Intent $r1 = new Intent(this, BankAccountActivity.class);
        startActivity($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toCashInsurance() {
        InsuranceSignUpFragment $r1 = new InsuranceSignUpFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toDisplayTermsFragment() {
        DisplayTermsFragment $r1 = new DisplayTermsFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toEditProfileFragment(boolean z) {
        SharedPreferences $r1 = getSharedPreferences();
        String $r2 = $r1.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "USER");
        boolean $z0 = Log_OC.append($r2, "USER");
        if ($z0) {
            EditUserProfileFragment.Companion $r3 = EditUserProfileFragment.Companion;
            Intent $r4 = getIntent();
            boolean $z02 = $r4.getBooleanExtra(Constants.IS_BVN_VERIFIED, false);
            EditUserProfileFragment $r5 = $r3.newInstance($z02);
            AppCompatActivityExtKt.startFragment$default(this, $r5, C0001R.C0003id.frame, false, false, false, 28, null);
            return;
        }
        SharedPreferences $r12 = getSharedPreferences();
        String $r22 = $r12.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "USER");
        boolean $z03 = Log_OC.append($r22, "AGENT");
        if (!$z03) {
            SharedPreferences $r13 = getSharedPreferences();
            String $r23 = $r13.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "USER");
            boolean $z04 = Log_OC.append($r23, HomeActivity.MERCHANT);
            if (!$z04) {
                return;
            }
        }
        EditProfileFragment.Companion $r6 = EditProfileFragment.Companion;
        Intent $r42 = getIntent();
        boolean $z05 = $r42.getBooleanExtra(Constants.IS_BVN_VERIFIED, false);
        EditProfileFragment $r7 = $r6.newInstance($z05);
        AppCompatActivityExtKt.startFragment$default(this, $r7, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.EmailVerificationNavigator
    public void toEnterOtpView(OtpFragmentData otpFragmentData, final String str, CompleteRegistrationData completeRegistrationData) {
        Log_OC.getArray(otpFragmentData, "otpFragmentData");
        Log_OC.getArray(str, "emailAddress");
        Log_OC.getArray(completeRegistrationData, "completeRegistrationData");
        OtpFragment.Companion $r5 = OtpFragment.Companion;
        OtpFragment $r3 = $r5.newInstance(otpFragmentData, new OtpCallBacks() { // from class: ai.kudi.agent.settings.ui.SettingsActivity$toEnterOtpView$otpFragment$1
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
                SettingsActivity $r32 = SettingsActivity.this;
                String $r1 = str;
                SettingsDetailsViewModel $r4 = $r32.getSettingsDetailsViewModel();
                String $r52 = otpData.getPhoneNumber();
                String $r6 = otpData.getOtp();
                $r4.verifyOtpSecondaryVerification($r1, $r52, $r6);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onResendOtpClicked(OtpData otpData) {
                if (otpData == null) {
                    return;
                }
                SettingsActivity $r2 = SettingsActivity.this;
                SettingsDetailsViewModel $r32 = $r2.getSettingsDetailsViewModel();
                String $r4 = otpData.getPhoneNumber();
                $r32.sendOtpEmailVerification($r4);
            }
        });
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toMyDevicesFragment() {
        MyDevicesFragment $r1 = new MyDevicesFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toPersonalFragment() {
        PersonalFragment $r1 = new PersonalFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toRelationshipManager(String str) {
        Log_OC.getArray(str, "managerId");
        RelationshipManagerFragment.Companion $r3 = RelationshipManagerFragment.Companion;
        RelationshipManagerFragment $r2 = $r3.newInstance(str);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toResetPinFragment() {
        ResetPinFragment $r1 = new ResetPinFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toSecondaryPhoneNumberFragment() {
        EmailVerificationFragment.Companion $r1 = EmailVerificationFragment.Companion;
        CompleteRegistrationData $r2 = new CompleteRegistrationData(null, null, null, null, null, false, false, null, false, null, 767, null);
        EmailVerificationFragment $r3 = $r1.newInstance($r2);
        AppCompatActivityExtKt.startFragment$default(this, $r3, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toSecurityAndSafety() {
        SecurityFragment $r1 = new SecurityFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.navigators.SettingsNavigator
    public void toTermsAndConditionsFragment(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        TermsAndConditionFragment.Companion $r3 = TermsAndConditionFragment.Companion;
        TermsAndConditionFragment $r2 = $r3.newInstance(str);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleAppBarLayout(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ActivitySettingsDetailBinding $r2 = (ActivitySettingsDetailBinding) $r1;
            View $r3 = $r2.appBarLayout;
            Log_OC.loadImage($r3, "binding.appBarLayout");
            View r4 = $r3;
            ViewExtKt.show(r4);
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivitySettingsDetailBinding $r22 = (ActivitySettingsDetailBinding) $r12;
        View $r32 = $r22.appBarLayout;
        Log_OC.loadImage($r32, "binding.appBarLayout");
        View r42 = $r32;
        ViewExtKt.hide$default(r42, false, 1, null);
    }
}
