package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos;

import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.mpos.MPosAmountInputViewData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MPosAmountInputViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/mpos/MPosAmountInputViewModel;", "Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/mpos/MPosAmountInputViewData;", "pref", "Lai/kudi/agent/core/util/Pref;", "(Lai/kudi/agent/core/util/Pref;)V", "initialData", "onMPosDeviceInitialized", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.mpos.MPosAmountInputViewModel */
/* loaded from: classes.dex */
public final class MPosAmountInputViewModel extends BaseAmountInputViewModel<MPosAmountInputViewData> {
    private final Pref pref;

    public MPosAmountInputViewModel(Pref pref) {
        Log_OC.getArray(pref, "pref");
        this.pref = pref;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        MPosAmountInputViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public MPosAmountInputViewData initialData() {
        MPosAmountInputViewData $r1 = new MPosAmountInputViewData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onMPosDeviceInitialized() {
        Pref $r1 = this.pref;
        $r1.setMPosDeviceInitialized();
    }
}
