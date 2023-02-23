package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.login.domain.usecases.RequestOtp;
import ai.kudi.agent.login.domain.usecases.ResendOTP;
import ai.kudi.agent.login.domain.usecases.ValidateNewPhoneNumber;
import ai.kudi.agent.login.domain.usecases.VerifyOtp;
import ai.kudi.agent.login.domain.wiki.ResendOTPRequest;
import ai.kudi.agent.login.domain.wiki.ResetPinRequest;
import ai.kudi.agent.login.domain.wiki.ResetPinResponse;
import ai.kudi.agent.login.setup.domain.SendOtpForDeviceVerification;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.OtpVerificationResponse;
import ai.kudi.agent.register.domain.wiki.SecondaryDetailsRequest;
import ai.kudi.agent.register.domain.wiki.SecondaryDetailsResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: BaseOtpUtil.kt */
@Metadata(m10422d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J6\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aJ>\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aJ6\u0010\f\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aJ6\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aJ>\u0010$\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aJ>\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aJ>\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aJF\u0010\u000e\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001c0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001aR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;", "", "verifyOtp", "Lai/kudi/agent/login/domain/usecases/VerifyOtp;", "requestOtp", "Lai/kudi/agent/login/domain/usecases/RequestOtp;", "validateNewPhoneNumber", "Lai/kudi/agent/login/domain/usecases/ValidateNewPhoneNumber;", "resendOTP", "Lai/kudi/agent/login/domain/usecases/ResendOTP;", "resendOtp", "Lai/kudi/agent/register/domain/usecases/ResendOtp;", "sendOtpForDeviceVerification", "Lai/kudi/agent/login/setup/domain/SendOtpForDeviceVerification;", "verifySecondaryDetails", "Lai/kudi/agent/register/domain/usecases/VerifySecondaryDetails;", "validateOtp", "Lai/kudi/agent/register/domain/usecases/ValidateOtp;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/login/domain/usecases/VerifyOtp;Lai/kudi/agent/login/domain/usecases/RequestOtp;Lai/kudi/agent/login/domain/usecases/ValidateNewPhoneNumber;Lai/kudi/agent/login/domain/usecases/ResendOTP;Lai/kudi/agent/register/domain/usecases/ResendOtp;Lai/kudi/agent/login/setup/domain/SendOtpForDeviceVerification;Lai/kudi/agent/register/domain/usecases/VerifySecondaryDetails;Lai/kudi/agent/register/domain/usecases/ValidateOtp;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "requestOtpForgotPin", "Lio/reactivex/disposables/Disposable;", "phoneNumber", "", "onSuccess", "Lkotlin/Function1;", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;", "", "onFailure", "", "requestOtpNewAccount", "registrationId", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "sendOtpForSecondaryDetailsVerification", "verifyNewPhoneNumber", "otp", "verifyOtpForDeviceVerification", "otpCode", "Lai/kudi/agent/register/domain/dto/OtpVerificationResponse;", "verifyOtpForgotPassword", "otpRequestId", "email", AttributeType.PHONE, "Lai/kudi/agent/register/domain/dto/SecondaryDetailsResponse;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BaseOtpUtil {
    private final FetchCurrentUser fetchCurrentUser;
    private final RequestOtp requestOtp;
    private final ResendOTP resendOTP;
    private final ResendOtp resendOtp;
    private final SendOtpForDeviceVerification sendOtpForDeviceVerification;
    private final ValidateNewPhoneNumber validateNewPhoneNumber;
    private final ValidateOtp validateOtp;
    private final VerifyOtp verifyOtp;
    private final VerifySecondaryDetails verifySecondaryDetails;

    public BaseOtpUtil(VerifyOtp verifyOtp, RequestOtp requestOtp, ValidateNewPhoneNumber validateNewPhoneNumber, ResendOTP resendOTP, ResendOtp resendOtp, SendOtpForDeviceVerification sendOtpForDeviceVerification, VerifySecondaryDetails verifySecondaryDetails, ValidateOtp validateOtp, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(verifyOtp, "verifyOtp");
        Log_OC.getArray(requestOtp, "requestOtp");
        Log_OC.getArray(validateNewPhoneNumber, "validateNewPhoneNumber");
        Log_OC.getArray(resendOTP, "resendOTP");
        Log_OC.getArray(resendOtp, "resendOtp");
        Log_OC.getArray(sendOtpForDeviceVerification, "sendOtpForDeviceVerification");
        Log_OC.getArray(verifySecondaryDetails, "verifySecondaryDetails");
        Log_OC.getArray(validateOtp, "validateOtp");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.verifyOtp = verifyOtp;
        this.requestOtp = requestOtp;
        this.validateNewPhoneNumber = validateNewPhoneNumber;
        this.resendOTP = resendOTP;
        this.resendOtp = resendOtp;
        this.sendOtpForDeviceVerification = sendOtpForDeviceVerification;
        this.verifySecondaryDetails = verifySecondaryDetails;
        this.validateOtp = validateOtp;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestOtpForgotPin$lambda-2  reason: not valid java name */
    public static final void m40311requestOtpForgotPin$lambda2(InterfaceC11767l interfaceC11767l, ResetPinResponse resetPinResponse) {
        Log_OC.getArray(interfaceC11767l, "$onSuccess");
        Log_OC.loadImage(resetPinResponse, "it");
        interfaceC11767l.invoke(resetPinResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestOtpForgotPin$lambda-3  reason: not valid java name */
    public static final void m40312requestOtpForgotPin$lambda3(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onFailure");
        Log_OC.loadImage(th, "it");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestOtpNewAccount$lambda-4  reason: not valid java name */
    public static final void m40313requestOtpNewAccount$lambda4(InterfaceC11767l interfaceC11767l, ResetPinResponse resetPinResponse) {
        Log_OC.getArray(interfaceC11767l, "$onSuccess");
        Log_OC.loadImage(resetPinResponse, "it");
        interfaceC11767l.invoke(resetPinResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestOtpNewAccount$lambda-5  reason: not valid java name */
    public static final void m40314requestOtpNewAccount$lambda5(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onFailure");
        Log_OC.loadImage(th, "it");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendOtpForDeviceVerification$lambda-14  reason: not valid java name */
    public static final void m40315sendOtpForDeviceVerification$lambda14(InterfaceC11767l interfaceC11767l, OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(interfaceC11767l, "$onSuccess");
        Log_OC.loadImage(otpVerificationModel, "otpVerificationModelResponse");
        interfaceC11767l.invoke(otpVerificationModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendOtpForDeviceVerification$lambda-15  reason: not valid java name */
    public static final void m40316sendOtpForDeviceVerification$lambda15(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onFailure");
        Log_OC.loadImage(th, "it");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtpForSecondaryDetailsVerification$lambda-11  reason: not valid java name */
    public static final InterfaceC11692s m40317sendOtpForSecondaryDetailsVerification$lambda11(BaseOtpUtil baseOtpUtil, String str, User user) {
        Log_OC.getArray(baseOtpUtil, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(user, "it");
        ResendOtp $r3 = baseOtpUtil.resendOtp;
        OtpVerificationModel $r4 = new OtpVerificationModel(str, null, null, 0L, 0L, false, null, null, null, null, null, false, null, 8190, null);
        String $r1 = user.getSessionId();
        Log_OC.loadImage($r1, "it.sessionId");
        AbstractC11688p $r5 = $r3.executeSecondaryVerificationOtp($r4, $r1);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendOtpForSecondaryDetailsVerification$lambda-12  reason: not valid java name */
    public static final void m40318sendOtpForSecondaryDetailsVerification$lambda12(InterfaceC11767l interfaceC11767l, OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(interfaceC11767l, "$onSuccess");
        Log_OC.loadImage(otpVerificationModel, "it");
        interfaceC11767l.invoke(otpVerificationModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendOtpForSecondaryDetailsVerification$lambda-13  reason: not valid java name */
    public static final void m40319sendOtpForSecondaryDetailsVerification$lambda13(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onFailure");
        Log_OC.loadImage(th, "it");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyNewPhoneNumber$lambda-6  reason: not valid java name */
    public static final void m40320verifyNewPhoneNumber$lambda6(InterfaceC11767l interfaceC11767l, ResetPinResponse resetPinResponse) {
        Log_OC.getArray(interfaceC11767l, "$onSuccess");
        Log_OC.loadImage(resetPinResponse, "it");
        interfaceC11767l.invoke(resetPinResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyNewPhoneNumber$lambda-7  reason: not valid java name */
    public static final void m40321verifyNewPhoneNumber$lambda7(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onFailure");
        Log_OC.loadImage(th, "it");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyOtpForDeviceVerification$lambda-16  reason: not valid java name */
    public static final void m40322verifyOtpForDeviceVerification$lambda16(InterfaceC11767l interfaceC11767l, OtpVerificationResponse otpVerificationResponse) {
        Log_OC.getArray(interfaceC11767l, "$onSuccess");
        Log_OC.loadImage(otpVerificationResponse, "it");
        interfaceC11767l.invoke(otpVerificationResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyOtpForDeviceVerification$lambda-17  reason: not valid java name */
    public static final void m40323verifyOtpForDeviceVerification$lambda17(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onFailure");
        Log_OC.loadImage(th, "it");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyOtpForgotPassword$lambda-0  reason: not valid java name */
    public static final void m40324verifyOtpForgotPassword$lambda0(InterfaceC11767l interfaceC11767l, ResetPinResponse resetPinResponse) {
        Log_OC.getArray(interfaceC11767l, "$onSuccess");
        Log_OC.loadImage(resetPinResponse, "it");
        interfaceC11767l.invoke(resetPinResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyOtpForgotPassword$lambda-1  reason: not valid java name */
    public static final void m40325verifyOtpForgotPassword$lambda1(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onFailure");
        Log_OC.loadImage(th, "it");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifySecondaryDetails$lambda-10  reason: not valid java name */
    public static final void m40326verifySecondaryDetails$lambda10(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$onFailure");
        Log_OC.loadImage(th, "it");
        interfaceC11767l.invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifySecondaryDetails$lambda-8  reason: not valid java name */
    public static final InterfaceC11692s m40327verifySecondaryDetails$lambda8(String str, String str2, String str3, BaseOtpUtil baseOtpUtil, User user) {
        Log_OC.getArray(str, "$email");
        Log_OC.getArray(str2, "$phone");
        Log_OC.getArray(str3, "$otp");
        Log_OC.getArray(baseOtpUtil, "this$0");
        Log_OC.getArray(user, "it");
        String $r5 = user.getSessionId();
        SecondaryDetailsRequest $r6 = new SecondaryDetailsRequest(str, str2, str3);
        VerifySecondaryDetails $r7 = baseOtpUtil.verifySecondaryDetails;
        Log_OC.loadImage($r5, "sessionId");
        AbstractC11688p $r8 = $r7.execute($r6, $r5);
        return $r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifySecondaryDetails$lambda-9  reason: not valid java name */
    public static final void m40328verifySecondaryDetails$lambda9(InterfaceC11767l interfaceC11767l, SecondaryDetailsResponse secondaryDetailsResponse) {
        Log_OC.getArray(interfaceC11767l, "$onSuccess");
        Log_OC.loadImage(secondaryDetailsResponse, "it");
        interfaceC11767l.invoke(secondaryDetailsResponse);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter requestOtpForgotPin(String str, final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(interfaceC11767l, "onSuccess");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        RequestOtp $r5 = this.requestOtp;
        ResetPinRequest $r2 = new ResetPinRequest(null, null, null, str, null, null, 55, null);
        AbstractC11688p $r6 = $r5.execute($r2);
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.register.domain.usecases.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                ResetPinResponse $r3 = (ResetPinResponse) obj;
                BaseOtpUtil.m40311requestOtpForgotPin$lambda2($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.register.domain.usecases.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                BaseOtpUtil.m40312requestOtpForgotPin$lambda3($r1, $r3);
            }
        });
        Log_OC.loadImage($r9, "requestOtp.execute(ResetPinRequest(phoneNumber = phoneNumber))\n            .subscribe(\n                {\n                    onSuccess(it)\n                },\n                {\n                    onFailure(it)\n                }\n            )");
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter requestOtpNewAccount(String str, String str2, final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(str, "registrationId");
        Log_OC.getArray(str2, "phoneNumber");
        Log_OC.getArray(interfaceC11767l, "onSuccess");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        ResendOTP $r6 = this.resendOTP;
        ResendOTPRequest $r2 = new ResendOTPRequest(str, str2);
        AbstractC11688p $r7 = $r6.execute($r2);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.register.domain.usecases.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                ResetPinResponse $r3 = (ResetPinResponse) obj;
                BaseOtpUtil.m40313requestOtpNewAccount$lambda4($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.register.domain.usecases.Comment
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                BaseOtpUtil.m40314requestOtpNewAccount$lambda5($r1, $r3);
            }
        });
        Log_OC.loadImage($r10, "resendOTP.execute(\n            ResendOTPRequest(registrationId = registrationId, phoneNumber = phoneNumber)\n        ).subscribe({ onSuccess(it) }, { onFailure(it) })");
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter sendOtpForDeviceVerification(OtpVerificationModel otpVerificationModel, final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        Log_OC.getArray(interfaceC11767l, "onSuccess");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        SendOtpForDeviceVerification $r4 = this.sendOtpForDeviceVerification;
        AbstractC11688p $r5 = $r4.execute(otpVerificationModel);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.register.domain.usecases.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                OtpVerificationModel $r3 = (OtpVerificationModel) obj;
                BaseOtpUtil.m40315sendOtpForDeviceVerification$lambda14($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.register.domain.usecases.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                BaseOtpUtil.m40316sendOtpForDeviceVerification$lambda15($r1, $r3);
            }
        });
        Log_OC.loadImage($r8, "sendOtpForDeviceVerification.execute(otpVerificationModel)\n            .subscribe(\n                { otpVerificationModelResponse ->\n                    onSuccess(otpVerificationModelResponse)\n                },\n                {\n                    onFailure(it)\n                }\n            )");
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter sendOtpForSecondaryDetailsVerification(final String str, final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(interfaceC11767l, "onSuccess");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.register.domain.usecases.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                BaseOtpUtil $r1 = BaseOtpUtil.this;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r3 = BaseOtpUtil.m40317sendOtpForSecondaryDetailsVerification$lambda11($r1, $r2, $r52);
                return $r3;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.register.domain.usecases.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                OtpVerificationModel $r3 = (OtpVerificationModel) obj;
                BaseOtpUtil.m40318sendOtpForSecondaryDetailsVerification$lambda12($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.register.domain.usecases.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                BaseOtpUtil.m40319sendOtpForSecondaryDetailsVerification$lambda13($r1, $r3);
            }
        });
        Log_OC.loadImage($r10, "fetchCurrentUser.execute().flatMapObservable {\n            resendOtp.executeSecondaryVerificationOtp(\n                OtpVerificationModel(phoneNumber = phoneNumber),\n                sessionId = it.sessionId\n            )\n        }.subscribe({ onSuccess(it) }, { onFailure(it) })");
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter verifyNewPhoneNumber(String str, String str2, final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(str, "registrationId");
        Log_OC.getArray(str2, "otp");
        Log_OC.getArray(interfaceC11767l, "onSuccess");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        ValidateNewPhoneNumber $r6 = this.validateNewPhoneNumber;
        ResetPinRequest $r2 = new ResetPinRequest(null, str, str2, null, null, null, 57, null);
        AbstractC11688p $r7 = $r6.execute($r2);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.register.domain.usecases.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                ResetPinResponse $r3 = (ResetPinResponse) obj;
                BaseOtpUtil.m40320verifyNewPhoneNumber$lambda6($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.register.domain.usecases.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                BaseOtpUtil.m40321verifyNewPhoneNumber$lambda7($r1, $r3);
            }
        });
        Log_OC.loadImage($r10, "validateNewPhoneNumber.execute(\n            ResetPinRequest(\n                registrationId = registrationId,\n                otp = otp\n            )\n        ).subscribe({ onSuccess(it) }, { onFailure(it) })");
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter verifyOtpForDeviceVerification(String str, OtpVerificationModel otpVerificationModel, final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(str, "otpCode");
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        Log_OC.getArray(interfaceC11767l, "onSuccess");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        ValidateOtp $r6 = this.validateOtp;
        String $r7 = otpVerificationModel.getLoginAttemptId();
        String $r8 = otpVerificationModel.getDeviceName();
        String $r9 = otpVerificationModel.getDeviceId();
        Input $r2 = new Input($r8, $r9);
        AbstractC11688p $r10 = $r6.execute(str, $r7, $r2);
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.register.domain.usecases.OfflineMessageManager$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                OtpVerificationResponse $r3 = (OtpVerificationResponse) obj;
                BaseOtpUtil.m40322verifyOtpForDeviceVerification$lambda16($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.register.domain.usecases.ReplaySubject$BoundedState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                BaseOtpUtil.m40323verifyOtpForDeviceVerification$lambda17($r1, $r3);
            }
        });
        Log_OC.loadImage($r13, "validateOtp.execute(\n            otpCode, otpVerificationModel.loginAttemptId,\n            Input(\n                otpVerificationModel.deviceName,\n                otpVerificationModel.deviceId\n            )\n        ).subscribe(\n            {\n                onSuccess(it)\n            },\n            {\n                onFailure(it)\n            }\n        )");
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter verifyOtpForgotPassword(String str, String str2, final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(str, "otpRequestId");
        Log_OC.getArray(str2, "otp");
        Log_OC.getArray(interfaceC11767l, "onSuccess");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        VerifyOtp $r6 = this.verifyOtp;
        ResetPinRequest $r2 = new ResetPinRequest(str, null, str2, null, null, null, 58, null);
        AbstractC11688p $r7 = $r6.execute($r2);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.register.domain.usecases.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                ResetPinResponse $r3 = (ResetPinResponse) obj;
                BaseOtpUtil.m40324verifyOtpForgotPassword$lambda0($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.register.domain.usecases.Composer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                BaseOtpUtil.m40325verifyOtpForgotPassword$lambda1($r1, $r3);
            }
        });
        Log_OC.loadImage($r10, "verifyOtp.execute(ResetPinRequest(id = otpRequestId, otp = otp))\n            .subscribe(\n                {\n                    onSuccess(it)\n                },\n                {\n                    onFailure(it)\n                }\n            )");
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter verifySecondaryDetails(final String str, final String str2, final String str3, final InterfaceC11767l interfaceC11767l, final InterfaceC11767l interfaceC11767l2) {
        Log_OC.getArray(str, "email");
        Log_OC.getArray(str2, AttributeType.PHONE);
        Log_OC.getArray(str3, "otp");
        Log_OC.getArray(interfaceC11767l, "onSuccess");
        Log_OC.getArray(interfaceC11767l2, "onFailure");
        FetchCurrentUser $r6 = this.fetchCurrentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.register.domain.usecases.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                String $r1 = str;
                String $r2 = str2;
                String $r3 = str3;
                BaseOtpUtil $r4 = this;
                User $r72 = (User) obj;
                InterfaceC11692s $r5 = BaseOtpUtil.m40327verifySecondaryDetails$lambda8($r1, $r2, $r3, $r4, $r72);
                return $r5;
            }
        });
        FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.register.domain.usecases.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                SecondaryDetailsResponse $r3 = (SecondaryDetailsResponse) obj;
                BaseOtpUtil.m40328verifySecondaryDetails$lambda9($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.register.domain.usecases.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                BaseOtpUtil.m40326verifySecondaryDetails$lambda10($r1, $r3);
            }
        });
        Log_OC.loadImage($r12, "fetchCurrentUser.execute().flatMapObservable {\n            verifySecondaryDetails.execute(\n                sessionId = it.sessionId,\n                secondaryDetailsRequest = SecondaryDetailsRequest(\n                    email = email,\n                    phoneOtp = otp,\n                    phone = phone\n                )\n            )\n        }.subscribe({ onSuccess(it) }, { onFailure(it) })");
        return $r12;
    }
}
