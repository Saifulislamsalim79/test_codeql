package ai.kudi.agent.p036v2.productLookup.fragment;

import ai.kudi.agent.core.util.LocationUtil;
import android.content.Context;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookup.fragment.ProductLookupFragment$displayLocationAwareness$1 */
/* loaded from: classes.dex */
public final class ProductLookupFragment$displayLocationAwareness$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ ProductLookupFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductLookupFragment$displayLocationAwareness$1(ProductLookupFragment productLookupFragment) {
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
        ProductLookupFragment $r1 = this.this$0;
        $r1.displayLocationNotification();
        ProductLookupFragment $r12 = this.this$0;
        LocationUtil $r2 = $r12.locationTracker;
        if ($r2 == null) {
            return;
        }
        ProductLookupFragment $r13 = this.this$0;
        Context $r3 = $r13.requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        $r2.storePreference($r3, LocationUtil.IS_LOCATION_ALLOWED_PREFERENCE_TRANSFER);
    }
}
