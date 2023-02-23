package ai.kudi.agent.settings.account.p025ui.viewModel;

import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BankAccountViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "result", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.BankAccountViewModel$fetchUserBankAccount$1$1 */
/* loaded from: classes.dex */
public final class BankAccountViewModel$fetchUserBankAccount$1$1 extends AbstractC11802m implements InterfaceC11767l<Object, C13666w> {
    final /* synthetic */ BankAccountViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccountViewModel$fetchUserBankAccount$1$1(BankAccountViewModel bankAccountViewModel) {
        super(1);
        this.this$0 = bankAccountViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Object obj) {
        invoke2(obj);
        C13666w r2 = C13666w.f30112a;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        Log_OC.getArray(obj, "result");
        BankAccountViewModel $r2 = this.this$0;
        BankAccountViewModel.toggleLoader$default($r2, false, 1, null);
        boolean $z0 = obj instanceof Throwable;
        if ($z0) {
            BankAccountViewModel $r22 = this.this$0;
            $r22.showError("Failed to fetch bank account. Please try again");
            return;
        }
        boolean $z02 = obj instanceof List;
        if ($z02) {
            BankAccountViewModel $r23 = this.this$0;
            List $r3 = (List) obj;
            $r23.showBankAccounts($r3);
        }
    }
}
