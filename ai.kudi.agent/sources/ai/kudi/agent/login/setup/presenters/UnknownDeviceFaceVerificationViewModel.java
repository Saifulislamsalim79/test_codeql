package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.presentation.viewdata.KShockViewData;
import ai.kudi.agent.login.domain.wiki.FaceLoginVerificationRequest;
import ai.kudi.agent.login.navigators.PhoneVerificationNavigator;
import ai.kudi.agent.login.setup.domain.VerifyFaceForLogin;
import ai.kudi.agent.register.domain.wiki.OtpVerificationResponse;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: UnknownDeviceFaceVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/login/setup/presenters/UnknownDeviceFaceVerificationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/core/mvvm/ViewData;", "verifyFaceForLogin", "Lai/kudi/agent/login/setup/domain/VerifyFaceForLogin;", "phoneVerificationNavigator", "Lai/kudi/agent/login/navigators/PhoneVerificationNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/login/setup/domain/VerifyFaceForLogin;Lai/kudi/agent/login/navigators/PhoneVerificationNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "onFaceVerificationFailed", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getOnFaceVerificationFailed", "()Lio/reactivex/subjects/PublishSubject;", "onFaceVerified", "getOnFaceVerified", "initialData", "Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "logVerifyFaceVerification", "", "phoneNumber", "onContinueButtonAction", "performFaceVerification", "faceLoginVerificationRequest", "Lai/kudi/agent/login/domain/dto/FaceLoginVerificationRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UnknownDeviceFaceVerificationViewModel extends BaseViewModel<ViewData> {
    private final Analytics analytics;
    private final C11680b<String> onFaceVerificationFailed;
    private final C11680b<String> onFaceVerified;
    private final PhoneVerificationNavigator phoneVerificationNavigator;
    private final VerifyFaceForLogin verifyFaceForLogin;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UnknownDeviceFaceVerificationViewModel(VerifyFaceForLogin verifyFaceForLogin, PhoneVerificationNavigator phoneVerificationNavigator, Analytics analytics) {
        Log_OC.getArray(verifyFaceForLogin, "verifyFaceForLogin");
        Log_OC.getArray(phoneVerificationNavigator, "phoneVerificationNavigator");
        Log_OC.getArray(analytics, "analytics");
        this.verifyFaceForLogin = verifyFaceForLogin;
        this.phoneVerificationNavigator = phoneVerificationNavigator;
        this.analytics = analytics;
        C11680b $r4 = C11680b.m10564v0();
        Log_OC.loadImage($r4, "create<String>()");
        this.onFaceVerified = $r4;
        C11680b $r42 = C11680b.m10564v0();
        Log_OC.loadImage($r42, "create<String>()");
        this.onFaceVerificationFailed = $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logVerifyFaceVerification(String str) {
        Analytics $r2 = this.analytics;
        $r2.onVerifyFaceIdClicked(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performFaceVerification$lambda-0  reason: not valid java name */
    public static final void m39764performFaceVerification$lambda0(UnknownDeviceFaceVerificationViewModel unknownDeviceFaceVerificationViewModel, String str, OtpVerificationResponse otpVerificationResponse) {
        Log_OC.getArray(unknownDeviceFaceVerificationViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        String $r3 = otpVerificationResponse.getStatus();
        RegistrationStatus $r4 = RegistrationStatus.ALLOW;
        String $r5 = $r4.name();
        boolean $z0 = Log_OC.append($r3, $r5);
        if ($z0) {
            C11680b $r6 = unknownDeviceFaceVerificationViewModel.getOnFaceVerified();
            $r6.mo331f(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performFaceVerification$lambda-1  reason: not valid java name */
    public static final void m39765performFaceVerification$lambda1(UnknownDeviceFaceVerificationViewModel unknownDeviceFaceVerificationViewModel, FaceLoginVerificationRequest faceLoginVerificationRequest, Throwable th) {
        Log_OC.getArray(unknownDeviceFaceVerificationViewModel, "this$0");
        Log_OC.getArray(faceLoginVerificationRequest, "$faceLoginVerificationRequest");
        C11680b $r3 = unknownDeviceFaceVerificationViewModel.getOnFaceVerificationFailed();
        String $r4 = faceLoginVerificationRequest.getImageId();
        $r3.mo331f($r4);
        Timber.reorder(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnFaceVerificationFailed() {
        C11680b r1 = this.onFaceVerificationFailed;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnFaceVerified() {
        C11680b r1 = this.onFaceVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KShockViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KShockViewData initialData() {
        KShockViewData $r1 = new KShockViewData(false, null, null, null, null, null, 63, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onContinueButtonAction(String str) {
        Log_OC.getArray(str, "phoneNumber");
        PhoneVerificationNavigator $r2 = this.phoneVerificationNavigator;
        $r2.toPerformLoginView(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performFaceVerification(final FaceLoginVerificationRequest faceLoginVerificationRequest, final String str) {
        Log_OC.getArray(faceLoginVerificationRequest, "faceLoginVerificationRequest");
        Log_OC.getArray(str, "phoneNumber");
        logVerifyFaceVerification(str);
        VerifyFaceForLogin $r4 = this.verifyFaceForLogin;
        AbstractC11688p $r5 = $r4.execute(faceLoginVerificationRequest);
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.login.setup.presenters.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UnknownDeviceFaceVerificationViewModel $r1 = UnknownDeviceFaceVerificationViewModel.this;
                String $r2 = str;
                OtpVerificationResponse $r42 = (OtpVerificationResponse) obj;
                UnknownDeviceFaceVerificationViewModel.m39764performFaceVerification$lambda0($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.login.setup.presenters.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UnknownDeviceFaceVerificationViewModel $r1 = UnknownDeviceFaceVerificationViewModel.this;
                FaceLoginVerificationRequest $r2 = faceLoginVerificationRequest;
                Throwable $r42 = (Throwable) obj;
                UnknownDeviceFaceVerificationViewModel.m39765performFaceVerification$lambda1($r1, $r2, $r42);
            }
        });
        Log_OC.loadImage($r7, "verifyFaceForLogin.execute(faceLoginVerificationRequest).subscribe(\n            {\n                if (it.status == RegistrationStatus.ALLOW.name) {\n                    onFaceVerified.onNext(phoneNumber)\n                }\n            },\n            {\n                onFaceVerificationFailed.onNext(faceLoginVerificationRequest.imageId)\n                Timber.e(it)\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }
}
