package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import android.app.Activity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UssdWithdrawalVoucherSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryFragment$openSuccessDialog$1 */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherSummaryFragment$openSuccessDialog$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ UssdWithdrawalVoucherSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UssdWithdrawalVoucherSummaryFragment$openSuccessDialog$1(UssdWithdrawalVoucherSummaryFragment ussdWithdrawalVoucherSummaryFragment) {
        super(0);
        this.this$0 = ussdWithdrawalVoucherSummaryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        invoke2();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UssdWithdrawalVoucherSummaryFragment $r2 = this.this$0;
        CashWithdrawalOptionActivity $r1 = $r2.cashWithdrawalActivity;
        if ($r1 != null) {
            Activity r4 = (Activity) $r1;
            r4.finish();
            return;
        }
        Log_OC.LogError("cashWithdrawalActivity");
        NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
        throw r3;
    }
}
