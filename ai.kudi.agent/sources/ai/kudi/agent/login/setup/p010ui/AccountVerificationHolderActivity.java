package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityAccountVerificationHolderBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.faceverification.FaceVerificationFragment;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent;
import ai.kudi.agent.login.navigators.PhoneVerificationNavigator;
import ai.kudi.agent.login.p011ui.LoginActivity;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.login.setup.p010ui.EnforceBvnVerificationFragment;
import ai.kudi.agent.login.setup.p010ui.NewDeviceVerificationOptionFragment;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceFaceVerificationFragment;
import ai.kudi.agent.login.setup.presenters.AccountVerificationPresenter;
import ai.kudi.agent.login.setup.viewModels.data.EnforceBvnVerificationData;
import ai.kudi.agent.login.setup.views.AccountVerificationView;
import ai.kudi.agent.register.data.models.OtpCallBacks;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import ai.kudi.agent.register.p022v2.p023ui.OtpFragment;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: AccountVerificationHolderActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 G2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00022\u00020\u0005:\u0001GB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010+\u001a\u00020%H\u0016J\b\u0010,\u001a\u00020%H\u0016J\u0012\u0010-\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J-\u00100\u001a\u00020%2\u0006\u00101\u001a\u0002022\u000e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0011042\u0006\u00105\u001a\u000206H\u0016¢\u0006\u0002\u00107J\u0010\u00108\u001a\u0002092\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J\u0010\u0010:\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020\u0011H\u0016J\b\u0010=\u001a\u00020%H\u0016J\u0018\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020@2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020\u0011H\u0016J\u0010\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020EH\u0016J\u0018\u0010F\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/AccountVerificationHolderActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/login/setup/views/AccountVerificationView;", "Lai/kudi/agent/login/setup/presenters/AccountVerificationPresenter;", "Lai/kudi/agent/databinding/ActivityAccountVerificationHolderBinding;", "Lai/kudi/agent/login/navigators/PhoneVerificationNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityAccountVerificationHolderBinding;", "deviceVerificationSubComponent", "Lai/kudi/agent/login/di/components/DeviceVerificationSubcomponent;", "getDeviceVerificationSubComponent", "()Lai/kudi/agent/login/di/components/DeviceVerificationSubcomponent;", "setDeviceVerificationSubComponent", "(Lai/kudi/agent/login/di/components/DeviceVerificationSubcomponent;)V", "loginPhoneNumber", "", "model", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "otpData", "Lai/kudi/agent/register/data/models/OtpData;", "otpFragment", "Lai/kudi/agent/register/v2/ui/OtpFragment;", "otpVerificationModel", "getOtpVerificationModel", "()Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "setOtpVerificationModel", "(Lai/kudi/agent/register/domain/dto/OtpVerificationModel;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/login/setup/presenters/AccountVerificationPresenter;", "setThisPresenter", "(Lai/kudi/agent/login/setup/presenters/AccountVerificationPresenter;)V", "type", "createPresenter", "hideProgress", "", "navigateToBusinessInfoView", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "navigateToDashBoard", "navigateToFaceFragment", "navigateToLogin", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "otpCallBacks", "Lai/kudi/agent/register/data/models/OtpCallBacks;", "setOtpDetails", "showMsg", "feedbackMsg", "showProgress", "toEnterOtpView", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "toPerformLoginView", "phoneNumber", "toggleAuthState", "inProgress", "", "verifyOtp", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.AccountVerificationHolderActivity */
/* loaded from: classes.dex */
public final class AccountVerificationHolderActivity extends MvpActivity<AccountVerificationView, AccountVerificationPresenter, ActivityAccountVerificationHolderBinding> implements AccountVerificationView, PhoneVerificationNavigator {
    private static String ACCOUNT_HOLDER_EXTRA = null;
    public static final String ACCOUNT_VERIFICATION_TYPE = "ACCOUNT_VERIFICATION_TYPE";
    public static final Companion Companion;
    public static final int REQ_CODE_LOGIN = 100;
    public DeviceVerificationSubcomponent deviceVerificationSubComponent;
    private OtpVerificationModel model;
    private OtpData otpData;
    private OtpFragment otpFragment;
    private OtpVerificationModel otpVerificationModel;
    public AccountVerificationPresenter thisPresenter;
    private String type = "";
    private String loginPhoneNumber = "";

