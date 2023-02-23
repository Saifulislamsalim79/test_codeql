package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.login.setup.views.AccountVerificationView;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.LoginInput;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: AccountVerificationPresenter.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002JF\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eJ&\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/login/setup/presenters/AccountVerificationPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/login/setup/views/AccountVerificationView;", "baseOtpUtil", "Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;", "loginUser", "Lai/kudi/agent/users/domain/usecases/LoginUser;", "(Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;Lai/kudi/agent/users/domain/usecases/LoginUser;)V", "loginDisposable", "Lio/reactivex/disposables/Disposable;", "sendOtpDisposable", "verifyOtpDisposable", "destroy", "", "invalidParams", "", "otp", "", "performLogin", "phoneNumber", "kudiPin", "deviceName", "deviceId", "imeId", "type", "latitude", "", "longitude", "resendOtp", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "verifyOtpForDeviceVerification", "otpCode", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountVerificationPresenter extends C9410b<AccountVerificationView> {
    private final BaseOtpUtil baseOtpUtil;
    private FavoritesArrayAdapter loginDisposable;
    private final LoginUser loginUser;
    private FavoritesArrayAdapter sendOtpDisposable;
    private FavoritesArrayAdapter verifyOtpDisposable;

    public AccountVerificationPresenter(BaseOtpUtil baseOtpUtil, LoginUser loginUser) {
        Log_OC.getArray(baseOtpUtil, "baseOtpUtil");
        Log_OC.getArray(loginUser, "loginUser");
        this.baseOtpUtil = baseOtpUtil;
        this.loginUser = loginUser;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean invalidParams(String str) {
        boolean $z0;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            C0311b $r2 = C0311b.f647e;
            ifViewAttached($r2);
            return true;
        }
        int $i0 = str.length();
        if ($i0 < 4) {
            Buffer $r3 = Buffer.buf;
            ifViewAttached($r3);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invalidParams$lambda-7  reason: not valid java name */
    public static final void m39743invalidParams$lambda7(AccountVerificationView accountVerificationView) {
        Log_OC.getArray(accountVerificationView, "view");
        accountVerificationView.hideProgress();
        accountVerificationView.showMsg("Enter OTP");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invalidParams$lambda-8  reason: not valid java name */
    public static final void m39744invalidParams$lambda8(AccountVerificationView accountVerificationView) {
        Log_OC.getArray(accountVerificationView, "view");
        accountVerificationView.hideProgress();
        accountVerificationView.showMsg("Enter a valid OTP");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLogin$lambda-1  reason: not valid java name */
    public static final void m39745performLogin$lambda1(AccountVerificationView accountVerificationView) {
        Log_OC.getArray(accountVerificationView, "it");
        accountVerificationView.showProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-3  reason: not valid java name */
    public static final void m39746performLogin$lambda3(AccountVerificationPresenter accountVerificationPresenter, final String str, User user) {
        Log_OC.getArray(accountVerificationPresenter, "this$0");
        Log_OC.getArray(str, "$type");
        double $d0 = user.walletBalance;
        boolean $z1 = user.isKCashEnabled;
        boolean $z3 = user.isOutlet;
        boolean $z0 = user.isNewUser;
        boolean $z4 = user.isHq;
        boolean $z2 = user.isC2C;
        String $r2 = user.customerType;
        Log_OC.loadImage($r2, "customerType");
        final DashboardData $r4 = new DashboardData($d0, $z0, $z1, $z2, $z3, $z4, $r2);
        accountVerificationPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.setup.presenters.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                String $r1 = str;
                DashboardData $r22 = $r4;
                AccountVerificationView $r42 = (AccountVerificationView) obj;
                AccountVerificationPresenter.m39747performLogin$lambda3$lambda2($r1, $r22, $r42);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39747performLogin$lambda3$lambda2(String str, DashboardData dashboardData, AccountVerificationView accountVerificationView) {
        Log_OC.getArray(str, "$type");
        Log_OC.getArray(dashboardData, "$dashboardData");
        Log_OC.getArray(accountVerificationView, "view");
        accountVerificationView.hideProgress();
        RegistrationStatus $r3 = RegistrationStatus.BVN_VERIFICATION_REQUIRED;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append(str, $r4);
        if ($z0) {
            accountVerificationView.navigateToBusinessInfoView(dashboardData);
        } else {
            accountVerificationView.navigateToDashBoard(dashboardData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-5  reason: not valid java name */
    public static final void m39748performLogin$lambda5(AccountVerificationPresenter accountVerificationPresenter, Throwable th) {
        Log_OC.getArray(accountVerificationPresenter, "this$0");
        Direction $r2 = Direction.f635W;
        accountVerificationPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLogin$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39749performLogin$lambda5$lambda4(AccountVerificationView accountVerificationView) {
        Log_OC.getArray(accountVerificationView, "it");
        accountVerificationView.hideProgress();
        accountVerificationView.showMsg("Verification Completed. Kindly login");
        accountVerificationView.navigateToLogin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resendOtp$lambda-6  reason: not valid java name */
    public static final void m39750resendOtp$lambda6(AccountVerificationPresenter accountVerificationPresenter, OtpVerificationModel otpVerificationModel, AccountVerificationView accountVerificationView) {
        Log_OC.getArray(accountVerificationPresenter, "this$0");
        Log_OC.getArray(otpVerificationModel, "$otpVerificationModel");
        Log_OC.getArray(accountVerificationView, "view");
        accountVerificationView.showProgress();
        BaseOtpUtil $r6 = accountVerificationPresenter.baseOtpUtil;
        AccountVerificationPresenter$resendOtp$1$1 $r2 = new AccountVerificationPresenter$resendOtp$1$1(accountVerificationView);
        AccountVerificationPresenter$resendOtp$1$2 $r3 = new AccountVerificationPresenter$resendOtp$1$2(accountVerificationView);
        FavoritesArrayAdapter $r4 = $r6.sendOtpForDeviceVerification(otpVerificationModel, $r2, $r3);
        accountVerificationPresenter.sendOtpDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyOtpForDeviceVerification$lambda-0  reason: not valid java name */
    public static final void m39751verifyOtpForDeviceVerification$lambda0(AccountVerificationPresenter accountVerificationPresenter, String str, OtpVerificationModel otpVerificationModel, double d, double d2, AccountVerificationView accountVerificationView) {
        Log_OC.getArray(accountVerificationPresenter, "this$0");
        Log_OC.getArray(str, "$otpCode");
        Log_OC.getArray(otpVerificationModel, "$otpVerificationModel");
        Log_OC.getArray(accountVerificationView, "view");
        accountVerificationView.showProgress();
        boolean $z0 = accountVerificationPresenter.invalidParams(str);
        if ($z0) {
            return;
        }
        BaseOtpUtil $r4 = accountVerificationPresenter.baseOtpUtil;
        AccountVerificationPresenter$verifyOtpForDeviceVerification$1$1 $r5 = new AccountVerificationPresenter$verifyOtpForDeviceVerification$1$1(accountVerificationPresenter, otpVerificationModel, d, d2, accountVerificationView);
        AccountVerificationPresenter$verifyOtpForDeviceVerification$1$2 $r6 = new AccountVerificationPresenter$verifyOtpForDeviceVerification$1$2(accountVerificationView);
        FavoritesArrayAdapter $r7 = $r4.verifyOtpForDeviceVerification(str, otpVerificationModel, $r5, $r6);
        accountVerificationPresenter.verifyOtpDisposable = $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        FavoritesArrayAdapter $r1 = this.verifyOtpDisposable;
        if ($r1 != null) {
            $r1.backup();
        }
        FavoritesArrayAdapter $r12 = this.sendOtpDisposable;
        if ($r12 != null) {
            $r12.backup();
        }
        FavoritesArrayAdapter $r13 = this.loginDisposable;
        if ($r13 == null) {
            return;
        }
        $r13.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performLogin(String str, String str2, String str3, String str4, String str5, final String str6, double d, double d2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "kudiPin");
        Log_OC.getArray(str3, "deviceName");
        Log_OC.getArray(str4, "deviceId");
        Log_OC.getArray(str5, "imeId");
        Log_OC.getArray(str6, "type");
        Target $r8 = Target.NONE;
        ifViewAttached($r8);
        LoginUser $r9 = this.loginUser;
        User.Builder $r10 = new User.Builder();
        User $r11 = $r10.setPhoneNumber(str).setPin(str2).setDeviceName(str3).setDeviceId(str4).setImei(str5).build();
        Log_OC.loadImage($r11, "Builder()\n                    .setPhoneNumber(phoneNumber)\n                    .setPin(kudiPin)\n                    .setDeviceName(deviceName)\n                    .setDeviceId(deviceId)\n                    .setImei(imeId)\n                    .build()");
        LoginInput $r7 = new LoginInput($r11, d, d2);
        AbstractC11688p $r12 = $r9.execute($r7);
        FavoritesArrayAdapter $r15 = $r12.e0(new Object() { // from class: ai.kudi.agent.login.setup.presenters.Cubic
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AccountVerificationPresenter $r1 = AccountVerificationPresenter.this;
                String $r2 = str6;
                User $r4 = (User) obj;
                AccountVerificationPresenter.m39746performLogin$lambda3($r1, $r2, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.login.setup.presenters.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AccountVerificationPresenter $r1 = AccountVerificationPresenter.this;
                Throwable $r3 = (Throwable) obj;
                AccountVerificationPresenter.m39748performLogin$lambda5($r1, $r3);
            }
        });
        this.loginDisposable = $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resendOtp(final OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.setup.presenters.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: e */
            public final void m38745e(Object obj) {
                AccountVerificationPresenter $r1 = AccountVerificationPresenter.this;
                OtpVerificationModel $r2 = otpVerificationModel;
                AccountVerificationView $r4 = (AccountVerificationView) obj;
                AccountVerificationPresenter.m39750resendOtp$lambda6($r1, $r2, $r4);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtpForDeviceVerification(final String str, final OtpVerificationModel otpVerificationModel, final double d, final double d2) {
        Log_OC.getArray(str, "otpCode");
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.setup.presenters.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                AccountVerificationPresenter $r2 = AccountVerificationPresenter.this;
                String $r3 = str;
                OtpVerificationModel $r4 = otpVerificationModel;
                double $d0 = d;
                double $d1 = d2;
                AccountVerificationView $r5 = (AccountVerificationView) obj;
                AccountVerificationPresenter.m39751verifyOtpForDeviceVerification$lambda0($r2, $r3, $r4, $d0, $d1, $r5);
            }
        });
    }
}
