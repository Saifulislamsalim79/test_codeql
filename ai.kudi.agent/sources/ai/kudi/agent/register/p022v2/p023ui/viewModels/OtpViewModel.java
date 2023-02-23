package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.OtpViewData;
import android.os.CountDownTimer;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OtpViewModel.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/OtpViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/OtpViewData;", "()V", "countdownTimer", "Landroid/os/CountDownTimer;", "initCountdownTimer", "", "countdownDuration", "", "initialData", "onCleared", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.OtpViewModel */
/* loaded from: classes.dex */
public final class OtpViewModel extends BaseViewModel<OtpViewData> {
    private CountDownTimer countdownTimer;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ OtpViewData access$getState(OtpViewModel otpViewModel) {
        ViewData $r0 = otpViewModel.getState();
        OtpViewData $r2 = (OtpViewData) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void initCountdownTimer(long $l0) {
        long $l1 = 1000;
        OtpViewModel$initCountdownTimer$1 $r1 = new OtpViewModel$initCountdownTimer$1(this);
        OtpViewModel$initCountdownTimer$2 $r2 = new OtpViewModel$initCountdownTimer$2(this);
        CountDownTimer $r3 = RandomUtilKt.initCountDownTimer($l0 * $l1, 1000L, $r1, $r2);
        this.countdownTimer = $r3;
        if ($r3 != null) {
            $r3.start();
            return;
        }
        Log_OC.LogError("countdownTimer");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OtpViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OtpViewData initialData() {
        OtpViewData $r1 = new OtpViewData(null, 1, null);
        return $r1;
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
}
