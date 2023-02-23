package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.bills.adapters.BillerSectionAdapter;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PayBillsFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "section", "Lai/kudi/agent/bills/adapters/BillerSectionAdapter;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.PayBillsFragment$loadBillers$1$adapter$2 */
/* loaded from: classes.dex */
public final class PayBillsFragment$loadBillers$1$adapter$2 extends AbstractC11802m implements InterfaceC11767l<BillerSectionAdapter, C13666w> {
    final /* synthetic */ PayBillsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayBillsFragment$loadBillers$1$adapter$2(PayBillsFragment payBillsFragment) {
        super(1);
        this.this$0 = payBillsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(BillerSectionAdapter billerSectionAdapter) {
        BillerSectionAdapter $r2 = billerSectionAdapter;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BillerSectionAdapter billerSectionAdapter) {
        Log_OC.getArray(billerSectionAdapter, "section");
        PayBillsFragment $r2 = this.this$0;
        $r2.headerClickedListener(billerSectionAdapter);
    }
}
