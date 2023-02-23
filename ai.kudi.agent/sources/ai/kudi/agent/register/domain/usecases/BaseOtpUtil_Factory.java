package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.login.domain.usecases.RequestOtp;
import ai.kudi.agent.login.domain.usecases.ResendOTP;
import ai.kudi.agent.login.domain.usecases.ValidateNewPhoneNumber;
import ai.kudi.agent.login.domain.usecases.VerifyOtp;
import ai.kudi.agent.login.setup.domain.SendOtpForDeviceVerification;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BaseOtpUtil_Factory implements InterfaceC9468d<BaseOtpUtil> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<RequestOtp> requestOtpProvider;
    private final InterfaceC11700a<ResendOTP> resendOTPProvider;
    private final InterfaceC11700a<ResendOtp> resendOtpProvider;
    private final InterfaceC11700a<SendOtpForDeviceVerification> sendOtpForDeviceVerificationProvider;
    private final InterfaceC11700a<ValidateNewPhoneNumber> validateNewPhoneNumberProvider;
    private final InterfaceC11700a<ValidateOtp> validateOtpProvider;
    private final InterfaceC11700a<VerifyOtp> verifyOtpProvider;
    private final InterfaceC11700a<VerifySecondaryDetails> verifySecondaryDetailsProvider;

    public BaseOtpUtil_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9) {
        this.verifyOtpProvider = interfaceC11700a;
        this.requestOtpProvider = interfaceC11700a2;
        this.validateNewPhoneNumberProvider = interfaceC11700a3;
        this.resendOTPProvider = interfaceC11700a4;
        this.resendOtpProvider = interfaceC11700a5;
        this.sendOtpForDeviceVerificationProvider = interfaceC11700a6;
        this.verifySecondaryDetailsProvider = interfaceC11700a7;
        this.validateOtpProvider = interfaceC11700a8;
        this.fetchCurrentUserProvider = interfaceC11700a9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BaseOtpUtil_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8, InterfaceC11700a interfaceC11700a9) {
        BaseOtpUtil_Factory $r9 = new BaseOtpUtil_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8, interfaceC11700a9);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BaseOtpUtil newInstance(VerifyOtp verifyOtp, RequestOtp requestOtp, ValidateNewPhoneNumber validateNewPhoneNumber, ResendOTP resendOTP, ResendOtp resendOtp, SendOtpForDeviceVerification sendOtpForDeviceVerification, VerifySecondaryDetails verifySecondaryDetails, ValidateOtp validateOtp, FetchCurrentUser fetchCurrentUser) {
        BaseOtpUtil $r9 = new BaseOtpUtil(verifyOtp, requestOtp, validateNewPhoneNumber, resendOTP, resendOtp, sendOtpForDeviceVerification, verifySecondaryDetails, validateOtp, fetchCurrentUser);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseOtpUtil multiply() {
        InterfaceC11700a $r1 = this.verifyOtpProvider;
        Object $r2 = $r1.get();
        VerifyOtp $r3 = (VerifyOtp) $r2;
        InterfaceC11700a $r12 = this.requestOtpProvider;
        Object $r22 = $r12.get();
        RequestOtp $r4 = (RequestOtp) $r22;
        InterfaceC11700a $r13 = this.validateNewPhoneNumberProvider;
        Object $r23 = $r13.get();
        ValidateNewPhoneNumber validateNewPhoneNumber = (ValidateNewPhoneNumber) $r23;
        InterfaceC11700a $r14 = this.resendOTPProvider;
        Object $r24 = $r14.get();
        ResendOTP resendOTP = (ResendOTP) $r24;
        InterfaceC11700a $r15 = this.resendOtpProvider;
        Object $r25 = $r15.get();
        ResendOtp resendOtp = (ResendOtp) $r25;
        InterfaceC11700a $r16 = this.sendOtpForDeviceVerificationProvider;
        Object $r26 = $r16.get();
        SendOtpForDeviceVerification sendOtpForDeviceVerification = (SendOtpForDeviceVerification) $r26;
        InterfaceC11700a $r17 = this.verifySecondaryDetailsProvider;
        Object $r27 = $r17.get();
        VerifySecondaryDetails $r9 = (VerifySecondaryDetails) $r27;
        InterfaceC11700a $r18 = this.validateOtpProvider;
        Object $r28 = $r18.get();
        ValidateOtp $r10 = (ValidateOtp) $r28;
        InterfaceC11700a $r19 = this.fetchCurrentUserProvider;
        Object $r29 = $r19.get();
        FetchCurrentUser $r11 = (FetchCurrentUser) $r29;
        BaseOtpUtil $r122 = newInstance($r3, $r4, validateNewPhoneNumber, resendOTP, resendOtp, sendOtpForDeviceVerification, $r9, $r10, $r11);
        return $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40329multiply() {
        BaseOtpUtil $r1 = multiply();
        return $r1;
    }
}
