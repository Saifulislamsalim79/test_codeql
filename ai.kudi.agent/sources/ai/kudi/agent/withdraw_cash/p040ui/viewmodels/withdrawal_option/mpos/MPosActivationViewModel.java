package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.mpos.MPosActivationViewData;
import com.paypad.impl.Paypad;
import kotlin.Metadata;
import kotlin.p475b0.C11707a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MPosActivationViewModel.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0006\u0010\r\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/mpos/MPosActivationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/mpos/MPosActivationViewData;", "paypad", "Lcom/paypad/impl/Paypad;", "pref", "Lai/kudi/agent/core/util/Pref;", "(Lcom/paypad/impl/Paypad;Lai/kudi/agent/core/util/Pref;)V", "activateMPosWith", "", "code", "", "initialData", "onMPosDeviceActivated", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.mpos.MPosActivationViewModel */
/* loaded from: classes.dex */
public final class MPosActivationViewModel extends BaseViewModel<MPosActivationViewData> {
    public static final Companion Companion;
    private final Paypad paypad;
    private final Pref pref;

    /* compiled from: MPosActivationViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/mpos/MPosActivationViewModel$Companion;", "", "()V", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.mpos.MPosActivationViewModel$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public MPosActivationViewModel(Paypad paypad, Pref pref) {
        Log_OC.getArray(paypad, "paypad");
        Log_OC.getArray(pref, "pref");
        this.paypad = paypad;
        this.pref = pref;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void activateMPosWith(String str) {
        Log_OC.getArray(str, "code");
        int $i0 = str.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            ViewData $r2 = getState();
            MPosActivationViewData $r3 = (MPosActivationViewData) $r2;
            publish(MPosActivationViewData.copy$default($r3, false, false, "Enter an Activation Code", 3, null));
            return;
        }
        ViewData $r22 = getState();
        MPosActivationViewData $r32 = (MPosActivationViewData) $r22;
        publish(MPosActivationViewData.copy$default($r32, true, false, "", 2, null));
        MPosActivationViewModel$activateMPosWith$1 $r4 = new MPosActivationViewModel$activateMPosWith$1(this, str);
        C11707a.m10413a((r12 & 1) != 0, (r12 & 2) != 0 ? false : false, (r12 & 4) != 0 ? null : null, (r12 & 8) != 0 ? null : null, (r12 & 16) != 0 ? -1 : 0, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        MPosActivationViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public MPosActivationViewData initialData() {
        MPosActivationViewData $r1 = new MPosActivationViewData(false, false, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onMPosDeviceActivated() {
        Pref $r1 = this.pref;
        $r1.setMPosDeviceActivated();
    }
}
