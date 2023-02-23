package ai.kudi.agent.login.setup.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.login.navigators.PhoneVerificationNavigator;
import ai.kudi.agent.login.setup.viewModels.data.NewDeviceVerificationViewData;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: NewDeviceVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\fH\u0014J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/login/setup/viewModels/NewDeviceVerificationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/login/setup/viewModels/data/NewDeviceVerificationViewData;", "baseOtpUtil", "Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;", "phoneVerificationNavigator", "Lai/kudi/agent/login/navigators/PhoneVerificationNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;Lai/kudi/agent/login/navigators/PhoneVerificationNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "initialData", "logPhoneNumberVerification", "", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "logVerifyFaceVerification", "phoneNumber", "", "onCleared", "sendOtp", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NewDeviceVerificationViewModel extends BaseViewModel<NewDeviceVerificationViewData> {
    private final Analytics analytics;
    private final BaseOtpUtil baseOtpUtil;
    private final PhoneVerificationNavigator phoneVerificationNavigator;

    public NewDeviceVerificationViewModel(BaseOtpUtil baseOtpUtil, PhoneVerificationNavigator phoneVerificationNavigator, Analytics analytics) {
        Log_OC.getArray(baseOtpUtil, "baseOtpUtil");
        Log_OC.getArray(phoneVerificationNavigator, "phoneVerificationNavigator");
        Log_OC.getArray(analytics, "analytics");
        this.baseOtpUtil = baseOtpUtil;
        this.phoneVerificationNavigator = phoneVerificationNavigator;
        this.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ NewDeviceVerificationViewData access$getState(NewDeviceVerificationViewModel newDeviceVerificationViewModel) {
        ViewData $r0 = newDeviceVerificationViewModel.getState();
        NewDeviceVerificationViewData $r2 = (NewDeviceVerificationViewData) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logPhoneNumberVerification(OtpVerificationModel otpVerificationModel) {
        boolean $z0 = otpVerificationModel.getSendToSecondaryNumber();
        if ($z0) {
            Analytics $r2 = this.analytics;
            String $r3 = otpVerificationModel.getPhoneNumber();
            $r2.onSecondaryPhoneNumberVerificationClicked($r3);
            return;
        }
        Analytics $r22 = this.analytics;
        String $r32 = otpVerificationModel.getPhoneNumber();
        $r22.onPrimaryPhoneVerificationClicked($r32);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        NewDeviceVerificationViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public NewDeviceVerificationViewData initialData() {
        NewDeviceVerificationViewData $r1 = new NewDeviceVerificationViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logVerifyFaceVerification(String str) {
        Log_OC.getArray(str, "phoneNumber");
        Analytics $r2 = this.analytics;
        $r2.onVerifyFaceIdClicked(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        C11280b $r1 = getCompositeDisposable();
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendOtp(OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
        ViewData $r2 = getState();
        NewDeviceVerificationViewData $r3 = (NewDeviceVerificationViewData) $r2;
        publish(NewDeviceVerificationViewData.copy$default($r3, true, null, null, 2, null));
        logPhoneNumberVerification(otpVerificationModel);
        BaseOtpUtil $r4 = this.baseOtpUtil;
        NewDeviceVerificationViewModel$sendOtp$1 $r5 = new NewDeviceVerificationViewModel$sendOtp$1(this, otpVerificationModel);
        NewDeviceVerificationViewModel$sendOtp$2 $r6 = new NewDeviceVerificationViewModel$sendOtp$2(this);
        FavoritesArrayAdapter $r7 = $r4.sendOtpForDeviceVerification(otpVerificationModel, $r5, $r6);
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }
}
