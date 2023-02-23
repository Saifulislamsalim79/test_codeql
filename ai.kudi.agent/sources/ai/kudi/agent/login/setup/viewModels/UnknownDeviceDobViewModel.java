package ai.kudi.agent.login.setup.viewModels;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.login.model.VerifyBvnWithDobRequest;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.login.setup.domain.VerifyFaceWithDob;
import ai.kudi.agent.login.setup.viewModels.data.UnknownDeviceDobViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.OtpVerificationResponse;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.LoginInput;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import android.os.Build;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: UnknownDeviceDobViewModel.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002JF\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/login/setup/viewModels/UnknownDeviceDobViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/login/setup/viewModels/data/UnknownDeviceDobViewData;", "verifyFaceWithDob", "Lai/kudi/agent/login/setup/domain/VerifyFaceWithDob;", "loginUser", "Lai/kudi/agent/users/domain/usecases/LoginUser;", "(Lai/kudi/agent/login/setup/domain/VerifyFaceWithDob;Lai/kudi/agent/users/domain/usecases/LoginUser;)V", "authorizeDob", "", "dob", "", PhoneFragment.ARG_BVN, "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "logitude", "", "latitude", "initialData", "isValidInputParam", "", "performLogin", "phoneNumber", "kudiPin", "deviceName", "deviceId", "imeId", "type", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UnknownDeviceDobViewModel extends BaseViewModel<UnknownDeviceDobViewData> {
    private final LoginUser loginUser;
    private final VerifyFaceWithDob verifyFaceWithDob;

    public UnknownDeviceDobViewModel(VerifyFaceWithDob verifyFaceWithDob, LoginUser loginUser) {
        Log_OC.getArray(verifyFaceWithDob, "verifyFaceWithDob");
        Log_OC.getArray(loginUser, "loginUser");
        this.verifyFaceWithDob = verifyFaceWithDob;
        this.loginUser = loginUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorizeDob$lambda-0  reason: not valid java name */
    public static final void m39782authorizeDob$lambda0(UnknownDeviceDobViewModel unknownDeviceDobViewModel, OtpVerificationModel otpVerificationModel, double d, double d2, OtpVerificationResponse otpVerificationResponse) {
        Log_OC.getArray(unknownDeviceDobViewModel, "this$0");
        Log_OC.getArray(otpVerificationModel, "$otpVerificationModel");
        String $r3 = otpVerificationResponse.getStatus();
        RegistrationStatus $r4 = RegistrationStatus.ALLOW;
        String $r5 = $r4.name();
        boolean $z0 = Log_OC.append($r3, $r5);
        if (!$z0) {
            UnknownDeviceDobViewData.HideLoading $r10 = UnknownDeviceDobViewData.HideLoading.INSTANCE;
            unknownDeviceDobViewModel.publish($r10);
            UnknownDeviceDobViewData.Error $r11 = new UnknownDeviceDobViewData.Error("Could not complete verification");
            unknownDeviceDobViewModel.publish($r11);
            return;
        }
        String $r32 = otpVerificationModel.getPhoneNumber();
        String $r52 = otpVerificationModel.getPin();
        String $r6 = otpVerificationModel.getDeviceName();
        String $r7 = otpVerificationModel.getDeviceId();
        String $r8 = otpVerificationModel.getImeiId();
        RegistrationStatus $r42 = RegistrationStatus.OTP_VERIFICATION_NEEDED;
        String $r9 = $r42.name();
        unknownDeviceDobViewModel.performLogin($r32, $r52, $r6, $r7, $r8, $r9, d, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: authorizeDob$lambda-1  reason: not valid java name */
    public static final void m39783authorizeDob$lambda1(UnknownDeviceDobViewModel unknownDeviceDobViewModel, Throwable th) {
        Log_OC.getArray(unknownDeviceDobViewModel, "this$0");
        UnknownDeviceDobViewData.HideLoading $r2 = UnknownDeviceDobViewData.HideLoading.INSTANCE;
        unknownDeviceDobViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        UnknownDeviceDobViewData.Error $r3 = new UnknownDeviceDobViewData.Error($r6);
        unknownDeviceDobViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isValidInputParam(String str, String str2) {
        boolean $z0;
        boolean $z02;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            UnknownDeviceDobViewData.BvnError $r3 = new UnknownDeviceDobViewData.BvnError(C0001R.string.bvn_blank_error);
            publish($r3);
            return false;
        }
        boolean $z03 = StringExtKt.isValidBvn(str);
        if (!$z03) {
            UnknownDeviceDobViewData.BvnError $r32 = new UnknownDeviceDobViewData.BvnError(C0001R.string.invalid_bvn);
            publish($r32);
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            UnknownDeviceDobViewData.DobError $r4 = new UnknownDeviceDobViewData.DobError(C0001R.string.date_blank_error);
            publish($r4);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-2  reason: not valid java name */
    public static final void m39784performLogin$lambda2(UnknownDeviceDobViewModel unknownDeviceDobViewModel, String str, User user) {
        Log_OC.getArray(unknownDeviceDobViewModel, "this$0");
        Log_OC.getArray(str, "$type");
        UnknownDeviceDobViewData.HideLoading $r4 = UnknownDeviceDobViewData.HideLoading.INSTANCE;
        unknownDeviceDobViewModel.publish($r4);
        double $d0 = user.walletBalance;
        boolean $z1 = user.isKCashEnabled;
        boolean $z3 = user.isOutlet;
        boolean $z0 = user.isNewUser;
        boolean $z4 = user.isHq;
        boolean $z2 = user.isC2C;
        String $r1 = user.customerType;
        Log_OC.loadImage($r1, "customerType");
        DashboardData $r5 = new DashboardData($d0, $z0, $z1, $z2, $z3, $z4, $r1);
        UnknownDeviceDobViewData.HideLoading $r42 = UnknownDeviceDobViewData.HideLoading.INSTANCE;
        unknownDeviceDobViewModel.publish($r42);
        RegistrationStatus $r6 = RegistrationStatus.BVN_VERIFICATION_REQUIRED;
        boolean $z02 = Log_OC.append(str, $r6.name());
        if ($z02) {
            UnknownDeviceDobViewData.NavigateToBusinessInfo $r7 = new UnknownDeviceDobViewData.NavigateToBusinessInfo($r5);
            unknownDeviceDobViewModel.publish($r7);
            return;
        }
        UnknownDeviceDobViewData.LoginSuccess $r8 = new UnknownDeviceDobViewData.LoginSuccess($r5);
        unknownDeviceDobViewModel.publish($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLogin$lambda-3  reason: not valid java name */
    public static final void m39785performLogin$lambda3(UnknownDeviceDobViewModel unknownDeviceDobViewModel, Throwable th) {
        Log_OC.getArray(unknownDeviceDobViewModel, "this$0");
        UnknownDeviceDobViewData.HideLoading $r2 = UnknownDeviceDobViewData.HideLoading.INSTANCE;
        unknownDeviceDobViewModel.publish($r2);
        UnknownDeviceDobViewData.NavigateToLogin $r3 = new UnknownDeviceDobViewData.NavigateToLogin("Verification Completed. Kindly login");
        unknownDeviceDobViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void authorizeDob(String str, String str2, final OtpVerificationModel otpVerificationModel, final double d, final double d2) {
        Log_OC.getArray(str, "dob");
        Log_OC.getArray(str2, PhoneFragment.ARG_BVN);
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        boolean $z0 = isValidInputParam(str2, str);
        if ($z0) {
            UnknownDeviceDobViewData.Loading $r6 = UnknownDeviceDobViewData.Loading.INSTANCE;
            publish($r6);
            VerifyFaceWithDob $r7 = this.verifyFaceWithDob;
            String $r8 = otpVerificationModel.getDeviceId();
            String $r9 = otpVerificationModel.getDeviceName();
            String $r10 = otpVerificationModel.getLoginAttemptId();
            String $r11 = otpVerificationModel.getImeiId();
            String $r5 = Build.VERSION.RELEASE;
            Log_OC.loadImage($r5, "RELEASE");
            VerifyBvnWithDobRequest $r4 = new VerifyBvnWithDobRequest($r8, $r9, $r5, str, str2, $r11, $r10);
            AbstractC11688p $r12 = $r7.execute($r4);
            FavoritesArrayAdapter $r15 = $r12.e0(new Object() { // from class: ai.kudi.agent.login.setup.viewModels.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    UnknownDeviceDobViewModel $r2 = UnknownDeviceDobViewModel.this;
                    OtpVerificationModel $r3 = otpVerificationModel;
                    double $d0 = d;
                    double $d1 = d2;
                    OtpVerificationResponse $r42 = (OtpVerificationResponse) obj;
                    UnknownDeviceDobViewModel.m39782authorizeDob$lambda0($r2, $r3, $d0, $d1, $r42);
                }
            }, new Object() { // from class: ai.kudi.agent.login.setup.viewModels.Chunk
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    UnknownDeviceDobViewModel $r1 = UnknownDeviceDobViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    UnknownDeviceDobViewModel.m39783authorizeDob$lambda1($r1, $r3);
                }
            });
            Log_OC.loadImage($r15, "verifyFaceWithDob.execute(\n            VerifyBvnWithDobRequest(\n                deviceId = otpVerificationModel.deviceId,\n                deviceName = otpVerificationModel.deviceName,\n                loginAttemptId = otpVerificationModel.loginAttemptId,\n                imeId = otpVerificationModel.imeiId,\n                deviceOsVersion = Build.VERSION.RELEASE,\n                identityNumber = bvn,\n                dob = dob,\n            )\n        ).subscribe(\n            {\n                if (it.status == RegistrationStatus.ALLOW.name) {\n                    performLogin(\n                        phoneNumber = otpVerificationModel.phoneNumber,\n                        kudiPin = otpVerificationModel.pin,\n                        deviceName = otpVerificationModel.deviceName,\n                        deviceId = otpVerificationModel.deviceId,\n                        imeId = otpVerificationModel.imeiId,\n                        type = RegistrationStatus.OTP_VERIFICATION_NEEDED.name,\n                        logitude = logitude,\n                        latitude = latitude\n                    )\n                } else {\n                    publish(UnknownDeviceDobViewData.HideLoading)\n                    publish(UnknownDeviceDobViewData.Error(\"Could not complete verification\"))\n                }\n            },\n            {\n                publish(UnknownDeviceDobViewData.HideLoading)\n                publish(UnknownDeviceDobViewData.Error(parseHttpError2()(it)))\n            }\n        )");
            C11280b $r16 = getCompositeDisposable();
            RxExtKt.addTo($r15, $r16);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        UnknownDeviceDobViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public UnknownDeviceDobViewData initialData() {
        UnknownDeviceDobViewData.Initial r1 = UnknownDeviceDobViewData.Initial.INSTANCE;
        return r1;
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
        LoginUser $r8 = this.loginUser;
        User.Builder $r9 = new User.Builder();
        User $r10 = $r9.setPhoneNumber(str).setPin(str2).setDeviceName(str3).setDeviceId(str4).setImei(str5).build();
        Log_OC.loadImage($r10, "Builder()\n                    .setPhoneNumber(phoneNumber)\n                    .setPin(kudiPin)\n                    .setDeviceName(deviceName)\n                    .setDeviceId(deviceId)\n                    .setImei(imeId)\n                    .build()");
        LoginInput $r7 = new LoginInput($r10, d2, d);
        AbstractC11688p $r11 = $r8.execute($r7);
        FavoritesArrayAdapter $r14 = $r11.e0(new Object() { // from class: ai.kudi.agent.login.setup.viewModels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UnknownDeviceDobViewModel $r1 = UnknownDeviceDobViewModel.this;
                String $r2 = str6;
                User $r4 = (User) obj;
                UnknownDeviceDobViewModel.m39784performLogin$lambda2($r1, $r2, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.login.setup.viewModels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UnknownDeviceDobViewModel $r1 = UnknownDeviceDobViewModel.this;
                Throwable $r3 = (Throwable) obj;
                UnknownDeviceDobViewModel.m39785performLogin$lambda3($r1, $r3);
            }
        });
        Log_OC.loadImage($r14, "loginUser.execute(\n            LoginInput(\n                user = User.Builder()\n                    .setPhoneNumber(phoneNumber)\n                    .setPin(kudiPin)\n                    .setDeviceName(deviceName)\n                    .setDeviceId(deviceId)\n                    .setImei(imeId)\n                    .build(),\n                lat = latitude,\n                lon = logitude\n            )\n        ).subscribe(\n            {\n                publish(UnknownDeviceDobViewData.HideLoading)\n                val dashboardData = DashboardData(\n                    walletBalance = it.walletBalance,\n                    isKCashEnabled = it.isKCashEnabled,\n                    isOutlet = it.isOutlet,\n                    isNewUser = it.isNewUser,\n                    isHq = it.isHq,\n                    isC2C = it.isC2C,\n                    customerType = it.customerType\n                )\n                publish(UnknownDeviceDobViewData.HideLoading)\n                if (type == RegistrationStatus.BVN_VERIFICATION_REQUIRED.name) {\n                    publish(UnknownDeviceDobViewData.NavigateToBusinessInfo(dashboardData))\n                } else {\n                    publish(UnknownDeviceDobViewData.LoginSuccess(dashboardData))\n                }\n            },\n            {\n                publish(UnknownDeviceDobViewData.HideLoading)\n                publish(UnknownDeviceDobViewData.NavigateToLogin(\"Verification Completed. Kindly login\"))\n            }\n        )");
        C11280b $r15 = getCompositeDisposable();
        RxExtKt.addTo($r14, $r15);
    }
}