    /* compiled from: AccountVerificationHolderActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/AccountVerificationHolderActivity$Companion;", "", "()V", "ACCOUNT_HOLDER_EXTRA", "", "getACCOUNT_HOLDER_EXTRA", "()Ljava/lang/String;", "setACCOUNT_HOLDER_EXTRA", "(Ljava/lang/String;)V", AccountVerificationHolderActivity.ACCOUNT_VERIFICATION_TYPE, "REQ_CODE_LOGIN", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.setup.ui.AccountVerificationHolderActivity$Companion */
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
        public final String getACCOUNT_HOLDER_EXTRA() {
            String $r1 = AccountVerificationHolderActivity.ACCOUNT_HOLDER_EXTRA;
            return $r1;
        }

        public final void setACCOUNT_HOLDER_EXTRA(String str) {
            Log_OC.getArray(str, "<set-?>");
            AccountVerificationHolderActivity.ACCOUNT_HOLDER_EXTRA = str;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        ACCOUNT_HOLDER_EXTRA = "ACCOUNT_HOLDER_EXTRA";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39767onCreate$lambda0(AccountVerificationHolderActivity accountVerificationHolderActivity, View view) {
        Log_OC.getArray(accountVerificationHolderActivity, "this$0");
        accountVerificationHolderActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final OtpCallBacks otpCallBacks(final OtpVerificationModel otpVerificationModel) {
        this.model = otpVerificationModel;
        return new OtpCallBacks() { // from class: ai.kudi.agent.login.setup.ui.AccountVerificationHolderActivity$otpCallBacks$1
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
                AccountVerificationHolderActivity $r2 = AccountVerificationHolderActivity.this;
                OtpVerificationModel $r3 = otpVerificationModel;
                $r2.otpData = otpData;
                $r2.verifyOtp(otpData, $r3);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onResendOtpClicked(OtpData otpData) {
                if (otpData == null) {
                    return;
                }
                AccountVerificationHolderActivity $r4 = AccountVerificationHolderActivity.this;
                OtpVerificationModel $r1 = otpVerificationModel;
                AccountVerificationPresenter $r2 = $r4.getThisPresenter();
                $r2.resendOtp($r1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtp(OtpData otpData, OtpVerificationModel otpVerificationModel) {
        Activity r7 = (Activity) this;
        LocationUtil r5 = new LocationUtil(r7);
        AccountVerificationHolderActivity$verifyOtp$1 r6 = new AccountVerificationHolderActivity$verifyOtp$1(otpData, this, otpVerificationModel);
        LocationUtil.getLastLocation$default(r5, null, 0, r6, 3, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AccountVerificationPresenter createPresenter() {
        AccountVerificationPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityAccountVerificationHolderBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityAccountVerificationHolderBinding $r2 = ActivityAccountVerificationHolderBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityAccountVerificationHolderBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DeviceVerificationSubcomponent getDeviceVerificationSubComponent() {
        DeviceVerificationSubcomponent $r1 = this.deviceVerificationSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("deviceVerificationSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OtpVerificationModel getOtpVerificationModel() {
        OtpVerificationModel r1 = this.otpVerificationModel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AccountVerificationPresenter getThisPresenter() {
        AccountVerificationPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void hideProgress() {
        InterfaceC8209a $r1 = getBinding();
        ActivityAccountVerificationHolderBinding $r2 = (ActivityAccountVerificationHolderBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void navigateToBusinessInfoView(DashboardData dashboardData) {
        Log_OC.getArray(dashboardData, "dashboardData");
        AccountVerificationHolderActivity$navigateToBusinessInfoView$1 r3 = new AccountVerificationHolderActivity$navigateToBusinessInfoView$1(dashboardData);
        Context r4 = (Context) this;
        ContextExtKt.launchActivity(r4, true, BvnExistingAgentActivity.class, (InterfaceC11767l) r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void navigateToDashBoard(DashboardData dashboardData) {
        Log_OC.getArray(dashboardData, "dashboardData");
        boolean $z0 = dashboardData.isNewUser();
        boolean $z1 = dashboardData.isKCashEnabled();
        boolean $z2 = dashboardData.isC2C();
        boolean $z3 = dashboardData.isOutlet();
        boolean $z4 = dashboardData.isHq();
        String $r3 = dashboardData.getCustomerType();
        LoginParams $r2 = LoginParams.INSTANCE;
        LoginParams.buildLoginIntent$default($r2, (Context) this, $z0, $z1, $z2, $z4, $z3, $r3, false, 128, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void navigateToFaceFragment(OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        UnknownDeviceFaceVerificationFragment.Companion $r2 = UnknownDeviceFaceVerificationFragment.Companion;
        FaceVerificationFragment.TYPES $r3 = FaceVerificationFragment.TYPES.LOGIN;
        String $r4 = $r3.name();
        UnknownDeviceFaceVerificationFragment $r5 = $r2.newInstance(otpVerificationModel, $r4);
        AppCompatActivity r6 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r6, $r5, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void navigateToLogin() {
        Context r3 = (Context) this;
        Intent r2 = new Intent(r3, LoginActivity.class);
        Activity r4 = (Activity) this;
        r4.startActivity(r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        ComponentActivity r2 = (ComponentActivity) this;
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        FragmentActivity r3 = (FragmentActivity) this;
        FragmentManager $r1 = r3.getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            Activity r4 = (Activity) this;
            r4.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r31 = (Activity) this;
        Application $r2 = r31.getApplication();
        if ($r2 == null) {
            NullPointerException r30 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r30;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        DeviceVerificationSubcomponent.Factory $r5 = $r4.devciceVerificationSubcomponent();
        DeviceVerificationSubcomponent $r6 = $r5.create(this);
        setDeviceVerificationSubComponent($r6);
        DeviceVerificationSubcomponent $r62 = getDeviceVerificationSubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        disableLogoutTimer();
        InterfaceC8209a $r7 = getBinding();
        ((ActivityAccountVerificationHolderBinding) $r7).backNav.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountVerificationHolderActivity $r22 = AccountVerificationHolderActivity.this;
                AccountVerificationHolderActivity.m39767onCreate$lambda0($r22, view);
            }
        });
        Activity r312 = (Activity) this;
        Intent $r11 = r312.getIntent();
        String $r12 = ACCOUNT_HOLDER_EXTRA;
        Parcelable $r13 = $r11.getParcelableExtra($r12);
        boolean $z0 = $r13 instanceof OtpVerificationModel;
        this.otpVerificationModel = $z0 ? (OtpVerificationModel) $r13 : null;
        Activity r313 = (Activity) this;
        Intent $r112 = r313.getIntent();
        String $r15 = $r112.getStringExtra(ACCOUNT_VERIFICATION_TYPE);
        String $r122 = $r15;
        if ($r15 == null) {
            $r122 = "";
        }
        this.type = $r122;
        OtpVerificationModel $r14 = this.otpVerificationModel;
        if ($r14 == null) {
            return;
        }
        RegistrationStatus $r16 = RegistrationStatus.LOGIN_SUSPENDED;
        boolean $z02 = Log_OC.append($r122, $r16.name());
        if ($z02) {
            LoginSuspendedFragment r28 = new LoginSuspendedFragment();
            AppCompatActivity r32 = (AppCompatActivity) this;
            AppCompatActivityExtKt.startFragment$default(r32, r28, C0001R.C0003id.container, false, false, false, 28, null);
            return;
        }
        RegistrationStatus $r162 = RegistrationStatus.BVN_VERIFICATION_REQUIRED;
        boolean $z03 = Log_OC.append($r122, $r162.name());
        if (!$z03) {
            NewDeviceVerificationOptionFragment.Companion $r24 = NewDeviceVerificationOptionFragment.Companion;
            String $r123 = this.type;
            NewDeviceVerificationOptionFragment $r25 = $r24.newInstance($r123, $r14);
            AppCompatActivity r322 = (AppCompatActivity) this;
            AppCompatActivityExtKt.startFragment$default(r322, $r25, C0001R.C0003id.container, false, false, false, 28, null);
            return;
        }
        InterfaceC8209a $r72 = getBinding();
        ActivityAccountVerificationHolderBinding $r8 = (ActivityAccountVerificationHolderBinding) $r72;
        ImageView $r9 = $r8.backNav;
        Log_OC.loadImage($r9, "binding.backNav");
        ViewExtKt.hide$default($r9, false, 1, null);
        Integer $r19 = Integer.valueOf((int) C0001R.C0002drawable.ic_unfollow);
        Activity r314 = (Activity) this;
        String $r124 = r314.getString(C0001R.string.verify_title);
        Activity r315 = (Activity) this;
        String $r152 = r315.getString(C0001R.string.verify_message);
        Activity r316 = (Activity) this;
        String $r20 = r316.getString(C0001R.string.verify_acct);
        String $r21 = $r14.getLoginAttemptId();
        EnforceBvnVerificationData r29 = new EnforceBvnVerificationData($r19, $r124, $r152, $r20, EnforceBvnVerificationFragment.BUTTON_UNVERIFIED_VALUE, $r21);
        EnforceBvnVerificationFragment.Companion $r22 = EnforceBvnVerificationFragment.Companion;
        EnforceBvnVerificationFragment $r23 = $r22.newInstance(r29);
        AppCompatActivity r323 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r323, $r23, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        if (i == 100) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    String $r6 = this.loginPhoneNumber;
                    toPerformLoginView($r6);
                    return;
                }
            }
            LocationUtil.Companion $r5 = LocationUtil.Companion;
            Context r7 = (Context) this;
            $r5.handleDeniedPermission(r7);
        } else if (i != 1000) {
        } else {
            int $i03 = iArr.length;
            boolean $z02 = $i03 == 0;
            if (!$z02) {
                int $i04 = iArr[0];
                if ($i04 == 0) {
                    OtpData $r3 = this.otpData;
                    if ($r3 == null || this.model == null) {
                        LocationUtil.Companion $r52 = LocationUtil.Companion;
                        Context r72 = (Context) this;
                        $r52.handleDeniedPermission(r72);
                        return;
                    }
                    Log_OC.append($r3);
                    OtpVerificationModel $r4 = this.model;
                    Log_OC.append($r4);
                    verifyOtp($r3, $r4);
                }
            }
        }
    }

    public final void setDeviceVerificationSubComponent(DeviceVerificationSubcomponent deviceVerificationSubcomponent) {
        Log_OC.getArray(deviceVerificationSubcomponent, "<set-?>");
        this.deviceVerificationSubComponent = deviceVerificationSubcomponent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void setOtpDetails(OtpVerificationModel otpVerificationModel) {
        OtpData $r3;
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        OtpFragment $r2 = this.otpFragment;
        if ($r2 == null || ($r3 = $r2.getOtpData()) == null) {
            return;
        }
        String $r4 = otpVerificationModel.getLoginAttemptId();
        $r3.setOtpRequestId($r4);
        long $l0 = otpVerificationModel.getExpiresInSeconds();
        $r3.setExpiryInSeconds($l0);
        $r2.initCountDownTimer();
    }

    public final void setOtpVerificationModel(OtpVerificationModel otpVerificationModel) {
        this.otpVerificationModel = otpVerificationModel;
    }

    public final void setThisPresenter(AccountVerificationPresenter accountVerificationPresenter) {
        Log_OC.getArray(accountVerificationPresenter, "<set-?>");
        this.thisPresenter = accountVerificationPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void showMsg(String str) {
        Log_OC.getArray(str, "feedbackMsg");
        Context r2 = (Context) this;
        ContextExtKt.toast$default(r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void showProgress() {
        InterfaceC8209a $r1 = getBinding();
        ActivityAccountVerificationHolderBinding $r2 = (ActivityAccountVerificationHolderBinding) $r1;
        ViewLoaderBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.show(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.navigators.PhoneVerificationNavigator
    public void toEnterOtpView(OtpFragmentData otpFragmentData, OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(otpFragmentData, "otpFragmentData");
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        OtpFragment.Companion $r3 = OtpFragment.Companion;
        OtpCallBacks $r4 = otpCallBacks(otpVerificationModel);
        OtpFragment $r5 = $r3.newInstance(otpFragmentData, $r4);
        this.otpFragment = $r5;
        AppCompatActivity r6 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r6, $r5, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.navigators.PhoneVerificationNavigator
    public void toPerformLoginView(String str) {
        Log_OC.getArray(str, "phoneNumber");
        this.loginPhoneNumber = str;
        Activity r6 = (Activity) this;
        LocationUtil r4 = new LocationUtil(r6);
        AccountVerificationHolderActivity$toPerformLoginView$1 r5 = new AccountVerificationHolderActivity$toPerformLoginView$1(this, str);
        LocationUtil.getLastLocation$default(r4, null, 100, r5, 1, null);
    }

    @Override // ai.kudi.agent.login.setup.views.AccountVerificationView
    public void toggleAuthState(boolean z) {
    }
}
