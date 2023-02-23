package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewModel.ProductCustomerRegistrationSummaryViewModel;
import android.location.Location;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: ProductCustomerRegistrationSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment$performButtonAction$1 */
/* loaded from: classes.dex */
final class ProductCustomerRegistrationSummaryFragment$performButtonAction$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ ProductCustomerRegistrationSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCustomerRegistrationSummaryFragment$performButtonAction$1(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment) {
        super(1);
        this.this$0 = productCustomerRegistrationSummaryFragment;
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
        ProductCustomerRegistrationSummaryFragment $r2 = this.this$0;
        ProductCustomerRegistrationSummaryViewModel $r3 = $r2.getProductCustomerRegistrationSummaryViewModel();
        double $d1 = location == null ? 0.0d : location.getLatitude();
        double $d0 = location != null ? location.getLongitude() : 0.0d;
        ProductCustomerRegistrationSummaryFragment $r22 = this.this$0;
        Map $r4 = $r22.mapOfRegistrationProperty;
        ProductCustomerRegistrationSummaryFragment $r23 = this.this$0;
        String $r5 = $r23.productCode;
        $r3.registerCustomer($d1, $d0, $r4, $r5);
    }
}
