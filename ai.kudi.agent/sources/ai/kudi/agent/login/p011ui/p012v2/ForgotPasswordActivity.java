package ai.kudi.agent.login.p011ui.p012v2;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityForgotPasswordV2Binding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.login.game.components.ForgotPasswordSubComponent;
import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import ai.kudi.agent.login.p011ui.p012v2.ResetPinFragment;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.ForgotPasswordViewModel;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.data.ForgotPasswordViewData;
import ai.kudi.agent.register.data.models.OtpCallBacks;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.p022v2.p023ui.OtpFragment;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.snackbar.Snackbar;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ForgotPasswordActivity.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0014J\b\u0010\u001f\u001a\u00020\u0002H\u0014J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0014J\u0006\u0010\"\u001a\u00020\u001dJ\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\u0012\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0012\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0006\u0010,\u001a\u00020\u001dJ\u0016\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u000201H\u0016J\u0010\u00107\u001a\u00020\u001d2\u0006\u00106\u001a\u000201H\u0016R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00068"}, m10421d2 = {"Lai/kudi/agent/login/ui/v2/ForgotPasswordActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/login/ui/v2/viewModels/ForgotPasswordViewModel;", "Lai/kudi/agent/login/ui/v2/viewModels/data/ForgotPasswordViewData;", "Lai/kudi/agent/databinding/ActivityForgotPasswordV2Binding;", "Lai/kudi/agent/login/navigators/ForgotPasswordNavigator;", "Lai/kudi/agent/register/data/models/OtpCallBacks;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityForgotPasswordV2Binding;", "enterPhoneFragment", "Landroidx/fragment/app/Fragment;", "getEnterPhoneFragment", "()Landroidx/fragment/app/Fragment;", "enterPhoneFragment$delegate", "Lkotlin/Lazy;", "forgotPasswordSubComponent", "Lai/kudi/agent/login/di/components/ForgotPasswordSubComponent;", "getForgotPasswordSubComponent", "()Lai/kudi/agent/login/di/components/ForgotPasswordSubComponent;", "setForgotPasswordSubComponent", "(Lai/kudi/agent/login/di/components/ForgotPasswordSubComponent;)V", "forgotPasswordViewModel", "getForgotPasswordViewModel", "()Lai/kudi/agent/login/ui/v2/viewModels/ForgotPasswordViewModel;", "setForgotPasswordViewModel", "(Lai/kudi/agent/login/ui/v2/viewModels/ForgotPasswordViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "hideLoader", "onBackPressed", "onBottomViewActionClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOtpEntered", "otpData", "Lai/kudi/agent/register/data/models/OtpData;", "onResendOtpClicked", "showLoader", "showSnackBar", "view", "Landroid/view/View;", MetricTracker.Object.MESSAGE, "", "toEnterOtpView", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "toLoginView", "phoneNumber", "toResetPinFragment", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.v2.ForgotPasswordActivity */
/* loaded from: classes.dex */
public final class ForgotPasswordActivity extends BaseMVVMActivity<ForgotPasswordViewModel, ForgotPasswordViewData, ActivityForgotPasswordV2Binding> implements ForgotPasswordNavigator, OtpCallBacks {
    private final InterfaceC11824h enterPhoneFragment$delegate;
    public ForgotPasswordSubComponent forgotPasswordSubComponent;
    public ForgotPasswordViewModel forgotPasswordViewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ForgotPasswordActivity() {
        InterfaceC11824h $r1;
        ForgotPasswordActivity$enterPhoneFragment$2 $r2 = new ForgotPasswordActivity$enterPhoneFragment$2(this);
        $r1 = C13218k.m5625b($r2);
        this.enterPhoneFragment$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Fragment getEnterPhoneFragment() {
        InterfaceC11824h $r2 = this.enterPhoneFragment$delegate;
        Object $r1 = $r2.getValue();
        Fragment $r3 = (Fragment) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39802onCreate$lambda0(ForgotPasswordActivity forgotPasswordActivity, View view) {
        Log_OC.getArray(forgotPasswordActivity, "this$0");
        forgotPasswordActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ForgotPasswordViewData $r2 = (ForgotPasswordViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.login.p011ui.p012v2.viewModels.data.ForgotPasswordViewData r17) {
        /*
            r16 = this;
            java.lang.String r1 = "viewData"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r16
            androidx.fragment.app.FragmentManager r2 = r0.getSupportFragmentManager()
            r4 = 2131362281(0x7f0a01e9, float:1.8344338E38)
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
            if (r6 != 0) goto L29
            goto L32
        L29:
            r0 = r17
            boolean r5 = r0.isVerifyingOtp()
            r6.setAuthInProgress(r5)
        L32:
            r0 = r17
            boolean r5 = r0.isVerifyingOtp()
            if (r5 != 0) goto L49
            r0 = r17
            boolean r5 = r0.isResendingOtp()
            if (r5 == 0) goto L43
            goto L49
        L43:
            r0 = r16
            r0.hideLoader()
            goto L4e
        L49:
            r0 = r16
            r0.showLoader()
        L4e:
            r0 = r17
            java.lang.Long r9 = r0.getTimeLeft()
            if (r9 != 0) goto L57
            goto L67
        L57:
            long r10 = r9.longValue()
            if (r8 != 0) goto L5e
            goto L61
        L5e:
            r8.setExpiryInSeconds(r10)
        L61:
            if (r6 != 0) goto L64
            goto L67
        L64:
            r6.initCountDownTimer()
        L67:
            r0 = r17
            java.lang.String r12 = r0.getOtpRequestId()
            if (r12 != 0) goto L70
            goto L76
        L70:
            if (r8 != 0) goto L73
            goto L76
        L73:
            r8.setOtpRequestId(r12)
        L76:
            r0 = r17
            java.lang.String r12 = r0.getFeedbackMsg()
            r5 = 0
            if (r12 != 0) goto L80
            goto L88
        L80:
            r4 = 0
            r13 = 2
            r14 = 0
            r0 = r16
            ai.kudi.agent.core.util.ContextExtKt.toast$default(r0, r12, r4, r13, r14)
        L88:
            r0 = r17
            java.lang.String r12 = r0.getError()
            if (r12 != 0) goto L91
            return
        L91:
            if (r6 != 0) goto L94
            goto L9c
        L94:
            boolean r15 = r6.isAdded()
            r4 = 1
            if (r15 != r4) goto L9c
            r5 = 1
        L9c:
            if (r5 == 0) goto La8
            r0 = r17
            boolean r5 = r0.isAuthError()
            r4 = 1
            r6.handleError(r4, r12, r5)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.login.p011ui.p012v2.ForgotPasswordActivity.applyViewData(ai.kudi.agent.login.ui.v2.viewModels.data.ForgotPasswordViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ForgotPasswordViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ForgotPasswordViewModel createViewModel() {
        ForgotPasswordViewModel $r1 = getForgotPasswordViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityForgotPasswordV2Binding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityForgotPasswordV2Binding $r2 = ActivityForgotPasswordV2Binding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityForgotPasswordV2Binding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ForgotPasswordSubComponent getForgotPasswordSubComponent() {
        ForgotPasswordSubComponent $r1 = this.forgotPasswordSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("forgotPasswordSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ForgotPasswordViewModel getForgotPasswordViewModel() {
        ForgotPasswordViewModel $r1 = this.forgotPasswordViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("forgotPasswordViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return ForgotPasswordViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivityForgotPasswordV2Binding $r2 = (ActivityForgotPasswordV2Binding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
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

    @Override // ai.kudi.agent.register.data.models.OtpCallBacks
    public void onBottomViewActionClicked() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r12 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r12;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        ForgotPasswordSubComponent.Factory $r5 = $r4.forgotPasswordV2SubComponemt();
        ForgotPasswordSubComponent $r6 = $r5.create(this);
        setForgotPasswordSubComponent($r6);
        ForgotPasswordSubComponent $r62 = getForgotPasswordSubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        disableLogoutTimer();
        if (bundle == null) {
            Fragment $r7 = getEnterPhoneFragment();
            AppCompatActivityExtKt.startFragment$default(this, $r7, C0001R.C0003id.containerFrameLayout, false, false, false, 12, null);
        }
        InterfaceC8209a $r8 = getBinding();
        ActivityForgotPasswordV2Binding $r9 = (ActivityForgotPasswordV2Binding) $r8;
        Toolbar $r10 = $r9.toolbar;
        $r10.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.v2.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotPasswordActivity $r22 = ForgotPasswordActivity.this;
                ForgotPasswordActivity.m39802onCreate$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.data.models.OtpCallBacks
    public void onOtpEntered(OtpData otpData) {
        if (otpData == null) {
            return;
        }
        ForgotPasswordViewModel $r2 = getForgotPasswordViewModel();
        String $r3 = otpData.getOtpRequestId();
        String $r4 = otpData.getOtp();
        String $r5 = otpData.getPhoneNumber();
        $r2.verifyOtpForgotPassword($r3, $r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.data.models.OtpCallBacks
    public void onResendOtpClicked(OtpData otpData) {
        String $r4;
        ForgotPasswordViewModel $r2 = getForgotPasswordViewModel();
        String $r3 = "";
        if (otpData != null && ($r4 = otpData.getPhoneNumber()) != null) {
            $r3 = $r4;
        }
        $r2.requestOtpForgotPin($r3);
    }

    public final void setForgotPasswordSubComponent(ForgotPasswordSubComponent forgotPasswordSubComponent) {
        Log_OC.getArray(forgotPasswordSubComponent, "<set-?>");
        this.forgotPasswordSubComponent = forgotPasswordSubComponent;
    }

    public final void setForgotPasswordViewModel(ForgotPasswordViewModel forgotPasswordViewModel) {
        Log_OC.getArray(forgotPasswordViewModel, "<set-?>");
        this.forgotPasswordViewModel = forgotPasswordViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivityForgotPasswordV2Binding $r2 = (ActivityForgotPasswordV2Binding) $r1;
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
    @Override // ai.kudi.agent.login.navigators.ForgotPasswordNavigator
    public void toEnterOtpView(OtpFragmentData otpFragmentData) {
        Log_OC.getArray(otpFragmentData, "otpFragmentData");
        OtpFragment.Companion $r3 = OtpFragment.Companion;
        OtpFragment $r2 = $r3.newInstance(otpFragmentData, this);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.containerFrameLayout, false, false, false, 28, null);
    }

    @Override // ai.kudi.agent.login.navigators.ForgotPasswordNavigator
    public void toLoginView(String str) {
        Log_OC.getArray(str, "phoneNumber");
        finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.navigators.ForgotPasswordNavigator
    public void toResetPinFragment(String str) {
        Log_OC.getArray(str, "phoneNumber");
        ResetPinFragment.Companion $r3 = ResetPinFragment.Companion;
        ResetPinFragment $r2 = $r3.newInstance(str);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.containerFrameLayout, false, false, false, 28, null);
    }
}
