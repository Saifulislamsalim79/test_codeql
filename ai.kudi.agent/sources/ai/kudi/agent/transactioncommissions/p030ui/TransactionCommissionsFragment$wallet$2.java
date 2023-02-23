package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.transactions.domain.dto.CommissionWallet;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: TransactionCommissionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsFragment$wallet$2 */
/* loaded from: classes.dex */
final class TransactionCommissionsFragment$wallet$2 extends AbstractC11802m implements InterfaceC11756a<CommissionWallet> {
    final /* synthetic */ TransactionCommissionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionCommissionsFragment$wallet$2(TransactionCommissionsFragment transactionCommissionsFragment) {
        super(0);
        this.this$0 = transactionCommissionsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final CommissionWallet invoke() {
        TransactionCommissionsFragment $r1 = this.this$0;
        Bundle $r2 = $r1.getArguments();
        if ($r2 == null) {
            return null;
        }
        Parcelable $r3 = $r2.getParcelable(TransactionCommissionsFragment.BUNDLE_KEY_WALLET_ID);
        CommissionWallet $r4 = (CommissionWallet) $r3;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ CommissionWallet invoke() {
        CommissionWallet $r1 = invoke();
        return $r1;
    }
}
