package ai.kudi.agent.settings.security.p028ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.domain.package_4.RequestPinResetOtpResponse;
import ai.kudi.agent.settings.domain.useCases.RequestPinResetOtp;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.security.p028ui.viewModels.data.ResetSavingPinViewData;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: ResetSavingPinViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/viewModels/ResetSavingPinViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/security/ui/viewModels/data/ResetSavingPinViewData;", "requestOtp", "Lai/kudi/agent/settings/domain/useCases/RequestPinResetOtp;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "(Lai/kudi/agent/settings/domain/useCases/RequestPinResetOtp;Lai/kudi/agent/settings/navigators/SettingsNavigator;)V", "initialData", "Lai/kudi/agent/settings/security/ui/viewModels/data/ResetSavingPinViewData$Initial;", "navigateToConfirmOtp", "", "mobile", "", "pin", "sendOtp", "validateInput", "confirmPin", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.viewModels.ResetSavingPinViewModel */
/* loaded from: classes.dex */
public final class ResetSavingPinViewModel extends BaseViewModel<ResetSavingPinViewData> {
    private final RequestPinResetOtp requestOtp;
    private final SettingsNavigator settingsNavigator;

    public ResetSavingPinViewModel(RequestPinResetOtp requestPinResetOtp, SettingsNavigator settingsNavigator) {
        Log_OC.getArray(requestPinResetOtp, "requestOtp");
        Log_OC.getArray(settingsNavigator, "settingsNavigator");
        this.requestOtp = requestPinResetOtp;
        this.settingsNavigator = settingsNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void sendOtp(final String str) {
        ResetSavingPinViewData.ShowProgress $r2 = new ResetSavingPinViewData.ShowProgress(true);
        publish($r2);
        RequestPinResetOtp $r3 = this.requestOtp;
        AbstractC11688p $r4 = $r3.requestOtp();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ResetSavingPinViewModel $r1 = ResetSavingPinViewModel.this;
                String $r22 = str;
                RequestPinResetOtpResponse $r42 = (RequestPinResetOtpResponse) obj;
                ResetSavingPinViewModel.m40892sendOtp$lambda0($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.security.ui.viewModels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ResetSavingPinViewModel $r1 = ResetSavingPinViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ResetSavingPinViewModel.m40893sendOtp$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "requestOtp.requestOtp().subscribe(\n            {\n                publish(ResetSavingPinViewData.ShowProgress(false))\n                navigateToConfirmOtp(it.phoneNumber, pin)\n            },\n            {\n                publish(ResetSavingPinViewData.ShowProgress(false))\n                publish(ResetSavingPinViewData.Error(error = parseHttpError2()(it)))\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtp$lambda-0  reason: not valid java name */
    public static final void m40892sendOtp$lambda0(ResetSavingPinViewModel resetSavingPinViewModel, String str, RequestPinResetOtpResponse requestPinResetOtpResponse) {
        Log_OC.getArray(resetSavingPinViewModel, "this$0");
        Log_OC.getArray(str, "$pin");
        ResetSavingPinViewData.ShowProgress $r4 = new ResetSavingPinViewData.ShowProgress(false);
        resetSavingPinViewModel.publish($r4);
        String $r2 = requestPinResetOtpResponse.getPhoneNumber();
        resetSavingPinViewModel.navigateToConfirmOtp($r2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendOtp$lambda-1  reason: not valid java name */
    public static final void m40893sendOtp$lambda1(ResetSavingPinViewModel resetSavingPinViewModel, Throwable th) {
        Log_OC.getArray(resetSavingPinViewModel, "this$0");
        ResetSavingPinViewData.ShowProgress $r2 = new ResetSavingPinViewData.ShowProgress(false);
        resetSavingPinViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        ResetSavingPinViewData.Error $r3 = new ResetSavingPinViewData.Error(null, null, (String) $r5, 3, null);
        resetSavingPinViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ResetSavingPinViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ResetSavingPinViewData.Initial initialData() {
        ResetSavingPinViewData.Initial r1 = ResetSavingPinViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToConfirmOtp(String str, String str2) {
        Log_OC.getArray(str, "mobile");
        Log_OC.getArray(str2, "pin");
        SettingsNavigator $r3 = this.settingsNavigator;
        $r3.navigateToConfirmOtpFragment(str, str2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void validateInput(String str, String str2) {
        boolean $z0;
        boolean $z02;
        Log_OC.getArray(str, "pin");
        Log_OC.getArray(str2, "confirmPin");
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ResetSavingPinViewData.Error $r3 = new ResetSavingPinViewData.Error("Please enter your new pin", null, null, 6, null);
            publish($r3);
            return;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ResetSavingPinViewData.Error $r32 = new ResetSavingPinViewData.Error(null, "Please confirm your new pin", null, 5, null);
            publish($r32);
            return;
        }
        boolean $z03 = Log_OC.append(str, str2);
        if ($z03) {
            sendOtp(str);
            return;
        }
        ResetSavingPinViewData.Error $r33 = new ResetSavingPinViewData.Error("Both pins must be the same", null, null, 6, null);
        publish($r33);
    }
}
