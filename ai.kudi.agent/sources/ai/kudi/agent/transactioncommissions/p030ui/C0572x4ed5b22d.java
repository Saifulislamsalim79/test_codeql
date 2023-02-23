package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding;
import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsActivityViewModel;
import ai.kudi.agent.transactions.domain.dto.CommissionWallet;
import ai.kudi.dip.library.SafeViewPager;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import p201g.p270x.InterfaceC8209a;
/* compiled from: TransactionCommissionsActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity$renderOptionsBottomSheet$bottomSheetListener$1$onCashout$1 */
/* loaded from: classes.dex */
final class C0572x4ed5b22d extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ TransactionCommissionsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0572x4ed5b22d(TransactionCommissionsActivity transactionCommissionsActivity) {
        super(0);
        this.this$0 = transactionCommissionsActivity;
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
        TransactionCommissionsActivity $r1 = this.this$0;
        List $r2 = $r1.wallets;
        boolean $z0 = $r2.isEmpty();
        if (!$z0) {
            TransactionCommissionsActivity $r12 = this.this$0;
            TransactionCommissionsActivityViewModel $r3 = $r12.getViewModel();
            TransactionCommissionsActivity $r13 = this.this$0;
            List $r22 = $r13.wallets;
            TransactionCommissionsActivity $r14 = this.this$0;
            InterfaceC8209a $r4 = $r14.getBinding();
            ActivityTransactionCommissionsBinding $r5 = (ActivityTransactionCommissionsBinding) $r4;
            SafeViewPager $r6 = $r5.viewPager;
            int $i0 = $r6.getCurrentItem();
            Object $r7 = $r22.get($i0);
            CommissionWallet $r8 = (CommissionWallet) $r7;
            String $r9 = $r8.getId();
            $r3.onCashOutConfirmed($r9);
        }
    }
}
