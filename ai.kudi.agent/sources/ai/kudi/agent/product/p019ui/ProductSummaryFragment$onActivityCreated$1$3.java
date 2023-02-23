package ai.kudi.agent.product.p019ui;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.product.airtime_data.data.AirtimePurchase;
import ai.kudi.agent.product.airtime_data.data.ProductPurchase;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeAmountFragment;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.product.presenter.ProductSummaryPresenter;
import ai.kudi.agent.transactionstatus.summary.model.SummaryModel;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "transferSummary", "Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.ui.ProductSummaryFragment$onActivityCreated$1$3 */
/* loaded from: classes.dex */
final class ProductSummaryFragment$onActivityCreated$1$3 extends AbstractC11802m implements InterfaceC11772q<SummaryModel, View, Integer, C13666w> {
    final /* synthetic */ ProductSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSummaryFragment$onActivityCreated$1$3(ProductSummaryFragment productSummaryFragment) {
        super(3);
        this.this$0 = productSummaryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(SummaryModel summaryModel, View view, Integer num) {
        SummaryModel $r4 = summaryModel;
        View $r5 = view;
        Integer $r6 = num;
        int $i0 = $r6.intValue();
        invoke($r4, $r5, $i0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(SummaryModel summaryModel, View view, int i) {
        Log_OC.getArray(summaryModel, "transferSummary");
        Log_OC.getArray(view, "$noName_1");
        Fragment $r3 = summaryModel.getFragment();
        boolean $z0 = $r3 instanceof AirtimeAmountFragment;
        if ($z0) {
            ProductSummaryFragment $r4 = this.this$0;
            ProductSummaryPresenter $r5 = $r4.getThisPresenter();
            ProductSummaryFragment $r42 = this.this$0;
            ProductPurchase $r6 = $r42.productPurchase;
            if ($r6 != null) {
                AirtimePurchase $r7 = (AirtimePurchase) $r6;
                $r5.editAmountPage($r7, true);
                return;
            }
            Log_OC.LogError("productPurchase");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        boolean $z02 = $r3 instanceof AirtimeTopUpFragment;
        if ($z02) {
            ProductSummaryFragment $r43 = this.this$0;
            ProductSummaryPresenter $r52 = $r43.getThisPresenter();
            ProductSummaryFragment $r44 = this.this$0;
            ProductPurchase $r62 = $r44.productPurchase;
            if ($r62 != null) {
                $r52.editPurchaseDetailsPage($r62, true);
                return;
            }
            Log_OC.LogError("productPurchase");
            NullPointerException r92 = new NullPointerException("Null throw statement replaced by Soot");
            throw r92;
        }
        boolean $z03 = $r3 instanceof BillPaymentStepOneFragment;
        if ($z03) {
            ProductSummaryFragment $r45 = this.this$0;
            ProductSummaryPresenter $r53 = $r45.getThisPresenter();
            ProductSummaryFragment $r46 = this.this$0;
            ProductPurchase $r63 = $r46.productPurchase;
            if ($r63 != null) {
                BillsData $r8 = (BillsData) $r63;
                $r53.editProductPurchaseStepOne($r8, true);
                return;
            }
            Log_OC.LogError("productPurchase");
            NullPointerException r93 = new NullPointerException("Null throw statement replaced by Soot");
            throw r93;
        }
        boolean $z04 = $r3 instanceof BillPaymentCustomerDetailsFragment;
        if ($z04) {
            ProductSummaryFragment $r47 = this.this$0;
            ProductSummaryPresenter $r54 = $r47.getThisPresenter();
            ProductSummaryFragment $r48 = this.this$0;
            ProductPurchase $r64 = $r48.productPurchase;
            if ($r64 != null) {
                BillsData $r82 = (BillsData) $r64;
                $r54.editProductPurchaseStepTwo($r82, true);
                return;
            }
            Log_OC.LogError("productPurchase");
            NullPointerException r94 = new NullPointerException("Null throw statement replaced by Soot");
            throw r94;
        }
    }
}
