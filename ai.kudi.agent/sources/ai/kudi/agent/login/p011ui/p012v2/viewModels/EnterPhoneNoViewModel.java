package ai.kudi.agent.login.p011ui.p012v2.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.login.domain.usecases.RequestOtp;
import ai.kudi.agent.login.domain.wiki.ResetPinRequest;
import ai.kudi.agent.login.domain.wiki.ResetPinResponse;
import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.data.EnterPhoneNoViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: EnterPhoneNoViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/login/ui/v2/viewModels/EnterPhoneNoViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/login/ui/v2/viewModels/data/EnterPhoneNoViewData;", "requestOtp", "Lai/kudi/agent/login/domain/usecases/RequestOtp;", "forgotPasswordNavigator", "Lai/kudi/agent/login/navigators/ForgotPasswordNavigator;", "(Lai/kudi/agent/login/domain/usecases/RequestOtp;Lai/kudi/agent/login/navigators/ForgotPasswordNavigator;)V", "initialData", "inputParamsValid", "", "phoneNumber", "", "navigateToLoginView", "", "sendOtpFor", "sendOtpRequest", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.v2.viewModels.EnterPhoneNoViewModel */
/* loaded from: classes.dex */
public final class EnterPhoneNoViewModel extends BaseViewModel<EnterPhoneNoViewData> {
    private final ForgotPasswordNavigator forgotPasswordNavigator;
    private final RequestOtp requestOtp;

    public EnterPhoneNoViewModel(RequestOtp requestOtp, ForgotPasswordNavigator forgotPasswordNavigator) {
        Log_OC.getArray(requestOtp, "requestOtp");
        Log_OC.getArray(forgotPasswordNavigator, "forgotPasswordNavigator");
        this.requestOtp = requestOtp;
        this.forgotPasswordNavigator = forgotPasswordNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean inputParamsValid(String str) {
        boolean $z0;
        $z0 = C13276s.m5440u(str);
        if (!$z0) {
            boolean $z02 = StringExtKt.isNigerianPhoneNumber(str);
            if ($z02) {
                return true;
            }
        }
        ViewData $r2 = getState();
        EnterPhoneNoViewData $r3 = (EnterPhoneNoViewData) $r2;
        EnterPhoneNoViewData.Error $r4 = new EnterPhoneNoViewData.Error("Enter valid phone number", null, 2, null);
        publish(EnterPhoneNoViewData.copy$default($r3, false, $r4, 1, null));
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void sendOtpRequest(final String str) {
        RequestOtp $r3 = this.requestOtp;
        ResetPinRequest $r1 = new ResetPinRequest(null, null, null, str, null, null, 55, null);
        AbstractC11688p $r4 = $r3.execute($r1);
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.login.ui.v2.viewModels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EnterPhoneNoViewModel $r12 = EnterPhoneNoViewModel.this;
                String $r2 = str;
                ResetPinResponse $r42 = (ResetPinResponse) obj;
                EnterPhoneNoViewModel.m39804sendOtpRequest$lambda0($r12, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.login.ui.v2.viewModels.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EnterPhoneNoViewModel $r12 = EnterPhoneNoViewModel.this;
                Throwable $r32 = (Throwable) obj;
                EnterPhoneNoViewModel.m39805sendOtpRequest$lambda1($r12, $r32);
            }
        });
        Log_OC.loadImage($r7, "requestOtp.execute(ResetPinRequest(phoneNumber = phoneNumber))\n            .subscribe(\n                {\n                    publish(state.copy(isOtpSending = false, error = null))\n                    forgotPasswordNavigator.toEnterOtpView(\n                        OtpFragmentData(\n                            otpData = OtpData(\n                                phoneNumber = phoneNumber,\n                                expiryInSeconds = it.expiresInSeconds ?: 300,\n                                otpRequestId = it.pinResetId ?: \"\"\n                            )\n                        )\n                    )\n                },\n                {\n                    publish(\n                        state.copy(\n                            isOtpSending = false,\n                            error = EnterPhoneNoViewData.Error(\n                                message = parseHttpError(\"Try again please.\")(it)\n                            )\n                        )\n                    )\n                }\n            )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtpRequest$lambda-0  reason: not valid java name */
    public static final void m39804sendOtpRequest$lambda0(EnterPhoneNoViewModel enterPhoneNoViewModel, String str, ResetPinResponse resetPinResponse) {
        Log_OC.getArray(enterPhoneNoViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        ViewData $r4 = enterPhoneNoViewModel.getState();
        EnterPhoneNoViewData $r5 = (EnterPhoneNoViewData) $r4;
        enterPhoneNoViewModel.publish($r5.copy(false, null));
        ForgotPasswordNavigator $r6 = enterPhoneNoViewModel.forgotPasswordNavigator;
        Long $r8 = resetPinResponse.getExpiresInSeconds();
        long $l0 = $r8 == null ? 300L : $r8.longValue();
        String $r9 = resetPinResponse.getPinResetId();
        String $r10 = $r9;
        if ($r9 == null) {
            $r10 = "";
        }
        OtpData $r7 = new OtpData(str, $l0, $r10, null, 8, null);
        OtpFragmentData $r0 = new OtpFragmentData(null, false, $r7, null, null, false, false, null, false, 507, null);
        $r6.toEnterOtpView($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtpRequest$lambda-1  reason: not valid java name */
    public static final void m39805sendOtpRequest$lambda1(EnterPhoneNoViewModel enterPhoneNoViewModel, Throwable th) {
        Log_OC.getArray(enterPhoneNoViewModel, "this$0");
        ViewData $r3 = enterPhoneNoViewModel.getState();
        EnterPhoneNoViewData $r4 = (EnterPhoneNoViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError("Try again please.");
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        String $r7 = (String) $r6;
        EnterPhoneNoViewData.Error $r1 = new EnterPhoneNoViewData.Error(null, $r7, 1, null);
        enterPhoneNoViewModel.publish($r4.copy(false, $r1));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        EnterPhoneNoViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public EnterPhoneNoViewData initialData() {
        EnterPhoneNoViewData $r1 = new EnterPhoneNoViewData(false, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToLoginView(String str) {
        Log_OC.getArray(str, "phoneNumber");
        ForgotPasswordNavigator $r2 = this.forgotPasswordNavigator;
        $r2.toLoginView(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendOtpFor(String str) {
        Log_OC.getArray(str, "phoneNumber");
        boolean $z0 = inputParamsValid(str);
        if ($z0) {
            ViewData $r2 = getState();
            EnterPhoneNoViewData $r3 = (EnterPhoneNoViewData) $r2;
            publish($r3.copy(true, null));
            sendOtpRequest(str);
        }
    }
}
