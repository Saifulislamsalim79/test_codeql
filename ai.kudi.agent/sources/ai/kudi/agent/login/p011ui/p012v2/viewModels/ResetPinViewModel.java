package ai.kudi.agent.login.p011ui.p012v2.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.login.domain.usecases.SetNewPin;
import ai.kudi.agent.login.domain.wiki.ResetPinRequest;
import ai.kudi.agent.login.domain.wiki.ResetPinResponse;
import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.data.ResetPinViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: ResetPinViewModel.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/login/ui/v2/viewModels/ResetPinViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/login/ui/v2/viewModels/data/ResetPinViewData;", "setNewPin", "Lai/kudi/agent/login/domain/usecases/SetNewPin;", "forgotPasswordNavigator", "Lai/kudi/agent/login/navigators/ForgotPasswordNavigator;", "(Lai/kudi/agent/login/domain/usecases/SetNewPin;Lai/kudi/agent/login/navigators/ForgotPasswordNavigator;)V", "initialData", "inputParamsValid", "", "pin", "", "confirmPin", "submitPin", "", "phoneNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.v2.viewModels.ResetPinViewModel */
/* loaded from: classes.dex */
public final class ResetPinViewModel extends BaseViewModel<ResetPinViewData> {
    private final ForgotPasswordNavigator forgotPasswordNavigator;
    private final SetNewPin setNewPin;

    public ResetPinViewModel(SetNewPin setNewPin, ForgotPasswordNavigator forgotPasswordNavigator) {
        Log_OC.getArray(setNewPin, "setNewPin");
        Log_OC.getArray(forgotPasswordNavigator, "forgotPasswordNavigator");
        this.setNewPin = setNewPin;
        this.forgotPasswordNavigator = forgotPasswordNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean inputParamsValid(String str, String str2) {
        int $i0 = str.length();
        if ($i0 != 4) {
            ViewData $r3 = getState();
            ResetPinViewData $r4 = (ResetPinViewData) $r3;
            ResetPinViewData.Error $r5 = new ResetPinViewData.Error("PIN must be 4", null, null, 6, null);
            publish(ResetPinViewData.copy$default($r4, false, $r5, null, 5, null));
            return false;
        }
        boolean $z0 = Log_OC.append(str, str2);
        if ($z0) {
            return true;
        }
        ViewData $r32 = getState();
        ResetPinViewData $r42 = (ResetPinViewData) $r32;
        ResetPinViewData.Error $r52 = new ResetPinViewData.Error(null, "Must be same as PIN", null, 5, null);
        publish(ResetPinViewData.copy$default($r42, false, $r52, null, 5, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitPin$lambda-0  reason: not valid java name */
    public static final void m39808submitPin$lambda0(ResetPinViewModel resetPinViewModel, String str, ResetPinResponse resetPinResponse) {
        Log_OC.getArray(resetPinViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        ViewData $r3 = resetPinViewModel.getState();
        ResetPinViewData $r4 = (ResetPinViewData) $r3;
        resetPinViewModel.publish(ResetPinViewData.copy$default($r4, false, null, "Pin has been reset successfully", 2, null));
        ForgotPasswordNavigator $r5 = resetPinViewModel.forgotPasswordNavigator;
        $r5.toLoginView(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitPin$lambda-1  reason: not valid java name */
    public static final void m39809submitPin$lambda1(ResetPinViewModel resetPinViewModel, Throwable th) {
        Log_OC.getArray(resetPinViewModel, "this$0");
        ViewData $r2 = resetPinViewModel.getState();
        ResetPinViewData $r3 = (ResetPinViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError("Error setting pin. Try again.");
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        String $r7 = (String) $r6;
        ResetPinViewData.Error $r4 = new ResetPinViewData.Error(null, null, $r7, 3, null);
        resetPinViewModel.publish(ResetPinViewData.copy$default($r3, false, $r4, null, 4, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ResetPinViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ResetPinViewData initialData() {
        ResetPinViewData $r1 = new ResetPinViewData(false, null, null, 4, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitPin(final String str, String str2, String str3) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "pin");
        Log_OC.getArray(str3, "confirmPin");
        boolean $z0 = inputParamsValid(str2, str3);
        if ($z0) {
            ViewData $r5 = getState();
            ResetPinViewData $r6 = (ResetPinViewData) $r5;
            publish(ResetPinViewData.copy$default($r6, true, null, null, 4, null));
            SetNewPin $r7 = this.setNewPin;
            ResetPinRequest $r1 = new ResetPinRequest(null, null, null, str, str2, null, 39, null);
            AbstractC11688p $r8 = $r7.execute($r1);
            FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.login.ui.v2.viewModels.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    ResetPinViewModel $r12 = ResetPinViewModel.this;
                    String $r2 = str;
                    ResetPinResponse $r4 = (ResetPinResponse) obj;
                    ResetPinViewModel.m39808submitPin$lambda0($r12, $r2, $r4);
                }
            }, new Object() { // from class: ai.kudi.agent.login.ui.v2.viewModels.FileFilterUtil$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    ResetPinViewModel $r12 = ResetPinViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    ResetPinViewModel.m39809submitPin$lambda1($r12, $r3);
                }
            });
            Log_OC.loadImage($r11, "setNewPin.execute(ResetPinRequest(phoneNumber = phoneNumber, newPin = pin))\n                .subscribe(\n                    {\n                        publish(\n                            state.copy(\n                                isSubmittingPin = false,\n                                successMessage = \"Pin has been reset successfully\"\n                            )\n                        )\n                        forgotPasswordNavigator.toLoginView(phoneNumber)\n                    },\n                    {\n                        publish(\n                            state.copy(\n                                isSubmittingPin = false,\n                                error = ResetPinViewData.Error(\n                                    message = parseHttpError(\n                                        \"Error setting pin. Try again.\"\n                                    )(it)\n                                )\n                            )\n                        )\n                    }\n                )");
            C11280b $r12 = getCompositeDisposable();
            RxExtKt.addTo($r11, $r12);
        }
    }
}
