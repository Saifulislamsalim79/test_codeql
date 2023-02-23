package ai.kudi.agent.settings.security.p028ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.savings.data.model.RequestPinResetOtpResponse;
import ai.kudi.agent.settings.domain.package_4.ResetSavingPinRequest;
import ai.kudi.agent.settings.domain.package_4.ResetSavingPinResponse;
import ai.kudi.agent.settings.domain.useCases.ResendOtp;
import ai.kudi.agent.settings.domain.useCases.ResetSavingsPin;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.ConfirmOtpViewData;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import android.os.CountDownTimer;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: ConfirmOtpViewModel.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/viewModels/ConfirmOtpViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/ConfirmOtpViewData;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "resetSavingsPin", "Lai/kudi/agent/settings/domain/useCases/ResetSavingsPin;", "resendOtp", "Lai/kudi/agent/settings/domain/useCases/ResendOtp;", "(Lai/kudi/agent/settings/navigators/SettingsNavigator;Lai/kudi/agent/settings/domain/useCases/ResetSavingsPin;Lai/kudi/agent/settings/domain/useCases/ResendOtp;)V", "countdownTimer", "Landroid/os/CountDownTimer;", "getSettingsNavigator", "()Lai/kudi/agent/settings/navigators/SettingsNavigator;", "displaySuccessDialog", "", "initCountdownTimer", "initialData", "Lai/kudi/agent/settings/security/ui/viewModels/data/ConfirmOtpViewData$Initial;", "onCleared", "resend", "resetPin", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/settings/domain/dto/ResetSavingPinRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.viewModels.ConfirmOtpViewModel */
/* loaded from: classes.dex */
public final class ConfirmOtpViewModel extends BaseViewModel<ConfirmOtpViewData> {
    private CountDownTimer countdownTimer;
    private final ResendOtp resendOtp;
    private final ResetSavingsPin resetSavingsPin;
    private final SettingsNavigator settingsNavigator;

    public ConfirmOtpViewModel(SettingsNavigator settingsNavigator, ResetSavingsPin resetSavingsPin, ResendOtp resendOtp) {
        Log_OC.getArray(settingsNavigator, "settingsNavigator");
        Log_OC.getArray(resetSavingsPin, "resetSavingsPin");
        Log_OC.getArray(resendOtp, "resendOtp");
        this.settingsNavigator = settingsNavigator;
        this.resetSavingsPin = resetSavingsPin;
        this.resendOtp = resendOtp;
        initCountdownTimer();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initCountdownTimer() {
        ConfirmOtpViewModel$initCountdownTimer$1 $r1 = new ConfirmOtpViewModel$initCountdownTimer$1(this);
        ConfirmOtpViewModel$initCountdownTimer$2 $r2 = new ConfirmOtpViewModel$initCountdownTimer$2(this);
        CountDownTimer $r3 = RandomUtilKt.initCountDownTimer(300000L, 1000L, $r1, $r2);
        this.countdownTimer = $r3;
        if ($r3 != null) {
            $r3.start();
            return;
        }
        Log_OC.LogError("countdownTimer");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resend$lambda-2  reason: not valid java name */
    public static final void m40880resend$lambda2(ConfirmOtpViewModel confirmOtpViewModel, RequestPinResetOtpResponse requestPinResetOtpResponse) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        ConfirmOtpViewData.OTPResent $r3 = ConfirmOtpViewData.OTPResent.INSTANCE;
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resend$lambda-3  reason: not valid java name */
    public static final void m40881resend$lambda3(ConfirmOtpViewModel confirmOtpViewModel, Throwable th) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ConfirmOtpViewData.Error $r3 = new ConfirmOtpViewData.Error($r6);
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-0  reason: not valid java name */
    public static final void m40882resetPin$lambda0(ConfirmOtpViewModel confirmOtpViewModel, ResetSavingPinResponse resetSavingPinResponse) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        ConfirmOtpViewData.Success $r3 = ConfirmOtpViewData.Success.INSTANCE;
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-1  reason: not valid java name */
    public static final void m40883resetPin$lambda1(ConfirmOtpViewModel confirmOtpViewModel, Throwable th) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ConfirmOtpViewData.Error $r3 = new ConfirmOtpViewData.Error($r6);
        confirmOtpViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void displaySuccessDialog() {
        SettingsNavigator $r1 = this.settingsNavigator;
        $r1.launchSavingsPinResetSuccessDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SettingsNavigator getSettingsNavigator() {
        SettingsNavigator r1 = this.settingsNavigator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ConfirmOtpViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ConfirmOtpViewData.Initial initialData() {
        ConfirmOtpViewData.Initial r1 = ConfirmOtpViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        CountDownTimer $r1 = this.countdownTimer;
        if ($r1 != null) {
            $r1.cancel();
            super.onCleared();
            return;
        }
        Log_OC.LogError("countdownTimer");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resend() {
        initCountdownTimer();
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(true);
        publish($r2);
        ResendOtp $r3 = this.resendOtp;
        AbstractC11688p $r4 = $r3.resendPin();
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                RequestPinResetOtpResponse $r32 = (RequestPinResetOtpResponse) obj;
                ConfirmOtpViewModel.m40880resend$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ConfirmOtpViewModel.m40881resend$lambda3($r1, $r32);
            }
        });
        Log_OC.loadImage($r6, "resendOtp.resendPin().subscribe(\n            {\n                publish(ConfirmOtpViewData.ShowProgress(visibility = false))\n                publish(ConfirmOtpViewData.OTPResent)\n            },\n            {\n                publish(ConfirmOtpViewData.ShowProgress(false))\n                publish(ConfirmOtpViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resetPin(ResetSavingPinRequest resetSavingPinRequest) {
        Log_OC.getArray(resetSavingPinRequest, TransactionRequest.TYPE_REQUEST);
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(true);
        publish($r2);
        ResetSavingsPin $r3 = this.resetSavingsPin;
        AbstractC11688p $r4 = $r3.resetPin(resetSavingPinRequest);
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                ResetSavingPinResponse $r32 = (ResetSavingPinResponse) obj;
                ConfirmOtpViewModel.m40882resetPin$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ConfirmOtpViewModel.m40883resetPin$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "resetSavingsPin.resetPin(request).subscribe(\n            {\n                publish(ConfirmOtpViewData.ShowProgress(false))\n                publish(ConfirmOtpViewData.Success)\n            },\n            {\n                publish(ConfirmOtpViewData.ShowProgress(false))\n                publish(ConfirmOtpViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }
}
