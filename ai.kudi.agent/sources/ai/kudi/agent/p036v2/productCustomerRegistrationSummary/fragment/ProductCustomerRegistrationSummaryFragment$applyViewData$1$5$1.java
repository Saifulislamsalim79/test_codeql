package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment;

import ai.kudi.agent.p036v2.common.view.activities.BaseMarketplaceActivity;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.productAllCollectionFields.fragment.ProductAllCollectionFieldsFragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductCustomerRegistrationSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment$applyViewData$1$5$1 */
/* loaded from: classes.dex */
public final class ProductCustomerRegistrationSummaryFragment$applyViewData$1$5$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ ProductCustomerRegistrationSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCustomerRegistrationSummaryFragment$applyViewData$1$5$1(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment) {
        super(0);
        this.this$0 = productCustomerRegistrationSummaryFragment;
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
        ProductCustomerRegistrationSummaryFragment $r1 = this.this$0;
        MarketplaceLookupActivity $r2 = $r1.getMarketplaceLookupActivity();
        if ($r2 == null) {
            return;
        }
        ProductAllCollectionFieldsFragment.Companion $r3 = ProductAllCollectionFieldsFragment.Companion;
        ProductAllCollectionFieldsFragment $r4 = $r3.newInstance();
        BaseMarketplaceActivity.startFragment$default($r2, $r4, false, 2, null);
    }
}
