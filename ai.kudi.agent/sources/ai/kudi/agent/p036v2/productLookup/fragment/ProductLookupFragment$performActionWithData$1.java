package ai.kudi.agent.p036v2.productLookup.fragment;

import ai.kudi.agent.p036v2.productLookup.viewModel.MarketplaceProductLookupViewModel;
import android.location.Location;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: ProductLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookup.fragment.ProductLookupFragment$performActionWithData$1 */
/* loaded from: classes.dex */
final class ProductLookupFragment$performActionWithData$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ Map<String, Object> $propertiesMap;
    final /* synthetic */ ProductLookupFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductLookupFragment$performActionWithData$1(ProductLookupFragment productLookupFragment, Map map) {
        super(1);
        this.this$0 = productLookupFragment;
        this.$propertiesMap = map;
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
        ProductLookupFragment $r2 = this.this$0;
        MarketplaceProductLookupViewModel $r3 = $r2.getMarketplaceLookupViewModel();
        double $d1 = location == null ? 0.0d : location.getLongitude();
        double $d0 = location != null ? location.getLatitude() : 0.0d;
        Map $r4 = this.$propertiesMap;
        ProductLookupFragment $r22 = this.this$0;
        String $r5 = $r22.productCode;
        $r3.lookupCustomer($d1, $d0, $r4, $r5);
    }
}
