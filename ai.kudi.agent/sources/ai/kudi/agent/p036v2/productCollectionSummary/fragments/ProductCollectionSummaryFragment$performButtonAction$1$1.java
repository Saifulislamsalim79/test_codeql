package ai.kudi.agent.p036v2.productCollectionSummary.fragments;

import ai.kudi.agent.p036v2.productCollectionSummary.viewModel.ProductCollectionSummaryViewModel;
import android.location.Location;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductCollectionSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.fragments.ProductCollectionSummaryFragment$performButtonAction$1$1 */
/* loaded from: classes.dex */
public final class ProductCollectionSummaryFragment$performButtonAction$1$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ ProductCollectionSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCollectionSummaryFragment$performButtonAction$1$1(ProductCollectionSummaryFragment productCollectionSummaryFragment) {
        super(1);
        this.this$0 = productCollectionSummaryFragment;
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
        ProductCollectionSummaryFragment $r2 = this.this$0;
        ProductCollectionSummaryViewModel $r3 = $r2.getMarketplaceCollectionSummaryViewModel();
        double $d1 = location == null ? 0.0d : location.getLongitude();
        double $d0 = location != null ? location.getLatitude() : 0.0d;
        ProductCollectionSummaryFragment $r22 = this.this$0;
        Map $r4 = $r22.allProductProperties;
        ProductCollectionSummaryFragment $r23 = this.this$0;
        String $r5 = $r23.productCode;
        $r3.makeCollectionTransaction($d1, $d0, $r4, $r5);
    }
}
