package ai.kudi.agent.p036v2.productLookup.fragment;

import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.p036v2.productLookup.viewModel.MarketplaceProductLookupViewModel;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookup.fragment.ProductLookupFragment$handleResponseMessage$1 */
/* loaded from: classes.dex */
public final class ProductLookupFragment$handleResponseMessage$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ ProductLookupFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductLookupFragment.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productLookup.fragment.ProductLookupFragment$handleResponseMessage$1$1 */
    /* loaded from: classes.dex */
    public static final class C07271 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
        final /* synthetic */ ProductLookupFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07271(ProductLookupFragment productLookupFragment) {
            super(1);
            this.this$0 = productLookupFragment;
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
            ProductLookupFragment $r22 = this.this$0;
            Map $r4 = $r22.mapOfProperties;
            ProductLookupFragment $r23 = this.this$0;
            String $r5 = $r23.productCode;
            $r3.lookupCustomer($d1, $d0, $r4, $r5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductLookupFragment$handleResponseMessage$1(ProductLookupFragment productLookupFragment) {
        super(0);
        this.this$0 = productLookupFragment;
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
        ProductLookupFragment $r2 = this.this$0;
        LocationUtil $r3 = $r2.locationTracker;
        if ($r3 == null) {
            return;
        }
        ProductLookupFragment $r22 = this.this$0;
        Context $r4 = $r22.requireContext();
        C4107a $r5 = C4109b.m28502b($r4);
        Log_OC.loadImage($r5, "getFusedLocationProviderClient(requireContext())");
        ProductLookupFragment $r23 = this.this$0;
        C07271 $r1 = new C07271($r23);
        LocationUtil.getLastLocation$default($r3, $r5, 0, $r1, 2, null);
    }
}
