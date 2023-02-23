package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.domain.usecases.ResendOtp;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.navigators.EmailVerificationNavigator;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.EmailVerificationViewData;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.VerificationError;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: EmailVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/EmailVerificationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/EmailVerificationViewData;", "resendOtp", "Lai/kudi/agent/register/domain/usecases/ResendOtp;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "emailVerificationNavigator", "Lai/kudi/agent/register/navigators/EmailVerificationNavigator;", "(Lai/kudi/agent/register/domain/usecases/ResendOtp;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/register/navigators/EmailVerificationNavigator;)V", "initialData", "isInputParamsValid", "", "phoneNumber", "", "emailAddress", "sendOtp", "", "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.EmailVerificationViewModel */
/* loaded from: classes.dex */
public final class EmailVerificationViewModel extends BaseViewModel<EmailVerificationViewData> {
    private final Analytics analytics;
    private final EmailVerificationNavigator emailVerificationNavigator;
    private final FetchCurrentUser fetchCurrentUser;
    private final ResendOtp resendOtp;

    public EmailVerificationViewModel(ResendOtp resendOtp, FetchCurrentUser fetchCurrentUser, Analytics analytics, EmailVerificationNavigator emailVerificationNavigator) {
        Log_OC.getArray(resendOtp, "resendOtp");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(emailVerificationNavigator, "emailVerificationNavigator");
        this.resendOtp = resendOtp;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.emailVerificationNavigator = emailVerificationNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isInputParamsValid(String str, String str2) {
        boolean $z0;
        boolean $z02;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r3 = getState();
            EmailVerificationViewData $r4 = (EmailVerificationViewData) $r3;
            VerificationError $r5 = new VerificationError(null, "Phone number cannot be blank", null, 5, null);
            publish(EmailVerificationViewData.copy$default($r4, false, null, $r5, 3, null));
            return false;
        }
        boolean $z03 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z03) {
            ViewData $r32 = getState();
            EmailVerificationViewData $r42 = (EmailVerificationViewData) $r32;
            VerificationError $r52 = new VerificationError(null, "Invalid Phone number", null, 5, null);
            publish(EmailVerificationViewData.copy$default($r42, false, null, $r52, 3, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r33 = getState();
            EmailVerificationViewData $r43 = (EmailVerificationViewData) $r33;
            VerificationError $r53 = new VerificationError(null, null, "Email Address cannot be empty", 3, null);
            publish(EmailVerificationViewData.copy$default($r43, false, null, $r53, 3, null));
            return false;
        }
        boolean $z04 = StringExtKt.isValidEmail(str2);
        if ($z04) {
            return true;
        }
        ViewData $r34 = getState();
        EmailVerificationViewData $r44 = (EmailVerificationViewData) $r34;
        VerificationError $r54 = new VerificationError(null, null, "Invalid Email Address", 3, null);
        publish(EmailVerificationViewData.copy$default($r44, false, null, $r54, 3, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtp$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40472sendOtp$lambda0(EmailVerificationViewModel emailVerificationViewModel, String str, User user) {
        Log_OC.getArray(emailVerificationViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(user, "it");
        ResendOtp $r3 = emailVerificationViewModel.resendOtp;
        OtpVerificationModel $r4 = new OtpVerificationModel(str, null, null, 0L, 0L, false, null, null, null, null, null, false, null, 8190, null);
        String $r1 = user.getSessionId();
        Log_OC.loadImage($r1, "it.sessionId");
        AbstractC11688p $r5 = $r3.executeSecondaryVerificationOtp($r4, $r1);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtp$lambda-1  reason: not valid java name */
    public static final void m40473sendOtp$lambda1(EmailVerificationViewModel emailVerificationViewModel, String str, String str2, CompleteRegistrationData completeRegistrationData, OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(emailVerificationViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(str2, "$emailAddress");
        Log_OC.getArray(completeRegistrationData, "$completeRegistrationData");
        ViewData $r6 = emailVerificationViewModel.getState();
        EmailVerificationViewData $r7 = (EmailVerificationViewData) $r6;
        emailVerificationViewModel.publish(EmailVerificationViewData.copy$default($r7, false, otpVerificationModel, null, 4, null));
        Analytics $r8 = emailVerificationViewModel.analytics;
        $r8.onSecondaryPhoneNumberProvided(str);
        String $r10 = otpVerificationModel.getRegistrationId();
        long $l0 = otpVerificationModel.getExpiresInSeconds();
        OtpData $r5 = new OtpData(str, $l0, $r10, null, 8, null);
        OtpFragmentData $r9 = new OtpFragmentData(null, false, $r5, null, null, false, false, null, false, 475, null);
        EmailVerificationNavigator $r11 = emailVerificationViewModel.emailVerificationNavigator;
        $r11.toEnterOtpView($r9, str2, completeRegistrationData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtp$lambda-2  reason: not valid java name */
    public static final void m40474sendOtp$lambda2(EmailVerificationViewModel emailVerificationViewModel, Throwable th) {
        Log_OC.getArray(emailVerificationViewModel, "this$0");
        ViewData $r2 = emailVerificationViewModel.getState();
        EmailVerificationViewData $r3 = (EmailVerificationViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Couldn't send otp", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        VerificationError $r4 = new VerificationError((String) $r6, null, null, 6, null);
        emailVerificationViewModel.publish(EmailVerificationViewData.copy$default($r3, false, null, $r4, 2, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        EmailVerificationViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public EmailVerificationViewData initialData() {
        EmailVerificationViewData $r1 = new EmailVerificationViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendOtp(final String str, final String str2, final CompleteRegistrationData completeRegistrationData) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "emailAddress");
        Log_OC.getArray(completeRegistrationData, "completeRegistrationData");
        boolean $z0 = isInputParamsValid(str, str2);
        if ($z0) {
            ViewData $r4 = getState();
            EmailVerificationViewData $r5 = (EmailVerificationViewData) $r4;
            publish(EmailVerificationViewData.copy$default($r5, true, null, null, 2, null));
            FetchCurrentUser $r6 = this.fetchCurrentUser;
            AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
            AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.register.v2.ui.viewModels.b
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    EmailVerificationViewModel $r1 = EmailVerificationViewModel.this;
                    String $r2 = str;
                    User $r52 = (User) obj;
                    InterfaceC11692s $r3 = EmailVerificationViewModel.m40472sendOtp$lambda0($r1, $r2, $r52);
                    return $r3;
                }
            });
            FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.LayoutManager
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    EmailVerificationViewModel $r1 = EmailVerificationViewModel.this;
                    String $r2 = str;
                    String $r3 = str2;
                    CompleteRegistrationData $r42 = completeRegistrationData;
                    OtpVerificationModel $r62 = (OtpVerificationModel) obj;
                    EmailVerificationViewModel.m40473sendOtp$lambda1($r1, $r2, $r3, $r42, $r62);
                }
            }, new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.InBandBytestreamSession$IBBDataPacketFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    EmailVerificationViewModel $r1 = EmailVerificationViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    EmailVerificationViewModel.m40474sendOtp$lambda2($r1, $r3);
                }
            });
            Log_OC.loadImage($r12, "fetchCurrentUser.execute().flatMapObservable {\n            resendOtp.executeSecondaryVerificationOtp(\n                otpVerificationModel = OtpVerificationModel(phoneNumber = phoneNumber),\n                sessionId = it.sessionId\n            )\n        }.subscribe(\n            {\n                publish(state.copy(isSendingOtp = false, otpVerificationModel = it))\n                analytics.onSecondaryPhoneNumberProvided(phoneNumber)\n                val otpFragmentData = OtpFragmentData(\n                    otpData = OtpData(\n                        phoneNumber = phoneNumber,\n                        otpRequestId = it.registrationId,\n                        expiryInSeconds = it.expiresInSeconds\n                    ),\n                    showBottomView = false\n                )\n\n                emailVerificationNavigator.toEnterOtpView(\n                    otpFragmentData,\n                    emailAddress,\n                    completeRegistrationData\n                )\n\n            },\n            {\n                publish(\n                    state.copy(\n                        isSendingOtp = false,\n                        verificationError = VerificationError(\n                            error = parseHttpError2(\"Couldn't send otp\")(\n                                it\n                            )\n                        )\n                    )\n                )\n            }\n        )");
            C11280b $r13 = getCompositeDisposable();
            RxExtKt.addTo($r12, $r13);
        }
    }
}
