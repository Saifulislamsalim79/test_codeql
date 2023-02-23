package ai.kudi.agent.login.p011ui.p012v2.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.login.navigators.ForgotPasswordNavigator;
import ai.kudi.agent.login.p011ui.p012v2.viewModels.data.ForgotPasswordViewData;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: ForgotPasswordViewModel.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/login/ui/v2/viewModels/ForgotPasswordViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/login/ui/v2/viewModels/data/ForgotPasswordViewData;", "baseOtpUtil", "Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;", "forgotPasswordNavigator", "Lai/kudi/agent/login/navigators/ForgotPasswordNavigator;", "(Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;Lai/kudi/agent/login/navigators/ForgotPasswordNavigator;)V", "requestOtpDisposable", "Lio/reactivex/disposables/Disposable;", "verifyForgotPasswordDisposable", "initialData", "onCleared", "", "requestOtpForgotPin", "phoneNumber", "", "verifyOtpForgotPassword", "otpRequestId", "otp", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.v2.viewModels.ForgotPasswordViewModel */
/* loaded from: classes.dex */
public final class ForgotPasswordViewModel extends BaseViewModel<ForgotPasswordViewData> {
    private final BaseOtpUtil baseOtpUtil;
    private final ForgotPasswordNavigator forgotPasswordNavigator;
    private FavoritesArrayAdapter requestOtpDisposable;
    private FavoritesArrayAdapter verifyForgotPasswordDisposable;

    public ForgotPasswordViewModel(BaseOtpUtil baseOtpUtil, ForgotPasswordNavigator forgotPasswordNavigator) {
        Log_OC.getArray(baseOtpUtil, "baseOtpUtil");
        Log_OC.getArray(forgotPasswordNavigator, "forgotPasswordNavigator");
        this.baseOtpUtil = baseOtpUtil;
        this.forgotPasswordNavigator = forgotPasswordNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ ForgotPasswordViewData access$getState(ForgotPasswordViewModel forgotPasswordViewModel) {
        ViewData $r0 = forgotPasswordViewModel.getState();
        ForgotPasswordViewData $r2 = (ForgotPasswordViewData) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ForgotPasswordViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ForgotPasswordViewData initialData() {
        ForgotPasswordViewData $r1 = new ForgotPasswordViewData(false, false, null, null, null, null, false, 127, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        FavoritesArrayAdapter $r1 = this.verifyForgotPasswordDisposable;
        if ($r1 != null) {
            $r1.backup();
        }
        FavoritesArrayAdapter $r12 = this.requestOtpDisposable;
        if ($r12 == null) {
            return;
        }
        $r12.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void requestOtpForgotPin(String str) {
        Log_OC.getArray(str, "phoneNumber");
        FavoritesArrayAdapter $r2 = this.requestOtpDisposable;
        if ($r2 != null) {
            $r2.backup();
        }
        ViewData $r3 = getState();
        ForgotPasswordViewData $r4 = (ForgotPasswordViewData) $r3;
        publish(ForgotPasswordViewData.copy$default($r4, false, true, null, null, null, null, false, 89, null));
        BaseOtpUtil $r5 = this.baseOtpUtil;
        ForgotPasswordViewModel$requestOtpForgotPin$1 $r6 = new ForgotPasswordViewModel$requestOtpForgotPin$1(this);
        ForgotPasswordViewModel$requestOtpForgotPin$2 $r7 = new ForgotPasswordViewModel$requestOtpForgotPin$2(this);
        this.requestOtpDisposable = $r5.requestOtpForgotPin(str, $r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtpForgotPassword(String str, String str2, String str3) {
        Log_OC.getArray(str, "otpRequestId");
        Log_OC.getArray(str2, "otp");
        Log_OC.getArray(str3, "phoneNumber");
        FavoritesArrayAdapter $r4 = this.verifyForgotPasswordDisposable;
        if ($r4 != null) {
            $r4.backup();
        }
        ViewData $r5 = getState();
        ForgotPasswordViewData $r6 = (ForgotPasswordViewData) $r5;
        publish(ForgotPasswordViewData.copy$default($r6, true, false, null, null, null, null, false, 94, null));
        BaseOtpUtil $r7 = this.baseOtpUtil;
        ForgotPasswordViewModel$verifyOtpForgotPassword$1 $r8 = new ForgotPasswordViewModel$verifyOtpForgotPassword$1(this, str3);
        ForgotPasswordViewModel$verifyOtpForgotPassword$2 $r9 = new ForgotPasswordViewModel$verifyOtpForgotPassword$2(this);
        this.verifyForgotPasswordDisposable = $r7.verifyOtpForgotPassword(str, str2, $r8, $r9);
    }
}
