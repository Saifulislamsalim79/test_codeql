package ai.kudi.agent.product.p019ui;

import ai.kudi.agent.bills.domain.wiki.BillRequest;
import ai.kudi.agent.product.airtime_data.data.ProductPurchase;
import ai.kudi.agent.product.presenter.ProductSummaryPresenter;
import ai.kudi.agent.transactions.TransactionStatusType;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "location", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.ui.ProductSummaryFragment$pinConfirmationDialog$1$1 */
/* loaded from: classes.dex */
public final class ProductSummaryFragment$pinConfirmationDialog$1$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ ProductSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSummaryFragment$pinConfirmationDialog$1$1(ProductSummaryFragment productSummaryFragment) {
        super(1);
        this.this$0 = productSummaryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Location location) {
        Location $r2 = location;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Location location) {
        if (location == null) {
            ProductSummaryFragment $r2 = this.this$0;
            $r2.displayLocationNotification();
            return;
        }
        ProductSummaryFragment $r22 = this.this$0;
        ProductSummaryPresenter $r3 = $r22.getThisPresenter();
        ProductSummaryFragment $r23 = this.this$0;
        ProductPurchase $r4 = $r23.productPurchase;
        if ($r4 == null) {
            Log_OC.LogError("productPurchase");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        }
        BillRequest $r5 = $r4.toBillerRequest(location);
        ProductSummaryFragment $r24 = this.this$0;
        TransactionStatusType $r6 = $r24.transactionType;
        $r3.performPurchase($r5, $r6);
    }
}
