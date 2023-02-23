package ai.kudi.agent.core.network;

import ai.kudi.agent.login.domain.wiki.CreateTempAgentRequest;
import ai.kudi.agent.login.domain.wiki.FaceLoginVerificationRequest;
import ai.kudi.agent.login.domain.wiki.LoginRequest;
import ai.kudi.agent.login.domain.wiki.ResendOTPRequest;
import ai.kudi.agent.login.domain.wiki.ResetPinRequest;
import ai.kudi.agent.login.domain.wiki.UpdateBvnRequest;
import ai.kudi.agent.login.model.VerifyBvnWithDobRequest;
import ai.kudi.agent.register.domain.usecases.Input;
import ai.kudi.agent.register.domain.wiki.BvnVerificationRequest;
import ai.kudi.agent.register.domain.wiki.IdVerificationRequest;
import ai.kudi.agent.register.domain.wiki.LookUpBvnAndVerifyPhoneRequest;
import ai.kudi.agent.register.domain.wiki.OnboardMerchantRequest;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModelBvn;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.PhoneVerificationRequest;
import ai.kudi.agent.register.domain.wiki.SecondaryDetailsRequest;
import ai.kudi.agent.register.domain.wiki.UserRegInfo;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: OnboardingApi.kt */
@Metadata(m10422d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\nH'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0011H'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0018H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u001aH'J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u001aH'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001a\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\r0\u0003H'J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0013\u001a\u00020$H'J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010&\u001a\u00020'2\b\b\u0001\u0010\u0012\u001a\u00020\nH'J\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010*\u001a\u00020+H'J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0018H'J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0013\u001a\u00020.H'J$\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\r000\u00032\b\b\u0001\u00102\u001a\u000201H'J.\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\r000\u00032\b\b\u0001\u00103\u001a\u00020\n2\b\b\u0001\u00102\u001a\u000201H'J\"\u00104\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u00102\u001a\u000201H'J\u0018\u00105\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u00102\u001a\u000201H'J\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u00107\u001a\u00020\nH'J4\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\r0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0014\b\u0001\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0;H'J(\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\r0\u00032\b\b\u0001\u00103\u001a\u00020\n2\b\b\u0001\u0010>\u001a\u00020?H'J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0018H'J\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010B\u001a\u00020CH'J2\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)000\u00032\b\b\u0001\u0010E\u001a\u00020\n2\b\b\u0001\u00103\u001a\u00020\n2\b\b\u0001\u0010F\u001a\u00020GH'J\u001e\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I000\u00032\b\b\u0001\u0010J\u001a\u00020KH'J\"\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u00107\u001a\u00020\n2\b\b\u0001\u0010E\u001a\u00020\nH'J \u0010M\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\r0\u00032\b\b\u0001\u0010N\u001a\u00020OH'J\"\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010R\u001a\u00020O2\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010R\u001a\u00020OH'J\"\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u00107\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0018H'J\u001e\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\r0\u00032\b\b\u0001\u0010W\u001a\u00020XH'J\u0018\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u00032\b\b\u0001\u0010[\u001a\u00020\\H'J(\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\r0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010_\u001a\u00020`H'J\u0018\u0010a\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u00102\u001a\u000201H'¨\u0006b"}, m10421d2 = {"Lai/kudi/agent/core/network/OnboardingApi;", "", "bvnLookUpAndVerifyPhoneNewAgent", "Lio/reactivex/Observable;", "Lai/kudi/agent/register/domain/dto/LookUpBvnAndVerifyPhoneResponse;", "lookUpBvnAndVerifyPhoneRequest", "Lai/kudi/agent/register/domain/dto/LookUpBvnAndVerifyPhoneRequest;", "bvnLookupExistingAgent", "Lai/kudi/agent/register/domain/dto/BvnLookUpResponse;", PhoneFragment.ARG_BVN, "", "sessionId", "checkBvnExistence", "Lai/kudi/agent/core/network/response/APIResponse;", "", "identityNumber", "completeAgentRegistration", "Lai/kudi/agent/register/domain/dto/PersonalInfo;", "registrationId", TransactionRequest.TYPE_REQUEST, "completeUserRegistration", "Lai/kudi/agent/register/domain/dto/UserRegInfo;", "createResetPin", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;", "Lai/kudi/agent/login/domain/dto/ResetPinRequest;", "createTempAgent", "Lai/kudi/agent/login/domain/dto/CreateTempAgentRequest;", "createTempAgentV2", "Lai/kudi/agent/login/domain/dto/CreateTempAgentResponse;", "fetchTodos", "Lai/kudi/agent/postRegistrationSetUp/data/TodoResponse;", "getBusinessCategories", "", "Lai/kudi/agent/register/domain/dto/BusinessCategoryData;", "login", "Lai/kudi/agent/login/domain/dto/LoginResponse;", "Lai/kudi/agent/login/domain/dto/LoginRequest;", "onboardMerchant", "onboardMerchantRequest", "Lai/kudi/agent/register/domain/dto/OnboardMerchantRequest;", "performFaceDeviceAuthorization", "Lai/kudi/agent/register/domain/dto/OtpVerificationResponse;", "faceLoginVerificationRequest", "Lai/kudi/agent/login/domain/dto/FaceLoginVerificationRequest;", "receiveVoiceCall", "resendOTP", "Lai/kudi/agent/login/domain/dto/ResendOTPRequest;", "resendOtp", "Lretrofit2/Response;", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "otpVerificationModel", "loginAttemptId", "sendOtp", "sendOtpForDeviceVerification", "sendVoiceOtpForPinResent", "pinResetId", "switchCustomerType", "Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "params", "", "updateBvn", "Lai/kudi/agent/register/domain/dto/UpdateBvnModel;", "updateBvnRequest", "Lai/kudi/agent/login/domain/dto/UpdateBvnRequest;", "updateResetPin", "validateBvnWithDob", "verifyBvnWithDobRequest", "Lai/kudi/agent/login/model/VerifyBvnWithDobRequest;", "validateOtp", "otpCode", MetricTracker.Object.INPUT, "Lai/kudi/agent/register/domain/usecases/Input;", "validateOtpForBvn", "Lai/kudi/agent/register/domain/dto/OtpVerificationBvnResponse;", "otpVerificationModelBvn", "Lai/kudi/agent/register/domain/dto/OtpVerificationModelBvn;", "validateOtpForResetPin", "verifyBvn", "bvnVerificationRequest", "Lai/kudi/agent/register/domain/dto/BvnVerificationRequest;", "verifyBvnExistingAgent", "Lai/kudi/agent/register/domain/dto/BvnVerificationResponse;", "bvnVerificationV3Request", "verifyBvnNewAgentV3", "verifyOtpForNewAccount", "verifyPendingUserId", "Lai/kudi/agent/register/domain/dto/Data;", "idVerificationRequest", "Lai/kudi/agent/register/domain/dto/IdVerificationRequest;", "verifyPhone", "Lai/kudi/agent/register/domain/dto/PhoneVerificationResponse;", "phoneVerificationRequest", "Lai/kudi/agent/register/domain/dto/PhoneVerificationRequest;", "verifySecondaryDetails", "Lai/kudi/agent/register/domain/dto/SecondaryDetailsResponse;", "secondaryInfoRequest", "Lai/kudi/agent/register/domain/dto/SecondaryDetailsRequest;", "voiceCall", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OnboardingApi {
    AbstractC11688p bvnLookUpAndVerifyPhoneNewAgent(LookUpBvnAndVerifyPhoneRequest lookUpBvnAndVerifyPhoneRequest);

    AbstractC11688p bvnLookupExistingAgent(String str, String str2);

    AbstractC11688p checkBvnExistence(String str);

    AbstractC11688p completeAgentRegistration(String str, PersonalInfo personalInfo);

    AbstractC11688p completeUserRegistration(UserRegInfo userRegInfo);

    AbstractC11688p createResetPin(ResetPinRequest resetPinRequest);

    AbstractC11688p createTempAgent(CreateTempAgentRequest createTempAgentRequest);

    AbstractC11688p createTempAgentV2(CreateTempAgentRequest createTempAgentRequest);

    AbstractC11688p fetchTodos(String str);

    AbstractC11688p getBusinessCategories();

    AbstractC11688p login(LoginRequest loginRequest);

    AbstractC11688p onboardMerchant(OnboardMerchantRequest onboardMerchantRequest, String str);

    AbstractC11688p performFaceDeviceAuthorization(FaceLoginVerificationRequest faceLoginVerificationRequest);

    AbstractC11688p receiveVoiceCall(ResetPinRequest resetPinRequest);

    AbstractC11688p resendOTP(ResendOTPRequest resendOTPRequest);

    AbstractC11688p resendOtp(OtpVerificationModel otpVerificationModel);

    AbstractC11688p resendOtp(String str, OtpVerificationModel otpVerificationModel);

    AbstractC11688p sendOtp(String str, OtpVerificationModel otpVerificationModel);

    AbstractC11688p sendOtpForDeviceVerification(OtpVerificationModel otpVerificationModel);

    AbstractC11688p sendVoiceOtpForPinResent(String str);

    AbstractC11688p switchCustomerType(String str, Map map);

    AbstractC11688p updateBvn(String str, UpdateBvnRequest updateBvnRequest);

    AbstractC11688p updateResetPin(ResetPinRequest resetPinRequest);

    AbstractC11688p validateBvnWithDob(VerifyBvnWithDobRequest verifyBvnWithDobRequest);

    AbstractC11688p validateOtp(String str, String str2, Input input);

    AbstractC11688p validateOtpForBvn(OtpVerificationModelBvn otpVerificationModelBvn);

    AbstractC11688p validateOtpForResetPin(String str, String str2);

    AbstractC11688p verifyBvn(BvnVerificationRequest bvnVerificationRequest);

    AbstractC11688p verifyBvnExistingAgent(BvnVerificationRequest bvnVerificationRequest, String str);

    AbstractC11688p verifyBvnNewAgentV3(BvnVerificationRequest bvnVerificationRequest);

    AbstractC11688p verifyOtpForNewAccount(String str, ResetPinRequest resetPinRequest);

    AbstractC11688p verifyPendingUserId(IdVerificationRequest idVerificationRequest);

    AbstractC11688p verifyPhone(PhoneVerificationRequest phoneVerificationRequest);

    AbstractC11688p verifySecondaryDetails(String str, SecondaryDetailsRequest secondaryDetailsRequest);

    AbstractC11688p voiceCall(OtpVerificationModel otpVerificationModel);
}
