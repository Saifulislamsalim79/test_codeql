package ai.kudi.agent.withdrawal.view;

import ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: MainWithdrawalView.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J8\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH&¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/withdrawal/view/MainWithdrawalView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "navigateToVoucherSummaryFragment", "", "voucherResponse", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "showAlertDialog", MetricTracker.Object.MESSAGE, "", "buttonText", "upperCaseText", "", "cancelable", "buttonAction", "Lkotlin/Function0;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface MainWithdrawalView extends LoginListener {
    void navigateToVoucherSummaryFragment(VoucherResponse voucherResponse);

    void showAlertDialog(String str, String str2, boolean z, boolean z2, InterfaceC11756a interfaceC11756a);
}
